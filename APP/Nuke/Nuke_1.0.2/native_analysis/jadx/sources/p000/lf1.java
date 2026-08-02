package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lf1 extends w51 implements xm0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f6097i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ mf1 f6098j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lf1(mf1 mf1Var, int i) {
        super(0);
        this.f6097i = i;
        this.f6098j = mf1Var;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        rz1 placementScope;
        int i = this.f6097i;
        a83 a83Var = a83.f116a;
        mf1 mf1Var = this.f6098j;
        switch (i) {
            case 0:
                v61 v61Var = mf1Var.f6618m;
                v61Var.f11788i = 0;
                zk1 zk1VarM4393y = v61Var.f11780a.m4393y();
                Object[] objArr = zk1VarM4393y.f13934h;
                int i2 = zk1VarM4393y.f13936j;
                for (int i3 = 0; i3 < i2; i3++) {
                    mf1 mf1Var2 = ((r61) objArr[i3]).f9373N.f11795p;
                    mf1Var2.f6620o = mf1Var2.f6621p;
                    mf1Var2.f6621p = Integer.MAX_VALUE;
                    mf1Var2.f6631z = false;
                    if (mf1Var2.f6624s == p61.f7986i) {
                        mf1Var2.f6624s = p61.f7987j;
                    }
                }
                r61 r61Var = v61Var.f11780a;
                r61 r61Var2 = v61Var.f11780a;
                zk1 zk1VarM4393y2 = r61Var.m4393y();
                Object[] objArr2 = zk1VarM4393y2.f13934h;
                int i4 = zk1VarM4393y2.f13936j;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((r61) objArr2[i5]).f9373N.f11795p.f6604D.getClass();
                }
                if (mf1Var.mo3075n().f5468r) {
                    jk1 jk1Var = (jk1) r61Var2.m4382n();
                    int i6 = ((zk1) jk1Var.f5084i).f13936j;
                    for (int i7 = 0; i7 < i6; i7++) {
                        ((zn1) ((r61) jk1Var.get(i7)).f9372M.f12034e).f5468r = true;
                    }
                }
                mf1Var.mo3075n().mo2630A0().mo105b();
                if (mf1Var.mo3075n().f5468r) {
                    jk1 jk1Var2 = (jk1) r61Var2.m4382n();
                    int i8 = ((zk1) jk1Var2.f5084i).f13936j;
                    for (int i9 = 0; i9 < i8; i9++) {
                        ((zn1) ((r61) jk1Var2.get(i9)).f9372M.f12034e).f5468r = false;
                    }
                }
                zk1 zk1VarM4393y3 = r61Var2.m4393y();
                Object[] objArr3 = zk1VarM4393y3.f13934h;
                int i10 = zk1VarM4393y3.f13936j;
                for (int i11 = 0; i11 < i10; i11++) {
                    r61 r61Var3 = (r61) objArr3[i11];
                    v61 v61Var2 = r61Var3.f9373N;
                    if (v61Var2.f11795p.f6620o != r61Var3.m4390v()) {
                        r61Var2.m4357O();
                        r61Var2.m4345C();
                        if (r61Var3.m4390v() == Integer.MAX_VALUE) {
                            if (v61Var2.f11782c || fg1.m1651z(r61Var3)) {
                                qd1 qd1Var = v61Var2.f11796q;
                                qd1Var.getClass();
                                qd1Var.m4140m0(false);
                            }
                            v61Var2.f11795p.m3076n0();
                        }
                    }
                }
                zk1 zk1VarM4393y4 = r61Var2.m4393y();
                Object[] objArr4 = zk1VarM4393y4.f13934h;
                int i12 = zk1VarM4393y4.f13936j;
                for (int i13 = 0; i13 < i12; i13++) {
                    s61 s61Var = ((r61) objArr4[i13]).f9373N.f11795p.f6604D;
                    s61Var.getClass();
                    s61Var.f9938c = false;
                }
                break;
            case 1:
                mf1Var.f6618m.m5627a().mo2340e(mf1Var.f6608H);
                break;
            default:
                v61 v61Var3 = mf1Var.f6618m;
                zn1 zn1Var = v61Var3.m5627a().f13987x;
                if (zn1Var == null || (placementScope = zn1Var.f5469s) == null) {
                    placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) u61.m5471a(v61Var3.f11780a)).getPlacementScope();
                }
                in0 in0Var = mf1Var.f6613M;
                if (in0Var == null) {
                    zn1 zn1VarM5627a = v61Var3.m5627a();
                    long j = mf1Var.f6614N;
                    float f = mf1Var.f6615O;
                    placementScope.getClass();
                    rz1.m4638a(placementScope, zn1VarM5627a);
                    zn1VarM5627a.mo2506f0(z01.m6373c(j, zn1VarM5627a.f10442l), f, null);
                } else {
                    zn1 zn1VarM5627a2 = v61Var3.m5627a();
                    long j2 = mf1Var.f6614N;
                    float f2 = mf1Var.f6615O;
                    placementScope.getClass();
                    rz1.m4638a(placementScope, zn1VarM5627a2);
                    zn1VarM5627a2.mo2506f0(z01.m6373c(j2, zn1VarM5627a2.f10442l), f2, in0Var);
                }
                break;
        }
        return a83Var;
    }
}
