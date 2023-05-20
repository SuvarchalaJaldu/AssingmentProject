package challenge2;

import java.util.*;

class Underwriter {

    public static String[] identifyInvalidTransactions(String[] transactions){

    int noofTransactions = transactions.length;

    String[] name = new String[noofTransactions];
    Integer[] time = new Integer[noofTransactions];
    Integer[] amount = new Integer[noofTransactions];
    String[] city = new String[noofTransactions];

    //Using Set to eliminate duplicates
    Set<String> invalidTransactionsSet = new HashSet<>();

    for (int i = 0; i < noofTransactions; i++) {
        name[i] = transactions[i].split(",")[0];
        time[i] = Integer.parseInt(transactions[i].split(",")[1]);
        amount[i] = Integer.parseInt(transactions[i].split(",")[2]);
        city[i] = transactions[i].split(",")[3];
    }

    //Validation to check amount exceeds $2000
    for (int i = 0; i < noofTransactions; i++) {
        if (amount[i] > 2000){
          invalidTransactionsSet.add(transactions[i]);
        }
    }

    for (int i = 0; i < noofTransactions; i++) {
        for (int j = 0; j < noofTransactions; j++) {
            if (i != j) {

              // Validation of "It occurs within (and including) 60 minutes of another transaction with the same name and the exact same price"
                if ((Math.abs(time[i] - time[j]) <= 60) && (name[i].equals(name[j])) && (amount[i].equals(amount[j]))) {
                    invalidTransactionsSet.add(transactions[j]);
                    invalidTransactionsSet.add(transactions[i]);
                    continue;
                }

              // Validation of "It occurs within (and including) 60 minutes of another transaction with the same name in a different city"
                if ((Math.abs(time[i] - time[j]) <= 60) && (name[i].equals(name[j]))
                        && !(city[i].equals(city[j]))) {
                    invalidTransactionsSet.add(transactions[j]);
                    invalidTransactionsSet.add(transactions[i]);
                    continue;
                }

              // Validation of "It occurs at the exact same time of another transaction with the same name"
                if ((time[i] == time[j]) && (name[i].equals(name[j]))) {
                    invalidTransactionsSet.add(transactions[j]);
                    invalidTransactionsSet.add(transactions[i]);
                    continue;
                }
            }
        }
    }

    // Convert Set to Array
    String[] invalidTransactionsArray = invalidTransactionsSet.toArray(new String[0]);

    return invalidTransactionsArray;
    }

}