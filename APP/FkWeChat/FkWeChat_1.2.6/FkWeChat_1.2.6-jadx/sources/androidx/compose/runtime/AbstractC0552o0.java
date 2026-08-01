package androidx.compose.runtime;

import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p172l8.C4700i0;

/* JADX INFO: renamed from: androidx.compose.runtime.o0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0552o0 {
    /* JADX INFO: renamed from: a */
    public static C4700i0 m1973a(C0513i3 c0513i3, InterfaceC0188p interfaceC0188p, int i10, InterfaceC0572r interfaceC0572r, int i11) {
        m1975c(c0513i3, interfaceC0188p, interfaceC0572r, AbstractC0541m3.m1929a(i10 | 1));
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static C4700i0 m1974b(C0513i3[] c0513i3Arr, InterfaceC0188p interfaceC0188p, int i10, InterfaceC0572r interfaceC0572r, int i11) {
        m1976d(c0513i3Arr, interfaceC0188p, interfaceC0572r, AbstractC0541m3.m1929a(i10 | 1));
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: c */
    public static final void m1975c(final C0513i3 c0513i3, final InterfaceC0188p interfaceC0188p, InterfaceC0572r interfaceC0572r, final int i10) {
        InterfaceC0572r interfaceC0572rMo2181q = interfaceC0572r.mo2181q(-149765515);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-149765515, i10, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:395)");
        }
        interfaceC0572rMo2181q.mo2185u(c0513i3);
        interfaceC0188p.invoke(interfaceC0572rMo2181q, Integer.valueOf((i10 >> 3) & 14));
        interfaceC0572rMo2181q.mo2157P();
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        InterfaceC0514i4 interfaceC0514i4Mo2188x = interfaceC0572rMo2181q.mo2188x();
        if (interfaceC0514i4Mo2188x != null) {
            interfaceC0514i4Mo2188x.mo1756a(new InterfaceC0188p() { // from class: androidx.compose.runtime.m0
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC0552o0.m1973a(c0513i3, interfaceC0188p, i10, (InterfaceC0572r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m1976d(final C0513i3[] c0513i3Arr, final InterfaceC0188p interfaceC0188p, InterfaceC0572r interfaceC0572r, final int i10) {
        InterfaceC0572r interfaceC0572rMo2181q = interfaceC0572r.mo2181q(415205898);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(415205898, i10, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:375)");
        }
        interfaceC0572rMo2181q.mo2164W(c0513i3Arr);
        interfaceC0188p.invoke(interfaceC0572rMo2181q, Integer.valueOf((i10 >> 3) & 14));
        interfaceC0572rMo2181q.mo2146E();
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        InterfaceC0514i4 interfaceC0514i4Mo2188x = interfaceC0572rMo2181q.mo2188x();
        if (interfaceC0514i4Mo2188x != null) {
            interfaceC0514i4Mo2188x.mo1756a(new InterfaceC0188p() { // from class: androidx.compose.runtime.n0
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC0552o0.m1974b(c0513i3Arr, interfaceC0188p, i10, (InterfaceC0572r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public static final AbstractC0506h3 m1977e(InterfaceC0466b5 interfaceC0466b5, InterfaceC0173a interfaceC0173a) {
        return new C0483e1(interfaceC0466b5, interfaceC0173a);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ AbstractC0506h3 m1978f(InterfaceC0466b5 interfaceC0466b5, InterfaceC0173a interfaceC0173a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC0466b5 = AbstractC0473c5.m1579r();
        }
        return m1977e(interfaceC0466b5, interfaceC0173a);
    }

    /* JADX INFO: renamed from: g */
    public static final AbstractC0506h3 m1979g(InterfaceC0184l interfaceC0184l) {
        return new C0598u0(interfaceC0184l);
    }

    /* JADX INFO: renamed from: h */
    public static final AbstractC0506h3 m1980h(InterfaceC0173a interfaceC0173a) {
        return new C0571q5(interfaceC0173a);
    }
}
