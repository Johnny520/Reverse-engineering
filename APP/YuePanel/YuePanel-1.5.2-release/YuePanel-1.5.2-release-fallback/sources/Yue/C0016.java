package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,402:1\n1#2:403\n62#3:404\n62#3:405\n62#3:406\n62#3:407\n62#3:408\n62#3:409\n62#3:410\n62#3:411\n62#3:412\n62#3:413\n62#3:414\n62#3:415\n62#3:416\n62#3:417\n62#3:418\n62#3:419\n62#3:420\n62#3:421\n62#3:422\n62#3:423\n62#3:424\n62#3:425\n62#3:426\n62#3:428\n62#3:429\n62#3:430\n62#3:431\n62#3:432\n62#3:433\n62#3:434\n62#3:435\n62#3:436\n62#3:437\n62#3:438\n62#3:439\n62#3:440\n62#3:441\n62#3:442\n62#3:443\n62#3:444\n62#3:445\n62#3:446\n62#3:447\n62#3:449\n62#3:450\n62#3:451\n62#3:452\n62#3:453\n62#3:454\n62#3:455\n62#3:456\n62#3:457\n62#3:458\n62#3:459\n62#3:460\n62#3:461\n62#3:462\n62#3:463\n62#3:464\n62#3:465\n62#3:466\n62#3:467\n62#3:468\n62#3:469\n62#3:470\n62#3:471\n62#3:472\n62#3:473\n62#3:474\n62#3:475\n89#4:427\n89#4:448\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n*L\n41#1:404\n42#1:405\n46#1:406\n47#1:407\n52#1:408\n62#1:409\n63#1:410\n70#1:411\n74#1:412\n75#1:413\n80#1:414\n87#1:415\n94#1:416\n99#1:417\n107#1:418\n108#1:419\n113#1:420\n122#1:421\n123#1:422\n130#1:423\n136#1:424\n137#1:425\n141#1:426\n142#1:428\n150#1:429\n154#1:430\n159#1:431\n160#1:432\n163#1:433\n166#1:434\n167#1:435\n168#1:436\n174#1:437\n175#1:438\n180#1:439\n187#1:440\n188#1:441\n193#1:442\n201#1:443\n203#1:444\n204#1:445\n206#1:446\n209#1:447\n211#1:449\n219#1:450\n226#1:451\n231#1:452\n236#1:453\n241#1:454\n246#1:455\n251#1:456\n256#1:457\n264#1:458\n275#1:459\n283#1:460\n297#1:461\n304#1:462\n307#1:463\n308#1:464\n319#1:465\n324#1:466\n325#1:467\n338#1:468\n341#1:469\n342#1:470\n354#1:471\n357#1:472\n358#1:473\n383#1:474\n396#1:475\n141#1:427\n209#1:448\n*E\n"})
@Yue.InterfaceC3421(name = "-RealBufferedSource")
public final class C0016 {
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final void m210(@Yue.InterfaceC4418 Yue.C5213 r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r0 = r1.f19562
            if (r0 == 0) goto La
            return
        La:
            r0 = 1
            r1.f19562 = r0
            Yue.ۥۣۢ۟ۦ r0 = r1.f19560
            r0.close()
            Yue.ۥۣ۟ۢۨ r1 = r1.f19561
            r1.m4808()
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final boolean m211(@Yue.InterfaceC4418 Yue.C5213 r6) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r6, r0)
            boolean r0 = r6.f19562
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L26
            Yue.ۥۣ۟ۢۨ r0 = r6.f19561
            boolean r0 = r0.mo4827()
            if (r0 == 0) goto L24
            Yue.ۥۣۢ۟ۦ r0 = r6.f19560
            Yue.ۥۣ۟ۢۨ r6 = r6.f19561
            r2 = 8192(0x2000, double:4.0474E-320)
            long r2 = r0.mo4179(r6, r2)
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L24
            goto L25
        L24:
            r1 = 0
        L25:
            return r1
        L26:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final long m212(@Yue.InterfaceC4418 Yue.C5213 r9, byte r10, long r11, long r13) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r9, r0)
            boolean r0 = r9.f19562
            r0 = r0 ^ 1
            if (r0 == 0) goto L6b
            r0 = 0
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 > 0) goto L48
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 > 0) goto L48
        L15:
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            r7 = -1
            if (r0 >= 0) goto L47
            Yue.ۥۣ۟ۢۨ r1 = r9.f19561
            r2 = r10
            r3 = r11
            r5 = r13
            long r0 = r1.mo4835(r2, r3, r5)
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L29
            return r0
        L29:
            Yue.ۥۣ۟ۢۨ r0 = r9.f19561
            long r0 = r0.m4889()
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 >= 0) goto L47
            Yue.ۥۣۢ۟ۦ r2 = r9.f19560
            Yue.ۥۣ۟ۢۨ r3 = r9.f19561
            r4 = 8192(0x2000, double:4.0474E-320)
            long r2 = r2.mo4179(r3, r4)
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto L42
            goto L47
        L42:
            long r11 = java.lang.Math.max(r11, r0)
            goto L15
        L47:
            return r7
        L48:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "fromIndex="
            r9.append(r10)
            r9.append(r11)
            java.lang.String r10 = " toIndex="
            r9.append(r10)
            r9.append(r13)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L6b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final long m213(@Yue.InterfaceC4418 Yue.C5213 r8, @Yue.InterfaceC4418 Yue.C0879 r9, long r10) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "bytes"
            Yue.C3329.m13906(r9, r0)
            boolean r0 = r8.f19562
            r0 = r0 ^ 1
            if (r0 == 0) goto L40
        L10:
            Yue.ۥۣ۟ۢۨ r0 = r8.f19561
            long r0 = r0.mo4821(r9, r10)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1d
            return r0
        L1d:
            Yue.ۥۣ۟ۢۨ r0 = r8.f19561
            long r0 = r0.m4889()
            Yue.ۥۣۢ۟ۦ r4 = r8.f19560
            Yue.ۥۣ۟ۢۨ r5 = r8.f19561
            r6 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4.mo4179(r5, r6)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L32
            return r2
        L32:
            int r2 = r9.m5095()
            long r2 = (long) r2
            long r0 = r0 - r2
            r2 = 1
            long r0 = r0 + r2
            long r10 = java.lang.Math.max(r10, r0)
            goto L10
        L40:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "closed"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final long m214(@Yue.InterfaceC4418 Yue.C5213 r8, @Yue.InterfaceC4418 Yue.C0879 r9, long r10) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "targetBytes"
            Yue.C3329.m13906(r9, r0)
            boolean r0 = r8.f19562
            r0 = r0 ^ 1
            if (r0 == 0) goto L37
        L10:
            Yue.ۥۣ۟ۢۨ r0 = r8.f19561
            long r0 = r0.mo4828(r9, r10)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1d
            return r0
        L1d:
            Yue.ۥۣ۟ۢۨ r0 = r8.f19561
            long r0 = r0.m4889()
            Yue.ۥۣۢ۟ۦ r4 = r8.f19560
            Yue.ۥۣ۟ۢۨ r5 = r8.f19561
            r6 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4.mo4179(r5, r6)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L32
            return r2
        L32:
            long r10 = java.lang.Math.max(r10, r0)
            goto L10
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "closed"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final Yue.InterfaceC0849 m215(@Yue.InterfaceC4418 Yue.C5213 r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥۡۤ۟ۦ r0 = new Yue.ۥۡۤ۟ۦ
            r0.<init>(r1)
            Yue.ۥۣۣ۟۠ r1 = Yue.C4603.m18380(r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final boolean m216(@Yue.InterfaceC4418 Yue.C5213 r7, long r8, @Yue.InterfaceC4418 Yue.C0879 r10, int r11, int r12) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "bytes"
            Yue.C3329.m13906(r10, r0)
            boolean r0 = r7.f19562
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L46
            r2 = 0
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            r2 = 0
            if (r0 < 0) goto L45
            if (r11 < 0) goto L45
            if (r12 < 0) goto L45
            int r0 = r10.m5095()
            int r0 = r0 - r11
            if (r0 >= r12) goto L23
            goto L45
        L23:
            r0 = r2
        L24:
            if (r0 >= r12) goto L44
            long r3 = (long) r0
            long r3 = r3 + r8
            r5 = 1
            long r5 = r5 + r3
            boolean r5 = r7.mo4856(r5)
            if (r5 != 0) goto L32
            return r2
        L32:
            Yue.ۥۣ۟ۢۨ r5 = r7.f19561
            byte r3 = r5.m4855(r3)
            int r4 = r11 + r0
            byte r4 = r10.m5066(r4)
            if (r3 == r4) goto L41
            return r2
        L41:
            int r0 = r0 + 1
            goto L24
        L44:
            return r1
        L45:
            return r2
        L46:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "closed"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int m217(@Yue.InterfaceC4418 Yue.C5213 r9, @Yue.InterfaceC4418 byte[] r10, int r11, int r12) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r9, r0)
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r10, r0)
            int r0 = r10.length
            long r1 = (long) r0
            long r3 = (long) r11
            long r7 = (long) r12
            r5 = r7
            Yue.C0018.m264(r1, r3, r5)
            Yue.ۥۣ۟ۢۨ r12 = r9.f19561
            long r0 = r12.m4889()
            r2 = 0
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L30
            Yue.ۥۣۢ۟ۦ r12 = r9.f19560
            Yue.ۥۣ۟ۢۨ r0 = r9.f19561
            r1 = 8192(0x2000, double:4.0474E-320)
            long r0 = r12.mo4179(r0, r1)
            r2 = -1
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L30
            r9 = -1
            return r9
        L30:
            Yue.ۥۣ۟ۢۨ r12 = r9.f19561
            long r0 = r12.m4889()
            long r0 = java.lang.Math.min(r7, r0)
            int r12 = (int) r0
            Yue.ۥۣ۟ۢۨ r9 = r9.f19561
            int r9 = r9.read(r10, r11, r12)
            return r9
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final long m218(@Yue.InterfaceC4418 Yue.C5213 r4, @Yue.InterfaceC4418 Yue.C0843 r5, long r6) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r5, r0)
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L4e
            boolean r2 = r4.f19562
            r2 = r2 ^ 1
            if (r2 == 0) goto L42
            Yue.ۥۣ۟ۢۨ r2 = r4.f19561
            long r2 = r2.m4889()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L31
            Yue.ۥۣۢ۟ۦ r0 = r4.f19560
            Yue.ۥۣ۟ۢۨ r1 = r4.f19561
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.mo4179(r1, r2)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L31
            return r2
        L31:
            Yue.ۥۣ۟ۢۨ r0 = r4.f19561
            long r0 = r0.m4889()
            long r6 = java.lang.Math.min(r6, r0)
            Yue.ۥۣ۟ۢۨ r4 = r4.f19561
            long r4 = r4.mo4179(r5, r6)
            return r4
        L42:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "closed"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L4e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "byteCount < 0: "
            r4.append(r5)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final long m219(@Yue.InterfaceC4418 Yue.C5213 r8, @Yue.InterfaceC4418 Yue.InterfaceC5794 r9) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r9, r0)
            r0 = 0
            r2 = r0
        Ld:
            Yue.ۥۣۢ۟ۦ r4 = r8.f19560
            Yue.ۥۣ۟ۢۨ r5 = r8.f19561
            r6 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4.mo4179(r5, r6)
            r6 = -1
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L2e
            Yue.ۥۣ۟ۢۨ r4 = r8.f19561
            long r4 = r4.m4813()
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 <= 0) goto Ld
            long r2 = r2 + r4
            Yue.ۥۣ۟ۢۨ r6 = r8.f19561
            r9.mo4176(r6, r4)
            goto Ld
        L2e:
            Yue.ۥۣ۟ۢۨ r4 = r8.f19561
            long r4 = r4.m4889()
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L48
            Yue.ۥۣ۟ۢۨ r0 = r8.f19561
            long r0 = r0.m4889()
            long r2 = r2 + r0
            Yue.ۥۣ۟ۢۨ r8 = r8.f19561
            long r0 = r8.m4889()
            r9.mo4176(r8, r0)
        L48:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final byte m220(@Yue.InterfaceC4418 Yue.C5213 r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            r0 = 1
            r2.mo4875(r0)
            Yue.ۥۣ۟ۢۨ r2 = r2.f19561
            byte r2 = r2.readByte()
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final byte[] m221(@Yue.InterfaceC4418 Yue.C5213 r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥۣ۟ۢۨ r0 = r2.f19561
            Yue.ۥۣۢ۟ۦ r1 = r2.f19560
            r0.mo4815(r1)
            Yue.ۥۣ۟ۢۨ r2 = r2.f19561
            byte[] r2 = r2.mo4823()
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final byte[] m222(@Yue.InterfaceC4418 Yue.C5213 r1, long r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            r1.mo4875(r2)
            Yue.ۥۣ۟ۢۨ r1 = r1.f19561
            byte[] r1 = r1.mo4866(r2)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final Yue.C0879 m223(@Yue.InterfaceC4418 Yue.C5213 r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥۣ۟ۢۨ r0 = r2.f19561
            Yue.ۥۣۢ۟ۦ r1 = r2.f19560
            r0.mo4815(r1)
            Yue.ۥۣ۟ۢۨ r2 = r2.f19561
            Yue.ۥۣ۟ۥۤ r2 = r2.mo4853()
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final Yue.C0879 m224(@Yue.InterfaceC4418 Yue.C5213 r1, long r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            r1.mo4875(r2)
            Yue.ۥۣ۟ۢۨ r1 = r1.f19561
            Yue.ۥۣ۟ۥۤ r1 = r1.mo4817(r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final long m225(@Yue.InterfaceC4418 Yue.C5213 r10) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r10, r0)
            r0 = 1
            r10.mo4875(r0)
            r2 = 0
            r4 = r2
        Ld:
            long r6 = r4 + r0
            boolean r8 = r10.mo4856(r6)
            if (r8 == 0) goto L5b
            Yue.ۥۣ۟ۢۨ r8 = r10.f19561
            byte r8 = r8.m4855(r4)
            r9 = 48
            if (r8 < r9) goto L23
            r9 = 57
            if (r8 <= r9) goto L2c
        L23:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L2e
            r5 = 45
            if (r8 == r5) goto L2c
            goto L2e
        L2c:
            r4 = r6
            goto Ld
        L2e:
            if (r4 == 0) goto L31
            goto L5b
        L31:
            java.lang.NumberFormatException r10 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected a digit or '-' but was 0x"
            r0.append(r1)
            r1 = 16
            int r1 = Yue.C1096.m5842(r1)
            int r1 = Yue.C1096.m5842(r1)
            java.lang.String r1 = java.lang.Integer.toString(r8, r1)
            java.lang.String r2 = "toString(this, checkRadix(radix))"
            Yue.C3329.m13905(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L5b:
            Yue.ۥۣ۟ۢۨ r10 = r10.f19561
            long r0 = r10.mo4838()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final void m226(@Yue.InterfaceC4418 Yue.C5213 r1, @Yue.InterfaceC4418 Yue.C0843 r2, long r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r2, r0)
            r1.mo4875(r3)     // Catch: java.io.EOFException -> L13
            Yue.ۥۣ۟ۢۨ r1 = r1.f19561
            r1.mo4869(r2, r3)
            return
        L13:
            r3 = move-exception
            Yue.ۥۣ۟ۢۨ r1 = r1.f19561
            r2.mo4815(r1)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final void m227(@Yue.InterfaceC4418 Yue.C5213 r6, @Yue.InterfaceC4418 byte[] r7) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r6, r0)
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r7, r0)
            int r0 = r7.length     // Catch: java.io.EOFException -> L15
            long r0 = (long) r0     // Catch: java.io.EOFException -> L15
            r6.mo4875(r0)     // Catch: java.io.EOFException -> L15
            Yue.ۥۣ۟ۢۨ r6 = r6.f19561
            r6.readFully(r7)
            return
        L15:
            r0 = move-exception
            r1 = 0
        L17:
            Yue.ۥۣ۟ۢۨ r2 = r6.f19561
            long r2 = r2.m4889()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L39
            Yue.ۥۣ۟ۢۨ r2 = r6.f19561
            long r3 = r2.m4889()
            int r3 = (int) r3
            int r2 = r2.read(r7, r1, r3)
            r3 = -1
            if (r2 == r3) goto L33
            int r1 = r1 + r2
            goto L17
        L33:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            throw r6
        L39:
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final long m228(@Yue.InterfaceC4418 Yue.C5213 r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r5, r0)
            r0 = 1
            r5.mo4875(r0)
            r0 = 0
        Lb:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.mo4856(r2)
            if (r2 == 0) goto L63
            Yue.ۥۣ۟ۢۨ r2 = r5.f19561
            long r3 = (long) r0
            byte r2 = r2.m4855(r3)
            r3 = 48
            if (r2 < r3) goto L23
            r3 = 57
            if (r2 <= r3) goto L34
        L23:
            r3 = 97
            if (r2 < r3) goto L2b
            r3 = 102(0x66, float:1.43E-43)
            if (r2 <= r3) goto L34
        L2b:
            r3 = 65
            if (r2 < r3) goto L36
            r3 = 70
            if (r2 <= r3) goto L34
            goto L36
        L34:
            r0 = r1
            goto Lb
        L36:
            if (r0 == 0) goto L39
            goto L63
        L39:
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.append(r1)
            r1 = 16
            int r1 = Yue.C1096.m5842(r1)
            int r1 = Yue.C1096.m5842(r1)
            java.lang.String r1 = java.lang.Integer.toString(r2, r1)
            java.lang.String r2 = "toString(this, checkRadix(radix))"
            Yue.C3329.m13905(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L63:
            Yue.ۥۣ۟ۢۨ r5 = r5.f19561
            long r0 = r5.mo4879()
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int m229(@Yue.InterfaceC4418 Yue.C5213 r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            r0 = 4
            r2.mo4875(r0)
            Yue.ۥۣ۟ۢۨ r2 = r2.f19561
            int r2 = r2.readInt()
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int m230(@Yue.InterfaceC4418 Yue.C5213 r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            r0 = 4
            r2.mo4875(r0)
            Yue.ۥۣ۟ۢۨ r2 = r2.f19561
            int r2 = r2.mo4862()
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final long m231(@Yue.InterfaceC4418 Yue.C5213 r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            r0 = 8
            r2.mo4875(r0)
            Yue.ۥۣ۟ۢۨ r2 = r2.f19561
            long r0 = r2.readLong()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final long m232(@Yue.InterfaceC4418 Yue.C5213 r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            r0 = 8
            r2.mo4875(r0)
            Yue.ۥۣ۟ۢۨ r2 = r2.f19561
            long r0 = r2.mo4872()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final short m233(@Yue.InterfaceC4418 Yue.C5213 r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            r0 = 2
            r2.mo4875(r0)
            Yue.ۥۣ۟ۢۨ r2 = r2.f19561
            short r2 = r2.readShort()
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final short m234(@Yue.InterfaceC4418 Yue.C5213 r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            r0 = 2
            r2.mo4875(r0)
            Yue.ۥۣ۟ۢۨ r2 = r2.f19561
            short r2 = r2.mo4871()
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.String m235(@Yue.InterfaceC4418 Yue.C5213 r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥۣ۟ۢۨ r0 = r2.f19561
            Yue.ۥۣۢ۟ۦ r1 = r2.f19560
            r0.mo4815(r1)
            Yue.ۥۣ۟ۢۨ r2 = r2.f19561
            java.lang.String r2 = r2.mo4867()
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final java.lang.String m236(@Yue.InterfaceC4418 Yue.C5213 r1, long r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            r1.mo4875(r2)
            Yue.ۥۣ۟ۢۨ r1 = r1.f19561
            java.lang.String r1 = r1.mo4814(r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int m237(@Yue.InterfaceC4418 Yue.C5213 r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            r0 = 1
            r3.mo4875(r0)
            Yue.ۥۣ۟ۢۨ r0 = r3.f19561
            r1 = 0
            byte r0 = r0.m4855(r1)
            r1 = r0 & 224(0xe0, float:3.14E-43)
            r2 = 192(0xc0, float:2.69E-43)
            if (r1 != r2) goto L1e
            r0 = 2
            r3.mo4875(r0)
            goto L35
        L1e:
            r1 = r0 & 240(0xf0, float:3.36E-43)
            r2 = 224(0xe0, float:3.14E-43)
            if (r1 != r2) goto L2a
            r0 = 3
            r3.mo4875(r0)
            goto L35
        L2a:
            r0 = r0 & 248(0xf8, float:3.48E-43)
            r1 = 240(0xf0, float:3.36E-43)
            if (r0 != r1) goto L35
            r0 = 4
            r3.mo4875(r0)
        L35:
            Yue.ۥۣ۟ۢۨ r3 = r3.f19561
            int r3 = r3.mo4849()
            return r3
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final java.lang.String m238(@Yue.InterfaceC4418 Yue.C5213 r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            r0 = 10
            long r0 = r4.mo4878(r0)
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L2a
            Yue.ۥۣ۟ۢۨ r0 = r4.f19561
            long r0 = r0.m4889()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L28
            Yue.ۥۣ۟ۢۨ r0 = r4.f19561
            long r0 = r0.m4889()
            java.lang.String r4 = r4.mo4814(r0)
            goto L30
        L28:
            r4 = 0
            goto L30
        L2a:
            Yue.ۥۣ۟ۢۨ r4 = r4.f19561
            java.lang.String r4 = Yue.C0001.m68(r4, r0)
        L30:
            return r4
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final java.lang.String m239(@Yue.InterfaceC4418 Yue.C5213 r13, long r14) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r13, r0)
            r0 = 0
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 < 0) goto Lad
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            r3 = 1
            if (r2 != 0) goto L18
            r5 = r0
            goto L1a
        L18:
            long r5 = r14 + r3
        L1a:
            r8 = 10
            r9 = 0
            r7 = r13
            r11 = r5
            long r7 = r7.mo4835(r8, r9, r11)
            r9 = -1
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 == 0) goto L31
            Yue.ۥۣ۟ۢۨ r13 = r13.f19561
            java.lang.String r13 = Yue.C0001.m68(r13, r7)
            return r13
        L31:
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L5f
            boolean r0 = r13.mo4856(r5)
            if (r0 == 0) goto L5f
            Yue.ۥۣ۟ۢۨ r0 = r13.f19561
            long r1 = r5 - r3
            byte r0 = r0.m4855(r1)
            r1 = 13
            if (r0 != r1) goto L5f
            long r3 = r3 + r5
            boolean r0 = r13.mo4856(r3)
            if (r0 == 0) goto L5f
            Yue.ۥۣ۟ۢۨ r0 = r13.f19561
            byte r0 = r0.m4855(r5)
            r1 = 10
            if (r0 != r1) goto L5f
            Yue.ۥۣ۟ۢۨ r13 = r13.f19561
            java.lang.String r13 = Yue.C0001.m68(r13, r5)
            return r13
        L5f:
            Yue.ۥۣ۟ۢۨ r6 = new Yue.ۥۣ۟ۢۨ
            r6.<init>()
            Yue.ۥۣ۟ۢۨ r0 = r13.f19561
            long r1 = r0.m4889()
            r3 = 32
            long r3 = (long) r3
            long r4 = java.lang.Math.min(r3, r1)
            r2 = 0
            r1 = r6
            r0.m4825(r1, r2, r4)
            java.io.EOFException r0 = new java.io.EOFException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "\\n not found: limit="
            r1.append(r2)
            Yue.ۥۣ۟ۢۨ r13 = r13.f19561
            long r2 = r13.m4889()
            long r13 = java.lang.Math.min(r2, r14)
            r1.append(r13)
            java.lang.String r13 = " content="
            r1.append(r13)
            Yue.ۥۣ۟ۥۤ r13 = r6.mo4853()
            java.lang.String r13 = r13.mo5071()
            r1.append(r13)
            r13 = 8230(0x2026, float:1.1533E-41)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13)
            throw r0
        Lad:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "limit < 0: "
            r13.append(r0)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r13.toString()
            r14.<init>(r13)
            throw r14
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final boolean m240(@Yue.InterfaceC4418 Yue.C5213 r6, long r7) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r6, r0)
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L3a
            boolean r0 = r6.f19562
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L2e
        L11:
            Yue.ۥۣ۟ۢۨ r0 = r6.f19561
            long r2 = r0.m4889()
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 >= 0) goto L2d
            Yue.ۥۣۢ۟ۦ r0 = r6.f19560
            Yue.ۥۣ۟ۢۨ r2 = r6.f19561
            r3 = 8192(0x2000, double:4.0474E-320)
            long r2 = r0.mo4179(r2, r3)
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L11
            r6 = 0
            return r6
        L2d:
            return r1
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "closed"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L3a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r6.append(r0)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final void m241(@Yue.InterfaceC4418 Yue.C5213 r1, long r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r1 = r1.mo4856(r2)
            if (r1 == 0) goto Lc
            return
        Lc:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int m242(@Yue.InterfaceC4418 Yue.C5213 r8, @Yue.InterfaceC4418 Yue.C4650 r9) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "options"
            Yue.C3329.m13906(r9, r0)
            boolean r0 = r8.f19562
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L3f
        L10:
            Yue.ۥۣ۟ۢۨ r0 = r8.f19561
            int r0 = Yue.C0001.m70(r0, r9, r1)
            r2 = -2
            r3 = -1
            if (r0 == r2) goto L2e
            if (r0 == r3) goto L2d
            Yue.ۥۣ۟ۥۤ[] r9 = r9.m18479()
            r9 = r9[r0]
            int r9 = r9.m5095()
            Yue.ۥۣ۟ۢۨ r8 = r8.f19561
            long r1 = (long) r9
            r8.skip(r1)
            return r0
        L2d:
            return r3
        L2e:
            Yue.ۥۣۢ۟ۦ r0 = r8.f19560
            Yue.ۥۣ۟ۢۨ r2 = r8.f19561
            r4 = 8192(0x2000, double:4.0474E-320)
            long r4 = r0.mo4179(r2, r4)
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L10
            return r3
        L3f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "closed"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final void m243(@Yue.InterfaceC4418 Yue.C5213 r4, long r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            boolean r0 = r4.f19562
            r0 = r0 ^ 1
            if (r0 == 0) goto L44
        Lb:
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L43
            Yue.ۥۣ۟ۢۨ r2 = r4.f19561
            long r2 = r2.m4889()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L32
            Yue.ۥۣۢ۟ۦ r0 = r4.f19560
            Yue.ۥۣ۟ۢۨ r1 = r4.f19561
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.mo4179(r1, r2)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L2c
            goto L32
        L2c:
            java.io.EOFException r4 = new java.io.EOFException
            r4.<init>()
            throw r4
        L32:
            Yue.ۥۣ۟ۢۨ r0 = r4.f19561
            long r0 = r0.m4889()
            long r0 = java.lang.Math.min(r5, r0)
            Yue.ۥۣ۟ۢۨ r2 = r4.f19561
            r2.skip(r0)
            long r5 = r5 - r0
            goto Lb
        L43:
            return
        L44:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "closed"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final Yue.C6250 m244(@Yue.InterfaceC4418 Yue.C5213 r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥۣۢ۟ۦ r1 = r1.f19560
            Yue.ۥۢۡۤۧ r1 = r1.mo4177()
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final java.lang.String m245(@Yue.InterfaceC4418 Yue.C5213 r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "buffer("
            r0.append(r1)
            Yue.ۥۣۢ۟ۦ r2 = r2.f19560
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
