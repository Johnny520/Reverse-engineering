package defpackage;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final class tw {
    public static final tw a = null;

    static {
        a = new tw();
    }

    public final OnBackInvokedCallback a(hm r3) {
        ip.o("onBackInvoked", r3);
        return new j3(1, r3);
    }

    public final void b(Object r2, int r3, Object r4) {
        ip.o("dispatcher", r2);
        ip.o("callback", r4);
        ((OnBackInvokedDispatcher) r2).registerOnBackInvokedCallback(r3, (OnBackInvokedCallback) r4);
    }

    public final void c(Object r2, Object r3) {
        ip.o("dispatcher", r2);
        ip.o("callback", r3);
        ((OnBackInvokedDispatcher) r2).unregisterOnBackInvokedCallback((OnBackInvokedCallback) r3);
    }
}
