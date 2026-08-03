package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5987 extends Yue.C5986 {
    public C5987() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public static final java.lang.Void m22239(@Yue.InterfaceC4418 java.lang.String r3) {
            java.lang.String r0 = "input"
            Yue.C3329.m13906(r3, r0)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid number format: '"
            r1.append(r2)
            r1.append(r3)
            r3 = 39
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @Yue.InterfaceC5792(version = "1.1")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public static final java.lang.Byte m22240(@Yue.InterfaceC4418 java.lang.String r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            r0 = 10
            java.lang.Byte r1 = m22241(r1, r0)
            return r1
    }

    @Yue.InterfaceC5792(version = "1.1")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public static final java.lang.Byte m22241(@Yue.InterfaceC4418 java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.Integer r1 = m22243(r1, r2)
            r2 = 0
            if (r1 == 0) goto L1f
            int r1 = r1.intValue()
            r0 = -128(0xffffffffffffff80, float:NaN)
            if (r1 < r0) goto L1f
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 <= r0) goto L19
            goto L1f
        L19:
            byte r1 = (byte) r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            return r1
        L1f:
            return r2
    }

    @Yue.InterfaceC5792(version = "1.1")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public static java.lang.Integer m22242(@Yue.InterfaceC4418 java.lang.String r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            r0 = 10
            java.lang.Integer r1 = m22243(r1, r0)
            return r1
    }

    @Yue.InterfaceC5792(version = "1.1")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public static final java.lang.Integer m22243(@Yue.InterfaceC4418 java.lang.String r10, int r11) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r10, r0)
            Yue.C1096.m5842(r11)
            int r0 = r10.length()
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            r2 = 0
            char r3 = r10.charAt(r2)
            r4 = 48
            int r4 = Yue.C3329.m13910(r3, r4)
            r5 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r4 >= 0) goto L33
            r4 = 1
            if (r0 != r4) goto L24
            return r1
        L24:
            r6 = 45
            if (r3 != r6) goto L2c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r4
            goto L35
        L2c:
            r6 = 43
            if (r3 != r6) goto L32
            r3 = r2
            goto L35
        L32:
            return r1
        L33:
            r3 = r2
            r4 = r3
        L35:
            r6 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r7 = r6
        L39:
            if (r4 >= r0) goto L59
            char r8 = r10.charAt(r4)
            int r8 = Yue.C1096.m5843(r8, r11)
            if (r8 >= 0) goto L46
            return r1
        L46:
            if (r2 >= r7) goto L4f
            if (r7 != r6) goto L4e
            int r7 = r5 / r11
            if (r2 >= r7) goto L4f
        L4e:
            return r1
        L4f:
            int r2 = r2 * r11
            int r9 = r5 + r8
            if (r2 >= r9) goto L55
            return r1
        L55:
            int r2 = r2 - r8
            int r4 = r4 + 1
            goto L39
        L59:
            if (r3 == 0) goto L60
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            goto L65
        L60:
            int r10 = -r2
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
        L65:
            return r10
    }

    @Yue.InterfaceC5792(version = "1.1")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public static java.lang.Long m22244(@Yue.InterfaceC4418 java.lang.String r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            r0 = 10
            java.lang.Long r1 = m22245(r1, r0)
            return r1
    }

    @Yue.InterfaceC5792(version = "1.1")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public static final java.lang.Long m22245(@Yue.InterfaceC4418 java.lang.String r19, int r20) {
            r0 = r19
            r1 = r20
            java.lang.String r2 = "<this>"
            Yue.C3329.m13906(r0, r2)
            Yue.C1096.m5842(r20)
            int r2 = r19.length()
            r3 = 0
            if (r2 != 0) goto L14
            return r3
        L14:
            r4 = 0
            char r5 = r0.charAt(r4)
            r6 = 48
            int r6 = Yue.C3329.m13910(r5, r6)
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 >= 0) goto L3d
            r6 = 1
            if (r2 != r6) goto L2a
            return r3
        L2a:
            r9 = 45
            if (r5 != r9) goto L32
            r7 = -9223372036854775808
            r4 = r6
            goto L3e
        L32:
            r9 = 43
            if (r5 != r9) goto L3c
            r18 = r6
            r6 = r4
            r4 = r18
            goto L3e
        L3c:
            return r3
        L3d:
            r6 = r4
        L3e:
            r9 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r11 = 0
            r13 = r9
        L46:
            if (r4 >= r2) goto L76
            char r5 = r0.charAt(r4)
            int r5 = Yue.C1096.m5843(r5, r1)
            if (r5 >= 0) goto L53
            return r3
        L53:
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 >= 0) goto L63
            int r13 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r13 != 0) goto L62
            long r13 = (long) r1
            long r13 = r7 / r13
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 >= 0) goto L63
        L62:
            return r3
        L63:
            long r9 = (long) r1
            long r11 = r11 * r9
            long r9 = (long) r5
            long r16 = r7 + r9
            int r5 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r5 >= 0) goto L6d
            return r3
        L6d:
            long r11 = r11 - r9
            int r4 = r4 + 1
            r9 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            goto L46
        L76:
            if (r6 == 0) goto L7d
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            goto L82
        L7d:
            long r0 = -r11
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L82:
            return r0
    }

    @Yue.InterfaceC5792(version = "1.1")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public static final java.lang.Short m22246(@Yue.InterfaceC4418 java.lang.String r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            r0 = 10
            java.lang.Short r1 = m22247(r1, r0)
            return r1
    }

    @Yue.InterfaceC5792(version = "1.1")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public static final java.lang.Short m22247(@Yue.InterfaceC4418 java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.Integer r1 = m22243(r1, r2)
            r2 = 0
            if (r1 == 0) goto L1f
            int r1 = r1.intValue()
            r0 = -32768(0xffffffffffff8000, float:NaN)
            if (r1 < r0) goto L1f
            r0 = 32767(0x7fff, float:4.5916E-41)
            if (r1 <= r0) goto L19
            goto L1f
        L19:
            short r1 = (short) r1
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            return r1
        L1f:
            return r2
    }
}
