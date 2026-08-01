package p088g;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: g.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C2445d extends AbstractC2446e {

    /* JADX INFO: renamed from: a */
    public final Object f6620a = new Object();

    /* JADX INFO: renamed from: b */
    public final ExecutorService f6621b = Executors.newFixedThreadPool(4, new a());

    /* JADX INFO: renamed from: c */
    public volatile Handler f6622c;

    /* JADX INFO: renamed from: g.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f6623a = new AtomicInteger(0);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f6623a.getAndIncrement());
            return thread;
        }
    }

    /* JADX INFO: renamed from: g.d$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static Handler m8863a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* JADX INFO: renamed from: d */
    public static Handler m8862d(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.m8863a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // p088g.AbstractC2446e
    /* JADX INFO: renamed from: a */
    public void mo8859a(Runnable runnable) {
        this.f6621b.execute(runnable);
    }

    @Override // p088g.AbstractC2446e
    /* JADX INFO: renamed from: b */
    public boolean mo8860b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // p088g.AbstractC2446e
    /* JADX INFO: renamed from: c */
    public void mo8861c(Runnable runnable) {
        if (this.f6622c == null) {
            synchronized (this.f6620a) {
                try {
                    if (this.f6622c == null) {
                        this.f6622c = m8862d(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.f6622c.post(runnable);
    }
}
