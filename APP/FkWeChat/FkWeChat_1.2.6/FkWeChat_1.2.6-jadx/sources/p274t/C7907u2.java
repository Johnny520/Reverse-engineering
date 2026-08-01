package p274t;

import p010a9.InterfaceC0184l;
import p121i3.AbstractC3174d;
import p121i3.C3179i;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3552n0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p165l1.InterfaceC4507m;
import p166l2.InterfaceC4534e0;
import p172l8.C4700i0;
import p288u.AbstractC8476a;

/* JADX INFO: renamed from: t.u2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7907u2 extends InterfaceC4507m.c implements InterfaceC4534e0 {

    /* JADX INFO: renamed from: F */
    public InterfaceC7887q2 f26353F;

    public C7907u2(InterfaceC7887q2 interfaceC7887q2) {
        this.f26353F = interfaceC7887q2;
    }

    /* JADX INFO: renamed from: G2 */
    public static C4700i0 m30539G2(AbstractC3545l1 abstractC3545l1, int i10, int i11, AbstractC3545l1.a aVar) {
        AbstractC3545l1.a.m13281x(aVar, abstractC3545l1, i10, i11, 0.0f, 4, null);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: H2 */
    public final void m30540H2(InterfaceC7887q2 interfaceC7887q2) {
        this.f26353F = interfaceC7887q2;
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: d */
    public InterfaceC3558p0 mo1288d(InterfaceC3561q0 interfaceC3561q0, InterfaceC3552n0 interfaceC3552n0, long j10) {
        float fMo27240b = this.f26353F.mo27240b(interfaceC3561q0.getLayoutDirection());
        float fMo27241c = this.f26353F.mo27241c();
        float fMo27242d = this.f26353F.mo27242d(interfaceC3561q0.getLayoutDirection());
        float fMo27239a = this.f26353F.mo27239a();
        float f10 = 0;
        if (!((C3179i.m12002j(fMo27239a, C3179i.m12003k(f10)) >= 0) & (C3179i.m12002j(fMo27240b, C3179i.m12003k(f10)) >= 0) & (C3179i.m12002j(fMo27241c, C3179i.m12003k(f10)) >= 0) & (C3179i.m12002j(fMo27242d, C3179i.m12003k(f10)) >= 0))) {
            AbstractC8476a.m32537a("Padding must be non-negative");
        }
        final int iMo1236x1 = interfaceC3561q0.mo1236x1(fMo27240b);
        int iMo1236x12 = interfaceC3561q0.mo1236x1(fMo27242d) + iMo1236x1;
        final int iMo1236x13 = interfaceC3561q0.mo1236x1(fMo27241c);
        int iMo1236x14 = interfaceC3561q0.mo1236x1(fMo27239a) + iMo1236x13;
        final AbstractC3545l1 abstractC3545l1Mo13148X = interfaceC3552n0.mo13148X(AbstractC3174d.m11992i(j10, -iMo1236x12, -iMo1236x14));
        return InterfaceC3561q0.m13345n0(interfaceC3561q0, AbstractC3174d.m11990g(j10, abstractC3545l1Mo13148X.m13264M0() + iMo1236x12), AbstractC3174d.m11989f(j10, abstractC3545l1Mo13148X.m13259G0() + iMo1236x14), null, new InterfaceC0184l() { // from class: t.t2
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C7907u2.m30539G2(abstractC3545l1Mo13148X, iMo1236x1, iMo1236x13, (AbstractC3545l1.a) obj);
            }
        }, 4, null);
    }
}
