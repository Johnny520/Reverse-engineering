package p135j2;

import java.util.Map;
import p010a9.InterfaceC0184l;
import p185m8.AbstractC5109u0;
import p215oc.C5725t;

/* JADX INFO: renamed from: j2.q0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3561q0 extends InterfaceC3566s {
    /* JADX INFO: renamed from: b1 */
    static /* synthetic */ InterfaceC3558p0 m13344b1(InterfaceC3561q0 interfaceC3561q0, int i10, int i11, Map map, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, int i12, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: layout");
            return null;
        }
        if ((i12 & 4) != 0) {
            map = AbstractC5109u0.m20768i();
        }
        Map map2 = map;
        if ((i12 & 8) != 0) {
            interfaceC0184l = null;
        }
        return interfaceC3561q0.mo1228U1(i10, i11, map2, interfaceC0184l, interfaceC0184l2);
    }

    /* JADX INFO: renamed from: n0 */
    static /* synthetic */ InterfaceC3558p0 m13345n0(InterfaceC3561q0 interfaceC3561q0, int i10, int i11, Map map, InterfaceC0184l interfaceC0184l, int i12, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: layout");
            return null;
        }
        if ((i12 & 4) != 0) {
            map = AbstractC5109u0.m20768i();
        }
        return interfaceC3561q0.mo1235x0(i10, i11, map, interfaceC0184l);
    }

    /* JADX INFO: renamed from: U1 */
    InterfaceC3558p0 mo1228U1(int i10, int i11, Map map, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2);

    /* JADX INFO: renamed from: x0 */
    default InterfaceC3558p0 mo1235x0(int i10, int i11, Map map, InterfaceC0184l interfaceC0184l) {
        return mo1228U1(i10, i11, map, null, interfaceC0184l);
    }
}
