package p000;

import android.view.WindowInsetsAnimation;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ee3 extends fe3 {

    /* JADX INFO: renamed from: e */
    public final WindowInsetsAnimation f2420e;

    public ee3(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f2420e = windowInsetsAnimation;
    }

    @Override // p000.fe3
    /* JADX INFO: renamed from: a */
    public final float mo1344a() {
        return this.f2420e.getAlpha();
    }

    @Override // p000.fe3
    /* JADX INFO: renamed from: b */
    public final long mo1345b() {
        return this.f2420e.getDurationMillis();
    }

    @Override // p000.fe3
    /* JADX INFO: renamed from: c */
    public final float mo1346c() {
        return this.f2420e.getInterpolatedFraction();
    }

    @Override // p000.fe3
    /* JADX INFO: renamed from: d */
    public final int mo1347d() {
        return this.f2420e.getTypeMask();
    }

    @Override // p000.fe3
    /* JADX INFO: renamed from: e */
    public final void mo1348e(float f) {
        this.f2420e.setFraction(f);
    }
}
