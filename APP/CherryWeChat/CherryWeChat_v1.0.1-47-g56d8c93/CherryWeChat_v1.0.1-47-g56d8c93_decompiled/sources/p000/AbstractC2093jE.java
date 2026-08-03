package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: jE */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2093jE {
    /* JADX INFO: renamed from: a */
    public static WindowInsets m4277a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m4278b(View view) {
        return view.getStateDescription();
    }

    /* JADX INFO: renamed from: c */
    public static void m4279c(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
