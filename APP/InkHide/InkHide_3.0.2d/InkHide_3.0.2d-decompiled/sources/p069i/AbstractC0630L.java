package p069i;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: renamed from: i.L */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0630L {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m1239a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
        if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }
}
