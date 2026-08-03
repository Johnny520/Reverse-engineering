package p000;

import android.view.WindowInsetsAnimation;

/* JADX INFO: renamed from: rF */
/* JADX INFO: loaded from: classes.dex */
public final class C2452rF extends AbstractC2495sF {

    /* JADX INFO: renamed from: e */
    public final WindowInsetsAnimation f8579e;

    public C2452rF(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f8579e = windowInsetsAnimation;
    }

    @Override // p000.AbstractC2495sF
    /* JADX INFO: renamed from: a */
    public final long mo4893a() {
        return this.f8579e.getDurationMillis();
    }

    @Override // p000.AbstractC2495sF
    /* JADX INFO: renamed from: b */
    public final float mo4894b() {
        return this.f8579e.getInterpolatedFraction();
    }

    @Override // p000.AbstractC2495sF
    /* JADX INFO: renamed from: c */
    public final int mo4895c() {
        return this.f8579e.getTypeMask();
    }

    @Override // p000.AbstractC2495sF
    /* JADX INFO: renamed from: d */
    public final void mo4896d(float f) {
        this.f8579e.setFraction(f);
    }
}
