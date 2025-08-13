<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SRepresentor - README</title>
    <style>
        body {
            font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Helvetica, Arial, sans-serif;
            line-height: 1.6;
            color: #24292f;
            max-width: 1200px;
            margin: 0 auto;
            padding: 2rem;
            background: #fff;
        }

        h1 {
            border-bottom: 1px solid #d1d9e0;
            padding-bottom: 0.3rem;
            font-size: 2rem;
            margin-bottom: 1rem;
        }

        h2 {
            border-bottom: 1px solid #d1d9e0;
            padding-bottom: 0.3rem;
            margin-top: 2rem;
            margin-bottom: 1rem;
            font-size: 1.5rem;
        }

        h3 {
            margin-top: 1.5rem;
            margin-bottom: 0.5rem;
            font-size: 1.25rem;
        }

        .header-section {
            text-align: center;
            margin-bottom: 3rem;
            padding: 2rem;
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            border-radius: 10px;
            color: white;
        }

        .header-section h1 {
            border: none;
            color: white;
            margin-bottom: 0.5rem;
        }

        .badges {
            display: flex;
            gap: 0.5rem;
            justify-content: center;
            flex-wrap: wrap;
            margin: 1rem 0;
        }

        .badge {
            background: #0969da;
            color: white;
            padding: 0.2rem 0.6rem;
            border-radius: 6px;
            font-size: 0.875rem;
            text-decoration: none;
            display: inline-block;
        }

        .badge.green {
            background: #1a7f37;
        }

        .badge.orange {
            background: #fb8500;
        }

        .badge.purple {
            background: #8250df;
        }

        pre {
            background: #f6f8fa;
            border: 1px solid #d1d9e0;
            border-radius: 6px;
            padding: 1rem;
            overflow-x: auto;
            font-size: 0.875rem;
        }

        code {
            background: #f6f8fa;
            padding: 0.2rem 0.4rem;
            border-radius: 3px;
            font-size: 0.875rem;
            font-family: ui-monospace, SFMono-Regular, 'SF Mono', Consolas, 'Liberation Mono', Menlo, monospace;
        }

        .feature-grid {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
            gap: 1.5rem;
            margin: 1.5rem 0;
        }

        .feature-item {
            background: #f6f8fa;
            padding: 1.5rem;
            border-radius: 8px;
            border-left: 4px solid #0969da;
        }

        .feature-item h4 {
            margin: 0 0 0.5rem 0;
            color: #0969da;
            display: flex;
            align-items: center;
            gap: 0.5rem;
        }

        .screenshot {
            text-align: center;
            margin: 2rem 0;
            padding: 1rem;
            background: #f6f8fa;
            border-radius: 8px;
            border: 2px dashed #d1d9e0;
        }

        .tech-stack {
            display: flex;
            gap: 1rem;
            flex-wrap: wrap;
            margin: 1rem 0;
        }

        .tech-item {
            background: #fff;
            border: 1px solid #d1d9e0;
            padding: 0.5rem 1rem;
            border-radius: 6px;
            display: flex;
            align-items: center;
            gap: 0.5rem;
        }

        .requirements {
            background: #fff3cd;
            border: 1px solid #ffecb5;
            border-radius: 6px;
            padding: 1rem;
            margin: 1rem 0;
        }

        .installation-steps {
            background: #d1ecf1;
            border: 1px solid #bee5eb;
            border-radius: 6px;
            padding: 1rem;
            margin: 1rem 0;
        }

        .download-section {
            background: linear-gradient(135deg, #28a745 0%, #20c997 100%);
            color: white;
            padding: 2rem;
            border-radius: 8px;
            text-align: center;
            margin: 2rem 0;
        }

        .download-btn {
            background: rgba(255, 255, 255, 0.2);
            color: white;
            padding: 0.75rem 1.5rem;
            border: 2px solid white;
            border-radius: 6px;
            text-decoration: none;
            display: inline-block;
            margin: 0.5rem;
            transition: all 0.3s ease;
        }

        .download-btn:hover {
            background: white;
            color: #28a745;
        }

        table {
            border-collapse: collapse;
            width: 100%;
            margin: 1rem 0;
        }

        th, td {
            border: 1px solid #d1d9e0;
            padding: 0.75rem;
            text-align: left;
        }

        th {
            background: #f6f8fa;
            font-weight: 600;
        }

        .contact-section {
            background: #f6f8fa;
            padding: 2rem;
            border-radius: 8px;
            margin: 2rem 0;
        }

        .contact-links {
            display: flex;
            gap: 1rem;
            flex-wrap: wrap;
            margin-top: 1rem;
        }

        .contact-link {
            display: flex;
            align-items: center;
            gap: 0.5rem;
            padding: 0.5rem 1rem;
            background: white;
            border: 1px solid #d1d9e0;
            border-radius: 6px;
            text-decoration: none;
            color: #24292f;
            transition: all 0.3s ease;
        }

        .contact-link:hover {
            background: #0969da;
            color: white;
            border-color: #0969da;
        }

        ul, ol {
            margin: 1rem 0;
            padding-left: 2rem;
        }

        li {
            margin: 0.5rem 0;
        }
    </style>
</head>
<body>
    <div class="header-section">
        <h1>🧮 SRepresentor</h1>
        <p><strong>Educational Application for Visual Learning of Subtraction</strong></p>
        <p>An interactive JavaFX application that helps students understand subtraction through visual representation using colored blocks</p>
        
        <div class="badges">
            <span class="badge">JavaFX</span>
            <span class="badge green">Educational</span>
            <span class="badge orange">Math Learning</span>
            <span class="badge purple">Visual Learning</span>
            <span class="badge">Windows</span>
        </div>
    </div>

    <div class="screenshot">
        <h3>📸 Application Preview</h3>
        <p><em>Screenshot of SRepresentor in action would go here</em></p>
        <p style="color: #666; font-style: italic;">Visual representation of numbers using colored blocks for subtraction learning</p>
    </div>

    <h2>📋 Table of Contents</h2>
    <ul>
        <li><a href="#overview">Overview</a></li>
        <li><a href="#features">Features</a></li>
        <li><a href="#installation">Installation</a></li>
        <li><a href="#usage">How to Use</a></li>
        <li><a href="#technical">Technical Details</a></li>
        <li><a href="#development">Development</a></li>
        <li><a href="#contributing">Contributing</a></li>
        <li><a href="#contact">Contact</a></li>
    </ul>

    <h2 id="overview">🎯 Overview</h2>
    <p>SRepresentor is an educational application designed to help students learn subtraction through visual representation. The application uses colored blocks to represent numbers in a place-value system (units, tens, hundreds), making abstract mathematical concepts concrete and understandable.</p>

    <h3>🎓 Educational Benefits</h3>
    <ul>
        <li><strong>Visual Learning:</strong> Students can see the mathematical process happening</li>
        <li><strong>Step-by-step Process:</strong> Breaks down complex subtraction into manageable steps</li>
        <li><strong>Interactive Experience:</strong> Students actively participate in the learning process</li>
        <li><strong>Immediate Feedback:</strong> Visual results help students understand their work</li>
        <li><strong>Borrowing Visualization:</strong> Makes the borrowing process clear and understandable</li>
    </ul>

    <h2 id="features">✨ Features</h2>

    <div class="feature-grid">
        <div class="feature-item">
            <h4>🧮 Visual Number Representation</h4>
            <p>Numbers are displayed using colored blocks representing units, tens, and hundreds for intuitive understanding of place value.</p>
        </div>

        <div class="feature-item">
            <h4>👆 Step-by-Step Learning</h4>
            <p>Navigate through subtraction steps using "Next" and "Previous" buttons to understand each manipulation thoroughly.</p>
        </div>

        <div class="feature-item">
            <h4>🎨 Customizable Interface</h4>
            <p>Choose from 9 different block colors and customize background colors to match learning preferences.</p>
        </div>

        <div class="feature-item">
            <h4>🔄 Automatic Borrowing</h4>
            <p>Automatically handles and visualizes the borrowing process during complex subtraction operations.</p>
        </div>

        <div class="feature-item">
            <h4>💾 Persistent Preferences</h4>
            <p>User preferences for colors and settings are automatically saved and restored between sessions.</p>
        </div>

        <div class="feature-item">
            <h4>⚡ Smooth Animations</h4>
            <p>Engaging animations and transitions make the learning experience more enjoyable and memorable.</p>
        </div>
    </div>

    <h3>🎨 Available Block Colors</h3>
    <p>The application supports 9 different color schemes for the blocks:</p>
    <ul>
        <li>🖤 Black</li>
        <li>🔵 Blue (default)</li>
        <li>🟢 Green</li>
        <li>🟠 Orange</li>
        <li>🩷 Pink</li>
        <li>🟣 Purple</li>
        <li>🔴 Red</li>
        <li>⚪ White</li>
        <li>🟡 Yellow</li>
    </ul>

    <h2 id="installation">📦 Installation</h2>

    <div class="download-section">
        <h3>🚀 Quick Download</h3>
        <p>Get SRepresentor up and running in minutes!</p>
        <a href="#" class="download-btn">📥 Download Windows EXE</a>
        <a href="#" class="download-btn">📁 View Source Code</a>
    </div>

    <div class="requirements">
        <h3>⚠️ System Requirements</h3>
        <ul>
            <li><strong>Operating System:</strong> Windows 7, 8, 10, or 11</li>
            <li><strong>Memory:</strong> 512 MB RAM minimum</li>
            <li><strong>Storage:</strong> 50 MB free disk space</li>
            <li><strong>Display:</strong> 1024x768 minimum screen resolution</li>
        </ul>
    </div>

    <div class="installation-steps">
        <h3>🔧 Installation Steps</h3>
        <ol>
            <li>Download the <code>SRepresentor.exe</code> file from the releases section</li>
            <li>Double-click the downloaded file to run the installer</li>
            <li>Follow the installation wizard prompts</li>
            <li>Launch SRepresentor from the Start Menu or desktop shortcut</li>
            <li>Enjoy learning subtraction visually!</li>
        </ol>
    </div>

    <h2 id="usage">📚 How to Use</h2>

    <h3>🚀 Getting Started</h3>
    <ol>
        <li><strong>Enter First Number:</strong> Type a number between 1-999 in the "Number 1" field and press Enter</li>
        <li><strong>Enter Second Number:</strong> Type a smaller number in the "Number 2" field and press Enter</li>
        <li><strong>Start Learning:</strong> Click "Next" to begin the step-by-step subtraction process</li>
        <li><strong>Navigate Steps:</strong> Use "Previous" and "Next" to review or advance through steps</li>
        <li><strong>Start Over:</strong> Click "New" to clear and begin with different numbers</li>
    </ol>

    <h3>🎯 Usage Rules</h3>
    <table>
        <tr>
            <th>Rule</th>
            <th>Description</th>
        </tr>
        <tr>
            <td>Number Range</td>
            <td>Numbers must be between 1 and 999</td>
        </tr>
        <tr>
            <td>Number Order</td>
            <td>First number must be greater than the second number</td>
        </tr>
        <tr>
            <td>Input Type</td>
            <td>Only whole numbers (integers) are accepted</td>
        </tr>
        <tr>
            <td>Borrowing</td>
            <td>Application automatically handles borrowing when needed</td>
        </tr>
    </table>

    <h3>🎨 Customization Options</h3>
    <p>Right-click anywhere in the application to access the customization menu:</p>
    <ul>
        <li><strong>Block Colors:</strong> Choose from 9 predefined color schemes</li>
        <li><strong>Background Color:</strong> Select a custom background color using the color picker</li>
        <li><strong>Preferences:</strong> All choices are automatically saved for future sessions</li>
    </ul>

    <h2 id="technical">🔧 Technical Details</h2>

    <h3>💻 Technology Stack</h3>
    <div class="tech-stack">
        <div class="tech-item">
            <span>☕</span>
            <span>Java 8+</span>
        </div>
        <div class="tech-item">
            <span>🎨</span>
            <span>JavaFX</span>
        </div>
        <div class="tech-item">
            <span>🏗️</span>
            <span>Scene Builder</span>
        </div>
        <div class="tech-item">
            <span>💾</span>
            <span>Java Preferences API</span>
        </div>
    </div>

    <h3>📁 Project Structure</h3>
    <pre><code>SRepresentor/
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
</code></pre>

    <h3>🎯 Key Classes</h3>
    <ul>
        <li><strong>SRepresenter:</strong> Main application class handling UI and logic</li>
        <li><strong>ColorPreferences:</strong> Manages user color preferences using Java Preferences API</li>
    </ul>

    <h2 id="development">👨‍💻 Development</h2>

    <h3>🛠️ Development Setup</h3>
    <ol>
        <li>Clone the repository:
            <pre><code>git clone https://github.com/username/srepresentor.git</code></pre>
        </li>
        <li>Open the project in your preferred Java IDE (IntelliJ IDEA, Eclipse, NetBeans)</li>
        <li>Ensure JavaFX is properly configured in your development environment</li>
        <li>Build and run the project from your IDE</li>
    </ol>

    <h3>🏗️ Building from Source</h3>
    <pre><code># Compile the Java sources
javac -cp "path/to/javafx/lib/*" src/*.java

# Create executable JAR
jar cfm SRepresentor.jar manifest.txt -C src/ .

# Run the application
java -cp "path/to/javafx/lib/*" -jar SRepresentor.jar
</code></pre>

    <h3>📝 Code Contribution Guidelines</h3>
    <ul>
        <li>Follow Java naming conventions</li>
        <li>Include JavaDoc comments for public methods</li>
        <li>Maintain consistent code formatting</li>
        <li>Test thoroughly before submitting pull requests</li>
        <li>Update documentation for new features</li>
    </ul>

    <h2 id="contributing">🤝 Contributing</h2>

    <p>We welcome contributions to make SRepresentor even better! Here's how you can help:</p>

    <h3>🐛 Reporting Issues</h3>
    <ul>
        <li>Use the GitHub Issues page to report bugs</li>
        <li>Include detailed steps to reproduce the issue</li>
        <li>Mention your operating system and Java version</li>
        <li>Attach screenshots if applicable</li>
    </ul>

    <h3>💡 Feature Requests</h3>
    <ul>
        <li>Suggest new educational features</li>
        <li>Propose UI/UX improvements</li>
        <li>Request additional customization options</li>
        <li>Share ideas for better learning experiences</li>
    </ul>

    <h3>🔧 Pull Requests</h3>
    <ol>
        <li>Fork the repository</li>
        <li>Create a feature branch</li>
        <li>Make your changes</li>
        <li>Test thoroughly</li>
        <li>Submit a pull request with detailed description</li>
    </ol>

    <h2>📄 License</h2>
    <p>This project is licensed under the MIT License - see the <a href="LICENSE">LICENSE</a> file for details.</p>

    <h2>🙏 Acknowledgments</h2>
    <ul>
        <li>Educational consultants who provided valuable feedback</li>
        <li>Teachers who tested the application in their classrooms</li>
        <li>Students whose learning needs inspired this project</li>
        <li>JavaFX community for excellent documentation and support</li>
    </ul>

    <div class="contact-section" id="contact">
        <h2>📞 Contact & Support</h2>
        <p>Need help or have questions? We're here to assist you!</p>
        
        <div class="contact-links">
            <a href="https://wa.me/1234567890" class="contact-link">
                <span>📱</span>
                <span>WhatsApp Support</span>
            </a>
            <a href="https://facebook.com/srepresentor" class="contact-link">
                <span>📘</span>
                <span>Facebook Page</span>
            </a>
            <a href="https://github.com/username/srepresentor" class="contact-link">
                <span>💻</span>
                <span>GitHub Repository</span>
            </a>
            <a href="mailto:support@srepresentor.com" class="contact-link">
                <span>📧</span>
                <span>Email Support</span>
            </a>
        </div>

        <h3>🆘 Getting Help</h3>
        <ul>
            <li><strong>Technical Issues:</strong> Open an issue on GitHub</li>
            <li><strong>Educational Questions:</strong> Contact us via WhatsApp or Facebook</li>
            <li><strong>Feature Requests:</strong> Submit via GitHub Issues</li>
            <li><strong>General Inquiries:</strong> Email us directly</li>
        </ul>
    </div>

    <hr style="margin: 3rem 0; border: none; border-top: 1px solid #d1d9e0;">
    
    <div style="text-align: center; color: #666; margin: 2rem 0;">
        <p>Made with ❤️ for mathematics education</p>
        <p>© 2024 SRepresentor - Empowering students through visual learning</p>
    </div>
</body>
</html>
