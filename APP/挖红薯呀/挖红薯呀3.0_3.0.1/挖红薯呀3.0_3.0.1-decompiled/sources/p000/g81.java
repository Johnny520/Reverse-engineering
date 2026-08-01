package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g81 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1888d = 1;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ float f1889e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f1890f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f1891g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ g81(xq0 xq0Var, i81 i81Var, float f) {
        this.f1890f = xq0Var;
        this.f1891g = i81Var;
        this.f1889e = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        int i = this.f1888d;
        na1 na1Var = na1.f4229a;
        Object obj2 = this.f1891g;
        float f = this.f1889e;
        Object obj3 = this.f1890f;
        switch (i) {
            case 0:
                xq0 xq0Var = (xq0) obj3;
                wq0 wq0Var = (wq0) obj;
                C0045b7 c0045b7 = ((i81) obj2).f2486v;
                wq0.m5017k(wq0Var, xq0Var, c0045b7 != null ? (int) ((Number) c0045b7.m323d()).floatValue() : (int) f, 0);
                break;
            default:
                va1 va1Var = (va1) obj3;
                InterfaceC0742sw interfaceC0742sw = (InterfaceC0742sw) obj2;
                long jLongValue = ((Long) obj).longValue();
                if (va1Var.f6628b == Long.MIN_VALUE) {
                    va1Var.f6628b = jLongValue;
                }
                float f2 = va1Var.f6631e;
                C0916x7 c0916x7 = new C0916x7(f2);
                C0916x7 c0916x72 = va1.f6626f;
                long jMo2487b = f == 0.0f ? va1Var.f6627a.mo2487b(new C0916x7(f2), c0916x72, va1Var.f6629c) : rd0.m3459R((jLongValue - va1Var.f6628b) / f);
                float f3 = ((C0916x7) va1Var.f6627a.mo379h(jMo2487b, c0916x7, c0916x72, va1Var.f6629c)).f7277a;
                va1Var.f6629c = (C0916x7) va1Var.f6627a.mo376e(jMo2487b, c0916x7, c0916x72, va1Var.f6629c);
                va1Var.f6628b = jLongValue;
                float f4 = va1Var.f6631e - f3;
                va1Var.f6631e = f3;
                interfaceC0742sw.invoke(Float.valueOf(f4));
                break;
        }
        return na1Var;
    }

    public /* synthetic */ g81(va1 va1Var, float f, InterfaceC0742sw interfaceC0742sw) {
        this.f1890f = va1Var;
        this.f1889e = f;
        this.f1891g = interfaceC0742sw;
    }
}
