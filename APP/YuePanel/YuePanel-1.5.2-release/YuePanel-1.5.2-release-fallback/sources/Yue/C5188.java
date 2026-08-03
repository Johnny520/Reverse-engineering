package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۥۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/RandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
public final class C5188 {
    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final Yue.AbstractC5185 m19462(int r2) {
            Yue.ۥۢۦۣۢ r0 = new Yue.ۥۢۦۣۢ
            int r1 = r2 >> 31
            r0.<init>(r2, r1)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final Yue.AbstractC5185 m19463(long r3) {
            Yue.ۥۢۦۣۢ r0 = new Yue.ۥۢۦۣۢ
            int r1 = (int) r3
            r2 = 32
            long r3 = r3 >> r2
            int r3 = (int) r3
            r0.<init>(r1, r3)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.String m19464(@Yue.InterfaceC4418 java.lang.Object r2, @Yue.InterfaceC4418 java.lang.Object r3) {
            java.lang.String r0 = "from"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "until"
            Yue.C3329.m13906(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Random range is empty: ["
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = ", "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = ")."
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m19465(double r1, double r3) {
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L5
            return
        L5:
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            java.lang.Double r2 = java.lang.Double.valueOf(r3)
            java.lang.String r1 = m19464(r1, r2)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final void m19466(int r0, int r1) {
            if (r1 <= r0) goto L3
            return
        L3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r0 = m19464(r0, r1)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final void m19467(long r1, long r3) {
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L5
            return
        L5:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            java.lang.String r1 = m19464(r1, r2)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int m19468(int r0) {
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)
            int r0 = 31 - r0
            return r0
    }

    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int m19469(@Yue.InterfaceC4418 Yue.AbstractC5185 r2, @Yue.InterfaceC4418 Yue.C3279 r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r3, r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L46
            int r0 = r3.m13738()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 >= r1) goto L28
            int r0 = r3.m13737()
            int r3 = r3.m13738()
            int r3 = r3 + 1
            int r2 = r2.mo19034(r0, r3)
            goto L45
        L28:
            int r0 = r3.m13737()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 <= r1) goto L41
            int r0 = r3.m13737()
            int r0 = r0 + (-1)
            int r3 = r3.m13738()
            int r2 = r2.mo19034(r0, r3)
            int r2 = r2 + 1
            goto L45
        L41:
            int r2 = r2.mo440()
        L45:
            return r2
        L46:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot get random in empty range: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final long m19470(@Yue.InterfaceC4418 Yue.AbstractC5185 r7, @Yue.InterfaceC4418 Yue.C3824 r8) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r8, r0)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L4b
            long r0 = r8.m15289()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 >= 0) goto L2d
            long r3 = r8.m15288()
            long r5 = r8.m15289()
            long r5 = r5 + r1
            long r7 = r7.mo19036(r3, r5)
            goto L4a
        L2d:
            long r3 = r8.m15288()
            r5 = -9223372036854775808
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L46
            long r3 = r8.m15288()
            long r3 = r3 - r1
            long r5 = r8.m15289()
            long r7 = r7.mo19036(r3, r5)
            long r7 = r7 + r1
            goto L4a
        L46:
            long r7 = r7.mo442()
        L4a:
            return r7
        L4b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot get random in empty range: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int m19471(int r1, int r2) {
            int r0 = 32 - r2
            int r1 = r1 >>> r0
            int r2 = -r2
            int r2 = r2 >> 31
            r1 = r1 & r2
            return r1
    }
}
