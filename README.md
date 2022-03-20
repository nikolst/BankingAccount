# BankingAccount :moneybag:

## About :information_source:

This project represents a simple banking system with a database. In real life credit card numbers ensure easy payments and they also help prevent payment errors. 

## Anatomy of a creadit card :credit_card:

Most of the credit card numbers consists of 16 digits. Every digit or pairs of digits has meaning:
* The first digit tells you what sort of institution issued the card (**Major Industry Identifier (MII)**)
* The first six digits are the **Bank Identification Number (BIN)**. These can be used to look up where the card originated from.
* The seventh digit to the second-to-last digit is the **customer account number**.
* The very last digit of a credit card is the **check digit** or **checksum**, which is used to validate the credit card number using the _Luhn algorithm_.

You can learn more from here :point_right: https://www.forbes.com/advisor/credit-cards/what-does-your-credit-card-number-mean/

<img src="https://github.com/nikolst/BankingAccount/blob/main/Screenshot%202022-03-20%20at%2022.16.17.png" width="300" height="200">

## What the program does :mag_right:

The program is used to create customer accounts in the banking system. Each account consists of: customerIdNumber, cardNumber, cardPinCode and the balance of the account. 

When the program starts, on the console you can see the main menu with three options:

1. Create an account
2. Log into account
0. Exit

If the first option is being choosed ("Create an account"), the program generate a new card number, using the Luhn algorithm, and a pin code of four digits in the range 0000 - 9999. 

If the choosed option is "Log into account", the program ask the user to enter their information (card number and pin code). The program save all generated data in a database. If the program was stopped and runned again, it still has all information about the previous generated accounts. So, when the user enter his information, the program checks for a match in the database.

<img src="https://github.com/nikolst/BankingAccount/blob/main/Screenshot%202022-03-20%20at%2021.06.32.png" width="500" height="150">

After all information if entered correctly, the user see another menu:

1. Balance
2. Log out
0. Exit

where he/she can check the balance of the card, log out of the account and return to the main menu or completely exit the program. If the personal credentials are not correct, the user sees the message "Wrong card number or PIN!". 

On each step the user can see a message which tell him what is the result after the selected command. 

## Used Technologies :computer:

* Programming Language: **Java**
* Relational Database Management System: **SQLite**
* Java API: **JDBC**

## Example

1. Create an account
2. Log into account
0. Exit

1

Your card has been created

Your card number:

4000007372538113

Your card PIN:

2974

1. Create an account
2. Log into account
0. Exit

2

Enter your card number:

4000007372538113

Enter your PIN:

2974

You have successfully logged in!

1. Balance
2. Log out
0. Exit

1

Balance: 0
1. Balance
2. Log out
0. Exit

2

You have successfully logged out!

1. Create an account
2. Log into account
0. Exit

2

Enter your card number:

4000007372538111

Enter your PIN:

2974

Wrong card number or PIN!

1. Create an account
2. Log into account
0. Exit

0

Bye!
