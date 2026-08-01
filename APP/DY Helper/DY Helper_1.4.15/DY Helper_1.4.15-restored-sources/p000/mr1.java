package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class mr1 {

    /* JADX INFO: renamed from: α */
    public final long f7255;

    /* JADX INFO: renamed from: β */
    public final long f7256;

    /* JADX INFO: renamed from: γ */
    public final float f7257;

    /* JADX INFO: renamed from: δ */
    public final long f7258;

    public mr1(long r1, long r3, float r5, long r6) {
            r0 = this;
            r0.<init>()
            r0.f7255 = r1
            r0.f7256 = r3
            r0.f7257 = r5
            r0.f7258 = r6
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p000.mr1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            mr1 r8 = (p000.mr1) r8
            long r3 = r7.f7255
            long r5 = r8.f7255
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            long r3 = r7.f7256
            long r5 = r8.f7256
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L1e
            return r2
        L1e:
            float r1 = r7.f7257
            float r3 = r8.f7257
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L29
            return r2
        L29:
            long r3 = r7.f7258
            long r7 = r8.f7258
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L32
            return r2
        L32:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.f7255
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f7256
            int r0 = p000.lz1.m3677(r0, r1, r2)
            float r2 = r4.f7257
            int r0 = p000.lz1.m3676(r2, r0, r1)
            long r1 = r4.f7258
            int r4 = java.lang.Long.hashCode(r1)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ComponentInfo(currentMs="
            r0.<init>(r1)
            long r1 = r3.f7255
            r0.append(r1)
            java.lang.String r1 = ", durationMs="
            r0.append(r1)
            long r1 = r3.f7256
            r0.append(r1)
            java.lang.String r1 = ", ratio="
            r0.append(r1)
            float r1 = r3.f7257
            r0.append(r1)
            java.lang.String r1 = ", updatedAtUptimeMs="
            r0.append(r1)
            long r1 = r3.f7258
            r0.append(r1)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
