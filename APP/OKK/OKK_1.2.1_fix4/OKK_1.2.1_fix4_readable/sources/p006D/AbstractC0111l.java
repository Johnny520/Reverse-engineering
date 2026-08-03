package p006D;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* JADX INFO: renamed from: D.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0111l {
    /* JADX INFO: renamed from: a */
    public static int m394a(MenuItem menuItem) {
        return menuItem.getAlphabeticModifiers();
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m395b(MenuItem menuItem) {
        return menuItem.getContentDescription();
    }

    /* JADX INFO: renamed from: c */
    public static ColorStateList m396c(MenuItem menuItem) {
        return menuItem.getIconTintList();
    }

    /* JADX INFO: renamed from: d */
    public static PorterDuff.Mode m397d(MenuItem menuItem) {
        return menuItem.getIconTintMode();
    }

    /* JADX INFO: renamed from: e */
    public static int m398e(MenuItem menuItem) {
        return menuItem.getNumericModifiers();
    }

    /* JADX INFO: renamed from: f */
    public static CharSequence m399f(MenuItem menuItem) {
        return menuItem.getTooltipText();
    }

    /* JADX INFO: renamed from: g */
    public static MenuItem m400g(MenuItem menuItem, char c, int i2) {
        return menuItem.setAlphabeticShortcut(c, i2);
    }

    /* JADX INFO: renamed from: h */
    public static MenuItem m401h(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: i */
    public static MenuItem m402i(MenuItem menuItem, ColorStateList colorStateList) {
        return menuItem.setIconTintList(colorStateList);
    }

    /* JADX INFO: renamed from: j */
    public static MenuItem m403j(MenuItem menuItem, PorterDuff.Mode mode) {
        return menuItem.setIconTintMode(mode);
    }

    /* JADX INFO: renamed from: k */
    public static MenuItem m404k(MenuItem menuItem, char c, int i2) {
        return menuItem.setNumericShortcut(c, i2);
    }

    /* JADX INFO: renamed from: l */
    public static MenuItem m405l(MenuItem menuItem, char c, char c2, int i2, int i3) {
        return menuItem.setShortcut(c, c2, i2, i3);
    }

    /* JADX INFO: renamed from: m */
    public static MenuItem m406m(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setTooltipText(charSequence);
    }
}
