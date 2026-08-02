package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qo1 implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f9055h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f9056i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f9057j;

    public /* synthetic */ qo1(int i, String str, boolean z) {
        this.f9055h = i;
        this.f9056i = str;
        this.f9057j = z;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        long jM2565b;
        int i = this.f9055h;
        a83 a83Var = a83.f116a;
        boolean z = this.f9057j;
        switch (i) {
            case 0:
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(1 & iIntValue, (iIntValue & 3) != 2)) {
                    go0Var.m1961R();
                } else {
                    if (z) {
                        go0Var.m1966W(1571240306);
                        jM2565b = ((lp1) go0Var.m1988j(ur1.f11452a)).f6238f;
                        go0Var.m1994p(false);
                    } else {
                        go0Var.m1966W(1571316318);
                        jM2565b = C0363ju.m2565b(0.45f, ((lp1) go0Var.m1988j(ur1.f11452a)).f6238f);
                        go0Var.m1994p(false);
                    }
                    AbstractC0179eu.m1446a(this.f9056i, null, new m13(jM2565b, rg3.m4450D(14), im0.f4682l, 0L, 0, 0L, null, null, 16777208), 0, false, 0, 0, go0Var, 0, 1018);
                }
                break;
            default:
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                go0 go0Var2 = (go0) interfaceC0596px2;
                if (!go0Var2.m1958O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    go0Var2.m1961R();
                } else {
                    AbstractC0179eu.m1446a(this.f9056i, null, new m13(C0363ju.m2565b(z ? 1.0f : 0.45f, ((lp1) go0Var2.m1988j(ur1.f11452a)).f6239g), rg3.m4450D(14), im0.f4683m, 0L, 0, 0L, null, null, 16777208), 0, false, 0, 0, go0Var2, 0, 1018);
                }
                break;
        }
        return a83Var;
    }
}
