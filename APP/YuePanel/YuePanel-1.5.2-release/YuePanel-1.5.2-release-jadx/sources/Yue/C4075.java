package Yue;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4075 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f649 = 15;

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۥۥ$ۥ */
    @InterfaceC7113(28)
    public static class C0318 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Handler m1029(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    @InterfaceC6391
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟ */
    public static Executor m1028(@InterfaceC6391 final Handler handler) {
        Objects.requireNonNull(handler);
        return new Executor() { // from class: Yue.ۥ۟ۦۥۢ
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static ThreadPoolExecutor m11507(@InterfaceC6391 final String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: Yue.ۥ۟ۦۥۣ
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return C4075.m11508(str, runnable);
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ Thread m11508(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Handler m11509() {
        return Build.VERSION.SDK_INT >= 28 ? C0318.m1029(Looper.getMainLooper()) : new Handler(Looper.getMainLooper());
    }
}
