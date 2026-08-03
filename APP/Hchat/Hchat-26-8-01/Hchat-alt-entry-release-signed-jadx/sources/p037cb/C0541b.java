package p037cb;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p080fb.AbstractC1184v0;
import p129ig.AbstractC2043a;
import p259r9.AbstractC3754e0;
import p276sf.C3959f;
import p276sf.C3960g;

/* JADX INFO: renamed from: cb.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0541b {

    /* JADX INFO: renamed from: a */
    public static final C0541b f1707a = new C0541b();

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap f1708b = new WeakHashMap();

    /* JADX INFO: renamed from: c */
    public static final WeakHashMap f1709c = new WeakHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Bitmap m1534a(Bitmap bitmap, float f3) {
        Bitmap bitmap2;
        Object c3959f;
        Object obj;
        Bitmap bitmap3;
        Bitmap bitmap4;
        Bitmap bitmap5 = bitmap;
        synchronized (this) {
            try {
                if (!bitmap5.isRecycled() && bitmap5.getWidth() > 0 && bitmap5.getHeight() > 0) {
                    WeakHashMap weakHashMap = f1709c;
                    WeakReference weakReference = (WeakReference) weakHashMap.get(bitmap5);
                    if (weakReference == null || (bitmap4 = (Bitmap) weakReference.get()) == null) {
                        bitmap2 = bitmap5;
                    } else {
                        Bitmap bitmap6 = !bitmap4.isRecycled() ? bitmap4 : null;
                        if (bitmap6 != null) {
                            bitmap2 = bitmap6;
                        }
                    }
                    float fM5018X = AbstractC2043a.m5018X(AbstractC3754e0.m7907q(f3, 0.1f, 0.5f) * 100.0f) / 100.0f;
                    WeakHashMap weakHashMap2 = f1708b;
                    C0540a c0540a = (C0540a) weakHashMap2.get(bitmap2);
                    if (c0540a != null) {
                        if (c0540a.f1705a != fM5018X) {
                            c0540a = null;
                        }
                        if (c0540a != null && (bitmap3 = (Bitmap) c0540a.f1706b.get()) != null) {
                            Bitmap bitmap7 = bitmap3.isRecycled() ? null : bitmap3;
                            if (bitmap7 != null) {
                                return bitmap7;
                            }
                        }
                    }
                    try {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
                        bitmapCreateBitmap.getClass();
                        bitmapCreateBitmap.setDensity(bitmap2.getDensity());
                        Paint paint = new Paint(3);
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint.setShader(new BitmapShader(bitmap2, tileMode, tileMode));
                        float fMin = Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * fM5018X;
                        new Canvas(bitmapCreateBitmap).drawRoundRect(0.0f, 0.0f, bitmap2.getWidth(), bitmap2.getHeight(), fMin, fMin, paint);
                        weakHashMap2.put(bitmap2, new C0540a(fM5018X, new WeakReference(bitmapCreateBitmap)));
                        weakHashMap.put(bitmapCreateBitmap, new WeakReference(bitmap2));
                        c3959f = bitmapCreateBitmap;
                    } catch (Throwable th2) {
                        c3959f = new C3959f(th2);
                    }
                    Throwable thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b == null) {
                        obj = c3959f;
                    } else {
                        AbstractC1184v0.m3204n("[Hchat:RoundAvatar] 处理通知头像失败: " + thM8182b.getMessage(), thM8182b);
                        obj = bitmap5;
                    }
                    return (Bitmap) obj;
                }
                return bitmap5;
            } finally {
            }
        }
    }
}
