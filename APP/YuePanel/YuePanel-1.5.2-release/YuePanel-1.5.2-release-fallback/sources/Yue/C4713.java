package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4713<T> extends android.util.Property<T, java.lang.Float> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.util.Property<T, android.graphics.PointF> f14948;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final android.graphics.PathMeasure f14949;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final float f14950;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final float[] f14951;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final android.graphics.PointF f14952;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public float f14953;

    public C4713(android.util.Property<T, android.graphics.PointF> r3, android.graphics.Path r4) {
            r2 = this;
            java.lang.String r0 = r3.getName()
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            r2.<init>(r1, r0)
            r0 = 2
            float[] r0 = new float[r0]
            r2.f14951 = r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r2.f14952 = r0
            r2.f14948 = r3
            android.graphics.PathMeasure r3 = new android.graphics.PathMeasure
            r0 = 0
            r3.<init>(r4, r0)
            r2.f14949 = r3
            float r3 = r3.getLength()
            r2.f14950 = r3
            return
    }

    @Override // android.util.Property
    public /* bridge */ /* synthetic */ java.lang.Float get(java.lang.Object r1) {
            r0 = this;
            java.lang.Float r1 = r0.m18728(r1)
            return r1
    }

    @Override // android.util.Property
    public /* bridge */ /* synthetic */ void set(java.lang.Object r1, java.lang.Float r2) {
            r0 = this;
            java.lang.Float r2 = (java.lang.Float) r2
            r0.m18729(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.lang.Float m18728(T r1) {
            r0 = this;
            float r1 = r0.f14953
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m18729(T r4, java.lang.Float r5) {
            r3 = this;
            float r0 = r5.floatValue()
            r3.f14953 = r0
            android.graphics.PathMeasure r0 = r3.f14949
            float r1 = r3.f14950
            float r5 = r5.floatValue()
            float r1 = r1 * r5
            float[] r5 = r3.f14951
            r2 = 0
            r0.getPosTan(r1, r5, r2)
            android.graphics.PointF r5 = r3.f14952
            float[] r0 = r3.f14951
            r1 = 0
            r1 = r0[r1]
            r5.x = r1
            r1 = 1
            r0 = r0[r1]
            r5.y = r0
            android.util.Property<T, android.graphics.PointF> r0 = r3.f14948
            r0.set(r4, r5)
            return
    }
}
