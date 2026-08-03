package p006D;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: D.c0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0094c0 {

    /* JADX INFO: renamed from: a */
    public final int f246a;

    /* JADX INFO: renamed from: b */
    public float f247b;

    /* JADX INFO: renamed from: c */
    public final Interpolator f248c;

    /* JADX INFO: renamed from: d */
    public final long f249d;

    public AbstractC0094c0(int i2, Interpolator interpolator, long j2) {
        this.f246a = i2;
        this.f248c = interpolator;
        this.f249d = j2;
    }

    /* JADX INFO: renamed from: a */
    public long mo320a() {
        return this.f249d;
    }

    /* JADX INFO: renamed from: b */
    public float mo321b() {
        Interpolator interpolator = this.f248c;
        return interpolator != null ? interpolator.getInterpolation(this.f247b) : this.f247b;
    }

    /* JADX INFO: renamed from: c */
    public int mo322c() {
        return this.f246a;
    }

    /* JADX INFO: renamed from: d */
    public void mo323d(float f2) {
        this.f247b = f2;
    }
}
