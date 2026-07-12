class ReverseWordsInSentense {
    public static void main(String[] args) {
        String sentence = "Hello World from Java";
        String reversedSentence = reverseWords(sentence);
        System.out.println(reversedSentence);
    }

    public static String reverseWords(String sentense){
        String[] words = sentense.split(" ");
        StringBuilder reversed = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--){
            reversed.append(words[i]);
            if(i != 0){
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}