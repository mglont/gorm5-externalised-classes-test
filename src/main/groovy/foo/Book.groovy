package foo

class Book {
	String title

	static hasMany = [authors: Author]
	static belongsTo = Author

    static constraints = {
    }
}
