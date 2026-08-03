package Yue;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5422 {

    /* JADX INFO: renamed from: ۥ */
    public static boolean f1500 = true;

    /* JADX INFO: renamed from: ۥ۟ */
    public static Field f1501;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean f13326;

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۡ$ۥ */
    @InterfaceC7113(29)
    public static class C0759 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m2196(ImageView imageView, Matrix matrix) {
            imageView.animateTransform(matrix);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static void m2194(@InterfaceC6391 ImageView imageView, @InterfaceC6490 Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            C0759.m2196(imageView, matrix);
            return;
        }
        if (matrix != null) {
            m16911(imageView, matrix);
            return;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
            imageView.invalidate();
        }
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* JADX INFO: renamed from: ۥ۟ */
    public static void m2195() {
        if (f13326) {
            return;
        }
        try {
            Field declaredField = ImageView.class.getDeclaredField("mDrawMatrix");
            f1501 = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f13326 = true;
    }

    @InterfaceC7113(21)
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m16911(@InterfaceC6391 ImageView imageView, @InterfaceC6490 Matrix matrix) {
        if (f1500) {
            try {
                C0759.m2196(imageView, matrix);
            } catch (NoSuchMethodError unused) {
                f1500 = false;
            }
        }
    }
}
