package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3421(name = "CloseableKt")
public final class C1173 {
    @Yue.InterfaceC4986
    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final void m6114(@Yue.InterfaceC4543 java.io.Closeable r0, @Yue.InterfaceC4543 java.lang.Throwable r1) {
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
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <T extends java.io.Closeable, R> R m6115(T r3, Yue.InterfaceC2825<? super T, ? extends R> r4) {
            java.lang.String r0 = "block"
            Yue.C3329.m13906(r4, r0)
            r0 = 0
            r1 = 1
            java.lang.Object r4 = r4.invoke(r3)     // Catch: java.lang.Throwable -> L22
            Yue.C3249.m13687(r1)
            boolean r0 = Yue.C4778.m19027(r1, r1, r0)
            if (r0 == 0) goto L19
            r0 = 0
            m6114(r3, r0)
            goto L1e
        L19:
            if (r3 == 0) goto L1e
            r3.close()
        L1e:
            Yue.C3249.m13686(r1)
            return r4
        L22:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L24
        L24:
            r2 = move-exception
            Yue.C3249.m13687(r1)
            boolean r0 = Yue.C4778.m19027(r1, r1, r0)
            if (r0 != 0) goto L34
            if (r3 == 0) goto L37
            r3.close()     // Catch: java.lang.Throwable -> L37
            goto L37
        L34:
            m6114(r3, r4)
        L37:
            Yue.C3249.m13686(r1)
            throw r2
    }
}
