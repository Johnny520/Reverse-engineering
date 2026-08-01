package p000;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: renamed from: tw */
/* JADX INFO: loaded from: classes.dex */
public final class C0760tw {

    /* JADX INFO: renamed from: a */
    public static final C0760tw f4626a = new C0760tw();

    /* JADX INFO: renamed from: a */
    public final OnBackInvokedCallback m2390a(InterfaceC0303hm interfaceC0303hm) {
        AbstractC0346ip.m1503o("onBackInvoked", interfaceC0303hm);
        return new C0360j3(1, interfaceC0303hm);
    }

    /* JADX INFO: renamed from: b */
    public final void m2391b(Object obj, int i, Object obj2) {
        AbstractC0346ip.m1503o("dispatcher", obj);
        AbstractC0346ip.m1503o("callback", obj2);
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    /* JADX INFO: renamed from: c */
    public final void m2392c(Object obj, Object obj2) {
        AbstractC0346ip.m1503o("dispatcher", obj);
        AbstractC0346ip.m1503o("callback", obj2);
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
