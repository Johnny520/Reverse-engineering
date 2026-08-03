package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4715 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.graphics.PointF f14957;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final float f14958;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final android.graphics.PointF f14959;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final float f14960;

    public C4715(@Yue.InterfaceC4410 android.graphics.PointF r2, float r3, @Yue.InterfaceC4410 android.graphics.PointF r4, float r5) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "start == null"
            java.lang.Object r2 = Yue.C4868.m19182(r2, r0)
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            r1.f14957 = r2
            r1.f14958 = r3
            java.lang.String r2 = "end == null"
            java.lang.Object r2 = Yue.C4868.m19182(r4, r2)
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            r1.f14959 = r2
            r1.f14960 = r5
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof Yue.C4715
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Yue.ۥۣۡۨۦ r5 = (Yue.C4715) r5
            float r1 = r4.f14958
            float r3 = r5.f14958
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 != 0) goto L35
            float r1 = r4.f14960
            float r3 = r5.f14960
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 != 0) goto L35
            android.graphics.PointF r1 = r4.f14957
            android.graphics.PointF r3 = r5.f14957
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L35
            android.graphics.PointF r1 = r4.f14959
            android.graphics.PointF r5 = r5.f14959
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L35
            goto L36
        L35:
            r0 = r2
        L36:
            return r0
    }

    public int hashCode() {
            r5 = this;
            android.graphics.PointF r0 = r5.f14957
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            float r1 = r5.f14958
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r4 = 0
            if (r3 == 0) goto L15
            int r1 = java.lang.Float.floatToIntBits(r1)
            goto L16
        L15:
            r1 = r4
        L16:
            int r0 = r0 + r1
            int r0 = r0 * 31
            android.graphics.PointF r1 = r5.f14959
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            float r1 = r5.f14960
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L2c
            int r4 = java.lang.Float.floatToIntBits(r1)
        L2c:
            int r0 = r0 + r4
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "PathSegment{start="
            r0.append(r1)
            android.graphics.PointF r1 = r2.f14957
            r0.append(r1)
            java.lang.String r1 = ", startFraction="
            r0.append(r1)
            float r1 = r2.f14958
            r0.append(r1)
            java.lang.String r1 = ", end="
            r0.append(r1)
            android.graphics.PointF r1 = r2.f14959
            r0.append(r1)
            java.lang.String r1 = ", endFraction="
            r0.append(r1)
            float r1 = r2.f14960
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public android.graphics.PointF m18731() {
            r1 = this;
            android.graphics.PointF r0 = r1.f14959
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public float m18732() {
            r1 = this;
            float r0 = r1.f14960
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public android.graphics.PointF m18733() {
            r1 = this;
            android.graphics.PointF r0 = r1.f14957
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public float m18734() {
            r1 = this;
            float r0 = r1.f14958
            return r0
    }
}
