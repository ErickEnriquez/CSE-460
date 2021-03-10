public class CheckingAccount extends BankAccount{

    public CheckingAccount (String account_number , int pin){
        super(account_number,pin);
    }

    @Override
    public boolean withdraw(int pin , float amount){
        if (this.is_valid_pin(pin) == true && amount > 0){//precondition amount must be 0 > and pin must be valid
            if(this.balance  < amount){ //post condition , balance can't be less than 0 after withdrawl
                System.out.println("Withdrawal cancelled.");
                return false;
            }
            else{
                this.balance = this.balance - amount;
                return true;
            }
        }
        System.out.println("Withdrawal cancelled.");
        
        return false;
       
    }
}