package Yue;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3533 {

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۧ۠$ۥ */
    @InterfaceC7113(27)
    public static class C0173 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Bitmap m605(Bitmap bitmap) {
            if (bitmap.getConfig() != Bitmap.Config.HARDWARE) {
                return bitmap;
            }
            Bitmap.Config configM608 = Bitmap.Config.ARGB_8888;
            if (Build.VERSION.SDK_INT >= 31) {
                configM608 = C3534.m608(bitmap);
            }
            return bitmap.copy(configM608, true);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static Bitmap m606(int i, int i2, Bitmap bitmap, boolean z) {
            Bitmap.Config config = bitmap.getConfig();
            ColorSpace colorSpace = bitmap.getColorSpace();
            ColorSpace colorSpace2 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            if (z && !bitmap.getColorSpace().equals(colorSpace2)) {
                config = Bitmap.Config.RGBA_F16;
                colorSpace = colorSpace2;
            } else if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                config = Bitmap.Config.ARGB_8888;
                if (Build.VERSION.SDK_INT >= 31) {
                    config = C3534.m608(bitmap);
                }
            }
            return Bitmap.createBitmap(i, i2, config, bitmap.hasAlpha(), colorSpace);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static boolean m9488(Bitmap bitmap) {
            return bitmap.getConfig() == Bitmap.Config.RGBA_F16 && bitmap.getColorSpace().equals(ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۧ۠$ۥ۟ */
    @InterfaceC7113(29)
    public static class C0174 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m607(Paint paint) {
            paint.setBlendMode(BlendMode.SRC);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۧ۠$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(31)
    public static class C3534 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Bitmap.Config m608(Bitmap bitmap) {
            return bitmap.getHardwareBuffer().getFormat() == 22 ? Bitmap.Config.RGBA_F16 : Bitmap.Config.ARGB_8888;
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public static Bitmap m603(@InterfaceC6391 Bitmap bitmap, int i, int i2, @InterfaceC6490 Rect rect, boolean z) {
        Paint paint;
        double dFloor;
        Paint paint2;
        Bitmap bitmap2;
        int i3;
        Rect rect2;
        Bitmap bitmapCreateBitmap;
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("dstW and dstH must be > 0!");
        }
        if (rect != null && (rect.isEmpty() || rect.left < 0 || rect.right > bitmap.getWidth() || rect.top < 0 || rect.bottom > bitmap.getHeight())) {
            throw new IllegalArgumentException("srcRect must be contained by srcBm!");
        }
        int i4 = Build.VERSION.SDK_INT;
        Bitmap bitmapM605 = i4 >= 27 ? C0173.m605(bitmap) : bitmap;
        int iWidth = rect != null ? rect.width() : bitmap.getWidth();
        int iHeight = rect != null ? rect.height() : bitmap.getHeight();
        float f = i / iWidth;
        float f2 = i2 / iHeight;
        int i5 = rect != null ? rect.left : 0;
        int i6 = rect != null ? rect.top : 0;
        if (i5 == 0 && i6 == 0 && i == bitmap.getWidth() && i2 == bitmap.getHeight()) {
            return (bitmap.isMutable() && bitmap == bitmapM605) ? bitmap.copy(bitmap.getConfig(), true) : bitmapM605;
        }
        Paint paint3 = new Paint(1);
        paint3.setFilterBitmap(true);
        if (i4 >= 29) {
            C0174.m607(paint3);
        } else {
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        }
        if (iWidth == i && iHeight == i2) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i, i2, bitmapM605.getConfig());
            new Canvas(bitmapCreateBitmap2).drawBitmap(bitmapM605, -i5, -i6, paint3);
            return bitmapCreateBitmap2;
        }
        double dLog = Math.log(2.0d);
        if (f > 1.0f) {
            paint = paint3;
            dFloor = Math.ceil(Math.log(f) / dLog);
        } else {
            paint = paint3;
            dFloor = Math.floor(Math.log(f) / dLog);
        }
        int i7 = (int) dFloor;
        int iCeil = (int) (f2 > 1.0f ? Math.ceil(Math.log(f2) / dLog) : Math.floor(Math.log(f2) / dLog));
        if (!z || i4 < 27 || C0173.m9488(bitmap)) {
            paint2 = paint;
            bitmap2 = null;
            i3 = 0;
        } else {
            Bitmap bitmapM606 = C0173.m606(i7 > 0 ? m9487(iWidth, i, 1, i7) : iWidth, iCeil > 0 ? m9487(iHeight, i2, 1, iCeil) : iHeight, bitmap, true);
            paint2 = paint;
            new Canvas(bitmapM606).drawBitmap(bitmapM605, -i5, -i6, paint2);
            i3 = 1;
            i6 = 0;
            i5 = 0;
            bitmap2 = bitmapM605;
            bitmapM605 = bitmapM606;
        }
        Rect rect3 = new Rect(i5, i6, iWidth, iHeight);
        Rect rect4 = new Rect();
        int i8 = i7;
        int i9 = iCeil;
        while (true) {
            if (i8 == 0 && i9 == 0) {
                break;
            }
            if (i8 < 0) {
                i8++;
            } else if (i8 > 0) {
                i8--;
            }
            if (i9 < 0) {
                i9++;
            } else if (i9 > 0) {
                i9--;
            }
            int i10 = i9;
            Paint paint4 = paint2;
            Rect rect5 = rect3;
            rect4.set(0, 0, m9487(iWidth, i, i8, i7), m9487(iHeight, i2, i10, iCeil));
            boolean z2 = i8 == 0 && i10 == 0;
            boolean z3 = bitmap2 != null && bitmap2.getWidth() == i && bitmap2.getHeight() == i2;
            if (bitmap2 == null || bitmap2 == bitmap) {
                rect2 = rect4;
            } else {
                if (z) {
                    rect2 = rect4;
                    if (Build.VERSION.SDK_INT < 27 || C0173.m9488(bitmap2)) {
                    }
                    Rect rect6 = rect2;
                    new Canvas(bitmapCreateBitmap).drawBitmap(bitmapM605, rect5, rect6, paint4);
                    rect5.set(rect6);
                    i9 = i10;
                    Bitmap bitmap3 = bitmapM605;
                    bitmapM605 = bitmapCreateBitmap;
                    rect4 = rect6;
                    rect3 = rect5;
                    paint2 = paint4;
                    bitmap2 = bitmap3;
                } else {
                    rect2 = rect4;
                }
                if (!z2 || (z3 && i3 == 0)) {
                    bitmapCreateBitmap = bitmap2;
                }
                Rect rect62 = rect2;
                new Canvas(bitmapCreateBitmap).drawBitmap(bitmapM605, rect5, rect62, paint4);
                rect5.set(rect62);
                i9 = i10;
                Bitmap bitmap32 = bitmapM605;
                bitmapM605 = bitmapCreateBitmap;
                rect4 = rect62;
                rect3 = rect5;
                paint2 = paint4;
                bitmap2 = bitmap32;
            }
            if (bitmap2 != bitmap && bitmap2 != null) {
                bitmap2.recycle();
            }
            int iM9487 = m9487(iWidth, i, i8 > 0 ? i3 : i8, i7);
            int iM94872 = m9487(iHeight, i2, i10 > 0 ? i3 : i10, iCeil);
            if (Build.VERSION.SDK_INT >= 27) {
                bitmapCreateBitmap = C0173.m606(iM9487, iM94872, bitmap, z && !z2);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(iM9487, iM94872, bitmapM605.getConfig());
            }
            Rect rect622 = rect2;
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapM605, rect5, rect622, paint4);
            rect5.set(rect622);
            i9 = i10;
            Bitmap bitmap322 = bitmapM605;
            bitmapM605 = bitmapCreateBitmap;
            rect4 = rect622;
            rect3 = rect5;
            paint2 = paint4;
            bitmap2 = bitmap322;
        }
        if (bitmap2 != bitmap && bitmap2 != null) {
            bitmap2.recycle();
        }
        return bitmapM605;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static int m604(@InterfaceC6391 Bitmap bitmap) {
        return bitmap.getAllocationByteCount();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m9485(@InterfaceC6391 Bitmap bitmap) {
        return bitmap.hasMipMap();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m9486(@InterfaceC6391 Bitmap bitmap, boolean z) {
        bitmap.setHasMipMap(z);
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static int m9487(int i, int i2, int i3, int i4) {
        return i3 == 0 ? i2 : i3 > 0 ? i * (1 << (i4 - i3)) : i2 << ((-i3) - 1);
    }
}
