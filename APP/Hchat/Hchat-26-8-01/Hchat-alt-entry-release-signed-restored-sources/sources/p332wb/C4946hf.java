package p332wb;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import na.C2921i;
import p000a.AbstractC0000a;
import p010aa.C0033a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p109hb.C1676e0;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p276sf.C3958e;
import p276sf.C3967n;
import sh.C4056v1;
import ua.C4297h;

/* JADX INFO: renamed from: wb.hf */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4946hf implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17600g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ArrayList f17601h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ List f17602i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ List f17603j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1235p f17604k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f17605l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f17606m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4946hf(ArrayList arrayList, List list, List list2, InterfaceC1235p interfaceC1235p, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12) {
        this.f17600g = 1;
        this.f17601h = arrayList;
        this.f17602i = list;
        this.f17603j = list2;
        this.f17604k = interfaceC1235p;
        this.f17605l = interfaceC1809a1;
        this.f17606m = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        int i9 = this.f17600g;
        C1836h0 c1836h0 = (C1836h0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i9) {
            case 0:
                if (!c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c1836h0.m4519V();
                } else if (this.f17602i.isEmpty()) {
                    c1836h0.m4525a0(1251457993);
                    AbstractC4955ho.m9657s0("暂无名单。添加好友、群聊、公众号或群成员后，再给名单分配模板。", c1836h0, 6);
                    c1836h0.m4553p(false);
                } else {
                    ArrayList arrayList = this.f17601h;
                    if (arrayList.isEmpty()) {
                        c1836h0.m4525a0(1251585682);
                        AbstractC4955ho.m9657s0("没有匹配名单。可按昵称、ID 或模板名搜索。", c1836h0, 6);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(1251720284);
                        int i10 = 0;
                        for (Object obj3 : arrayList) {
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                AbstractC0000a.m32Q0();
                                throw null;
                            }
                            C3958e c3958e = (C3958e) obj3;
                            int iIntValue2 = ((Number) c3958e.f12961g).intValue();
                            C0033a c0033a = (C0033a) c3958e.f12962h;
                            boolean zBooleanValue = ((Boolean) this.f17605l.getValue()).booleanValue();
                            List list = this.f17603j;
                            C1823e c1823e = C1851l.f6155a;
                            if (zBooleanValue) {
                                c1836h0.m4525a0(-274992923);
                                String str = c0033a.f106d;
                                if (AbstractC3149m.m6721t0(str)) {
                                    str = c0033a.f105c;
                                }
                                C4759bp c4759bp = new C4759bp(str, iIntValue2, AbstractC4955ho.m9626o5(c0033a, list));
                                InterfaceC1809a1 interfaceC1809a1 = this.f17606m;
                                boolean zContains = ((Set) interfaceC1809a1.getValue()).contains(c0033a.f103a);
                                boolean zM4538h = c1836h0.m4538h(c0033a);
                                Object objM4514P = c1836h0.m4514P();
                                if (zM4538h || objM4514P == c1823e) {
                                    objM4514P = new C4056v1(c0033a, 21, interfaceC1809a1);
                                    c1836h0.m4545k0(objM4514P);
                                }
                                AbstractC4955ho.m9703x2(c4759bp, zContains, (InterfaceC1220a) objM4514P, c1836h0, 0);
                                c1836h0.m4553p(false);
                            } else {
                                c1836h0.m4525a0(-274082701);
                                String str2 = c0033a.f106d;
                                if (AbstractC3149m.m6721t0(str2)) {
                                    str2 = c0033a.f105c;
                                }
                                String strM9626o5 = AbstractC4955ho.m9626o5(c0033a, list);
                                InterfaceC1235p interfaceC1235p = this.f17604k;
                                boolean zM4534f = c1836h0.m4534f(interfaceC1235p) | c1836h0.m4530d(iIntValue2) | c1836h0.m4538h(c0033a);
                                Object objM4514P2 = c1836h0.m4514P();
                                if (zM4534f || objM4514P2 == c1823e) {
                                    objM4514P2 = new C1676e0(interfaceC1235p, iIntValue2, c0033a, 3);
                                    c1836h0.m4545k0(objM4514P2);
                                }
                                AbstractC4955ho.m9704x3(str2, strM9626o5, (InterfaceC1220a) objM4514P2, c1836h0, 0);
                                c1836h0.m4553p(false);
                            }
                            if (i10 < arrayList.size() - 1) {
                                c1836h0.m4525a0(545361738);
                                AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                            } else {
                                c1836h0.m4525a0(-273641850);
                            }
                            c1836h0.m4553p(false);
                            i10 = i11;
                        }
                        c1836h0.m4553p(false);
                    }
                }
                return C3967n.f12976a;
            case 1:
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ArrayList arrayList2 = this.f17601h;
                    if (arrayList2.isEmpty()) {
                        c1836h0.m4525a0(856045271);
                        AbstractC4955ho.m9657s0(this.f17602i.isEmpty() ? "暂无适用聊天。" : "没有匹配结果。", c1836h0, 0);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(856199651);
                        int i12 = 0;
                        for (Object obj4 : arrayList2) {
                            int i13 = i12 + 1;
                            if (i12 < 0) {
                                AbstractC0000a.m32Q0();
                                throw null;
                            }
                            C3958e c3958e2 = (C3958e) obj4;
                            int iIntValue3 = ((Number) c3958e2.f12961g).intValue();
                            C4297h c4297h = (C4297h) c3958e2.f12962h;
                            boolean zBooleanValue2 = ((Boolean) this.f17605l.getValue()).booleanValue();
                            List list2 = this.f17603j;
                            C1823e c1823e2 = C1851l.f6155a;
                            if (zBooleanValue2) {
                                c1836h0.m4525a0(16168934);
                                String str3 = c4297h.f14290c;
                                if (AbstractC3149m.m6721t0(str3)) {
                                    str3 = c4297h.f14289b;
                                }
                                C4759bp c4759bp2 = new C4759bp(str3, iIntValue3, AbstractC4955ho.m9689v5(c4297h, list2));
                                InterfaceC1809a1 interfaceC1809a12 = this.f17606m;
                                boolean zContains2 = ((Set) interfaceC1809a12.getValue()).contains(c4297h.f14288a);
                                boolean zM4538h2 = c1836h0.m4538h(c4297h);
                                Object objM4514P3 = c1836h0.m4514P();
                                if (zM4538h2 || objM4514P3 == c1823e2) {
                                    objM4514P3 = new C4056v1(c4297h, 23, interfaceC1809a12);
                                    c1836h0.m4545k0(objM4514P3);
                                }
                                AbstractC4955ho.m9703x2(c4759bp2, zContains2, (InterfaceC1220a) objM4514P3, c1836h0, 0);
                                c1836h0.m4553p(false);
                            } else {
                                c1836h0.m4525a0(17072956);
                                String str4 = c4297h.f14290c;
                                if (AbstractC3149m.m6721t0(str4)) {
                                    str4 = c4297h.f14289b;
                                }
                                String strM9689v5 = AbstractC4955ho.m9689v5(c4297h, list2);
                                InterfaceC1235p interfaceC1235p2 = this.f17604k;
                                boolean zM4534f2 = c1836h0.m4534f(interfaceC1235p2) | c1836h0.m4530d(iIntValue3) | c1836h0.m4538h(c4297h);
                                Object objM4514P4 = c1836h0.m4514P();
                                if (zM4534f2 || objM4514P4 == c1823e2) {
                                    objM4514P4 = new C1676e0(interfaceC1235p2, iIntValue3, c4297h, 6);
                                    c1836h0.m4545k0(objM4514P4);
                                }
                                AbstractC4955ho.m9704x3(str4, strM9689v5, (InterfaceC1220a) objM4514P4, c1836h0, 0);
                                c1836h0.m4553p(false);
                            }
                            if (i12 < arrayList2.size() - 1) {
                                c1836h0.m4525a0(1663129741);
                                AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                            } else {
                                c1836h0.m4525a0(17427875);
                            }
                            c1836h0.m4553p(false);
                            i12 = i13;
                        }
                        c1836h0.m4553p(false);
                    }
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            default:
                if (!c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c1836h0.m4519V();
                } else if (this.f17602i.isEmpty()) {
                    c1836h0.m4525a0(-1082883563);
                    AbstractC4955ho.m9657s0("暂无适用聊天。添加群聊或好友后，再给它分配红包模板。", c1836h0, 6);
                    c1836h0.m4553p(false);
                } else {
                    ArrayList arrayList3 = this.f17601h;
                    if (arrayList3.isEmpty()) {
                        c1836h0.m4525a0(-1082760679);
                        AbstractC4955ho.m9657s0("没有匹配结果。可按昵称、ID 或模板名搜索。", c1836h0, 6);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(-1082626263);
                        int i14 = 0;
                        for (Object obj5 : arrayList3) {
                            int i15 = i14 + 1;
                            if (i14 < 0) {
                                AbstractC0000a.m32Q0();
                                throw null;
                            }
                            C3958e c3958e3 = (C3958e) obj5;
                            int iIntValue4 = ((Number) c3958e3.f12961g).intValue();
                            C2921i c2921i = (C2921i) c3958e3.f12962h;
                            boolean zBooleanValue3 = ((Boolean) this.f17605l.getValue()).booleanValue();
                            List list3 = this.f17603j;
                            C1823e c1823e3 = C1851l.f6155a;
                            if (zBooleanValue3) {
                                c1836h0.m4525a0(-1350924915);
                                String str5 = c2921i.f9495c;
                                if (AbstractC3149m.m6721t0(str5)) {
                                    str5 = c2921i.f9494b;
                                }
                                C4759bp c4759bp3 = new C4759bp(str5, iIntValue4, AbstractC4955ho.m9662s5(c2921i, list3));
                                InterfaceC1809a1 interfaceC1809a13 = this.f17606m;
                                boolean zContains3 = ((Set) interfaceC1809a13.getValue()).contains(c2921i.f9493a);
                                boolean zM4538h3 = c1836h0.m4538h(c2921i);
                                Object objM4514P5 = c1836h0.m4514P();
                                if (zM4538h3 || objM4514P5 == c1823e3) {
                                    objM4514P5 = new C4056v1(c2921i, 18, interfaceC1809a13);
                                    c1836h0.m4545k0(objM4514P5);
                                }
                                AbstractC4955ho.m9703x2(c4759bp3, zContains3, (InterfaceC1220a) objM4514P5, c1836h0, 0);
                                c1836h0.m4553p(false);
                            } else {
                                c1836h0.m4525a0(-1350017669);
                                String str6 = c2921i.f9495c;
                                if (AbstractC3149m.m6721t0(str6)) {
                                    str6 = c2921i.f9494b;
                                }
                                String strM9662s5 = AbstractC4955ho.m9662s5(c2921i, list3);
                                InterfaceC1235p interfaceC1235p3 = this.f17604k;
                                boolean zM4534f3 = c1836h0.m4534f(interfaceC1235p3) | c1836h0.m4530d(iIntValue4) | c1836h0.m4538h(c2921i);
                                Object objM4514P6 = c1836h0.m4514P();
                                if (zM4534f3 || objM4514P6 == c1823e3) {
                                    objM4514P6 = new C1676e0(interfaceC1235p3, iIntValue4, c2921i, 2);
                                    c1836h0.m4545k0(objM4514P6);
                                }
                                AbstractC4955ho.m9704x3(str6, strM9662s5, (InterfaceC1220a) objM4514P6, c1836h0, 0);
                                c1836h0.m4553p(false);
                            }
                            if (i14 < arrayList3.size() - 1) {
                                c1836h0.m4525a0(95012069);
                                AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                            } else {
                                c1836h0.m4525a0(-1349579701);
                            }
                            c1836h0.m4553p(false);
                            i14 = i15;
                        }
                        c1836h0.m4553p(false);
                    }
                }
                return C3967n.f12976a;
        }
    }

    public /* synthetic */ C4946hf(List list, ArrayList arrayList, List list2, InterfaceC1235p interfaceC1235p, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, int i9) {
        this.f17600g = i9;
        this.f17602i = list;
        this.f17601h = arrayList;
        this.f17603j = list2;
        this.f17604k = interfaceC1235p;
        this.f17605l = interfaceC1809a1;
        this.f17606m = interfaceC1809a12;
    }
}
