# SHA-1 (Secure Hash Algorithm 1) (Lab2)

SHA-1 (Secure Hash Algorithm 1) is a cryptographic hash function used to produce a unique fixed-length 160-bit hash value from any input message. Here is a detailed explanation of the SHA-1 algorithm:

## **1. Message Preparation**
The input message is divided into fixed-length blocks and padded to the required length if necessary. Padding typically follows the "length-1-bit-0-length" scheme.

## **2. Message Block Processing**
Each message block undergoes an iterative process involving several steps.

**a. Block Splitting into Words**
The message block is divided into 32-bit words.

**b. Expansion**
For each word in the message block, 80 32-bit word extensions are formed using a specific logical scheme.

**c. Variable Initialization**
Certain variables are initialized that will be used for computing the final hash value.

**d. Round Operations**
Eighty rounds of operations are performed, in which the variables interact with the words of the message block and constants.

**e. Hash Value Update**
After each round, the variables are updated based on the results of the round operations.

## **3. Final Hash Value Formation**
After processing all the message blocks, the final hash value is formed by concatenating the values of the variables representing parts of the hash code.

The SHA-1 algorithm utilizes various logical and bitwise operations such as bitwise shifts, logical conjunctions and disjunctions, circular bitwise shifts, and inversions. These operations ensure good bit distribution and non-linearity in the hash code generation process.
