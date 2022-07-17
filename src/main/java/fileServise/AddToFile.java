package fileServise;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import dto.Expense;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Paths;
import java.util.List;

public class AddToFile {

    /**
     *
     * @param expense
     * @param filename
     */

    public void writeToFile(List<Expense> expense, String filename) {
// метод принимает list, который записывает в файл, путь к которому указан в строке filename

        ObjectMapper mapper = JsonMapper.builder()
                .addModule(new JavaTimeModule())
                .build();
        try {

            mapper.writeValue(Paths.get(filename).toFile(), expense);

            System.out.println("Данные успешно записаны");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}



