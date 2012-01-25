package dojo.controller;

import org.japybara.WebTestCase;
import org.junit.Test;

import java.io.IOException;

public class HomeControllerTest extends WebTestCase {
    @Test
    public void shouldDisplayLoginIfNotLoggedIn() throws IOException {
        visit("/");
        System.out.println(getContent());
        assertHasContent("Hello");
    }
}
