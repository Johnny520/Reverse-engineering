package p000;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;

/* JADX INFO: renamed from: bh */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0068bh {
    /* JADX INFO: renamed from: a */
    public static int m555a(Drawable drawable) {
        return drawable.getAlpha();
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m556b(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
        return drawableContainerState.getChild(i);
    }

    /* JADX INFO: renamed from: c */
    public static Drawable m557c(InsetDrawable insetDrawable) {
        return insetDrawable.getDrawable();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m558d(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    /* JADX INFO: renamed from: e */
    public static void m559e(Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }
}
