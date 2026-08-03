package p006D;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* JADX INFO: renamed from: D.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0111l {
    /* JADX INFO: renamed from: a */
    public static int m394a(MenuItem r02) {
        return r02.getAlphabeticModifiers();
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m395b(MenuItem r02) {
        return r02.getContentDescription();
    }

    /* JADX INFO: renamed from: c */
    public static ColorStateList m396c(MenuItem r02) {
        return r02.getIconTintList();
    }

    /* JADX INFO: renamed from: d */
    public static PorterDuff.Mode m397d(MenuItem r02) {
        return r02.getIconTintMode();
    }

    /* JADX INFO: renamed from: e */
    public static int m398e(MenuItem r02) {
        return r02.getNumericModifiers();
    }

    /* JADX INFO: renamed from: f */
    public static CharSequence m399f(MenuItem r02) {
        return r02.getTooltipText();
    }

    /* JADX INFO: renamed from: g */
    public static MenuItem m400g(MenuItem r02, char r1, int r2) {
        return r02.setAlphabeticShortcut(r1, r2);
    }

    /* JADX INFO: renamed from: h */
    public static MenuItem m401h(MenuItem r02, CharSequence r1) {
        return r02.setContentDescription(r1);
    }

    /* JADX INFO: renamed from: i */
    public static MenuItem m402i(MenuItem r02, ColorStateList r1) {
        return r02.setIconTintList(r1);
    }

    /* JADX INFO: renamed from: j */
    public static MenuItem m403j(MenuItem r02, PorterDuff.Mode r1) {
        return r02.setIconTintMode(r1);
    }

    /* JADX INFO: renamed from: k */
    public static MenuItem m404k(MenuItem r02, char r1, int r2) {
        return r02.setNumericShortcut(r1, r2);
    }

    /* JADX INFO: renamed from: l */
    public static MenuItem m405l(MenuItem r02, char r1, char r2, int r3, int r4) {
        return r02.setShortcut(r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: m */
    public static MenuItem m406m(MenuItem r02, CharSequence r1) {
        return r02.setTooltipText(r1);
    }
}
