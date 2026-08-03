package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: cE */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1255cE {
    /* JADX INFO: renamed from: a */
    public static WindowInsets m2368a(View r1, WindowInsets r2) {
        int r0 = AbstractC2271nE.f7993a;
        return r1.dispatchApplyWindowInsets(r2);
    }

    /* JADX INFO: renamed from: b */
    public static WindowInsets m2369b(View r0, WindowInsets r1) {
        return r0.onApplyWindowInsets(r1);
    }

    /* JADX INFO: renamed from: c */
    public static void m2370c(View r0) {
        r0.requestApplyInsets();
    }
}
