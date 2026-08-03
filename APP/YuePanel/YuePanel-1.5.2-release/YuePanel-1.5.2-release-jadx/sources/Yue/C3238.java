package Yue;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3238 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final long f4982 = 10;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final ThreadLocal<C3238> f4983 = new ThreadLocal<>();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public AbstractC3239 f4985;

    /* JADX INFO: renamed from: ۥ */
    public final C7467<InterfaceC0091, Long> f154 = new C7467<>();

    /* JADX INFO: renamed from: ۥ۟ */
    public final ArrayList<InterfaceC0091> f155 = new ArrayList<>();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C0090 f4984 = new C0090();

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public long f4986 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f4987 = false;

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۧ$ۥ */
    public class C0090 {
        public C0090() {
        }

        /* JADX INFO: renamed from: ۥ */
        public void m319() {
            C3238.this.f4986 = SystemClock.uptimeMillis();
            C3238 c3238 = C3238.this;
            c3238.m6622(c3238.f4986);
            if (C3238.this.f155.size() > 0) {
                C3238.this.m6623().mo321();
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۧ$ۥ۟ */
    public interface InterfaceC0091 {
        /* JADX INFO: renamed from: ۥ */
        boolean mo320(long j);
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۧ$ۥ۟۟, reason: contains not printable characters */
    public static abstract class AbstractC3239 {

        /* JADX INFO: renamed from: ۥ */
        public final C0090 f157;

        public AbstractC3239(C0090 c0090) {
            this.f157 = c0090;
        }

        /* JADX INFO: renamed from: ۥ */
        public abstract void mo321();
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۧ$ۥ۟۟۟, reason: contains not printable characters */
    public static class C3240 extends AbstractC3239 {

        /* JADX INFO: renamed from: ۥ۟ */
        public final Runnable f158;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Handler f4988;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public long f4989;

        /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۧ$ۥ۟۟۟$ۥ */
        public class RunnableC0092 implements Runnable {
            public RunnableC0092() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C3240.this.f4989 = SystemClock.uptimeMillis();
                C3240.this.f157.m319();
            }
        }

        public C3240(C0090 c0090) {
            super(c0090);
            this.f4989 = -1L;
            this.f158 = new RunnableC0092();
            this.f4988 = new Handler(Looper.myLooper());
        }

        @Override // Yue.C3238.AbstractC3239
        /* JADX INFO: renamed from: ۥ */
        public void mo321() {
            this.f4988.postDelayed(this.f158, Math.max(10 - (SystemClock.uptimeMillis() - this.f4989), 0L));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۧ$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(16)
    public static class C3241 extends AbstractC3239 {

        /* JADX INFO: renamed from: ۥ۟ */
        public final Choreographer f159;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Choreographer.FrameCallback f4991;

        /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۧ$ۥ۟۟۟۟$ۥ */
        public class ChoreographerFrameCallbackC0093 implements Choreographer.FrameCallback {
            public ChoreographerFrameCallbackC0093() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                C3241.this.f157.m319();
            }
        }

        public C3241(C0090 c0090) {
            super(c0090);
            this.f159 = Choreographer.getInstance();
            this.f4991 = new ChoreographerFrameCallbackC0093();
        }

        @Override // Yue.C3238.AbstractC3239
        /* JADX INFO: renamed from: ۥ */
        public void mo321() {
            this.f159.postFrameCallback(this.f4991);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static long m6620() {
        ThreadLocal<C3238> threadLocal = f4983;
        if (threadLocal.get() == null) {
            return 0L;
        }
        return threadLocal.get().f4986;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static C3238 m6621() {
        ThreadLocal<C3238> threadLocal = f4983;
        if (threadLocal.get() == null) {
            threadLocal.set(new C3238());
        }
        return threadLocal.get();
    }

    /* JADX INFO: renamed from: ۥ */
    public void m317(InterfaceC0091 interfaceC0091, long j) {
        if (this.f155.size() == 0) {
            m6623().mo321();
        }
        if (!this.f155.contains(interfaceC0091)) {
            this.f155.add(interfaceC0091);
        }
        if (j > 0) {
            this.f154.put(interfaceC0091, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m318() {
        if (this.f4987) {
            for (int size = this.f155.size() - 1; size >= 0; size--) {
                if (this.f155.get(size) == null) {
                    this.f155.remove(size);
                }
            }
            this.f4987 = false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m6622(long j) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.f155.size(); i++) {
            InterfaceC0091 interfaceC0091 = this.f155.get(i);
            if (interfaceC0091 != null && m6624(interfaceC0091, jUptimeMillis)) {
                interfaceC0091.mo320(j);
            }
        }
        m318();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public AbstractC3239 m6623() {
        if (this.f4985 == null) {
            this.f4985 = new C3241(this.f4984);
        }
        return this.f4985;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final boolean m6624(InterfaceC0091 interfaceC0091, long j) {
        Long l = this.f154.get(interfaceC0091);
        if (l == null) {
            return true;
        }
        if (l.longValue() >= j) {
            return false;
        }
        this.f154.remove(interfaceC0091);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m6625(InterfaceC0091 interfaceC0091) {
        this.f154.remove(interfaceC0091);
        int iIndexOf = this.f155.indexOf(interfaceC0091);
        if (iIndexOf >= 0) {
            this.f155.set(iIndexOf, null);
            this.f4987 = true;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m6626(AbstractC3239 abstractC3239) {
        this.f4985 = abstractC3239;
    }
}
