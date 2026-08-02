package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w60 implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f12363h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ x60 f12364i;

    public /* synthetic */ w60(x60 x60Var, int i) {
        this.f12363h = i;
        this.f12364i = x60Var;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int i = this.f12363h;
        x60 x60Var = this.f12364i;
        switch (i) {
            case 0:
                pa2 pa2Var = (pa2) p40.m3733p(x60Var, sa2.f10013a);
                C0766ua c0766ua = x60Var.f12838B;
                if (pa2Var == null) {
                    if (c0766ua != null) {
                        x60Var.m5469N0(c0766ua);
                    }
                    x60Var.f12838B = null;
                } else if (c0766ua == null) {
                    C0485n4 c0485n4 = new C0485n4(10, x60Var);
                    w60 w60Var = new w60(x60Var, 1);
                    bk1 bk1Var = x60Var.f12839x;
                    boolean z = x60Var.f12840y;
                    float f = x60Var.f12841z;
                    m43 m43Var = ta2.f10657a;
                    C0766ua c0766ua2 = new C0766ua(bk1Var, z, f, c0485n4, w60Var);
                    x60Var.m5468M0(c0766ua2);
                    x60Var.f12838B = c0766ua2;
                }
                return a83.f116a;
            default:
                return tp0.f10885l;
        }
    }
}
