package Yue;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: Yue.ۥ۟ۢ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3443 extends C7827 {

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0138 f5552 = new C0138(null);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final ReentrantLock f5553;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public static final Condition f5554;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f5555 = 65536;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final long f5556;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final long f5557;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    @InterfaceC6489
    public static C3443 f5558;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f5559;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6489
    public C3443 f5560;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public long f5561;

    /* JADX INFO: renamed from: Yue.ۥ۟ۢ۟ۤ$ۥ */
    @InterfaceC7507({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,331:1\n1#2:332\n*E\n"})
    public static final class C0138 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۟ۢ۟ۤ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0138(C4335 c4335) {
            this();
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C3443 m9097() throws InterruptedException {
            C3443 c3443 = C3443.f5558;
            C5499.m17100(c3443);
            C3443 c34432 = c3443.f5560;
            if (c34432 == null) {
                long jNanoTime = System.nanoTime();
                m9099().await(C3443.f5556, TimeUnit.MILLISECONDS);
                C3443 c34433 = C3443.f5558;
                C5499.m17100(c34433);
                if (c34433.f5560 != null || System.nanoTime() - jNanoTime < C3443.f5557) {
                    return null;
                }
                return C3443.f5558;
            }
            long jM9092 = c34432.m9092(System.nanoTime());
            if (jM9092 > 0) {
                m9099().await(jM9092, TimeUnit.NANOSECONDS);
                return null;
            }
            C3443 c34434 = C3443.f5558;
            C5499.m17100(c34434);
            c34434.f5560 = c34432.f5560;
            c34432.f5560 = null;
            return c34432;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final boolean m9098(C3443 c3443) {
            ReentrantLock reentrantLockM9100 = C3443.f5552.m9100();
            reentrantLockM9100.lock();
            try {
                if (!c3443.f5559) {
                    return false;
                }
                c3443.f5559 = false;
                for (C3443 c34432 = C3443.f5558; c34432 != null; c34432 = c34432.f5560) {
                    if (c34432.f5560 == c3443) {
                        c34432.f5560 = c3443.f5560;
                        c3443.f5560 = null;
                        return false;
                    }
                }
                reentrantLockM9100.unlock();
                return true;
            } finally {
                reentrantLockM9100.unlock();
            }
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final Condition m9099() {
            return C3443.f5554;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final ReentrantLock m9100() {
            return C3443.f5553;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final void m9101(C3443 c3443, long j, boolean z) {
            ReentrantLock reentrantLockM9100 = C3443.f5552.m9100();
            reentrantLockM9100.lock();
            try {
                if (!(!c3443.f5559)) {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
                c3443.f5559 = true;
                if (C3443.f5558 == null) {
                    C3443.f5558 = new C3443();
                    new C0139().start();
                }
                long jNanoTime = System.nanoTime();
                if (j != 0 && z) {
                    c3443.f5561 = Math.min(j, c3443.mo15618() - jNanoTime) + jNanoTime;
                } else if (j != 0) {
                    c3443.f5561 = j + jNanoTime;
                } else {
                    if (!z) {
                        throw new AssertionError();
                    }
                    c3443.f5561 = c3443.mo15618();
                }
                long jM9092 = c3443.m9092(jNanoTime);
                C3443 c34432 = C3443.f5558;
                C5499.m17100(c34432);
                while (c34432.f5560 != null) {
                    C3443 c34433 = c34432.f5560;
                    C5499.m17100(c34433);
                    if (jM9092 < c34433.m9092(jNanoTime)) {
                        break;
                    }
                    c34432 = c34432.f5560;
                    C5499.m17100(c34432);
                }
                c3443.f5560 = c34432.f5560;
                c34432.f5560 = c3443;
                if (c34432 == C3443.f5558) {
                    C3443.f5552.m9099().signal();
                }
                C8107 c8107 = C8107.f3222;
                reentrantLockM9100.unlock();
            } catch (Throwable th) {
                reentrantLockM9100.unlock();
                throw th;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0138() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢ۟ۤ$ۥ۟ */
    public static final class C0139 extends Thread {
        public C0139() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock reentrantLockM9100;
            C3443 c3443M9097;
            while (true) {
                try {
                    C0138 c0138 = C3443.f5552;
                    reentrantLockM9100 = c0138.m9100();
                    reentrantLockM9100.lock();
                    try {
                        c3443M9097 = c0138.m9097();
                    } finally {
                        reentrantLockM9100.unlock();
                    }
                } catch (InterruptedException unused) {
                }
                if (c3443M9097 == C3443.f5558) {
                    C3443.f5558 = null;
                    return;
                }
                C8107 c8107 = C8107.f3222;
                reentrantLockM9100.unlock();
                if (c3443M9097 != null) {
                    c3443M9097.mo9095();
                }
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢ۟ۤ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$sink$1\n+ 2 AsyncTimeout.kt\nokio/AsyncTimeout\n*L\n1#1,331:1\n146#2,11:332\n146#2,11:343\n146#2,11:354\n*S KotlinDebug\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$sink$1\n*L\n102#1:332,11\n108#1:343,11\n112#1:354,11\n*E\n"})
    public static final class C3444 implements InterfaceC7472 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7472 f5563;

        public C3444(InterfaceC7472 interfaceC7472) {
            this.f5563 = interfaceC7472;
        }

        @Override // Yue.InterfaceC7472, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C3443 c3443 = C3443.this;
            InterfaceC7472 interfaceC7472 = this.f5563;
            c3443.m9089();
            try {
                interfaceC7472.close();
                C8107 c8107 = C8107.f3222;
                if (c3443.m9090()) {
                    throw c3443.m9088(null);
                }
            } catch (IOException e) {
                if (!c3443.m9090()) {
                    throw e;
                }
                throw c3443.m9088(e);
            } finally {
                c3443.m9090();
            }
        }

        @Override // Yue.InterfaceC7472, java.io.Flushable
        public void flush() throws IOException {
            C3443 c3443 = C3443.this;
            InterfaceC7472 interfaceC7472 = this.f5563;
            c3443.m9089();
            try {
                interfaceC7472.flush();
                C8107 c8107 = C8107.f3222;
                if (c3443.m9090()) {
                    throw c3443.m9088(null);
                }
            } catch (IOException e) {
                if (!c3443.m9090()) {
                    throw e;
                }
                throw c3443.m9088(e);
            } finally {
                c3443.m9090();
            }
        }

        @InterfaceC6399
        public String toString() {
            return "AsyncTimeout.sink(" + this.f5563 + ')';
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ()LYue/ۥۢۡۤۧ; */
        @Override // Yue.InterfaceC7472
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public C3443 mo516() {
            return C3443.this;
        }

        @Override // Yue.InterfaceC7472
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public void mo9102(@InterfaceC6399 C3600 c3600, long j) throws IOException {
            C5499.m17103(c3600, "source");
            C2963.m5677(c3600.m9684(), 0L, j);
            while (true) {
                long j2 = 0;
                if (j <= 0) {
                    return;
                }
                C7275 c7275 = c3600.f6209;
                C5499.m17100(c7275);
                while (true) {
                    if (j2 >= 65536) {
                        break;
                    }
                    j2 += (long) (c7275.f21950 - c7275.f2779);
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    } else {
                        c7275 = c7275.f21953;
                        C5499.m17100(c7275);
                    }
                }
                C3443 c3443 = C3443.this;
                InterfaceC7472 interfaceC7472 = this.f5563;
                c3443.m9089();
                try {
                    interfaceC7472.mo9102(c3600, j2);
                    C8107 c8107 = C8107.f3222;
                    if (c3443.m9090()) {
                        throw c3443.m9088(null);
                    }
                    j -= j2;
                } catch (IOException e) {
                    if (!c3443.m9090()) {
                        throw e;
                    }
                    throw c3443.m9088(e);
                } finally {
                    c3443.m9090();
                }
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢ۟ۤ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$source$1\n+ 2 AsyncTimeout.kt\nokio/AsyncTimeout\n*L\n1#1,331:1\n146#2,11:332\n146#2,11:343\n*S KotlinDebug\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$source$1\n*L\n128#1:332,11\n132#1:343,11\n*E\n"})
    public static final class C3445 implements InterfaceC7506 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7506 f5565;

        public C3445(InterfaceC7506 interfaceC7506) {
            this.f5565 = interfaceC7506;
        }

        @Override // Yue.InterfaceC7506, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C3443 c3443 = C3443.this;
            InterfaceC7506 interfaceC7506 = this.f5565;
            c3443.m9089();
            try {
                interfaceC7506.close();
                C8107 c8107 = C8107.f3222;
                if (c3443.m9090()) {
                    throw c3443.m9088(null);
                }
            } catch (IOException e) {
                if (!c3443.m9090()) {
                    throw e;
                }
                throw c3443.m9088(e);
            } finally {
                c3443.m9090();
            }
        }

        @InterfaceC6399
        public String toString() {
            return "AsyncTimeout.source(" + this.f5565 + ')';
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ()LYue/ۥۢۡۤۧ; */
        @Override // Yue.InterfaceC7506
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public C3443 mo518() {
            return C3443.this;
        }

        @Override // Yue.InterfaceC7506
        /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
        public long mo9103(@InterfaceC6399 C3600 c3600, long j) throws IOException {
            C5499.m17103(c3600, "sink");
            C3443 c3443 = C3443.this;
            InterfaceC7506 interfaceC7506 = this.f5565;
            c3443.m9089();
            try {
                long jMo9103 = interfaceC7506.mo9103(c3600, j);
                if (c3443.m9090()) {
                    throw c3443.m9088(null);
                }
                return jMo9103;
            } catch (IOException e) {
                if (c3443.m9090()) {
                    throw c3443.m9088(e);
                }
                throw e;
            } finally {
                c3443.m9090();
            }
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f5553 = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        C5499.m17102(conditionNewCondition, "newCondition(...)");
        f5554 = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f5556 = millis;
        f5557 = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    @InterfaceC6399
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final IOException m9088(@InterfaceC6489 IOException iOException) {
        return mo9091(iOException);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final void m9089() {
        long jMo15623 = mo15623();
        boolean zMo15620 = mo15620();
        if (jMo15623 != 0 || zMo15620) {
            f5552.m9101(this, jMo15623, zMo15620);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final boolean m9090() {
        return f5552.m9098(this);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public IOException mo9091(@InterfaceC6489 IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final long m9092(long j) {
        return this.f5561 - j;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final InterfaceC7472 m9093(@InterfaceC6399 InterfaceC7472 interfaceC7472) {
        C5499.m17103(interfaceC7472, "sink");
        return new C3444(interfaceC7472);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final InterfaceC7506 m9094(@InterfaceC6399 InterfaceC7506 interfaceC7506) {
        C5499.m17103(interfaceC7506, "source");
        return new C3445(interfaceC7506);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public void mo9095() {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final <T> T m9096(@InterfaceC6399 InterfaceC5122<? extends T> interfaceC5122) throws IOException {
        C5499.m17103(interfaceC5122, "block");
        m9089();
        try {
            try {
                T tInvoke = interfaceC5122.invoke();
                C5437.m16930(1);
                if (m9090()) {
                    throw m9088(null);
                }
                C5437.m16929(1);
                return tInvoke;
            } catch (IOException e) {
                if (m9090()) {
                    throw m9088(e);
                }
                throw e;
            }
        } catch (Throwable th) {
            C5437.m16930(1);
            m9090();
            C5437.m16929(1);
            throw th;
        }
    }
}
