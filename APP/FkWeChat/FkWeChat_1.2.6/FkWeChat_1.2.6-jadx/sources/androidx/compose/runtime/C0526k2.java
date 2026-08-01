package androidx.compose.runtime;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p055e.AbstractC1960a;
import p117i.AbstractC3092w0;
import p117i.C3076o0;
import p117i.C3082r0;
import p349y0.C9507b;

/* JADX INFO: renamed from: androidx.compose.runtime.k2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0526k2 {

    /* JADX INFO: renamed from: a */
    public final C3082r0 f1436a = C9507b.m37016e(null, 1, null);

    /* JADX INFO: renamed from: b */
    public final C3082r0 f1437b = C9507b.m37016e(null, 1, null);

    /* JADX INFO: renamed from: f */
    public static final boolean m1779f(C0477d2 c0477d2, AbstractC0533l2 abstractC0533l2) {
        return AbstractC1061t.m3842c(abstractC0533l2.m1846a(), c0477d2);
    }

    /* JADX INFO: renamed from: b */
    public final void m1780b() {
        C9507b.m37014c(this.f1436a);
        C9507b.m37014c(this.f1437b);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1781c(AbstractC0463b2 abstractC0463b2) {
        return C9507b.m37017f(this.f1436a, abstractC0463b2);
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC0533l2 m1782d(AbstractC0463b2 abstractC0463b2) {
        AbstractC0533l2 abstractC0533l2 = (AbstractC0533l2) C9507b.m37023l(this.f1436a, abstractC0463b2);
        if (C9507b.m37020i(this.f1436a)) {
            C9507b.m37014c(this.f1437b);
        }
        return abstractC0533l2;
    }

    /* JADX INFO: renamed from: e */
    public final void m1783e(final C0477d2 c0477d2) {
        Object objM11238e = this.f1437b.m11238e(c0477d2);
        if (objM11238e != null) {
            if (!(objM11238e instanceof C3076o0)) {
                AbstractC1960a.m7104a(objM11238e);
                C9507b.m37024m(this.f1436a, null, new InterfaceC0184l() { // from class: androidx.compose.runtime.j2
                    @Override // p010a9.InterfaceC0184l
                    /* JADX INFO: renamed from: m */
                    public final Object mo27m(Object obj) {
                        return Boolean.valueOf(C0526k2.m1779f(c0477d2, (AbstractC0533l2) obj));
                    }
                });
                return;
            }
            AbstractC3092w0 abstractC3092w0 = (AbstractC3092w0) objM11238e;
            Object[] objArr = abstractC3092w0.f8235a;
            int i10 = abstractC3092w0.f8236b;
            for (int i11 = 0; i11 < i10; i11++) {
                Object obj = objArr[i11];
                obj.getClass();
                AbstractC1960a.m7104a(obj);
                C9507b.m37024m(this.f1436a, null, new InterfaceC0184l() { // from class: androidx.compose.runtime.j2
                    @Override // p010a9.InterfaceC0184l
                    /* JADX INFO: renamed from: m */
                    public final Object mo27m(Object obj2) {
                        return Boolean.valueOf(C0526k2.m1779f(c0477d2, (AbstractC0533l2) obj2));
                    }
                });
            }
        }
    }
}
