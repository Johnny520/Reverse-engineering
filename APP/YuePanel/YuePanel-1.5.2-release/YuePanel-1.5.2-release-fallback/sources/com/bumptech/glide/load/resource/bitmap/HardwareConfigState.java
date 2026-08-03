package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class HardwareConfigState {
    public static final boolean BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED = false;
    private static final java.io.File FD_SIZE_LIST = null;

    @Yue.InterfaceC1123(api = 28)
    public static final boolean HARDWARE_BITMAPS_SUPPORTED = false;
    private static final int MAXIMUM_FDS_FOR_HARDWARE_CONFIGS_P = 20000;
    private static final int MINIMUM_DECODES_BETWEEN_FD_CHECKS = 50;

    @java.lang.Deprecated
    public static final int NO_MAX_FD_COUNT = -1;
    private static final int REDUCED_MAX_FDS_FOR_HARDWARE_CONFIGS_P = 500;
    private static final java.lang.String TAG = "HardwareConfig";
    private static volatile com.bumptech.glide.load.resource.bitmap.HardwareConfigState instance;

    @Yue.InterfaceC2947("this")
    private int decodesSinceLastFdCheck;

    @Yue.InterfaceC2947("this")
    private boolean isFdSizeBelowHardwareLimit;
    private final java.util.concurrent.atomic.AtomicBoolean isHardwareConfigAllowedByAppState;
    private final int sdkBasedMaxFdCount;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 0
            r3 = 1
            if (r0 >= r1) goto La
            r1 = r3
            goto Lb
        La:
            r1 = r2
        Lb:
            com.bumptech.glide.load.resource.bitmap.HardwareConfigState.BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED = r1
            r1 = 28
            if (r0 < r1) goto L12
            r2 = r3
        L12:
            com.bumptech.glide.load.resource.bitmap.HardwareConfigState.HARDWARE_BITMAPS_SUPPORTED = r2
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/proc/self/fd"
            r0.<init>(r1)
            com.bumptech.glide.load.resource.bitmap.HardwareConfigState.FD_SIZE_LIST = r0
            return
    }

    @Yue.InterfaceC6959
    public HardwareConfigState() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.isFdSizeBelowHardwareLimit = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.isHardwareConfigAllowedByAppState = r0
            r0 = 20000(0x4e20, float:2.8026E-41)
            r2.sdkBasedMaxFdCount = r0
            return
    }

    private boolean areHardwareBitmapsBlockedByAppState() {
            r1 = this;
            boolean r0 = com.bumptech.glide.load.resource.bitmap.HardwareConfigState.BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED
            if (r0 == 0) goto Le
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.isHardwareConfigAllowedByAppState
            boolean r0 = r0.get()
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public static com.bumptech.glide.load.resource.bitmap.HardwareConfigState getInstance() {
            com.bumptech.glide.load.resource.bitmap.HardwareConfigState r0 = com.bumptech.glide.load.resource.bitmap.HardwareConfigState.instance
            if (r0 != 0) goto L19
            java.lang.Class<com.bumptech.glide.load.resource.bitmap.HardwareConfigState> r0 = com.bumptech.glide.load.resource.bitmap.HardwareConfigState.class
            monitor-enter(r0)
            com.bumptech.glide.load.resource.bitmap.HardwareConfigState r1 = com.bumptech.glide.load.resource.bitmap.HardwareConfigState.instance     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bumptech.glide.load.resource.bitmap.HardwareConfigState r1 = new com.bumptech.glide.load.resource.bitmap.HardwareConfigState     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bumptech.glide.load.resource.bitmap.HardwareConfigState.instance = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.bumptech.glide.load.resource.bitmap.HardwareConfigState r0 = com.bumptech.glide.load.resource.bitmap.HardwareConfigState.instance
            return r0
    }

    private int getMaxFdCount() {
            r1 = this;
            boolean r0 = isHardwareBitmapCountReducedOnApi28ByB139097735()
            if (r0 == 0) goto L9
            r0 = 500(0x1f4, float:7.0E-43)
            return r0
        L9:
            int r0 = r1.sdkBasedMaxFdCount
            return r0
    }

    private synchronized boolean isFdSizeBelowHardwareLimit() {
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.decodesSinceLastFdCheck     // Catch: java.lang.Throwable -> L4d
            r1 = 1
            int r0 = r0 + r1
            r7.decodesSinceLastFdCheck = r0     // Catch: java.lang.Throwable -> L4d
            r2 = 50
            if (r0 < r2) goto L4f
            r0 = 0
            r7.decodesSinceLastFdCheck = r0     // Catch: java.lang.Throwable -> L4d
            java.io.File r2 = com.bumptech.glide.load.resource.bitmap.HardwareConfigState.FD_SIZE_LIST     // Catch: java.lang.Throwable -> L4d
            java.lang.String[] r2 = r2.list()     // Catch: java.lang.Throwable -> L4d
            int r2 = r2.length     // Catch: java.lang.Throwable -> L4d
            int r3 = r7.getMaxFdCount()     // Catch: java.lang.Throwable -> L4d
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L4d
            long r5 = (long) r2     // Catch: java.lang.Throwable -> L4d
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 >= 0) goto L20
            goto L21
        L20:
            r1 = r0
        L21:
            r7.isFdSizeBelowHardwareLimit = r1     // Catch: java.lang.Throwable -> L4d
            if (r1 != 0) goto L4f
            java.lang.String r0 = "Downsampler"
            r1 = 5
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L4f
            java.lang.String r0 = "Downsampler"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            r1.<init>()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r5 = "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors "
            r1.append(r5)     // Catch: java.lang.Throwable -> L4d
            r1.append(r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = ", limit "
            r1.append(r2)     // Catch: java.lang.Throwable -> L4d
            r1.append(r3)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L4d
            android.util.Log.w(r0, r1)     // Catch: java.lang.Throwable -> L4d
            goto L4f
        L4d:
            r0 = move-exception
            goto L53
        L4f:
            boolean r0 = r7.isFdSizeBelowHardwareLimit     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r7)
            return r0
        L53:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4d
            throw r0
    }

    private static boolean isHardwareBitmapCountReducedOnApi28ByB139097735() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 0
            if (r0 == r1) goto L8
            return r2
        L8:
            java.lang.String r15 = "ONEPLUS A6010"
            java.lang.String r16 = "ONEPLUS A6013"
            java.lang.String r3 = "GM1900"
            java.lang.String r4 = "GM1901"
            java.lang.String r5 = "GM1903"
            java.lang.String r6 = "GM1911"
            java.lang.String r7 = "GM1915"
            java.lang.String r8 = "ONEPLUS A3000"
            java.lang.String r9 = "ONEPLUS A3010"
            java.lang.String r10 = "ONEPLUS A5010"
            java.lang.String r11 = "ONEPLUS A5000"
            java.lang.String r12 = "ONEPLUS A3003"
            java.lang.String r13 = "ONEPLUS A6000"
            java.lang.String r14 = "ONEPLUS A6003"
            java.lang.String[] r0 = new java.lang.String[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16}
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.Iterator r0 = r0.iterator()
        L30:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = android.os.Build.MODEL
            boolean r1 = r3.startsWith(r1)
            if (r1 == 0) goto L30
            r0 = 1
            return r0
        L46:
            return r2
    }

    public void blockHardwareBitmaps() {
            r2 = this;
            com.bumptech.glide.util.Util.assertMainThread()
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.isHardwareConfigAllowedByAppState
            r1 = 0
            r0.set(r1)
            return
    }

    public boolean isHardwareConfigAllowed(int r4, int r5, boolean r6, boolean r7) {
            r3 = this;
            r0 = 0
            r1 = 2
            java.lang.String r2 = "HardwareConfig"
            if (r6 != 0) goto L12
            boolean r4 = android.util.Log.isLoggable(r2, r1)
            if (r4 == 0) goto L11
            java.lang.String r4 = "Hardware config disallowed by caller"
            android.util.Log.v(r2, r4)
        L11:
            return r0
        L12:
            boolean r6 = com.bumptech.glide.load.resource.bitmap.HardwareConfigState.HARDWARE_BITMAPS_SUPPORTED
            if (r6 != 0) goto L22
            boolean r4 = android.util.Log.isLoggable(r2, r1)
            if (r4 == 0) goto L21
            java.lang.String r4 = "Hardware config disallowed by sdk"
            android.util.Log.v(r2, r4)
        L21:
            return r0
        L22:
            boolean r6 = r3.areHardwareBitmapsBlockedByAppState()
            if (r6 == 0) goto L34
            boolean r4 = android.util.Log.isLoggable(r2, r1)
            if (r4 == 0) goto L33
            java.lang.String r4 = "Hardware config disallowed by app state"
            android.util.Log.v(r2, r4)
        L33:
            return r0
        L34:
            if (r7 == 0) goto L42
            boolean r4 = android.util.Log.isLoggable(r2, r1)
            if (r4 == 0) goto L41
            java.lang.String r4 = "Hardware config disallowed because exif orientation is required"
            android.util.Log.v(r2, r4)
        L41:
            return r0
        L42:
            if (r4 < 0) goto L5b
            if (r5 >= 0) goto L47
            goto L5b
        L47:
            boolean r4 = r3.isFdSizeBelowHardwareLimit()
            if (r4 != 0) goto L59
            boolean r4 = android.util.Log.isLoggable(r2, r1)
            if (r4 == 0) goto L58
            java.lang.String r4 = "Hardware config disallowed because there are insufficient FDs"
            android.util.Log.v(r2, r4)
        L58:
            return r0
        L59:
            r4 = 1
            return r4
        L5b:
            boolean r4 = android.util.Log.isLoggable(r2, r1)
            if (r4 == 0) goto L66
            java.lang.String r4 = "Hardware config disallowed because of invalid dimensions"
            android.util.Log.v(r2, r4)
        L66:
            return r0
    }

    @android.annotation.TargetApi(26)
    public boolean setHardwareConfigIfAllowed(int r1, int r2, android.graphics.BitmapFactory.Options r3, boolean r4, boolean r5) {
            r0 = this;
            boolean r1 = r0.isHardwareConfigAllowed(r1, r2, r4, r5)
            if (r1 == 0) goto Ld
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.HARDWARE
            r3.inPreferredConfig = r2
            r2 = 0
            r3.inMutable = r2
        Ld:
            return r1
    }

    public void unblockHardwareBitmaps() {
            r2 = this;
            com.bumptech.glide.util.Util.assertMainThread()
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.isHardwareConfigAllowedByAppState
            r1 = 1
            r0.set(r1)
            return
    }
}
