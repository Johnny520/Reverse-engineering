package p000;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fe3 {

    /* JADX INFO: renamed from: a */
    public final int f2924a;

    /* JADX INFO: renamed from: b */
    public float f2925b;

    /* JADX INFO: renamed from: c */
    public final Interpolator f2926c;

    /* JADX INFO: renamed from: d */
    public final long f2927d;

    public fe3(int i, Interpolator interpolator, long j) {
        this.f2924a = i;
        this.f2926c = interpolator;
        this.f2927d = j;
    }

    /* JADX INFO: renamed from: a */
    public float mo1344a() {
        return 1.0f;
    }

    /* JADX INFO: renamed from: b */
    public long mo1345b() {
        return this.f2927d;
    }

    /* JADX INFO: renamed from: c */
    public float mo1346c() {
        float f = this.f2925b;
        Interpolator interpolator = this.f2926c;
        return interpolator != null ? interpolator.getInterpolation(f) : f;
    }

    /* JADX INFO: renamed from: d */
    public int mo1347d() {
        return this.f2924a;
    }

    /* JADX INFO: renamed from: e */
    public void mo1348e(float f) {
        this.f2925b = f;
    }
}
