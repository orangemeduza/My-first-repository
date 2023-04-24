import com.github.javafaker.Faker;

public class TestData {
    public String firstname, lastname, userEmail, currentAddress;

    public TestData() {
        Faker faker = new Faker();
        this.firstname = faker.name().firstName();
        this.lastname = faker.name().lastName();
        this.userEmail = faker.internet().emailAddress();
        this.currentAddress = faker.address().fullAddress();
    }
}

