package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: qs */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0630qs extends AbstractC0059bl {

    /* JADX INFO: renamed from: b */
    public static final byte[] f9143b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(a51.f64a);

    @Override // p000.a51
    /* JADX INFO: renamed from: b */
    public final void mo96b(MessageDigest messageDigest) {
        messageDigest.update(f9143b);
    }

    @Override // p000.AbstractC0059bl
    /* JADX INFO: renamed from: c */
    public final Bitmap mo258c(InterfaceC0965zk interfaceC0965zk, Bitmap bitmap, int i, int i2) {
        Bitmap bitmapMo1324f;
        Lock lock = p33.f7963d;
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
            bitmapMo1324f = bitmap;
        } else {
            bitmapMo1324f = interfaceC0965zk.mo1324f(bitmap.getWidth(), bitmap.getHeight(), config2);
            new Canvas(bitmapMo1324f).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        if (!config.equals(bitmap.getConfig())) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapMo1324f2 = interfaceC0965zk.mo1324f(iMin, iMin, config);
        bitmapMo1324f2.setHasAlpha(true);
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapMo1324f2);
            canvas.drawCircle(f2, f2, f2, p33.f7961b);
            canvas.drawBitmap(bitmapMo1324f, (Rect) null, rectF, p33.f7962c);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapMo1324f.equals(bitmap)) {
                interfaceC0965zk.mo1325h(bitmapMo1324f);
            }
            return bitmapMo1324f2;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // p000.a51
    public final boolean equals(Object obj) {
        return obj instanceof C0630qs;
    }

    @Override // p000.a51
    public final int hashCode() {
        return 1101716364;
    }
}
