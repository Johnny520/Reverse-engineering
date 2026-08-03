package p000;

import android.view.WindowInsets;

/* JADX INFO: renamed from: vF */
/* JADX INFO: loaded from: classes.dex */
public class C2624vF extends AbstractC2796zF {

    /* JADX INFO: renamed from: c */
    public final WindowInsets.Builder f9109c;

    public C2624vF() {
        this.f9109c = AbstractC0617OE.m1195c();
    }

    @Override // p000.AbstractC2796zF
    /* JADX INFO: renamed from: b */
    public C0489LF mo5084b() {
        m5362a();
        C0489LF c0489lfM939h = C0489LF.m939h(null, this.f9109c.build());
        c0489lfM939h.f1602a.mo18p(this.f9465b);
        return c0489lfM939h;
    }

    @Override // p000.AbstractC2796zF
    /* JADX INFO: renamed from: d */
    public void mo5140d(C2765yl c2765yl) {
        this.f9109c.setMandatorySystemGestureInsets(c2765yl.m5339d());
    }

    @Override // p000.AbstractC2796zF
    /* JADX INFO: renamed from: e */
    public void mo5085e(C2765yl c2765yl) {
        this.f9109c.setStableInsets(c2765yl.m5339d());
    }

    @Override // p000.AbstractC2796zF
    /* JADX INFO: renamed from: f */
    public void mo5141f(C2765yl c2765yl) {
        this.f9109c.setSystemGestureInsets(c2765yl.m5339d());
    }

    @Override // p000.AbstractC2796zF
    /* JADX INFO: renamed from: g */
    public void mo5086g(C2765yl c2765yl) {
        this.f9109c.setSystemWindowInsets(c2765yl.m5339d());
    }

    @Override // p000.AbstractC2796zF
    /* JADX INFO: renamed from: h */
    public void mo5142h(C2765yl c2765yl) {
        this.f9109c.setTappableElementInsets(c2765yl.m5339d());
    }

    public C2624vF(C0489LF c0489lf) {
        WindowInsets.Builder builderM1195c;
        super(c0489lf);
        WindowInsets windowInsetsM945g = c0489lf.m945g();
        if (windowInsetsM945g != null) {
            builderM1195c = AbstractC0617OE.m1196d(windowInsetsM945g);
        } else {
            builderM1195c = AbstractC0617OE.m1195c();
        }
        this.f9109c = builderM1195c;
    }
}
