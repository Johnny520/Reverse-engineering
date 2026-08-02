package p000;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* JADX INFO: renamed from: aq */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0027aq extends AbstractC0059bl {

    /* JADX INFO: renamed from: b */
    public static final byte[] f332b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(a51.f64a);

    @Override // p000.a51
    /* JADX INFO: renamed from: b */
    public final void mo96b(MessageDigest messageDigest) {
        messageDigest.update(f332b);
    }

    @Override // p000.AbstractC0059bl
    /* JADX INFO: renamed from: c */
    public final Bitmap mo258c(InterfaceC0965zk interfaceC0965zk, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        Paint paint = p33.f7960a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            width2 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapMo1324f = interfaceC0965zk.mo1324f(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapMo1324f.setHasAlpha(bitmap.hasAlpha());
        p33.m3689a(bitmap, bitmapMo1324f, matrix);
        if (!bitmapMo1324f.equals(bitmap) && ((bitmapMo1324f.getWidth() != bitmap.getWidth() || bitmapMo1324f.getHeight() != bitmap.getHeight()) && Log.isLoggable("GlideMemoryTracking", 3))) {
            b93.m503j("TransformationUtils [centerCrop]", null, bitmapMo1324f, bitmap.getWidth(), bitmap.getHeight());
        }
        return bitmapMo1324f;
    }

    @Override // p000.a51
    public final boolean equals(Object obj) {
        return obj instanceof C0027aq;
    }

    @Override // p000.a51
    public final int hashCode() {
        return -599754482;
    }
}
