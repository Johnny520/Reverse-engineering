package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: jE */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2093jE {
    /* JADX INFO: renamed from: a */
    public static WindowInsets m4277a(View r0, WindowInsets r1) {
        return r0.dispatchApplyWindowInsets(r1);
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m4278b(View r0) {
        return r0.getStateDescription();
    }

    /* JADX INFO: renamed from: c */
    public static void m4279c(View r0, CharSequence r1) {
        r0.setStateDescription(r1);
    }
}
