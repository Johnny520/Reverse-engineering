package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class al {
    public static final defpackage.ds a = null;
    public static final java.util.concurrent.ThreadPoolExecutor b = null;
    public static final java.lang.Object c = null;
    public static final defpackage.u30 d = null;

    static {
            ds r0 = new ds
            r1 = 16
            r0.<init>(r1)
            defpackage.al.a = r0
            r00 r9 = new r00
            r9.<init>()
            java.util.concurrent.ThreadPoolExecutor r2 = new java.util.concurrent.ThreadPoolExecutor
            r0 = 10000(0x2710, float:1.4013E-41)
            long r5 = (long) r0
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingDeque r8 = new java.util.concurrent.LinkedBlockingDeque
            r8.<init>()
            r3 = 0
            r4 = 1
            r2.<init>(r3, r4, r5, r7, r8, r9)
            r0 = 1
            r2.allowCoreThreadTimeOut(r0)
            defpackage.al.b = r2
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.al.c = r0
            u30 r0 = new u30
            r0.<init>()
            defpackage.al.d = r0
            return
    }

    public static defpackage.zk a(java.lang.String r6, android.content.Context r7, defpackage.y1 r8, int r9) {
            ds r0 = defpackage.al.a
            java.lang.Object r1 = r0.a(r6)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L10
            zk r6 = new zk
            r6.<init>(r1)
            return r6
        L10:
            f2 r8 = defpackage.a80.m(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            java.lang.Object r1 = r8.b
            gl[] r1 = (defpackage.gl[]) r1
            int r8 = r8.a
            r2 = -3
            r3 = 1
            if (r8 == 0) goto L24
            if (r8 == r3) goto L22
        L20:
            r3 = r2
            goto L3d
        L22:
            r3 = -2
            goto L3d
        L24:
            if (r1 == 0) goto L3d
            int r8 = r1.length
            if (r8 != 0) goto L2a
            goto L3d
        L2a:
            int r8 = r1.length
            r3 = 0
            r4 = r3
        L2d:
            if (r4 >= r8) goto L3d
            r5 = r1[r4]
            int r5 = r5.e
            if (r5 == 0) goto L3a
            if (r5 >= 0) goto L38
            goto L20
        L38:
            r3 = r5
            goto L3d
        L3a:
            int r4 = r4 + 1
            goto L2d
        L3d:
            if (r3 == 0) goto L45
            zk r6 = new zk
            r6.<init>(r3)
            return r6
        L45:
            ct r8 = defpackage.b80.a
            android.graphics.Typeface r7 = r8.h(r7, r1, r9)
            if (r7 == 0) goto L56
            r0.b(r6, r7)
            zk r6 = new zk
            r6.<init>(r7)
            return r6
        L56:
            zk r6 = new zk
            r6.<init>(r2)
            return r6
        L5c:
            zk r6 = new zk
            r7 = -1
            r6.<init>(r7)
            return r6
    }
}
