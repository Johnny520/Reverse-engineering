package p189n;

import p165l1.InterfaceC4507m;
import p248r.InterfaceC6434j;

/* JADX INFO: renamed from: n.w0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5295w0 {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC4507m m21605a(InterfaceC4507m interfaceC4507m, boolean z10, InterfaceC6434j interfaceC6434j) {
        return interfaceC4507m.mo17445i(z10 ? new C5291v0(interfaceC6434j) : InterfaceC4507m.f13080a);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC4507m m21606b(InterfaceC4507m interfaceC4507m, boolean z10, InterfaceC6434j interfaceC6434j, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            interfaceC6434j = null;
        }
        return m21605a(interfaceC4507m, z10, interfaceC6434j);
    }
}
