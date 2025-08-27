
# 🔐 Enigma Machine Simulator (Java)

This is a **Java-based simulation of the Enigma Machine**, the famous cipher device used during World War II.
It models the **rotors, reflector, and plugboard** to encrypt and decrypt messages exactly like the historical machine.


<br/>

## ✨ Features

* ✅ Implements **3 rotors** with configurable wiring and notch positions
* ✅ **Reflector** for bidirectional encryption
* ✅ **Plugboard swaps** for extra scrambling
* ✅ Encryption and decryption are the **same operation** (reset rotor positions to decrypt)
* ✅ Fully written in **Java**


<br/>

## ⚙️ How It Works

1. A character goes through the **plugboard** (optional letter swaps).
2. Then it passes through the **rotors (forward)**.
3. The signal is **reflected** back.
4. It travels back **through the rotors (backward)**.
5. Finally, it comes back through the **plugboard**.
6. After each letter, the **rotors rotate**, changing the wiring dynamically.

This makes the encryption **polyalphabetic** and extremely hard to break without knowing the machine setup.


<br/>

## 📂 Project Structure

```
src/
 ├── Main.java          # Entry point, runs an example
 ├── EnigmaMachine.java # Coordinates rotors, reflector, plugboard
 ├── Rotor.java         # Rotor logic with forward/backward wiring
 ├── Reflector.java     # Reflects the signal
 └── Plugboard.java     # Handles letter swaps
```


<br/>

## 🚀 Running the Project

### Prerequisites

* Java 8 or higher
* IntelliJ IDEA or any Java IDE

### Steps

1. Clone this repository:

   ```bash
   git clone https://github.com/your-username/enigma-simulator.git
   ```
2. Open in IntelliJ (or your IDE of choice).
3. Run `Main.java`.

You’ll see both the **encrypted** and **decrypted** output.


<br/>

## 📝 Example Run

Input:

```
MISCXDPETK
```

Output:

```
encrypted: QZBXY...
decrypted: MISCXDPETK
```


<br/>

## 📖 Background

The **Enigma machine** was used during WWII for secure communication.
Alan Turing and his team at Bletchley Park famously broke it, which helped shorten the war.


<br/>

## 🔮 Future Improvements

* Add more rotors and reflector configurations
* Add a GUI interface for visualization
* Support for spaces, punctuation, and numbers


<br/>

## 📜 License

This project is open source under the MIT License.


