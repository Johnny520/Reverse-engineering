package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pd1 extends w51 implements xm0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ qd1 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pd1(qd1 qd1Var, int i) {
        super(0);
        this.i = i;
        this.j = qd1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        md1 md1VarQ0;
        int i = this.i;
        a83 a83Var = a83.a;
        qd1 qd1Var = this.j;
        switch (i) {
            case 0:
                v61 v61Var = qd1Var.m;
                v61Var.h = 0;
                zk1 zk1VarY = v61Var.a.y();
                Object[] objArr = zk1VarY.h;
                int i2 = zk1VarY.j;
                for (int i3 = 0; i3 < i2; i3++) {
                    qd1 qd1Var2 = ((r61) objArr[i3]).N.q;
                    qd1Var2.getClass();
                    qd1Var2.o = qd1Var2.p;
                    qd1Var2.p = Integer.MAX_VALUE;
                    if (qd1Var2.q == p61.i) {
                        qd1Var2.q = p61.j;
                    }
                }
                r61 r61Var = v61Var.a;
                r61 r61Var2 = v61Var.a;
                zk1 zk1VarY2 = r61Var.y();
                Object[] objArr2 = zk1VarY2.h;
                int i4 = zk1VarY2.j;
                for (int i5 = 0; i5 < i4; i5++) {
                    qd1 qd1Var3 = ((r61) objArr2[i5]).N.q;
                    qd1Var3.getClass();
                    qd1Var3.x.getClass();
                }
                pz0 pz0Var = qd1Var.n().Z;
                if (pz0Var != null) {
                    boolean z = pz0Var.r;
                    jk1 jk1Var = (jk1) r61Var2.n();
                    int i6 = ((zk1) jk1Var.i).j;
                    for (int i7 = 0; i7 < i6; i7++) {
                        md1 md1VarQ02 = ((zn1) ((r61) jk1Var.get(i7)).M.e).Q0();
                        if (md1VarQ02 != null) {
                            md1VarQ02.r = z;
                        }
                    }
                }
                pz0 pz0Var2 = qd1Var.n().Z;
                pz0Var2.getClass();
                pz0Var2.A0().b();
                if (qd1Var.n().Z != null) {
                    jk1 jk1Var2 = (jk1) r61Var2.n();
                    int i8 = ((zk1) jk1Var2.i).j;
                    for (int i9 = 0; i9 < i8; i9++) {
                        md1 md1VarQ03 = ((zn1) ((r61) jk1Var2.get(i9)).M.e).Q0();
                        if (md1VarQ03 != null) {
                            md1VarQ03.r = false;
                        }
                    }
                }
                zk1 zk1VarY3 = r61Var2.y();
                Object[] objArr3 = zk1VarY3.h;
                int i10 = zk1VarY3.j;
                for (int i11 = 0; i11 < i10; i11++) {
                    qd1 qd1Var4 = ((r61) objArr3[i11]).N.q;
                    qd1Var4.getClass();
                    int i12 = qd1Var4.o;
                    int i13 = qd1Var4.p;
                    if (i12 != i13 && i13 == Integer.MAX_VALUE) {
                        qd1Var4.m0(true);
                    }
                }
                zk1 zk1VarY4 = r61Var2.y();
                Object[] objArr4 = zk1VarY4.h;
                int i14 = zk1VarY4.j;
                for (int i15 = 0; i15 < i14; i15++) {
                    qd1 qd1Var5 = ((r61) objArr4[i15]).N.q;
                    qd1Var5.getClass();
                    s61 s61Var = qd1Var5.x;
                    s61Var.getClass();
                    s61Var.c = false;
                }
                break;
            case 1:
                v61 v61Var2 = qd1Var.m;
                rz1 placementScope = null;
                if (fg1.z(v61Var2.a) || v61Var2.c) {
                    zn1 zn1Var = v61Var2.a().x;
                    if (zn1Var != null) {
                        placementScope = zn1Var.s;
                    }
                } else {
                    zn1 zn1Var2 = v61Var2.a().x;
                    if (zn1Var2 != null && (md1VarQ0 = zn1Var2.Q0()) != null) {
                        placementScope = md1VarQ0.s;
                    }
                }
                if (placementScope == null) {
                    placementScope = ((b7) u61.a(v61Var2.a)).getPlacementScope();
                }
                md1 md1VarQ04 = v61Var2.a().Q0();
                md1VarQ04.getClass();
                rz1.h(placementScope, md1VarQ04, qd1Var.u);
                break;
            default:
                md1 md1VarQ05 = qd1Var.m.a().Q0();
                md1VarQ05.getClass();
                md1VarQ05.e(qd1Var.E);
                break;
        }
        return a83Var;
    }
}
