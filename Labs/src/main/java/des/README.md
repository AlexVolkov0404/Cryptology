# DES (Data Encryption Standard) in the CBC mode (Lab2)

DES (Data Encryption Standard) is a symmetric encryption algorithm that was widely used for secure data transmission and storage. It processes data blocks of 64 bits and uses a 56-bit key. Here is a detailed explanation of the DES algorithm:

## **1. Key Generation**
From the 56-bit encryption key, sixteen 48-bit round keys are generated. Initially, the key is permuted using the PC-1 (Permuted Choice 1) table, which removes eight parity bits and rearranges the remaining 56 bits. The key is then split into two halves of 28 bits each, which are left-shifted by one or two bits depending on the round. Each 28-bit half is processed through the PC-2 table to obtain the sixteen 48-bit round keys.

## **2. Initial Permutation (IP)**
The 64-bit plaintext block undergoes an initial permutation using the IP table, rearranging the bits of the block according to a set pattern.

## **3. Feistel Network**
DES uses a Feistel network structure, consisting of several rounds where the same operations are applied to different halves of the data block. In each round, the right half of the data is expanded using the E (Expansion) table to form a 48-bit value.

## **4. Round Function**
The expanded 48-bit value is combined with the round key for the current round using the XOR operation. The resulting 48 bits are divided into eight 6-bit sections, each passing through a substitution box (S-Box), which replaces the 6 bits with 4 bits based on a lookup table. This step introduces complexity and non-linearity into the encryption process.

## **5. Permutation**
After the S-Box substitution, the resulting 32 bits are permuted using the P table, rearranging the bits according to another defined pattern.

## **6. Round Iteration**
The left half of the data block is combined with the output of the round function using the XOR operation, while the right half remains unchanged. Then, the positions of the left and right halves are swapped, and the process is repeated for the next round.

## **7. Final Permutation (FP)**
After the last round, the positions of the left and right halves are swapped again. The resulting block undergoes a final permutation using the FP table, which is the inverse of the initial permutation.

## **8. Output**
The final permuted block is the ciphertext.

To decrypt the ciphertext, the same algorithm is applied, but the round keys are used in reverse order.

**Note:** DES has become outdated and its use is not recommended due to its short key length, which makes it vulnerable to brute-force attacks. Modern encryption standards, such as AES (Advanced Encryption Standard), are now widely utilized as more secure alternatives.
