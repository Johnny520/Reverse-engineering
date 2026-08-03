package p000;

import android.view.View;

/* JADX INFO: renamed from: Rq */
/* JADX INFO: loaded from: classes.dex */
public final class C0763Rq implements InterfaceC1470gt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2426a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f2427b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f2428c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2429d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f2430e;

    public C0763Rq(View view, int i, int i2, int i3, int i4) {
        this.f2426a = i;
        this.f2427b = view;
        this.f2428c = i2;
        this.f2429d = i3;
        this.f2430e = i4;
    }

    @Override // p000.InterfaceC1470gt
    public final C0489LF onApplyWindowInsets(View view, C0489LF c0489lf) {
        C2765yl c2765ylMo14g = c0489lf.f1602a.mo14g(519);
        View view2 = this.f2427b;
        int i = this.f2426a;
        if (i >= 0) {
            view2.getLayoutParams().height = i + c2765ylMo14g.f9406b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.f2428c + c2765ylMo14g.f9405a, this.f2429d + c2765ylMo14g.f9406b, this.f2430e + c2765ylMo14g.f9407c, view2.getPaddingBottom());
        return c0489lf;
    }
}
