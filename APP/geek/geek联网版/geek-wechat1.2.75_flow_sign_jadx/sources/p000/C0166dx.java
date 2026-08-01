package p000;

import android.window.OnBackInvokedCallback;

/* JADX INFO: renamed from: dx */
/* JADX INFO: loaded from: classes.dex */
public final class C0166dx {

    /* JADX INFO: renamed from: a */
    public static final C0166dx f1435a = new C0166dx();

    /* JADX INFO: renamed from: a */
    public final OnBackInvokedCallback m941a(InterfaceC0786um interfaceC0786um, InterfaceC0786um interfaceC0786um2, InterfaceC0379jm interfaceC0379jm, InterfaceC0379jm interfaceC0379jm2) {
        AbstractC0493mp.m1857g("onBackStarted", interfaceC0786um);
        AbstractC0493mp.m1857g("onBackProgressed", interfaceC0786um2);
        AbstractC0493mp.m1857g("onBackInvoked", interfaceC0379jm);
        AbstractC0493mp.m1857g("onBackCancelled", interfaceC0379jm2);
        return new C0130cx(interfaceC0786um, interfaceC0786um2, interfaceC0379jm, interfaceC0379jm2);
    }
}
