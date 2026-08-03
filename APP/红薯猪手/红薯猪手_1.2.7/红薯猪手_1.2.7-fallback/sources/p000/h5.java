package p000;

/* JADX INFO: loaded from: classes.dex */
public final class h5 implements p000.e0 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> f440;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final int f441;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f442;

    public h5(android.content.Context r6) {
            r5 = this;
            java.lang.StringBuilder r0 = p000.ic.f502
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            android.content.pm.ApplicationInfo r6 = r6.getApplicationInfo()
            int r6 = r6.flags
            r1 = 1048576(0x100000, float:1.469368E-39)
            r6 = r6 & r1
            r2 = 1
            r3 = 0
            if (r6 == 0) goto L19
            r6 = r2
            goto L1a
        L19:
            r6 = r3
        L1a:
            int r4 = r0.getMemoryClass()
            if (r6 == 0) goto L24
            int r4 = r0.getLargeMemoryClass()
        L24:
            int r4 = r4 * r1
            int r4 = r4 / 7
            r5.<init>()
            if (r4 <= 0) goto L38
            r5.f441 = r4
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r0 = 1061158912(0x3f400000, float:0.75)
            r6.<init>(r3, r0, r2)
            r5.f440 = r6
            return
        L38:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Max size must be positive."
            r6.<init>(r0)
            throw r6
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.graphics.Bitmap m192(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L15
            monitor-enter(r1)
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r1.f440     // Catch: java.lang.Throwable -> L12
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L12
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch: java.lang.Throwable -> L12
            if (r2 == 0) goto Lf
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            return r2
        Lf:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            r2 = 0
            return r2
        L12:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r2
        L15:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "key == null"
            r2.<init>(r0)
            throw r2
    }
}
