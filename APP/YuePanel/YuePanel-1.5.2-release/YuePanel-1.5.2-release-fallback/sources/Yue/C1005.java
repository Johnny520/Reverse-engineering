package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1005 {
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ Yue.InterfaceC2466 m5538(Yue.InterfaceC2466 r0, Yue.InterfaceC1632 r1) {
            Yue.ۥۣۣ۠ۢ r0 = m5542(r0, r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <T> Yue.AbstractC1001<T> m5539(@Yue.InterfaceC4418 Yue.InterfaceC2464<? extends T> r8) {
            boolean r0 = r8 instanceof Yue.AbstractC1001
            if (r0 == 0) goto L8
            r0 = r8
            Yue.ۥ۟ۤۡ۠ r0 = (Yue.AbstractC1001) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 != 0) goto L18
            Yue.ۥ۟ۤۡۥ r0 = new Yue.ۥ۟ۤۡۥ
            r6 = 14
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r1 = r0
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
        L18:
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T, V> java.lang.Object m5540(@Yue.InterfaceC4418 Yue.InterfaceC1632 r2, V r3, @Yue.InterfaceC4418 java.lang.Object r4, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super V, ? super Yue.InterfaceC1598<? super T>, ? extends java.lang.Object> r5, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super T> r6) {
            java.lang.Object r4 = Yue.C6179.m23131(r2, r4)
            Yue.ۥۢ۟ۧۤ r0 = new Yue.ۥۢ۟ۧۤ     // Catch: java.lang.Throwable -> L21
            r0.<init>(r6, r2)     // Catch: java.lang.Throwable -> L21
            r1 = 2
            java.lang.Object r5 = Yue.C6466.m23830(r5, r1)     // Catch: java.lang.Throwable -> L21
            Yue.ۥۣ۠ۢۢ r5 = (Yue.InterfaceC2839) r5     // Catch: java.lang.Throwable -> L21
            java.lang.Object r3 = r5.invoke(r3, r0)     // Catch: java.lang.Throwable -> L21
            Yue.C6179.m23129(r2, r4)
            java.lang.Object r2 = Yue.C3341.m13947()
            if (r3 != r2) goto L20
            Yue.C1757.m8349(r6)
        L20:
            return r3
        L21:
            r3 = move-exception
            Yue.C6179.m23129(r2, r4)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Object m5541(Yue.InterfaceC1632 r0, java.lang.Object r1, java.lang.Object r2, Yue.InterfaceC2839 r3, Yue.InterfaceC1598 r4, int r5, java.lang.Object r6) {
            r5 = r5 & 4
            if (r5 == 0) goto L8
            java.lang.Object r2 = Yue.C6179.m23130(r0)
        L8:
            java.lang.Object r0 = m5540(r0, r1, r2, r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC2466<T> m5542(Yue.InterfaceC2466<? super T> r1, Yue.InterfaceC1632 r2) {
            boolean r0 = r1 instanceof Yue.C5607
            if (r0 == 0) goto L6
            r0 = 1
            goto L8
        L6:
            boolean r0 = r1 instanceof Yue.C4414
        L8:
            if (r0 == 0) goto Lb
            goto L11
        Lb:
            Yue.ۥۣۢ۠ r0 = new Yue.ۥۣۢ۠
            r0.<init>(r1, r2)
            r1 = r0
        L11:
            return r1
    }
}
