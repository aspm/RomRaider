package enginuity.logger.innovate.plugin;

import enginuity.logger.ecu.external.ExternalDataItem;
import enginuity.logger.ecu.external.ExternalDataSource;
import enginuity.logger.innovate.io.InnovateConnectionProperties;

import static java.util.Arrays.asList;
import java.util.List;

public final class Lc1DataSource implements ExternalDataSource {

    public String getName() {
        return "Innovate LC-1 Datasource";
    }

    public String getVersion() {
        return "0.01";
    }

    public List<ExternalDataItem> getDataItems() {
        Lc1Connection connection = new Lc1Connection(new InnovateConnectionProperties(), "COM6");
        InnovateController controller = new InnovateControllerImpl(connection);
        return asList(controller.getDataItem());
    }

    public void setCommPortChoice(String commPort) {
    }

    public void connect() {
    }

    public void disconnect() {
    }

    public void startLogging() {
    }

    public void stopLogging() {
    }
}
