package p014b;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import p085fg.InterfaceC1220a;

/* JADX INFO: renamed from: b.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0124c {

    /* JADX INFO: renamed from: a */
    public static final C0124c f325a = new C0124c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final OnBackInvokedCallback m618a(InterfaceC1220a interfaceC1220a) {
        interfaceC1220a.getClass();
        return new C0123b(interfaceC1220a, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m619b(Object obj, int i9, Object obj2) {
        obj.getClass();
        obj2.getClass();
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i9, (OnBackInvokedCallback) obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m620c(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
