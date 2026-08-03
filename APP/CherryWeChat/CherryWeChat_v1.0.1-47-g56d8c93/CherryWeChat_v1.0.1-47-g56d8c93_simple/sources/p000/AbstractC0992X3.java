package p000;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;
import java.util.Objects;

/* JADX INFO: renamed from: X3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0992X3 {
    /* JADX INFO: renamed from: a */
    public static void m1882a(ThemedSpinnerAdapter r1, Resources.Theme r2) {
        if (Objects.equals(r1.getDropDownViewTheme(), r2) == true) goto L6;
        r1.setDropDownViewTheme(r2);
        return;
    }
}
