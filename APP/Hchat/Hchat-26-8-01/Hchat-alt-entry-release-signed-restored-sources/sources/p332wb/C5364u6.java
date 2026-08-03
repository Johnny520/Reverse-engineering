package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;
import java.util.Set;
import p000a.AbstractC0000a;
import p036c9.C0467n0;
import p049d9.C0747h;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1236q;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.C3272z0;
import p222p.InterfaceC3268x0;
import p251r.C3619d;
import p251r.C3641z;
import p253r1.AbstractC3649f;
import p266s0.AbstractC3879i;
import p276sf.C3967n;
import p356y0.InterfaceC5853o;
import sh.C4060x;
import th.InterfaceC4209a;

/* JADX INFO: renamed from: wb.u6 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5364u6 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20993g = 4;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f20994h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f20995i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f20996j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f20997k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f20998l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f20999m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5364u6(C4060x c4060x, C3641z c3641z, SharedPreferences sharedPreferences, boolean z9, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12) {
        this.f20995i = c4060x;
        this.f20997k = c3641z;
        this.f20998l = sharedPreferences;
        this.f20994h = z9;
        this.f20996j = interfaceC1809a1;
        this.f20999m = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        String str;
        switch (this.f20993g) {
            case 0:
                C4737b3 c4737b3 = (C4737b3) this.f20995i;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f20996j;
                Context context = (Context) this.f20997k;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f20998l;
                Set set = (Set) this.f20999m;
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zM4534f = c1836h0.m4534f(c4737b3) | c1836h0.m4534f(interfaceC1809a1) | c1836h0.m4538h(context) | c1836h0.m4534f(interfaceC1220a);
                    Object objM4514P = c1836h0.m4514P();
                    C1823e c1823e = C1851l.f6155a;
                    if (zM4534f || objM4514P == c1823e) {
                        C0467n0 c0467n0 = new C0467n0(c4737b3, context, interfaceC1220a, interfaceC1809a1, 12);
                        c1836h0.m4545k0(c0467n0);
                        objM4514P = c0467n0;
                    }
                    InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) objM4514P;
                    boolean z9 = c4737b3.f15965d;
                    boolean z10 = this.f20994h;
                    InterfaceC1220a interfaceC1220a3 = null;
                    if (!z9 || set.isEmpty()) {
                        str = null;
                    } else {
                        str = z10 ? "取消全选" : "全选";
                    }
                    if (!c4737b3.f15965d || set.isEmpty()) {
                        c1836h0.m4525a0(-654806205);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(-655094133);
                        boolean zM4534f2 = c1836h0.m4534f(interfaceC1809a1) | c1836h0.m4536g(z10) | c1836h0.m4538h(set);
                        Object objM4514P2 = c1836h0.m4514P();
                        if (zM4534f2 || objM4514P2 == c1823e) {
                            objM4514P2 = new C5194p1(z10, set, interfaceC1809a1, 4);
                            c1836h0.m4545k0(objM4514P2);
                        }
                        interfaceC1220a3 = (InterfaceC1220a) objM4514P2;
                        c1836h0.m4553p(false);
                    }
                    AbstractC4955ho.m9382M("保存选择", interfaceC1220a2, "返回", interfaceC1220a, str, interfaceC1220a3, c1836h0, 390, 0);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 1:
                C4060x c4060x = (C4060x) this.f20995i;
                C3641z c3641z = (C3641z) this.f20996j;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f20997k;
                List list = (List) this.f20998l;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f20999m;
                InterfaceC3268x0 interfaceC3268x0 = (InterfaceC3268x0) obj;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                interfaceC3268x0.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c1836h02.m4534f(interfaceC3268x0) ? 4 : 2;
                }
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x.f13440e, null);
                    C3272z0 c3272z0M6872b = AbstractC3208d.m6872b(interfaceC3268x0.mo6924c() + 8, interfaceC3268x0.mo6922a() + 84, 5);
                    boolean z11 = this.f20994h;
                    boolean zM4536g = c1836h02.m4536g(z11) | c1836h02.m4534f(interfaceC1231l) | c1836h02.m4538h(list) | c1836h02.m4534f(interfaceC1231l2);
                    Object objM4514P3 = c1836h02.m4514P();
                    if (zM4536g || objM4514P3 == C1851l.f6155a) {
                        objM4514P3 = new C0747h(3, list, interfaceC1231l, interfaceC1231l2, z11);
                        c1836h02.m4545k0(objM4514P3);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a, c3641z, c3272z0M6872b, null, null, null, false, null, (InterfaceC1231l) objM4514P3, c1836h02, 0, 504);
                } else {
                    c1836h02.m4519V();
                }
                break;
            case 2:
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f20996j;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f20995i;
                String str2 = (String) this.f20997k;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f20998l;
                String str3 = (String) this.f20999m;
                C1836h0 c1836h03 = (C1836h0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(920026191, new C5525z4(this.f20994h, interfaceC1809a12, sharedPreferences, str2, interfaceC1809a13, str3), c1836h03), c1836h03, 48, 1);
                } else {
                    c1836h03.m4519V();
                }
                break;
            case 3:
                Context context2 = (Context) this.f20997k;
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.f20995i;
                InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) this.f20998l;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f20996j;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f20999m;
                C1836h0 c1836h04 = (C1836h0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    boolean z12 = this.f20994h;
                    boolean zM4536g2 = c1836h04.m4536g(z12) | c1836h04.m4538h(context2) | c1836h04.m4538h(sharedPreferences2);
                    Object objM4514P4 = c1836h04.m4514P();
                    if (zM4536g2 || objM4514P4 == C1851l.f6155a) {
                        objM4514P4 = new C5013ji(z12, context2, sharedPreferences2, interfaceC1809a14, interfaceC1809a15, 0);
                        c1836h04.m4545k0(objM4514P4);
                    }
                    AbstractC4955ho.m9382M("保存设置", (InterfaceC1220a) objM4514P4, "返回", interfaceC1220a4, null, null, c1836h04, 390, 48);
                } else {
                    c1836h04.m4519V();
                }
                break;
            case 4:
                C4060x c4060x2 = (C4060x) this.f20995i;
                C3641z c3641z2 = (C3641z) this.f20997k;
                SharedPreferences sharedPreferences3 = (SharedPreferences) this.f20998l;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f20996j;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f20999m;
                InterfaceC3268x0 interfaceC3268x02 = (InterfaceC3268x0) obj;
                C1836h0 c1836h05 = (C1836h0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                interfaceC3268x02.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= c1836h05.m4534f(interfaceC3268x02) ? 4 : 2;
                }
                if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a2 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x2.f13440e, null);
                    C3272z0 c3272z0M6872b2 = AbstractC3208d.m6872b(interfaceC3268x02.mo6924c() + 8, interfaceC3268x02.mo6922a() + 20, 5);
                    boolean zM4538h = c1836h05.m4538h(sharedPreferences3);
                    boolean z13 = this.f20994h;
                    boolean zM4536g3 = zM4538h | c1836h05.m4536g(z13);
                    Object objM4514P5 = c1836h05.m4514P();
                    if (zM4536g3 || objM4514P5 == C1851l.f6155a) {
                        objM4514P5 = new C0747h(6, sharedPreferences3, interfaceC1809a16, interfaceC1809a17, z13);
                        c1836h05.m4545k0(objM4514P5);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a2, c3641z2, c3272z0M6872b2, null, null, null, false, null, (InterfaceC1231l) objM4514P5, c1836h05, 0, 504);
                } else {
                    c1836h05.m4519V();
                }
                break;
            default:
                C4060x c4060x3 = (C4060x) this.f20995i;
                C3641z c3641z3 = (C3641z) this.f20996j;
                InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) this.f20997k;
                List list2 = (List) this.f20999m;
                InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) this.f20998l;
                InterfaceC3268x0 interfaceC3268x03 = (InterfaceC3268x0) obj;
                C1836h0 c1836h06 = (C1836h0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                interfaceC3268x03.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= c1836h06.m4534f(interfaceC3268x03) ? 4 : 2;
                }
                if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a3 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x3.f13440e, null);
                    C3272z0 c3272z0M6872b3 = AbstractC3208d.m6872b(interfaceC3268x03.mo6924c() + 8, interfaceC3268x03.mo6922a() + 84, 5);
                    boolean z14 = this.f20994h;
                    boolean zM4536g4 = c1836h06.m4536g(z14) | c1836h06.m4534f(interfaceC1231l3) | c1836h06.m4538h(list2) | c1836h06.m4534f(interfaceC1220a5);
                    Object objM4514P6 = c1836h06.m4514P();
                    if (zM4536g4 || objM4514P6 == C1851l.f6155a) {
                        objM4514P6 = new C0747h(z14, interfaceC1231l3, list2, interfaceC1220a5, 4);
                        c1836h06.m4545k0(objM4514P6);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a3, c3641z3, c3272z0M6872b3, null, null, null, false, null, (InterfaceC1231l) objM4514P6, c1836h06, 0, 504);
                } else {
                    c1836h06.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5364u6(C4060x c4060x, C3641z c3641z, boolean z9, InterfaceC1231l interfaceC1231l, List list, InterfaceC1220a interfaceC1220a) {
        this.f20995i = c4060x;
        this.f20996j = c3641z;
        this.f20994h = z9;
        this.f20997k = interfaceC1231l;
        this.f20999m = list;
        this.f20998l = interfaceC1220a;
    }

    public /* synthetic */ C5364u6(C4060x c4060x, C3641z c3641z, boolean z9, InterfaceC1231l interfaceC1231l, List list, InterfaceC1231l interfaceC1231l2) {
        this.f20995i = c4060x;
        this.f20996j = c3641z;
        this.f20994h = z9;
        this.f20997k = interfaceC1231l;
        this.f20998l = list;
        this.f20999m = interfaceC1231l2;
    }

    public /* synthetic */ C5364u6(C4737b3 c4737b3, InterfaceC1809a1 interfaceC1809a1, Context context, InterfaceC1220a interfaceC1220a, Set set, boolean z9) {
        this.f20995i = c4737b3;
        this.f20996j = interfaceC1809a1;
        this.f20997k = context;
        this.f20998l = interfaceC1220a;
        this.f20999m = set;
        this.f20994h = z9;
    }

    public /* synthetic */ C5364u6(boolean z9, Context context, SharedPreferences sharedPreferences, InterfaceC1220a interfaceC1220a, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12) {
        this.f20994h = z9;
        this.f20997k = context;
        this.f20995i = sharedPreferences;
        this.f20998l = interfaceC1220a;
        this.f20996j = interfaceC1809a1;
        this.f20999m = interfaceC1809a12;
    }

    public /* synthetic */ C5364u6(boolean z9, InterfaceC1809a1 interfaceC1809a1, SharedPreferences sharedPreferences, String str, InterfaceC1809a1 interfaceC1809a12, String str2) {
        this.f20994h = z9;
        this.f20996j = interfaceC1809a1;
        this.f20995i = sharedPreferences;
        this.f20997k = str;
        this.f20998l = interfaceC1809a12;
        this.f20999m = str2;
    }
}
