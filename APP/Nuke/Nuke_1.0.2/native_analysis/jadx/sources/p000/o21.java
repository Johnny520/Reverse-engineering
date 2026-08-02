package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class o21 extends C0469mp {

    /* JADX INFO: renamed from: p */
    public final C0291hv f7448p;

    public o21(t00 t00Var, C0291hv c0291hv) {
        super(1, t00Var);
        this.f7448p = c0291hv;
    }

    @Override // p000.C0469mp
    /* JADX INFO: renamed from: B */
    public final String mo3139B() {
        return "AwaitContinuation";
    }

    @Override // p000.C0469mp
    /* JADX INFO: renamed from: s */
    public final Throwable mo3149s(r21 r21Var) {
        Throwable thM4043c;
        C0291hv c0291hv = this.f7448p;
        c0291hv.getClass();
        Object obj = r21.f9330h.get(c0291hv);
        return (!(obj instanceof q21) || (thM4043c = ((q21) obj).m4043c()) == null) ? obj instanceof C0557ov ? ((C0557ov) obj).f7856a : r21Var.mo1706q() : thM4043c;
    }
}
