public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "abbccda";
       DuplicateRemove(str,0,"");

    }

    public static boolean[] map = new boolean[26];

    public static void DuplicateRemove(String str, int idx, String newStr) {
      if(idx==str.length()){
          System.out.println(newStr);
          return;
      }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {
            DuplicateRemove(str, idx + 1, newStr);
        } else {
            newStr += currChar;
            map[currChar - 'a'] = true;
            DuplicateRemove(str, idx + 1, newStr);
        }

    }
}
