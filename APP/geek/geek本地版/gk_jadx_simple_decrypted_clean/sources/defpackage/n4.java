package defpackage;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: loaded from: classes.dex */
public abstract class n4 {
    public static void a(ThemedSpinnerAdapter r1, Resources.Theme r2) {
        if (pw.a(r1.getDropDownViewTheme(), r2) == true) goto L6;
        r1.setDropDownViewTheme(r2);
        return;
    }
}
