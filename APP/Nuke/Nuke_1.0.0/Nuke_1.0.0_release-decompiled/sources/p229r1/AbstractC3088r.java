package p229r1;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: r1.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3088r {
    /* JADX INFO: renamed from: a */
    public static C3070c0 m5401a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C3070c0 c3070c0M5393c = C3070c0.m5393c(null, rootWindowInsets);
        C3064Z c3064z = c3070c0M5393c.f9782a;
        c3064z.mo5378y(c3070c0M5393c);
        View rootView = view.getRootView();
        c3064z.mo5363d(rootView);
        c3064z.mo5370p(rootView);
        c3064z.mo5371q();
        return c3070c0M5393c;
    }
}
