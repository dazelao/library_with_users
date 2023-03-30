package libraryprj.dao;

import libraryprj.models.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component

public class PeopleDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PeopleDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<People> index() {
        return jdbcTemplate.query("SELECT * FROM People", new BeanPropertyRowMapper<>(People.class));
    }

    public People show(int id) {
        return jdbcTemplate.query("SELECT * FROM Person WHERE id=?",
                        new Object[]{id},
                        new BeanPropertyRowMapper<>(People.class))
                .stream().findAny().orElse(null);
    }
//    public Optional<People> show(String email){
//        return jdbcTemplate.query("SELECT * FROM Person WHERE email=?",
//                        new Object[]{email},
//                        new BeanPropertyRowMapper<>(People.class))
//                .stream().findAny();
//    }

    public void save(People people) {
        jdbcTemplate.update("INSERT INTO People(full_name, birth_year VALUES(?, ?)",
                people.getFullName(),
                people.getBirthYear()
        );
    }

    public void update(int id, People updatedPeople) {
        jdbcTemplate.update("UPDATE People SET full_name=?, birth_year=? WHERE id=?", updatedPeople.getFullName(),
                updatedPeople.getBirthYear(), id);
    }

    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM People WHERE id=?", id);
    }
}

