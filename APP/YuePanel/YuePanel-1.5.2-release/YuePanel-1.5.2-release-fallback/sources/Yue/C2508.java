package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2508 {
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5582, message = "Since 1.4.0, binary compatibility with earlier versions")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC2464 m11699(Yue.InterfaceC2464 r2, int r3) {
            r0 = 0
            r1 = 2
            Yue.ۥۣ۠ۢۡ r2 = Yue.C2472.m11515(r2, r3, r0, r1, r0)
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11700(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r7, int r8, @Yue.InterfaceC4418 Yue.EnumC0847 r9) {
            r0 = -1
            if (r8 >= 0) goto L24
            r1 = -2
            if (r8 == r1) goto L24
            if (r8 != r0) goto L9
            goto L24
        L9:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "
            r7.append(r9)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L24:
            if (r8 != r0) goto L37
            Yue.ۥۣۣ۟ r1 = Yue.EnumC0847.f2389
            if (r9 != r1) goto L2b
            goto L37
        L2b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "CONFLATED capacity cannot be used with non-default onBufferOverflow"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L37:
            if (r8 != r0) goto L3c
            Yue.ۥۣۣ۟ r9 = Yue.EnumC0847.f2390
            r8 = 0
        L3c:
            r3 = r8
            r4 = r9
            boolean r8 = r7 instanceof Yue.InterfaceC2855
            if (r8 == 0) goto L50
            r0 = r7
            Yue.ۥۣۣ۠ۧ r0 = (Yue.InterfaceC2855) r0
            r7 = 1
            r5 = 0
            r1 = 0
            r2 = r3
            r3 = r4
            r4 = r7
            Yue.ۥۣ۠ۢۡ r7 = Yue.InterfaceC2855.C2856.m12300(r0, r1, r2, r3, r4, r5)
            goto L5b
        L50:
            Yue.ۥ۟ۤۡۥ r8 = new Yue.ۥ۟ۤۡۥ
            r5 = 2
            r6 = 0
            r2 = 0
            r0 = r8
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7 = r8
        L5b:
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ Yue.InterfaceC2464 m11701(Yue.InterfaceC2464 r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = -2
        L5:
            Yue.ۥۣ۠ۢۡ r0 = Yue.C2472.m11512(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ Yue.InterfaceC2464 m11702(Yue.InterfaceC2464 r0, int r1, Yue.EnumC0847 r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = -2
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lb
            Yue.ۥۣۣ۟ r2 = Yue.EnumC0847.f2389
        Lb:
            Yue.ۥۣ۠ۢۡ r0 = Yue.C2472.m11513(r0, r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11703(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r1) {
            boolean r0 = r1 instanceof Yue.InterfaceC0937
            if (r0 == 0) goto L5
            goto Lb
        L5:
            Yue.ۥۣ۟ۨۤ r0 = new Yue.ۥۣ۟ۨۤ
            r0.<init>(r1)
            r1 = r0
        Lb:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final void m11704(Yue.InterfaceC1632 r2) {
            Yue.ۥ۠ۦ۟ۡ$ۥ۟ r0 = Yue.InterfaceC3383.f10824
            Yue.ۥ۟ۧۦۥ$ۥ۟ r0 = r2.get(r0)
            if (r0 != 0) goto L9
            return
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Flow context cannot contain job in it. Had "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11705(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r3) {
            r0 = 0
            r1 = 2
            r2 = -1
            Yue.ۥۣ۠ۢۡ r3 = Yue.C2472.m11515(r3, r2, r0, r1, r0)
            return r3
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2464<T> m11706(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r8, @Yue.InterfaceC4418 Yue.InterfaceC1632 r9) {
            m11704(r9)
            Yue.ۥ۠۠ۧۦ r0 = Yue.C2141.f6728
            boolean r0 = Yue.C3329.m13897(r9, r0)
            if (r0 == 0) goto Lc
            goto L2b
        Lc:
            boolean r0 = r8 instanceof Yue.InterfaceC2855
            if (r0 == 0) goto L1d
            r1 = r8
            Yue.ۥۣۣ۠ۧ r1 = (Yue.InterfaceC2855) r1
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r2 = r9
            Yue.ۥۣ۠ۢۡ r8 = Yue.InterfaceC2855.C2856.m12300(r1, r2, r3, r4, r5, r6)
            goto L2b
        L1d:
            Yue.ۥ۟ۤۡۥ r7 = new Yue.ۥ۟ۤۡۥ
            r5 = 12
            r6 = 0
            r3 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8 = r7
        L2b:
            return r8
    }
}
