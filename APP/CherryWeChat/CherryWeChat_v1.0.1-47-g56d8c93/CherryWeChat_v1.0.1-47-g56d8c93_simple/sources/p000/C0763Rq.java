package p000;

import android.view.View;
import android.view.ViewGroup;

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

    public C0763Rq(View r1, int r2, int r3, int r4, int r5) {
        this.f2426a = r2;
        this.f2427b = r1;
        this.f2428c = r3;
        this.f2429d = r4;
        this.f2430e = r5;
    }

    @Override // p000.InterfaceC1470gt
    public final C0489LF onApplyWindowInsets(View r5, C0489LF r6) {
        C2765yl r52 = r6.f1602a.mo14g(519);
        View r0 = this.f2427b;
        int r1 = this.f2426a;
        if (r1 < 0) goto L5;
        ViewGroup.LayoutParams r2 = r0.getLayoutParams();
        r2.height = r1 + r52.f9406b;
        r0.setLayoutParams(r0.getLayoutParams());
    L5:
        r0.setPadding(this.f2428c + r52.f9405a, this.f2429d + r52.f9406b, this.f2430e + r52.f9407c, r0.getPaddingBottom());
        return r6;
    }
}
