package entities;

import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Test;

import entitites.User;

public class UserTest {

	@Test
	public void test1() {
		User user = new User();
		user.setFirstName("Jean");
		Assert.assertThat(user.getFirstName(), IsEqual.equalTo("Jean"));
	}

	@Test
	public void test2() {
		User user = new User();
		user.setLastName("Dupont");
		Assert.assertThat(user.getLastName(), IsEqual.equalTo("Dupont"));
	}

	@Test
	public void testEquals() {
		User user = new User();
		user.setFirstName("Jean");
		user.setLastName("Dupont");

		User user2 = new User();
		user2.setFirstName("Jeanne");
		user2.setLastName("AuSecours");

		User user3 = new User();
		user3.setFirstName("Jean");
		user3.setLastName("Dupont");

		Assert.assertEquals(false, user.equals(user2));
		Assert.assertEquals(true, user.equals(user3));

	}

	@Test
	public void testToString() {
		User user = new User();
		user.setFirstName("Jean");
		user.setLastName("Dupont");

		Assert.assertEquals("lastName=Dupont, firstName=Jean", user.toString());
	}

}
