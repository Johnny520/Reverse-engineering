package Yue;

import Yue.InterfaceC7144;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C4358 extends AbstractC7728 {

    /* JADX INFO: renamed from: ۥ */
    public final Object f833 = new Object();

    /* JADX INFO: renamed from: ۥ۟ */
    public final ExecutorService f834 = Executors.newFixedThreadPool(4, new ThreadFactoryC0383());

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6490
    public volatile Handler f8928;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۨۧ$ۥ */
    public class ThreadFactoryC0383 implements ThreadFactory {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final String f8929 = "arch_disk_io_";

        /* JADX INFO: renamed from: ۥ */
        public final AtomicInteger f835 = new AtomicInteger(0);

        public ThreadFactoryC0383() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(f8929 + this.f835.getAndIncrement());
            return thread;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۨۧ$ۥ۟ */
    @InterfaceC7113(28)
    public static class C0384 {
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public static Handler m1316(@InterfaceC6391 Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Handler m12607(@InterfaceC6391 Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0384.m1316(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // Yue.AbstractC7728
    /* JADX INFO: renamed from: ۥ */
    public void mo461(@InterfaceC6391 Runnable runnable) {
        this.f834.execute(runnable);
    }

    @Override // Yue.AbstractC7728
    /* JADX INFO: renamed from: ۥ۟۟ */
    public boolean mo6929() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // Yue.AbstractC7728
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo6930(@InterfaceC6391 Runnable runnable) {
        if (this.f8928 == null) {
            synchronized (this.f833) {
                try {
                    if (this.f8928 == null) {
                        this.f8928 = m12607(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.f8928.post(runnable);
    }
}
