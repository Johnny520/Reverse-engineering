package p303v;

import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0189q;
import p010a9.InterfaceC0190r;
import p215oc.C5725t;

/* JADX INFO: renamed from: v.l0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8706l0 {

    /* JADX INFO: renamed from: v.l0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0184l {

        /* JADX INFO: renamed from: q */
        public static final a f28901q = new a();

        /* JADX INFO: renamed from: a */
        public final Void m33435a(int i10) {
            return null;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            return m33435a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m33431a(InterfaceC8706l0 interfaceC8706l0, int i10, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, InterfaceC0190r interfaceC0190r, int i11, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: items");
            return;
        }
        if ((i11 & 2) != 0) {
            interfaceC0184l = null;
        }
        if ((i11 & 4) != 0) {
            interfaceC0184l2 = a.f28901q;
        }
        interfaceC8706l0.mo33434c(i10, interfaceC0184l, interfaceC0184l2, interfaceC0190r);
    }

    /* JADX INFO: renamed from: f */
    static /* synthetic */ void m33432f(InterfaceC8706l0 interfaceC8706l0, Object obj, Object obj2, InterfaceC0189q interfaceC0189q, int i10, Object obj3) {
        if (obj3 != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: item");
            return;
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        interfaceC8706l0.mo33433b(obj, obj2, interfaceC0189q);
    }

    /* JADX INFO: renamed from: b */
    void mo33433b(Object obj, Object obj2, InterfaceC0189q interfaceC0189q);

    /* JADX INFO: renamed from: c */
    void mo33434c(int i10, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, InterfaceC0190r interfaceC0190r);
}
