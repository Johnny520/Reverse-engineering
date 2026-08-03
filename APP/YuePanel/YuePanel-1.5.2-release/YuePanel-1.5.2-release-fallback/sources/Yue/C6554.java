package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nURandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URandom.kt\nkotlin/random/URandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n1#2:156\n*E\n"})
public final class C6554 {
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final void m25169(int r1, int r2) {
            int r0 = java.lang.Integer.compareUnsigned(r2, r1)
            if (r0 <= 0) goto L7
            return
        L7:
            Yue.ۥۢۢۦۣ r1 = Yue.C6528.m24932(r1)
            Yue.ۥۢۢۦۣ r2 = Yue.C6528.m24932(r2)
            java.lang.String r1 = Yue.C5188.m19464(r1, r2)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final void m25170(long r1, long r3) {
            int r0 = java.lang.Long.compareUnsigned(r3, r1)
            if (r0 <= 0) goto L7
            return
        L7:
            Yue.ۥۢۢۧ۟ r1 = Yue.C6539.m25033(r1)
            Yue.ۥۢۢۧ۟ r2 = Yue.C6539.m25033(r3)
            java.lang.String r1 = Yue.C5188.m19464(r1, r2)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.3")
    @Yue.InterfaceC2314
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final byte[] m25171(@Yue.InterfaceC4418 Yue.AbstractC5185 r1, int r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            byte[] r1 = r1.mo19457(r2)
            byte[] r1 = Yue.C6519.m24853(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.3")
    @Yue.InterfaceC2314
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final byte[] m25172(@Yue.InterfaceC4418 Yue.AbstractC5185 r1, @Yue.InterfaceC4418 byte[] r2) {
            java.lang.String r0 = "$this$nextUBytes"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "array"
            Yue.C3329.m13906(r2, r0)
            r1.mo437(r2)
            return r2
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.3")
    @Yue.InterfaceC2314
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final byte[] m25173(@Yue.InterfaceC4418 Yue.AbstractC5185 r1, @Yue.InterfaceC4418 byte[] r2, int r3, int r4) {
            java.lang.String r0 = "$this$nextUBytes"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "array"
            Yue.C3329.m13906(r2, r0)
            r1.mo19458(r2, r3, r4)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ byte[] m25174(Yue.AbstractC5185 r0, byte[] r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            int r3 = Yue.C6519.m24859(r1)
        Ld:
            byte[] r0 = m25173(r0, r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2314.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int m25175(@Yue.InterfaceC4418 Yue.AbstractC5185 r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            int r1 = r1.mo440()
            int r1 = Yue.C6528.m24937(r1)
            return r1
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2314.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int m25176(@Yue.InterfaceC4418 Yue.AbstractC5185 r2, @Yue.InterfaceC4418 Yue.C6537 r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r3, r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L57
            int r0 = r3.m25021()
            r1 = -1
            int r0 = java.lang.Integer.compareUnsigned(r0, r1)
            if (r0 >= 0) goto L2e
            int r0 = r3.m25020()
            int r3 = r3.m25021()
            int r3 = r3 + 1
            int r3 = Yue.C6528.m24937(r3)
            int r2 = m25177(r2, r0, r3)
            goto L56
        L2e:
            int r0 = r3.m25020()
            r1 = 0
            int r0 = java.lang.Integer.compareUnsigned(r0, r1)
            if (r0 <= 0) goto L52
            int r0 = r3.m25020()
            int r0 = r0 + (-1)
            int r0 = Yue.C6528.m24937(r0)
            int r3 = r3.m25021()
            int r2 = m25177(r2, r0, r3)
            int r2 = r2 + 1
            int r2 = Yue.C6528.m24937(r2)
            goto L56
        L52:
            int r2 = m25175(r2)
        L56:
            return r2
        L57:
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

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2314.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int m25177(@Yue.InterfaceC4418 Yue.AbstractC5185 r1, int r2, int r3) {
            java.lang.String r0 = "$this$nextUInt"
            Yue.C3329.m13906(r1, r0)
            m25169(r2, r3)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 ^ r0
            r3 = r3 ^ r0
            int r1 = r1.mo19034(r2, r3)
            r1 = r1 ^ r0
            int r1 = Yue.C6528.m24937(r1)
            return r1
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2314.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int m25178(@Yue.InterfaceC4418 Yue.AbstractC5185 r1, int r2) {
            java.lang.String r0 = "$this$nextUInt"
            Yue.C3329.m13906(r1, r0)
            r0 = 0
            int r1 = m25177(r1, r0, r2)
            return r1
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2314.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final long m25179(@Yue.InterfaceC4418 Yue.AbstractC5185 r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            long r0 = r2.mo442()
            long r0 = Yue.C6539.m25038(r0)
            return r0
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2314.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final long m25180(@Yue.InterfaceC4418 Yue.AbstractC5185 r10, @Yue.InterfaceC4418 Yue.C6548 r11) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r10, r0)
            java.lang.String r0 = "range"
            Yue.C3329.m13906(r11, r0)
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L6e
            long r0 = r11.m25122()
            r2 = -1
            int r0 = java.lang.Long.compareUnsigned(r0, r2)
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r3 = 1
            if (r0 >= 0) goto L3b
            long r4 = r11.m25121()
            long r6 = r11.m25122()
            long r8 = (long) r3
            long r0 = r8 & r1
            long r0 = Yue.C6539.m25038(r0)
            long r6 = r6 + r0
            long r0 = Yue.C6539.m25038(r6)
            long r10 = m25182(r10, r4, r0)
            goto L6d
        L3b:
            long r4 = r11.m25121()
            r6 = 0
            int r0 = java.lang.Long.compareUnsigned(r4, r6)
            if (r0 <= 0) goto L69
            long r4 = r11.m25121()
            long r6 = (long) r3
            long r0 = r6 & r1
            long r2 = Yue.C6539.m25038(r0)
            long r4 = r4 - r2
            long r2 = Yue.C6539.m25038(r4)
            long r4 = r11.m25122()
            long r10 = m25182(r10, r2, r4)
            long r0 = Yue.C6539.m25038(r0)
            long r10 = r10 + r0
            long r10 = Yue.C6539.m25038(r10)
            goto L6d
        L69:
            long r10 = m25179(r10)
        L6d:
            return r10
        L6e:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot get random in empty range: "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r10.<init>(r11)
            throw r10
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2314.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final long m25181(@Yue.InterfaceC4418 Yue.AbstractC5185 r2, long r3) {
            java.lang.String r0 = "$this$nextULong"
            Yue.C3329.m13906(r2, r0)
            r0 = 0
            long r2 = m25182(r2, r0, r3)
            return r2
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2314.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final long m25182(@Yue.InterfaceC4418 Yue.AbstractC5185 r2, long r3, long r5) {
            java.lang.String r0 = "$this$nextULong"
            Yue.C3329.m13906(r2, r0)
            m25170(r3, r5)
            r0 = -9223372036854775808
            long r3 = r3 ^ r0
            long r5 = r5 ^ r0
            long r2 = r2.mo19036(r3, r5)
            long r2 = r2 ^ r0
            long r2 = Yue.C6539.m25038(r2)
            return r2
    }
}
