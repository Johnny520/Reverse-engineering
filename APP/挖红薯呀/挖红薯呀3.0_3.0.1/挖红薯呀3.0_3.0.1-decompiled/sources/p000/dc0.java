package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class dc0 extends c50 implements InterfaceC0298hw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1049d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ec0 f1050e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dc0(ec0 ec0Var, int i) {
        super(0);
        this.f1049d = i;
        this.f1050e = ec0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0298hw
    public final Object invoke() {
        ac0 ac0VarMo435E0;
        int i = this.f1049d;
        na1 na1Var = na1.f4229a;
        ec0 ec0Var = this.f1050e;
        switch (i) {
            case 0:
                f60 f60Var = ec0Var.f1377i;
                f60Var.f1599h = 0;
                sh0 sh0VarM319z = f60Var.f1592a.m319z();
                Object[] objArr = sh0VarM319z.f5768d;
                int i2 = sh0VarM319z.f5770f;
                for (int i3 = 0; i3 < i2; i3++) {
                    ec0 ec0Var2 = ((b60) objArr[i3]).f396J.f1608q;
                    ec0Var2.getClass();
                    ec0Var2.f1379k = ec0Var2.f1380l;
                    ec0Var2.f1380l = Integer.MAX_VALUE;
                    if (ec0Var2.f1381m == z50.f7801e) {
                        ec0Var2.f1381m = z50.f7802f;
                    }
                }
                b60 b60Var = f60Var.f1592a;
                b60 b60Var2 = f60Var.f1592a;
                sh0 sh0VarM319z2 = b60Var.m319z();
                Object[] objArr2 = sh0VarM319z2.f5768d;
                int i4 = sh0VarM319z2.f5770f;
                for (int i5 = 0; i5 < i4; i5++) {
                    ec0 ec0Var3 = ((b60) objArr2[i5]).f396J.f1608q;
                    ec0Var3.getClass();
                    ec0Var3.f1388t.getClass();
                }
                b20 b20Var = ec0Var.mo840r().f644U;
                if (b20Var != null) {
                    boolean z = b20Var.f7597n;
                    ph0 ph0Var = (ph0) b60Var2.m307n();
                    int i6 = ph0Var.f4858d.f5770f;
                    for (int i7 = 0; i7 < i6; i7++) {
                        ac0 ac0VarMo435E02 = ((b60) ph0Var.get(i7)).f395I.f3996d.mo435E0();
                        if (ac0VarMo435E02 != null) {
                            ac0VarMo435E02.f7597n = z;
                        }
                    }
                }
                b20 b20Var2 = ec0Var.mo840r().f644U;
                b20Var2.getClass();
                b20Var2.mo56o0().mo668b();
                if (ec0Var.mo840r().f644U != null) {
                    ph0 ph0Var2 = (ph0) b60Var2.m307n();
                    int i8 = ph0Var2.f4858d.f5770f;
                    for (int i9 = 0; i9 < i8; i9++) {
                        ac0 ac0VarMo435E03 = ((b60) ph0Var2.get(i9)).f395I.f3996d.mo435E0();
                        if (ac0VarMo435E03 != null) {
                            ac0VarMo435E03.f7597n = false;
                        }
                    }
                }
                sh0 sh0VarM319z3 = b60Var2.m319z();
                Object[] objArr3 = sh0VarM319z3.f5768d;
                int i10 = sh0VarM319z3.f5770f;
                for (int i11 = 0; i11 < i10; i11++) {
                    ec0 ec0Var4 = ((b60) objArr3[i11]).f396J.f1608q;
                    ec0Var4.getClass();
                    int i12 = ec0Var4.f1379k;
                    int i13 = ec0Var4.f1380l;
                    if (i12 != i13 && i13 == Integer.MAX_VALUE) {
                        ec0Var4.m832c0(true);
                    }
                }
                sh0 sh0VarM319z4 = b60Var2.m319z();
                Object[] objArr4 = sh0VarM319z4.f5768d;
                int i14 = sh0VarM319z4.f5770f;
                for (int i15 = 0; i15 < i14; i15++) {
                    ec0 ec0Var5 = ((b60) objArr4[i15]).f396J.f1608q;
                    ec0Var5.getClass();
                    c60 c60Var = ec0Var5.f1388t;
                    c60Var.getClass();
                    c60Var.f709c = false;
                }
                break;
            case 1:
                f60 f60Var2 = ec0Var.f1377i;
                wq0 placementScope = null;
                if (g60.m1217p(f60Var2.f1592a) || f60Var2.f1594c) {
                    qj0 qj0Var = f60Var2.m1032a().f5182t;
                    if (qj0Var != null) {
                        placementScope = qj0Var.f7598o;
                    }
                } else {
                    qj0 qj0Var2 = f60Var2.m1032a().f5182t;
                    if (qj0Var2 != null && (ac0VarMo435E0 = qj0Var2.mo435E0()) != null) {
                        placementScope = ac0VarMo435E0.f7598o;
                    }
                }
                if (placementScope == null) {
                    placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) e60.m789a(f60Var2.f1592a)).getPlacementScope();
                }
                ac0 ac0VarMo435E04 = f60Var2.m1032a().mo435E0();
                ac0VarMo435E04.getClass();
                wq0.m5016j(placementScope, ac0VarMo435E04, ec0Var.f1385q);
                break;
            default:
                ac0 ac0VarMo435E05 = ec0Var.f1377i.m1032a().mo435E0();
                ac0VarMo435E05.getClass();
                ac0VarMo435E05.mo184e(ec0Var.f1373A);
                break;
        }
        return na1Var;
    }
}
