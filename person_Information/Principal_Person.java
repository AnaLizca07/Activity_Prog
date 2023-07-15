package person_Information;

public class Principal_Person {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Personal information: \n Name: " + person.name +  " \n Last Name: " + person.lastName +
                " \n Is she single?: " + person.Single + " \n Age: " + person.Age + " \n Cash Money: $" + person.cashMoney +
                " \n Gender: " + person.gender + " \n Salary: $" + person.salary + " \n Account Money: $" + person.accountMoney +
                " \n Height: " + person.height +"cm" + " \n Favorite Number: "+person.FavoriteNumber);
    }
}
