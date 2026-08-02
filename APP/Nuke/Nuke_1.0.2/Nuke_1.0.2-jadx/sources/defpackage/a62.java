package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a62 implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ a62(ma3 ma3Var, sz1 sz1Var, int i) {
        this.h = 2;
        this.j = ma3Var;
        this.k = sz1Var;
        this.i = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        xx xxVar;
        a83 a83Var;
        xx xxVar2;
        a83 a83Var2;
        int i;
        int i2 = this.h;
        a83 a83Var3 = a83.a;
        int i3 = 0;
        int i4 = this.i;
        Object obj2 = this.k;
        Object obj3 = this.j;
        switch (i2) {
            case 0:
                b62 b62Var = (b62) obj3;
                gk1 gk1Var = (gk1) obj2;
                xx xxVar3 = (xx) obj;
                if (b62Var.e == i4 && t11.l(gk1Var, b62Var.f) && (xxVar3 instanceof fy)) {
                    long[] jArr = gk1Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = i3;
                                while (i8 < i7) {
                                    if ((255 & j) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        Object obj4 = gk1Var.b[i9];
                                        boolean z = gk1Var.c[i9] != i4;
                                        if (z) {
                                            i = i6;
                                            fy fyVar = (fy) xxVar3;
                                            xxVar2 = xxVar3;
                                            rk1 rk1Var = fyVar.n;
                                            qp0.S(rk1Var, obj4, b62Var);
                                            a83Var2 = a83Var3;
                                            if (obj4 instanceof n70) {
                                                n70 n70Var = (n70) obj4;
                                                if (!rk1Var.c(n70Var)) {
                                                    qp0.T(fyVar.q, n70Var);
                                                }
                                                rk1 rk1Var2 = b62Var.g;
                                                if (rk1Var2 != null) {
                                                    rk1Var2.k(obj4);
                                                }
                                            }
                                        } else {
                                            xxVar2 = xxVar3;
                                            a83Var2 = a83Var3;
                                            i = i6;
                                        }
                                        if (z) {
                                            gk1Var.f(i9);
                                        }
                                    } else {
                                        xxVar2 = xxVar3;
                                        a83Var2 = a83Var3;
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                    xxVar3 = xxVar2;
                                    a83Var3 = a83Var2;
                                }
                                xxVar = xxVar3;
                                a83Var = a83Var3;
                                if (i7 != i6) {
                                }
                            } else {
                                xxVar = xxVar3;
                                a83Var = a83Var3;
                            }
                            if (i5 != length) {
                                i5++;
                                xxVar3 = xxVar;
                                a83Var3 = a83Var;
                                i3 = 0;
                            }
                        }
                    }
                }
                break;
            case 1:
                il2 il2Var = (il2) obj3;
                sz1 sz1Var = (sz1) obj2;
                rz1 rz1Var = (rz1) obj;
                int iG = il2Var.v.a.g();
                if (iG < 0) {
                    iG = 0;
                }
                if (iG <= i4) {
                    i4 = iG;
                }
                int i10 = -i4;
                boolean z2 = il2Var.w;
                int i11 = z2 ? 0 : i10;
                if (!z2) {
                    i10 = 0;
                }
                rz1Var.h = true;
                rz1.j(rz1Var, sz1Var, i11, i10);
                rz1Var.h = false;
                break;
            default:
                ma3 ma3Var = (ma3) obj3;
                sz1 sz1Var2 = (sz1) obj2;
                rz1 rz1Var2 = (rz1) obj;
                int i12 = ma3Var.b;
                tz2 tz2Var = ma3Var.a;
                q33 q33Var = ma3Var.c;
                z03 z03Var = (z03) ma3Var.d.a();
                tz2Var.a(qv1.h, tp0.f(rz1Var2, i12, q33Var, z03Var != null ? z03Var.a : null, false, sz1Var2.h), i4, sz1Var2.i);
                rz1.i(rz1Var2, sz1Var2, 0, Math.round(-tz2Var.a.g()));
                break;
        }
        return a83Var3;
    }

    public /* synthetic */ a62(int i, int i2, Object obj, Object obj2) {
        this.h = i2;
        this.j = obj;
        this.i = i;
        this.k = obj2;
    }
}
