package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b62 {

    /* JADX INFO: renamed from: a */
    public C0220fy f613a;

    /* JADX INFO: renamed from: b */
    public int f614b;

    /* JADX INFO: renamed from: c */
    public ao0 f615c;

    /* JADX INFO: renamed from: d */
    public mn0 f616d;

    /* JADX INFO: renamed from: e */
    public int f617e;

    /* JADX INFO: renamed from: f */
    public gk1 f618f;

    /* JADX INFO: renamed from: g */
    public rk1 f619g;

    public b62(C0220fy c0220fy) {
        this.f613a = c0220fy;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m441a() {
        if (this.f613a != null) {
            ao0 ao0Var = this.f615c;
            if (ao0Var != null ? ao0Var.m237a() : false) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final c21 m442b(Object obj) {
        c21 c21VarM1748s;
        C0220fy c0220fy = this.f613a;
        return (c0220fy == null || (c21VarM1748s = c0220fy.m1748s(this, obj)) == null) ? c21.f1110h : c21VarM1748s;
    }

    /* JADX INFO: renamed from: c */
    public final void m443c() {
        C0220fy c0220fy = this.f613a;
        if (c0220fy != null) {
            c0220fy.f3190v = true;
            c0220fy.f3172A.m3237m();
        }
        this.f613a = null;
        this.f618f = null;
        this.f619g = null;
        this.f616d = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m444d(boolean z) {
        int i = this.f614b;
        this.f614b = z ? i | 32 : i & (-33);
    }
}
