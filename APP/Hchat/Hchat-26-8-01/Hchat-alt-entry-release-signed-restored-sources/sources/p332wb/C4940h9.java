package p332wb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p036c9.C0443h0;
import p036c9.C0455k0;
import p070f0.C0976h;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p136j8.C2098i;
import p251r.C3623h;
import p266s0.C3874d;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.h9 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4940h9 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17548g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ArrayList f17549h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f17550i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f17551j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f17552k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f17553l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f17554m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f17555n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f17556o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f17557p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f17558q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4940h9(ArrayList arrayList, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, C4737b3 c4737b3, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18) {
        this.f17549h = arrayList;
        this.f17550i = interfaceC1809a1;
        this.f17551j = interfaceC1809a12;
        this.f17552k = interfaceC1809a13;
        this.f17553l = interfaceC1809a14;
        this.f17554m = interfaceC1809a15;
        this.f17555n = interfaceC1809a16;
        this.f17556o = c4737b3;
        this.f17557p = interfaceC1809a17;
        this.f17558q = interfaceC1809a18;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bb  */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        switch (this.f17548g) {
            case 0:
                List list = (List) this.f17555n;
                List list2 = (List) this.f17556o;
                ArrayList arrayList = (ArrayList) this.f17558q;
                List list3 = (List) this.f17557p;
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19674T3, 3);
                C3623h.m7604a(c3623h, null, new C3874d(-1954366116, new C0443h0(list, this.f17549h, this.f17550i, 16), true), 3);
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19681U3, 3);
                C3623h.m7604a(c3623h, null, new C3874d(-1405825894, new C5293s1(this.f17551j, 12), true), 3);
                C3623h.m7604a(c3623h, null, new C3874d(1015927865, new C5495y6(list2, arrayList, this.f17552k, this.f17553l, list3, list, this.f17554m), true), 3);
                break;
            case 1:
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f17555n;
                C4737b3 c4737b3 = (C4737b3) this.f17556o;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f17557p;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f17558q;
                C3623h c3623h2 = (C3623h) obj;
                c3623h2.getClass();
                InterfaceC1809a1 interfaceC1809a14 = this.f17550i;
                InterfaceC1809a1 interfaceC1809a15 = this.f17551j;
                Object obj2 = null;
                C3623h.m7604a(c3623h2, null, new C3874d(30426958, new C5326t1(18, interfaceC1809a14, interfaceC1809a15), true), 3);
                int i9 = 3;
                ArrayList arrayList2 = this.f17549h;
                InterfaceC1809a1 interfaceC1809a16 = this.f17552k;
                C3623h.m7604a(c3623h2, null, new C3874d(-975266171, new C0455k0(arrayList2, interfaceC1809a16, interfaceC1809a15, this.f17553l, 13), true), 3);
                if (((Boolean) this.f17554m.getValue()).booleanValue()) {
                    C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19704X5, 3);
                } else if (((String) interfaceC1809a1.getValue()).length() > 0) {
                    C3623h.m7604a(c3623h2, null, new C3874d(1205041839, new C5293s1(interfaceC1809a1, 28), true), 3);
                } else if (arrayList2.isEmpty() && !((Boolean) interfaceC1809a16.getValue()).booleanValue()) {
                    C3623h.m7604a(c3623h2, null, new C3874d(2106109774, new C5293s1(interfaceC1809a14, 29), true), 3);
                } else if (arrayList2.isEmpty()) {
                    C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19718Z5, 3);
                } else {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Object obj3 = obj2;
                        int i10 = i9;
                        C3623h.m7604a(c3623h2, obj3, new C3874d(1603030753, new C0455k0((C2098i) it.next(), c4737b3, interfaceC1809a12, interfaceC1809a13, 14), true), i10);
                        obj2 = obj3;
                        i9 = i10;
                    }
                }
                Object obj4 = obj2;
                int i11 = i9;
                if (((Boolean) interfaceC1809a16.getValue()).booleanValue() && !arrayList2.isEmpty()) {
                    C3623h.m7604a(c3623h2, obj4, AbstractC5193p0.f19734b6, i11);
                }
                break;
            default:
                C5292s0 c5292s0 = (C5292s0) this.f17555n;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f17556o;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f17557p;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f17558q;
                C3623h c3623h3 = (C3623h) obj;
                c3623h3.getClass();
                C3623h.m7604a(c3623h3, null, new C3874d(-610252449, new C5392v1(c5292s0, this.f17550i, 2), true), 3);
                C3623h.m7604a(c3623h3, null, new C3874d(1126238792, new C0976h(c5292s0, 9), true), 3);
                if (c5292s0 == null && ((Boolean) this.f17551j.getValue()).booleanValue()) {
                    C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19750d6, 3);
                } else if (c5292s0 == null) {
                    InterfaceC1809a1 interfaceC1809a110 = this.f17552k;
                    if (((String) interfaceC1809a110.getValue()).length() > 0) {
                        C3623h.m7604a(c3623h3, null, new C3874d(-1920564514, new C5373uf(interfaceC1809a110, 1), true), 3);
                    } else if (c5292s0 != null && ((Boolean) this.f17553l.getValue()).booleanValue()) {
                        C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19766f6, 3);
                    } else if (c5292s0 != null) {
                        InterfaceC1809a1 interfaceC1809a111 = this.f17554m;
                        if (((String) interfaceC1809a111.getValue()).length() > 0) {
                            C3623h.m7604a(c3623h3, null, new C3874d(1182744544, new C5373uf(interfaceC1809a111, 2), true), 3);
                        } else {
                            ArrayList arrayList3 = this.f17549h;
                            if (arrayList3.isEmpty()) {
                                C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19782h6, 3);
                            } else {
                                Iterator it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    C3623h.m7604a(c3623h3, null, new C3874d(-2110651360, new C5469xc(c5292s0, (C5292s0) it2.next(), interfaceC1809a17, interfaceC1809a18, interfaceC1809a19, 3), true), 3);
                                }
                            }
                        }
                    }
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4940h9(List list, ArrayList arrayList, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, List list2, ArrayList arrayList2, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, List list3, InterfaceC1809a1 interfaceC1809a15) {
        this.f17555n = list;
        this.f17549h = arrayList;
        this.f17550i = interfaceC1809a1;
        this.f17551j = interfaceC1809a12;
        this.f17556o = list2;
        this.f17558q = arrayList2;
        this.f17552k = interfaceC1809a13;
        this.f17553l = interfaceC1809a14;
        this.f17557p = list3;
        this.f17554m = interfaceC1809a15;
    }

    public /* synthetic */ C4940h9(C5292s0 c5292s0, ArrayList arrayList, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18) {
        this.f17555n = c5292s0;
        this.f17549h = arrayList;
        this.f17550i = interfaceC1809a1;
        this.f17551j = interfaceC1809a12;
        this.f17552k = interfaceC1809a13;
        this.f17553l = interfaceC1809a14;
        this.f17554m = interfaceC1809a15;
        this.f17556o = interfaceC1809a16;
        this.f17557p = interfaceC1809a17;
        this.f17558q = interfaceC1809a18;
    }
}
