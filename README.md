# User Auht and Membership Program

## General Overview

This Java application is a simple console-based membership and login system for a fictional food service called "Em-Food". It allows users to sign up, log in, and access a main menu with options such as "Take", "Give", and "Info Promo". User data (name, NPM/student ID, password, and membership level) is stored in plain text files. The program also offers a membership upgrade system with different tiers (Silver, Gold, Platinum) and a promotional information feature.

## Flow of this project

### 1. Sign Up

+-----------------------------+
| Start: User Chooses Sign Up |
+-----------------------------+
|
V
+-------------------------------------------+
| Check for Duplicate Names in Nama.txt |
| (Prompt user for a unique name if needed) |
+-------------------------------------------+
|
V
+-------------------------------------------+
| User Enters NPM (11 digits, unique) |
| (Validate format and uniqueness) |
| (Repeat if invalid) |
+-------------------------------------------+
|
V
+-------------------------------------------+
| User Sets Password (At least 5 characters)|
| (Repeat if invalid) |
+-------------------------------------------+
|
V
+-------------------------------------------+
| Offer Membership Upgrade: Silver (free), |
| Gold (paid), Platinum (paid) |
| (Simulate Payment for Gold/Platinum) |
+-------------------------------------------+
|
V
+-------------------------------------------+
| Save Membership Level in Royalty.txt |
+-------------------------------------------+
|
V
+-----------------------------+
| Sign Up Complete! |
+-----------------------------+

### 2. Log in

+-----------------------------+
| Start: User Chooses Log In |
+-----------------------------+
|
V
+-------------------------------------------+
| Authenticate User (Check Name, NPM, |
| Password against stored data) |
| (Repeat if any input is incorrect) |
+-------------------------------------------+
|
V
+-------------------------------------------+
| User Successfully Logged In |
+-------------------------------------------+
|
V
+-------------------------------------------+
| Display User's Membership Level |
+-------------------------------------------+
|
V
+-----------------------------+
| Main Menu Displayed |
| (Take, Give, View Promo) |
+-----------------------------+
|
V
+-------------------------------------------+
| Check Membership Level for "Take" usage |
| limits (based on Silver, Gold, Platinum) |
+-------------------------------------------+
|
V
+------------------------------------------+
| Program Continues (User Uses Options) |
+------------------------------------------+

## The detail about the project

### 1. File Structure and Data Storage

- Nama.txt: Stores registered user names.
- NPM.txt: Stores user NPMs (student IDs).
- Password.txt: Stores user passwords.
- Royalty.txt: Stores user membership levels (Silver, Gold, Platinum).
  Each file is read and written to directly using Java's file I/O classes.

### 2. Code Structure

- The main logic is inside the main method of the Program class.
- File reading/writing is handled with BufferedReader, FileReader, PrintWriter, and File.
- User input is managed via Scanner and BufferedReader.
- Membership upgrade logic is encapsulated in the royalty method.
- Promo information and sorting is handled in the promo method.

### 3. Error Handling

- The program checks for file existence and input format errors.
- User input is validated in loops until correct data is provided.
- If any file is missing, an error message is shown.

### 4.Limitations

- Data is stored in plain text files, which is not secure for passwords.
- No concurrency or multi-user support.
- No graphical interface; all interaction is via the console.
- Features like "Take" and "Give" are placeholders.
