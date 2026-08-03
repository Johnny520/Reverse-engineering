package p001;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: ۟.h1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0234h1 extends AbstractC0342ob {

    /* JADX INFO: renamed from: ۥ */
    public final Object f820 = new Object();

    /* JADX INFO: renamed from: ۥ۟ */
    public final ExecutorService f821 = Executors.newFixedThreadPool(4, new a());

    /* JADX INFO: renamed from: ۟.h1$a */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: ۥ */
        public final AtomicInteger f822 = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f822.getAndIncrement())));
            return thread;
        }
    }
}
