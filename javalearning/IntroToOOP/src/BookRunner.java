public class BookRunner {
    public static void main(String[] args) {
        Book artOfComputerProgramming = new Book();
        Book cleanCode = new Book();
        Book effectiveJava = new Book();

        artOfComputerProgramming.PassKnowledge("Art Of Computer Programming");
        cleanCode.PassKnowledge("Clean Code");
        effectiveJava.PassKnowledge("Effective Java");
    }

}
