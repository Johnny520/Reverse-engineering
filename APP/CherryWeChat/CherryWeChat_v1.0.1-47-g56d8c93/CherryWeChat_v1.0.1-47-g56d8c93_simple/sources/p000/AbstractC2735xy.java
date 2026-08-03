package p000;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: xy */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2735xy {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f9342a = null;

    static {
        int[] r0 = new int[Bitmap.Config.values().length];
        f9342a = r0;
        r0[Bitmap.Config.ARGB_8888.ordinal()] = 1;     // Catch: NoSuchFieldError -> L8
    L12:
        f9342a[Bitmap.Config.RGB_565.ordinal()] = 2;     // Catch: NoSuchFieldError -> L9
    L14:
        f9342a[Bitmap.Config.ARGB_4444.ordinal()] = 3;     // Catch: NoSuchFieldError -> L10
    L18:
        f9342a[Bitmap.Config.ALPHA_8.ordinal()] = 4;     // Catch: NoSuchFieldError -> L11
        return;
    }
}
