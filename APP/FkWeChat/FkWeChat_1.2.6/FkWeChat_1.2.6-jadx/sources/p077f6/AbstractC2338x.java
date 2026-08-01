package p077f6;

import p010a9.InterfaceC0189q;

/* JADX INFO: renamed from: f6.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2338x {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC2335u m8507a(InterfaceC2336v interfaceC2336v, InterfaceC0189q interfaceC0189q) {
        interfaceC2336v.getClass();
        return new C2302c(interfaceC0189q, interfaceC2336v);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC2335u m8508b(InterfaceC2336v interfaceC2336v, InterfaceC0189q interfaceC0189q, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC2336v = AbstractC2337w.m8506b(false, false, false, 0L, 15, null);
        }
        if ((i10 & 2) != 0) {
            interfaceC0189q = null;
        }
        return m8507a(interfaceC2336v, interfaceC0189q);
    }
}
