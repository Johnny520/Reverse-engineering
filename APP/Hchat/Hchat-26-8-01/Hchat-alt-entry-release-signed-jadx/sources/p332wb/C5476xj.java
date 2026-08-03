package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import okio.C3193a;
import p036c9.C0443h0;
import p036c9.C0455k0;
import p070f0.C0976h;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1236q;
import p117i0.C1836h0;
import p117i0.InterfaceC1809a1;
import p251r.C3619d;
import p251r.C3623h;
import p266s0.C3874d;
import p276sf.C3967n;
import p276sf.InterfaceC3955b;
import p317vb.InterfaceC4544a;
import tf.C4173t;

/* JADX INFO: renamed from: wb.xj */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5476xj implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21945g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f21946h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f21947i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ SharedPreferences f21948j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f21949k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f21950l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f21951m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f21952n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f21953o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f21954p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f21955q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f21956r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f21957s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f21958t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f21959u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f21960v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f21961w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f21962x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f21963y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5476xj(EnumC5329t4 enumC5329t4, List list, InterfaceC1231l interfaceC1231l, ArrayList arrayList, ArrayList arrayList2, List list2, ArrayList arrayList3, InterfaceC1220a interfaceC1220a, InterfaceC1231l interfaceC1231l2, Context context, InterfaceC1231l interfaceC1231l3, InterfaceC1220a interfaceC1220a2, InterfaceC1220a interfaceC1220a3, InterfaceC1809a1 interfaceC1809a1, SharedPreferences sharedPreferences, boolean z9, InterfaceC1809a1 interfaceC1809a12, InterfaceC1220a interfaceC1220a4) {
        this.f21951m = enumC5329t4;
        this.f21952n = list;
        this.f21953o = interfaceC1231l;
        this.f21954p = arrayList;
        this.f21955q = arrayList2;
        this.f21956r = list2;
        this.f21957s = arrayList3;
        this.f21958t = interfaceC1220a;
        this.f21959u = interfaceC1231l2;
        this.f21946h = context;
        this.f21960v = interfaceC1231l3;
        this.f21961w = interfaceC1220a2;
        this.f21962x = interfaceC1220a3;
        this.f21947i = interfaceC1809a1;
        this.f21948j = sharedPreferences;
        this.f21949k = z9;
        this.f21950l = interfaceC1809a12;
        this.f21963y = interfaceC1220a4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        InterfaceC1809a1 interfaceC1809a1;
        Context context;
        int i9;
        C3623h c3623h;
        InterfaceC1809a1 interfaceC1809a12;
        boolean z9;
        switch (this.f21945g) {
            case 0:
                InterfaceC4544a interfaceC4544a = (InterfaceC4544a) this.f21951m;
                String str = (String) this.f21958t;
                String str2 = (String) this.f21959u;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f21952n;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f21953o;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f21954p;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f21955q;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f21956r;
                String str3 = (String) this.f21960v;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f21957s;
                String str4 = (String) this.f21961w;
                String str5 = (String) this.f21962x;
                String str6 = (String) this.f21963y;
                C3623h c3623h2 = (C3623h) obj;
                c3623h2.getClass();
                C3623h.m7604a(c3623h2, null, new C3874d(1064856602, new C0976h(interfaceC4544a, 5), true), 3);
                InterfaceC1809a1 interfaceC1809a19 = this.f21947i;
                SharedPreferences sharedPreferences = this.f21948j;
                C3623h.m7604a(c3623h2, null, new C3874d(2005788419, new C0455k0((Object) interfaceC4544a, str, (Object) interfaceC1809a19, (Object) sharedPreferences, 6), true), 3);
                boolean zBooleanValue = ((Boolean) interfaceC1809a19.getValue()).booleanValue();
                boolean z10 = this.f21949k;
                InterfaceC1809a1 interfaceC1809a110 = this.f21950l;
                Context context2 = this.f21946h;
                if (zBooleanValue && z10) {
                    C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19784i0, 3);
                    i9 = 3;
                    c3623h = c3623h2;
                    C4905g7 c4905g7 = new C4905g7(context2, sharedPreferences, interfaceC1809a110, interfaceC1809a13, interfaceC1809a14, interfaceC1809a15, interfaceC1809a16, str2);
                    context = context2;
                    interfaceC1809a1 = interfaceC1809a16;
                    interfaceC1809a13 = interfaceC1809a13;
                    str2 = str2;
                    interfaceC1809a12 = interfaceC1809a14;
                    C3623h.m7604a(c3623h, null, new C3874d(852635656, c4905g7, true), 3);
                } else {
                    interfaceC1809a1 = interfaceC1809a16;
                    context = context2;
                    i9 = 3;
                    c3623h = c3623h2;
                    interfaceC1809a12 = interfaceC1809a14;
                }
                if (((Boolean) interfaceC1809a19.getValue()).booleanValue() && !z10) {
                    C3623h.m7604a(c3623h, null, AbstractC5193p0.f19792j0, i9);
                    C0443h0 c0443h0 = new C0443h0(5, interfaceC1809a110, sharedPreferences, str2, false);
                    interfaceC1809a110 = interfaceC1809a110;
                    sharedPreferences = sharedPreferences;
                    C3623h.m7604a(c3623h, null, new C3874d(-75077775, c0443h0, true), i9);
                }
                if (((Boolean) interfaceC1809a19.getValue()).booleanValue()) {
                    C3623h.m7604a(c3623h, null, AbstractC5193p0.f19800k0, i9);
                    z9 = true;
                    C3623h.m7604a(c3623h, null, new C3874d(1722372688, new C5364u6(z10, interfaceC1809a17, sharedPreferences, str3, interfaceC1809a18, str4), true), i9);
                } else {
                    z9 = true;
                }
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19808l0, i9);
                C3623h.m7604a(c3623h, null, new C3874d(1305722049, new C4938h7(context, sharedPreferences, interfaceC1809a19, interfaceC1809a17, interfaceC1809a18, interfaceC1809a110, interfaceC1809a13, interfaceC1809a12, interfaceC1809a15, interfaceC1809a1, str, str5, str6, z10), z9), i9);
                break;
            default:
                EnumC5329t4 enumC5329t4 = (EnumC5329t4) this.f21951m;
                List list = (List) this.f21952n;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f21953o;
                ArrayList arrayList = (ArrayList) this.f21954p;
                ArrayList arrayList2 = (ArrayList) this.f21955q;
                List list2 = (List) this.f21956r;
                ArrayList arrayList3 = (ArrayList) this.f21957s;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f21958t;
                final InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f21959u;
                InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) this.f21960v;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f21961w;
                InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) this.f21962x;
                InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) this.f21963y;
                C3623h c3623h3 = (C3623h) obj;
                c3623h3.getClass();
                C3623h.m7604a(c3623h3, null, new C3874d(-1892210191, new C4853el(interfaceC1220a, 13), true), 3);
                int iOrdinal = enumC5329t4.ordinal();
                if (iOrdinal == 0) {
                    AbstractC4955ho.m9722z5(c3623h3, "实用功能", list, interfaceC1231l);
                    if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                        C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19719a, 3);
                        final int i10 = 0;
                        C3623h.m7604a(c3623h3, null, new C3874d(1079245883, new InterfaceC1236q() { // from class: wb.jm
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1236q
                            /* JADX INFO: renamed from: b */
                            public final Object mo734b(Object obj2, Object obj3, Object obj4) {
                                int i11 = i10;
                                C1836h0 c1836h0 = (C1836h0) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                ((C3619d) obj2).getClass();
                                int i12 = iIntValue & 17;
                                switch (i11) {
                                    case 0:
                                        if (c1836h0.m4516S(iIntValue & 1, i12 != 16)) {
                                            AbstractC4955ho.m9343H0(C4173t.f13710g, "暂无实用功能", interfaceC1231l2, c1836h0, 54);
                                        } else {
                                            c1836h0.m4519V();
                                        }
                                        break;
                                    default:
                                        if (c1836h0.m4516S(iIntValue & 1, i12 != 16)) {
                                            AbstractC4955ho.m9343H0(C4173t.f13710g, "暂无娱乐功能", interfaceC1231l2, c1836h0, 54);
                                        } else {
                                            c1836h0.m4519V();
                                        }
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        }, true), 3);
                    }
                } else if (iOrdinal != 1) {
                    Context context3 = this.f21946h;
                    if (iOrdinal == 2) {
                        C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19735c, 3);
                        C3623h.m7604a(c3623h3, null, new C3874d(-1333817560, new C0455k0((Object) context3, interfaceC1231l3, (InterfaceC3955b) interfaceC1220a2, (InterfaceC3955b) interfaceC1220a3, 20), true), 3);
                    } else if (iOrdinal != 3) {
                        C3193a.m6822k();
                    } else {
                        C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19743d, 3);
                        C3623h.m7604a(c3623h3, null, new C3874d(-1021711353, new C5445wl(this.f21947i, this.f21948j, this.f21949k, this.f21950l), true), 3);
                        C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19751e, 3);
                        C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19759f, 3);
                        C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19767g, 3);
                        C3623h.m7604a(c3623h3, null, new C3874d(1882498059, new C4812dc(context3, interfaceC1220a4), true), 3);
                        C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19775h, 3);
                        C3623h.m7604a(c3623h3, null, new C3874d(1187119117, new C4848eg(context3, 2), true), 3);
                        C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19783i, 3);
                        C3623h.m7604a(c3623h3, null, new C3874d(491740175, new C4848eg(context3, 3), true), 3);
                        C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19791j, 3);
                    }
                } else {
                    AbstractC4955ho.m9722z5(c3623h3, "娱乐功能", list2, interfaceC1231l);
                    if (arrayList3.isEmpty()) {
                        C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19727b, 3);
                        final int i11 = 1;
                        C3623h.m7604a(c3623h3, null, new C3874d(1615788260, new InterfaceC1236q() { // from class: wb.jm
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1236q
                            /* JADX INFO: renamed from: b */
                            public final Object mo734b(Object obj2, Object obj3, Object obj4) {
                                int i112 = i11;
                                C1836h0 c1836h0 = (C1836h0) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                ((C3619d) obj2).getClass();
                                int i12 = iIntValue & 17;
                                switch (i112) {
                                    case 0:
                                        if (c1836h0.m4516S(iIntValue & 1, i12 != 16)) {
                                            AbstractC4955ho.m9343H0(C4173t.f13710g, "暂无实用功能", interfaceC1231l2, c1836h0, 54);
                                        } else {
                                            c1836h0.m4519V();
                                        }
                                        break;
                                    default:
                                        if (c1836h0.m4516S(iIntValue & 1, i12 != 16)) {
                                            AbstractC4955ho.m9343H0(C4173t.f13710g, "暂无娱乐功能", interfaceC1231l2, c1836h0, 54);
                                        } else {
                                            c1836h0.m4519V();
                                        }
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        }, true), 3);
                    }
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5476xj(boolean z9, InterfaceC4544a interfaceC4544a, InterfaceC1809a1 interfaceC1809a1, SharedPreferences sharedPreferences, String str, InterfaceC1809a1 interfaceC1809a12, String str2, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, Context context, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, String str3, InterfaceC1809a1 interfaceC1809a18, String str4, String str5, String str6) {
        this.f21949k = z9;
        this.f21951m = interfaceC4544a;
        this.f21947i = interfaceC1809a1;
        this.f21948j = sharedPreferences;
        this.f21958t = str;
        this.f21950l = interfaceC1809a12;
        this.f21959u = str2;
        this.f21952n = interfaceC1809a13;
        this.f21953o = interfaceC1809a14;
        this.f21954p = interfaceC1809a15;
        this.f21946h = context;
        this.f21955q = interfaceC1809a16;
        this.f21956r = interfaceC1809a17;
        this.f21960v = str3;
        this.f21957s = interfaceC1809a18;
        this.f21961w = str4;
        this.f21962x = str5;
        this.f21963y = str6;
    }
}
