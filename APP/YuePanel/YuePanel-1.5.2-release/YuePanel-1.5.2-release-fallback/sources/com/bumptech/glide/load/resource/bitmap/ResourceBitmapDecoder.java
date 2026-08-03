package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes.dex */
public class ResourceBitmapDecoder implements com.bumptech.glide.load.ResourceDecoder<android.net.Uri, android.graphics.Bitmap> {
    private final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;
    private final com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder drawableDecoder;

    public ResourceBitmapDecoder(com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder r1, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r2) {
            r0 = this;
            r0.<init>()
            r0.drawableDecoder = r1
            r0.bitmapPool = r2
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: decode, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode2(@Yue.InterfaceC4410 android.net.Uri r2, int r3, int r4, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r5) {
            r1 = this;
            com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder r0 = r1.drawableDecoder
            com.bumptech.glide.load.engine.Resource r2 = r0.decode2(r2, r3, r4, r5)
            if (r2 != 0) goto La
            r2 = 0
            return r2
        La:
            java.lang.Object r2 = r2.get()
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r5 = r1.bitmapPool
            com.bumptech.glide.load.engine.Resource r2 = com.bumptech.glide.load.resource.bitmap.DrawableToBitmapConverter.convert(r5, r2, r3, r4)
            return r2
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    @Yue.InterfaceC4544
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode(@Yue.InterfaceC4410 android.net.Uri r1, int r2, int r3, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r4) throws java.io.IOException {
            r0 = this;
            android.net.Uri r1 = (android.net.Uri) r1
            com.bumptech.glide.load.engine.Resource r1 = r0.decode2(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: handles, reason: avoid collision after fix types in other method */
    public boolean handles2(@Yue.InterfaceC4410 android.net.Uri r1, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r2) {
            r0 = this;
            java.lang.String r2 = "android.resource"
            java.lang.String r1 = r1.getScheme()
            boolean r1 = r2.equals(r1)
            return r1
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public /* bridge */ /* synthetic */ boolean handles(@Yue.InterfaceC4410 android.net.Uri r1, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r2) throws java.io.IOException {
            r0 = this;
            android.net.Uri r1 = (android.net.Uri) r1
            boolean r1 = r0.handles2(r1, r2)
            return r1
    }
}
