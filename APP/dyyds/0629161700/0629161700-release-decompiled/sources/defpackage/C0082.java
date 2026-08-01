package defpackage;

/* JADX INFO: renamed from: ᛱᛴᲁᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0082 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static volatile defpackage.C0082 f821;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final java.io.File f822 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public int f823;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public boolean f824;

    static {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/proc/self/fd"
            r0.<init>(r1)
            defpackage.C0082.f822 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static defpackage.C0082 m543() {
            ᛱᛴᲁᛴ r0 = defpackage.C0082.f821
            if (r0 != 0) goto L22
            java.lang.Class<ᛱᛴᲁᛴ> r0 = defpackage.C0082.class
            monitor-enter(r0)
            ᛱᛴᲁᛴ r1 = defpackage.C0082.f821     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            ᛱᛴᲁᛴ r1 = new ᛱᛴᲁᛴ     // Catch: java.lang.Throwable -> L1c
            r1.<init>()     // Catch: java.lang.Throwable -> L1c
            r2 = 1
            r1.f824 = r2     // Catch: java.lang.Throwable -> L1c
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L1c
            r3 = 0
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1c
            defpackage.C0082.f821 = r1     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r1 = move-exception
            goto L20
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            goto L22
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r1
        L22:
            ᛱᛴᲁᛴ r0 = defpackage.C0082.f821
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final boolean m544(int r8, int r9, boolean r10, boolean r11) {
            r7 = this;
            java.lang.String r0 = ", limit 20000"
            r1 = 2
            r2 = 0
            if (r10 != 0) goto L16
            java.lang.String r7 = "HardwareConfig"
            boolean r7 = android.util.Log.isLoggable(r7, r1)
            if (r7 == 0) goto L98
            java.lang.String r7 = "HardwareConfig"
            java.lang.String r8 = "Hardware config disallowed by caller"
            android.util.Log.v(r7, r8)
            return r2
        L16:
            if (r11 == 0) goto L28
            java.lang.String r7 = "HardwareConfig"
            boolean r7 = android.util.Log.isLoggable(r7, r1)
            if (r7 == 0) goto L98
            java.lang.String r7 = "HardwareConfig"
            java.lang.String r8 = "Hardware config disallowed because exif orientation is required"
            android.util.Log.v(r7, r8)
            return r2
        L28:
            if (r8 < 0) goto L89
            if (r9 >= 0) goto L2d
            goto L89
        L2d:
            java.lang.String r8 = "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors "
            monitor-enter(r7)
            int r9 = r7.f823     // Catch: java.lang.Throwable -> L6f
            r10 = 1
            int r9 = r9 + r10
            r7.f823 = r9     // Catch: java.lang.Throwable -> L6f
            r11 = 50
            if (r9 < r11) goto L71
            r7.f823 = r2     // Catch: java.lang.Throwable -> L6f
            java.io.File r9 = defpackage.C0082.f822     // Catch: java.lang.Throwable -> L6f
            java.lang.String[] r9 = r9.list()     // Catch: java.lang.Throwable -> L6f
            int r9 = r9.length     // Catch: java.lang.Throwable -> L6f
            r3 = 20000(0x4e20, double:9.8813E-320)
            long r5 = (long) r9     // Catch: java.lang.Throwable -> L6f
            int r11 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r11 >= 0) goto L4c
            r11 = r10
            goto L4d
        L4c:
            r11 = r2
        L4d:
            r7.f824 = r11     // Catch: java.lang.Throwable -> L6f
            if (r11 != 0) goto L71
            java.lang.String r11 = "Downsampler"
            r3 = 5
            boolean r11 = android.util.Log.isLoggable(r11, r3)     // Catch: java.lang.Throwable -> L6f
            if (r11 == 0) goto L71
            java.lang.String r11 = "Downsampler"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r3.<init>(r8)     // Catch: java.lang.Throwable -> L6f
            r3.append(r9)     // Catch: java.lang.Throwable -> L6f
            r3.append(r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r8 = r3.toString()     // Catch: java.lang.Throwable -> L6f
            android.util.Log.w(r11, r8)     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r8 = move-exception
            goto L87
        L71:
            boolean r8 = r7.f824     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r7)
            if (r8 != 0) goto L86
            java.lang.String r7 = "HardwareConfig"
            boolean r7 = android.util.Log.isLoggable(r7, r1)
            if (r7 == 0) goto L98
            java.lang.String r7 = "HardwareConfig"
            java.lang.String r8 = "Hardware config disallowed because there are insufficient FDs"
            android.util.Log.v(r7, r8)
            return r2
        L86:
            return r10
        L87:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L6f
            throw r8
        L89:
            java.lang.String r7 = "HardwareConfig"
            boolean r7 = android.util.Log.isLoggable(r7, r1)
            if (r7 == 0) goto L98
            java.lang.String r7 = "HardwareConfig"
            java.lang.String r8 = "Hardware config disallowed because of invalid dimensions"
            android.util.Log.v(r7, r8)
        L98:
            return r2
    }
}
