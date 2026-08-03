package Yue;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* JADX INFO: renamed from: Yue.ۥۢۡۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timeout.kt\nokio/Timeout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,316:1\n1#2:317\n*E\n"})
public class C7827 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1373 f23433 = new C1373(null);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final C7827 f23434 = new C1372();

    /* JADX INFO: renamed from: ۥ */
    public boolean f3104;

    /* JADX INFO: renamed from: ۥ۟ */
    public long f3105;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public long f23435;

    /* JADX INFO: renamed from: Yue.ۥۢۡۤۧ$ۥ */
    public static final class C1372 extends C7827 {
        @Override // Yue.C7827
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public C7827 mo15619(long j) {
            return this;
        }

        @Override // Yue.C7827
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public void mo15621() {
        }

        @Override // Yue.C7827
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public C7827 mo15622(long j, @InterfaceC6399 TimeUnit timeUnit) {
            C5499.m17103(timeUnit, "unit");
            return this;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡۤۧ$ۥ۟ */
    public static final class C1373 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۢۡۤۧ.ۥ۟.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1373(C4335 c4335) {
            this();
        }

        /* JADX INFO: renamed from: ۥ */
        public final long m3922(long j, long j2) {
            return (j != 0 && (j2 == 0 || j < j2)) ? j : j2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1373() {
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m3921(@InterfaceC6399 Condition condition) throws InterruptedIOException {
        C5499.m17103(condition, "condition");
        try {
            boolean zMo15620 = mo15620();
            long jMo15623 = mo15623();
            long jNanoTime = 0;
            if (!zMo15620 && jMo15623 == 0) {
                condition.await();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            if (zMo15620 && jMo15623 != 0) {
                jMo15623 = Math.min(jMo15623, mo15618() - jNanoTime2);
            } else if (zMo15620) {
                jMo15623 = mo15618() - jNanoTime2;
            }
            if (jMo15623 > 0) {
                condition.await(jMo15623, TimeUnit.NANOSECONDS);
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= jMo15623) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public C7827 mo1893() {
        this.f3104 = false;
        return this;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ */
    public C7827 mo15617() {
        this.f23435 = 0L;
        return this;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final C7827 m24846(long j, @InterfaceC6399 TimeUnit timeUnit) {
        C5499.m17103(timeUnit, "unit");
        if (j > 0) {
            return mo15619(System.nanoTime() + timeUnit.toNanos(j));
        }
        throw new IllegalArgumentException(("duration <= 0: " + j).toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public long mo15618() {
        if (this.f3104) {
            return this.f3105;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public C7827 mo15619(long j) {
        this.f3104 = true;
        this.f3105 = j;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public boolean mo15620() {
        return this.f3104;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final <T> T m24847(@InterfaceC6399 C7827 c7827, @InterfaceC6399 InterfaceC5122<? extends T> interfaceC5122) {
        C5499.m17103(c7827, "other");
        C5499.m17103(interfaceC5122, "block");
        long jMo15623 = mo15623();
        long jM3922 = f23433.m3922(c7827.mo15623(), mo15623());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        mo15622(jM3922, timeUnit);
        if (!mo15620()) {
            if (c7827.mo15620()) {
                mo15619(c7827.mo15618());
            }
            try {
                T tInvoke = interfaceC5122.invoke();
                C5437.m16930(1);
                mo15622(jMo15623, timeUnit);
                if (c7827.mo15620()) {
                    mo1893();
                }
                C5437.m16929(1);
                return tInvoke;
            } catch (Throwable th) {
                C5437.m16930(1);
                mo15622(jMo15623, TimeUnit.NANOSECONDS);
                if (c7827.mo15620()) {
                    mo1893();
                }
                C5437.m16929(1);
                throw th;
            }
        }
        long jMo15618 = mo15618();
        if (c7827.mo15620()) {
            mo15619(Math.min(mo15618(), c7827.mo15618()));
        }
        try {
            T tInvoke2 = interfaceC5122.invoke();
            C5437.m16930(1);
            mo15622(jMo15623, timeUnit);
            if (c7827.mo15620()) {
                mo15619(jMo15618);
            }
            C5437.m16929(1);
            return tInvoke2;
        } catch (Throwable th2) {
            C5437.m16930(1);
            mo15622(jMo15623, TimeUnit.NANOSECONDS);
            if (c7827.mo15620()) {
                mo15619(jMo15618);
            }
            C5437.m16929(1);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo15621() throws IOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f3104 && this.f3105 - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public C7827 mo15622(long j, @InterfaceC6399 TimeUnit timeUnit) {
        C5499.m17103(timeUnit, "unit");
        if (j >= 0) {
            this.f23435 = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j).toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public long mo15623() {
        return this.f23435;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m24848(@InterfaceC6399 Object obj) throws InterruptedIOException {
        C5499.m17103(obj, "monitor");
        try {
            boolean zMo15620 = mo15620();
            long jMo15623 = mo15623();
            long jNanoTime = 0;
            if (!zMo15620 && jMo15623 == 0) {
                obj.wait();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            if (zMo15620 && jMo15623 != 0) {
                jMo15623 = Math.min(jMo15623, mo15618() - jNanoTime2);
            } else if (zMo15620) {
                jMo15623 = mo15618() - jNanoTime2;
            }
            if (jMo15623 > 0) {
                long j = jMo15623 / C4720.f10089;
                obj.wait(j, (int) (jMo15623 - (C4720.f10089 * j)));
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= jMo15623) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}
