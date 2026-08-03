package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.Executor f947a;
    public final androidx.profileinstaller.c.InterfaceC0021c b;
    public final byte[] c;
    public final java.io.File d;
    public final java.lang.String e;
    public boolean f;
    public a.C0153g5[] g;
    public byte[] h;

    public b(android.content.res.AssetManager r1, java.util.concurrent.Executor r2, androidx.profileinstaller.c.InterfaceC0021c r3, java.lang.String r4, java.io.File r5) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.f = r1
            r0.f947a = r2
            r0.b = r3
            r0.e = r4
            r0.d = r5
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            r3 = 0
            if (r1 <= r2) goto L16
            goto L1f
        L16:
            switch(r1) {
                case 28: goto L1d;
                case 29: goto L1d;
                case 30: goto L1d;
                case 31: goto L1a;
                case 32: goto L1a;
                case 33: goto L1a;
                case 34: goto L1a;
                default: goto L19;
            }
        L19:
            goto L1f
        L1a:
            byte[] r3 = a.Lc.f165a
            goto L1f
        L1d:
            byte[] r3 = a.Lc.b
        L1f:
            r0.c = r3
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
            androidx.profileinstaller.c$c r1 = r0.b
            r1.b()
        L1d:
            r1 = 0
            return r1
    }

    public final void b(int r3, java.io.Serializable r4) {
            r2 = this;
            a.k0 r0 = new a.k0
            r1 = 2
            r0.<init>(r2, r3, r4, r1)
            java.util.concurrent.Executor r3 = r2.f947a
            r3.execute(r0)
            return
    }
}
