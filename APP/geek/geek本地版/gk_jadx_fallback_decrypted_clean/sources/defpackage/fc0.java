package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class fc0 {
    public final int a;
    public float b;
    public final android.view.animation.Interpolator c;
    public final long d;

    public fc0(int r1, android.view.animation.Interpolator r2, long r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.c = r2
            r0.d = r3
            return
    }

    public long a() {
            r2 = this;
            long r0 = r2.d
            return r0
    }

    public float b() {
            r2 = this;
            android.view.animation.Interpolator r0 = r2.c
            if (r0 == 0) goto Lb
            float r1 = r2.b
            float r0 = r0.getInterpolation(r1)
            return r0
        Lb:
            float r0 = r2.b
            return r0
    }

    public int c() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public void d(float r1) {
            r0 = this;
            r0.b = r1
            return
    }
}
