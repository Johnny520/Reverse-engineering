package f1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static f1.o0 f3037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1.m0 f3038b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static java.lang.reflect.Method f3039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static java.lang.reflect.Method f3040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f3041e;

    static {
            f1.m0 r0 = new f1.m0
            r0.<init>()
            f1.c0.f3038b = r0
            return
    }

    public static java.lang.String A(int r1) {
            if (r1 != 0) goto L5
            java.lang.String r1 = "Clear"
            return r1
        L5:
            r0 = 1
            if (r1 != r0) goto Lb
            java.lang.String r1 = "Src"
            return r1
        Lb:
            r0 = 2
            if (r1 != r0) goto L11
            java.lang.String r1 = "Dst"
            return r1
        L11:
            r0 = 3
            if (r1 != r0) goto L17
            java.lang.String r1 = "SrcOver"
            return r1
        L17:
            r0 = 4
            if (r1 != r0) goto L1d
            java.lang.String r1 = "DstOver"
            return r1
        L1d:
            r0 = 5
            if (r1 != r0) goto L23
            java.lang.String r1 = "SrcIn"
            return r1
        L23:
            r0 = 6
            if (r1 != r0) goto L29
            java.lang.String r1 = "DstIn"
            return r1
        L29:
            r0 = 7
            if (r1 != r0) goto L2f
            java.lang.String r1 = "SrcOut"
            return r1
        L2f:
            r0 = 8
            if (r1 != r0) goto L36
            java.lang.String r1 = "DstOut"
            return r1
        L36:
            r0 = 9
            if (r1 != r0) goto L3d
            java.lang.String r1 = "SrcAtop"
            return r1
        L3d:
            r0 = 10
            if (r1 != r0) goto L44
            java.lang.String r1 = "DstAtop"
            return r1
        L44:
            r0 = 11
            if (r1 != r0) goto L4b
            java.lang.String r1 = "Xor"
            return r1
        L4b:
            r0 = 12
            if (r1 != r0) goto L52
            java.lang.String r1 = "Plus"
            return r1
        L52:
            r0 = 13
            if (r1 != r0) goto L59
            java.lang.String r1 = "Modulate"
            return r1
        L59:
            r0 = 14
            if (r1 != r0) goto L60
            java.lang.String r1 = "Screen"
            return r1
        L60:
            r0 = 15
            if (r1 != r0) goto L67
            java.lang.String r1 = "Overlay"
            return r1
        L67:
            r0 = 16
            if (r1 != r0) goto L6e
            java.lang.String r1 = "Darken"
            return r1
        L6e:
            r0 = 17
            if (r1 != r0) goto L75
            java.lang.String r1 = "Lighten"
            return r1
        L75:
            r0 = 18
            if (r1 != r0) goto L7c
            java.lang.String r1 = "ColorDodge"
            return r1
        L7c:
            r0 = 19
            if (r1 != r0) goto L83
            java.lang.String r1 = "ColorBurn"
            return r1
        L83:
            r0 = 20
            if (r1 != r0) goto L8a
            java.lang.String r1 = "HardLight"
            return r1
        L8a:
            r0 = 21
            if (r1 != r0) goto L91
            java.lang.String r1 = "Softlight"
            return r1
        L91:
            r0 = 22
            if (r1 != r0) goto L98
            java.lang.String r1 = "Difference"
            return r1
        L98:
            r0 = 23
            if (r1 != r0) goto L9f
            java.lang.String r1 = "Exclusion"
            return r1
        L9f:
            r0 = 24
            if (r1 != r0) goto La6
            java.lang.String r1 = "Multiply"
            return r1
        La6:
            r0 = 25
            if (r1 != r0) goto Lad
            java.lang.String r1 = "Hue"
            return r1
        Lad:
            r0 = 26
            if (r1 != r0) goto Lb4
            java.lang.String r1 = "Saturation"
            return r1
        Lb4:
            r0 = 27
            if (r1 != r0) goto Lbb
            java.lang.String r1 = "Color"
            return r1
        Lbb:
            r0 = 28
            if (r1 != r0) goto Lc2
            java.lang.String r1 = "Luminosity"
            return r1
        Lc2:
            java.lang.String r1 = "Unknown"
            return r1
    }

    public static final int B(float r3, float[] r4, int r5) {
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L6
            goto L7
        L6:
            r0 = r3
        L7:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto Le
            r0 = r1
        Le:
            float r3 = r0 - r3
            float r3 = java.lang.Math.abs(r3)
            r1 = 898428346(0x358cedba, float:1.05E-6)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 <= 0) goto L1d
            r0 = 2143289344(0x7fc00000, float:NaN)
        L1d:
            r4[r5] = r0
            boolean r3 = java.lang.Float.isNaN(r0)
            r3 = r3 ^ 1
            return r3
    }

    public static final f1.b a(f1.g r2) {
            android.graphics.Canvas r0 = f1.c.f3036a
            f1.b r0 = new f1.b
            r0.<init>()
            android.graphics.Canvas r1 = new android.graphics.Canvas
            android.graphics.Bitmap r2 = h(r2)
            r1.<init>(r2)
            r0.f3025a = r1
            return r0
    }

    public static final long b(float r21, float r22, float r23, float r24, g1.c r25) {
            r0 = r25
            boolean r1 = r0.c()
            r2 = 16
            r3 = 32
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            if (r1 == 0) goto L61
            int r0 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            if (r0 >= 0) goto L17
            r0 = r6
            goto L19
        L17:
            r0 = r24
        L19:
            int r1 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r1 <= 0) goto L1e
            r0 = r5
        L1e:
            r1 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 * r1
            float r0 = r0 + r4
            int r0 = (int) r0
            int r0 = r0 << 24
            int r7 = (r21 > r6 ? 1 : (r21 == r6 ? 0 : -1))
            if (r7 >= 0) goto L2b
            r7 = r6
            goto L2d
        L2b:
            r7 = r21
        L2d:
            int r8 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r8 <= 0) goto L32
            r7 = r5
        L32:
            float r7 = r7 * r1
            float r7 = r7 + r4
            int r7 = (int) r7
            int r2 = r7 << 16
            r0 = r0 | r2
            int r2 = (r22 > r6 ? 1 : (r22 == r6 ? 0 : -1))
            if (r2 >= 0) goto L3e
            r2 = r6
            goto L40
        L3e:
            r2 = r22
        L40:
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 <= 0) goto L45
            r2 = r5
        L45:
            float r2 = r2 * r1
            float r2 = r2 + r4
            int r2 = (int) r2
            int r2 = r2 << 8
            r0 = r0 | r2
            int r2 = (r23 > r6 ? 1 : (r23 == r6 ? 0 : -1))
            if (r2 >= 0) goto L50
            goto L52
        L50:
            r6 = r23
        L52:
            int r2 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r2 <= 0) goto L57
            goto L58
        L57:
            r5 = r6
        L58:
            float r5 = r5 * r1
            float r5 = r5 + r4
            int r1 = (int) r5
            r0 = r0 | r1
            long r0 = (long) r0
            long r0 = r0 << r3
            int r2 = f1.w.f3132h
            return r0
        L61:
            long r7 = r0.f4064b
            int r1 = g1.b.f4062e
            long r7 = r7 >> r3
            int r1 = (int) r7
            r7 = 3
            if (r1 != r7) goto L6b
            goto L70
        L6b:
            java.lang.String r1 = "Color only works with ColorSpaces with 3 components"
            f1.g0.a(r1)
        L70:
            int r1 = r0.f4065c
            r7 = -1
            if (r1 == r7) goto L76
            goto L7b
        L76:
            java.lang.String r7 = "Unknown color space, please use a color space in ColorSpaces"
            f1.g0.a(r7)
        L7b:
            r7 = 0
            float r8 = r0.b(r7)
            float r9 = r0.a(r7)
            int r10 = (r21 > r8 ? 1 : (r21 == r8 ? 0 : -1))
            if (r10 >= 0) goto L89
            goto L8b
        L89:
            r8 = r21
        L8b:
            int r10 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r10 <= 0) goto L90
            goto L91
        L90:
            r9 = r8
        L91:
            int r8 = java.lang.Float.floatToRawIntBits(r9)
            int r9 = r8 >>> 31
            int r10 = r8 >>> 23
            r11 = 255(0xff, float:3.57E-43)
            r10 = r10 & r11
            r12 = 8388607(0x7fffff, float:1.1754942E-38)
            r13 = r8 & r12
            r14 = 8388608(0x800000, float:1.1754944E-38)
            r15 = -10
            r16 = 49
            r17 = 512(0x200, float:7.17E-43)
            r18 = r2
            r2 = 31
            r19 = r3
            r3 = 1
            if (r10 != r11) goto Lba
            if (r13 == 0) goto Lb7
            r8 = r17
            goto Lb8
        Lb7:
            r8 = r7
        Lb8:
            r10 = r2
            goto Le8
        Lba:
            int r10 = r10 + (-112)
            if (r10 < r2) goto Lc2
            r8 = r7
            r10 = r16
            goto Le8
        Lc2:
            if (r10 > 0) goto Ld8
            if (r10 < r15) goto Ld5
            r8 = r13 | r14
            int r10 = 1 - r10
            int r8 = r8 >> r10
            r10 = r8 & 4096(0x1000, float:5.74E-42)
            if (r10 == 0) goto Ld1
            int r8 = r8 + 8192
        Ld1:
            int r8 = r8 >> 13
            r10 = r7
            goto Le8
        Ld5:
            r8 = r7
            r10 = r8
            goto Le8
        Ld8:
            int r13 = r13 >> 13
            r8 = r8 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto Le7
            int r8 = r10 << 10
            r8 = r8 | r13
            int r8 = r8 + r3
            int r9 = r9 << 15
            r8 = r8 | r9
        Le5:
            short r8 = (short) r8
            goto Lef
        Le7:
            r8 = r13
        Le8:
            int r9 = r9 << 15
            int r10 = r10 << 10
            r9 = r9 | r10
            r8 = r8 | r9
            goto Le5
        Lef:
            float r9 = r0.b(r3)
            float r10 = r0.a(r3)
            int r13 = (r22 > r9 ? 1 : (r22 == r9 ? 0 : -1))
            if (r13 >= 0) goto Lfc
            goto Lfe
        Lfc:
            r9 = r22
        Lfe:
            int r13 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r13 <= 0) goto L103
            goto L104
        L103:
            r10 = r9
        L104:
            int r9 = java.lang.Float.floatToRawIntBits(r10)
            int r10 = r9 >>> 31
            int r13 = r9 >>> 23
            r13 = r13 & r11
            r20 = r9 & r12
            if (r13 != r11) goto L119
            if (r20 == 0) goto L116
            r9 = r17
            goto L117
        L116:
            r9 = r7
        L117:
            r13 = r2
            goto L149
        L119:
            int r13 = r13 + (-112)
            if (r13 < r2) goto L121
            r9 = r7
            r13 = r16
            goto L149
        L121:
            if (r13 > 0) goto L137
            if (r13 < r15) goto L134
            r9 = r20 | r14
            int r13 = 1 - r13
            int r9 = r9 >> r13
            r13 = r9 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L130
            int r9 = r9 + 8192
        L130:
            int r9 = r9 >> 13
            r13 = r7
            goto L149
        L134:
            r9 = r7
            r13 = r9
            goto L149
        L137:
            int r20 = r20 >> 13
            r9 = r9 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L147
            int r9 = r13 << 10
            r9 = r9 | r20
            int r9 = r9 + r3
            int r10 = r10 << 15
            r9 = r9 | r10
        L145:
            short r9 = (short) r9
            goto L150
        L147:
            r9 = r20
        L149:
            int r10 = r10 << 15
            int r13 = r13 << 10
            r10 = r10 | r13
            r9 = r9 | r10
            goto L145
        L150:
            r10 = 2
            float r13 = r0.b(r10)
            float r0 = r0.a(r10)
            int r10 = (r23 > r13 ? 1 : (r23 == r13 ? 0 : -1))
            if (r10 >= 0) goto L15e
            goto L160
        L15e:
            r13 = r23
        L160:
            int r10 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r10 <= 0) goto L165
            goto L166
        L165:
            r0 = r13
        L166:
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            int r10 = r0 >>> 31
            int r13 = r0 >>> 23
            r13 = r13 & r11
            r12 = r12 & r0
            if (r13 != r11) goto L179
            if (r12 == 0) goto L176
            r7 = r17
        L176:
            r0 = r7
            r7 = r2
            goto L1a6
        L179:
            int r13 = r13 + (-112)
            if (r13 < r2) goto L181
            r0 = r7
            r7 = r16
            goto L1a6
        L181:
            if (r13 > 0) goto L195
            if (r13 < r15) goto L193
            r0 = r12 | r14
            int r2 = 1 - r13
            int r0 = r0 >> r2
            r2 = r0 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L190
            int r0 = r0 + 8192
        L190:
            int r0 = r0 >> 13
            goto L1a6
        L193:
            r0 = r7
            goto L1a6
        L195:
            int r7 = r12 >> 13
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L1a4
            int r0 = r13 << 10
            r0 = r0 | r7
            int r0 = r0 + r3
            int r2 = r10 << 15
            r0 = r0 | r2
        L1a2:
            short r0 = (short) r0
            goto L1ad
        L1a4:
            r0 = r7
            r7 = r13
        L1a6:
            int r2 = r10 << 15
            int r3 = r7 << 10
            r2 = r2 | r3
            r0 = r0 | r2
            goto L1a2
        L1ad:
            int r2 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            if (r2 >= 0) goto L1b2
            goto L1b4
        L1b2:
            r6 = r24
        L1b4:
            int r2 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r2 <= 0) goto L1b9
            goto L1ba
        L1b9:
            r5 = r6
        L1ba:
            r2 = 1149222912(0x447fc000, float:1023.0)
            float r5 = r5 * r2
            float r5 = r5 + r4
            int r2 = (int) r5
            long r3 = (long) r8
            r5 = 65535(0xffff, double:3.23786E-319)
            long r3 = r3 & r5
            r7 = 48
            long r3 = r3 << r7
            long r7 = (long) r9
            long r7 = r7 & r5
            long r7 = r7 << r19
            long r3 = r3 | r7
            long r7 = (long) r0
            long r5 = r5 & r7
            long r5 = r5 << r18
            long r3 = r3 | r5
            long r5 = (long) r2
            r7 = 1023(0x3ff, double:5.054E-321)
            long r5 = r5 & r7
            r0 = 6
            long r5 = r5 << r0
            long r2 = r3 | r5
            long r0 = (long) r1
            r4 = 63
            long r0 = r0 & r4
            long r0 = r0 | r2
            int r2 = f1.w.f3132h
            return r0
    }

    public static final long c(int r2) {
            long r0 = (long) r2
            r2 = 32
            long r0 = r0 << r2
            int r2 = f1.w.f3132h
            return r0
    }

    public static final long d(long r1) {
            r0 = 32
            long r1 = r1 << r0
            int r0 = f1.w.f3132h
            return r1
    }

    public static f1.g e(int r24, int r25, int r26) {
            g1.r r0 = g1.e.f4072e
            x(r26)
            android.graphics.Bitmap$Config r4 = x(r26)
            boolean r1 = gg.l.a(r0, r0)
            if (r1 == 0) goto L18
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
        L15:
            r6 = r0
            goto L1a6
        L18:
            g1.r r1 = g1.e.f4084q
            boolean r1 = gg.l.a(r0, r1)
            if (r1 == 0) goto L27
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.ACES
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            goto L15
        L27:
            g1.r r1 = g1.e.f4085r
            boolean r1 = gg.l.a(r0, r1)
            if (r1 == 0) goto L36
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.ACESCG
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            goto L15
        L36:
            g1.r r1 = g1.e.f4082o
            boolean r1 = gg.l.a(r0, r1)
            if (r1 == 0) goto L45
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.ADOBE_RGB
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            goto L15
        L45:
            g1.r r1 = g1.e.f4077j
            boolean r1 = gg.l.a(r0, r1)
            if (r1 == 0) goto L54
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.BT2020
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            goto L15
        L54:
            g1.r r1 = g1.e.f4076i
            boolean r1 = gg.l.a(r0, r1)
            if (r1 == 0) goto L63
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.BT709
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            goto L15
        L63:
            g1.l r1 = g1.e.f4087t
            boolean r1 = gg.l.a(r0, r1)
            if (r1 == 0) goto L72
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.CIE_LAB
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            goto L15
        L72:
            g1.l r1 = g1.e.f4086s
            boolean r1 = gg.l.a(r0, r1)
            if (r1 == 0) goto L81
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.CIE_XYZ
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            goto L15
        L81:
            g1.r r1 = g1.e.f4078k
            boolean r1 = gg.l.a(r0, r1)
            if (r1 == 0) goto L90
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.DCI_P3
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            goto L15
        L90:
            g1.r r1 = g1.e.f4079l
            boolean r1 = gg.l.a(r0, r1)
            if (r1 == 0) goto La0
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.DISPLAY_P3
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            goto L15
        La0:
            g1.r r1 = g1.e.f4074g
            boolean r1 = gg.l.a(r0, r1)
            if (r1 == 0) goto Lb0
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.EXTENDED_SRGB
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            goto L15
        Lb0:
            g1.r r1 = g1.e.f4075h
            boolean r1 = gg.l.a(r0, r1)
            if (r1 == 0) goto Lc0
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            goto L15
        Lc0:
            g1.r r1 = g1.e.f4073f
            boolean r1 = gg.l.a(r0, r1)
            if (r1 == 0) goto Ld0
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.LINEAR_SRGB
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            goto L15
        Ld0:
            g1.r r1 = g1.e.f4080m
            boolean r1 = gg.l.a(r0, r1)
            if (r1 == 0) goto Le0
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.NTSC_1953
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            goto L15
        Le0:
            g1.r r1 = g1.e.f4083p
            boolean r1 = gg.l.a(r0, r1)
            if (r1 == 0) goto Lf0
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.PRO_PHOTO_RGB
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            goto L15
        Lf0:
            g1.r r1 = g1.e.f4081n
            boolean r1 = gg.l.a(r0, r1)
            if (r1 == 0) goto L100
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SMPTE_C
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            goto L15
        L100:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            r3 = 0
            if (r1 < r2) goto L12f
            g1.r r1 = g1.e.f4089v
            boolean r1 = gg.l.a(r0, r1)
            if (r1 == 0) goto L118
            android.graphics.ColorSpace$Named r1 = f0.k.g()
            android.graphics.ColorSpace r1 = android.graphics.ColorSpace.get(r1)
            goto L12a
        L118:
            g1.r r1 = g1.e.f4090w
            boolean r1 = gg.l.a(r0, r1)
            if (r1 == 0) goto L129
            android.graphics.ColorSpace$Named r1 = f0.k.t()
            android.graphics.ColorSpace r1 = android.graphics.ColorSpace.get(r1)
            goto L12a
        L129:
            r1 = r3
        L12a:
            if (r1 == 0) goto L12f
            r6 = r1
            goto L1a6
        L12f:
            if (r0 == 0) goto L19e
            java.lang.String r6 = r0.f4063a
            g1.t r1 = r0.f4120d
            float[] r8 = r1.a()
            g1.s r1 = r0.f4123g
            if (r1 == 0) goto L159
            android.graphics.ColorSpace$Rgb$TransferParameters r9 = new android.graphics.ColorSpace$Rgb$TransferParameters
            double r10 = r1.f4135b
            double r12 = r1.f4136c
            double r14 = r1.f4137d
            double r2 = r1.f4138e
            r16 = r2
            double r2 = r1.f4139f
            r18 = r2
            double r2 = r1.f4140g
            r20 = r2
            double r1 = r1.f4134a
            r22 = r1
            r9.<init>(r10, r12, r14, r16, r18, r20, r22)
            r3 = r9
        L159:
            float[] r1 = r0.f4125i
            if (r3 == 0) goto L181
            android.graphics.ColorSpace$Rgb r2 = new android.graphics.ColorSpace$Rgb
            float[] r0 = r0.f4124h
            r2.<init>(r6, r0, r8, r3)
            r0 = 0
            r0 = r1[r0]
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L16e
            goto L178
        L16e:
            float[] r0 = r2.getTransform()
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L17a
        L178:
            r6 = r2
            goto L1a6
        L17a:
            android.graphics.ColorSpace$Rgb r0 = new android.graphics.ColorSpace$Rgb
            r0.<init>(r6, r1, r3)
            goto L15
        L181:
            android.graphics.ColorSpace$Rgb r5 = new android.graphics.ColorSpace$Rgb
            float[] r7 = r0.f4124h
            g1.q r1 = r0.f4128l
            f1.x r9 = new f1.x
            r2 = 0
            r9.<init>(r1, r2)
            g1.q r1 = r0.f4131o
            f1.x r10 = new f1.x
            r2 = 1
            r10.<init>(r1, r2)
            float r11 = r0.f4121e
            float r12 = r0.f4122f
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r6 = r5
            goto L1a6
        L19e:
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            goto L15
        L1a6:
            r1 = 0
            r5 = 1
            r2 = r24
            r3 = r25
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r1, r2, r3, r4, r5, r6)
            f1.g r1 = new f1.g
            r1.<init>(r0)
            return r1
    }

    public static final f1.h f() {
            f1.h r0 = new f1.h
            android.graphics.Paint r1 = new android.graphics.Paint
            r2 = 7
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static final long g(float r4, float r5) {
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r0 = (long) r4
            int r4 = java.lang.Float.floatToRawIntBits(r5)
            long r4 = (long) r4
            r2 = 32
            long r0 = r0 << r2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            long r4 = r4 | r0
            int r0 = f1.u0.f3123c
            return r4
    }

    public static final android.graphics.Bitmap h(f1.g r1) {
            boolean r0 = r1 instanceof f1.g
            if (r0 == 0) goto L7
            android.graphics.Bitmap r1 = r1.f3055a
            return r1
        L7:
            java.lang.String r1 = "Unable to obtain android.graphics.Bitmap"
            j8.o.w(r1)
            r1 = 0
            return r1
    }

    public static final void i(f1.u r13, f1.c0 r14, f1.h r15) {
            boolean r0 = r14 instanceof f1.k0
            if (r0 == 0) goto L16
            f1.k0 r14 = (f1.k0) r14
            e1.c r14 = r14.f3073f
            float r1 = r14.f2296a
            float r2 = r14.f2297b
            float r3 = r14.f2298c
            float r4 = r14.f2299d
            r0 = r13
            r5 = r15
            r0.t(r1, r2, r3, r4, r5)
            return
        L16:
            r0 = r13
            r5 = r15
            boolean r13 = r14 instanceof f1.l0
            if (r13 == 0) goto L4c
            f1.l0 r14 = (f1.l0) r14
            e1.d r13 = r14.f3074f
            long r1 = r13.f2307h
            f1.j r14 = r14.f3075g
            if (r14 == 0) goto L2a
            r0.j(r14, r5)
            return
        L2a:
            float r6 = r13.f2300a
            float r7 = r13.f2301b
            float r8 = r13.f2302c
            float r9 = r13.f2303d
            r13 = 32
            long r13 = r1 >> r13
            int r13 = (int) r13
            float r10 = java.lang.Float.intBitsToFloat(r13)
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r13 = r13 & r1
            int r13 = (int) r13
            float r11 = java.lang.Float.intBitsToFloat(r13)
            r12 = r5
            r5 = r0
            r5.q(r6, r7, r8, r9, r10, r11, r12)
            return
        L4c:
            boolean r13 = r14 instanceof f1.j0
            if (r13 == 0) goto L58
            f1.j0 r14 = (f1.j0) r14
            f1.j r13 = r14.f3071f
            r0.j(r13, r5)
            return
        L58:
            okio.a.k()
            return
    }

    public static void j(android.graphics.Canvas r11, boolean r12) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L10
            if (r12 == 0) goto Lc
            f1.a.k(r11)
            return
        Lc:
            f1.a.t(r11)
            return
        L10:
            boolean r1 = f1.c0.f3041e
            r2 = 0
            if (r1 != 0) goto L75
            r1 = 28
            java.lang.String r3 = "insertInorderBarrier"
            java.lang.String r4 = "insertReorderBarrier"
            java.lang.Class<android.graphics.Canvas> r5 = android.graphics.Canvas.class
            r6 = 1
            if (r0 != r1) goto L59
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            java.lang.String r1 = "getDeclaredMethod"
            r7 = 2
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> L73
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r10 = 0
            r8[r10] = r9     // Catch: java.lang.Throwable -> L73
            java.lang.Class[] r9 = new java.lang.Class[r10]     // Catch: java.lang.Throwable -> L73
            java.lang.Class r9 = r9.getClass()     // Catch: java.lang.Throwable -> L73
            r8[r6] = r9     // Catch: java.lang.Throwable -> L73
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r8)     // Catch: java.lang.Throwable -> L73
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L73
            r1[r10] = r4     // Catch: java.lang.Throwable -> L73
            java.lang.Class[] r4 = new java.lang.Class[r10]     // Catch: java.lang.Throwable -> L73
            r1[r6] = r4     // Catch: java.lang.Throwable -> L73
            java.lang.Object r1 = r0.invoke(r5, r1)     // Catch: java.lang.Throwable -> L73
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L73
            f1.c0.f3039c = r1     // Catch: java.lang.Throwable -> L73
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L73
            r1[r10] = r3     // Catch: java.lang.Throwable -> L73
            java.lang.Class[] r3 = new java.lang.Class[r10]     // Catch: java.lang.Throwable -> L73
            r1[r6] = r3     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = r0.invoke(r5, r1)     // Catch: java.lang.Throwable -> L73
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L73
            f1.c0.f3040d = r0     // Catch: java.lang.Throwable -> L73
            goto L65
        L59:
            java.lang.reflect.Method r0 = r5.getDeclaredMethod(r4, r2)     // Catch: java.lang.Throwable -> L73
            f1.c0.f3039c = r0     // Catch: java.lang.Throwable -> L73
            java.lang.reflect.Method r0 = r5.getDeclaredMethod(r3, r2)     // Catch: java.lang.Throwable -> L73
            f1.c0.f3040d = r0     // Catch: java.lang.Throwable -> L73
        L65:
            java.lang.reflect.Method r0 = f1.c0.f3039c     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L6c
            r0.setAccessible(r6)     // Catch: java.lang.Throwable -> L73
        L6c:
            java.lang.reflect.Method r0 = f1.c0.f3040d     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L73
            r0.setAccessible(r6)     // Catch: java.lang.Throwable -> L73
        L73:
            f1.c0.f3041e = r6
        L75:
            if (r12 == 0) goto L7e
            java.lang.reflect.Method r0 = f1.c0.f3039c     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L7e
            r0.invoke(r11, r2)     // Catch: java.lang.Throwable -> L87
        L7e:
            if (r12 != 0) goto L87
            java.lang.reflect.Method r12 = f1.c0.f3040d     // Catch: java.lang.Throwable -> L87
            if (r12 == 0) goto L87
            r12.invoke(r11, r2)     // Catch: java.lang.Throwable -> L87
        L87:
            return
    }

    public static final android.graphics.Paint l(f1.h r2) {
            if (r2 != 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received "
            r0.<init>(r1)
            java.lang.Class r1 = r2.getClass()
            gg.f r1 = gg.v.a(r1)
            java.lang.String r1 = r1.b()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            f1.g0.a(r0)
        L1f:
            java.lang.Object r2 = r2.f3058i
            android.graphics.Paint r2 = (android.graphics.Paint) r2
            return r2
    }

    public static final y0.o m(y0.o r1, fg.l r2) {
            f1.o r0 = new f1.o
            r0.<init>(r2)
            y0.o r1 = r1.d(r0)
            return r1
    }

    public static y0.o n(y0.o r12, float r13, float r14, f1.r0 r15, boolean r16, f1.n r17, int r18) {
            r0 = r18
            r1 = r0 & 4
            if (r1 == 0) goto L8
            r13 = 1065353216(0x3f800000, float:1.0)
        L8:
            r1 = r13
            r13 = r0 & 32
            if (r13 == 0) goto L10
            r13 = 0
            r2 = r13
            goto L11
        L10:
            r2 = r14
        L11:
            long r3 = f1.u0.f3122b
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L1b
            f1.m0 r13 = f1.c0.f3038b
            r5 = r13
            goto L1c
        L1b:
            r5 = r15
        L1c:
            r13 = r0 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L23
            r13 = 0
            r6 = r13
            goto L25
        L23:
            r6 = r16
        L25:
            long r7 = f1.e0.f3045a
            r13 = 262144(0x40000, float:3.67342E-40)
            r13 = r13 & r0
            if (r13 == 0) goto L2f
            r13 = 0
            r11 = r13
            goto L31
        L2f:
            r11 = r17
        L31:
            f1.b0 r0 = new f1.b0
            r9 = r7
            r0.<init>(r1, r2, r3, r5, r6, r7, r9, r11)
            y0.o r12 = r12.d(r0)
            return r12
    }

    public static final boolean o(float[] r5) {
            int r0 = r5.length
            r1 = 16
            r2 = 0
            if (r0 >= r1) goto L7
            return r2
        L7:
            r0 = r5[r2]
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L82
            r0 = 1
            r3 = r5[r0]
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 2
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 3
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 4
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 5
            r3 = r5[r3]
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 6
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 7
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 8
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 9
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 10
            r3 = r5[r3]
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 11
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 12
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 13
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 14
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 15
            r5 = r5[r3]
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L82
            return r0
        L82:
            return r2
    }

    public static final void p(android.graphics.Matrix r21, float[] r22) {
            r0 = 0
            r1 = r22[r0]
            r2 = 1
            r3 = r22[r2]
            r4 = 2
            r5 = r22[r4]
            r6 = 3
            r7 = r22[r6]
            r8 = 4
            r9 = r22[r8]
            r10 = 5
            r11 = r22[r10]
            r12 = 6
            r13 = r22[r12]
            r14 = 7
            r15 = r22[r14]
            r16 = 8
            r17 = r22[r16]
            r18 = 12
            r18 = r22[r18]
            r19 = 13
            r19 = r22[r19]
            r20 = 15
            r20 = r22[r20]
            r22[r0] = r1
            r22[r2] = r9
            r22[r4] = r18
            r22[r6] = r3
            r22[r8] = r11
            r22[r10] = r19
            r22[r12] = r7
            r22[r14] = r15
            r22[r16] = r20
            r21.setValues(r22)
            r22[r0] = r1
            r22[r2] = r3
            r22[r4] = r5
            r22[r6] = r7
            r22[r8] = r9
            r22[r10] = r11
            r22[r12] = r13
            r22[r14] = r15
            r22[r16] = r17
            return
    }

    public static final void q(android.graphics.Matrix r18, float[] r19) {
            r18.getValues(r19)
            r0 = 0
            r1 = r19[r0]
            r2 = 1
            r3 = r19[r2]
            r4 = 2
            r5 = r19[r4]
            r6 = 3
            r7 = r19[r6]
            r8 = 4
            r9 = r19[r8]
            r10 = 5
            r11 = r19[r10]
            r12 = 6
            r13 = r19[r12]
            r14 = 7
            r15 = r19[r14]
            r16 = 8
            r17 = r19[r16]
            r19[r0] = r1
            r19[r2] = r7
            r0 = 0
            r19[r4] = r0
            r19[r6] = r13
            r19[r8] = r3
            r19[r10] = r9
            r19[r12] = r0
            r19[r14] = r15
            r19[r16] = r0
            r1 = 9
            r19[r1] = r0
            r1 = 10
            r2 = 1065353216(0x3f800000, float:1.0)
            r19[r1] = r2
            r1 = 11
            r19[r1] = r0
            r1 = 12
            r19[r1] = r5
            r1 = 13
            r19[r1] = r11
            r1 = 14
            r19[r1] = r0
            r0 = 15
            r19[r0] = r17
            return
    }

    public static final long r(e1.c r6) {
            float r0 = r6.f2298c
            float r1 = r6.f2296a
            float r0 = r0 - r1
            float r1 = r6.f2299d
            float r6 = r6.f2297b
            float r1 = r1 - r6
            int r6 = java.lang.Float.floatToRawIntBits(r0)
            long r2 = (long) r6
            int r6 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r6
            r6 = 32
            long r2 = r2 << r6
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            long r0 = r0 | r2
            return r0
    }

    public static final android.graphics.BlendMode s(int r1) {
            if (r1 != 0) goto L7
            android.graphics.BlendMode r1 = androidx.lifecycle.a0.b()
            return r1
        L7:
            r0 = 1
            if (r1 != r0) goto Lf
            android.graphics.BlendMode r1 = androidx.lifecycle.a0.r()
            return r1
        Lf:
            r0 = 2
            if (r1 != r0) goto L17
            android.graphics.BlendMode r1 = androidx.lifecycle.a0.k()
            return r1
        L17:
            r0 = 3
            if (r1 != r0) goto L1f
            android.graphics.BlendMode r1 = androidx.lifecycle.a0.j()
            return r1
        L1f:
            r0 = 4
            if (r1 != r0) goto L27
            android.graphics.BlendMode r1 = androidx.lifecycle.a0.l()
            return r1
        L27:
            r0 = 5
            if (r1 != r0) goto L2f
            android.graphics.BlendMode r1 = androidx.lifecycle.a0.m()
            return r1
        L2f:
            r0 = 6
            if (r1 != r0) goto L37
            android.graphics.BlendMode r1 = androidx.lifecycle.a0.n()
            return r1
        L37:
            r0 = 7
            if (r1 != r0) goto L3f
            android.graphics.BlendMode r1 = androidx.lifecycle.a0.o()
            return r1
        L3f:
            r0 = 8
            if (r1 != r0) goto L48
            android.graphics.BlendMode r1 = androidx.lifecycle.a0.p()
            return r1
        L48:
            r0 = 9
            if (r1 != r0) goto L51
            android.graphics.BlendMode r1 = androidx.lifecycle.a0.s()
            return r1
        L51:
            r0 = 10
            if (r1 != r0) goto L5a
            android.graphics.BlendMode r1 = androidx.lifecycle.a0.h()
            return r1
        L5a:
            r0 = 11
            if (r1 != r0) goto L63
            android.graphics.BlendMode r1 = androidx.lifecycle.a0.t()
            return r1
        L63:
            r0 = 12
            if (r1 != r0) goto L6c
            android.graphics.BlendMode r1 = androidx.lifecycle.a0.u()
            return r1
        L6c:
            r0 = 13
            if (r1 != r0) goto L75
            android.graphics.BlendMode r1 = androidx.lifecycle.a0.v()
            return r1
        L75:
            r0 = 14
            if (r1 != r0) goto L7e
            android.graphics.BlendMode r1 = f1.a.b()
            return r1
        L7e:
            r0 = 15
            if (r1 != r0) goto L87
            android.graphics.BlendMode r1 = f1.a.q()
            return r1
        L87:
            r0 = 16
            if (r1 != r0) goto L90
            android.graphics.BlendMode r1 = f1.a.v()
            return r1
        L90:
            r0 = 17
            if (r1 != r0) goto L99
            android.graphics.BlendMode r1 = f1.a.z()
            return r1
        L99:
            r0 = 18
            if (r1 != r0) goto La2
            android.graphics.BlendMode r1 = f1.a.C()
            return r1
        La2:
            r0 = 19
            if (r1 != r0) goto Lab
            android.graphics.BlendMode r1 = androidx.lifecycle.a0.f()
            return r1
        Lab:
            r0 = 20
            if (r1 != r0) goto Lb4
            android.graphics.BlendMode r1 = androidx.lifecycle.a0.x()
            return r1
        Lb4:
            r0 = 21
            if (r1 != r0) goto Lbd
            android.graphics.BlendMode r1 = androidx.lifecycle.a0.y()
            return r1
        Lbd:
            r0 = 22
            if (r1 != r0) goto Lc6
            android.graphics.BlendMode r1 = androidx.lifecycle.a0.z()
            return r1
        Lc6:
            r0 = 23
            if (r1 != r0) goto Lcf
            android.graphics.BlendMode r1 = androidx.lifecycle.a0.A()
            return r1
        Lcf:
            r0 = 24
            if (r1 != r0) goto Ld8
            android.graphics.BlendMode r1 = androidx.lifecycle.a0.B()
            return r1
        Ld8:
            r0 = 25
            if (r1 != r0) goto Le1
            android.graphics.BlendMode r1 = androidx.lifecycle.a0.C()
            return r1
        Le1:
            r0 = 26
            if (r1 != r0) goto Lea
            android.graphics.BlendMode r1 = androidx.lifecycle.a0.D()
            return r1
        Lea:
            r0 = 27
            if (r1 != r0) goto Lf3
            android.graphics.BlendMode r1 = androidx.lifecycle.a0.g()
            return r1
        Lf3:
            r0 = 28
            if (r1 != r0) goto Lfc
            android.graphics.BlendMode r1 = androidx.lifecycle.a0.i()
            return r1
        Lfc:
            android.graphics.BlendMode r1 = androidx.lifecycle.a0.j()
            return r1
    }

    public static final android.graphics.Rect t(u2.k r4) {
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = r4.f13349a
            int r2 = r4.f13350b
            int r3 = r4.f13351c
            int r4 = r4.f13352d
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static final android.graphics.RectF u(e1.c r4) {
            android.graphics.RectF r0 = new android.graphics.RectF
            float r1 = r4.f2296a
            float r2 = r4.f2297b
            float r3 = r4.f2298c
            float r4 = r4.f2299d
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static final android.graphics.Shader.TileMode v(int r1) {
            if (r1 != 0) goto L5
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP
            return r1
        L5:
            r0 = 1
            if (r1 != r0) goto Lb
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.REPEAT
            return r1
        Lb:
            r0 = 2
            if (r1 != r0) goto L11
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.MIRROR
            return r1
        L11:
            r0 = 3
            if (r1 != r0) goto L22
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L1f
            android.graphics.Shader$TileMode r1 = a1.c.h()
            return r1
        L1f:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP
            return r1
        L22:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP
            return r1
    }

    public static final int w(long r1) {
            float[] r0 = g1.e.f4068a
            g1.r r0 = g1.e.f4072e
            long r1 = f1.w.a(r1, r0)
            r0 = 32
            long r1 = r1 >>> r0
            int r1 = (int) r1
            return r1
    }

    public static final android.graphics.Bitmap.Config x(int r1) {
            if (r1 != 0) goto L5
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            return r1
        L5:
            r0 = 1
            if (r1 != r0) goto Lb
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8
            return r1
        Lb:
            r0 = 2
            if (r1 != r0) goto L11
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565
            return r1
        L11:
            r0 = 3
            if (r1 != r0) goto L17
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16
            return r1
        L17:
            r0 = 4
            if (r1 != r0) goto L1d
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.HARDWARE
            return r1
        L1d:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            return r1
    }

    public static final e1.c y(android.graphics.RectF r4) {
            e1.c r0 = new e1.c
            float r1 = r4.left
            float r2 = r4.top
            float r3 = r4.right
            float r4 = r4.bottom
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static final android.graphics.PorterDuff.Mode z(int r1) {
            if (r1 != 0) goto L5
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.CLEAR
            return r1
        L5:
            r0 = 1
            if (r1 != r0) goto Lb
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC
            return r1
        Lb:
            r0 = 2
            if (r1 != r0) goto L11
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.DST
            return r1
        L11:
            r0 = 3
            if (r1 != r0) goto L17
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_OVER
            return r1
        L17:
            r0 = 4
            if (r1 != r0) goto L1d
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.DST_OVER
            return r1
        L1d:
            r0 = 5
            if (r1 != r0) goto L23
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            return r1
        L23:
            r0 = 6
            if (r1 != r0) goto L29
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.DST_IN
            return r1
        L29:
            r0 = 7
            if (r1 != r0) goto L2f
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_OUT
            return r1
        L2f:
            r0 = 8
            if (r1 != r0) goto L36
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.DST_OUT
            return r1
        L36:
            r0 = 9
            if (r1 != r0) goto L3d
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            return r1
        L3d:
            r0 = 10
            if (r1 != r0) goto L44
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.DST_ATOP
            return r1
        L44:
            r0 = 11
            if (r1 != r0) goto L4b
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.XOR
            return r1
        L4b:
            r0 = 12
            if (r1 != r0) goto L52
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.ADD
            return r1
        L52:
            r0 = 14
            if (r1 != r0) goto L59
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SCREEN
            return r1
        L59:
            r0 = 15
            if (r1 != r0) goto L60
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.OVERLAY
            return r1
        L60:
            r0 = 16
            if (r1 != r0) goto L67
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.DARKEN
            return r1
        L67:
            r0 = 17
            if (r1 != r0) goto L6e
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.LIGHTEN
            return r1
        L6e:
            r0 = 13
            if (r1 != r0) goto L75
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
            return r1
        L75:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_OVER
            return r1
    }

    public abstract e1.c k();
}
