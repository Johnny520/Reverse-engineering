package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class w90 {
    /* JADX INFO: renamed from: a */
    public static WindowInsets m2550a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: b */
    public static WindowInsets m2551b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: c */
    public static void m2552c(View view) {
        view.requestApplyInsets();
    }
}
