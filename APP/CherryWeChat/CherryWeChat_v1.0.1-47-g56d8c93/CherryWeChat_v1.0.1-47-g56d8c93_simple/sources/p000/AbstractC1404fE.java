package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: fE */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1404fE {
    /* JADX INFO: renamed from: a */
    public static C0489LF m2675a(View r2) {
        WindowInsets r0 = r2.getRootWindowInsets();
        if (r0 != null) goto L5;
        return null;
    L5:
        C0489LF r02 = C0489LF.m939h(null, r0);
        C0317HF r1 = r02.f1602a;
        r1.mo20r(r02);
        r1.mo12d(r2.getRootView());
        return r02;
    }

    /* JADX INFO: renamed from: b */
    public static void m2676b(View r0, int r1, int r2) {
        r0.setScrollIndicators(r1, r2);
    }
}
