package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class bh {
    public static int a(android.graphics.drawable.Drawable r0) {
            int r0 = r0.getAlpha()
            return r0
    }

    public static android.graphics.drawable.Drawable b(android.graphics.drawable.DrawableContainer.DrawableContainerState r0, int r1) {
            android.graphics.drawable.Drawable r0 = r0.getChild(r1)
            return r0
    }

    public static android.graphics.drawable.Drawable c(android.graphics.drawable.InsetDrawable r0) {
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
    }

    public static boolean d(android.graphics.drawable.Drawable r0) {
            boolean r0 = r0.isAutoMirrored()
            return r0
    }

    public static void e(android.graphics.drawable.Drawable r0, boolean r1) {
            r0.setAutoMirrored(r1)
            return
    }
}
