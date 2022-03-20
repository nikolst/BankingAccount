# BankingAccount :moneybag:

## About

This project represents a simple banking system with a database. In real life credit card numbers ensure easy payments and they also help prevent payment errors. 

## Anatomy of a creadit card :credit_card:

Most of the credit card numbers consists of 16 digits. Every digit or pairs of digits has meaning:
* The first digit tells you what sort of institution issued the card (**Major Industry Identifier (MII)**)
* The first six digits are the **Bank Identification Number (BIN)**. These can be used to look up where the card originated from.
* The seventh digit to the second-to-last digit is the **customer account number**.
* The very last digit of a credit card is the **check digit** or **checksum**, which is used to validate the credit card number using the _Luhn algorithm_.

You can learn more from here :point_right: https://www.forbes.com/advisor/credit-cards/what-does-your-credit-card-number-mean/



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
