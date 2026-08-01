package p141j8;

import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p157k8.InterfaceC4107m1;
import p215oc.C5725t;
import p228p8.InterfaceC5976f;

/* JADX INFO: renamed from: j8.c0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3625c0 {
    /* JADX INFO: renamed from: a */
    static /* synthetic */ Object m13549a(InterfaceC3625c0 interfaceC3625c0, InterfaceC4107m1 interfaceC4107m1, C3627d0 c3627d0, InterfaceC5976f interfaceC5976f, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: send");
            return null;
        }
        if ((i10 & 2) != 0) {
            c3627d0 = null;
        }
        return interfaceC3625c0.mo12387e(interfaceC4107m1, c3627d0, interfaceC5976f);
    }

    /* JADX INFO: renamed from: b */
    void mo13550b(InterfaceC0184l interfaceC0184l);

    /* JADX INFO: renamed from: c */
    Object mo12386c(InterfaceC5976f interfaceC5976f);

    /* JADX INFO: renamed from: d */
    void mo13551d(InterfaceC0188p interfaceC0188p);

    /* JADX INFO: renamed from: e */
    Object mo12387e(InterfaceC4107m1 interfaceC4107m1, C3627d0 c3627d0, InterfaceC5976f interfaceC5976f);

    /* JADX INFO: renamed from: f */
    void mo13552f(InterfaceC0173a interfaceC0173a);
}
