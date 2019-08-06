class RnaTranscription {

    String transcribe(String dnaStrand) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        // Using StringBuilder to create a mutable copy of given string
        // Iterate over created string to check and replace each character with corresponding new character
        StringBuilder newDna = new StringBuilder(dnaStrand);
    	for(int i=0; i<newDna.length(); i++)
        {
            if ( newDna.charAt(i) == 'G' )
                newDna.setCharAt(i, 'C');
            else if ( newDna.charAt(i) == 'C')
                newDna.setCharAt(i, 'G');
            else if ( newDna.charAt(i) == 'T')
                newDna.setCharAt(i, 'A');
            else if ( newDna.charAt(i) == 'A')
                newDna.setCharAt(i, 'U');
        }
        return newDna.toString();
    }

}
