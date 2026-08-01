package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ea1 {

    /* JADX INFO: renamed from: α */
    public final float f3464;

    public ea1(float r1) {
            r0 = this;
            r0.<init>()
            r0.f3464 = r1
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L12
            r0 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L11
            goto L12
        L11:
            return
        L12:
            java.lang.String r0 = "The percent should be in the range of [0, 100]"
            p000.dm0.m1779(r0)
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p000.ea1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ea1 r4 = (p000.ea1) r4
            float r3 = r3.f3464
            float r4 = r4.f3464
            int r3 = java.lang.Float.compare(r3, r4)
            if (r3 == 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            float r0 = r0.f3464
            int r0 = java.lang.Float.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CornerSize(size = "
            r0.<init>(r1)
            float r2 = r2.f3464
            r0.append(r2)
            java.lang.String r2 = "%)"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: α */
    public final float m1890(long r1) {
            r0 = this;
            float r1 = p000.jw1.m2998(r1)
            float r0 = r0.f3464
            r2 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r2
            float r0 = r0 * r1
            return r0
    }
}
