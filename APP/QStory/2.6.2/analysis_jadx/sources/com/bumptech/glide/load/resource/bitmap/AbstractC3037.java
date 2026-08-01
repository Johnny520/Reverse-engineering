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
import androidx.appcompat.app.C0108;
import androidx.compose.foundation.text.input.internal.AbstractC0871;
import com.alibaba.fastjson2.C2941;
import com.bumptech.glide.load.engine.C3003;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2978;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.locks.Lock;
import p222.AbstractC7988;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3037 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C3040 f9672 = new C3040(16);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C3003 f9671 = new C3003(new C2941(14));

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Bitmap m6516(Bitmap bitmap) {
        Gainmap gainmap = bitmap.getGainmap();
        if (gainmap != null) {
            Bitmap.Config config = gainmap.getGainmapContents().getConfig();
            Bitmap.Config config2 = Bitmap.Config.ALPHA_8;
            if (config == config2) {
                ColorMatrixColorFilter colorMatrixColorFilter = AbstractC3034.f9662;
                Bitmap gainmapContents = gainmap.getGainmapContents();
                if (gainmapContents.getConfig() == config2) {
                    AbstractC7988.m13443("", gainmapContents.getConfig() == config2);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(gainmapContents.getWidth(), gainmapContents.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint();
                    paint.setColorFilter(AbstractC3034.f9662);
                    canvas.drawBitmap(gainmapContents, 0.0f, 0.0f, paint);
                    canvas.setBitmap(null);
                    Gainmap gainmapM1691 = AbstractC0871.m1691(bitmapCreateBitmap);
                    float[] ratioMin = gainmap.getRatioMin();
                    gainmapM1691.setRatioMin(ratioMin[0], ratioMin[1], ratioMin[2]);
                    float[] ratioMax = gainmap.getRatioMax();
                    gainmapM1691.setRatioMax(ratioMax[0], ratioMax[1], ratioMax[2]);
                    float[] gamma = gainmap.getGamma();
                    gainmapM1691.setGamma(gamma[0], gamma[1], gamma[2]);
                    float[] epsilonSdr = gainmap.getEpsilonSdr();
                    gainmapM1691.setEpsilonSdr(epsilonSdr[0], epsilonSdr[1], epsilonSdr[2]);
                    float[] epsilonHdr = gainmap.getEpsilonHdr();
                    gainmapM1691.setEpsilonHdr(epsilonHdr[0], epsilonHdr[1], epsilonHdr[2]);
                    gainmapM1691.setDisplayRatioForFullHdr(gainmap.getDisplayRatioForFullHdr());
                    gainmapM1691.setMinDisplayRatioForHdrTransition(gainmap.getMinDisplayRatioForHdrTransition());
                    gainmap = gainmapM1691;
                }
                bitmap.setGainmap(gainmap);
            }
        }
        return bitmap.copy(Bitmap.Config.HARDWARE, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static boolean m6517(C0108 c0108) throws Throwable {
        try {
            boolean zM365 = c0108.m365();
            if (!Log.isLoggable("GlideBitmapFactory", 2)) {
                return zM365;
            }
            Log.v("GlideBitmapFactory", "isLikelyToContainGainmap=" + zM365);
            return zM365;
        } catch (IOException e) {
            if (!Log.isLoggable("GlideBitmapFactory", 2)) {
                return false;
            }
            Log.v("GlideBitmapFactory", "isLikelyToContainGainmap failed", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Bitmap m6518(InputStream inputStream, BitmapFactory.Options options, C0108 c0108) throws Throwable {
        int i = Build.VERSION.SDK_INT;
        Bitmap bitmap = null;
        if (i == 34) {
            if (((i == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE) ? ((Boolean) f9671.get()).booleanValue() : false) && m6517(c0108)) {
                Bitmap.Config config = options.inPreferredConfig;
                Bitmap.Config config2 = Bitmap.Config.HARDWARE;
                AbstractC7988.m13443("", config == config2);
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
                        Bitmap bitmapM6516 = m6516(bitmapDecodeStream);
                        bitmapDecodeStream.recycle();
                        options.inPreferredConfig = config2;
                        return bitmapM6516;
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
    public static C3025 m6519(InterfaceC2978 interfaceC2978, Drawable drawable, int i, int i2) {
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
                    Lock lock = AbstractC3018.f9623;
                    lock.lock();
                    Bitmap bitmapMo6401 = interfaceC2978.mo6401(i, i2, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmapMo6401);
                        current.setBounds(0, 0, i, i2);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = bitmapMo6401;
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
            interfaceC2978 = f9672;
        }
        return C3025.m6476(bitmap, interfaceC2978);
    }
}
