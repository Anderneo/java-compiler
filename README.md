# Java Compiler

## Introduction
  Follow the link below to learn more about the project. 
  
  [Document (pt-br)](https://s3-sa-east-1.amazonaws.com/prd-multimedia-store/forum.postagem/204430/Projeto1-AnLexico.pdf)

## Conditions
  This is an academic project, so only students enrolled in Devry Metrocamp University and attending the 7th semester Computer Science course will have access to it.
  
  By the way, anyone's contribution is welcome and you are *free* to use the content of this project in your own work.
  This projects and all your content is based on **GNU General Public License v3.0**, if you don't know GNU GPL content, follow the link [GNU GPL Document](https://github.com/lhpsilvadev/java-compiler/blob/master/LICENSE) to learn more about.
  
## How does it work?
  The program will work as a simple compiler for a specific fake program language. Basically, the compiler will receive the source file as input, read the contents while parsing the syntax, and print the output to the user.
  
  ### Features
  
  #### Lexical Analyzer
  A class that defines a lexical parser. This class has a method called *nextToken*, wicth is responsible for processing the input, character by character, and return a valid token.
  
  **It must:**<br>
  * Read a string as input from a text file, identifying the following tokens:
    
  | Code | Token | Standart (informal) | Lexeme (examples) |
  | ---- | ----- | ------------------- | ----------------- |
  | 1 | **NUM_INT** | Integer number | 124 48 3E+10 |
  | 2 | **NUM_FLOAT** | Decimal number | 4.8 3.10E+10 |
  | 3 | **LITERAL** | Chars in single quotes | 'Carlos' 'batata' |
  | 4 | **ID** | char or _ followed by char, digit ou _ | val, \_salary\_, i\_ |
  | 5 | **RELOP** | &<& &>& &<=& &>=& &=& &<>& | & < &, & > &, & >= & |
  | 6 | **ADDSUB** | + - | a + b, a - b|
  | 7 | **MULTDIV** | * / | a * b, a / b|
  | 8 | **ATTRIB** | << | a << 4 |
  | 9 | **TERM** | ; | a << 4; |
  | 10 | **L_PAR** | ( | ( |
  | 11 | **R_PAR** | ) | ) |
  | 12 | **LOGIC_VAL** |  verdadeiro falso | verdadeiro, falso |
  | 13 | **LOGIC_OP** | nao e ou | nao, e, ou |
  | 14 | **TYPE** | logico texto num | logico, texto, num |
  | 15 | **PROGRAM** | programa | programa |
  | 16 | **END_PROG** | fimprog | fimprog |
  | 17 | **BEGIN** | inicio | inicio |
  | 18 | **END** | fim | fim |
  | 19 | **IF** | se | se |
  | 20 | **THEN** | entao | entao |
  | 21 | **ELSE** | senao | senao |
  | 22 | **FOR** | para | para |
  | 23 | **WHILE** | enquanto | enquanto |
  | 24 | **DECLARE** | declare | declare |
  | 25 | **TO** | ate | ate |
  
  * Eliminate whitespaces/rows, discarding them.
  * Eliminate comments like: **#{ comment }#**.
  * Keep count of rows and columns.
  * Indicate row and collumn of the token that generated the lexical error.
  * Use the symbol table to differ reserved words and identifiers.
  * At each call of *nextToken*, it must return an object of *Token* class.
  
