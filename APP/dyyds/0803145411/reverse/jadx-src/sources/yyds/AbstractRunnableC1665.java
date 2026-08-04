package yyds;

/* JADX INFO: renamed from: yyds.ᛷᲇᛷᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC1665 implements Runnable, Comparable, InterfaceC0970 {
    private volatile Object _heap;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public long f8518;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f8519 = -1;

    public AbstractRunnableC1665(long j) {
        this.f8518 = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f8518 - ((AbstractRunnableC1665) obj).f8518;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f8518 + ']';
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int m3406(long j, C2092 c2092, AbstractC0467 abstractC0467) {
        synchronized (this) {
            if (this._heap == AbstractC1579.f8015) {
                return 2;
            }
            synchronized (c2092) {
                try {
                    AbstractRunnableC1665[] abstractRunnableC1665Arr = c2092.f5367;
                    AbstractRunnableC1665 abstractRunnableC1665 = abstractRunnableC1665Arr != null ? abstractRunnableC1665Arr[0] : null;
                    int i = AbstractC0467.f2322;
                    if (AbstractC2112.f10448.getIntVolatile(abstractC0467, AbstractC0467.f2319) != 0) {
                        return 1;
                    }
                    if (abstractRunnableC1665 == null) {
                        c2092.f10380 = j;
                    } else {
                        long j2 = abstractRunnableC1665.f8518;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        long j3 = c2092.f10380;
                        if (j - j3 > 0) {
                            c2092.f10380 = j;
                        } else {
                            j = j3;
                        }
                    }
                    if (this.f8518 - j < 0) {
                        this.f8518 = j;
                    }
                    c2092.m2353(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // yyds.InterfaceC0970
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo1720() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C0415 c0415 = AbstractC1579.f8015;
                if (obj == c0415) {
                    return;
                }
                C2092 c2092 = obj instanceof C2092 ? (C2092) obj : null;
                if (c2092 != null) {
                    synchronized (c2092) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof AbstractC1166 ? (AbstractC1166) obj2 : null) != null) {
                            c2092.m2355(this.f8519);
                        }
                    }
                }
                this._heap = c0415;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m3407(C2092 c2092) {
        if (this._heap != AbstractC1579.f8015) {
            this._heap = c2092;
        } else {
            C0188.m798("Failed requirement.");
        }
    }
}
