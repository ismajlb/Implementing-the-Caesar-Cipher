public class WordPlay {
    public static boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);

        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public static String replaceVowels(String phrase, char ch){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<phrase.length(); i++){
            char c = phrase.charAt(i);
            if(isVowel(c)){
                sb.append(ch);
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static String emphasize(String phrase, char ch){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < phrase.length(); i++){
            char c = phrase.charAt(i);
            if(Character.toLowerCase(c) == Character.toLowerCase((ch))){
                if((i + 1) % 2 == 0){
                    sb.append('+');
                }else{
                    sb.append('*');
                }
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(isVowel('F'));
        System.out.println(isVowel('a'));
        System.out.println(replaceVowels("Hello World", '*'));
        System.out.println(emphasize("dna ctgaaactga", 'a'));
        System.out.println(emphasize("Mary Bella Abracadabra", 'a'));
    }
}
