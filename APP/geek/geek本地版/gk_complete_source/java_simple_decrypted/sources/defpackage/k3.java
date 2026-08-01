package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class k3 {
    public static OnBackInvokedDispatcher a(Activity r0) {
        return e0.d(r0);
    }

    public static OnBackInvokedCallback b(Object r2, r3 r3) {
        Objects.requireNonNull(r3);
        j3 r0 = new j3(0, r3);
        e0.g(e0.e(r2), r0);
        return r0;
    }

    public static void c(Object r0, Object r1) {
        OnBackInvokedCallback r12 = e0.b(r1);
        e0.h(e0.e(r0), r12);
    }
}
