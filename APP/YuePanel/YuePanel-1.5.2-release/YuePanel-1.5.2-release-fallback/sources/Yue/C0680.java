package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3421(name = "AutoCloseableKt")
public final class C0680 {
    @Yue.InterfaceC4986
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final void m4363(@Yue.InterfaceC4543 java.lang.AutoCloseable r0, @Yue.InterfaceC4543 java.lang.Throwable r1) {
            if (r0 == 0) goto L10
            if (r1 != 0) goto L8
            r0.close()
            goto L10
        L8:
            r0.close()     // Catch: java.lang.Throwable -> Lc
            goto L10
        Lc:
            r0 = move-exception
            Yue.C2268.m10468(r1, r0)
        L10:
            return
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <T extends java.lang.AutoCloseable, R> R m4364(T r2, Yue.InterfaceC2825<? super T, ? extends R> r3) {
            java.lang.String r0 = "block"
            Yue.C3329.m13906(r3, r0)
            r0 = 1
            java.lang.Object r3 = r3.invoke(r2)     // Catch: java.lang.Throwable -> L15
            Yue.C3249.m13687(r0)
            r1 = 0
            m4363(r2, r1)
            Yue.C3249.m13686(r0)
            return r3
        L15:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r1 = move-exception
            Yue.C3249.m13687(r0)
            m4363(r2, r3)
            Yue.C3249.m13686(r0)
            throw r1
    }
}
