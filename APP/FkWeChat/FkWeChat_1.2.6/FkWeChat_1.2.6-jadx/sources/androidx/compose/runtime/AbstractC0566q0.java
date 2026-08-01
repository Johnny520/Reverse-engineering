package androidx.compose.runtime;

import p057e1.AbstractC1989q;
import p057e1.C1988p;

/* JADX INFO: renamed from: androidx.compose.runtime.q0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0566q0 {
    /* JADX INFO: renamed from: a */
    public static final boolean m2136a(InterfaceC0457a3 interfaceC0457a3, AbstractC0524k0 abstractC0524k0) {
        abstractC0524k0.getClass();
        return interfaceC0457a3.containsKey(abstractC0524k0);
    }

    /* JADX INFO: renamed from: b */
    public static final Object m2137b(InterfaceC0457a3 interfaceC0457a3, AbstractC0524k0 abstractC0524k0) {
        abstractC0524k0.getClass();
        Object objMo1775a = interfaceC0457a3.get(abstractC0524k0);
        if (objMo1775a == null) {
            objMo1775a = abstractC0524k0.mo1775a();
        }
        return ((InterfaceC0610v5) objMo1775a).mo1661a(interfaceC0457a3);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC0457a3 m2138c(C0513i3[] c0513i3Arr, InterfaceC0457a3 interfaceC0457a3, InterfaceC0457a3 interfaceC0457a32) {
        C1988p.a aVarM7175y = AbstractC1989q.m7184a().builder();
        for (C0513i3 c0513i3 : c0513i3Arr) {
            AbstractC0524k0 abstractC0524k0M1747b = c0513i3.m1747b();
            abstractC0524k0M1747b.getClass();
            AbstractC0506h3 abstractC0506h3 = (AbstractC0506h3) abstractC0524k0M1747b;
            if (c0513i3.m1746a() || !m2136a(interfaceC0457a3, abstractC0506h3)) {
                aVarM7175y.put(abstractC0506h3, abstractC0506h3.mo1695b(c0513i3, (InterfaceC0610v5) interfaceC0457a32.get(abstractC0506h3)));
            }
        }
        return aVarM7175y.build();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceC0457a3 m2139d(C0513i3[] c0513i3Arr, InterfaceC0457a3 interfaceC0457a3, InterfaceC0457a3 interfaceC0457a32, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            interfaceC0457a32 = AbstractC1989q.m7184a();
        }
        return m2138c(c0513i3Arr, interfaceC0457a3, interfaceC0457a32);
    }
}
