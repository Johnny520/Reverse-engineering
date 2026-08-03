package com.bumptech.glide.load.engine.prefill;

/* JADX INFO: loaded from: classes.dex */
final class BitmapPreFillRunner implements java.lang.Runnable {
    static final int BACKOFF_RATIO = 4;
    private static final com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner.Clock DEFAULT_CLOCK = null;
    static final long INITIAL_BACKOFF_MS = 40;
    static final long MAX_BACKOFF_MS = 0;
    static final long MAX_DURATION_MS = 32;

    @Yue.InterfaceC6959
    static final java.lang.String TAG = "PreFillRunner";
    private final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;
    private final com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner.Clock clock;
    private long currentDelay;
    private final android.os.Handler handler;
    private boolean isCancelled;
    private final com.bumptech.glide.load.engine.cache.MemoryCache memoryCache;
    private final java.util.Set<com.bumptech.glide.load.engine.prefill.PreFillType> seenTypes;
    private final com.bumptech.glide.load.engine.prefill.PreFillQueue toPrefill;

    @Yue.InterfaceC6959
    public static class Clock {
        public Clock() {
                r0 = this;
                r0.<init>()
                return
        }

        public long now() {
                r2 = this;
                long r0 = android.os.SystemClock.currentThreadTimeMillis()
                return r0
        }
    }

    public static final class UniqueKey implements com.bumptech.glide.load.Key {
        public UniqueKey() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.Key
        public void updateDiskCacheKey(@Yue.InterfaceC4410 java.security.MessageDigest r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }
    }

    static {
            com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner$Clock r0 = new com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner$Clock
            r0.<init>()
            com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner.DEFAULT_CLOCK = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 1
            long r0 = r0.toMillis(r1)
            com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner.MAX_BACKOFF_MS = r0
            return
    }

    public BitmapPreFillRunner(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r7, com.bumptech.glide.load.engine.cache.MemoryCache r8, com.bumptech.glide.load.engine.prefill.PreFillQueue r9) {
            r6 = this;
            com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner$Clock r4 = com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner.DEFAULT_CLOCK
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r5.<init>(r0)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Yue.InterfaceC6959
    public BitmapPreFillRunner(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r3, com.bumptech.glide.load.engine.cache.MemoryCache r4, com.bumptech.glide.load.engine.prefill.PreFillQueue r5, com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner.Clock r6, android.os.Handler r7) {
            r2 = this;
            r2.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.seenTypes = r0
            r0 = 40
            r2.currentDelay = r0
            r2.bitmapPool = r3
            r2.memoryCache = r4
            r2.toPrefill = r5
            r2.clock = r6
            r2.handler = r7
            return
    }

    private long getFreeMemoryCacheBytes() {
            r4 = this;
            com.bumptech.glide.load.engine.cache.MemoryCache r0 = r4.memoryCache
            long r0 = r0.getMaxSize()
            com.bumptech.glide.load.engine.cache.MemoryCache r2 = r4.memoryCache
            long r2 = r2.getCurrentSize()
            long r0 = r0 - r2
            return r0
    }

    private long getNextDelay() {
            r6 = this;
            long r0 = r6.currentDelay
            r2 = 4
            long r2 = r2 * r0
            long r4 = com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner.MAX_BACKOFF_MS
            long r2 = java.lang.Math.min(r2, r4)
            r6.currentDelay = r2
            return r0
    }

    private boolean isGcDetected(long r3) {
            r2 = this;
            com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner$Clock r0 = r2.clock
            long r0 = r0.now()
            long r0 = r0 - r3
            r3 = 32
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 < 0) goto Lf
            r3 = 1
            goto L10
        Lf:
            r3 = 0
        L10:
            return r3
    }

    @Yue.InterfaceC6959
    public boolean allocate() {
            r9 = this;
            com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner$Clock r0 = r9.clock
            long r0 = r0.now()
        L6:
            com.bumptech.glide.load.engine.prefill.PreFillQueue r2 = r9.toPrefill
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Lb0
            boolean r2 = r9.isGcDetected(r0)
            if (r2 != 0) goto Lb0
            com.bumptech.glide.load.engine.prefill.PreFillQueue r2 = r9.toPrefill
            com.bumptech.glide.load.engine.prefill.PreFillType r2 = r2.remove()
            java.util.Set<com.bumptech.glide.load.engine.prefill.PreFillType> r3 = r9.seenTypes
            boolean r3 = r3.contains(r2)
            if (r3 != 0) goto L3a
            java.util.Set<com.bumptech.glide.load.engine.prefill.PreFillType> r3 = r9.seenTypes
            r3.add(r2)
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r3 = r9.bitmapPool
            int r4 = r2.getWidth()
            int r5 = r2.getHeight()
            android.graphics.Bitmap$Config r6 = r2.getConfig()
            android.graphics.Bitmap r3 = r3.getDirty(r4, r5, r6)
            goto L4a
        L3a:
            int r3 = r2.getWidth()
            int r4 = r2.getHeight()
            android.graphics.Bitmap$Config r5 = r2.getConfig()
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r4, r5)
        L4a:
            int r4 = com.bumptech.glide.util.Util.getBitmapByteSize(r3)
            long r5 = r9.getFreeMemoryCacheBytes()
            long r7 = (long) r4
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L68
            com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner$UniqueKey r5 = new com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner$UniqueKey
            r5.<init>()
            com.bumptech.glide.load.engine.cache.MemoryCache r6 = r9.memoryCache
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r7 = r9.bitmapPool
            com.bumptech.glide.load.resource.bitmap.BitmapResource r3 = com.bumptech.glide.load.resource.bitmap.BitmapResource.obtain(r3, r7)
            r6.put(r5, r3)
            goto L6d
        L68:
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r5 = r9.bitmapPool
            r5.put(r3)
        L6d:
            r3 = 3
            java.lang.String r5 = "PreFillRunner"
            boolean r3 = android.util.Log.isLoggable(r5, r3)
            if (r3 == 0) goto L6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "allocated ["
            r3.append(r6)
            int r6 = r2.getWidth()
            r3.append(r6)
            java.lang.String r6 = "x"
            r3.append(r6)
            int r6 = r2.getHeight()
            r3.append(r6)
            java.lang.String r6 = "] "
            r3.append(r6)
            android.graphics.Bitmap$Config r2 = r2.getConfig()
            r3.append(r2)
            java.lang.String r2 = " size: "
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            android.util.Log.d(r5, r2)
            goto L6
        Lb0:
            boolean r0 = r9.isCancelled
            if (r0 != 0) goto Lbe
            com.bumptech.glide.load.engine.prefill.PreFillQueue r0 = r9.toPrefill
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lbe
            r0 = 1
            goto Lbf
        Lbe:
            r0 = 0
        Lbf:
            return r0
    }

    public void cancel() {
            r1 = this;
            r0 = 1
            r1.isCancelled = r0
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r3 = this;
            boolean r0 = r3.allocate()
            if (r0 == 0) goto Lf
            android.os.Handler r0 = r3.handler
            long r1 = r3.getNextDelay()
            r0.postDelayed(r3, r1)
        Lf:
            return
    }
}
