Android-File-Extension-ANE
==========================
Native Extension for Adobe AIR

Features:

	- open local file in native application. Can open any file type.
	
Important! Be shure, that you are using latest version of AIR SDK. This ANE builded for 4.0
	
How to use:

Connect com.illuzor.extensions.FileExtension.ane file to your android air project.
Import com.illuzor.fileextension.FileExtension;

Add permissions to your application:

	<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
	<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />

Using example:
	
	// create and write simple text file
	var textString:String = "This is sample text file";
	var file:File = File.documentsDirectory.resolvePath("OpenFileTest.txt");
	var stream:FileStream = new FileStream();
	stream.open(file, FileMode.WRITE);
	stream.writeUTFBytes(textString);
	stream.close();

	FileExtension.openFile(file); // open created text file in native application.
	
![open_file_demo.jpg](http://download.illuzor.com/images/github/ane/open_file_demo.jpg)
	
If you don`t need extension after use, dispose it:

	FileExtension.dispose();
	
Demo app - http://yadi.sk/d/Se_LR8fm1lgsD

![demoAppQR.gif](http://download.illuzor.com/images/github/ane/demoAppQR.gif)