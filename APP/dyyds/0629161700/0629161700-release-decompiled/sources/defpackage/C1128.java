package defpackage;

/* JADX INFO: renamed from: ᛶᛸᛸᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C1128 implements java.io.Serializable, java.lang.Comparable {

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final defpackage.C1128 f5017 = null;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public transient java.lang.String f5018;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public transient int f5019;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final byte[] f5020;

    static {
            ᛶᛸᛸᛶ r0 = new ᛶᛸᛸᛶ
            r1 = 0
            byte[] r1 = new byte[r1]
            r0.<init>(r1)
            defpackage.C1128.f5017 = r0
            return
    }

    public C1128(byte[] r1) {
            r0 = this;
            r0.<init>()
            r0.f5020 = r1
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r8) {
            r7 = this;
            ᛶᛸᛸᛶ r8 = (defpackage.C1128) r8
            int r0 = r7.mo2165()
            int r1 = r8.mo2165()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L10:
            if (r4 >= r2) goto L26
            byte r5 = r7.mo2160(r4)
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r6 = r8.mo2160(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r5 != r6) goto L23
            int r4 = r4 + 1
            goto L10
        L23:
            if (r5 >= r6) goto L2d
            goto L2b
        L26:
            if (r0 != r1) goto L29
            return r3
        L29:
            if (r0 >= r1) goto L2d
        L2b:
            r7 = -1
            return r7
        L2d:
            r7 = 1
            return r7
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r4 != r3) goto L3
            goto L1a
        L3:
            boolean r0 = r4 instanceof defpackage.C1128
            r1 = 0
            if (r0 == 0) goto L1c
            ᛶᛸᛸᛶ r4 = (defpackage.C1128) r4
            int r0 = r4.mo2165()
            byte[] r3 = r3.f5020
            int r2 = r3.length
            if (r0 != r2) goto L1c
            int r0 = r3.length
            boolean r3 = r4.mo2166(r1, r1, r0, r3)
            if (r3 == 0) goto L1c
        L1a:
            r3 = 1
            return r3
        L1c:
            return r1
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.f5019
            if (r0 == 0) goto L5
            return r0
        L5:
            byte[] r0 = r1.f5020
            int r0 = java.util.Arrays.hashCode(r0)
            r1.f5019 = r0
            return r0
    }

    public java.lang.String toString() {
            r19 = this;
            r0 = r19
            byte[] r1 = r0.f5020
            int r2 = r1.length
            if (r2 != 0) goto La
            java.lang.String r0 = "[size=0]"
            return r0
        La:
            int r2 = r1.length
            r4 = 0
            r5 = 0
            r6 = 0
        Le:
            r8 = 64
            if (r4 >= r2) goto L1ad
            r9 = r1[r4]
            r10 = 65533(0xfffd, float:9.1831E-41)
            r11 = 160(0xa0, float:2.24E-43)
            r12 = 127(0x7f, float:1.78E-43)
            r13 = 32
            r14 = 13
            r15 = 10
            r3 = 65536(0x10000, float:9.1835E-41)
            r16 = 2
            r17 = 1
            if (r9 < 0) goto L76
            int r18 = r6 + 1
            if (r6 != r8) goto L2f
            goto L1ad
        L2f:
            if (r9 == r15) goto L3d
            if (r9 == r14) goto L3d
            if (r9 < 0) goto L38
            if (r9 >= r13) goto L38
            goto L3f
        L38:
            if (r12 > r9) goto L3d
            if (r9 >= r11) goto L3d
            goto L3f
        L3d:
            if (r9 != r10) goto L42
        L3f:
            r5 = -1
            goto L1ad
        L42:
            if (r9 >= r3) goto L47
            r6 = r17
            goto L49
        L47:
            r6 = r16
        L49:
            int r5 = r5 + r6
            int r4 = r4 + 1
        L4c:
            r6 = r18
            if (r4 >= r2) goto Le
            r9 = r1[r4]
            if (r9 < 0) goto Le
            int r4 = r4 + 1
            int r18 = r6 + 1
            if (r6 != r8) goto L5c
            goto L1ad
        L5c:
            if (r9 == r15) goto L6a
            if (r9 == r14) goto L6a
            if (r9 < 0) goto L65
            if (r9 >= r13) goto L65
            goto L6c
        L65:
            if (r12 > r9) goto L6a
            if (r9 >= r11) goto L6a
            goto L6c
        L6a:
            if (r9 != r10) goto L6d
        L6c:
            goto L3f
        L6d:
            if (r9 >= r3) goto L72
            r6 = r17
            goto L74
        L72:
            r6 = r16
        L74:
            int r5 = r5 + r6
            goto L4c
        L76:
            int r7 = r9 >> 5
            r3 = -2
            r10 = 128(0x80, float:1.8E-43)
            if (r7 != r3) goto Lc1
            int r3 = r4 + 1
            if (r2 > r3) goto L85
            if (r6 != r8) goto L3f
            goto L1ad
        L85:
            r3 = r1[r3]
            r7 = r3 & 192(0xc0, float:2.69E-43)
            if (r7 != r10) goto Lbd
            r3 = r3 ^ 3968(0xf80, float:5.56E-42)
            int r7 = r9 << 6
            r3 = r3 ^ r7
            if (r3 >= r10) goto L96
            if (r6 != r8) goto L3f
            goto L1ad
        L96:
            int r7 = r6 + 1
            if (r6 != r8) goto L9c
            goto L1ad
        L9c:
            if (r3 == r15) goto Laa
            if (r3 == r14) goto Laa
            if (r3 < 0) goto La5
            if (r3 >= r13) goto La5
            goto Laf
        La5:
            if (r12 > r3) goto Laa
            if (r3 >= r11) goto Laa
            goto Laf
        Laa:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto Lb0
        Laf:
            goto L3f
        Lb0:
            r6 = 65536(0x10000, float:9.1835E-41)
            if (r3 >= r6) goto Lb6
            r16 = r17
        Lb6:
            int r5 = r5 + r16
            int r4 = r4 + 2
        Lba:
            r6 = r7
            goto Le
        Lbd:
            if (r6 != r8) goto L3f
            goto L1ad
        Lc1:
            int r7 = r9 >> 4
            r11 = 57344(0xe000, float:8.0356E-41)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r7 != r3) goto L12f
            int r3 = r4 + 2
            if (r2 > r3) goto Ld3
            if (r6 != r8) goto L3f
            goto L1ad
        Ld3:
            int r7 = r4 + 1
            r7 = r1[r7]
            r13 = r7 & 192(0xc0, float:2.69E-43)
            if (r13 != r10) goto L12b
            r3 = r1[r3]
            r13 = r3 & 192(0xc0, float:2.69E-43)
            if (r13 != r10) goto L127
            r10 = -123008(0xfffffffffffe1f80, float:NaN)
            r3 = r3 ^ r10
            int r7 = r7 << 6
            r3 = r3 ^ r7
            int r7 = r9 << 12
            r3 = r3 ^ r7
            r7 = 2048(0x800, float:2.87E-42)
            if (r3 >= r7) goto Lf3
            if (r6 != r8) goto L3f
            goto L1ad
        Lf3:
            if (r12 > r3) goto Lfb
            if (r3 >= r11) goto Lfb
            if (r6 != r8) goto L3f
            goto L1ad
        Lfb:
            int r7 = r6 + 1
            if (r6 != r8) goto L101
            goto L1ad
        L101:
            if (r3 == r15) goto L115
            if (r3 == r14) goto L115
            if (r3 < 0) goto L10c
            r6 = 32
            if (r3 >= r6) goto L10c
            goto L11a
        L10c:
            r6 = 127(0x7f, float:1.78E-43)
            if (r6 > r3) goto L115
            r6 = 160(0xa0, float:2.24E-43)
            if (r3 >= r6) goto L115
            goto L11a
        L115:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L11c
        L11a:
            goto L3f
        L11c:
            r6 = 65536(0x10000, float:9.1835E-41)
            if (r3 >= r6) goto L122
            r16 = r17
        L122:
            int r5 = r5 + r16
            int r4 = r4 + 3
            goto Lba
        L127:
            if (r6 != r8) goto L3f
            goto L1ad
        L12b:
            if (r6 != r8) goto L3f
            goto L1ad
        L12f:
            int r7 = r9 >> 3
            if (r7 != r3) goto L1ab
            int r3 = r4 + 3
            if (r2 > r3) goto L13b
            if (r6 != r8) goto L3f
            goto L1ad
        L13b:
            int r7 = r4 + 1
            r7 = r1[r7]
            r13 = r7 & 192(0xc0, float:2.69E-43)
            if (r13 != r10) goto L1a8
            int r13 = r4 + 2
            r13 = r1[r13]
            r14 = r13 & 192(0xc0, float:2.69E-43)
            if (r14 != r10) goto L1a5
            r3 = r1[r3]
            r14 = r3 & 192(0xc0, float:2.69E-43)
            if (r14 != r10) goto L1a2
            r10 = 3678080(0x381f80, float:5.154088E-39)
            r3 = r3 ^ r10
            int r10 = r13 << 6
            r3 = r3 ^ r10
            int r7 = r7 << 12
            r3 = r3 ^ r7
            int r7 = r9 << 18
            r3 = r3 ^ r7
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            if (r3 <= r7) goto L166
            if (r6 != r8) goto L3f
            goto L1ad
        L166:
            if (r12 > r3) goto L16d
            if (r3 >= r11) goto L16d
            if (r6 != r8) goto L3f
            goto L1ad
        L16d:
            r7 = 65536(0x10000, float:9.1835E-41)
            if (r3 >= r7) goto L174
            if (r6 != r8) goto L3f
            goto L1ad
        L174:
            int r7 = r6 + 1
            if (r6 != r8) goto L179
            goto L1ad
        L179:
            if (r3 == r15) goto L18f
            r6 = 13
            if (r3 == r6) goto L18f
            if (r3 < 0) goto L186
            r6 = 32
            if (r3 >= r6) goto L186
            goto L194
        L186:
            r6 = 127(0x7f, float:1.78E-43)
            if (r6 > r3) goto L18f
            r6 = 160(0xa0, float:2.24E-43)
            if (r3 >= r6) goto L18f
            goto L194
        L18f:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L196
        L194:
            goto L3f
        L196:
            r6 = 65536(0x10000, float:9.1835E-41)
            if (r3 >= r6) goto L19c
            r16 = r17
        L19c:
            int r5 = r5 + r16
            int r4 = r4 + 4
            goto Lba
        L1a2:
            if (r6 != r8) goto L3f
            goto L1ad
        L1a5:
            if (r6 != r8) goto L3f
            goto L1ad
        L1a8:
            if (r6 != r8) goto L3f
            goto L1ad
        L1ab:
            if (r6 != r8) goto L3f
        L1ad:
            java.lang.String r2 = "…]"
            java.lang.String r3 = "[size="
            r4 = 93
            r6 = -1
            if (r5 != r6) goto L207
            int r5 = r1.length
            if (r5 > r8) goto L1cf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[hex="
            r1.<init>(r2)
            java.lang.String r0 = r0.mo2162()
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            return r0
        L1cf:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            int r3 = r1.length
            r4.append(r3)
            java.lang.String r3 = " hex="
            r4.append(r3)
            int r3 = r1.length
            if (r8 > r3) goto L1fd
            int r3 = r1.length
            if (r8 != r3) goto L1e4
            goto L1ee
        L1e4:
            ᛶᛸᛸᛶ r0 = new ᛶᛸᛸᛶ
            r3 = 0
            byte[] r1 = defpackage.AbstractC2315.m3773(r1, r3, r8)
            r0.<init>(r1)
        L1ee:
            java.lang.String r0 = r0.mo2162()
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            return r0
        L1fd:
            int r0 = r1.length
            r1 = 41
            java.lang.String r2 = "endIndex > length("
            defpackage.C2264.m3686(r2, r0, r1)
            r0 = 0
            return r0
        L207:
            java.lang.String r0 = r0.m2157()
            r6 = 0
            java.lang.String r6 = r0.substring(r6, r5)
            java.lang.String r7 = "\\"
            java.lang.String r8 = "\\\\"
            java.lang.String r6 = defpackage.AbstractC0651.m1485(r6, r7, r8)
            java.lang.String r7 = "\n"
            java.lang.String r8 = "\\n"
            java.lang.String r6 = defpackage.AbstractC0651.m1485(r6, r7, r8)
            java.lang.String r7 = "\r"
            java.lang.String r8 = "\\r"
            java.lang.String r6 = defpackage.AbstractC0651.m1485(r6, r7, r8)
            int r0 = r0.length()
            if (r5 >= r0) goto L247
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            int r1 = r1.length
            r0.append(r1)
            java.lang.String r1 = " text="
            r0.append(r1)
            r0.append(r6)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        L247:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[text="
            r0.<init>(r1)
            r0.append(r6)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public java.lang.String mo2156(java.nio.charset.Charset r2) {
            r1 = this;
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r1.f5020
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final java.lang.String m2157() {
            r3 = this;
            java.lang.String r0 = r3.f5018
            if (r0 != 0) goto L12
            byte[] r0 = r3.mo2161()
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = defpackage.AbstractC1422.f6221
            r1.<init>(r0, r2)
            r3.f5018 = r1
            return r1
        L12:
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public void mo2158(defpackage.C1569 r1, int r2) {
            r0 = this;
            byte[] r0 = r0.f5020
            r1.m2845(r2, r0)
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public defpackage.C1128 mo2159(int r4, int r5) {
            r3 = this;
            r0 = 0
            if (r4 < 0) goto L2b
            byte[] r1 = r3.f5020
            int r2 = r1.length
            if (r5 > r2) goto L22
            int r2 = r5 - r4
            if (r2 < 0) goto L1c
            if (r4 != 0) goto L12
            int r0 = r1.length
            if (r5 != r0) goto L12
            return r3
        L12:
            ᛶᛸᛸᛶ r3 = new ᛶᛸᛸᛶ
            byte[] r4 = defpackage.AbstractC2315.m3773(r1, r4, r5)
            r3.<init>(r4)
            return r3
        L1c:
            java.lang.String r3 = "endIndex < beginIndex"
            defpackage.C2264.m3684(r3)
            return r0
        L22:
            int r3 = r1.length
            r4 = 41
            java.lang.String r5 = "endIndex > length("
            defpackage.C2264.m3686(r5, r3, r4)
            return r0
        L2b:
            java.lang.String r3 = "beginIndex < 0"
            defpackage.C2264.m3684(r3)
            return r0
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public byte mo2160(int r1) {
            r0 = this;
            byte[] r0 = r0.f5020
            r0 = r0[r1]
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public byte[] mo2161() {
            r0 = this;
            byte[] r0 = r0.f5020
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public java.lang.String mo2162() {
            r8 = this;
            byte[] r8 = r8.f5020
            int r0 = r8.length
            int r0 = r0 * 2
            char[] r0 = new char[r0]
            int r1 = r8.length
            r2 = 0
            r3 = r2
        La:
            if (r2 >= r1) goto L25
            r4 = r8[r2]
            int r5 = r3 + 1
            char[] r6 = defpackage.AbstractC1754.f7742
            int r7 = r4 >> 4
            r7 = r7 & 15
            char r7 = r6[r7]
            r0[r3] = r7
            int r3 = r3 + 2
            r4 = r4 & 15
            char r4 = r6[r4]
            r0[r5] = r4
            int r2 = r2 + 1
            goto La
        L25:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r0)
            return r8
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public java.lang.String mo2163() {
            r12 = this;
            byte[] r0 = defpackage.AbstractC1364.f5963
            byte[] r12 = r12.f5020
            int r1 = r12.length
            r2 = 2
            int r1 = r1 + r2
            int r1 = r1 / 3
            int r1 = r1 * 4
            byte[] r1 = new byte[r1]
            int r3 = r12.length
            int r4 = r12.length
            int r4 = r4 % 3
            int r3 = r3 - r4
            r4 = 0
            r5 = r4
        L14:
            if (r4 >= r3) goto L51
            int r6 = r4 + 1
            r7 = r12[r4]
            int r8 = r4 + 2
            r6 = r12[r6]
            int r4 = r4 + 3
            r8 = r12[r8]
            int r9 = r5 + 1
            r10 = r7 & 255(0xff, float:3.57E-43)
            int r10 = r10 >> r2
            r10 = r0[r10]
            r1[r5] = r10
            int r10 = r5 + 2
            r7 = r7 & 3
            int r7 = r7 << 4
            r11 = r6 & 255(0xff, float:3.57E-43)
            int r11 = r11 >> 4
            r7 = r7 | r11
            r7 = r0[r7]
            r1[r9] = r7
            int r7 = r5 + 3
            r6 = r6 & 15
            int r6 = r6 << r2
            r9 = r8 & 255(0xff, float:3.57E-43)
            int r9 = r9 >> 6
            r6 = r6 | r9
            r6 = r0[r6]
            r1[r10] = r6
            int r5 = r5 + 4
            r6 = r8 & 63
            r6 = r0[r6]
            r1[r7] = r6
            goto L14
        L51:
            int r6 = r12.length
            int r6 = r6 - r3
            r3 = 1
            r7 = 61
            if (r6 == r3) goto L85
            if (r6 == r2) goto L5b
            goto La1
        L5b:
            int r3 = r4 + 1
            r4 = r12[r4]
            r12 = r12[r3]
            int r3 = r5 + 1
            r6 = r4 & 255(0xff, float:3.57E-43)
            int r6 = r6 >> r2
            r6 = r0[r6]
            r1[r5] = r6
            int r6 = r5 + 2
            r4 = r4 & 3
            int r4 = r4 << 4
            r8 = r12 & 255(0xff, float:3.57E-43)
            int r8 = r8 >> 4
            r4 = r4 | r8
            r4 = r0[r4]
            r1[r3] = r4
            int r5 = r5 + 3
            r12 = r12 & 15
            int r12 = r12 << r2
            r12 = r0[r12]
            r1[r6] = r12
            r1[r5] = r7
            goto La1
        L85:
            r12 = r12[r4]
            int r3 = r5 + 1
            r4 = r12 & 255(0xff, float:3.57E-43)
            int r2 = r4 >> 2
            r2 = r0[r2]
            r1[r5] = r2
            int r2 = r5 + 2
            r12 = r12 & 3
            int r12 = r12 << 4
            r12 = r0[r12]
            r1[r3] = r12
            int r5 = r5 + 3
            r1[r2] = r7
            r1[r5] = r7
        La1:
            java.lang.String r12 = new java.lang.String
            java.nio.charset.Charset r0 = defpackage.AbstractC1422.f6221
            r12.<init>(r1, r0)
            return r12
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public defpackage.C1128 mo2164() {
            r5 = this;
            r0 = 0
        L1:
            byte[] r1 = r5.f5020
            int r2 = r1.length
            if (r0 >= r2) goto L38
            r2 = r1[r0]
            r3 = 65
            if (r2 < r3) goto L35
            r4 = 90
            if (r2 <= r4) goto L11
            goto L35
        L11:
            int r5 = r1.length
            byte[] r5 = java.util.Arrays.copyOf(r1, r5)
            int r1 = r0 + 1
            int r2 = r2 + 32
            byte r2 = (byte) r2
            r5[r0] = r2
        L1d:
            int r0 = r5.length
            if (r1 >= r0) goto L2f
            r0 = r5[r1]
            if (r0 < r3) goto L2c
            if (r0 <= r4) goto L27
            goto L2c
        L27:
            int r0 = r0 + 32
            byte r0 = (byte) r0
            r5[r1] = r0
        L2c:
            int r1 = r1 + 1
            goto L1d
        L2f:
            ᛶᛸᛸᛶ r0 = new ᛶᛸᛸᛶ
            r0.<init>(r5)
            return r0
        L35:
            int r0 = r0 + 1
            goto L1
        L38:
            return r5
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public int mo2165() {
            r0 = this;
            byte[] r0 = r0.f5020
            int r0 = r0.length
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public boolean mo2166(int r5, int r6, int r7, byte[] r8) {
            r4 = this;
            r0 = 0
            if (r5 < 0) goto L22
            byte[] r4 = r4.f5020
            int r1 = r4.length
            int r1 = r1 - r7
            if (r5 > r1) goto L22
            if (r6 < 0) goto L22
            int r1 = r8.length
            int r1 = r1 - r7
            if (r6 > r1) goto L22
            r1 = r0
        L10:
            if (r1 >= r7) goto L20
            int r2 = r1 + r5
            r2 = r4[r2]
            int r3 = r1 + r6
            r3 = r8[r3]
            if (r2 == r3) goto L1d
            goto L22
        L1d:
            int r1 = r1 + 1
            goto L10
        L20:
            r4 = 1
            return r4
        L22:
            return r0
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public boolean mo2167(defpackage.C1128 r2, int r3) {
            r1 = this;
            r0 = 0
            byte[] r1 = r1.f5020
            boolean r1 = r2.mo2166(r0, r0, r3, r1)
            return r1
    }
}
