package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class x00 {
    /* JADX INFO: renamed from: a */
    public static Drawable m2603a(Resources resources, int i, Resources.Theme theme) {
        return resources.getDrawable(i, theme);
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m2604b(Resources resources, int i, int i2, Resources.Theme theme) {
        return resources.getDrawableForDensity(i, i2, theme);
    }
}
