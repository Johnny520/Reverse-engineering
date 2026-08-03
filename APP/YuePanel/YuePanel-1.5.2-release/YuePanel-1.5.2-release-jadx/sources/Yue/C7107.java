package Yue;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: Yue.ۥۡۦۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7107 {

    /* JADX INFO: renamed from: Yue.ۥۡۦۥ۟$ۥ */
    public static class ThreadFactoryC1168 implements ThreadFactory {

        /* JADX INFO: renamed from: ۥ */
        public String f2687;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f2688;

        /* JADX INFO: renamed from: Yue.ۥۡۦۥ۟$ۥ$ۥ, reason: contains not printable characters */
        public static class C7108 extends Thread {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final int f21460;

            public C7108(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.f21460 = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f21460);
                super.run();
            }
        }

        public ThreadFactoryC1168(@InterfaceC6391 String str, int i) {
            this.f2687 = str;
            this.f2688 = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C7108(runnable, this.f2687, this.f2688);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۥ۟$ۥ۟ */
    public static class ExecutorC1169 implements Executor {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final Handler f21461;

        public ExecutorC1169(@InterfaceC6391 Handler handler) {
            this.f21461 = (Handler) C6740.m21415(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@InterfaceC6391 Runnable runnable) {
            if (this.f21461.post((Runnable) C6740.m21415(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f21461 + " is shutting down");
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۥ۟$ۥ۟۟, reason: contains not printable characters */
    public static class RunnableC7109<T> implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6391
        public Callable<T> f21462;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @InterfaceC6391
        public InterfaceC4144<T> f21463;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        @InterfaceC6391
        public Handler f21464;

        /* JADX INFO: renamed from: Yue.ۥۡۦۥ۟$ۥ۟۟$ۥ */
        public class RunnableC1170 implements Runnable {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC4144 f21465;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ Object f21466;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public RunnableC1170(InterfaceC4144 interfaceC4144, Object obj) {
                this.f21465 = interfaceC4144;
                this.f21466 = obj;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Yue.ۥ۟ۧ۠ۧ */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f21465.accept(this.f21466);
            }
        }

        public RunnableC7109(@InterfaceC6391 Handler handler, @InterfaceC6391 Callable<T> callable, @InterfaceC6391 InterfaceC4144<T> interfaceC4144) {
            this.f21462 = callable;
            this.f21463 = interfaceC4144;
            this.f21464 = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T tCall;
            try {
                tCall = this.f21462.call();
            } catch (Exception unused) {
                tCall = null;
            }
            this.f21464.post(new RunnableC1170(this.f21463, tCall));
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static ThreadPoolExecutor m3399(@InterfaceC6391 String str, int i, @InterfaceC5459(from = 0) int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC1168(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static Executor m3400(@InterfaceC6391 Handler handler) {
        return new ExecutorC1169(handler);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static <T> void m22224(@InterfaceC6391 Executor executor, @InterfaceC6391 Callable<T> callable, @InterfaceC6391 InterfaceC4144<T> interfaceC4144) {
        executor.execute(new RunnableC7109(C3655.m726(), callable, interfaceC4144));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static <T> T m22225(@InterfaceC6391 ExecutorService executorService, @InterfaceC6391 Callable<T> callable, @InterfaceC5459(from = 0) int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
