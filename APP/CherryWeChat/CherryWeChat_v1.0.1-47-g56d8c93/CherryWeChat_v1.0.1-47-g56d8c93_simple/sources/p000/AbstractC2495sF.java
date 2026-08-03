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

    public AbstractC2495sF(int r1, Interpolator r2, long r3) {
        this.f8758a = r1;
        this.f8760c = r2;
        this.f8761d = r3;
    }

    /* JADX INFO: renamed from: a */
    public long mo4893a() {
        return this.f8761d;
    }

    /* JADX INFO: renamed from: b */
    public float mo4894b() {
        Interpolator r0 = this.f8760c;
        if (r0 == null) goto L7;
        return r0.getInterpolation(this.f8759b);
    L7:
        return this.f8759b;
    }

    /* JADX INFO: renamed from: c */
    public int mo4895c() {
        return this.f8758a;
    }

    /* JADX INFO: renamed from: d */
    public void mo4896d(float r1) {
        this.f8759b = r1;
    }
}
