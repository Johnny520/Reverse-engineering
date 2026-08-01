package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class cs implements android.view.animation.Interpolator {
    public final float[] a;
    public final float b;

    public cs(float[] r2) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            int r2 = r2.length
            int r2 = r2 + (-1)
            float r2 = (float) r2
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 / r2
            r1.b = r0
            return
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float r5) {
            r4 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 < 0) goto L7
            return r0
        L7:
            r0 = 0
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 > 0) goto Ld
            return r0
        Ld:
            float[] r0 = r4.a
            int r1 = r0.length
            int r1 = r1 + (-1)
            float r1 = (float) r1
            float r1 = r1 * r5
            int r1 = (int) r1
            int r2 = r0.length
            int r2 = r2 + (-2)
            int r1 = java.lang.Math.min(r1, r2)
            float r2 = (float) r1
            float r3 = r4.b
            float r2 = r2 * r3
            float r5 = r5 - r2
            float r5 = r5 / r3
            r2 = r0[r1]
            int r1 = r1 + 1
            r0 = r0[r1]
            float r0 = r0 - r2
            float r0 = r0 * r5
            float r0 = r0 + r2
            return r0
    }
}
