package p000;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class y50 extends AbstractC0979zt {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC0273gt f5275e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ a60 f5276f;

    public y50(a60 a60Var, AbstractC0273gt abstractC0273gt) {
        this.f5276f = a60Var;
        this.f5275e = abstractC0273gt;
    }

    @Override // p000.AbstractC0979zt
    /* JADX INFO: renamed from: I */
    public final void mo2608I(int i) {
        this.f5276f.f58m = true;
        this.f5275e.mo1266p(i);
    }

    @Override // p000.AbstractC0979zt
    /* JADX INFO: renamed from: J */
    public final void mo2609J(Typeface typeface) {
        a60 a60Var = this.f5276f;
        a60Var.f59n = Typeface.create(typeface, a60Var.f48c);
        a60Var.f58m = true;
        this.f5275e.mo1267q(a60Var.f59n, false);
    }
}
