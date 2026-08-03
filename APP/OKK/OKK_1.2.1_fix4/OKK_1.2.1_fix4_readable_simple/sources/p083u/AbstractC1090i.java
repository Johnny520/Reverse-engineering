package p083u;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: u.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1090i {
    /* JADX INFO: renamed from: a */
    public static Drawable m2579a(Resources r02, int r1, Resources.Theme r2) {
        return r02.getDrawable(r1, r2);
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m2580b(Resources r02, int r1, int r2, Resources.Theme r3) {
        return r02.getDrawableForDensity(r1, r2, r3);
    }
}
