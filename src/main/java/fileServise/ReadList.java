package fileServise;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import dto.Expense;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ReadList {

    /**
     *
     * @param filename
     * @return
     */


    public List<Expense> readFromFile(String filename) {

        //метод читает list из файла и возвращает его для дальнейшей работы

        ObjectMapper mapper = JsonMapper.builder().addModule(new JavaTimeModule()).build();

        try {
            List<Expense> list = mapper.readValue(new FileReader(filename), new TypeReference<List<Expense>>() {
            });

            return list;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }

}
