package p000;

/* JADX INFO: renamed from: cj */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0115cj {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f2154;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f2155;

    /* JADX INFO: renamed from: γ */
    public final boolean f2156;

    /* JADX INFO: renamed from: δ */
    public final java.lang.Long f2157;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f2158;

    /* JADX INFO: renamed from: ζ */
    public final long f2159;

    public C0115cj(java.lang.String r3, java.lang.String r4, boolean r5, java.lang.Long r6, java.lang.String r7) {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2.<init>()
            r2.f2154 = r3
            r2.f2155 = r4
            r2.f2156 = r5
            r2.f2157 = r6
            r2.f2158 = r7
            r2.f2159 = r0
            return
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p000.C0115cj
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            cj r6 = (p000.C0115cj) r6
            java.lang.String r1 = r5.f2154
            java.lang.String r3 = r6.f2154
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r5.f2155
            java.lang.String r3 = r6.f2155
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            boolean r1 = r5.f2156
            boolean r3 = r6.f2156
            if (r1 == r3) goto L29
            return r2
        L29:
            java.lang.Long r1 = r5.f2157
            java.lang.Long r3 = r6.f2157
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L34
            return r2
        L34:
            java.lang.String r1 = r5.f2158
            java.lang.String r3 = r6.f2158
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L3f
            return r2
        L3f:
            long r3 = r5.f2159
            long r5 = r6.f2159
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L48
            return r2
        L48:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f2154
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            java.lang.String r3 = r4.f2155
            if (r3 != 0) goto L10
            r3 = r2
            goto L14
        L10:
            int r3 = r3.hashCode()
        L14:
            int r0 = r0 + r3
            int r0 = r0 * r1
            boolean r3 = r4.f2156
            int r0 = p000.lz1.m3678(r0, r1, r3)
            java.lang.Long r3 = r4.f2157
            if (r3 != 0) goto L22
            r3 = r2
            goto L26
        L22:
            int r3 = r3.hashCode()
        L26:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.f2158
            if (r3 != 0) goto L2d
            goto L31
        L2d:
            int r2 = r3.hashCode()
        L31:
            int r0 = r0 + r2
            int r0 = r0 * r1
            long r1 = r4.f2159
            int r4 = java.lang.Long.hashCode(r1)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", content="
            java.lang.String r1 = ", isLocal="
            java.lang.String r2 = "AudioMeta(vid="
            java.lang.String r3 = r5.f2154
            java.lang.String r4 = r5.f2155
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            boolean r1 = r5.f2156
            r0.append(r1)
            java.lang.String r1 = ", durationMs="
            r0.append(r1)
            java.lang.Long r1 = r5.f2157
            r0.append(r1)
            java.lang.String r1 = ", displayText="
            r0.append(r1)
            java.lang.String r1 = r5.f2158
            r0.append(r1)
            java.lang.String r1 = ", timestamp="
            r0.append(r1)
            long r1 = r5.f2159
            r0.append(r1)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
