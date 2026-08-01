package p000;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: renamed from: n4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0509n4 {
    /* JADX INFO: renamed from: a */
    public static void m1911a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
        if (AbstractC0908xw.m2709a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
            return;
        }
        themedSpinnerAdapter.setDropDownViewTheme(theme);
    }
}
