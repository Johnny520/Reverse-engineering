package p093S1;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: S1.i */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1297i {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f4647a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int[] iArr = new int[Bitmap.Config.values().length];
        f4647a = iArr;
        try {
            iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f4647a[Bitmap.Config.RGB_565.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f4647a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f4647a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
