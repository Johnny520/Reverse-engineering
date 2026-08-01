package p235q1;

import p010a9.InterfaceC0188p;

/* JADX INFO: renamed from: q1.g0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6204g0 {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC6202f0 m24386a(int i10, InterfaceC0188p interfaceC0188p) {
        return new C6206h0(i10, false, interfaceC0188p, null, 10, null);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC6202f0 m24387b(int i10, InterfaceC0188p interfaceC0188p, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = AbstractC6214l0.f19289a.m24448a();
        }
        if ((i11 & 2) != 0) {
            interfaceC0188p = null;
        }
        return m24386a(i10, interfaceC0188p);
    }
}
