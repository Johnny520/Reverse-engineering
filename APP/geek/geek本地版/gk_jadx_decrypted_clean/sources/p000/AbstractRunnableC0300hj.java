package p000;

/* JADX INFO: renamed from: hj */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC0300hj implements Runnable, Comparable, InterfaceC0966zg {
    private volatile Object _heap;

    /* JADX INFO: renamed from: a */
    public long f2279a;

    /* JADX INFO: renamed from: b */
    public int f2280b;

    /* JADX INFO: renamed from: a */
    public final int m1360a(long j, C0336ij c0336ij, AbstractC0376jj abstractC0376jj) {
        synchronized (this) {
            if (this._heap == AbstractC0346ip.f2475d) {
                return 2;
            }
            synchronized (c0336ij) {
                try {
                    AbstractRunnableC0300hj[] abstractRunnableC0300hjArr = c0336ij.f4673a;
                    AbstractRunnableC0300hj abstractRunnableC0300hj = abstractRunnableC0300hjArr != null ? abstractRunnableC0300hjArr[0] : null;
                    if (AbstractC0376jj.f2638h.get(abstractC0376jj) != 0) {
                        return 1;
                    }
                    if (abstractRunnableC0300hj == null) {
                        c0336ij.f2436c = j;
                    } else {
                        long j2 = abstractRunnableC0300hj.f2279a;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - c0336ij.f2436c > 0) {
                            c0336ij.f2436c = j;
                        }
                    }
                    long j3 = this.f2279a;
                    long j4 = c0336ij.f2436c;
                    if (j3 - j4 < 0) {
                        this.f2279a = j4;
                    }
                    c0336ij.m2421a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p000.InterfaceC0966zg
    /* JADX INFO: renamed from: b */
    public final void mo1361b() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C0431l0 c0431l0 = AbstractC0346ip.f2475d;
                if (obj == c0431l0) {
                    return;
                }
                C0336ij c0336ij = obj instanceof C0336ij ? (C0336ij) obj : null;
                if (c0336ij != null) {
                    synchronized (c0336ij) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof u60 ? (u60) obj2 : null) != null) {
                            c0336ij.m2422b(this.f2280b);
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
        long j = this.f2279a - ((AbstractRunnableC0300hj) obj).f2279a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m1362d(C0336ij c0336ij) {
        if (this._heap == AbstractC0346ip.f2475d) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = c0336ij;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f2279a + ']';
    }
}
