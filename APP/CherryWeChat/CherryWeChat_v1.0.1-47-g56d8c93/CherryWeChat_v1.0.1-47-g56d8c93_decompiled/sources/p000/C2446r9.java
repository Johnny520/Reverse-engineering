package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: r9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2446r9 extends AbstractC0651P5 {

    /* JADX INFO: renamed from: b */
    public static final byte[] f8571b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(InterfaceC0802Sm.f2524a);

    @Override // p000.InterfaceC0802Sm
    /* JADX INFO: renamed from: b */
    public final void mo172b(MessageDigest messageDigest) {
        messageDigest.update(f8571b);
    }

    @Override // p000.AbstractC0651P5
    /* JADX INFO: renamed from: c */
    public final Bitmap mo1317c(InterfaceC0565N5 interfaceC0565N5, Bitmap bitmap, int i, int i2) {
        Bitmap bitmapMo52g;
        Lock lock = AbstractC0184EB.f548d;
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
            bitmapMo52g = bitmap;
        } else {
            bitmapMo52g = interfaceC0565N5.mo52g(bitmap.getWidth(), bitmap.getHeight(), config2);
            new Canvas(bitmapMo52g).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        if (!config.equals(bitmap.getConfig())) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapMo52g2 = interfaceC0565N5.mo52g(iMin, iMin, config);
        bitmapMo52g2.setHasAlpha(true);
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapMo52g2);
            canvas.drawCircle(f2, f2, f2, AbstractC0184EB.f546b);
            canvas.drawBitmap(bitmapMo52g, (Rect) null, rectF, AbstractC0184EB.f547c);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapMo52g.equals(bitmap)) {
                interfaceC0565N5.mo53h(bitmapMo52g);
            }
            return bitmapMo52g2;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // p000.InterfaceC0802Sm
    public final boolean equals(Object obj) {
        return obj instanceof C2446r9;
    }

    @Override // p000.InterfaceC0802Sm
    public final int hashCode() {
        return 1101716364;
    }
}
