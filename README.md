# Minimum Length of String Reduction  

## Problem Description  
This repository contains a Java solution for reducing a string to its minimum possible length based on specific rules. The challenge revolves around efficiently identifying and removing characters while minimizing the resulting string's length.  

### Problem Statement  
Given a string `s`, you can repeatedly perform the following operation:  
1. Choose an index `i` such that:  
   - There is at least one character to the left of `i` that matches `s[i]`.  
   - There is at least one character to the right of `i` that matches `s[i]`.  
2. Remove the closest character to the left and right of `i` that match `s[i]`.  

Return the **minimum possible length** of the string after performing these operations any number of times.  

---

## Solution Overview  

The solution uses a **frequency array** and **bitwise operations** for efficient computation:  
1. Count the frequency of each character in the string using a frequency array.  
2. Calculate the contribution of each character to the result:  
   - If the frequency is even, it contributes double its value.  
   - If the frequency is odd, it contributes its exact value.  
3. Return the final computed length.  

---

## Code Complexity  
- **Time Complexity:** $$O(n)$$  
  - Iterating through the string and processing a fixed-size frequency array.  
- **Space Complexity:** $$O(1)$$  
  - Fixed-size frequency array for all lowercase English letters.  

---

## How to Run  

1. Clone the repository:  
   ```bash  
   git clone https://github.com/your-username/minimum-length-string-reduction.git  
   cd minimum-length-string-reduction  
   ```  

2. Compile and run the code:  
   ```bash  
   javac Solution.java  
   java Solution  
   ```  

---

## Watch the Explanation  
Check out the complete explanation with dry runs and step-by-step walkthrough on my YouTube video: https://youtu.be/CEJI1f3WWgU  

---

## Contributing  
Feel free to fork this repository and submit pull requests for any optimizations or alternative approaches!  

---

## License  
This project is licensed under the MIT License.  

