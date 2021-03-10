public abstract class BankAccount{
    private int pin_encrypted;
    protected float balance;
    protected String account_number;


    public BankAccount( String account_num ,int pin){
        this.account_number = account_num;
        this.pin_encrypted = encrypt(pin);
        this.balance = 0;
    }

    protected int encrypt(int value){
        int result = (value * 4 ) - 7;
        return result;
    }

    protected boolean is_valid_pin(int pin){
        int cipher = encrypt(pin);
        if (this.pin_encrypted == cipher){
            return true;
        }
        return false;
    }

    public String get_account_number(){
        return this.account_number;
    }

    public float get_balance(int pin){
        if( pin < 0 && pin <= Integer.MAX_VALUE && is_valid_pin(pin) == true){//precondition
            return this.balance;
        }
        else{
            System.out.println("The balance could not be viewed.");
            return -1;
        }
    }

    public boolean deposit(float amount){
        if (amount > 0 && amount < Float.MAX_VALUE) {//can't insert a number less than 0 as a deposit
            this.balance = this.balance + amount;
            return true;
        }
        else{
            System.out.println("Deposit cancelled.");
            return false;
        }
    }

    public abstract boolean withdraw(int Pin , float amount);//abstract method implemented elsewhere
}

