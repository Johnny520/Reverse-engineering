package p332wb;

import android.content.Context;
import android.widget.Toast;
import gg.AbstractC1416l;
import java.util.Iterator;
import java.util.List;
import p036c9.C0467n0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p345x8.C5708a0;
import p345x8.C5725r;
import p345x8.C5729v;
import p345x8.C5733z;

/* JADX INFO: renamed from: wb.fh */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4882fh implements InterfaceC1235p {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ InterfaceC1809a1 f17156A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ InterfaceC1809a1 f17157B;

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ InterfaceC1809a1 f17158C;

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ InterfaceC1809a1 f17159D;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC1809a1 f17160E;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17161g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f17162h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC3599t f17163i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C5725r f17164j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f17165k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f17166l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f17167m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f17168n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f17169o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f17170p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f17171q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1809a1 f17172r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC1809a1 f17173s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC1809a1 f17174t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ InterfaceC1809a1 f17175u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ InterfaceC1809a1 f17176v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC1809a1 f17177w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC1809a1 f17178x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC1809a1 f17179y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC1809a1 f17180z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4882fh(Context context, InterfaceC3599t interfaceC3599t, C5725r c5725r, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114, InterfaceC1809a1 interfaceC1809a115, InterfaceC1809a1 interfaceC1809a116, InterfaceC1809a1 interfaceC1809a117, InterfaceC1809a1 interfaceC1809a118, InterfaceC1809a1 interfaceC1809a119, InterfaceC1809a1 interfaceC1809a120, InterfaceC1809a1 interfaceC1809a121) {
        this.f17162h = context;
        this.f17163i = interfaceC3599t;
        this.f17164j = c5725r;
        this.f17165k = interfaceC1809a1;
        this.f17166l = interfaceC1809a12;
        this.f17167m = interfaceC1809a13;
        this.f17168n = interfaceC1809a14;
        this.f17169o = interfaceC1809a15;
        this.f17170p = interfaceC1809a16;
        this.f17171q = interfaceC1809a17;
        this.f17172r = interfaceC1809a18;
        this.f17173s = interfaceC1809a19;
        this.f17174t = interfaceC1809a110;
        this.f17175u = interfaceC1809a111;
        this.f17176v = interfaceC1809a112;
        this.f17177w = interfaceC1809a113;
        this.f17178x = interfaceC1809a114;
        this.f17179y = interfaceC1809a115;
        this.f17180z = interfaceC1809a116;
        this.f17156A = interfaceC1809a117;
        this.f17157B = interfaceC1809a118;
        this.f17158C = interfaceC1809a119;
        this.f17159D = interfaceC1809a120;
        this.f17160E = interfaceC1809a121;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC1809a1 interfaceC1809a1;
        InterfaceC1809a1 interfaceC1809a12;
        InterfaceC1809a1 interfaceC1809a13;
        InterfaceC1809a1 interfaceC1809a14;
        InterfaceC1809a1 interfaceC1809a15;
        InterfaceC1809a1 interfaceC1809a16;
        InterfaceC1809a1 interfaceC1809a17;
        InterfaceC1809a1 interfaceC1809a18;
        C1823e c1823e;
        float f3;
        final Context context;
        C5725r c5725r;
        InterfaceC1809a1 interfaceC1809a19;
        final InterfaceC1809a1 interfaceC1809a110;
        final InterfaceC1809a1 interfaceC1809a111;
        final InterfaceC1809a1 interfaceC1809a112;
        final InterfaceC1809a1 interfaceC1809a113;
        final InterfaceC1809a1 interfaceC1809a114;
        int i9;
        Object next;
        String strConcat;
        InterfaceC1809a1 interfaceC1809a115;
        InterfaceC1809a1 interfaceC1809a116;
        InterfaceC1809a1 interfaceC1809a117;
        C5725r c5725r2;
        InterfaceC1809a1 interfaceC1809a118;
        InterfaceC1809a1 interfaceC1809a119;
        Object next2;
        String strConcat2;
        String str;
        C1823e c1823e2;
        C5725r c5725r3;
        String strConcat3;
        switch (this.f17161g) {
            case 0:
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final InterfaceC1809a1 interfaceC1809a120 = this.f17165k;
                    AbstractC4955ho.m9296B1("登录状态", AbstractC3149m.m6721t0((String) interfaceC1809a120.getValue()) ? "未登录" : "已保存 token", null, c1836h0, 6, 4);
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    final InterfaceC1809a1 interfaceC1809a121 = this.f17166l;
                    String str2 = (String) interfaceC1809a121.getValue();
                    Object objM4514P = c1836h0.m4514P();
                    C1823e c1823e3 = C1851l.f6155a;
                    if (objM4514P == c1823e3) {
                        objM4514P = new C4720aj(interfaceC1809a121, 19);
                        c1836h0.m4545k0(objM4514P);
                    }
                    AbstractC4955ho.m9304C1("手机号", "登录成功后会记住手机号", str2, 0, (InterfaceC1231l) objM4514P, c1836h0, 24630, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    InterfaceC1809a1 interfaceC1809a122 = this.f17167m;
                    String str3 = AbstractC3149m.m6721t0((String) interfaceC1809a122.getValue()) ? "先刷新，再输入图片上的字符" : "已刷新，输入下方图形验证码";
                    final InterfaceC3599t interfaceC3599t = this.f17163i;
                    boolean zM4538h = c1836h0.m4538h(interfaceC3599t);
                    Object objM4514P2 = c1836h0.m4514P();
                    InterfaceC1809a1 interfaceC1809a123 = this.f17168n;
                    InterfaceC1809a1 interfaceC1809a124 = this.f17169o;
                    if (zM4538h || objM4514P2 == c1823e3) {
                        objM4514P2 = new C0467n0(interfaceC3599t, interfaceC1809a123, interfaceC1809a122, interfaceC1809a124, 16);
                        interfaceC1809a1 = interfaceC1809a123;
                        interfaceC1809a12 = interfaceC1809a122;
                        interfaceC1809a13 = interfaceC1809a124;
                        c1836h0.m4545k0(objM4514P2);
                    } else {
                        interfaceC1809a12 = interfaceC1809a122;
                        interfaceC1809a1 = interfaceC1809a123;
                        interfaceC1809a13 = interfaceC1809a124;
                    }
                    AbstractC4955ho.m9503b("刷新图形验证码", str3, (InterfaceC1220a) objM4514P2, c1836h0, 6);
                    if (AbstractC3149m.m6721t0((String) interfaceC1809a12.getValue())) {
                        c1836h0.m4525a0(-411666854);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(-411823497);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        AbstractC4955ho.m9625o4((String) interfaceC1809a12.getValue(), c1836h0, 0);
                        c1836h0.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    String str4 = (String) interfaceC1809a13.getValue();
                    Object objM4514P3 = c1836h0.m4514P();
                    if (objM4514P3 == c1823e3) {
                        objM4514P3 = new C4720aj(interfaceC1809a13, 20);
                        c1836h0.m4545k0(objM4514P3);
                    }
                    final InterfaceC1809a1 interfaceC1809a125 = interfaceC1809a13;
                    AbstractC4955ho.m9304C1("图形验证码", "输入上方图片里的字符", str4, 0, (InterfaceC1231l) objM4514P3, c1836h0, 24630, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    Context context2 = this.f17162h;
                    boolean zM4538h2 = c1836h0.m4538h(context2);
                    C5725r c5725r4 = this.f17164j;
                    boolean zM4538h3 = zM4538h2 | c1836h0.m4538h(c5725r4) | c1836h0.m4538h(interfaceC3599t);
                    Object objM4514P4 = c1836h0.m4514P();
                    InterfaceC1809a1 interfaceC1809a126 = this.f17170p;
                    InterfaceC1809a1 interfaceC1809a127 = this.f17171q;
                    InterfaceC1809a1 interfaceC1809a128 = this.f17172r;
                    InterfaceC1809a1 interfaceC1809a129 = this.f17173s;
                    InterfaceC1809a1 interfaceC1809a130 = this.f17174t;
                    InterfaceC1809a1 interfaceC1809a131 = this.f17175u;
                    InterfaceC1809a1 interfaceC1809a132 = this.f17176v;
                    final InterfaceC1809a1 interfaceC1809a133 = this.f17177w;
                    InterfaceC1809a1 interfaceC1809a134 = this.f17178x;
                    final InterfaceC1809a1 interfaceC1809a135 = this.f17179y;
                    InterfaceC1809a1 interfaceC1809a136 = this.f17180z;
                    final InterfaceC1809a1 interfaceC1809a137 = this.f17156A;
                    InterfaceC1809a1 interfaceC1809a138 = this.f17157B;
                    InterfaceC1809a1 interfaceC1809a139 = this.f17158C;
                    if (zM4538h3 || objM4514P4 == c1823e3) {
                        interfaceC1809a14 = interfaceC1809a129;
                        interfaceC1809a15 = interfaceC1809a139;
                        interfaceC1809a16 = interfaceC1809a126;
                        interfaceC1809a17 = interfaceC1809a127;
                        interfaceC1809a18 = interfaceC1809a131;
                        c1823e = c1823e3;
                        f3 = 0.0f;
                        context = context2;
                        C5442wi c5442wi = new C5442wi(context, c5725r4, interfaceC3599t, interfaceC1809a121, interfaceC1809a125, interfaceC1809a16, interfaceC1809a17, interfaceC1809a128, interfaceC1809a120, interfaceC1809a14, interfaceC1809a130, interfaceC1809a18, interfaceC1809a132, interfaceC1809a133, interfaceC1809a134, interfaceC1809a135, interfaceC1809a136, interfaceC1809a137, interfaceC1809a138, interfaceC1809a15, interfaceC1809a1, interfaceC1809a12);
                        c5725r = c5725r4;
                        interfaceC3599t = interfaceC3599t;
                        interfaceC1809a121 = interfaceC1809a121;
                        interfaceC1809a19 = interfaceC1809a138;
                        interfaceC1809a110 = interfaceC1809a136;
                        interfaceC1809a111 = interfaceC1809a134;
                        interfaceC1809a112 = interfaceC1809a132;
                        interfaceC1809a113 = interfaceC1809a130;
                        interfaceC1809a114 = interfaceC1809a128;
                        interfaceC1809a125 = interfaceC1809a125;
                        c1836h0.m4545k0(c5442wi);
                        objM4514P4 = c5442wi;
                    } else {
                        interfaceC1809a15 = interfaceC1809a139;
                        interfaceC1809a16 = interfaceC1809a126;
                        interfaceC1809a17 = interfaceC1809a127;
                        interfaceC1809a114 = interfaceC1809a128;
                        interfaceC1809a18 = interfaceC1809a131;
                        interfaceC1809a14 = interfaceC1809a129;
                        interfaceC1809a19 = interfaceC1809a138;
                        f3 = 0.0f;
                        c5725r = c5725r4;
                        interfaceC1809a110 = interfaceC1809a136;
                        interfaceC1809a111 = interfaceC1809a134;
                        interfaceC1809a112 = interfaceC1809a132;
                        interfaceC1809a113 = interfaceC1809a130;
                        c1823e = c1823e3;
                        context = context2;
                    }
                    AbstractC4955ho.m9503b("发送短信验证码", "需要先填写手机号和图形验证码", (InterfaceC1220a) objM4514P4, c1836h0, 54);
                    AbstractC4955ho.m9312D1(f3, c1836h0, 0, 1);
                    final InterfaceC1809a1 interfaceC1809a140 = this.f17159D;
                    String str5 = (String) interfaceC1809a140.getValue();
                    Object objM4514P5 = c1836h0.m4514P();
                    if (objM4514P5 == c1823e) {
                        objM4514P5 = new C4720aj(interfaceC1809a140, 21);
                        c1836h0.m4545k0(objM4514P5);
                    }
                    AbstractC4955ho.m9304C1("短信验证码", "输入手机收到的验证码", str5, 0, (InterfaceC1231l) objM4514P5, c1836h0, 24630, 8);
                    AbstractC4955ho.m9312D1(f3, c1836h0, 0, 1);
                    boolean zM4538h4 = c1836h0.m4538h(context) | c1836h0.m4538h(interfaceC3599t) | c1836h0.m4538h(c5725r);
                    Object objM4514P6 = c1836h0.m4514P();
                    if (zM4538h4 || objM4514P6 == c1823e) {
                        i9 = 54;
                        final InterfaceC1809a1 interfaceC1809a141 = this.f17160E;
                        final InterfaceC1809a1 interfaceC1809a142 = interfaceC1809a1;
                        final InterfaceC1809a1 interfaceC1809a143 = interfaceC1809a19;
                        final InterfaceC1809a1 interfaceC1809a144 = interfaceC1809a15;
                        final InterfaceC1809a1 interfaceC1809a145 = interfaceC1809a18;
                        final InterfaceC1809a1 interfaceC1809a146 = interfaceC1809a14;
                        final InterfaceC1809a1 interfaceC1809a147 = interfaceC1809a17;
                        final InterfaceC1809a1 interfaceC1809a148 = interfaceC1809a16;
                        final C5725r c5725r5 = c5725r;
                        InterfaceC1220a interfaceC1220a = new InterfaceC1220a() { // from class: wb.fj
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1220a
                            public final Object invoke() {
                                InterfaceC1809a1 interfaceC1809a149 = interfaceC1809a121;
                                String string = AbstractC3149m.m6703R0((String) interfaceC1809a149.getValue()).toString();
                                InterfaceC1809a1 interfaceC1809a150 = interfaceC1809a140;
                                String string2 = AbstractC3149m.m6703R0((String) interfaceC1809a150.getValue()).toString();
                                boolean zM6721t0 = AbstractC3149m.m6721t0(string);
                                Context context3 = context;
                                if (zM6721t0 || AbstractC3149m.m6721t0(string2)) {
                                    Toast.makeText(context3, "请填写手机号和短信验证码", 0).show();
                                } else {
                                    InterfaceC1809a1 interfaceC1809a151 = interfaceC1809a142;
                                    interfaceC1809a151.setValue("正在登录小智控制台...");
                                    AbstractC3603v.m7563q(interfaceC3599t, null, new C5117mn(string, string2, c5725r5, context3, interfaceC1809a120, interfaceC1809a150, interfaceC1809a125, interfaceC1809a148, interfaceC1809a147, interfaceC1809a114, interfaceC1809a149, interfaceC1809a146, interfaceC1809a113, interfaceC1809a145, interfaceC1809a112, interfaceC1809a133, interfaceC1809a111, interfaceC1809a135, interfaceC1809a110, interfaceC1809a137, interfaceC1809a143, interfaceC1809a144, interfaceC1809a151, interfaceC1809a141, null), 3);
                                }
                                return C3967n.f12976a;
                            }
                        };
                        interfaceC1809a1 = interfaceC1809a142;
                        c1836h0.m4545k0(interfaceC1220a);
                        objM4514P6 = interfaceC1220a;
                    } else {
                        i9 = 54;
                    }
                    AbstractC4955ho.m9503b("登录并保存 token", "登录成功后自动保存 token 并拉取智能体", (InterfaceC1220a) objM4514P6, c1836h0, i9);
                    if (AbstractC3149m.m6721t0((String) interfaceC1809a1.getValue())) {
                        c1836h0.m4525a0(-410696678);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(-410851399);
                        AbstractC4955ho.m9312D1(f3, c1836h0, 0, 1);
                        AbstractC4955ho.m9296B1("控制台状态", (String) interfaceC1809a1.getValue(), null, c1836h0, 6, 4);
                        c1836h0.m4553p(false);
                    }
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a149 = this.f17165k;
                    String str6 = (String) interfaceC1809a149.getValue();
                    InterfaceC1809a1 interfaceC1809a150 = this.f17166l;
                    List list = (List) interfaceC1809a150.getValue();
                    Object obj3 = null;
                    if (AbstractC3149m.m6721t0(str6)) {
                        strConcat = "未选择，点击拉取";
                    } else {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                if (AbstractC1416l.m3825a(((C5729v) next).f23340a, str6)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        C5729v c5729v = (C5729v) next;
                        if (c5729v == null) {
                            strConcat = "已保存 ID: ".concat(str6);
                        } else {
                            String str7 = c5729v.f23341b;
                            String str8 = c5729v.f23342c;
                            if (AbstractC3149m.m6721t0(str8)) {
                                str8 = c5729v.f23340a;
                            }
                            strConcat = str7 + " / " + ((Object) str8);
                        }
                    }
                    Context context3 = this.f17162h;
                    boolean zM4538h5 = c1836h02.m4538h(context3);
                    InterfaceC3599t interfaceC3599t2 = this.f17163i;
                    boolean zM4538h6 = zM4538h5 | c1836h02.m4538h(interfaceC3599t2);
                    C5725r c5725r6 = this.f17164j;
                    boolean zM4538h7 = zM4538h6 | c1836h02.m4538h(c5725r6);
                    Object objM4514P7 = c1836h02.m4514P();
                    InterfaceC1809a1 interfaceC1809a151 = this.f17167m;
                    InterfaceC1809a1 interfaceC1809a152 = this.f17168n;
                    InterfaceC1809a1 interfaceC1809a153 = this.f17169o;
                    InterfaceC1809a1 interfaceC1809a154 = this.f17170p;
                    InterfaceC1809a1 interfaceC1809a155 = this.f17171q;
                    InterfaceC1809a1 interfaceC1809a156 = interfaceC1809a149;
                    InterfaceC1809a1 interfaceC1809a157 = this.f17172r;
                    InterfaceC1809a1 interfaceC1809a158 = this.f17173s;
                    InterfaceC1809a1 interfaceC1809a159 = this.f17174t;
                    InterfaceC1809a1 interfaceC1809a160 = this.f17175u;
                    InterfaceC1809a1 interfaceC1809a161 = this.f17176v;
                    InterfaceC1809a1 interfaceC1809a162 = this.f17177w;
                    InterfaceC1809a1 interfaceC1809a163 = this.f17178x;
                    InterfaceC1809a1 interfaceC1809a164 = this.f17179y;
                    InterfaceC1809a1 interfaceC1809a165 = this.f17180z;
                    InterfaceC1809a1 interfaceC1809a166 = this.f17156A;
                    InterfaceC1809a1 interfaceC1809a167 = this.f17157B;
                    InterfaceC1809a1 interfaceC1809a168 = this.f17158C;
                    C1823e c1823e4 = C1851l.f6155a;
                    if (zM4538h7 || objM4514P7 == c1823e4) {
                        interfaceC1809a115 = interfaceC1809a153;
                        interfaceC1809a116 = interfaceC1809a168;
                        interfaceC1809a117 = interfaceC1809a154;
                        C5442wi c5442wi2 = new C5442wi(interfaceC3599t2, context3, interfaceC1809a151, interfaceC1809a152, interfaceC1809a150, interfaceC1809a156, c5725r6, interfaceC1809a115, interfaceC1809a117, interfaceC1809a155, interfaceC1809a157, interfaceC1809a158, interfaceC1809a159, interfaceC1809a160, interfaceC1809a161, interfaceC1809a162, interfaceC1809a163, interfaceC1809a164, interfaceC1809a165, interfaceC1809a166, interfaceC1809a167, interfaceC1809a116, 0);
                        c5725r2 = c5725r6;
                        interfaceC1809a118 = interfaceC1809a155;
                        interfaceC1809a119 = interfaceC1809a158;
                        c1836h02.m4545k0(c5442wi2);
                        objM4514P7 = c5442wi2;
                    } else {
                        interfaceC1809a116 = interfaceC1809a168;
                        interfaceC1809a117 = interfaceC1809a154;
                        interfaceC1809a115 = interfaceC1809a153;
                        c5725r2 = c5725r6;
                        interfaceC1809a119 = interfaceC1809a158;
                        interfaceC1809a118 = interfaceC1809a155;
                    }
                    AbstractC4955ho.m9503b("选择智能体", strConcat, (InterfaceC1220a) objM4514P7, c1836h02, 6);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    String str9 = (String) interfaceC1809a156.getValue();
                    if (AbstractC3149m.m6721t0(str9)) {
                        str9 = "未选择";
                    }
                    AbstractC4955ho.m9296B1("Agent ID", str9, null, c1836h02, 6, 4);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    String str10 = (String) interfaceC1809a115.getValue();
                    InterfaceC1809a1 interfaceC1809a169 = this.f17159D;
                    List list2 = (List) interfaceC1809a169.getValue();
                    if (AbstractC3149m.m6721t0(str10)) {
                        strConcat2 = "未选择，点击拉取";
                    } else {
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next2 = it2.next();
                                if (((C5733z) next2).f23352a.equals(str10)) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        C5733z c5733z = (C5733z) next2;
                        strConcat2 = c5733z == null ? "已保存: ".concat(str10) : AbstractC4855en.m9264h(c5733z.f23353b, " / ", c5733z.f23352a);
                    }
                    boolean zM4538h8 = c1836h02.m4538h(context3) | c1836h02.m4538h(interfaceC3599t2) | c1836h02.m4538h(c5725r2);
                    Object objM4514P8 = c1836h02.m4514P();
                    if (zM4538h8 || objM4514P8 == c1823e4) {
                        str = " / ";
                        InterfaceC1809a1 interfaceC1809a170 = interfaceC1809a117;
                        InterfaceC1809a1 interfaceC1809a171 = interfaceC1809a115;
                        InterfaceC1809a1 interfaceC1809a172 = interfaceC1809a118;
                        C5725r c5725r7 = c5725r2;
                        c1823e2 = c1823e4;
                        C5442wi c5442wi3 = new C5442wi(interfaceC3599t2, context3, interfaceC1809a151, interfaceC1809a152, interfaceC1809a169, interfaceC1809a171, c5725r7, interfaceC1809a172, interfaceC1809a157, interfaceC1809a119, interfaceC1809a159, interfaceC1809a156, interfaceC1809a170, interfaceC1809a160, interfaceC1809a161, interfaceC1809a162, interfaceC1809a163, interfaceC1809a164, interfaceC1809a165, interfaceC1809a166, interfaceC1809a167, interfaceC1809a116, 1);
                        interfaceC1809a157 = interfaceC1809a157;
                        interfaceC1809a117 = interfaceC1809a170;
                        interfaceC1809a159 = interfaceC1809a159;
                        c5725r3 = c5725r7;
                        interfaceC1809a118 = interfaceC1809a172;
                        interfaceC1809a115 = interfaceC1809a171;
                        interfaceC1809a156 = interfaceC1809a156;
                        c1836h02.m4545k0(c5442wi3);
                        objM4514P8 = c5442wi3;
                    } else {
                        c5725r3 = c5725r2;
                        str = " / ";
                        c1823e2 = c1823e4;
                    }
                    AbstractC4955ho.m9503b("选择模型", strConcat2, (InterfaceC1220a) objM4514P8, c1836h02, 6);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    String str11 = (String) interfaceC1809a117.getValue();
                    InterfaceC1809a1 interfaceC1809a173 = this.f17160E;
                    List list3 = (List) interfaceC1809a173.getValue();
                    if (AbstractC3149m.m6721t0(str11)) {
                        strConcat3 = "未选择，留空使用控制台当前角色";
                    } else {
                        Iterator it3 = list3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                Object next3 = it3.next();
                                if (((C5708a0) next3).f23196a.equals(str11)) {
                                    obj3 = next3;
                                }
                            }
                        }
                        C5708a0 c5708a0 = (C5708a0) obj3;
                        strConcat3 = c5708a0 == null ? "已保存: ".concat(str11) : AbstractC4855en.m9264h(c5708a0.f23197b, str, c5708a0.f23196a);
                    }
                    boolean zM4538h9 = c1836h02.m4538h(context3) | c1836h02.m4538h(interfaceC3599t2) | c1836h02.m4538h(c5725r3);
                    Object objM4514P9 = c1836h02.m4514P();
                    if (zM4538h9 || objM4514P9 == c1823e2) {
                        InterfaceC1809a1 interfaceC1809a174 = interfaceC1809a156;
                        InterfaceC1809a1 interfaceC1809a175 = interfaceC1809a117;
                        InterfaceC1809a1 interfaceC1809a176 = interfaceC1809a157;
                        InterfaceC1809a1 interfaceC1809a177 = interfaceC1809a159;
                        InterfaceC1809a1 interfaceC1809a178 = interfaceC1809a115;
                        InterfaceC1809a1 interfaceC1809a179 = interfaceC1809a118;
                        C5442wi c5442wi4 = new C5442wi(interfaceC3599t2, context3, interfaceC1809a151, interfaceC1809a152, interfaceC1809a173, interfaceC1809a175, c5725r3, interfaceC1809a179, interfaceC1809a176, interfaceC1809a119, interfaceC1809a177, interfaceC1809a174, interfaceC1809a178, interfaceC1809a160, interfaceC1809a161, interfaceC1809a162, interfaceC1809a163, interfaceC1809a164, interfaceC1809a165, interfaceC1809a166, interfaceC1809a167, interfaceC1809a116, 2);
                        interfaceC1809a118 = interfaceC1809a179;
                        interfaceC1809a115 = interfaceC1809a178;
                        interfaceC1809a159 = interfaceC1809a177;
                        interfaceC1809a157 = interfaceC1809a176;
                        interfaceC1809a117 = interfaceC1809a175;
                        interfaceC1809a156 = interfaceC1809a174;
                        c1836h02.m4545k0(c5442wi4);
                        objM4514P9 = c5442wi4;
                    }
                    AbstractC4955ho.m9503b("选择语音角色", strConcat3, (InterfaceC1220a) objM4514P9, c1836h02, 6);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    boolean zM4538h10 = c1836h02.m4538h(context3) | c1836h02.m4538h(c5725r3) | c1836h02.m4538h(interfaceC3599t2);
                    Object objM4514P10 = c1836h02.m4514P();
                    if (zM4538h10 || objM4514P10 == c1823e2) {
                        C5298s6 c5298s6 = new C5298s6(context3, c5725r3, interfaceC3599t2, interfaceC1809a151, interfaceC1809a152, interfaceC1809a156, interfaceC1809a118, interfaceC1809a157, interfaceC1809a119, interfaceC1809a159, interfaceC1809a115, interfaceC1809a117, interfaceC1809a160, interfaceC1809a161, interfaceC1809a162, interfaceC1809a163, interfaceC1809a164, interfaceC1809a165, interfaceC1809a166, interfaceC1809a167);
                        c1836h02.m4545k0(c5298s6);
                        objM4514P10 = c5298s6;
                    }
                    AbstractC4955ho.m9503b("保存到小智控制台", "读取当前智能体配置后只替换模型和语音角色", (InterfaceC1220a) objM4514P10, c1836h02, 54);
                } else {
                    c1836h02.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4882fh(InterfaceC3599t interfaceC3599t, Context context, C5725r c5725r, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114, InterfaceC1809a1 interfaceC1809a115, InterfaceC1809a1 interfaceC1809a116, InterfaceC1809a1 interfaceC1809a117, InterfaceC1809a1 interfaceC1809a118, InterfaceC1809a1 interfaceC1809a119, InterfaceC1809a1 interfaceC1809a120, InterfaceC1809a1 interfaceC1809a121) {
        this.f17163i = interfaceC3599t;
        this.f17162h = context;
        this.f17164j = c5725r;
        this.f17165k = interfaceC1809a1;
        this.f17166l = interfaceC1809a12;
        this.f17167m = interfaceC1809a13;
        this.f17168n = interfaceC1809a14;
        this.f17169o = interfaceC1809a15;
        this.f17170p = interfaceC1809a16;
        this.f17171q = interfaceC1809a17;
        this.f17172r = interfaceC1809a18;
        this.f17173s = interfaceC1809a19;
        this.f17174t = interfaceC1809a110;
        this.f17175u = interfaceC1809a111;
        this.f17176v = interfaceC1809a112;
        this.f17177w = interfaceC1809a113;
        this.f17178x = interfaceC1809a114;
        this.f17179y = interfaceC1809a115;
        this.f17180z = interfaceC1809a116;
        this.f17156A = interfaceC1809a117;
        this.f17157B = interfaceC1809a118;
        this.f17158C = interfaceC1809a119;
        this.f17159D = interfaceC1809a120;
        this.f17160E = interfaceC1809a121;
    }
}
