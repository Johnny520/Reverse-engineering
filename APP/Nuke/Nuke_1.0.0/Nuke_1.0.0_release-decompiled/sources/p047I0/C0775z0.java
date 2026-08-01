package p047I0;

import p007B0.C0190d;
import p074O2.InterfaceC1050h;
import p110W0.InterfaceC1579d;
import p112W2.InterfaceC1599a;

/* JADX INFO: renamed from: I0.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0775z0 implements InterfaceC1050h, InterfaceC0693R0, InterfaceC1579d {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ C0775z0 f2516d = new C0775z0();

    /* JADX INFO: renamed from: e */
    public static final C0775z0 f2517e = new C0775z0();

    /* JADX INFO: renamed from: f */
    public static final C0707Y0 f2518f = new C0707Y0();

    @Override // p047I0.InterfaceC0693R0
    /* JADX INFO: renamed from: b */
    public InterfaceC1599a mo64b(AbstractC0713b abstractC0713b) {
        ViewOnAttachStateChangeListenerC0690P0 viewOnAttachStateChangeListenerC0690P0 = new ViewOnAttachStateChangeListenerC0690P0(abstractC0713b, 0);
        abstractC0713b.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0690P0);
        return new C0190d(5, abstractC0713b, viewOnAttachStateChangeListenerC0690P0);
    }
}
