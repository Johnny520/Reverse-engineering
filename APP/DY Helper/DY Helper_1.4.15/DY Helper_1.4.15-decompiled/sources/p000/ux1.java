package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ux1 implements p000.InterfaceC0235e4 {

    /* JADX INFO: renamed from: α */
    public final p000.f32 f10996;

    /* JADX INFO: renamed from: β */
    public final long f10997;

    /* JADX INFO: renamed from: γ */
    public final p000.d60 f10998;

    /* JADX INFO: renamed from: δ */
    public final p000.b60 f10999;

    /* JADX INFO: renamed from: ε */
    public final p000.c60 f11000;

    /* JADX INFO: renamed from: ζ */
    public final p000.C0087br f11001;

    /* JADX INFO: renamed from: η */
    public final java.lang.String f11002;

    /* JADX INFO: renamed from: θ */
    public final long f11003;

    /* JADX INFO: renamed from: ι */
    public final p000.C0752r8 f11004;

    /* JADX INFO: renamed from: κ */
    public final p000.g32 f11005;

    /* JADX INFO: renamed from: λ */
    public final p000.av0 f11006;

    /* JADX INFO: renamed from: μ */
    public final long f11007;

    /* JADX INFO: renamed from: ν */
    public final p000.c32 f11008;

    /* JADX INFO: renamed from: ξ */
    public final p000.fv1 f11009;

    /* JADX INFO: renamed from: ο */
    public final p000.kn0 f11010;

    public ux1(long r23, long r25, p000.d60 r27, p000.b60 r28, p000.c60 r29, p000.C0087br r30, java.lang.String r31, long r32, p000.C0752r8 r34, p000.g32 r35, p000.av0 r36, long r37, p000.c32 r39, p000.fv1 r40) {
            r22 = this;
            r0 = r23
            r2 = 16
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto Lf
            oi r2 = new oi
            r2.<init>(r0)
        Ld:
            r4 = r2
            goto L12
        Lf:
            xn0 r2 = p000.xn0.f12221
            goto Ld
        L12:
            r21 = 0
            r3 = r22
            r5 = r25
            r7 = r27
            r8 = r28
            r9 = r29
            r10 = r30
            r11 = r31
            r12 = r32
            r14 = r34
            r15 = r35
            r16 = r36
            r17 = r37
            r19 = r39
            r20 = r40
            r3.<init>(r4, r5, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r19, r20, r21)
            return
    }

    public ux1(long r19, long r21, p000.d60 r23, p000.b60 r24, p000.c60 r25, p000.C0087br r26, java.lang.String r27, long r28, p000.C0752r8 r30, p000.g32 r31, p000.av0 r32, long r33, p000.c32 r35, p000.fv1 r36, int r37) {
            r18 = this;
            r0 = r37
            r1 = r0 & 1
            if (r1 == 0) goto L9
            long r1 = p000.C0114ci.f2125
            goto Lb
        L9:
            r1 = r19
        Lb:
            r3 = r0 & 2
            if (r3 == 0) goto L12
            long r3 = p000.y32.f12441
            goto L14
        L12:
            r3 = r21
        L14:
            r5 = r0 & 4
            if (r5 == 0) goto L1a
            r5 = 0
            goto L1c
        L1a:
            r5 = r23
        L1c:
            r7 = r0 & 8
            if (r7 == 0) goto L22
            r7 = 0
            goto L24
        L22:
            r7 = r24
        L24:
            r8 = r0 & 16
            if (r8 == 0) goto L2a
            r8 = 0
            goto L2c
        L2a:
            r8 = r25
        L2c:
            r9 = r0 & 32
            if (r9 == 0) goto L32
            r9 = 0
            goto L34
        L32:
            r9 = r26
        L34:
            r10 = r0 & 64
            if (r10 == 0) goto L3a
            r10 = 0
            goto L3c
        L3a:
            r10 = r27
        L3c:
            r11 = r0 & 128(0x80, float:1.8E-43)
            if (r11 == 0) goto L43
            long r11 = p000.y32.f12441
            goto L45
        L43:
            r11 = r28
        L45:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L4b
            r13 = 0
            goto L4d
        L4b:
            r13 = r30
        L4d:
            r14 = r0 & 512(0x200, float:7.17E-43)
            if (r14 == 0) goto L53
            r14 = 0
            goto L55
        L53:
            r14 = r31
        L55:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L5b
            r15 = 0
            goto L5d
        L5b:
            r15 = r32
        L5d:
            r6 = r0 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L64
            long r16 = p000.C0114ci.f2125
            goto L66
        L64:
            r16 = r33
        L66:
            r6 = r0 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L6c
            r6 = 0
            goto L6e
        L6c:
            r6 = r35
        L6e:
            r0 = r0 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L91
            r37 = 0
        L74:
            r19 = r18
            r20 = r1
            r22 = r3
            r24 = r5
            r36 = r6
            r25 = r7
            r26 = r8
            r27 = r9
            r28 = r10
            r29 = r11
            r31 = r13
            r32 = r14
            r33 = r15
            r34 = r16
            goto L94
        L91:
            r37 = r36
            goto L74
        L94:
            r19.<init>(r20, r22, r24, r25, r26, r27, r28, r29, r31, r32, r33, r34, r36, r37)
            return
    }

    public ux1(p000.f32 r1, long r2, p000.d60 r4, p000.b60 r5, p000.c60 r6, p000.C0087br r7, java.lang.String r8, long r9, p000.C0752r8 r11, p000.g32 r12, p000.av0 r13, long r14, p000.c32 r16, p000.fv1 r17, p000.kn0 r18) {
            r0 = this;
            r0.<init>()
            r0.f10996 = r1
            r0.f10997 = r2
            r0.f10998 = r4
            r0.f10999 = r5
            r0.f11000 = r6
            r0.f11001 = r7
            r0.f11002 = r8
            r0.f11003 = r9
            r0.f11004 = r11
            r0.f11005 = r12
            r0.f11006 = r13
            r0.f11007 = r14
            r1 = r16
            r0.f11008 = r1
            r1 = r17
            r0.f11009 = r1
            r1 = r18
            r0.f11010 = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p000.ux1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ux1 r4 = (p000.ux1) r4
            boolean r1 = r3.m6007(r4)
            if (r1 == 0) goto L19
            boolean r3 = r3.m6008(r4)
            if (r3 == 0) goto L19
            return r0
        L19:
            return r2
    }

    public final int hashCode() {
            r7 = this;
            f32 r0 = r7.f10996
            long r1 = r0.mo2033()
            int r3 = p000.C0114ci.f2126
            int r1 = java.lang.Long.hashCode(r1)
            r2 = 31
            int r1 = r1 * r2
            kn0 r3 = r0.mo2034()
            r4 = 0
            if (r3 == 0) goto L1b
            int r3 = r3.hashCode()
            goto L1c
        L1b:
            r3 = r4
        L1c:
            int r1 = r1 + r3
            int r1 = r1 * r2
            float r0 = r0.mo2035()
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 + r1
            int r0 = r0 * r2
            z32[] r1 = p000.y32.f12440
            long r5 = r7.f10997
            int r0 = p000.lz1.m3677(r0, r2, r5)
            d60 r1 = r7.f10998
            if (r1 == 0) goto L37
            int r1 = r1.f2924
            goto L38
        L37:
            r1 = r4
        L38:
            int r0 = r0 + r1
            int r0 = r0 * r2
            b60 r1 = r7.f10999
            if (r1 == 0) goto L45
            int r1 = r1.f1499
            int r1 = java.lang.Integer.hashCode(r1)
            goto L46
        L45:
            r1 = r4
        L46:
            int r0 = r0 + r1
            int r0 = r0 * r2
            c60 r1 = r7.f11000
            if (r1 == 0) goto L53
            int r1 = r1.f1968
            int r1 = java.lang.Integer.hashCode(r1)
            goto L54
        L53:
            r1 = r4
        L54:
            int r0 = r0 + r1
            int r0 = r0 * r2
            br r1 = r7.f11001
            if (r1 == 0) goto L5f
            int r1 = r1.hashCode()
            goto L60
        L5f:
            r1 = r4
        L60:
            int r0 = r0 + r1
            int r0 = r0 * r2
            java.lang.String r1 = r7.f11002
            if (r1 == 0) goto L6b
            int r1 = r1.hashCode()
            goto L6c
        L6b:
            r1 = r4
        L6c:
            int r0 = r0 + r1
            int r0 = r0 * r2
            long r5 = r7.f11003
            int r0 = p000.lz1.m3677(r0, r2, r5)
            r8 r1 = r7.f11004
            if (r1 == 0) goto L7f
            float r1 = r1.f9286
            int r1 = java.lang.Float.hashCode(r1)
            goto L80
        L7f:
            r1 = r4
        L80:
            int r0 = r0 + r1
            int r0 = r0 * r2
            g32 r1 = r7.f11005
            if (r1 == 0) goto L8b
            int r1 = r1.hashCode()
            goto L8c
        L8b:
            r1 = r4
        L8c:
            int r0 = r0 + r1
            int r0 = r0 * r2
            av0 r1 = r7.f11006
            if (r1 == 0) goto L99
            java.lang.Object r1 = r1.f1320
            int r1 = r1.hashCode()
            goto L9a
        L99:
            r1 = r4
        L9a:
            int r0 = r0 + r1
            int r0 = r0 * r2
            long r5 = r7.f11007
            int r0 = p000.lz1.m3677(r0, r2, r5)
            c32 r1 = r7.f11008
            if (r1 == 0) goto La9
            int r1 = r1.f1960
            goto Laa
        La9:
            r1 = r4
        Laa:
            int r0 = r0 + r1
            int r0 = r0 * r2
            fv1 r1 = r7.f11009
            if (r1 == 0) goto Lb5
            int r1 = r1.hashCode()
            goto Lb6
        Lb5:
            r1 = r4
        Lb6:
            int r0 = r0 + r1
            int r0 = r0 * 961
            kn0 r7 = r7.f11010
            if (r7 == 0) goto Lc1
            int r4 = r7.hashCode()
        Lc1:
            int r0 = r0 + r4
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SpanStyle(color="
            r0.<init>(r1)
            f32 r1 = r4.f10996
            long r2 = r1.mo2033()
            java.lang.String r2 = p000.C0114ci.m1198(r2)
            r0.append(r2)
            java.lang.String r2 = ", brush="
            r0.append(r2)
            kn0 r2 = r1.mo2034()
            r0.append(r2)
            java.lang.String r2 = ", alpha="
            r0.append(r2)
            float r1 = r1.mo2035()
            r0.append(r1)
            java.lang.String r1 = ", fontSize="
            r0.append(r1)
            long r1 = r4.f10997
            java.lang.String r1 = p000.y32.m6821(r1)
            r0.append(r1)
            java.lang.String r1 = ", fontWeight="
            r0.append(r1)
            d60 r1 = r4.f10998
            r0.append(r1)
            java.lang.String r1 = ", fontStyle="
            r0.append(r1)
            b60 r1 = r4.f10999
            r0.append(r1)
            java.lang.String r1 = ", fontSynthesis="
            r0.append(r1)
            c60 r1 = r4.f11000
            r0.append(r1)
            java.lang.String r1 = ", fontFamily="
            r0.append(r1)
            br r1 = r4.f11001
            r0.append(r1)
            java.lang.String r1 = ", fontFeatureSettings="
            r0.append(r1)
            java.lang.String r1 = r4.f11002
            r0.append(r1)
            java.lang.String r1 = ", letterSpacing="
            r0.append(r1)
            long r1 = r4.f11003
            java.lang.String r1 = p000.y32.m6821(r1)
            r0.append(r1)
            java.lang.String r1 = ", baselineShift="
            r0.append(r1)
            r8 r1 = r4.f11004
            r0.append(r1)
            java.lang.String r1 = ", textGeometricTransform="
            r0.append(r1)
            g32 r1 = r4.f11005
            r0.append(r1)
            java.lang.String r1 = ", localeList="
            r0.append(r1)
            av0 r1 = r4.f11006
            r0.append(r1)
            java.lang.String r1 = ", background="
            r0.append(r1)
            long r1 = r4.f11007
            java.lang.String r1 = p000.C0114ci.m1198(r1)
            r0.append(r1)
            java.lang.String r1 = ", textDecoration="
            r0.append(r1)
            c32 r1 = r4.f11008
            r0.append(r1)
            java.lang.String r1 = ", shadow="
            r0.append(r1)
            fv1 r1 = r4.f11009
            r0.append(r1)
            java.lang.String r1 = ", platformStyle=null, drawStyle="
            r0.append(r1)
            kn0 r4 = r4.f11010
            r0.append(r4)
            r4 = 41
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    /* JADX INFO: renamed from: α */
    public final boolean m6007(p000.ux1 r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            long r1 = r7.f10997
            long r3 = r8.f10997
            boolean r1 = p000.y32.m6818(r1, r3)
            r2 = 0
            if (r1 != 0) goto L10
            return r2
        L10:
            d60 r1 = r7.f10998
            d60 r3 = r8.f10998
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L1b
            return r2
        L1b:
            b60 r1 = r7.f10999
            b60 r3 = r8.f10999
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L26
            return r2
        L26:
            c60 r1 = r7.f11000
            c60 r3 = r8.f11000
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L31
            return r2
        L31:
            br r1 = r7.f11001
            br r3 = r8.f11001
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L3c
            return r2
        L3c:
            java.lang.String r1 = r7.f11002
            java.lang.String r3 = r8.f11002
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L47
            return r2
        L47:
            long r3 = r7.f11003
            long r5 = r8.f11003
            boolean r1 = p000.y32.m6818(r3, r5)
            if (r1 != 0) goto L52
            return r2
        L52:
            r8 r1 = r7.f11004
            r8 r3 = r8.f11004
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L5d
            return r2
        L5d:
            g32 r1 = r7.f11005
            g32 r3 = r8.f11005
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L68
            return r2
        L68:
            av0 r1 = r7.f11006
            av0 r3 = r8.f11006
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L73
            return r2
        L73:
            long r3 = r7.f11007
            long r7 = r8.f11007
            boolean r7 = p000.C0114ci.m1192(r3, r7)
            if (r7 != 0) goto L7e
            return r2
        L7e:
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final boolean m6008(p000.ux1 r4) {
            r3 = this;
            f32 r0 = r3.f10996
            f32 r1 = r4.f10996
            boolean r0 = p000.ln0.m3626(r0, r1)
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            c32 r0 = r3.f11008
            c32 r2 = r4.f11008
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 != 0) goto L17
            return r1
        L17:
            fv1 r0 = r3.f11009
            fv1 r2 = r4.f11009
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 != 0) goto L22
            return r1
        L22:
            kn0 r3 = r3.f11010
            kn0 r4 = r4.f11010
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 != 0) goto L2d
            return r1
        L2d:
            r3 = 1
            return r3
    }
}
