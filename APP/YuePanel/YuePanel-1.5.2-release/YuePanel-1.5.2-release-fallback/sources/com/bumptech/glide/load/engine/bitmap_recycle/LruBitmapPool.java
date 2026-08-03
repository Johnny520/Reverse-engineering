package com.bumptech.glide.load.engine.bitmap_recycle;

/* JADX INFO: loaded from: classes.dex */
public class LruBitmapPool implements com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool {
    private static final android.graphics.Bitmap.Config DEFAULT_CONFIG = null;
    private static final java.lang.String TAG = "LruBitmapPool";
    private final java.util.Set<android.graphics.Bitmap.Config> allowedConfigs;
    private long currentSize;
    private int evictions;
    private int hits;
    private final long initialMaxSize;
    private long maxSize;
    private int misses;
    private int puts;
    private final com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy strategy;
    private final com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.BitmapTracker tracker;

    public interface BitmapTracker {
        void add(android.graphics.Bitmap r1);

        void remove(android.graphics.Bitmap r1);
    }

    public static final class NullBitmapTracker implements com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.BitmapTracker {
        public NullBitmapTracker() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.BitmapTracker
        public void add(android.graphics.Bitmap r1) {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.BitmapTracker
        public void remove(android.graphics.Bitmap r1) {
                r0 = this;
                return
        }
    }

    public static class ThrowingBitmapTracker implements com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.BitmapTracker {
        private final java.util.Set<android.graphics.Bitmap> bitmaps;

        private ThrowingBitmapTracker() {
                r1 = this;
                r1.<init>()
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                java.util.Set r0 = java.util.Collections.synchronizedSet(r0)
                r1.bitmaps = r0
                return
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.BitmapTracker
        public void add(android.graphics.Bitmap r4) {
                r3 = this;
                java.util.Set<android.graphics.Bitmap> r0 = r3.bitmaps
                boolean r0 = r0.contains(r4)
                if (r0 != 0) goto Le
                java.util.Set<android.graphics.Bitmap> r0 = r3.bitmaps
                r0.add(r4)
                return
            Le:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Can't add already added bitmap: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r2 = " ["
                r1.append(r2)
                int r2 = r4.getWidth()
                r1.append(r2)
                java.lang.String r2 = "x"
                r1.append(r2)
                int r4 = r4.getHeight()
                r1.append(r4)
                java.lang.String r4 = "]"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.BitmapTracker
        public void remove(android.graphics.Bitmap r2) {
                r1 = this;
                java.util.Set<android.graphics.Bitmap> r0 = r1.bitmaps
                boolean r0 = r0.contains(r2)
                if (r0 == 0) goto Le
                java.util.Set<android.graphics.Bitmap> r0 = r1.bitmaps
                r0.remove(r2)
                return
            Le:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Cannot remove bitmap not in tracker"
                r2.<init>(r0)
                throw r2
        }
    }

    static {
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.DEFAULT_CONFIG = r0
            return
    }

    public LruBitmapPool(long r3) {
            r2 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r0 = getDefaultStrategy()
            java.util.Set r1 = getDefaultAllowedConfigs()
            r2.<init>(r3, r0, r1)
            return
    }

    public LruBitmapPool(long r1, com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r3, java.util.Set<android.graphics.Bitmap.Config> r4) {
            r0 = this;
            r0.<init>()
            r0.initialMaxSize = r1
            r0.maxSize = r1
            r0.strategy = r3
            r0.allowedConfigs = r4
            com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool$NullBitmapTracker r1 = new com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool$NullBitmapTracker
            r1.<init>()
            r0.tracker = r1
            return
    }

    public LruBitmapPool(long r2, java.util.Set<android.graphics.Bitmap.Config> r4) {
            r1 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r0 = getDefaultStrategy()
            r1.<init>(r2, r0, r4)
            return
    }

    @android.annotation.TargetApi(26)
    private static void assertNotHardwareConfig(android.graphics.Bitmap.Config r3) {
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.HARDWARE
            if (r3 == r0) goto L5
            return
        L5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot create a mutable Bitmap with config: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @Yue.InterfaceC4410
    private static android.graphics.Bitmap createBitmap(int r0, int r1, @Yue.InterfaceC4544 android.graphics.Bitmap.Config r2) {
            if (r2 == 0) goto L3
            goto L5
        L3:
            android.graphics.Bitmap$Config r2 = com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.DEFAULT_CONFIG
        L5:
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            return r0
    }

    private void dump() {
            r2 = this;
            java.lang.String r0 = "LruBitmapPool"
            r1 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto Lc
            r2.dumpUnchecked()
        Lc:
            return
    }

    private void dumpUnchecked() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Hits="
            r0.append(r1)
            int r1 = r3.hits
            r0.append(r1)
            java.lang.String r1 = ", misses="
            r0.append(r1)
            int r1 = r3.misses
            r0.append(r1)
            java.lang.String r1 = ", puts="
            r0.append(r1)
            int r1 = r3.puts
            r0.append(r1)
            java.lang.String r1 = ", evictions="
            r0.append(r1)
            int r1 = r3.evictions
            r0.append(r1)
            java.lang.String r1 = ", currentSize="
            r0.append(r1)
            long r1 = r3.currentSize
            r0.append(r1)
            java.lang.String r1 = ", maxSize="
            r0.append(r1)
            long r1 = r3.maxSize
            r0.append(r1)
            java.lang.String r1 = "\nStrategy="
            r0.append(r1)
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r1 = r3.strategy
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "LruBitmapPool"
            android.util.Log.v(r1, r0)
            return
    }

    private void evict() {
            r2 = this;
            long r0 = r2.maxSize
            r2.trimToSize(r0)
            return
    }

    @android.annotation.TargetApi(26)
    private static java.util.Set<android.graphics.Bitmap.Config> getDefaultAllowedConfigs() {
            java.util.HashSet r0 = new java.util.HashSet
            android.graphics.Bitmap$Config[] r1 = android.graphics.Bitmap.Config.values()
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            r1 = 0
            r0.add(r1)
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.HARDWARE
            r0.remove(r1)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }

    private static com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy getDefaultStrategy() {
            com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy r0 = new com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy
            r0.<init>()
            return r0
    }

    @Yue.InterfaceC4544
    private synchronized android.graphics.Bitmap getDirtyOrNull(int r6, int r7, @Yue.InterfaceC4544 android.graphics.Bitmap.Config r8) {
            r5 = this;
            monitor-enter(r5)
            assertNotHardwareConfig(r8)     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r0 = r5.strategy     // Catch: java.lang.Throwable -> L38
            if (r8 == 0) goto La
            r1 = r8
            goto Lc
        La:
            android.graphics.Bitmap$Config r1 = com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool.DEFAULT_CONFIG     // Catch: java.lang.Throwable -> L38
        Lc:
            android.graphics.Bitmap r0 = r0.get(r6, r7, r1)     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L41
            java.lang.String r1 = "LruBitmapPool"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L3a
            java.lang.String r1 = "LruBitmapPool"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r2.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "Missing bitmap="
            r2.append(r3)     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r3 = r5.strategy     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = r3.logBitmap(r6, r7, r8)     // Catch: java.lang.Throwable -> L38
            r2.append(r3)     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L38
            android.util.Log.d(r1, r2)     // Catch: java.lang.Throwable -> L38
            goto L3a
        L38:
            r6 = move-exception
            goto L85
        L3a:
            int r1 = r5.misses     // Catch: java.lang.Throwable -> L38
            int r1 = r1 + 1
            r5.misses = r1     // Catch: java.lang.Throwable -> L38
            goto L5b
        L41:
            int r1 = r5.hits     // Catch: java.lang.Throwable -> L38
            int r1 = r1 + 1
            r5.hits = r1     // Catch: java.lang.Throwable -> L38
            long r1 = r5.currentSize     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r3 = r5.strategy     // Catch: java.lang.Throwable -> L38
            int r3 = r3.getSize(r0)     // Catch: java.lang.Throwable -> L38
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L38
            long r1 = r1 - r3
            r5.currentSize = r1     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool$BitmapTracker r1 = r5.tracker     // Catch: java.lang.Throwable -> L38
            r1.remove(r0)     // Catch: java.lang.Throwable -> L38
            normalize(r0)     // Catch: java.lang.Throwable -> L38
        L5b:
            java.lang.String r1 = "LruBitmapPool"
            r2 = 2
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L80
            java.lang.String r1 = "LruBitmapPool"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r2.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "Get bitmap="
            r2.append(r3)     // Catch: java.lang.Throwable -> L38
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r3 = r5.strategy     // Catch: java.lang.Throwable -> L38
            java.lang.String r6 = r3.logBitmap(r6, r7, r8)     // Catch: java.lang.Throwable -> L38
            r2.append(r6)     // Catch: java.lang.Throwable -> L38
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L38
            android.util.Log.v(r1, r6)     // Catch: java.lang.Throwable -> L38
        L80:
            r5.dump()     // Catch: java.lang.Throwable -> L38
            monitor-exit(r5)
            return r0
        L85:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L38
            throw r6
    }

    @android.annotation.TargetApi(19)
    private static void maybeSetPreMultiplied(android.graphics.Bitmap r1) {
            r0 = 1
            r1.setPremultiplied(r0)
            return
    }

    private static void normalize(android.graphics.Bitmap r1) {
            r0 = 1
            r1.setHasAlpha(r0)
            maybeSetPreMultiplied(r1)
            return
    }

    private synchronized void trimToSize(long r6) {
            r5 = this;
            monitor-enter(r5)
        L1:
            long r0 = r5.currentSize     // Catch: java.lang.Throwable -> L23
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 <= 0) goto L6e
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r0 = r5.strategy     // Catch: java.lang.Throwable -> L23
            android.graphics.Bitmap r0 = r0.removeLast()     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L2b
            java.lang.String r6 = "LruBitmapPool"
            r7 = 5
            boolean r6 = android.util.Log.isLoggable(r6, r7)     // Catch: java.lang.Throwable -> L23
            if (r6 == 0) goto L25
            java.lang.String r6 = "LruBitmapPool"
            java.lang.String r7 = "Size mismatch, resetting"
            android.util.Log.w(r6, r7)     // Catch: java.lang.Throwable -> L23
            r5.dumpUnchecked()     // Catch: java.lang.Throwable -> L23
            goto L25
        L23:
            r6 = move-exception
            goto L70
        L25:
            r6 = 0
            r5.currentSize = r6     // Catch: java.lang.Throwable -> L23
            monitor-exit(r5)
            return
        L2b:
            com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool$BitmapTracker r1 = r5.tracker     // Catch: java.lang.Throwable -> L23
            r1.remove(r0)     // Catch: java.lang.Throwable -> L23
            long r1 = r5.currentSize     // Catch: java.lang.Throwable -> L23
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r3 = r5.strategy     // Catch: java.lang.Throwable -> L23
            int r3 = r3.getSize(r0)     // Catch: java.lang.Throwable -> L23
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L23
            long r1 = r1 - r3
            r5.currentSize = r1     // Catch: java.lang.Throwable -> L23
            int r1 = r5.evictions     // Catch: java.lang.Throwable -> L23
            int r1 = r1 + 1
            r5.evictions = r1     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = "LruBitmapPool"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L67
            java.lang.String r1 = "LruBitmapPool"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r2.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = "Evicting bitmap="
            r2.append(r3)     // Catch: java.lang.Throwable -> L23
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r3 = r5.strategy     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = r3.logBitmap(r0)     // Catch: java.lang.Throwable -> L23
            r2.append(r3)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L23
            android.util.Log.d(r1, r2)     // Catch: java.lang.Throwable -> L23
        L67:
            r5.dump()     // Catch: java.lang.Throwable -> L23
            r0.recycle()     // Catch: java.lang.Throwable -> L23
            goto L1
        L6e:
            monitor-exit(r5)
            return
        L70:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L23
            throw r6
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public void clearMemory() {
            r2 = this;
            r0 = 3
            java.lang.String r1 = "LruBitmapPool"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = "clearMemory"
            android.util.Log.d(r1, r0)
        Le:
            r0 = 0
            r2.trimToSize(r0)
            return
    }

    public long evictionCount() {
            r2 = this;
            int r0 = r2.evictions
            long r0 = (long) r0
            return r0
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    @Yue.InterfaceC4410
    public android.graphics.Bitmap get(int r2, int r3, android.graphics.Bitmap.Config r4) {
            r1 = this;
            android.graphics.Bitmap r0 = r1.getDirtyOrNull(r2, r3, r4)
            if (r0 == 0) goto Lb
            r2 = 0
            r0.eraseColor(r2)
            goto Lf
        Lb:
            android.graphics.Bitmap r0 = createBitmap(r2, r3, r4)
        Lf:
            return r0
    }

    public long getCurrentSize() {
            r2 = this;
            long r0 = r2.currentSize
            return r0
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    @Yue.InterfaceC4410
    public android.graphics.Bitmap getDirty(int r2, int r3, android.graphics.Bitmap.Config r4) {
            r1 = this;
            android.graphics.Bitmap r0 = r1.getDirtyOrNull(r2, r3, r4)
            if (r0 != 0) goto La
            android.graphics.Bitmap r0 = createBitmap(r2, r3, r4)
        La:
            return r0
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public long getMaxSize() {
            r2 = this;
            long r0 = r2.maxSize
            return r0
    }

    public long hitCount() {
            r2 = this;
            int r0 = r2.hits
            long r0 = (long) r0
            return r0
    }

    public long missCount() {
            r2 = this;
            int r0 = r2.misses
            long r0 = (long) r0
            return r0
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public synchronized void put(android.graphics.Bitmap r7) {
            r6 = this;
            monitor-enter(r6)
            if (r7 == 0) goto Lc4
            boolean r0 = r7.isRecycled()     // Catch: java.lang.Throwable -> L6b
            if (r0 != 0) goto Lbc
            boolean r0 = r7.isMutable()     // Catch: java.lang.Throwable -> L6b
            r1 = 2
            if (r0 == 0) goto L75
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r0 = r6.strategy     // Catch: java.lang.Throwable -> L6b
            int r0 = r0.getSize(r7)     // Catch: java.lang.Throwable -> L6b
            long r2 = (long) r0     // Catch: java.lang.Throwable -> L6b
            long r4 = r6.maxSize     // Catch: java.lang.Throwable -> L6b
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L75
            java.util.Set<android.graphics.Bitmap$Config> r0 = r6.allowedConfigs     // Catch: java.lang.Throwable -> L6b
            android.graphics.Bitmap$Config r2 = r7.getConfig()     // Catch: java.lang.Throwable -> L6b
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> L6b
            if (r0 != 0) goto L2a
            goto L75
        L2a:
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r0 = r6.strategy     // Catch: java.lang.Throwable -> L6b
            int r0 = r0.getSize(r7)     // Catch: java.lang.Throwable -> L6b
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r2 = r6.strategy     // Catch: java.lang.Throwable -> L6b
            r2.put(r7)     // Catch: java.lang.Throwable -> L6b
            com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool$BitmapTracker r2 = r6.tracker     // Catch: java.lang.Throwable -> L6b
            r2.add(r7)     // Catch: java.lang.Throwable -> L6b
            int r2 = r6.puts     // Catch: java.lang.Throwable -> L6b
            int r2 = r2 + 1
            r6.puts = r2     // Catch: java.lang.Throwable -> L6b
            long r2 = r6.currentSize     // Catch: java.lang.Throwable -> L6b
            long r4 = (long) r0     // Catch: java.lang.Throwable -> L6b
            long r2 = r2 + r4
            r6.currentSize = r2     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = "LruBitmapPool"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L6d
            java.lang.String r0 = "LruBitmapPool"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b
            r1.<init>()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r2 = "Put bitmap in pool="
            r1.append(r2)     // Catch: java.lang.Throwable -> L6b
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r2 = r6.strategy     // Catch: java.lang.Throwable -> L6b
            java.lang.String r7 = r2.logBitmap(r7)     // Catch: java.lang.Throwable -> L6b
            r1.append(r7)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L6b
            android.util.Log.v(r0, r7)     // Catch: java.lang.Throwable -> L6b
            goto L6d
        L6b:
            r7 = move-exception
            goto Lcc
        L6d:
            r6.dump()     // Catch: java.lang.Throwable -> L6b
            r6.evict()     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r6)
            return
        L75:
            java.lang.String r0 = "LruBitmapPool"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto Lb7
            java.lang.String r0 = "LruBitmapPool"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b
            r1.<init>()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r2 = "Reject bitmap from pool, bitmap: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L6b
            com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy r2 = r6.strategy     // Catch: java.lang.Throwable -> L6b
            java.lang.String r2 = r2.logBitmap(r7)     // Catch: java.lang.Throwable -> L6b
            r1.append(r2)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r2 = ", is mutable: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L6b
            boolean r2 = r7.isMutable()     // Catch: java.lang.Throwable -> L6b
            r1.append(r2)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r2 = ", is allowed config: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L6b
            java.util.Set<android.graphics.Bitmap$Config> r2 = r6.allowedConfigs     // Catch: java.lang.Throwable -> L6b
            android.graphics.Bitmap$Config r3 = r7.getConfig()     // Catch: java.lang.Throwable -> L6b
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L6b
            r1.append(r2)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L6b
            android.util.Log.v(r0, r1)     // Catch: java.lang.Throwable -> L6b
        Lb7:
            r7.recycle()     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r6)
            return
        Lbc:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = "Cannot pool recycled bitmap"
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L6b
            throw r7     // Catch: java.lang.Throwable -> L6b
        Lc4:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = "Bitmap must not be null"
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L6b
            throw r7     // Catch: java.lang.Throwable -> L6b
        Lcc:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6b
            throw r7
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public synchronized void setSizeMultiplier(float r3) {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.initialMaxSize     // Catch: java.lang.Throwable -> L11
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L11
            float r0 = r0 * r3
            int r3 = java.lang.Math.round(r0)     // Catch: java.lang.Throwable -> L11
            long r0 = (long) r3     // Catch: java.lang.Throwable -> L11
            r2.maxSize = r0     // Catch: java.lang.Throwable -> L11
            r2.evict()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r2)
            return
        L11:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L11
            throw r3
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    @android.annotation.SuppressLint({"InlinedApi"})
    public void trimMemory(int r5) {
            r4 = this;
            r0 = 3
            java.lang.String r1 = "LruBitmapPool"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "trimMemory, level="
            r0.append(r2)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1d:
            r0 = 40
            if (r5 >= r0) goto L37
            r0 = 20
            if (r5 < r0) goto L26
            goto L37
        L26:
            if (r5 >= r0) goto L2c
            r0 = 15
            if (r5 != r0) goto L3a
        L2c:
            long r0 = r4.getMaxSize()
            r2 = 2
            long r0 = r0 / r2
            r4.trimToSize(r0)
            goto L3a
        L37:
            r4.clearMemory()
        L3a:
            return
    }
}
