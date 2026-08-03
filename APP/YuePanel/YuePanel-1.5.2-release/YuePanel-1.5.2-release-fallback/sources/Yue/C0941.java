package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C0941 {
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final void m5353(Yue.InterfaceC1598<?> r1, java.lang.Throwable r2) {
            Yue.ۥۡۦۧۤ$ۥ r0 = Yue.C5388.f20029
            java.lang.Object r0 = Yue.C5391.m20390(r2)
            java.lang.Object r0 = Yue.C5388.m20377(r0)
            r1.resumeWith(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final void m5354(Yue.InterfaceC1598<?> r0, Yue.InterfaceC2823<Yue.C6593> r1) {
            r1.invoke()     // Catch: java.lang.Throwable -> L4
            goto L8
        L4:
            r1 = move-exception
            m5353(r0, r1)
        L8:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m5355(@Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r3, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r4) {
            Yue.ۥ۟ۧۤۢ r3 = Yue.C3332.m13940(r3)     // Catch: java.lang.Throwable -> L12
            Yue.ۥۡۦۧۤ$ۥ r0 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L12
            Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = Yue.C5388.m20377(r0)     // Catch: java.lang.Throwable -> L12
            r1 = 2
            r2 = 0
            Yue.C1872.m8755(r3, r0, r2, r1, r2)     // Catch: java.lang.Throwable -> L12
            goto L16
        L12:
            r3 = move-exception
            m5353(r4, r3)
        L16:
            return
    }

    @Yue.InterfaceC3324
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> void m5356(@Yue.InterfaceC4418 Yue.InterfaceC2825<? super Yue.InterfaceC1598<? super T>, ? extends java.lang.Object> r3, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super T> r4) {
            Yue.ۥ۟ۧۤۢ r3 = Yue.C3332.m13937(r3, r4)     // Catch: java.lang.Throwable -> L16
            Yue.ۥ۟ۧۤۢ r3 = Yue.C3332.m13940(r3)     // Catch: java.lang.Throwable -> L16
            Yue.ۥۡۦۧۤ$ۥ r0 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L16
            Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L16
            java.lang.Object r0 = Yue.C5388.m20377(r0)     // Catch: java.lang.Throwable -> L16
            r1 = 2
            r2 = 0
            Yue.C1872.m8755(r3, r0, r2, r1, r2)     // Catch: java.lang.Throwable -> L16
            goto L1a
        L16:
            r3 = move-exception
            m5353(r4, r3)
        L1a:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <R, T> void m5357(@Yue.InterfaceC4418 Yue.InterfaceC2839<? super R, ? super Yue.InterfaceC1598<? super T>, ? extends java.lang.Object> r0, R r1, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super T> r2, @Yue.InterfaceC4543 Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r3) {
            Yue.ۥ۟ۧۤۢ r0 = Yue.C3332.m13938(r0, r1, r2)     // Catch: java.lang.Throwable -> L14
            Yue.ۥ۟ۧۤۢ r0 = Yue.C3332.m13940(r0)     // Catch: java.lang.Throwable -> L14
            Yue.ۥۡۦۧۤ$ۥ r1 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L14
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L14
            java.lang.Object r1 = Yue.C5388.m20377(r1)     // Catch: java.lang.Throwable -> L14
            Yue.C1872.m8754(r0, r1, r3)     // Catch: java.lang.Throwable -> L14
            goto L18
        L14:
            r0 = move-exception
            m5353(r2, r0)
        L18:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ void m5358(Yue.InterfaceC2839 r0, java.lang.Object r1, Yue.InterfaceC1598 r2, Yue.InterfaceC2825 r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            m5357(r0, r1, r2, r3)
            return
    }
}
