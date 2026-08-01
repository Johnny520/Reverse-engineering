package defpackage;

/* JADX INFO: renamed from: ᲀᛶᛷᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1692 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static volatile defpackage.C0800 f7550;

    static {
            java.lang.String r0 = "Possibly running android unit test without robolectric"
            java.util.Map r1 = defpackage.AbstractC2178.f9258     // Catch: java.lang.UnsatisfiedLinkError -> L28 java.lang.RuntimeException -> L2a
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.UnsatisfiedLinkError -> L28 java.lang.RuntimeException -> L2a
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.UnsatisfiedLinkError -> L28 java.lang.RuntimeException -> L2a
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.UnsatisfiedLinkError -> L28 java.lang.RuntimeException -> L2a
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.UnsatisfiedLinkError -> L28 java.lang.RuntimeException -> L2a
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.UnsatisfiedLinkError -> L28 java.lang.RuntimeException -> L2a
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.UnsatisfiedLinkError -> L28 java.lang.RuntimeException -> L2a
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.UnsatisfiedLinkError -> L28 java.lang.RuntimeException -> L2a
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.UnsatisfiedLinkError -> L28 java.lang.RuntimeException -> L2a
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.UnsatisfiedLinkError -> L28 java.lang.RuntimeException -> L2a
            defpackage.AbstractC2178.m3578(r3, r2)     // Catch: java.lang.UnsatisfiedLinkError -> L28 java.lang.RuntimeException -> L2a
            goto Lc
        L28:
            r1 = move-exception
            goto L2c
        L2a:
            r1 = move-exception
            goto L35
        L2c:
            java.io.PrintStream r2 = java.lang.System.err
            r2.println(r0)
            r1.printStackTrace()
            goto L3d
        L35:
            java.io.PrintStream r2 = java.lang.System.err
            r2.println(r0)
            r1.printStackTrace()
        L3d:
            ᛴᲈᲀᲇ r0 = new ᛴᲈᲀᲇ
            r0.<init>()
            defpackage.AbstractC1692.f7550 = r0
            java.lang.Class<ᲈᛴᛶᲁ> r0 = defpackage.C2225.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger.getLogger(r0)
            return
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }
}
