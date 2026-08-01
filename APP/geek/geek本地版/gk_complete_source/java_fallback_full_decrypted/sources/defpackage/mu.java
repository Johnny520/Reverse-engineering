package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class mu {
    public static int a(android.view.MenuItem r0) {
            int r0 = r0.getAlphabeticModifiers()
            return r0
    }

    public static java.lang.CharSequence b(android.view.MenuItem r0) {
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
    }

    public static android.content.res.ColorStateList c(android.view.MenuItem r0) {
            android.content.res.ColorStateList r0 = r0.getIconTintList()
            return r0
    }

    public static android.graphics.PorterDuff.Mode d(android.view.MenuItem r0) {
            android.graphics.PorterDuff$Mode r0 = r0.getIconTintMode()
            return r0
    }

    public static int e(android.view.MenuItem r0) {
            int r0 = r0.getNumericModifiers()
            return r0
    }

    public static java.lang.CharSequence f(android.view.MenuItem r0) {
            java.lang.CharSequence r0 = r0.getTooltipText()
            return r0
    }

    public static android.view.MenuItem g(android.view.MenuItem r0, char r1, int r2) {
            android.view.MenuItem r0 = r0.setAlphabeticShortcut(r1, r2)
            return r0
    }

    public static android.view.MenuItem h(android.view.MenuItem r0, java.lang.CharSequence r1) {
            android.view.MenuItem r0 = r0.setContentDescription(r1)
            return r0
    }

    public static android.view.MenuItem i(android.view.MenuItem r0, android.content.res.ColorStateList r1) {
            android.view.MenuItem r0 = r0.setIconTintList(r1)
            return r0
    }

    public static android.view.MenuItem j(android.view.MenuItem r0, android.graphics.PorterDuff.Mode r1) {
            android.view.MenuItem r0 = r0.setIconTintMode(r1)
            return r0
    }

    public static android.view.MenuItem k(android.view.MenuItem r0, char r1, int r2) {
            android.view.MenuItem r0 = r0.setNumericShortcut(r1, r2)
            return r0
    }

    public static android.view.MenuItem l(android.view.MenuItem r0, char r1, char r2, int r3, int r4) {
            android.view.MenuItem r0 = r0.setShortcut(r1, r2, r3, r4)
            return r0
    }

    public static android.view.MenuItem m(android.view.MenuItem r0, java.lang.CharSequence r1) {
            android.view.MenuItem r0 = r0.setTooltipText(r1)
            return r0
    }
}
