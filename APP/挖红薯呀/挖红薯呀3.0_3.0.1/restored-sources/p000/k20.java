package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k20 extends oe0 implements h91 {

    /* JADX INFO: renamed from: r */
    public fd1 f2995r;

    /* JADX INFO: renamed from: s */
    public fd1 f2996s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k20() {
        C0815ut c0815ut = p30.f4747n;
        this.f2995r = c0815ut;
        this.f2996s = c0815ut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.h91
    /* JADX INFO: renamed from: k */
    public final Object mo1247k() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: o0 */
    public final void mo656o0() {
        r60.m3395D(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new j20(this, 1));
        mo1762x0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: p0 */
    public final void mo657p0() {
        this.f2996s = this.f2995r;
        r60.m3396E(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new j20(this, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: q0 */
    public final void mo694q0() {
        this.f2995r = p30.f4747n;
    }

    /* JADX INFO: renamed from: w0 */
    public abstract fd1 mo1761w0(fd1 fd1Var);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x0 */
    public void mo1762x0() {
        this.f2996s = mo1761w0(this.f2995r);
        r60.m3396E(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new j20(this, 0));
    }
}
