package p000;

import org.luckypray.dexkit.C0587R;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class we1 implements InterfaceC0690ri, v90 {

    /* JADX INFO: renamed from: d */
    public final ViewTreeObserverOnGlobalLayoutListenerC0875w3 f7116d;

    /* JADX INFO: renamed from: e */
    public final C0964yi f7117e;

    /* JADX INFO: renamed from: f */
    public boolean f7118f;

    /* JADX INFO: renamed from: g */
    public s90 f7119g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0904ww f7120h = AbstractC0726sh.f5767a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public we1(ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3, C0964yi c0964yi) {
        this.f7116d = viewTreeObserverOnGlobalLayoutListenerC0875w3;
        this.f7117e = c0964yi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m5011d() {
        if (!this.f7118f) {
            this.f7118f = true;
            this.f7116d.getView().setTag(C0587R.id.wrapped_composition_tag, null);
            s90 s90Var = this.f7119g;
            if (s90Var != null) {
                s90Var.mo4015b(this);
            }
        }
        this.f7117e.m5272m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.v90
    /* JADX INFO: renamed from: e */
    public final void mo350e(x90 x90Var, q90 q90Var) {
        if (q90Var == q90.ON_DESTROY) {
            m5011d();
        } else {
            if (q90Var != q90.ON_CREATE || this.f7118f) {
                return;
            }
            m5012f(this.f7120h);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m5012f(InterfaceC0904ww interfaceC0904ww) {
        this.f7116d.setOnViewTreeOwnersAvailable(new C0537o4(6, this, interfaceC0904ww));
    }
}
