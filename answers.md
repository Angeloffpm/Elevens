## A3 Answers
1. public static String flip() {
    if (Math.random < 0.66) {
        return "Heads";
    } else {
        return "Tails";
    }
}
2. public static boolean arePermutations(int[] a, int[] b) {
    if (a.length != b.length) {
        return false;
    } else {
        boolean permutation = true;
        for (int i = 0; i < a.length; i++) {
            if (b.indexOf(a[i]) == -1) [
                permutation = false;
            ]
        }
        return permutation;
    }
}
3. 0, 1