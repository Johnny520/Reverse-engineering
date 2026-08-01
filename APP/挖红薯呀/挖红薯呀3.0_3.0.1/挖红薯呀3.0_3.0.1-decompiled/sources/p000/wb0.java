package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class wb0 extends c50 implements InterfaceC0298hw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ yb0 f7058d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f7059e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f7060f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ zq0 f7061g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb0(yb0 yb0Var, long j, long j2, zq0 zq0Var) {
        super(0);
        this.f7058d = yb0Var;
        this.f7059e = j;
        this.f7060f = j2;
        this.f7061g = zq0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0298hw
    public final Object invoke() {
        yb0 yb0Var = this.f7058d;
        yb0Var.m5236r0().f6647d = false;
        yb0Var.m5236r0().f6648e = this.f7059e;
        yb0Var.m5236r0().f6649f = this.f7060f;
        InterfaceC0742sw interfaceC0742swMo1678d = this.f7061g.f7984d.mo1678d();
        if (interfaceC0742swMo1678d != null) {
            interfaceC0742swMo1678d.invoke(yb0Var.m5236r0());
        }
        return na1.f4229a;
    }
}
