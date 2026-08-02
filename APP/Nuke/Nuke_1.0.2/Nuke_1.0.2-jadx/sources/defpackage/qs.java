package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qs extends bl {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(a51.a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a51
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.bl
    public final Bitmap c(zk zkVar, Bitmap bitmap, int i, int i2) {
        Bitmap bitmapF;
        Lock lock = p33.d;
        int iMin = Math.min(i, i2);
        float f = iMin;
        float f2 = f / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f / width, f / height);
        float f3 = width * fMax;
        float f4 = fMax * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap.Config config = Bitmap.Config.RGBA_F16;
        Bitmap.Config config2 = config.equals(bitmap.getConfig()) ? config : Bitmap.Config.ARGB_8888;
        if (config2.equals(bitmap.getConfig())) {
            bitmapF = bitmap;
        } else {
            bitmapF = zkVar.f(bitmap.getWidth(), bitmap.getHeight(), config2);
            new Canvas(bitmapF).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        if (!config.equals(bitmap.getConfig())) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapF2 = zkVar.f(iMin, iMin, config);
        bitmapF2.setHasAlpha(true);
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapF2);
            canvas.drawCircle(f2, f2, f2, p33.b);
            canvas.drawBitmap(bitmapF, (Rect) null, rectF, p33.c);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapF.equals(bitmap)) {
                zkVar.h(bitmapF);
            }
            return bitmapF2;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a51
    public final boolean equals(Object obj) {
        return obj instanceof qs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a51
    public final int hashCode() {
        return 1101716364;
    }
}
