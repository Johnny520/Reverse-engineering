package Yue;

/* JADX INFO: renamed from: Yue.ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3421(name = "-Base64")
public final class C0000 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final byte[] f0 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final byte[] f1 = null;

    static {
            Yue.ۥۣ۟ۥۤ$ۥ r0 = Yue.C0879.f2556
            java.lang.String r1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
            Yue.ۥۣ۟ۥۤ r1 = r0.m5121(r1)
            byte[] r1 = r1.m5067()
            Yue.C0000.f0 = r1
            java.lang.String r1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_"
            Yue.ۥۣ۟ۥۤ r0 = r0.m5121(r1)
            byte[] r0 = r0.m5067()
            Yue.C0000.f1 = r0
            return
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final byte[] m0(@Yue.InterfaceC4418 java.lang.String r14) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r14, r0)
            int r0 = r14.length()
        L9:
            r1 = 9
            r2 = 32
            r3 = 13
            r4 = 10
            if (r0 <= 0) goto L29
            int r5 = r0 + (-1)
            char r5 = r14.charAt(r5)
            r6 = 61
            if (r5 == r6) goto L26
            if (r5 == r4) goto L26
            if (r5 == r3) goto L26
            if (r5 == r2) goto L26
            if (r5 == r1) goto L26
            goto L29
        L26:
            int r0 = r0 + (-1)
            goto L9
        L29:
            long r5 = (long) r0
            r7 = 6
            long r5 = r5 * r7
            r7 = 8
            long r5 = r5 / r7
            int r5 = (int) r5
            byte[] r6 = new byte[r5]
            r7 = 0
            r8 = r7
            r9 = r8
            r10 = r9
        L37:
            r11 = 0
            if (r7 >= r0) goto L9f
            char r12 = r14.charAt(r7)
            r13 = 65
            if (r13 > r12) goto L49
            r13 = 91
            if (r12 >= r13) goto L49
            int r12 = r12 + (-65)
            goto L80
        L49:
            r13 = 97
            if (r13 > r12) goto L54
            r13 = 123(0x7b, float:1.72E-43)
            if (r12 >= r13) goto L54
            int r12 = r12 + (-71)
            goto L80
        L54:
            r13 = 48
            if (r13 > r12) goto L5f
            r13 = 58
            if (r12 >= r13) goto L5f
            int r12 = r12 + 4
            goto L80
        L5f:
            r13 = 43
            if (r12 == r13) goto L7e
            r13 = 45
            if (r12 != r13) goto L68
            goto L7e
        L68:
            r13 = 47
            if (r12 == r13) goto L7b
            r13 = 95
            if (r12 != r13) goto L71
            goto L7b
        L71:
            if (r12 == r4) goto L9c
            if (r12 == r3) goto L9c
            if (r12 == r2) goto L9c
            if (r12 != r1) goto L7a
            goto L9c
        L7a:
            return r11
        L7b:
            r12 = 63
            goto L80
        L7e:
            r12 = 62
        L80:
            int r9 = r9 << 6
            r9 = r9 | r12
            int r8 = r8 + 1
            int r11 = r8 % 4
            if (r11 != 0) goto L9c
            int r11 = r10 + 1
            int r12 = r9 >> 16
            byte r12 = (byte) r12
            r6[r10] = r12
            int r12 = r10 + 2
            int r13 = r9 >> 8
            byte r13 = (byte) r13
            r6[r11] = r13
            int r10 = r10 + 3
            byte r11 = (byte) r9
            r6[r12] = r11
        L9c:
            int r7 = r7 + 1
            goto L37
        L9f:
            int r8 = r8 % 4
            r14 = 1
            if (r8 == r14) goto Ld3
            r14 = 2
            if (r8 == r14) goto Lbc
            r14 = 3
            if (r8 == r14) goto Lab
            goto Lc6
        Lab:
            int r14 = r9 << 6
            int r0 = r10 + 1
            int r1 = r14 >> 16
            byte r1 = (byte) r1
            r6[r10] = r1
            int r10 = r10 + 2
            int r14 = r14 >> 8
            byte r14 = (byte) r14
            r6[r0] = r14
            goto Lc6
        Lbc:
            int r14 = r9 << 12
            int r0 = r10 + 1
            int r14 = r14 >> 16
            byte r14 = (byte) r14
            r6[r10] = r14
            r10 = r0
        Lc6:
            if (r10 != r5) goto Lc9
            return r6
        Lc9:
            byte[] r14 = java.util.Arrays.copyOf(r6, r10)
            java.lang.String r0 = "copyOf(this, newSize)"
            Yue.C3329.m13905(r14, r0)
            return r14
        Ld3:
            return r11
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String m1(@Yue.InterfaceC4418 byte[] r11, @Yue.InterfaceC4418 byte[] r12) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r11, r0)
            java.lang.String r0 = "map"
            Yue.C3329.m13906(r12, r0)
            int r0 = r11.length
            r1 = 2
            int r0 = r0 + r1
            int r0 = r0 / 3
            int r0 = r0 * 4
            byte[] r0 = new byte[r0]
            int r2 = r11.length
            int r3 = r11.length
            int r3 = r3 % 3
            int r2 = r2 - r3
            r3 = 0
            r4 = r3
        L1a:
            if (r3 >= r2) goto L57
            int r5 = r3 + 1
            r6 = r11[r3]
            int r7 = r3 + 2
            r5 = r11[r5]
            int r3 = r3 + 3
            r7 = r11[r7]
            int r8 = r4 + 1
            r9 = r6 & 255(0xff, float:3.57E-43)
            int r9 = r9 >> r1
            r9 = r12[r9]
            r0[r4] = r9
            int r9 = r4 + 2
            r6 = r6 & 3
            int r6 = r6 << 4
            r10 = r5 & 255(0xff, float:3.57E-43)
            int r10 = r10 >> 4
            r6 = r6 | r10
            r6 = r12[r6]
            r0[r8] = r6
            int r6 = r4 + 3
            r5 = r5 & 15
            int r5 = r5 << r1
            r8 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r8 >> 6
            r5 = r5 | r8
            r5 = r12[r5]
            r0[r9] = r5
            int r4 = r4 + 4
            r5 = r7 & 63
            r5 = r12[r5]
            r0[r6] = r5
            goto L1a
        L57:
            int r5 = r11.length
            int r5 = r5 - r2
            r2 = 61
            r6 = 1
            if (r5 == r6) goto L8b
            if (r5 == r1) goto L61
            goto La7
        L61:
            int r5 = r3 + 1
            r3 = r11[r3]
            r11 = r11[r5]
            int r5 = r4 + 1
            r6 = r3 & 255(0xff, float:3.57E-43)
            int r6 = r6 >> r1
            r6 = r12[r6]
            r0[r4] = r6
            int r6 = r4 + 2
            r3 = r3 & 3
            int r3 = r3 << 4
            r7 = r11 & 255(0xff, float:3.57E-43)
            int r7 = r7 >> 4
            r3 = r3 | r7
            r3 = r12[r3]
            r0[r5] = r3
            int r4 = r4 + 3
            r11 = r11 & 15
            int r11 = r11 << r1
            r11 = r12[r11]
            r0[r6] = r11
            r0[r4] = r2
            goto La7
        L8b:
            r11 = r11[r3]
            int r3 = r4 + 1
            r5 = r11 & 255(0xff, float:3.57E-43)
            int r1 = r5 >> 2
            r1 = r12[r1]
            r0[r4] = r1
            int r1 = r4 + 2
            r11 = r11 & 3
            int r11 = r11 << 4
            r11 = r12[r11]
            r0[r3] = r11
            int r4 = r4 + 3
            r0[r1] = r2
            r0[r4] = r2
        La7:
            java.lang.String r11 = Yue.C7189.m27676(r0)
            return r11
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m2(byte[] r0, byte[] r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            byte[] r1 = Yue.C0000.f0
        L6:
            java.lang.String r0 = m1(r0, r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final byte[] m3() {
            byte[] r0 = Yue.C0000.f0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m4() {
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final byte[] m5() {
            byte[] r0 = Yue.C0000.f1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m6() {
            return
    }
}
