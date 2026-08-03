package p000a;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: a.R4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0312R4 extends AbstractC0472a2 {

    /* JADX INFO: renamed from: a */
    public final Object f1117a = new Object();

    /* JADX INFO: renamed from: a.R4$a */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f1118a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f1118a.getAndIncrement());
            return thread;
        }
    }

    public C0312R4() {
        Executors.newFixedThreadPool(4, new a());
    }
}
