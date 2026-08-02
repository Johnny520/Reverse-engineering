package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class og0 implements Runnable, Comparable, ca0 {
    private volatile Object _heap;
    public long h;
    public int i = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public og0(long j) {
        this.h = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ca0
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                hh1 hh1Var = tp0.i;
                if (obj == hh1Var) {
                    return;
                }
                pg0 pg0Var = obj instanceof pg0 ? (pg0) obj : null;
                if (pg0Var != null) {
                    synchronized (pg0Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof c23 ? (c23) obj2 : null) != null) {
                            pg0Var.b(this.i);
                        }
                    }
                }
                this._heap = hh1Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int b(long j, pg0 pg0Var, qg0 qg0Var) {
        synchronized (this) {
            if (this._heap == tp0.i) {
                return 2;
            }
            synchronized (pg0Var) {
                try {
                    og0[] og0VarArr = pg0Var.a;
                    og0 og0Var = og0VarArr != null ? og0VarArr[0] : null;
                    if (qg0.p.get(qg0Var) == 1) {
                        return 1;
                    }
                    if (og0Var == null) {
                        pg0Var.c = j;
                    } else {
                        long j2 = og0Var.h;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - pg0Var.c > 0) {
                            pg0Var.c = j;
                        }
                    }
                    long j3 = this.h;
                    long j4 = pg0Var.c;
                    if (j3 - j4 < 0) {
                        this.h = j4;
                    }
                    pg0Var.a(this);
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
        long j = this.h - ((og0) obj).h;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(pg0 pg0Var) {
        if (this._heap != tp0.i) {
            this._heap = pg0Var;
        } else {
            s.j("Failed requirement.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "Delayed[nanos=" + this.h + ']';
    }
}
