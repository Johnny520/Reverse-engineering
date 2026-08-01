package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ky0 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f6309;

    /* JADX INFO: renamed from: β */
    public final p000.C0926vx f6310;

    /* JADX INFO: renamed from: γ */
    public final java.io.BufferedInputStream f6311;

    /* JADX INFO: renamed from: δ */
    public final byte[] f6312;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f6313;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f6314;

    /* JADX INFO: renamed from: η */
    public final java.lang.String f6315;

    /* JADX INFO: renamed from: θ */
    public final java.lang.String f6316;

    /* JADX INFO: renamed from: ι */
    public final boolean f6317;

    /* JADX INFO: renamed from: κ */
    public final java.lang.String f6318;

    /* JADX INFO: renamed from: λ */
    public final long f6319;

    /* JADX INFO: renamed from: μ */
    public final java.lang.String f6320;

    /* JADX INFO: renamed from: ν */
    public final java.lang.String f6321;

    public ky0(java.lang.String r1, p000.C0926vx r2, java.io.BufferedInputStream r3, byte[] r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9, java.lang.String r10, long r11, java.lang.String r13, java.lang.String r14) {
            r0 = this;
            r0.<init>()
            r0.f6309 = r1
            r0.f6310 = r2
            r0.f6311 = r3
            r0.f6312 = r4
            r0.f6313 = r5
            r0.f6314 = r6
            r0.f6315 = r7
            r0.f6316 = r8
            r0.f6317 = r9
            r0.f6318 = r10
            r0.f6319 = r11
            r0.f6320 = r13
            r0.f6321 = r14
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L4
            goto L99
        L4:
            boolean r0 = r5 instanceof p000.ky0
            if (r0 != 0) goto La
            goto L97
        La:
            ky0 r5 = (p000.ky0) r5
            java.lang.String r0 = r4.f6309
            java.lang.String r1 = r5.f6309
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L18
            goto L97
        L18:
            vx r0 = r4.f6310
            vx r1 = r5.f6310
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L24
            goto L97
        L24:
            java.io.BufferedInputStream r0 = r4.f6311
            java.io.BufferedInputStream r1 = r5.f6311
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L30
            goto L97
        L30:
            byte[] r0 = r4.f6312
            byte[] r1 = r5.f6312
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3b
            goto L97
        L3b:
            java.lang.String r0 = r4.f6313
            java.lang.String r1 = r5.f6313
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L46
            goto L97
        L46:
            java.lang.String r0 = r4.f6314
            java.lang.String r1 = r5.f6314
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L51
            goto L97
        L51:
            java.lang.String r0 = r4.f6315
            java.lang.String r1 = r5.f6315
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5c
            goto L97
        L5c:
            java.lang.String r0 = r4.f6316
            java.lang.String r1 = r5.f6316
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L67
            goto L97
        L67:
            boolean r0 = r4.f6317
            boolean r1 = r5.f6317
            if (r0 == r1) goto L6e
            goto L97
        L6e:
            java.lang.String r0 = r4.f6318
            java.lang.String r1 = r5.f6318
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L79
            goto L97
        L79:
            long r0 = r4.f6319
            long r2 = r5.f6319
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L82
            goto L97
        L82:
            java.lang.String r0 = r4.f6320
            java.lang.String r1 = r5.f6320
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8d
            goto L97
        L8d:
            java.lang.String r4 = r4.f6321
            java.lang.String r5 = r5.f6321
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L99
        L97:
            r4 = 0
            return r4
        L99:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f6309
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            vx r2 = r4.f6310
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.io.BufferedInputStream r0 = r4.f6311
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            byte[] r2 = r4.f6312
            int r2 = java.util.Arrays.hashCode(r2)
            int r2 = r2 + r0
            int r2 = r2 * r1
            r0 = 0
            java.lang.String r3 = r4.f6313
            if (r3 != 0) goto L28
            r3 = r0
            goto L2c
        L28:
            int r3 = r3.hashCode()
        L2c:
            int r2 = r2 + r3
            int r2 = r2 * r1
            java.lang.String r3 = r4.f6314
            if (r3 != 0) goto L33
            goto L37
        L33:
            int r0 = r3.hashCode()
        L37:
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.String r0 = r4.f6315
            int r0 = p000.a12.m15(r2, r1, r0)
            java.lang.String r2 = r4.f6316
            int r0 = p000.a12.m15(r0, r1, r2)
            boolean r2 = r4.f6317
            int r0 = p000.lz1.m3678(r0, r1, r2)
            java.lang.String r2 = r4.f6318
            int r0 = p000.a12.m15(r0, r1, r2)
            long r2 = r4.f6319
            int r0 = p000.lz1.m3677(r0, r1, r2)
            java.lang.String r2 = r4.f6320
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r4 = r4.f6321
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            byte[] r0 = r5.f6312
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "PreparedImageDownload(url="
            r1.<init>(r2)
            java.lang.String r2 = r5.f6309
            r1.append(r2)
            java.lang.String r2 = ", opened="
            r1.append(r2)
            vx r2 = r5.f6310
            r1.append(r2)
            java.lang.String r2 = ", input="
            r1.append(r2)
            java.io.BufferedInputStream r2 = r5.f6311
            r1.append(r2)
            java.lang.String r2 = ", headBytes="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ", headerMime="
            r1.append(r0)
            java.lang.String r0 = ", magicMime="
            java.lang.String r2 = ", finalMime="
            java.lang.String r3 = r5.f6313
            java.lang.String r4 = r5.f6314
            p000.AbstractC0602nx.m4119(r1, r3, r0, r4, r2)
            java.lang.String r0 = ", ext="
            java.lang.String r2 = ", transcodeToJpeg="
            java.lang.String r3 = r5.f6315
            java.lang.String r4 = r5.f6316
            p000.AbstractC0602nx.m4119(r1, r3, r0, r4, r2)
            boolean r0 = r5.f6317
            r1.append(r0)
            java.lang.String r0 = ", sourceMime="
            r1.append(r0)
            java.lang.String r0 = r5.f6318
            r1.append(r0)
            java.lang.String r0 = ", contentLength="
            r1.append(r0)
            long r2 = r5.f6319
            r1.append(r2)
            java.lang.String r0 = ", headerHex="
            r1.append(r0)
            java.lang.String r0 = r5.f6320
            r1.append(r0)
            java.lang.String r0 = ", headerTextPreview="
            java.lang.String r2 = ")"
            java.lang.String r5 = r5.f6321
            java.lang.String r5 = p000.AbstractC0602nx.m4133(r1, r0, r5, r2)
            return r5
    }
}
