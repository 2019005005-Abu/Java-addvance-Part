package Bank;
class Account{
    public String  name;
    protected String  email;
    private String password;

    //getter
     public String getPassword(){
        setPassword(random_password);
        return this.password;
     }
    //setter
    private void setPassword(String pass){
        this.password=pass;
    }


}
 class Bank {
     public static void main(String[] args) {
        System.out.println("I am a full stack developer");
        Account account_1=new Account();
        account_1.name="Abu Al Shahriar Rifat";
        account_1.email="rifatsharda2686@gmail.com";
        account_1.setPassword("abcd");
        System.out.println(account_1.getPassword());


     }
}
