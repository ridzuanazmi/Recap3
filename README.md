# Recap 3

Exploring ways of using Path and File class

## Path and Paths classes

A more comprehensive and platform-independent way of working with files and directories.
`Path` and `Paths` classes are part of the java.nio.file package.

### `Path` Class

- The Path class represents a file or directory path in a file system. It's an interface that provides methods to operate on the path components, such as retrieving file name, parent directory, or resolving one path against another.
- Path instances can represent absolute or relative paths, and they are immutable, meaning once created, the path represented by a Path object cannot be changed.
- You typically obtain Path instances using the Paths class.

### `Paths` Class

- The Paths class is a utility class that contains static factory methods for `creating` Path instances. You can use these methods to create Path objects representing files or directories.
- It provides methods for creating paths based on a string representation, URI, or by converting from other objects.
- Commonly used factory methods in Paths include get(String first, String... more) for creating a path from one or more string components, and get(URI uri) for creating a path from a URI.

## `File` and `Files` Classes

Both classes are used for file and directory operations, but they serve different purposes and have different capabilities. Let's look at each one:

### `File` Class

- It represents a file or directory path in the file system.
- It can be used to `create`, `delete`, `rename`, or `check` the existence of files and directories.
- It provides basic functionality for interacting with files and directories, such as creating new files or directories, deleting files or directories, and retrieving file information (e.g., file size, last modified time).

### `Files` Class

- Provides more `advanced` file and directory `operations` compared to the File class.
- Supports operations such as `copying`, `moving`, `reading/writing` file content, `checking` file attributes, and more.
- Offers methods that work with Path objects rather than File objects, making it more flexible and powerful for working with file paths.

## `InputStream` and `OutputStream` Classes

They are abstract classes that form the foundation for input and output operations, respectively. They are part of the java.io package and are used for `reading from` and `writing to` streams of bytes, such as files, network connections, or in-memory data.

### `InputStream` Class

- Subclasses of InputStream include `FileInputStream`, `ByteArrayInputStream`, `DataInputStream`, and others, each tailored for different input sources.
- Common methods provided by InputStream include:
  - `int read()`: Reads a single byte of data from the input stream and returns it as an integer value (0-255), or -1 if the end of the stream is reached.
  - `int read(byte[] b)`: Reads up to b.length bytes of data from the input stream into an array of bytes b.
  - `void close()`: Closes the input stream, releasing any system resources associated with it.

### `OutputStream` Class

- Subclasses of OutputStream include `FileOutputStream`, `ByteArrayOutputStream`, `DataOutputStream`, and others, each suited for different output destinations.
- Common methods provided by OutputStream include:
  - `void write(int b)`: Writes a single byte of data to the output stream.
  - `void write(byte[] b)`: Writes b.length bytes of data from the specified byte array to the output stream.
  - `void flush()`: Flushes the output stream, ensuring that any buffered data is written out.
  - `void close()`: Closes the output stream, releasing any system resources associated with it.

## `FileReader` and `BufferedReader` Classes

Both classes used for reading text from character-based input streams, particularly from files

### `FileReader` Class

- The FileReader class is used to `read character data from files`. It reads characters from a file in a simple and efficient manner.
- It extends the InputStreamReader class, which converts bytes into characters.
- FileReader is specifically tailored for reading character streams from files, making it convenient for text file processing.
- It's typically used in conjunction with BufferedReader for efficient reading of text files.

### `BufferedReader` Class

- The BufferedReader class reads text from a character-input stream, buffering characters so as to provide efficient reading of characters, arrays, and lines.
- It extends the Reader class and is often used to wrap other Reader objects, such as FileReader, to improve efficiency by reducing the number of reads made to the underlying stream.
- BufferedReader provides methods like readLine() for reading lines of text from the input stream and read() for reading individual characters.
- It provides buffering functionality, which means it r*eads data from the underlying input stream in chunks* and stores them in an internal buffer, improving the efficiency of reading operations.

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
