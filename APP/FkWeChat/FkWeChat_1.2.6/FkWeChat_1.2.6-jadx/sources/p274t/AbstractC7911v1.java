package p274t;

import p010a9.InterfaceC0184l;
import p121i3.AbstractC3174d;
import p121i3.C3185o;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3552n0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p135j2.InterfaceC3563r;
import p135j2.InterfaceC3566s;
import p165l1.InterfaceC4507m;
import p166l2.InterfaceC4534e0;
import p172l8.C4700i0;

/* JADX INFO: renamed from: t.v1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7911v1 extends InterfaceC4507m.c implements InterfaceC4534e0 {
    /* JADX INFO: renamed from: G2 */
    public static C4700i0 m30544G2(AbstractC3545l1 abstractC3545l1, AbstractC3545l1.a aVar) {
        AbstractC3545l1.a.m13271Q(aVar, abstractC3545l1, C3185o.f8471b.m12058b(), 0.0f, 2, null);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: G */
    public int mo15345G(InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        return interfaceC3563r.mo13151z0(i10);
    }

    /* JADX INFO: renamed from: H2 */
    public abstract long mo30474H2(InterfaceC3561q0 interfaceC3561q0, InterfaceC3552n0 interfaceC3552n0, long j10);

    /* JADX INFO: renamed from: I2 */
    public abstract boolean mo30475I2();

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: d */
    public final InterfaceC3558p0 mo1288d(InterfaceC3561q0 interfaceC3561q0, InterfaceC3552n0 interfaceC3552n0, long j10) {
        long jMo30474H2 = mo30474H2(interfaceC3561q0, interfaceC3552n0, j10);
        if (mo30475I2()) {
            jMo30474H2 = AbstractC3174d.m11988e(j10, jMo30474H2);
        }
        final AbstractC3545l1 abstractC3545l1Mo13148X = interfaceC3552n0.mo13148X(jMo30474H2);
        return InterfaceC3561q0.m13345n0(interfaceC3561q0, abstractC3545l1Mo13148X.m13264M0(), abstractC3545l1Mo13148X.m13259G0(), null, new InterfaceC0184l() { // from class: t.u1
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC7911v1.m30544G2(abstractC3545l1Mo13148X, (AbstractC3545l1.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: renamed from: g */
    public int mo15346g(InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        return interfaceC3563r.mo13150t(i10);
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: t */
    public int mo15347t(InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        return interfaceC3563r.mo13146S(i10);
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: v */
    public int mo15348v(InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        return interfaceC3563r.mo13147W(i10);
    }
}
