target: MarkdownParse.class MarkdownParseTest.class

MarkdownParse.class: MarkdownParse.class
	javac MarkdownParse.java
	
MarkdownParseTest.class: MarkdownParseTest.class
	javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java

