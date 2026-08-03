package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C0257 {
    @Yue.InterfaceC4418
    @Yue.InterfaceC4556
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final <E> Yue.InterfaceC5599<E> m1204(@Yue.InterfaceC4418 Yue.InterfaceC1662 r1, @Yue.InterfaceC4418 Yue.InterfaceC1632 r2, int r3, @Yue.InterfaceC4418 Yue.EnumC1666 r4, @Yue.InterfaceC4543 Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r5, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super Yue.InterfaceC0258<E>, ? super Yue.InterfaceC1598<? super Yue.C6593>, ? extends java.lang.Object> r6) {
            Yue.ۥ۟ۧۦۥ r1 = Yue.C1639.m7918(r1, r2)
            r2 = 0
            r0 = 6
            Yue.ۥ۟ۤ۠ۨ r2 = Yue.C1021.m5555(r3, r2, r2, r0, r2)
            boolean r3 = r4.m8020()
            if (r3 == 0) goto L16
            Yue.ۥ۠ۧ r3 = new Yue.ۥ۠ۧ
            r3.<init>(r1, r2, r6)
            goto L1c
        L16:
            Yue.ۥ۟۟ۨۨ r3 = new Yue.ۥ۟۟ۨۨ
            r0 = 1
            r3.<init>(r1, r2, r0)
        L1c:
            if (r5 == 0) goto L21
            r3.mo13981(r5)
        L21:
            r3.m379(r4, r3, r6)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ Yue.InterfaceC5599 m1205(Yue.InterfaceC1662 r6, Yue.InterfaceC1632 r7, int r8, Yue.EnumC1666 r9, Yue.InterfaceC2825 r10, Yue.InterfaceC2839 r11, int r12, java.lang.Object r13) {
            r13 = r12 & 1
            if (r13 == 0) goto L6
            Yue.ۥ۠۠ۧۦ r7 = Yue.C2141.f6728
        L6:
            r1 = r7
            r7 = r12 & 2
            if (r7 == 0) goto Lc
            r8 = 0
        Lc:
            r2 = r8
            r7 = r12 & 4
            if (r7 == 0) goto L13
            Yue.ۥ۟ۧۨ r9 = Yue.EnumC1666.f5152
        L13:
            r3 = r9
            r7 = r12 & 8
            if (r7 == 0) goto L19
            r10 = 0
        L19:
            r4 = r10
            r0 = r6
            r5 = r11
            Yue.ۥۡۨۡ۠ r6 = m1204(r0, r1, r2, r3, r4, r5)
            return r6
    }
}
