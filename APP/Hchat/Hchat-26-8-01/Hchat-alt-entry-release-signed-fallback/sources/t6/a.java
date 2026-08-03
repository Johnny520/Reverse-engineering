package t6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            return
    }

    public static final java.lang.Class a(java.lang.ClassLoader r1, java.lang.String r2) {
            if (r1 != 0) goto L3
            r1 = 0
        L3:
            if (r1 == 0) goto Lb
            r0 = 0
            java.lang.Class r1 = java.lang.Class.forName(r2, r0, r1)
            goto Lf
        Lb:
            java.lang.Class r1 = java.lang.Class.forName(r2)
        Lf:
            if (r1 == 0) goto L12
            return r1
        L12:
            java.lang.String r1 = "JVM class not resolved: "
            okio.a.p(r2, r1)
            r1 = 0
            return r1
    }
}
