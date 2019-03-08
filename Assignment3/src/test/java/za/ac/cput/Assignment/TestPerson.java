package za.ac.cput.Assignment;

import org.junit.*;

public class TestPerson {
    Person p;
    Person pn;

    @Before
    public void setUp() throws Exception {
        p = new Person.Builder.age(25).name("Sebe").surname("Msomi").build();
        pn = new Person.Builder().age(25).name("Sebe").surname("Msomi").build();
        p = pn;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getAge() {
    }

    @Test
    public void getName() {
    }

    @Test
    public void getSurname() {
    }

    @Test
    public void equals() {

    }

    @Test
    public void ObEqaul() {
        Assert.assertEquals(p, pn);
    }

    @Test
    public void objIdentity() {
        Assert.assertSame(p, pn);
    }

    @Test(timeout = 20000)
    public void Timeouts() {
        Assert.assertSame(p, pn);
        while (true) ;
    }

    @Ignore
    @Test
    public void DisablingTest() {
        Assert.assertEquals(p, pn);
    }

    @Test(expected = AssertionError.class)
    public void FailingTest() {
        Assert.assertEquals(p, pn);
    }
}
