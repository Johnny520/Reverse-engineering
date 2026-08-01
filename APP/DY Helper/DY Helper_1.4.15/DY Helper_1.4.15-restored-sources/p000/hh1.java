package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class hh1 {

    /* JADX INFO: renamed from: α */
    public static final java.lang.reflect.Method f4741 = null;

    /* JADX INFO: renamed from: β */
    public static final java.lang.reflect.Method f4742 = null;

    static {
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            java.lang.reflect.Method[] r1 = r0.getMethods()
            r1.getClass()
            int r2 = r1.length
            r3 = 0
            r4 = r3
        Lc:
            r5 = 0
            if (r4 >= r2) goto L32
            r6 = r1[r4]
            java.lang.String r7 = r6.getName()
            java.lang.String r8 = "addSuppressed"
            boolean r7 = p000.ln0.m3626(r7, r8)
            if (r7 == 0) goto L2f
            java.lang.Class[] r7 = r6.getParameterTypes()
            r7.getClass()
            java.lang.Object r7 = p000.AbstractC0312g7.m2258(r7)
            boolean r7 = p000.ln0.m3626(r7, r0)
            if (r7 == 0) goto L2f
            goto L33
        L2f:
            int r4 = r4 + 1
            goto Lc
        L32:
            r6 = r5
        L33:
            p000.hh1.f4741 = r6
            int r0 = r1.length
        L36:
            if (r3 >= r0) goto L4b
            r2 = r1[r3]
            java.lang.String r4 = r2.getName()
            java.lang.String r6 = "getSuppressed"
            boolean r4 = p000.ln0.m3626(r4, r6)
            if (r4 == 0) goto L48
            r5 = r2
            goto L4b
        L48:
            int r3 = r3 + 1
            goto L36
        L4b:
            p000.hh1.f4742 = r5
            return
    }
}
