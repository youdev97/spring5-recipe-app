package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.domain.Category;

public interface CategoryRecipe extends CrudRepository<Category, Long>{

}
