package ru.themascc.repositories;

import ru.themascc.pojo.Book;
import ru.themascc.pojo.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BooksRepository extends JpaRepository<Book, Integer> {
    List<Book> findByReader(Person reader);

    List<Book> findByTitleStartingWithIgnoreCase(String startString);
}
