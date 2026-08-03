package p000;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;

/* JADX INFO: renamed from: cl */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1269cl {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f4314a;

    static {
        int[] iArr = new int[ImageHeaderParser$ImageType.values().length];
        f4314a = iArr;
        try {
            iArr[ImageHeaderParser$ImageType.WEBP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f4314a[ImageHeaderParser$ImageType.WEBP_A.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f4314a[ImageHeaderParser$ImageType.ANIMATED_WEBP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
