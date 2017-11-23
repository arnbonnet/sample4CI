package entities;

import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import entitites.User;

public class UserTest {
	
	private User user;
	private User user2;
	private User user3;
	
	@Before
	public void before() {
		user = new User();
		user.setFirstName("Jean");
		user.setLastName("Dupont");
		
		user2 = new User();
		user2.setFirstName("Jeanne");
		user2.setLastName("AuSecours");
		
		user3 = new User();
		user3.setFirstName("Jean");
		user3.setLastName("Dupont");
	}

	@Test
	public void test1() {
		Assert.assertThat(user.getFirstName(), IsEqual.equalTo("Jean"));
	}

	@Test
	public void test2() {
		Assert.assertThat(user.getLastName(), IsEqual.equalTo("Dupont"));
	}

	@Test
	public void testEquals() {
		Assert.assertEquals(false, user.equals(user2));
		Assert.assertEquals(true, user.equals(user3));
		Assert.assertEquals(true, user.equals(user));
		Assert.assertEquals(false, user.equals(null));
		Assert.assertEquals(false, user.equals(new String("hello")));
	}

	@Test
	public void testToString() {
		Assert.assertEquals("lastName=Dupont, firstName=Jean", user.toString());
	}

}
