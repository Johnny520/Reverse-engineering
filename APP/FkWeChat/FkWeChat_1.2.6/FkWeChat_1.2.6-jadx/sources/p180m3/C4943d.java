package p180m3;

import java.util.ArrayList;
import java.util.List;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1067w;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3552n0;
import p135j2.InterfaceC3555o0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p172l8.C4700i0;
import p185m8.AbstractC5114x;

/* JADX INFO: renamed from: m3.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4943d implements InterfaceC3555o0 {

    /* JADX INFO: renamed from: a */
    public static final C4943d f15016a = new C4943d();

    /* JADX INFO: renamed from: m3.d$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ AbstractC3545l1 f15018r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC3545l1 abstractC3545l1) {
            super(1);
            this.f15018r = abstractC3545l1;
        }

        /* JADX INFO: renamed from: a */
        public final void m19985a(AbstractC3545l1.a aVar) {
            AbstractC3545l1.a.m13270O(aVar, this.f15018r, 0, 0, 0.0f, 4, null);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m19985a((AbstractC3545l1.a) obj);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: m3.d$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ List f15019r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(1);
            this.f15019r = list;
        }

        /* JADX INFO: renamed from: a */
        public final void m19986a(AbstractC3545l1.a aVar) {
            int iM20802q = AbstractC5114x.m20802q(this.f15019r);
            if (iM20802q < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                AbstractC3545l1.a aVar2 = aVar;
                AbstractC3545l1.a.m13270O(aVar2, (AbstractC3545l1) this.f15019r.get(i10), 0, 0, 0.0f, 4, null);
                if (i10 == iM20802q) {
                    return;
                }
                i10++;
                aVar = aVar2;
            }
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m19986a((AbstractC3545l1.a) obj);
            return C4700i0.f13910a;
        }
    }

    @Override // p135j2.InterfaceC3555o0
    /* JADX INFO: renamed from: c */
    public final InterfaceC3558p0 mo2920c(InterfaceC3561q0 interfaceC3561q0, List list, long j10) {
        int size = list.size();
        if (size == 0) {
            return InterfaceC3561q0.m13345n0(interfaceC3561q0, 0, 0, null, a.f15017r, 4, null);
        }
        if (size == 1) {
            AbstractC3545l1 abstractC3545l1Mo13148X = ((InterfaceC3552n0) list.get(0)).mo13148X(j10);
            return InterfaceC3561q0.m13345n0(interfaceC3561q0, abstractC3545l1Mo13148X.m13264M0(), abstractC3545l1Mo13148X.m13259G0(), null, new b(abstractC3545l1Mo13148X), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size2; i10++) {
            AbstractC3545l1 abstractC3545l1Mo13148X2 = ((InterfaceC3552n0) list.get(i10)).mo13148X(j10);
            iMax = Math.max(iMax, abstractC3545l1Mo13148X2.m13264M0());
            iMax2 = Math.max(iMax2, abstractC3545l1Mo13148X2.m13259G0());
            arrayList.add(abstractC3545l1Mo13148X2);
        }
        return InterfaceC3561q0.m13345n0(interfaceC3561q0, iMax, iMax2, null, new c(arrayList), 4, null);
    }

    /* JADX INFO: renamed from: m3.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public static final a f15017r = new a();

        public a() {
            super(1);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m19984a((AbstractC3545l1.a) obj);
            return C4700i0.f13910a;
        }

        /* JADX INFO: renamed from: a */
        public final void m19984a(AbstractC3545l1.a aVar) {
        }
    }
}
