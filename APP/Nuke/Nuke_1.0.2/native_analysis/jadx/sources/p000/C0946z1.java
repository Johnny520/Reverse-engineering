package p000;

/* JADX INFO: renamed from: z1 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0946z1 implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f13700h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f13701i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ uh1 f13702j;

    public /* synthetic */ C0946z1(String str, uh1 uh1Var, int i, int i2) {
        this.f13700h = i2;
        this.f13701i = str;
        this.f13702j = uh1Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f13700h;
        a83 a83Var = a83.f116a;
        uh1 uh1Var = this.f13702j;
        String str = this.f13701i;
        InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC0731te.m5198a(str, uh1Var, interfaceC0596px, pp0.m3902N(49));
                break;
            default:
                ci0.m816q(str, uh1Var, interfaceC0596px, pp0.m3902N(1));
                break;
        }
        return a83Var;
    }
}
