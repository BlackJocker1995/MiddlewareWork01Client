# MiddlewareWork01Client
# How to use it?

public void CreateTable(String table_name);// Crate table named "table_name"

public void Insert(String name,int score);// insert one element

public int Search(String name);// search the score from table

DataService ds = (DataService) Naming.lookup("//localhost:xxxx/ds");//load the class xxxx is port you have set.
