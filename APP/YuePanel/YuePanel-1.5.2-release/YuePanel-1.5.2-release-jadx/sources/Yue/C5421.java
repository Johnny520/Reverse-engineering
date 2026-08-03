package Yue;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* JADX INFO: renamed from: Yue.ۥ۠ۥ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5421 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۠ۨ$ۥ */
    @InterfaceC7113(21)
    public static class C0758 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static ColorStateList m2192(ImageView imageView) {
            return imageView.getImageTintList();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static PorterDuff.Mode m2193(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m16909(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m16910(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public static ColorStateList m2190(@InterfaceC6391 ImageView imageView) {
        return C0758.m2192(imageView);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public static PorterDuff.Mode m2191(@InterfaceC6391 ImageView imageView) {
        return C0758.m2193(imageView);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m16907(@InterfaceC6391 ImageView imageView, @InterfaceC6490 ColorStateList colorStateList) {
        C0758.m16909(imageView, colorStateList);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m16908(@InterfaceC6391 ImageView imageView, @InterfaceC6490 PorterDuff.Mode mode) {
        C0758.m16910(imageView, mode);
    }
}
