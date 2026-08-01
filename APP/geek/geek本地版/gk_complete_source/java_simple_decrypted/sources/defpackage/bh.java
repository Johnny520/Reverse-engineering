package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class bh {
    public static int a(Drawable r0) {
        return r0.getAlpha();
    }

    public static Drawable b(DrawableContainer.DrawableContainerState r0, int r1) {
        return r0.getChild(r1);
    }

    public static Drawable c(InsetDrawable r0) {
        return r0.getDrawable();
    }

    public static boolean d(Drawable r0) {
        return r0.isAutoMirrored();
    }

    public static void e(Drawable r0, boolean r1) {
        r0.setAutoMirrored(r1);
    }
}
