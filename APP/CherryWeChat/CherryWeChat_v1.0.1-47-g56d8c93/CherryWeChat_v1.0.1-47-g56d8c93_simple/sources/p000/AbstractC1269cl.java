package p000;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;

/* JADX INFO: renamed from: cl */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1269cl {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f4314a = null;

    static {
        int[] r0 = new int[ImageHeaderParser$ImageType.values().length];
        f4314a = r0;
        r0[ImageHeaderParser$ImageType.WEBP.ordinal()] = 1;     // Catch: NoSuchFieldError -> L7
    L10:
        f4314a[ImageHeaderParser$ImageType.WEBP_A.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
    L12:
        f4314a[ImageHeaderParser$ImageType.ANIMATED_WEBP.ordinal()] = 3;     // Catch: NoSuchFieldError -> L9
        return;
    }
}
