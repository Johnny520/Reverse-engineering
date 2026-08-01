package p135j2;

import java.util.ArrayList;
import java.util.List;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1067w;
import p121i3.AbstractC3174d;
import p121i3.C3173c;
import p135j2.AbstractC3545l1;
import p166l2.C4554j0;
import p172l8.C4700i0;

/* JADX INFO: renamed from: j2.s1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3568s1 extends C4554j0.f {

    /* JADX INFO: renamed from: b */
    public static final C3568s1 f9922b = new C3568s1();

    /* JADX INFO: renamed from: j2.s1$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ AbstractC3545l1 f9924r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC3545l1 abstractC3545l1) {
            super(1);
            this.f9924r = abstractC3545l1;
        }

        /* JADX INFO: renamed from: a */
        public final void m13355a(AbstractC3545l1.a aVar) {
            AbstractC3545l1.a.m13272T(aVar, this.f9924r, 0, 0, 0.0f, null, 12, null);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m13355a((AbstractC3545l1.a) obj);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: j2.s1$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ List f9925r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(1);
            this.f9925r = list;
        }

        /* JADX INFO: renamed from: a */
        public final void m13356a(AbstractC3545l1.a aVar) {
            List list = this.f9925r;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC3545l1.a.m13272T(aVar, (AbstractC3545l1) list.get(i10), 0, 0, 0.0f, null, 12, null);
            }
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m13356a((AbstractC3545l1.a) obj);
            return C4700i0.f13910a;
        }
    }

    public C3568s1() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // p135j2.InterfaceC3555o0
    /* JADX INFO: renamed from: c */
    public InterfaceC3558p0 mo2920c(InterfaceC3561q0 interfaceC3561q0, List list, long j10) {
        int size = list.size();
        if (size == 0) {
            return InterfaceC3561q0.m13345n0(interfaceC3561q0, C3173c.m11975n(j10), C3173c.m11974m(j10), null, a.f9923r, 4, null);
        }
        if (size == 1) {
            AbstractC3545l1 abstractC3545l1Mo13148X = ((InterfaceC3552n0) list.get(0)).mo13148X(j10);
            return InterfaceC3561q0.m13345n0(interfaceC3561q0, AbstractC3174d.m11990g(j10, abstractC3545l1Mo13148X.m13264M0()), AbstractC3174d.m11989f(j10, abstractC3545l1Mo13148X.m13259G0()), null, new b(abstractC3545l1Mo13148X), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size2; i10++) {
            AbstractC3545l1 abstractC3545l1Mo13148X2 = ((InterfaceC3552n0) list.get(i10)).mo13148X(j10);
            iMax = Math.max(abstractC3545l1Mo13148X2.m13264M0(), iMax);
            iMax2 = Math.max(abstractC3545l1Mo13148X2.m13259G0(), iMax2);
            arrayList.add(abstractC3545l1Mo13148X2);
        }
        return InterfaceC3561q0.m13345n0(interfaceC3561q0, AbstractC3174d.m11990g(j10, iMax), AbstractC3174d.m11989f(j10, iMax2), null, new c(arrayList), 4, null);
    }

    /* JADX INFO: renamed from: j2.s1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public static final a f9923r = new a();

        public a() {
            super(1);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m13354a((AbstractC3545l1.a) obj);
            return C4700i0.f13910a;
        }

        /* JADX INFO: renamed from: a */
        public final void m13354a(AbstractC3545l1.a aVar) {
        }
    }
}
