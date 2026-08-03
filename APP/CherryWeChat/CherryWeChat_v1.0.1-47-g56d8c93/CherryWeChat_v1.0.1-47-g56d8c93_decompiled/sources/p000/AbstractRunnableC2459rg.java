package p000;

/* JADX INFO: renamed from: rg */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC2459rg implements Runnable, Comparable, InterfaceC2100je {
    private volatile Object _heap;

    /* JADX INFO: renamed from: a */
    public long f8666a;

    /* JADX INFO: renamed from: b */
    public int f8667b;

    @Override // p000.InterfaceC2100je
    /* JADX INFO: renamed from: a */
    public final void mo1795a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C2610v1 c2610v1 = AbstractC0628Oj.f2011e;
                if (obj == c2610v1) {
                    return;
                }
                C2502sg c2502sg = obj instanceof C2502sg ? (C2502sg) obj : null;
                if (c2502sg != null) {
                    synchronized (c2502sg) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof C1209bB ? (C1209bB) obj2 : null) != null) {
                            c2502sg.m2331b(this.f8667b);
                        }
                    }
                }
                this._heap = c2610v1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m4950c(long j, C2502sg c2502sg, AbstractC2545tg abstractC2545tg) {
        synchronized (this) {
            if (this._heap == AbstractC0628Oj.f2011e) {
                return 2;
            }
            synchronized (c2502sg) {
                try {
                    AbstractRunnableC2459rg[] abstractRunnableC2459rgArr = c2502sg.f4140a;
                    AbstractRunnableC2459rg abstractRunnableC2459rg = abstractRunnableC2459rgArr != null ? abstractRunnableC2459rgArr[0] : null;
                    if (AbstractC2545tg.f8863g.get(abstractC2545tg) == 1) {
                        return 1;
                    }
                    if (abstractRunnableC2459rg == null) {
                        c2502sg.f8789c = j;
                    } else {
                        long j2 = abstractRunnableC2459rg.f8666a;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - c2502sg.f8789c > 0) {
                            c2502sg.f8789c = j;
                        }
                    }
                    long j3 = this.f8666a;
                    long j4 = c2502sg.f8789c;
                    if (j3 - j4 < 0) {
                        this.f8666a = j4;
                    }
                    c2502sg.m2330a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f8666a - ((AbstractRunnableC2459rg) obj).f8666a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m4951d(C2502sg c2502sg) {
        if (this._heap == AbstractC0628Oj.f2011e) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = c2502sg;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f8666a + ']';
    }
}
