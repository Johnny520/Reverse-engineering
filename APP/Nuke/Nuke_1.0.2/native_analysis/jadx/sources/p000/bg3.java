package p000;

import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bg3 implements InterfaceC0902xx, fa1 {

    /* JADX INFO: renamed from: h */
    public final ViewTreeObserverOnGlobalLayoutListenerC0045b7 f848h;

    /* JADX INFO: renamed from: i */
    public final C0220fy f849i;

    /* JADX INFO: renamed from: j */
    public boolean f850j;

    /* JADX INFO: renamed from: k */
    public ba1 f851k;

    /* JADX INFO: renamed from: l */
    public mn0 f852l = AbstractC0672rw.f9772a;

    public bg3(ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7, C0220fy c0220fy) {
        this.f848h = viewTreeObserverOnGlobalLayoutListenerC0045b7;
        this.f849i = c0220fy;
    }

    /* JADX INFO: renamed from: a */
    public final void m531a() {
        if (!this.f850j) {
            this.f850j = true;
            this.f848h.getView().setTag(R.id.wrapped_composition_tag, null);
            ba1 ba1Var = this.f851k;
            if (ba1Var != null) {
                ba1Var.mo506b(this);
            }
            this.f851k = null;
        }
        this.f849i.m1742m();
    }

    /* JADX INFO: renamed from: d */
    public final void m532d(mn0 mn0Var) {
        this.f848h.setOnReadyForComposition(new C0196fa(9, this, mn0Var));
    }

    @Override // p000.fa1
    /* JADX INFO: renamed from: g */
    public final void mo533g(ia1 ia1Var, z91 z91Var) {
        if (z91Var == z91.ON_DESTROY) {
            m531a();
        } else {
            if (z91Var != z91.ON_CREATE || this.f850j) {
                return;
            }
            m532d(this.f852l);
        }
    }
}
