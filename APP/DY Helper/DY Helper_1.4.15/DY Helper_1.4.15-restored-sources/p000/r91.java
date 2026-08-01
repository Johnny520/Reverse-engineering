package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class r91 implements p000.InterfaceC0235e4 {

    /* JADX INFO: renamed from: α */
    public final int f9301;

    /* JADX INFO: renamed from: β */
    public final int f9302;

    /* JADX INFO: renamed from: γ */
    public final long f9303;

    /* JADX INFO: renamed from: δ */
    public final p000.h32 f9304;

    /* JADX INFO: renamed from: ε */
    public final p000.kh1 f9305;

    /* JADX INFO: renamed from: ζ */
    public final p000.wr0 f9306;

    /* JADX INFO: renamed from: η */
    public final int f9307;

    /* JADX INFO: renamed from: θ */
    public final int f9308;

    /* JADX INFO: renamed from: ι */
    public final p000.q32 f9309;

    public r91(int r1, int r2, long r3, p000.h32 r5, p000.kh1 r6, p000.wr0 r7, int r8, int r9, p000.q32 r10) {
            r0 = this;
            r0.<init>()
            r0.f9301 = r1
            r0.f9302 = r2
            r0.f9303 = r3
            r0.f9304 = r5
            r0.f9305 = r6
            r0.f9306 = r7
            r0.f9307 = r8
            r0.f9308 = r9
            r0.f9309 = r10
            long r0 = p000.y32.f12441
            boolean r0 = p000.y32.m6818(r3, r0)
            if (r0 != 0) goto L41
            float r0 = p000.y32.m6820(r3)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L27
            goto L41
        L27:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "lineHeight can't be negative ("
            r0.<init>(r1)
            float r1 = p000.y32.m6820(r3)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            p000.bm0.m983(r0)
        L41:
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L59
        L3:
            boolean r0 = r5 instanceof p000.r91
            if (r0 != 0) goto L8
            goto L5b
        L8:
            r91 r5 = (p000.r91) r5
            int r0 = r5.f9301
            int r1 = r4.f9301
            if (r1 != r0) goto L5b
            int r0 = r4.f9302
            int r1 = r5.f9302
            if (r0 != r1) goto L5b
            long r0 = r4.f9303
            long r2 = r5.f9303
            boolean r0 = p000.y32.m6818(r0, r2)
            if (r0 != 0) goto L21
            goto L5b
        L21:
            h32 r0 = r4.f9304
            h32 r1 = r5.f9304
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2c
            goto L5b
        L2c:
            kh1 r0 = r4.f9305
            kh1 r1 = r5.f9305
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L37
            goto L5b
        L37:
            wr0 r0 = r4.f9306
            wr0 r1 = r5.f9306
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L42
            goto L5b
        L42:
            int r0 = r4.f9307
            int r1 = r5.f9307
            if (r0 != r1) goto L5b
            int r0 = r4.f9308
            int r1 = r5.f9308
            if (r0 != r1) goto L5b
            q32 r4 = r4.f9309
            q32 r5 = r5.f9309
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L59
            goto L5b
        L59:
            r4 = 1
            return r4
        L5b:
            r4 = 0
            return r4
    }

    public final int hashCode() {
            r4 = this;
            int r0 = r4.f9301
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r4.f9302
            int r0 = p000.a12.m14(r2, r0, r1)
            z32[] r2 = p000.y32.f12440
            long r2 = r4.f9303
            int r0 = p000.lz1.m3677(r0, r1, r2)
            r2 = 0
            h32 r3 = r4.f9304
            if (r3 == 0) goto L21
            int r3 = r3.hashCode()
            goto L22
        L21:
            r3 = r2
        L22:
            int r0 = r0 + r3
            int r0 = r0 * r1
            kh1 r3 = r4.f9305
            if (r3 == 0) goto L2d
            int r3 = r3.hashCode()
            goto L2e
        L2d:
            r3 = r2
        L2e:
            int r0 = r0 + r3
            int r0 = r0 * r1
            wr0 r3 = r4.f9306
            if (r3 == 0) goto L39
            int r3 = r3.hashCode()
            goto L3a
        L39:
            r3 = r2
        L3a:
            int r0 = r0 + r3
            int r0 = r0 * r1
            int r3 = r4.f9307
            int r0 = p000.a12.m14(r3, r0, r1)
            int r3 = r4.f9308
            int r0 = p000.a12.m14(r3, r0, r1)
            q32 r4 = r4.f9309
            if (r4 == 0) goto L50
            int r2 = r4.hashCode()
        L50:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ParagraphStyle(textAlign="
            r0.<init>(r1)
            int r1 = r3.f9301
            java.lang.String r1 = p000.z22.m7085(r1)
            r0.append(r1)
            java.lang.String r1 = ", textDirection="
            r0.append(r1)
            int r1 = r3.f9302
            java.lang.String r1 = p000.e32.m1840(r1)
            r0.append(r1)
            java.lang.String r1 = ", lineHeight="
            r0.append(r1)
            long r1 = r3.f9303
            java.lang.String r1 = p000.y32.m6821(r1)
            r0.append(r1)
            java.lang.String r1 = ", textIndent="
            r0.append(r1)
            h32 r1 = r3.f9304
            r0.append(r1)
            java.lang.String r1 = ", platformStyle="
            r0.append(r1)
            kh1 r1 = r3.f9305
            r0.append(r1)
            java.lang.String r1 = ", lineHeightStyle="
            r0.append(r1)
            wr0 r1 = r3.f9306
            r0.append(r1)
            java.lang.String r1 = ", lineBreak="
            r0.append(r1)
            int r1 = r3.f9307
            java.lang.String r1 = p000.rr0.m5122(r1)
            r0.append(r1)
            java.lang.String r1 = ", hyphens="
            r0.append(r1)
            int r1 = r3.f9308
            java.lang.String r1 = p000.rg0.m5086(r1)
            r0.append(r1)
            java.lang.String r1 = ", textMotion="
            r0.append(r1)
            q32 r3 = r3.f9309
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: α */
    public final p000.r91 m5076(p000.r91 r12) {
            r11 = this;
            if (r12 != 0) goto L3
            return r11
        L3:
            int r1 = r12.f9301
            int r2 = r12.f9302
            long r3 = r12.f9303
            h32 r5 = r12.f9304
            kh1 r6 = r12.f9305
            wr0 r7 = r12.f9306
            int r8 = r12.f9307
            int r9 = r12.f9308
            q32 r10 = r12.f9309
            r0 = r11
            r91 r11 = p000.s91.m5378(r0, r1, r2, r3, r5, r6, r7, r8, r9, r10)
            return r11
    }
}
