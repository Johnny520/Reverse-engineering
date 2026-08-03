package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1021 {
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5582, message = "Since 1.4.0, binary compatibility with earlier versions")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC0996 m5552(int r2) {
            r0 = 0
            r1 = 6
            Yue.ۥ۟ۤ۠ۨ r2 = m5555(r2, r0, r0, r1, r0)
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <E> Yue.InterfaceC0996<E> m5553(int r2, @Yue.InterfaceC4418 Yue.EnumC0847 r3, @Yue.InterfaceC4543 Yue.InterfaceC2825<? super E, Yue.C6593> r4) {
            r0 = -2
            r1 = 1
            if (r2 == r0) goto L4d
            r0 = -1
            if (r2 == r0) goto L37
            if (r2 == 0) goto L27
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r0) goto L21
            if (r2 != r1) goto L1a
            Yue.ۥۣۣ۟ r0 = Yue.EnumC0847.f2390
            if (r3 != r0) goto L1a
            Yue.ۥ۟ۦۧۢ r2 = new Yue.ۥ۟ۦۧۢ
            r2.<init>(r4)
            goto L5c
        L1a:
            Yue.ۥ۟ۡۧ۟ r0 = new Yue.ۥ۟ۡۧ۟
            r0.<init>(r2, r3, r4)
            r2 = r0
            goto L5c
        L21:
            Yue.ۥ۠ۧۡۨ r2 = new Yue.ۥ۠ۧۡۨ
            r2.<init>(r4)
            goto L5c
        L27:
            Yue.ۥۣۣ۟ r2 = Yue.EnumC0847.f2389
            if (r3 != r2) goto L31
            Yue.ۥۡۦۤ۠ r2 = new Yue.ۥۡۦۤ۠
            r2.<init>(r4)
            goto L5c
        L31:
            Yue.ۥ۟ۡۧ۟ r2 = new Yue.ۥ۟ۡۧ۟
            r2.<init>(r1, r3, r4)
            goto L5c
        L37:
            Yue.ۥۣۣ۟ r2 = Yue.EnumC0847.f2389
            if (r3 != r2) goto L41
            Yue.ۥ۟ۦۧۢ r2 = new Yue.ۥ۟ۦۧۢ
            r2.<init>(r4)
            goto L5c
        L41:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "CONFLATED capacity cannot be used with non-default onBufferOverflow"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L4d:
            Yue.ۥ۟ۡۧ۟ r2 = new Yue.ۥ۟ۡۧ۟
            Yue.ۥۣۣ۟ r0 = Yue.EnumC0847.f2389
            if (r3 != r0) goto L59
            Yue.ۥ۟ۤ۠ۨ$ۥ۟ r0 = Yue.InterfaceC0996.f2858
            int r1 = r0.m5525()
        L59:
            r2.<init>(r1, r3, r4)
        L5c:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ Yue.InterfaceC0996 m5554(int r0, int r1, java.lang.Object r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L5
            r0 = 0
        L5:
            Yue.ۥ۟ۤ۠ۨ r0 = m5552(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ Yue.InterfaceC0996 m5555(int r0, Yue.EnumC0847 r1, Yue.InterfaceC2825 r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r0 = 0
        L5:
            r4 = r3 & 2
            if (r4 == 0) goto Lb
            Yue.ۥۣۣ۟ r1 = Yue.EnumC0847.f2389
        Lb:
            r3 = r3 & 4
            if (r3 == 0) goto L10
            r2 = 0
        L10:
            Yue.ۥ۟ۤ۠ۨ r0 = m5553(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> T m5556(@Yue.InterfaceC4418 java.lang.Object r1, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.lang.Throwable, ? extends T> r2) {
            boolean r0 = r1 instanceof Yue.C1024.C1027
            if (r0 == 0) goto Lc
            java.lang.Throwable r1 = Yue.C1024.m5565(r1)
            java.lang.Object r1 = r2.invoke(r1)
        Lc:
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T> java.lang.Object m5557(@Yue.InterfaceC4418 java.lang.Object r1, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r2) {
            boolean r0 = r1 instanceof Yue.C1024.C1025
            if (r0 == 0) goto Lb
            java.lang.Throwable r0 = Yue.C1024.m5565(r1)
            r2.invoke(r0)
        Lb:
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T> java.lang.Object m5558(@Yue.InterfaceC4418 java.lang.Object r1, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r2) {
            boolean r0 = r1 instanceof Yue.C1024.C1027
            if (r0 == 0) goto Lb
            java.lang.Throwable r0 = Yue.C1024.m5565(r1)
            r2.invoke(r0)
        Lb:
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T> java.lang.Object m5559(@Yue.InterfaceC4418 java.lang.Object r1, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super T, Yue.C6593> r2) {
            boolean r0 = r1 instanceof Yue.C1024.C1027
            if (r0 != 0) goto L7
            r2.invoke(r1)
        L7:
            return r1
    }
}
