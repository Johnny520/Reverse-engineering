package ef;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final mh.b f2737m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f2738n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f2739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f2740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte f2741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte f2742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte f2743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte f2744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final short f2745g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final short f2746h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final short f2747i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte f2748j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f2749k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.String f2750l;

    static {
            java.lang.Class<ef.a> r0 = ef.a.class
            mh.b r0 = mh.d.b(r0)
            ef.a.f2737m = r0
            r0 = 0
            ef.a.f2738n = r0
            return
    }

    public a(short r19, short r20, char[] r21, char[] r22, byte r23, byte r24, int r25, byte r26, byte r27, byte r28, byte r29, short r30, short r31, short r32, byte r33, byte r34, short r35, short r36, short r37, char[] r38, char[] r39, byte r40, byte r41, int r42) {
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r26
            r7 = r27
            r8 = r33
            r9 = r35
            r10 = r36
            r12 = r38
            r13 = r39
            r0.<init>()
            r15 = 3
            r16 = 0
            mh.b r14 = ef.a.f2737m
            if (r4 < 0) goto L2a
            if (r4 <= r15) goto L27
            goto L2a
        L27:
            r11 = r16
            goto L36
        L2a:
            java.lang.String r11 = "Invalid orientation value: {}"
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            r14.h(r4, r11)
            r4 = r16
            r11 = 1
        L36:
            if (r5 < 0) goto L3a
            if (r5 <= r15) goto L46
        L3a:
            java.lang.String r11 = "Invalid touchscreen value: {}"
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)
            r14.h(r5, r11)
            r5 = r16
            r11 = 1
        L46:
            r15 = -1
            r23 = r11
            r11 = r25
            if (r11 >= r15) goto L5a
            java.lang.String r15 = "Invalid density value: {}"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r14.h(r11, r15)
            r11 = r16
            r15 = 1
            goto L5c
        L5a:
            r15 = r23
        L5c:
            if (r6 < 0) goto L63
            r23 = r15
            r15 = 3
            if (r6 <= r15) goto L70
        L63:
            java.lang.String r15 = "Invalid keyboard value: {}"
            java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
            r14.h(r6, r15)
            r6 = r16
            r23 = 1
        L70:
            r15 = 4
            if (r7 < 0) goto L79
            if (r7 <= r15) goto L76
            goto L79
        L76:
            r14 = r23
            goto L85
        L79:
            java.lang.String r15 = "Invalid navigation value: {}"
            java.lang.Byte r7 = java.lang.Byte.valueOf(r7)
            r14.h(r7, r15)
            r7 = r16
            r14 = 1
        L85:
            if (r12 == 0) goto L8e
            int r15 = r12.length
            if (r15 == 0) goto L8e
            char r15 = r12[r16]
            if (r15 != 0) goto L8f
        L8e:
            r12 = 0
        L8f:
            if (r13 == 0) goto L98
            int r15 = r13.length
            if (r15 == 0) goto L98
            char r15 = r13[r16]
            if (r15 != 0) goto L99
        L98:
            r13 = 0
        L99:
            r0.f2739a = r4
            r0.f2740b = r5
            r0.f2741c = r6
            r0.f2742d = r7
            r4 = r28
            r0.f2743e = r4
            r4 = r29
            r0.f2744f = r4
            r4 = r30
            r0.f2745g = r4
            r4 = r31
            r0.f2746h = r4
            r4 = r32
            r0.f2747i = r4
            r4 = r40
            r0.f2748j = r4
            r0.f2749k = r14
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "-mnc"
            r6 = 32
            if (r19 == 0) goto L11a
            java.lang.String r7 = "-mcc"
            r4.append(r7)
            java.lang.Short r7 = java.lang.Short.valueOf(r19)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r14 = "%03d"
            java.lang.String r7 = java.lang.String.format(r14, r7)
            r4.append(r7)
            r7 = -1
            if (r1 == r7) goto L114
            if (r1 == 0) goto L122
            r4.append(r5)
            r5 = r42
            if (r5 > r6) goto L110
            if (r1 <= 0) goto L100
            r5 = 10
            if (r1 >= r5) goto L100
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r5 = "%02d"
            java.lang.String r1 = java.lang.String.format(r5, r1)
            r4.append(r1)
            goto L122
        L100:
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r1 = java.lang.String.format(r14, r1)
            r4.append(r1)
            goto L122
        L110:
            r4.append(r1)
            goto L122
        L114:
            java.lang.String r1 = "-mnc00"
            r4.append(r1)
            goto L122
        L11a:
            if (r1 == 0) goto L122
            r4.append(r5)
            r4.append(r1)
        L122:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r5 = 45
            r7 = 2
            if (r13 != 0) goto L14d
            if (r12 != 0) goto L14d
            char r14 = r3[r16]
            if (r14 != 0) goto L136
            char r14 = r2[r16]
            if (r14 == 0) goto L14d
        L136:
            int r14 = r3.length
            r15 = 3
            if (r14 == r15) goto L14d
            r1.append(r5)
            r1.append(r2)
            char r2 = r3[r16]
            if (r2 == 0) goto L1ab
            java.lang.String r2 = "-r"
            r1.append(r2)
            r1.append(r3)
            goto L1ab
        L14d:
            char r14 = r2[r16]
            if (r14 != 0) goto L15a
            char r14 = r3[r16]
            if (r14 != 0) goto L15a
            java.lang.String r1 = r1.toString()
            goto L1af
        L15a:
            java.lang.String r14 = "-b+"
            r1.append(r14)
            char r14 = r2[r16]
            if (r14 == 0) goto L166
            r1.append(r2)
        L166:
            r2 = 43
            if (r12 == 0) goto L174
            int r14 = r12.length
            r15 = 4
            if (r14 != r15) goto L174
            r1.append(r2)
            r1.append(r12)
        L174:
            int r12 = r3.length
            if (r12 == r7) goto L17b
            int r12 = r3.length
            r15 = 3
            if (r12 != r15) goto L185
        L17b:
            char r12 = r3[r16]
            if (r12 == 0) goto L185
            r1.append(r2)
            r1.append(r3)
        L185:
            if (r13 == 0) goto L1ab
            int r3 = r13.length
            r12 = 5
            if (r3 < r12) goto L1ab
            r1.append(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = r13.length
            r12 = r16
        L196:
            if (r12 >= r3) goto L1a4
            char r14 = r13[r12]
            char r14 = java.lang.Character.toUpperCase(r14)
            r2.append(r14)
            int r12 = r12 + 1
            goto L196
        L1a4:
            java.lang.String r2 = r2.toString()
            r1.append(r2)
        L1ab:
            java.lang.String r1 = r1.toString()
        L1af:
            r4.append(r1)
            byte r1 = r0.f2744f
            r2 = 1
            if (r1 == r2) goto L1c9
            if (r1 == r7) goto L1c3
            r15 = 3
            if (r1 == r15) goto L1bd
            goto L1ce
        L1bd:
            java.lang.String r1 = "-masculine"
            r4.append(r1)
            goto L1ce
        L1c3:
            java.lang.String r1 = "-feminine"
            r4.append(r1)
            goto L1ce
        L1c9:
            java.lang.String r1 = "-neuter"
            r4.append(r1)
        L1ce:
            r1 = r8 & 192(0xc0, float:2.69E-43)
            r2 = 64
            if (r1 == r2) goto L1df
            r2 = 128(0x80, float:1.8E-43)
            if (r1 == r2) goto L1d9
            goto L1e4
        L1d9:
            java.lang.String r1 = "-ldrtl"
            r4.append(r1)
            goto L1e4
        L1df:
            java.lang.String r1 = "-ldltr"
            r4.append(r1)
        L1e4:
            java.lang.String r1 = "dp"
            if (r9 == 0) goto L1f3
            java.lang.String r2 = "-sw"
            r4.append(r2)
            r4.append(r9)
            r4.append(r1)
        L1f3:
            if (r10 == 0) goto L200
            java.lang.String r2 = "-w"
            r4.append(r2)
            r4.append(r10)
            r4.append(r1)
        L200:
            if (r37 == 0) goto L210
            java.lang.String r2 = "-h"
            r4.append(r2)
            r2 = r37
            r4.append(r2)
            r4.append(r1)
            goto L212
        L210:
            r2 = r37
        L212:
            r1 = r8 & 15
            r3 = 1
            if (r1 == r3) goto L232
            if (r1 == r7) goto L22c
            r15 = 3
            if (r1 == r15) goto L226
            r15 = 4
            if (r1 == r15) goto L220
            goto L237
        L220:
            java.lang.String r1 = "-xlarge"
            r4.append(r1)
            goto L237
        L226:
            java.lang.String r1 = "-large"
            r4.append(r1)
            goto L237
        L22c:
            java.lang.String r1 = "-normal"
            r4.append(r1)
            goto L237
        L232:
            java.lang.String r1 = "-small"
            r4.append(r1)
        L237:
            r1 = r8 & 48
            r3 = 16
            if (r1 == r3) goto L246
            if (r1 == r6) goto L240
            goto L24b
        L240:
            java.lang.String r1 = "-long"
            r4.append(r1)
            goto L24b
        L246:
            java.lang.String r1 = "-notlong"
            r4.append(r1)
        L24b:
            byte r1 = r0.f2748j
            r17 = 3
            r1 = r1 & 3
            r12 = 1
            if (r1 == r12) goto L25d
            if (r1 == r7) goto L257
            goto L262
        L257:
            java.lang.String r1 = "-round"
            r4.append(r1)
            goto L262
        L25d:
            java.lang.String r1 = "-notround"
            r4.append(r1)
        L262:
            r1 = r41 & 12
            r12 = 8
            r15 = 4
            if (r1 == r15) goto L274
            if (r1 == r12) goto L26e
        L26b:
            r17 = 3
            goto L27a
        L26e:
            java.lang.String r13 = "-highdr"
            r4.append(r13)
            goto L26b
        L274:
            java.lang.String r13 = "-lowdr"
            r4.append(r13)
            goto L26b
        L27a:
            r13 = r41 & 3
            r14 = 1
            if (r13 == r14) goto L288
            if (r13 == r7) goto L282
            goto L28d
        L282:
            java.lang.String r15 = "-widecg"
            r4.append(r15)
            goto L28d
        L288:
            java.lang.String r15 = "-nowidecg"
            r4.append(r15)
        L28d:
            byte r15 = r0.f2739a
            if (r15 == r14) goto L2a3
            if (r15 == r7) goto L29d
            r14 = 3
            if (r15 == r14) goto L297
            goto L2a8
        L297:
            java.lang.String r14 = "-square"
            r4.append(r14)
            goto L2a8
        L29d:
            java.lang.String r14 = "-land"
            r4.append(r14)
            goto L2a8
        L2a3:
            java.lang.String r14 = "-port"
            r4.append(r14)
        L2a8:
            r14 = r34 & 15
            switch(r14) {
                case 2: goto L2ea;
                case 3: goto L2e4;
                case 4: goto L2de;
                case 5: goto L2d8;
                case 6: goto L2d2;
                case 7: goto L2cc;
                case 8: goto L2ad;
                case 9: goto L2ad;
                case 10: goto L2ad;
                case 11: goto L2c6;
                case 12: goto L2c0;
                case 13: goto L2ba;
                case 14: goto L2b4;
                case 15: goto L2ae;
                default: goto L2ad;
            }
        L2ad:
            goto L2ef
        L2ae:
            java.lang.String r15 = "-hugeui"
            r4.append(r15)
            goto L2ef
        L2b4:
            java.lang.String r15 = "-largeui"
            r4.append(r15)
            goto L2ef
        L2ba:
            java.lang.String r15 = "-mediumui"
            r4.append(r15)
            goto L2ef
        L2c0:
            java.lang.String r15 = "-smallui"
            r4.append(r15)
            goto L2ef
        L2c6:
            java.lang.String r15 = "-godzillaui"
            r4.append(r15)
            goto L2ef
        L2cc:
            java.lang.String r15 = "-vrheadset"
            r4.append(r15)
            goto L2ef
        L2d2:
            java.lang.String r15 = "-watch"
            r4.append(r15)
            goto L2ef
        L2d8:
            java.lang.String r15 = "-appliance"
            r4.append(r15)
            goto L2ef
        L2de:
            java.lang.String r15 = "-television"
            r4.append(r15)
            goto L2ef
        L2e4:
            java.lang.String r15 = "-car"
            r4.append(r15)
            goto L2ef
        L2ea:
            java.lang.String r15 = "-desk"
            r4.append(r15)
        L2ef:
            r15 = r34 & 48
            if (r15 == r3) goto L2fc
            if (r15 == r6) goto L2f6
            goto L301
        L2f6:
            java.lang.String r3 = "-night"
            r4.append(r3)
            goto L301
        L2fc:
            java.lang.String r3 = "-notnight"
            r4.append(r3)
        L301:
            if (r11 == 0) goto L363
            r3 = 120(0x78, float:1.68E-43)
            if (r11 == r3) goto L35e
            r3 = 160(0xa0, float:2.24E-43)
            if (r11 == r3) goto L358
            r3 = 213(0xd5, float:2.98E-43)
            if (r11 == r3) goto L352
            r3 = 240(0xf0, float:3.36E-43)
            if (r11 == r3) goto L34c
            r3 = 320(0x140, float:4.48E-43)
            if (r11 == r3) goto L346
            r3 = 480(0x1e0, float:6.73E-43)
            if (r11 == r3) goto L340
            r3 = 640(0x280, float:8.97E-43)
            if (r11 == r3) goto L33a
            switch(r11) {
                case 65534: goto L334;
                case 65535: goto L32e;
                default: goto L322;
            }
        L322:
            r4.append(r5)
            r4.append(r11)
            java.lang.String r3 = "dpi"
            r4.append(r3)
            goto L363
        L32e:
            java.lang.String r3 = "-nodpi"
            r4.append(r3)
            goto L363
        L334:
            java.lang.String r3 = "-anydpi"
            r4.append(r3)
            goto L363
        L33a:
            java.lang.String r3 = "-xxxhdpi"
            r4.append(r3)
            goto L363
        L340:
            java.lang.String r3 = "-xxhdpi"
            r4.append(r3)
            goto L363
        L346:
            java.lang.String r3 = "-xhdpi"
            r4.append(r3)
            goto L363
        L34c:
            java.lang.String r3 = "-hdpi"
            r4.append(r3)
            goto L363
        L352:
            java.lang.String r3 = "-tvdpi"
            r4.append(r3)
            goto L363
        L358:
            java.lang.String r3 = "-mdpi"
            r4.append(r3)
            goto L363
        L35e:
            java.lang.String r3 = "-ldpi"
            r4.append(r3)
        L363:
            byte r3 = r0.f2740b
            r5 = 1
            if (r3 == r5) goto L37a
            if (r3 == r7) goto L374
            r15 = 3
            if (r3 == r15) goto L36e
            goto L37f
        L36e:
            java.lang.String r3 = "-finger"
            r4.append(r3)
            goto L37f
        L374:
            java.lang.String r3 = "-stylus"
            r4.append(r3)
            goto L37f
        L37a:
            java.lang.String r3 = "-notouch"
            r4.append(r3)
        L37f:
            byte r3 = r0.f2743e
            r15 = 3
            r3 = r3 & r15
            r5 = 1
            if (r3 == r5) goto L397
            if (r3 == r7) goto L391
            if (r3 == r15) goto L38b
            goto L39c
        L38b:
            java.lang.String r3 = "-keyssoft"
            r4.append(r3)
            goto L39c
        L391:
            java.lang.String r3 = "-keyshidden"
            r4.append(r3)
            goto L39c
        L397:
            java.lang.String r3 = "-keysexposed"
            r4.append(r3)
        L39c:
            byte r3 = r0.f2741c
            r5 = 1
            if (r3 == r5) goto L3b3
            if (r3 == r7) goto L3ad
            r15 = 3
            if (r3 == r15) goto L3a7
            goto L3b8
        L3a7:
            java.lang.String r3 = "-12key"
            r4.append(r3)
            goto L3b8
        L3ad:
            java.lang.String r3 = "-qwerty"
            r4.append(r3)
            goto L3b8
        L3b3:
            java.lang.String r3 = "-nokeys"
            r4.append(r3)
        L3b8:
            byte r3 = r0.f2743e
            r3 = r3 & 12
            r15 = 4
            if (r3 == r15) goto L3c8
            if (r3 == r12) goto L3c2
            goto L3cd
        L3c2:
            java.lang.String r3 = "-navhidden"
            r4.append(r3)
            goto L3cd
        L3c8:
            java.lang.String r3 = "-navexposed"
            r4.append(r3)
        L3cd:
            byte r3 = r0.f2742d
            r5 = 1
            if (r3 == r5) goto L3ef
            if (r3 == r7) goto L3e8
            r15 = 3
            if (r3 == r15) goto L3e1
            r15 = 4
            if (r3 == r15) goto L3db
            goto L3f5
        L3db:
            java.lang.String r3 = "-wheel"
            r4.append(r3)
            goto L3f5
        L3e1:
            r15 = 4
            java.lang.String r3 = "-trackball"
            r4.append(r3)
            goto L3f5
        L3e8:
            r15 = 4
            java.lang.String r3 = "-dpad"
            r4.append(r3)
            goto L3f5
        L3ef:
            r15 = 4
            java.lang.String r3 = "-nonav"
            r4.append(r3)
        L3f5:
            short r3 = r0.f2745g
            if (r3 == 0) goto L42c
            short r5 = r0.f2746h
            if (r5 == 0) goto L42c
            java.lang.String r6 = "-%dx%d"
            if (r3 <= r5) goto L417
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            short r5 = r0.f2746h
            java.lang.Short r5 = java.lang.Short.valueOf(r5)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r5}
            java.lang.String r3 = java.lang.String.format(r6, r3)
            r4.append(r3)
            goto L42c
        L417:
            java.lang.Short r3 = java.lang.Short.valueOf(r5)
            short r5 = r0.f2745g
            java.lang.Short r5 = java.lang.Short.valueOf(r5)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r5}
            java.lang.String r3 = java.lang.String.format(r6, r3)
            r4.append(r3)
        L42c:
            short r3 = r0.f2747i
            if (r3 <= 0) goto L475
            r5 = 7
            if (r14 == r5) goto L467
            if (r13 != 0) goto L467
            if (r1 == 0) goto L438
            goto L467
        L438:
            byte r1 = r0.f2748j
            r17 = 3
            r1 = r1 & 3
            if (r1 == 0) goto L443
            r14 = 23
            goto L469
        L443:
            r1 = 65534(0xfffe, float:9.1833E-41)
            if (r11 != r1) goto L44b
            r14 = 21
            goto L469
        L44b:
            if (r9 != 0) goto L464
            if (r10 != 0) goto L464
            if (r2 == 0) goto L452
            goto L464
        L452:
            r1 = r34 & 63
            if (r1 == 0) goto L458
            r14 = r12
            goto L469
        L458:
            r1 = r8 & 63
            if (r1 != 0) goto L462
            if (r11 == 0) goto L45f
            goto L462
        L45f:
            r14 = r16
            goto L469
        L462:
            r14 = r15
            goto L469
        L464:
            r14 = 13
            goto L469
        L467:
            r14 = 26
        L469:
            if (r3 < r14) goto L475
            java.lang.String r1 = "-v"
            r4.append(r1)
            short r1 = r0.f2747i
            r4.append(r1)
        L475:
            boolean r1 = r0.f2749k
            if (r1 == 0) goto L487
            java.lang.String r1 = "-ERR"
            r4.append(r1)
            int r1 = ef.a.f2738n
            int r2 = r1 + 1
            ef.a.f2738n = r2
            r4.append(r1)
        L487:
            java.lang.String r1 = r4.toString()
            r0.f2750l = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.Class<ef.a> r1 = ef.a.class
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto Ld
            return r0
        Ld:
            ef.a r4 = (ef.a) r4
            java.lang.String r0 = r3.f2750l
            java.lang.String r4 = r4.f2750l
            boolean r4 = r0.equals(r4)
            return r4
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f2750l
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.f2750l
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L9
            return r0
        L9:
            java.lang.String r0 = "[DEFAULT]"
            return r0
    }
}
