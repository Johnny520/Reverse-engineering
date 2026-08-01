package p148k;

import java.util.ArrayList;
import java.util.List;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1067w;
import p121i3.C3189s;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3552n0;
import p135j2.InterfaceC3555o0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p135j2.InterfaceC3563r;
import p135j2.InterfaceC3566s;
import p172l8.C4700i0;
import p185m8.AbstractC5114x;

/* JADX INFO: renamed from: k.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3878h implements InterfaceC3555o0 {

    /* JADX INFO: renamed from: a */
    public final C3884k f11144a;

    /* JADX INFO: renamed from: b */
    public boolean f11145b;

    /* JADX INFO: renamed from: k.h$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ List f11146r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list) {
            super(1);
            this.f11146r = list;
        }

        /* JADX INFO: renamed from: a */
        public final void m15380a(AbstractC3545l1.a aVar) {
            List list = this.f11146r;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC3545l1.a.m13281x(aVar, (AbstractC3545l1) list.get(i10), 0, 0, 0.0f, 4, null);
            }
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m15380a((AbstractC3545l1.a) obj);
            return C4700i0.f13910a;
        }
    }

    public C3878h(C3884k c3884k) {
        this.f11144a = c3884k;
    }

    @Override // p135j2.InterfaceC3555o0
    /* JADX INFO: renamed from: b */
    public int mo3081b(InterfaceC3566s interfaceC3566s, List list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo13147W = ((InterfaceC3563r) list.get(0)).mo13147W(i10);
        int iM20802q = AbstractC5114x.m20802q(list);
        int i11 = 1;
        if (1 <= iM20802q) {
            while (true) {
                int iMo13147W2 = ((InterfaceC3563r) list.get(i11)).mo13147W(i10);
                if (iMo13147W2 > iMo13147W) {
                    iMo13147W = iMo13147W2;
                }
                if (i11 == iM20802q) {
                    break;
                }
                i11++;
            }
        }
        return iMo13147W;
    }

    @Override // p135j2.InterfaceC3555o0
    /* JADX INFO: renamed from: c */
    public InterfaceC3558p0 mo2920c(InterfaceC3561q0 interfaceC3561q0, List list, long j10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC3545l1 abstractC3545l1Mo13148X = ((InterfaceC3552n0) list.get(i10)).mo13148X(j10);
            iMax = Math.max(iMax, abstractC3545l1Mo13148X.m13264M0());
            iMax2 = Math.max(iMax2, abstractC3545l1Mo13148X.m13259G0());
            arrayList.add(abstractC3545l1Mo13148X);
        }
        if (interfaceC3561q0.mo1232g1()) {
            this.f11145b = true;
            this.f11144a.m15426a().setValue(C3189s.m12081b(C3189s.m12082c((4294967295L & ((long) iMax2)) | (((long) iMax) << 32))));
        } else if (!this.f11145b) {
            this.f11144a.m15426a().setValue(C3189s.m12081b(C3189s.m12082c((4294967295L & ((long) iMax2)) | (((long) iMax) << 32))));
        }
        return InterfaceC3561q0.m13345n0(interfaceC3561q0, iMax, iMax2, null, new a(arrayList), 4, null);
    }

    @Override // p135j2.InterfaceC3555o0
    /* JADX INFO: renamed from: d */
    public int mo13327d(InterfaceC3566s interfaceC3566s, List list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo13150t = ((InterfaceC3563r) list.get(0)).mo13150t(i10);
        int iM20802q = AbstractC5114x.m20802q(list);
        int i11 = 1;
        if (1 <= iM20802q) {
            while (true) {
                int iMo13150t2 = ((InterfaceC3563r) list.get(i11)).mo13150t(i10);
                if (iMo13150t2 > iMo13150t) {
                    iMo13150t = iMo13150t2;
                }
                if (i11 == iM20802q) {
                    break;
                }
                i11++;
            }
        }
        return iMo13150t;
    }

    @Override // p135j2.InterfaceC3555o0
    /* JADX INFO: renamed from: e */
    public int mo13328e(InterfaceC3566s interfaceC3566s, List list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo13146S = ((InterfaceC3563r) list.get(0)).mo13146S(i10);
        int iM20802q = AbstractC5114x.m20802q(list);
        int i11 = 1;
        if (1 <= iM20802q) {
            while (true) {
                int iMo13146S2 = ((InterfaceC3563r) list.get(i11)).mo13146S(i10);
                if (iMo13146S2 > iMo13146S) {
                    iMo13146S = iMo13146S2;
                }
                if (i11 == iM20802q) {
                    break;
                }
                i11++;
            }
        }
        return iMo13146S;
    }

    @Override // p135j2.InterfaceC3555o0
    /* JADX INFO: renamed from: h */
    public int mo13329h(InterfaceC3566s interfaceC3566s, List list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo13151z0 = ((InterfaceC3563r) list.get(0)).mo13151z0(i10);
        int iM20802q = AbstractC5114x.m20802q(list);
        int i11 = 1;
        if (1 <= iM20802q) {
            while (true) {
                int iMo13151z02 = ((InterfaceC3563r) list.get(i11)).mo13151z0(i10);
                if (iMo13151z02 > iMo13151z0) {
                    iMo13151z0 = iMo13151z02;
                }
                if (i11 == iM20802q) {
                    break;
                }
                i11++;
            }
        }
        return iMo13151z0;
    }
}
