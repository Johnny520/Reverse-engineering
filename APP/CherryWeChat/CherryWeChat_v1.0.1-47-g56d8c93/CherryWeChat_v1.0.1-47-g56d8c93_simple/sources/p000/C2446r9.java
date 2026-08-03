package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: r9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2446r9 extends AbstractC0651P5 {

    /* JADX INFO: renamed from: b */
    public static final byte[] f8571b = null;

    static {
        f8571b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(InterfaceC0802Sm.f2524a);
    }

    @Override // p000.InterfaceC0802Sm
    /* JADX INFO: renamed from: b */
    public final void mo172b(MessageDigest r2) {
        r2.update(f8571b);
    }

    @Override // p000.AbstractC0651P5
    /* JADX INFO: renamed from: c */
    public final Bitmap mo1317c(InterfaceC0565N5 r8, Bitmap r9, int r10, int r11) {
        Lock r0 = AbstractC0184EB.f548d;
        int r102 = Math.min(r10, r11);
        float r112 = r102;
        float r2 = r112 / 2.0f;
        float r3 = r9.getWidth();
        float r4 = r9.getHeight();
        float r5 = Math.max(r112 / r3, r112 / r4);
        float r32 = r3 * r5;
        float r52 = r5 * r4;
        float r42 = (r112 - r32) / 2.0f;
        float r113 = (r112 - r52) / 2.0f;
        RectF r1 = new RectF(r42, r113, r32 + r42, r52 + r113);
        Bitmap.Config r114 = Bitmap.Config.RGBA_F16;
        if (r114.equals(r9.getConfig()) == false) goto L5;
        Bitmap.Config r33 = r114;
    L7:
        if (r33.equals(r9.getConfig()) == false) goto L9;
        Bitmap r34 = r9;
    L11:
        if (r114.equals(r9.getConfig()) == true) goto L14;
        r114 = Bitmap.Config.ARGB_8888;
    L14:
        Bitmap r103 = r8.mo52g(r102, r102, r114);
        r103.setHasAlpha(true);
        r0.lock();
        Canvas r115 = new Canvas(r103);     // Catch: Throwable -> L20
        r115.drawCircle(r2, r2, r2, AbstractC0184EB.f546b);     // Catch: Throwable -> L20
        r115.drawBitmap(r34, null, r1, AbstractC0184EB.f547c);     // Catch: Throwable -> L20
        r115.setBitmap(null);     // Catch: Throwable -> L20
        r0.unlock();
        if (r34.equals(r9) == true) goto L19;
        r8.mo53h(r34);
    L19:
        return r103;
    L20:
        th = move-exception;
        r0.unlock();
        throw th;
    L9:
        r34 = r8.mo52g(r9.getWidth(), r9.getHeight(), r33);
        new Canvas(r34).drawBitmap(r9, 0.0f, 0.0f, null);
        goto L11
    L5:
        r33 = Bitmap.Config.ARGB_8888;
        goto L7
    }

    @Override // p000.InterfaceC0802Sm
    public final boolean equals(Object r1) {
        return r1 instanceof C2446r9;
    }

    @Override // p000.InterfaceC0802Sm
    public final int hashCode() {
        return 1101716364;
    }
}
