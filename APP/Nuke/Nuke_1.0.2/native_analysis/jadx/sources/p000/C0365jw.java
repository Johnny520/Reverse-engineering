package p000;

/* JADX INFO: renamed from: jw */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0365jw extends AbstractC0375k5 implements mn0 {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f5237o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0365jw(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.f5237o = i3;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f5237o;
        a83 a83Var = a83.f116a;
        Object obj3 = this.f5339h;
        switch (i) {
            case 0:
                C0402kw c0402kw = (C0402kw) obj3;
                c0402kw.m2745d(((Number) obj2).intValue(), (InterfaceC0596px) obj);
                break;
            case 1:
                am2 am2Var = (am2) obj3;
                AbstractC0570p7.m3745A(am2Var.f274S.m5331c(), null, new yl2(am2Var, ((da3) obj).f1950a, null, 2), 3);
                break;
            default:
                am2 am2Var2 = (am2) obj3;
                AbstractC0570p7.m3745A(am2Var2.f274S.m5331c(), null, new yl2(am2Var2, ((da3) obj).f1950a, null, 1), 3);
                break;
        }
        return a83Var;
    }
}
