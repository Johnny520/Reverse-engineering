package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;

/* JADX INFO: renamed from: z4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2785z4 {
    /* JADX INFO: renamed from: a */
    public static String m5356a(Context context) {
        return context.getOpPackageName();
    }

    /* JADX INFO: renamed from: b */
    public static Insets m5357b(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: c */
    public static void m5358c(Resources.Theme theme) {
        theme.rebase();
    }
}
