package p000;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: uD */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2579uD {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f8937a = null;

    static {
        int[] r0 = new int[Bitmap.Config.values().length];
        f8937a = r0;
        r0[Bitmap.Config.ALPHA_8.ordinal()] = 1;     // Catch: NoSuchFieldError -> L9
    L14:
        f8937a[Bitmap.Config.RGB_565.ordinal()] = 2;     // Catch: NoSuchFieldError -> L10
    L18:
        f8937a[Bitmap.Config.ARGB_4444.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
    L22:
        f8937a[Bitmap.Config.RGBA_F16.ordinal()] = 4;     // Catch: NoSuchFieldError -> L12
    L16:
        f8937a[Bitmap.Config.ARGB_8888.ordinal()] = 5;     // Catch: NoSuchFieldError -> L13
        return;
    }
}
