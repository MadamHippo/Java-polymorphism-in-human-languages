// Tab over to Mayan.java and create an empty Mayan class that inherits from Language.
class Mayan extends Language {
 
  // constructor:
  // Using super() = Tweak the Mayan constructor so that it isn’t necessary to pass in these fields when instantiating a new Mayan language object.
  // But Bear in mind that each language will still require its own name and speakers.
  Mayan(String langName, int numSpeakers) {
    super(langName, numSpeakers, "Central America", "verb-object-subject");
  }


  // Override getInfo() method from Mayan file...for this information below instead:
  @Override
  public void getInfo() {
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
    System.out.println("The language follows the word order: " + this.wordOrder);
    System.out.println("Fun fact: " + this.name + " is an ergative language.");
  }

}
