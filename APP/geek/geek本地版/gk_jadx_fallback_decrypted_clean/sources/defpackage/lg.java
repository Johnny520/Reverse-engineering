package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lg {
    public final java.util.concurrent.Executor a;
    public final defpackage.jy b;
    public final byte[] c;
    public final java.io.File d;
    public final java.lang.String e;
    public boolean f;
    public defpackage.mg[] g;
    public byte[] h;

    public lg(android.content.res.AssetManager r1, java.util.concurrent.Executor r2, defpackage.jy r3, java.lang.String r4, java.io.File r5) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.f = r1
            r0.a = r2
            r0.b = r3
            r0.e = r4
            r0.d = r5
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            r3 = 0
            if (r1 <= r2) goto L16
            goto L25
        L16:
            switch(r1) {
                case 26: goto L23;
                case 27: goto L20;
                case 28: goto L1d;
                case 29: goto L1d;
                case 30: goto L1d;
                case 31: goto L1a;
                case 32: goto L1a;
                case 33: goto L1a;
                default: goto L19;
            }
        L19:
            goto L25
        L1a:
            byte[] r3 = defpackage.a80.i
            goto L25
        L1d:
            byte[] r3 = defpackage.a80.j
            goto L25
        L20:
            byte[] r3 = defpackage.a80.k
            goto L25
        L23:
            byte[] r3 = defpackage.a80.l
        L25:
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
            jy r1 = r0.b
            r1.g()
        L1d:
            r1 = 0
            return r1
    }

    public final void b(int r2, java.io.Serializable r3) {
            r1 = this;
            pd r0 = new pd
            r0.<init>(r1, r2, r3)
            java.util.concurrent.Executor r2 = r1.a
            r2.execute(r0)
            return
    }
}
