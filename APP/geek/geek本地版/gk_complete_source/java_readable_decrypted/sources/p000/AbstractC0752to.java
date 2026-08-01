package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* JADX INFO: renamed from: to */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0752to {
    /* JADX INFO: renamed from: a */
    public static ColorStateList m2382a(ImageView imageView) {
        return imageView.getImageTintList();
    }

    /* JADX INFO: renamed from: b */
    public static PorterDuff.Mode m2383b(ImageView imageView) {
        return imageView.getImageTintMode();
    }

    /* JADX INFO: renamed from: c */
    public static void m2384c(ImageView imageView, ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }

    /* JADX INFO: renamed from: d */
    public static void m2385d(ImageView imageView, PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
    }
}
