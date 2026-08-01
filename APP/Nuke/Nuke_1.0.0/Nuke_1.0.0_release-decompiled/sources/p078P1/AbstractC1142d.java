package p078P1;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;

/* JADX INFO: renamed from: P1.d */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1142d {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f3778a;

    static {
        int[] iArr = new int[ImageHeaderParser$ImageType.values().length];
        f3778a = iArr;
        try {
            iArr[ImageHeaderParser$ImageType.WEBP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f3778a[ImageHeaderParser$ImageType.WEBP_A.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f3778a[ImageHeaderParser$ImageType.ANIMATED_WEBP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
