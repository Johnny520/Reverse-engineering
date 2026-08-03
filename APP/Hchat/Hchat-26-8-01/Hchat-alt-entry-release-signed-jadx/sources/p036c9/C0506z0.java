package p036c9;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;
import okhttp3.Response;
import p011ab.C0045e;
import p015b0.C0146l;
import p025bc.AbstractC0255e;
import p049d9.AbstractC0754o;
import p063e9.C0832c;
import p068eh.AbstractC0921a;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p243q9.C3471g;
import p249qg.InterfaceC3599t;
import p251r.C3641z;
import p276sf.C3967n;
import p317vb.InterfaceC4544a;
import p332wb.AbstractC4955ho;
import p332wb.C4712ab;
import p332wb.C4749bf;
import p332wb.C4759bp;
import p332wb.C4813dd;
import p332wb.C4933h2;
import p332wb.C4957hq;
import p332wb.C4969i5;
import p332wb.C5068l7;
import p332wb.C5070l9;
import p332wb.C5108me;
import p332wb.C5124mu;
import p332wb.C5292s0;
import p332wb.C5435wb;
import p332wb.C5468xb;
import p345x8.C5709b;
import p345x8.C5724q;
import sh.C4056v1;

/* JADX INFO: renamed from: c9.z0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0506z0 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1544g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f1545h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f1546i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f1547j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1548k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f1549l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f1550m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0506z0(C3471g c3471g, ArrayList arrayList, List list, String str, String str2, InterfaceC1231l interfaceC1231l) {
        this.f1544g = 8;
        this.f1548k = c3471g;
        this.f1549l = arrayList;
        this.f1545h = list;
        this.f1546i = str;
        this.f1550m = str2;
        this.f1547j = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        String str;
        String str2;
        switch (this.f1544g) {
            case 0:
                ((Integer) obj2).getClass();
                ((C0452j1) this.f1548k).m1463d((List) this.f1545h, (Set) this.f1549l, (InterfaceC1231l) this.f1547j, (InterfaceC1220a) this.f1546i, (InterfaceC1220a) this.f1550m, (C1836h0) obj, AbstractC1874r.m4617C(196609));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((C4933h2) this.f1548k).m9281a((Context) this.f1549l, (C0414a) this.f1550m, (List) this.f1545h, (InterfaceC1220a) this.f1546i, (InterfaceC1231l) this.f1547j, (C1836h0) obj, AbstractC1874r.m4617C(196609));
                break;
            case 2:
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f1548k;
                String str3 = (String) this.f1545h;
                final InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f1547j;
                final C0414a c0414a = (C0414a) this.f1549l;
                C0414a c0414a2 = (C0414a) this.f1546i;
                final InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f1550m;
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String str4 = (String) interfaceC1809a1.getValue();
                    boolean zM4534f = c1836h0.m4534f(interfaceC1809a1);
                    Object objM4514P = c1836h0.m4514P();
                    C1823e c1823e = C1851l.f6155a;
                    if (zM4534f || objM4514P == c1823e) {
                        objM4514P = new C0146l(interfaceC1809a1, 16);
                        c1836h0.m4545k0(objM4514P);
                    }
                    AbstractC4955ho.m9304C1("分组名称", "同一层级内不能重名", str4, 0, (InterfaceC1231l) objM4514P, c1836h0, 54, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    String str5 = AbstractC3149m.m6721t0(str3) ? "微信首页" : str3;
                    boolean zM4534f2 = c1836h0.m4534f(interfaceC1231l) | c1836h0.m4538h(c0414a);
                    Object objM4514P2 = c1836h0.m4514P();
                    if (zM4534f2 || objM4514P2 == c1823e) {
                        final int i9 = 0;
                        objM4514P2 = new InterfaceC1220a() { // from class: wb.c2
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1220a
                            public final Object invoke() {
                                switch (i9) {
                                    case 0:
                                        interfaceC1231l.invoke(c0414a);
                                        break;
                                    default:
                                        interfaceC1231l.invoke(c0414a);
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        c1836h0.m4545k0(objM4514P2);
                    }
                    AbstractC4955ho.m9503b("上级分组", str5, (InterfaceC1220a) objM4514P2, c1836h0, 6);
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    String strM2250m = c0414a2.f1183e.isEmpty() ? "未选择会话" : AbstractC0921a.m2250m(c0414a2.f1183e.size(), "已选择 ", " 个会话");
                    boolean zM4534f3 = c1836h0.m4534f(interfaceC1231l2) | c1836h0.m4538h(c0414a);
                    Object objM4514P3 = c1836h0.m4514P();
                    if (zM4534f3 || objM4514P3 == c1823e) {
                        final int i10 = 1;
                        objM4514P3 = new InterfaceC1220a() { // from class: wb.c2
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1220a
                            public final Object invoke() {
                                switch (i10) {
                                    case 0:
                                        interfaceC1231l2.invoke(c0414a);
                                        break;
                                    default:
                                        interfaceC1231l2.invoke(c0414a);
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        c1836h0.m4545k0(objM4514P3);
                    }
                    AbstractC4955ho.m9503b("会话", strM2250m, (InterfaceC1220a) objM4514P3, c1836h0, 6);
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9605m2((InterfaceC4544a) this.f1548k, (SharedPreferences) this.f1545h, (Set) this.f1549l, (Set) this.f1550m, (InterfaceC1220a) this.f1546i, (InterfaceC1231l) this.f1547j, (C1836h0) obj, AbstractC1874r.m4617C(196609));
                break;
            case 4:
                Context context = (Context) this.f1548k;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f1545h;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f1549l;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f1547j;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f1546i;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f1550m;
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String str6 = (String) interfaceC1809a12.getValue();
                    Object objM4514P4 = c1836h02.m4514P();
                    C1823e c1823e2 = C1851l.f6155a;
                    if (objM4514P4 == c1823e2) {
                        objM4514P4 = new C4712ab(interfaceC1809a12, 22);
                        c1836h02.m4545k0(objM4514P4);
                    }
                    AbstractC4955ho.m9304C1("URI", "例如 /cgi-bin/micromsg-bin/oplog", str6, 0, (InterfaceC1231l) objM4514P4, c1836h02, 24630, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    String str7 = (String) interfaceC1809a13.getValue();
                    Object objM4514P5 = c1836h02.m4514P();
                    if (objM4514P5 == c1823e2) {
                        objM4514P5 = new C4712ab(interfaceC1809a13, 23);
                        c1836h02.m4545k0(objM4514P5);
                    }
                    AbstractC4955ho.m9304C1("Type", "CGI ID，例如 681", str7, 0, (InterfaceC1231l) objM4514P5, c1836h02, 24630, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    String str8 = (String) interfaceC1809a14.getValue();
                    Object objM4514P6 = c1836h02.m4514P();
                    if (objM4514P6 == c1823e2) {
                        objM4514P6 = new C4712ab(interfaceC1809a14, 24);
                        c1836h02.m4545k0(objM4514P6);
                    }
                    AbstractC4955ho.m9304C1("FuncId", "默认 0", str8, 0, (InterfaceC1231l) objM4514P6, c1836h02, 24630, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    String str9 = (String) interfaceC1809a15.getValue();
                    Object objM4514P7 = c1836h02.m4514P();
                    if (objM4514P7 == c1823e2) {
                        objM4514P7 = new C4712ab(interfaceC1809a15, 25);
                        c1836h02.m4545k0(objM4514P7);
                    }
                    AbstractC4955ho.m9304C1("RouteId", "默认 0", str9, 0, (InterfaceC1231l) objM4514P7, c1836h02, 24630, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    String str10 = (String) interfaceC1809a16.getValue();
                    Object objM4514P8 = c1836h02.m4514P();
                    if (objM4514P8 == c1823e2) {
                        objM4514P8 = new C4712ab(interfaceC1809a16, 26);
                        c1836h02.m4545k0(objM4514P8);
                    }
                    AbstractC4955ho.m9304C1("JSON 载荷", "字段号作为 key；字符串按 UTF-8，hex-> 表示原始字节", str10, 8, (InterfaceC1231l) objM4514P8, c1836h02, 27702, 0);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    boolean zM4538h = c1836h02.m4538h(context);
                    Object objM4514P9 = c1836h02.m4514P();
                    if (zM4538h || objM4514P9 == c1823e2) {
                        objM4514P9 = new C0475p0(context, interfaceC1809a13, interfaceC1809a14, interfaceC1809a15, interfaceC1809a12, interfaceC1809a16, 5);
                        c1836h02.m4545k0(objM4514P9);
                    }
                    AbstractC4955ho.m9503b("发送", "优先通用发包，未就绪时使用同类请求编辑重放", (InterfaceC1220a) objM4514P9, c1836h02, 54);
                } else {
                    c1836h02.m4519V();
                }
                return C3967n.f12976a;
            case 5:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f1548k;
                Context context2 = (Context) this.f1545h;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f1549l;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f1547j;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f1546i;
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) this.f1550m;
                C1836h0 c1836h03 = (C1836h0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) interfaceC1809a17.getValue()).booleanValue();
                    boolean zM4538h2 = c1836h03.m4538h(sharedPreferences);
                    Object objM4514P10 = c1836h03.m4514P();
                    C1823e c1823e3 = C1851l.f6155a;
                    if (zM4538h2 || objM4514P10 == c1823e3) {
                        objM4514P10 = new C5435wb(sharedPreferences, interfaceC1809a17, 9);
                        c1836h03.m4545k0(objM4514P10);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue, "启用虚拟定位", "同时覆盖微信和小程序获取的位置", false, (InterfaceC1231l) objM4514P10, c1836h03, 432, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                    boolean zM4538h3 = c1836h03.m4538h(context2) | c1836h03.m4538h(sharedPreferences);
                    Object objM4514P11 = c1836h03.m4514P();
                    if (zM4538h3 || objM4514P11 == c1823e3) {
                        objM4514P11 = new C5468xb(context2, sharedPreferences, interfaceC1809a18, interfaceC1809a19);
                        c1836h03.m4545k0(objM4514P11);
                    }
                    AbstractC4955ho.m9503b("搜索并选择位置", "打开微信选择位置页，可搜索地点", (InterfaceC1220a) objM4514P11, c1836h03, 54);
                    AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                    Object objM4514P12 = c1836h03.m4514P();
                    if (objM4514P12 == c1823e3) {
                        objM4514P12 = new C5070l9(interfaceC1809a110, 19);
                        c1836h03.m4545k0(objM4514P12);
                    }
                    AbstractC4955ho.m9503b("手动输入经纬度", "纬度 -90~90，经度 -180~180", (InterfaceC1220a) objM4514P12, c1836h03, 438);
                    AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                    String str11 = (String) interfaceC1809a18.getValue();
                    boolean zM4538h4 = c1836h03.m4538h(context2);
                    Object objM4514P13 = c1836h03.m4514P();
                    if (zM4538h4 || objM4514P13 == c1823e3) {
                        objM4514P13 = new C4813dd(context2, interfaceC1809a18, 0);
                        c1836h03.m4545k0(objM4514P13);
                    }
                    AbstractC4955ho.m9296B1("当前纬度", str11, (InterfaceC1220a) objM4514P13, c1836h03, 6, 0);
                    AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                    String str12 = (String) interfaceC1809a19.getValue();
                    boolean zM4538h5 = c1836h03.m4538h(context2);
                    Object objM4514P14 = c1836h03.m4514P();
                    if (zM4538h5 || objM4514P14 == c1823e3) {
                        objM4514P14 = new C4813dd(context2, interfaceC1809a19, 1);
                        c1836h03.m4545k0(objM4514P14);
                    }
                    AbstractC4955ho.m9296B1("当前经度", str12, (InterfaceC1220a) objM4514P14, c1836h03, 6, 0);
                } else {
                    c1836h03.m4519V();
                }
                return C3967n.f12976a;
            case 6:
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.f1548k;
                C5292s0 c5292s0 = (C5292s0) this.f1545h;
                Context context3 = (Context) this.f1549l;
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) this.f1547j;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) this.f1546i;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) this.f1550m;
                C1836h0 c1836h04 = (C1836h0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zBooleanValue2 = ((Boolean) interfaceC1809a111.getValue()).booleanValue();
                    boolean zM4538h6 = c1836h04.m4538h(sharedPreferences2);
                    Object objM4514P15 = c1836h04.m4514P();
                    C1823e c1823e4 = C1851l.f6155a;
                    if (zM4538h6 || objM4514P15 == c1823e4) {
                        objM4514P15 = new C5108me(sharedPreferences2, interfaceC1809a111, 15);
                        c1836h04.m4545k0(objM4514P15);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue2, "启用自定义好友头像", "仅修改本机显示，不会更改好友的微信头像", false, (InterfaceC1231l) objM4514P15, c1836h04, 432, 8);
                    if (((Boolean) interfaceC1809a111.getValue()).booleanValue()) {
                        c1836h04.m4525a0(722608177);
                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                        if (c5292s0 == null || (str = c5292s0.f20551b) == null) {
                            str = "选择要设置头像的好友";
                        }
                        Object objM4514P16 = c1836h04.m4514P();
                        if (objM4514P16 == c1823e4) {
                            objM4514P16 = new C4749bf(interfaceC1809a112, 4);
                            c1836h04.m4545k0(objM4514P16);
                        }
                        AbstractC4955ho.m9503b("选择好友", str, (InterfaceC1220a) objM4514P16, c1836h04, 390);
                        if (c5292s0 != null) {
                            c1836h04.m4525a0(723025158);
                            AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                            String str13 = AbstractC0754o.m1947d(context3, c5292s0.f20550a) ? "更换头像" : "设置头像";
                            boolean zM4538h7 = c1836h04.m4538h(context3) | c1836h04.m4538h(c5292s0);
                            Object objM4514P17 = c1836h04.m4514P();
                            if (zM4538h7 || objM4514P17 == c1823e4) {
                                objM4514P17 = new C0045e(context3, c5292s0, interfaceC1809a113, 22);
                                c1836h04.m4545k0(objM4514P17);
                            }
                            AbstractC4955ho.m9503b(str13, "从系统相册或文件中选择图片", (InterfaceC1220a) objM4514P17, c1836h04, 48);
                            c1836h04.m4553p(false);
                        } else {
                            c1836h04.m4525a0(724480112);
                            c1836h04.m4553p(false);
                        }
                        c1836h04.m4553p(false);
                    } else {
                        c1836h04.m4525a0(724513840);
                        c1836h04.m4553p(false);
                    }
                } else {
                    c1836h04.m4519V();
                }
                return C3967n.f12976a;
            case 7:
                C0832c c0832c = (C0832c) this.f1548k;
                Context context4 = (Context) this.f1545h;
                InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) this.f1547j;
                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f1549l;
                InterfaceC1809a1 interfaceC1809a114 = (InterfaceC1809a1) this.f1546i;
                InterfaceC1809a1 interfaceC1809a115 = (InterfaceC1809a1) this.f1550m;
                C1836h0 c1836h05 = (C1836h0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zBooleanValue3 = ((Boolean) interfaceC1809a114.getValue()).booleanValue();
                    C1823e c1823e5 = C1851l.f6155a;
                    if (zBooleanValue3) {
                        c1836h05.m4525a0(592135501);
                        C4759bp c4759bp = new C4759bp(AbstractC4955ho.m9545f5(c0832c), 0, AbstractC4955ho.m9536e5(context4, c0832c));
                        boolean zContains = ((Set) interfaceC1809a115.getValue()).contains(c0832c.f2511b);
                        boolean zM4538h8 = c1836h05.m4538h(c0832c);
                        Object objM4514P18 = c1836h05.m4514P();
                        if (zM4538h8 || objM4514P18 == c1823e5) {
                            objM4514P18 = new C4056v1(c0832c, 19, interfaceC1809a115);
                            c1836h05.m4545k0(objM4514P18);
                        }
                        AbstractC4955ho.m9703x2(c4759bp, zContains, (InterfaceC1220a) objM4514P18, c1836h05, 0);
                        c1836h05.m4553p(false);
                    } else {
                        c1836h05.m4525a0(593066679);
                        String strM9545f5 = AbstractC4955ho.m9545f5(c0832c);
                        String strM9536e5 = AbstractC4955ho.m9536e5(context4, c0832c);
                        boolean zM4534f4 = c1836h05.m4534f(interfaceC1231l3) | c1836h05.m4538h(c0832c);
                        Object objM4514P19 = c1836h05.m4514P();
                        if (zM4534f4 || objM4514P19 == c1823e5) {
                            objM4514P19 = new C4056v1(interfaceC1231l3, 20, c0832c);
                            c1836h05.m4545k0(objM4514P19);
                        }
                        AbstractC4955ho.m9503b(strM9545f5, strM9536e5, (InterfaceC1220a) objM4514P19, c1836h05, 0);
                        AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                        boolean z9 = c0832c.f2515f;
                        String str14 = z9 ? "当前会话已接管通知" : "当前会话不接管通知";
                        boolean zM4534f5 = c1836h05.m4534f(interfaceC1235p) | c1836h05.m4538h(c0832c);
                        Object objM4514P20 = c1836h05.m4514P();
                        if (zM4534f5 || objM4514P20 == c1823e5) {
                            objM4514P20 = new C5068l7(interfaceC1235p, 8, c0832c);
                            c1836h05.m4545k0(objM4514P20);
                        }
                        AbstractC4955ho.m9410P3(z9, "启用此规则", str14, false, (InterfaceC1231l) objM4514P20, c1836h05, 48, 8);
                        c1836h05.m4553p(false);
                    }
                } else {
                    c1836h05.m4519V();
                }
                return C3967n.f12976a;
            case 8:
                C3471g c3471g = (C3471g) this.f1548k;
                ArrayList arrayList = (ArrayList) this.f1549l;
                List list = (List) this.f1545h;
                String str15 = (String) this.f1546i;
                String str16 = (String) this.f1550m;
                InterfaceC1231l interfaceC1231l4 = (InterfaceC1231l) this.f1547j;
                C1836h0 c1836h06 = (C1836h0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    String strM9617n5 = c3471g != null ? AbstractC4955ho.m9617n5(c3471g) : "不使用模板，按本群专属设置发送";
                    String str17 = c3471g != null ? c3471g.f11255a : null;
                    if (str17 == null) {
                        str17 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    boolean zM4538h9 = c1836h06.m4538h(list) | c1836h06.m4534f(str15) | c1836h06.m4534f(str16) | c1836h06.m4534f(interfaceC1231l4);
                    Object objM4514P21 = c1836h06.m4514P();
                    if (zM4538h9 || objM4514P21 == C1851l.f6155a) {
                        objM4514P21 = new C0454k(list, str15, str16, interfaceC1231l4, 14);
                        c1836h06.m4545k0(objM4514P21);
                    }
                    AbstractC4955ho.m9353I2("选择模板", strM9617n5, arrayList, str17, (InterfaceC1231l) objM4514P21, false, c1836h06, 6, 32);
                } else {
                    c1836h06.m4519V();
                }
                return C3967n.f12976a;
            case 9:
                InterfaceC1809a1 interfaceC1809a116 = (InterfaceC1809a1) this.f1548k;
                InterfaceC1809a1 interfaceC1809a117 = (InterfaceC1809a1) this.f1545h;
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f1549l;
                Context context5 = (Context) this.f1547j;
                InterfaceC1809a1 interfaceC1809a118 = (InterfaceC1809a1) this.f1546i;
                InterfaceC1809a1 interfaceC1809a119 = (InterfaceC1809a1) this.f1550m;
                C1836h0 c1836h07 = (C1836h0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c1836h07.m4516S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    String str18 = AbstractC3149m.m6721t0((String) interfaceC1809a118.getValue()) ? "从当前 API 地址获取 /models" : (String) interfaceC1809a118.getValue();
                    boolean zM4534f6 = c1836h07.m4534f(interfaceC1809a116) | c1836h07.m4534f(interfaceC1809a117) | c1836h07.m4538h(interfaceC3599t) | c1836h07.m4538h(context5);
                    Object objM4514P22 = c1836h07.m4514P();
                    if (zM4534f6 || objM4514P22 == C1851l.f6155a) {
                        C0475p0 c0475p0 = new C0475p0(interfaceC3599t, interfaceC1809a116, interfaceC1809a117, interfaceC1809a118, context5, interfaceC1809a119, 8);
                        c1836h07.m4545k0(c0475p0);
                        objM4514P22 = c0475p0;
                    }
                    AbstractC4955ho.m9503b("拉取模型列表", str18, (InterfaceC1220a) objM4514P22, c1836h07, 6);
                } else {
                    c1836h07.m4519V();
                }
                return C3967n.f12976a;
            case 10:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9310D((C5709b) this.f1548k, (C3641z) this.f1545h, (InterfaceC1220a) this.f1546i, (InterfaceC1231l) this.f1547j, (InterfaceC1231l) this.f1549l, (InterfaceC1231l) this.f1550m, (C1836h0) obj, AbstractC1874r.m4617C(221569));
                break;
            case 11:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9457V2((Context) this.f1548k, (C4957hq) this.f1549l, (List) this.f1545h, (InterfaceC1220a) this.f1546i, (InterfaceC1231l) this.f1547j, (InterfaceC1220a) this.f1550m, (C1836h0) obj, AbstractC1874r.m4617C(3073));
                break;
            case 12:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9418Q3((InterfaceC4544a) this.f1548k, (SharedPreferences) this.f1545h, (Set) this.f1549l, (C3641z) this.f1547j, (InterfaceC1220a) this.f1546i, (InterfaceC1220a) this.f1550m, (C1836h0) obj, AbstractC1874r.m4617C(196609));
                break;
            case 13:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9490Z3((Context) this.f1548k, (C5124mu) this.f1549l, (List) this.f1545h, (InterfaceC1220a) this.f1546i, (InterfaceC1231l) this.f1547j, (InterfaceC1220a) this.f1550m, (C1836h0) obj, AbstractC1874r.m4617C(3073));
                break;
            case 14:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9424R1((Context) this.f1548k, (C4969i5) this.f1549l, (List) this.f1545h, (InterfaceC1220a) this.f1546i, (InterfaceC1231l) this.f1547j, (InterfaceC1220a) this.f1550m, (C1836h0) obj, AbstractC1874r.m4617C(3073));
                break;
            default:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f1548k;
                AtomicReference atomicReference = (AtomicReference) this.f1545h;
                AtomicReference atomicReference2 = (AtomicReference) this.f1549l;
                CountDownLatch countDownLatch = (CountDownLatch) this.f1547j;
                AtomicReference atomicReference3 = (AtomicReference) this.f1546i;
                AtomicReference atomicReference4 = (AtomicReference) this.f1550m;
                Throwable th2 = (Throwable) obj;
                Response response = (Response) obj2;
                th2.getClass();
                if (response != null) {
                    str2 = " code=" + response.code() + " msg=" + response.message();
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                AbstractC1184v0.m3204n(AbstractC0255e.m1022k("[Hchat:AutoReply] 小智AI WebSocket 失败: ", th2.getClass().getSimpleName(), " ", th2.getMessage(), str2), th2);
                C5724q.m10334F(atomicBoolean, atomicReference, atomicReference2, countDownLatch, atomicReference3, atomicReference4, 128);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C0506z0(Object obj, Object obj2, InterfaceC1231l interfaceC1231l, Object obj3, Object obj4, Object obj5, int i9) {
        this.f1544g = i9;
        this.f1548k = obj;
        this.f1545h = obj2;
        this.f1547j = interfaceC1231l;
        this.f1549l = obj3;
        this.f1546i = obj4;
        this.f1550m = obj5;
    }

    public /* synthetic */ C0506z0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i9) {
        this.f1544g = i9;
        this.f1548k = obj;
        this.f1545h = obj2;
        this.f1549l = obj3;
        this.f1547j = obj4;
        this.f1546i = obj5;
        this.f1550m = obj6;
    }

    public /* synthetic */ C0506z0(Object obj, Object obj2, Set set, Object obj3, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, int i9, int i10) {
        this.f1544g = i10;
        this.f1548k = obj;
        this.f1545h = obj2;
        this.f1549l = set;
        this.f1547j = obj3;
        this.f1546i = interfaceC1220a;
        this.f1550m = interfaceC1220a2;
    }

    public /* synthetic */ C0506z0(Context context, Object obj, List list, InterfaceC1220a interfaceC1220a, InterfaceC1231l interfaceC1231l, InterfaceC1220a interfaceC1220a2, int i9, int i10) {
        this.f1544g = i10;
        this.f1548k = context;
        this.f1549l = obj;
        this.f1545h = list;
        this.f1546i = interfaceC1220a;
        this.f1547j = interfaceC1231l;
        this.f1550m = interfaceC1220a2;
    }

    public /* synthetic */ C0506z0(InterfaceC4544a interfaceC4544a, SharedPreferences sharedPreferences, Set set, Set set2, InterfaceC1220a interfaceC1220a, InterfaceC1231l interfaceC1231l, int i9) {
        this.f1544g = 3;
        this.f1548k = interfaceC4544a;
        this.f1545h = sharedPreferences;
        this.f1549l = set;
        this.f1550m = set2;
        this.f1546i = interfaceC1220a;
        this.f1547j = interfaceC1231l;
    }

    public /* synthetic */ C0506z0(C4933h2 c4933h2, Context context, C0414a c0414a, List list, InterfaceC1220a interfaceC1220a, InterfaceC1231l interfaceC1231l, int i9) {
        this.f1544g = 1;
        this.f1548k = c4933h2;
        this.f1549l = context;
        this.f1550m = c0414a;
        this.f1545h = list;
        this.f1546i = interfaceC1220a;
        this.f1547j = interfaceC1231l;
    }

    public /* synthetic */ C0506z0(C5709b c5709b, C3641z c3641z, InterfaceC1220a interfaceC1220a, InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2, InterfaceC1231l interfaceC1231l3, int i9) {
        this.f1544g = 10;
        this.f1548k = c5709b;
        this.f1545h = c3641z;
        this.f1546i = interfaceC1220a;
        this.f1547j = interfaceC1231l;
        this.f1549l = interfaceC1231l2;
        this.f1550m = interfaceC1231l3;
    }
}
