//import com.mongodb.async.client.MongoDatabase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import service.Service;
import util.Logger;


@RunWith(PowerMockRunner.class)
@PrepareForTest({Logger.class})

public class ServiceTest {


    @Test
    public void serviceMethodTest() {

        //test mocking static method
        //MongoDatabase mongoDatabase = Mockito.mock(MongoDatabase.class);


//        TestInterface testInterface = Mockito.mock(TestInterface.class);
//        Mockito.when(testInterface.abstractMethod()).thenReturn("");


        Service service = new Service();

//        PowerMockito.mockStatic(Logger.class);
//        Mockito.when(Logger.log(Mockito.anyString())).thenReturn("Mocked Log");


        Assert.assertEquals(service.serviceMethod(), "aa");
    }


}