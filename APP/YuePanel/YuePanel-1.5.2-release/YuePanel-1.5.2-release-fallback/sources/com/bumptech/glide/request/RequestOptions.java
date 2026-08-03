package com.bumptech.glide.request;

/* JADX INFO: loaded from: classes.dex */
public class RequestOptions extends com.bumptech.glide.request.BaseRequestOptions<com.bumptech.glide.request.RequestOptions> {

    @Yue.InterfaceC4544
    private static com.bumptech.glide.request.RequestOptions centerCropOptions;

    @Yue.InterfaceC4544
    private static com.bumptech.glide.request.RequestOptions centerInsideOptions;

    @Yue.InterfaceC4544
    private static com.bumptech.glide.request.RequestOptions circleCropOptions;

    @Yue.InterfaceC4544
    private static com.bumptech.glide.request.RequestOptions fitCenterOptions;

    @Yue.InterfaceC4544
    private static com.bumptech.glide.request.RequestOptions noAnimationOptions;

    @Yue.InterfaceC4544
    private static com.bumptech.glide.request.RequestOptions noTransformOptions;

    @Yue.InterfaceC4544
    private static com.bumptech.glide.request.RequestOptions skipMemoryCacheFalseOptions;

    @Yue.InterfaceC4544
    private static com.bumptech.glide.request.RequestOptions skipMemoryCacheTrueOptions;

    public RequestOptions() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public static com.bumptech.glide.request.RequestOptions bitmapTransform(@Yue.InterfaceC4410 com.bumptech.glide.load.Transformation<android.graphics.Bitmap> r1) {
            com.bumptech.glide.request.RequestOptions r0 = new com.bumptech.glide.request.RequestOptions
            r0.<init>()
            com.bumptech.glide.request.BaseRequestOptions r1 = r0.transform(r1)
            com.bumptech.glide.request.RequestOptions r1 = (com.bumptech.glide.request.RequestOptions) r1
            return r1
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public static com.bumptech.glide.request.RequestOptions centerCropTransform() {
            com.bumptech.glide.request.RequestOptions r0 = com.bumptech.glide.request.RequestOptions.centerCropOptions
            if (r0 != 0) goto L17
            com.bumptech.glide.request.RequestOptions r0 = new com.bumptech.glide.request.RequestOptions
            r0.<init>()
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.centerCrop()
            com.bumptech.glide.request.RequestOptions r0 = (com.bumptech.glide.request.RequestOptions) r0
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.autoClone()
            com.bumptech.glide.request.RequestOptions r0 = (com.bumptech.glide.request.RequestOptions) r0
            com.bumptech.glide.request.RequestOptions.centerCropOptions = r0
        L17:
            com.bumptech.glide.request.RequestOptions r0 = com.bumptech.glide.request.RequestOptions.centerCropOptions
            return r0
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public static com.bumptech.glide.request.RequestOptions centerInsideTransform() {
            com.bumptech.glide.request.RequestOptions r0 = com.bumptech.glide.request.RequestOptions.centerInsideOptions
            if (r0 != 0) goto L17
            com.bumptech.glide.request.RequestOptions r0 = new com.bumptech.glide.request.RequestOptions
            r0.<init>()
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.centerInside()
            com.bumptech.glide.request.RequestOptions r0 = (com.bumptech.glide.request.RequestOptions) r0
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.autoClone()
            com.bumptech.glide.request.RequestOptions r0 = (com.bumptech.glide.request.RequestOptions) r0
            com.bumptech.glide.request.RequestOptions.centerInsideOptions = r0
        L17:
            com.bumptech.glide.request.RequestOptions r0 = com.bumptech.glide.request.RequestOptions.centerInsideOptions
            return r0
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public static com.bumptech.glide.request.RequestOptions circleCropTransform() {
            com.bumptech.glide.request.RequestOptions r0 = com.bumptech.glide.request.RequestOptions.circleCropOptions
            if (r0 != 0) goto L17
            com.bumptech.glide.request.RequestOptions r0 = new com.bumptech.glide.request.RequestOptions
            r0.<init>()
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.circleCrop()
            com.bumptech.glide.request.RequestOptions r0 = (com.bumptech.glide.request.RequestOptions) r0
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.autoClone()
            com.bumptech.glide.request.RequestOptions r0 = (com.bumptech.glide.request.RequestOptions) r0
            com.bumptech.glide.request.RequestOptions.circleCropOptions = r0
        L17:
            com.bumptech.glide.request.RequestOptions r0 = com.bumptech.glide.request.RequestOptions.circleCropOptions
            return r0
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public static com.bumptech.glide.request.RequestOptions decodeTypeOf(@Yue.InterfaceC4410 java.lang.Class<?> r1) {
            com.bumptech.glide.request.RequestOptions r0 = new com.bumptech.glide.request.RequestOptions
            r0.<init>()
            com.bumptech.glide.request.BaseRequestOptions r1 = r0.decode(r1)
            com.bumptech.glide.request.RequestOptions r1 = (com.bumptech.glide.request.RequestOptions) r1
            return r1
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public static com.bumptech.glide.request.RequestOptions diskCacheStrategyOf(@Yue.InterfaceC4410 com.bumptech.glide.load.engine.DiskCacheStrategy r1) {
            com.bumptech.glide.request.RequestOptions r0 = new com.bumptech.glide.request.RequestOptions
            r0.<init>()
            com.bumptech.glide.request.BaseRequestOptions r1 = r0.diskCacheStrategy(r1)
            com.bumptech.glide.request.RequestOptions r1 = (com.bumptech.glide.request.RequestOptions) r1
            return r1
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public static com.bumptech.glide.request.RequestOptions downsampleOf(@Yue.InterfaceC4410 com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r1) {
            com.bumptech.glide.request.RequestOptions r0 = new com.bumptech.glide.request.RequestOptions
            r0.<init>()
            com.bumptech.glide.request.BaseRequestOptions r1 = r0.downsample(r1)
            com.bumptech.glide.request.RequestOptions r1 = (com.bumptech.glide.request.RequestOptions) r1
            return r1
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public static com.bumptech.glide.request.RequestOptions encodeFormatOf(@Yue.InterfaceC4410 android.graphics.Bitmap.CompressFormat r1) {
            com.bumptech.glide.request.RequestOptions r0 = new com.bumptech.glide.request.RequestOptions
            r0.<init>()
            com.bumptech.glide.request.BaseRequestOptions r1 = r0.encodeFormat(r1)
            com.bumptech.glide.request.RequestOptions r1 = (com.bumptech.glide.request.RequestOptions) r1
            return r1
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public static com.bumptech.glide.request.RequestOptions encodeQualityOf(@Yue.InterfaceC3281(from = 0, to = 100) int r1) {
            com.bumptech.glide.request.RequestOptions r0 = new com.bumptech.glide.request.RequestOptions
            r0.<init>()
            com.bumptech.glide.request.BaseRequestOptions r1 = r0.encodeQuality(r1)
            com.bumptech.glide.request.RequestOptions r1 = (com.bumptech.glide.request.RequestOptions) r1
            return r1
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public static com.bumptech.glide.request.RequestOptions errorOf(@Yue.InterfaceC2004 int r1) {
            com.bumptech.glide.request.RequestOptions r0 = new com.bumptech.glide.request.RequestOptions
            r0.<init>()
            com.bumptech.glide.request.BaseRequestOptions r1 = r0.error(r1)
            com.bumptech.glide.request.RequestOptions r1 = (com.bumptech.glide.request.RequestOptions) r1
            return r1
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public static com.bumptech.glide.request.RequestOptions errorOf(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1) {
            com.bumptech.glide.request.RequestOptions r0 = new com.bumptech.glide.request.RequestOptions
            r0.<init>()
            com.bumptech.glide.request.BaseRequestOptions r1 = r0.error(r1)
            com.bumptech.glide.request.RequestOptions r1 = (com.bumptech.glide.request.RequestOptions) r1
            return r1
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public static com.bumptech.glide.request.RequestOptions fitCenterTransform() {
            com.bumptech.glide.request.RequestOptions r0 = com.bumptech.glide.request.RequestOptions.fitCenterOptions
            if (r0 != 0) goto L17
            com.bumptech.glide.request.RequestOptions r0 = new com.bumptech.glide.request.RequestOptions
            r0.<init>()
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.fitCenter()
            com.bumptech.glide.request.RequestOptions r0 = (com.bumptech.glide.request.RequestOptions) r0
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.autoClone()
            com.bumptech.glide.request.RequestOptions r0 = (com.bumptech.glide.request.RequestOptions) r0
            com.bumptech.glide.request.RequestOptions.fitCenterOptions = r0
        L17:
            com.bumptech.glide.request.RequestOptions r0 = com.bumptech.glide.request.RequestOptions.fitCenterOptions
            return r0
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public static com.bumptech.glide.request.RequestOptions formatOf(@Yue.InterfaceC4410 com.bumptech.glide.load.DecodeFormat r1) {
            com.bumptech.glide.request.RequestOptions r0 = new com.bumptech.glide.request.RequestOptions
            r0.<init>()
            com.bumptech.glide.request.BaseRequestOptions r1 = r0.format(r1)
            com.bumptech.glide.request.RequestOptions r1 = (com.bumptech.glide.request.RequestOptions) r1
            return r1
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public static com.bumptech.glide.request.RequestOptions frameOf(@Yue.InterfaceC3281(from = 0) long r1) {
            com.bumptech.glide.request.RequestOptions r0 = new com.bumptech.glide.request.RequestOptions
            r0.<init>()
            com.bumptech.glide.request.BaseRequestOptions r1 = r0.frame(r1)
            com.bumptech.glide.request.RequestOptions r1 = (com.bumptech.glide.request.RequestOptions) r1
            return r1
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public static com.bumptech.glide.request.RequestOptions noAnimation() {
            com.bumptech.glide.request.RequestOptions r0 = com.bumptech.glide.request.RequestOptions.noAnimationOptions
            if (r0 != 0) goto L17
            com.bumptech.glide.request.RequestOptions r0 = new com.bumptech.glide.request.RequestOptions
            r0.<init>()
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.dontAnimate()
            com.bumptech.glide.request.RequestOptions r0 = (com.bumptech.glide.request.RequestOptions) r0
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.autoClone()
            com.bumptech.glide.request.RequestOptions r0 = (com.bumptech.glide.request.RequestOptions) r0
            com.bumptech.glide.request.RequestOptions.noAnimationOptions = r0
        L17:
            com.bumptech.glide.request.RequestOptions r0 = com.bumptech.glide.request.RequestOptions.noAnimationOptions
            return r0
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public static com.bumptech.glide.request.RequestOptions noTransformation() {
            com.bumptech.glide.request.RequestOptions r0 = com.bumptech.glide.request.RequestOptions.noTransformOptions
            if (r0 != 0) goto L17
            com.bumptech.glide.request.RequestOptions r0 = new com.bumptech.glide.request.RequestOptions
            r0.<init>()
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.dontTransform()
            com.bumptech.glide.request.RequestOptions r0 = (com.bumptech.glide.request.RequestOptions) r0
            com.bumptech.glide.request.BaseRequestOptions r0 = r0.autoClone()
            com.bumptech.glide.request.RequestOptions r0 = (com.bumptech.glide.request.RequestOptions) r0
            com.bumptech.glide.request.RequestOptions.noTransformOptions = r0
        L17:
            com.bumptech.glide.request.RequestOptions r0 = com.bumptech.glide.request.RequestOptions.noTransformOptions
            return r0
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public static <T> com.bumptech.glide.request.RequestOptions option(@Yue.InterfaceC4410 com.bumptech.glide.load.Option<T> r1, @Yue.InterfaceC4410 T r2) {
            com.bumptech.glide.request.RequestOptions r0 = new com.bumptech.glide.request.RequestOptions
            r0.<init>()
            com.bumptech.glide.request.BaseRequestOptions r1 = r0.set(r1, r2)
            com.bumptech.glide.request.RequestOptions r1 = (com.bumptech.glide.request.RequestOptions) r1
            return r1
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public static com.bumptech.glide.request.RequestOptions overrideOf(int r0) {
            com.bumptech.glide.request.RequestOptions r0 = overrideOf(r0, r0)
            return r0
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public static com.bumptech.glide.request.RequestOptions overrideOf(int r1, int r2) {
            com.bumptech.glide.request.RequestOptions r0 = new com.bumptech.glide.request.RequestOptions
            r0.<init>()
            com.bumptech.glide.request.BaseRequestOptions r1 = r0.override(r1, r2)
            com.bumptech.glide.request.RequestOptions r1 = (com.bumptech.glide.request.RequestOptions) r1
            return r1
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public static com.bumptech.glide.request.RequestOptions placeholderOf(@Yue.InterfaceC2004 int r1) {
            com.bumptech.glide.request.RequestOptions r0 = new com.bumptech.glide.request.RequestOptions
            r0.<init>()
            com.bumptech.glide.request.BaseRequestOptions r1 = r0.placeholder(r1)
            com.bumptech.glide.request.RequestOptions r1 = (com.bumptech.glide.request.RequestOptions) r1
            return r1
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public static com.bumptech.glide.request.RequestOptions placeholderOf(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1) {
            com.bumptech.glide.request.RequestOptions r0 = new com.bumptech.glide.request.RequestOptions
            r0.<init>()
            com.bumptech.glide.request.BaseRequestOptions r1 = r0.placeholder(r1)
            com.bumptech.glide.request.RequestOptions r1 = (com.bumptech.glide.request.RequestOptions) r1
            return r1
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public static com.bumptech.glide.request.RequestOptions priorityOf(@Yue.InterfaceC4410 com.bumptech.glide.Priority r1) {
            com.bumptech.glide.request.RequestOptions r0 = new com.bumptech.glide.request.RequestOptions
            r0.<init>()
            com.bumptech.glide.request.BaseRequestOptions r1 = r0.priority(r1)
            com.bumptech.glide.request.RequestOptions r1 = (com.bumptech.glide.request.RequestOptions) r1
            return r1
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public static com.bumptech.glide.request.RequestOptions signatureOf(@Yue.InterfaceC4410 com.bumptech.glide.load.Key r1) {
            com.bumptech.glide.request.RequestOptions r0 = new com.bumptech.glide.request.RequestOptions
            r0.<init>()
            com.bumptech.glide.request.BaseRequestOptions r1 = r0.signature(r1)
            com.bumptech.glide.request.RequestOptions r1 = (com.bumptech.glide.request.RequestOptions) r1
            return r1
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public static com.bumptech.glide.request.RequestOptions sizeMultiplierOf(@Yue.InterfaceC2458(from = 0.0d, to = 1.0d) float r1) {
            com.bumptech.glide.request.RequestOptions r0 = new com.bumptech.glide.request.RequestOptions
            r0.<init>()
            com.bumptech.glide.request.BaseRequestOptions r1 = r0.sizeMultiplier(r1)
            com.bumptech.glide.request.RequestOptions r1 = (com.bumptech.glide.request.RequestOptions) r1
            return r1
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public static com.bumptech.glide.request.RequestOptions skipMemoryCacheOf(boolean r1) {
            if (r1 == 0) goto L1d
            com.bumptech.glide.request.RequestOptions r1 = com.bumptech.glide.request.RequestOptions.skipMemoryCacheTrueOptions
            if (r1 != 0) goto L1a
            com.bumptech.glide.request.RequestOptions r1 = new com.bumptech.glide.request.RequestOptions
            r1.<init>()
            r0 = 1
            com.bumptech.glide.request.BaseRequestOptions r1 = r1.skipMemoryCache(r0)
            com.bumptech.glide.request.RequestOptions r1 = (com.bumptech.glide.request.RequestOptions) r1
            com.bumptech.glide.request.BaseRequestOptions r1 = r1.autoClone()
            com.bumptech.glide.request.RequestOptions r1 = (com.bumptech.glide.request.RequestOptions) r1
            com.bumptech.glide.request.RequestOptions.skipMemoryCacheTrueOptions = r1
        L1a:
            com.bumptech.glide.request.RequestOptions r1 = com.bumptech.glide.request.RequestOptions.skipMemoryCacheTrueOptions
            return r1
        L1d:
            com.bumptech.glide.request.RequestOptions r1 = com.bumptech.glide.request.RequestOptions.skipMemoryCacheFalseOptions
            if (r1 != 0) goto L35
            com.bumptech.glide.request.RequestOptions r1 = new com.bumptech.glide.request.RequestOptions
            r1.<init>()
            r0 = 0
            com.bumptech.glide.request.BaseRequestOptions r1 = r1.skipMemoryCache(r0)
            com.bumptech.glide.request.RequestOptions r1 = (com.bumptech.glide.request.RequestOptions) r1
            com.bumptech.glide.request.BaseRequestOptions r1 = r1.autoClone()
            com.bumptech.glide.request.RequestOptions r1 = (com.bumptech.glide.request.RequestOptions) r1
            com.bumptech.glide.request.RequestOptions.skipMemoryCacheFalseOptions = r1
        L35:
            com.bumptech.glide.request.RequestOptions r1 = com.bumptech.glide.request.RequestOptions.skipMemoryCacheFalseOptions
            return r1
    }

    @Yue.InterfaceC1120
    @Yue.InterfaceC4410
    public static com.bumptech.glide.request.RequestOptions timeoutOf(@Yue.InterfaceC3281(from = 0) int r1) {
            com.bumptech.glide.request.RequestOptions r0 = new com.bumptech.glide.request.RequestOptions
            r0.<init>()
            com.bumptech.glide.request.BaseRequestOptions r1 = r0.timeout(r1)
            com.bumptech.glide.request.RequestOptions r1 = (com.bumptech.glide.request.RequestOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.bumptech.glide.request.RequestOptions
            if (r0 == 0) goto Lc
            boolean r2 = super.equals(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }
}
