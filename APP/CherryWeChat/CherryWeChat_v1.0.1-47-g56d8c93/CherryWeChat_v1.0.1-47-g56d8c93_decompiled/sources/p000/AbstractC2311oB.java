package p000;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: renamed from: oB */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2311oB {
    /* JADX INFO: renamed from: a */
    public static OnBackInvokedDispatcher m4720a(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: b */
    public static OnBackInvokedCallback m4721b(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new C2655w3(2, runnable);
    }

    /* JADX INFO: renamed from: c */
    public static void m4722c(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    /* JADX INFO: renamed from: d */
    public static void m4723d(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
