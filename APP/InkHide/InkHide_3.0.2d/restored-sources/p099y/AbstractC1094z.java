package p099y;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: y.z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1094z {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static WindowInsets m2364a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static WindowInsets m2365b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m2366c(View view) {
        view.requestApplyInsets();
    }
}
