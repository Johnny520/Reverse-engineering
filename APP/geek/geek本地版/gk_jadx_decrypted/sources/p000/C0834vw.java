package p000;

import android.window.OnBackInvokedCallback;

/* JADX INFO: renamed from: vw */
/* JADX INFO: loaded from: classes.dex */
public final class C0834vw {

    /* JADX INFO: renamed from: a */
    public static final C0834vw f4888a = new C0834vw();

    /* JADX INFO: renamed from: a */
    public final OnBackInvokedCallback m2526a(InterfaceC0713sm interfaceC0713sm, InterfaceC0713sm interfaceC0713sm2, InterfaceC0303hm interfaceC0303hm, InterfaceC0303hm interfaceC0303hm2) {
        AbstractC0346ip.m1503o("onBackStarted", interfaceC0713sm);
        AbstractC0346ip.m1503o("onBackProgressed", interfaceC0713sm2);
        AbstractC0346ip.m1503o("onBackInvoked", interfaceC0303hm);
        AbstractC0346ip.m1503o("onBackCancelled", interfaceC0303hm2);
        return new C0797uw(interfaceC0713sm, interfaceC0713sm2, interfaceC0303hm, interfaceC0303hm2);
    }
}
