package p158l;

import p071f1.AbstractC0996c0;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p102h2.EnumC1571a;
import p116i.AbstractC1742d;
import p116i.AbstractC1801x;
import p116i.C1758i0;
import p116i.C1761j0;
import p116i.InterfaceC1747e1;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p144k.AbstractC2192n;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.AbstractC3241o;
import p251r.C3619d;
import p259r9.C3766p;
import p276sf.C3967n;
import p356y0.C5850l;
import sh.AbstractC4045s;

/* JADX INFO: renamed from: l.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2411b implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7885g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [l.c.<clinit>():void, w.s.<clinit>():void, wb.p0.<clinit>():void] */
    public /* synthetic */ C2411b(int i9) {
        this.f7885g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        Object objM4380p;
        C1761j0 c1761j0;
        switch (this.f7885g) {
            case 0:
                C2413d c2413d = (C2413d) obj;
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c1836h0.m4534f(c2413d) ? 4 : 2;
                }
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    AbstractC3241o.m6927a(AbstractC2192n.m5430g(AbstractC3222h1.m6902e(AbstractC3222h1.m6901d(AbstractC3208d.m6884n(C5850l.f23787a, 0.0f, AbstractC2415f.f7905l, 1), 1.0f), AbstractC2415f.f7904k), c2413d.f7890c, AbstractC0996c0.f3162b), c1836h0, 0);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 1:
                InterfaceC1747e1 interfaceC1747e1 = (InterfaceC1747e1) obj;
                C1836h0 c1836h02 = (C1836h0) obj2;
                ((Integer) obj3).getClass();
                interfaceC1747e1.getClass();
                c1836h02.m4525a0(-1516577553);
                if (interfaceC1747e1.mo4003c() != EnumC1571a.f5231h) {
                    c1836h02.m4525a0(-1600838470);
                    c1836h02.m4553p(false);
                    objM4380p = AbstractC1742d.m4380p(200, 2, AbstractC1801x.f6010a);
                } else {
                    c1836h02.m4525a0(-1600742835);
                    Object objM4514P = c1836h02.m4514P();
                    if (objM4514P == C1851l.f6155a) {
                        objM4514P = new C3766p(3);
                        c1836h02.m4545k0(objM4514P);
                    }
                    C1758i0 c1758i0 = new C1758i0();
                    ((InterfaceC1231l) objM4514P).invoke(c1758i0);
                    C1761j0 c1761j02 = new C1761j0(c1758i0);
                    c1836h02.m4553p(false);
                    objM4380p = c1761j02;
                }
                c1836h02.m4553p(false);
                break;
            case 2:
                InterfaceC1747e1 interfaceC1747e12 = (InterfaceC1747e1) obj;
                C1836h0 c1836h03 = (C1836h0) obj2;
                ((Integer) obj3).getClass();
                interfaceC1747e12.getClass();
                c1836h03.m4525a0(-476267800);
                Object objMo4003c = interfaceC1747e12.mo4003c();
                EnumC1571a enumC1571a = EnumC1571a.f5231h;
                C1823e c1823e = C1851l.f6155a;
                if (objMo4003c != enumC1571a) {
                    c1836h03.m4525a0(2077976605);
                    Object objM4514P2 = c1836h03.m4514P();
                    if (objM4514P2 == c1823e) {
                        objM4514P2 = new C3766p(4);
                        c1836h03.m4545k0(objM4514P2);
                    }
                    C1758i0 c1758i02 = new C1758i0();
                    ((InterfaceC1231l) objM4514P2).invoke(c1758i02);
                    c1761j0 = new C1761j0(c1758i02);
                    c1836h03.m4553p(false);
                } else {
                    c1836h03.m4525a0(2078199092);
                    Object objM4514P3 = c1836h03.m4514P();
                    if (objM4514P3 == c1823e) {
                        objM4514P3 = new C3766p(5);
                        c1836h03.m4545k0(objM4514P3);
                    }
                    C1758i0 c1758i03 = new C1758i0();
                    ((InterfaceC1231l) objM4514P3).invoke(c1758i03);
                    c1761j0 = new C1761j0(c1758i03);
                    c1836h03.m4553p(false);
                }
                c1836h03.m4553p(false);
                break;
            case 3:
                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) obj;
                C1836h0 c1836h04 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c1836h04.m4538h(interfaceC1235p) ? 4 : 2;
                }
                if (c1836h04.m4516S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    interfaceC1235p.invoke(c1836h04, Integer.valueOf(iIntValue2 & 14));
                } else {
                    c1836h04.m4519V();
                }
                break;
            case 4:
                InterfaceC1235p interfaceC1235p2 = (InterfaceC1235p) obj;
                C1836h0 c1836h05 = (C1836h0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= c1836h05.m4538h(interfaceC1235p2) ? 4 : 2;
                }
                if (c1836h05.m4516S(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    interfaceC1235p2.invoke(c1836h05, Integer.valueOf(iIntValue3 & 14));
                } else {
                    c1836h05.m4519V();
                }
                break;
            case 5:
                C1836h0 c1836h06 = (C1836h0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h06.m4516S(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    AbstractC4045s.m8246j("实用功能", null, c1836h06, 6, 14);
                } else {
                    c1836h06.m4519V();
                }
                break;
            case 6:
                C1836h0 c1836h07 = (C1836h0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h07.m4516S(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    AbstractC4045s.m8246j("微信首页", null, c1836h07, 6, 14);
                } else {
                    c1836h07.m4519V();
                }
                break;
            case 7:
                C1836h0 c1836h08 = (C1836h0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h08.m4516S(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    AbstractC4045s.m8246j("全局头像", null, c1836h08, 6, 14);
                } else {
                    c1836h08.m4519V();
                }
                break;
            case 8:
                C1836h0 c1836h09 = (C1836h0) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h09.m4516S(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    AbstractC4045s.m8246j("自定义头像", null, c1836h09, 6, 14);
                } else {
                    c1836h09.m4519V();
                }
                break;
            case 9:
                C1836h0 c1836h010 = (C1836h0) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h010.m4516S(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    AbstractC4045s.m8246j("应用范围", AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, 10, 0.0f, 0.0f, 13), c1836h010, 54, 12);
                } else {
                    c1836h010.m4519V();
                }
                break;
            case 10:
                C1836h0 c1836h011 = (C1836h0) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h011.m4516S(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    AbstractC4045s.m8246j("快捷入口", AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, 10, 0.0f, 0.0f, 13), c1836h011, 54, 12);
                } else {
                    c1836h011.m4519V();
                }
                break;
            case 11:
                C1836h0 c1836h012 = (C1836h0) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h012.m4516S(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    AbstractC4045s.m8246j("已设置好友", AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, 10, 0.0f, 0.0f, 13), c1836h012, 54, 12);
                } else {
                    c1836h012.m4519V();
                }
                break;
            case 12:
                C1836h0 c1836h013 = (C1836h0) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h013.m4516S(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    AbstractC4045s.m8246j("基础", null, c1836h013, 6, 14);
                } else {
                    c1836h013.m4519V();
                }
                break;
            case 13:
                C1836h0 c1836h014 = (C1836h0) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h014.m4516S(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    AbstractC4045s.m8246j("管理", AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, 10, 0.0f, 0.0f, 13), c1836h014, 54, 12);
                } else {
                    c1836h014.m4519V();
                }
                break;
            case 14:
                C1836h0 c1836h015 = (C1836h0) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h015.m4516S(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    AbstractC4045s.m8246j("模板", null, c1836h015, 6, 14);
                } else {
                    c1836h015.m4519V();
                }
                break;
            case 15:
                C1836h0 c1836h016 = (C1836h0) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h016.m4516S(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    AbstractC4045s.m8246j("添加", AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, 10, 0.0f, 0.0f, 13), c1836h016, 54, 12);
                } else {
                    c1836h016.m4519V();
                }
                break;
            case 16:
                C1836h0 c1836h017 = (C1836h0) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h017.m4516S(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    AbstractC4045s.m8246j("设备", AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, 10, 0.0f, 0.0f, 13), c1836h017, 54, 12);
                } else {
                    c1836h017.m4519V();
                }
                break;
            case 17:
                C1836h0 c1836h018 = (C1836h0) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h018.m4516S(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    AbstractC4045s.m8246j("朋友圈", AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, 10, 0.0f, 0.0f, 13), c1836h018, 54, 12);
                } else {
                    c1836h018.m4519V();
                }
                break;
            case 18:
                C1836h0 c1836h019 = (C1836h0) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h019.m4516S(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    AbstractC4045s.m8246j("娱乐功能", null, c1836h019, 6, 14);
                } else {
                    c1836h019.m4519V();
                }
                break;
            case 19:
                C1836h0 c1836h020 = (C1836h0) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h020.m4516S(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    AbstractC4045s.m8246j("批量配置", null, c1836h020, 6, 14);
                } else {
                    c1836h020.m4519V();
                }
                break;
            case 20:
                C1836h0 c1836h021 = (C1836h0) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h021.m4516S(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    AbstractC4045s.m8246j("模板", AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, 10, 0.0f, 0.0f, 13), c1836h021, 54, 12);
                } else {
                    c1836h021.m4519V();
                }
                break;
            case 21:
                C1836h0 c1836h022 = (C1836h0) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h022.m4516S(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    AbstractC4045s.m8246j("名单", AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, 10, 0.0f, 0.0f, 13), c1836h022, 54, 12);
                } else {
                    c1836h022.m4519V();
                }
                break;
            case 22:
                C1836h0 c1836h023 = (C1836h0) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h023.m4516S(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    AbstractC4045s.m8246j("默认规则", null, c1836h023, 6, 14);
                } else {
                    c1836h023.m4519V();
                }
                break;
            case 23:
                C1836h0 c1836h024 = (C1836h0) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h024.m4516S(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    AbstractC4045s.m8246j("模板", AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, 10, 0.0f, 0.0f, 13), c1836h024, 54, 12);
                } else {
                    c1836h024.m4519V();
                }
                break;
            case 24:
                C1836h0 c1836h025 = (C1836h0) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h025.m4516S(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    AbstractC4045s.m8246j("规则", AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, 10, 0.0f, 0.0f, 13), c1836h025, 54, 12);
                } else {
                    c1836h025.m4519V();
                }
                break;
            case 25:
                C1836h0 c1836h026 = (C1836h0) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h026.m4516S(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    AbstractC4045s.m8246j("模板", null, c1836h026, 6, 14);
                } else {
                    c1836h026.m4519V();
                }
                break;
            case 26:
                C1836h0 c1836h027 = (C1836h0) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h027.m4516S(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    AbstractC4045s.m8246j("类型", AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, 10, 0.0f, 0.0f, 13), c1836h027, 54, 12);
                } else {
                    c1836h027.m4519V();
                }
                break;
            case 27:
                C1836h0 c1836h028 = (C1836h0) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h028.m4516S(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    AbstractC4045s.m8246j("功能", null, c1836h028, 6, 14);
                } else {
                    c1836h028.m4519V();
                }
                break;
            case 28:
                C1836h0 c1836h029 = (C1836h0) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h029.m4516S(iIntValue27 & 1, (iIntValue27 & 17) != 16)) {
                    AbstractC4045s.m8246j("操作", AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, 10, 0.0f, 0.0f, 13), c1836h029, 54, 12);
                } else {
                    c1836h029.m4519V();
                }
                break;
            default:
                C1836h0 c1836h030 = (C1836h0) obj2;
                int iIntValue28 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h030.m4516S(iIntValue28 & 1, (iIntValue28 & 17) != 16)) {
                    AbstractC4045s.m8246j("名单信息", null, c1836h030, 6, 14);
                } else {
                    c1836h030.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }
}
