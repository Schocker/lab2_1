package edu.iis.mto.bsearch;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test
    public void itemShouldBeFoundInOneElementSeq() {
        int key = 1;
        int[] seq = {key};

        SearchResult searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.isFound(), is(true));
        assertThat(seq[searchResult.getPosition()], is(key));
    }

    @Test
    public void itemShouldNotBeFoundInOneElementSeq() {
        int key = 1;
        int[] seq = {0};

        SearchResult searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.isFound(), is(false));
        assertThat(searchResult.getPosition(), is(-1));
    }

    @Test
    public void itemShouldBeFoundAtBeginningOfManyElementsSeq() {
        int key = 1;
        int[] seq = {1,2,3,4,5};

        SearchResult searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.isFound(), is(true));
        assertThat(seq[searchResult.getPosition()], is(key));
    }


}