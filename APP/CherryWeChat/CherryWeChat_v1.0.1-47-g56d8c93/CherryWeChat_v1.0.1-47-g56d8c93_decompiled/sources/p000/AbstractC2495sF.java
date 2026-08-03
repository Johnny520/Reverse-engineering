package p000;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: sF */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2495sF {

    /* JADX INFO: renamed from: a */
    public final int f8758a;

    /* JADX INFO: renamed from: b */
    public float f8759b;

    /* JADX INFO: renamed from: c */
    public final Interpolator f8760c;

    /* JADX INFO: renamed from: d */
    public final long f8761d;

    public AbstractC2495sF(int i, Interpolator interpolator, long j) {
        this.f8758a = i;
        this.f8760c = interpolator;
        this.f8761d = j;
    }

    /* JADX INFO: renamed from: a */
    public long mo4893a() {
        return this.f8761d;
    }

    /* JADX INFO: renamed from: b */
    public float mo4894b() {
        Interpolator interpolator = this.f8760c;
        return interpolator != null ? interpolator.getInterpolation(this.f8759b) : this.f8759b;
    }

    /* JADX INFO: renamed from: c */
    public int mo4895c() {
        return this.f8758a;
    }

    /* JADX INFO: renamed from: d */
    public void mo4896d(float f) {
        this.f8759b = f;
    }
}
