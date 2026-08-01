package p316w;

import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p010a9.InterfaceC0190r;
import p215oc.C5725t;

/* JADX INFO: renamed from: w.r0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8975r0 {

    /* JADX INFO: renamed from: w.r0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0184l {

        /* JADX INFO: renamed from: q */
        public static final a f29761q = new a();

        /* JADX INFO: renamed from: a */
        public final Void m34440a(int i10) {
            return null;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            return m34440a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: e */
    static /* synthetic */ void m34439e(InterfaceC8975r0 interfaceC8975r0, int i10, InterfaceC0184l interfaceC0184l, InterfaceC0188p interfaceC0188p, InterfaceC0184l interfaceC0184l2, InterfaceC0190r interfaceC0190r, int i11, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: items");
            return;
        }
        if ((i11 & 2) != 0) {
            interfaceC0184l = null;
        }
        if ((i11 & 4) != 0) {
            interfaceC0188p = null;
        }
        if ((i11 & 8) != 0) {
            interfaceC0184l2 = a.f29761q;
        }
        interfaceC8975r0.mo34416d(i10, interfaceC0184l, interfaceC0188p, interfaceC0184l2, interfaceC0190r);
    }

    /* JADX INFO: renamed from: d */
    void mo34416d(int i10, InterfaceC0184l interfaceC0184l, InterfaceC0188p interfaceC0188p, InterfaceC0184l interfaceC0184l2, InterfaceC0190r interfaceC0190r);
}
