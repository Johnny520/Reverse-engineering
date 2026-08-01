package p000;

/* JADX INFO: renamed from: fv */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0223fv extends C0299hx implements InterfaceC0904ww {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        boolean zM603a;
        EnumC0106cv enumC0106cv = (EnumC0106cv) obj;
        EnumC0106cv enumC0106cv2 = (EnumC0106cv) obj2;
        C0260gv c0260gv = (C0260gv) this.receiver;
        if (c0260gv.f4542q && (zM603a = enumC0106cv2.m603a()) != enumC0106cv.m603a()) {
            C0191f c0191f = c0260gv.f2058u;
            if (c0191f != null) {
                c0191f.invoke(Boolean.valueOf(zM603a));
            }
            if (zM603a) {
                AbstractC0307i4.m1547w(c0260gv.m2879k0(), null, new C0091cg(c0260gv, (InterfaceC0322ik) null, 2), 3);
                zt0 zt0Var = new zt0();
                r60.m3420v(c0260gv, new C0081c7(3, zt0Var, c0260gv));
                y70 y70Var = (y70) zt0Var.f7995d;
                if (y70Var != null) {
                    y70Var.m5214a();
                } else {
                    y70Var = null;
                }
                c0260gv.f2060w = y70Var;
                qj0 qj0Var = c0260gv.f2061x;
                if (qj0Var != null && qj0Var.mo436G0().f4542q) {
                    c0260gv.m1255A0();
                }
            } else {
                y70 y70Var2 = c0260gv.f2060w;
                if (y70Var2 != null) {
                    y70Var2.m5215b();
                }
                c0260gv.f2060w = null;
                c0260gv.m1255A0();
            }
            z60.m5417D(c0260gv);
            xg0 xg0Var = c0260gv.f2057t;
            if (xg0Var != null) {
                C0702ru c0702ru = c0260gv.f2059v;
                if (zM603a) {
                    if (c0702ru != null) {
                        c0260gv.m1258z0(xg0Var, new C0739su(c0702ru));
                        c0260gv.f2059v = null;
                    }
                    C0702ru c0702ru2 = new C0702ru();
                    c0260gv.m1258z0(xg0Var, c0702ru2);
                    c0260gv.f2059v = c0702ru2;
                } else if (c0702ru != null) {
                    c0260gv.m1258z0(xg0Var, new C0739su(c0702ru));
                    c0260gv.f2059v = null;
                }
            }
        }
        return na1.f4229a;
    }
}
