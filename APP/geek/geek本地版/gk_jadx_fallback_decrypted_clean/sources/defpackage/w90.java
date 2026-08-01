package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class w90 {
    public static android.view.WindowInsets a(android.view.View r0, android.view.WindowInsets r1) {
            android.view.WindowInsets r0 = r0.dispatchApplyWindowInsets(r1)
            return r0
    }

    public static android.view.WindowInsets b(android.view.View r0, android.view.WindowInsets r1) {
            android.view.WindowInsets r0 = r0.onApplyWindowInsets(r1)
            return r0
    }

    public static void c(android.view.View r0) {
            r0.requestApplyInsets()
            return
    }
}
