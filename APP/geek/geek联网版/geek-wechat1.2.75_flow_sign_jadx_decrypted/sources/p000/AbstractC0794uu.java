package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* JADX INFO: renamed from: uu */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0794uu {
    /* JADX INFO: renamed from: a */
    public static int m2484a(MenuItem menuItem) {
        return menuItem.getAlphabeticModifiers();
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m2485b(MenuItem menuItem) {
        return menuItem.getContentDescription();
    }

    /* JADX INFO: renamed from: c */
    public static ColorStateList m2486c(MenuItem menuItem) {
        return menuItem.getIconTintList();
    }

    /* JADX INFO: renamed from: d */
    public static PorterDuff.Mode m2487d(MenuItem menuItem) {
        return menuItem.getIconTintMode();
    }

    /* JADX INFO: renamed from: e */
    public static int m2488e(MenuItem menuItem) {
        return menuItem.getNumericModifiers();
    }

    /* JADX INFO: renamed from: f */
    public static CharSequence m2489f(MenuItem menuItem) {
        return menuItem.getTooltipText();
    }

    /* JADX INFO: renamed from: g */
    public static MenuItem m2490g(MenuItem menuItem, char c, int i) {
        return menuItem.setAlphabeticShortcut(c, i);
    }

    /* JADX INFO: renamed from: h */
    public static MenuItem m2491h(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: i */
    public static MenuItem m2492i(MenuItem menuItem, ColorStateList colorStateList) {
        return menuItem.setIconTintList(colorStateList);
    }

    /* JADX INFO: renamed from: j */
    public static MenuItem m2493j(MenuItem menuItem, PorterDuff.Mode mode) {
        return menuItem.setIconTintMode(mode);
    }

    /* JADX INFO: renamed from: k */
    public static MenuItem m2494k(MenuItem menuItem, char c, int i) {
        return menuItem.setNumericShortcut(c, i);
    }

    /* JADX INFO: renamed from: l */
    public static MenuItem m2495l(MenuItem menuItem, char c, char c2, int i, int i2) {
        return menuItem.setShortcut(c, c2, i, i2);
    }

    /* JADX INFO: renamed from: m */
    public static MenuItem m2496m(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setTooltipText(charSequence);
    }
}
