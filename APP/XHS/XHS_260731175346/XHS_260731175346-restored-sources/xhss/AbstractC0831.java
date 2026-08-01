package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛱᛷᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0831 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static volatile xhss.C0457 f2712;

    static {
            java.lang.String r0 = "Possibly running android unit test without robolectric"
            java.util.Map r1 = xhss.AbstractC0829.f2704     // Catch: java.lang.UnsatisfiedLinkError -> L28 java.lang.RuntimeException -> L2a
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
            xhss.AbstractC0829.m1410(r3, r2)     // Catch: java.lang.UnsatisfiedLinkError -> L28 java.lang.RuntimeException -> L2a
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
            xhss.ᛵᛳᛸᲇ r0 = new xhss.ᛵᛳᛸᲇ
            r0.<init>()
            xhss.AbstractC0831.f2712 = r0
            java.lang.Class<xhss.ᛵᛸᛷᛲ> r0 = xhss.C0504.class
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
