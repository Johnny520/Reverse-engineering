package p000;

import android.view.ViewGroup;

/* JADX INFO: renamed from: k9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0403k9 extends y70 {

    /* JADX INFO: renamed from: a */
    public boolean f2798a = false;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f2799b;

    public C0403k9(ViewGroup viewGroup) {
        this.f2799b = viewGroup;
    }

    @Override // p000.y70, p000.w70
    /* JADX INFO: renamed from: a */
    public final void mo1667a() {
        AbstractC0274gu.m1306L(this.f2799b, false);
        this.f2798a = true;
    }

    @Override // p000.y70, p000.w70
    /* JADX INFO: renamed from: c */
    public final void mo1668c() {
        AbstractC0274gu.m1306L(this.f2799b, false);
    }

    @Override // p000.y70, p000.w70
    /* JADX INFO: renamed from: d */
    public final void mo1669d() {
        AbstractC0274gu.m1306L(this.f2799b, true);
    }

    @Override // p000.w70
    /* JADX INFO: renamed from: e */
    public final void mo1670e(x70 x70Var) {
        if (!this.f2798a) {
            AbstractC0274gu.m1306L(this.f2799b, false);
        }
        x70Var.m2651u(this);
    }
}
