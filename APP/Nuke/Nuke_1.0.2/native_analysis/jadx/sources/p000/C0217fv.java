package p000;

/* JADX INFO: renamed from: fv */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0217fv implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3144h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ b03 f3145i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0402kw f3146j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f3147k;

    public /* synthetic */ C0217fv(b03 b03Var, C0402kw c0402kw, int i, int i2) {
        this.f3144h = i2;
        this.f3145i = b03Var;
        this.f3146j = c0402kw;
        this.f3147k = i;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f3144h;
        a83 a83Var = a83.f116a;
        int i2 = this.f3147k;
        C0402kw c0402kw = this.f3146j;
        b03 b03Var = this.f3145i;
        InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                t11.m5076b(b03Var, c0402kw, interfaceC0596px, pp0.m3902N(i2 | 1));
                break;
            default:
                s11.m4692f(b03Var, c0402kw, interfaceC0596px, pp0.m3902N(i2 | 1));
                break;
        }
        return a83Var;
    }
}
