package p376zd;

import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;
import p172l8.C4700i0;

/* JADX INFO: renamed from: zd.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10007o implements Closeable {

    /* JADX INFO: renamed from: q */
    public final boolean f33595q;

    /* JADX INFO: renamed from: r */
    public boolean f33596r;

    /* JADX INFO: renamed from: s */
    public int f33597s;

    /* JADX INFO: renamed from: t */
    public final ReentrantLock f33598t = AbstractC9986d1.m38643b();

    /* JADX INFO: renamed from: zd.o$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC10024w0 {

        /* JADX INFO: renamed from: q */
        public final AbstractC10007o f33599q;

        /* JADX INFO: renamed from: r */
        public long f33600r;

        /* JADX INFO: renamed from: s */
        public boolean f33601s;

        public a(AbstractC10007o abstractC10007o, long j10) {
            abstractC10007o.getClass();
            this.f33599q = abstractC10007o;
            this.f33600r = j10;
        }

        @Override // p376zd.InterfaceC10024w0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f33601s) {
                return;
            }
            this.f33601s = true;
            ReentrantLock reentrantLockM38809h = this.f33599q.m38809h();
            reentrantLockM38809h.lock();
            try {
                AbstractC10007o abstractC10007o = this.f33599q;
                abstractC10007o.f33597s--;
                if (this.f33599q.f33597s == 0 && this.f33599q.f33596r) {
                    C4700i0 c4700i0 = C4700i0.f13910a;
                    reentrantLockM38809h.unlock();
                    this.f33599q.mo38626j();
                }
            } finally {
                reentrantLockM38809h.unlock();
            }
        }

        @Override // p376zd.InterfaceC10024w0
        public long read(C9995i c9995i, long j10) {
            c9995i.getClass();
            if (this.f33601s) {
                C10010p0.m38820a("closed");
                return 0L;
            }
            long jM38810m = this.f33599q.m38810m(this.f33600r, c9995i, j10);
            if (jM38810m != -1) {
                this.f33600r += jM38810m;
            }
            return jM38810m;
        }

        @Override // p376zd.InterfaceC10024w0
        public C10026x0 timeout() {
            return C10026x0.NONE;
        }
    }

    public AbstractC10007o(boolean z10) {
        this.f33595q = z10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f33598t;
        reentrantLock.lock();
        try {
            if (this.f33596r) {
                return;
            }
            this.f33596r = true;
            if (this.f33597s != 0) {
                return;
            }
            C4700i0 c4700i0 = C4700i0.f13910a;
            reentrantLock.unlock();
            mo38626j();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: h */
    public final ReentrantLock m38809h() {
        return this.f33598t;
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo38626j();

    /* JADX INFO: renamed from: k */
    public abstract int mo38627k(long j10, byte[] bArr, int i10, int i11);

    /* JADX INFO: renamed from: l */
    public abstract long mo38628l();

    /* JADX INFO: renamed from: m */
    public final long m38810m(long j10, C9995i c9995i, long j11) {
        if (j11 < 0) {
            C9991g.m38662a("byteCount < 0: ", j11);
            return 0L;
        }
        long j12 = j11 + j10;
        long j13 = j10;
        while (true) {
            if (j13 >= j12) {
                break;
            }
            C10012q0 c10012q0M38695V = c9995i.m38695V(1);
            int iMo38627k = mo38627k(j13, c10012q0M38695V.f33616a, c10012q0M38695V.f33618c, (int) Math.min(j12 - j13, 8192 - r7));
            if (iMo38627k == -1) {
                if (c10012q0M38695V.f33617b == c10012q0M38695V.f33618c) {
                    c9995i.f33561q = c10012q0M38695V.m38822b();
                    C10014r0.m38829b(c10012q0M38695V);
                }
                if (j10 == j13) {
                    return -1L;
                }
            } else {
                c10012q0M38695V.f33618c += iMo38627k;
                long j14 = iMo38627k;
                j13 += j14;
                c9995i.m38689P(c9995i.size() + j14);
            }
        }
        return j13 - j10;
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC10024w0 m38811n(long j10) {
        ReentrantLock reentrantLock = this.f33598t;
        reentrantLock.lock();
        try {
            if (this.f33596r) {
                throw new IllegalStateException("closed");
            }
            this.f33597s++;
            reentrantLock.unlock();
            return new a(this, j10);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() {
        ReentrantLock reentrantLock = this.f33598t;
        reentrantLock.lock();
        try {
            if (this.f33596r) {
                throw new IllegalStateException("closed");
            }
            C4700i0 c4700i0 = C4700i0.f13910a;
            reentrantLock.unlock();
            return mo38628l();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
