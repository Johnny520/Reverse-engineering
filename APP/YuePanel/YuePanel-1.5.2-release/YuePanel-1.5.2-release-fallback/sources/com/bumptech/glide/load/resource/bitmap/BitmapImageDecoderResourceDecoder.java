package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5336(api = 28)
public final class BitmapImageDecoderResourceDecoder implements com.bumptech.glide.load.ResourceDecoder<android.graphics.ImageDecoder.Source, android.graphics.Bitmap> {
    private static final java.lang.String TAG = "BitmapImageDecoder";
    private final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;

    public BitmapImageDecoderResourceDecoder() {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter r0 = new com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter
            r0.<init>()
            r1.bitmapPool = r0
            return
    }

    /* JADX INFO: renamed from: decode, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode2(@Yue.InterfaceC4410 android.graphics.ImageDecoder.Source r4, int r5, int r6, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r7) throws java.io.IOException {
            r3 = this;
            com.bumptech.glide.load.resource.DefaultOnHeaderDecodedListener r0 = new com.bumptech.glide.load.resource.DefaultOnHeaderDecodedListener
            r0.<init>(r5, r6, r7)
            android.graphics.Bitmap r4 = Yue.C3219.m13631(r4, r0)
            r7 = 2
            java.lang.String r0 = "BitmapImageDecoder"
            boolean r7 = android.util.Log.isLoggable(r0, r7)
            if (r7 == 0) goto L49
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "Decoded ["
            r7.append(r1)
            int r1 = r4.getWidth()
            r7.append(r1)
            java.lang.String r1 = "x"
            r7.append(r1)
            int r2 = r4.getHeight()
            r7.append(r2)
            java.lang.String r2 = "] for ["
            r7.append(r2)
            r7.append(r5)
            r7.append(r1)
            r7.append(r6)
            java.lang.String r5 = "]"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            android.util.Log.v(r0, r5)
        L49:
            com.bumptech.glide.load.resource.bitmap.BitmapResource r5 = new com.bumptech.glide.load.resource.bitmap.BitmapResource
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r6 = r3.bitmapPool
            r5.<init>(r4, r6)
            return r5
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode(@Yue.InterfaceC4410 android.graphics.ImageDecoder.Source r1, int r2, int r3, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r4) throws java.io.IOException {
            r0 = this;
            android.graphics.ImageDecoder$Source r1 = Yue.C0762.m4655(r1)
            com.bumptech.glide.load.engine.Resource r1 = r0.decode2(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: handles, reason: avoid collision after fix types in other method */
    public boolean handles2(@Yue.InterfaceC4410 android.graphics.ImageDecoder.Source r1, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r2) throws java.io.IOException {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public /* bridge */ /* synthetic */ boolean handles(@Yue.InterfaceC4410 android.graphics.ImageDecoder.Source r1, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r2) throws java.io.IOException {
            r0 = this;
            android.graphics.ImageDecoder$Source r1 = Yue.C0762.m4655(r1)
            boolean r1 = r0.handles2(r1, r2)
            return r1
    }
}
