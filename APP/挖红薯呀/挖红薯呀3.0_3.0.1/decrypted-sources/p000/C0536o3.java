package p000;

/* JADX INFO: renamed from: o3 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0536o3 extends c50 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4413d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zt0 f4414e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0536o3(int i, zt0 zt0Var) {
        super(1);
        this.f4413d = i;
        this.f4414e = zt0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.f4413d;
        zt0 zt0Var = this.f4414e;
        switch (i) {
            case 0:
                zt0Var.f7995d = (C0149dv) obj;
                return Boolean.TRUE;
            default:
                Object obj2 = (h91) obj;
                if (((oe0) obj2).f4529d.f4542q) {
                    zt0Var.f7995d = obj2;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
