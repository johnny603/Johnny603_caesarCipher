# 🔐 Caesar Cipher in Java

This project is a simple implementation of the **Caesar Cipher** encryption algorithm using Java. The Caesar Cipher is a classic encryption technique where each letter in a string is shifted by a fixed number of positions in the alphabet. It’s a great beginner project to learn about string manipulation, character operations, and working with command-line arguments.

---

## 🛠️ How It Works

The program consists of:

- `encrypt(String text, int shift)`  
  Shifts each alphabetic character **forward** by the given shift value, wrapping around the alphabet.

- `decrypt(String text, int shift)`  
  Shifts each alphabetic character **backward** by the given shift value, reversing the encryption.

- Command-line support using `String[] args` to allow the user to specify:
  - An operation flag (`-e` for encryption, `-d` for decryption)
  - The text to process
  - The shift value (between 1 and 27)

---

## ▶️ How to Run

### 1. Fork repository
### 2. Clone on machine
### 3. Compile the program

Make sure you have Java installed. Then open a terminal and run:

```bash
javac Main.java
```

---

## Shoutouts

Shoutout to the team at [@codedex_io](https://x.com/codedex_io) and [@exrlla](https://x.com/exrlla) for pushing learners like me to work on wonderful projects



