package guru.springframework.spring6di.controllers.datasource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles({"uat", "EN"})
@SpringBootTest
class MyDataSourceControllerTest {

    @Autowired
    private MyDataSourceController myDataSourceController;

    @Test
    void getDataSource() {
        System.out.println(myDataSourceController.getDataSource());
    }
}