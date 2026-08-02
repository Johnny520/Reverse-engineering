package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class p93 extends w51 implements in0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f8059i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ q93 f8060j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p93(q93 q93Var, int i) {
        super(1);
        this.f8059i = i;
        this.f8060j = q93Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f8059i;
        a83 a83Var = a83.f116a;
        q93 q93Var = this.f8060j;
        switch (i) {
            case 0:
                q93Var.f8840d = true;
                q93Var.f8842f.mo6a();
                return a83Var;
            default:
                nc0 nc0Var = (nc0) obj;
                ar0 ar0Var = q93Var.f8838b;
                float f = q93Var.f8847k;
                float f2 = q93Var.f8848l;
                C0043b5 c0043b5Mo3274E = nc0Var.mo3274E();
                long jM434u = c0043b5Mo3274E.m434u();
                c0043b5Mo3274E.m430q().mo1522l();
                try {
                    ((C0485n4) c0043b5Mo3274E.f562i).m3234A(f, f2, 0L);
                    ar0Var.mo260a(nc0Var);
                    return a83Var;
                } finally {
                    vi0.m5699r(c0043b5Mo3274E, jM434u);
                }
        }
    }
}
