package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class z4 {
    public static android.graphics.drawable.Drawable[] a(android.widget.TextView r0) {
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            return r0
    }

    public static void b(android.widget.TextView r0, android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r3, r4)
            return
    }

    public static void c(android.widget.TextView r0, java.util.Locale r1) {
            r0.setTextLocale(r1)
            return
    }
}
