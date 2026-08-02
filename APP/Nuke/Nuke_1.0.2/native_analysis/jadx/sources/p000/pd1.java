package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pd1 extends w51 implements xm0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f8261i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ qd1 f8262j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pd1(qd1 qd1Var, int i) {
        super(0);
        this.f8261i = i;
        this.f8262j = qd1Var;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        md1 md1VarMo2842Q0;
        int i = this.f8261i;
        a83 a83Var = a83.f116a;
        qd1 qd1Var = this.f8262j;
        switch (i) {
            case 0:
                v61 v61Var = qd1Var.f8907m;
                v61Var.f11787h = 0;
                zk1 zk1VarM4393y = v61Var.f11780a.m4393y();
                Object[] objArr = zk1VarM4393y.f13934h;
                int i2 = zk1VarM4393y.f13936j;
                for (int i3 = 0; i3 < i2; i3++) {
                    qd1 qd1Var2 = ((r61) objArr[i3]).f9373N.f11796q;
                    qd1Var2.getClass();
                    qd1Var2.f8909o = qd1Var2.f8910p;
                    qd1Var2.f8910p = Integer.MAX_VALUE;
                    if (qd1Var2.f8911q == p61.f7986i) {
                        qd1Var2.f8911q = p61.f7987j;
                    }
                }
                r61 r61Var = v61Var.f11780a;
                r61 r61Var2 = v61Var.f11780a;
                zk1 zk1VarM4393y2 = r61Var.m4393y();
                Object[] objArr2 = zk1VarM4393y2.f13934h;
                int i4 = zk1VarM4393y2.f13936j;
                for (int i5 = 0; i5 < i4; i5++) {
                    qd1 qd1Var3 = ((r61) objArr2[i5]).f9373N.f11796q;
                    qd1Var3.getClass();
                    qd1Var3.f8918x.getClass();
                }
                pz0 pz0Var = qd1Var.mo3075n().f9294Z;
                if (pz0Var != null) {
                    boolean z = pz0Var.f5468r;
                    jk1 jk1Var = (jk1) r61Var2.m4382n();
                    int i6 = ((zk1) jk1Var.f5084i).f13936j;
                    for (int i7 = 0; i7 < i6; i7++) {
                        md1 md1VarMo2842Q02 = ((zn1) ((r61) jk1Var.get(i7)).f9372M.f12034e).mo2842Q0();
                        if (md1VarMo2842Q02 != null) {
                            md1VarMo2842Q02.f5468r = z;
                        }
                    }
                }
                pz0 pz0Var2 = qd1Var.mo3075n().f9294Z;
                pz0Var2.getClass();
                pz0Var2.mo2630A0().mo105b();
                if (qd1Var.mo3075n().f9294Z != null) {
                    jk1 jk1Var2 = (jk1) r61Var2.m4382n();
                    int i8 = ((zk1) jk1Var2.f5084i).f13936j;
                    for (int i9 = 0; i9 < i8; i9++) {
                        md1 md1VarMo2842Q03 = ((zn1) ((r61) jk1Var2.get(i9)).f9372M.f12034e).mo2842Q0();
                        if (md1VarMo2842Q03 != null) {
                            md1VarMo2842Q03.f5468r = false;
                        }
                    }
                }
                zk1 zk1VarM4393y3 = r61Var2.m4393y();
                Object[] objArr3 = zk1VarM4393y3.f13934h;
                int i10 = zk1VarM4393y3.f13936j;
                for (int i11 = 0; i11 < i10; i11++) {
                    qd1 qd1Var4 = ((r61) objArr3[i11]).f9373N.f11796q;
                    qd1Var4.getClass();
                    int i12 = qd1Var4.f8909o;
                    int i13 = qd1Var4.f8910p;
                    if (i12 != i13 && i13 == Integer.MAX_VALUE) {
                        qd1Var4.m4140m0(true);
                    }
                }
                zk1 zk1VarM4393y4 = r61Var2.m4393y();
                Object[] objArr4 = zk1VarM4393y4.f13934h;
                int i14 = zk1VarM4393y4.f13936j;
                for (int i15 = 0; i15 < i14; i15++) {
                    qd1 qd1Var5 = ((r61) objArr4[i15]).f9373N.f11796q;
                    qd1Var5.getClass();
                    s61 s61Var = qd1Var5.f8918x;
                    s61Var.getClass();
                    s61Var.f9938c = false;
                }
                break;
            case 1:
                v61 v61Var2 = qd1Var.f8907m;
                rz1 placementScope = null;
                if (fg1.m1651z(v61Var2.f11780a) || v61Var2.f11782c) {
                    zn1 zn1Var = v61Var2.m5627a().f13987x;
                    if (zn1Var != null) {
                        placementScope = zn1Var.f5469s;
                    }
                } else {
                    zn1 zn1Var2 = v61Var2.m5627a().f13987x;
                    if (zn1Var2 != null && (md1VarMo2842Q0 = zn1Var2.mo2842Q0()) != null) {
                        placementScope = md1VarMo2842Q0.f5469s;
                    }
                }
                if (placementScope == null) {
                    placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) u61.m5471a(v61Var2.f11780a)).getPlacementScope();
                }
                md1 md1VarMo2842Q04 = v61Var2.m5627a().mo2842Q0();
                md1VarMo2842Q04.getClass();
                rz1.m4640h(placementScope, md1VarMo2842Q04, qd1Var.f8915u);
                break;
            default:
                md1 md1VarMo2842Q05 = qd1Var.f8907m.m5627a().mo2842Q0();
                md1VarMo2842Q05.getClass();
                md1VarMo2842Q05.mo2340e(qd1Var.f8903E);
                break;
        }
        return a83Var;
    }
}
