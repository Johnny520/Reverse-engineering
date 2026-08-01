package p121Y1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;
import p078P1.InterfaceC1144f;
import p093S1.InterfaceC1289a;

/* JADX INFO: renamed from: Y1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1749j extends AbstractC1744e {

    /* JADX INFO: renamed from: b */
    public static final byte[] f6024b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(InterfaceC1144f.f3779a);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p078P1.InterfaceC1144f
    /* JADX INFO: renamed from: b */
    public final void mo2199b(MessageDigest messageDigest) {
        messageDigest.update(f6024b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121Y1.AbstractC1744e
    /* JADX INFO: renamed from: c */
    public final Bitmap mo3100c(InterfaceC1289a interfaceC1289a, Bitmap bitmap, int i5, int i6) {
        Bitmap bitmapMo153d;
        Lock lock = AbstractC1735C.f5995d;
        int iMin = Math.min(i5, i6);
        float f2 = iMin;
        float f5 = f2 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f2 / width, f2 / height);
        float f6 = width * fMax;
        float f7 = fMax * height;
        float f8 = (f2 - f6) / 2.0f;
        float f9 = (f2 - f7) / 2.0f;
        RectF rectF = new RectF(f8, f9, f6 + f8, f7 + f9);
        Bitmap.Config config = Bitmap.Config.RGBA_F16;
        Bitmap.Config config2 = config.equals(bitmap.getConfig()) ? config : Bitmap.Config.ARGB_8888;
        if (config2.equals(bitmap.getConfig())) {
            bitmapMo153d = bitmap;
        } else {
            bitmapMo153d = interfaceC1289a.mo153d(bitmap.getWidth(), bitmap.getHeight(), config2);
            new Canvas(bitmapMo153d).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        if (!config.equals(bitmap.getConfig())) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapMo153d2 = interfaceC1289a.mo153d(iMin, iMin, config);
        bitmapMo153d2.setHasAlpha(true);
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapMo153d2);
            canvas.drawCircle(f5, f5, f5, AbstractC1735C.f5993b);
            canvas.drawBitmap(bitmapMo153d, (Rect) null, rectF, AbstractC1735C.f5994c);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapMo153d.equals(bitmap)) {
                interfaceC1289a.mo154e(bitmapMo153d);
            }
            return bitmapMo153d2;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p078P1.InterfaceC1144f
    public final boolean equals(Object obj) {
        return obj instanceof C1749j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p078P1.InterfaceC1144f
    public final int hashCode() {
        return 1101716364;
    }
}
