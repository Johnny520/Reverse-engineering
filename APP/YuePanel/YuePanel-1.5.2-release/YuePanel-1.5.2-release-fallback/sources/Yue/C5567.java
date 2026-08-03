package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۨ۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5567 {
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final <R> java.lang.Object m20871(@Yue.InterfaceC4418 Yue.InterfaceC2825<? super Yue.InterfaceC5553<? super R>, Yue.C6593> r1, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super R> r2) {
            Yue.ۥۣۢ۟ۥ r0 = new Yue.ۥۣۢ۟ۥ
            r0.<init>(r2)
            r1.invoke(r0)     // Catch: java.lang.Throwable -> L9
            goto Ld
        L9:
            r1 = move-exception
            r0.m25369(r1)
        Ld:
            java.lang.Object r1 = r0.m25370()
            java.lang.Object r0 = Yue.C3341.m13947()
            if (r1 != r0) goto L1a
            Yue.C1757.m8349(r2)
        L1a:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <R> java.lang.Object m20872(Yue.InterfaceC2825<? super Yue.InterfaceC5553<? super R>, Yue.C6593> r1, Yue.InterfaceC1598<? super R> r2) {
            r0 = 0
            Yue.C3249.m13688(r0)
            Yue.ۥۣۢ۟ۥ r0 = new Yue.ۥۣۢ۟ۥ
            r0.<init>(r2)
            r1.invoke(r0)     // Catch: java.lang.Throwable -> Ld
            goto L11
        Ld:
            r1 = move-exception
            r0.m25369(r1)
        L11:
            java.lang.Object r1 = r0.m25370()
            java.lang.Object r0 = Yue.C3341.m13947()
            if (r1 != r0) goto L1e
            Yue.C1757.m8349(r2)
        L1e:
            r2 = 1
            Yue.C3249.m13688(r2)
            return r1
    }
}
