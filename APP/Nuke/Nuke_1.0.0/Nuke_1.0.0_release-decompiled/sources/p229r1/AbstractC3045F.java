package p229r1;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: r1.F */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3045F {

    /* JADX INFO: renamed from: a */
    public final int f9737a;

    /* JADX INFO: renamed from: b */
    public float f9738b;

    /* JADX INFO: renamed from: c */
    public final Interpolator f9739c;

    /* JADX INFO: renamed from: d */
    public final long f9740d;

    public AbstractC3045F(int i5, Interpolator interpolator, long j5) {
        this.f9737a = i5;
        this.f9739c = interpolator;
        this.f9740d = j5;
    }

    /* JADX INFO: renamed from: a */
    public float mo5316a() {
        return 1.0f;
    }

    /* JADX INFO: renamed from: b */
    public long mo5317b() {
        return this.f9740d;
    }

    /* JADX INFO: renamed from: c */
    public float mo5318c() {
        Interpolator interpolator = this.f9739c;
        return interpolator != null ? interpolator.getInterpolation(this.f9738b) : this.f9738b;
    }

    /* JADX INFO: renamed from: d */
    public int mo5319d() {
        return this.f9737a;
    }

    /* JADX INFO: renamed from: e */
    public void mo5320e(float f2) {
        this.f9738b = f2;
    }
}
