package p017J;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* JADX INFO: renamed from: J.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0217f {
    /* JADX INFO: renamed from: a */
    public static ColorStateList m602a(ImageView r02) {
        return r02.getImageTintList();
    }

    /* JADX INFO: renamed from: b */
    public static PorterDuff.Mode m603b(ImageView r02) {
        return r02.getImageTintMode();
    }

    /* JADX INFO: renamed from: c */
    public static void m604c(ImageView r02, ColorStateList r1) {
        r02.setImageTintList(r1);
    }

    /* JADX INFO: renamed from: d */
    public static void m605d(ImageView r02, PorterDuff.Mode r1) {
        r02.setImageTintMode(r1);
    }
}
