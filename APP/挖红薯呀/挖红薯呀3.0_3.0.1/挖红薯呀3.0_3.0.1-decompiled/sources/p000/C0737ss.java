package p000;

/* JADX INFO: renamed from: ss */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0737ss extends c50 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ xq0 f5825d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f5826e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f5827f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0697rp f5828g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0737ss(xq0 xq0Var, long j, long j2, C0697rp c0697rp) {
        super(1);
        this.f5825d = xq0Var;
        this.f5826e = j;
        this.f5827f = j2;
        this.f5828g = c0697rp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        wq0 wq0Var = (wq0) obj;
        long j = this.f5826e;
        long j2 = this.f5827f;
        wq0Var.getClass();
        xq0 xq0Var = this.f5825d;
        wq0.m5014a(wq0Var, xq0Var);
        xq0Var.mo47X(w20.m4835c((((long) (((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L), xq0Var.f7404h), 0.0f, this.f5828g);
        return na1.f4229a;
    }
}
