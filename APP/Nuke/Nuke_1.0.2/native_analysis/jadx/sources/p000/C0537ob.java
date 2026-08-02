package p000;

/* JADX INFO: renamed from: ob */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0537ob implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f7604h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ uh1 f7605i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0402kw f7606j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f7607k;

    public /* synthetic */ C0537ob(uh1 uh1Var, C0402kw c0402kw, int i, int i2) {
        this.f7604h = i2;
        this.f7605i = uh1Var;
        this.f7606j = c0402kw;
        this.f7607k = i;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f7604h;
        a83 a83Var = a83.f116a;
        int i2 = this.f7607k;
        C0402kw c0402kw = this.f7606j;
        uh1 uh1Var = this.f7605i;
        InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC0179eu.m1465o(uh1Var, c0402kw, interfaceC0596px, pp0.m3902N(i2 | 1));
                break;
            case 1:
                AbstractC0179eu.m1466p(uh1Var, c0402kw, interfaceC0596px, pp0.m3902N(i2 | 1));
                break;
            case 2:
                k60.m2609d(uh1Var, c0402kw, interfaceC0596px, pp0.m3902N(i2 | 1));
                break;
            case 3:
                rp0.m4525K(uh1Var, c0402kw, interfaceC0596px, pp0.m3902N(i2 | 1));
                break;
            default:
                rp0.m4524J(uh1Var, c0402kw, interfaceC0596px, pp0.m3902N(i2 | 1));
                break;
        }
        return a83Var;
    }
}
