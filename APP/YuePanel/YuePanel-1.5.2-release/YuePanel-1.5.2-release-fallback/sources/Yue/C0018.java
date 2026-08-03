package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,187:1\n68#1:188\n74#1:189\n*S KotlinDebug\n*F\n+ 1 Util.kt\nokio/-SegmentedByteString\n*L\n106#1:188\n107#1:189\n*E\n"})
@Yue.InterfaceC3421(name = "-SegmentedByteString")
public final class C0018 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C0843.C0844 f44 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f45 = 0;

    static {
            Yue.ۥۣ۟ۢۨ$ۥ r0 = new Yue.ۥۣ۟ۢۨ$ۥ
            r0.<init>()
            Yue.C0018.f44 = r0
            r0 = -1234567890(0xffffffffb669fd2e, float:-3.4867076E-6)
            Yue.C0018.f45 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int m260(byte r0, int r1) {
            r0 = r0 & r1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final long m261(byte r2, long r3) {
            long r0 = (long) r2
            long r2 = r0 & r3
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final long m262(int r2, long r3) {
            long r0 = (long) r2
            long r2 = r0 & r3
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final boolean m263(@Yue.InterfaceC4418 byte[] r4, int r5, @Yue.InterfaceC4418 byte[] r6, int r7, int r8) {
            java.lang.String r0 = "a"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "b"
            Yue.C3329.m13906(r6, r0)
            r0 = 0
            r1 = r0
        Lc:
            if (r1 >= r8) goto L1c
            int r2 = r1 + r5
            r2 = r4[r2]
            int r3 = r1 + r7
            r3 = r6[r3]
            if (r2 == r3) goto L19
            return r0
        L19:
            int r1 = r1 + 1
            goto Lc
        L1c:
            r4 = 1
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final void m264(long r4, long r6, long r8) {
            long r0 = r6 | r8
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L13
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 > 0) goto L13
            long r0 = r4 - r6
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 < 0) goto L13
            return
        L13:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "size="
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " offset="
            r1.append(r4)
            r1.append(r6)
            java.lang.String r4 = " byteCount="
            r1.append(r4)
            r1.append(r8)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int m265() {
            int r0 = Yue.C0018.f45
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final Yue.C0843.C0844 m266() {
            Yue.ۥۣ۟ۢۨ$ۥ r0 = Yue.C0018.f44
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m267() {
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int m268(int r1, int r2) {
            int r0 = r1 << r2
            int r2 = 32 - r2
            int r1 = r1 >>> r2
            r1 = r1 | r0
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final long m269(int r2, long r3) {
            long r0 = (long) r2
            long r2 = java.lang.Math.min(r0, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final long m270(long r2, int r4) {
            long r0 = (long) r4
            long r2 = java.lang.Math.min(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int m271(@Yue.InterfaceC4418 Yue.C0879 r1, int r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            int r0 = Yue.C0018.f45
            if (r2 != r0) goto Le
            int r1 = r1.m5095()
            return r1
        Le:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int m272(@Yue.InterfaceC4418 byte[] r1, int r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            int r0 = Yue.C0018.f45
            if (r2 != r0) goto Lb
            int r1 = r1.length
            return r1
        Lb:
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final Yue.C0843.C0844 m273(@Yue.InterfaceC4418 Yue.C0843.C0844 r1) {
            java.lang.String r0 = "unsafeCursor"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥۣ۟ۢۨ$ۥ r0 = Yue.C0018.f44
            if (r1 != r0) goto Le
            Yue.ۥۣ۟ۢۨ$ۥ r1 = new Yue.ۥۣ۟ۢۨ$ۥ
            r1.<init>()
        Le:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int m274(int r2) {
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r2
            int r0 = r0 >>> 24
            r1 = 16711680(0xff0000, float:2.3418052E-38)
            r1 = r1 & r2
            int r1 = r1 >>> 8
            r0 = r0 | r1
            r1 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r2
            int r1 = r1 << 8
            r0 = r0 | r1
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r2 = r2 | r0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final long m275(long r8) {
            r0 = -72057594037927936(0xff00000000000000, double:-5.486124068793689E303)
            long r0 = r0 & r8
            r2 = 56
            long r0 = r0 >>> r2
            r3 = 71776119061217280(0xff000000000000, double:7.06327445644526E-304)
            long r3 = r3 & r8
            r5 = 40
            long r3 = r3 >>> r5
            long r0 = r0 | r3
            r3 = 280375465082880(0xff0000000000, double:1.38523885234213E-309)
            long r3 = r3 & r8
            r6 = 24
            long r3 = r3 >>> r6
            long r0 = r0 | r3
            r3 = 1095216660480(0xff00000000, double:5.41108926696E-312)
            long r3 = r3 & r8
            r7 = 8
            long r3 = r3 >>> r7
            long r0 = r0 | r3
            r3 = 4278190080(0xff000000, double:2.113706745E-314)
            long r3 = r3 & r8
            long r3 = r3 << r7
            long r0 = r0 | r3
            r3 = 16711680(0xff0000, double:8.256667E-317)
            long r3 = r3 & r8
            long r3 = r3 << r6
            long r0 = r0 | r3
            r3 = 65280(0xff00, double:3.22526E-319)
            long r3 = r3 & r8
            long r3 = r3 << r5
            long r0 = r0 | r3
            r3 = 255(0xff, double:1.26E-321)
            long r8 = r8 & r3
            long r8 = r8 << r2
            long r8 = r8 | r0
            return r8
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final short m276(short r1) {
            r0 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r1
            int r0 = r0 >>> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r1 = r1 | r0
            short r1 = (short) r1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final long m277(long r2, int r4) {
            long r0 = r2 >>> r4
            int r4 = 64 - r4
            long r2 = r2 << r4
            long r2 = r2 | r0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int m278(byte r0, int r1) {
            int r0 = r0 << r1
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int m279(byte r0, int r1) {
            int r0 = r0 >> r1
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final java.lang.String m280(byte r3) {
            char[] r0 = Yue.C0002.m107()
            int r1 = r3 >> 4
            r1 = r1 & 15
            char r0 = r0[r1]
            char[] r1 = Yue.C0002.m107()
            r3 = r3 & 15
            char r3 = r1[r3]
            r1 = 2
            char[] r1 = new char[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r3
            java.lang.String r3 = Yue.C5988.m22264(r1)
            return r3
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final java.lang.String m281(int r12) {
            r0 = 1
            r1 = 0
            r2 = 4
            r3 = 8
            if (r12 != 0) goto La
            java.lang.String r12 = "0"
            return r12
        La:
            char[] r4 = Yue.C0002.m107()
            int r5 = r12 >> 28
            r5 = r5 & 15
            char r4 = r4[r5]
            char[] r5 = Yue.C0002.m107()
            int r6 = r12 >> 24
            r6 = r6 & 15
            char r5 = r5[r6]
            char[] r6 = Yue.C0002.m107()
            int r7 = r12 >> 20
            r7 = r7 & 15
            char r6 = r6[r7]
            char[] r7 = Yue.C0002.m107()
            int r8 = r12 >> 16
            r8 = r8 & 15
            char r7 = r7[r8]
            char[] r8 = Yue.C0002.m107()
            int r9 = r12 >> 12
            r9 = r9 & 15
            char r8 = r8[r9]
            char[] r9 = Yue.C0002.m107()
            int r10 = r12 >> 8
            r10 = r10 & 15
            char r9 = r9[r10]
            char[] r10 = Yue.C0002.m107()
            int r11 = r12 >> 4
            r11 = r11 & 15
            char r10 = r10[r11]
            char[] r11 = Yue.C0002.m107()
            r12 = r12 & 15
            char r12 = r11[r12]
            char[] r11 = new char[r3]
            r11[r1] = r4
            r11[r0] = r5
            r4 = 2
            r11[r4] = r6
            r4 = 3
            r11[r4] = r7
            r11[r2] = r8
            r2 = 5
            r11[r2] = r9
            r2 = 6
            r11[r2] = r10
            r2 = 7
            r11[r2] = r12
        L6f:
            if (r1 >= r3) goto L79
            char r12 = r11[r1]
            r2 = 48
            if (r12 != r2) goto L79
            int r1 = r1 + r0
            goto L6f
        L79:
            java.lang.String r12 = Yue.C5988.m22265(r11, r1, r3)
            return r12
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final java.lang.String m282(long r21) {
            r4 = 12
            r5 = 16
            r6 = 0
            int r6 = (r21 > r6 ? 1 : (r21 == r6 ? 0 : -1))
            if (r6 != 0) goto Ld
            java.lang.String r0 = "0"
            return r0
        Ld:
            char[] r6 = Yue.C0002.m107()
            r7 = 60
            long r7 = r21 >> r7
            r9 = 15
            long r7 = r7 & r9
            int r7 = (int) r7
            char r6 = r6[r7]
            char[] r7 = Yue.C0002.m107()
            r8 = 56
            long r11 = r21 >> r8
            long r11 = r11 & r9
            int r8 = (int) r11
            char r7 = r7[r8]
            char[] r8 = Yue.C0002.m107()
            r11 = 52
            long r11 = r21 >> r11
            long r11 = r11 & r9
            int r11 = (int) r11
            char r8 = r8[r11]
            char[] r11 = Yue.C0002.m107()
            r12 = 48
            long r13 = r21 >> r12
            long r13 = r13 & r9
            int r13 = (int) r13
            char r11 = r11[r13]
            char[] r13 = Yue.C0002.m107()
            r14 = 44
            long r14 = r21 >> r14
            long r14 = r14 & r9
            int r14 = (int) r14
            char r13 = r13[r14]
            char[] r14 = Yue.C0002.m107()
            r15 = 40
            long r15 = r21 >> r15
            r17 = r13
            long r12 = r15 & r9
            int r12 = (int) r12
            char r12 = r14[r12]
            char[] r13 = Yue.C0002.m107()
            r14 = 36
            long r14 = r21 >> r14
            long r14 = r14 & r9
            int r14 = (int) r14
            char r13 = r13[r14]
            char[] r14 = Yue.C0002.m107()
            r15 = 32
            long r15 = r21 >> r15
            long r0 = r15 & r9
            int r0 = (int) r0
            char r0 = r14[r0]
            char[] r1 = Yue.C0002.m107()
            r14 = 28
            long r14 = r21 >> r14
            long r14 = r14 & r9
            int r14 = (int) r14
            char r1 = r1[r14]
            char[] r14 = Yue.C0002.m107()
            r15 = 24
            long r15 = r21 >> r15
            long r2 = r15 & r9
            int r2 = (int) r2
            char r2 = r14[r2]
            char[] r3 = Yue.C0002.m107()
            r14 = 20
            long r14 = r21 >> r14
            long r14 = r14 & r9
            int r14 = (int) r14
            char r3 = r3[r14]
            char[] r14 = Yue.C0002.m107()
            long r15 = r21 >> r5
            r18 = r6
            long r5 = r15 & r9
            int r5 = (int) r5
            char r5 = r14[r5]
            char[] r6 = Yue.C0002.m107()
            long r14 = r21 >> r4
            long r14 = r14 & r9
            int r14 = (int) r14
            char r6 = r6[r14]
            char[] r14 = Yue.C0002.m107()
            r15 = 8
            long r19 = r21 >> r15
            r16 = r5
            long r4 = r19 & r9
            int r4 = (int) r4
            char r4 = r14[r4]
            char[] r5 = Yue.C0002.m107()
            r14 = 4
            long r19 = r21 >> r14
            long r14 = r19 & r9
            int r14 = (int) r14
            char r5 = r5[r14]
            char[] r14 = Yue.C0002.m107()
            long r9 = r21 & r9
            int r9 = (int) r9
            char r9 = r14[r9]
            r10 = 16
            char[] r14 = new char[r10]
            r10 = 0
            r14[r10] = r18
            r15 = 1
            r14[r15] = r7
            r7 = 2
            r14[r7] = r8
            r7 = 3
            r14[r7] = r11
            r7 = 4
            r14[r7] = r17
            r7 = 5
            r14[r7] = r12
            r7 = 6
            r14[r7] = r13
            r7 = 7
            r14[r7] = r0
            r0 = 8
            r14[r0] = r1
            r0 = 9
            r14[r0] = r2
            r0 = 10
            r14[r0] = r3
            r0 = 11
            r14[r0] = r16
            r0 = 12
            r14[r0] = r6
            r0 = 13
            r14[r0] = r4
            r0 = 14
            r14[r0] = r5
            r0 = 15
            r14[r0] = r9
            r1 = r10
            r0 = 16
        L112:
            if (r1 >= r0) goto L11d
            char r2 = r14[r1]
            r3 = 48
            if (r2 != r3) goto L11d
            r2 = 1
            int r1 = r1 + r2
            goto L112
        L11d:
            java.lang.String r0 = Yue.C5988.m22265(r14, r1, r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final byte m283(byte r0, byte r1) {
            r0 = r0 ^ r1
            byte r0 = (byte) r0
            return r0
    }
}
