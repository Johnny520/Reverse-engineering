package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q70 implements InterfaceC0298hw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5078d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ oh0 f5079e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ q70(oh0 oh0Var, int i) {
        this.f5078d = i;
        this.f5079e = oh0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0298hw
    public final Object invoke() {
        int i = this.f5078d;
        oh0 oh0Var = this.f5079e;
        switch (i) {
            case 0:
                return (o70) ((InterfaceC0298hw) oh0Var.getValue()).invoke();
            case 1:
                return new p80((InterfaceC0742sw) oh0Var.getValue());
            case 2:
                return zc0.m5508S(oh0Var);
            case 3:
                return zc0.m5516W(oh0Var);
            case 4:
                return zc0.m5571v0(oh0Var);
            case 5:
                return zc0.m5567t0(oh0Var);
            default:
                return zc0.m5539f0(oh0Var);
        }
    }
}
