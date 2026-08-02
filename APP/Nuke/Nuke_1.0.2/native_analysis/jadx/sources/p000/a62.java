package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a62 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f79h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f80i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f81j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f82k;

    public /* synthetic */ a62(ma3 ma3Var, sz1 sz1Var, int i) {
        this.f79h = 2;
        this.f81j = ma3Var;
        this.f82k = sz1Var;
        this.f80i = i;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        InterfaceC0902xx interfaceC0902xx;
        a83 a83Var;
        InterfaceC0902xx interfaceC0902xx2;
        a83 a83Var2;
        int i;
        int i2 = this.f79h;
        a83 a83Var3 = a83.f116a;
        int i3 = 0;
        int i4 = this.f80i;
        Object obj2 = this.f82k;
        Object obj3 = this.f81j;
        switch (i2) {
            case 0:
                b62 b62Var = (b62) obj3;
                gk1 gk1Var = (gk1) obj2;
                InterfaceC0902xx interfaceC0902xx3 = (InterfaceC0902xx) obj;
                if (b62Var.f617e == i4 && t11.m5086l(gk1Var, b62Var.f618f) && (interfaceC0902xx3 instanceof C0220fy)) {
                    long[] jArr = gk1Var.f3552a;
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
                                        Object obj4 = gk1Var.f3553b[i9];
                                        boolean z = gk1Var.f3554c[i9] != i4;
                                        if (z) {
                                            i = i6;
                                            C0220fy c0220fy = (C0220fy) interfaceC0902xx3;
                                            interfaceC0902xx2 = interfaceC0902xx3;
                                            rk1 rk1Var = c0220fy.f3182n;
                                            qp0.m4237S(rk1Var, obj4, b62Var);
                                            a83Var2 = a83Var3;
                                            if (obj4 instanceof n70) {
                                                n70 n70Var = (n70) obj4;
                                                if (!rk1Var.m4501c(n70Var)) {
                                                    qp0.m4238T(c0220fy.f3185q, n70Var);
                                                }
                                                rk1 rk1Var2 = b62Var.f619g;
                                                if (rk1Var2 != null) {
                                                    rk1Var2.m4509k(obj4);
                                                }
                                            }
                                        } else {
                                            interfaceC0902xx2 = interfaceC0902xx3;
                                            a83Var2 = a83Var3;
                                            i = i6;
                                        }
                                        if (z) {
                                            gk1Var.m1935f(i9);
                                        }
                                    } else {
                                        interfaceC0902xx2 = interfaceC0902xx3;
                                        a83Var2 = a83Var3;
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                    interfaceC0902xx3 = interfaceC0902xx2;
                                    a83Var3 = a83Var2;
                                }
                                interfaceC0902xx = interfaceC0902xx3;
                                a83Var = a83Var3;
                                if (i7 != i6) {
                                }
                            } else {
                                interfaceC0902xx = interfaceC0902xx3;
                                a83Var = a83Var3;
                            }
                            if (i5 != length) {
                                i5++;
                                interfaceC0902xx3 = interfaceC0902xx;
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
                int iM2759g = il2Var.f4676v.f7216a.m2759g();
                if (iM2759g < 0) {
                    iM2759g = 0;
                }
                if (iM2759g <= i4) {
                    i4 = iM2759g;
                }
                int i10 = -i4;
                boolean z2 = il2Var.f4677w;
                int i11 = z2 ? 0 : i10;
                if (!z2) {
                    i10 = 0;
                }
                rz1Var.f9833h = true;
                rz1.m4642j(rz1Var, sz1Var, i11, i10);
                rz1Var.f9833h = false;
                break;
            default:
                ma3 ma3Var = (ma3) obj3;
                sz1 sz1Var2 = (sz1) obj2;
                rz1 rz1Var2 = (rz1) obj;
                int i12 = ma3Var.f6534b;
                tz2 tz2Var = ma3Var.f6533a;
                q33 q33Var = ma3Var.f6535c;
                z03 z03Var = (z03) ma3Var.f6536d.mo6a();
                tz2Var.m5449a(qv1.f9205h, tp0.m5361f(rz1Var2, i12, q33Var, z03Var != null ? z03Var.f13697a : null, false, sz1Var2.f10438h), i4, sz1Var2.f10439i);
                rz1.m4641i(rz1Var2, sz1Var2, 0, Math.round(-tz2Var.f11013a.m2591g()));
                break;
        }
        return a83Var3;
    }

    public /* synthetic */ a62(int i, int i2, Object obj, Object obj2) {
        this.f79h = i2;
        this.f81j = obj;
        this.f80i = i;
        this.f82k = obj2;
    }
}
