package foo;

import grails.orm.bootstrap.HibernateDatastoreSpringInitializer;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class BookIT {

    @SuppressWarnings("unused")
    @Before
    public void setup() {
        HibernateDatastoreSpringInitializer initializer = new HibernateDatastoreSpringInitializer(
                Arrays.asList(Book.class, Author.class));
        ApplicationContext applicationContext = initializer.configure();
    }

    @Test
    public void testDomainClassAccessor() {
        final String TITLE1 = "title1";
        final String NAME1 = "Author 1";

        Book b = new Book();
        b.setTitle(TITLE1);
        assertThat(b.getTitle(), CoreMatchers.is(TITLE1));
        Author a1 = new Author();
        a1.setName(NAME1);

        // each of the lines below causes a compilation error
        /*b.addTo("authors", a1);
        assertTrue(a1.validate());
        assertThat(Book.count(), CoreMatchers.is(0));
        assertNotNull(a1.save());
        assertThat(Book.count(), CoreMatchers.is(1));*/
    }

}
