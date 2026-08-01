package androidx.lifecycle;

import android.view.View;
import p005a4.AbstractC0064b;
import p122i4.AbstractC3197a;

/* JADX INFO: renamed from: androidx.lifecycle.p0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0679p0 {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC0676o m2661a(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(AbstractC3197a.f8501a);
            InterfaceC0676o interfaceC0676o = tag instanceof InterfaceC0676o ? (InterfaceC0676o) tag : null;
            if (interfaceC0676o != null) {
                return interfaceC0676o;
            }
            Object objM219a = AbstractC0064b.m219a(view);
            view = objM219a instanceof View ? (View) objM219a : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final void m2662b(View view, InterfaceC0676o interfaceC0676o) {
        view.getClass();
        view.setTag(AbstractC3197a.f8501a, interfaceC0676o);
    }
}
