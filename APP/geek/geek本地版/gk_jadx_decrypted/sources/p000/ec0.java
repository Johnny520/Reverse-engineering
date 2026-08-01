package p000;

import android.view.WindowInsetsAnimation;

/* JADX INFO: loaded from: classes.dex */
public final class ec0 extends fc0 {

    /* JADX INFO: renamed from: e */
    public final WindowInsetsAnimation f1772e;

    public ec0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f1772e = windowInsetsAnimation;
    }

    @Override // p000.fc0
    /* JADX INFO: renamed from: a */
    public final long mo1015a() {
        return this.f1772e.getDurationMillis();
    }

    @Override // p000.fc0
    /* JADX INFO: renamed from: b */
    public final float mo1016b() {
        return this.f1772e.getInterpolatedFraction();
    }

    @Override // p000.fc0
    /* JADX INFO: renamed from: c */
    public final int mo1017c() {
        return this.f1772e.getTypeMask();
    }

    @Override // p000.fc0
    /* JADX INFO: renamed from: d */
    public final void mo1018d(float f) {
        this.f1772e.setFraction(f);
    }
}
