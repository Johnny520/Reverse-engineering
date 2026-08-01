package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ky1 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f6322;

    /* JADX INFO: renamed from: β */
    public final long f6323;

    /* JADX INFO: renamed from: γ */
    public final long f6324;

    /* JADX INFO: renamed from: δ */
    public final int f6325;

    /* JADX INFO: renamed from: ε */
    public final int f6326;

    /* JADX INFO: renamed from: ζ */
    public final boolean f6327;

    /* JADX INFO: renamed from: η */
    public final int f6328;

    /* JADX INFO: renamed from: θ */
    public final java.lang.String f6329;

    /* JADX INFO: renamed from: ι */
    public final boolean f6330;

    /* JADX INFO: renamed from: κ */
    public final java.lang.String f6331;

    public ky1(java.lang.String r1, long r2, long r4, int r6, int r7, boolean r8, int r9, java.lang.String r10, boolean r11, java.lang.String r12) {
            r0 = this;
            r0.<init>()
            r0.f6322 = r1
            r0.f6323 = r2
            r0.f6324 = r4
            r0.f6325 = r6
            r0.f6326 = r7
            r0.f6327 = r8
            r0.f6328 = r9
            r0.f6329 = r10
            r0.f6330 = r11
            r0.f6331 = r12
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.ky1 m3426(p000.ky1 r13, long r14, java.lang.String r16, int r17) {
            r0 = r17
            java.lang.String r1 = r13.f6322
            long r2 = r13.f6323
            r4 = r0 & 4
            if (r4 == 0) goto Ld
            long r4 = r13.f6324
            goto Le
        Ld:
            r4 = r14
        Le:
            int r6 = r13.f6325
            int r7 = r13.f6326
            boolean r8 = r13.f6327
            int r9 = r13.f6328
            java.lang.String r10 = r13.f6329
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L1f
            boolean r11 = r13.f6330
            goto L20
        L1f:
            r11 = 1
        L20:
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L28
            java.lang.String r13 = r13.f6331
            r12 = r13
            goto L2a
        L28:
            r12 = r16
        L2a:
            ky1 r0 = new ky1
            r0.<init>(r1, r2, r4, r6, r7, r8, r9, r10, r11, r12)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L4
            goto L62
        L4:
            boolean r0 = r5 instanceof p000.ky1
            if (r0 != 0) goto L9
            goto L60
        L9:
            ky1 r5 = (p000.ky1) r5
            java.lang.String r0 = r4.f6322
            java.lang.String r1 = r5.f6322
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L16
            goto L60
        L16:
            long r0 = r4.f6323
            long r2 = r5.f6323
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1f
            goto L60
        L1f:
            long r0 = r4.f6324
            long r2 = r5.f6324
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L28
            goto L60
        L28:
            int r0 = r4.f6325
            int r1 = r5.f6325
            if (r0 == r1) goto L2f
            goto L60
        L2f:
            int r0 = r4.f6326
            int r1 = r5.f6326
            if (r0 == r1) goto L36
            goto L60
        L36:
            boolean r0 = r4.f6327
            boolean r1 = r5.f6327
            if (r0 == r1) goto L3d
            goto L60
        L3d:
            int r0 = r4.f6328
            int r1 = r5.f6328
            if (r0 == r1) goto L44
            goto L60
        L44:
            java.lang.String r0 = r4.f6329
            java.lang.String r1 = r5.f6329
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4f
            goto L60
        L4f:
            boolean r0 = r4.f6330
            boolean r1 = r5.f6330
            if (r0 == r1) goto L56
            goto L60
        L56:
            java.lang.String r4 = r4.f6331
            java.lang.String r5 = r5.f6331
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L62
        L60:
            r4 = 0
            return r4
        L62:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f6322
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f6323
            int r0 = p000.lz1.m3677(r0, r1, r2)
            long r2 = r4.f6324
            int r0 = p000.lz1.m3677(r0, r1, r2)
            int r2 = r4.f6325
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r4.f6326
            int r0 = p000.a12.m14(r2, r0, r1)
            boolean r2 = r4.f6327
            int r0 = p000.lz1.m3678(r0, r1, r2)
            int r2 = r4.f6328
            int r0 = p000.a12.m14(r2, r0, r1)
            java.lang.String r2 = r4.f6329
            int r0 = p000.a12.m15(r0, r1, r2)
            boolean r2 = r4.f6330
            int r0 = p000.lz1.m3678(r0, r1, r2)
            java.lang.String r4 = r4.f6331
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = "SparkInfo(conversationId="
            java.lang.String r1 = ", conversationShortId="
            java.lang.String r2 = r5.f6322
            long r3 = r5.f6323
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4137(r0, r2, r3, r1)
            java.lang.String r1 = ", otherUid="
            java.lang.String r2 = ", conversationType="
            long r3 = r5.f6324
            p000.AbstractC0602nx.m4118(r0, r1, r3, r2)
            java.lang.String r1 = ", days="
            java.lang.String r2 = ", needsRenewal="
            int r3 = r5.f6325
            int r4 = r5.f6326
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            boolean r1 = r5.f6327
            r0.append(r1)
            java.lang.String r1 = ", currentState="
            r0.append(r1)
            int r1 = r5.f6328
            r0.append(r1)
            java.lang.String r1 = ", stateText="
            r0.append(r1)
            java.lang.String r1 = r5.f6329
            r0.append(r1)
            java.lang.String r1 = ", selfSentToday="
            r0.append(r1)
            boolean r1 = r5.f6330
            r0.append(r1)
            java.lang.String r1 = ", displayName="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r5 = r5.f6331
            java.lang.String r5 = p000.lz1.m3691(r0, r5, r1)
            return r5
    }
}
