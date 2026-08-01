package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class e10 {
    /* JADX INFO: renamed from: a */
    public static Drawable m952a(Resources resources, int i, Resources.Theme theme) {
        return resources.getDrawable(i, theme);
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m953b(Resources resources, int i, int i2, Resources.Theme theme) {
        return resources.getDrawableForDensity(i, i2, theme);
    }
}
