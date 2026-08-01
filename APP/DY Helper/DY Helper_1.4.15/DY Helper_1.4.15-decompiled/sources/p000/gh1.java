package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class gh1 {

    /* JADX INFO: renamed from: α */
    public static volatile p000.C0268f0 f4375;

    static {
            java.lang.String r0 = "Possibly running android unit test without robolectric"
            java.util.Map r1 = p000.AbstractC0608o2.f7872     // Catch: java.lang.UnsatisfiedLinkError -> L28 java.lang.RuntimeException -> L2a
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
            p000.AbstractC0608o2.m4157(r3, r2)     // Catch: java.lang.UnsatisfiedLinkError -> L28 java.lang.RuntimeException -> L2a
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
            f0 r0 = new f0
            r0.<init>()
            p000.gh1.f4375 = r0
            java.lang.Class<t41> r0 = p000.t41.class
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
