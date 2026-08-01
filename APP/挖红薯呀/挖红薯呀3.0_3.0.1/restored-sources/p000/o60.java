package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class o60 implements v41 {

    /* JADX INFO: renamed from: a */
    public final vg0 f4466a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q60 f4467b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f4468c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o60(q60 q60Var, Object obj) {
        this.f4467b = q60Var;
        this.f4468c = obj;
        int[] iArr = c30.f649a;
        this.f4466a = new vg0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.v41
    /* JADX INFO: renamed from: a */
    public final void mo2633a() {
        q60.m3195c(this.f4467b, this.f4468c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.v41
    /* JADX INFO: renamed from: b */
    public final int mo2788b() {
        b60 b60Var = (b60) this.f4467b.f5065m.m1701g(this.f4468c);
        if (b60Var != null) {
            return ((ph0) b60Var.m307n()).f4858d.f5770f;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.v41
    /* JADX INFO: renamed from: c */
    public final void mo2789c(int i, long j) {
        q60 q60Var = this.f4467b;
        b60 b60Var = (b60) q60Var.f5065m.m1701g(this.f4468c);
        if (b60Var == null || !b60Var.m272H()) {
            return;
        }
        int i2 = ((ph0) b60Var.m307n()).f4858d.f5770f;
        if (i < 0 || i >= i2) {
            w10.m4826d("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (b60Var.m273I()) {
            w10.m4823a("Pre-measure called on node that is not placed");
        }
        b60 b60Var2 = q60Var.f5056d;
        b60Var2.f421t = true;
        ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) e60.m789a(b60Var)).m4860t((b60) ((ph0) b60Var.m307n()).get(i), j);
        b60Var2.f421t = false;
        this.f4466a.m4744a(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.v41
    /* JADX INFO: renamed from: d */
    public final void mo2790d(C0532o c0532o) {
        mj0 mj0Var;
        oe0 oe0Var;
        b60 b60Var = (b60) this.f4467b.f5065m.m1701g(this.f4468c);
        if (b60Var == null || (mj0Var = b60Var.f395I) == null || (oe0Var = mj0Var.f3998f) == null) {
            return;
        }
        r60.m3396E(oe0Var, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", c0532o);
    }
}
