package foo

import grails.persistence.*

@Entity
class Book {
	String title

	static hasMany = [authors: Author]
	static belongsTo = Author

    static constraints = {
    }
}
