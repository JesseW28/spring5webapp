package jesse.udemycourse.spring5webapp.bootstrap;

import jesse.udemycourse.spring5webapp.domain.Author;
import jesse.udemycourse.spring5webapp.domain.Book;
import jesse.udemycourse.spring5webapp.domain.Publisher;
import jesse.udemycourse.spring5webapp.repositories.AuthorRepository;
import jesse.udemycourse.spring5webapp.repositories.BookRepository;
import jesse.udemycourse.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class InitData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public InitData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher publisher1 = new Publisher("Book Publisher Inc", "Eikenweg 53", "Rotterdam", "Zuid-Holland", "3743SD");

        Author author1 = new Author("J.R.R.", "Tolkiens");
        Book book1 = new Book("Lord of the Rings: Fellowship of the Ring", "1234");
        publisherRepository.save(publisher1);

        author1.getBooks().add(book1);
        book1.getAuthors().add(author1);
        book1.setPublisher(publisher1);

        authorRepository.save(author1);
        bookRepository.save(book1);

        Author author2 = new Author("Rod", "Johnson");
        Book book2 = new Book("J2EE Development without EJB", "837474");
        author2.getBooks().add(book2);
        book2.getAuthors().add(author2);
        book2.setPublisher(publisher1);

        publisher1.getBooks().addAll(Arrays.asList(book1, book2));

        authorRepository.save(author2);
        bookRepository.save(book2);
        publisherRepository.save(publisher1);

        System.out.println("Data initialized");
        System.out.println("Number of authors: " + authorRepository.count());
        System.out.println("Number of books: " + bookRepository.count());
        System.out.println("Number of publishers: " + publisherRepository.count());
        System.out.println("Publisher number of books:" + publisher1.getBooks().size());

    }
}
