package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/internal/-ByteString\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Utf8.kt\nokio/Utf8\n*L\n1#1,363:1\n131#1,2:369\n133#1,9:372\n68#2:364\n74#2:365\n74#2:367\n74#2:368\n68#2:396\n74#2:408\n1#3:366\n1#3:371\n212#4,7:381\n122#4:388\n219#4,5:389\n122#4:394\n226#4:395\n228#4:397\n397#4,2:398\n122#4:400\n400#4,6:401\n127#4:407\n406#4:409\n122#4:410\n407#4,13:411\n122#4:424\n422#4:425\n122#4:426\n425#4:427\n230#4,3:428\n440#4,3:431\n122#4:434\n443#4:435\n127#4:436\n446#4,10:437\n127#4:447\n456#4:448\n122#4:449\n457#4,4:450\n127#4:454\n461#4:455\n122#4:456\n462#4,14:457\n122#4:471\n477#4,2:472\n122#4:474\n481#4:475\n122#4:476\n484#4:477\n234#4,3:478\n500#4,3:481\n122#4:484\n503#4:485\n127#4:486\n506#4,2:487\n127#4:489\n510#4,10:490\n127#4:500\n520#4:501\n122#4:502\n521#4,4:503\n127#4:507\n525#4:508\n122#4:509\n526#4,4:510\n127#4:514\n530#4:515\n122#4:516\n531#4,15:517\n122#4:532\n547#4,2:533\n122#4:535\n550#4,2:536\n122#4:538\n554#4:539\n122#4:540\n557#4:541\n241#4:542\n122#4:543\n242#4,5:544\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/internal/-ByteString\n*L\n329#1:369,2\n329#1:372,9\n67#1:364\n68#1:365\n258#1:367\n259#1:368\n348#1:396\n348#1:408\n329#1:371\n348#1:381,7\n353#1:388\n348#1:389,5\n353#1:394\n348#1:395\n348#1:397\n348#1:398,2\n353#1:400\n348#1:401,6\n348#1:407\n348#1:409\n353#1:410\n348#1:411,13\n353#1:424\n348#1:425\n353#1:426\n348#1:427\n348#1:428,3\n348#1:431,3\n353#1:434\n348#1:435\n348#1:436\n348#1:437,10\n348#1:447\n348#1:448\n353#1:449\n348#1:450,4\n348#1:454\n348#1:455\n353#1:456\n348#1:457,14\n353#1:471\n348#1:472,2\n353#1:474\n348#1:475\n353#1:476\n348#1:477\n348#1:478,3\n348#1:481,3\n353#1:484\n348#1:485\n348#1:486\n348#1:487,2\n348#1:489\n348#1:490,10\n348#1:500\n348#1:501\n353#1:502\n348#1:503,4\n348#1:507\n348#1:508\n353#1:509\n348#1:510,4\n348#1:514\n348#1:515\n353#1:516\n348#1:517,15\n353#1:532\n348#1:533,2\n353#1:535\n348#1:536,2\n353#1:538\n348#1:539\n353#1:540\n348#1:541\n348#1:542\n353#1:543\n348#1:544,5\n*E\n"})
@Yue.InterfaceC3421(name = "-ByteString")
public final class C0002 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final char[] f6 = null;

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            Yue.C0002.f6 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ int m72(byte[] r0, int r1) {
            int r0 = m74(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final /* synthetic */ int m73(char r0) {
            int r0 = m106(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int m74(byte[] r18, int r19) {
            r0 = r18
            r1 = r19
            int r2 = r0.length
            r3 = 0
            r4 = r3
            r5 = r4
        L8:
            if (r3 >= r2) goto L19f
            r6 = r0[r3]
            r7 = 65533(0xfffd, float:9.1831E-41)
            r8 = 160(0xa0, float:2.24E-43)
            r9 = 127(0x7f, float:1.78E-43)
            r10 = 32
            r11 = 13
            r12 = 10
            r13 = 65536(0x10000, float:9.1835E-41)
            r16 = -1
            if (r6 < 0) goto L64
            int r17 = r5 + 1
            if (r5 != r1) goto L24
            return r4
        L24:
            if (r6 == r12) goto L32
            if (r6 == r11) goto L32
            if (r6 < 0) goto L2d
            if (r6 >= r10) goto L2d
            goto L34
        L2d:
            if (r9 > r6) goto L32
            if (r6 >= r8) goto L32
            goto L34
        L32:
            if (r6 != r7) goto L35
        L34:
            return r16
        L35:
            if (r6 >= r13) goto L39
            r5 = 1
            goto L3a
        L39:
            r5 = 2
        L3a:
            int r4 = r4 + r5
            int r3 = r3 + 1
        L3d:
            r5 = r17
            if (r3 >= r2) goto L8
            r6 = r0[r3]
            if (r6 < 0) goto L8
            int r3 = r3 + 1
            int r17 = r5 + 1
            if (r5 != r1) goto L4c
            return r4
        L4c:
            if (r6 == r12) goto L5a
            if (r6 == r11) goto L5a
            if (r6 < 0) goto L55
            if (r6 >= r10) goto L55
            goto L5c
        L55:
            if (r9 > r6) goto L5a
            if (r6 >= r8) goto L5a
            goto L5c
        L5a:
            if (r6 != r7) goto L5d
        L5c:
            return r16
        L5d:
            if (r6 >= r13) goto L61
            r5 = 1
            goto L62
        L61:
            r5 = 2
        L62:
            int r4 = r4 + r5
            goto L3d
        L64:
            int r14 = r6 >> 5
            r15 = -2
            r13 = 128(0x80, float:1.8E-43)
            if (r14 != r15) goto Lad
            int r14 = r3 + 1
            if (r2 > r14) goto L73
            if (r5 != r1) goto L72
            return r4
        L72:
            return r16
        L73:
            r14 = r0[r14]
            r15 = r14 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto La9
            r14 = r14 ^ 3968(0xf80, float:5.56E-42)
            int r6 = r6 << 6
            r6 = r6 ^ r14
            if (r6 >= r13) goto L84
            if (r5 != r1) goto L83
            return r4
        L83:
            return r16
        L84:
            int r13 = r5 + 1
            if (r5 != r1) goto L89
            return r4
        L89:
            if (r6 == r12) goto L97
            if (r6 == r11) goto L97
            if (r6 < 0) goto L92
            if (r6 >= r10) goto L92
            goto L99
        L92:
            if (r9 > r6) goto L97
            if (r6 >= r8) goto L97
            goto L99
        L97:
            if (r6 != r7) goto L9a
        L99:
            return r16
        L9a:
            r5 = 65536(0x10000, float:9.1835E-41)
            if (r6 >= r5) goto La0
            r14 = 1
            goto La1
        La0:
            r14 = 2
        La1:
            int r4 = r4 + r14
            Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
            int r3 = r3 + 2
            r5 = r13
            goto L8
        La9:
            if (r5 != r1) goto Lac
            return r4
        Lac:
            return r16
        Lad:
            int r14 = r6 >> 4
            r7 = 57344(0xe000, float:8.0356E-41)
            r8 = 55296(0xd800, float:7.7486E-41)
            if (r14 != r15) goto L11b
            int r14 = r3 + 2
            if (r2 > r14) goto Lbf
            if (r5 != r1) goto Lbe
            return r4
        Lbe:
            return r16
        Lbf:
            int r15 = r3 + 1
            r15 = r0[r15]
            r9 = r15 & 192(0xc0, float:2.69E-43)
            if (r9 != r13) goto L117
            r9 = r0[r14]
            r14 = r9 & 192(0xc0, float:2.69E-43)
            if (r14 != r13) goto L113
            r13 = -123008(0xfffffffffffe1f80, float:NaN)
            r9 = r9 ^ r13
            int r13 = r15 << 6
            r9 = r9 ^ r13
            int r6 = r6 << 12
            r6 = r6 ^ r9
            r9 = 2048(0x800, float:2.87E-42)
            if (r6 >= r9) goto Ldf
            if (r5 != r1) goto Lde
            return r4
        Lde:
            return r16
        Ldf:
            if (r8 > r6) goto Le7
            if (r6 >= r7) goto Le7
            if (r5 != r1) goto Le6
            return r4
        Le6:
            return r16
        Le7:
            int r7 = r5 + 1
            if (r5 != r1) goto Lec
            return r4
        Lec:
            if (r6 == r12) goto Lfe
            if (r6 == r11) goto Lfe
            if (r6 < 0) goto Lf5
            if (r6 >= r10) goto Lf5
            goto L103
        Lf5:
            r5 = 127(0x7f, float:1.78E-43)
            if (r5 > r6) goto Lfe
            r5 = 160(0xa0, float:2.24E-43)
            if (r6 >= r5) goto Lfe
            goto L103
        Lfe:
            r5 = 65533(0xfffd, float:9.1831E-41)
            if (r6 != r5) goto L104
        L103:
            return r16
        L104:
            r5 = 65536(0x10000, float:9.1835E-41)
            if (r6 >= r5) goto L10a
            r14 = 1
            goto L10b
        L10a:
            r14 = 2
        L10b:
            int r4 = r4 + r14
            Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
            int r3 = r3 + 3
        L110:
            r5 = r7
            goto L8
        L113:
            if (r5 != r1) goto L116
            return r4
        L116:
            return r16
        L117:
            if (r5 != r1) goto L11a
            return r4
        L11a:
            return r16
        L11b:
            int r9 = r6 >> 3
            if (r9 != r15) goto L19b
            int r9 = r3 + 3
            if (r2 > r9) goto L127
            if (r5 != r1) goto L126
            return r4
        L126:
            return r16
        L127:
            int r14 = r3 + 1
            r14 = r0[r14]
            r15 = r14 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L197
            int r15 = r3 + 2
            r15 = r0[r15]
            r10 = r15 & 192(0xc0, float:2.69E-43)
            if (r10 != r13) goto L193
            r9 = r0[r9]
            r10 = r9 & 192(0xc0, float:2.69E-43)
            if (r10 != r13) goto L18f
            r10 = 3678080(0x381f80, float:5.154088E-39)
            r9 = r9 ^ r10
            int r10 = r15 << 6
            r9 = r9 ^ r10
            int r10 = r14 << 12
            r9 = r9 ^ r10
            int r6 = r6 << 18
            r6 = r6 ^ r9
            r9 = 1114111(0x10ffff, float:1.561202E-39)
            if (r6 <= r9) goto L153
            if (r5 != r1) goto L152
            return r4
        L152:
            return r16
        L153:
            if (r8 > r6) goto L15b
            if (r6 >= r7) goto L15b
            if (r5 != r1) goto L15a
            return r4
        L15a:
            return r16
        L15b:
            r7 = 65536(0x10000, float:9.1835E-41)
            if (r6 >= r7) goto L163
            if (r5 != r1) goto L162
            return r4
        L162:
            return r16
        L163:
            int r7 = r5 + 1
            if (r5 != r1) goto L168
            return r4
        L168:
            if (r6 == r12) goto L17c
            if (r6 == r11) goto L17c
            if (r6 < 0) goto L173
            r5 = 32
            if (r6 >= r5) goto L173
            goto L181
        L173:
            r5 = 127(0x7f, float:1.78E-43)
            if (r5 > r6) goto L17c
            r5 = 160(0xa0, float:2.24E-43)
            if (r6 >= r5) goto L17c
            goto L181
        L17c:
            r5 = 65533(0xfffd, float:9.1831E-41)
            if (r6 != r5) goto L182
        L181:
            return r16
        L182:
            r5 = 65536(0x10000, float:9.1835E-41)
            if (r6 >= r5) goto L188
            r14 = 1
            goto L189
        L188:
            r14 = 2
        L189:
            int r4 = r4 + r14
            Yue.ۥۣۢ۠ۤ r5 = Yue.C6593.f23016
            int r3 = r3 + 4
            goto L110
        L18f:
            if (r5 != r1) goto L192
            return r4
        L192:
            return r16
        L193:
            if (r5 != r1) goto L196
            return r4
        L196:
            return r16
        L197:
            if (r5 != r1) goto L19a
            return r4
        L19a:
            return r16
        L19b:
            if (r5 != r1) goto L19e
            return r4
        L19e:
            return r16
        L19f:
            return r4
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String m75(@Yue.InterfaceC4418 Yue.C0879 r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            byte[] r2 = r2.m5067()
            r0 = 0
            r1 = 1
            java.lang.String r2 = Yue.C0000.m2(r2, r0, r1, r0)
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.String m76(@Yue.InterfaceC4418 Yue.C0879 r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            byte[] r1 = r1.m5067()
            byte[] r0 = Yue.C0000.m5()
            java.lang.String r1 = Yue.C0000.m1(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int m77(@Yue.InterfaceC4418 Yue.C0879 r9, @Yue.InterfaceC4418 Yue.C0879 r10) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r9, r0)
            java.lang.String r0 = "other"
            Yue.C3329.m13906(r10, r0)
            int r0 = r9.m5095()
            int r1 = r10.m5095()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L18:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L32
            byte r7 = r9.m5066(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.m5066(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L2d
            int r4 = r4 + 1
            goto L18
        L2d:
            if (r7 >= r8) goto L30
            goto L31
        L30:
            r5 = r6
        L31:
            return r5
        L32:
            if (r0 != r1) goto L35
            return r3
        L35:
            if (r0 >= r1) goto L38
            goto L39
        L38:
            r5 = r6
        L39:
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final void m78(@Yue.InterfaceC4418 Yue.C0879 r1, int r2, @Yue.InterfaceC4418 byte[] r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "target"
            Yue.C3329.m13906(r3, r0)
            byte[] r1 = r1.m5067()
            int r5 = r5 + r2
            Yue.C0586.m2170(r1, r3, r4, r2, r5)
            return
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final Yue.C0879 m79(@Yue.InterfaceC4418 java.lang.String r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            byte[] r1 = Yue.C0000.m0(r1)
            if (r1 == 0) goto L11
            Yue.ۥۣ۟ۥۤ r0 = new Yue.ۥۣ۟ۥۤ
            r0.<init>(r1)
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final Yue.C0879 m80(@Yue.InterfaceC4418 java.lang.String r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r5, r0)
            int r0 = r5.length()
            int r0 = r0 % 2
            if (r0 != 0) goto L3b
            int r0 = r5.length()
            int r0 = r0 / 2
            byte[] r1 = new byte[r0]
            r2 = 0
        L16:
            if (r2 >= r0) goto L35
            int r3 = r2 * 2
            char r4 = r5.charAt(r3)
            int r4 = m73(r4)
            int r4 = r4 << 4
            int r3 = r3 + 1
            char r3 = r5.charAt(r3)
            int r3 = m73(r3)
            int r4 = r4 + r3
            byte r3 = (byte) r4
            r1[r2] = r3
            int r2 = r2 + 1
            goto L16
        L35:
            Yue.ۥۣ۟ۥۤ r5 = new Yue.ۥۣ۟ۥۤ
            r5.<init>(r1)
            return r5
        L3b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected hex string: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final Yue.C0879 m81(@Yue.InterfaceC4418 java.lang.String r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥۣ۟ۥۤ r0 = new Yue.ۥۣ۟ۥۤ
            byte[] r1 = Yue.C7189.m27674(r2)
            r0.<init>(r1)
            r0.m5091(r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final boolean m82(@Yue.InterfaceC4418 Yue.C0879 r3, @Yue.InterfaceC4418 Yue.C0879 r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "suffix"
            Yue.C3329.m13906(r4, r0)
            int r0 = r3.m5095()
            int r1 = r4.m5095()
            int r0 = r0 - r1
            r1 = 0
            int r2 = r4.m5095()
            boolean r3 = r3.mo5087(r0, r4, r1, r2)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final boolean m83(@Yue.InterfaceC4418 Yue.C0879 r3, @Yue.InterfaceC4418 byte[] r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "suffix"
            Yue.C3329.m13906(r4, r0)
            int r0 = r3.m5095()
            int r1 = r4.length
            int r0 = r0 - r1
            r1 = 0
            int r2 = r4.length
            boolean r3 = r3.mo5088(r0, r4, r1, r2)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final boolean m84(@Yue.InterfaceC4418 Yue.C0879 r4, @Yue.InterfaceC4543 java.lang.Object r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            r0 = 1
            if (r5 != r4) goto L9
            goto L2c
        L9:
            boolean r1 = r5 instanceof Yue.C0879
            r2 = 0
            if (r1 == 0) goto L2b
            Yue.ۥۣ۟ۥۤ r5 = (Yue.C0879) r5
            int r1 = r5.m5095()
            byte[] r3 = r4.m5067()
            int r3 = r3.length
            if (r1 != r3) goto L2b
            byte[] r1 = r4.m5067()
            byte[] r4 = r4.m5067()
            int r4 = r4.length
            boolean r4 = r5.mo5088(r2, r1, r2, r4)
            if (r4 == 0) goto L2b
            goto L2c
        L2b:
            r0 = r2
        L2c:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final byte m85(@Yue.InterfaceC4418 Yue.C0879 r1, int r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            byte[] r1 = r1.m5067()
            r1 = r1[r2]
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int m86(@Yue.InterfaceC4418 Yue.C0879 r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            byte[] r1 = r1.m5067()
            int r1 = r1.length
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int m87(@Yue.InterfaceC4418 Yue.C0879 r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            int r0 = r1.m5068()
            if (r0 == 0) goto Lc
            return r0
        Lc:
            byte[] r0 = r1.m5067()
            int r0 = java.util.Arrays.hashCode(r0)
            r1.m5090(r0)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final java.lang.String m88(@Yue.InterfaceC4418 Yue.C0879 r8) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r8, r0)
            byte[] r0 = r8.m5067()
            int r0 = r0.length
            int r0 = r0 * 2
            char[] r0 = new char[r0]
            byte[] r8 = r8.m5067()
            int r1 = r8.length
            r2 = 0
            r3 = r2
        L15:
            if (r2 >= r1) goto L36
            r4 = r8[r2]
            int r5 = r3 + 1
            char[] r6 = m107()
            int r7 = r4 >> 4
            r7 = r7 & 15
            char r6 = r6[r7]
            r0[r3] = r6
            int r3 = r3 + 2
            char[] r6 = m107()
            r4 = r4 & 15
            char r4 = r6[r4]
            r0[r5] = r4
            int r2 = r2 + 1
            goto L15
        L36:
            java.lang.String r8 = Yue.C5988.m22264(r0)
            return r8
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final int m89(@Yue.InterfaceC4418 Yue.C0879 r4, @Yue.InterfaceC4418 byte[] r5, int r6) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "other"
            Yue.C3329.m13906(r5, r0)
            byte[] r0 = r4.m5067()
            int r0 = r0.length
            int r1 = r5.length
            int r0 = r0 - r1
            r1 = 0
            int r6 = java.lang.Math.max(r6, r1)
            if (r6 > r0) goto L29
        L18:
            byte[] r2 = r4.m5067()
            int r3 = r5.length
            boolean r2 = Yue.C0018.m263(r2, r6, r5, r1, r3)
            if (r2 == 0) goto L24
            return r6
        L24:
            if (r6 == r0) goto L29
            int r6 = r6 + 1
            goto L18
        L29:
            r4 = -1
            return r4
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final byte[] m90(@Yue.InterfaceC4418 Yue.C0879 r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            byte[] r1 = r1.m5067()
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int m91(@Yue.InterfaceC4418 Yue.C0879 r1, @Yue.InterfaceC4418 Yue.C0879 r2, int r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "other"
            Yue.C3329.m13906(r2, r0)
            byte[] r2 = r2.mo5080()
            int r1 = r1.mo5085(r2, r3)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int m92(@Yue.InterfaceC4418 Yue.C0879 r3, @Yue.InterfaceC4418 byte[] r4, int r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "other"
            Yue.C3329.m13906(r4, r0)
            int r5 = Yue.C0018.m271(r3, r5)
            byte[] r0 = r3.m5067()
            int r0 = r0.length
            int r1 = r4.length
            int r0 = r0 - r1
            int r5 = java.lang.Math.min(r5, r0)
        L19:
            r0 = -1
            if (r0 >= r5) goto L2c
            byte[] r0 = r3.m5067()
            r1 = 0
            int r2 = r4.length
            boolean r0 = Yue.C0018.m263(r0, r5, r4, r1, r2)
            if (r0 == 0) goto L29
            return r5
        L29:
            int r5 = r5 + (-1)
            goto L19
        L2c:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final Yue.C0879 m93(@Yue.InterfaceC4418 byte[] r2) {
            java.lang.String r0 = "data"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥۣ۟ۥۤ r0 = new Yue.ۥۣ۟ۥۤ
            int r1 = r2.length
            byte[] r2 = java.util.Arrays.copyOf(r2, r1)
            java.lang.String r1 = "copyOf(this, size)"
            Yue.C3329.m13905(r2, r1)
            r0.<init>(r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final boolean m94(@Yue.InterfaceC4418 Yue.C0879 r1, int r2, @Yue.InterfaceC4418 Yue.C0879 r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "other"
            Yue.C3329.m13906(r3, r0)
            byte[] r1 = r1.m5067()
            boolean r1 = r3.mo5088(r4, r1, r2, r5)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final boolean m95(@Yue.InterfaceC4418 Yue.C0879 r1, int r2, @Yue.InterfaceC4418 byte[] r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "other"
            Yue.C3329.m13906(r3, r0)
            if (r2 < 0) goto L26
            byte[] r0 = r1.m5067()
            int r0 = r0.length
            int r0 = r0 - r5
            if (r2 > r0) goto L26
            if (r4 < 0) goto L26
            int r0 = r3.length
            int r0 = r0 - r5
            if (r4 > r0) goto L26
            byte[] r1 = r1.m5067()
            boolean r1 = Yue.C0018.m263(r1, r2, r3, r4, r5)
            if (r1 == 0) goto L26
            r1 = 1
            goto L27
        L26:
            r1 = 0
        L27:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final boolean m96(@Yue.InterfaceC4418 Yue.C0879 r2, @Yue.InterfaceC4418 Yue.C0879 r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "prefix"
            Yue.C3329.m13906(r3, r0)
            int r0 = r3.m5095()
            r1 = 0
            boolean r2 = r2.mo5087(r1, r3, r1, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final boolean m97(@Yue.InterfaceC4418 Yue.C0879 r2, @Yue.InterfaceC4418 byte[] r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "prefix"
            Yue.C3329.m13906(r3, r0)
            int r0 = r3.length
            r1 = 0
            boolean r2 = r2.mo5088(r1, r3, r1, r0)
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final Yue.C0879 m98(@Yue.InterfaceC4418 Yue.C0879 r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            int r3 = Yue.C0018.m271(r1, r3)
            if (r2 < 0) goto L5f
            byte[] r0 = r1.m5067()
            int r0 = r0.length
            if (r3 > r0) goto L3a
            int r0 = r3 - r2
            if (r0 < 0) goto L2e
            if (r2 != 0) goto L20
            byte[] r0 = r1.m5067()
            int r0 = r0.length
            if (r3 != r0) goto L20
            return r1
        L20:
            Yue.ۥۣ۟ۥۤ r0 = new Yue.ۥۣ۟ۥۤ
            byte[] r1 = r1.m5067()
            byte[] r1 = Yue.C0586.m2206(r1, r2, r3)
            r0.<init>(r1)
            return r0
        L2e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "endIndex < beginIndex"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L3a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "endIndex > length("
            r2.append(r3)
            byte[] r1 = r1.m5067()
            int r1 = r1.length
            r2.append(r1)
            r1 = 41
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L5f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "beginIndex < 0"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final Yue.C0879 m99(@Yue.InterfaceC4418 Yue.C0879 r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r5, r0)
            r0 = 0
        L6:
            byte[] r1 = r5.m5067()
            int r1 = r1.length
            if (r0 >= r1) goto L4c
            byte[] r1 = r5.m5067()
            r1 = r1[r0]
            r2 = 65
            if (r1 < r2) goto L49
            r3 = 90
            if (r1 <= r3) goto L1c
            goto L49
        L1c:
            byte[] r5 = r5.m5067()
            int r4 = r5.length
            byte[] r5 = java.util.Arrays.copyOf(r5, r4)
            java.lang.String r4 = "copyOf(this, size)"
            Yue.C3329.m13905(r5, r4)
            int r4 = r0 + 1
            int r1 = r1 + 32
            byte r1 = (byte) r1
            r5[r0] = r1
        L31:
            int r0 = r5.length
            if (r4 >= r0) goto L43
            r0 = r5[r4]
            if (r0 < r2) goto L40
            if (r0 <= r3) goto L3b
            goto L40
        L3b:
            int r0 = r0 + 32
            byte r0 = (byte) r0
            r5[r4] = r0
        L40:
            int r4 = r4 + 1
            goto L31
        L43:
            Yue.ۥۣ۟ۥۤ r0 = new Yue.ۥۣ۟ۥۤ
            r0.<init>(r5)
            return r0
        L49:
            int r0 = r0 + 1
            goto L6
        L4c:
            return r5
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final Yue.C0879 m100(@Yue.InterfaceC4418 Yue.C0879 r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r5, r0)
            r0 = 0
        L6:
            byte[] r1 = r5.m5067()
            int r1 = r1.length
            if (r0 >= r1) goto L4c
            byte[] r1 = r5.m5067()
            r1 = r1[r0]
            r2 = 97
            if (r1 < r2) goto L49
            r3 = 122(0x7a, float:1.71E-43)
            if (r1 <= r3) goto L1c
            goto L49
        L1c:
            byte[] r5 = r5.m5067()
            int r4 = r5.length
            byte[] r5 = java.util.Arrays.copyOf(r5, r4)
            java.lang.String r4 = "copyOf(this, size)"
            Yue.C3329.m13905(r5, r4)
            int r4 = r0 + 1
            int r1 = r1 + (-32)
            byte r1 = (byte) r1
            r5[r0] = r1
        L31:
            int r0 = r5.length
            if (r4 >= r0) goto L43
            r0 = r5[r4]
            if (r0 < r2) goto L40
            if (r0 <= r3) goto L3b
            goto L40
        L3b:
            int r0 = r0 + (-32)
            byte r0 = (byte) r0
            r5[r4] = r0
        L40:
            int r4 = r4 + 1
            goto L31
        L43:
            Yue.ۥۣ۟ۥۤ r0 = new Yue.ۥۣ۟ۥۤ
            r0.<init>(r5)
            return r0
        L49:
            int r0 = r0 + 1
            goto L6
        L4c:
            return r5
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final byte[] m101(@Yue.InterfaceC4418 Yue.C0879 r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            byte[] r1 = r1.m5067()
            int r0 = r1.length
            byte[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r0 = "copyOf(this, size)"
            Yue.C3329.m13905(r1, r0)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final Yue.C0879 m102(@Yue.InterfaceC4418 byte[] r7, int r8, int r9) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            int r9 = Yue.C0018.m272(r7, r9)
            int r0 = r7.length
            long r1 = (long) r0
            long r3 = (long) r8
            long r5 = (long) r9
            Yue.C0018.m264(r1, r3, r5)
            Yue.ۥۣ۟ۥۤ r0 = new Yue.ۥۣ۟ۥۤ
            int r9 = r9 + r8
            byte[] r7 = Yue.C0586.m2206(r7, r8, r9)
            r0.<init>(r7)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final java.lang.String m103(@Yue.InterfaceC4418 Yue.C0879 r20) {
            r0 = r20
            java.lang.String r1 = "<this>"
            Yue.C3329.m13906(r0, r1)
            byte[] r1 = r20.m5067()
            int r1 = r1.length
            if (r1 != 0) goto L11
            java.lang.String r0 = "[size=0]"
            return r0
        L11:
            byte[] r1 = r20.m5067()
            r2 = 64
            int r1 = m72(r1, r2)
            r3 = -1
            java.lang.String r4 = "…]"
            r5 = 0
            java.lang.String r6 = "[size="
            r7 = 93
            if (r1 != r3) goto Lbd
            byte[] r1 = r20.m5067()
            int r1 = r1.length
            if (r1 > r2) goto L45
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[hex="
            r1.append(r2)
            java.lang.String r0 = r20.mo5071()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            goto L8b
        L45:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            byte[] r3 = r20.m5067()
            int r3 = r3.length
            r1.append(r3)
            java.lang.String r3 = " hex="
            r1.append(r3)
            int r2 = Yue.C0018.m271(r0, r2)
            byte[] r3 = r20.m5067()
            int r3 = r3.length
            if (r2 > r3) goto L98
            if (r2 < 0) goto L8c
            byte[] r3 = r20.m5067()
            int r3 = r3.length
            if (r2 != r3) goto L6f
            goto L7d
        L6f:
            Yue.ۥۣ۟ۥۤ r3 = new Yue.ۥۣ۟ۥۤ
            byte[] r0 = r20.m5067()
            byte[] r0 = Yue.C0586.m2206(r0, r5, r2)
            r3.<init>(r0)
            r0 = r3
        L7d:
            java.lang.String r0 = r0.mo5071()
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
        L8b:
            return r0
        L8c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "endIndex < beginIndex"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L98:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "endIndex > length("
            r1.append(r2)
            byte[] r0 = r20.m5067()
            int r0 = r0.length
            r1.append(r0)
            r0 = 41
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        Lbd:
            java.lang.String r2 = r20.m5105()
            java.lang.String r8 = r2.substring(r5, r1)
            java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
            Yue.C3329.m13905(r8, r3)
            r12 = 4
            r13 = 0
            java.lang.String r9 = "\\"
            java.lang.String r10 = "\\\\"
            r11 = 0
            java.lang.String r14 = Yue.C5988.m22305(r8, r9, r10, r11, r12, r13)
            r18 = 4
            r19 = 0
            java.lang.String r15 = "\n"
            java.lang.String r16 = "\\n"
            r17 = 0
            java.lang.String r8 = Yue.C5988.m22305(r14, r15, r16, r17, r18, r19)
            java.lang.String r9 = "\r"
            java.lang.String r10 = "\\r"
            java.lang.String r3 = Yue.C5988.m22305(r8, r9, r10, r11, r12, r13)
            int r2 = r2.length()
            if (r1 >= r2) goto L111
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            byte[] r0 = r20.m5067()
            int r0 = r0.length
            r1.append(r0)
            java.lang.String r0 = " text="
            r1.append(r0)
            r1.append(r3)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            goto L125
        L111:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[text="
            r0.append(r1)
            r0.append(r3)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
        L125:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final java.lang.String m104(@Yue.InterfaceC4418 Yue.C0879 r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = r1.m5070()
            if (r0 != 0) goto L16
            byte[] r0 = r1.mo5080()
            java.lang.String r0 = Yue.C7189.m27676(r0)
            r1.m5091(r0)
        L16:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final void m105(@Yue.InterfaceC4418 Yue.C0879 r1, @Yue.InterfaceC4418 Yue.C0843 r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "buffer"
            Yue.C3329.m13906(r2, r0)
            byte[] r1 = r1.m5067()
            r2.m4897(r1, r3, r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final int m106(char r3) {
            r0 = 48
            if (r0 > r3) goto La
            r1 = 58
            if (r3 >= r1) goto La
            int r3 = r3 - r0
            goto L1f
        La:
            r0 = 97
            if (r0 > r3) goto L15
            r0 = 103(0x67, float:1.44E-43)
            if (r3 >= r0) goto L15
            int r3 = r3 + (-87)
            goto L1f
        L15:
            r0 = 65
            if (r0 > r3) goto L20
            r0 = 71
            if (r3 >= r0) goto L20
            int r3 = r3 + (-55)
        L1f:
            return r3
        L20:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected hex digit: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final char[] m107() {
            char[] r0 = Yue.C0002.f6
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m108() {
            return
    }
}
