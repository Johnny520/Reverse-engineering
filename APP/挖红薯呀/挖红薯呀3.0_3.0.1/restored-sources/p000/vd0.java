package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class vd0 extends c50 implements InterfaceC0298hw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f6662d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ wd0 f6663e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vd0(wd0 wd0Var, int i) {
        super(0);
        this.f6662d = i;
        this.f6663e = wd0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0298hw
    public final Object invoke() {
        wq0 placementScope;
        int i = this.f6662d;
        na1 na1Var = na1.f4229a;
        wd0 wd0Var = this.f6663e;
        switch (i) {
            case 0:
                f60 f60Var = wd0Var.f7095i;
                f60Var.f1600i = 0;
                sh0 sh0VarM319z = f60Var.f1592a.m319z();
                Object[] objArr = sh0VarM319z.f5768d;
                int i2 = sh0VarM319z.f5770f;
                for (int i3 = 0; i3 < i2; i3++) {
                    wd0 wd0Var2 = ((b60) objArr[i3]).f396J.f1607p;
                    wd0Var2.f7097k = wd0Var2.f7098l;
                    wd0Var2.f7098l = Integer.MAX_VALUE;
                    wd0Var2.f7108v = false;
                    if (wd0Var2.f7101o == z50.f7801e) {
                        wd0Var2.f7101o = z50.f7802f;
                    }
                }
                b60 b60Var = f60Var.f1592a;
                b60 b60Var2 = f60Var.f1592a;
                sh0 sh0VarM319z2 = b60Var.m319z();
                Object[] objArr2 = sh0VarM319z2.f5768d;
                int i4 = sh0VarM319z2.f5770f;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((b60) objArr2[i5]).f396J.f1607p.f7112z.getClass();
                }
                if (wd0Var.mo840r().f7597n) {
                    ph0 ph0Var = (ph0) b60Var2.m307n();
                    int i6 = ph0Var.f4858d.f5770f;
                    for (int i7 = 0; i7 < i6; i7++) {
                        ((b60) ph0Var.get(i7)).f395I.f3996d.f7597n = true;
                    }
                }
                wd0Var.mo840r().mo56o0().mo668b();
                if (wd0Var.mo840r().f7597n) {
                    ph0 ph0Var2 = (ph0) b60Var2.m307n();
                    int i8 = ph0Var2.f4858d.f5770f;
                    for (int i9 = 0; i9 < i8; i9++) {
                        ((b60) ph0Var2.get(i9)).f395I.f3996d.f7597n = false;
                    }
                }
                sh0 sh0VarM319z3 = b60Var2.m319z();
                Object[] objArr3 = sh0VarM319z3.f5768d;
                int i10 = sh0VarM319z3.f5770f;
                for (int i11 = 0; i11 < i10; i11++) {
                    b60 b60Var3 = (b60) objArr3[i11];
                    f60 f60Var2 = b60Var3.f396J;
                    if (f60Var2.f1607p.f7097k != b60Var3.m316w()) {
                        b60Var2.m279O();
                        b60Var2.m267C();
                        if (b60Var3.m316w() == Integer.MAX_VALUE) {
                            if (f60Var2.f1594c || g60.m1217p(b60Var3)) {
                                ec0 ec0Var = f60Var2.f1608q;
                                ec0Var.getClass();
                                ec0Var.m832c0(false);
                            }
                            f60Var2.f1607p.m5005d0();
                        }
                    }
                }
                sh0 sh0VarM319z4 = b60Var2.m319z();
                Object[] objArr4 = sh0VarM319z4.f5768d;
                int i12 = sh0VarM319z4.f5770f;
                for (int i13 = 0; i13 < i12; i13++) {
                    c60 c60Var = ((b60) objArr4[i13]).f396J.f1607p.f7112z;
                    c60Var.getClass();
                    c60Var.f709c = false;
                }
                break;
            case 1:
                wd0Var.f7095i.m1032a().mo184e(wd0Var.f7085D);
                break;
            default:
                f60 f60Var3 = wd0Var.f7095i;
                qj0 qj0Var = f60Var3.m1032a().f5182t;
                if (qj0Var == null || (placementScope = qj0Var.f7598o) == null) {
                    placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) e60.m789a(f60Var3.f1592a)).getPlacementScope();
                }
                InterfaceC0742sw interfaceC0742sw = wd0Var.f7090I;
                if (interfaceC0742sw == null) {
                    qj0 qj0VarM1032a = f60Var3.m1032a();
                    long j = wd0Var.f7091J;
                    float f = wd0Var.f7092K;
                    placementScope.getClass();
                    wq0.m5014a(placementScope, qj0VarM1032a);
                    qj0VarM1032a.mo47X(w20.m4835c(j, qj0VarM1032a.f7404h), f, null);
                } else {
                    qj0 qj0VarM1032a2 = f60Var3.m1032a();
                    long j2 = wd0Var.f7091J;
                    float f2 = wd0Var.f7092K;
                    placementScope.getClass();
                    wq0.m5014a(placementScope, qj0VarM1032a2);
                    qj0VarM1032a2.mo47X(w20.m4835c(j2, qj0VarM1032a2.f7404h), f2, interfaceC0742sw);
                }
                break;
        }
        return na1Var;
    }
}
