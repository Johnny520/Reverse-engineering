package Yue;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: Yue.ۥۢۡۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7790 {

    /* JADX INFO: renamed from: ۥ */
    public long f3083;

    /* JADX INFO: renamed from: ۥ۟ */
    public long f3084;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public long f23332;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public long f23333;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final ReentrantLock f23334;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final Condition f23335;

    /* JADX INFO: renamed from: Yue.ۥۢۡۢۨ$ۥ */
    public static final class C1357 extends AbstractC5067 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C7790 f23336;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1357(InterfaceC7472 interfaceC7472, C7790 c7790) {
            super(interfaceC7472);
            this.f23336 = c7790;
        }

        @Override // Yue.AbstractC5067, Yue.InterfaceC7472
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public void mo9102(@InterfaceC6399 C3600 c3600, long j) throws IOException {
            C5499.m17103(c3600, "source");
            while (j > 0) {
                try {
                    long jM24757 = this.f23336.m24757(j);
                    super.mo9102(c3600, jM24757);
                    j -= jM24757;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("interrupted");
                }
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۡۢۨ$ۥ۟ */
    public static final class C1358 extends AbstractC5068 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C7790 f23337;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1358(InterfaceC7506 interfaceC7506, C7790 c7790) {
            super(interfaceC7506);
            this.f23337 = c7790;
        }

        @Override // Yue.AbstractC5068, Yue.InterfaceC7506
        /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
        public long mo9103(@InterfaceC6399 C3600 c3600, long j) throws InterruptedIOException {
            C5499.m17103(c3600, "sink");
            try {
                return super.mo9103(c3600, this.f23337.m24757(j));
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException("interrupted");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7790(long j) {
        this.f3083 = j;
        this.f23332 = 8192L;
        this.f23333 = 262144L;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f23334 = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        C5499.m17102(conditionNewCondition, "newCondition(...)");
        this.f23335 = conditionNewCondition;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m24748(C7790 c7790, long j, long j2, long j3, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = c7790.f23332;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            j3 = c7790.f23333;
        }
        c7790.m24750(j, j4, j3);
    }

    /* JADX INFO: renamed from: ۥ */
    public final long m3889(long j, long j2) {
        if (this.f3084 == 0) {
            return j2;
        }
        long jMax = Math.max(this.f3083 - j, 0L);
        long jM24754 = this.f23333 - m24754(jMax);
        if (jM24754 >= j2) {
            this.f3083 = j + jMax + m24751(j2);
            return j2;
        }
        long j3 = this.f23332;
        if (jM24754 >= j3) {
            this.f3083 = j + m24751(this.f23333);
            return jM24754;
        }
        long jMin = Math.min(j3, j2);
        long jM24751 = jMax + m24751(jMin - this.f23333);
        if (jM24751 != 0) {
            return -jM24751;
        }
        this.f3083 = j + m24751(this.f23333);
        return jMin;
    }

    @InterfaceC5573
    /* JADX INFO: renamed from: ۥ۟ */
    public final void m3890(long j) {
        m24748(this, j, 0L, 0L, 6, null);
    }

    @InterfaceC5573
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m24749(long j, long j2) {
        m24748(this, j, j2, 0L, 4, null);
    }

    @InterfaceC5573
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m24750(long j, long j2, long j3) {
        ReentrantLock reentrantLock = this.f23334;
        reentrantLock.lock();
        try {
            if (j < 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (j2 <= 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (j3 < j2) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this.f3084 = j;
            this.f23332 = j2;
            this.f23333 = j3;
            this.f23335.signalAll();
            C8107 c8107 = C8107.f3222;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final long m24751(long j) {
        return (j * 1000000000) / this.f3084;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final Condition m24752() {
        return this.f23335;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final ReentrantLock m24753() {
        return this.f23334;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final long m24754(long j) {
        return (j * this.f3084) / 1000000000;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final InterfaceC7472 m24755(@InterfaceC6399 InterfaceC7472 interfaceC7472) {
        C5499.m17103(interfaceC7472, "sink");
        return new C1357(interfaceC7472, this);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final InterfaceC7506 m24756(@InterfaceC6399 InterfaceC7506 interfaceC7506) {
        C5499.m17103(interfaceC7506, "source");
        return new C1358(interfaceC7506, this);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final long m24757(long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        ReentrantLock reentrantLock = this.f23334;
        reentrantLock.lock();
        while (true) {
            try {
                long jM3889 = m3889(System.nanoTime(), j);
                if (jM3889 >= 0) {
                    return jM3889;
                }
                this.f23335.awaitNanos(-jM3889);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public C7790() {
        this(System.nanoTime());
    }
}
