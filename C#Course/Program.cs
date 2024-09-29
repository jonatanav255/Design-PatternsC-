BadBankAccount badBankAccount = new BadBankAccount(1000);

System.Console.WriteLine(badBankAccount.GetBalance());
badBankAccount.Deposit(100);
System.Console.WriteLine(badBankAccount.GetBalance());
badBankAccount.Withdraw(400);
System.Console.WriteLine(badBankAccount.GetBalance());

// badBankAccount.balance = 100;

// System.Console.WriteLine(badBankAccount.balance) ;
