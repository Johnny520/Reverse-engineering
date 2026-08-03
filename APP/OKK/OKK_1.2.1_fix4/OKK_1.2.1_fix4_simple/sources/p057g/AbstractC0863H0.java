package p057g;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;
import p056f0.C0790A;

/* JADX INFO: renamed from: g.H0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0863H0 {
    /* JADX INFO: renamed from: a */
    public static OnBackInvokedDispatcher m2185a(View r02) {
        return r02.findOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: b */
    public static OnBackInvokedCallback m2186b(Runnable r2) {
        Objects.requireNonNull(r2);
        return new C0790A(1, r2);
    }

    /* JADX INFO: renamed from: c */
    public static void m2187c(Object r1, Object r2) {
        ((OnBackInvokedDispatcher) r1).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) r2);
    }

    /* JADX INFO: renamed from: d */
    public static void m2188d(Object r02, Object r1) {
        ((OnBackInvokedDispatcher) r02).unregisterOnBackInvokedCallback((OnBackInvokedCallback) r1);
    }
}
