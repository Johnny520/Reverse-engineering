package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import bi.AbstractC0316d;
import bi.C0314b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p000a.AbstractC0000a;
import p036c9.C0475p0;
import p036c9.C0482r0;
import p051db.C0768f;
import p068eh.AbstractC0921a;
import p080fb.C1165q1;
import p080fb.C1183v;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p144k.AbstractC2192n;
import p218og.AbstractC3149m;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.AbstractC3226j;
import p222p.AbstractC3253s;
import p222p.C3256t;
import p249qg.InterfaceC3599t;
import p266s0.C3878h;
import p276sf.C3967n;
import p317vb.InterfaceC4544a;
import p322w0.C4661l;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p343x6.AbstractC5700d;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import sh.AbstractC3994c;
import sh.AbstractC4045s;
import sh.C4041q1;
import sh.C4056v1;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: wb.d5 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4805d5 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f16502g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f16503h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f16504i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f16505j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f16506k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f16507l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f16508m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f16509n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4805d5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, InterfaceC1220a interfaceC1220a, InterfaceC1231l interfaceC1231l, int i9, int i10) {
        this.f16502g = i10;
        this.f16503h = obj;
        this.f16504i = obj2;
        this.f16505j = obj3;
        this.f16506k = obj4;
        this.f16507l = obj5;
        this.f16508m = interfaceC1220a;
        this.f16509n = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0810  */
    @Override // p085fg.InterfaceC1235p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object c0482r0;
        boolean z9;
        boolean z10;
        C5850l c5850l;
        String str;
        String str2;
        boolean z11;
        boolean z12;
        float f3;
        float f10;
        String str3;
        InterfaceC1809a1 interfaceC1809a1;
        boolean z13;
        switch (this.f16502g) {
            case 0:
                String str4 = (String) this.f16503h;
                String str5 = (String) this.f16504i;
                String str6 = (String) this.f16505j;
                String str7 = (String) this.f16506k;
                C0482r0 c0482r02 = (C0482r0) this.f16507l;
                C0768f c0768f = (C0768f) this.f16508m;
                C5475xi c5475xi = (C5475xi) this.f16509n;
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C5491y2 c5491y2 = C5491y2.f22062j;
                    boolean zM4534f = c1836h0.m4534f(c0768f) | c1836h0.m4534f(c0482r02);
                    Object objM4514P = c1836h0.m4514P();
                    C1823e c1823e = C1851l.f6155a;
                    if (zM4534f || objM4514P == c1823e) {
                        objM4514P = new C0768f(c0768f, 4, c0482r02);
                        c1836h0.m4545k0(objM4514P);
                    }
                    InterfaceC1236q interfaceC1236q = (InterfaceC1236q) objM4514P;
                    boolean zM4534f2 = c1836h0.m4534f(c5475xi) | c1836h0.m4534f(c0482r02);
                    Object objM4514P2 = c1836h0.m4514P();
                    if (zM4534f2 || objM4514P2 == c1823e) {
                        objM4514P2 = new C4056v1(c5475xi, 7, c0482r02);
                        c1836h0.m4545k0(objM4514P2);
                    }
                    c5491y2.m9921y(str4, str5, str6, str7, c0482r02, interfaceC1236q, (InterfaceC1220a) objM4514P2, c1836h0, 12582912);
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 1:
                List list = (List) this.f16503h;
                ArrayList arrayList = (ArrayList) this.f16504i;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f16505j;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f16506k;
                List list2 = (List) this.f16507l;
                List list3 = (List) this.f16508m;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f16509n;
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i9 = 1;
                boolean z14 = false;
                if (!c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c1836h02.m4519V();
                } else if (((Boolean) interfaceC1809a12.getValue()).booleanValue()) {
                    c1836h02.m4525a0(1468117903);
                    AbstractC4955ho.m9657s0("正在载入监听群...", c1836h02, 6);
                    c1836h02.m4553p(false);
                } else if (((String) interfaceC1809a13.getValue()).length() > 0) {
                    c1836h02.m4525a0(1468120136);
                    AbstractC4955ho.m9657s0((String) interfaceC1809a13.getValue(), c1836h02, 0);
                    c1836h02.m4553p(false);
                } else if (list.isEmpty()) {
                    c1836h02.m4525a0(1468122261);
                    AbstractC4955ho.m9657s0("暂无监听群。先选择需要监听的群。", c1836h02, 6);
                    c1836h02.m4553p(false);
                } else if (arrayList.isEmpty()) {
                    c1836h02.m4525a0(1468124651);
                    AbstractC4955ho.m9657s0("没有匹配结果", c1836h02, 6);
                    c1836h02.m4553p(false);
                } else {
                    c1836h02.m4525a0(-1732695628);
                    Iterator it = arrayList.iterator();
                    int i10 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            AbstractC0000a.m32Q0();
                            throw null;
                        }
                        C5292s0 c5292s0 = (C5292s0) next;
                        Set set = (Set) interfaceC1809a14.getValue();
                        String str8 = c5292s0.f20550a;
                        boolean zContains = set.contains(str8);
                        String str9 = c5292s0.f20551b;
                        if (AbstractC3149m.m6721t0(str9)) {
                            str9 = str8;
                        }
                        String strM9340G5 = AbstractC4955ho.m9340G5(str8, str8, list2, list3);
                        boolean zM4534f3 = c1836h02.m4534f(interfaceC1809a14) | c1836h02.m4538h(c5292s0);
                        Object objM4514P3 = c1836h02.m4514P();
                        if (!zM4534f3) {
                            obj3 = objM4514P3;
                            if (objM4514P3 == C1851l.f6155a) {
                                C5068l7 c5068l7 = new C5068l7(c5292s0, 9, interfaceC1809a14);
                                c1836h02.m4545k0(c5068l7);
                                obj3 = c5068l7;
                            }
                        }
                        boolean z15 = z14;
                        int i12 = i9;
                        Iterator it2 = it;
                        AbstractC4955ho.m9410P3(zContains, str9, strM9340G5, false, (InterfaceC1231l) obj3, c1836h02, 0, 8);
                        if (i10 < arrayList.size() - i12) {
                            c1836h02.m4525a0(201607443);
                            AbstractC4955ho.m9312D1(0.0f, c1836h02, z15 ? 1 : 0, i12);
                        } else {
                            c1836h02.m4525a0(1954876893);
                        }
                        c1836h02.m4553p(z15);
                        z14 = z15 ? 1 : 0;
                        i9 = i12;
                        i10 = i11;
                        it = it2;
                    }
                    c1836h02.m4553p(z14);
                }
                return C3967n.f12976a;
            case 2:
                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f16503h;
                Context context = (Context) this.f16504i;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f16505j;
                List list4 = (List) this.f16506k;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f16507l;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f16508m;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f16509n;
                C1836h0 c1836h03 = (C1836h0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C3256t c3256tM6935a = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h03, 0);
                    int iHashCode = Long.hashCode(c1836h03.f6095T);
                    C3878h c3878hM4546l = c1836h03.m4546l();
                    C5850l c5850l2 = C5850l.f23787a;
                    InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h03, c5850l2);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y = C5601f.f22758b;
                    c1836h03.m4531d0();
                    if (c1836h03.f6094S) {
                        c1836h03.m4544k(c5660y);
                    } else {
                        c1836h03.m4551n0();
                    }
                    AbstractC1874r.m4615A(C5601f.f22761e, c1836h03, c3256tM6935a);
                    AbstractC1874r.m4615A(C5601f.f22760d, c1836h03, c3878hM4546l);
                    AbstractC1874r.m4615A(C5601f.f22762f, c1836h03, Integer.valueOf(iHashCode));
                    AbstractC1874r.m4641w(C5601f.f22763g, c1836h03);
                    AbstractC1874r.m4615A(C5601f.f22759c, c1836h03, interfaceC5853oM10543c);
                    c1836h03.m4525a0(-1698738577);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("将删除已选的 " + list4.size() + " 位好友");
                    if (((Boolean) interfaceC1809a15.getValue()).booleanValue()) {
                        sb2.append("，并同时清理聊天记录");
                    }
                    sb2.append("。此操作不可撤销。");
                    List listM8403L1 = AbstractC4166m.m8403L1(6, list4);
                    Object objM4514P4 = c1836h03.m4514P();
                    C1823e c1823e2 = C1851l.f6155a;
                    if (objM4514P4 == c1823e2) {
                        objM4514P4 = new C4661l(27);
                        c1836h03.m4545k0(objM4514P4);
                    }
                    String strM8392A1 = AbstractC4166m.m8392A1(listM8403L1, "、", null, null, (InterfaceC1231l) objM4514P4, 30);
                    if (!AbstractC3149m.m6721t0(strM8392A1)) {
                        sb2.append("\n\n".concat(strM8392A1));
                    }
                    if (list4.size() > 6) {
                        sb2.append(" 等");
                    }
                    String string = sb2.toString();
                    c1836h03.m4553p(false);
                    AbstractC4045s.m8250n(string, null, ((C0314b) c1836h03.m4542j(AbstractC0316d.f944a)).m1237g(), AbstractC5700d.m10248D(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h03, 24576, 0, 262122);
                    boolean zM4534f4 = c1836h03.m4534f(interfaceC1235p) | c1836h03.m4538h(context);
                    Object objM4514P5 = c1836h03.m4514P();
                    if (zM4534f4 || objM4514P5 == c1823e2) {
                        z9 = true;
                        c0482r0 = new C0482r0(interfaceC1235p, interfaceC1809a15, interfaceC1809a16, context, interfaceC1809a17, 11);
                        c1836h03.m4545k0(c0482r0);
                    } else {
                        c0482r0 = objM4514P5;
                        z9 = true;
                    }
                    AbstractC4045s.m8251o("确认删除", (InterfaceC1220a) c0482r0, AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l2, 1.0f), 0.0f, 12, 0.0f, 0.0f, 13), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h03), null, c1836h03, 390, 1912);
                    AbstractC4045s.m8251o("取消", interfaceC1220a, AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l2, 1.0f), 0.0f, 8, 0.0f, 0.0f, 13), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h03), null, c1836h03, 390, 1912);
                    c1836h03.m4553p(z9);
                } else {
                    c1836h03.m4519V();
                }
                return C3967n.f12976a;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9497a2((List) this.f16503h, (List) this.f16504i, (InterfaceC1220a) this.f16505j, (InterfaceC1235p) this.f16506k, (InterfaceC1220a) this.f16507l, (InterfaceC1220a) this.f16508m, (InterfaceC1231l) this.f16509n, (C1836h0) obj, AbstractC1874r.m4617C(224641));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((C5491y2) this.f16503h).m9920v((InterfaceC4544a) this.f16504i, (SharedPreferences) this.f16505j, (Set) this.f16506k, (Set) this.f16507l, (InterfaceC1220a) this.f16508m, (InterfaceC1231l) this.f16509n, (C1836h0) obj, AbstractC1874r.m4617C(1769473));
                break;
            case 5:
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f16503h;
                C1183v c1183v = (C1183v) this.f16504i;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f16505j;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f16506k;
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) this.f16507l;
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) this.f16508m;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) this.f16509n;
                C1836h0 c1836h04 = (C1836h0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    String strM2250m = ((Boolean) interfaceC1809a110.getValue()).booleanValue() ? "正在拉取模型" : !AbstractC3149m.m6721t0((String) interfaceC1809a111.getValue()) ? (String) interfaceC1809a111.getValue() : AbstractC0921a.m2250m(((List) interfaceC1809a18.getValue()).size(), "已获取 ", " 个模型");
                    boolean zM4538h = c1836h04.m4538h(interfaceC3599t) | c1836h04.m4538h(c1183v) | c1836h04.m4534f(interfaceC1809a18) | c1836h04.m4534f(interfaceC1809a19);
                    Object objM4514P6 = c1836h04.m4514P();
                    C1823e c1823e3 = C1851l.f6155a;
                    if (zM4538h || objM4514P6 == c1823e3) {
                        C0475p0 c0475p0 = new C0475p0(interfaceC3599t, interfaceC1809a110, interfaceC1809a111, c1183v, interfaceC1809a18, interfaceC1809a19, 15);
                        c1836h04.m4545k0(c0475p0);
                        objM4514P6 = c0475p0;
                    }
                    AbstractC4955ho.m9503b("拉取模型列表", strM2250m, (InterfaceC1220a) objM4514P6, c1836h04, 6);
                    if (((List) interfaceC1809a18.getValue()).isEmpty()) {
                        c1836h04.m4525a0(871238184);
                        c1836h04.m4553p(false);
                    } else {
                        c1836h04.m4525a0(871110371);
                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                        String str10 = (String) interfaceC1809a112.getValue();
                        Object objM4514P7 = c1836h04.m4514P();
                        if (objM4514P7 == c1823e3) {
                            objM4514P7 = new C5086lp(interfaceC1809a112, 5);
                            c1836h04.m4545k0(objM4514P7);
                        }
                        AbstractC4955ho.m9304C1("搜索", "输入模型名称", str10, 0, (InterfaceC1231l) objM4514P7, c1836h04, 24630, 8);
                        c1836h04.m4553p(false);
                    }
                } else {
                    c1836h04.m4519V();
                }
                return C3967n.f12976a;
            default:
                C1165q1 c1165q1 = (C1165q1) this.f16503h;
                String str11 = c1165q1.f3877d;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f16504i;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) this.f16505j;
                InterfaceC3599t interfaceC3599t2 = (InterfaceC3599t) this.f16506k;
                InterfaceC1809a1 interfaceC1809a114 = (InterfaceC1809a1) this.f16507l;
                Context context2 = (Context) this.f16508m;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f16509n;
                C1836h0 c1836h05 = (C1836h0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    C5850l c5850l3 = C5850l.f23787a;
                    InterfaceC5853o interfaceC5853oM5441r = AbstractC2192n.m5441r(AbstractC3222h1.m6904g(AbstractC3222h1.m6901d(c5850l3, 1.0f), 0.0f, 460, 1), AbstractC2192n.m5440q(c1836h05), true, true);
                    C3256t c3256tM6935a2 = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h05, 0);
                    int iHashCode2 = Long.hashCode(c1836h05.f6095T);
                    C3878h c3878hM4546l2 = c1836h05.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c2 = AbstractC5839a.m10543c(c1836h05, interfaceC5853oM5441r);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y2 = C5601f.f22758b;
                    c1836h05.m4531d0();
                    if (c1836h05.f6094S) {
                        c1836h05.m4544k(c5660y2);
                    } else {
                        c1836h05.m4551n0();
                    }
                    AbstractC1874r.m4615A(C5601f.f22761e, c1836h05, c3256tM6935a2);
                    AbstractC1874r.m4615A(C5601f.f22760d, c1836h05, c3878hM4546l2);
                    AbstractC1874r.m4615A(C5601f.f22762f, c1836h05, Integer.valueOf(iHashCode2));
                    AbstractC1874r.m4641w(C5601f.f22763g, c1836h05);
                    AbstractC1874r.m4615A(C5601f.f22759c, c1836h05, interfaceC5853oM10543c2);
                    C5491y2 c5491y22 = C5491y2.f22066n;
                    boolean zM9789M1 = C5491y2.m9789M1(c1165q1);
                    String str12 = c1165q1.f3878e;
                    String str13 = c1165q1.f3879f;
                    if (!zM9789M1 || AbstractC3149m.m6721t0(str13)) {
                        z10 = false;
                        c1836h05.m4525a0(-204653183);
                        c1836h05.m4553p(false);
                    } else {
                        c1836h05.m4525a0(-204731985);
                        c5491y22.m9875T(str13, c1836h05, 48);
                        z10 = false;
                        c1836h05.m4553p(false);
                    }
                    if (zM9789M1 || AbstractC3149m.m6721t0(str11)) {
                        c5850l = c5850l3;
                        str = str12;
                        str2 = str13;
                        z11 = zM9789M1;
                        z12 = z10;
                        f3 = 1.0f;
                        c1836h05.m4525a0(-204212735);
                        c1836h05.m4553p(z12);
                    } else {
                        c1836h05.m4525a0(-204572149);
                        float f11 = 4;
                        AbstractC4045s.m8250n("调用参数", AbstractC3208d.m6883m(c5850l3, f11, f11), ((C0314b) c1836h05.m4542j(AbstractC0316d.f944a)).m1238h(), AbstractC5700d.m10248D(12), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h05, 24630, 0, 262120);
                        str = str12;
                        str2 = str13;
                        z11 = zM9789M1;
                        c5850l = c5850l3;
                        f3 = 1.0f;
                        z12 = false;
                        c1836h05 = c1836h05;
                        C5491y2.f22061i.m9884c(384, 2, null, c1836h05, str11);
                        c1836h05.m4553p(false);
                    }
                    if (z11 || AbstractC3149m.m6721t0(str2)) {
                        f10 = f3;
                        str3 = str;
                        c1836h05.m4525a0(-203772287);
                        c1836h05.m4553p(z12);
                    } else {
                        c1836h05.m4525a0(-204136506);
                        long jM1238h = ((C0314b) c1836h05.m4542j(AbstractC0316d.f944a)).m1238h();
                        long jM10248D = AbstractC5700d.m10248D(12);
                        float f12 = 4;
                        InterfaceC5853o interfaceC5853oM6883m = AbstractC3208d.m6883m(c5850l, f12, f12);
                        f10 = f3;
                        str3 = str;
                        AbstractC4045s.m8250n("代码差异", interfaceC5853oM6883m, jM1238h, jM10248D, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h05, 24630, 0, 262120);
                        c5491y22.m9875T(str2, c1836h05, 48);
                        c1836h05.m4553p(z12);
                    }
                    C1823e c1823e4 = C1851l.f6155a;
                    if (z11 || AbstractC3149m.m6721t0(str3)) {
                        c1836h05.m4525a0(-202991583);
                        c1836h05.m4553p(z12);
                    } else {
                        c1836h05.m4525a0(-203683503);
                        float f13 = 4;
                        AbstractC4045s.m8250n(c1165q1.f3880g.equals("success") ? "执行结果" : "执行信息", AbstractC3208d.m6883m(c5850l, f13, f13), ((C0314b) c1836h05.m4542j(AbstractC0316d.f944a)).m1238h(), AbstractC5700d.m10248D(12), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h05, 24624, 0, 262120);
                        c5491y22.m9914r0(c1165q1, str3, c1836h05, 384);
                        boolean zM4534f5 = c1836h05.m4534f(interfaceC1231l) | c1836h05.m4538h(c1165q1);
                        Object objM4514P8 = c1836h05.m4514P();
                        if (zM4534f5 || objM4514P8 == c1823e4) {
                            objM4514P8 = new C5475xi(interfaceC1231l, 19, c1165q1);
                            c1836h05.m4545k0(objM4514P8);
                        }
                        AbstractC4045s.m8251o("复制结果", (InterfaceC1220a) objM4514P8, AbstractC3222h1.m6901d(c5850l, f10), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h05), null, c1836h05, 390, 1912);
                        c1836h05.m4553p(false);
                    }
                    if (z11 || AbstractC3149m.m6721t0(c1165q1.f3889p)) {
                        c1836h05.m4525a0(-201344863);
                        c1836h05.m4553p(false);
                    } else {
                        c1836h05.m4525a0(-202869970);
                        float f14 = 4;
                        AbstractC4045s.m8250n(AbstractC0921a.m2250m(c1165q1.f3890q, "完整结果已保存（", " 字符）"), AbstractC3208d.m6883m(c5850l, f14, f14), ((C0314b) c1836h05.m4542j(AbstractC0316d.f944a)).m1238h(), AbstractC5700d.m10248D(12), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h05, 24624, 0, 262120);
                        String str14 = ((Boolean) interfaceC1809a113.getValue()).booleanValue() ? "正在读取完整结果" : "加载完整结果";
                        boolean z16 = !((Boolean) interfaceC1809a113.getValue()).booleanValue();
                        InterfaceC5853o interfaceC5853oM6901d = AbstractC3222h1.m6901d(c5850l, f10);
                        C4041q1 c4041q1M8227a = AbstractC3994c.m8227a(c1836h05);
                        boolean zM4534f6 = c1836h05.m4534f(interfaceC1809a113) | c1836h05.m4538h(interfaceC3599t2) | c1836h05.m4534f(interfaceC1809a114) | c1836h05.m4538h(context2) | c1836h05.m4538h(c1165q1);
                        Object objM4514P9 = c1836h05.m4514P();
                        if (zM4534f6 || objM4514P9 == c1823e4) {
                            interfaceC1809a1 = interfaceC1809a114;
                            C0482r0 c0482r03 = new C0482r0(interfaceC3599t2, interfaceC1809a113, context2, c1165q1, interfaceC1809a1, 25);
                            c1836h05.m4545k0(c0482r03);
                            objM4514P9 = c0482r03;
                        } else {
                            interfaceC1809a1 = interfaceC1809a114;
                        }
                        AbstractC4045s.m8251o(str14, (InterfaceC1220a) objM4514P9, interfaceC5853oM6901d, z16, 0.0f, 0.0f, 0.0f, c4041q1M8227a, null, c1836h05, 384, 1904);
                        String str15 = (String) interfaceC1809a1.getValue();
                        if (str15 == null) {
                            c1836h05.m4525a0(-201759613);
                            z13 = false;
                            c1836h05.m4553p(false);
                        } else {
                            c1836h05.m4525a0(-201759612);
                            c5491y22.m9914r0(c1165q1, str15, c1836h05, 384);
                            boolean zM4534f7 = c1836h05.m4534f(interfaceC1231l) | c1836h05.m4534f(str15);
                            Object objM4514P10 = c1836h05.m4514P();
                            if (zM4534f7 || objM4514P10 == c1823e4) {
                                objM4514P10 = new C5362u4(3, interfaceC1231l, str15);
                                c1836h05.m4545k0(objM4514P10);
                            }
                            AbstractC4045s.m8251o("复制完整结果", (InterfaceC1220a) objM4514P10, AbstractC3222h1.m6901d(c5850l, f10), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h05), null, c1836h05, 390, 1912);
                            z13 = false;
                            c1836h05.m4553p(false);
                        }
                        c1836h05.m4553p(z13);
                    }
                    AbstractC4045s.m8251o("关闭", interfaceC1220a2, AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l, f10), 0.0f, 8, 0.0f, 0.0f, 13), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h05), null, c1836h05, 390, 1912);
                    c1836h05.m4553p(true);
                } else {
                    c1836h05.m4519V();
                }
                return C3967n.f12976a;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4805d5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i9) {
        this.f16502g = i9;
        this.f16503h = obj;
        this.f16504i = obj2;
        this.f16505j = obj3;
        this.f16506k = obj4;
        this.f16507l = obj5;
        this.f16508m = obj6;
        this.f16509n = obj7;
    }
}
