package guru.springframework.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class DataSourceServiceProdImpl implements DataSourceService {
    @Override
    public String getDataSource() {
        return "DataSource : Production";
    }
}
