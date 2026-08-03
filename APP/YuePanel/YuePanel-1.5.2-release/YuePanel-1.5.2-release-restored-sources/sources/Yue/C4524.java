package Yue;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: Yue.ۥ۠۠۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawable.kt\nandroidx/core/graphics/drawable/DrawableKt\n+ 2 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n1#1,118:1\n38#2:119\n49#2:120\n60#2:121\n71#2:122\n*S KotlinDebug\n*F\n+ 1 Drawable.kt\nandroidx/core/graphics/drawable/DrawableKt\n*L\n66#1:119\n66#1:120\n66#1:121\n66#1:122\n*E\n"})
public final class C4524 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final Bitmap m1459(@InterfaceC6399 Drawable drawable, @InterfaceC6844 int i, @InterfaceC6844 int i2, @InterfaceC6489 Bitmap.Config config) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() == null) {
                throw new IllegalArgumentException("bitmap is null");
            }
            if (config == null || bitmapDrawable.getBitmap().getConfig() == config) {
                return (i == bitmapDrawable.getBitmap().getWidth() && i2 == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i, i2, true);
            }
        }
        Rect bounds = drawable.getBounds();
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
        drawable.setBounds(0, 0, i, i2);
        drawable.draw(new Canvas(bitmapCreateBitmap));
        drawable.setBounds(i3, i4, i5, i6);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static /* synthetic */ Bitmap m1460(Drawable drawable, int i, int i2, Bitmap.Config config, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = drawable.getIntrinsicWidth();
        }
        if ((i3 & 2) != 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        if ((i3 & 4) != 0) {
            config = null;
        }
        return m1459(drawable, i, i2, config);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Bitmap m13283(@InterfaceC6399 Drawable drawable, @InterfaceC6844 int i, @InterfaceC6844 int i2, @InterfaceC6489 Bitmap.Config config) {
        if ((drawable instanceof BitmapDrawable) && ((BitmapDrawable) drawable).getBitmap() == null) {
            return null;
        }
        return m1459(drawable, i, i2, config);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ Bitmap m13284(Drawable drawable, int i, int i2, Bitmap.Config config, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = drawable.getIntrinsicWidth();
        }
        if ((i3 & 2) != 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        if ((i3 & 4) != 0) {
            config = null;
        }
        return m13283(drawable, i, i2, config);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final void m13285(@InterfaceC6399 Drawable drawable, @InterfaceC6844 int i, @InterfaceC6844 int i2, @InterfaceC6844 int i3, @InterfaceC6844 int i4) {
        drawable.setBounds(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ void m13286(Drawable drawable, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = drawable.getBounds().left;
        }
        if ((i5 & 2) != 0) {
            i2 = drawable.getBounds().top;
        }
        if ((i5 & 4) != 0) {
            i3 = drawable.getBounds().right;
        }
        if ((i5 & 8) != 0) {
            i4 = drawable.getBounds().bottom;
        }
        m13285(drawable, i, i2, i3, i4);
    }
}
