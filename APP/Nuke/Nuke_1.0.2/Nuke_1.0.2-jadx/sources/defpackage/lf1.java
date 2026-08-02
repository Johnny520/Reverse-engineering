package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lf1 extends w51 implements xm0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ mf1 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lf1(mf1 mf1Var, int i) {
        super(0);
        this.i = i;
        this.j = mf1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        rz1 placementScope;
        int i = this.i;
        a83 a83Var = a83.a;
        mf1 mf1Var = this.j;
        switch (i) {
            case 0:
                v61 v61Var = mf1Var.m;
                v61Var.i = 0;
                zk1 zk1VarY = v61Var.a.y();
                Object[] objArr = zk1VarY.h;
                int i2 = zk1VarY.j;
                for (int i3 = 0; i3 < i2; i3++) {
                    mf1 mf1Var2 = ((r61) objArr[i3]).N.p;
                    mf1Var2.o = mf1Var2.p;
                    mf1Var2.p = Integer.MAX_VALUE;
                    mf1Var2.z = false;
                    if (mf1Var2.s == p61.i) {
                        mf1Var2.s = p61.j;
                    }
                }
                r61 r61Var = v61Var.a;
                r61 r61Var2 = v61Var.a;
                zk1 zk1VarY2 = r61Var.y();
                Object[] objArr2 = zk1VarY2.h;
                int i4 = zk1VarY2.j;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((r61) objArr2[i5]).N.p.D.getClass();
                }
                if (mf1Var.n().r) {
                    jk1 jk1Var = (jk1) r61Var2.n();
                    int i6 = ((zk1) jk1Var.i).j;
                    for (int i7 = 0; i7 < i6; i7++) {
                        ((zn1) ((r61) jk1Var.get(i7)).M.e).r = true;
                    }
                }
                mf1Var.n().A0().b();
                if (mf1Var.n().r) {
                    jk1 jk1Var2 = (jk1) r61Var2.n();
                    int i8 = ((zk1) jk1Var2.i).j;
                    for (int i9 = 0; i9 < i8; i9++) {
                        ((zn1) ((r61) jk1Var2.get(i9)).M.e).r = false;
                    }
                }
                zk1 zk1VarY3 = r61Var2.y();
                Object[] objArr3 = zk1VarY3.h;
                int i10 = zk1VarY3.j;
                for (int i11 = 0; i11 < i10; i11++) {
                    r61 r61Var3 = (r61) objArr3[i11];
                    v61 v61Var2 = r61Var3.N;
                    if (v61Var2.p.o != r61Var3.v()) {
                        r61Var2.O();
                        r61Var2.C();
                        if (r61Var3.v() == Integer.MAX_VALUE) {
                            if (v61Var2.c || fg1.z(r61Var3)) {
                                qd1 qd1Var = v61Var2.q;
                                qd1Var.getClass();
                                qd1Var.m0(false);
                            }
                            v61Var2.p.n0();
                        }
                    }
                }
                zk1 zk1VarY4 = r61Var2.y();
                Object[] objArr4 = zk1VarY4.h;
                int i12 = zk1VarY4.j;
                for (int i13 = 0; i13 < i12; i13++) {
                    s61 s61Var = ((r61) objArr4[i13]).N.p.D;
                    s61Var.getClass();
                    s61Var.c = false;
                }
                break;
            case 1:
                mf1Var.m.a().e(mf1Var.H);
                break;
            default:
                v61 v61Var3 = mf1Var.m;
                zn1 zn1Var = v61Var3.a().x;
                if (zn1Var == null || (placementScope = zn1Var.s) == null) {
                    placementScope = ((b7) u61.a(v61Var3.a)).getPlacementScope();
                }
                in0 in0Var = mf1Var.M;
                if (in0Var == null) {
                    zn1 zn1VarA = v61Var3.a();
                    long j = mf1Var.N;
                    float f = mf1Var.O;
                    placementScope.getClass();
                    rz1.a(placementScope, zn1VarA);
                    zn1VarA.f0(z01.c(j, zn1VarA.l), f, null);
                } else {
                    zn1 zn1VarA2 = v61Var3.a();
                    long j2 = mf1Var.N;
                    float f2 = mf1Var.O;
                    placementScope.getClass();
                    rz1.a(placementScope, zn1VarA2);
                    zn1VarA2.f0(z01.c(j2, zn1VarA2.l), f2, in0Var);
                }
                break;
        }
        return a83Var;
    }
}
