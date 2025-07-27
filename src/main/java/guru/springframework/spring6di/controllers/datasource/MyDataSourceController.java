package guru.springframework.spring6di.controllers.datasource;

import guru.springframework.spring6di.services.datasource.DataSourceService;
import org.springframework.stereotype.Controller;

@Controller
public class MyDataSourceController {

    private final DataSourceService dataSourceService;

    public MyDataSourceController(DataSourceService dataSourceService) {
        this.dataSourceService = dataSourceService;
    }

    public String getDataSource() {
        return dataSourceService.getDataSource();
    }

}
