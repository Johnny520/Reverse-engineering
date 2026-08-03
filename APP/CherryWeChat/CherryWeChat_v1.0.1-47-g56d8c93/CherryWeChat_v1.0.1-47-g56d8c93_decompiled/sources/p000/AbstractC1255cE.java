package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: cE */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1255cE {
    /* JADX INFO: renamed from: a */
    public static WindowInsets m2368a(View view, WindowInsets windowInsets) {
        int i = AbstractC2271nE.f7993a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: b */
    public static WindowInsets m2369b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: c */
    public static void m2370c(View view) {
        view.requestApplyInsets();
    }
}
