package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class x00 {
    public static Drawable a(Resources r0, int r1, Resources.Theme r2) {
        return r0.getDrawable(r1, r2);
    }

    public static Drawable b(Resources r0, int r1, int r2, Resources.Theme r3) {
        return r0.getDrawableForDensity(r1, r2, r3);
    }
}
