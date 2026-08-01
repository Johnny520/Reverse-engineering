package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class vc1 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f11231;

    /* JADX INFO: renamed from: β */
    public final p000.uc1 f11232;

    /* JADX INFO: renamed from: γ */
    public final java.util.Map f11233;

    /* JADX INFO: renamed from: δ */
    public final long f11234;

    /* JADX INFO: renamed from: ε */
    public final java.lang.Long f11235;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f11236;

    /* JADX INFO: renamed from: η */
    public final java.lang.Long f11237;

    public vc1(java.lang.String r1, p000.uc1 r2, java.util.Map r3, long r4, java.lang.Long r6, java.lang.String r7, java.lang.Long r8) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f11231 = r1
            r0.f11232 = r2
            r0.f11233 = r3
            r0.f11234 = r4
            r0.f11235 = r6
            r0.f11236 = r7
            r0.f11237 = r8
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.vc1 m6172(p000.vc1 r9, java.util.LinkedHashMap r10, java.lang.Long r11, java.lang.String r12, java.lang.Long r13, int r14) {
            java.lang.String r1 = r9.f11231
            uc1 r2 = r9.f11232
            r0 = r14 & 4
            if (r0 == 0) goto La
            java.util.Map r10 = r9.f11233
        La:
            r3 = r10
            long r4 = r9.f11234
            r10 = r14 & 16
            if (r10 == 0) goto L13
            java.lang.Long r11 = r9.f11235
        L13:
            r6 = r11
            r10 = r14 & 32
            if (r10 == 0) goto L1a
            java.lang.String r12 = r9.f11236
        L1a:
            r7 = r12
            r10 = r14 & 64
            if (r10 == 0) goto L21
            java.lang.Long r13 = r9.f11237
        L21:
            r8 = r13
            r1.getClass()
            vc1 r0 = new vc1
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L52
        L3:
            boolean r0 = r5 instanceof p000.vc1
            if (r0 != 0) goto L8
            goto L50
        L8:
            vc1 r5 = (p000.vc1) r5
            java.lang.String r0 = r4.f11231
            java.lang.String r1 = r5.f11231
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L15
            goto L50
        L15:
            uc1 r0 = r4.f11232
            uc1 r1 = r5.f11232
            if (r0 == r1) goto L1c
            goto L50
        L1c:
            java.util.Map r0 = r4.f11233
            java.util.Map r1 = r5.f11233
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            goto L50
        L27:
            long r0 = r4.f11234
            long r2 = r5.f11234
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L30
            goto L50
        L30:
            java.lang.Long r0 = r4.f11235
            java.lang.Long r1 = r5.f11235
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L3b
            goto L50
        L3b:
            java.lang.String r0 = r4.f11236
            java.lang.String r1 = r5.f11236
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L46
            goto L50
        L46:
            java.lang.Long r4 = r4.f11237
            java.lang.Long r5 = r5.f11237
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L52
        L50:
            r4 = 0
            return r4
        L52:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f11231
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            uc1 r2 = r4.f11232
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.util.Map r0 = r4.f11233
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            long r2 = r4.f11234
            int r0 = p000.lz1.m3677(r0, r1, r2)
            r2 = 0
            java.lang.Long r3 = r4.f11235
            if (r3 != 0) goto L26
            r3 = r2
            goto L2a
        L26:
            int r3 = r3.hashCode()
        L2a:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.f11236
            if (r3 != 0) goto L32
            r3 = r2
            goto L36
        L32:
            int r3 = r3.hashCode()
        L36:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Long r4 = r4.f11237
            if (r4 != 0) goto L3d
            goto L41
        L3d:
            int r2 = r4.hashCode()
        L41:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CampRequestContext(identity="
            r0.<init>(r1)
            java.lang.String r1 = r3.f11231
            r0.append(r1)
            java.lang.String r1 = ", authType="
            r0.append(r1)
            uc1 r1 = r3.f11232
            r0.append(r1)
            java.lang.String r1 = ", headers="
            r0.append(r1)
            java.util.Map r1 = r3.f11233
            r0.append(r1)
            java.lang.String r1 = ", capturedAt="
            r0.append(r1)
            long r1 = r3.f11234
            r0.append(r1)
            java.lang.String r1 = ", conversationShortId="
            r0.append(r1)
            java.lang.Long r1 = r3.f11235
            r0.append(r1)
            java.lang.String r1 = ", conversationId="
            r0.append(r1)
            java.lang.String r1 = r3.f11236
            r0.append(r1)
            java.lang.String r1 = ", otherUid="
            r0.append(r1)
            java.lang.Long r3 = r3.f11237
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: β */
    public final java.lang.String m6173() {
            r1 = this;
            uc1 r0 = r1.f11232
            java.lang.String r1 = r1.f11231
            java.lang.String r1 = r0.m5842(r1)
            return r1
    }
}
