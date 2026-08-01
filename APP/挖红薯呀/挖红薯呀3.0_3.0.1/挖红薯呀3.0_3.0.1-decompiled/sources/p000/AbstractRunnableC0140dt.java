package p000;

/* JADX INFO: renamed from: dt */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC0140dt implements Runnable, Comparable, InterfaceC0622po {
    private volatile Object _heap;

    /* JADX INFO: renamed from: d */
    public long f1171d;

    /* JADX INFO: renamed from: e */
    public int f1172e = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractRunnableC0140dt(long j) {
        this.f1171d = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0622po
    /* JADX INFO: renamed from: a */
    public final void mo623a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C1014zr c1014zr = AbstractC0307i4.f2423d;
                if (obj == c1014zr) {
                    return;
                }
                C0184et c0184et = obj instanceof C0184et ? (C0184et) obj : null;
                if (c0184et != null) {
                    synchronized (c0184et) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof a81 ? (a81) obj2 : null) != null) {
                            c0184et.m32b(this.f1172e);
                        }
                    }
                }
                this._heap = c1014zr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m723b(long j, C0184et c0184et, AbstractC0221ft abstractC0221ft) {
        synchronized (this) {
            if (this._heap == AbstractC0307i4.f2423d) {
                return 2;
            }
            synchronized (c0184et) {
                try {
                    AbstractRunnableC0140dt[] abstractRunnableC0140dtArr = c0184et.f71a;
                    AbstractRunnableC0140dt abstractRunnableC0140dt = abstractRunnableC0140dtArr != null ? abstractRunnableC0140dtArr[0] : null;
                    if (AbstractC0221ft.f1805l.get(abstractC0221ft) != 0) {
                        return 1;
                    }
                    if (abstractRunnableC0140dt == null) {
                        c0184et.f1525c = j;
                    } else {
                        long j2 = abstractRunnableC0140dt.f1171d;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - c0184et.f1525c > 0) {
                            c0184et.f1525c = j;
                        }
                    }
                    long j3 = this.f1171d;
                    long j4 = c0184et.f1525c;
                    if (j3 - j4 < 0) {
                        this.f1171d = j4;
                    }
                    c0184et.m31a(this);
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
        long j = this.f1171d - ((AbstractRunnableC0140dt) obj).f1171d;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m724d(C0184et c0184et) {
        if (this._heap != AbstractC0307i4.f2423d) {
            this._heap = c0184et;
        } else {
            C0921xc.m5131l("Failed requirement.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "Delayed[nanos=" + this.f1171d + ']';
    }
}
