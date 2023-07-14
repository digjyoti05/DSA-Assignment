import java.util.*;

public class Fifth {

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        Fifth f = new Fifth();
        int[] intersection = f.intersection(nums1, nums2);

        System.out.println(Arrays.toString(intersection)); // Output: [2]
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        List<Integer> intersection = new ArrayList<>();

        for (int num : nums2) {
            if (set.contains(num)) {
                intersection.add(num);
                set.remove(num);
            }
        }

        int[] result = new int[intersection.size()];

        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }

        return result;
    }
}
