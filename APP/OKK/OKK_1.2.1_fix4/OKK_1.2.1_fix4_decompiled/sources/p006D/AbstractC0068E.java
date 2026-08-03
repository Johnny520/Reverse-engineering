package p006D;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: D.E */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0068E {
    /* JADX INFO: renamed from: a */
    public static WindowInsets m208a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: b */
    public static WindowInsets m209b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: c */
    public static void m210c(View view) {
        view.requestApplyInsets();
    }
}
