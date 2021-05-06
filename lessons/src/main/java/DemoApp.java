import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoApp {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<?> future = executorService.submit(() -> System.out.println(Thread.currentThread().getName()));
        Future<String> futureString = executorService.submit(() -> Thread.currentThread().getName());

        System.out.println(futureString.get());



        ///
        executorService.shutdown();
    }
}
