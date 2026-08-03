package ub;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f13669a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f13670b = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            ub.b.f13669a = r0
            java.lang.String r0 = ".kvb"
            java.lang.String r1 = ".kvc"
            java.lang.String r2 = ".kva"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            ub.b.f13670b = r0
            return
    }

    public static ac.o a(android.content.Context r6, java.lang.String r7) {
            java.io.File r6 = d(r6)
            ac.n r0 = new ac.n
            java.lang.String r6 = r6.getAbsolutePath()
            r0.<init>(r6, r7)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r0.f187a
            r6.append(r7)
            java.lang.String r7 = r0.f188b
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.util.concurrent.ConcurrentHashMap r7 = ac.n.f186c
            java.lang.Object r1 = r7.get(r6)
            ac.o r1 = (ac.o) r1
            if (r1 != 0) goto L4a
            java.lang.Class<ac.n> r2 = ac.n.class
            monitor-enter(r2)
            java.lang.Object r1 = r7.get(r6)     // Catch: java.lang.Throwable -> L44
            ac.o r1 = (ac.o) r1     // Catch: java.lang.Throwable -> L44
            if (r1 != 0) goto L46
            ac.o r1 = new ac.o     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = r0.f187a     // Catch: java.lang.Throwable -> L44
            java.lang.String r0 = r0.f188b     // Catch: java.lang.Throwable -> L44
            r4 = 0
            r5 = 0
            r1.<init>(r3, r0, r4, r5)     // Catch: java.lang.Throwable -> L44
            r7.put(r6, r1)     // Catch: java.lang.Throwable -> L44
            goto L46
        L44:
            r6 = move-exception
            goto L48
        L46:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L44
            return r1
        L48:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L44
            throw r6
        L4a:
            return r1
    }

    public static boolean b(java.io.File r7) {
            java.lang.String[] r0 = ub.b.f13670b
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L5:
            if (r3 >= r1) goto L1f
            r4 = r0[r3]
            java.io.File r5 = new java.io.File
            java.lang.String r6 = "Hchat_global_config"
            java.lang.String r4 = wb.en.g(r6, r4)
            r5.<init>(r7, r4)
            boolean r4 = r5.isFile()
            if (r4 == 0) goto L1c
            r7 = 1
            return r7
        L1c:
            int r3 = r3 + 1
            goto L5
        L1f:
            return r2
    }

    public static final android.content.SharedPreferences c(android.content.Context r3, java.lang.String r4) {
            r3.getClass()
            r4.getClass()
            android.content.Context r0 = r3.getApplicationContext()
            if (r0 == 0) goto Ld
            r3 = r0
        Ld:
            java.lang.String r0 = r3.getPackageName()
            java.lang.String r1 = ":"
            java.lang.String r0 = wb.en.h(r0, r1, r4)
            java.util.concurrent.ConcurrentHashMap r1 = ub.b.f13669a
            java.lang.Object r2 = r1.get(r0)
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            if (r2 == 0) goto L22
            return r2
        L22:
            ac.o r3 = a(r3, r4)
            java.lang.Object r4 = r1.putIfAbsent(r0, r3)
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            if (r4 == 0) goto L2f
            return r4
        L2f:
            return r3
    }

    public static final java.io.File d(android.content.Context r3) {
            r3.getClass()
            java.io.File r3 = r3.getDataDir()     // Catch: java.lang.Throwable -> L8
            goto Lc
        L8:
            java.io.File r3 = r3.getFilesDir()
        Lc:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "Hchat"
            r0.<init>(r3, r1)
            boolean r3 = r0.isDirectory()
            if (r3 != 0) goto L34
            boolean r3 = r0.mkdirs()
            if (r3 != 0) goto L34
            java.lang.String r3 = r0.getAbsolutePath()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:Storage] 创建目录失败: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            fb.v0.m(r3)
        L34:
            return r0
    }
}
