package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o20 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4408d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f4409e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ xq0 f4410f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4411g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ o20(int i, xq0 xq0Var, int i2) {
        this.f4408d = 1;
        this.f4409e = i;
        this.f4410f = xq0Var;
        this.f4411g = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        int i = this.f4408d;
        na1 na1Var = na1.f4229a;
        int i2 = this.f4411g;
        int i3 = this.f4409e;
        xq0 xq0Var = this.f4410f;
        wq0 wq0Var = (wq0) obj;
        switch (i) {
            case 0:
                wq0.m5015i(wq0Var, xq0Var, i3, i2);
                break;
            case 1:
                wq0.m5015i(wq0Var, xq0Var, rd0.m3458Q((i3 - xq0Var.f7400d) / 2.0f), rd0.m3458Q((i2 - xq0Var.f7401e) / 2.0f));
                break;
            default:
                wq0.m5015i(wq0Var, xq0Var, i3, i2);
                break;
        }
        return na1Var;
    }

    public /* synthetic */ o20(xq0 xq0Var, int i, int i2, int i3) {
        this.f4408d = i3;
        this.f4410f = xq0Var;
        this.f4409e = i;
        this.f4411g = i2;
    }
}
