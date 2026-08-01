package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u81 implements InterfaceC0298hw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f6167d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ b91 f6168e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ u81(b91 b91Var, int i) {
        this.f6167d = i;
        this.f6168e = b91Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0298hw
    public final Object invoke() {
        int i = this.f6167d;
        b91 b91Var = this.f6168e;
        switch (i) {
            case 0:
                return Boolean.valueOf((p30.m3002l(b91Var.f462d.getValue(), b91Var.m328c()) && b91Var.f465g.m951g() == Long.MIN_VALUE && !((Boolean) b91Var.f466h.getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(b91Var.m327b());
        }
    }
}
