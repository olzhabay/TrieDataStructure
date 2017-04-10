package trie;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        /** OPTIONAL **/
        // Test freely whether your implementation is correct.
        Trie trie = new Trie(2);
        trie.add((ItemSet) new ArrayList<>(Arrays.asList(1, 2)));
        trie.add((ItemSet) new ArrayList<>(Arrays.asList(1, 3)));
        trie.add((ItemSet) new ArrayList<>(Arrays.asList(2, 3)));

        ArrayList<Integer> transaction = new ArrayList<>(Arrays.asList(1, 2, 3, 4 ,5));
        ArrayList<ItemSet> matchedItemSet = new ArrayList<>();
        trie.findItemSets(matchedItemSet, trie.getRootNode(), transaction, 0);

        System.out.println(matchedItemSet);
    }


}
