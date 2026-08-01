package p015b0;

import java.util.List;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p121i3.C3173c;
import p121i3.C3185o;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3555o0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p172l8.C4700i0;
import p172l8.C4711r;

/* JADX INFO: renamed from: b0.s2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0852s2 implements InterfaceC3555o0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0173a f2699a;

    public C0852s2(InterfaceC0173a interfaceC0173a) {
        this.f2699a = interfaceC0173a;
    }

    /* JADX INFO: renamed from: a */
    public static C4700i0 m3200a(List list, C0852s2 c0852s2, AbstractC3545l1.a aVar) {
        List listM2942v = AbstractC0780i0.m2942v(list, c0852s2.f2699a);
        if (listM2942v != null) {
            int size = listM2942v.size();
            for (int i10 = 0; i10 < size; i10++) {
                C4711r c4711r = (C4711r) listM2942v.get(i10);
                AbstractC3545l1 abstractC3545l1 = (AbstractC3545l1) c4711r.m18792a();
                InterfaceC0173a interfaceC0173a = (InterfaceC0173a) c4711r.m18793b();
                AbstractC3545l1.a.m13269B(aVar, abstractC3545l1, interfaceC0173a != null ? ((C3185o) interfaceC0173a.invoke()).m12056p() : C3185o.f8471b.m12058b(), 0.0f, 2, null);
            }
        }
        return C4700i0.f13910a;
    }

    @Override // p135j2.InterfaceC3555o0
    /* JADX INFO: renamed from: c */
    public InterfaceC3558p0 mo2920c(InterfaceC3561q0 interfaceC3561q0, final List list, long j10) {
        return InterfaceC3561q0.m13345n0(interfaceC3561q0, C3173c.m11973l(j10), C3173c.m11972k(j10), null, new InterfaceC0184l() { // from class: b0.r2
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C0852s2.m3200a(list, this, (AbstractC3545l1.a) obj);
            }
        }, 4, null);
    }
}
