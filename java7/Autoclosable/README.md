# Autoclosable

## Exercise

You are managing connections to a DB. Every time you wish to make a query, you have to close the connection after it.
What if an exception is thrown while making a query? How would you make sure the closing of the connection is still taken care of? What could be a proper solution?

## Source

**https://docs.oracle.com/javase/8/docs/api/java/lang/AutoCloseable.html**
**https://docs.oracle.com/javase/8/docs/api/java/io/Closeable.html**
**https://www.geeksforgeeks.org/closeable-interface-in-java/#:~:text=Closeable%20extends%20IOException%20whereas%20AutoCloseable,try%2Dwith%2Dresources%20statements.**
