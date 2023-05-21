package bandmusicians;

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.Scanner;
	/**
	 * This program implements the main() method that performs the actions based on
	 * the given input option and prints the appropriate results to the standard
	 * output.
	 */
	public class MusicalBand {

		private static ArrayList<Band> bands = new ArrayList<>();
		private static ArrayList<Musician> noBandMusicians = new ArrayList<>();

		/**
		 * This method prints all the musicians in the each band and also musicians not
		 * belongs to the any band.
		 */
		private static void printMusiciansList() {
			System.out.println("\n\n***** Members from each Band ***** \n");
			for (Band band : bands) {
				System.out.println(band);
			}
			System.out.println("***** No Band Musician Members ***** \n");
			for (Musician noBandMusician : noBandMusicians) {
				System.out.println((noBandMusician));
			}
		}

		/**
		 * This method performs the one night play from each band. Each band looses a
		 * random member. Musicians which are not belongs to any band they will join a
		 * random band with the given constraint that the no band will be having the
		 * same type of musicians. Printing the statements of who is leaving which band
		 * and who joins what band.
		 */
		private static void performOneNightPlay() {
			String statement = "";

			// Performing the play and a random member left the each band.
			for (Band band : bands) {
				System.out.println("Performing one night play form band " + band.getBandName());
				int randomIndex = (int) ((Math.random() * band.getMusicians().size()));
				statement += "Musician " + band.getMusicians().get(randomIndex).getMusianName() + " left "
						+ band.getBandName() + ". \n";
				noBandMusicians.add(band.getMusicians().get(randomIndex));
				band.getMusicians().remove(randomIndex);

			}

			// Members not belongs to any band joins the random band with given constraints.
			ArrayList<Musician> temporary = new ArrayList<>(noBandMusicians);
			Collections.shuffle(temporary);
			for (Musician noBandMusician : temporary) {
				Object noBandInstrument = noBandMusician.getInstrument().getClass();
				// By shuffling to get a random band
				Collections.shuffle(bands);
				for (int i = 0; i < bands.size(); i++) {
					boolean canBeAddedToBand = true;
					for (Musician employedMusician : bands.get(i).getMusicians()) {
						if (noBandInstrument.equals(employedMusician.getInstrument().getClass())) {
							canBeAddedToBand = false;
							break;
						}
					}
					if (canBeAddedToBand == true) {
						statement += "Musician " + noBandMusician.getMusianName() + " joined " + bands.get(i).getBandName()
								+ ". \n";
						bands.get(i).getMusicians().add(noBandMusician);
						noBandMusicians.remove(noBandMusician);
						break;
					}
				}
			}
			System.out.println(statement);
		}

		public static void main(String[] args) {

			// Adding members to the each band.
			Band band1 = new Band("Adrenal'Ex",
					new ArrayList<>(Arrays.asList(new Musician("Ilea Emend", new Guitar("Guitar", 9, "Ander", "0.4mm")),
							new Musician("Mr Angel", new Piano("Piano", 91, "McAle", true)),
							new Musician("Jut Leghorn", new Synthesizer("Synthesizer", 94, true, "Arc")))));

			Band band2 = new Band("I'd Seen",
					new ArrayList<>(Arrays.asList(new Musician("Mr One", new Banjo("Banjo", 4, "Fibson", "8mm")),
							new Musician("A Gaze Inks", new Drums("Drums", true, "Toyota")),
							new Musician("Lacier No", new Synthesizer("Synthesizer", 72, false, "Suzuki")))));

			Musician noBand = new Musician("Jay Aly", new Guitar("Guitar", 5, "Screen22", "0.5mm"));

			bands.add(band1);
			bands.add(band2);
			noBandMusicians.add(noBand);

			Scanner sc = new Scanner(System.in);
			loop: while (true) {
				System.out.println("Menu options: ");
				System.out.print("1. List\n2. Play one night\n3. Exit\n");
				System.out.print("Please select the option: ");
				String menuOption = sc.next();

				switch (menuOption) {
				case "1":
					printMusiciansList();
					break;
				case "2":
					performOneNightPlay();
					break;
				case "3":
					System.out.println("Good Bye..Exiting the Applicaion....!!");
					sc.close();
					break loop;
				default:
					System.err.println("Please select the right option...");
				}
			}
		}
	}


