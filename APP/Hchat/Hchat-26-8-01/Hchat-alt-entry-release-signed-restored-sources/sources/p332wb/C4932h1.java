package p332wb;

import android.app.Activity;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p000a.AbstractC0000a;
import p036c9.C0482r0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1236q;
import p109hb.C1701x;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p197n9.C2912a;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.C3272z0;
import p222p.InterfaceC3268x0;
import p251r.C3641z;
import p253r1.AbstractC3649f;
import p266s0.AbstractC3879i;
import p276sf.C3967n;
import p356y0.InterfaceC5853o;
import sh.C4060x;
import th.InterfaceC4209a;

/* JADX INFO: renamed from: wb.h1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4932h1 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17509g = 3;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f17510h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f17511i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f17512j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1231l f17513k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean f17514l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f17515m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f17516n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f17517o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4932h1(String str, EnumC5092lv enumC5092lv, ArrayList arrayList, Set set, String str2, boolean z9, Activity activity, InterfaceC1231l interfaceC1231l) {
        this.f17510h = str;
        this.f17511i = enumC5092lv;
        this.f17517o = arrayList;
        this.f17515m = set;
        this.f17516n = str2;
        this.f17514l = z9;
        this.f17512j = activity;
        this.f17513k = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        switch (this.f17509g) {
            case 0:
                C4060x c4060x = (C4060x) this.f17510h;
                C3641z c3641z = (C3641z) this.f17511i;
                List list = (List) this.f17516n;
                ArrayList arrayList = (ArrayList) this.f17517o;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f17515m;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f17512j;
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
                    boolean z9 = this.f17514l;
                    boolean zM4536g = c1836h0.m4536g(z9);
                    InterfaceC1231l interfaceC1231l2 = this.f17513k;
                    boolean zM4534f = zM4536g | c1836h0.m4534f(interfaceC1231l2) | c1836h0.m4538h(list) | c1836h0.m4538h(arrayList) | c1836h0.m4534f(interfaceC1231l);
                    Object objM4514P = c1836h0.m4514P();
                    if (zM4534f || objM4514P == C1851l.f6155a) {
                        objM4514P = new C1701x(z9, interfaceC1231l2, interfaceC1809a1, list, arrayList, interfaceC1231l);
                        c1836h0.m4545k0(objM4514P);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a, c3641z, c3272z0M6872b, null, null, null, false, null, (InterfaceC1231l) objM4514P, c1836h0, 0, 504);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 1:
                C4060x c4060x2 = (C4060x) this.f17510h;
                C3641z c3641z2 = (C3641z) this.f17511i;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f17512j;
                Set set = (Set) this.f17515m;
                C2912a c2912a = (C2912a) this.f17516n;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f17517o;
                InterfaceC3268x0 interfaceC3268x02 = (InterfaceC3268x0) obj;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                interfaceC3268x02.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c1836h02.m4534f(interfaceC3268x02) ? 4 : 2;
                }
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a2 = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x2.f13440e, null);
                    C3272z0 c3272z0M6872b2 = AbstractC3208d.m6872b(interfaceC3268x02.mo6924c() + 8, interfaceC3268x02.mo6922a() + 84, 5);
                    boolean zM4534f2 = c1836h02.m4534f(interfaceC1809a12) | c1836h02.m4538h(set);
                    InterfaceC1231l interfaceC1231l3 = this.f17513k;
                    boolean zM4534f3 = zM4534f2 | c1836h02.m4534f(interfaceC1231l3) | c1836h02.m4538h(c2912a);
                    boolean z10 = this.f17514l;
                    boolean zM4536g2 = zM4534f3 | c1836h02.m4536g(z10) | c1836h02.m4534f(interfaceC1220a);
                    Object objM4514P2 = c1836h02.m4514P();
                    if (zM4536g2 || objM4514P2 == C1851l.f6155a) {
                        C1701x c1701x = new C1701x(z10, interfaceC1809a12, set, interfaceC1231l3, c2912a, interfaceC1220a, 4);
                        c1836h02.m4545k0(c1701x);
                        objM4514P2 = c1701x;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a2, c3641z2, c3272z0M6872b2, null, null, null, false, null, (InterfaceC1231l) objM4514P2, c1836h02, 0, 504);
                } else {
                    c1836h02.m4519V();
                }
                break;
            case 2:
                C5391v0 c5391v0 = (C5391v0) this.f17510h;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f17512j;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f17511i;
                Context context = (Context) this.f17515m;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f17516n;
                Set set2 = (Set) this.f17517o;
                C1836h0 c1836h03 = (C1836h0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    boolean z11 = c5391v0.f21260c;
                    String str = z11 ? "保存选择" : c5391v0.f21265h;
                    boolean zM4534f4 = c1836h03.m4534f(interfaceC1809a13) | c1836h03.m4534f(interfaceC1809a14) | c1836h03.m4534f(c5391v0) | c1836h03.m4538h(context);
                    InterfaceC1231l interfaceC1231l4 = this.f17513k;
                    boolean zM4534f5 = zM4534f4 | c1836h03.m4534f(interfaceC1231l4);
                    Object objM4514P3 = c1836h03.m4514P();
                    C1823e c1823e = C1851l.f6155a;
                    if (zM4534f5 || objM4514P3 == c1823e) {
                        C0482r0 c0482r0 = new C0482r0(c5391v0, context, interfaceC1231l4, interfaceC1809a13, interfaceC1809a14, 8);
                        c1836h03.m4545k0(c0482r0);
                        objM4514P3 = c0482r0;
                    }
                    InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) objM4514P3;
                    boolean z12 = this.f17514l;
                    InterfaceC1220a interfaceC1220a4 = null;
                    String str2 = (!z11 || set2.isEmpty()) ? null : z12 ? "取消全选" : "全选";
                    if (!z11 || set2.isEmpty()) {
                        c1836h03.m4525a0(-1582637949);
                        c1836h03.m4553p(false);
                    } else {
                        c1836h03.m4525a0(-1582943175);
                        boolean zM4534f6 = c1836h03.m4534f(interfaceC1809a14) | c1836h03.m4536g(z12) | c1836h03.m4538h(set2);
                        Object objM4514P4 = c1836h03.m4514P();
                        if (zM4534f6 || objM4514P4 == c1823e) {
                            objM4514P4 = new C5194p1(z12, set2, interfaceC1809a14, 1);
                            c1836h03.m4545k0(objM4514P4);
                        }
                        interfaceC1220a4 = (InterfaceC1220a) objM4514P4;
                        c1836h03.m4553p(false);
                    }
                    AbstractC4955ho.m9382M(str, interfaceC1220a3, "返回", interfaceC1220a2, str2, interfaceC1220a4, c1836h03, 384, 0);
                } else {
                    c1836h03.m4519V();
                }
                break;
            default:
                String str3 = (String) this.f17510h;
                EnumC5092lv enumC5092lv = (EnumC5092lv) this.f17511i;
                ArrayList arrayList2 = (ArrayList) this.f17517o;
                Set set3 = (Set) this.f17515m;
                String str4 = (String) this.f17516n;
                Activity activity = (Activity) this.f17512j;
                InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) obj;
                C1836h0 c1836h04 = (C1836h0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                interfaceC1220a5.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= c1836h04.m4538h(interfaceC1220a5) ? 4 : 2;
                }
                if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    C5491y2.f22068p.m9866J(str3, enumC5092lv, interfaceC1220a5, AbstractC3879i.m8071e(-1650797776, new C4847ef(arrayList2, set3, str4, interfaceC1220a5, this.f17514l, activity, this.f17513k), c1836h04), c1836h04, ((iIntValue4 << 9) & 7168) | 221190);
                } else {
                    c1836h04.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4932h1(C4060x c4060x, C3641z c3641z, InterfaceC1809a1 interfaceC1809a1, Set set, InterfaceC1231l interfaceC1231l, C2912a c2912a, boolean z9, InterfaceC1220a interfaceC1220a) {
        this.f17510h = c4060x;
        this.f17511i = c3641z;
        this.f17512j = interfaceC1809a1;
        this.f17515m = set;
        this.f17513k = interfaceC1231l;
        this.f17516n = c2912a;
        this.f17514l = z9;
        this.f17517o = interfaceC1220a;
    }

    public /* synthetic */ C4932h1(C4060x c4060x, C3641z c3641z, boolean z9, InterfaceC1231l interfaceC1231l, List list, ArrayList arrayList, InterfaceC1231l interfaceC1231l2, InterfaceC1809a1 interfaceC1809a1) {
        this.f17510h = c4060x;
        this.f17511i = c3641z;
        this.f17514l = z9;
        this.f17513k = interfaceC1231l;
        this.f17516n = list;
        this.f17517o = arrayList;
        this.f17515m = interfaceC1231l2;
        this.f17512j = interfaceC1809a1;
    }

    public /* synthetic */ C4932h1(C5391v0 c5391v0, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, Context context, InterfaceC1231l interfaceC1231l, InterfaceC1220a interfaceC1220a, Set set, boolean z9) {
        this.f17510h = c5391v0;
        this.f17512j = interfaceC1809a1;
        this.f17511i = interfaceC1809a12;
        this.f17515m = context;
        this.f17513k = interfaceC1231l;
        this.f17516n = interfaceC1220a;
        this.f17517o = set;
        this.f17514l = z9;
    }
}
