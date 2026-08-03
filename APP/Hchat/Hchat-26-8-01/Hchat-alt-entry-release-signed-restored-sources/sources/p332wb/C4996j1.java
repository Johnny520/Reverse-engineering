package p332wb;

import android.content.Context;
import java.util.List;
import java.util.Set;
import p000a.AbstractC0000a;
import p036c9.C0414a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1236q;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p126ia.C2020n;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.C3272z0;
import p222p.InterfaceC3268x0;
import p251r.C3641z;
import p253r1.AbstractC3649f;
import p276sf.C3967n;
import p356y0.InterfaceC5853o;
import sh.C4060x;
import th.InterfaceC4209a;

/* JADX INFO: renamed from: wb.j1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4996j1 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18022g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f18023h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f18024i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1231l f18025j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f18026k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f18027l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f18028m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f18029n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f18030o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f18031p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f18032q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4996j1(List list, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1231l interfaceC1231l, List list2, InterfaceC1220a interfaceC1220a, Set set, boolean z9) {
        this.f18027l = list;
        this.f18028m = context;
        this.f18023h = interfaceC1809a1;
        this.f18024i = interfaceC1809a12;
        this.f18029n = interfaceC1809a13;
        this.f18025j = interfaceC1231l;
        this.f18030o = list2;
        this.f18031p = interfaceC1220a;
        this.f18032q = set;
        this.f18026k = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        switch (this.f18022g) {
            case 0:
                C4060x c4060x = (C4060x) this.f18027l;
                C3641z c3641z = (C3641z) this.f18028m;
                String str = (String) this.f18029n;
                C0414a c0414a = (C0414a) this.f18031p;
                C0414a c0414a2 = (C0414a) this.f18032q;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f18030o;
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
                    InterfaceC1809a1 interfaceC1809a1 = this.f18023h;
                    boolean zM4534f = c1836h0.m4534f(interfaceC1809a1) | c1836h0.m4534f(str);
                    InterfaceC1231l interfaceC1231l2 = this.f18025j;
                    boolean zM4534f2 = zM4534f | c1836h0.m4534f(interfaceC1231l2) | c1836h0.m4538h(c0414a) | c1836h0.m4538h(c0414a2) | c1836h0.m4534f(interfaceC1231l);
                    boolean z9 = this.f18026k;
                    boolean zM4536g = zM4534f2 | c1836h0.m4536g(z9);
                    InterfaceC1809a1 interfaceC1809a12 = this.f18024i;
                    boolean zM4534f3 = zM4536g | c1836h0.m4534f(interfaceC1809a12);
                    Object objM4514P = c1836h0.m4514P();
                    if (zM4534f3 || objM4514P == C1851l.f6155a) {
                        C2020n c2020n = new C2020n(z9, interfaceC1809a1, str, interfaceC1231l2, c0414a, c0414a2, interfaceC1231l, interfaceC1809a12);
                        c1836h0.m4545k0(c2020n);
                        objM4514P = c2020n;
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a, c3641z, c3272z0M6872b, null, null, null, false, null, (InterfaceC1231l) objM4514P, c1836h0, 0, 504);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                List list = (List) this.f18027l;
                Context context = (Context) this.f18028m;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f18029n;
                List list2 = (List) this.f18030o;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f18031p;
                Set set = (Set) this.f18032q;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zM4538h = c1836h02.m4538h(list) | c1836h02.m4538h(context);
                    InterfaceC1809a1 interfaceC1809a14 = this.f18023h;
                    boolean zM4534f4 = zM4538h | c1836h02.m4534f(interfaceC1809a14);
                    InterfaceC1809a1 interfaceC1809a15 = this.f18024i;
                    boolean zM4534f5 = zM4534f4 | c1836h02.m4534f(interfaceC1809a15) | c1836h02.m4534f(interfaceC1809a13);
                    InterfaceC1231l interfaceC1231l3 = this.f18025j;
                    boolean zM4534f6 = zM4534f5 | c1836h02.m4534f(interfaceC1231l3) | c1836h02.m4538h(list2);
                    Object objM4514P2 = c1836h02.m4514P();
                    C1823e c1823e = C1851l.f6155a;
                    if (zM4534f6 || objM4514P2 == c1823e) {
                        C5134n7 c5134n7 = new C5134n7(list, context, interfaceC1231l3, interfaceC1809a14, interfaceC1809a15, interfaceC1809a13, list2);
                        c1836h02.m4545k0(c5134n7);
                        objM4514P2 = c5134n7;
                    }
                    InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) objM4514P2;
                    Set set2 = set;
                    boolean zIsEmpty = set2.isEmpty();
                    boolean z10 = this.f18026k;
                    InterfaceC1220a interfaceC1220a3 = null;
                    String str2 = !zIsEmpty ? z10 ? "取消全选" : "全选" : null;
                    if (set2.isEmpty()) {
                        c1836h02.m4525a0(1287872680);
                        c1836h02.m4553p(false);
                    } else {
                        c1836h02.m4525a0(1287576103);
                        boolean zM4534f7 = c1836h02.m4534f(interfaceC1809a15) | c1836h02.m4536g(z10) | c1836h02.m4538h(set);
                        Object objM4514P3 = c1836h02.m4514P();
                        if (zM4534f7 || objM4514P3 == c1823e) {
                            objM4514P3 = new C5194p1(z10, set, interfaceC1809a15, 5);
                            c1836h02.m4545k0(objM4514P3);
                        }
                        interfaceC1220a3 = (InterfaceC1220a) objM4514P3;
                        c1836h02.m4553p(false);
                    }
                    AbstractC4955ho.m9382M("套用模板", interfaceC1220a2, "返回", interfaceC1220a, str2, interfaceC1220a3, c1836h02, 390, 0);
                } else {
                    c1836h02.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4996j1(C4060x c4060x, C3641z c3641z, InterfaceC1809a1 interfaceC1809a1, String str, InterfaceC1231l interfaceC1231l, C0414a c0414a, C0414a c0414a2, InterfaceC1231l interfaceC1231l2, boolean z9, InterfaceC1809a1 interfaceC1809a12) {
        this.f18027l = c4060x;
        this.f18028m = c3641z;
        this.f18023h = interfaceC1809a1;
        this.f18029n = str;
        this.f18025j = interfaceC1231l;
        this.f18031p = c0414a;
        this.f18032q = c0414a2;
        this.f18030o = interfaceC1231l2;
        this.f18026k = z9;
        this.f18024i = interfaceC1809a12;
    }
}
