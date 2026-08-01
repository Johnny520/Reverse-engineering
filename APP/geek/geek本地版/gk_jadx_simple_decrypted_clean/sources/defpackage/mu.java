package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public abstract class mu {
    public static int a(MenuItem r0) {
        return r0.getAlphabeticModifiers();
    }

    public static CharSequence b(MenuItem r0) {
        return r0.getContentDescription();
    }

    public static ColorStateList c(MenuItem r0) {
        return r0.getIconTintList();
    }

    public static PorterDuff.Mode d(MenuItem r0) {
        return r0.getIconTintMode();
    }

    public static int e(MenuItem r0) {
        return r0.getNumericModifiers();
    }

    public static CharSequence f(MenuItem r0) {
        return r0.getTooltipText();
    }

    public static MenuItem g(MenuItem r0, char r1, int r2) {
        return r0.setAlphabeticShortcut(r1, r2);
    }

    public static MenuItem h(MenuItem r0, CharSequence r1) {
        return r0.setContentDescription(r1);
    }

    public static MenuItem i(MenuItem r0, ColorStateList r1) {
        return r0.setIconTintList(r1);
    }

    public static MenuItem j(MenuItem r0, PorterDuff.Mode r1) {
        return r0.setIconTintMode(r1);
    }

    public static MenuItem k(MenuItem r0, char r1, int r2) {
        return r0.setNumericShortcut(r1, r2);
    }

    public static MenuItem l(MenuItem r0, char r1, char r2, int r3, int r4) {
        return r0.setShortcut(r1, r2, r3, r4);
    }

    public static MenuItem m(MenuItem r0, CharSequence r1) {
        return r0.setTooltipText(r1);
    }
}
