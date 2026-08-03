package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;

/* JADX INFO: renamed from: z4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2785z4 {
    /* JADX INFO: renamed from: a */
    public static String m5356a(Context r0) {
        return r0.getOpPackageName();
    }

    /* JADX INFO: renamed from: b */
    public static Insets m5357b(int r0, int r1, int r2, int r3) {
        return Insets.of(r0, r1, r2, r3);
    }

    /* JADX INFO: renamed from: c */
    public static void m5358c(Resources.Theme r0) {
        r0.rebase();
    }
}
