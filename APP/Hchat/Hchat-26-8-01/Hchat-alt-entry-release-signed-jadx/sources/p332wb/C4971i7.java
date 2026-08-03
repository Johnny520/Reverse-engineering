package p332wb;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import p036c9.C0500x0;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1236q;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;
import th.InterfaceC4209a;

/* JADX INFO: renamed from: wb.i7 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4971i7 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17776g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ArrayList f17777h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Context f17778i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ LinkedHashSet f17779j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f17780k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1220a f17781l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1220a f17782m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ List f17783n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f17784o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f17785p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f17786q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4971i7(ArrayList arrayList, Context context, LinkedHashSet linkedHashSet, boolean z9, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, List list, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, int i9) {
        this.f17776g = i9;
        this.f17777h = arrayList;
        this.f17778i = context;
        this.f17779j = linkedHashSet;
        this.f17780k = z9;
        this.f17781l = interfaceC1220a;
        this.f17782m = interfaceC1220a2;
        this.f17783n = list;
        this.f17784o = interfaceC1809a1;
        this.f17785p = interfaceC1809a12;
        this.f17786q = interfaceC1809a13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        int i9 = this.f17776g;
        InterfaceC4209a interfaceC4209a = (InterfaceC4209a) obj;
        C1836h0 c1836h0 = (C1836h0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i9) {
            case 0:
                interfaceC4209a.getClass();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    InterfaceC1809a1 interfaceC1809a1 = this.f17784o;
                    boolean zBooleanValue = ((Boolean) interfaceC1809a1.getValue()).booleanValue();
                    InterfaceC1809a1 interfaceC1809a12 = this.f17786q;
                    C1823e c1823e = C1851l.f6155a;
                    InterfaceC1220a interfaceC1220a = null;
                    if (zBooleanValue) {
                        c1836h0.m4525a0(331238599);
                        ArrayList arrayList = this.f17777h;
                        String strM2250m = AbstractC0921a.m2250m(arrayList.size(), "删除所选（", "）");
                        boolean zM4538h = c1836h0.m4538h(arrayList);
                        Context context = this.f17778i;
                        boolean zM4538h2 = zM4538h | c1836h0.m4538h(context);
                        Object objM4514P = c1836h0.m4514P();
                        if (zM4538h2 || objM4514P == c1823e) {
                            objM4514P = new C5432w8(arrayList, context, this.f17785p, 7);
                            c1836h0.m4545k0(objM4514P);
                        }
                        InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) objM4514P;
                        Object objM4514P2 = c1836h0.m4514P();
                        if (objM4514P2 == c1823e) {
                            objM4514P2 = new C0500x0(18, interfaceC1809a1, interfaceC1809a12);
                            c1836h0.m4545k0(objM4514P2);
                        }
                        InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) objM4514P2;
                        LinkedHashSet linkedHashSet = this.f17779j;
                        boolean zIsEmpty = linkedHashSet.isEmpty();
                        boolean z9 = this.f17780k;
                        String str = zIsEmpty ? null : z9 ? "取消全选" : "全选";
                        if (linkedHashSet.isEmpty()) {
                            c1836h0.m4525a0(331998501);
                        } else {
                            c1836h0.m4525a0(332018900);
                            boolean zM4536g = c1836h0.m4536g(z9) | c1836h0.m4538h(linkedHashSet);
                            Object objM4514P3 = c1836h0.m4514P();
                            if (zM4536g || objM4514P3 == c1823e) {
                                objM4514P3 = new C5465x8(z9, linkedHashSet, interfaceC1809a12, 7);
                                c1836h0.m4545k0(objM4514P3);
                            }
                            interfaceC1220a = (InterfaceC1220a) objM4514P3;
                        }
                        c1836h0.m4553p(false);
                        AbstractC4955ho.m9382M(strM2250m, interfaceC1220a2, "取消", interfaceC1220a3, str, interfaceC1220a, c1836h0, 3456, 0);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(332403424);
                        List list = this.f17783n;
                        String str2 = list.isEmpty() ? null : "批量删除";
                        if (list.isEmpty()) {
                            c1836h0.m4525a0(332741509);
                        } else {
                            c1836h0.m4525a0(332757041);
                            Object objM4514P4 = c1836h0.m4514P();
                            if (objM4514P4 == c1823e) {
                                objM4514P4 = new C0500x0(19, interfaceC1809a1, interfaceC1809a12);
                                c1836h0.m4545k0(objM4514P4);
                            }
                            interfaceC1220a = (InterfaceC1220a) objM4514P4;
                        }
                        c1836h0.m4553p(false);
                        AbstractC4955ho.m9382M("选择监听群", this.f17781l, "返回", this.f17782m, str2, interfaceC1220a, c1836h0, 390, 0);
                        c1836h0.m4553p(false);
                    }
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 1:
                interfaceC4209a.getClass();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    InterfaceC1809a1 interfaceC1809a13 = this.f17784o;
                    boolean zBooleanValue2 = ((Boolean) interfaceC1809a13.getValue()).booleanValue();
                    InterfaceC1809a1 interfaceC1809a14 = this.f17786q;
                    C1823e c1823e2 = C1851l.f6155a;
                    InterfaceC1220a interfaceC1220a4 = null;
                    if (zBooleanValue2) {
                        c1836h0.m4525a0(-543209028);
                        ArrayList arrayList2 = this.f17777h;
                        String strM2250m2 = AbstractC0921a.m2250m(arrayList2.size(), "删除所选（", "）");
                        boolean zM4538h3 = c1836h0.m4538h(arrayList2);
                        Context context2 = this.f17778i;
                        boolean zM4538h4 = zM4538h3 | c1836h0.m4538h(context2);
                        Object objM4514P5 = c1836h0.m4514P();
                        if (zM4538h4 || objM4514P5 == c1823e2) {
                            objM4514P5 = new C5432w8(arrayList2, context2, this.f17785p, 6);
                            c1836h0.m4545k0(objM4514P5);
                        }
                        InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) objM4514P5;
                        Object objM4514P6 = c1836h0.m4514P();
                        if (objM4514P6 == c1823e2) {
                            objM4514P6 = new C0500x0(16, interfaceC1809a13, interfaceC1809a14);
                            c1836h0.m4545k0(objM4514P6);
                        }
                        InterfaceC1220a interfaceC1220a6 = (InterfaceC1220a) objM4514P6;
                        LinkedHashSet linkedHashSet2 = this.f17779j;
                        boolean zIsEmpty2 = linkedHashSet2.isEmpty();
                        boolean z10 = this.f17780k;
                        String str3 = zIsEmpty2 ? null : z10 ? "取消全选" : "全选";
                        if (linkedHashSet2.isEmpty()) {
                            c1836h0.m4525a0(-542444383);
                        } else {
                            c1836h0.m4525a0(-542423922);
                            boolean zM4536g2 = c1836h0.m4536g(z10) | c1836h0.m4538h(linkedHashSet2);
                            Object objM4514P7 = c1836h0.m4514P();
                            if (zM4536g2 || objM4514P7 == c1823e2) {
                                objM4514P7 = new C5465x8(z10, linkedHashSet2, interfaceC1809a14, 6);
                                c1836h0.m4545k0(objM4514P7);
                            }
                            interfaceC1220a4 = (InterfaceC1220a) objM4514P7;
                        }
                        c1836h0.m4553p(false);
                        AbstractC4955ho.m9382M(strM2250m2, interfaceC1220a5, "取消", interfaceC1220a6, str3, interfaceC1220a4, c1836h0, 3456, 0);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(-542038003);
                        List list2 = this.f17783n;
                        String str4 = list2.isEmpty() ? null : "批量删除";
                        if (list2.isEmpty()) {
                            c1836h0.m4525a0(-541714271);
                        } else {
                            c1836h0.m4525a0(-541698801);
                            Object objM4514P8 = c1836h0.m4514P();
                            if (objM4514P8 == c1823e2) {
                                objM4514P8 = new C0500x0(17, interfaceC1809a13, interfaceC1809a14);
                                c1836h0.m4545k0(objM4514P8);
                            }
                            interfaceC1220a4 = (InterfaceC1220a) objM4514P8;
                        }
                        c1836h0.m4553p(false);
                        AbstractC4955ho.m9382M("添加会话", this.f17781l, "返回", this.f17782m, str4, interfaceC1220a4, c1836h0, 390, 0);
                        c1836h0.m4553p(false);
                    }
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 2:
                interfaceC4209a.getClass();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    InterfaceC1809a1 interfaceC1809a15 = this.f17784o;
                    boolean zBooleanValue3 = ((Boolean) interfaceC1809a15.getValue()).booleanValue();
                    InterfaceC1809a1 interfaceC1809a16 = this.f17786q;
                    C1823e c1823e3 = C1851l.f6155a;
                    InterfaceC1220a interfaceC1220a7 = null;
                    if (zBooleanValue3) {
                        c1836h0.m4525a0(341850467);
                        ArrayList arrayList3 = this.f17777h;
                        String strM2250m3 = AbstractC0921a.m2250m(arrayList3.size(), "删除所选（", "）");
                        boolean zM4538h5 = c1836h0.m4538h(arrayList3);
                        Context context3 = this.f17778i;
                        boolean zM4538h6 = zM4538h5 | c1836h0.m4538h(context3);
                        Object objM4514P9 = c1836h0.m4514P();
                        if (zM4538h6 || objM4514P9 == c1823e3) {
                            objM4514P9 = new C5432w8(arrayList3, context3, this.f17785p, 2);
                            c1836h0.m4545k0(objM4514P9);
                        }
                        InterfaceC1220a interfaceC1220a8 = (InterfaceC1220a) objM4514P9;
                        Object objM4514P10 = c1836h0.m4514P();
                        if (objM4514P10 == c1823e3) {
                            objM4514P10 = new C0500x0(6, interfaceC1809a15, interfaceC1809a16);
                            c1836h0.m4545k0(objM4514P10);
                        }
                        InterfaceC1220a interfaceC1220a9 = (InterfaceC1220a) objM4514P10;
                        LinkedHashSet linkedHashSet3 = this.f17779j;
                        boolean zIsEmpty3 = linkedHashSet3.isEmpty();
                        boolean z11 = this.f17780k;
                        String str5 = zIsEmpty3 ? null : z11 ? "取消全选" : "全选";
                        if (linkedHashSet3.isEmpty()) {
                            c1836h0.m4525a0(342610369);
                        } else {
                            c1836h0.m4525a0(342630768);
                            boolean zM4536g3 = c1836h0.m4536g(z11) | c1836h0.m4538h(linkedHashSet3);
                            Object objM4514P11 = c1836h0.m4514P();
                            if (zM4536g3 || objM4514P11 == c1823e3) {
                                objM4514P11 = new C5465x8(z11, linkedHashSet3, interfaceC1809a16, 2);
                                c1836h0.m4545k0(objM4514P11);
                            }
                            interfaceC1220a7 = (InterfaceC1220a) objM4514P11;
                        }
                        c1836h0.m4553p(false);
                        AbstractC4955ho.m9382M(strM2250m3, interfaceC1220a8, "取消", interfaceC1220a9, str5, interfaceC1220a7, c1836h0, 3456, 0);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(343015292);
                        List list3 = this.f17783n;
                        String str6 = list3.isEmpty() ? null : "批量删除";
                        if (list3.isEmpty()) {
                            c1836h0.m4525a0(343353377);
                        } else {
                            c1836h0.m4525a0(343368909);
                            Object objM4514P12 = c1836h0.m4514P();
                            if (objM4514P12 == c1823e3) {
                                objM4514P12 = new C0500x0(7, interfaceC1809a15, interfaceC1809a16);
                                c1836h0.m4545k0(objM4514P12);
                            }
                            interfaceC1220a7 = (InterfaceC1220a) objM4514P12;
                        }
                        c1836h0.m4553p(false);
                        AbstractC4955ho.m9382M("选择监听群", this.f17781l, "返回", this.f17782m, str6, interfaceC1220a7, c1836h0, 390, 0);
                        c1836h0.m4553p(false);
                    }
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 3:
                interfaceC4209a.getClass();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    InterfaceC1809a1 interfaceC1809a17 = this.f17784o;
                    boolean zBooleanValue4 = ((Boolean) interfaceC1809a17.getValue()).booleanValue();
                    InterfaceC1809a1 interfaceC1809a18 = this.f17786q;
                    C1823e c1823e4 = C1851l.f6155a;
                    InterfaceC1220a interfaceC1220a10 = null;
                    if (zBooleanValue4) {
                        c1836h0.m4525a0(-894553827);
                        ArrayList arrayList4 = this.f17777h;
                        String strM2250m4 = AbstractC0921a.m2250m(arrayList4.size(), "删除所选（", "）");
                        boolean zM4538h7 = c1836h0.m4538h(arrayList4);
                        Context context4 = this.f17778i;
                        boolean zM4538h8 = zM4538h7 | c1836h0.m4538h(context4);
                        Object objM4514P13 = c1836h0.m4514P();
                        if (zM4538h8 || objM4514P13 == c1823e4) {
                            objM4514P13 = new C5432w8(arrayList4, context4, this.f17785p, 1);
                            c1836h0.m4545k0(objM4514P13);
                        }
                        InterfaceC1220a interfaceC1220a11 = (InterfaceC1220a) objM4514P13;
                        Object objM4514P14 = c1836h0.m4514P();
                        if (objM4514P14 == c1823e4) {
                            objM4514P14 = new C0500x0(4, interfaceC1809a17, interfaceC1809a18);
                            c1836h0.m4545k0(objM4514P14);
                        }
                        InterfaceC1220a interfaceC1220a12 = (InterfaceC1220a) objM4514P14;
                        LinkedHashSet linkedHashSet4 = this.f17779j;
                        boolean zIsEmpty4 = linkedHashSet4.isEmpty();
                        boolean z12 = this.f17780k;
                        String str7 = zIsEmpty4 ? null : z12 ? "取消全选" : "全选";
                        if (linkedHashSet4.isEmpty()) {
                            c1836h0.m4525a0(-893794328);
                        } else {
                            c1836h0.m4525a0(-893774487);
                            boolean zM4536g4 = c1836h0.m4536g(z12) | c1836h0.m4538h(linkedHashSet4);
                            Object objM4514P15 = c1836h0.m4514P();
                            if (zM4536g4 || objM4514P15 == c1823e4) {
                                objM4514P15 = new C5465x8(z12, linkedHashSet4, interfaceC1809a18, 1);
                                c1836h0.m4545k0(objM4514P15);
                            }
                            interfaceC1220a10 = (InterfaceC1220a) objM4514P15;
                        }
                        c1836h0.m4553p(false);
                        AbstractC4955ho.m9382M(strM2250m4, interfaceC1220a11, "取消", interfaceC1220a12, str7, interfaceC1220a10, c1836h0, 3456, 0);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(-893407881);
                        List list4 = this.f17783n;
                        String str8 = list4.isEmpty() ? null : "批量删除";
                        if (list4.isEmpty()) {
                            c1836h0.m4525a0(-893083064);
                        } else {
                            c1836h0.m4525a0(-893067718);
                            Object objM4514P16 = c1836h0.m4514P();
                            if (objM4514P16 == c1823e4) {
                                objM4514P16 = new C0500x0(5, interfaceC1809a17, interfaceC1809a18);
                                c1836h0.m4545k0(objM4514P16);
                            }
                            interfaceC1220a10 = (InterfaceC1220a) objM4514P16;
                        }
                        c1836h0.m4553p(false);
                        AbstractC4955ho.m9382M("添加聊天", this.f17781l, "返回", this.f17782m, str8, interfaceC1220a10, c1836h0, 390, 0);
                        c1836h0.m4553p(false);
                    }
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 4:
                interfaceC4209a.getClass();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    InterfaceC1809a1 interfaceC1809a19 = this.f17784o;
                    boolean zBooleanValue5 = ((Boolean) interfaceC1809a19.getValue()).booleanValue();
                    InterfaceC1809a1 interfaceC1809a110 = this.f17786q;
                    C1823e c1823e5 = C1851l.f6155a;
                    InterfaceC1220a interfaceC1220a13 = null;
                    if (zBooleanValue5) {
                        c1836h0.m4525a0(482429745);
                        ArrayList arrayList5 = this.f17777h;
                        String strM2250m5 = AbstractC0921a.m2250m(arrayList5.size(), "删除所选（", "）");
                        boolean zM4538h9 = c1836h0.m4538h(arrayList5);
                        Context context5 = this.f17778i;
                        boolean zM4538h10 = zM4538h9 | c1836h0.m4538h(context5);
                        Object objM4514P17 = c1836h0.m4514P();
                        if (zM4538h10 || objM4514P17 == c1823e5) {
                            objM4514P17 = new C5432w8(arrayList5, context5, this.f17785p, 5);
                            c1836h0.m4545k0(objM4514P17);
                        }
                        InterfaceC1220a interfaceC1220a14 = (InterfaceC1220a) objM4514P17;
                        Object objM4514P18 = c1836h0.m4514P();
                        if (objM4514P18 == c1823e5) {
                            objM4514P18 = new C0500x0(14, interfaceC1809a19, interfaceC1809a110);
                            c1836h0.m4545k0(objM4514P18);
                        }
                        InterfaceC1220a interfaceC1220a15 = (InterfaceC1220a) objM4514P18;
                        LinkedHashSet linkedHashSet5 = this.f17779j;
                        boolean zIsEmpty5 = linkedHashSet5.isEmpty();
                        boolean z13 = this.f17780k;
                        String str9 = zIsEmpty5 ? null : z13 ? "取消全选" : "全选";
                        if (linkedHashSet5.isEmpty()) {
                            c1836h0.m4525a0(483189244);
                        } else {
                            c1836h0.m4525a0(483209085);
                            boolean zM4536g5 = c1836h0.m4536g(z13) | c1836h0.m4538h(linkedHashSet5);
                            Object objM4514P19 = c1836h0.m4514P();
                            if (zM4536g5 || objM4514P19 == c1823e5) {
                                objM4514P19 = new C5465x8(z13, linkedHashSet5, interfaceC1809a110, 5);
                                c1836h0.m4545k0(objM4514P19);
                            }
                            interfaceC1220a13 = (InterfaceC1220a) objM4514P19;
                        }
                        c1836h0.m4553p(false);
                        AbstractC4955ho.m9382M(strM2250m5, interfaceC1220a14, "取消", interfaceC1220a15, str9, interfaceC1220a13, c1836h0, 3456, 0);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(483575908);
                        List list5 = this.f17783n;
                        String str10 = list5.isEmpty() ? null : "批量删除";
                        if (list5.isEmpty()) {
                            c1836h0.m4525a0(483907452);
                        } else {
                            c1836h0.m4525a0(483922798);
                            Object objM4514P20 = c1836h0.m4514P();
                            if (objM4514P20 == c1823e5) {
                                objM4514P20 = new C0500x0(15, interfaceC1809a19, interfaceC1809a110);
                                c1836h0.m4545k0(objM4514P20);
                            }
                            interfaceC1220a13 = (InterfaceC1220a) objM4514P20;
                        }
                        c1836h0.m4553p(false);
                        AbstractC4955ho.m9382M("添加聊天", this.f17781l, "返回", this.f17782m, str10, interfaceC1220a13, c1836h0, 390, 0);
                        c1836h0.m4553p(false);
                    }
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 5:
                interfaceC4209a.getClass();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    InterfaceC1809a1 interfaceC1809a111 = this.f17784o;
                    boolean zBooleanValue6 = ((Boolean) interfaceC1809a111.getValue()).booleanValue();
                    InterfaceC1809a1 interfaceC1809a112 = this.f17786q;
                    C1823e c1823e6 = C1851l.f6155a;
                    InterfaceC1220a interfaceC1220a16 = null;
                    if (zBooleanValue6) {
                        c1836h0.m4525a0(1938614939);
                        ArrayList arrayList6 = this.f17777h;
                        String strM2250m6 = AbstractC0921a.m2250m(arrayList6.size(), "删除所选（", "）");
                        boolean zM4538h11 = c1836h0.m4538h(arrayList6);
                        Context context6 = this.f17778i;
                        boolean zM4538h12 = zM4538h11 | c1836h0.m4538h(context6);
                        Object objM4514P21 = c1836h0.m4514P();
                        if (zM4538h12 || objM4514P21 == c1823e6) {
                            objM4514P21 = new C5432w8(arrayList6, context6, this.f17785p, 3);
                            c1836h0.m4545k0(objM4514P21);
                        }
                        InterfaceC1220a interfaceC1220a17 = (InterfaceC1220a) objM4514P21;
                        Object objM4514P22 = c1836h0.m4514P();
                        if (objM4514P22 == c1823e6) {
                            objM4514P22 = new C0500x0(8, interfaceC1809a111, interfaceC1809a112);
                            c1836h0.m4545k0(objM4514P22);
                        }
                        InterfaceC1220a interfaceC1220a18 = (InterfaceC1220a) objM4514P22;
                        LinkedHashSet linkedHashSet6 = this.f17779j;
                        boolean zIsEmpty6 = linkedHashSet6.isEmpty();
                        boolean z14 = this.f17780k;
                        String str11 = zIsEmpty6 ? null : z14 ? "取消全选" : "全选";
                        if (linkedHashSet6.isEmpty()) {
                            c1836h0.m4525a0(1939366750);
                        } else {
                            c1836h0.m4525a0(1939386591);
                            boolean zM4536g6 = c1836h0.m4536g(z14) | c1836h0.m4538h(linkedHashSet6);
                            Object objM4514P23 = c1836h0.m4514P();
                            if (zM4536g6 || objM4514P23 == c1823e6) {
                                objM4514P23 = new C5465x8(z14, linkedHashSet6, interfaceC1809a112, 3);
                                c1836h0.m4545k0(objM4514P23);
                            }
                            interfaceC1220a16 = (InterfaceC1220a) objM4514P23;
                        }
                        c1836h0.m4553p(false);
                        AbstractC4955ho.m9382M(strM2250m6, interfaceC1220a17, "取消", interfaceC1220a18, str11, interfaceC1220a16, c1836h0, 3456, 0);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(1939753011);
                        List list6 = this.f17783n;
                        String str12 = list6.isEmpty() ? null : "批量删除";
                        if (list6.isEmpty()) {
                            c1836h0.m4525a0(1940072062);
                        } else {
                            c1836h0.m4525a0(1940087408);
                            Object objM4514P24 = c1836h0.m4514P();
                            if (objM4514P24 == c1823e6) {
                                objM4514P24 = new C0500x0(9, interfaceC1809a111, interfaceC1809a112);
                                c1836h0.m4545k0(objM4514P24);
                            }
                            interfaceC1220a16 = (InterfaceC1220a) objM4514P24;
                        }
                        c1836h0.m4553p(false);
                        AbstractC4955ho.m9382M("新增规则", this.f17781l, "返回", this.f17782m, str12, interfaceC1220a16, c1836h0, 390, 0);
                        c1836h0.m4553p(false);
                    }
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                interfaceC4209a.getClass();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    InterfaceC1809a1 interfaceC1809a113 = this.f17784o;
                    boolean zBooleanValue7 = ((Boolean) interfaceC1809a113.getValue()).booleanValue();
                    InterfaceC1809a1 interfaceC1809a114 = this.f17786q;
                    C1823e c1823e7 = C1851l.f6155a;
                    InterfaceC1220a interfaceC1220a19 = null;
                    if (zBooleanValue7) {
                        c1836h0.m4525a0(1771844855);
                        ArrayList arrayList7 = this.f17777h;
                        String strM2250m7 = AbstractC0921a.m2250m(arrayList7.size(), "删除所选（", "）");
                        boolean zM4538h13 = c1836h0.m4538h(arrayList7);
                        Context context7 = this.f17778i;
                        boolean zM4538h14 = zM4538h13 | c1836h0.m4538h(context7);
                        Object objM4514P25 = c1836h0.m4514P();
                        if (zM4538h14 || objM4514P25 == c1823e7) {
                            objM4514P25 = new C5432w8(arrayList7, context7, this.f17785p, 0);
                            c1836h0.m4545k0(objM4514P25);
                        }
                        InterfaceC1220a interfaceC1220a20 = (InterfaceC1220a) objM4514P25;
                        Object objM4514P26 = c1836h0.m4514P();
                        if (objM4514P26 == c1823e7) {
                            objM4514P26 = new C0500x0(2, interfaceC1809a113, interfaceC1809a114);
                            c1836h0.m4545k0(objM4514P26);
                        }
                        InterfaceC1220a interfaceC1220a21 = (InterfaceC1220a) objM4514P26;
                        LinkedHashSet linkedHashSet7 = this.f17779j;
                        boolean zIsEmpty7 = linkedHashSet7.isEmpty();
                        boolean z15 = this.f17780k;
                        String str13 = zIsEmpty7 ? null : z15 ? "取消全选" : "全选";
                        if (linkedHashSet7.isEmpty()) {
                            c1836h0.m4525a0(1772506456);
                        } else {
                            c1836h0.m4525a0(1772522329);
                            boolean zM4536g7 = c1836h0.m4536g(z15) | c1836h0.m4538h(linkedHashSet7);
                            Object objM4514P27 = c1836h0.m4514P();
                            if (zM4536g7 || objM4514P27 == c1823e7) {
                                objM4514P27 = new C5465x8(z15, linkedHashSet7, interfaceC1809a114, 0);
                                c1836h0.m4545k0(objM4514P27);
                            }
                            interfaceC1220a19 = (InterfaceC1220a) objM4514P27;
                        }
                        c1836h0.m4553p(false);
                        AbstractC4955ho.m9382M(strM2250m7, interfaceC1220a20, "取消", interfaceC1220a21, str13, interfaceC1220a19, c1836h0, 3456, 0);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(1772765741);
                        List list7 = this.f17783n;
                        String str14 = list7.isEmpty() ? null : "批量删除";
                        if (list7.isEmpty()) {
                            c1836h0.m4525a0(1773084792);
                        } else {
                            c1836h0.m4525a0(1773100138);
                            Object objM4514P28 = c1836h0.m4514P();
                            if (objM4514P28 == c1823e7) {
                                objM4514P28 = new C0500x0(3, interfaceC1809a113, interfaceC1809a114);
                                c1836h0.m4545k0(objM4514P28);
                            }
                            interfaceC1220a19 = (InterfaceC1220a) objM4514P28;
                        }
                        c1836h0.m4553p(false);
                        AbstractC4955ho.m9382M("新增规则", this.f17781l, "返回", this.f17782m, str14, interfaceC1220a19, c1836h0, 390, 0);
                        c1836h0.m4553p(false);
                    }
                } else {
                    c1836h0.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }
}
