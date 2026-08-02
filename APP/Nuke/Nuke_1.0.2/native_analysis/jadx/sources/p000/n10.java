package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n10 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f6963h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ t91 f6964i;

    public /* synthetic */ n10(t91 t91Var, int i) {
        this.f6963h = i;
        this.f6964i = t91Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f6963h;
        a83 a83Var = a83.f116a;
        t91 t91Var = this.f6964i;
        switch (i) {
            case 0:
                c61 c61Var = (c61) obj;
                z03 z03VarM5146d = t91Var.m5146d();
                if (z03VarM5146d != null) {
                    z03VarM5146d.f13699c = c61Var;
                }
                return a83Var;
            case 1:
                nx1 nx1Var = t91Var.f10641t;
                k03 k03Var = (k03) obj;
                String str = k03Var.f5296a.f10051i;
                C0690sd c0690sd = t91Var.f10631j;
                if (!t11.m5086l(str, c0690sd != null ? c0690sd.f10051i : null)) {
                    t91Var.f10632k.setValue(tr0.f10906h);
                    if (((Boolean) nx1Var.getValue()).booleanValue()) {
                        nx1Var.setValue(Boolean.FALSE);
                    } else {
                        t91Var.f10640s.setValue(Boolean.FALSE);
                    }
                }
                long j = f13.f2737b;
                t91Var.m5148f(j);
                t91Var.m5147e(j);
                t91Var.f10642u.mo5j(k03Var);
                b62 b62Var = t91Var.f10623b;
                C0220fy c0220fy = b62Var.f613a;
                if (c0220fy != null) {
                    c0220fy.m1748s(b62Var, null);
                }
                return a83Var;
            case 2:
                t91Var.f10639r.m438z(((wx0) obj).f12704a);
                return a83Var;
            case 3:
                return Boolean.valueOf(t91Var.f10639r.m438z(((wx0) obj).f12704a));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                t91Var.f10638q.setValue(bool);
                return a83Var;
        }
    }
}
