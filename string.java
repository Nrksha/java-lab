public class string
{
    public static void main(String[] args)
    {
        String str1="Hello, ";
        String str2="World!";
        String result1=str1+str2;
        System.out.println("Concatenation:" +result1); int length=result1.length();
        System.out.println("Length of a string:" +length);
        String subString=result1.substring(0,5); System.out.println("Substring:" +subString); char charAtIndex=result1.charAt(7);
        System.out.println("Character at Index 7:" +charAtIndex);
        String upperCase=result1.toUpperCase();
        String lowerCase=result1.toLowerCase();
        System.out.println("UpperCase:" +upperCase);  System.out.println("LowerCase:" +lowerCase); boolean contains =result1.contains("World");
        System.out.println("Contains 'World':" +contains);
        String replaced=result1.replace("World", "Universe");
        System.out.println("Replaced 'World' with 'Universe':" +replaced);
        String[] words =result1.split(" ");
        System.out.println("Split sentence into words:");
        for(String word:words) {
            System.out.println(word);
        }
    }
}