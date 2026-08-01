package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public abstract class to {
    public static ColorStateList a(ImageView r0) {
        return r0.getImageTintList();
    }

    public static PorterDuff.Mode b(ImageView r0) {
        return r0.getImageTintMode();
    }

    public static void c(ImageView r0, ColorStateList r1) {
        r0.setImageTintList(r1);
    }

    public static void d(ImageView r0, PorterDuff.Mode r1) {
        r0.setImageTintMode(r1);
    }
}
