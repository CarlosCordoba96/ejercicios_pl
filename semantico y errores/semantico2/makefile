all: java
	javac *.java

java:
	jflex *.flex
	cup -dump *.cup

clean:
	$(RM) *.class
	$(RM) parser.java sym.java
	$(RM) *~
