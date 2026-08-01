package p000;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class kc0 {

    /* JADX INFO: renamed from: a */
    public final int f2814a;

    /* JADX INFO: renamed from: b */
    public float f2815b;

    /* JADX INFO: renamed from: c */
    public final Interpolator f2816c;

    /* JADX INFO: renamed from: d */
    public final long f2817d;

    public kc0(int i, Interpolator interpolator, long j) {
        this.f2814a = i;
        this.f2816c = interpolator;
        this.f2817d = j;
    }

    /* JADX INFO: renamed from: a */
    public long mo1598a() {
        return this.f2817d;
    }

    /* JADX INFO: renamed from: b */
    public float mo1599b() {
        Interpolator interpolator = this.f2816c;
        return interpolator != null ? interpolator.getInterpolation(this.f2815b) : this.f2815b;
    }

    /* JADX INFO: renamed from: c */
    public int mo1600c() {
        return this.f2814a;
    }

    /* JADX INFO: renamed from: d */
    public void mo1601d(float f) {
        this.f2815b = f;
    }
}
