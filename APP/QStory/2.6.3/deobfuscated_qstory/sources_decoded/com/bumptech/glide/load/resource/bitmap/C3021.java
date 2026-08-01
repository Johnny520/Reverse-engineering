package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2979;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;
import p222.AbstractC7989;
import p286.InterfaceC8393;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3021 extends AbstractC3025 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final byte[] f9627 = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(InterfaceC8393.f23270);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f9628;

    public C3021(int i) {
        AbstractC7989.m13471("roundingRadius must be greater than 0.", i > 0);
        this.f9628 = i;
    }

    @Override // p286.InterfaceC8393
    public final boolean equals(Object obj) {
        return (obj instanceof C3021) && this.f9628 == ((C3021) obj).f9628;
    }

    @Override // p286.InterfaceC8393
    public final int hashCode() {
        return AbstractC7989.m13479(-569625254, AbstractC7989.m13479(this.f9628, 17));
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3025
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Bitmap mo6531(InterfaceC2979 interfaceC2979, Bitmap bitmap, int i, int i2) {
        Bitmap bitmapMo6459;
        Paint paint = AbstractC3019.f9626;
        int i3 = this.f9628;
        AbstractC7989.m13471("roundingRadius must be greater than 0.", i3 > 0);
        Lock lock = AbstractC3019.f9625;
        Bitmap.Config config = Bitmap.Config.RGBA_F16;
        Bitmap.Config config2 = config.equals(bitmap.getConfig()) ? config : Bitmap.Config.ARGB_8888;
        if (!config.equals(bitmap.getConfig())) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (config.equals(bitmap.getConfig())) {
            bitmapMo6459 = bitmap;
        } else {
            bitmapMo6459 = interfaceC2979.mo6459(bitmap.getWidth(), bitmap.getHeight(), config);
            new Canvas(bitmapMo6459).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        Bitmap bitmapMo64592 = interfaceC2979.mo6459(bitmapMo6459.getWidth(), bitmapMo6459.getHeight(), config2);
        bitmapMo64592.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapMo6459, tileMode, tileMode);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapMo64592.getWidth(), bitmapMo64592.getHeight());
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapMo64592);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f = i3;
            canvas.drawRoundRect(rectF, f, f, paint2);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapMo6459.equals(bitmap)) {
                interfaceC2979.mo6455(bitmapMo6459);
            }
            return bitmapMo64592;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // p286.InterfaceC8393
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6468(MessageDigest messageDigest) {
        messageDigest.update(f9627);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f9628).array());
    }
}
