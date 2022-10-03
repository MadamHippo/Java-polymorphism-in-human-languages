/* Language Families
Languages, just like people, often have families. You can even map language lineage a bit like a family tree.

Java can help us build a model to track inherited traits across families. In this case, we’ll focus on something that often varies between language families: word order — where the subject, verb, and object would go in a sentence. 

Your Language Inheritance package has three Java files:

Language.java: for the Language parent class, which serves as the template for all languages.
Mayan.java: for Mayan, a child class of Language modeled after the Mayan language family.
SinoTibetan.java: for SinoTibetan, a child class of Language modeled after the Sino-Tibetan language family.
Build out a Java package with these classes to model real-world language families.
*/

class Language {
  // In Language.java, create a Language class with a main() method and the following fields:
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  // Constructor....Above the main() method, give Language a constructor that sets each field to the values passed in.
  public Language(String langName, int speakers, String regions, String wdOrder) {
    this.name = langName;
    this.numSpeakers = speakers;
    this.regionsSpoken = regions;
    this.wordOrder = wdOrder;
  }

  // Create a public method for Language called getInfo(). We’ll use this method to display all of its information (using its field values).
  public void getInfo() {
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
    System.out.println("The language follows the word order: " + this.wordOrder + ".");
  }

  public static void main(String[] args){
    // Then call getInfo() on the Language variable. (compile and run in bash first)
    Language japanese = new Language("Japanese", 1000, "Japan", "subject-object-verb");
    // In main(), instantiate a new Mayan language of your choice...
    Mayan kiche = new Mayan("Meowers", 10);
    japanese.getInfo();
    kiche .getInfo();

    // Finally, last practice:
    /* Test out the SinoTibetan class by instantiating two new Sino-Tibetan language objects of your choosing:

One Chinese (e.g., “Mandarin Chinese”)
One non-Chinese (e.g., Burmese)
Then call getInfo() on each language variable.

Run your code in the terminal to see if the information gets printed. If nothing displays, try compiling your code first. */
    SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1100000);
    mandarin.getInfo();

    SinoTibetan burmese = new SinoTibetan("Burmese", 30000);
    burmese.getInfo();
    
    
  }
}
