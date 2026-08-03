package p000;

import android.view.WindowInsets;

/* JADX INFO: renamed from: BF */
/* JADX INFO: loaded from: classes.dex */
public class C0059BF extends C0016AF {

    /* JADX INFO: renamed from: n */
    public C2765yl f138n;

    public C0059BF(C0489LF r1, WindowInsets r2) {
        super(r1, r2);
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
        if (this.f138n != null) goto L6;
        WindowInsets r0 = this.f26c;
        this.f138n = C2765yl.m5337b(r0.getStableInsetLeft(), r0.getStableInsetTop(), r0.getStableInsetRight(), r0.getStableInsetBottom());
    L6:
        return this.f138n;
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: n */
    public boolean mo94n() {
        return this.f26c.isConsumed();
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: s */
    public void mo95s(C2765yl r1) {
        this.f138n = r1;
    }

    public C0059BF(C0489LF r1, C0059BF r2) {
        super(r1, r2);
        this.f138n = null;
        this.f138n = r2.f138n;
    }
}
