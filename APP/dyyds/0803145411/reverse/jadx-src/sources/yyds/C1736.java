package yyds;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: yyds.ᛸᛳᛴᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1736 extends AbstractC2134 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final byte[] f8783 = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(InterfaceC1410.f6680);

    @Override // yyds.InterfaceC1410
    public final boolean equals(Object obj) {
        return obj instanceof C1736;
    }

    @Override // yyds.InterfaceC1410
    public final int hashCode() {
        return 1101716364;
    }

    @Override // yyds.InterfaceC1410
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo1227(MessageDigest messageDigest) {
        messageDigest.update(f8783);
    }

    @Override // yyds.AbstractC2134
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final Bitmap mo1402(InterfaceC2587 interfaceC2587, Bitmap bitmap, int i, int i2) {
        Bitmap bitmapMo1861;
        Lock lock = AbstractC2663.f13070;
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
            bitmapMo1861 = bitmap;
        } else {
            bitmapMo1861 = interfaceC2587.mo1861(bitmap.getWidth(), bitmap.getHeight(), config2);
            new Canvas(bitmapMo1861).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        if (!config.equals(bitmap.getConfig())) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapMo18612 = interfaceC2587.mo1861(iMin, iMin, config);
        bitmapMo18612.setHasAlpha(true);
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapMo18612);
            canvas.drawCircle(f2, f2, f2, AbstractC2663.f13068);
            canvas.drawBitmap(bitmapMo1861, (Rect) null, rectF, AbstractC2663.f13069);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapMo1861.equals(bitmap)) {
                interfaceC2587.mo1856(bitmapMo1861);
            }
            return bitmapMo18612;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }
}
