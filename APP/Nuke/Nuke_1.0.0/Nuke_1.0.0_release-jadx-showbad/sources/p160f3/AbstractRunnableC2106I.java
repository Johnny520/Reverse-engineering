package p160f3;

import p121Y1.C1753n;
import p190k3.C2473u;

/* JADX INFO: renamed from: f3.I */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC2106I implements Runnable, Comparable, InterfaceC2101D {
    private volatile Object _heap;

    /* JADX INFO: renamed from: d */
    public long f7036d;

    /* JADX INFO: renamed from: e */
    public int f7037e = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractRunnableC2106I(long j5) {
        this.f7036d = j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.InterfaceC2101D
    /* JADX INFO: renamed from: a */
    public final void mo3883a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C1753n c1753n = AbstractC2162v.f7111b;
                if (obj == c1753n) {
                    return;
                }
                C2107J c2107j = obj instanceof C2107J ? (C2107J) obj : null;
                if (c2107j != null) {
                    synchronized (c2107j) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof C2473u ? (C2473u) obj2 : null) != null) {
                            c2107j.m4409b(this.f7037e);
                        }
                    }
                }
                this._heap = c1753n;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m3888b(long j5, C2107J c2107j, AbstractC2108K abstractC2108K) {
        synchronized (this) {
            if (this._heap == AbstractC2162v.f7111b) {
                return 2;
            }
            synchronized (c2107j) {
                try {
                    AbstractRunnableC2106I[] abstractRunnableC2106IArr = c2107j.f7962a;
                    AbstractRunnableC2106I abstractRunnableC2106I = abstractRunnableC2106IArr != null ? abstractRunnableC2106IArr[0] : null;
                    if (AbstractC2108K.f7041l.get(abstractC2108K) != 0) {
                        return 1;
                    }
                    if (abstractRunnableC2106I == null) {
                        c2107j.f7038c = j5;
                    } else {
                        long j6 = abstractRunnableC2106I.f7036d;
                        if (j6 - j5 < 0) {
                            j5 = j6;
                        }
                        if (j5 - c2107j.f7038c > 0) {
                            c2107j.f7038c = j5;
                        }
                    }
                    long j7 = this.f7036d;
                    long j8 = c2107j.f7038c;
                    if (j7 - j8 < 0) {
                        this.f7036d = j8;
                    }
                    c2107j.m4408a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j5 = this.f7036d - ((AbstractRunnableC2106I) obj).f7036d;
        if (j5 > 0) {
            return 1;
        }
        return j5 < 0 ? -1 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m3889d(C2107J c2107j) {
        if (this._heap == AbstractC2162v.f7111b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = c2107j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "Delayed[nanos=" + this.f7036d + ']';
    }
}
