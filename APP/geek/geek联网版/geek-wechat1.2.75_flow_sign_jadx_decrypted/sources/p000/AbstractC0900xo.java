package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* JADX INFO: renamed from: xo */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0900xo {
    /* JADX INFO: renamed from: a */
    public static ColorStateList m2701a(ImageView imageView) {
        return imageView.getImageTintList();
    }

    /* JADX INFO: renamed from: b */
    public static PorterDuff.Mode m2702b(ImageView imageView) {
        return imageView.getImageTintMode();
    }

    /* JADX INFO: renamed from: c */
    public static void m2703c(ImageView imageView, ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }

    /* JADX INFO: renamed from: d */
    public static void m2704d(ImageView imageView, PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
    }
}
