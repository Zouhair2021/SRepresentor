<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>SRepresentor - Symbolic Representation Tool</title>
</head>
<body>
  <h1>SRepresentor - Symbolic Representation Tool</h1>

  <p>This Java Swing application allows users to draw simple shapes or symbols on a canvas and see the corresponding symbolic or mathematical representation in real-time.</p>

  <h2>Features</h2>
  <ul>
    <li><strong>Drawing Panel (<code>PanelDess1</code>)</strong><br>
      Draw freely on a custom panel using the mouse. Your strokes are recorded as a collection of paths for later processing.</li>
    <li><strong>Result Display Panel (<code>PanelResult</code>)</strong><br>
      Shows the symbolic or interpreted representation of what was drawn.</li>
    <li><strong>Symbolic Interpreter (<code>SRepresentor</code>)</strong><br>
      A central frame that integrates the drawing and result panels. It handles:
      <ul>
        <li>Layout of the user interface</li>
        <li>Button controls for generating, clearing, and other actions</li>
        <li>Managing the drawing and interpretation flow</li>
      </ul>
    </li>
  </ul>

  <h2>How It Works</h2>
  <ol>
    <li>The user draws a symbol or figure in the <code>PanelDess1</code> panel.</li>
    <li>Upon pressing a button (e.g., "Generate"), the program analyzes the strokes.</li>
    <li>The symbolic result is displayed in <code>PanelResult</code>.</li>
  </ol>

  <h2>Requirements</h2>
  <ul>
    <li>Java 8 or above</li>
    <li>No external libraries required (pure Swing-based GUI)</li>
  </ul>

  <h2>How to Run</h2>
  <ol>
    <li>Compile the Java files:
      <pre><code>javac SRepresentor.java PanelDess1.java PanelResult.java</code></pre>
    </li>
    <li>Run the main class:
      <pre><code>java SRepresentor</code></pre>
    </li>
  </ol>

  <h2>Project Structure</h2>
  <pre>
.
├── SRepresentor.java   // Main application frame
├── PanelDess1.java     // Drawing canvas panel
├── PanelResult.java    // Result display panel
└── README.html         // Project documentation
  </pre>

  <h2>License</h2>
  <p>This project is open source and free to use for learning and educational purposes.</p>
</body>
</html>
