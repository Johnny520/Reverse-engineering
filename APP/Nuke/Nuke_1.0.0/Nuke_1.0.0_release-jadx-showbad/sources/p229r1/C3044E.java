package p229r1;

import android.view.WindowInsetsAnimation;

/* JADX INFO: renamed from: r1.E */
/* JADX INFO: loaded from: classes.dex */
public final class C3044E extends AbstractC3045F {

    /* JADX INFO: renamed from: e */
    public final WindowInsetsAnimation f9736e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3044E(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f9736e = windowInsetsAnimation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.AbstractC3045F
    /* JADX INFO: renamed from: a */
    public final float mo5316a() {
        return this.f9736e.getAlpha();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.AbstractC3045F
    /* JADX INFO: renamed from: b */
    public final long mo5317b() {
        return this.f9736e.getDurationMillis();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.AbstractC3045F
    /* JADX INFO: renamed from: c */
    public final float mo5318c() {
        return this.f9736e.getInterpolatedFraction();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.AbstractC3045F
    /* JADX INFO: renamed from: d */
    public final int mo5319d() {
        return this.f9736e.getTypeMask();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.AbstractC3045F
    /* JADX INFO: renamed from: e */
    public final void mo5320e(float f2) {
        this.f9736e.setFraction(f2);
    }
}
