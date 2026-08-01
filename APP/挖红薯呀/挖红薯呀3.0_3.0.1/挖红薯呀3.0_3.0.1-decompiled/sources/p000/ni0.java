package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ni0 implements xd0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0298hw f4281a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC0904ww f4282b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f4283c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ni0(InterfaceC0298hw interfaceC0298hw, InterfaceC0904ww interfaceC0904ww, boolean z) {
        this.f4281a = interfaceC0298hw;
        this.f4282b = interfaceC0904ww;
        this.f4283c = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xd0
    /* JADX INFO: renamed from: g */
    public final yd0 mo213g(final zd0 zd0Var, List list, long j) {
        Object obj;
        xq0 xq0VarMo184e;
        xq0 xq0VarMo184e2;
        float fFloatValue = ((Number) this.f4281a.invoke()).floatValue();
        final float f = fFloatValue >= 0.0f ? fFloatValue : 0.0f;
        long jM3130a = C0617pj.m3130a(j, 0, 0, 0, 0, 10);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sd0 sd0Var = (sd0) list.get(i);
            if (p30.m3002l(pf1.m3066z(sd0Var), "icon")) {
                final xq0 xq0VarMo184e3 = sd0Var.mo184e(jM3130a);
                float f2 = 2.0f;
                int iMo641F = zd0Var.mo641F(oi0.f4575d * 2.0f) + xq0VarMo184e3.f7400d;
                int iM3458Q = rd0.m3458Q(iMo641F * f);
                int iMo641F2 = zd0Var.mo641F(oi0.f4576e * 2.0f) + xq0VarMo184e3.f7401e;
                int size2 = list.size();
                int i2 = 0;
                while (i2 < size2) {
                    sd0 sd0Var2 = (sd0) list.get(i2);
                    float f3 = f2;
                    if (p30.m3002l(pf1.m3066z(sd0Var2), "indicatorRipple")) {
                        if (!((iMo641F >= 0) & (iMo641F2 >= 0))) {
                            y10.m5197a("width and height must be >= 0");
                        }
                        final xq0 xq0VarMo184e4 = sd0Var2.mo184e(AbstractC0654qj.m3260g(iMo641F, iMo641F, iMo641F2, iMo641F2));
                        int size3 = list.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size3) {
                                obj = null;
                                break;
                            }
                            obj = list.get(i3);
                            if (p30.m3002l(pf1.m3066z((sd0) obj), "indicator")) {
                                break;
                            }
                            i3++;
                        }
                        sd0 sd0Var3 = (sd0) obj;
                        if (sd0Var3 != null) {
                            if (!((iM3458Q >= 0) & (iMo641F2 >= 0))) {
                                y10.m5197a("width and height must be >= 0");
                            }
                            xq0VarMo184e = sd0Var3.mo184e(AbstractC0654qj.m3260g(iM3458Q, iM3458Q, iMo641F2, iMo641F2));
                        } else {
                            xq0VarMo184e = null;
                        }
                        InterfaceC0904ww interfaceC0904ww = this.f4282b;
                        if (interfaceC0904ww != null) {
                            int size4 = list.size();
                            for (int i4 = 0; i4 < size4; i4++) {
                                sd0 sd0Var4 = (sd0) list.get(i4);
                                if (p30.m3002l(pf1.m3066z(sd0Var4), "label")) {
                                    xq0VarMo184e2 = sd0Var4.mo184e(jM3130a);
                                }
                            }
                            ya0.m5227b("Collection contains no element matching the predicate.");
                            throw new C0725sg();
                        }
                        xq0VarMo184e2 = null;
                        C0330is c0330is = C0330is.f2614d;
                        if (interfaceC0904ww == null) {
                            final int iMo641F3 = C0617pj.m3137h(j) == Integer.MAX_VALUE ? (zd0Var.mo641F(oi0.f4578g) * 2) + xq0VarMo184e3.f7400d : C0617pj.m3137h(j);
                            final int iM3258e = AbstractC0654qj.m3258e(zd0Var.mo641F(oi0.f4572a), j);
                            final int i5 = (iMo641F3 - xq0VarMo184e3.f7400d) / 2;
                            final int i6 = (iM3258e - xq0VarMo184e3.f7401e) / 2;
                            final int i7 = (iMo641F3 - xq0VarMo184e4.f7400d) / 2;
                            final int i8 = (iM3258e - xq0VarMo184e4.f7401e) / 2;
                            final xq0 xq0Var = xq0VarMo184e;
                            return zd0Var.mo1279Q(iMo641F3, iM3258e, c0330is, new InterfaceC0742sw() { // from class: ki0
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // p000.InterfaceC0742sw
                                public final Object invoke(Object obj2) {
                                    wq0 wq0Var = (wq0) obj2;
                                    xq0 xq0Var2 = xq0Var;
                                    if (xq0Var2 != null) {
                                        wq0.m5017k(wq0Var, xq0Var2, (iMo641F3 - xq0Var2.f7400d) / 2, (iM3258e - xq0Var2.f7401e) / 2);
                                    }
                                    wq0.m5017k(wq0Var, xq0VarMo184e3, i5, i6);
                                    wq0.m5017k(wq0Var, xq0VarMo184e4, i7, i8);
                                    return na1.f4229a;
                                }
                            });
                        }
                        final xq0 xq0Var2 = xq0VarMo184e;
                        xq0VarMo184e2.getClass();
                        float f4 = xq0VarMo184e3.f7401e;
                        float f5 = oi0.f4576e;
                        float fMo654p = zd0Var.mo654p(f5) + f4;
                        float f6 = oi0.f4574c;
                        float fMo654p2 = zd0Var.mo654p(f6) + fMo654p + xq0VarMo184e2.f7401e;
                        float fM3138i = (C0617pj.m3138i(j) - fMo654p2) / f3;
                        final float fMo654p3 = zd0Var.mo654p(f5);
                        if (fM3138i >= fMo654p3) {
                            fMo654p3 = fM3138i;
                        }
                        float f7 = (fMo654p3 * f3) + fMo654p2;
                        final boolean z = this.f4283c;
                        final float f8 = (1.0f - f) * ((z ? fMo654p3 : (f7 - xq0VarMo184e3.f7401e) / f3) - fMo654p3);
                        final float fMo654p4 = zd0Var.mo654p(f6) + zd0Var.mo654p(f5) + xq0VarMo184e3.f7401e + fMo654p3;
                        int iMo641F4 = C0617pj.m3137h(j) == Integer.MAX_VALUE ? (zd0Var.mo641F(oi0.f4578g) * 2) + xq0VarMo184e3.f7400d : C0617pj.m3137h(j);
                        final int i9 = (iMo641F4 - xq0VarMo184e2.f7400d) / 2;
                        final int i10 = (iMo641F4 - xq0VarMo184e3.f7400d) / 2;
                        final int i11 = (iMo641F4 - xq0VarMo184e4.f7400d) / 2;
                        final float fMo654p5 = fMo654p3 - zd0Var.mo654p(f5);
                        final xq0 xq0Var3 = xq0VarMo184e2;
                        final int i12 = iMo641F4;
                        return zd0Var.mo1279Q(i12, rd0.m3458Q(f7), c0330is, new InterfaceC0742sw() { // from class: ji0
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p000.InterfaceC0742sw
                            public final Object invoke(Object obj2) {
                                wq0 wq0Var = (wq0) obj2;
                                xq0 xq0Var4 = xq0Var2;
                                float f9 = f8;
                                float f10 = fMo654p3;
                                if (xq0Var4 != null) {
                                    wq0.m5017k(wq0Var, xq0Var4, (i12 - xq0Var4.f7400d) / 2, rd0.m3458Q((f10 - zd0Var.mo641F(oi0.f4576e)) + f9));
                                }
                                if (z || f != 0.0f) {
                                    wq0.m5017k(wq0Var, xq0Var3, i9, rd0.m3458Q(fMo654p4 + f9));
                                }
                                wq0.m5017k(wq0Var, xq0VarMo184e3, i10, rd0.m3458Q(f10 + f9));
                                wq0.m5017k(wq0Var, xq0VarMo184e4, i11, rd0.m3458Q(fMo654p5 + f9));
                                return na1.f4229a;
                            }
                        });
                    }
                    i2++;
                    f2 = f3;
                }
                ya0.m5227b("Collection contains no element matching the predicate.");
                throw new C0725sg();
            }
        }
        ya0.m5227b("Collection contains no element matching the predicate.");
        throw new C0725sg();
    }
}
