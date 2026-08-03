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

    public AbstractC0094c0(int r1, Interpolator r2, long r3) {
        this.f246a = r1;
        this.f248c = r2;
        this.f249d = r3;
    }

    /* JADX INFO: renamed from: a */
    public long mo320a() {
        return this.f249d;
    }

    /* JADX INFO: renamed from: b */
    public float mo321b() {
        Interpolator r02 = this.f248c;
        if (r02 == null) goto L7;
        return r02.getInterpolation(this.f247b);
    L7:
        return this.f247b;
    }

    /* JADX INFO: renamed from: c */
    public int mo322c() {
        return this.f246a;
    }

    /* JADX INFO: renamed from: d */
    public void mo323d(float r1) {
        this.f247b = r1;
    }
}
