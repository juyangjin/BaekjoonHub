class Solution {
    public int solution(String s) {
        return Integer.parseInt(s);
    }
}
// public class StrToInt { < 공부하기 위한 제대로 된 코드
//     public int getStrToInt(String str) {
//             boolean Sign = true;
//             int result = 0;

//       for (int i = 0; i < str.length(); i++) {
//                 char ch = str.charAt(i);
//                 if (ch == '-')
//                     Sign = false;
//                 else if(ch !='+')
//                     result = result * 10 + (ch - '0');
//             }
//             return Sign?1:-1 * result;
//     }
//     //아래는 테스트로 출력해 보기 위한 코드입니다.
//     public static void main(String args[]) {
//         StrToInt strToInt = new StrToInt();
//         System.out.println(strToInt.getStrToInt("-1234"));
//     }
// }