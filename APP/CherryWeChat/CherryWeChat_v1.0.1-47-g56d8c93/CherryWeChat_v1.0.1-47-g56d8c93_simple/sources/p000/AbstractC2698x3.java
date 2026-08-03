package p000;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: renamed from: x3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2698x3 {
    /* JADX INFO: renamed from: a */
    public static OnBackInvokedDispatcher m5276a(Activity r0) {
        return AbstractC0859U.m1695e(r0);
    }

    /* JADX INFO: renamed from: b */
    public static OnBackInvokedCallback m5277b(Object r2, LayoutInflaterFactory2C0176E3 r3) {
        Objects.requireNonNull(r3);
        C2655w3 r0 = new C2655w3(0, r3);
        AbstractC0859U.m1697g(AbstractC0859U.m1696f(r2), r0);
        return r0;
    }

    /* JADX INFO: renamed from: c */
    public static void m5278c(Object r0, Object r1) {
        OnBackInvokedCallback r12 = AbstractC0859U.m1693c(r1);
        AbstractC0859U.m1698h(AbstractC0859U.m1696f(r0), r12);
    }
}
