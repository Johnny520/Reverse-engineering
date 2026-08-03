package wd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mh.b f20780a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.regex.Pattern f20781b = null;

    static {
            java.lang.Class<wd.a> r0 = wd.a.class
            mh.b r0 = mh.d.b(r0)
            wd.a.f20780a = r0
            java.lang.String r0 = "classes([1-9]\\d*)\\.dex"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            wd.a.f20781b = r0
            return
    }

    public static int a(java.lang.String r3) {
            java.lang.String r0 = "classes.dex"
            boolean r0 = r0.equals(r3)
            r1 = 1
            if (r0 == 0) goto La
            return r1
        La:
            r0 = -1
            java.util.regex.Pattern r2 = wd.a.f20781b     // Catch: java.lang.Exception -> L2a
            java.util.regex.Matcher r3 = r2.matcher(r3)     // Catch: java.lang.Exception -> L2a
            boolean r2 = r3.matches()     // Catch: java.lang.Exception -> L2a
            if (r2 != 0) goto L18
            goto L24
        L18:
            java.lang.String r3 = r3.group(r1)     // Catch: java.lang.Exception -> L2a
            java.lang.String r1 = "1"
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Exception -> L2a
            if (r1 == 0) goto L25
        L24:
            return r0
        L25:
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Exception -> L2a
            return r3
        L2a:
            r3 = move-exception
            mh.b r1 = wd.a.f20780a
            java.lang.String r2 = "Failed to parse source classes index"
            r1.t(r2, r3)
            return r0
    }
}
