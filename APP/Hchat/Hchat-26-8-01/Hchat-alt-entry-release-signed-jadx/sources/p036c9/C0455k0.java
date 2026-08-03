package p036c9;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import ci.C0575c;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p000a.AbstractC0000a;
import p011ab.C0045e;
import p015b0.C0153s;
import p020b5.C0192k;
import p028c1.AbstractC0378h;
import p065eb.C0884o;
import p070f0.C0978j;
import p071f1.AbstractC1027s;
import p071f1.C1030t0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p119i2.C1926g;
import p119i2.C1939m0;
import p136j8.C2098i;
import p158l.AbstractC2412c;
import p158l.C2413d;
import p158l.C2414e;
import p190n2.C2884s;
import p197n9.C2912a;
import p201o.AbstractC3026b;
import p218og.AbstractC3149m;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.C3272z0;
import p222p.InterfaceC3268x0;
import p251r.C3619d;
import p251r.C3641z;
import p253r1.AbstractC3649f;
import p266s0.AbstractC3879i;
import p276sf.C3967n;
import p276sf.InterfaceC3955b;
import p315v8.C4521a;
import p317vb.InterfaceC4544a;
import p321w.C4629q0;
import p332wb.AbstractC4955ho;
import p332wb.C4737b3;
import p332wb.C4770c3;
import p332wb.C4969i5;
import p332wb.C5006jb;
import p332wb.C5068l7;
import p332wb.C5070l9;
import p332wb.C5071la;
import p332wb.C5132n5;
import p332wb.C5161o1;
import p332wb.C5205pc;
import p332wb.C5304sc;
import p332wb.EnumC4704a3;
import p345x8.C5709b;
import p345x8.C5728u;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import p357y1.AbstractC5888h1;
import p357y1.C5944v1;
import p357y1.InterfaceC5917o2;
import sh.C4056v1;
import sh.C4060x;
import th.InterfaceC4209a;

/* JADX INFO: renamed from: c9.k0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0455k0 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1334g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f1335h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f1336i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f1337j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1338k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0455k0(String str, C4969i5 c4969i5, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12) {
        this.f1334g = 10;
        this.f1336i = str;
        this.f1337j = c4969i5;
        this.f1335h = interfaceC1809a1;
        this.f1338k = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    private final Object m1476e(Object obj, Object obj2, Object obj3) {
        C4060x c4060x = (C4060x) this.f1337j;
        InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f1336i;
        InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f1335h;
        InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f1338k;
        InterfaceC3268x0 interfaceC3268x0 = (InterfaceC3268x0) obj;
        C1836h0 c1836h0 = (C1836h0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        interfaceC3268x0.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= c1836h0.m4534f(interfaceC3268x0) ? 4 : 2;
        }
        if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 19) != 18)) {
            InterfaceC5853o interfaceC5853oM7631a = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x.f13440e, null);
            C3272z0 c3272z0M6872b = AbstractC3208d.m6872b(interfaceC3268x0.mo6924c() + 8, interfaceC3268x0.mo6922a() + 84, 5);
            boolean zM4534f = c1836h0.m4534f(interfaceC1809a1) | c1836h0.m4534f(interfaceC1809a12) | c1836h0.m4534f(interfaceC1220a);
            Object objM4514P = c1836h0.m4514P();
            if (zM4534f || objM4514P == C1851l.f6155a) {
                objM4514P = new C0153s(interfaceC1220a, interfaceC1809a1, interfaceC1809a12, 25);
                c1836h0.m4545k0(objM4514P);
            }
            AbstractC0000a.m53b(interfaceC5853oM7631a, null, c3272z0M6872b, null, null, null, false, null, (InterfaceC1231l) objM4514P, c1836h0, 0, 506);
        } else {
            c1836h0.m4519V();
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        Object objM1341f;
        String str;
        switch (this.f1334g) {
            case 0:
                C0424c1 c0424c1 = (C0424c1) this.f1337j;
                String str2 = (String) this.f1336i;
                AbstractC0473o2 abstractC0473o2 = (AbstractC0473o2) this.f1335h;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f1338k;
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    C0452j1 c0452j1 = C0452j1.f1326a;
                    String str3 = c0424c1.f1217b;
                    String str4 = c0424c1.f1218c;
                    int i9 = c0424c1.f1219d;
                    boolean zM3825a = AbstractC1416l.m3825a(str2, c0424c1.f1216a);
                    boolean zM4538h = c1836h0.m4538h(abstractC0473o2) | c1836h0.m4534f(str2) | c1836h0.m4534f(c0424c1) | c1836h0.m4534f(interfaceC1231l);
                    Object objM4514P = c1836h0.m4514P();
                    if (zM4538h || objM4514P == C1851l.f6155a) {
                        C0467n0 c0467n0 = new C0467n0((Object) abstractC0473o2, (Object) str2, (Object) c0424c1, (Object) interfaceC1231l, 0);
                        c1836h0.m4545k0(c0467n0);
                        objM4514P = c0467n0;
                    }
                    c0452j1.m1468i(i9, 196608, (InterfaceC1220a) objM4514P, c1836h0, str3, str4, zM3825a);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 1:
                Activity activity = (Activity) this.f1337j;
                AbstractC0473o2 abstractC0473o22 = (AbstractC0473o2) this.f1335h;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f1338k;
                String str5 = (String) this.f1336i;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) obj;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                interfaceC1220a2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c1836h02.m4538h(interfaceC1220a2) ? 4 : 2;
                }
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    int i10 = iIntValue2;
                    C0452j1 c0452j12 = C0452j1.f1326a;
                    boolean zM4538h2 = c1836h02.m4538h(activity) | c1836h02.m4534f(str5) | c1836h02.m4534f(interfaceC1220a);
                    Object objM4514P2 = c1836h02.m4514P();
                    if (zM4538h2 || objM4514P2 == C1851l.f6155a) {
                        objM4514P2 = new C0045e(activity, str5, interfaceC1220a, 1);
                        c1836h02.m4545k0(objM4514P2);
                    }
                    c0452j12.m1471l(activity, abstractC0473o22, interfaceC1220a2, interfaceC1220a, (InterfaceC1220a) objM4514P2, c1836h02, ((i10 << 6) & 896) | 196608);
                } else {
                    c1836h02.m4519V();
                }
                break;
            case 2:
                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f1337j;
                C2414e c2414e = (C2414e) this.f1336i;
                InterfaceC1236q interfaceC1236q = (InterfaceC1236q) this.f1335h;
                InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) this.f1338k;
                C2413d c2413d = (C2413d) obj;
                C1836h0 c1836h03 = (C1836h0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= c1836h03.m4534f(c2413d) ? 4 : 2;
                }
                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    String str6 = (String) interfaceC1235p.invoke(c1836h03, 0);
                    if (AbstractC3149m.m6721t0(str6)) {
                        AbstractC3026b.m6430c("Label must not be blank");
                    }
                    c2414e.getClass();
                    AbstractC2412c.f7886a.mo3356a(str6, Boolean.TRUE, c2413d, interfaceC1236q, interfaceC1220a3, c1836h03, Integer.valueOf((iIntValue3 << 9) & 7168));
                } else {
                    c1836h03.m4519V();
                }
                break;
            case 3:
                AbstractC1027s abstractC1027s = (AbstractC1027s) this.f1337j;
                C4629q0 c4629q0 = (C4629q0) this.f1336i;
                C2884s c2884s = (C2884s) this.f1335h;
                C0192k c0192k = (C0192k) this.f1338k;
                InterfaceC5853o interfaceC5853o = (InterfaceC5853o) obj;
                C1836h0 c1836h04 = (C1836h0) obj2;
                ((Integer) obj3).getClass();
                c1836h04.m4525a0(-84507373);
                boolean zBooleanValue = ((Boolean) c1836h04.m4542j(AbstractC5888h1.f23942x)).booleanValue();
                boolean zM4536g = c1836h04.m4536g(zBooleanValue);
                Object objM4514P3 = c1836h04.m4514P();
                C1823e c1823e = C1851l.f6155a;
                if (zM4536g || objM4514P3 == c1823e) {
                    objM4514P3 = new C0978j(zBooleanValue);
                    c1836h04.m4545k0(objM4514P3);
                }
                C0978j c0978j = (C0978j) objM4514P3;
                boolean z9 = ((abstractC1027s instanceof C1030t0) && ((C1030t0) abstractC1027s).f3253a == 16) ? false : true;
                if (((Boolean) ((C5944v1) ((InterfaceC5917o2) c1836h04.m4542j(AbstractC5888h1.f23939u))).f24166c.getValue()).booleanValue() && c4629q0.m9049b() && C1939m0.m4813c(c2884s.f9317b) && z9) {
                    c1836h04.m4525a0(-707487962);
                    C1926g c1926g = c2884s.f9316a;
                    C1939m0 c1939m0 = new C1939m0(c2884s.f9317b);
                    boolean zM4538h3 = c1836h04.m4538h(c0978j);
                    Object objM4514P4 = c1836h04.m4514P();
                    if (zM4538h3 || objM4514P4 == c1823e) {
                        objM4514P4 = new C0575c(c0978j, null, 11);
                        c1836h04.m4545k0(objM4514P4);
                    }
                    AbstractC1874r.m4625g(c1926g, c1939m0, (InterfaceC1235p) objM4514P4, c1836h04);
                    boolean zM4538h4 = c1836h04.m4538h(c0978j) | c1836h04.m4538h(c0192k) | c1836h04.m4534f(c2884s) | c1836h04.m4538h(c4629q0) | c1836h04.m4534f(abstractC1027s);
                    Object objM4514P5 = c1836h04.m4514P();
                    if (zM4538h4 || objM4514P5 == c1823e) {
                        C0884o c0884o = new C0884o(c0978j, c0192k, c2884s, c4629q0, abstractC1027s, 5);
                        c1836h04.m4545k0(c0884o);
                        objM4514P5 = c0884o;
                    }
                    objM1341f = AbstractC0378h.m1341f(interfaceC5853o, (InterfaceC1231l) objM4514P5);
                    c1836h04.m4553p(false);
                } else {
                    c1836h04.m4525a0(-705473241);
                    c1836h04.m4553p(false);
                    objM1341f = C5850l.f23787a;
                }
                c1836h04.m4553p(false);
                break;
            case 4:
                C0414a c0414a = (C0414a) this.f1337j;
                Context context = (Context) this.f1336i;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f1338k;
                InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) this.f1335h;
                C1836h0 c1836h05 = (C1836h0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h05.m4516S(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    boolean zM4538h5 = c1836h05.m4538h(c0414a) | c1836h05.m4538h(context) | c1836h05.m4534f(interfaceC1231l2);
                    Object objM4514P6 = c1836h05.m4514P();
                    if (zM4538h5 || objM4514P6 == C1851l.f6155a) {
                        objM4514P6 = new C0045e(c0414a, context, interfaceC1231l2, 15);
                        c1836h05.m4545k0(objM4514P6);
                    }
                    AbstractC4955ho.m9382M("保存分组", (InterfaceC1220a) objM4514P6, "返回", interfaceC1220a4, null, null, c1836h05, 390, 48);
                } else {
                    c1836h05.m4519V();
                }
                break;
            case 5:
                C4060x c4060x = (C4060x) this.f1337j;
                List list = (List) this.f1336i;
                List list2 = (List) this.f1335h;
                InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) this.f1338k;
                InterfaceC3268x0 interfaceC3268x0 = (InterfaceC3268x0) obj;
                C1836h0 c1836h06 = (C1836h0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                interfaceC3268x0.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= c1836h06.m4534f(interfaceC3268x0) ? 4 : 2;
                }
                if (c1836h06.m4516S(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x.f13440e, null);
                    C3272z0 c3272z0M6872b = AbstractC3208d.m6872b(interfaceC3268x0.mo6924c() + 8, interfaceC3268x0.mo6922a() + 84, 5);
                    boolean zM4538h6 = c1836h06.m4538h(list) | c1836h06.m4538h(list2) | c1836h06.m4534f(interfaceC1231l3);
                    Object objM4514P7 = c1836h06.m4514P();
                    if (zM4538h6 || objM4514P7 == C1851l.f6155a) {
                        objM4514P7 = new C0153s(list, list2, interfaceC1231l3, 26);
                        c1836h06.m4545k0(objM4514P7);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a, null, c3272z0M6872b, null, null, null, false, null, (InterfaceC1231l) objM4514P7, c1836h06, 0, 506);
                } else {
                    c1836h06.m4519V();
                }
                break;
            case 6:
                InterfaceC4544a interfaceC4544a = (InterfaceC4544a) this.f1337j;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f1335h;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f1338k;
                String str7 = (String) this.f1336i;
                C1836h0 c1836h07 = (C1836h0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h07.m4516S(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(480434050, new C0479q0(interfaceC4544a, interfaceC1809a1, sharedPreferences, str7, 12), c1836h07), c1836h07, 48, 1);
                } else {
                    c1836h07.m4519V();
                }
                break;
            case 7:
                ArrayList arrayList = (ArrayList) this.f1337j;
                Context context2 = (Context) this.f1336i;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f1335h;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f1338k;
                C1836h0 c1836h08 = (C1836h0) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h08.m4516S(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1744380028, new C0479q0(arrayList, context2, interfaceC1809a12, interfaceC1809a13, 13), c1836h08), c1836h08, 48, 1);
                } else {
                    c1836h08.m4519V();
                }
                break;
            case 8:
                Context context3 = (Context) this.f1337j;
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.f1336i;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f1335h;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f1338k;
                C1836h0 c1836h09 = (C1836h0) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h09.m4516S(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1029765101, new C5304sc(0, context3, sharedPreferences2, interfaceC1809a14, interfaceC1809a15), c1836h09), c1836h09, 48, 1);
                } else {
                    c1836h09.m4519V();
                }
                break;
            case 9:
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f1337j;
                Context context4 = (Context) this.f1336i;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f1335h;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f1338k;
                C1836h0 c1836h010 = (C1836h0) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h010.m4516S(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    boolean zM4534f = c1836h010.m4534f(interfaceC1809a16) | c1836h010.m4538h(context4);
                    Object objM4514P8 = c1836h010.m4514P();
                    C1823e c1823e2 = C1851l.f6155a;
                    if (zM4534f || objM4514P8 == c1823e2) {
                        objM4514P8 = new C5205pc(context4, interfaceC1809a17, interfaceC1809a16, 0);
                        c1836h010.m4545k0(objM4514P8);
                    }
                    InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) objM4514P8;
                    Object objM4514P9 = c1836h010.m4514P();
                    if (objM4514P9 == c1823e2) {
                        objM4514P9 = new C5070l9(interfaceC1809a18, 18);
                        c1836h010.m4545k0(objM4514P9);
                    }
                    AbstractC4955ho.m9382M("使用所选模型", interfaceC1220a5, "返回", (InterfaceC1220a) objM4514P9, null, null, c1836h010, 3462, 48);
                } else {
                    c1836h010.m4519V();
                }
                break;
            case 10:
                String str8 = (String) this.f1336i;
                C4969i5 c4969i5 = (C4969i5) this.f1337j;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f1335h;
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) this.f1338k;
                C1836h0 c1836h011 = (C1836h0) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h011.m4516S(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(589089241, new C0479q0(str8, c4969i5, interfaceC1809a19, interfaceC1809a110, 16), c1836h011), c1836h011, 48, 1);
                } else {
                    c1836h011.m4519V();
                }
                break;
            case 11:
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) this.f1337j;
                Set set = (Set) this.f1336i;
                InterfaceC1231l interfaceC1231l4 = (InterfaceC1231l) this.f1338k;
                C2912a c2912a = (C2912a) this.f1335h;
                C1836h0 c1836h012 = (C1836h0) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h012.m4516S(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(809792443, new C0479q0(interfaceC1809a111, set, interfaceC1231l4, c2912a, 14), c1836h012), c1836h012, 48, 1);
                } else {
                    c1836h012.m4519V();
                }
                break;
            case 12:
                C4521a c4521a = (C4521a) this.f1337j;
                InterfaceC1235p interfaceC1235p2 = (InterfaceC1235p) this.f1336i;
                Context context5 = (Context) this.f1335h;
                InterfaceC1231l interfaceC1231l5 = (InterfaceC1231l) this.f1338k;
                C1836h0 c1836h013 = (C1836h0) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h013.m4516S(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1565918383, new C0479q0(c4521a, interfaceC1235p2, context5, interfaceC1231l5, 15), c1836h013), c1836h013, 48, 1);
                } else {
                    c1836h013.m4519V();
                }
                break;
            case 13:
                ArrayList arrayList2 = (ArrayList) this.f1337j;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) this.f1336i;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) this.f1335h;
                InterfaceC1809a1 interfaceC1809a114 = (InterfaceC1809a1) this.f1338k;
                C1836h0 c1836h014 = (C1836h0) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h014.m4516S(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    if (((Boolean) interfaceC1809a112.getValue()).booleanValue()) {
                        str = ((EnumC4704a3) interfaceC1809a113.getValue()).f15709g + "收藏 · " + arrayList2.size() + " 项 · 后台加载中（" + ((List) interfaceC1809a114.getValue()).size() + "）";
                    } else {
                        str = ((EnumC4704a3) interfaceC1809a113.getValue()).f15709g + "收藏 · " + arrayList2.size() + " / " + ((List) interfaceC1809a114.getValue()).size() + " 项";
                    }
                    AbstractC4955ho.m9321E2(str, c1836h014, 0);
                } else {
                    c1836h014.m4519V();
                }
                break;
            case 14:
                C2098i c2098i = (C2098i) this.f1337j;
                C4737b3 c4737b3 = (C4737b3) this.f1336i;
                InterfaceC1809a1 interfaceC1809a115 = (InterfaceC1809a1) this.f1335h;
                InterfaceC1809a1 interfaceC1809a116 = (InterfaceC1809a1) this.f1338k;
                C1836h0 c1836h015 = (C1836h0) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h015.m4516S(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    String strValueOf = String.valueOf(c2098i.f7019a);
                    boolean zContains = ((Set) interfaceC1809a116.getValue()).contains(strValueOf);
                    boolean z10 = c4737b3.f15965d;
                    boolean zM4534f2 = c1836h015.m4534f(interfaceC1809a115) | c1836h015.m4538h(c2098i);
                    Object objM4514P10 = c1836h015.m4514P();
                    C1823e c1823e3 = C1851l.f6155a;
                    if (zM4534f2 || objM4514P10 == c1823e3) {
                        objM4514P10 = new C5068l7(c2098i, 5, interfaceC1809a115);
                        c1836h015.m4545k0(objM4514P10);
                    }
                    InterfaceC1231l interfaceC1231l6 = (InterfaceC1231l) objM4514P10;
                    boolean zM4534f3 = c1836h015.m4534f(interfaceC1809a116) | c1836h015.m4534f(c4737b3) | c1836h015.m4534f(strValueOf);
                    Object objM4514P11 = c1836h015.m4514P();
                    if (zM4534f3 || objM4514P11 == c1823e3) {
                        objM4514P11 = new C0045e(c4737b3, strValueOf, interfaceC1809a116, 24);
                        c1836h015.m4545k0(objM4514P11);
                    }
                    AbstractC4955ho.m9287A0(c2098i, zContains, z10, interfaceC1231l6, (InterfaceC1220a) objM4514P11, c1836h015, 8);
                } else {
                    c1836h015.m4519V();
                }
                break;
            case 15:
                C5728u c5728u = (C5728u) this.f1337j;
                Context context6 = (Context) this.f1336i;
                InterfaceC1809a1 interfaceC1809a117 = (InterfaceC1809a1) this.f1335h;
                InterfaceC1809a1 interfaceC1809a118 = (InterfaceC1809a1) this.f1338k;
                C1836h0 c1836h016 = (C1836h0) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h016.m4516S(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, 0.0f, 0.0f, 8, 7), AbstractC3879i.m8071e(541210910, new C0479q0(c5728u, context6, interfaceC1809a117, interfaceC1809a118, 17), c1836h016), c1836h016, 54, 0);
                } else {
                    c1836h016.m4519V();
                }
                break;
            case 16:
                C5132n5 c5132n5 = (C5132n5) this.f1337j;
                InterfaceC1809a1 interfaceC1809a119 = (InterfaceC1809a1) this.f1336i;
                InterfaceC1809a1 interfaceC1809a120 = (InterfaceC1809a1) this.f1335h;
                InterfaceC1809a1 interfaceC1809a121 = (InterfaceC1809a1) this.f1338k;
                C1836h0 c1836h017 = (C1836h0) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h017.m4516S(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1524164037, new C5071la(c5132n5, interfaceC1809a119, interfaceC1809a120, interfaceC1809a121), c1836h017), c1836h017, 48, 1);
                } else {
                    c1836h017.m4519V();
                }
                break;
            case 17:
                C5709b c5709b = (C5709b) this.f1337j;
                InterfaceC1231l interfaceC1231l7 = (InterfaceC1231l) this.f1338k;
                InterfaceC1231l interfaceC1231l8 = (InterfaceC1231l) this.f1336i;
                InterfaceC1231l interfaceC1231l9 = (InterfaceC1231l) this.f1335h;
                C1836h0 c1836h018 = (C1836h0) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h018.m4516S(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-169970283, new C0479q0(c5709b, interfaceC1231l7, interfaceC1231l8, interfaceC1231l9, 18), c1836h018), c1836h018, 48, 1);
                } else {
                    c1836h018.m4519V();
                }
                break;
            case 18:
                C4060x c4060x2 = (C4060x) this.f1337j;
                C3641z c3641z = (C3641z) this.f1336i;
                C4770c3 c4770c3 = (C4770c3) this.f1335h;
                InterfaceC1231l interfaceC1231l10 = (InterfaceC1231l) this.f1338k;
                InterfaceC3268x0 interfaceC3268x02 = (InterfaceC3268x0) obj;
                C1836h0 c1836h019 = (C1836h0) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                interfaceC3268x02.getClass();
                if ((iIntValue18 & 6) == 0) {
                    iIntValue18 |= c1836h019.m4534f(interfaceC3268x02) ? 4 : 2;
                }
                if (c1836h019.m4516S(iIntValue18 & 1, (iIntValue18 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a2 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x2.f13440e, null);
                    C3272z0 c3272z0M6872b2 = AbstractC3208d.m6872b(interfaceC3268x02.mo6924c() + 8, interfaceC3268x02.mo6922a() + 84, 5);
                    boolean zM4538h7 = c1836h019.m4538h(c4770c3) | c1836h019.m4534f(interfaceC1231l10);
                    Object objM4514P12 = c1836h019.m4514P();
                    if (zM4538h7 || objM4514P12 == C1851l.f6155a) {
                        objM4514P12 = new C5068l7(c4770c3, 0, interfaceC1231l10);
                        c1836h019.m4545k0(objM4514P12);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a2, c3641z, c3272z0M6872b2, null, null, null, false, null, (InterfaceC1231l) objM4514P12, c1836h019, 0, 504);
                } else {
                    c1836h019.m4519V();
                }
                break;
            case 19:
                C2912a c2912a2 = (C2912a) this.f1337j;
                Context context7 = (Context) this.f1336i;
                InterfaceC1231l interfaceC1231l11 = (InterfaceC1231l) this.f1338k;
                InterfaceC1220a interfaceC1220a6 = (InterfaceC1220a) this.f1335h;
                C1836h0 c1836h020 = (C1836h0) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h020.m4516S(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    boolean zM4538h8 = c1836h020.m4538h(c2912a2) | c1836h020.m4538h(context7) | c1836h020.m4534f(interfaceC1231l11);
                    Object objM4514P13 = c1836h020.m4514P();
                    if (zM4538h8 || objM4514P13 == C1851l.f6155a) {
                        objM4514P13 = new C0045e(c2912a2, context7, interfaceC1231l11, 18);
                        c1836h020.m4545k0(objM4514P13);
                    }
                    AbstractC4955ho.m9382M("保存标签", (InterfaceC1220a) objM4514P13, "返回", interfaceC1220a6, null, null, c1836h020, 390, 48);
                } else {
                    c1836h020.m4519V();
                }
                break;
            case 20:
                Context context8 = (Context) this.f1337j;
                InterfaceC1231l interfaceC1231l12 = (InterfaceC1231l) this.f1338k;
                InterfaceC1220a interfaceC1220a7 = (InterfaceC1220a) this.f1336i;
                InterfaceC1220a interfaceC1220a8 = (InterfaceC1220a) this.f1335h;
                C1836h0 c1836h021 = (C1836h0) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h021.m4516S(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    AbstractC4955ho.m9669t3(context8, interfaceC1231l12, interfaceC1220a7, interfaceC1220a8, c1836h021, 0);
                } else {
                    c1836h021.m4519V();
                }
                break;
            case 21:
                SharedPreferences sharedPreferences3 = (SharedPreferences) this.f1337j;
                String str9 = (String) this.f1336i;
                InterfaceC4544a interfaceC4544a2 = (InterfaceC4544a) this.f1335h;
                String str10 = (String) this.f1338k;
                C1836h0 c1836h022 = (C1836h0) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h022.m4516S(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(10795692, new C0479q0(sharedPreferences3, str9, interfaceC4544a2, str10, 8), c1836h022), c1836h022, 48, 1);
                } else {
                    c1836h022.m4519V();
                }
                break;
            case 22:
                C4060x c4060x3 = (C4060x) this.f1337j;
                C3641z c3641z2 = (C3641z) this.f1336i;
                SharedPreferences sharedPreferences4 = (SharedPreferences) this.f1335h;
                InterfaceC1220a interfaceC1220a9 = (InterfaceC1220a) this.f1338k;
                InterfaceC3268x0 interfaceC3268x03 = (InterfaceC3268x0) obj;
                C1836h0 c1836h023 = (C1836h0) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                interfaceC3268x03.getClass();
                if ((iIntValue22 & 6) == 0) {
                    iIntValue22 |= c1836h023.m4534f(interfaceC3268x03) ? 4 : 2;
                }
                if (c1836h023.m4516S(iIntValue22 & 1, (iIntValue22 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a3 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x3.f13440e, null);
                    C3272z0 c3272z0M6872b3 = AbstractC3208d.m6872b(interfaceC3268x03.mo6924c() + 8, interfaceC3268x03.mo6922a() + 84, 5);
                    boolean zM4538h9 = c1836h023.m4538h(sharedPreferences4) | c1836h023.m4534f(interfaceC1220a9);
                    Object objM4514P14 = c1836h023.m4514P();
                    if (zM4538h9 || objM4514P14 == C1851l.f6155a) {
                        objM4514P14 = new C5068l7(sharedPreferences4, 2, interfaceC1220a9);
                        c1836h023.m4545k0(objM4514P14);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a3, c3641z2, c3272z0M6872b3, null, null, null, false, null, (InterfaceC1231l) objM4514P14, c1836h023, 0, 504);
                } else {
                    c1836h023.m4519V();
                }
                break;
            case 23:
                InterfaceC1231l interfaceC1231l13 = (InterfaceC1231l) this.f1338k;
                InterfaceC1809a1 interfaceC1809a122 = (InterfaceC1809a1) this.f1337j;
                InterfaceC1809a1 interfaceC1809a123 = (InterfaceC1809a1) this.f1336i;
                InterfaceC1220a interfaceC1220a10 = (InterfaceC1220a) this.f1335h;
                C1836h0 c1836h024 = (C1836h0) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h024.m4516S(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    boolean zM4534f4 = c1836h024.m4534f(interfaceC1231l13) | c1836h024.m4534f(interfaceC1809a122) | c1836h024.m4534f(interfaceC1809a123);
                    Object objM4514P15 = c1836h024.m4514P();
                    if (zM4534f4 || objM4514P15 == C1851l.f6155a) {
                        objM4514P15 = new C5006jb(interfaceC1231l13, interfaceC1809a122, interfaceC1809a123, 0);
                        c1836h024.m4545k0(objM4514P15);
                    }
                    AbstractC4955ho.m9382M("保存", (InterfaceC1220a) objM4514P15, "返回", interfaceC1220a10, null, null, c1836h024, 390, 48);
                } else {
                    c1836h024.m4519V();
                }
                break;
            case 24:
                break;
            case 25:
                InterfaceC1231l interfaceC1231l14 = (InterfaceC1231l) this.f1338k;
                InterfaceC1809a1 interfaceC1809a124 = (InterfaceC1809a1) this.f1337j;
                InterfaceC1220a interfaceC1220a11 = (InterfaceC1220a) this.f1336i;
                List list3 = (List) this.f1335h;
                C1836h0 c1836h025 = (C1836h0) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h025.m4516S(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    boolean zM4534f5 = c1836h025.m4534f(interfaceC1231l14) | c1836h025.m4534f(interfaceC1809a124);
                    Object objM4514P16 = c1836h025.m4514P();
                    C1823e c1823e4 = C1851l.f6155a;
                    if (zM4534f5 || objM4514P16 == c1823e4) {
                        objM4514P16 = new C5161o1(interfaceC1231l14, interfaceC1809a124, 1);
                        c1836h025.m4545k0(objM4514P16);
                    }
                    InterfaceC1220a interfaceC1220a12 = (InterfaceC1220a) objM4514P16;
                    String str11 = ((Set) interfaceC1809a124.getValue()).size() == list3.size() ? "取消全选" : "全选";
                    boolean zM4534f6 = c1836h025.m4534f(interfaceC1809a124) | c1836h025.m4538h(list3);
                    Object objM4514P17 = c1836h025.m4514P();
                    if (zM4534f6 || objM4514P17 == c1823e4) {
                        objM4514P17 = new C4056v1(list3, 9, interfaceC1809a124);
                        c1836h025.m4545k0(objM4514P17);
                    }
                    AbstractC4955ho.m9382M("保存", interfaceC1220a12, "返回", interfaceC1220a11, str11, (InterfaceC1220a) objM4514P17, c1836h025, 390, 0);
                } else {
                    c1836h025.m4519V();
                }
                break;
            default:
                C4060x c4060x4 = (C4060x) this.f1337j;
                C3641z c3641z3 = (C3641z) this.f1336i;
                List list4 = (List) this.f1335h;
                InterfaceC1809a1 interfaceC1809a125 = (InterfaceC1809a1) this.f1338k;
                InterfaceC3268x0 interfaceC3268x04 = (InterfaceC3268x0) obj;
                C1836h0 c1836h026 = (C1836h0) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                interfaceC3268x04.getClass();
                if ((iIntValue25 & 6) == 0) {
                    iIntValue25 |= c1836h026.m4534f(interfaceC3268x04) ? 4 : 2;
                }
                if (c1836h026.m4516S(iIntValue25 & 1, (iIntValue25 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a4 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x4.f13440e, null);
                    C3272z0 c3272z0M6872b4 = AbstractC3208d.m6872b(interfaceC3268x04.mo6924c() + 8, interfaceC3268x04.mo6922a() + 84, 5);
                    boolean zM4538h10 = c1836h026.m4538h(list4) | c1836h026.m4534f(interfaceC1809a125);
                    Object objM4514P18 = c1836h026.m4514P();
                    if (zM4538h10 || objM4514P18 == C1851l.f6155a) {
                        objM4514P18 = new C5068l7(list4, 1, interfaceC1809a125);
                        c1836h026.m4545k0(objM4514P18);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a4, c3641z3, c3272z0M6872b4, null, null, null, false, null, (InterfaceC1231l) objM4514P18, c1836h026, 0, 504);
                } else {
                    c1836h026.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C0455k0(InterfaceC1235p interfaceC1235p, C2414e c2414e, InterfaceC1236q interfaceC1236q, InterfaceC1220a interfaceC1220a) {
        this.f1334g = 2;
        this.f1337j = interfaceC1235p;
        this.f1336i = c2414e;
        this.f1335h = interfaceC1236q;
        this.f1338k = interfaceC1220a;
    }

    public /* synthetic */ C0455k0(Object obj, InterfaceC1231l interfaceC1231l, InterfaceC3955b interfaceC3955b, InterfaceC3955b interfaceC3955b2, int i9) {
        this.f1334g = i9;
        this.f1337j = obj;
        this.f1338k = interfaceC1231l;
        this.f1336i = interfaceC3955b;
        this.f1335h = interfaceC3955b2;
    }

    public /* synthetic */ C0455k0(Object obj, Object obj2, InterfaceC1231l interfaceC1231l, Object obj3, int i9) {
        this.f1334g = i9;
        this.f1337j = obj;
        this.f1336i = obj2;
        this.f1338k = interfaceC1231l;
        this.f1335h = obj3;
    }

    public /* synthetic */ C0455k0(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.f1334g = i9;
        this.f1337j = obj;
        this.f1336i = obj2;
        this.f1335h = obj3;
        this.f1338k = obj4;
    }

    public /* synthetic */ C0455k0(Object obj, String str, Object obj2, Object obj3, int i9) {
        this.f1334g = i9;
        this.f1337j = obj;
        this.f1335h = obj2;
        this.f1338k = obj3;
        this.f1336i = str;
    }

    public /* synthetic */ C0455k0(InterfaceC1231l interfaceC1231l, InterfaceC1809a1 interfaceC1809a1, Object obj, Object obj2, int i9) {
        this.f1334g = i9;
        this.f1338k = interfaceC1231l;
        this.f1337j = interfaceC1809a1;
        this.f1336i = obj;
        this.f1335h = obj2;
    }
}
