package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class te1 extends oe0 implements r50 {

    /* JADX INFO: renamed from: r */
    public EnumC0062bo f5990r;

    /* JADX INFO: renamed from: s */
    public InterfaceC0904ww f5991s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.r50
    /* JADX INFO: renamed from: Y */
    public final yd0 mo790Y(final zd0 zd0Var, sd0 sd0Var, long j) {
        final xq0 xq0VarMo184e = sd0Var.mo184e(AbstractC0654qj.m3254a(this.f5990r != EnumC0062bo.f549d ? 0 : C0617pj.m3139j(j), C0617pj.m3137h(j), this.f5990r == EnumC0062bo.f550e ? C0617pj.m3138i(j) : 0, C0617pj.m3136g(j)));
        final int iM4907n = w60.m4907n(xq0VarMo184e.f7400d, C0617pj.m3139j(j), C0617pj.m3137h(j));
        final int iM4907n2 = w60.m4907n(xq0VarMo184e.f7401e, C0617pj.m3138i(j), C0617pj.m3136g(j));
        return zd0Var.mo1279Q(iM4907n, iM4907n2, C0330is.f2614d, new InterfaceC0742sw() { // from class: se1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0742sw
            public final Object invoke(Object obj) {
                InterfaceC0904ww interfaceC0904ww = this.f5748d.f5991s;
                xq0 xq0Var = xq0VarMo184e;
                wq0.m5016j((wq0) obj, xq0Var, ((w20) interfaceC0904ww.invoke(new d30((((long) (iM4907n - xq0Var.f7400d)) << 32) | (((long) (iM4907n2 - xq0Var.f7401e)) & 4294967295L)), zd0Var.getLayoutDirection())).f6904a);
                return na1.f4229a;
            }
        });
    }
}
