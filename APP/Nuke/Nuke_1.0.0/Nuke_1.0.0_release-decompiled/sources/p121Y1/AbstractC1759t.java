package p121Y1;

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
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.locks.Lock;
import p000A.C0072l0;
import p029F0.C0363A;
import p088R1.C1213n;
import p093S1.InterfaceC1289a;
import p195l2.AbstractC2503g;

/* JADX INFO: renamed from: Y1.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1759t {

    /* JADX INFO: renamed from: a */
    public static final C1758s f6051a = new C1758s(22);

    /* JADX INFO: renamed from: b */
    public static final C1213n f6052b = new C1213n(new C0363A(11));

    /* JADX INFO: renamed from: a */
    public static C1743d m3134a(InterfaceC1289a interfaceC1289a, Drawable drawable, int i5, int i6) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z5 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i5 != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i6 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i5 = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i6 = current.getIntrinsicHeight();
                    }
                    Lock lock = AbstractC1735C.f5995d;
                    lock.lock();
                    Bitmap bitmapMo153d = interfaceC1289a.mo153d(i5, i6, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmapMo153d);
                        current.setBounds(0, 0, i5, i6);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = bitmapMo153d;
                        z5 = true;
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
            z5 = true;
        }
        if (!z5) {
            interfaceC1289a = f6051a;
        }
        return C1743d.m3099b(interfaceC1289a, bitmap);
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m3135b(InputStream inputStream, BitmapFactory.Options options, C0072l0 c0072l0) throws Throwable {
        int i5 = Build.VERSION.SDK_INT;
        Bitmap bitmap = null;
        if (i5 == 34) {
            if (((i5 == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE) ? ((Boolean) f6052b.get()).booleanValue() : false) && m3136c(c0072l0)) {
                Bitmap.Config config = options.inPreferredConfig;
                Bitmap.Config config2 = Bitmap.Config.HARDWARE;
                AbstractC2503g.m4443a("", config == config2);
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
                        Bitmap bitmapM3137d = m3137d(bitmapDecodeStream);
                        bitmapDecodeStream.recycle();
                        options.inPreferredConfig = config2;
                        return bitmapM3137d;
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

    /* JADX INFO: renamed from: c */
    public static boolean m3136c(C0072l0 c0072l0) throws Throwable {
        try {
            boolean zM111o = c0072l0.m111o();
            if (!Log.isLoggable("GlideBitmapFactory", 2)) {
                return zM111o;
            }
            Log.v("GlideBitmapFactory", "isLikelyToContainGainmap=" + zM111o);
            return zM111o;
        } catch (IOException e5) {
            if (!Log.isLoggable("GlideBitmapFactory", 2)) {
                return false;
            }
            Log.v("GlideBitmapFactory", "isLikelyToContainGainmap failed", e5);
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static Bitmap m3137d(Bitmap bitmap) {
        Gainmap gainmap = bitmap.getGainmap();
        if (gainmap != null) {
            Bitmap.Config config = gainmap.getGainmapContents().getConfig();
            Bitmap.Config config2 = Bitmap.Config.ALPHA_8;
            if (config == config2) {
                ColorMatrixColorFilter colorMatrixColorFilter = AbstractC1764y.f6056a;
                Bitmap gainmapContents = gainmap.getGainmapContents();
                if (gainmapContents.getConfig() == config2) {
                    AbstractC2503g.m4443a("", gainmapContents.getConfig() == config2);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(gainmapContents.getWidth(), gainmapContents.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint();
                    paint.setColorFilter(AbstractC1764y.f6056a);
                    canvas.drawBitmap(gainmapContents, 0.0f, 0.0f, paint);
                    canvas.setBitmap(null);
                    Gainmap gainmapM3141d = AbstractC1763x.m3141d(bitmapCreateBitmap);
                    float[] ratioMin = gainmap.getRatioMin();
                    gainmapM3141d.setRatioMin(ratioMin[0], ratioMin[1], ratioMin[2]);
                    float[] ratioMax = gainmap.getRatioMax();
                    gainmapM3141d.setRatioMax(ratioMax[0], ratioMax[1], ratioMax[2]);
                    float[] gamma = gainmap.getGamma();
                    gainmapM3141d.setGamma(gamma[0], gamma[1], gamma[2]);
                    float[] epsilonSdr = gainmap.getEpsilonSdr();
                    gainmapM3141d.setEpsilonSdr(epsilonSdr[0], epsilonSdr[1], epsilonSdr[2]);
                    float[] epsilonHdr = gainmap.getEpsilonHdr();
                    gainmapM3141d.setEpsilonHdr(epsilonHdr[0], epsilonHdr[1], epsilonHdr[2]);
                    gainmapM3141d.setDisplayRatioForFullHdr(gainmap.getDisplayRatioForFullHdr());
                    gainmapM3141d.setMinDisplayRatioForHdrTransition(gainmap.getMinDisplayRatioForHdrTransition());
                    gainmap = gainmapM3141d;
                }
                bitmap.setGainmap(gainmap);
            }
        }
        return bitmap.copy(Bitmap.Config.HARDWARE, false);
    }
}
