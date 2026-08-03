package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۦۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\n-Utf8.kt\nKotlin\n*S Kotlin\n*F\n+ 1 -Utf8.kt\nokio/internal/_Utf8Kt\n+ 2 Utf8.kt\nokio/Utf8\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,60:1\n260#2,16:61\n277#2:78\n397#2,9:79\n127#2:88\n406#2,20:90\n279#2,3:110\n440#2,4:113\n127#2:117\n446#2,10:118\n127#2:128\n456#2,5:129\n127#2:134\n461#2,24:135\n283#2,3:159\n500#2,3:162\n286#2,12:165\n503#2:177\n127#2:178\n506#2,2:179\n127#2:181\n510#2,10:182\n127#2:192\n520#2,5:193\n127#2:198\n525#2,5:199\n127#2:204\n530#2,28:205\n302#2,6:233\n138#2,67:239\n68#3:77\n74#3:89\n*S KotlinDebug\n*F\n+ 1 -Utf8.kt\nokio/internal/_Utf8Kt\n*L\n34#1:61,16\n34#1:78\n34#1:79,9\n34#1:88\n34#1:90,20\n34#1:110,3\n34#1:113,4\n34#1:117\n34#1:118,10\n34#1:128\n34#1:129,5\n34#1:134\n34#1:135,24\n34#1:159,3\n34#1:162,3\n34#1:165,12\n34#1:177\n34#1:178\n34#1:179,2\n34#1:181\n34#1:182,10\n34#1:192\n34#1:193,5\n34#1:198\n34#1:199,5\n34#1:204\n34#1:205,28\n34#1:233,6\n50#1:239,67\n34#1:77\n34#1:89\n*E\n"})
public final class C7191 {
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final byte[] m27679(@Yue.InterfaceC4418 java.lang.String r12) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r12, r0)
            int r0 = r12.length()
            int r0 = r0 * 4
            byte[] r0 = new byte[r0]
            int r1 = r12.length()
            r2 = 0
        L12:
            java.lang.String r3 = "copyOf(this, newSize)"
            if (r2 >= r1) goto Lf8
            char r4 = r12.charAt(r2)
            r5 = 128(0x80, float:1.8E-43)
            int r6 = Yue.C3329.m13910(r4, r5)
            if (r6 < 0) goto Lf1
            int r1 = r12.length()
            r4 = r2
        L27:
            if (r2 >= r1) goto Le9
            char r6 = r12.charAt(r2)
            int r7 = Yue.C3329.m13910(r6, r5)
            if (r7 >= 0) goto L54
            byte r6 = (byte) r6
            int r7 = r4 + 1
            r0[r4] = r6
            int r2 = r2 + 1
        L3a:
            r4 = r7
            if (r2 >= r1) goto L27
            char r6 = r12.charAt(r2)
            int r6 = Yue.C3329.m13910(r6, r5)
            if (r6 >= 0) goto L27
            int r6 = r2 + 1
            char r2 = r12.charAt(r2)
            byte r2 = (byte) r2
            int r7 = r4 + 1
            r0[r4] = r2
            r2 = r6
            goto L3a
        L54:
            r7 = 2048(0x800, float:2.87E-42)
            int r7 = Yue.C3329.m13910(r6, r7)
            if (r7 >= 0) goto L70
            int r7 = r6 >> 6
            r7 = r7 | 192(0xc0, float:2.69E-43)
            byte r7 = (byte) r7
            int r8 = r4 + 1
            r0[r4] = r7
            r6 = r6 & 63
            r6 = r6 | r5
            byte r6 = (byte) r6
            int r4 = r4 + 2
            r0[r8] = r6
        L6d:
            int r2 = r2 + 1
            goto L27
        L70:
            r7 = 55296(0xd800, float:7.7486E-41)
            r8 = 63
            if (r7 > r6) goto Lce
            r7 = 57344(0xe000, float:8.0356E-41)
            if (r6 >= r7) goto Lce
            r9 = 56319(0xdbff, float:7.892E-41)
            int r9 = Yue.C3329.m13910(r6, r9)
            if (r9 > 0) goto Lc5
            int r9 = r2 + 1
            if (r1 <= r9) goto Lc5
            char r10 = r12.charAt(r9)
            r11 = 56320(0xdc00, float:7.8921E-41)
            if (r11 > r10) goto Lc5
            if (r10 >= r7) goto Lc5
            int r6 = r6 << 10
            char r7 = r12.charAt(r9)
            int r6 = r6 + r7
            r7 = -56613888(0xfffffffffca02400, float:-6.651981E36)
            int r6 = r6 + r7
            int r7 = r6 >> 18
            r7 = r7 | 240(0xf0, float:3.36E-43)
            byte r7 = (byte) r7
            int r9 = r4 + 1
            r0[r4] = r7
            int r7 = r6 >> 12
            r7 = r7 & r8
            r7 = r7 | r5
            byte r7 = (byte) r7
            int r10 = r4 + 2
            r0[r9] = r7
            int r7 = r6 >> 6
            r7 = r7 & r8
            r7 = r7 | r5
            byte r7 = (byte) r7
            int r9 = r4 + 3
            r0[r10] = r7
            r6 = r6 & r8
            r6 = r6 | r5
            byte r6 = (byte) r6
            int r4 = r4 + 4
            r0[r9] = r6
            int r2 = r2 + 2
            goto L27
        Lc5:
            int r6 = r4 + 1
            r0[r4] = r8
            int r2 = r2 + 1
            r4 = r6
            goto L27
        Lce:
            int r7 = r6 >> 12
            r7 = r7 | 224(0xe0, float:3.14E-43)
            byte r7 = (byte) r7
            int r9 = r4 + 1
            r0[r4] = r7
            int r7 = r6 >> 6
            r7 = r7 & r8
            r7 = r7 | r5
            byte r7 = (byte) r7
            int r8 = r4 + 2
            r0[r9] = r7
            r6 = r6 & 63
            r6 = r6 | r5
            byte r6 = (byte) r6
            int r4 = r4 + 3
            r0[r8] = r6
            goto L6d
        Le9:
            byte[] r12 = java.util.Arrays.copyOf(r0, r4)
            Yue.C3329.m13905(r12, r3)
            return r12
        Lf1:
            byte r3 = (byte) r4
            r0[r2] = r3
            int r2 = r2 + 1
            goto L12
        Lf8:
            int r12 = r12.length()
            byte[] r12 = java.util.Arrays.copyOf(r0, r12)
            Yue.C3329.m13905(r12, r3)
            return r12
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String m27680(@Yue.InterfaceC4418 byte[] r16, int r17, int r18) {
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.String r3 = "<this>"
            Yue.C3329.m13906(r0, r3)
            if (r1 < 0) goto L18d
            int r3 = r0.length
            if (r2 > r3) goto L18d
            if (r1 > r2) goto L18d
            int r3 = r2 - r1
            char[] r3 = new char[r3]
            r4 = 0
            r5 = r4
        L18:
            if (r1 >= r2) goto L188
            r6 = r0[r1]
            if (r6 < 0) goto L34
            char r6 = (char) r6
            int r7 = r5 + 1
            r3[r5] = r6
            int r1 = r1 + 1
        L25:
            r5 = r7
            if (r1 >= r2) goto L18
            r6 = r0[r1]
            if (r6 < 0) goto L18
            int r1 = r1 + 1
            char r6 = (char) r6
            int r7 = r5 + 1
            r3[r5] = r6
            goto L25
        L34:
            int r7 = r6 >> 5
            r8 = -2
            r10 = 128(0x80, float:1.8E-43)
            r11 = 65533(0xfffd, float:9.1831E-41)
            r12 = 1
            if (r7 != r8) goto L73
            int r7 = r1 + 1
            if (r2 > r7) goto L4d
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
        L48:
            Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
        L4a:
            r5 = r7
        L4b:
            r9 = r12
            goto L71
        L4d:
            r7 = r0[r7]
            r8 = r7 & 192(0xc0, float:2.69E-43)
            if (r8 != r10) goto L6b
            r7 = r7 ^ 3968(0xf80, float:5.56E-42)
            int r6 = r6 << 6
            r6 = r6 ^ r7
            if (r6 >= r10) goto L62
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
        L5f:
            Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
            goto L68
        L62:
            char r6 = (char) r6
            int r7 = r5 + 1
            r3[r5] = r6
            goto L5f
        L68:
            r5 = r7
        L69:
            r9 = 2
            goto L71
        L6b:
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
            goto L48
        L71:
            int r1 = r1 + r9
            goto L18
        L73:
            int r7 = r6 >> 4
            r13 = 57344(0xe000, float:8.0356E-41)
            r14 = 55296(0xd800, float:7.7486E-41)
            r15 = 3
            if (r7 != r8) goto Ldc
            int r7 = r1 + 2
            if (r2 > r7) goto L94
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
            Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
            int r5 = r1 + 1
            if (r2 <= r5) goto L4a
            r5 = r0[r5]
            r5 = r5 & 192(0xc0, float:2.69E-43)
            if (r5 != r10) goto L4a
        L93:
            goto L68
        L94:
            int r8 = r1 + 1
            r8 = r0[r8]
            r9 = r8 & 192(0xc0, float:2.69E-43)
            if (r9 != r10) goto Ld3
            r7 = r0[r7]
            r9 = r7 & 192(0xc0, float:2.69E-43)
            if (r9 != r10) goto Lcb
            r9 = -123008(0xfffffffffffe1f80, float:NaN)
            r7 = r7 ^ r9
            int r8 = r8 << 6
            r7 = r7 ^ r8
            int r6 = r6 << 12
            r6 = r6 ^ r7
            r7 = 2048(0x800, float:2.87E-42)
            if (r6 >= r7) goto Lb8
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
        Lb5:
            Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
            goto Lc8
        Lb8:
            if (r14 > r6) goto Lc2
            if (r6 >= r13) goto Lc2
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
            goto Lb5
        Lc2:
            char r6 = (char) r6
            int r7 = r5 + 1
            r3[r5] = r6
            goto Lb5
        Lc8:
            r5 = r7
        Lc9:
            r9 = r15
            goto L71
        Lcb:
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
            Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
            goto L93
        Ld3:
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
            Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
            goto L4a
        Ldc:
            int r7 = r6 >> 3
            if (r7 != r8) goto L17f
            int r7 = r1 + 3
            if (r2 > r7) goto L106
            int r6 = r5 + 1
            r3[r5] = r11
            Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
            int r5 = r1 + 1
            if (r2 <= r5) goto L103
            r5 = r0[r5]
            r5 = r5 & 192(0xc0, float:2.69E-43)
            if (r5 != r10) goto L103
            int r5 = r1 + 2
            if (r2 <= r5) goto L100
            r5 = r0[r5]
            r5 = r5 & 192(0xc0, float:2.69E-43)
            if (r5 != r10) goto L100
        Lfe:
            r5 = r6
            goto Lc9
        L100:
            r5 = r6
            goto L69
        L103:
            r5 = r6
            goto L4b
        L106:
            int r8 = r1 + 1
            r8 = r0[r8]
            r9 = r8 & 192(0xc0, float:2.69E-43)
            if (r9 != r10) goto L178
            int r9 = r1 + 2
            r9 = r0[r9]
            r12 = r9 & 192(0xc0, float:2.69E-43)
            if (r12 != r10) goto L171
            r7 = r0[r7]
            r12 = r7 & 192(0xc0, float:2.69E-43)
            if (r12 != r10) goto L16a
            r10 = 3678080(0x381f80, float:5.154088E-39)
            r7 = r7 ^ r10
            int r9 = r9 << 6
            r7 = r7 ^ r9
            int r8 = r8 << 12
            r7 = r7 ^ r8
            int r6 = r6 << 18
            r6 = r6 ^ r7
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            if (r6 <= r7) goto L135
            int r6 = r5 + 1
            r3[r5] = r11
        L132:
            Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
            goto L166
        L135:
            if (r14 > r6) goto L13e
            if (r6 >= r13) goto L13e
            int r6 = r5 + 1
            r3[r5] = r11
            goto L132
        L13e:
            r7 = 65536(0x10000, float:9.1835E-41)
            if (r6 >= r7) goto L147
            int r6 = r5 + 1
            r3[r5] = r11
            goto L132
        L147:
            if (r6 == r11) goto L161
            int r7 = r6 >>> 10
            r8 = 55232(0xd7c0, float:7.7397E-41)
            int r7 = r7 + r8
            char r7 = (char) r7
            int r8 = r5 + 1
            r3[r5] = r7
            r6 = r6 & 1023(0x3ff, float:1.434E-42)
            r7 = 56320(0xdc00, float:7.8921E-41)
            int r6 = r6 + r7
            char r6 = (char) r6
            int r5 = r5 + 2
            r3[r8] = r6
            r6 = r5
            goto L132
        L161:
            int r6 = r5 + 1
            r3[r5] = r11
            goto L132
        L166:
            r9 = 4
            r5 = r6
            goto L71
        L16a:
            int r6 = r5 + 1
            r3[r5] = r11
            Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
            goto Lfe
        L171:
            int r6 = r5 + 1
            r3[r5] = r11
            Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
            goto L100
        L178:
            int r6 = r5 + 1
            r3[r5] = r11
            Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
            goto L103
        L17f:
            int r6 = r5 + 1
            r3[r5] = r11
            int r1 = r1 + 1
            r5 = r6
            goto L18
        L188:
            java.lang.String r0 = Yue.C5988.m22265(r3, r4, r5)
            return r0
        L18d:
            java.lang.ArrayIndexOutOfBoundsException r3 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "size="
            r4.append(r5)
            int r0 = r0.length
            r4.append(r0)
            java.lang.String r0 = " beginIndex="
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = " endIndex="
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m27681(byte[] r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto La
            int r2 = r0.length
        La:
            java.lang.String r0 = m27680(r0, r1, r2)
            return r0
    }
}
