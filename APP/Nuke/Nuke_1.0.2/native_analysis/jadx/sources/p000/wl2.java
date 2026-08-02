package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wl2 implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f12573h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ am2 f12574i;

    public /* synthetic */ wl2(am2 am2Var, int i) {
        this.f12573h = i;
        this.f12574i = am2Var;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int i = this.f12573h;
        am2 am2Var = this.f12574i;
        switch (i) {
            case 0:
                return Boolean.valueOf(am2Var.f10770u);
            default:
                pl0 pl0Var = am2Var.f278W;
                if (!pl0Var.f10757h.f10770u) {
                    return null;
                }
                kl0 kl0VarM3876R0 = pl0Var.m3876R0();
                int iOrdinal = kl0VarM3876R0.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        return null;
                    }
                    c80.m675s();
                    return null;
                }
                if (kl0VarM3876R0.m2718a()) {
                    return pl0Var.m3874P0(null);
                }
                pl0 pl0VarM561f = ((bl0) ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) sp0.m4939f0(pl0Var)).getFocusOwner()).m561f();
                if (pl0VarM561f != null) {
                    return pl0VarM561f.m3874P0(sp0.m4931b0(pl0Var));
                }
                return null;
        }
    }
}
