package p000;

/* JADX INFO: renamed from: qs */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0663qs extends c50 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f5217d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0298hw f5218e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0663qs(boolean z, InterfaceC0298hw interfaceC0298hw) {
        super(1);
        this.f5217d = z;
        this.f5218e = interfaceC0298hw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        gv0 gv0Var = (gv0) obj;
        boolean z = !this.f5217d && ((Boolean) this.f5218e.invoke()).booleanValue();
        if (gv0Var.f2073n != z) {
            gv0Var.f2063d |= 16384;
            gv0Var.f2073n = z;
        }
        return na1.f4229a;
    }
}
