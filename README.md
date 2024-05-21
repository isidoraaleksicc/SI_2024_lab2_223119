# Втора лабораториска вежба по Софтверско инженерство
**Исидора Алексиќ, бр. на индекс 223119**

**Control Flow Graph:**

![Untitled Diagram](https://github.com/isidoraaleksicc/SI_2024_lab2_223119/assets/162890829/c1133d41-ddb6-47ae-a311-8f02f4c27d9c)

**Цикломатска комплексност**

Цикломатска комплексност на овој граф излегува 10, оваа бројка ја добив со броење на регионите + 1.


**Тест случаи според критериумот Every branch**

          AllItems { Name   Barcode   Price   Discount } Payment
                  1. {null}                                 X
                  2.{ {}     0567      500      10      }   3000
                  3.{ kiwi    null     X         X      }     X
                  4.{ apple   -19292   X        X       }    X
                  5.{ cherry   5362   500      10      }   6000

Тест 1 ни е случај каде што имаме празна низа односно AllItems ни е null и со тоа не влегуваме во другите циклуси.
Тест 2 ни е случај каде што немаме внесено име за продуктот, каде баркодот ни започнува на 0 и цената по попустот е поголема од payment.
Тест 3 преставува случај каде што немаме внесено баркод и со тоа имаме throw exception и другите внесени работи не се ни битни.
Тест 4 е случај каде што за баркод имаме -1 и исто така се добива throw exception и другите внесени податоци не се битни односно не ни менуваат ништо.
Тест 5 е случај каде што имаме се во ред внесено но ни фали случај каде што payment ке ни биде поголемо од price*discount со тоа ставаме поголема вредност за payment.
И со овие 5 случаи ги поминуваме сите можни патеки за овој код.

**Тест случаи според критериумот Multiple Condition**

item.getPrice() > 300  |  item.getDiscount() > 0 |  item.getBarcode().charAt(0)== '0' |      

       T                          T                            T
       
       T                          T                            F
       
       T                          F                            T
       
       T                          F                            F
       
       F                          T                            T
       
       F                          T                            F
       
       F                          F                            T
       
       F                          F                            F

       1 тест случај е кога имаме цена: 400 попуст: 20 баркод: 0251
       2 тест случај е кога имаме цена: 400 попуст: 15 баркод: 1251
       3 тест случај е кога имаме цена: 350 попуст: 0 баркод:  0251
       4 тест случај е кога имаме цена: 350 попуст: 0 баркод:  1251
       5 тест случај е кога имаме цена: 250 попуст: 5 баркод:  0251
       6 тест случај е кога имаме цена: 270 попуст: 8 баркод:  1251
       7 тест случај е кога имаме цена: 290 попуст: 0 баркод:  0251
       8 тест случај е кога имаме цена: 280 попуст: 0 баркод:  1251
       
       
                                 







