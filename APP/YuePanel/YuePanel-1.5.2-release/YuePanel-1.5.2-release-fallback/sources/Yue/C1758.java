package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1758 {
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String m8350(@Yue.InterfaceC4418 java.lang.Object r0) {
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String m8351(@Yue.InterfaceC4418 java.lang.Object r0) {
            int r0 = java.lang.System.identityHashCode(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.String m8352(@Yue.InterfaceC4418 Yue.InterfaceC1598<?> r3) {
            boolean r0 = r3 instanceof Yue.C1871
            if (r0 == 0) goto L9
            java.lang.String r3 = r3.toString()
            goto L5b
        L9:
            r0 = 64
            Yue.ۥۡۦۧۤ$ۥ r1 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r1.<init>()     // Catch: java.lang.Throwable -> L28
            r1.append(r3)     // Catch: java.lang.Throwable -> L28
            r1.append(r0)     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = m8351(r3)     // Catch: java.lang.Throwable -> L28
            r1.append(r2)     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L28
            java.lang.Object r1 = Yue.C5388.m20377(r1)     // Catch: java.lang.Throwable -> L28
            goto L33
        L28:
            r1 = move-exception
            Yue.ۥۡۦۧۤ$ۥ r2 = Yue.C5388.f20029
            java.lang.Object r1 = Yue.C5391.m20390(r1)
            java.lang.Object r1 = Yue.C5388.m20377(r1)
        L33:
            java.lang.Throwable r2 = Yue.C5388.m20380(r1)
            if (r2 != 0) goto L3a
            goto L58
        L3a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r3 = m8351(r3)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
        L58:
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
        L5b:
            return r3
    }
}
