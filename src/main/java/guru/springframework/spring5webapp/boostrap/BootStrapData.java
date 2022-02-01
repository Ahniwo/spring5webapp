package guru.springframework.spring5webapp.boostrap;

import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final PublisherRepository publisherRepository;

    public BootStrapData(PublisherRepository publisherRepository){
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher toto = new Publisher("Toto","10 rue des tulipes","Totoland","oneState", 01000);

        publisherRepository.save(toto);

        System.out.println("Publisher count : " + publisherRepository.count());
    }
}
