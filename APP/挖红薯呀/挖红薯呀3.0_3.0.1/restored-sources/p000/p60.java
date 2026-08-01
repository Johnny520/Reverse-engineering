package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class p60 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4766a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q60 f4767b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f4768c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ p60(q60 q60Var, Object obj, int i) {
        this.f4766a = i;
        this.f4767b = q60Var;
        this.f4768c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public i60 m3021b() {
        q60 q60Var = this.f4767b;
        b60 b60Var = (b60) q60Var.f5065m.m1701g(this.f4768c);
        if (b60Var != null) {
            return (i60) q60Var.f5061i.m1701g(b60Var);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m3022c() {
        yp0 yp0Var;
        switch (this.f4766a) {
            case 0:
                return true;
            default:
                i60 i60VarM3021b = m3021b();
                if (i60VarM3021b == null || (yp0Var = i60VarM3021b.f2464f) == null) {
                    return true;
                }
                return yp0Var.m5289c();
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m3020a() {
    }
}
