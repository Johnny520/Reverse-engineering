package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p036c9.C0455k0;
import p051db.C0768f;
import p063e9.C0832c;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p251r.C3623h;
import p266s0.C3874d;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.n1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5128n1 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f19090g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f19091h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f19092i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f19093j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f19094k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f19095l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f19096m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f19097n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f19098o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5128n1(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18) {
        this.f19090g = 9;
        this.f19091h = interfaceC1809a1;
        this.f19092i = interfaceC1809a12;
        this.f19095l = interfaceC1809a13;
        this.f19096m = interfaceC1809a14;
        this.f19097n = interfaceC1809a15;
        this.f19098o = interfaceC1809a16;
        this.f19093j = interfaceC1809a17;
        this.f19094k = interfaceC1809a18;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f19090g) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f19093j;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f19091h;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f19092i;
                List list = (List) this.f19094k;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f19095l;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f19096m;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f19097n;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f19098o;
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                C3623h.m7604a(c3623h, null, new C3874d(-1972933907, new C5326t1(0, interfaceC1809a1, interfaceC1809a12), true), 3);
                if (((EnumC5325t0) interfaceC1809a1.getValue()) == EnumC5325t0.f20734l) {
                    C3623h.m7604a(c3623h, null, new C3874d(1632890504, new C5359u1(list, interfaceC1809a13, interfaceC1809a12, 0), true), 3);
                }
                C3623h.m7604a(c3623h, null, new C3874d(-269995676, new C5293s1(interfaceC1809a12, 2), true), 3);
                C3623h.m7604a(c3623h, null, new C3874d(307200037, new C0768f(arrayList, 3, interfaceC1809a1), true), 3);
                if (((Boolean) interfaceC1809a14.getValue()).booleanValue()) {
                    C3623h.m7604a(c3623h, null, AbstractC5193p0.f19803k3, 3);
                } else if (!AbstractC3149m.m6721t0((String) interfaceC1809a15.getValue())) {
                    C3623h.m7604a(c3623h, null, new C3874d(405606670, new C5293s1(interfaceC1809a15, 3), true), 3);
                } else if (arrayList.isEmpty()) {
                    C3623h.m7604a(c3623h, null, AbstractC5193p0.f19819m3, 3);
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C3623h.m7604a(c3623h, null, new C3874d(-380540788, new C5392v1((C5292s0) it.next(), interfaceC1809a16, 0), true), 3);
                    }
                }
                return C3967n.f12976a;
            case 1:
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f19091h;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f19092i;
                ArrayList arrayList2 = (ArrayList) this.f19093j;
                List list2 = (List) this.f19094k;
                List list3 = (List) this.f19097n;
                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f19098o;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f19095l;
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) this.f19096m;
                C3623h c3623h2 = (C3623h) obj;
                c3623h2.getClass();
                C3623h.m7604a(c3623h2, null, new C3874d(1114108762, new C5293s1(interfaceC1809a17, 22), true), 3);
                C3623h.m7604a(c3623h2, null, new C3874d(2055040579, new C5293s1(interfaceC1809a18, 23), true), 3);
                C3623h.m7604a(c3623h2, null, new C3874d(-442476254, new C0768f(arrayList2, 12, list2), true), 3);
                C3623h.m7604a(c3623h2, null, new C3874d(1354974209, new C4911gd(arrayList2, list2, list3, interfaceC1235p, interfaceC1809a19, interfaceC1809a110), true), 3);
                break;
            case 2:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f19093j;
                Context context = (Context) this.f19091h;
                C0832c c0832c = (C0832c) this.f19092i;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f19095l;
                C0832c c0832c2 = (C0832c) this.f19096m;
                C0832c c0832c3 = (C0832c) this.f19097n;
                List list4 = (List) this.f19094k;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f19098o;
                C3623h c3623h3 = (C3623h) obj;
                c3623h3.getClass();
                C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19887v1, 3);
                C3623h.m7604a(c3623h3, null, new C3874d(582998002, new C4905g7(sharedPreferences, context, c0832c, interfaceC1231l, c0832c2, c0832c3, list4, interfaceC1220a), true), 3);
                break;
            case 3:
                C4806d6 c4806d6 = (C4806d6) this.f19093j;
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) this.f19091h;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) this.f19092i;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) this.f19095l;
                InterfaceC1809a1 interfaceC1809a114 = (InterfaceC1809a1) this.f19096m;
                InterfaceC1809a1 interfaceC1809a115 = (InterfaceC1809a1) this.f19097n;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f19098o;
                Context context2 = (Context) this.f19094k;
                C3623h c3623h4 = (C3623h) obj;
                c3623h4.getClass();
                C3623h.m7604a(c3623h4, null, AbstractC5193p0.f19708Y2, 3);
                C3623h.m7604a(c3623h4, null, new C3874d(1676326740, new C5326t1(11, interfaceC1809a111, interfaceC1809a112), true), 3);
                C3623h.m7604a(c3623h4, null, AbstractC5193p0.f19715Z2, 3);
                C3623h.m7604a(c3623h4, null, new C3874d(-1525855274, new C5200p7(interfaceC1809a113, interfaceC1809a114, interfaceC1809a115, 3), true), 3);
                if (c4806d6.f16512c) {
                    C3623h.m7604a(c3623h4, null, AbstractC5193p0.f19723a3, 3);
                    C3623h.m7604a(c3623h4, null, new C3874d(-1712580433, new C4812dc(interfaceC1220a2, context2, 1), true), 3);
                }
                return C3967n.f12976a;
            case 4:
                String str = (String) this.f19093j;
                InterfaceC1809a1 interfaceC1809a116 = (InterfaceC1809a1) this.f19091h;
                List list5 = (List) this.f19094k;
                InterfaceC1809a1 interfaceC1809a117 = (InterfaceC1809a1) this.f19092i;
                InterfaceC1809a1 interfaceC1809a118 = (InterfaceC1809a1) this.f19095l;
                InterfaceC1809a1 interfaceC1809a119 = (InterfaceC1809a1) this.f19096m;
                InterfaceC1809a1 interfaceC1809a120 = (InterfaceC1809a1) this.f19097n;
                InterfaceC1809a1 interfaceC1809a121 = (InterfaceC1809a1) this.f19098o;
                C3623h c3623h5 = (C3623h) obj;
                c3623h5.getClass();
                C3623h.m7604a(c3623h5, null, AbstractC5193p0.f19687V2, 3);
                C3623h.m7604a(c3623h5, null, new C3874d(-511460306, new C0768f(str, 5, interfaceC1809a116), true), 3);
                C3623h.m7604a(c3623h5, null, AbstractC5193p0.f19694W2, 3);
                C3623h.m7604a(c3623h5, null, new C3874d(1653572528, new C4779cc(list5, interfaceC1809a117, interfaceC1809a118, interfaceC1809a119, interfaceC1809a120, interfaceC1809a121, 2), true), 3);
                C3623h.m7604a(c3623h5, null, AbstractC5193p0.f19701X2, 3);
                C3623h.m7604a(c3623h5, null, new C3874d(-476361934, new C4779cc(interfaceC1809a118, interfaceC1809a119, interfaceC1809a120, interfaceC1809a121, interfaceC1809a117, list5, 3), true), 3);
                break;
            case 5:
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.f19093j;
                List list6 = (List) this.f19094k;
                InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) this.f19095l;
                InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) this.f19096m;
                InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) this.f19097n;
                InterfaceC1220a interfaceC1220a6 = (InterfaceC1220a) this.f19098o;
                InterfaceC1809a1 interfaceC1809a122 = (InterfaceC1809a1) this.f19091h;
                InterfaceC1809a1 interfaceC1809a123 = (InterfaceC1809a1) this.f19092i;
                C3623h c3623h6 = (C3623h) obj;
                c3623h6.getClass();
                C3623h.m7604a(c3623h6, null, AbstractC5193p0.f19650Q0, 3);
                C3623h.m7604a(c3623h6, null, new C3874d(-836766339, new C4905g7(sharedPreferences2, list6, interfaceC1220a3, interfaceC1220a4, interfaceC1220a5, interfaceC1220a6, interfaceC1809a122, interfaceC1809a123), true), 3);
                break;
            case 6:
                SharedPreferences sharedPreferences3 = (SharedPreferences) this.f19093j;
                InterfaceC1809a1 interfaceC1809a124 = (InterfaceC1809a1) this.f19091h;
                InterfaceC1809a1 interfaceC1809a125 = (InterfaceC1809a1) this.f19092i;
                InterfaceC1809a1 interfaceC1809a126 = (InterfaceC1809a1) this.f19095l;
                InterfaceC1809a1 interfaceC1809a127 = (InterfaceC1809a1) this.f19096m;
                InterfaceC1809a1 interfaceC1809a128 = (InterfaceC1809a1) this.f19097n;
                InterfaceC1809a1 interfaceC1809a129 = (InterfaceC1809a1) this.f19098o;
                InterfaceC1809a1 interfaceC1809a130 = (InterfaceC1809a1) this.f19094k;
                C3623h c3623h7 = (C3623h) obj;
                c3623h7.getClass();
                C3623h.m7604a(c3623h7, null, AbstractC5193p0.f19705Y, 3);
                C3623h.m7604a(c3623h7, null, new C3874d(-1265721484, new C5299s7(sharedPreferences3, interfaceC1809a124, interfaceC1809a125, interfaceC1809a126, interfaceC1809a127, interfaceC1809a128, 0), true), 3);
                if (((Boolean) interfaceC1809a124.getValue()).booleanValue()) {
                    C3623h.m7604a(c3623h7, null, AbstractC5193p0.f19712Z, 3);
                    C3623h.m7604a(c3623h7, null, new C3874d(-2105396487, new C5332t7(sharedPreferences3, interfaceC1809a129, interfaceC1809a130, 0), true), 3);
                }
                return C3967n.f12976a;
            case 7:
                SharedPreferences sharedPreferences4 = (SharedPreferences) this.f19093j;
                InterfaceC1809a1 interfaceC1809a131 = (InterfaceC1809a1) this.f19091h;
                Context context3 = (Context) this.f19094k;
                InterfaceC1809a1 interfaceC1809a132 = (InterfaceC1809a1) this.f19092i;
                InterfaceC1809a1 interfaceC1809a133 = (InterfaceC1809a1) this.f19095l;
                InterfaceC1809a1 interfaceC1809a134 = (InterfaceC1809a1) this.f19096m;
                InterfaceC1809a1 interfaceC1809a135 = (InterfaceC1809a1) this.f19097n;
                InterfaceC1809a1 interfaceC1809a136 = (InterfaceC1809a1) this.f19098o;
                C3623h c3623h8 = (C3623h) obj;
                c3623h8.getClass();
                C3623h.m7604a(c3623h8, null, AbstractC5193p0.f19682U4, 3);
                C3623h.m7604a(c3623h8, null, new C3874d(652970106, new C5403vc(sharedPreferences4, interfaceC1809a131, 3), true), 3);
                C3623h.m7604a(c3623h8, null, AbstractC5193p0.f19689V4, 3);
                C3623h.m7604a(c3623h8, null, new C3874d(-1299579848, new C4833e1(context3, interfaceC1809a132, interfaceC1809a133, interfaceC1809a134, interfaceC1809a135, interfaceC1809a136), true), 3);
                break;
            case 8:
                ArrayList arrayList3 = (ArrayList) this.f19093j;
                SharedPreferences sharedPreferences5 = (SharedPreferences) this.f19097n;
                C5292s0 c5292s0 = (C5292s0) this.f19098o;
                Context context4 = (Context) this.f19094k;
                InterfaceC1809a1 interfaceC1809a137 = (InterfaceC1809a1) this.f19091h;
                InterfaceC1809a1 interfaceC1809a138 = (InterfaceC1809a1) this.f19092i;
                InterfaceC1809a1 interfaceC1809a139 = (InterfaceC1809a1) this.f19095l;
                InterfaceC1809a1 interfaceC1809a140 = (InterfaceC1809a1) this.f19096m;
                C3623h c3623h9 = (C3623h) obj;
                c3623h9.getClass();
                C3623h.m7604a(c3623h9, null, AbstractC5193p0.f19610K2, 3);
                C3623h.m7604a(c3623h9, null, new C3874d(1133897907, new C4833e1(sharedPreferences5, c5292s0, context4, interfaceC1809a137, interfaceC1809a138, interfaceC1809a139), true), 3);
                if (((Boolean) interfaceC1809a137.getValue()).booleanValue()) {
                    C3623h.m7604a(c3623h9, null, AbstractC5193p0.f19617L2, 3);
                    C3623h.m7604a(c3623h9, null, new C3874d(388893368, new C5265r6(sharedPreferences5, 7), true), 3);
                    C3623h.m7604a(c3623h9, null, AbstractC5193p0.f19624M2, 3);
                    C3623h.m7604a(c3623h9, null, new C3874d(852230390, new C5265r6(sharedPreferences5, 8), true), 3);
                    if (!arrayList3.isEmpty()) {
                        C3623h.m7604a(c3623h9, null, AbstractC5193p0.f19631N2, 3);
                        C3623h.m7604a(c3623h9, null, new C3874d(-1795478915, new C0455k0(arrayList3, context4, interfaceC1809a139, interfaceC1809a140, 7), true), 3);
                    }
                }
                return C3967n.f12976a;
            default:
                InterfaceC1809a1 interfaceC1809a141 = (InterfaceC1809a1) this.f19091h;
                InterfaceC1809a1 interfaceC1809a142 = (InterfaceC1809a1) this.f19092i;
                InterfaceC1809a1 interfaceC1809a143 = (InterfaceC1809a1) this.f19095l;
                InterfaceC1809a1 interfaceC1809a144 = (InterfaceC1809a1) this.f19096m;
                InterfaceC1809a1 interfaceC1809a145 = (InterfaceC1809a1) this.f19097n;
                InterfaceC1809a1 interfaceC1809a146 = (InterfaceC1809a1) this.f19098o;
                InterfaceC1809a1 interfaceC1809a147 = (InterfaceC1809a1) this.f19093j;
                InterfaceC1809a1 interfaceC1809a148 = (InterfaceC1809a1) this.f19094k;
                C3623h c3623h10 = (C3623h) obj;
                c3623h10.getClass();
                C3623h.m7604a(c3623h10, null, new C3874d(-594454637, new C5373uf(interfaceC1809a141, 5), true), 3);
                C3623h.m7604a(c3623h10, null, AbstractC5193p0.f19703X4, 3);
                C3623h.m7604a(c3623h10, null, new C3874d(-1558304421, new C5200p7(interfaceC1809a142, interfaceC1809a143, interfaceC1809a144, 12), true), 3);
                C3623h.m7604a(c3623h10, null, AbstractC5193p0.f19717Z4, 3);
                C3623h.m7604a(c3623h10, null, new C3874d(-1793577959, new C5200p7(interfaceC1809a143, interfaceC1809a145, interfaceC1809a146, 13), true), 3);
                if (!AbstractC3149m.m6721t0((String) interfaceC1809a147.getValue())) {
                    C3623h.m7604a(c3623h10, null, new C3874d(1058402136, new C5326t1(25, interfaceC1809a147, interfaceC1809a144), true), 3);
                } else if (((Boolean) interfaceC1809a143.getValue()).booleanValue() && ((List) interfaceC1809a145.getValue()).isEmpty()) {
                    C3623h.m7604a(c3623h10, null, AbstractC5193p0.f19733b5, 3);
                } else if (((List) interfaceC1809a145.getValue()).isEmpty()) {
                    C3623h.m7604a(c3623h10, null, new C3874d(-1957048240, new C5373uf(interfaceC1809a141, 6), true), 3);
                } else {
                    C3623h.m7604a(c3623h10, null, new C3874d(125760111, new C5326t1(26, interfaceC1809a145, interfaceC1809a148), true), 3);
                }
                return C3967n.f12976a;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5128n1(SharedPreferences sharedPreferences, Context context, C0832c c0832c, InterfaceC1231l interfaceC1231l, C0832c c0832c2, C0832c c0832c3, List list, InterfaceC1220a interfaceC1220a) {
        this.f19090g = 2;
        this.f19093j = sharedPreferences;
        this.f19091h = context;
        this.f19092i = c0832c;
        this.f19095l = interfaceC1231l;
        this.f19096m = c0832c2;
        this.f19097n = c0832c3;
        this.f19094k = list;
        this.f19098o = interfaceC1220a;
    }

    public /* synthetic */ C5128n1(SharedPreferences sharedPreferences, List list, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, InterfaceC1220a interfaceC1220a3, InterfaceC1220a interfaceC1220a4, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12) {
        this.f19090g = 5;
        this.f19093j = sharedPreferences;
        this.f19094k = list;
        this.f19095l = interfaceC1220a;
        this.f19096m = interfaceC1220a2;
        this.f19097n = interfaceC1220a3;
        this.f19098o = interfaceC1220a4;
        this.f19091h = interfaceC1809a1;
        this.f19092i = interfaceC1809a12;
    }

    public /* synthetic */ C5128n1(int i9, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, Object obj, Object obj2) {
        this.f19090g = i9;
        this.f19093j = obj;
        this.f19091h = interfaceC1809a1;
        this.f19094k = obj2;
        this.f19092i = interfaceC1809a12;
        this.f19095l = interfaceC1809a13;
        this.f19096m = interfaceC1809a14;
        this.f19097n = interfaceC1809a15;
        this.f19098o = interfaceC1809a16;
    }

    public /* synthetic */ C5128n1(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, ArrayList arrayList, List list, List list2, InterfaceC1235p interfaceC1235p, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14) {
        this.f19090g = 1;
        this.f19091h = interfaceC1809a1;
        this.f19092i = interfaceC1809a12;
        this.f19093j = arrayList;
        this.f19094k = list;
        this.f19097n = list2;
        this.f19098o = interfaceC1235p;
        this.f19095l = interfaceC1809a13;
        this.f19096m = interfaceC1809a14;
    }

    public /* synthetic */ C5128n1(Object obj, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, Object obj2, Object obj3, int i9) {
        this.f19090g = i9;
        this.f19093j = obj;
        this.f19091h = interfaceC1809a1;
        this.f19092i = interfaceC1809a12;
        this.f19095l = interfaceC1809a13;
        this.f19096m = interfaceC1809a14;
        this.f19097n = interfaceC1809a15;
        this.f19098o = obj2;
        this.f19094k = obj3;
    }

    public /* synthetic */ C5128n1(ArrayList arrayList, SharedPreferences sharedPreferences, C5292s0 c5292s0, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14) {
        this.f19090g = 8;
        this.f19093j = arrayList;
        this.f19097n = sharedPreferences;
        this.f19098o = c5292s0;
        this.f19094k = context;
        this.f19091h = interfaceC1809a1;
        this.f19092i = interfaceC1809a12;
        this.f19095l = interfaceC1809a13;
        this.f19096m = interfaceC1809a14;
    }

    public /* synthetic */ C5128n1(ArrayList arrayList, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, List list, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16) {
        this.f19090g = 0;
        this.f19093j = arrayList;
        this.f19091h = interfaceC1809a1;
        this.f19092i = interfaceC1809a12;
        this.f19094k = list;
        this.f19095l = interfaceC1809a13;
        this.f19096m = interfaceC1809a14;
        this.f19097n = interfaceC1809a15;
        this.f19098o = interfaceC1809a16;
    }
}
