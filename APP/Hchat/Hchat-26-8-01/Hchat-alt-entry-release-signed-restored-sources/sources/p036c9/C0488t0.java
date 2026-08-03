package p036c9;

import android.app.Activity;
import java.util.List;
import java.util.Set;
import na.C2920h;
import p000a.AbstractC0000a;
import p025bc.AbstractC0255e;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p266s0.C3874d;
import p276sf.C3967n;
import p315v8.C4521a;
import p332wb.AbstractC4955ho;
import p332wb.C4759bp;
import p332wb.C4842ea;
import p332wb.C5068l7;
import p332wb.C5440wg;
import p345x8.C5709b;
import sh.C4056v1;

/* JADX INFO: renamed from: c9.t0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0488t0 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1464g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1465h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f1466i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f1467j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1468k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f1469l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f1470m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f1471n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0488t0(C0452j1 c0452j1, Activity activity, AbstractC0473o2 abstractC0473o2, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, InterfaceC1220a interfaceC1220a3, int i9) {
        this.f1464g = 0;
        this.f1466i = c0452j1;
        this.f1467j = activity;
        this.f1468k = abstractC0473o2;
        this.f1469l = interfaceC1220a;
        this.f1470m = interfaceC1220a2;
        this.f1471n = interfaceC1220a3;
        this.f1465h = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        String strM6701P0;
        String str;
        switch (this.f1464g) {
            case 0:
                ((Integer) obj2).getClass();
                ((C0452j1) this.f1466i).m1471l((Activity) this.f1467j, (AbstractC0473o2) this.f1468k, (InterfaceC1220a) this.f1469l, (InterfaceC1220a) this.f1470m, (InterfaceC1220a) this.f1471n, (C1836h0) obj, AbstractC1874r.m4617C(this.f1465h | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((C3874d) this.f1466i).m8058h(this.f1467j, (Boolean) this.f1468k, this.f1469l, this.f1470m, this.f1471n, (C1836h0) obj, AbstractC1874r.m4617C(this.f1465h) | 1);
                break;
            case 2:
                final C5709b c5709b = (C5709b) this.f1466i;
                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f1467j;
                final InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f1468k;
                final InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f1469l;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f1470m;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f1471n;
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) interfaceC1809a1.getValue()).booleanValue();
                    C1823e c1823e = C1851l.f6155a;
                    if (zBooleanValue) {
                        c1836h0.m4525a0(235475588);
                        String str2 = c5709b.f23200b;
                        C4759bp c4759bp = new C4759bp(AbstractC3149m.m6721t0(str2) ? "未命名规则" : str2, this.f1465h, AbstractC4955ho.m9590k5(c5709b));
                        boolean zContains = ((Set) interfaceC1809a12.getValue()).contains(c5709b.f23199a);
                        boolean zM4538h = c1836h0.m4538h(c5709b);
                        Object objM4514P = c1836h0.m4514P();
                        if (zM4538h || objM4514P == c1823e) {
                            objM4514P = new C4056v1(c5709b, 27, interfaceC1809a12);
                            c1836h0.m4545k0(objM4514P);
                        }
                        AbstractC4955ho.m9703x2(c4759bp, zContains, (InterfaceC1220a) objM4514P, c1836h0, 0);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(236351059);
                        boolean z9 = c5709b.f23201c;
                        String str3 = c5709b.f23200b;
                        String str4 = AbstractC3149m.m6721t0(str3) ? "未命名规则" : str3;
                        String strM9590k5 = AbstractC4955ho.m9590k5(c5709b);
                        boolean zM4534f = c1836h0.m4534f(interfaceC1235p) | c1836h0.m4538h(c5709b);
                        Object objM4514P2 = c1836h0.m4514P();
                        if (zM4534f || objM4514P2 == c1823e) {
                            objM4514P2 = new C5068l7(interfaceC1235p, 12, c5709b);
                            c1836h0.m4545k0(objM4514P2);
                        }
                        AbstractC4955ho.m9410P3(z9, str4, strM9590k5, false, (InterfaceC1231l) objM4514P2, c1836h0, 0, 8);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        boolean zM4534f2 = c1836h0.m4534f(interfaceC1231l) | c1836h0.m4538h(c5709b);
                        Object objM4514P3 = c1836h0.m4514P();
                        if (zM4534f2 || objM4514P3 == c1823e) {
                            final int i9 = 0;
                            objM4514P3 = new InterfaceC1220a() { // from class: wb.ii
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // p085fg.InterfaceC1220a
                                public final Object invoke() {
                                    switch (i9) {
                                        case 0:
                                            interfaceC1231l.invoke(c5709b);
                                            break;
                                        default:
                                            interfaceC1231l.invoke(c5709b);
                                            break;
                                    }
                                    return C3967n.f12976a;
                                }
                            };
                            c1836h0.m4545k0(objM4514P3);
                        }
                        AbstractC4955ho.m9503b("编辑", "修改触发条件和回复步骤", (InterfaceC1220a) objM4514P3, c1836h0, 54);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        boolean zM4534f3 = c1836h0.m4534f(interfaceC1231l2) | c1836h0.m4538h(c5709b);
                        Object objM4514P4 = c1836h0.m4514P();
                        if (zM4534f3 || objM4514P4 == c1823e) {
                            final int i10 = 1;
                            objM4514P4 = new InterfaceC1220a() { // from class: wb.ii
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // p085fg.InterfaceC1220a
                                public final Object invoke() {
                                    switch (i10) {
                                        case 0:
                                            interfaceC1231l2.invoke(c5709b);
                                            break;
                                        default:
                                            interfaceC1231l2.invoke(c5709b);
                                            break;
                                    }
                                    return C3967n.f12976a;
                                }
                            };
                            c1836h0.m4545k0(objM4514P4);
                        }
                        AbstractC4955ho.m9503b("删除", "移除此规则", (InterfaceC1220a) objM4514P4, c1836h0, 54);
                        c1836h0.m4553p(false);
                    }
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 3:
                C4521a c4521a = (C4521a) this.f1466i;
                InterfaceC1235p interfaceC1235p2 = (InterfaceC1235p) this.f1467j;
                InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) this.f1468k;
                InterfaceC1231l interfaceC1231l4 = (InterfaceC1231l) this.f1469l;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f1470m;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f1471n;
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zBooleanValue2 = ((Boolean) interfaceC1809a13.getValue()).booleanValue();
                    C1823e c1823e2 = C1851l.f6155a;
                    if (zBooleanValue2) {
                        c1836h02.m4525a0(-1838171772);
                        String str5 = c4521a.f14898b;
                        C4759bp c4759bp2 = new C4759bp(AbstractC3149m.m6721t0(str5) ? "未命名规则" : str5, this.f1465h, AbstractC4955ho.m9339G4(c4521a));
                        boolean zContains2 = ((Set) interfaceC1809a14.getValue()).contains(c4521a.f14897a);
                        boolean zM4538h2 = c1836h02.m4538h(c4521a);
                        Object objM4514P5 = c1836h02.m4514P();
                        if (zM4538h2 || objM4514P5 == c1823e2) {
                            objM4514P5 = new C4056v1(c4521a, 25, interfaceC1809a14);
                            c1836h02.m4545k0(objM4514P5);
                        }
                        AbstractC4955ho.m9703x2(c4759bp2, zContains2, (InterfaceC1220a) objM4514P5, c1836h02, 0);
                        c1836h02.m4553p(false);
                    } else {
                        c1836h02.m4525a0(-1837634170);
                        boolean z10 = c4521a.f14899c;
                        String str6 = c4521a.f14898b;
                        String str7 = AbstractC3149m.m6721t0(str6) ? "未命名规则" : str6;
                        String strM9339G4 = AbstractC4955ho.m9339G4(c4521a);
                        boolean zM4534f4 = c1836h02.m4534f(interfaceC1235p2) | c1836h02.m4538h(c4521a);
                        Object objM4514P6 = c1836h02.m4514P();
                        if (zM4534f4 || objM4514P6 == c1823e2) {
                            objM4514P6 = new C5068l7(interfaceC1235p2, 10, c4521a);
                            c1836h02.m4545k0(objM4514P6);
                        }
                        AbstractC4955ho.m9410P3(z10, str7, strM9339G4, false, (InterfaceC1231l) objM4514P6, c1836h02, 0, 8);
                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                        boolean zM4534f5 = c1836h02.m4534f(interfaceC1231l3) | c1836h02.m4538h(c4521a);
                        Object objM4514P7 = c1836h02.m4514P();
                        if (zM4534f5 || objM4514P7 == c1823e2) {
                            objM4514P7 = new C4842ea(interfaceC1231l3, c4521a, 2);
                            c1836h02.m4545k0(objM4514P7);
                        }
                        AbstractC4955ho.m9503b("编辑", "修改监听会话、转发会话和消息类型", (InterfaceC1220a) objM4514P7, c1836h02, 54);
                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                        boolean zM4534f6 = c1836h02.m4534f(interfaceC1231l4) | c1836h02.m4538h(c4521a);
                        Object objM4514P8 = c1836h02.m4514P();
                        if (zM4534f6 || objM4514P8 == c1823e2) {
                            objM4514P8 = new C4842ea(interfaceC1231l4, c4521a, 3);
                            c1836h02.m4545k0(objM4514P8);
                        }
                        AbstractC4955ho.m9503b("删除", "移除此规则", (InterfaceC1220a) objM4514P8, c1836h02, 54);
                        c1836h02.m4553p(false);
                    }
                } else {
                    c1836h02.m4519V();
                }
                return C3967n.f12976a;
            default:
                C2920h c2920h = (C2920h) this.f1466i;
                InterfaceC1231l interfaceC1231l5 = (InterfaceC1231l) this.f1467j;
                List list = (List) this.f1468k;
                InterfaceC1231l interfaceC1231l6 = (InterfaceC1231l) this.f1469l;
                InterfaceC1231l interfaceC1231l7 = (InterfaceC1231l) this.f1470m;
                InterfaceC1231l interfaceC1231l8 = (InterfaceC1231l) this.f1471n;
                C1836h0 c1836h03 = (C1836h0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    int i11 = c2920h.f9489b;
                    String strM9357I6 = AbstractC4955ho.m9357I6(i11);
                    String str8 = c2920h.f9490c;
                    if (AbstractC4955ho.m9373K6(i11) || i11 == 8) {
                        String strM6738b0 = AbstractC3156t.m6738b0(AbstractC3149m.m6703R0(str8).toString(), '\n', ' ');
                        if (AbstractC3149m.m6721t0(strM6738b0)) {
                            strM6738b0 = "未填写内容";
                        }
                        strM6701P0 = AbstractC3149m.m6701P0(24, strM6738b0);
                    } else {
                        strM6701P0 = AbstractC3149m.m6686A0(AbstractC4955ho.m9341G6(str8, i11, false), "已选择：");
                    }
                    long j3 = c2920h.f9491d;
                    if (j3 < 0) {
                        j3 = 0;
                    }
                    if (j3 > 0) {
                        str = "延迟 " + j3 + "ms";
                    } else {
                        str = "无延迟";
                    }
                    String strM1033v = AbstractC0255e.m1033v(strM6701P0, " · ", str, " · ", c2920h.f9492e ? "随机追加" : "固定");
                    boolean zM4534f7 = c1836h03.m4534f(interfaceC1231l5);
                    int i12 = this.f1465h;
                    boolean zM4530d = zM4534f7 | c1836h03.m4530d(i12);
                    Object objM4514P9 = c1836h03.m4514P();
                    C1823e c1823e3 = C1851l.f6155a;
                    if (zM4530d || objM4514P9 == c1823e3) {
                        objM4514P9 = new C5440wg(i12, 2, interfaceC1231l5);
                        c1836h03.m4545k0(objM4514P9);
                    }
                    AbstractC4955ho.m9704x3(strM9357I6, strM1033v, (InterfaceC1220a) objM4514P9, c1836h03, 0);
                    AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                    boolean z11 = i12 > 0;
                    boolean z12 = i12 < AbstractC0000a.m54b0(list);
                    boolean zM4534f8 = c1836h03.m4534f(interfaceC1231l6) | c1836h03.m4530d(i12);
                    Object objM4514P10 = c1836h03.m4514P();
                    if (zM4534f8 || objM4514P10 == c1823e3) {
                        objM4514P10 = new C5440wg(i12, 3, interfaceC1231l6);
                        c1836h03.m4545k0(objM4514P10);
                    }
                    InterfaceC1220a interfaceC1220a = (InterfaceC1220a) objM4514P10;
                    boolean zM4534f9 = c1836h03.m4534f(interfaceC1231l7) | c1836h03.m4530d(i12);
                    Object objM4514P11 = c1836h03.m4514P();
                    if (zM4534f9 || objM4514P11 == c1823e3) {
                        objM4514P11 = new C5440wg(i12, 4, interfaceC1231l7);
                        c1836h03.m4545k0(objM4514P11);
                    }
                    InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) objM4514P11;
                    boolean zM4534f10 = c1836h03.m4534f(interfaceC1231l8) | c1836h03.m4530d(i12);
                    Object objM4514P12 = c1836h03.m4514P();
                    if (zM4534f10 || objM4514P12 == c1823e3) {
                        objM4514P12 = new C5440wg(i12, 5, interfaceC1231l8);
                        c1836h03.m4545k0(objM4514P12);
                    }
                    AbstractC4955ho.m9498a3(z11, z12, interfaceC1220a, interfaceC1220a2, (InterfaceC1220a) objM4514P12, c1836h03, 0);
                } else {
                    c1836h03.m4519V();
                }
                return C3967n.f12976a;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C0488t0(Object obj, int i9, InterfaceC1235p interfaceC1235p, InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, int i10) {
        this.f1464g = i10;
        this.f1466i = obj;
        this.f1465h = i9;
        this.f1467j = interfaceC1235p;
        this.f1468k = interfaceC1231l;
        this.f1469l = interfaceC1231l2;
        this.f1470m = interfaceC1809a1;
        this.f1471n = interfaceC1809a12;
    }

    public /* synthetic */ C0488t0(C2920h c2920h, InterfaceC1231l interfaceC1231l, int i9, List list, InterfaceC1231l interfaceC1231l2, InterfaceC1231l interfaceC1231l3, InterfaceC1231l interfaceC1231l4) {
        this.f1464g = 4;
        this.f1466i = c2920h;
        this.f1467j = interfaceC1231l;
        this.f1465h = i9;
        this.f1468k = list;
        this.f1469l = interfaceC1231l2;
        this.f1470m = interfaceC1231l3;
        this.f1471n = interfaceC1231l4;
    }

    public /* synthetic */ C0488t0(C3874d c3874d, Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, int i9) {
        this.f1464g = 1;
        this.f1466i = c3874d;
        this.f1467j = obj;
        this.f1468k = bool;
        this.f1469l = obj2;
        this.f1470m = obj3;
        this.f1471n = obj4;
        this.f1465h = i9;
    }
}
