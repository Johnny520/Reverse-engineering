package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gc0 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1922d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ oh0 f1923e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ gc0(oh0 oh0Var, int i) {
        this.f1922d = i;
        this.f1923e = oh0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f1922d;
        InterfaceC0356ji interfaceC0356ji = (InterfaceC0356ji) obj;
        int iIntValue = ((Integer) obj2).intValue();
        oh0 oh0Var = this.f1923e;
        switch (i) {
            case 0:
                return zc0.m5514V(oh0Var, interfaceC0356ji, iIntValue);
            default:
                return zc0.m5569u0(C0924xf.f7341a, oh0Var, interfaceC0356ji, iIntValue);
        }
    }
}
