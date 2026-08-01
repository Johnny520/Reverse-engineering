package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Gainmap;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import androidx.appcompat.app.C0955;
import androidx.compose.foundation.text.input.internal.AbstractC1709;
import com.alibaba.fastjson2.C3775;
import com.bumptech.glide.load.engine.C3836;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3811;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.locks.Lock;
import p238.AbstractC8818;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3870 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C3873 f10019 = new C3873(16);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C3836 f10018 = new C3836(new C3775(14));

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Bitmap m7136(Bitmap bitmap) {
        Gainmap gainmap = bitmap.getGainmap();
        if (gainmap != null) {
            Bitmap.Config config = gainmap.getGainmapContents().getConfig();
            Bitmap.Config config2 = Bitmap.Config.ALPHA_8;
            if (config == config2) {
                ColorMatrixColorFilter colorMatrixColorFilter = AbstractC3867.f10009;
                Bitmap gainmapContents = gainmap.getGainmapContents();
                if (gainmapContents.getConfig() == config2) {
                    AbstractC8818.m14030("", gainmapContents.getConfig() == config2);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(gainmapContents.getWidth(), gainmapContents.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint();
                    paint.setColorFilter(AbstractC3867.f10009);
                    canvas.drawBitmap(gainmapContents, 0.0f, 0.0f, paint);
                    canvas.setBitmap(null);
                    Gainmap gainmapM2261 = AbstractC1709.m2261(bitmapCreateBitmap);
                    float[] ratioMin = gainmap.getRatioMin();
                    gainmapM2261.setRatioMin(ratioMin[0], ratioMin[1], ratioMin[2]);
                    float[] ratioMax = gainmap.getRatioMax();
                    gainmapM2261.setRatioMax(ratioMax[0], ratioMax[1], ratioMax[2]);
                    float[] gamma = gainmap.getGamma();
                    gainmapM2261.setGamma(gamma[0], gamma[1], gamma[2]);
                    float[] epsilonSdr = gainmap.getEpsilonSdr();
                    gainmapM2261.setEpsilonSdr(epsilonSdr[0], epsilonSdr[1], epsilonSdr[2]);
                    float[] epsilonHdr = gainmap.getEpsilonHdr();
                    gainmapM2261.setEpsilonHdr(epsilonHdr[0], epsilonHdr[1], epsilonHdr[2]);
                    gainmapM2261.setDisplayRatioForFullHdr(gainmap.getDisplayRatioForFullHdr());
                    gainmapM2261.setMinDisplayRatioForHdrTransition(gainmap.getMinDisplayRatioForHdrTransition());
                    gainmap = gainmapM2261;
                }
                bitmap.setGainmap(gainmap);
            }
        }
        return bitmap.copy(Bitmap.Config.HARDWARE, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static boolean m7137(C0955 c0955) throws Throwable {
        try {
            boolean zM926 = c0955.m926();
            if (!Log.isLoggable("GlideBitmapFactory", 2)) {
                return zM926;
            }
            Log.v("GlideBitmapFactory", "isLikelyToContainGainmap=" + zM926);
            return zM926;
        } catch (IOException e) {
            if (!Log.isLoggable("GlideBitmapFactory", 2)) {
                return false;
            }
            Log.v("GlideBitmapFactory", "isLikelyToContainGainmap failed", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Bitmap m7138(InputStream inputStream, BitmapFactory.Options options, C0955 c0955) throws Throwable {
        int i = Build.VERSION.SDK_INT;
        Bitmap bitmap = null;
        if (i == 34) {
            if (((i == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE) ? ((Boolean) f10018.get()).booleanValue() : false) && m7137(c0955)) {
                Bitmap.Config config = options.inPreferredConfig;
                Bitmap.Config config2 = Bitmap.Config.HARDWARE;
                AbstractC8818.m14030("", config == config2);
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                    if (bitmapDecodeStream == null) {
                        if (bitmapDecodeStream != null) {
                            bitmapDecodeStream.recycle();
                        }
                        options.inPreferredConfig = config2;
                        return null;
                    }
                    try {
                        Bitmap bitmapM7136 = m7136(bitmapDecodeStream);
                        bitmapDecodeStream.recycle();
                        options.inPreferredConfig = config2;
                        return bitmapM7136;
                    } catch (Throwable th) {
                        th = th;
                        bitmap = bitmapDecodeStream;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        options.inPreferredConfig = Bitmap.Config.HARDWARE;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C3858 m7139(InterfaceC3811 interfaceC3811, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i2 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i2 = current.getIntrinsicHeight();
                    }
                    Lock lock = AbstractC3851.f9970;
                    lock.lock();
                    Bitmap bitmapMo7019 = interfaceC3811.mo7019(i, i2, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmapMo7019);
                        current.setBounds(0, 0, i, i2);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = bitmapMo7019;
                        z = true;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            bitmap = null;
            z = true;
        }
        if (!z) {
            interfaceC3811 = f10019;
        }
        return C3858.m7096(bitmap, interfaceC3811);
    }
}
