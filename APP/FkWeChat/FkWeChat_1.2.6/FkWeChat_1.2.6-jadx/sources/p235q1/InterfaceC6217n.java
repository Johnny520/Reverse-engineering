package p235q1;

import p215oc.C5725t;

/* JADX INFO: renamed from: q1.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6217n {
    /* JADX INFO: renamed from: c */
    static /* synthetic */ void m24453c(InterfaceC6217n interfaceC6217n, boolean z10, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: clearFocus");
            return;
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        interfaceC6217n.mo24454A(z10);
    }

    /* JADX INFO: renamed from: A */
    void mo24454A(boolean z10);

    /* JADX INFO: renamed from: s */
    boolean mo24455s(int i10);
}
