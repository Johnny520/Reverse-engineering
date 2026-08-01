package p179m2;

import p010a9.InterfaceC0173a;
import p215oc.C5725t;
import p250r1.C6457g;

/* JADX INFO: renamed from: m2.b3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4822b3 {
    /* JADX INFO: renamed from: b */
    static /* synthetic */ void m19296b(InterfaceC4822b3 interfaceC4822b3, C6457g c6457g, InterfaceC0173a interfaceC0173a, InterfaceC0173a interfaceC0173a2, InterfaceC0173a interfaceC0173a3, InterfaceC0173a interfaceC0173a4, InterfaceC0173a interfaceC0173a5, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: showMenu");
            return;
        }
        if ((i10 & 2) != 0) {
            interfaceC0173a = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC0173a2 = null;
        }
        if ((i10 & 8) != 0) {
            interfaceC0173a3 = null;
        }
        if ((i10 & 16) != 0) {
            interfaceC0173a4 = null;
        }
        if ((i10 & 32) != 0) {
            interfaceC0173a5 = null;
        }
        interfaceC4822b3.mo19299d(c6457g, interfaceC0173a, interfaceC0173a2, interfaceC0173a3, interfaceC0173a4, interfaceC0173a5);
    }

    /* JADX INFO: renamed from: a */
    void mo19297a();

    /* JADX INFO: renamed from: c */
    EnumC4832d3 mo19298c();

    /* JADX INFO: renamed from: d */
    void mo19299d(C6457g c6457g, InterfaceC0173a interfaceC0173a, InterfaceC0173a interfaceC0173a2, InterfaceC0173a interfaceC0173a3, InterfaceC0173a interfaceC0173a4, InterfaceC0173a interfaceC0173a5);
}
