package p050da;

import gb.EnumC2671h2;
import p185m8.AbstractC5065a1;
import p229p9.InterfaceC6018l1;

/* JADX INFO: renamed from: da.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1929b {
    /* JADX INFO: renamed from: a */
    public static final C1928a m6996a(EnumC2671h2 enumC2671h2, boolean z10, boolean z11, InterfaceC6018l1 interfaceC6018l1) {
        enumC2671h2.getClass();
        return new C1928a(enumC2671h2, null, z11, z10, interfaceC6018l1 != null ? AbstractC5065a1.m20479d(interfaceC6018l1) : null, null, 34, null);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C1928a m6997b(EnumC2671h2 enumC2671h2, boolean z10, boolean z11, InterfaceC6018l1 interfaceC6018l1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            interfaceC6018l1 = null;
        }
        return m6996a(enumC2671h2, z10, z11, interfaceC6018l1);
    }
}
