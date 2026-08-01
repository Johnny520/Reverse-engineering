package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3811;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;
import p238.AbstractC8818;
import p302.InterfaceC9222;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3853 extends AbstractC3857 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final byte[] f9972 = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(InterfaceC9222.f23615);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f9973;

    public C3853(int i) {
        AbstractC8818.m14030("roundingRadius must be greater than 0.", i > 0);
        this.f9973 = i;
    }

    @Override // p302.InterfaceC9222
    public final boolean equals(Object obj) {
        return (obj instanceof C3853) && this.f9973 == ((C3853) obj).f9973;
    }

    @Override // p302.InterfaceC9222
    public final int hashCode() {
        return AbstractC8818.m14038(-569625254, AbstractC8818.m14038(this.f9973, 17));
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3857
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Bitmap mo7091(InterfaceC3811 interfaceC3811, Bitmap bitmap, int i, int i2) {
        Bitmap bitmapMo7019;
        Paint paint = AbstractC3851.f9971;
        int i3 = this.f9973;
        AbstractC8818.m14030("roundingRadius must be greater than 0.", i3 > 0);
        Lock lock = AbstractC3851.f9970;
        Bitmap.Config config = Bitmap.Config.RGBA_F16;
        Bitmap.Config config2 = config.equals(bitmap.getConfig()) ? config : Bitmap.Config.ARGB_8888;
        if (!config.equals(bitmap.getConfig())) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (config.equals(bitmap.getConfig())) {
            bitmapMo7019 = bitmap;
        } else {
            bitmapMo7019 = interfaceC3811.mo7019(bitmap.getWidth(), bitmap.getHeight(), config);
            new Canvas(bitmapMo7019).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        Bitmap bitmapMo70192 = interfaceC3811.mo7019(bitmapMo7019.getWidth(), bitmapMo7019.getHeight(), config2);
        bitmapMo70192.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapMo7019, tileMode, tileMode);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapMo70192.getWidth(), bitmapMo70192.getHeight());
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapMo70192);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f = i3;
            canvas.drawRoundRect(rectF, f, f, paint2);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapMo7019.equals(bitmap)) {
                interfaceC3811.mo7015(bitmapMo7019);
            }
            return bitmapMo70192;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // p302.InterfaceC9222
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7028(MessageDigest messageDigest) {
        messageDigest.update(f9972);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f9973).array());
    }
}
