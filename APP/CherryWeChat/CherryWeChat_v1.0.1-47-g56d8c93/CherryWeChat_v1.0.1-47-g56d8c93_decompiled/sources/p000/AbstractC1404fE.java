package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: fE */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1404fE {
    /* JADX INFO: renamed from: a */
    public static C0489LF m2675a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C0489LF c0489lfM939h = C0489LF.m939h(null, rootWindowInsets);
        C0317HF c0317hf = c0489lfM939h.f1602a;
        c0317hf.mo20r(c0489lfM939h);
        c0317hf.mo12d(view.getRootView());
        return c0489lfM939h;
    }

    /* JADX INFO: renamed from: b */
    public static void m2676b(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
