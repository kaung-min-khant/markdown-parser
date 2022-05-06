tests: MarkdownParse.class MarkdownParseTest.class
	java -cp .:./lib/* org.junit.runner.JUnitCore MarkdownParseTest

MarkdownParse.class: MarkdownParse.class
	java -cp .:./lib/* MarkdownParse.java

MarkdownParseTest.class: MarkdownParseTest.class
	java -cp .:./lib/* MarkdownParseTest.java
