package t3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.Executor f13032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t3.e f13033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f13034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.io.File f13035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f13036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t3.b[] f13038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f13039h;

    public a(android.content.res.AssetManager r1, java.util.concurrent.Executor r2, t3.e r3, java.lang.String r4, java.io.File r5) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.f13037f = r1
            r0.f13032a = r2
            r0.f13033b = r3
            r0.f13036e = r4
            r0.f13035d = r5
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r1 < r2) goto L17
            byte[] r1 = t3.f.f13053d
            goto L21
        L17:
            switch(r1) {
                case 27: goto L1f;
                case 28: goto L1c;
                case 29: goto L1c;
                case 30: goto L1c;
                default: goto L1a;
            }
        L1a:
            r1 = 0
            goto L21
        L1c:
            byte[] r1 = t3.f.f13054e
            goto L21
        L1f:
            byte[] r1 = t3.f.f13055f
        L21:
            r0.f13034c = r1
            return
    }

    public final java.io.FileInputStream a(android.content.res.AssetManager r1, java.lang.String r2) {
            r0 = this;
            android.content.res.AssetFileDescriptor r1 = r1.openFd(r2)     // Catch: java.io.FileNotFoundException -> L9
            java.io.FileInputStream r1 = r1.createInputStream()     // Catch: java.io.FileNotFoundException -> L9
            return r1
        L9:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            if (r1 == 0) goto L1d
            java.lang.String r2 = "compressed"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L1d
            t3.e r1 = r0.f13033b
            r1.a()
        L1d:
            r1 = 0
            return r1
    }

    public final void b(int r2, java.io.Serializable r3) {
            r1 = this;
            e9.o r0 = new e9.o
            r0.<init>(r1, r2, r3)
            java.util.concurrent.Executor r2 = r1.f13032a
            r2.execute(r0)
            return
    }
}
