package guru.springframework.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service
public class DataSourceServiceUatImp implements DataSourceService {
    @Override
    public String getDataSource() {
        return "DataSource : User Acceptance Testing";
    }
}
