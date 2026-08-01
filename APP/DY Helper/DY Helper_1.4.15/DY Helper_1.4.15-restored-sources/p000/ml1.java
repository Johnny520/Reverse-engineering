package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ml1 {

    /* JADX INFO: renamed from: ε */
    public static final p000.ml1 f7199 = null;

    /* JADX INFO: renamed from: α */
    public final float f7200;

    /* JADX INFO: renamed from: β */
    public final float f7201;

    /* JADX INFO: renamed from: γ */
    public final float f7202;

    /* JADX INFO: renamed from: δ */
    public final float f7203;

    static {
            ml1 r0 = new ml1
            r1 = 0
            r0.<init>(r1, r1, r1, r1)
            p000.ml1.f7199 = r0
            return
    }

    public ml1(float r1, float r2, float r3, float r4) {
            r0 = this;
            r0.<init>()
            r0.f7200 = r1
            r0.f7201 = r2
            r0.f7202 = r3
            r0.f7203 = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.ml1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ml1 r5 = (p000.ml1) r5
            float r1 = r4.f7200
            float r3 = r5.f7200
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L17
            return r2
        L17:
            float r1 = r4.f7201
            float r3 = r5.f7201
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L22
            return r2
        L22:
            float r1 = r4.f7202
            float r3 = r5.f7202
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L2d
            return r2
        L2d:
            float r4 = r4.f7203
            float r5 = r5.f7203
            int r4 = java.lang.Float.compare(r4, r5)
            if (r4 == 0) goto L38
            return r2
        L38:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f7200
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f7201
            int r0 = p000.lz1.m3676(r2, r0, r1)
            float r2 = r3.f7202
            int r0 = p000.lz1.m3676(r2, r0, r1)
            float r3 = r3.f7203
            int r3 = java.lang.Float.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Rect.fromLTRB("
            r0.<init>(r1)
            float r1 = r3.f7200
            java.lang.String r1 = p000.kn0.m3356(r1)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            float r2 = r3.f7201
            java.lang.String r2 = p000.kn0.m3356(r2)
            r0.append(r2)
            r0.append(r1)
            float r2 = r3.f7202
            java.lang.String r2 = p000.kn0.m3356(r2)
            r0.append(r2)
            r0.append(r1)
            float r3 = r3.f7203
            java.lang.String r3 = p000.kn0.m3356(r3)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: α */
    public final long m3866() {
            r6 = this;
            float r0 = r6.f7202
            float r1 = r6.f7200
            float r0 = r0 - r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            float r0 = r0 + r1
            float r1 = r6.f7203
            float r6 = r6.f7201
            float r1 = r1 - r6
            float r1 = r1 / r2
            float r1 = r1 + r6
            int r6 = java.lang.Float.floatToRawIntBits(r0)
            long r2 = (long) r6
            int r6 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r6
            r6 = 32
            long r2 = r2 << r6
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            long r0 = r0 | r2
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final long m3867() {
            r6 = this;
            float r0 = r6.f7202
            float r1 = r6.f7200
            float r0 = r0 - r1
            float r1 = r6.f7203
            float r6 = r6.f7201
            float r1 = r1 - r6
            int r6 = java.lang.Float.floatToRawIntBits(r0)
            long r2 = (long) r6
            int r6 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r6
            r6 = 32
            long r2 = r2 << r6
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            long r0 = r0 | r2
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final p000.ml1 m3868(p000.ml1 r6) {
            r5 = this;
            ml1 r0 = new ml1
            float r1 = r5.f7200
            float r2 = r6.f7200
            float r1 = java.lang.Math.max(r1, r2)
            float r2 = r5.f7201
            float r3 = r6.f7201
            float r2 = java.lang.Math.max(r2, r3)
            float r3 = r5.f7202
            float r4 = r6.f7202
            float r3 = java.lang.Math.min(r3, r4)
            float r5 = r5.f7203
            float r6 = r6.f7203
            float r5 = java.lang.Math.min(r5, r6)
            r0.<init>(r1, r2, r3, r5)
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public final p000.ml1 m3869(float r5, float r6) {
            r4 = this;
            ml1 r0 = new ml1
            float r1 = r4.f7200
            float r1 = r1 + r5
            float r2 = r4.f7201
            float r2 = r2 + r6
            float r3 = r4.f7202
            float r3 = r3 + r5
            float r4 = r4.f7203
            float r4 = r4 + r6
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public final p000.ml1 m3870(long r6) {
            r5 = this;
            ml1 r0 = new ml1
            r1 = 32
            long r1 = r6 >> r1
            int r1 = (int) r1
            float r2 = java.lang.Float.intBitsToFloat(r1)
            float r3 = r5.f7200
            float r2 = r2 + r3
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r3
            int r6 = (int) r6
            float r7 = java.lang.Float.intBitsToFloat(r6)
            float r3 = r5.f7201
            float r7 = r7 + r3
            float r3 = r5.f7202
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r1 = r1 + r3
            float r5 = r5.f7203
            float r6 = java.lang.Float.intBitsToFloat(r6)
            float r6 = r6 + r5
            r0.<init>(r2, r7, r1, r6)
            return r0
    }
}
