package Yue;

import Yue.InterfaceC7144;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: Yue.ۥۡۨ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
@Deprecated
public class C7294 {

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f21978 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f21979 = 0;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC5225("mLock")
    public HandlerThread f2788;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC5225("mLock")
    public Handler f21980;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int f21983;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final int f21984;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final String f21985;

    /* JADX INFO: renamed from: ۥ */
    public final Object f2787 = new Object();

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Handler.Callback f21982 = new C1225();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC5225("mLock")
    public int f21981 = 0;

    /* JADX INFO: renamed from: Yue.ۥۡۨ۟ۢ$ۥ */
    public class C1225 implements Handler.Callback {
        public C1225() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                C7294.this.m22788();
                return true;
            }
            if (i != 1) {
                return true;
            }
            C7294.this.m22789((Runnable) message.obj);
            return true;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۨ۟ۢ$ۥ۟ */
    public class RunnableC1226 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Callable f21986;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Handler f21987;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7297 f21988;

        /* JADX INFO: renamed from: Yue.ۥۡۨ۟ۢ$ۥ۟$ۥ, reason: contains not printable characters */
        public class RunnableC7295 implements Runnable {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ Object f21990;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public RunnableC7295(Object obj) {
                this.f21990 = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC1226.this.f21988.m3554(this.f21990);
            }
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public RunnableC1226(Callable callable, Handler handler, InterfaceC7297 interfaceC7297) {
            this.f21986 = callable;
            this.f21987 = handler;
            this.f21988 = interfaceC7297;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object objCall;
            try {
                objCall = this.f21986.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f21987.post(new RunnableC7295(objCall));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۨ۟ۢ$ۥ۟۟, reason: contains not printable characters */
    public class RunnableC7296 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ AtomicReference f21992;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Callable f21993;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ ReentrantLock f21994;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ AtomicBoolean f21995;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ Condition f21996;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public RunnableC7296(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f21992 = atomicReference;
            this.f21993 = callable;
            this.f21994 = reentrantLock;
            this.f21995 = atomicBoolean;
            this.f21996 = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f21992.set(this.f21993.call());
            } catch (Exception unused) {
            }
            this.f21994.lock();
            try {
                this.f21995.set(false);
                this.f21996.signal();
            } finally {
                this.f21994.unlock();
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۨ۟ۢ$ۥ۟۟۟, reason: contains not printable characters */
    public interface InterfaceC7297<T> {
        /* JADX INFO: renamed from: ۥ */
        void m3554(T t);
    }

    public C7294(String str, int i, int i2) {
        this.f21985 = str;
        this.f21984 = i;
        this.f21983 = i2;
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ */
    public int m3552() {
        int i;
        synchronized (this.f2787) {
            i = this.f21981;
        }
        return i;
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean m3553() {
        boolean z;
        synchronized (this.f2787) {
            z = this.f2788 != null;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m22788() {
        synchronized (this.f2787) {
            try {
                if (this.f21980.hasMessages(1)) {
                    return;
                }
                this.f2788.quit();
                this.f2788 = null;
                this.f21980 = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m22789(Runnable runnable) {
        runnable.run();
        synchronized (this.f2787) {
            this.f21980.removeMessages(0);
            Handler handler = this.f21980;
            handler.sendMessageDelayed(handler.obtainMessage(0), this.f21983);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m22790(Runnable runnable) {
        synchronized (this.f2787) {
            try {
                if (this.f2788 == null) {
                    HandlerThread handlerThread = new HandlerThread(this.f21985, this.f21984);
                    this.f2788 = handlerThread;
                    handlerThread.start();
                    this.f21980 = new Handler(this.f2788.getLooper(), this.f21982);
                    this.f21981++;
                }
                this.f21980.removeMessages(0);
                Handler handler = this.f21980;
                handler.sendMessage(handler.obtainMessage(1, runnable));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public <T> void m22791(Callable<T> callable, InterfaceC7297<T> interfaceC7297) {
        m22790(new RunnableC1226(callable, C3655.m726(), interfaceC7297));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public <T> T m22792(Callable<T> callable, int i) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        m22790(new RunnableC7296(atomicReference, callable, reentrantLock, atomicBoolean, conditionNewCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            do {
                try {
                    nanos = conditionNewCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    return (T) atomicReference.get();
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }
}
