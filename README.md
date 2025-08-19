# Library Management System (CLI)

## Project Overview
This is a **Java-based command-line Library Management System**. Users can log in as **Admin** or **Member** and perform various library operations such as adding books, viewing books, and borrowing books.

The project demonstrates key Java concepts:
- Abstract classes
- Interfaces
- Static members
- ArrayLists
- Object-oriented design

---

## Features

### Admin
- Add books
- Remove books
- View all books

### Member
- Borrow books
- View available books

---

## Sample Credentials

| Role   | Username | Password |
|--------|----------|----------|
| Admin  | admin    | admin123 |
| Member | rohan    | pass123  |
| Member | neha     | 12345    |

---

## Requirements
- Java 21 
- AWS CLI (if downloading JAR from S3)
- Command-line terminal (Linux, Mac, or Windows)

---
## How to Set Up on AWS EC2

### 1️⃣ Create an EC2 Instance
- Launch an EC2 instance (Amazon Linux 2 recommended).  
- During setup, create or select an **IAM role** that has **S3ReadOnlyAccess** or **AmazonS3FullAccess**.  
  - This allows the EC2 instance to download your JAR from S3 without using keys.  
- Open **port 22** for SSH access.

---

### 2️⃣ Connect to EC2
Use **SSH** or **EC2 Instance Connect**:

```bash
ssh -i your-key.pem ec2-user@<EC2-Public-IP>

---
3️⃣ Verify or Install Java

Check the Java version:
java -version
If Java is older than 17, install Amazon Corretto 17:

sudo amazon-linux-extras enable corretto17
sudo yum install java-17-amazon-corretto -y
java -version
---
4️⃣ Download the JAR from S3
Make sure your EC2 instance has access to your S3 bucket (via IAM role or credentials):
aws s3 cp s3://<your-bucket-name>/LibraryManagmentSystem.jar .

---
5️⃣ Run the JAR
java -jar LibraryManagmentSystem.jar
