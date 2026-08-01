package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2978;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;
import p222.AbstractC7988;
import p286.InterfaceC8392;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3020 extends AbstractC3024 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final byte[] f9625 = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(InterfaceC8392.f23271);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f9626;

    public C3020(int i) {
        AbstractC7988.m13443("roundingRadius must be greater than 0.", i > 0);
        this.f9626 = i;
    }

    @Override // p286.InterfaceC8392
    public final boolean equals(Object obj) {
        return (obj instanceof C3020) && this.f9626 == ((C3020) obj).f9626;
    }

    @Override // p286.InterfaceC8392
    public final int hashCode() {
        return AbstractC7988.m13451(-569625254, AbstractC7988.m13451(this.f9626, 17));
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3024
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Bitmap mo6471(InterfaceC2978 interfaceC2978, Bitmap bitmap, int i, int i2) {
        Bitmap bitmapMo6401;
        Paint paint = AbstractC3018.f9624;
        int i3 = this.f9626;
        AbstractC7988.m13443("roundingRadius must be greater than 0.", i3 > 0);
        Lock lock = AbstractC3018.f9623;
        Bitmap.Config config = Bitmap.Config.RGBA_F16;
        Bitmap.Config config2 = config.equals(bitmap.getConfig()) ? config : Bitmap.Config.ARGB_8888;
        if (!config.equals(bitmap.getConfig())) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (config.equals(bitmap.getConfig())) {
            bitmapMo6401 = bitmap;
        } else {
            bitmapMo6401 = interfaceC2978.mo6401(bitmap.getWidth(), bitmap.getHeight(), config);
            new Canvas(bitmapMo6401).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        Bitmap bitmapMo64012 = interfaceC2978.mo6401(bitmapMo6401.getWidth(), bitmapMo6401.getHeight(), config2);
        bitmapMo64012.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapMo6401, tileMode, tileMode);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapMo64012.getWidth(), bitmapMo64012.getHeight());
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapMo64012);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f = i3;
            canvas.drawRoundRect(rectF, f, f, paint2);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapMo6401.equals(bitmap)) {
                interfaceC2978.mo6397(bitmapMo6401);
            }
            return bitmapMo64012;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // p286.InterfaceC8392
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6410(MessageDigest messageDigest) {
        messageDigest.update(f9625);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f9626).array());
    }
}
