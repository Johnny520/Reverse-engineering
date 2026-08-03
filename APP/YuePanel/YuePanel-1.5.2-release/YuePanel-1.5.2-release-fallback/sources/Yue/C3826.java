package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nlongSaturatedMath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,81:1\n80#1:82\n80#1:83\n80#1:84\n80#1:85\n80#1:86\n80#1:87\n*S KotlinDebug\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n14#1:82\n17#1:83\n36#1:84\n46#1:85\n53#1:86\n57#1:87\n*E\n"})
public final class C3826 {
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final long m15301(long r0, long r2, long r4) {
            boolean r2 = Yue.C2045.m9486(r2)
            if (r2 == 0) goto L17
            long r2 = r0 ^ r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto Lf
            goto L17
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Summing infinities of different signs"
            r0.<init>(r1)
            throw r0
        L17:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final long m15302(long r2) {
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto Ld
            Yue.ۥ۠۠ۢۥ$ۥ r2 = Yue.C2045.f6532
            long r2 = r2.m9551()
            goto L13
        Ld:
            Yue.ۥ۠۠ۢۥ$ۥ r2 = Yue.C2045.f6532
            long r2 = r2.m9541()
        L13:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final boolean m15303(long r2) {
            r0 = 1
            long r2 = r2 - r0
            long r2 = r2 | r0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final long m15304(long r9, @Yue.InterfaceC4418 Yue.EnumC2050 r11, long r12) {
            java.lang.String r0 = "unit"
            Yue.C3329.m13906(r11, r0)
            long r5 = Yue.C2045.m9500(r12, r11)
            r0 = 1
            long r2 = r9 - r0
            long r2 = r2 | r0
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto L1e
            r1 = r9
            r3 = r12
            long r9 = m15301(r1, r3, r5)
            return r9
        L1e:
            long r2 = r5 - r0
            long r0 = r0 | r2
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 != 0) goto L2a
            long r9 = m15305(r9, r11, r12)
            return r9
        L2a:
            long r11 = r9 + r5
            long r0 = r9 ^ r11
            long r2 = r5 ^ r11
            long r0 = r0 & r2
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 >= 0) goto L3e
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 >= 0) goto L3d
            r7 = -9223372036854775808
        L3d:
            return r7
        L3e:
            return r11
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final long m15305(long r8, Yue.EnumC2050 r10, long r11) {
            r0 = 2
            long r0 = Yue.C2045.m9446(r11, r0)
            long r2 = Yue.C2045.m9500(r0, r10)
            r4 = 1
            long r6 = r2 - r4
            long r4 = r4 | r6
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L18
            return r2
        L18:
            long r8 = m15304(r8, r10, r0)
            long r11 = Yue.C2045.m9489(r11, r0)
            long r8 = m15304(r8, r10, r11)
            return r8
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final long m15306(long r4, long r6, @Yue.InterfaceC4418 Yue.EnumC2050 r8) {
            java.lang.String r0 = "unit"
            Yue.C3329.m13906(r8, r0)
            r0 = 1
            long r2 = r6 - r0
            long r0 = r0 | r2
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L1c
            long r4 = m15302(r6)
            long r4 = Yue.C2045.m9507(r4)
            return r4
        L1c:
            long r4 = m15307(r4, r6, r8)
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final long m15307(long r7, long r9, Yue.EnumC2050 r11) {
            long r0 = r7 - r9
            long r2 = r0 ^ r7
            long r4 = r0 ^ r9
            long r4 = ~r4
            long r2 = r2 & r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L3c
            Yue.ۥۣ۠۠ r2 = Yue.EnumC2050.f6545
            int r3 = r11.compareTo(r2)
            if (r3 >= 0) goto L33
            r0 = 1
            long r0 = Yue.C2052.m9657(r0, r2, r11)
            long r3 = r7 / r0
            long r5 = r9 / r0
            long r3 = r3 - r5
            long r7 = r7 % r0
            long r9 = r9 % r0
            long r7 = r7 - r9
            Yue.ۥ۠۠ۢۥ$ۥ r9 = Yue.C2045.f6532
            long r9 = Yue.C2049.m9652(r3, r2)
            long r7 = Yue.C2049.m9652(r7, r11)
            long r7 = Yue.C2045.m9490(r9, r7)
            return r7
        L33:
            long r7 = m15302(r0)
            long r7 = Yue.C2045.m9507(r7)
            return r7
        L3c:
            long r7 = Yue.C2049.m9652(r0, r11)
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final long m15308(long r6, long r8, @Yue.InterfaceC4418 Yue.EnumC2050 r10) {
            java.lang.String r0 = "unit"
            Yue.C3329.m13906(r10, r0)
            r0 = 1
            long r2 = r8 - r0
            long r2 = r2 | r0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L27
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L1e
            Yue.ۥ۠۠ۢۥ$ۥ r6 = Yue.C2045.f6532
            long r6 = r6.m9558()
            return r6
        L1e:
            long r6 = m15302(r8)
            long r6 = Yue.C2045.m9507(r6)
            return r6
        L27:
            long r2 = r6 - r0
            long r0 = r0 | r2
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L33
            long r6 = m15302(r6)
            return r6
        L33:
            long r6 = m15307(r6, r8, r10)
            return r6
    }
}
