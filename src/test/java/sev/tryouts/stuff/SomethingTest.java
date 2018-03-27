package sev.tryouts.stuff;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;
import java.util.Random;

import static java.lang.String.format;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnit4.class)
public class SomethingTest {

    @Test
    public void testingDoSomething() {
        Random random = new Random();
        int count = random.nextInt(100) * 100;
        List<String> testData = Something.createTestData(count);
        assertThat(format("Testdata should contain '%s' entries", count), testData.size(), is(count));
    }

    @Test
    public void testingDoSomethingMore() {
        Random random = new Random();
        int count = random.nextInt(1000) * 100;
        List<String> testData = Something.createTestData(count);
        assertThat(format("Testdata should contain '%s' entries", count), testData.size(), is(count));
        assertThat("Number of testdata entries should not be greater than '500', but was " + count, (count <= 500), is(true));
    }

    @Test
    public void testingDoSomethingMoreSpecial() {
        Random random = new Random();
        int count = random.nextInt(10000) * 100;
        List<String> testData = Something.createTestData(count);
        assertThat(format("Testdata should contain '%s' entries", count), testData.size(), is(count));
        assertThat("Number of testdata entries should not be greater than '5000', but was " + count, (count <= 5000), is(true));
    }

}