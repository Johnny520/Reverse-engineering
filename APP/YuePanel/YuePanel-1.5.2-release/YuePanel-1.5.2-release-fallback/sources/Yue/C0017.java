package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n63#1,12:252\n85#1,14:264\n85#1,14:278\n85#1,14:292\n85#1,14:306\n63#1,12:320\n1#2:251\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n*L\n147#1:252,12\n160#1:264,14\n182#1:278,14\n202#1:292,14\n219#1:306,14\n239#1:320,12\n*E\n"})
@Yue.InterfaceC3421(name = "-SegmentedByteString")
public final class C0017 {
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int m246(@Yue.InterfaceC4418 int[] r2, int r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            int r5 = r5 + (-1)
        L7:
            if (r4 > r5) goto L1a
            int r0 = r4 + r5
            int r0 = r0 >>> 1
            r1 = r2[r0]
            if (r1 >= r3) goto L14
            int r4 = r0 + 1
            goto L7
        L14:
            if (r1 <= r3) goto L19
            int r5 = r0 + (-1)
            goto L7
        L19:
            return r0
        L1a:
            int r2 = -r4
            int r2 = r2 + (-1)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final void m247(@Yue.InterfaceC4418 Yue.C5551 r11, int r12, @Yue.InterfaceC4418 byte[] r13, int r14, int r15) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r11, r0)
            java.lang.String r0 = "target"
            Yue.C3329.m13906(r13, r0)
            int r0 = r11.m5095()
            long r1 = (long) r0
            long r3 = (long) r12
            long r9 = (long) r15
            r5 = r9
            Yue.C0018.m264(r1, r3, r5)
            int r0 = r13.length
            long r5 = (long) r0
            long r7 = (long) r14
            Yue.C0018.m264(r5, r7, r9)
            int r15 = r15 + r12
            int r0 = m259(r11, r12)
        L20:
            if (r12 >= r15) goto L5a
            if (r0 != 0) goto L26
            r1 = 0
            goto L2e
        L26:
            int[] r1 = r11.m20830()
            int r2 = r0 + (-1)
            r1 = r1[r2]
        L2e:
            int[] r2 = r11.m20830()
            r2 = r2[r0]
            int r2 = r2 - r1
            int[] r3 = r11.m20830()
            byte[][] r4 = r11.m20831()
            int r4 = r4.length
            int r4 = r4 + r0
            r3 = r3[r4]
            int r2 = r2 + r1
            int r2 = java.lang.Math.min(r15, r2)
            int r2 = r2 - r12
            int r1 = r12 - r1
            int r3 = r3 + r1
            byte[][] r1 = r11.m20831()
            r1 = r1[r0]
            int r4 = r3 + r2
            Yue.C0586.m2170(r1, r13, r14, r3, r4)
            int r14 = r14 + r2
            int r12 = r12 + r2
            int r0 = r0 + 1
            goto L20
        L5a:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final boolean m248(@Yue.InterfaceC4418 Yue.C5551 r4, @Yue.InterfaceC4543 java.lang.Object r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            r0 = 1
            if (r5 != r4) goto L9
            goto L26
        L9:
            boolean r1 = r5 instanceof Yue.C0879
            r2 = 0
            if (r1 == 0) goto L25
            Yue.ۥۣ۟ۥۤ r5 = (Yue.C0879) r5
            int r1 = r5.m5095()
            int r3 = r4.m5095()
            if (r1 != r3) goto L25
            int r1 = r4.m5095()
            boolean r4 = r4.mo5087(r2, r5, r2, r1)
            if (r4 == 0) goto L25
            goto L26
        L25:
            r0 = r2
        L26:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int m249(@Yue.InterfaceC4418 Yue.C5551 r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            int[] r0 = r1.m20830()
            byte[][] r1 = r1.m20831()
            int r1 = r1.length
            int r1 = r1 + (-1)
            r1 = r0[r1]
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int m250(@Yue.InterfaceC4418 Yue.C5551 r8) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r8, r0)
            int r0 = r8.m5068()
            if (r0 == 0) goto Lc
            return r0
        Lc:
            byte[][] r0 = r8.m20831()
            int r0 = r0.length
            r1 = 0
            r2 = 1
            r3 = r2
            r2 = r1
        L15:
            if (r1 >= r0) goto L3c
            int[] r4 = r8.m20830()
            int r5 = r0 + r1
            r4 = r4[r5]
            int[] r5 = r8.m20830()
            r5 = r5[r1]
            byte[][] r6 = r8.m20831()
            r6 = r6[r1]
            int r2 = r5 - r2
            int r2 = r2 + r4
        L2e:
            if (r4 >= r2) goto L38
            int r3 = r3 * 31
            r7 = r6[r4]
            int r3 = r3 + r7
            int r4 = r4 + 1
            goto L2e
        L38:
            int r1 = r1 + 1
            r2 = r5
            goto L15
        L3c:
            r8.m5090(r3)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final byte m251(@Yue.InterfaceC4418 Yue.C5551 r7, int r8) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            int[] r0 = r7.m20830()
            byte[][] r1 = r7.m20831()
            int r1 = r1.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            long r1 = (long) r0
            long r3 = (long) r8
            r5 = 1
            Yue.C0018.m264(r1, r3, r5)
            int r0 = m259(r7, r8)
            if (r0 != 0) goto L21
            r1 = 0
            goto L29
        L21:
            int[] r1 = r7.m20830()
            int r2 = r0 + (-1)
            r1 = r1[r2]
        L29:
            int[] r2 = r7.m20830()
            byte[][] r3 = r7.m20831()
            int r3 = r3.length
            int r3 = r3 + r0
            r2 = r2[r3]
            byte[][] r7 = r7.m20831()
            r7 = r7[r0]
            int r8 = r8 - r1
            int r8 = r8 + r2
            r7 = r7[r8]
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final boolean m252(@Yue.InterfaceC4418 Yue.C5551 r6, int r7, @Yue.InterfaceC4418 Yue.C0879 r8, int r9, int r10) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r6, r0)
            java.lang.String r0 = "other"
            Yue.C3329.m13906(r8, r0)
            r0 = 0
            if (r7 < 0) goto L58
            int r1 = r6.m5095()
            int r1 = r1 - r10
            if (r7 <= r1) goto L15
            goto L58
        L15:
            int r10 = r10 + r7
            int r1 = m259(r6, r7)
        L1a:
            if (r7 >= r10) goto L56
            if (r1 != 0) goto L20
            r2 = r0
            goto L28
        L20:
            int[] r2 = r6.m20830()
            int r3 = r1 + (-1)
            r2 = r2[r3]
        L28:
            int[] r3 = r6.m20830()
            r3 = r3[r1]
            int r3 = r3 - r2
            int[] r4 = r6.m20830()
            byte[][] r5 = r6.m20831()
            int r5 = r5.length
            int r5 = r5 + r1
            r4 = r4[r5]
            int r3 = r3 + r2
            int r3 = java.lang.Math.min(r10, r3)
            int r3 = r3 - r7
            int r2 = r7 - r2
            int r4 = r4 + r2
            byte[][] r2 = r6.m20831()
            r2 = r2[r1]
            boolean r2 = r8.mo5088(r9, r2, r4, r3)
            if (r2 != 0) goto L51
            return r0
        L51:
            int r9 = r9 + r3
            int r7 = r7 + r3
            int r1 = r1 + 1
            goto L1a
        L56:
            r6 = 1
            return r6
        L58:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final boolean m253(@Yue.InterfaceC4418 Yue.C5551 r6, int r7, @Yue.InterfaceC4418 byte[] r8, int r9, int r10) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r6, r0)
            java.lang.String r0 = "other"
            Yue.C3329.m13906(r8, r0)
            r0 = 0
            if (r7 < 0) goto L5e
            int r1 = r6.m5095()
            int r1 = r1 - r10
            if (r7 > r1) goto L5e
            if (r9 < 0) goto L5e
            int r1 = r8.length
            int r1 = r1 - r10
            if (r9 <= r1) goto L1b
            goto L5e
        L1b:
            int r10 = r10 + r7
            int r1 = m259(r6, r7)
        L20:
            if (r7 >= r10) goto L5c
            if (r1 != 0) goto L26
            r2 = r0
            goto L2e
        L26:
            int[] r2 = r6.m20830()
            int r3 = r1 + (-1)
            r2 = r2[r3]
        L2e:
            int[] r3 = r6.m20830()
            r3 = r3[r1]
            int r3 = r3 - r2
            int[] r4 = r6.m20830()
            byte[][] r5 = r6.m20831()
            int r5 = r5.length
            int r5 = r5 + r1
            r4 = r4[r5]
            int r3 = r3 + r2
            int r3 = java.lang.Math.min(r10, r3)
            int r3 = r3 - r7
            int r2 = r7 - r2
            int r4 = r4 + r2
            byte[][] r2 = r6.m20831()
            r2 = r2[r1]
            boolean r2 = Yue.C0018.m263(r2, r4, r8, r9, r3)
            if (r2 != 0) goto L57
            return r0
        L57:
            int r9 = r9 + r3
            int r7 = r7 + r3
            int r1 = r1 + 1
            goto L20
        L5c:
            r6 = 1
            return r6
        L5e:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final Yue.C0879 m254(@Yue.InterfaceC4418 Yue.C5551 r10, int r11, int r12) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r10, r0)
            int r12 = Yue.C0018.m271(r10, r12)
            if (r11 < 0) goto Lcd
            int r0 = r10.m5095()
            java.lang.String r1 = "endIndex="
            if (r12 > r0) goto La3
            int r0 = r12 - r11
            if (r0 < 0) goto L82
            if (r11 != 0) goto L20
            int r1 = r10.m5095()
            if (r12 != r1) goto L20
            return r10
        L20:
            if (r11 != r12) goto L25
            Yue.ۥۣ۟ۥۤ r10 = Yue.C0879.f2558
            return r10
        L25:
            int r1 = m259(r10, r11)
            int r12 = r12 + (-1)
            int r12 = m259(r10, r12)
            byte[][] r2 = r10.m20831()
            int r3 = r12 + 1
            java.lang.Object[] r2 = Yue.C0586.m2212(r2, r1, r3)
            byte[][] r2 = (byte[][]) r2
            int r3 = r2.length
            int r3 = r3 * 2
            int[] r3 = new int[r3]
            r4 = 0
            if (r1 > r12) goto L6a
            r6 = r1
            r5 = r4
        L45:
            int[] r7 = r10.m20830()
            r7 = r7[r6]
            int r7 = r7 - r11
            int r7 = java.lang.Math.min(r7, r0)
            r3[r5] = r7
            int r7 = r5 + 1
            int r8 = r2.length
            int r5 = r5 + r8
            int[] r8 = r10.m20830()
            byte[][] r9 = r10.m20831()
            int r9 = r9.length
            int r9 = r9 + r6
            r8 = r8[r9]
            r3[r5] = r8
            if (r6 == r12) goto L6a
            int r6 = r6 + 1
            r5 = r7
            goto L45
        L6a:
            if (r1 != 0) goto L6d
            goto L75
        L6d:
            int[] r10 = r10.m20830()
            int r1 = r1 + (-1)
            r4 = r10[r1]
        L75:
            int r10 = r2.length
            r12 = r3[r10]
            int r11 = r11 - r4
            int r12 = r12 + r11
            r3[r10] = r12
            Yue.ۥۡۧۨۢ r10 = new Yue.ۥۡۧۨۢ
            r10.<init>(r2, r3)
            return r10
        L82:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            r10.append(r12)
            java.lang.String r12 = " < beginIndex="
            r10.append(r12)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        La3:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r11.append(r12)
            java.lang.String r12 = " > length("
            r11.append(r12)
            int r10 = r10.m5095()
            r11.append(r10)
            r10 = 41
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        Lcd:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "beginIndex="
            r10.append(r12)
            r10.append(r11)
            java.lang.String r11 = " < 0"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final byte[] m255(@Yue.InterfaceC4418 Yue.C5551 r9) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r9, r0)
            int r0 = r9.m5095()
            byte[] r0 = new byte[r0]
            byte[][] r1 = r9.m20831()
            int r1 = r1.length
            r2 = 0
            r3 = r2
            r4 = r3
        L13:
            if (r2 >= r1) goto L35
            int[] r5 = r9.m20830()
            int r6 = r1 + r2
            r5 = r5[r6]
            int[] r6 = r9.m20830()
            r6 = r6[r2]
            byte[][] r7 = r9.m20831()
            r7 = r7[r2]
            int r3 = r6 - r3
            int r8 = r5 + r3
            Yue.C0586.m2170(r7, r0, r4, r5, r8)
            int r4 = r4 + r3
            int r2 = r2 + 1
            r3 = r6
            goto L13
        L35:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final void m256(@Yue.InterfaceC4418 Yue.C5551 r11, @Yue.InterfaceC4418 Yue.C0843 r12, int r13, int r14) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r11, r0)
            java.lang.String r0 = "buffer"
            Yue.C3329.m13906(r12, r0)
            int r0 = r13 + r14
            int r1 = m259(r11, r13)
        L10:
            if (r13 >= r0) goto L65
            if (r1 != 0) goto L16
            r2 = 0
            goto L1e
        L16:
            int[] r2 = r11.m20830()
            int r3 = r1 + (-1)
            r2 = r2[r3]
        L1e:
            int[] r3 = r11.m20830()
            r3 = r3[r1]
            int r3 = r3 - r2
            int[] r4 = r11.m20830()
            byte[][] r5 = r11.m20831()
            int r5 = r5.length
            int r5 = r5 + r1
            r4 = r4[r5]
            int r3 = r3 + r2
            int r3 = java.lang.Math.min(r0, r3)
            int r3 = r3 - r13
            int r2 = r13 - r2
            int r7 = r4 + r2
            byte[][] r2 = r11.m20831()
            r6 = r2[r1]
            Yue.ۥۡۧۨ r2 = new Yue.ۥۡۧۨ
            int r8 = r7 + r3
            r9 = 1
            r10 = 0
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            Yue.ۥۡۧۨ r4 = r12.f2378
            if (r4 != 0) goto L56
            r2.f20496 = r2
            r2.f20495 = r2
            r12.f2378 = r2
            goto L61
        L56:
            Yue.C3329.m13903(r4)
            Yue.ۥۡۧۨ r4 = r4.f20496
            Yue.C3329.m13903(r4)
            r4.m20805(r2)
        L61:
            int r13 = r13 + r3
            int r1 = r1 + 1
            goto L10
        L65:
            long r0 = r12.m4889()
            long r13 = (long) r14
            long r0 = r0 + r13
            r12.m4885(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final void m257(Yue.C5551 r5, int r6, int r7, Yue.InterfaceC2841<? super byte[], ? super java.lang.Integer, ? super java.lang.Integer, Yue.C6593> r8) {
            int r0 = m259(r5, r6)
        L4:
            if (r6 >= r7) goto L43
            if (r0 != 0) goto La
            r1 = 0
            goto L12
        La:
            int[] r1 = r5.m20830()
            int r2 = r0 + (-1)
            r1 = r1[r2]
        L12:
            int[] r2 = r5.m20830()
            r2 = r2[r0]
            int r2 = r2 - r1
            int[] r3 = r5.m20830()
            byte[][] r4 = r5.m20831()
            int r4 = r4.length
            int r4 = r4 + r0
            r3 = r3[r4]
            int r2 = r2 + r1
            int r2 = java.lang.Math.min(r7, r2)
            int r2 = r2 - r6
            int r1 = r6 - r1
            int r3 = r3 + r1
            byte[][] r1 = r5.m20831()
            r1 = r1[r0]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r8.mo11720(r1, r3, r4)
            int r6 = r6 + r2
            int r0 = r0 + 1
            goto L4
        L43:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final void m258(@Yue.InterfaceC4418 Yue.C5551 r6, @Yue.InterfaceC4418 Yue.InterfaceC2841<? super byte[], ? super java.lang.Integer, ? super java.lang.Integer, Yue.C6593> r7) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r6, r0)
            java.lang.String r0 = "action"
            Yue.C3329.m13906(r7, r0)
            byte[][] r0 = r6.m20831()
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L11:
            if (r1 >= r0) goto L38
            int[] r3 = r6.m20830()
            int r4 = r0 + r1
            r3 = r3[r4]
            int[] r4 = r6.m20830()
            r4 = r4[r1]
            byte[][] r5 = r6.m20831()
            r5 = r5[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r2 = r4 - r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7.mo11720(r5, r3, r2)
            int r1 = r1 + 1
            r2 = r4
            goto L11
        L38:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int m259(@Yue.InterfaceC4418 Yue.C5551 r2, int r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            int[] r0 = r2.m20830()
            int r3 = r3 + 1
            byte[][] r2 = r2.m20831()
            int r2 = r2.length
            r1 = 0
            int r2 = m246(r0, r3, r1, r2)
            if (r2 < 0) goto L18
            goto L19
        L18:
            int r2 = ~r2
        L19:
            return r2
    }
}
