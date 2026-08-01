package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class fc0 {
    public final int a;
    public float b;
    public final Interpolator c;
    public final long d;

    public fc0(int r1, Interpolator r2, long r3) {
        this.a = r1;
        this.c = r2;
        this.d = r3;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator r0 = this.c;
        if (r0 == null) goto L7;
        return r0.getInterpolation(this.b);
    L7:
        return this.b;
    }

    public int c() {
        return this.a;
    }

    public void d(float r1) {
        this.b = r1;
    }
}
