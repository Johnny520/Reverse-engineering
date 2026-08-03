package Yue;

import Yue.InterfaceC7441;

/* JADX INFO: renamed from: Yue.ۥۢ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1263 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final InterfaceC7441 m3636(@InterfaceC6399 InterfaceC7441.C1262 c1262, long j, long j2) {
        return new C7580(C4555.m13421(j), C4555.m13421(j2));
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static /* synthetic */ InterfaceC7441 m3637(InterfaceC7441.C1262 c1262, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = C4555.f9803.m13508();
        }
        if ((i & 2) != 0) {
            j2 = C4555.f9803.m13491();
        }
        return m3636(c1262, j, j2);
    }
}
