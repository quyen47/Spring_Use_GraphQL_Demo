# graphql-java-spring-boot-example
 Java version: 18
 DB: Postgre or h2

# link test graphql
	http://localhost:8080/graphiql
	
# link graphql schema
	http://localhost:8080/graphql/schema.json
	
# Query example
1. For author
	
	query {
	  findAllAuthors { id firstName lastName}
	}
	
	query {
	  countBooks
	}
	
	mutation {
		newAuthor (firstName: "Nguyen" , lastName: "Ngoc" ) { id }
	}
2. For book

	query {
	  findAllBooks { id title pageCount}
	}
	
	query {
	  findOneBook(id: 2){ id title}
	}
	
	query {
	  findByAuthor(id: 1) { id title}
	}
	
	query {
	  countBooks
	}
	
	mutation {
	  newBook(title: "New book" , isbn: "1234" , pageCount: 50 , author: 1) { id }
	}
	
	mutation {
	  updateBookPageCount (id: 5 , pageCount: 15) {id }
	}
	
	mutation {
	  deleteBook (id: 5)
	}