package com.bumptech.glide.load.engine.executor;

/* JADX INFO: loaded from: classes.dex */
final class RuntimeCompat {
    private static final java.lang.String CPU_LOCATION = "/sys/devices/system/cpu/";
    private static final java.lang.String CPU_NAME_REGEX = "cpu[0-9]+";
    private static final java.lang.String TAG = "GlideRuntimeCompat";


    private RuntimeCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int availableProcessors() {
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            return r0
    }

    private static int getCoreCountPre17() {
            java.lang.String r0 = "GlideRuntimeCompat"
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = "/sys/devices/system/cpu/"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = "cpu[0-9]+"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)     // Catch: java.lang.Throwable -> L20
            com.bumptech.glide.load.engine.executor.RuntimeCompat$1 r4 = new com.bumptech.glide.load.engine.executor.RuntimeCompat$1     // Catch: java.lang.Throwable -> L20
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L20
            java.io.File[] r0 = r2.listFiles(r4)     // Catch: java.lang.Throwable -> L20
            android.os.StrictMode.setThreadPolicy(r1)
            goto L34
        L20:
            r2 = move-exception
            r3 = 6
            boolean r3 = android.util.Log.isLoggable(r0, r3)     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L30
            java.lang.String r3 = "Failed to calculate accurate cpu count"
            android.util.Log.e(r0, r3, r2)     // Catch: java.lang.Throwable -> L2e
            goto L30
        L2e:
            r0 = move-exception
            goto L3f
        L30:
            android.os.StrictMode.setThreadPolicy(r1)
            r0 = 0
        L34:
            if (r0 == 0) goto L38
            int r0 = r0.length
            goto L39
        L38:
            r0 = 0
        L39:
            r1 = 1
            int r0 = java.lang.Math.max(r1, r0)
            return r0
        L3f:
            android.os.StrictMode.setThreadPolicy(r1)
            throw r0
    }
}
