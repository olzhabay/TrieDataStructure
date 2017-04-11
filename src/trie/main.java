package trie;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        /** OPTIONAL **/
        // Test freely whether your implementation is correct.
        ItemSet itemset1 = new ItemSet(2);
        itemset1.addAll(Arrays.asList(1, 2));

        ItemSet itemset2 = new ItemSet(2);
        itemset2.addAll(Arrays.asList(1, 3));

        ItemSet itemset3 = new ItemSet(2);
        itemset3.addAll(Arrays.asList(2, 3));

        Trie trie = new Trie(2);
        trie.add(itemset1);
        trie.add(itemset2);
        trie.add(itemset3);

        ArrayList<Integer> transaction = new ArrayList<>(Arrays.asList(2, 3, 4 ,5));
        ArrayList<ItemSet> matchedItemSet = new ArrayList<>();
        trie.findItemSets(matchedItemSet, trie.getRootNode(), transaction, 0);

        System.out.println(matchedItemSet);
    }


}
