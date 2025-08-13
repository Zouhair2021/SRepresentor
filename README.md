# 🧮 SRepresentor

**Educational Application for Visual Learning of Subtraction**

An interactive JavaFX application that helps students understand subtraction through visual representation using colored blocks.

![JavaFX](https://img.shields.io/badge/JavaFX-Educational-blue)
![Platform](https://img.shields.io/badge/Platform-Windows-green)
![Math Learning](https://img.shields.io/badge/Math-Learning-orange)
![Visual Learning](https://img.shields.io/badge/Visual-Learning-purple)

---

## 📸 Application Preview

*Screenshot of SRepresentor in action would go here*

Visual representation of numbers using colored blocks for subtraction learning

---

## 📋 Table of Contents

- [Overview](#-overview)
- [Features](#-features)
- [Installation](#-installation)
- [How to Use](#-how-to-use)
- [Technical Details](#-technical-details)
- [Development](#-development)
- [Contributing](#-contributing)
- [Contact](#-contact)

---

## 🎯 Overview

SRepresentor is an educational application designed to help students learn subtraction through visual representation. The application uses colored blocks to represent numbers in a place-value system (units, tens, hundreds), making abstract mathematical concepts concrete and understandable.

### 🎓 Educational Benefits

- **Visual Learning:** Students can see the mathematical process happening
- **Step-by-step Process:** Breaks down complex subtraction into manageable steps
- **Interactive Experience:** Students actively participate in the learning process
- **Immediate Feedback:** Visual results help students understand their work
- **Borrowing Visualization:** Makes the borrowing process clear and understandable

---

## ✨ Features

### 🧮 Visual Number Representation
Numbers are displayed using colored blocks representing units, tens, and hundreds for intuitive understanding of place value.

### 👆 Step-by-Step Learning
Navigate through subtraction steps using "Next" and "Previous" buttons to understand each manipulation thoroughly.

### 🎨 Customizable Interface
Choose from 9 different block colors and customize background colors to match learning preferences.

### 🔄 Automatic Borrowing
Automatically handles and visualizes the borrowing process during complex subtraction operations.

### 💾 Persistent Preferences
User preferences for colors and settings are automatically saved and restored between sessions.

### ⚡ Smooth Animations
Engaging animations and transitions make the learning experience more enjoyable and memorable.

### 🎨 Available Block Colors

The application supports 9 different color schemes for the blocks:

- 🖤 **Black**
- 🔵 **Blue** (default)
- 🟢 **Green**
- 🟠 **Orange**
- 🩷 **Pink**
- 🟣 **Purple**
- 🔴 **Red**
- ⚪ **White**
- 🟡 **Yellow**

---

## 📦 Installation

### 🚀 Quick Download

[![Download EXE](https://img.shields.io/badge/Download-Windows%20EXE-brightgreen?style=for-the-badge)](https://github.com/username/srepresentor/releases)
[![Source Code](https://img.shields.io/badge/View-Source%20Code-blue?style=for-the-badge)](https://github.com/username/srepresentor)

### ⚠️ System Requirements

- **Operating System:** Windows 7, 8, 10, or 11
- **Memory:** 512 MB RAM minimum
- **Storage:** 50 MB free disk space
- **Display:** 1024x768 minimum screen resolution

### 🔧 Installation Steps

1. Download the `SRepresentor.exe` file from the [releases section](https://github.com/username/srepresentor/releases)
2. Double-click the downloaded file to run the installer
3. Follow the installation wizard prompts
4. Launch SRepresentor from the Start Menu or desktop shortcut
5. Enjoy learning subtraction visually!

---

## 📚 How to Use

### 🚀 Getting Started

1. **Enter First Number:** Type a number between 1-999 in the "Number 1" field and press Enter
2. **Enter Second Number:** Type a smaller number in the "Number 2" field and press Enter
3. **Start Learning:** Click "Next" to begin the step-by-step subtraction process
4. **Navigate Steps:** Use "Previous" and "Next" to review or advance through steps
5. **Start Over:** Click "New" to clear and begin with different numbers

### 🎯 Usage Rules

| Rule | Description |
|------|-------------|
| **Number Range** | Numbers must be between 1 and 999 |
| **Number Order** | First number must be greater than the second number |
| **Input Type** | Only whole numbers (integers) are accepted |
| **Borrowing** | Application automatically handles borrowing when needed |

### 🎨 Customization Options

Right-click anywhere in the application to access the customization menu:

- **Block Colors:** Choose from 9 predefined color schemes
- **Background Color:** Select a custom background color using the color picker
- **Preferences:** All choices are automatically saved for future sessions

---

## 🔧 Technical Details

### 💻 Technology Stack

- ☕ **Java 8+**
- 🎨 **JavaFX**
- 🏗️ **Scene Builder**
- 💾 **Java Preferences API**

### 📁 Project Structure

```
SRepresentor/
├── src/
│   ├── SRepresenter.java          # Main application class
│   ├── ColorPreferences.java      # User preferences management
│   └── resources/
│       └── blocs/                 # Block image resources
│           ├── Thousand_Block_*.png
│           ├── Hundred_Block_*.png
│           ├── Ten_Block_*.png
│           └── One_Block_*.png
├── README.md                      # This file
├── LICENSE                        # License information
└── builds/                        # Compiled executables
    └── SRepresentor.exe
```

### 🎯 Key Classes

- **SRepresenter:** Main application class handling UI and logic
- **ColorPreferences:** Manages user color preferences using Java Preferences API

---

## 👨‍💻 Development

### 🛠️ Development Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/username/srepresentor.git
   ```

2. Open the project in your preferred Java IDE (IntelliJ IDEA, Eclipse, NetBeans)

3. Ensure JavaFX is properly configured in your development environment

4. Build and run the project from your IDE

### 🏗️ Building from Source

```bash
# Compile the Java sources
javac -cp "path/to/javafx/lib/*" src/*.java

# Create executable JAR
jar cfm SRepresentor.jar manifest.txt -C src/ .

# Run the application
java -cp "path/to/javafx/lib/*" -jar SRepresentor.jar
```

### 📝 Code Contribution Guidelines

- Follow Java naming conventions
- Include JavaDoc comments for public methods
- Maintain consistent code formatting
- Test thoroughly before submitting pull requests
- Update documentation for new features

---

## 🤝 Contributing

We welcome contributions to make SRepresentor even better! Here's how you can help:

### 🐛 Reporting Issues

- Use the [GitHub Issues](https://github.com/username/srepresentor/issues) page to report bugs
- Include detailed steps to reproduce the issue
- Mention your operating system and Java version
- Attach screenshots if applicable

### 💡 Feature Requests

- Suggest new educational features
- Propose UI/UX improvements
- Request additional customization options
- Share ideas for better learning experiences

### 🔧 Pull Requests

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Make your changes
4. Test thoroughly
5. Commit your changes (`git commit -m 'Add amazing feature'`)
6. Push to the branch (`git push origin feature/amazing-feature`)
7. Open a Pull Request

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## 🙏 Acknowledgments

- Educational consultants who provided valuable feedback
- Teachers who tested the application in their classrooms
- Students whose learning needs inspired this project
- JavaFX community for excellent documentation and support

---

## 📞 Contact & Support

Need help or have questions? We're here to assist you!

### 🆘 Getting Help

- **Technical Issues:** [Open an issue on GitHub](https://github.com/username/srepresentor/issues)
- **Educational Questions:** Contact us via WhatsApp or Facebook
- **Feature Requests:** [Submit via GitHub Issues](https://github.com/username/srepresentor/issues)
- **General Inquiries:** Email us directly

### 📱 Connect With Us

[![WhatsApp](https://img.shields.io/badge/WhatsApp-Support-25D366?style=for-the-badge&logo=whatsapp)](https://wa.me/1234567890)
[![Facebook](https://img.shields.io/badge/Facebook-Page-1877F2?style=for-the-badge&logo=facebook)](https://facebook.com/srepresentor)
[![GitHub](https://img.shields.io/badge/GitHub-Repository-181717?style=for-the-badge&logo=github)](https://github.com/username/srepresentor)
[![Email](https://img.shields.io/badge/Email-Support-D14836?style=for-the-badge&logo=gmail)](mailto:support@srepresentor.com)

---

<div align="center">

**Made with ❤️ for mathematics education**

© 2024 SRepresentor - Empowering students through visual learning

</div>
