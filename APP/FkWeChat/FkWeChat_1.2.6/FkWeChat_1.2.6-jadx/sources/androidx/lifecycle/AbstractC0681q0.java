package androidx.lifecycle;

import android.view.View;
import p005a4.AbstractC0064b;
import p137j4.AbstractC3596c;

/* JADX INFO: renamed from: androidx.lifecycle.q0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0681q0 {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC0677o0 m2678a(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(AbstractC3596c.f9992a);
            InterfaceC0677o0 interfaceC0677o0 = tag instanceof InterfaceC0677o0 ? (InterfaceC0677o0) tag : null;
            if (interfaceC0677o0 != null) {
                return interfaceC0677o0;
            }
            Object objM219a = AbstractC0064b.m219a(view);
            view = objM219a instanceof View ? (View) objM219a : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final void m2679b(View view, InterfaceC0677o0 interfaceC0677o0) {
        view.getClass();
        view.setTag(AbstractC3596c.f9992a, interfaceC0677o0);
    }
}
