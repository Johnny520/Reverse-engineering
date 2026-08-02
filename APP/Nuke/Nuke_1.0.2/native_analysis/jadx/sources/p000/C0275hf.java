package p000;

/* JADX INFO: renamed from: hf */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0275hf implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3982h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ in0 f3983i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ c73 f3984j;

    public /* synthetic */ C0275hf(in0 in0Var, c73 c73Var, int i) {
        this.f3982h = i;
        this.f3983i = in0Var;
        this.f3984j = c73Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f3982h;
        a83 a83Var = a83.f116a;
        in0 in0Var = this.f3983i;
        switch (i) {
            case 0:
                x51 x51Var = (x51) obj;
                x51Var.getClass();
                in0Var.mo5j(c73.m662a(this.f3984j, 0, x51Var.f12817h, false, null, 13));
                break;
            case 1:
                EnumC0578pf enumC0578pf = (EnumC0578pf) obj;
                enumC0578pf.getClass();
                in0Var.mo5j(c73.m662a(this.f3984j, enumC0578pf.f8295h, 0, false, null, 14));
                break;
            default:
                in0Var.mo5j(c73.m662a(this.f3984j, 0, 0, ((Boolean) obj).booleanValue(), null, 11));
                break;
        }
        return a83Var;
    }
}
