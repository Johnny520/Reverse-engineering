package p180m3;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import p010a9.InterfaceC0173a;

/* JADX INFO: renamed from: m3.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4948i {

    /* JADX INFO: renamed from: a */
    public static final C4948i f15024a = new C4948i();

    /* JADX INFO: renamed from: a */
    public static void m19993a(InterfaceC0173a interfaceC0173a) {
        if (interfaceC0173a != null) {
            interfaceC0173a.invoke();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final OnBackInvokedCallback m19994b(final InterfaceC0173a interfaceC0173a) {
        return new OnBackInvokedCallback() { // from class: m3.h
            public final void onBackInvoked() {
                C4948i.m19993a(interfaceC0173a);
            }
        };
    }

    /* JADX INFO: renamed from: c */
    public static final void m19995c(View view, Object obj) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj);
    }

    /* JADX INFO: renamed from: d */
    public static final void m19996d(View view, Object obj) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
    }
}
