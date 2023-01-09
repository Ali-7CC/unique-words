package Solution;

import java.util.HashMap;


public class Text {
    private String text;
    private HashMap<String, Integer> counts;

    public Text(String text) {
        counts = new HashMap<>();
        setText(text);
    }

    public HashMap<String, Integer> getCounts() {
        return counts;
    }

    public void setText(String text) {
        this.text = text;
        this.updateMap(text);
    }

    private void updateMap(String text) {
        if (text == null || text.isBlank()) {
            counts = new HashMap<>();
            return;
        }
        String[] words = text.split(" ");
        for (String word : words) {
            insertWord(word.toLowerCase());
        }
    }

    public void insertWord(String word) {
        if (!counts.containsKey(word)) {
            counts.put(word, 1);
            return;
        }
        int currentCount = counts.get(word);
        counts.put(word, currentCount + 1);
    }

}
