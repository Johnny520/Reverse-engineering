package com.bumptech.glide.load.engine.prefill;

/* JADX INFO: loaded from: classes.dex */
public final class BitmapPreFiller {
    private final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;
    private com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner current;
    private final com.bumptech.glide.load.DecodeFormat defaultFormat;
    private final com.bumptech.glide.load.engine.cache.MemoryCache memoryCache;

    public BitmapPreFiller(com.bumptech.glide.load.engine.cache.MemoryCache r1, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r2, com.bumptech.glide.load.DecodeFormat r3) {
            r0 = this;
            r0.<init>()
            r0.memoryCache = r1
            r0.bitmapPool = r2
            r0.defaultFormat = r3
            return
    }

    private static int getSizeInBytes(com.bumptech.glide.load.engine.prefill.PreFillType r2) {
            int r0 = r2.getWidth()
            int r1 = r2.getHeight()
            android.graphics.Bitmap$Config r2 = r2.getConfig()
            int r2 = com.bumptech.glide.util.Util.getBitmapByteSize(r0, r1, r2)
            return r2
    }

    @Yue.InterfaceC6959
    public com.bumptech.glide.load.engine.prefill.PreFillQueue generateAllocationOrder(com.bumptech.glide.load.engine.prefill.PreFillType... r8) {
            r7 = this;
            com.bumptech.glide.load.engine.cache.MemoryCache r0 = r7.memoryCache
            long r0 = r0.getMaxSize()
            com.bumptech.glide.load.engine.cache.MemoryCache r2 = r7.memoryCache
            long r2 = r2.getCurrentSize()
            long r0 = r0 - r2
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r2 = r7.bitmapPool
            long r2 = r2.getMaxSize()
            long r0 = r0 + r2
            int r2 = r8.length
            r3 = 0
            r4 = r3
            r5 = r4
        L18:
            if (r4 >= r2) goto L24
            r6 = r8[r4]
            int r6 = r6.getWeight()
            int r5 = r5 + r6
            int r4 = r4 + 1
            goto L18
        L24:
            float r0 = (float) r0
            float r1 = (float) r5
            float r0 = r0 / r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            int r2 = r8.length
        L2d:
            if (r3 >= r2) goto L4a
            r4 = r8[r3]
            int r5 = r4.getWeight()
            float r5 = (float) r5
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            int r6 = getSizeInBytes(r4)
            int r5 = r5 / r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1.put(r4, r5)
            int r3 = r3 + 1
            goto L2d
        L4a:
            com.bumptech.glide.load.engine.prefill.PreFillQueue r8 = new com.bumptech.glide.load.engine.prefill.PreFillQueue
            r8.<init>(r1)
            return r8
    }

    public void preFill(com.bumptech.glide.load.engine.prefill.PreFillType.Builder... r6) {
            r5 = this;
            com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner r0 = r5.current
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            int r0 = r6.length
            com.bumptech.glide.load.engine.prefill.PreFillType[] r0 = new com.bumptech.glide.load.engine.prefill.PreFillType[r0]
            r1 = 0
        Lb:
            int r2 = r6.length
            if (r1 >= r2) goto L2d
            r2 = r6[r1]
            android.graphics.Bitmap$Config r3 = r2.getConfig()
            if (r3 != 0) goto L24
            com.bumptech.glide.load.DecodeFormat r3 = r5.defaultFormat
            com.bumptech.glide.load.DecodeFormat r4 = com.bumptech.glide.load.DecodeFormat.PREFER_ARGB_8888
            if (r3 != r4) goto L1f
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            goto L21
        L1f:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.RGB_565
        L21:
            r2.setConfig(r3)
        L24:
            com.bumptech.glide.load.engine.prefill.PreFillType r2 = r2.build()
            r0[r1] = r2
            int r1 = r1 + 1
            goto Lb
        L2d:
            com.bumptech.glide.load.engine.prefill.PreFillQueue r6 = r5.generateAllocationOrder(r0)
            com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner r0 = new com.bumptech.glide.load.engine.prefill.BitmapPreFillRunner
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r1 = r5.bitmapPool
            com.bumptech.glide.load.engine.cache.MemoryCache r2 = r5.memoryCache
            r0.<init>(r1, r2, r6)
            r5.current = r0
            com.bumptech.glide.util.Util.postOnUiThread(r0)
            return
    }
}
