package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6644 {
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final boolean m25537(@Yue.InterfaceC4418 Yue.C0843 r8) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r8, r0)
            r0 = 0
            Yue.ۥۣ۟ۢۨ r7 = new Yue.ۥۣ۟ۢۨ     // Catch: java.io.EOFException -> L3e
            r7.<init>()     // Catch: java.io.EOFException -> L3e
            long r1 = r8.m4889()     // Catch: java.io.EOFException -> L3e
            r3 = 64
            long r5 = Yue.C5196.m19522(r1, r3)     // Catch: java.io.EOFException -> L3e
            r3 = 0
            r1 = r8
            r2 = r7
            r1.m4825(r2, r3, r5)     // Catch: java.io.EOFException -> L3e
            r8 = r0
        L1d:
            r1 = 16
            if (r8 >= r1) goto L3c
            boolean r1 = r7.mo4827()     // Catch: java.io.EOFException -> L3e
            if (r1 == 0) goto L28
            goto L3c
        L28:
            int r1 = r7.mo4849()     // Catch: java.io.EOFException -> L3e
            boolean r2 = java.lang.Character.isISOControl(r1)     // Catch: java.io.EOFException -> L3e
            if (r2 == 0) goto L39
            boolean r1 = java.lang.Character.isWhitespace(r1)     // Catch: java.io.EOFException -> L3e
            if (r1 != 0) goto L39
            return r0
        L39:
            int r8 = r8 + 1
            goto L1d
        L3c:
            r8 = 1
            return r8
        L3e:
            return r0
    }
}
