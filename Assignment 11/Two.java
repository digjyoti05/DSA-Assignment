class Two{
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};

        Two t = new Two();
        int peakIndex = t.findPeakElement(nums);

        System.out.println(peakIndex);
    }

}