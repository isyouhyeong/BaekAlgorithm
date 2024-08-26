class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 두 분수를 더한 결과의 분자와 분모 구하기
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;

        // 최대공약수를 구하기 위한 단순 반복
        int gcd = 1;
        for (int i = 1; i <= Math.min(numer, denom); i++) {
            if (numer % i == 0 && denom % i == 0) {
                gcd = i;
            }
        }

        // 기약분수로 만들기 위해 분자와 분모를 최대공약수로 나누기
        return new int[] { numer / gcd, denom / gcd };
    }
}
