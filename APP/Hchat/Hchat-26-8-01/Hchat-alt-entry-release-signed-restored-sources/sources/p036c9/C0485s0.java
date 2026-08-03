package p036c9;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import p000a.AbstractC0000a;
import p011ab.C0045e;
import p015b0.C0144j;
import p015b0.C0146l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p080fb.C1168r0;
import p080fb.C1183v;
import p080fb.C1186w;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p198nb.C2925a0;
import p218og.AbstractC3149m;
import p222p.AbstractC3199a;
import p249qg.InterfaceC3599t;
import p251r.C3641z;
import p276sf.C3967n;
import p317vb.InterfaceC4544a;
import p332wb.AbstractC4955ho;
import p332wb.C4720aj;
import p332wb.C4825dq;
import p332wb.C5040kc;
import p332wb.C5491y2;
import p345x8.C5725r;
import p345x8.C5732y;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: c9.s0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0485s0 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1438g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f1439h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f1440i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f1441j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1442k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f1443l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f1444m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f1445n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f1446o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f1447p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f1448q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f1449r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f1450s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0485s0(Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111) {
        this.f1438g = 5;
        this.f1446o = context;
        this.f1439h = interfaceC1809a1;
        this.f1440i = interfaceC1809a12;
        this.f1441j = interfaceC1809a13;
        this.f1442k = interfaceC1809a14;
        this.f1443l = interfaceC1809a15;
        this.f1444m = interfaceC1809a16;
        this.f1445n = interfaceC1809a17;
        this.f1447p = interfaceC1809a18;
        this.f1448q = interfaceC1809a19;
        this.f1449r = interfaceC1809a110;
        this.f1450s = interfaceC1809a111;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x033f  */
    @Override // p085fg.InterfaceC1235p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) throws JSONException {
        C1836h0 c1836h0;
        InterfaceC1809a1 interfaceC1809a1;
        C1836h0 c1836h02;
        InterfaceC1809a1 interfaceC1809a12;
        InterfaceC1809a1 interfaceC1809a13;
        C1823e c1823e;
        int i9;
        InterfaceC1809a1 interfaceC1809a14;
        float f3;
        String str;
        String str2;
        String str3;
        boolean zM4534f;
        Object objM4514P;
        C1168r0 c1168r0M2981a;
        ArrayList arrayList;
        switch (this.f1438g) {
            case 0:
                final AbstractC0473o2 abstractC0473o2 = (AbstractC0473o2) this.f1446o;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f1439h;
                final InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f1440i;
                final InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f1441j;
                final InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f1447p;
                final Activity activity = (Activity) this.f1450s;
                final InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f1448q;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f1442k;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f1443l;
                final InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) this.f1444m;
                final InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) this.f1445n;
                InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) this.f1449r;
                C1836h0 c1836h03 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C0452j1 c0452j1 = C0452j1.f1326a;
                if (c1836h03.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int iOrdinal = ((EnumC0432e1) interfaceC1809a17.getValue()).ordinal();
                    C1823e c1823e2 = C1851l.f6155a;
                    switch (iOrdinal) {
                        case 0:
                            c1836h03.m4525a0(-607459547);
                            List list = (List) interfaceC1809a110.getValue();
                            String str4 = (String) interfaceC1809a15.getValue();
                            String str5 = (String) interfaceC1809a16.getValue();
                            boolean zM4534f2 = c1836h03.m4534f(interfaceC1809a15);
                            Object objM4514P2 = c1836h03.m4514P();
                            if (zM4534f2 || objM4514P2 == c1823e2) {
                                objM4514P2 = new C0146l(interfaceC1809a15, 2);
                                c1836h03.m4545k0(objM4514P2);
                            }
                            InterfaceC1231l interfaceC1231l = (InterfaceC1231l) objM4514P2;
                            boolean zM4534f3 = c1836h03.m4534f(interfaceC1809a16);
                            Object objM4514P3 = c1836h03.m4514P();
                            if (zM4534f3 || objM4514P3 == c1823e2) {
                                objM4514P3 = new C0146l(interfaceC1809a16, 6);
                                c1836h03.m4545k0(objM4514P3);
                            }
                            InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) objM4514P3;
                            boolean zM4534f4 = c1836h03.m4534f(interfaceC1809a17);
                            Object objM4514P4 = c1836h03.m4514P();
                            if (zM4534f4 || objM4514P4 == c1823e2) {
                                objM4514P4 = new C0144j(interfaceC1809a17, 7);
                                c1836h03.m4545k0(objM4514P4);
                            }
                            InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) objM4514P4;
                            boolean zM4538h = c1836h03.m4538h(abstractC0473o2) | c1836h03.m4538h(activity) | c1836h03.m4534f(interfaceC1809a16) | c1836h03.m4534f(interfaceC1220a2) | c1836h03.m4534f(interfaceC1220a);
                            Object objM4514P5 = c1836h03.m4514P();
                            if (zM4538h || objM4514P5 == c1823e2) {
                                C0482r0 c0482r0 = new C0482r0(1, activity, abstractC0473o2, interfaceC1220a, interfaceC1809a16, interfaceC1220a2);
                                abstractC0473o2 = abstractC0473o2;
                                c1836h03.m4545k0(c0482r0);
                                objM4514P5 = c0482r0;
                            }
                            c0452j1.m1469j(list, abstractC0473o2, str4, str5, interfaceC1231l, interfaceC1231l2, interfaceC1220a4, interfaceC1220a, (InterfaceC1220a) objM4514P5, c1836h03, 805306368);
                            c1836h03.m4553p(false);
                            break;
                        case 1:
                            c1836h03.m4525a0(-607415361);
                            List list2 = (List) interfaceC1809a110.getValue();
                            boolean zM4534f5 = c1836h03.m4534f(interfaceC1809a18) | c1836h03.m4534f(interfaceC1809a19) | c1836h03.m4534f(interfaceC1809a17);
                            Object objM4514P6 = c1836h03.m4514P();
                            if (zM4534f5 || objM4514P6 == c1823e2) {
                                objM4514P6 = new C0497w0(interfaceC1809a18, interfaceC1809a19, interfaceC1809a17, 0);
                                c1836h03.m4545k0(objM4514P6);
                            }
                            InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) objM4514P6;
                            boolean zM4534f6 = c1836h03.m4534f(interfaceC1809a110) | c1836h03.m4534f(interfaceC1809a17);
                            Object objM4514P7 = c1836h03.m4514P();
                            if (zM4534f6 || objM4514P7 == c1823e2) {
                                objM4514P7 = new C0500x0(0, interfaceC1809a110, interfaceC1809a17);
                                c1836h03.m4545k0(objM4514P7);
                            }
                            InterfaceC1220a interfaceC1220a6 = (InterfaceC1220a) objM4514P7;
                            boolean zM4534f7 = c1836h03.m4534f(interfaceC1809a111) | c1836h03.m4534f(interfaceC1809a17);
                            Object objM4514P8 = c1836h03.m4514P();
                            if (zM4534f7 || objM4514P8 == c1823e2) {
                                objM4514P8 = new C0500x0(1, interfaceC1809a111, interfaceC1809a17);
                                c1836h03.m4545k0(objM4514P8);
                            }
                            InterfaceC1220a interfaceC1220a7 = (InterfaceC1220a) objM4514P8;
                            boolean zM4534f8 = c1836h03.m4534f(interfaceC1809a17);
                            Object objM4514P9 = c1836h03.m4514P();
                            if (zM4534f8 || objM4514P9 == c1823e2) {
                                objM4514P9 = new C0144j(interfaceC1809a17, 8);
                                c1836h03.m4545k0(objM4514P9);
                            }
                            InterfaceC1220a interfaceC1220a8 = (InterfaceC1220a) objM4514P9;
                            boolean zM4538h2 = c1836h03.m4538h(activity) | c1836h03.m4534f(interfaceC1220a) | c1836h03.m4534f(interfaceC1220a3);
                            Object objM4514P10 = c1836h03.m4514P();
                            if (zM4538h2 || objM4514P10 == c1823e2) {
                                objM4514P10 = new C0045e(activity, interfaceC1220a, interfaceC1220a3, 3);
                                c1836h03.m4545k0(objM4514P10);
                            }
                            InterfaceC1220a interfaceC1220a9 = (InterfaceC1220a) objM4514P10;
                            boolean zM4534f9 = c1836h03.m4534f(interfaceC1809a17);
                            Object objM4514P11 = c1836h03.m4514P();
                            if (zM4534f9 || objM4514P11 == c1823e2) {
                                objM4514P11 = new C0144j(interfaceC1809a17, 9);
                                c1836h03.m4545k0(objM4514P11);
                            }
                            c0452j1.m1470k(list2, interfaceC1220a5, interfaceC1220a6, interfaceC1220a7, interfaceC1220a8, interfaceC1220a9, (InterfaceC1220a) objM4514P11, c1836h03, 12582912);
                            c1836h03.m4553p(false);
                            break;
                        case 2:
                            c1836h03.m4525a0(-607372294);
                            List list3 = (List) interfaceC1809a110.getValue();
                            String str6 = (String) interfaceC1809a18.getValue();
                            String str7 = (String) interfaceC1809a19.getValue();
                            boolean zM4534f10 = c1836h03.m4534f(interfaceC1809a18);
                            Object objM4514P12 = c1836h03.m4514P();
                            if (zM4534f10 || objM4514P12 == c1823e2) {
                                objM4514P12 = new C0146l(interfaceC1809a18, 3);
                                c1836h03.m4545k0(objM4514P12);
                            }
                            InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) objM4514P12;
                            boolean zM4534f11 = c1836h03.m4534f(interfaceC1809a19);
                            Object objM4514P13 = c1836h03.m4514P();
                            if (zM4534f11 || objM4514P13 == c1823e2) {
                                objM4514P13 = new C0146l(interfaceC1809a19, 4);
                                c1836h03.m4545k0(objM4514P13);
                            }
                            InterfaceC1231l interfaceC1231l4 = (InterfaceC1231l) objM4514P13;
                            boolean zM4534f12 = c1836h03.m4534f(interfaceC1809a17);
                            Object objM4514P14 = c1836h03.m4514P();
                            if (zM4534f12 || objM4514P14 == c1823e2) {
                                objM4514P14 = new C0144j(interfaceC1809a17, 2);
                                c1836h03.m4545k0(objM4514P14);
                            }
                            InterfaceC1220a interfaceC1220a10 = (InterfaceC1220a) objM4514P14;
                            boolean zM4534f13 = c1836h03.m4534f(interfaceC1809a18) | c1836h03.m4538h(activity) | c1836h03.m4534f(interfaceC1809a110) | c1836h03.m4534f(interfaceC1809a19) | c1836h03.m4534f(interfaceC1220a2) | c1836h03.m4534f(interfaceC1809a16) | c1836h03.m4538h(abstractC0473o2) | c1836h03.m4534f(interfaceC1809a111) | c1836h03.m4534f(interfaceC1809a17);
                            Object objM4514P15 = c1836h03.m4514P();
                            if (zM4534f13 || objM4514P15 == c1823e2) {
                                C0491u0 c0491u0 = new C0491u0(activity, interfaceC1809a18, interfaceC1809a110, interfaceC1809a19, interfaceC1220a2, abstractC0473o2, interfaceC1809a16, interfaceC1809a111, interfaceC1809a17);
                                c1836h03.m4545k0(c0491u0);
                                objM4514P15 = c0491u0;
                            }
                            c0452j1.m1461b(list3, str6, str7, interfaceC1231l3, interfaceC1231l4, interfaceC1220a10, (InterfaceC1220a) objM4514P15, c1836h03, 12582912);
                            c1836h03.m4553p(false);
                            break;
                        case 3:
                            c1836h03.m4525a0(-607324939);
                            List list4 = (List) interfaceC1809a110.getValue();
                            Set set = (Set) interfaceC1809a111.getValue();
                            boolean zM4534f14 = c1836h03.m4534f(interfaceC1809a111);
                            Object objM4514P16 = c1836h03.m4514P();
                            if (zM4534f14 || objM4514P16 == c1823e2) {
                                objM4514P16 = new C0146l(interfaceC1809a111, 5);
                                c1836h03.m4545k0(objM4514P16);
                            }
                            InterfaceC1231l interfaceC1231l5 = (InterfaceC1231l) objM4514P16;
                            boolean zM4534f15 = c1836h03.m4534f(interfaceC1809a17);
                            Object objM4514P17 = c1836h03.m4514P();
                            if (zM4534f15 || objM4514P17 == c1823e2) {
                                objM4514P17 = new C0144j(interfaceC1809a17, 3);
                                c1836h03.m4545k0(objM4514P17);
                            }
                            InterfaceC1220a interfaceC1220a11 = (InterfaceC1220a) objM4514P17;
                            boolean zM4534f16 = c1836h03.m4534f(interfaceC1809a111) | c1836h03.m4538h(activity) | c1836h03.m4534f(interfaceC1809a17);
                            Object objM4514P18 = c1836h03.m4514P();
                            if (zM4534f16 || objM4514P18 == c1823e2) {
                                objM4514P18 = new C0045e(interfaceC1809a111, activity, interfaceC1809a17, 2);
                                c1836h03.m4545k0(objM4514P18);
                            }
                            c0452j1.m1463d(list4, set, interfaceC1231l5, interfaceC1220a11, (InterfaceC1220a) objM4514P18, c1836h03, 196608);
                            c1836h03.m4553p(false);
                            break;
                        case 4:
                            c1836h03.m4525a0(-607305689);
                            boolean zM4534f17 = c1836h03.m4534f(interfaceC1809a17);
                            Object objM4514P19 = c1836h03.m4514P();
                            if (zM4534f17 || objM4514P19 == c1823e2) {
                                objM4514P19 = new C0144j(interfaceC1809a17, 4);
                                c1836h03.m4545k0(objM4514P19);
                            }
                            InterfaceC1220a interfaceC1220a12 = (InterfaceC1220a) objM4514P19;
                            boolean zM4538h3 = c1836h03.m4538h(abstractC0473o2) | c1836h03.m4538h(activity) | c1836h03.m4534f(interfaceC1220a2) | c1836h03.m4534f(interfaceC1220a) | c1836h03.m4534f(interfaceC1809a110) | c1836h03.m4534f(interfaceC1809a16) | c1836h03.m4534f(interfaceC1809a111) | c1836h03.m4534f(interfaceC1809a17);
                            Object objM4514P20 = c1836h03.m4514P();
                            if (zM4538h3 || objM4514P20 == c1823e2) {
                                final int i10 = 0;
                                InterfaceC1220a interfaceC1220a13 = new InterfaceC1220a() { // from class: c9.v0
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // p085fg.InterfaceC1220a
                                    public final Object invoke() {
                                        switch (i10) {
                                            case 0:
                                                InterfaceC1809a1 interfaceC1809a112 = interfaceC1809a110;
                                                List list5 = (List) interfaceC1809a112.getValue();
                                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                Iterator it = list5.iterator();
                                                while (it.hasNext()) {
                                                    linkedHashSet.add(((C0414a) it.next()).f1179a);
                                                }
                                                C0452j1.m1452m(abstractC0473o2, activity, interfaceC1220a, interfaceC1220a2, interfaceC1809a112, interfaceC1809a16, interfaceC1809a111, interfaceC1809a17, linkedHashSet);
                                                break;
                                            default:
                                                InterfaceC1809a1 interfaceC1809a113 = interfaceC1809a110;
                                                C0452j1.m1452m(abstractC0473o2, activity, interfaceC1220a, interfaceC1220a2, interfaceC1809a16, interfaceC1809a111, interfaceC1809a113, interfaceC1809a17, (Set) interfaceC1809a113.getValue());
                                                break;
                                        }
                                        return C3967n.f12976a;
                                    }
                                };
                                c1836h03.m4545k0(interfaceC1220a13);
                                objM4514P20 = interfaceC1220a13;
                            }
                            c0452j1.m1462c("将删除当前账号的全部聊天分组。归拢的会话会恢复到微信首页。", "全部删除", interfaceC1220a12, (InterfaceC1220a) objM4514P20, c1836h03, 24630);
                            c1836h03.m4553p(false);
                            break;
                        case 5:
                            c1836h03.m4525a0(-607294634);
                            String strM2250m = AbstractC0921a.m2250m(((Set) interfaceC1809a111.getValue()).size(), "将删除选中的 ", " 个分组。子分组会上移，直属会话会移交给最近的上级分组；没有上级时恢复到微信首页。");
                            boolean zM4534f18 = c1836h03.m4534f(interfaceC1809a17);
                            Object objM4514P21 = c1836h03.m4514P();
                            if (zM4534f18 || objM4514P21 == c1823e2) {
                                objM4514P21 = new C0144j(interfaceC1809a17, 5);
                                c1836h03.m4545k0(objM4514P21);
                            }
                            InterfaceC1220a interfaceC1220a14 = (InterfaceC1220a) objM4514P21;
                            boolean zM4538h4 = c1836h03.m4538h(abstractC0473o2) | c1836h03.m4538h(activity) | c1836h03.m4534f(interfaceC1220a2) | c1836h03.m4534f(interfaceC1220a) | c1836h03.m4534f(interfaceC1809a110) | c1836h03.m4534f(interfaceC1809a16) | c1836h03.m4534f(interfaceC1809a111) | c1836h03.m4534f(interfaceC1809a17);
                            Object objM4514P22 = c1836h03.m4514P();
                            if (zM4538h4 || objM4514P22 == c1823e2) {
                                final int i11 = 1;
                                InterfaceC1220a interfaceC1220a15 = new InterfaceC1220a() { // from class: c9.v0
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // p085fg.InterfaceC1220a
                                    public final Object invoke() {
                                        switch (i11) {
                                            case 0:
                                                InterfaceC1809a1 interfaceC1809a112 = interfaceC1809a111;
                                                List list5 = (List) interfaceC1809a112.getValue();
                                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                Iterator it = list5.iterator();
                                                while (it.hasNext()) {
                                                    linkedHashSet.add(((C0414a) it.next()).f1179a);
                                                }
                                                C0452j1.m1452m(abstractC0473o2, activity, interfaceC1220a, interfaceC1220a2, interfaceC1809a112, interfaceC1809a110, interfaceC1809a16, interfaceC1809a17, linkedHashSet);
                                                break;
                                            default:
                                                InterfaceC1809a1 interfaceC1809a113 = interfaceC1809a111;
                                                C0452j1.m1452m(abstractC0473o2, activity, interfaceC1220a, interfaceC1220a2, interfaceC1809a110, interfaceC1809a16, interfaceC1809a113, interfaceC1809a17, (Set) interfaceC1809a113.getValue());
                                                break;
                                        }
                                        return C3967n.f12976a;
                                    }
                                };
                                c1836h03.m4545k0(interfaceC1220a15);
                                objM4514P22 = interfaceC1220a15;
                            }
                            c0452j1.m1462c(strM2250m, "删除", interfaceC1220a14, (InterfaceC1220a) objM4514P22, c1836h03, 24624);
                            c1836h03.m4553p(false);
                            break;
                        case 6:
                            c1836h03.m4525a0(-607283073);
                            boolean zM4534f19 = c1836h03.m4534f(interfaceC1809a17);
                            Object objM4514P23 = c1836h03.m4514P();
                            if (zM4534f19 || objM4514P23 == c1823e2) {
                                objM4514P23 = new C0144j(interfaceC1809a17, 6);
                                c1836h03.m4545k0(objM4514P23);
                            }
                            InterfaceC1220a interfaceC1220a16 = (InterfaceC1220a) objM4514P23;
                            boolean zM4534f20 = c1836h03.m4534f(interfaceC1220a) | c1836h03.m4538h(activity) | c1836h03.m4534f(interfaceC1220a2) | c1836h03.m4534f(interfaceC1220a3);
                            Object objM4514P24 = c1836h03.m4514P();
                            if (zM4534f20 || objM4514P24 == c1823e2) {
                                c1836h0 = c1836h03;
                                C0467n0 c0467n0 = new C0467n0(interfaceC1220a, activity, interfaceC1220a3, interfaceC1220a2, 1);
                                c1836h0.m4545k0(c0467n0);
                                objM4514P24 = c0467n0;
                            } else {
                                c1836h0 = c1836h03;
                            }
                            c0452j1.m1462c("导入会先校验文件，再覆盖当前账号的聊天分组；其他微信账号不受影响。", "选择文件", interfaceC1220a16, (InterfaceC1220a) objM4514P24, c1836h0, 24630);
                            c1836h0.m4553p(false);
                            break;
                        default:
                            throw AbstractC0255e.m1015d(c1836h03, -607456159, false);
                    }
                } else {
                    c1836h03.m4519V();
                }
                return C3967n.f12976a;
            case 1:
                C5725r c5725r = (C5725r) this.f1446o;
                Context context = (Context) this.f1447p;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) this.f1439h;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) this.f1440i;
                InterfaceC1809a1 interfaceC1809a114 = (InterfaceC1809a1) this.f1441j;
                InterfaceC1809a1 interfaceC1809a115 = (InterfaceC1809a1) this.f1442k;
                InterfaceC1809a1 interfaceC1809a116 = (InterfaceC1809a1) this.f1443l;
                InterfaceC1809a1 interfaceC1809a117 = (InterfaceC1809a1) this.f1444m;
                InterfaceC1809a1 interfaceC1809a118 = (InterfaceC1809a1) this.f1445n;
                InterfaceC1809a1 interfaceC1809a119 = (InterfaceC1809a1) this.f1448q;
                InterfaceC1809a1 interfaceC1809a120 = (InterfaceC1809a1) this.f1449r;
                InterfaceC1809a1 interfaceC1809a121 = (InterfaceC1809a1) this.f1450s;
                C1836h0 c1836h04 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h04.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zM4538h5 = c1836h04.m4538h(c5725r) | c1836h04.m4538h(context);
                    Object objM4514P25 = c1836h04.m4514P();
                    C1823e c1823e3 = C1851l.f6155a;
                    if (zM4538h5 || objM4514P25 == c1823e3) {
                        C0482r0 c0482r02 = new C0482r0(c5725r, context, interfaceC1809a119, interfaceC1809a120, interfaceC1809a121, 19);
                        c1836h04.m4545k0(c0482r02);
                        objM4514P25 = c0482r02;
                    }
                    AbstractC4955ho.m9503b("新增空配置", "创建后留在此页，可再手动切换", (InterfaceC1220a) objM4514P25, c1836h04, 54);
                    AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                    boolean zM4534f21 = c1836h04.m4534f(interfaceC1809a112) | c1836h04.m4534f(interfaceC1809a113) | c1836h04.m4534f(interfaceC1809a114) | c1836h04.m4534f(interfaceC1809a115) | c1836h04.m4534f(interfaceC1809a116) | c1836h04.m4534f(interfaceC1809a117) | c1836h04.m4534f(interfaceC1809a118) | c1836h04.m4538h(c5725r) | c1836h04.m4538h(context);
                    Object objM4514P26 = c1836h04.m4514P();
                    if (zM4534f21 || objM4514P26 == c1823e3) {
                        interfaceC1809a1 = interfaceC1809a112;
                        c1836h02 = c1836h04;
                        interfaceC1809a12 = interfaceC1809a121;
                        interfaceC1809a13 = interfaceC1809a119;
                        c1823e = c1823e3;
                        i9 = 54;
                        interfaceC1809a14 = interfaceC1809a120;
                        C2925a0 c2925a0 = new C2925a0(c5725r, context, interfaceC1809a1, interfaceC1809a14, interfaceC1809a13, interfaceC1809a113, interfaceC1809a114, interfaceC1809a115, interfaceC1809a116, interfaceC1809a117, interfaceC1809a118, interfaceC1809a12, 2);
                        c1836h02.m4545k0(c2925a0);
                        objM4514P26 = c2925a0;
                    } else {
                        interfaceC1809a1 = interfaceC1809a112;
                        interfaceC1809a12 = interfaceC1809a121;
                        c1836h02 = c1836h04;
                        interfaceC1809a13 = interfaceC1809a119;
                        c1823e = c1823e3;
                        i9 = 54;
                        interfaceC1809a14 = interfaceC1809a120;
                    }
                    AbstractC4955ho.m9503b("复制当前输入", "按智聊编辑页当前输入复制配置", (InterfaceC1220a) objM4514P26, c1836h02, i9);
                    if (((List) interfaceC1809a13.getValue()).size() > 1) {
                        c1836h02.m4525a0(-1824587268);
                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                        boolean zM4534f22 = c1836h02.m4534f(interfaceC1809a1) | c1836h02.m4538h(c5725r) | c1836h02.m4538h(context);
                        Object objM4514P27 = c1836h02.m4514P();
                        if (zM4534f22 || objM4514P27 == c1823e) {
                            C0475p0 c0475p0 = new C0475p0(c5725r, context, interfaceC1809a13, interfaceC1809a14, interfaceC1809a1, interfaceC1809a12, 9);
                            c1836h02.m4545k0(c0475p0);
                            objM4514P27 = c0475p0;
                        }
                        AbstractC4955ho.m9503b("删除当前配置", "删除正在编辑的配置，至少保留一个", (InterfaceC1220a) objM4514P27, c1836h02, i9);
                        c1836h02.m4553p(false);
                    } else {
                        c1836h02.m4525a0(-1823757925);
                        c1836h02.m4553p(false);
                    }
                } else {
                    c1836h04.m4519V();
                }
                return C3967n.f12976a;
            case 2:
                Context context2 = (Context) this.f1446o;
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f1447p;
                InterfaceC1809a1 interfaceC1809a122 = (InterfaceC1809a1) this.f1439h;
                InterfaceC1809a1 interfaceC1809a123 = (InterfaceC1809a1) this.f1440i;
                InterfaceC1809a1 interfaceC1809a124 = (InterfaceC1809a1) this.f1441j;
                InterfaceC1809a1 interfaceC1809a125 = (InterfaceC1809a1) this.f1442k;
                InterfaceC1809a1 interfaceC1809a126 = (InterfaceC1809a1) this.f1443l;
                InterfaceC1809a1 interfaceC1809a127 = (InterfaceC1809a1) this.f1444m;
                InterfaceC1809a1 interfaceC1809a128 = (InterfaceC1809a1) this.f1445n;
                InterfaceC1809a1 interfaceC1809a129 = (InterfaceC1809a1) this.f1448q;
                InterfaceC1809a1 interfaceC1809a130 = (InterfaceC1809a1) this.f1449r;
                InterfaceC1809a1 interfaceC1809a131 = (InterfaceC1809a1) this.f1450s;
                C1836h0 c1836h05 = (C1836h0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c1836h05.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) interfaceC1809a122.getValue()).booleanValue();
                    Object objM4514P28 = c1836h05.m4514P();
                    C1823e c1823e4 = C1851l.f6155a;
                    if (objM4514P28 == c1823e4) {
                        objM4514P28 = new C4720aj(interfaceC1809a122, 7);
                        c1836h05.m4545k0(objM4514P28);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue, "启用MCP桥接实验", "把 Hchat 能力暴露给小智调用；端点地址包含 token，请勿外传", false, (InterfaceC1231l) objM4514P28, c1836h05, 25008, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    String str8 = (String) interfaceC1809a123.getValue();
                    Object objM4514P29 = c1836h05.m4514P();
                    if (objM4514P29 == c1823e4) {
                        objM4514P29 = new C4720aj(interfaceC1809a123, 8);
                        c1836h05.m4545k0(objM4514P29);
                    }
                    AbstractC4955ho.m9304C1("MCP Endpoint", "wss://api.xiaozhi.me/mcp/?token=...；留空不连接", str8, 0, (InterfaceC1231l) objM4514P29, c1836h05, 24630, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    AbstractC4955ho.m9634p4((C5732y) interfaceC1809a124.getValue(), c1836h05, 0);
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    String str9 = ((C5732y) interfaceC1809a124.getValue()).f23351c;
                    boolean zM4538h6 = c1836h05.m4538h(context2) | c1836h05.m4538h(interfaceC3599t);
                    Object objM4514P30 = c1836h05.m4514P();
                    if (zM4538h6 || objM4514P30 == c1823e4) {
                        f3 = 0.0f;
                        C0482r0 c0482r03 = new C0482r0(context2, interfaceC3599t, interfaceC1809a125, interfaceC1809a126, interfaceC1809a124, 20);
                        c1836h05.m4545k0(c0482r03);
                        objM4514P30 = c0482r03;
                    } else {
                        f3 = 0.0f;
                    }
                    AbstractC4955ho.m9503b("刷新连接状态", str9, (InterfaceC1220a) objM4514P30, c1836h05, 6);
                    AbstractC4955ho.m9312D1(f3, c1836h05, 0, 1);
                    String str10 = (String) interfaceC1809a127.getValue();
                    Object objM4514P31 = c1836h05.m4514P();
                    if (objM4514P31 == c1823e4) {
                        objM4514P31 = new C4720aj(interfaceC1809a127, 9);
                        c1836h05.m4545k0(objM4514P31);
                    }
                    InterfaceC1231l interfaceC1231l6 = (InterfaceC1231l) objM4514P31;
                    float f10 = f3;
                    AbstractC4955ho.m9304C1("就绪等待时长", "断开后首次触发等待 MCP ready 的秒数，默认 5，可填 1-30", str10, 0, interfaceC1231l6, c1836h05, 24630, 8);
                    AbstractC4955ho.m9312D1(f10, c1836h05, 0, 1);
                    String str11 = (String) interfaceC1809a128.getValue();
                    Object objM4514P32 = c1836h05.m4514P();
                    if (objM4514P32 == c1823e4) {
                        objM4514P32 = new C4720aj(interfaceC1809a128, 10);
                        c1836h05.m4545k0(objM4514P32);
                    }
                    AbstractC4955ho.m9304C1("自动断开时长", "空闲多少秒后断开 MCP，默认 90，可填 10-600", str11, 0, (InterfaceC1231l) objM4514P32, c1836h05, 24630, 8);
                    AbstractC4955ho.m9312D1(f10, c1836h05, 0, 1);
                    boolean zBooleanValue2 = ((Boolean) interfaceC1809a129.getValue()).booleanValue();
                    Object objM4514P33 = c1836h05.m4514P();
                    if (objM4514P33 == c1823e4) {
                        objM4514P33 = new C4720aj(interfaceC1809a129, 11);
                        c1836h05.m4545k0(objM4514P33);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue2, "调用点歌工具", "让小智理解自然语言后调用本地点歌插件发送音乐卡片", false, (InterfaceC1231l) objM4514P33, c1836h05, 25008, 8);
                    if (((Boolean) interfaceC1809a129.getValue()).booleanValue()) {
                        c1836h05.m4525a0(-1549518122);
                        AbstractC4955ho.m9312D1(f10, c1836h05, 0, 1);
                        String str12 = (String) interfaceC1809a130.getValue();
                        Object objM4514P34 = c1836h05.m4514P();
                        if (objM4514P34 == c1823e4) {
                            objM4514P34 = new C4720aj(interfaceC1809a130, 12);
                            c1836h05.m4545k0(objM4514P34);
                        }
                        AbstractC4955ho.m9304C1("点歌插件ID", "例如 QQ点歌", str12, 0, (InterfaceC1231l) objM4514P34, c1836h05, 24630, 8);
                        AbstractC4955ho.m9312D1(f10, c1836h05, 0, 1);
                        String str13 = (String) interfaceC1809a131.getValue();
                        Object objM4514P35 = c1836h05.m4514P();
                        if (objM4514P35 == c1823e4) {
                            objM4514P35 = new C4720aj(interfaceC1809a131, 13);
                            c1836h05.m4545k0(objM4514P35);
                        }
                        AbstractC4955ho.m9304C1("点歌函数名", "例如 queryKugouMusic", str13, 0, (InterfaceC1231l) objM4514P35, c1836h05, 24630, 8);
                        c1836h05.m4553p(false);
                    } else {
                        c1836h05.m4525a0(-1548834851);
                        c1836h05.m4553p(false);
                    }
                } else {
                    c1836h05.m4519V();
                }
                return C3967n.f12976a;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9344H1((Context) this.f1446o, (InterfaceC4544a) this.f1439h, (SharedPreferences) this.f1440i, (List) this.f1441j, (Set) this.f1442k, (Set) this.f1443l, (C3641z) this.f1444m, (InterfaceC1220a) this.f1447p, (InterfaceC1220a) this.f1448q, (InterfaceC1220a) this.f1449r, (InterfaceC1231l) this.f1445n, (InterfaceC1231l) this.f1450s, (C1836h0) obj, AbstractC1874r.m4617C(905969665));
                break;
            case 4:
                String str14 = (String) this.f1446o;
                InterfaceC1231l interfaceC1231l7 = (InterfaceC1231l) this.f1439h;
                String str15 = (String) this.f1440i;
                InterfaceC1231l interfaceC1231l8 = (InterfaceC1231l) this.f1441j;
                String str16 = (String) this.f1442k;
                String str17 = (String) this.f1443l;
                InterfaceC1231l interfaceC1231l9 = (InterfaceC1231l) this.f1444m;
                String str18 = (String) this.f1445n;
                InterfaceC1231l interfaceC1231l10 = (InterfaceC1231l) this.f1448q;
                InterfaceC1220a interfaceC1220a17 = (InterfaceC1220a) this.f1447p;
                String str19 = (String) this.f1449r;
                InterfaceC1231l interfaceC1231l11 = (InterfaceC1231l) this.f1450s;
                C1836h0 c1836h06 = (C1836h0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                C5491y2 c5491y2 = C5491y2.f22066n;
                if (c1836h06.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    str14.getClass();
                    switch (str14.hashCode()) {
                        case -2131439764:
                            str = !str14.equals("anthropic") ? "OpenAI 兼容" : "Anthropic";
                            str2 = str14;
                            break;
                        case -1581359199:
                            if (!str14.equals("custom_url")) {
                                str = "OpenAI 兼容";
                                str2 = str14;
                            } else {
                                str2 = str14;
                                str = "自定义请求链接";
                            }
                            break;
                        case -1249537483:
                            if (!str14.equals("gemini")) {
                                str = "OpenAI 兼容";
                                str2 = str14;
                            } else {
                                str2 = str14;
                                str = "Gemini";
                            }
                            break;
                        case -1010579470:
                            if (!str14.equals("openai")) {
                                str = "OpenAI 兼容";
                                str2 = str14;
                            } else {
                                str2 = str14;
                                str = "OpenAI";
                            }
                            break;
                        case 629437796:
                            str = !str14.equals("deepseek") ? "OpenAI 兼容" : "DeepSeek";
                            str2 = str14;
                            break;
                        case 1231576595:
                            if (!str14.equals("openrouter")) {
                                str = "OpenAI 兼容";
                                str2 = str14;
                            } else {
                                str2 = str14;
                                str = "OpenRouter";
                            }
                            break;
                        case 1975967741:
                            if (!str14.equals("siliconflow")) {
                                str = "OpenAI 兼容";
                                str2 = str14;
                            } else {
                                str2 = str14;
                                str = "硅基流动";
                            }
                            break;
                        default:
                            str = "OpenAI 兼容";
                            str2 = str14;
                            break;
                    }
                    String str20 = str2;
                    AbstractC4955ho.m9353I2("接口类型", str, AbstractC0000a.m101y0(new C4825dq("openai_compatible", "OpenAI 兼容"), new C4825dq("openai", "OpenAI"), new C4825dq("deepseek", "DeepSeek"), new C4825dq("openrouter", "OpenRouter"), new C4825dq("siliconflow", "硅基流动"), new C4825dq("gemini", "Gemini"), new C4825dq("anthropic", "Anthropic"), new C4825dq("custom_url", "自定义请求链接")), str20, interfaceC1231l7, false, c1836h06, 6, 32);
                    AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                    String str21 = str20.equals("custom_url") ? "请求链接" : "API 地址";
                    int iHashCode = str20.hashCode();
                    if (iHashCode == -2131439764) {
                        if (str20.equals("anthropic")) {
                            str3 = "自动补全 /v1/messages";
                        }
                        AbstractC4955ho.m9304C1(str21, str3, str15, 0, interfaceC1231l8, c1836h06, 0, 8);
                        if (AbstractC3149m.m6721t0(str16)) {
                        }
                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                        AbstractC4955ho.m9304C1("API Key", "留空表示接口不需要密钥", str17, 0, interfaceC1231l9, c1836h06, 54, 8);
                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                        AbstractC4955ho.m9304C1("模型", "填写服务端可用的模型名称", str18, 0, interfaceC1231l10, c1836h06, 54, 8);
                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                        zM4534f = c1836h06.m4534f(interfaceC1220a17);
                        objM4514P = c1836h06.m4514P();
                        if (zM4534f) {
                        }
                    } else if (iHashCode != -1581359199) {
                        str3 = (iHashCode == -1249537483 && str20.equals("gemini")) ? "自动补全 Gemini 模型与 generateContent 请求路径" : "可填写域名、/v1 地址或完整 /chat/completions 地址";
                        AbstractC4955ho.m9304C1(str21, str3, str15, 0, interfaceC1231l8, c1836h06, 0, 8);
                        if (AbstractC3149m.m6721t0(str16)) {
                            c1836h06.m4525a0(-1968534940);
                            c1836h06.m4553p(false);
                        } else {
                            c1836h06.m4525a0(-1968666597);
                            AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                            c5491y2.m9877V(str16, c1836h06, 48);
                            c1836h06.m4553p(false);
                        }
                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                        AbstractC4955ho.m9304C1("API Key", "留空表示接口不需要密钥", str17, 0, interfaceC1231l9, c1836h06, 54, 8);
                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                        AbstractC4955ho.m9304C1("模型", "填写服务端可用的模型名称", str18, 0, interfaceC1231l10, c1836h06, 54, 8);
                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                        zM4534f = c1836h06.m4534f(interfaceC1220a17);
                        objM4514P = c1836h06.m4514P();
                        if (zM4534f || objM4514P == C1851l.f6155a) {
                            objM4514P = new C5040kc(interfaceC1220a17, 28);
                            c1836h06.m4545k0(objM4514P);
                        }
                        AbstractC4955ho.m9503b("拉取模型列表", "从当前 API 地址获取", (InterfaceC1220a) objM4514P, c1836h06, 54);
                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                        AbstractC4955ho.m9353I2("提示缓存", !AbstractC1416l.m3825a(str20, "gemini") ? "Gemini 不使用 OpenAI 或 Anthropic 的显式缓存字段" : AbstractC1416l.m3825a(str19, "force") ? "向兼容接口发送稳定缓存标识，不支持时自动回退" : AbstractC1416l.m3825a(str19, "off") ? "不发送显式缓存字段" : "官方接口显式缓存，其他接口使用服务端默认策略", AbstractC0000a.m101y0(new C4825dq("auto", "自动"), new C4825dq("force", "强制"), new C4825dq("off", "关闭")), str19, interfaceC1231l11, false, c1836h06, 6, 32);
                    } else {
                        if (str20.equals("custom_url")) {
                            str3 = "手动填写完整 URL，不会自动补全或改写";
                        }
                        AbstractC4955ho.m9304C1(str21, str3, str15, 0, interfaceC1231l8, c1836h06, 0, 8);
                        if (AbstractC3149m.m6721t0(str16)) {
                        }
                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                        AbstractC4955ho.m9304C1("API Key", "留空表示接口不需要密钥", str17, 0, interfaceC1231l9, c1836h06, 54, 8);
                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                        AbstractC4955ho.m9304C1("模型", "填写服务端可用的模型名称", str18, 0, interfaceC1231l10, c1836h06, 54, 8);
                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                        zM4534f = c1836h06.m4534f(interfaceC1220a17);
                        objM4514P = c1836h06.m4514P();
                        if (zM4534f) {
                            objM4514P = new C5040kc(interfaceC1220a17, 28);
                            c1836h06.m4545k0(objM4514P);
                            AbstractC4955ho.m9503b("拉取模型列表", "从当前 API 地址获取", (InterfaceC1220a) objM4514P, c1836h06, 54);
                            AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                            AbstractC4955ho.m9353I2("提示缓存", !AbstractC1416l.m3825a(str20, "gemini") ? "Gemini 不使用 OpenAI 或 Anthropic 的显式缓存字段" : AbstractC1416l.m3825a(str19, "force") ? "向兼容接口发送稳定缓存标识，不支持时自动回退" : AbstractC1416l.m3825a(str19, "off") ? "不发送显式缓存字段" : "官方接口显式缓存，其他接口使用服务端默认策略", AbstractC0000a.m101y0(new C4825dq("auto", "自动"), new C4825dq("force", "强制"), new C4825dq("off", "关闭")), str19, interfaceC1231l11, false, c1836h06, 6, 32);
                        }
                    }
                } else {
                    c1836h06.m4519V();
                }
                return C3967n.f12976a;
            case 5:
                Context context3 = (Context) this.f1446o;
                InterfaceC1809a1 interfaceC1809a132 = (InterfaceC1809a1) this.f1439h;
                InterfaceC1809a1 interfaceC1809a133 = (InterfaceC1809a1) this.f1440i;
                InterfaceC1809a1 interfaceC1809a134 = (InterfaceC1809a1) this.f1441j;
                InterfaceC1809a1 interfaceC1809a135 = (InterfaceC1809a1) this.f1442k;
                InterfaceC1809a1 interfaceC1809a136 = (InterfaceC1809a1) this.f1443l;
                InterfaceC1809a1 interfaceC1809a137 = (InterfaceC1809a1) this.f1444m;
                InterfaceC1809a1 interfaceC1809a138 = (InterfaceC1809a1) this.f1445n;
                InterfaceC1809a1 interfaceC1809a139 = (InterfaceC1809a1) this.f1447p;
                InterfaceC1809a1 interfaceC1809a140 = (InterfaceC1809a1) this.f1448q;
                InterfaceC1809a1 interfaceC1809a141 = (InterfaceC1809a1) this.f1449r;
                InterfaceC1809a1 interfaceC1809a142 = (InterfaceC1809a1) this.f1450s;
                String str22 = (String) obj;
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                str22.getClass();
                List list5 = (List) interfaceC1809a132.getValue();
                ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(list5));
                Iterator it = list5.iterator();
                while (it.hasNext()) {
                    C1168r0 c1168r0 = (C1168r0) it.next();
                    Iterator it2 = it;
                    if (c1168r0.f3897a.equals(str22)) {
                        arrayList = arrayList2;
                        c1168r0M2981a = C1168r0.m2981a(c1168r0, null, null, zBooleanValue3, null, null, 27);
                    } else {
                        ArrayList arrayList3 = arrayList2;
                        c1168r0M2981a = c1168r0;
                        arrayList = arrayList3;
                    }
                    arrayList.add(c1168r0M2981a);
                    it = it2;
                    arrayList2 = arrayList;
                }
                ArrayList arrayList4 = arrayList2;
                interfaceC1809a132.setValue(arrayList4);
                C1186w.m3239w(context3, C1183v.m3168a(C5491y2.m9768B0(interfaceC1809a133, interfaceC1809a134, interfaceC1809a135, interfaceC1809a136, interfaceC1809a132, interfaceC1809a137, interfaceC1809a138, interfaceC1809a139, interfaceC1809a140, interfaceC1809a141), null, null, null, arrayList4, 0, false, null, null, null, 2031));
                AbstractC3199a.m6848u((Number) interfaceC1809a142.getValue(), 1, interfaceC1809a142);
                break;
            default:
                ((Integer) obj2).getClass();
                ((C5491y2) this.f1446o).m9879X((List) this.f1439h, (String) this.f1440i, (LinkedHashSet) this.f1441j, (InterfaceC1220a) this.f1447p, (InterfaceC1231l) this.f1442k, (InterfaceC1235p) this.f1443l, (InterfaceC1231l) this.f1444m, (InterfaceC1235p) this.f1445n, (InterfaceC1235p) this.f1449r, (InterfaceC1231l) this.f1450s, (InterfaceC1220a) this.f1448q, (C1836h0) obj, AbstractC1874r.m4617C(3073));
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C0485s0(Context context, InterfaceC4544a interfaceC4544a, SharedPreferences sharedPreferences, List list, Set set, Set set2, C3641z c3641z, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, InterfaceC1220a interfaceC1220a3, InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2, int i9) {
        this.f1438g = 3;
        this.f1446o = context;
        this.f1439h = interfaceC4544a;
        this.f1440i = sharedPreferences;
        this.f1441j = list;
        this.f1442k = set;
        this.f1443l = set2;
        this.f1444m = c3641z;
        this.f1447p = interfaceC1220a;
        this.f1448q = interfaceC1220a2;
        this.f1449r = interfaceC1220a3;
        this.f1445n = interfaceC1231l;
        this.f1450s = interfaceC1231l2;
    }

    public /* synthetic */ C0485s0(AbstractC0473o2 abstractC0473o2, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1220a interfaceC1220a, Activity activity, InterfaceC1220a interfaceC1220a2, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1220a interfaceC1220a3) {
        this.f1438g = 0;
        this.f1446o = abstractC0473o2;
        this.f1439h = interfaceC1809a1;
        this.f1440i = interfaceC1809a12;
        this.f1441j = interfaceC1809a13;
        this.f1447p = interfaceC1220a;
        this.f1450s = activity;
        this.f1448q = interfaceC1220a2;
        this.f1442k = interfaceC1809a14;
        this.f1443l = interfaceC1809a15;
        this.f1444m = interfaceC1809a16;
        this.f1445n = interfaceC1809a17;
        this.f1449r = interfaceC1220a3;
    }

    public /* synthetic */ C0485s0(Object obj, Object obj2, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, int i9) {
        this.f1438g = i9;
        this.f1446o = obj;
        this.f1447p = obj2;
        this.f1439h = interfaceC1809a1;
        this.f1440i = interfaceC1809a12;
        this.f1441j = interfaceC1809a13;
        this.f1442k = interfaceC1809a14;
        this.f1443l = interfaceC1809a15;
        this.f1444m = interfaceC1809a16;
        this.f1445n = interfaceC1809a17;
        this.f1448q = interfaceC1809a18;
        this.f1449r = interfaceC1809a19;
        this.f1450s = interfaceC1809a110;
    }

    public /* synthetic */ C0485s0(String str, InterfaceC1231l interfaceC1231l, String str2, InterfaceC1231l interfaceC1231l2, String str3, String str4, InterfaceC1231l interfaceC1231l3, String str5, InterfaceC1231l interfaceC1231l4, InterfaceC1220a interfaceC1220a, String str6, InterfaceC1231l interfaceC1231l5) {
        this.f1438g = 4;
        this.f1446o = str;
        this.f1439h = interfaceC1231l;
        this.f1440i = str2;
        this.f1441j = interfaceC1231l2;
        this.f1442k = str3;
        this.f1443l = str4;
        this.f1444m = interfaceC1231l3;
        this.f1445n = str5;
        this.f1448q = interfaceC1231l4;
        this.f1447p = interfaceC1220a;
        this.f1449r = str6;
        this.f1450s = interfaceC1231l5;
    }

    public /* synthetic */ C0485s0(C5491y2 c5491y2, List list, String str, LinkedHashSet linkedHashSet, InterfaceC1220a interfaceC1220a, InterfaceC1231l interfaceC1231l, InterfaceC1235p interfaceC1235p, InterfaceC1231l interfaceC1231l2, InterfaceC1235p interfaceC1235p2, InterfaceC1235p interfaceC1235p3, InterfaceC1231l interfaceC1231l3, InterfaceC1220a interfaceC1220a2, int i9) {
        this.f1438g = 6;
        this.f1446o = c5491y2;
        this.f1439h = list;
        this.f1440i = str;
        this.f1441j = linkedHashSet;
        this.f1447p = interfaceC1220a;
        this.f1442k = interfaceC1231l;
        this.f1443l = interfaceC1235p;
        this.f1444m = interfaceC1231l2;
        this.f1445n = interfaceC1235p2;
        this.f1449r = interfaceC1235p3;
        this.f1450s = interfaceC1231l3;
        this.f1448q = interfaceC1220a2;
    }
}
