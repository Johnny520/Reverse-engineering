package p031c4;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: c4.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1317c {

    /* JADX INFO: renamed from: c4.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static Handler m5299a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Thread m5296a(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }

    /* JADX INFO: renamed from: b */
    public static ThreadPoolExecutor m5297b(final String str) {
        ThreadFactory threadFactory = new ThreadFactory() { // from class: c4.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return AbstractC1317c.m5296a(str, runnable);
            }
        };
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: c */
    public static Handler m5298c() {
        return Build.VERSION.SDK_INT >= 28 ? a.m5299a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper());
    }
}
