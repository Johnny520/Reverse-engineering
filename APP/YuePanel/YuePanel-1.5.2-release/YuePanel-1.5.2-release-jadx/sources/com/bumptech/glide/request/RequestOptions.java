package com.bumptech.glide.request;

import Yue.InterfaceC3809;
import Yue.InterfaceC4525;
import Yue.InterfaceC4885;
import Yue.InterfaceC5459;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.google.android.material.color.utilities.Contrast;

/* JADX INFO: loaded from: classes.dex */
public class RequestOptions extends BaseRequestOptions<RequestOptions> {

    @InterfaceC6490
    private static RequestOptions centerCropOptions;

    @InterfaceC6490
    private static RequestOptions centerInsideOptions;

    @InterfaceC6490
    private static RequestOptions circleCropOptions;

    @InterfaceC6490
    private static RequestOptions fitCenterOptions;

    @InterfaceC6490
    private static RequestOptions noAnimationOptions;

    @InterfaceC6490
    private static RequestOptions noTransformOptions;

    @InterfaceC6490
    private static RequestOptions skipMemoryCacheFalseOptions;

    @InterfaceC6490
    private static RequestOptions skipMemoryCacheTrueOptions;

    @InterfaceC3809
    @InterfaceC6391
    public static RequestOptions bitmapTransform(@InterfaceC6391 Transformation<Bitmap> transformation) {
        return new RequestOptions().transform(transformation);
    }

    @InterfaceC3809
    @InterfaceC6391
    public static RequestOptions centerCropTransform() {
        if (centerCropOptions == null) {
            centerCropOptions = new RequestOptions().centerCrop().autoClone();
        }
        return centerCropOptions;
    }

    @InterfaceC3809
    @InterfaceC6391
    public static RequestOptions centerInsideTransform() {
        if (centerInsideOptions == null) {
            centerInsideOptions = new RequestOptions().centerInside().autoClone();
        }
        return centerInsideOptions;
    }

    @InterfaceC3809
    @InterfaceC6391
    public static RequestOptions circleCropTransform() {
        if (circleCropOptions == null) {
            circleCropOptions = new RequestOptions().circleCrop().autoClone();
        }
        return circleCropOptions;
    }

    @InterfaceC3809
    @InterfaceC6391
    public static RequestOptions decodeTypeOf(@InterfaceC6391 Class<?> cls) {
        return new RequestOptions().decode(cls);
    }

    @InterfaceC3809
    @InterfaceC6391
    public static RequestOptions diskCacheStrategyOf(@InterfaceC6391 DiskCacheStrategy diskCacheStrategy) {
        return new RequestOptions().diskCacheStrategy(diskCacheStrategy);
    }

    @InterfaceC3809
    @InterfaceC6391
    public static RequestOptions downsampleOf(@InterfaceC6391 DownsampleStrategy downsampleStrategy) {
        return new RequestOptions().downsample(downsampleStrategy);
    }

    @InterfaceC3809
    @InterfaceC6391
    public static RequestOptions encodeFormatOf(@InterfaceC6391 Bitmap.CompressFormat compressFormat) {
        return new RequestOptions().encodeFormat(compressFormat);
    }

    @InterfaceC3809
    @InterfaceC6391
    public static RequestOptions encodeQualityOf(@InterfaceC5459(from = 0, m2228to = 100) int i) {
        return new RequestOptions().encodeQuality(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3809
    @InterfaceC6391
    public static RequestOptions errorOf(@InterfaceC6490 Drawable drawable) {
        return new RequestOptions().error(drawable);
    }

    @InterfaceC3809
    @InterfaceC6391
    public static RequestOptions fitCenterTransform() {
        if (fitCenterOptions == null) {
            fitCenterOptions = new RequestOptions().fitCenter().autoClone();
        }
        return fitCenterOptions;
    }

    @InterfaceC3809
    @InterfaceC6391
    public static RequestOptions formatOf(@InterfaceC6391 DecodeFormat decodeFormat) {
        return new RequestOptions().format(decodeFormat);
    }

    @InterfaceC3809
    @InterfaceC6391
    public static RequestOptions frameOf(@InterfaceC5459(from = 0) long j) {
        return new RequestOptions().frame(j);
    }

    @InterfaceC3809
    @InterfaceC6391
    public static RequestOptions noAnimation() {
        if (noAnimationOptions == null) {
            noAnimationOptions = new RequestOptions().dontAnimate().autoClone();
        }
        return noAnimationOptions;
    }

    @InterfaceC3809
    @InterfaceC6391
    public static RequestOptions noTransformation() {
        if (noTransformOptions == null) {
            noTransformOptions = new RequestOptions().dontTransform().autoClone();
        }
        return noTransformOptions;
    }

    @InterfaceC3809
    @InterfaceC6391
    public static <T> RequestOptions option(@InterfaceC6391 Option<T> option, @InterfaceC6391 T t) {
        return new RequestOptions().set(option, t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3809
    @InterfaceC6391
    public static RequestOptions overrideOf(int i, int i2) {
        return new RequestOptions().override(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3809
    @InterfaceC6391
    public static RequestOptions placeholderOf(@InterfaceC6490 Drawable drawable) {
        return new RequestOptions().placeholder(drawable);
    }

    @InterfaceC3809
    @InterfaceC6391
    public static RequestOptions priorityOf(@InterfaceC6391 Priority priority) {
        return new RequestOptions().priority(priority);
    }

    @InterfaceC3809
    @InterfaceC6391
    public static RequestOptions signatureOf(@InterfaceC6391 Key key) {
        return new RequestOptions().signature(key);
    }

    @InterfaceC3809
    @InterfaceC6391
    public static RequestOptions sizeMultiplierOf(@InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN) float f) {
        return new RequestOptions().sizeMultiplier(f);
    }

    @InterfaceC3809
    @InterfaceC6391
    public static RequestOptions skipMemoryCacheOf(boolean z) {
        if (z) {
            if (skipMemoryCacheTrueOptions == null) {
                skipMemoryCacheTrueOptions = new RequestOptions().skipMemoryCache(true).autoClone();
            }
            return skipMemoryCacheTrueOptions;
        }
        if (skipMemoryCacheFalseOptions == null) {
            skipMemoryCacheFalseOptions = new RequestOptions().skipMemoryCache(false).autoClone();
        }
        return skipMemoryCacheFalseOptions;
    }

    @InterfaceC3809
    @InterfaceC6391
    public static RequestOptions timeoutOf(@InterfaceC5459(from = 0) int i) {
        return new RequestOptions().timeout(i);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public boolean equals(Object obj) {
        return (obj instanceof RequestOptions) && super.equals(obj);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public int hashCode() {
        return super.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC3809
    @InterfaceC6391
    public static RequestOptions errorOf(@InterfaceC4525 int i) {
        return new RequestOptions().error(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC3809
    @InterfaceC6391
    public static RequestOptions overrideOf(int i) {
        return overrideOf(i, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC3809
    @InterfaceC6391
    public static RequestOptions placeholderOf(@InterfaceC4525 int i) {
        return new RequestOptions().placeholder(i);
    }
}
