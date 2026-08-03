package p006D;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: D.E */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0068E {
    /* JADX INFO: renamed from: a */
    public static WindowInsets m208a(View r02, WindowInsets r1) {
        return r02.dispatchApplyWindowInsets(r1);
    }

    /* JADX INFO: renamed from: b */
    public static WindowInsets m209b(View r02, WindowInsets r1) {
        return r02.onApplyWindowInsets(r1);
    }

    /* JADX INFO: renamed from: c */
    public static void m210c(View r02) {
        r02.requestApplyInsets();
    }
}
