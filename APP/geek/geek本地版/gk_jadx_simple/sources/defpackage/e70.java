package defpackage;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class e70 {
    public static OnBackInvokedDispatcher a(View r0) {
        return r0.findOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Runnable r2) {
        Objects.requireNonNull(r2);
        return new j3(2, r2);
    }

    public static void c(Object r1, Object r2) {
        ((OnBackInvokedDispatcher) r1).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) r2);
    }

    public static void d(Object r0, Object r1) {
        ((OnBackInvokedDispatcher) r0).unregisterOnBackInvokedCallback((OnBackInvokedCallback) r1);
    }
}
