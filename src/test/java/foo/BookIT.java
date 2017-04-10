package foo;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class BookIT {
    @Test
    public void testDomainClassAccessor() {
        final String TARGET_TITLE = "title";
        Book b = new Book();
        b.setTitle(TARGET_TITLE);
        assertThat(b.getTitle(), CoreMatchers.is(TARGET_TITLE));
        /* b.getAuthors() or any method involving db interaction causes compilation errors*/
    }
}
