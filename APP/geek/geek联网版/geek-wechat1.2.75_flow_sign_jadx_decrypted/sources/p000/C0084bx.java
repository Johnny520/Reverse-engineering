package p000;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: renamed from: bx */
/* JADX INFO: loaded from: classes.dex */
public final class C0084bx {

    /* JADX INFO: renamed from: a */
    public static final C0084bx f789a = new C0084bx();

    /* JADX INFO: renamed from: a */
    public final OnBackInvokedCallback m548a(InterfaceC0379jm interfaceC0379jm) {
        AbstractC0493mp.m1857g("onBackInvoked", interfaceC0379jm);
        return new C0360j3(1, interfaceC0379jm);
    }

    /* JADX INFO: renamed from: b */
    public final void m549b(Object obj, int i, Object obj2) {
        AbstractC0493mp.m1857g("dispatcher", obj);
        AbstractC0493mp.m1857g("callback", obj2);
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    /* JADX INFO: renamed from: c */
    public final void m550c(Object obj, Object obj2) {
        AbstractC0493mp.m1857g("dispatcher", obj);
        AbstractC0493mp.m1857g("callback", obj2);
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
