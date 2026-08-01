package p000;

/* JADX INFO: renamed from: yu */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0976yu extends c50 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zt0 f7692d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f7693e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0976yu(int i, zt0 zt0Var) {
        super(1);
        this.f7692d = zt0Var;
        this.f7693e = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        Boolean boolValueOf = Boolean.valueOf(((C0149dv) obj).m729D0(this.f7693e));
        this.f7692d.f7995d = boolValueOf;
        return boolValueOf;
    }
}
