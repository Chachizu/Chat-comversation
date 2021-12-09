package dev.example.devop.booktestdevop;


import java.util.List;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BookService {

	RestTemplate template = new RestTemplate();

	public Iterable<Book> findAll() {

		System.out.println("Service");
		ResponseEntity<List<Book>> response = template.exchange("https://serverapidevops.herokuapp.com/webapi/allBooks", HttpMethod.GET,
				null, new ParameterizedTypeReference<List<Book>>() {
				});

		List<Book> books = response.getBody();
		System.out.println("Service library:" + books);
		return books;
	}

	public void insertBook(Book book) {

		HttpEntity<Book> request = new HttpEntity<>(book);
		template.postForObject("https://serverapidevops.herokuapp.com/webapi/addBook", request, Book.class);
	}

	public void deleteBook(Book book) {

		template.delete("https://serverapidevops.herokuapp.com/webapi/deleteBook/" + book.getTitle());
	}

}