package p000;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;

/* JADX INFO: renamed from: dh */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0151dh {
    /* JADX INFO: renamed from: a */
    public static int m922a(Drawable drawable) {
        return drawable.getAlpha();
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m923b(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
        return drawableContainerState.getChild(i);
    }

    /* JADX INFO: renamed from: c */
    public static Drawable m924c(InsetDrawable insetDrawable) {
        return insetDrawable.getDrawable();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m925d(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    /* JADX INFO: renamed from: e */
    public static void m926e(Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }
}
