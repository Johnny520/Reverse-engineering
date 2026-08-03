package p036c9;

import android.content.Context;
import android.content.SharedPreferences;
import bi.AbstractC0316d;
import bi.C0314b;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p011ab.C0045e;
import p015b0.C0145k;
import p028c1.AbstractC0378h;
import p051db.C0765c;
import p071f1.C1017n;
import p078f9.C1097h;
import p080fb.C1176t0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1858m2;
import p117i0.InterfaceC1809a1;
import p136j8.AbstractC2091b;
import p144k.AbstractC2192n;
import p176m1.C2730f;
import p177m2.C2767k;
import p218og.AbstractC3149m;
import p219oh.AbstractC3165h;
import p222p.AbstractC3208d;
import p222p.AbstractC3210d1;
import p222p.AbstractC3222h1;
import p222p.AbstractC3226j;
import p222p.AbstractC3253s;
import p222p.C3213e1;
import p222p.C3216f1;
import p222p.C3248q0;
import p222p.C3256t;
import p222p.C3272z0;
import p222p.InterfaceC3268x0;
import p234q.AbstractC3418a;
import p251r.C3619d;
import p253r1.AbstractC3649f;
import p266s0.AbstractC3879i;
import p266s0.C3878h;
import p276sf.C3967n;
import p306v.AbstractC4360e;
import p315v8.C4521a;
import p322w0.C4661l;
import p332wb.AbstractC4726ap;
import p332wb.AbstractC4955ho;
import p332wb.C4792cp;
import p332wb.C4842ea;
import p332wb.C4936h5;
import p332wb.C4957hq;
import p332wb.C5161o1;
import p332wb.C5168o8;
import p332wb.C5278rj;
import p332wb.C5292s0;
import p332wb.C5330t5;
import p332wb.C5391v0;
import p332wb.C5475xi;
import p339x1.C5593d;
import p339x1.C5597e;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p343x6.AbstractC5700d;
import p345x8.C5709b;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import sh.AbstractC4045s;
import sh.C4060x;
import tf.AbstractC4166m;
import th.InterfaceC4209a;

/* JADX INFO: renamed from: c9.h0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0443h0 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1301g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f1302h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f1303i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f1304j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0443h0(int i9, Object obj, Object obj2, Object obj3, boolean z9) {
        this.f1301g = i9;
        this.f1302h = obj;
        this.f1303i = obj2;
        this.f1304j = obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        switch (this.f1301g) {
            case 0:
                final C0424c1 c0424c1 = (C0424c1) this.f1302h;
                String str = (String) this.f1304j;
                final InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f1303i;
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    C0452j1 c0452j1 = C0452j1.f1326a;
                    String str2 = c0424c1.f1217b;
                    String str3 = c0424c1.f1218c;
                    int i9 = c0424c1.f1219d;
                    boolean zM3825a = AbstractC1416l.m3825a(str, c0424c1.f1216a);
                    boolean zM4534f = c1836h0.m4534f(interfaceC1231l) | c1836h0.m4534f(c0424c1);
                    Object objM4514P = c1836h0.m4514P();
                    if (zM4534f || objM4514P == C1851l.f6155a) {
                        final int i10 = 0;
                        objM4514P = new InterfaceC1220a() { // from class: c9.m0
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1220a
                            public final Object invoke() {
                                switch (i10) {
                                    case 0:
                                        interfaceC1231l.invoke(c0424c1.f1216a);
                                        break;
                                    default:
                                        String str4 = c0424c1.f1216a;
                                        if (str4 == null) {
                                            str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                                        }
                                        interfaceC1231l.invoke(str4);
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        c1836h0.m4545k0(objM4514P);
                    }
                    c0452j1.m1468i(i9, 196608, (InterfaceC1220a) objM4514P, c1836h0, str2, str3, zM3825a);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 1:
                final C0424c1 c0424c12 = (C0424c1) this.f1302h;
                Set set = (Set) this.f1304j;
                final InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f1303i;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    C0452j1 c0452j12 = C0452j1.f1326a;
                    String str4 = c0424c12.f1217b;
                    String str5 = c0424c12.f1218c;
                    int i11 = c0424c12.f1219d;
                    boolean zM8417o1 = AbstractC4166m.m8417o1(set, c0424c12.f1216a);
                    boolean zM4534f2 = c1836h02.m4534f(interfaceC1231l2) | c1836h02.m4534f(c0424c12);
                    Object objM4514P2 = c1836h02.m4514P();
                    if (zM4534f2 || objM4514P2 == C1851l.f6155a) {
                        final int i12 = 1;
                        objM4514P2 = new InterfaceC1220a() { // from class: c9.m0
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1220a
                            public final Object invoke() {
                                switch (i12) {
                                    case 0:
                                        interfaceC1231l2.invoke(c0424c12.f1216a);
                                        break;
                                    default:
                                        String str42 = c0424c12.f1216a;
                                        if (str42 == null) {
                                            str42 = HttpUrl.FRAGMENT_ENCODE_SET;
                                        }
                                        interfaceC1231l2.invoke(str42);
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        c1836h02.m4545k0(objM4514P2);
                    }
                    c0452j12.m1468i(i11, 196608, (InterfaceC1220a) objM4514P2, c1836h02, str4, str5, zM8417o1);
                } else {
                    c1836h02.m4519V();
                }
                break;
            case 2:
                List list = (List) this.f1302h;
                ArrayList arrayList = (ArrayList) this.f1304j;
                InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) this.f1303i;
                C1836h0 c1836h03 = (C1836h0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-563841534, new C0145k(list, arrayList, interfaceC1231l3, 6), c1836h03), c1836h03, 48, 1);
                } else {
                    c1836h03.m4519V();
                }
                break;
            case 3:
                C1097h c1097h = (C1097h) this.f1302h;
                C0479q0 c0479q0 = (C0479q0) this.f1304j;
                C0467n0 c0467n0 = (C0467n0) this.f1303i;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) obj;
                C1836h0 c1836h04 = (C1836h0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                interfaceC1220a.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= c1836h04.m4538h(interfaceC1220a) ? 4 : 2;
                }
                int i13 = iIntValue4;
                if (c1836h04.m4516S(i13 & 1, (i13 & 19) != 18)) {
                    AbstractC3165h.m6777d(null, c1097h.f3532d ? "修改转账金额" : "修改聊天记录", 0L, 0L, 0L, false, interfaceC1220a, 0L, 0L, false, AbstractC3879i.m8071e(1759226525, new C0479q0(c1097h, c0479q0, interfaceC1220a, c0467n0, 5), c1836h04), c1836h04, ((i13 << 24) & 234881024) | 6, 3072);
                } else {
                    c1836h04.m4519V();
                }
                break;
            case 4:
                String str6 = (String) this.f1304j;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f1302h;
                InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) this.f1303i;
                C1836h0 c1836h05 = (C1836h0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    AbstractC4955ho.m9382M(str6, interfaceC1220a2, "返回", interfaceC1220a3, null, null, c1836h05, 384, 48);
                } else {
                    c1836h05.m4519V();
                }
                break;
            case 5:
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f1302h;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f1303i;
                String str7 = (String) this.f1304j;
                C1836h0 c1836h06 = (C1836h0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-877424272, new C0145k(interfaceC1809a1, (Object) sharedPreferences, (Object) str7, 11), c1836h06), c1836h06, 48, 1);
                } else {
                    c1836h06.m4519V();
                }
                break;
            case 6:
                InterfaceC1231l interfaceC1231l4 = (InterfaceC1231l) this.f1303i;
                C4521a c4521a = (C4521a) this.f1302h;
                InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) this.f1304j;
                C1836h0 c1836h07 = (C1836h0) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h07.m4516S(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    boolean zM4534f3 = c1836h07.m4534f(interfaceC1231l4) | c1836h07.m4538h(c4521a);
                    Object objM4514P3 = c1836h07.m4514P();
                    if (zM4534f3 || objM4514P3 == C1851l.f6155a) {
                        objM4514P3 = new C4842ea(interfaceC1231l4, c4521a, 0);
                        c1836h07.m4545k0(objM4514P3);
                    }
                    AbstractC4955ho.m9382M("保存", (InterfaceC1220a) objM4514P3, "返回", interfaceC1220a4, null, null, c1836h07, 390, 48);
                } else {
                    c1836h07.m4519V();
                }
                break;
            case 7:
                Context context = (Context) this.f1302h;
                InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) this.f1304j;
                InterfaceC1220a interfaceC1220a6 = (InterfaceC1220a) this.f1303i;
                C1836h0 c1836h08 = (C1836h0) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h08.m4516S(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    Object objM4514P4 = c1836h08.m4514P();
                    if (objM4514P4 == C1851l.f6155a) {
                        objM4514P4 = new C4661l(28);
                        c1836h08.m4545k0(objM4514P4);
                    }
                    AbstractC4955ho.m9669t3(context, (InterfaceC1231l) objM4514P4, interfaceC1220a5, interfaceC1220a6, c1836h08, 48);
                } else {
                    c1836h08.m4519V();
                }
                break;
            case 8:
                InterfaceC1231l interfaceC1231l5 = (InterfaceC1231l) this.f1303i;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f1302h;
                InterfaceC1220a interfaceC1220a7 = (InterfaceC1220a) this.f1304j;
                C1836h0 c1836h09 = (C1836h0) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h09.m4516S(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    boolean zM4534f4 = c1836h09.m4534f(interfaceC1231l5) | c1836h09.m4534f(interfaceC1809a12);
                    Object objM4514P5 = c1836h09.m4514P();
                    if (zM4534f4 || objM4514P5 == C1851l.f6155a) {
                        objM4514P5 = new C5161o1(interfaceC1231l5, interfaceC1809a12, 5);
                        c1836h09.m4545k0(objM4514P5);
                    }
                    AbstractC4955ho.m9382M("保存回复", (InterfaceC1220a) objM4514P5, "返回", interfaceC1220a7, null, null, c1836h09, 390, 48);
                } else {
                    c1836h09.m4519V();
                }
                break;
            case 9:
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f1302h;
                Context context2 = (Context) this.f1304j;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f1303i;
                C1836h0 c1836h010 = (C1836h0) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h010.m4516S(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1015004459, new C0145k(interfaceC1809a13, (Object) context2, (Object) interfaceC1809a14, 14), c1836h010), c1836h010, 48, 1);
                } else {
                    c1836h010.m4519V();
                }
                break;
            case 10:
                C5391v0 c5391v0 = (C5391v0) this.f1302h;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f1304j;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f1303i;
                C1836h0 c1836h011 = (C1836h0) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h011.m4516S(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(958776819, new C0145k(c5391v0, interfaceC1809a15, interfaceC1809a16, 20), c1836h011), c1836h011, 48, 1);
                } else {
                    c1836h011.m4519V();
                }
                break;
            case 11:
                C5292s0 c5292s0 = (C5292s0) this.f1302h;
                C5391v0 c5391v02 = (C5391v0) this.f1304j;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f1303i;
                C1836h0 c1836h012 = (C1836h0) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h012.m4516S(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    boolean zContains = ((Set) interfaceC1809a17.getValue()).contains(c5292s0.f20550a);
                    boolean z9 = c5391v02.f21260c;
                    boolean zM4534f5 = c1836h012.m4534f(interfaceC1809a17) | c1836h012.m4534f(c5391v02) | c1836h012.m4538h(c5292s0);
                    Object objM4514P6 = c1836h012.m4514P();
                    if (zM4534f5 || objM4514P6 == C1851l.f6155a) {
                        objM4514P6 = new C0045e(c5391v02, c5292s0, interfaceC1809a17, 21);
                        c1836h012.m4545k0(objM4514P6);
                    }
                    AbstractC4955ho.m9495a0(c5292s0, zContains, z9, (InterfaceC1220a) objM4514P6, c1836h012, 0);
                } else {
                    c1836h012.m4519V();
                }
                break;
            case 12:
                C0765c c0765c = (C0765c) this.f1302h;
                InterfaceC1231l interfaceC1231l6 = (InterfaceC1231l) this.f1303i;
                InterfaceC1220a interfaceC1220a8 = (InterfaceC1220a) this.f1304j;
                C1836h0 c1836h013 = (C1836h0) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h013.m4516S(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-466113424, new C0145k(c0765c, interfaceC1231l6, interfaceC1220a8, 17), c1836h013), c1836h013, 48, 1);
                } else {
                    c1836h013.m4519V();
                }
                break;
            case 13:
                C0765c c0765c2 = (C0765c) this.f1302h;
                Context context3 = (Context) this.f1304j;
                InterfaceC1231l interfaceC1231l7 = (InterfaceC1231l) this.f1303i;
                C1836h0 c1836h014 = (C1836h0) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h014.m4516S(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1742879764, new C0145k(c0765c2, context3, interfaceC1231l7, 23), c1836h014), c1836h014, 48, 1);
                } else {
                    c1836h014.m4519V();
                }
                break;
            case 14:
                List list2 = (List) this.f1302h;
                InterfaceC1220a interfaceC1220a9 = (InterfaceC1220a) this.f1304j;
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.f1303i;
                C1836h0 c1836h015 = (C1836h0) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h015.m4516S(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-2114701211, new C0145k(list2, interfaceC1220a9, sharedPreferences2, 22), c1836h015), c1836h015, 48, 1);
                } else {
                    c1836h015.m4519V();
                }
                break;
            case 15:
                List list3 = (List) this.f1302h;
                List list4 = (List) this.f1304j;
                InterfaceC1231l interfaceC1231l8 = (InterfaceC1231l) this.f1303i;
                C1836h0 c1836h016 = (C1836h0) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h016.m4516S(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(302657455, new C0145k(list3, list4, interfaceC1231l8, 21), c1836h016), c1836h016, 48, 1);
                } else {
                    c1836h016.m4519V();
                }
                break;
            case 16:
                List list5 = (List) this.f1302h;
                ArrayList arrayList2 = (ArrayList) this.f1304j;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f1303i;
                C1836h0 c1836h017 = (C1836h0) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h017.m4516S(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(660279963, new C0145k(18, (Object) list5, (Object) arrayList2, (Object) interfaceC1809a18, false), c1836h017), c1836h017, 48, 1);
                } else {
                    c1836h017.m4519V();
                }
                break;
            case 17:
                C4792cp c4792cp = (C4792cp) this.f1302h;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f1304j;
                InterfaceC1231l interfaceC1231l9 = (InterfaceC1231l) this.f1303i;
                C1836h0 c1836h018 = (C1836h0) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h018.m4516S(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-678180461, new C0145k(c4792cp, interfaceC1809a19, interfaceC1231l9, 26), c1836h018), c1836h018, 48, 1);
                } else {
                    c1836h018.m4519V();
                }
                break;
            case 18:
                C4936h5 c4936h5 = (C4936h5) this.f1302h;
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) this.f1304j;
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) this.f1303i;
                C1836h0 c1836h019 = (C1836h0) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h019.m4516S(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1743049115, new C0145k(c4936h5, interfaceC1809a110, interfaceC1809a111, 27), c1836h019), c1836h019, 48, 1);
                } else {
                    c1836h019.m4519V();
                }
                break;
            case 19:
                SharedPreferences sharedPreferences3 = (SharedPreferences) this.f1302h;
                Set set2 = (Set) this.f1304j;
                InterfaceC1220a interfaceC1220a10 = (InterfaceC1220a) this.f1303i;
                C1836h0 c1836h020 = (C1836h0) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h020.m4516S(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1797786420, new C0145k(sharedPreferences3, set2, interfaceC1220a10, 15), c1836h020), c1836h020, 48, 1);
                } else {
                    c1836h020.m4519V();
                }
                break;
            case 20:
                C4521a c4521a2 = (C4521a) this.f1302h;
                InterfaceC1231l interfaceC1231l10 = (InterfaceC1231l) this.f1303i;
                InterfaceC1231l interfaceC1231l11 = (InterfaceC1231l) this.f1304j;
                C1836h0 c1836h021 = (C1836h0) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h021.m4516S(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1342732179, new C0145k(c4521a2, interfaceC1231l10, interfaceC1231l11, 16), c1836h021), c1836h021, 48, 1);
                } else {
                    c1836h021.m4519V();
                }
                break;
            case 21:
                C0765c c0765c3 = (C0765c) this.f1302h;
                InterfaceC1231l interfaceC1231l12 = (InterfaceC1231l) this.f1303i;
                ArrayList arrayList3 = (ArrayList) this.f1304j;
                C1836h0 c1836h022 = (C1836h0) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h022.m4516S(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1296477537, new C0145k(c0765c3, interfaceC1231l12, arrayList3, 24), c1836h022), c1836h022, 48, 1);
                } else {
                    c1836h022.m4519V();
                }
                break;
            case 22:
                String str8 = (String) this.f1304j;
                C4957hq c4957hq = (C4957hq) this.f1302h;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) this.f1303i;
                C1836h0 c1836h023 = (C1836h0) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h023.m4516S(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1218541127, new C0145k(19, (Object) str8, (Object) c4957hq, (Object) interfaceC1809a112, false), c1836h023), c1836h023, 48, 1);
                } else {
                    c1836h023.m4519V();
                }
                break;
            case 23:
                C5330t5 c5330t5 = (C5330t5) this.f1302h;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) this.f1304j;
                InterfaceC1809a1 interfaceC1809a114 = (InterfaceC1809a1) this.f1303i;
                C1836h0 c1836h024 = (C1836h0) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h024.m4516S(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    boolean zM4534f6 = c1836h024.m4534f(interfaceC1809a113) | c1836h024.m4538h(c5330t5) | c1836h024.m4534f(interfaceC1809a114);
                    Object objM4514P7 = c1836h024.m4514P();
                    if (zM4534f6 || objM4514P7 == C1851l.f6155a) {
                        objM4514P7 = new C0045e(c5330t5, interfaceC1809a113, interfaceC1809a114, 26);
                        c1836h024.m4545k0(objM4514P7);
                    }
                    AbstractC4955ho.m9488Z1(c5330t5, (InterfaceC1220a) objM4514P7, c1836h024, 0);
                } else {
                    c1836h024.m4519V();
                }
                break;
            case 24:
                C5709b c5709b = (C5709b) this.f1302h;
                InterfaceC1231l interfaceC1231l13 = (InterfaceC1231l) this.f1303i;
                InterfaceC1220a interfaceC1220a11 = (InterfaceC1220a) this.f1304j;
                C1836h0 c1836h025 = (C1836h0) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h025.m4516S(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(2138812569, new C0145k(c5709b, interfaceC1231l13, interfaceC1220a11, 29), c1836h025), c1836h025, 48, 1);
                } else {
                    c1836h025.m4519V();
                }
                break;
            case 25:
                SharedPreferences sharedPreferences4 = (SharedPreferences) this.f1302h;
                Context context4 = (Context) this.f1304j;
                InterfaceC1809a1 interfaceC1809a115 = (InterfaceC1809a1) this.f1303i;
                C1836h0 c1836h026 = (C1836h0) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h026.m4516S(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1135360719, new C0145k(12, (Object) sharedPreferences4, (Object) context4, (Object) interfaceC1809a115, false), c1836h026), c1836h026, 48, 1);
                } else {
                    c1836h026.m4519V();
                }
                break;
            case 26:
                C4060x c4060x = (C4060x) this.f1302h;
                List list6 = (List) this.f1304j;
                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f1303i;
                InterfaceC3268x0 interfaceC3268x0 = (InterfaceC3268x0) obj;
                C1836h0 c1836h027 = (C1836h0) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                interfaceC3268x0.getClass();
                if ((iIntValue27 & 6) == 0) {
                    iIntValue27 |= c1836h027.m4534f(interfaceC3268x0) ? 4 : 2;
                }
                if (c1836h027.m4516S(iIntValue27 & 1, (iIntValue27 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x.f13440e, null);
                    C3272z0 c3272z0M6872b = AbstractC3208d.m6872b(interfaceC3268x0.mo6924c() + 8, interfaceC3268x0.mo6922a() + 84, 5);
                    boolean zM4538h = c1836h027.m4538h(list6) | c1836h027.m4534f(interfaceC1235p);
                    Object objM4514P8 = c1836h027.m4514P();
                    if (zM4538h || objM4514P8 == C1851l.f6155a) {
                        objM4514P8 = new C5168o8(list6, interfaceC1235p, 0);
                        c1836h027.m4545k0(objM4514P8);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a, null, c3272z0M6872b, null, null, null, false, null, (InterfaceC1231l) objM4514P8, c1836h027, 0, 506);
                } else {
                    c1836h027.m4519V();
                }
                break;
            case 27:
                InterfaceC1231l interfaceC1231l14 = (InterfaceC1231l) this.f1303i;
                C1176t0 c1176t0 = (C1176t0) this.f1302h;
                String str9 = (String) this.f1304j;
                C1836h0 c1836h028 = (C1836h0) obj2;
                int iIntValue28 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h028.m4516S(iIntValue28 & 1, (iIntValue28 & 17) != 16)) {
                    C5850l c5850l = C5850l.f23787a;
                    InterfaceC5853o interfaceC5853oM1337b = AbstractC0378h.m1337b(AbstractC3222h1.m6901d(c5850l, 1.0f), AbstractC4360e.m8800a(6));
                    boolean zM4534f7 = c1836h028.m4534f(interfaceC1231l14) | c1836h028.m4538h(c1176t0);
                    Object objM4514P9 = c1836h028.m4514P();
                    if (zM4534f7 || objM4514P9 == C1851l.f6155a) {
                        objM4514P9 = new C5475xi(interfaceC1231l14, 15, c1176t0);
                        c1836h028.m4545k0(objM4514P9);
                    }
                    InterfaceC5853o interfaceC5853oM5433j = AbstractC2192n.m5433j(interfaceC5853oM1337b, false, null, null, (InterfaceC1220a) objM4514P9, 15);
                    float f3 = 12;
                    InterfaceC5853o interfaceC5853oM6883m = AbstractC3208d.m6883m(interfaceC5853oM5433j, f3, 10);
                    C3213e1 c3213e1M6892a = AbstractC3210d1.m6892a(AbstractC3226j.f10298a, C5840b.f23771q, c1836h028, 48);
                    int iHashCode = Long.hashCode(c1836h028.f6095T);
                    C3878h c3878hM4546l = c1836h028.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h028, interfaceC5853oM6883m);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y = C5601f.f22758b;
                    c1836h028.m4531d0();
                    if (c1836h028.f6094S) {
                        c1836h028.m4544k(c5660y);
                    } else {
                        c1836h028.m4551n0();
                    }
                    C5597e c5597e = C5601f.f22761e;
                    AbstractC1874r.m4615A(c5597e, c1836h028, c3213e1M6892a);
                    C5597e c5597e2 = C5601f.f22760d;
                    AbstractC1874r.m4615A(c5597e2, c1836h028, c3878hM4546l);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    C5597e c5597e3 = C5601f.f22762f;
                    AbstractC1874r.m4615A(c5597e3, c1836h028, numValueOf);
                    C5593d c5593d = C5601f.f22763g;
                    AbstractC1874r.m4641w(c5593d, c1836h028);
                    C5597e c5597e4 = C5601f.f22759c;
                    AbstractC1874r.m4615A(c5597e4, c1836h028, interfaceC5853oM10543c);
                    if (1.0f <= 0.0d) {
                        AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                    }
                    C3248q0 c3248q0 = new C3248q0(1.0f, true);
                    C3256t c3256tM6935a = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h028, 0);
                    int iHashCode2 = Long.hashCode(c1836h028.f6095T);
                    C3878h c3878hM4546l2 = c1836h028.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c2 = AbstractC5839a.m10543c(c1836h028, c3248q0);
                    c1836h028.m4531d0();
                    if (c1836h028.f6094S) {
                        c1836h028.m4544k(c5660y);
                    } else {
                        c1836h028.m4551n0();
                    }
                    AbstractC1874r.m4615A(c5597e, c1836h028, c3256tM6935a);
                    AbstractC1874r.m4615A(c5597e2, c1836h028, c3878hM4546l2);
                    AbstractC2091b.m5169p(iHashCode2, c1836h028, c5597e3, c1836h028, c5593d);
                    AbstractC1874r.m4615A(c5597e4, c1836h028, interfaceC5853oM10543c2);
                    String str10 = c1176t0.f3937b;
                    C1858m2 c1858m2 = AbstractC0316d.f944a;
                    AbstractC4045s.m8250n(str10, null, ((C0314b) c1836h028.m4542j(c1858m2)).m1237g(), AbstractC5700d.m10248D(14), C2767k.f9000j, null, 0L, null, 0L, 2, false, 1, 0, null, null, c1836h028, 1597440, 24960, 241578);
                    String str11 = c1176t0.f3938c.f3979d;
                    if (AbstractC3149m.m6721t0(str11)) {
                        str11 = "未设置模型";
                    }
                    AbstractC4045s.m8250n(str11, null, ((C0314b) c1836h028.m4542j(c1858m2)).m1238h(), AbstractC5700d.m10248D(12), null, null, 0L, null, 0L, 2, false, 1, 0, null, null, c1836h028, 24576, 24960, 241642);
                    C1836h0 c1836h029 = c1836h028;
                    c1836h029.m4553p(true);
                    if (AbstractC1416l.m3825a(c1176t0.f3936a, str9)) {
                        c1836h029.m4525a0(-649531600);
                        AbstractC4045s.m8250n("当前", AbstractC3208d.m6886p(c5850l, f3, 0.0f, 0.0f, 0.0f, 14), ((C0314b) c1836h029.m4542j(c1858m2)).m1240j(), AbstractC5700d.m10248D(12), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h029, 24630, 0, 262120);
                        c1836h029 = c1836h029;
                        c1836h029.m4553p(false);
                    } else {
                        c1836h029.m4525a0(-649216423);
                        c1836h029.m4553p(false);
                    }
                    c1836h029.m4553p(true);
                } else {
                    c1836h028.m4519V();
                }
                break;
            case 28:
                String str12 = (String) this.f1304j;
                String str13 = (String) this.f1302h;
                InterfaceC1809a1 interfaceC1809a116 = (InterfaceC1809a1) this.f1303i;
                C1836h0 c1836h030 = (C1836h0) obj2;
                int iIntValue29 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h030.m4516S(iIntValue29 & 1, (iIntValue29 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, 6, 0.0f, 0.0f, 13), AbstractC3879i.m8071e(-1189526962, new C5278rj(str12, str13, interfaceC1809a116, 16), c1836h030), c1836h030, 54, 0);
                } else {
                    c1836h030.m4519V();
                }
                break;
            default:
                InterfaceC1220a interfaceC1220a12 = (InterfaceC1220a) this.f1302h;
                InterfaceC1220a interfaceC1220a13 = (InterfaceC1220a) this.f1304j;
                InterfaceC1220a interfaceC1220a14 = (InterfaceC1220a) this.f1303i;
                C1836h0 c1836h031 = (C1836h0) obj2;
                int iIntValue30 = ((Integer) obj3).intValue();
                ((C3216f1) obj).getClass();
                if (c1836h031.m4516S(iIntValue30 & 1, (iIntValue30 & 17) != 16)) {
                    C2730f c2730f = AbstractC4726ap.f15856d;
                    C1858m2 c1858m22 = AbstractC0316d.f944a;
                    C1017n c1017n = new C1017n(((C0314b) c1836h031.m4542j(c1858m22)).m1237g(), 5);
                    float f10 = 24;
                    C5850l c5850l2 = C5850l.f23787a;
                    AbstractC2192n.m5426c(c2730f, "压缩上下文", AbstractC4955ho.m9405O6(AbstractC3222h1.m6907j(c5850l2, f10), interfaceC1220a12), c1017n, c1836h031, 54);
                    float f11 = 14;
                    AbstractC2192n.m5426c(AbstractC4726ap.f15858f, "会话历史", AbstractC4955ho.m9405O6(AbstractC3222h1.m6907j(AbstractC3208d.m6886p(c5850l2, f11, 0.0f, 0.0f, 0.0f, 14), f10), interfaceC1220a13), new C1017n(((C0314b) c1836h031.m4542j(c1858m22)).m1237g(), 5), c1836h031, 54);
                    AbstractC2192n.m5426c(AbstractC4726ap.f15860h, "Agent 配置", AbstractC4955ho.m9405O6(AbstractC3222h1.m6907j(AbstractC3208d.m6886p(c5850l2, f11, 0.0f, 0.0f, 0.0f, 14), f10), interfaceC1220a14), new C1017n(((C0314b) c1836h031.m4542j(c1858m22)).m1237g(), 5), c1836h031, 54);
                } else {
                    c1836h031.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C0443h0(int i9, Object obj, Object obj2, String str) {
        this.f1301g = i9;
        this.f1304j = str;
        this.f1302h = obj;
        this.f1303i = obj2;
    }

    public /* synthetic */ C0443h0(InterfaceC1231l interfaceC1231l, Object obj, Object obj2, int i9) {
        this.f1301g = i9;
        this.f1303i = interfaceC1231l;
        this.f1302h = obj;
        this.f1304j = obj2;
    }

    public /* synthetic */ C0443h0(Object obj, Object obj2, Object obj3, int i9) {
        this.f1301g = i9;
        this.f1302h = obj;
        this.f1304j = obj2;
        this.f1303i = obj3;
    }
}
