package p000;

/* JADX INFO: renamed from: ci */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0114ci {

    /* JADX INFO: renamed from: β */
    public static final long f2120 = 0;

    /* JADX INFO: renamed from: γ */
    public static final long f2121 = 0;

    /* JADX INFO: renamed from: δ */
    public static final long f2122 = 0;

    /* JADX INFO: renamed from: ε */
    public static final long f2123 = 0;

    /* JADX INFO: renamed from: ζ */
    public static final long f2124 = 0;

    /* JADX INFO: renamed from: η */
    public static final long f2125 = 0;

    /* JADX INFO: renamed from: θ */
    public static final /* synthetic */ int f2126 = 0;

    /* JADX INFO: renamed from: α */
    public final long f2127;

    static {
            r0 = 4278190080(0xff000000, double:2.113706745E-314)
            long r0 = p000.kn0.m3359(r0)
            p000.C0114ci.f2120 = r0
            r0 = 4282664004(0xff444444, double:2.115917157E-314)
            p000.kn0.m3359(r0)
            r0 = 4287137928(0xff888888, double:2.118127569E-314)
            p000.kn0.m3359(r0)
            r0 = 4291611852(0xffcccccc, double:2.1203379814E-314)
            p000.kn0.m3359(r0)
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = p000.kn0.m3359(r0)
            p000.C0114ci.f2121 = r0
            r0 = 4294901760(0xffff0000, double:2.121963412E-314)
            long r0 = p000.kn0.m3359(r0)
            p000.C0114ci.f2122 = r0
            r0 = 4278255360(0xff00ff00, double:2.1137389975E-314)
            p000.kn0.m3359(r0)
            r0 = 4278190335(0xff0000ff, double:2.113706871E-314)
            long r0 = p000.kn0.m3359(r0)
            p000.C0114ci.f2123 = r0
            r0 = 4294967040(0xffffff00, double:2.1219956645E-314)
            p000.kn0.m3359(r0)
            r0 = 4278255615(0xff00ffff, double:2.1137391235E-314)
            p000.kn0.m3359(r0)
            r0 = 4294902015(0xffff00ff, double:2.121963538E-314)
            p000.kn0.m3359(r0)
            r0 = 0
            long r0 = (long) r0
            r2 = 32
            long r0 = r0 << r2
            p000.C0114ci.f2124 = r0
            r0 = 0
            po1 r1 = p000.C0550mi.f7156
            long r0 = p000.kn0.m3358(r0, r0, r0, r0, r1)
            p000.C0114ci.f2125 = r0
            return
    }

    public /* synthetic */ C0114ci(long r1) {
            r0 = this;
            r0.<init>()
            r0.f2127 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public static final long m1190(long r4, p000.AbstractC0432ji r6) {
            ji r0 = m1195(r4)
            int r1 = r0.f5476
            int r2 = r6.f5476
            r3 = r1 | r2
            if (r3 >= 0) goto L11
            so r6 = p000.ln0.m3636(r0, r6)
            goto L26
        L11:
            n11 r3 = p000.AbstractC0842to.f10428
            int r2 = r2 << 6
            r1 = r1 | r2
            java.lang.Object r2 = r3.m5525(r1)
            if (r2 != 0) goto L23
            so r2 = p000.ln0.m3636(r0, r6)
            r3.m3942(r1, r2)
        L23:
            r6 = r2
            so r6 = (p000.C0805so) r6
        L26:
            long r4 = r6.mo4939(r4)
            return r4
    }

    /* JADX INFO: renamed from: β */
    public static long m1191(long r3, float r5) {
            float r0 = m1197(r3)
            float r1 = m1196(r3)
            float r2 = m1194(r3)
            ji r3 = m1195(r3)
            long r3 = p000.kn0.m3358(r0, r1, r2, r5, r3)
            return r3
    }

    /* JADX INFO: renamed from: γ */
    public static final boolean m1192(long r0, long r2) {
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static final float m1193(long r4) {
            r0 = 63
            long r0 = r0 & r4
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L18
            r0 = 56
            long r4 = r4 >>> r0
            r0 = 255(0xff, double:1.26E-321)
            long r4 = r4 & r0
            double r4 = p000.v71.m6048(r4)
            float r4 = (float) r4
            r5 = 1132396544(0x437f0000, float:255.0)
        L16:
            float r4 = r4 / r5
            return r4
        L18:
            r0 = 6
            long r4 = r4 >>> r0
            r0 = 1023(0x3ff, double:5.054E-321)
            long r4 = r4 & r0
            double r4 = p000.v71.m6048(r4)
            float r4 = (float) r4
            r5 = 1149222912(0x447fc000, float:1023.0)
            goto L16
    }

    /* JADX INFO: renamed from: ε */
    public static final float m1194(long r5) {
            r0 = 63
            long r0 = r0 & r5
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L18
            r0 = 32
            long r5 = r5 >>> r0
            r0 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r0
            double r5 = p000.v71.m6048(r5)
            float r5 = (float) r5
            r6 = 1132396544(0x437f0000, float:255.0)
            float r5 = r5 / r6
            return r5
        L18:
            r0 = 16
            long r5 = r5 >>> r0
            r1 = 65535(0xffff, double:3.23786E-319)
            long r5 = r5 & r1
            int r5 = (int) r5
            short r5 = (short) r5
            r6 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r5
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r5
            int r6 = r6 >>> 10
            r2 = 31
            r6 = r6 & r2
            r5 = r5 & 1023(0x3ff, float:1.434E-42)
            if (r6 != 0) goto L46
            if (r5 == 0) goto L43
            r6 = 1056964608(0x3f000000, float:0.5)
            int r5 = r5 + r6
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r6 = p000.d40.f2879
            float r5 = r5 - r6
            if (r1 != 0) goto L41
            return r5
        L41:
            float r5 = -r5
            return r5
        L43:
            r5 = 0
            r6 = r5
            goto L58
        L46:
            int r5 = r5 << 13
            if (r6 != r2) goto L55
            r6 = 255(0xff, float:3.57E-43)
            if (r5 == 0) goto L51
            r2 = 4194304(0x400000, float:5.877472E-39)
            r5 = r5 | r2
        L51:
            r4 = r6
            r6 = r5
            r5 = r4
            goto L58
        L55:
            int r6 = r6 + 112
            goto L51
        L58:
            int r0 = r1 << 16
            int r5 = r5 << 23
            r5 = r5 | r0
            r5 = r5 | r6
            float r5 = java.lang.Float.intBitsToFloat(r5)
            return r5
    }

    /* JADX INFO: renamed from: ζ */
    public static final p000.AbstractC0432ji m1195(long r2) {
            float[] r0 = p000.C0550mi.f7136
            r0 = 63
            long r2 = r2 & r0
            int r2 = (int) r2
            ji[] r3 = p000.C0550mi.f7135
            r2 = r3[r2]
            return r2
    }

    /* JADX INFO: renamed from: η */
    public static final float m1196(long r5) {
            r0 = 63
            long r0 = r0 & r5
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L18
            r0 = 40
            long r5 = r5 >>> r0
            r0 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r0
            double r5 = p000.v71.m6048(r5)
            float r5 = (float) r5
            r6 = 1132396544(0x437f0000, float:255.0)
            float r5 = r5 / r6
            return r5
        L18:
            r0 = 32
            long r5 = r5 >>> r0
            r0 = 65535(0xffff, double:3.23786E-319)
            long r5 = r5 & r0
            int r5 = (int) r5
            short r5 = (short) r5
            r6 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r5
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r5
            int r6 = r6 >>> 10
            r1 = 31
            r6 = r6 & r1
            r5 = r5 & 1023(0x3ff, float:1.434E-42)
            if (r6 != 0) goto L46
            if (r5 == 0) goto L43
            r6 = 1056964608(0x3f000000, float:0.5)
            int r5 = r5 + r6
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r6 = p000.d40.f2879
            float r5 = r5 - r6
            if (r0 != 0) goto L41
            return r5
        L41:
            float r5 = -r5
            return r5
        L43:
            r5 = 0
            r6 = r5
            goto L58
        L46:
            int r5 = r5 << 13
            if (r6 != r1) goto L55
            r6 = 255(0xff, float:3.57E-43)
            if (r5 == 0) goto L51
            r1 = 4194304(0x400000, float:5.877472E-39)
            r5 = r5 | r1
        L51:
            r4 = r6
            r6 = r5
            r5 = r4
            goto L58
        L55:
            int r6 = r6 + 112
            goto L51
        L58:
            int r0 = r0 << 16
            int r5 = r5 << 23
            r5 = r5 | r0
            r5 = r5 | r6
            float r5 = java.lang.Float.intBitsToFloat(r5)
            return r5
    }

    /* JADX INFO: renamed from: θ */
    public static final float m1197(long r5) {
            r0 = 63
            long r0 = r0 & r5
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 48
            if (r0 != 0) goto L18
            long r5 = r5 >>> r1
            r0 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r0
            double r5 = p000.v71.m6048(r5)
            float r5 = (float) r5
            r6 = 1132396544(0x437f0000, float:255.0)
            float r5 = r5 / r6
            return r5
        L18:
            long r5 = r5 >>> r1
            r0 = 65535(0xffff, double:3.23786E-319)
            long r5 = r5 & r0
            int r5 = (int) r5
            short r5 = (short) r5
            r6 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r5
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r5
            int r6 = r6 >>> 10
            r1 = 31
            r6 = r6 & r1
            r5 = r5 & 1023(0x3ff, float:1.434E-42)
            if (r6 != 0) goto L44
            if (r5 == 0) goto L41
            r6 = 1056964608(0x3f000000, float:0.5)
            int r5 = r5 + r6
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r6 = p000.d40.f2879
            float r5 = r5 - r6
            if (r0 != 0) goto L3f
            return r5
        L3f:
            float r5 = -r5
            return r5
        L41:
            r5 = 0
            r6 = r5
            goto L56
        L44:
            int r5 = r5 << 13
            if (r6 != r1) goto L53
            r6 = 255(0xff, float:3.57E-43)
            if (r5 == 0) goto L4f
            r1 = 4194304(0x400000, float:5.877472E-39)
            r5 = r5 | r1
        L4f:
            r4 = r6
            r6 = r5
            r5 = r4
            goto L56
        L53:
            int r6 = r6 + 112
            goto L4f
        L56:
            int r0 = r0 << 16
            int r5 = r5 << 23
            r5 = r5 | r0
            r5 = r5 | r6
            float r5 = java.lang.Float.intBitsToFloat(r5)
            return r5
    }

    /* JADX INFO: renamed from: ι */
    public static java.lang.String m1198(long r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Color("
            r0.<init>(r1)
            float r1 = m1197(r3)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            float r2 = m1196(r3)
            r0.append(r2)
            r0.append(r1)
            float r2 = m1194(r3)
            r0.append(r2)
            r0.append(r1)
            float r2 = m1193(r3)
            r0.append(r2)
            r0.append(r1)
            ji r3 = m1195(r3)
            java.lang.String r3 = r3.f5474
            r4 = 41
            java.lang.String r3 = p000.AbstractC0602nx.m4132(r0, r3, r4)
            return r3
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000.C0114ci
            if (r0 != 0) goto L5
            goto Lf
        L5:
            ci r3 = (p000.C0114ci) r3
            long r0 = r3.f2127
            long r2 = r2.f2127
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L11
        Lf:
            r2 = 0
            return r2
        L11:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.f2127
            int r2 = java.lang.Long.hashCode(r0)
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            long r0 = r2.f2127
            java.lang.String r2 = m1198(r0)
            return r2
    }
}
