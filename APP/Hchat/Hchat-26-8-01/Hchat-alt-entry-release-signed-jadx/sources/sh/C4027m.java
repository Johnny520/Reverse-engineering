package sh;

import bi.AbstractC0325m;
import bi.C0324l;
import java.util.Set;
import p051db.C0765c;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1858m2;
import p117i0.InterfaceC1809a1;
import p119i2.C1941n0;
import p177m2.C2767k;
import p222p.C3259u;
import p251r.C3619d;
import p266s0.AbstractC3879i;
import p276sf.C3967n;
import p276sf.InterfaceC3955b;
import p332wb.AbstractC4955ho;
import p332wb.C5142nf;
import p332wb.C5161o1;
import p332wb.C5194p1;
import p332wb.C5374ug;
import p332wb.EnumC5329t4;
import th.InterfaceC4209a;

/* JADX INFO: renamed from: sh.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4027m implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f13243g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f13244h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f13245i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f13246j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f13247k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f13248l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4027m(String str, C3986a c3986a, boolean z9, String str2, C3986a c3986a2) {
        this.f13243g = 0;
        this.f13245i = str;
        this.f13247k = c3986a;
        this.f13244h = z9;
        this.f13246j = str2;
        this.f13248l = c3986a2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        switch (this.f13243g) {
            case 0:
                String str = (String) this.f13245i;
                C3986a c3986a = (C3986a) this.f13247k;
                String str2 = (String) this.f13246j;
                C3986a c3986a2 = (C3986a) this.f13248l;
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((C3259u) obj).getClass();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    c1836h0.m4525a0(-1158033922);
                    C1858m2 c1858m2 = AbstractC0325m.f972a;
                    long j3 = ((C1941n0) ((C0324l) c1836h0.m4542j(c1858m2)).f965h.getValue()).f6580a.f6514b;
                    C2767k c2767k = C2767k.f9000j;
                    boolean z9 = this.f13244h;
                    AbstractC4045s.m8250n(str, null, z9 ? c3986a.f13026a : c3986a.f13027b, j3, c2767k, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h0, 1572864, 0, 262058);
                    c1836h0.m4553p(false);
                    if (str2 != null) {
                        c1836h0.m4525a0(-1157766578);
                        AbstractC4045s.m8250n(str2, null, z9 ? c3986a2.f13026a : c3986a2.f13027b, ((C1941n0) ((C0324l) c1836h0.m4542j(c1858m2)).f961d.getValue()).f6580a.f6514b, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h0, 0, 0, 262122);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(-1157594249);
                        c1836h0.m4553p(false);
                    }
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 1:
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f13245i;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f13246j;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f13247k;
                Set set = (Set) this.f13248l;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zM4534f = c1836h02.m4534f(interfaceC1231l) | c1836h02.m4534f(interfaceC1809a1);
                    Object objM4514P = c1836h02.m4514P();
                    C1823e c1823e = C1851l.f6155a;
                    if (zM4534f || objM4514P == c1823e) {
                        objM4514P = new C5161o1(interfaceC1231l, interfaceC1809a1, 0);
                        c1836h02.m4545k0(objM4514P);
                    }
                    InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) objM4514P;
                    Set set2 = set;
                    boolean zIsEmpty = set2.isEmpty();
                    boolean z10 = this.f13244h;
                    InterfaceC1220a interfaceC1220a3 = null;
                    String str3 = !zIsEmpty ? z10 ? "取消全选" : "全选" : null;
                    if (set2.isEmpty()) {
                        c1836h02.m4525a0(-2037922933);
                        c1836h02.m4553p(false);
                    } else {
                        c1836h02.m4525a0(-2038101988);
                        boolean zM4534f2 = c1836h02.m4534f(interfaceC1809a1) | c1836h02.m4536g(z10) | c1836h02.m4538h(set);
                        Object objM4514P2 = c1836h02.m4514P();
                        if (zM4534f2 || objM4514P2 == c1823e) {
                            objM4514P2 = new C5194p1(z10, set, interfaceC1809a1, 0);
                            c1836h02.m4545k0(objM4514P2);
                        }
                        interfaceC1220a3 = (InterfaceC1220a) objM4514P2;
                        c1836h02.m4553p(false);
                    }
                    AbstractC4955ho.m9382M("保存选择", interfaceC1220a2, "返回", interfaceC1220a, str3, interfaceC1220a3, c1836h02, 390, 0);
                } else {
                    c1836h02.m4519V();
                }
                break;
            case 2:
                C0765c c0765c = (C0765c) this.f13245i;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f13246j;
                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f13247k;
                InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) this.f13248l;
                C1836h0 c1836h03 = (C1836h0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-892622266, new C5142nf(c0765c, interfaceC1231l2, interfaceC1235p, interfaceC1231l3, this.f13244h), c1836h03), c1836h03, 48, 1);
                } else {
                    c1836h03.m4519V();
                }
                break;
            case 3:
                EnumC5329t4 enumC5329t4 = (EnumC5329t4) this.f13245i;
                InterfaceC1231l interfaceC1231l4 = (InterfaceC1231l) this.f13246j;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f13247k;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f13248l;
                InterfaceC4209a interfaceC4209a = (InterfaceC4209a) obj;
                C1836h0 c1836h04 = (C1836h0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                interfaceC4209a.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= (iIntValue4 & 8) == 0 ? c1836h04.m4534f(interfaceC4209a) : c1836h04.m4538h(interfaceC4209a) ? 4 : 2;
                }
                boolean z11 = false;
                if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    boolean zBooleanValue = ((Boolean) interfaceC1809a12.getValue()).booleanValue();
                    if (this.f13244h && ((Boolean) interfaceC1809a13.getValue()).booleanValue()) {
                        z11 = true;
                    }
                    AbstractC4955ho.m9384M1(enumC5329t4, zBooleanValue, z11, interfaceC4209a, interfaceC1231l4, c1836h04, (iIntValue4 << 9) & 7168);
                } else {
                    c1836h04.m4519V();
                }
                break;
            default:
                InterfaceC1231l interfaceC1231l5 = (InterfaceC1231l) this.f13246j;
                String str4 = (String) this.f13245i;
                InterfaceC1231l interfaceC1231l6 = (InterfaceC1231l) this.f13247k;
                InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) this.f13248l;
                C1836h0 c1836h05 = (C1836h0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(1947538524, new C5374ug(this.f13244h, interfaceC1231l5, str4, interfaceC1231l6, interfaceC1220a4), c1836h05), c1836h05, 48, 1);
                } else {
                    c1836h05.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4027m(Object obj, Object obj2, InterfaceC3955b interfaceC3955b, Object obj3, boolean z9, int i9) {
        this.f13243g = i9;
        this.f13245i = obj;
        this.f13246j = obj2;
        this.f13247k = interfaceC3955b;
        this.f13248l = obj3;
        this.f13244h = z9;
    }

    public /* synthetic */ C4027m(EnumC5329t4 enumC5329t4, boolean z9, InterfaceC1231l interfaceC1231l, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12) {
        this.f13243g = 3;
        this.f13245i = enumC5329t4;
        this.f13244h = z9;
        this.f13246j = interfaceC1231l;
        this.f13247k = interfaceC1809a1;
        this.f13248l = interfaceC1809a12;
    }

    public /* synthetic */ C4027m(boolean z9, InterfaceC1231l interfaceC1231l, String str, InterfaceC1231l interfaceC1231l2, InterfaceC1220a interfaceC1220a) {
        this.f13243g = 4;
        this.f13244h = z9;
        this.f13246j = interfaceC1231l;
        this.f13245i = str;
        this.f13247k = interfaceC1231l2;
        this.f13248l = interfaceC1220a;
    }
}
