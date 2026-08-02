package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m10 implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f6430h = 0;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f6431i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f6432j;

    public /* synthetic */ m10(b03 b03Var, boolean z, int i) {
        this.f6432j = b03Var;
        this.f6431i = z;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f6430h;
        a83 a83Var = a83.f116a;
        Object obj3 = this.f6432j;
        boolean z = this.f6431i;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                gf1.m1883c((b03) obj3, z, (InterfaceC0596px) obj, pp0.m3902N(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                xe1.m6109a(z, (mn0) obj3, (InterfaceC0596px) obj, pp0.m3902N(1));
                break;
            default:
                C0402kw c0402kw = (C0402kw) obj3;
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.m1961R();
                } else {
                    ci0.m800a(AbstractC0437lu.f6324i.mo1251a(z ? AbstractC0437lu.f6323h : AbstractC0437lu.f6322g), c0402kw, go0Var, 8);
                }
                break;
        }
        return a83Var;
    }

    public /* synthetic */ m10(boolean z, C0402kw c0402kw) {
        this.f6431i = z;
        this.f6432j = c0402kw;
    }

    public /* synthetic */ m10(boolean z, mn0 mn0Var, int i) {
        this.f6431i = z;
        this.f6432j = mn0Var;
    }
}
