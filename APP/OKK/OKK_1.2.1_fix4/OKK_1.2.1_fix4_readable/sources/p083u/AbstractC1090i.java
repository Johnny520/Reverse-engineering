package p083u;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: u.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1090i {
    /* JADX INFO: renamed from: a */
    public static Drawable m2579a(Resources resources, int i2, Resources.Theme theme) {
        return resources.getDrawable(i2, theme);
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m2580b(Resources resources, int i2, int i3, Resources.Theme theme) {
        return resources.getDrawableForDensity(i2, i3, theme);
    }
}
