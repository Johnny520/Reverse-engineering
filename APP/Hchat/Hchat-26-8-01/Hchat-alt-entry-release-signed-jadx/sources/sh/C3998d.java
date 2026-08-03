package sh;

import bi.AbstractC0316d;
import bi.AbstractC0325m;
import bi.C0314b;
import bi.C0324l;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p099h.InterfaceC1444b0;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p119i2.C1941n0;
import p218og.AbstractC3149m;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.AbstractC3241o;
import p222p.C3216f1;
import p251r.C3619d;
import p266s0.C3878h;
import p276sf.C3967n;
import p308v1.InterfaceC4412n0;
import p332wb.C5491y2;
import p339x1.C5601f;
import p339x1.InterfaceC5605g;
import p343x6.AbstractC5700d;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;

/* JADX INFO: renamed from: sh.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3998d implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f13085g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f13086h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3998d(String str, int i9) {
        this.f13085g = i9;
        this.f13086h = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        Object obj4;
        C1836h0 c1836h0;
        int i9;
        boolean z9;
        C1836h0 c1836h02;
        Object obj5;
        switch (this.f13085g) {
            case 0:
                C1836h0 c1836h03 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((C3216f1) obj).getClass();
                if (c1836h03.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC4045s.m8250n(this.f13086h, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (C1941n0) ((C0324l) c1836h03.m4542j(AbstractC0325m.f972a)).f962e.getValue(), c1836h03, 0, 0, 131070);
                } else {
                    c1836h03.m4519V();
                }
                break;
            case 1:
                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) obj;
                C1836h0 c1836h04 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                interfaceC1235p.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c1836h04.m4538h(interfaceC1235p) ? 4 : 2;
                }
                if (c1836h04.m4516S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    if (this.f13086h.length() == 0) {
                        c1836h04.m4525a0(-18850263);
                        AbstractC4045s.m8250n("留空使用群主/管理员/群员", null, ((C0314b) c1836h04.m4542j(AbstractC0316d.f944a)).m1238h(), AbstractC5700d.m10248D(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h04, 24576, 0, 262122);
                        C1836h0 c1836h05 = c1836h04;
                        c1836h05.m4553p(false);
                        obj4 = c1836h05;
                    } else {
                        C1836h0 c1836h06 = c1836h04;
                        c1836h06.m4525a0(-18604247);
                        c1836h06.m4553p(false);
                        obj4 = c1836h06;
                    }
                    interfaceC1235p.invoke(obj4, Integer.valueOf(iIntValue2 & 14));
                } else {
                    c1836h04.m4519V();
                }
                break;
            case 2:
                C1836h0 c1836h07 = (C1836h0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h07.m4516S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    AbstractC4045s.m8246j(this.f13086h, AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, 10, 0.0f, 0.0f, 13), c1836h07, 48, 12);
                } else {
                    c1836h07.m4519V();
                }
                break;
            case 3:
                C1836h0 c1836h08 = (C1836h0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h08.m4516S(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    AbstractC4045s.m8246j(this.f13086h, null, c1836h08, 0, 14);
                } else {
                    c1836h08.m4519V();
                }
                break;
            case 4:
                C1836h0 c1836h09 = (C1836h0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h09.m4516S(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    AbstractC4045s.m8246j(this.f13086h, AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, 10, 0.0f, 0.0f, 13), c1836h09, 48, 12);
                } else {
                    c1836h09.m4519V();
                }
                break;
            case 5:
                InterfaceC1235p interfaceC1235p2 = (InterfaceC1235p) obj;
                C1836h0 c1836h010 = (C1836h0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                interfaceC1235p2.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= c1836h010.m4538h(interfaceC1235p2) ? 4 : 2;
                }
                if (c1836h010.m4516S(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    InterfaceC4412n0 interfaceC4412n0M6930d = AbstractC3241o.m6930d(C5840b.f23761g, false);
                    int iHashCode = Long.hashCode(c1836h010.f6095T);
                    C3878h c3878hM4546l = c1836h010.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h010, C5850l.f23787a);
                    InterfaceC5605g.f22815f.getClass();
                    InterfaceC1220a interfaceC1220a = C5601f.f22758b;
                    c1836h010.m4531d0();
                    if (c1836h010.f6094S) {
                        c1836h010.m4544k(interfaceC1220a);
                    } else {
                        c1836h010.m4551n0();
                    }
                    AbstractC1874r.m4615A(C5601f.f22761e, c1836h010, interfaceC4412n0M6930d);
                    AbstractC1874r.m4615A(C5601f.f22760d, c1836h010, c3878hM4546l);
                    AbstractC1874r.m4615A(C5601f.f22762f, c1836h010, Integer.valueOf(iHashCode));
                    AbstractC1874r.m4641w(C5601f.f22763g, c1836h010);
                    AbstractC1874r.m4615A(C5601f.f22759c, c1836h010, interfaceC5853oM10543c);
                    if (AbstractC3149m.m6721t0(this.f13086h)) {
                        c1836h010.m4525a0(-1294328437);
                        AbstractC4045s.m8250n("填写本次版本的更新内容", null, ((C0314b) c1836h010.m4542j(AbstractC0316d.f944a)).m1238h(), AbstractC5700d.m10248D(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h010, 24582, 0, 262122);
                        C1836h0 c1836h011 = c1836h010;
                        c1836h011.m4553p(false);
                        c1836h0 = c1836h011;
                    } else {
                        C1836h0 c1836h012 = c1836h010;
                        c1836h012.m4525a0(-1294057435);
                        c1836h012.m4553p(false);
                        c1836h0 = c1836h012;
                    }
                    interfaceC1235p2.invoke(c1836h0, Integer.valueOf(iIntValue6 & 14));
                    c1836h0.m4553p(true);
                } else {
                    c1836h010.m4519V();
                }
                break;
            case 6:
                InterfaceC1235p interfaceC1235p3 = (InterfaceC1235p) obj;
                C1836h0 c1836h013 = (C1836h0) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                interfaceC1235p3.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= c1836h013.m4538h(interfaceC1235p3) ? 4 : 2;
                }
                if (c1836h013.m4516S(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM6904g = AbstractC3222h1.m6904g(AbstractC3222h1.m6901d(C5850l.f23787a, 1.0f), 34, 0.0f, 2);
                    InterfaceC4412n0 interfaceC4412n0M6930d2 = AbstractC3241o.m6930d(C5840b.f23764j, false);
                    int iHashCode2 = Long.hashCode(c1836h013.f6095T);
                    C3878h c3878hM4546l2 = c1836h013.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c2 = AbstractC5839a.m10543c(c1836h013, interfaceC5853oM6904g);
                    InterfaceC5605g.f22815f.getClass();
                    InterfaceC1220a interfaceC1220a2 = C5601f.f22758b;
                    c1836h013.m4531d0();
                    if (c1836h013.f6094S) {
                        c1836h013.m4544k(interfaceC1220a2);
                    } else {
                        c1836h013.m4551n0();
                    }
                    AbstractC1874r.m4615A(C5601f.f22761e, c1836h013, interfaceC4412n0M6930d2);
                    AbstractC1874r.m4615A(C5601f.f22760d, c1836h013, c3878hM4546l2);
                    AbstractC1874r.m4615A(C5601f.f22762f, c1836h013, Integer.valueOf(iHashCode2));
                    AbstractC1874r.m4641w(C5601f.f22763g, c1836h013);
                    AbstractC1874r.m4615A(C5601f.f22759c, c1836h013, interfaceC5853oM10543c2);
                    if (AbstractC3149m.m6721t0(this.f13086h)) {
                        c1836h013.m4525a0(-1157652548);
                        i9 = iIntValue7;
                        z9 = true;
                        AbstractC4045s.m8250n("输入消息", null, ((C0314b) c1836h013.m4542j(AbstractC0316d.f944a)).m1238h(), AbstractC5700d.m10248D(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h013, 24582, 0, 262122);
                        C1836h0 c1836h014 = c1836h013;
                        c1836h014.m4553p(false);
                        c1836h02 = c1836h014;
                    } else {
                        C1836h0 c1836h015 = c1836h013;
                        i9 = iIntValue7;
                        z9 = true;
                        c1836h015.m4525a0(-1157388273);
                        c1836h015.m4553p(false);
                        c1836h02 = c1836h015;
                    }
                    interfaceC1235p3.invoke(c1836h02, Integer.valueOf(i9 & 14));
                    c1836h02.m4553p(z9);
                } else {
                    c1836h013.m4519V();
                }
                break;
            case 7:
                C1836h0 c1836h016 = (C1836h0) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((InterfaceC1444b0) obj).getClass();
                if (c1836h016.m4516S(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    C5491y2.f22066n.m9875T(this.f13086h, c1836h016, 48);
                } else {
                    c1836h016.m4519V();
                }
                break;
            default:
                InterfaceC1235p interfaceC1235p4 = (InterfaceC1235p) obj;
                C1836h0 c1836h017 = (C1836h0) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                interfaceC1235p4.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= c1836h017.m4538h(interfaceC1235p4) ? 4 : 2;
                }
                int i10 = iIntValue9;
                if (c1836h017.m4516S(i10 & 1, (i10 & 19) != 18)) {
                    if (this.f13086h.length() == 0) {
                        c1836h017.m4525a0(-1954984075);
                        AbstractC4045s.m8250n("搜索昵称 / 群聊备注 / wxid", null, ((C0314b) c1836h017.m4542j(AbstractC0316d.f944a)).m1238h(), AbstractC5700d.m10248D(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h017, 24582, 0, 262122);
                        C1836h0 c1836h018 = c1836h017;
                        c1836h018.m4553p(false);
                        obj5 = c1836h018;
                    } else {
                        c1836h017.m4525a0(-1954752474);
                        c1836h017.m4553p(false);
                        obj5 = c1836h017;
                    }
                    interfaceC1235p4.invoke(obj5, Integer.valueOf(i10 & 14));
                } else {
                    c1836h017.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }
}
