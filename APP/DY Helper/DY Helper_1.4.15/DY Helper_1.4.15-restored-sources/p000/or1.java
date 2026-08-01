package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class or1 {

    /* JADX INFO: renamed from: α */
    public final long f8180;

    /* JADX INFO: renamed from: β */
    public final long f8181;

    /* JADX INFO: renamed from: γ */
    public final int f8182;

    /* JADX INFO: renamed from: δ */
    public final int f8183;

    /* JADX INFO: renamed from: ε */
    public final float f8184;

    /* JADX INFO: renamed from: ζ */
    public final float f8185;

    /* JADX INFO: renamed from: η */
    public final java.lang.String f8186;

    /* JADX INFO: renamed from: θ */
    public final int f8187;

    /* JADX INFO: renamed from: ι */
    public final long f8188;

    public or1(long r1, long r3, int r5, int r6, float r7, float r8, java.lang.String r9, int r10, long r11) {
            r0 = this;
            r0.<init>()
            r0.f8180 = r1
            r0.f8181 = r3
            r0.f8182 = r5
            r0.f8183 = r6
            r0.f8184 = r7
            r0.f8185 = r8
            r0.f8186 = r9
            r0.f8187 = r10
            r0.f8188 = r11
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L5c
        L3:
            boolean r0 = r5 instanceof p000.or1
            if (r0 != 0) goto L8
            goto L5a
        L8:
            or1 r5 = (p000.or1) r5
            long r0 = r4.f8180
            long r2 = r5.f8180
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L5a
        L13:
            long r0 = r4.f8181
            long r2 = r5.f8181
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1c
            goto L5a
        L1c:
            int r0 = r4.f8182
            int r1 = r5.f8182
            if (r0 == r1) goto L23
            goto L5a
        L23:
            int r0 = r4.f8183
            int r1 = r5.f8183
            if (r0 == r1) goto L2a
            goto L5a
        L2a:
            float r0 = r4.f8184
            float r1 = r5.f8184
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L35
            goto L5a
        L35:
            float r0 = r4.f8185
            float r1 = r5.f8185
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L40
            goto L5a
        L40:
            java.lang.String r0 = r4.f8186
            java.lang.String r1 = r5.f8186
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4b
            goto L5a
        L4b:
            int r0 = r4.f8187
            int r1 = r5.f8187
            if (r0 == r1) goto L52
            goto L5a
        L52:
            long r0 = r4.f8188
            long r4 = r5.f8188
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto L5c
        L5a:
            r4 = 0
            return r4
        L5c:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.f8180
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f8181
            int r0 = p000.lz1.m3677(r0, r1, r2)
            int r2 = r4.f8182
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r4.f8183
            int r0 = p000.a12.m14(r2, r0, r1)
            float r2 = r4.f8184
            int r0 = p000.lz1.m3676(r2, r0, r1)
            float r2 = r4.f8185
            int r0 = p000.lz1.m3676(r2, r0, r1)
            java.lang.String r2 = r4.f8186
            int r0 = p000.a12.m15(r0, r1, r2)
            int r2 = r4.f8187
            int r0 = p000.a12.m14(r2, r0, r1)
            long r1 = r4.f8188
            int r4 = java.lang.Long.hashCode(r1)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PlaybackInfo(currentMs="
            r0.<init>(r1)
            long r1 = r3.f8180
            r0.append(r1)
            java.lang.String r1 = ", durationMs="
            r0.append(r1)
            long r1 = r3.f8181
            r0.append(r1)
            java.lang.String r1 = ", progress="
            r0.append(r1)
            int r1 = r3.f8182
            r0.append(r1)
            java.lang.String r1 = ", max="
            r0.append(r1)
            int r1 = r3.f8183
            r0.append(r1)
            java.lang.String r1 = ", ratio="
            r0.append(r1)
            float r1 = r3.f8184
            r0.append(r1)
            java.lang.String r1 = ", percent="
            r0.append(r1)
            float r1 = r3.f8185
            r0.append(r1)
            java.lang.String r1 = ", displayText="
            r0.append(r1)
            java.lang.String r1 = r3.f8186
            r0.append(r1)
            java.lang.String r1 = ", viewHash="
            r0.append(r1)
            int r1 = r3.f8187
            r0.append(r1)
            java.lang.String r1 = ", updatedAtUptimeMs="
            r0.append(r1)
            long r1 = r3.f8188
            r0.append(r1)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
