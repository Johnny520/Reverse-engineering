package a;

/* JADX INFO: loaded from: classes.dex */
public final class gh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f488a;
    public static volatile java.util.List<java.lang.String> b;

    static {
            a.Y5 r0 = a.Y5.f351a
            a.gh.b = r0
            return
    }

    public static final java.util.List<java.io.File> a() {
            java.io.File r0 = b()
            java.util.List<java.lang.String> r1 = a.gh.b
            boolean r1 = r1.isEmpty()
            a.Y5 r2 = a.Y5.f351a
            if (r1 == 0) goto Lf
            goto L3c
        Lf:
            java.io.File[] r0 = r0.listFiles()
            if (r0 == 0) goto L3c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.length
            r3 = 0
        L1c:
            if (r3 >= r2) goto L3b
            r4 = r0[r3]
            boolean r5 = r4.isDirectory()
            if (r5 == 0) goto L38
            java.lang.String r5 = r4.getName()
            java.lang.String r6 = "getName(...)"
            a.C0193i9.d(r5, r6)
            boolean r5 = c(r5)
            if (r5 == 0) goto L38
            r1.add(r4)
        L38:
            int r3 = r3 + 1
            goto L1c
        L3b:
            return r1
        L3c:
            return r2
    }

    public static final java.io.File b() {
            android.content.Context r0 = a.C0435w1.p
            if (r0 == 0) goto Le
            java.io.File r0 = r0.getDataDir()
            java.lang.String r1 = "getDataDir(...)"
            a.C0193i9.d(r0, r1)
            return r0
        Le:
            boolean r0 = a.gh.f488a
            if (r0 != 0) goto L20
            r0 = 1
            a.gh.f488a = r0
            java.lang.String r0 = "WechatPaths"
            java.lang.String r1 = "AppContext 未就绪，回退默认 data 分区"
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            a.C0453x1.e(r0)
        L20:
            java.io.File r0 = new java.io.File
            java.io.File r1 = android.os.Environment.getDataDirectory()
            java.lang.String r2 = "data/com.tencent.mm"
            r0.<init>(r1, r2)
            return r0
    }

    public static final boolean c(java.lang.String r3) {
            int r0 = r3.length()
            r1 = 0
            if (r0 != 0) goto L8
            goto L3d
        L8:
            java.util.List<java.lang.String> r0 = a.gh.b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            goto L3d
        L11:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r0)
            java.lang.String r0 = "toLowerCase(...)"
            a.C0193i9.d(r3, r0)
            java.util.List<java.lang.String> r0 = a.gh.b
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L25
            goto L3d
        L25:
            java.util.Iterator r0 = r0.iterator()
        L29:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = a.Be.I(r3, r2, r1)
            if (r2 == 0) goto L29
            r3 = 1
            return r3
        L3d:
            return r1
    }
}
