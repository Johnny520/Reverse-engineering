package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class w32 {

    /* JADX INFO: renamed from: α */
    public final p000.ux1 f11556;

    /* JADX INFO: renamed from: β */
    public final p000.r91 f11557;

    /* JADX INFO: renamed from: γ */
    public final p000.nh1 f11558;

    static {
            w32 r0 = new w32
            r5 = 0
            r6 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = 0
            r3 = 0
            r0.<init>(r1, r3, r5, r6)
            return
    }

    public w32(long r22, long r24, p000.d60 r26, int r27) {
            r21 = this;
            r0 = r27 & 1
            if (r0 == 0) goto L8
            long r0 = p000.C0114ci.f2125
            r3 = r0
            goto La
        L8:
            r3 = r22
        La:
            r0 = r27 & 2
            if (r0 == 0) goto L12
            long r0 = p000.y32.f12441
            r5 = r0
            goto L14
        L12:
            r5 = r24
        L14:
            r0 = r27 & 4
            r1 = 0
            if (r0 == 0) goto L1b
            r7 = r1
            goto L1d
        L1b:
            r7 = r26
        L1d:
            long r10 = p000.y32.f12441
            long r17 = p000.C0114ci.f2125
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r27 & r0
            if (r0 == 0) goto L2a
            r0 = 0
            goto L2b
        L2a:
            r0 = 3
        L2b:
            ux1 r2 = new ux1
            r8 = 0
            r9 = 0
            r12 = r10
            r10 = 0
            r11 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r19 = 0
            r20 = 0
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r19, r20)
            r91 r7 = new r91
            r9 = 0
            r10 = r12
            r12 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r8 = r0
            r13 = r1
            r7.<init>(r8, r9, r10, r12, r13, r14, r15, r16, r17)
            r0 = 0
            r1 = r21
            r1.<init>(r2, r7, r0)
            return
    }

    public w32(p000.ux1 r3, p000.r91 r4) {
            r2 = this;
            r3.getClass()
            kh1 r0 = r4.f9305
            if (r0 != 0) goto L9
            r0 = 0
            goto Lf
        L9:
            nh1 r1 = new nh1
            r1.<init>(r0)
            r0 = r1
        Lf:
            r2.<init>(r3, r4, r0)
            return
    }

    public w32(p000.ux1 r1, p000.r91 r2, p000.nh1 r3) {
            r0 = this;
            r0.<init>()
            r0.f11556 = r1
            r0.f11557 = r2
            r0.f11558 = r3
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.w32 m6314(p000.w32 r23, long r24) {
            r0 = r23
            long r4 = p000.y32.f12441
            long r18 = p000.C0114ci.f2125
            ux1 r1 = r0.f11556
            r6 = r4
            r4 = 0
            r5 = 2143289344(0x7fc00000, float:NaN)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r13 = r6
            r2 = r24
            ux1 r12 = p000.vx1.m6284(r1, r2, r4, r5, r6, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r20, r21, r22)
            r91 r1 = r0.f11557
            r2 = 0
            r3 = 0
            r4 = r6
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r91 r1 = p000.s91.m5378(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11)
            ux1 r2 = r0.f11556
            if (r2 != r12) goto L39
            r91 r2 = r0.f11557
            if (r2 != r1) goto L39
            return r0
        L39:
            w32 r0 = new w32
            r0.<init>(r12, r1)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.w32
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            w32 r5 = (p000.w32) r5
            ux1 r1 = r5.f11556
            ux1 r3 = r4.f11556
            boolean r1 = p000.ln0.m3626(r3, r1)
            if (r1 != 0) goto L17
            return r2
        L17:
            r91 r1 = r4.f11557
            r91 r3 = r5.f11557
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            nh1 r4 = r4.f11558
            nh1 r5 = r5.f11558
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            ux1 r0 = r2.f11556
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            r91 r1 = r2.f11557
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            nh1 r2 = r2.f11558
            if (r2 == 0) goto L1a
            int r2 = r2.hashCode()
            goto L1b
        L1a:
            r2 = 0
        L1b:
            int r1 = r1 + r2
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextStyle(color="
            r0.<init>(r1)
            ux1 r1 = r4.f11556
            f32 r2 = r1.f10996
            long r2 = r2.mo2033()
            java.lang.String r2 = p000.C0114ci.m1198(r2)
            r0.append(r2)
            java.lang.String r2 = ", brush="
            r0.append(r2)
            f32 r2 = r1.f10996
            kn0 r2 = r2.mo2034()
            r0.append(r2)
            java.lang.String r2 = ", alpha="
            r0.append(r2)
            f32 r2 = r1.f10996
            float r2 = r2.mo2035()
            r0.append(r2)
            java.lang.String r2 = ", fontSize="
            r0.append(r2)
            long r2 = r1.f10997
            java.lang.String r2 = p000.y32.m6821(r2)
            r0.append(r2)
            java.lang.String r2 = ", fontWeight="
            r0.append(r2)
            d60 r2 = r1.f10998
            r0.append(r2)
            java.lang.String r2 = ", fontStyle="
            r0.append(r2)
            b60 r2 = r1.f10999
            r0.append(r2)
            java.lang.String r2 = ", fontSynthesis="
            r0.append(r2)
            c60 r2 = r1.f11000
            r0.append(r2)
            java.lang.String r2 = ", fontFamily="
            r0.append(r2)
            br r2 = r1.f11001
            r0.append(r2)
            java.lang.String r2 = ", fontFeatureSettings="
            r0.append(r2)
            java.lang.String r2 = r1.f11002
            r0.append(r2)
            java.lang.String r2 = ", letterSpacing="
            r0.append(r2)
            long r2 = r1.f11003
            java.lang.String r2 = p000.y32.m6821(r2)
            r0.append(r2)
            java.lang.String r2 = ", baselineShift="
            r0.append(r2)
            r8 r2 = r1.f11004
            r0.append(r2)
            java.lang.String r2 = ", textGeometricTransform="
            r0.append(r2)
            g32 r2 = r1.f11005
            r0.append(r2)
            java.lang.String r2 = ", localeList="
            r0.append(r2)
            av0 r2 = r1.f11006
            r0.append(r2)
            java.lang.String r2 = ", background="
            r0.append(r2)
            long r2 = r1.f11007
            java.lang.String r2 = p000.C0114ci.m1198(r2)
            r0.append(r2)
            java.lang.String r2 = ", textDecoration="
            r0.append(r2)
            c32 r2 = r1.f11008
            r0.append(r2)
            java.lang.String r2 = ", shadow="
            r0.append(r2)
            fv1 r2 = r1.f11009
            r0.append(r2)
            java.lang.String r2 = ", drawStyle="
            r0.append(r2)
            kn0 r1 = r1.f11010
            r0.append(r1)
            java.lang.String r1 = ", textAlign="
            r0.append(r1)
            r91 r1 = r4.f11557
            int r2 = r1.f9301
            java.lang.String r2 = p000.z22.m7085(r2)
            r0.append(r2)
            java.lang.String r2 = ", textDirection="
            r0.append(r2)
            int r2 = r1.f9302
            java.lang.String r2 = p000.e32.m1840(r2)
            r0.append(r2)
            java.lang.String r2 = ", lineHeight="
            r0.append(r2)
            long r2 = r1.f9303
            java.lang.String r2 = p000.y32.m6821(r2)
            r0.append(r2)
            java.lang.String r2 = ", textIndent="
            r0.append(r2)
            h32 r2 = r1.f9304
            r0.append(r2)
            java.lang.String r2 = ", platformStyle="
            r0.append(r2)
            nh1 r4 = r4.f11558
            r0.append(r4)
            java.lang.String r4 = ", lineHeightStyle="
            r0.append(r4)
            wr0 r4 = r1.f9306
            r0.append(r4)
            java.lang.String r4 = ", lineBreak="
            r0.append(r4)
            int r4 = r1.f9307
            java.lang.String r4 = p000.rr0.m5122(r4)
            r0.append(r4)
            java.lang.String r4 = ", hyphens="
            r0.append(r4)
            int r4 = r1.f9308
            java.lang.String r4 = p000.rg0.m5086(r4)
            r0.append(r4)
            java.lang.String r4 = ", textMotion="
            r0.append(r4)
            q32 r4 = r1.f9309
            r0.append(r4)
            r4 = 41
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
