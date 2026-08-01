package p000;

/* JADX INFO: renamed from: la */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0424la extends oe0 implements r50, vz0 {

    /* JADX INFO: renamed from: r */
    public InterfaceC0742sw f3398r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.vz0
    /* JADX INFO: renamed from: S */
    public final void mo757S(f01 f01Var) {
        x01 x01Var;
        boolean z;
        qj0 qj0VarM3037O = pf1.m3037O(this, 2);
        if (qj0VarM3037O.f5173I) {
            x01Var = qj0VarM3037O.f5171G;
            z = qj0VarM3037O.f5172H;
        } else {
            gv0 gv0Var = p30.f4738e;
            if (gv0Var == null) {
                p30.f4738e = new gv0();
            } else {
                gv0Var.m1259a();
            }
            gv0 gv0Var2 = p30.f4738e;
            gv0Var2.getClass();
            gv0Var2.f2075p = qj0VarM3037O.f5180r.f388B;
            gv0Var2.f2074o = o30.m2759C(qj0VarM3037O.f7402f);
            l21 l21VarM4270k = u50.m4270k();
            InterfaceC0742sw interfaceC0742swMo809e = l21VarM4270k != null ? l21VarM4270k.mo809e() : null;
            l21 l21VarM4276s = u50.m4276s(l21VarM4270k);
            try {
                this.f3398r.invoke(gv0Var2);
                u50.m4283z(l21VarM4270k, l21VarM4276s, interfaceC0742swMo809e);
                x01Var = gv0Var2.f2072m;
                z = gv0Var2.f2073n;
            } catch (Throwable th) {
                u50.m4283z(l21VarM4270k, l21VarM4276s, interfaceC0742swMo809e);
                throw th;
            }
        }
        if (z) {
            d01.m621b(f01Var, x01Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.r50
    /* JADX INFO: renamed from: Y */
    public final yd0 mo790Y(zd0 zd0Var, sd0 sd0Var, long j) {
        xq0 xq0VarMo184e = sd0Var.mo184e(j);
        return zd0Var.mo1279Q(xq0VarMo184e.f7400d, xq0VarMo184e.f7401e, C0330is.f2614d, new C0537o4(4, xq0VarMo184e, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.vz0
    /* JADX INFO: renamed from: e */
    public final boolean mo2008e() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: l0 */
    public final boolean mo548l0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f3398r + ')';
    }
}
