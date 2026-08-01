package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class w90 {
    public static WindowInsets a(View r0, WindowInsets r1) {
        return r0.dispatchApplyWindowInsets(r1);
    }

    public static WindowInsets b(View r0, WindowInsets r1) {
        return r0.onApplyWindowInsets(r1);
    }

    public static void c(View r0) {
        r0.requestApplyInsets();
    }
}
