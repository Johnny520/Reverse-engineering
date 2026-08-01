package p099y;

import android.view.View;

/* JADX INFO: renamed from: y.G */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1043G {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m2272a(View view) {
        return view.getImportantForContentCapture();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static CharSequence m2273b(View view) {
        return view.getStateDescription();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m2274c(View view) {
        return view.isImportantForContentCapture();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m2275d(View view, int i2) {
        view.setImportantForContentCapture(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m2276e(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
