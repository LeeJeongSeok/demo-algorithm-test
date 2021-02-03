public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {

        String[] temp = new String[n];
        String[] answer = new String[n];

        for(int i = 0 ; i < n ; i++) {
            temp[i] = Integer.toBinaryString(arr1[i] | arr2[i]);

            for (int j = 0; j < n; j++) {
                if(temp[i].length() < n) {
                    temp[i] = "0" + temp[i];
                }
            }

        }

        for (int i = 0; i < temp.length; i++) {
            String str = temp[i].replace('1', '#');
            String str2 = str.replace('0', ' ');
            answer[i] = str2;

            System.out.println(answer[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        new SecretMap().solution(5, new int[]{0, 0, 0, 0, 0}, new int[]{30, 1, 21, 17, 28});
    }
}
