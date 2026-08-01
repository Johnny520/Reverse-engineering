package p015b0;

import java.util.ArrayList;
import java.util.List;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p121i3.AbstractC3174d;
import p121i3.C3173c;
import p121i3.C3185o;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3552n0;
import p135j2.InterfaceC3555o0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p172l8.C4700i0;
import p172l8.C4711r;
import p250r1.C6457g;

/* JADX INFO: renamed from: b0.o5 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0827o5 implements InterfaceC3555o0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0173a f2599a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0173a f2600b;

    public C0827o5(InterfaceC0173a interfaceC0173a, InterfaceC0173a interfaceC0173a2) {
        this.f2599a = interfaceC0173a;
        this.f2600b = interfaceC0173a2;
    }

    /* JADX INFO: renamed from: a */
    public static C4700i0 m3086a(List list, List list2, AbstractC3545l1.a aVar) {
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                C4711r c4711r = (C4711r) list.get(i10);
                AbstractC3545l1.a.m13269B(aVar, (AbstractC3545l1) c4711r.m18792a(), ((C3185o) c4711r.m18793b()).m12056p(), 0.0f, 2, null);
            }
        }
        if (list2 != null) {
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                C4711r c4711r2 = (C4711r) list2.get(i11);
                AbstractC3545l1 abstractC3545l1 = (AbstractC3545l1) c4711r2.m18792a();
                InterfaceC0173a interfaceC0173a = (InterfaceC0173a) c4711r2.m18793b();
                AbstractC3545l1.a.m13269B(aVar, abstractC3545l1, interfaceC0173a != null ? ((C3185o) interfaceC0173a.invoke()).m12056p() : C3185o.f8471b.m12058b(), 0.0f, 2, null);
            }
        }
        return C4700i0.f13910a;
    }

    @Override // p135j2.InterfaceC3555o0
    /* JADX INFO: renamed from: c */
    public InterfaceC3558p0 mo2920c(InterfaceC3561q0 interfaceC3561q0, List list, long j10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (!(((InterfaceC3552n0) obj).mo13149o() instanceof C0855s5)) {
                arrayList.add(obj);
            }
        }
        List list2 = (List) this.f2600b.invoke();
        final ArrayList arrayList2 = null;
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                C6457g c6457g = (C6457g) list2.get(i11);
                C4711r c4711r = c6457g != null ? new C4711r(((InterfaceC3552n0) arrayList.get(i11)).mo13148X(AbstractC3174d.m11985b(0, (int) Math.floor(c6457g.m25584m() - c6457g.m25583l()), 0, (int) Math.floor(c6457g.m25580i() - c6457g.m25586o()), 5, null)), C3185o.m12043c(C3185o.m12044d((((long) Math.round(c6457g.m25583l())) << 32) | (((long) Math.round(c6457g.m25586o())) & 4294967295L)))) : null;
                if (c4711r != null) {
                    arrayList3.add(c4711r);
                }
            }
            arrayList2 = arrayList3;
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        int size3 = list.size();
        for (int i12 = 0; i12 < size3; i12++) {
            Object obj2 = list.get(i12);
            if (((InterfaceC3552n0) obj2).mo13149o() instanceof C0855s5) {
                arrayList4.add(obj2);
            }
        }
        final List listM2942v = AbstractC0780i0.m2942v(arrayList4, this.f2599a);
        return InterfaceC3561q0.m13345n0(interfaceC3561q0, C3173c.m11973l(j10), C3173c.m11972k(j10), null, new InterfaceC0184l() { // from class: b0.n5
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj3) {
                return C0827o5.m3086a(arrayList2, listM2942v, (AbstractC3545l1.a) obj3);
            }
        }, 4, null);
    }
}
