package p229p9;

import p055e.AbstractC1960a;

/* JADX INFO: renamed from: p9.c0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5990c0 {

    /* JADX INFO: renamed from: a */
    public static final C6002g0 f18931a = new C6002g0("InvalidModuleNotifier");

    /* JADX INFO: renamed from: a */
    public static final void m23997a(InterfaceC6005h0 interfaceC6005h0) {
        interfaceC6005h0.getClass();
        AbstractC1960a.m7104a(interfaceC6005h0.mo12667p0(f18931a));
        throw new C5987b0("Accessing invalid module descriptor " + interfaceC6005h0);
    }
}
