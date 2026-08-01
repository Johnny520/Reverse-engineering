package p006D;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* JADX INFO: renamed from: D.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0080i {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static ColorStateList m211a(ImageView imageView) {
        return imageView.getImageTintList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static PorterDuff.Mode m212b(ImageView imageView) {
        return imageView.getImageTintMode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m213c(ImageView imageView, ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m214d(ImageView imageView, PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
    }
}
