package challenge1;

class MovingAverage {
    public int[] nums = {};
    public int n;
    public int count = 0;

    public MovingAverage(Integer N) {
        n = N;
        nums = new int[N];
    }

    public Double add(Integer X) {
      int sum = 0;

      // Create a new array with a larger size
      int[] newNums = new int[nums.length + 1];

      // Copy the existing elements to the new array
      for (int i = 0; i < nums.length; i++) {
          newNums[i] = nums[i];
      }

      // Add the new element to the end of the new array
      newNums[newNums.length - 1] = X;

      // Update the reference to the new array
      nums = newNums;

      //Adding the last N elements of the array
      for (int i = nums.length - n; i < nums.length; i++) {
          sum += nums[i];
      }

      //determining the denominator
      count++;
      count = (count < n) ? count : n;
      
      return ((double) sum / count);
    }
}
