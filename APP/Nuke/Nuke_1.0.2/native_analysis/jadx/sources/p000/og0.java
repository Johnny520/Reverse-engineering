package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class og0 implements Runnable, Comparable, ca0 {
    private volatile Object _heap;

    /* JADX INFO: renamed from: h */
    public long f7670h;

    /* JADX INFO: renamed from: i */
    public int f7671i = -1;

    public og0(long j) {
        this.f7670h = j;
    }

    @Override // p000.ca0
    /* JADX INFO: renamed from: a */
    public final void mo717a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                hh1 hh1Var = tp0.f10882i;
                if (obj == hh1Var) {
                    return;
                }
                pg0 pg0Var = obj instanceof pg0 ? (pg0) obj : null;
                if (pg0Var != null) {
                    synchronized (pg0Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof c23 ? (c23) obj2 : null) != null) {
                            pg0Var.m616b(this.f7671i);
                        }
                    }
                }
                this._heap = hh1Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m3561b(long j, pg0 pg0Var, qg0 qg0Var) {
        synchronized (this) {
            if (this._heap == tp0.f10882i) {
                return 2;
            }
            synchronized (pg0Var) {
                try {
                    og0[] og0VarArr = pg0Var.f1121a;
                    og0 og0Var = og0VarArr != null ? og0VarArr[0] : null;
                    if (qg0.f8959p.get(qg0Var) == 1) {
                        return 1;
                    }
                    if (og0Var == null) {
                        pg0Var.f8307c = j;
                    } else {
                        long j2 = og0Var.f7670h;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - pg0Var.f8307c > 0) {
                            pg0Var.f8307c = j;
                        }
                    }
                    long j3 = this.f7670h;
                    long j4 = pg0Var.f8307c;
                    if (j3 - j4 < 0) {
                        this.f7670h = j4;
                    }
                    pg0Var.m615a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f7670h - ((og0) obj).f7670h;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m3562d(pg0 pg0Var) {
        if (this._heap != tp0.f10882i) {
            this._heap = pg0Var;
        } else {
            C0676s.m4651j("Failed requirement.");
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f7670h + ']';
    }
}
