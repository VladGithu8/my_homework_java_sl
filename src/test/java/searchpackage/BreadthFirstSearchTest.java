package searchpackage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class BreadthFirstSearchTest {

    @Test
    void firstTestBFSExplore() {

        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch(6);
        breadthFirstSearch.add(0,2);
        breadthFirstSearch.add(0,1);
        breadthFirstSearch.add(1,4);
        breadthFirstSearch.add(1,3);
        breadthFirstSearch.add(1,0);
        breadthFirstSearch.add(3,1);
        breadthFirstSearch.add(4,1);
        breadthFirstSearch.add(2,5);
        breadthFirstSearch.add(2,0);
        breadthFirstSearch.add(5,2);

        System.out.println();
        System.out.println("First test");
        List<Integer> actual = breadthFirstSearch.BFSExplore(1);
        List<Integer> expected = Arrays.asList(1, 0, 3, 4, 2, 5);

        assertEquals(actual, expected);
    }

    @Test
    void secondTestBFSExplore() {

        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch(6);
        breadthFirstSearch.add(0,2);
        breadthFirstSearch.add(0,1);
        breadthFirstSearch.add(1,4);
        breadthFirstSearch.add(1,3);
        breadthFirstSearch.add(1,0);
        breadthFirstSearch.add(3,1);
        breadthFirstSearch.add(4,1);
        breadthFirstSearch.add(2,5);
        breadthFirstSearch.add(2,0);
        breadthFirstSearch.add(5,2);

        System.out.println();
        System.out.println("Second test");
        List<Integer> actual = breadthFirstSearch.BFSExplore(0);
        List<Integer> expected = Arrays.asList(0, 1, 2, 3, 4, 5);

        assertEquals(actual, expected);
    }

    @Test
    void thirdTestBFSExplore() {

        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch(6);
        breadthFirstSearch.add(0,2);
        breadthFirstSearch.add(0,1);
        breadthFirstSearch.add(1,4);
        breadthFirstSearch.add(1,3);
        breadthFirstSearch.add(1,0);
        breadthFirstSearch.add(3,1);
        breadthFirstSearch.add(4,1);
        breadthFirstSearch.add(2,5);
        breadthFirstSearch.add(2,0);
        breadthFirstSearch.add(5,2);

        System.out.println();
        System.out.println("Third test");
        List<Integer> actual = breadthFirstSearch.BFSExplore(5);
        List<Integer> expected = Arrays.asList(5, 2, 0, 1, 3, 4);

        assertEquals(actual, expected);
    }
}

