package dd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mh.b f2200a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static java.lang.String f2201b;

    static {
            java.lang.Class<dd.a> r0 = dd.a.class
            mh.b r0 = mh.d.b(r0)
            dd.a.f2200a = r0
            return
    }

    public static java.util.ArrayList a() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            be.f r1 = new be.f
            r1.<init>()
            r0.add(r1)
            be.d r1 = new be.d
            r1.<init>()
            r0.add(r1)
            be.b r1 = new be.b
            r2 = 13
            r1.<init>(r2)
            r0.add(r1)
            be.b r1 = new be.b
            r2 = 6
            r1.<init>(r2)
            r0.add(r1)
            return r0
    }

    public static java.lang.String b() {
            java.lang.String r0 = dd.a.f2201b
            if (r0 != 0) goto L57
            java.lang.Class<dd.a> r0 = dd.a.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Exception -> L4b
            if (r0 == 0) goto L53
            java.lang.String r1 = "META-INF/MANIFEST.MF"
            java.util.Enumeration r0 = r0.getResources(r1)     // Catch: java.lang.Exception -> L4b
        L12:
            boolean r1 = r0.hasMoreElements()     // Catch: java.lang.Exception -> L4b
            if (r1 == 0) goto L53
            java.lang.Object r1 = r0.nextElement()     // Catch: java.lang.Exception -> L4b
            java.net.URL r1 = (java.net.URL) r1     // Catch: java.lang.Exception -> L4b
            java.io.InputStream r1 = r1.openStream()     // Catch: java.lang.Exception -> L4b
            java.util.jar.Manifest r2 = new java.util.jar.Manifest     // Catch: java.lang.Throwable -> L3f
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L3f
            java.util.jar.Attributes r2 = r2.getMainAttributes()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = "jadx-version"
            java.lang.String r2 = r2.getValue(r3)     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L39
            if (r1 == 0) goto L55
            r1.close()     // Catch: java.lang.Exception -> L4b
            goto L55
        L39:
            if (r1 == 0) goto L12
            r1.close()     // Catch: java.lang.Exception -> L4b
            goto L12
        L3f:
            r0 = move-exception
            if (r1 == 0) goto L4a
            r1.close()     // Catch: java.lang.Throwable -> L46
            goto L4a
        L46:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch: java.lang.Exception -> L4b
        L4a:
            throw r0     // Catch: java.lang.Exception -> L4b
        L4b:
            r0 = move-exception
            mh.b r1 = dd.a.f2200a
            java.lang.String r2 = "Can't get manifest file"
            r1.e(r2, r0)
        L53:
            java.lang.String r2 = "dev"
        L55:
            dd.a.f2201b = r2
        L57:
            java.lang.String r0 = dd.a.f2201b
            return r0
    }
}
