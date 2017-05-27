//import com.mongodb.async.client.MongoDatabase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import service.Service;
import util.Logger;
import util.TestInterface;

import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.verifyStatic;


@RunWith(PowerMockRunner.class)
@PrepareForTest({Logger.class})
public class ServiceTest {

    @Test
    public void serviceMethodTest() {

        //test mocking static method
        //MongoDatabase mongoDatabase = Mockito.mock(MongoDatabase.class);
         TestInterface testInterface = Mockito.mock(TestInterface.class);
         Mockito.when(testInterface.abstractMethod()).thenReturn("");
         Service service = new Service();

         mockStatic(Logger.class);
         Mockito.when(Logger.log(Mockito.anyString())).thenReturn("Mocked Log");

         //verify static method call
        service.serviceMethod();

         verifyStatic();
         Logger.logExtra("100");

        Assert.assertEquals(service.serviceMethod(), "Mocked Log");
    }
}
//           // Mockito.doNothing().when(iterable).first(Mockito.any(SingleResultCallback.class));
