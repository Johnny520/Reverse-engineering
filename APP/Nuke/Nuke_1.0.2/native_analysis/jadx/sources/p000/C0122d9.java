package p000;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: d9 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0122d9 {

    /* JADX INFO: renamed from: a */
    public final Bitmap f1913a;

    public C0122d9(Bitmap bitmap) {
        this.f1913a = bitmap;
    }

    /* JADX INFO: renamed from: a */
    public final int m971a() {
        Bitmap.Config config = this.f1913a.getConfig();
        config.getClass();
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        if (config == Bitmap.Config.RGBA_F16) {
            return 3;
        }
        return config == Bitmap.Config.HARDWARE ? 4 : 0;
    }
}
