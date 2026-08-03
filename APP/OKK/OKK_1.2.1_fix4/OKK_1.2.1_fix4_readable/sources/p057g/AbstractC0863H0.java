package p057g;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.abc.core.runtime.C0790A;
import java.util.Objects;

/* JADX INFO: renamed from: g.H0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0863H0 {
    /* JADX INFO: renamed from: a */
    public static OnBackInvokedDispatcher m2185a(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: b */
    public static OnBackInvokedCallback m2186b(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new C0790A(1, runnable);
    }

    /* JADX INFO: renamed from: c */
    public static void m2187c(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    /* JADX INFO: renamed from: d */
    public static void m2188d(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
