package p332wb;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p036c9.C0475p0;
import p036c9.C0500x0;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1236q;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p251r.C3616b;
import p251r.C3619d;
import p266s0.AbstractC3879i;
import p276sf.C3967n;
import th.InterfaceC4209a;

/* JADX INFO: renamed from: wb.fm */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4887fm implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17214g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f17215h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f17216i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f17217j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f17218k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ List f17219l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1220a f17220m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean f17221n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f17222o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f17223p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4887fm(InterfaceC1809a1 interfaceC1809a1, Context context, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1231l interfaceC1231l, List list, InterfaceC1220a interfaceC1220a, Set set, boolean z9) {
        this.f17215h = interfaceC1809a1;
        this.f17216i = context;
        this.f17217j = interfaceC1809a12;
        this.f17218k = interfaceC1809a13;
        this.f17222o = interfaceC1231l;
        this.f17219l = list;
        this.f17220m = interfaceC1220a;
        this.f17223p = set;
        this.f17221n = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        String str;
        String str2;
        switch (this.f17214g) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f17222o;
                Context context = (Context) this.f17216i;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.f17223p;
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    InterfaceC1809a1 interfaceC1809a1 = this.f17215h;
                    boolean zBooleanValue = ((Boolean) interfaceC1809a1.getValue()).booleanValue();
                    InterfaceC1809a1 interfaceC1809a12 = this.f17218k;
                    C1823e c1823e = C1851l.f6155a;
                    InterfaceC1220a interfaceC1220a = null;
                    if (zBooleanValue) {
                        c1836h0.m4525a0(-561355646);
                        String strM2250m = AbstractC0921a.m2250m(arrayList.size(), "删除所选（", "）");
                        boolean zM4538h = c1836h0.m4538h(arrayList) | c1836h0.m4538h(context);
                        Object objM4514P = c1836h0.m4514P();
                        if (zM4538h || objM4514P == c1823e) {
                            objM4514P = new C5432w8(arrayList, context, this.f17217j, 4);
                            c1836h0.m4545k0(objM4514P);
                        }
                        InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) objM4514P;
                        Object objM4514P2 = c1836h0.m4514P();
                        if (objM4514P2 == c1823e) {
                            objM4514P2 = new C0500x0(11, interfaceC1809a1, interfaceC1809a12);
                            c1836h0.m4545k0(objM4514P2);
                        }
                        InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) objM4514P2;
                        boolean zIsEmpty = linkedHashSet.isEmpty();
                        boolean z9 = this.f17221n;
                        if (zIsEmpty) {
                            str = null;
                        } else {
                            str = z9 ? "取消全选" : "全选";
                        }
                        if (linkedHashSet.isEmpty()) {
                            c1836h0.m4525a0(-560598069);
                        } else {
                            c1836h0.m4525a0(-560578228);
                            boolean zM4536g = c1836h0.m4536g(z9) | c1836h0.m4538h(linkedHashSet);
                            Object objM4514P3 = c1836h0.m4514P();
                            if (zM4536g || objM4514P3 == c1823e) {
                                objM4514P3 = new C5465x8(z9, linkedHashSet, interfaceC1809a12, 4);
                                c1836h0.m4545k0(objM4514P3);
                            }
                            interfaceC1220a = (InterfaceC1220a) objM4514P3;
                        }
                        c1836h0.m4553p(false);
                        AbstractC4955ho.m9382M(strM2250m, interfaceC1220a2, "取消", interfaceC1220a3, str, interfaceC1220a, c1836h0, 3456, 0);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(-560214412);
                        List list = this.f17219l;
                        String str3 = list.isEmpty() ? null : "批量删除";
                        if (list.isEmpty()) {
                            c1836h0.m4525a0(-559976085);
                        } else {
                            c1836h0.m4525a0(-559960739);
                            Object objM4514P4 = c1836h0.m4514P();
                            if (objM4514P4 == c1823e) {
                                objM4514P4 = new C0500x0(12, interfaceC1809a1, interfaceC1809a12);
                                c1836h0.m4545k0(objM4514P4);
                            }
                            interfaceC1220a = (InterfaceC1220a) objM4514P4;
                        }
                        c1836h0.m4553p(false);
                        AbstractC4955ho.m9382M("返回", this.f17220m, null, null, str3, interfaceC1220a, c1836h0, 6, 12);
                        c1836h0.m4553p(false);
                    }
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 1:
                Context context2 = (Context) this.f17216i;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f17222o;
                Set set = (Set) this.f17223p;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    InterfaceC1809a1 interfaceC1809a13 = this.f17215h;
                    boolean zM4534f = c1836h02.m4534f(interfaceC1809a13) | c1836h02.m4538h(context2);
                    InterfaceC1809a1 interfaceC1809a14 = this.f17217j;
                    boolean zM4534f2 = zM4534f | c1836h02.m4534f(interfaceC1809a14);
                    InterfaceC1809a1 interfaceC1809a15 = this.f17218k;
                    boolean zM4534f3 = zM4534f2 | c1836h02.m4534f(interfaceC1809a15) | c1836h02.m4534f(interfaceC1231l);
                    List list2 = this.f17219l;
                    boolean zM4538h2 = zM4534f3 | c1836h02.m4538h(list2);
                    Object objM4514P5 = c1836h02.m4514P();
                    C1823e c1823e2 = C1851l.f6155a;
                    if (zM4538h2 || objM4514P5 == c1823e2) {
                        objM4514P5 = new C0475p0(context2, interfaceC1231l, interfaceC1809a13, interfaceC1809a14, interfaceC1809a15, list2, 4);
                        c1836h02.m4545k0(objM4514P5);
                    }
                    InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) objM4514P5;
                    Set set2 = set;
                    boolean zIsEmpty2 = set2.isEmpty();
                    boolean z10 = this.f17221n;
                    InterfaceC1220a interfaceC1220a5 = null;
                    if (zIsEmpty2) {
                        str2 = null;
                    } else {
                        str2 = z10 ? "取消全选" : "全选";
                    }
                    if (set2.isEmpty()) {
                        c1836h02.m4525a0(895818650);
                        c1836h02.m4553p(false);
                    } else {
                        c1836h02.m4525a0(895630946);
                        boolean zM4534f4 = c1836h02.m4534f(interfaceC1809a14) | c1836h02.m4536g(z10) | c1836h02.m4538h(set);
                        Object objM4514P6 = c1836h02.m4514P();
                        if (zM4534f4 || objM4514P6 == c1823e2) {
                            objM4514P6 = new C5194p1(z10, set, interfaceC1809a14, 2);
                            c1836h02.m4545k0(objM4514P6);
                        }
                        interfaceC1220a5 = (InterfaceC1220a) objM4514P6;
                        c1836h02.m4553p(false);
                    }
                    AbstractC4955ho.m9382M("套用模板", interfaceC1220a4, "返回", this.f17220m, str2, interfaceC1220a5, c1836h02, 390, 0);
                } else {
                    c1836h02.m4519V();
                }
                break;
            default:
                String str4 = (String) this.f17222o;
                String str5 = (String) this.f17216i;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f17223p;
                C1836h0 c1836h03 = (C1836h0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-9882400, new C3616b(str4, this.f17219l, str5, interfaceC1231l2, this.f17215h, this.f17217j, this.f17221n, this.f17220m, this.f17218k), c1836h03), c1836h03, 48, 1);
                } else {
                    c1836h03.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4887fm(String str, List list, String str2, InterfaceC1231l interfaceC1231l, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, boolean z9, InterfaceC1220a interfaceC1220a, InterfaceC1809a1 interfaceC1809a13) {
        this.f17222o = str;
        this.f17219l = list;
        this.f17216i = str2;
        this.f17223p = interfaceC1231l;
        this.f17215h = interfaceC1809a1;
        this.f17217j = interfaceC1809a12;
        this.f17221n = z9;
        this.f17220m = interfaceC1220a;
        this.f17218k = interfaceC1809a13;
    }

    public /* synthetic */ C4887fm(ArrayList arrayList, Context context, LinkedHashSet linkedHashSet, boolean z9, InterfaceC1220a interfaceC1220a, List list, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13) {
        this.f17222o = arrayList;
        this.f17216i = context;
        this.f17223p = linkedHashSet;
        this.f17221n = z9;
        this.f17220m = interfaceC1220a;
        this.f17219l = list;
        this.f17215h = interfaceC1809a1;
        this.f17217j = interfaceC1809a12;
        this.f17218k = interfaceC1809a13;
    }
}
