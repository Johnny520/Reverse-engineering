package p000;

import android.view.WindowInsets;

/* JADX INFO: renamed from: BF */
/* JADX INFO: loaded from: classes.dex */
public class C0059BF extends C0016AF {

    /* JADX INFO: renamed from: n */
    public C2765yl f138n;

    public C0059BF(C0489LF c0489lf, WindowInsets windowInsets) {
        super(c0489lf, windowInsets);
        this.f138n = null;
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: b */
    public C0489LF mo91b() {
        return C0489LF.m939h(null, this.f26c.consumeStableInsets());
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: c */
    public C0489LF mo92c() {
        return C0489LF.m939h(null, this.f26c.consumeSystemWindowInsets());
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: i */
    public final C2765yl mo93i() {
        if (this.f138n == null) {
            WindowInsets windowInsets = this.f26c;
            this.f138n = C2765yl.m5337b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f138n;
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: n */
    public boolean mo94n() {
        return this.f26c.isConsumed();
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: s */
    public void mo95s(C2765yl c2765yl) {
        this.f138n = c2765yl;
    }

    public C0059BF(C0489LF c0489lf, C0059BF c0059bf) {
        super(c0489lf, c0059bf);
        this.f138n = null;
        this.f138n = c0059bf.f138n;
    }
}
