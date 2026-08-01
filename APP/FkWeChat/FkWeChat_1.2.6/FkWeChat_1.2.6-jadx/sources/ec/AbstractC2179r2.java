package ec;

import p010a9.InterfaceC0188p;
import p161kc.AbstractC4244b;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6539h;

/* JADX INFO: renamed from: ec.r2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2179r2 {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC2208z m7895a(InterfaceC2198w1 interfaceC2198w1) {
        return new C2175q2(interfaceC2198w1);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC2208z m7896b(InterfaceC2198w1 interfaceC2198w1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC2198w1 = null;
        }
        return m7895a(interfaceC2198w1);
    }

    /* JADX INFO: renamed from: c */
    public static final Object m7897c(InterfaceC0188p interfaceC0188p, InterfaceC5976f interfaceC5976f) {
        C2171p2 c2171p2 = new C2171p2(interfaceC5976f.getContext(), interfaceC5976f);
        Object objM16727d = AbstractC4244b.m16727d(c2171p2, c2171p2, interfaceC0188p);
        if (objM16727d == AbstractC6325c.m24992g()) {
            AbstractC6539h.m25860c(interfaceC5976f);
        }
        return objM16727d;
    }
}
