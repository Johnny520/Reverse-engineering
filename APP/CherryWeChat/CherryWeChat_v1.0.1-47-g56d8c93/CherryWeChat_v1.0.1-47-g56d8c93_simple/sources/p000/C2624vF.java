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
        C0489LF r0 = C0489LF.m939h(null, AbstractC0617OE.m1197e(this.f9109c));
        C2765yl[] r1 = this.f9465b;
        r0.f1602a.mo18p(r1);
        return r0;
    }

    @Override // p000.AbstractC2796zF
    /* JADX INFO: renamed from: d */
    public void mo5140d(C2765yl r2) {
        AbstractC0617OE.m1209q(this.f9109c, r2.m5339d());
    }

    @Override // p000.AbstractC2796zF
    /* JADX INFO: renamed from: e */
    public void mo5085e(C2765yl r2) {
        AbstractC0617OE.m1205m(this.f9109c, r2.m5339d());
    }

    @Override // p000.AbstractC2796zF
    /* JADX INFO: renamed from: f */
    public void mo5141f(C2765yl r2) {
        AbstractC0617OE.m1208p(this.f9109c, r2.m5339d());
    }

    @Override // p000.AbstractC2796zF
    /* JADX INFO: renamed from: g */
    public void mo5086g(C2765yl r2) {
        AbstractC0617OE.m1202j(this.f9109c, r2.m5339d());
    }

    @Override // p000.AbstractC2796zF
    /* JADX INFO: renamed from: h */
    public void mo5142h(C2765yl r2) {
        AbstractC0617OE.m1210r(this.f9109c, r2.m5339d());
    }

    public C2624vF(C0489LF r1) {
        super(r1);
        WindowInsets r12 = r1.m945g();
        if (r12 == null) goto L5;
        WindowInsets.Builder r13 = AbstractC0617OE.m1196d(r12);
    L6:
        this.f9109c = r13;
        return;
    L5:
        r13 = AbstractC0617OE.m1195c();
        goto L6
    }
}
