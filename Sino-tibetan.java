class SinoTibetan extends Language {
  /* Like the Mayan language family, Sino-Tibetan languages share several traits in common. In this case: regionsSpoken: "Asia" ... and wordOrder: "subject-object-verb" */
  
  // build a constructor so that it isn’t necessary to pass in these fields when instantiating a new SinoTibetan language object.
  SinoTibetan(String langName, int numSpeakers) {
    super(langName, numSpeakers, "Asia", "subject-object-verb");

    /* 
So that word order thing? There is actually a split in the Sino-Tibetan family on this.

It turns out that at some point (a long time ago) the Chinese languages (among a few others) switched the object and verb order. So they now follow a subject-verb-object pattern. Hmm… How can we handle this?

One (imperfect) tactic is to check if the language’s name field contains "Chinese". There’s a Java string method to check if a string contains a substring.

In the constructor, below where you called super(), change the wordOrder to "subject-verb-object" if this.name contains "Chinese". */
    if (langName.contains("Chinese")) {
      this.wordOrder = "subject-verb-object";
    }
  }
}
