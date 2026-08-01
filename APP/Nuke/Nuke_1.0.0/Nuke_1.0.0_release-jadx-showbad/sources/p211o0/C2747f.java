package p211o0;

import android.graphics.Bitmap;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: o0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2747f {

    /* JADX INFO: renamed from: a */
    public final Bitmap f8734a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2747f(Bitmap bitmap) {
        this.f8734a = bitmap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m4862a() {
        Bitmap.Config config = this.f8734a.getConfig();
        AbstractC1665j.m2982b(config);
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
