package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b62 {
    public fy a;
    public int b;
    public ao0 c;
    public mn0 d;
    public int e;
    public gk1 f;
    public rk1 g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b62(fy fyVar) {
        this.a = fyVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a() {
        if (this.a != null) {
            ao0 ao0Var = this.c;
            if (ao0Var != null ? ao0Var.a() : false) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final c21 b(Object obj) {
        c21 c21VarS;
        fy fyVar = this.a;
        return (fyVar == null || (c21VarS = fyVar.s(this, obj)) == null) ? c21.h : c21VarS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        fy fyVar = this.a;
        if (fyVar != null) {
            fyVar.v = true;
            fyVar.A.m();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }
}
