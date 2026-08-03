package p000;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: renamed from: oB */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2311oB {
    /* JADX INFO: renamed from: a */
    public static OnBackInvokedDispatcher m4720a(View r0) {
        return r0.findOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: b */
    public static OnBackInvokedCallback m4721b(Runnable r2) {
        Objects.requireNonNull(r2);
        return new C2655w3(2, r2);
    }

    /* JADX INFO: renamed from: c */
    public static void m4722c(Object r1, Object r2) {
        ((OnBackInvokedDispatcher) r1).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) r2);
    }

    /* JADX INFO: renamed from: d */
    public static void m4723d(Object r0, Object r1) {
        ((OnBackInvokedDispatcher) r0).unregisterOnBackInvokedCallback((OnBackInvokedCallback) r1);
    }
}
