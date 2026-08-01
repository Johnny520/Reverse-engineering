package p000;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class k70 {
    /* JADX INFO: renamed from: a */
    public static OnBackInvokedDispatcher m1657a(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: b */
    public static OnBackInvokedCallback m1658b(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new C0360j3(2, runnable);
    }

    /* JADX INFO: renamed from: c */
    public static void m1659c(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    /* JADX INFO: renamed from: d */
    public static void m1660d(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
