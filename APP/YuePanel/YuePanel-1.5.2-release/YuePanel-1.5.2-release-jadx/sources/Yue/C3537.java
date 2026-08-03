package Yue;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Point;
import android.graphics.PointF;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3537 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final Bitmap m611(@InterfaceC6399 Bitmap bitmap, @InterfaceC6399 InterfaceC5124<? super Canvas, C8107> interfaceC5124) {
        interfaceC5124.invoke(new Canvas(bitmap));
        return bitmap;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final boolean m612(@InterfaceC6399 Bitmap bitmap, @InterfaceC6399 Point point) {
        int i;
        int width = bitmap.getWidth();
        int i2 = point.x;
        return i2 >= 0 && i2 < width && (i = point.y) >= 0 && i < bitmap.getHeight();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final boolean m9489(@InterfaceC6399 Bitmap bitmap, @InterfaceC6399 PointF pointF) {
        float f = pointF.x;
        if (f >= 0.0f && f < bitmap.getWidth()) {
            float f2 = pointF.y;
            if (f2 >= 0.0f && f2 < bitmap.getHeight()) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final Bitmap m9490(int i, int i2, @InterfaceC6399 Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @InterfaceC6399
    @InterfaceC7113(26)
    @SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Bitmap m9491(int i, int i2, @InterfaceC6399 Bitmap.Config config, boolean z, @InterfaceC6399 ColorSpace colorSpace) {
        return Bitmap.createBitmap(i, i2, config, z, colorSpace);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ Bitmap m9492(int i, int i2, Bitmap.Config config, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ Bitmap m9493(int i, int i2, Bitmap.Config config, boolean z, ColorSpace colorSpace, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        if ((i3 & 8) != 0) {
            z = true;
        }
        if ((i3 & 16) != 0) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        return Bitmap.createBitmap(i, i2, config, z, colorSpace);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int m9494(@InterfaceC6399 Bitmap bitmap, int i, int i2) {
        return bitmap.getPixel(i, i2);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final Bitmap m9495(@InterfaceC6399 Bitmap bitmap, int i, int i2, boolean z) {
        return Bitmap.createScaledBitmap(bitmap, i, i2, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static /* synthetic */ Bitmap m9496(Bitmap bitmap, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = true;
        }
        return Bitmap.createScaledBitmap(bitmap, i, i2, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final void m9497(@InterfaceC6399 Bitmap bitmap, int i, int i2, @InterfaceC3897 int i3) {
        bitmap.setPixel(i, i2, i3);
    }
}
