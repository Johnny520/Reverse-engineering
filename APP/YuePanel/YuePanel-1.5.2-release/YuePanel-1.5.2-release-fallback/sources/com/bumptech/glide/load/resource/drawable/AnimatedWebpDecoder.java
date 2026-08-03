package com.bumptech.glide.load.resource.drawable;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5336(28)
@java.lang.Deprecated
public final class AnimatedWebpDecoder {
    private final com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool arrayPool;
    private final java.util.List<com.bumptech.glide.load.ImageHeaderParser> imageHeaderParsers;

    public static final class AnimatedImageDrawableResource implements com.bumptech.glide.load.engine.Resource<android.graphics.drawable.Drawable> {
        private static final int ESTIMATED_NUMBER_OF_FRAMES = 2;
        private final android.graphics.drawable.AnimatedImageDrawable imageDrawable;

        public AnimatedImageDrawableResource(android.graphics.drawable.AnimatedImageDrawable r1) {
                r0 = this;
                r0.<init>()
                r0.imageDrawable = r1
                return
        }

        @Override // com.bumptech.glide.load.engine.Resource
        @Yue.InterfaceC4410
        public android.graphics.drawable.Drawable get() {
                r1 = this;
                android.graphics.drawable.AnimatedImageDrawable r0 = r1.imageDrawable
                return r0
        }

        @Override // com.bumptech.glide.load.engine.Resource
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: get, reason: avoid collision after fix types in other method */
        public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable get2() {
                r1 = this;
                android.graphics.drawable.AnimatedImageDrawable r0 = r1.get()
                return r0
        }

        @Override // com.bumptech.glide.load.engine.Resource
        @Yue.InterfaceC4410
        public java.lang.Class<android.graphics.drawable.Drawable> getResourceClass() {
                r1 = this;
                java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
                return r0
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public int getSize() {
                r2 = this;
                android.graphics.drawable.AnimatedImageDrawable r0 = r2.imageDrawable
                int r0 = Yue.C0362.m1447(r0)
                android.graphics.drawable.AnimatedImageDrawable r1 = r2.imageDrawable
                int r1 = Yue.C0363.m1448(r1)
                int r0 = r0 * r1
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
                int r1 = com.bumptech.glide.util.Util.getBytesPerPixel(r1)
                int r0 = r0 * r1
                int r0 = r0 * 2
                return r0
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public void recycle() {
                r1 = this;
                android.graphics.drawable.AnimatedImageDrawable r0 = r1.imageDrawable
                Yue.C0364.m1449(r0)
                android.graphics.drawable.AnimatedImageDrawable r0 = r1.imageDrawable
                Yue.C0365.m1450(r0)
                return
        }
    }

    public static final class ByteBufferAnimatedWebpDecoder implements com.bumptech.glide.load.ResourceDecoder<java.nio.ByteBuffer, android.graphics.drawable.Drawable> {
        private final com.bumptech.glide.load.resource.drawable.AnimatedWebpDecoder delegate;

        public ByteBufferAnimatedWebpDecoder(com.bumptech.glide.load.resource.drawable.AnimatedWebpDecoder r1) {
                r0 = this;
                r0.<init>()
                r0.delegate = r1
                return
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.Resource<android.graphics.drawable.Drawable> decode(@Yue.InterfaceC4410 java.nio.ByteBuffer r1, int r2, int r3, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r4) throws java.io.IOException {
                r0 = this;
                java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
                com.bumptech.glide.load.engine.Resource r1 = r0.decode2(r1, r2, r3, r4)
                return r1
        }

        /* JADX INFO: renamed from: decode, reason: avoid collision after fix types in other method */
        public com.bumptech.glide.load.engine.Resource<android.graphics.drawable.Drawable> decode2(@Yue.InterfaceC4410 java.nio.ByteBuffer r2, int r3, int r4, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r5) throws java.io.IOException {
                r1 = this;
                android.graphics.ImageDecoder$Source r2 = Yue.C0870.m5002(r2)
                com.bumptech.glide.load.resource.drawable.AnimatedWebpDecoder r0 = r1.delegate
                com.bumptech.glide.load.engine.Resource r2 = r0.decode(r2, r3, r4, r5)
                return r2
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public /* bridge */ /* synthetic */ boolean handles(@Yue.InterfaceC4410 java.nio.ByteBuffer r1, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r2) throws java.io.IOException {
                r0 = this;
                java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
                boolean r1 = r0.handles2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: handles, reason: avoid collision after fix types in other method */
        public boolean handles2(@Yue.InterfaceC4410 java.nio.ByteBuffer r1, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r2) throws java.io.IOException {
                r0 = this;
                com.bumptech.glide.load.resource.drawable.AnimatedWebpDecoder r2 = r0.delegate
                boolean r1 = r2.handles(r1)
                return r1
        }
    }

    public static final class StreamAnimatedWebpDecoder implements com.bumptech.glide.load.ResourceDecoder<java.io.InputStream, android.graphics.drawable.Drawable> {
        private final com.bumptech.glide.load.resource.drawable.AnimatedWebpDecoder delegate;

        public StreamAnimatedWebpDecoder(com.bumptech.glide.load.resource.drawable.AnimatedWebpDecoder r1) {
                r0 = this;
                r0.<init>()
                r0.delegate = r1
                return
        }

        /* JADX INFO: renamed from: decode, reason: avoid collision after fix types in other method */
        public com.bumptech.glide.load.engine.Resource<android.graphics.drawable.Drawable> decode2(@Yue.InterfaceC4410 java.io.InputStream r2, int r3, int r4, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r5) throws java.io.IOException {
                r1 = this;
                java.nio.ByteBuffer r2 = com.bumptech.glide.util.ByteBufferUtil.fromStream(r2)
                android.graphics.ImageDecoder$Source r2 = Yue.C0870.m5002(r2)
                com.bumptech.glide.load.resource.drawable.AnimatedWebpDecoder r0 = r1.delegate
                com.bumptech.glide.load.engine.Resource r2 = r0.decode(r2, r3, r4, r5)
                return r2
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.Resource<android.graphics.drawable.Drawable> decode(@Yue.InterfaceC4410 java.io.InputStream r1, int r2, int r3, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r4) throws java.io.IOException {
                r0 = this;
                java.io.InputStream r1 = (java.io.InputStream) r1
                com.bumptech.glide.load.engine.Resource r1 = r0.decode2(r1, r2, r3, r4)
                return r1
        }

        /* JADX INFO: renamed from: handles, reason: avoid collision after fix types in other method */
        public boolean handles2(@Yue.InterfaceC4410 java.io.InputStream r1, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r2) throws java.io.IOException {
                r0 = this;
                com.bumptech.glide.load.resource.drawable.AnimatedWebpDecoder r2 = r0.delegate
                boolean r1 = r2.handles(r1)
                return r1
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public /* bridge */ /* synthetic */ boolean handles(@Yue.InterfaceC4410 java.io.InputStream r1, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r2) throws java.io.IOException {
                r0 = this;
                java.io.InputStream r1 = (java.io.InputStream) r1
                boolean r1 = r0.handles2(r1, r2)
                return r1
        }
    }

    private AnimatedWebpDecoder(java.util.List<com.bumptech.glide.load.ImageHeaderParser> r1, com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2) {
            r0 = this;
            r0.<init>()
            r0.imageHeaderParsers = r1
            r0.arrayPool = r2
            return
    }

    public static com.bumptech.glide.load.ResourceDecoder<java.nio.ByteBuffer, android.graphics.drawable.Drawable> byteBufferDecoder(java.util.List<com.bumptech.glide.load.ImageHeaderParser> r2, com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r3) {
            com.bumptech.glide.load.resource.drawable.AnimatedWebpDecoder$ByteBufferAnimatedWebpDecoder r0 = new com.bumptech.glide.load.resource.drawable.AnimatedWebpDecoder$ByteBufferAnimatedWebpDecoder
            com.bumptech.glide.load.resource.drawable.AnimatedWebpDecoder r1 = new com.bumptech.glide.load.resource.drawable.AnimatedWebpDecoder
            r1.<init>(r2, r3)
            r0.<init>(r1)
            return r0
    }

    private boolean isHandled(com.bumptech.glide.load.ImageHeaderParser.ImageType r2) {
            r1 = this;
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParser.ImageType.ANIMATED_WEBP
            if (r2 != r0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            return r2
    }

    public static com.bumptech.glide.load.ResourceDecoder<java.io.InputStream, android.graphics.drawable.Drawable> streamDecoder(java.util.List<com.bumptech.glide.load.ImageHeaderParser> r2, com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r3) {
            com.bumptech.glide.load.resource.drawable.AnimatedWebpDecoder$StreamAnimatedWebpDecoder r0 = new com.bumptech.glide.load.resource.drawable.AnimatedWebpDecoder$StreamAnimatedWebpDecoder
            com.bumptech.glide.load.resource.drawable.AnimatedWebpDecoder r1 = new com.bumptech.glide.load.resource.drawable.AnimatedWebpDecoder
            r1.<init>(r2, r3)
            r0.<init>(r1)
            return r0
    }

    public com.bumptech.glide.load.engine.Resource<android.graphics.drawable.Drawable> decode(@Yue.InterfaceC4410 android.graphics.ImageDecoder.Source r2, int r3, int r4, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r5) throws java.io.IOException {
            r1 = this;
            com.bumptech.glide.load.resource.DefaultOnHeaderDecodedListener r0 = new com.bumptech.glide.load.resource.DefaultOnHeaderDecodedListener
            r0.<init>(r3, r4, r5)
            android.graphics.drawable.Drawable r2 = Yue.C3218.m13630(r2, r0)
            boolean r3 = Yue.C0360.m1445(r2)
            if (r3 == 0) goto L19
            com.bumptech.glide.load.resource.drawable.AnimatedWebpDecoder$AnimatedImageDrawableResource r3 = new com.bumptech.glide.load.resource.drawable.AnimatedWebpDecoder$AnimatedImageDrawableResource
            android.graphics.drawable.AnimatedImageDrawable r2 = Yue.C0361.m1446(r2)
            r3.<init>(r2)
            return r3
        L19:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Received unexpected drawable type for animated webp, failing: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
    }

    public boolean handles(java.io.InputStream r3) throws java.io.IOException {
            r2 = this;
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r2.imageHeaderParsers
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r1 = r2.arrayPool
            com.bumptech.glide.load.ImageHeaderParser$ImageType r3 = com.bumptech.glide.load.ImageHeaderParserUtils.getType(r0, r3, r1)
            boolean r3 = r2.isHandled(r3)
            return r3
    }

    public boolean handles(java.nio.ByteBuffer r2) throws java.io.IOException {
            r1 = this;
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r1.imageHeaderParsers
            com.bumptech.glide.load.ImageHeaderParser$ImageType r2 = com.bumptech.glide.load.ImageHeaderParserUtils.getType(r0, r2)
            boolean r2 = r1.isHandled(r2)
            return r2
    }
}
