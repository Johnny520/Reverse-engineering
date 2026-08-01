package p000;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class fc0 {

    /* JADX INFO: renamed from: a */
    public final int f1929a;

    /* JADX INFO: renamed from: b */
    public float f1930b;

    /* JADX INFO: renamed from: c */
    public final Interpolator f1931c;

    /* JADX INFO: renamed from: d */
    public final long f1932d;

    public fc0(int i, Interpolator interpolator, long j) {
        this.f1929a = i;
        this.f1931c = interpolator;
        this.f1932d = j;
    }

    /* JADX INFO: renamed from: a */
    public long mo1015a() {
        return this.f1932d;
    }

    /* JADX INFO: renamed from: b */
    public float mo1016b() {
        Interpolator interpolator = this.f1931c;
        return interpolator != null ? interpolator.getInterpolation(this.f1930b) : this.f1930b;
    }

    /* JADX INFO: renamed from: c */
    public int mo1017c() {
        return this.f1929a;
    }

    /* JADX INFO: renamed from: d */
    public void mo1018d(float f) {
        this.f1930b = f;
    }
}
