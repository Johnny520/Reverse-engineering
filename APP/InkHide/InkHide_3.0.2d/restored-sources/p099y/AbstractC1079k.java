package p099y;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* JADX INFO: renamed from: y.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1079k {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m2344a(MenuItem menuItem) {
        return menuItem.getAlphabeticModifiers();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static CharSequence m2345b(MenuItem menuItem) {
        return menuItem.getContentDescription();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static ColorStateList m2346c(MenuItem menuItem) {
        return menuItem.getIconTintList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static PorterDuff.Mode m2347d(MenuItem menuItem) {
        return menuItem.getIconTintMode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static int m2348e(MenuItem menuItem) {
        return menuItem.getNumericModifiers();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static CharSequence m2349f(MenuItem menuItem) {
        return menuItem.getTooltipText();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static MenuItem m2350g(MenuItem menuItem, char c2, int i2) {
        return menuItem.setAlphabeticShortcut(c2, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static MenuItem m2351h(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setContentDescription(charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static MenuItem m2352i(MenuItem menuItem, ColorStateList colorStateList) {
        return menuItem.setIconTintList(colorStateList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static MenuItem m2353j(MenuItem menuItem, PorterDuff.Mode mode) {
        return menuItem.setIconTintMode(mode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static MenuItem m2354k(MenuItem menuItem, char c2, int i2) {
        return menuItem.setNumericShortcut(c2, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static MenuItem m2355l(MenuItem menuItem, char c2, char c3, int i2, int i3) {
        return menuItem.setShortcut(c2, c3, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static MenuItem m2356m(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setTooltipText(charSequence);
    }
}
