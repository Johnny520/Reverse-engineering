package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class UnitBitmapDecoder implements com.bumptech.glide.load.ResourceDecoder<android.graphics.Bitmap, android.graphics.Bitmap> {

    public static final class NonOwnedBitmapResource implements com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> {
        private final android.graphics.Bitmap bitmap;

        public NonOwnedBitmapResource(@Yue.InterfaceC4410 android.graphics.Bitmap r1) {
                r0 = this;
                r0.<init>()
                r0.bitmap = r1
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bumptech.glide.load.engine.Resource
        @Yue.InterfaceC4410
        public android.graphics.Bitmap get() {
                r1 = this;
                android.graphics.Bitmap r0 = r1.bitmap
                return r0
        }

        @Override // com.bumptech.glide.load.engine.Resource
        @Yue.InterfaceC4410
        public /* bridge */ /* synthetic */ android.graphics.Bitmap get() {
                r1 = this;
                android.graphics.Bitmap r0 = r1.get()
                return r0
        }

        @Override // com.bumptech.glide.load.engine.Resource
        @Yue.InterfaceC4410
        public java.lang.Class<android.graphics.Bitmap> getResourceClass() {
                r1 = this;
                java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
                return r0
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public int getSize() {
                r1 = this;
                android.graphics.Bitmap r0 = r1.bitmap
                int r0 = com.bumptech.glide.util.Util.getBitmapByteSize(r0)
                return r0
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public void recycle() {
                r0 = this;
                return
        }
    }

    public UnitBitmapDecoder() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: decode, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode2(@Yue.InterfaceC4410 android.graphics.Bitmap r1, int r2, int r3, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r4) {
            r0 = this;
            com.bumptech.glide.load.resource.bitmap.UnitBitmapDecoder$NonOwnedBitmapResource r2 = new com.bumptech.glide.load.resource.bitmap.UnitBitmapDecoder$NonOwnedBitmapResource
            r2.<init>(r1)
            return r2
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> decode(@Yue.InterfaceC4410 android.graphics.Bitmap r1, int r2, int r3, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r4) throws java.io.IOException {
            r0 = this;
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            com.bumptech.glide.load.engine.Resource r1 = r0.decode2(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: handles, reason: avoid collision after fix types in other method */
    public boolean handles2(@Yue.InterfaceC4410 android.graphics.Bitmap r1, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r2) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public /* bridge */ /* synthetic */ boolean handles(@Yue.InterfaceC4410 android.graphics.Bitmap r1, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r2) throws java.io.IOException {
            r0 = this;
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            boolean r1 = r0.handles2(r1, r2)
            return r1
    }
}
