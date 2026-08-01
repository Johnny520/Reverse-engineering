package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class k60 {
    public static android.graphics.drawable.Drawable[] a(android.widget.TextView r0) {
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            return r0
    }

    public static int b(android.view.View r0) {
            int r0 = r0.getLayoutDirection()
            return r0
    }

    public static int c(android.view.View r0) {
            int r0 = r0.getTextDirection()
            return r0
    }

    public static java.util.Locale d(android.widget.TextView r0) {
            java.util.Locale r0 = r0.getTextLocale()
            return r0
    }

    public static void e(android.widget.TextView r0, android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0.setCompoundDrawablesRelative(r1, r2, r3, r4)
            return
    }

    public static void f(android.widget.TextView r0, int r1, int r2, int r3, int r4) {
            r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
            return
    }

    public static void g(android.widget.TextView r0, android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
            return
    }

    public static void h(android.view.View r0, int r1) {
            r0.setTextDirection(r1)
            return
    }
}
