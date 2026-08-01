package p000;

/* JADX INFO: renamed from: dd */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class C0208dd implements java.io.Serializable, java.lang.Comparable {

    /* JADX INFO: renamed from: θ */
    public static final p000.C0208dd f3085 = null;

    /* JADX INFO: renamed from: ε */
    public final byte[] f3086;

    /* JADX INFO: renamed from: ζ */
    public transient int f3087;

    /* JADX INFO: renamed from: η */
    public transient java.lang.String f3088;

    static {
            dd r0 = new dd
            r1 = 0
            byte[] r1 = new byte[r1]
            r0.<init>(r1)
            p000.C0208dd.f3085 = r0
            return
    }

    public C0208dd(byte[] r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f3086 = r1
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r8) {
            r7 = this;
            dd r8 = (p000.C0208dd) r8
            r8.getClass()
            int r0 = r7.mo1701()
            int r1 = r8.mo1701()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            if (r4 >= r2) goto L29
            byte r5 = r7.mo1704(r4)
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r6 = r8.mo1704(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r5 != r6) goto L26
            int r4 = r4 + 1
            goto L13
        L26:
            if (r5 >= r6) goto L30
            goto L2e
        L29:
            if (r0 != r1) goto L2c
            return r3
        L2c:
            if (r0 >= r1) goto L30
        L2e:
            r7 = -1
            return r7
        L30:
            r7 = 1
            return r7
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r4 != r3) goto L3
            goto L1a
        L3:
            boolean r0 = r4 instanceof p000.C0208dd
            r1 = 0
            if (r0 == 0) goto L1c
            dd r4 = (p000.C0208dd) r4
            int r0 = r4.mo1701()
            byte[] r3 = r3.f3086
            int r2 = r3.length
            if (r0 != r2) goto L1c
            int r0 = r3.length
            boolean r3 = r4.mo1705(r1, r3, r1, r0)
            if (r3 == 0) goto L1c
        L1a:
            r3 = 1
            return r3
        L1c:
            return r1
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.f3087
            if (r0 == 0) goto L5
            return r0
        L5:
            byte[] r0 = r1.f3086
            int r0 = java.util.Arrays.hashCode(r0)
            r1.f3087 = r0
            return r0
    }

    public java.lang.String toString() {
            r19 = this;
            r0 = r19
            byte[] r1 = r0.f3086
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
            if (r4 >= r2) goto L1b7
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
            if (r9 < 0) goto L7a
            int r18 = r6 + 1
            if (r6 != r8) goto L2f
            goto L1b7
        L2f:
            if (r9 == r15) goto L3f
            if (r9 == r14) goto L3f
            if (r9 < 0) goto L39
            if (r9 >= r13) goto L39
            goto L1b6
        L39:
            if (r12 > r9) goto L3f
            if (r9 >= r11) goto L3f
            goto L1b6
        L3f:
            if (r9 != r10) goto L43
            goto L1b6
        L43:
            if (r9 >= r3) goto L48
            r6 = r17
            goto L4a
        L48:
            r6 = r16
        L4a:
            int r5 = r5 + r6
            int r4 = r4 + 1
        L4d:
            r6 = r18
            if (r4 >= r2) goto Le
            r9 = r1[r4]
            if (r9 < 0) goto Le
            int r4 = r4 + 1
            int r18 = r6 + 1
            if (r6 != r8) goto L5d
            goto L1b7
        L5d:
            if (r9 == r15) goto L6d
            if (r9 == r14) goto L6d
            if (r9 < 0) goto L67
            if (r9 >= r13) goto L67
            goto L1b6
        L67:
            if (r12 > r9) goto L6d
            if (r9 >= r11) goto L6d
            goto L1b6
        L6d:
            if (r9 != r10) goto L71
            goto L1b6
        L71:
            if (r9 >= r3) goto L76
            r6 = r17
            goto L78
        L76:
            r6 = r16
        L78:
            int r5 = r5 + r6
            goto L4d
        L7a:
            int r7 = r9 >> 5
            r3 = -2
            r10 = 128(0x80, float:1.8E-43)
            if (r7 != r3) goto Lc8
            int r3 = r4 + 1
            if (r2 > r3) goto L89
            if (r6 != r8) goto L1b6
            goto L1b7
        L89:
            r3 = r1[r3]
            r7 = r3 & 192(0xc0, float:2.69E-43)
            if (r7 != r10) goto Lc4
            r3 = r3 ^ 3968(0xf80, float:5.56E-42)
            int r7 = r9 << 6
            r3 = r3 ^ r7
            if (r3 >= r10) goto L9a
            if (r6 != r8) goto L1b6
            goto L1b7
        L9a:
            int r7 = r6 + 1
            if (r6 != r8) goto La0
            goto L1b7
        La0:
            if (r3 == r15) goto Lb0
            if (r3 == r14) goto Lb0
            if (r3 < 0) goto Laa
            if (r3 >= r13) goto Laa
            goto L1b6
        Laa:
            if (r12 > r3) goto Lb0
            if (r3 >= r11) goto Lb0
            goto L1b6
        Lb0:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto Lb7
            goto L1b6
        Lb7:
            r6 = 65536(0x10000, float:9.1835E-41)
            if (r3 >= r6) goto Lbd
            r16 = r17
        Lbd:
            int r5 = r5 + r16
            int r4 = r4 + 2
        Lc1:
            r6 = r7
            goto Le
        Lc4:
            if (r6 != r8) goto L1b6
            goto L1b7
        Lc8:
            int r7 = r9 >> 4
            r11 = 57344(0xe000, float:8.0356E-41)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r7 != r3) goto L138
            int r3 = r4 + 2
            if (r2 > r3) goto Lda
            if (r6 != r8) goto L1b6
            goto L1b7
        Lda:
            int r7 = r4 + 1
            r7 = r1[r7]
            r13 = r7 & 192(0xc0, float:2.69E-43)
            if (r13 != r10) goto L134
            r3 = r1[r3]
            r13 = r3 & 192(0xc0, float:2.69E-43)
            if (r13 != r10) goto L130
            r10 = -123008(0xfffffffffffe1f80, float:NaN)
            r3 = r3 ^ r10
            int r7 = r7 << 6
            r3 = r3 ^ r7
            int r7 = r9 << 12
            r3 = r3 ^ r7
            r7 = 2048(0x800, float:2.87E-42)
            if (r3 >= r7) goto Lfa
            if (r6 != r8) goto L1b6
            goto L1b7
        Lfa:
            if (r12 > r3) goto L102
            if (r3 >= r11) goto L102
            if (r6 != r8) goto L1b6
            goto L1b7
        L102:
            int r7 = r6 + 1
            if (r6 != r8) goto L108
            goto L1b7
        L108:
            if (r3 == r15) goto L11e
            if (r3 == r14) goto L11e
            if (r3 < 0) goto L114
            r6 = 32
            if (r3 >= r6) goto L114
            goto L1b6
        L114:
            r6 = 127(0x7f, float:1.78E-43)
            if (r6 > r3) goto L11e
            r6 = 160(0xa0, float:2.24E-43)
            if (r3 >= r6) goto L11e
            goto L1b6
        L11e:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L125
            goto L1b6
        L125:
            r6 = 65536(0x10000, float:9.1835E-41)
            if (r3 >= r6) goto L12b
            r16 = r17
        L12b:
            int r5 = r5 + r16
            int r4 = r4 + 3
            goto Lc1
        L130:
            if (r6 != r8) goto L1b6
            goto L1b7
        L134:
            if (r6 != r8) goto L1b6
            goto L1b7
        L138:
            int r7 = r9 >> 3
            if (r7 != r3) goto L1b3
            int r3 = r4 + 3
            if (r2 > r3) goto L144
            if (r6 != r8) goto L1b6
            goto L1b7
        L144:
            int r7 = r4 + 1
            r7 = r1[r7]
            r13 = r7 & 192(0xc0, float:2.69E-43)
            if (r13 != r10) goto L1b0
            int r13 = r4 + 2
            r13 = r1[r13]
            r14 = r13 & 192(0xc0, float:2.69E-43)
            if (r14 != r10) goto L1ad
            r3 = r1[r3]
            r14 = r3 & 192(0xc0, float:2.69E-43)
            if (r14 != r10) goto L1aa
            r10 = 3678080(0x381f80, float:5.154088E-39)
            r3 = r3 ^ r10
            int r10 = r13 << 6
            r3 = r3 ^ r10
            int r7 = r7 << 12
            r3 = r3 ^ r7
            int r7 = r9 << 18
            r3 = r3 ^ r7
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            if (r3 <= r7) goto L16f
            if (r6 != r8) goto L1b6
            goto L1b7
        L16f:
            if (r12 > r3) goto L176
            if (r3 >= r11) goto L176
            if (r6 != r8) goto L1b6
            goto L1b7
        L176:
            r7 = 65536(0x10000, float:9.1835E-41)
            if (r3 >= r7) goto L17d
            if (r6 != r8) goto L1b6
            goto L1b7
        L17d:
            int r7 = r6 + 1
            if (r6 != r8) goto L182
            goto L1b7
        L182:
            if (r3 == r15) goto L198
            r6 = 13
            if (r3 == r6) goto L198
            if (r3 < 0) goto L18f
            r6 = 32
            if (r3 >= r6) goto L18f
            goto L1b6
        L18f:
            r6 = 127(0x7f, float:1.78E-43)
            if (r6 > r3) goto L198
            r6 = 160(0xa0, float:2.24E-43)
            if (r3 >= r6) goto L198
            goto L1b6
        L198:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L19e
            goto L1b6
        L19e:
            r6 = 65536(0x10000, float:9.1835E-41)
            if (r3 >= r6) goto L1a4
            r16 = r17
        L1a4:
            int r5 = r5 + r16
            int r4 = r4 + 4
            goto Lc1
        L1aa:
            if (r6 != r8) goto L1b6
            goto L1b7
        L1ad:
            if (r6 != r8) goto L1b6
            goto L1b7
        L1b0:
            if (r6 != r8) goto L1b6
            goto L1b7
        L1b3:
            if (r6 != r8) goto L1b6
            goto L1b7
        L1b6:
            r5 = -1
        L1b7:
            java.lang.String r2 = "…]"
            java.lang.String r3 = "[size="
            r4 = 93
            r6 = -1
            if (r5 != r6) goto L211
            int r5 = r1.length
            if (r5 > r8) goto L1d9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[hex="
            r1.<init>(r2)
            java.lang.String r0 = r0.mo1702()
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            return r0
        L1d9:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            int r3 = r1.length
            r4.append(r3)
            java.lang.String r3 = " hex="
            r4.append(r3)
            int r3 = r1.length
            if (r8 > r3) goto L207
            int r3 = r1.length
            if (r8 != r3) goto L1ee
            goto L1f8
        L1ee:
            dd r0 = new dd
            r3 = 0
            byte[] r1 = p000.AbstractC0312g7.m2241(r1, r3, r8)
            r0.<init>(r1)
        L1f8:
            java.lang.String r0 = r0.mo1702()
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            return r0
        L207:
            int r0 = r1.length
            r1 = 41
            java.lang.String r2 = "endIndex > length("
            p000.C1080.m7265(r0, r1, r2)
            r0 = 0
            return r0
        L211:
            java.lang.String r0 = r0.m1710()
            r6 = 0
            java.lang.String r6 = r0.substring(r6, r5)
            java.lang.String r7 = "\\"
            java.lang.String r8 = "\\\\"
            java.lang.String r6 = p000.x02.m6483(r6, r7, r8)
            java.lang.String r7 = "\n"
            java.lang.String r8 = "\\n"
            java.lang.String r6 = p000.x02.m6483(r6, r7, r8)
            java.lang.String r7 = "\r"
            java.lang.String r8 = "\\r"
            java.lang.String r6 = p000.x02.m6483(r6, r7, r8)
            int r0 = r0.length()
            if (r5 >= r0) goto L251
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
        L251:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[text="
            r0.<init>(r1)
            r0.append(r6)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: α */
    public int mo1701() {
            r0 = this;
            byte[] r0 = r0.f3086
            int r0 = r0.length
            return r0
    }

    /* JADX INFO: renamed from: β */
    public java.lang.String mo1702() {
            r8 = this;
            byte[] r8 = r8.f3086
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
            char[] r6 = p000.AbstractC0782s1.f9641
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

    /* JADX INFO: renamed from: γ */
    public byte[] mo1703() {
            r0 = this;
            byte[] r0 = r0.f3086
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public byte mo1704(int r1) {
            r0 = this;
            byte[] r0 = r0.f3086
            r0 = r0[r1]
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public boolean mo1705(int r5, byte[] r6, int r7, int r8) {
            r4 = this;
            r6.getClass()
            r0 = 0
            if (r5 < 0) goto L25
            byte[] r4 = r4.f3086
            int r1 = r4.length
            int r1 = r1 - r8
            if (r5 > r1) goto L25
            if (r7 < 0) goto L25
            int r1 = r6.length
            int r1 = r1 - r8
            if (r7 > r1) goto L25
            r1 = r0
        L13:
            if (r1 >= r8) goto L23
            int r2 = r1 + r5
            r2 = r4[r2]
            int r3 = r1 + r7
            r3 = r6[r3]
            if (r2 == r3) goto L20
            goto L25
        L20:
            int r1 = r1 + 1
            goto L13
        L23:
            r4 = 1
            return r4
        L25:
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public boolean mo1706(p000.C0208dd r2, int r3) {
            r1 = this;
            r2.getClass()
            byte[] r1 = r1.f3086
            r0 = 0
            boolean r1 = r2.mo1705(r0, r1, r0, r3)
            return r1
    }

    /* JADX INFO: renamed from: η */
    public java.lang.String mo1707(java.nio.charset.Charset r2) {
            r1 = this;
            r2.getClass()
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r1.f3086
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public p000.C0208dd mo1708(int r3, int r4) {
            r2 = this;
            r0 = -1234567890(0xffffffffb669fd2e, float:-3.4867076E-6)
            if (r4 != r0) goto L9
            int r4 = r2.mo1701()
        L9:
            if (r3 < 0) goto L35
            byte[] r0 = r2.f3086
            int r1 = r0.length
            if (r4 > r1) goto L2b
            int r1 = r4 - r3
            if (r1 < 0) goto L24
            if (r3 != 0) goto L1a
            int r1 = r0.length
            if (r4 != r1) goto L1a
            return r2
        L1a:
            dd r2 = new dd
            byte[] r3 = p000.AbstractC0312g7.m2241(r0, r3, r4)
            r2.<init>(r3)
            return r2
        L24:
            java.lang.String r2 = "endIndex < beginIndex"
            p000.C1080.m7275(r2)
            r2 = 0
            return r2
        L2b:
            int r2 = r0.length
            r3 = 41
            java.lang.String r4 = "endIndex > length("
            p000.C1080.m7265(r2, r3, r4)
            r2 = 0
            return r2
        L35:
            java.lang.String r2 = "beginIndex < 0"
            p000.C1080.m7275(r2)
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ι */
    public p000.C0208dd mo1709() {
            r5 = this;
            r0 = 0
        L1:
            byte[] r1 = r5.f3086
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
            dd r0 = new dd
            r0.<init>(r5)
            return r0
        L35:
            int r0 = r0 + 1
            goto L1
        L38:
            return r5
    }

    /* JADX INFO: renamed from: κ */
    public final java.lang.String m1710() {
            r3 = this;
            java.lang.String r0 = r3.f3088
            if (r0 != 0) goto L15
            byte[] r0 = r3.mo1703()
            r0.getClass()
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = p000.AbstractC0547mf.f7105
            r1.<init>(r0, r2)
            r3.f3088 = r1
            return r1
        L15:
            return r0
    }

    /* JADX INFO: renamed from: λ */
    public void mo1711(p000.C0793sc r1, int r2) {
            r0 = this;
            byte[] r0 = r0.f3086
            r1.m5464(r0, r2)
            return
    }
}
