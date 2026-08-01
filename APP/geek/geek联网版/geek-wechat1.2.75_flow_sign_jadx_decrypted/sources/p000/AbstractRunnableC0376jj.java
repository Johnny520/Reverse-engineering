package p000;

/* JADX INFO: renamed from: jj */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC0376jj implements Runnable, Comparable, InterfaceC0068bh {
    private volatile Object _heap;

    /* JADX INFO: renamed from: a */
    public long f2722a;

    /* JADX INFO: renamed from: b */
    public int f2723b;

    /* JADX INFO: renamed from: a */
    public final int m1613a(long j, C0413kj c0413kj, AbstractC0450lj abstractC0450lj) {
        synchronized (this) {
            if (this._heap == AbstractC0493mp.f3166d) {
                return 2;
            }
            synchronized (c0413kj) {
                try {
                    AbstractRunnableC0376jj[] abstractRunnableC0376jjArr = c0413kj.f47a;
                    AbstractRunnableC0376jj abstractRunnableC0376jj = abstractRunnableC0376jjArr != null ? abstractRunnableC0376jjArr[0] : null;
                    if (AbstractC0450lj.f3008h.get(abstractC0450lj) != 0) {
                        return 1;
                    }
                    if (abstractRunnableC0376jj == null) {
                        c0413kj.f2844c = j;
                    } else {
                        long j2 = abstractRunnableC0376jj.f2722a;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - c0413kj.f2844c > 0) {
                            c0413kj.f2844c = j;
                        }
                    }
                    long j3 = this.f2722a;
                    long j4 = c0413kj.f2844c;
                    if (j3 - j4 < 0) {
                        this.f2722a = j4;
                    }
                    c0413kj.m30a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p000.InterfaceC0068bh
    /* JADX INFO: renamed from: b */
    public final void mo522b() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C0431l0 c0431l0 = AbstractC0493mp.f3166d;
                if (obj == c0431l0) {
                    return;
                }
                C0413kj c0413kj = obj instanceof C0413kj ? (C0413kj) obj : null;
                if (c0413kj != null) {
                    synchronized (c0413kj) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof a70 ? (a70) obj2 : null) != null) {
                            c0413kj.m31b(this.f2723b);
                        }
                    }
                }
                this._heap = c0431l0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f2722a - ((AbstractRunnableC0376jj) obj).f2722a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m1614d(C0413kj c0413kj) {
        if (this._heap == AbstractC0493mp.f3166d) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = c0413kj;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f2722a + ']';
    }
}
