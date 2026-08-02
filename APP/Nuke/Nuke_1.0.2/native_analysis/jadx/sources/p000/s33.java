package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s33 implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f9900h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ y33 f9901i;

    public /* synthetic */ s33(y33 y33Var, int i) {
        this.f9900h = i;
        this.f9901i = y33Var;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int i = this.f9900h;
        y33 y33Var = this.f9901i;
        switch (i) {
            case 0:
                return Boolean.valueOf((t11.m5086l(y33Var.f13292d.getValue(), y33Var.m6213c()) && y33Var.f13295g.m2984g() == Long.MIN_VALUE && !((Boolean) y33Var.f13296h.getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(y33Var.m6212b());
        }
    }
}
