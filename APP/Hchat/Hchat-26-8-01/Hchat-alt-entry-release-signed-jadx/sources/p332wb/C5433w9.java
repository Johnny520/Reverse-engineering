package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import bi.AbstractC0316d;
import bi.C0314b;
import java.util.ArrayList;
import java.util.List;
import p068eh.AbstractC0921a;
import p080fb.C1142k2;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1845j1;
import p117i0.C1851l;
import p117i0.C1858m2;
import p117i0.InterfaceC1809a1;
import p136j8.AbstractC2091b;
import p144k.AbstractC2192n;
import p218og.AbstractC3149m;
import p222p.AbstractC3208d;
import p222p.AbstractC3210d1;
import p222p.AbstractC3222h1;
import p222p.AbstractC3226j;
import p222p.AbstractC3253s;
import p222p.C3211e;
import p222p.C3213e1;
import p222p.C3248q0;
import p222p.C3256t;
import p234q.AbstractC3418a;
import p266s0.C3878h;
import p276sf.C3958e;
import p276sf.C3967n;
import p339x1.C5593d;
import p339x1.C5597e;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p343x6.AbstractC5700d;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5843e;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import sh.AbstractC3994c;
import sh.AbstractC4045s;

/* JADX INFO: renamed from: wb.w9 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5433w9 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21602g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f21603h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f21604i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f21605j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f21606k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f21607l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f21608m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f21609n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f21610o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f21611p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f21612q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1809a1 f21613r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC1809a1 f21614s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC1809a1 f21615t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ InterfaceC1809a1 f21616u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f21617v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f21618w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5433w9(Object obj, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114, InterfaceC1809a1 interfaceC1809a115, int i9) {
        this.f21602g = i9;
        this.f21618w = obj;
        this.f21603h = interfaceC1809a1;
        this.f21604i = interfaceC1809a12;
        this.f21605j = interfaceC1809a13;
        this.f21606k = interfaceC1809a14;
        this.f21607l = interfaceC1809a15;
        this.f21608m = interfaceC1809a16;
        this.f21609n = interfaceC1809a17;
        this.f21610o = interfaceC1809a18;
        this.f21611p = interfaceC1809a19;
        this.f21612q = interfaceC1809a110;
        this.f21613r = interfaceC1809a111;
        this.f21614s = interfaceC1809a112;
        this.f21615t = interfaceC1809a113;
        this.f21616u = interfaceC1809a114;
        this.f21617v = interfaceC1809a115;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        C1823e c1823e;
        float f3;
        float f10;
        SharedPreferences sharedPreferences;
        Context context;
        InterfaceC1809a1 interfaceC1809a1;
        InterfaceC1809a1 interfaceC1809a12;
        C1836h0 c1836h0;
        float f11;
        switch (this.f21602g) {
            case 0:
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.f21618w;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f21617v;
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a14 = this.f21603h;
                    boolean zBooleanValue = ((Boolean) interfaceC1809a14.getValue()).booleanValue();
                    boolean zM4538h = c1836h02.m4538h(sharedPreferences2);
                    Object objM4514P = c1836h02.m4514P();
                    C1823e c1823e2 = C1851l.f6155a;
                    if (zM4538h || objM4514P == c1823e2) {
                        objM4514P = new C5435wb(sharedPreferences2, interfaceC1809a14, 23);
                        c1836h02.m4545k0(objM4514P);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue, "实名前缀", "用统一前缀替换实名尾字前半部分", false, (InterfaceC1231l) objM4514P, c1836h02, 432, 8);
                    if (((Boolean) interfaceC1809a14.getValue()).booleanValue()) {
                        c1836h02.m4525a0(1621121561);
                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                        InterfaceC1809a1 interfaceC1809a15 = this.f21604i;
                        String str = (String) interfaceC1809a15.getValue();
                        Object objM4514P2 = c1836h02.m4514P();
                        if (objM4514P2 == c1823e2) {
                            objM4514P2 = new C5534zd(interfaceC1809a15, 11);
                            c1836h02.m4545k0(objM4514P2);
                        }
                        AbstractC4955ho.m9304C1("前缀内容", "最多 8 个字符，例如 *", str, 0, (InterfaceC1231l) objM4514P2, c1836h02, 24630, 8);
                        c1836h02.m4553p(false);
                    } else {
                        c1836h02.m4525a0(1621267633);
                        c1836h02.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    InterfaceC1809a1 interfaceC1809a16 = this.f21605j;
                    boolean zBooleanValue2 = ((Boolean) interfaceC1809a16.getValue()).booleanValue();
                    boolean zM4538h2 = c1836h02.m4538h(sharedPreferences2);
                    Object objM4514P3 = c1836h02.m4514P();
                    if (zM4538h2 || objM4514P3 == c1823e2) {
                        objM4514P3 = new C5435wb(sharedPreferences2, interfaceC1809a16, 24);
                        c1836h02.m4545k0(objM4514P3);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue2, "显示性别", "在实名尾字后追加联系人性别", false, (InterfaceC1231l) objM4514P3, c1836h02, 432, 8);
                    if (((Boolean) interfaceC1809a16.getValue()).booleanValue()) {
                        c1836h02.m4525a0(1621577261);
                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                        InterfaceC1809a1 interfaceC1809a17 = this.f21606k;
                        String str2 = (String) interfaceC1809a17.getValue();
                        Object objM4514P4 = c1836h02.m4514P();
                        if (objM4514P4 == c1823e2) {
                            objM4514P4 = new C5534zd(interfaceC1809a17, 12);
                            c1836h02.m4545k0(objM4514P4);
                        }
                        AbstractC4955ho.m9304C1("男性文案", "最多 12 个字符，默认 男", str2, 0, (InterfaceC1231l) objM4514P4, c1836h02, 24630, 8);
                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                        InterfaceC1809a1 interfaceC1809a18 = this.f21607l;
                        String str3 = (String) interfaceC1809a18.getValue();
                        Object objM4514P5 = c1836h02.m4514P();
                        if (objM4514P5 == c1823e2) {
                            objM4514P5 = new C5534zd(interfaceC1809a18, 13);
                            c1836h02.m4545k0(objM4514P5);
                        }
                        AbstractC4955ho.m9304C1("女性文案", "最多 12 个字符，默认 女", str3, 0, (InterfaceC1231l) objM4514P5, c1836h02, 24630, 8);
                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                        InterfaceC1809a1 interfaceC1809a19 = this.f21608m;
                        String str4 = (String) interfaceC1809a19.getValue();
                        Object objM4514P6 = c1836h02.m4514P();
                        if (objM4514P6 == c1823e2) {
                            objM4514P6 = new C5534zd(interfaceC1809a19, 14);
                            c1836h02.m4545k0(objM4514P6);
                        }
                        AbstractC4955ho.m9304C1("未知文案", "最多 12 个字符，留空则不显示", str4, 0, (InterfaceC1231l) objM4514P6, c1836h02, 24630, 8);
                        c1836h02.m4553p(false);
                    } else {
                        c1836h02.m4525a0(1622011633);
                        c1836h02.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    InterfaceC1809a1 interfaceC1809a110 = this.f21609n;
                    boolean zBooleanValue3 = ((Boolean) interfaceC1809a110.getValue()).booleanValue();
                    boolean zM4538h3 = c1836h02.m4538h(sharedPreferences2);
                    Object objM4514P7 = c1836h02.m4514P();
                    if (zM4538h3 || objM4514P7 == c1823e2) {
                        objM4514P7 = new C5435wb(sharedPreferences2, interfaceC1809a110, 25);
                        c1836h02.m4545k0(objM4514P7);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue3, "显示地区", "在实名尾字后追加联系人地区", false, (InterfaceC1231l) objM4514P7, c1836h02, 432, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    InterfaceC1809a1 interfaceC1809a111 = this.f21610o;
                    String str5 = (String) interfaceC1809a111.getValue();
                    Object objM4514P8 = c1836h02.m4514P();
                    if (objM4514P8 == c1823e2) {
                        objM4514P8 = new C5371ud(interfaceC1809a111, 12);
                        c1836h02.m4545k0(objM4514P8);
                    }
                    InterfaceC1220a interfaceC1220a = (InterfaceC1220a) objM4514P8;
                    Object objM4514P9 = c1836h02.m4514P();
                    if (objM4514P9 == c1823e2) {
                        objM4514P9 = new C5534zd(interfaceC1809a111, 15);
                        c1836h02.m4545k0(objM4514P9);
                    }
                    AbstractC4955ho.m9430S("尾字颜色", "留空跟随昵称，渐变用 #F59E0B,#22C55E", str5, false, interfaceC1220a, (InterfaceC1231l) objM4514P9, c1836h02, 221238, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    InterfaceC1809a1 interfaceC1809a112 = this.f21611p;
                    String str6 = (String) interfaceC1809a112.getValue();
                    Object objM4514P10 = c1836h02.m4514P();
                    if (objM4514P10 == c1823e2) {
                        objM4514P10 = new C5534zd(interfaceC1809a112, 16);
                        c1836h02.m4545k0(objM4514P10);
                    }
                    AbstractC4955ho.m9616n4("尾字粗细", str6, (InterfaceC1231l) objM4514P10, c1836h02, 390);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    InterfaceC1809a1 interfaceC1809a113 = this.f21612q;
                    String str7 = (String) interfaceC1809a113.getValue();
                    Object objM4514P11 = c1836h02.m4514P();
                    if (objM4514P11 == c1823e2) {
                        objM4514P11 = new C5371ud(interfaceC1809a113, 9);
                        c1836h02.m4545k0(objM4514P11);
                    }
                    InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) objM4514P11;
                    Object objM4514P12 = c1836h02.m4514P();
                    if (objM4514P12 == c1823e2) {
                        objM4514P12 = new C5534zd(interfaceC1809a113, 5);
                        c1836h02.m4545k0(objM4514P12);
                    }
                    AbstractC4955ho.m9430S("括号颜色", "留空跟随昵称，渐变用 #F59E0B,#22C55E", str7, false, interfaceC1220a2, (InterfaceC1231l) objM4514P12, c1836h02, 221238, 8);
                    C1836h0 c1836h03 = c1836h02;
                    AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                    InterfaceC1809a1 interfaceC1809a114 = this.f21613r;
                    String str8 = (String) interfaceC1809a114.getValue();
                    Object objM4514P13 = c1836h03.m4514P();
                    if (objM4514P13 == c1823e2) {
                        objM4514P13 = new C5534zd(interfaceC1809a114, 6);
                        c1836h03.m4545k0(objM4514P13);
                    }
                    AbstractC4955ho.m9616n4("括号粗细", str8, (InterfaceC1231l) objM4514P13, c1836h03, 390);
                    if (((Boolean) interfaceC1809a16.getValue()).booleanValue()) {
                        c1836h03.m4525a0(1622979081);
                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                        InterfaceC1809a1 interfaceC1809a115 = this.f21614s;
                        String str9 = (String) interfaceC1809a115.getValue();
                        Object objM4514P14 = c1836h03.m4514P();
                        if (objM4514P14 == c1823e2) {
                            objM4514P14 = new C5371ud(interfaceC1809a115, 10);
                            c1836h03.m4545k0(objM4514P14);
                        }
                        InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) objM4514P14;
                        Object objM4514P15 = c1836h03.m4514P();
                        if (objM4514P15 == c1823e2) {
                            objM4514P15 = new C5534zd(interfaceC1809a115, 7);
                            c1836h03.m4545k0(objM4514P15);
                        }
                        AbstractC4955ho.m9430S("性别颜色", "留空跟随昵称，支持渐变", str9, false, interfaceC1220a3, (InterfaceC1231l) objM4514P15, c1836h03, 221238, 8);
                        c1836h03 = c1836h03;
                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                        InterfaceC1809a1 interfaceC1809a116 = this.f21615t;
                        String str10 = (String) interfaceC1809a116.getValue();
                        Object objM4514P16 = c1836h03.m4514P();
                        if (objM4514P16 == c1823e2) {
                            objM4514P16 = new C5534zd(interfaceC1809a116, 8);
                            c1836h03.m4545k0(objM4514P16);
                        }
                        AbstractC4955ho.m9616n4("性别粗细", str10, (InterfaceC1231l) objM4514P16, c1836h03, 390);
                        c1836h03.m4553p(false);
                    } else {
                        c1836h03.m4525a0(1623325041);
                        c1836h03.m4553p(false);
                    }
                    if (((Boolean) interfaceC1809a110.getValue()).booleanValue()) {
                        c1836h03.m4525a0(1623372905);
                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                        InterfaceC1809a1 interfaceC1809a117 = this.f21616u;
                        String str11 = (String) interfaceC1809a117.getValue();
                        Object objM4514P17 = c1836h03.m4514P();
                        if (objM4514P17 == c1823e2) {
                            objM4514P17 = new C5371ud(interfaceC1809a117, 11);
                            c1836h03.m4545k0(objM4514P17);
                        }
                        InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) objM4514P17;
                        Object objM4514P18 = c1836h03.m4514P();
                        if (objM4514P18 == c1823e2) {
                            objM4514P18 = new C5534zd(interfaceC1809a117, 9);
                            c1836h03.m4545k0(objM4514P18);
                        }
                        C1836h0 c1836h04 = c1836h03;
                        AbstractC4955ho.m9430S("地区颜色", "留空跟随昵称，支持渐变", str11, false, interfaceC1220a4, (InterfaceC1231l) objM4514P18, c1836h04, 221238, 8);
                        AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                        String str12 = (String) interfaceC1809a13.getValue();
                        Object objM4514P19 = c1836h04.m4514P();
                        if (objM4514P19 == c1823e2) {
                            objM4514P19 = new C5534zd(interfaceC1809a13, 10);
                            c1836h04.m4545k0(objM4514P19);
                        }
                        AbstractC4955ho.m9616n4("地区粗细", str12, (InterfaceC1231l) objM4514P19, c1836h04, 390);
                        c1836h04.m4553p(false);
                    } else {
                        c1836h03.m4525a0(1623718865);
                        c1836h03.m4553p(false);
                    }
                } else {
                    c1836h02.m4519V();
                }
                break;
            case 1:
                Context context2 = (Context) this.f21618w;
                InterfaceC1809a1 interfaceC1809a118 = (InterfaceC1809a1) this.f21617v;
                C1836h0 c1836h05 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h05.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a119 = this.f21603h;
                    String strM9372K5 = AbstractC4955ho.m9372K5((String) interfaceC1809a119.getValue());
                    List listM9364J5 = AbstractC4955ho.m9364J5();
                    String str13 = (String) interfaceC1809a119.getValue();
                    Object objM4514P20 = c1836h05.m4514P();
                    C1823e c1823e3 = C1851l.f6155a;
                    if (objM4514P20 == c1823e3) {
                        objM4514P20 = new C5535ze(interfaceC1809a119, 10);
                        c1836h05.m4545k0(objM4514P20);
                    }
                    AbstractC4955ho.m9353I2("媒体顺序", strM9372K5, listM9364J5, str13, (InterfaceC1231l) objM4514P20, false, c1836h05, 24582, 32);
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    InterfaceC1809a1 interfaceC1809a120 = this.f21604i;
                    String str14 = (String) interfaceC1809a120.getValue();
                    Object objM4514P21 = c1836h05.m4514P();
                    if (objM4514P21 == c1823e3) {
                        objM4514P21 = new C5535ze(interfaceC1809a120, 17);
                        c1836h05.m4545k0(objM4514P21);
                    }
                    AbstractC4955ho.m9304C1("媒体类型顺序", "英文逗号分隔：image,voice,emoji,video,file,favorite", str14, 0, (InterfaceC1231l) objM4514P21, c1836h05, 24630, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    InterfaceC1809a1 interfaceC1809a121 = this.f21605j;
                    String str15 = (String) interfaceC1809a121.getValue();
                    Object objM4514P22 = c1836h05.m4514P();
                    if (objM4514P22 == c1823e3) {
                        objM4514P22 = new C5535ze(interfaceC1809a121, 18);
                        c1836h05.m4545k0(objM4514P22);
                    }
                    AbstractC4955ho.m9613n1(context2, "进群图片", str15, 3, null, (InterfaceC1231l) objM4514P22, c1836h05, 199728, 16);
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    InterfaceC1809a1 interfaceC1809a122 = this.f21606k;
                    String str16 = (String) interfaceC1809a122.getValue();
                    Object objM4514P23 = c1836h05.m4514P();
                    if (objM4514P23 == c1823e3) {
                        objM4514P23 = new C5535ze(interfaceC1809a122, 19);
                        c1836h05.m4545k0(objM4514P23);
                    }
                    AbstractC4955ho.m9613n1(context2, "退群图片", str16, 3, null, (InterfaceC1231l) objM4514P23, c1836h05, 199728, 16);
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    InterfaceC1809a1 interfaceC1809a123 = this.f21607l;
                    String str17 = (String) interfaceC1809a123.getValue();
                    Object objM4514P24 = c1836h05.m4514P();
                    if (objM4514P24 == c1823e3) {
                        objM4514P24 = new C5535ze(interfaceC1809a123, 20);
                        c1836h05.m4545k0(objM4514P24);
                    }
                    AbstractC4955ho.m9613n1(context2, "进群语音", str17, 4, null, (InterfaceC1231l) objM4514P24, c1836h05, 199728, 16);
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    InterfaceC1809a1 interfaceC1809a124 = this.f21608m;
                    String str18 = (String) interfaceC1809a124.getValue();
                    Object objM4514P25 = c1836h05.m4514P();
                    if (objM4514P25 == c1823e3) {
                        objM4514P25 = new C5535ze(interfaceC1809a124, 21);
                        c1836h05.m4545k0(objM4514P25);
                    }
                    AbstractC4955ho.m9613n1(context2, "退群语音", str18, 4, null, (InterfaceC1231l) objM4514P25, c1836h05, 199728, 16);
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    InterfaceC1809a1 interfaceC1809a125 = this.f21609n;
                    String str19 = (String) interfaceC1809a125.getValue();
                    Object objM4514P26 = c1836h05.m4514P();
                    if (objM4514P26 == c1823e3) {
                        objM4514P26 = new C5535ze(interfaceC1809a125, 22);
                        c1836h05.m4545k0(objM4514P26);
                    }
                    AbstractC4955ho.m9613n1(context2, "进群表情", str19, 6, null, (InterfaceC1231l) objM4514P26, c1836h05, 199728, 16);
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    InterfaceC1809a1 interfaceC1809a126 = this.f21610o;
                    String str20 = (String) interfaceC1809a126.getValue();
                    Object objM4514P27 = c1836h05.m4514P();
                    if (objM4514P27 == c1823e3) {
                        objM4514P27 = new C5535ze(interfaceC1809a126, 23);
                        c1836h05.m4545k0(objM4514P27);
                    }
                    AbstractC4955ho.m9613n1(context2, "退群表情", str20, 6, null, (InterfaceC1231l) objM4514P27, c1836h05, 199728, 16);
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    InterfaceC1809a1 interfaceC1809a127 = this.f21611p;
                    String str21 = (String) interfaceC1809a127.getValue();
                    Object objM4514P28 = c1836h05.m4514P();
                    if (objM4514P28 == c1823e3) {
                        objM4514P28 = new C5535ze(interfaceC1809a127, 24);
                        c1836h05.m4545k0(objM4514P28);
                    }
                    AbstractC4955ho.m9613n1(context2, "进群视频", str21, 5, null, (InterfaceC1231l) objM4514P28, c1836h05, 199728, 16);
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    InterfaceC1809a1 interfaceC1809a128 = this.f21612q;
                    String str22 = (String) interfaceC1809a128.getValue();
                    Object objM4514P29 = c1836h05.m4514P();
                    if (objM4514P29 == c1823e3) {
                        objM4514P29 = new C5535ze(interfaceC1809a128, 25);
                        c1836h05.m4545k0(objM4514P29);
                    }
                    AbstractC4955ho.m9613n1(context2, "退群视频", str22, 5, null, (InterfaceC1231l) objM4514P29, c1836h05, 199728, 16);
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    InterfaceC1809a1 interfaceC1809a129 = this.f21613r;
                    String str23 = (String) interfaceC1809a129.getValue();
                    Object objM4514P30 = c1836h05.m4514P();
                    if (objM4514P30 == c1823e3) {
                        objM4514P30 = new C5535ze(interfaceC1809a129, 11);
                        c1836h05.m4545k0(objM4514P30);
                    }
                    AbstractC4955ho.m9613n1(context2, "进群文件", str23, 7, null, (InterfaceC1231l) objM4514P30, c1836h05, 199728, 16);
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    InterfaceC1809a1 interfaceC1809a130 = this.f21614s;
                    String str24 = (String) interfaceC1809a130.getValue();
                    Object objM4514P31 = c1836h05.m4514P();
                    if (objM4514P31 == c1823e3) {
                        objM4514P31 = new C5535ze(interfaceC1809a130, 12);
                        c1836h05.m4545k0(objM4514P31);
                    }
                    AbstractC4955ho.m9613n1(context2, "退群文件", str24, 7, null, (InterfaceC1231l) objM4514P31, c1836h05, 199728, 16);
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    InterfaceC1809a1 interfaceC1809a131 = this.f21615t;
                    String str25 = (String) interfaceC1809a131.getValue();
                    Object objM4514P32 = c1836h05.m4514P();
                    InterfaceC1809a1 interfaceC1809a132 = this.f21616u;
                    if (objM4514P32 == c1823e3) {
                        objM4514P32 = new C5535ze(interfaceC1809a132, 13);
                        c1836h05.m4545k0(objM4514P32);
                    }
                    InterfaceC1231l interfaceC1231l = (InterfaceC1231l) objM4514P32;
                    Object objM4514P33 = c1836h05.m4514P();
                    if (objM4514P33 == c1823e3) {
                        objM4514P33 = new C5535ze(interfaceC1809a131, 14);
                        c1836h05.m4545k0(objM4514P33);
                    }
                    AbstractC4955ho.m9613n1(context2, "进群收藏", str25, 9, interfaceC1231l, (InterfaceC1231l) objM4514P33, c1836h05, 224304, 0);
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    String str26 = (String) interfaceC1809a118.getValue();
                    Object objM4514P34 = c1836h05.m4514P();
                    if (objM4514P34 == c1823e3) {
                        objM4514P34 = new C5535ze(interfaceC1809a132, 15);
                        c1836h05.m4545k0(objM4514P34);
                    }
                    InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) objM4514P34;
                    Object objM4514P35 = c1836h05.m4514P();
                    if (objM4514P35 == c1823e3) {
                        objM4514P35 = new C5535ze(interfaceC1809a118, 16);
                        c1836h05.m4545k0(objM4514P35);
                    }
                    AbstractC4955ho.m9613n1(context2, "退群收藏", str26, 9, interfaceC1231l2, (InterfaceC1231l) objM4514P35, c1836h05, 224304, 0);
                } else {
                    c1836h05.m4519V();
                }
                break;
            case 2:
                SharedPreferences sharedPreferences3 = (SharedPreferences) this.f21618w;
                Context context3 = (Context) this.f21617v;
                C1836h0 c1836h06 = (C1836h0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c1836h06.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    InterfaceC1809a1 interfaceC1809a133 = this.f21603h;
                    boolean zBooleanValue4 = ((Boolean) interfaceC1809a133.getValue()).booleanValue();
                    boolean zM4538h4 = c1836h06.m4538h(sharedPreferences3);
                    Object objM4514P36 = c1836h06.m4514P();
                    C1823e c1823e4 = C1851l.f6155a;
                    if (zM4538h4 || objM4514P36 == c1823e4) {
                        objM4514P36 = new C5108me(sharedPreferences3, interfaceC1809a133, 17);
                        c1836h06.m4545k0(objM4514P36);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue4, "通知栏提醒", "抢到红包时提醒", false, (InterfaceC1231l) objM4514P36, c1836h06, 432, 8);
                    if (((Boolean) interfaceC1809a133.getValue()).booleanValue()) {
                        c1836h06.m4525a0(598790596);
                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                        InterfaceC1809a1 interfaceC1809a134 = this.f21604i;
                        String str27 = (String) interfaceC1809a134.getValue();
                        List list = AbstractC4955ho.f17690e;
                        Object objM4514P37 = c1836h06.m4514P();
                        if (objM4514P37 == c1823e4) {
                            objM4514P37 = new C4881fg(interfaceC1809a134, 0);
                            c1836h06.m4545k0(objM4514P37);
                        }
                        c1823e = c1823e4;
                        AbstractC4955ho.m9571i4("通知栏文案", "支持下方变量", str27, list, 0, (InterfaceC1231l) objM4514P37, c1836h06, 196662, 16);
                        c1836h06 = c1836h06;
                        c1836h06.m4553p(false);
                    } else {
                        c1823e = c1823e4;
                        c1836h06.m4525a0(599177879);
                        c1836h06.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                    InterfaceC1809a1 interfaceC1809a135 = this.f21605j;
                    boolean zBooleanValue5 = ((Boolean) interfaceC1809a135.getValue()).booleanValue();
                    boolean zM4538h5 = c1836h06.m4538h(sharedPreferences3);
                    Object objM4514P38 = c1836h06.m4514P();
                    if (zM4538h5 || objM4514P38 == c1823e) {
                        objM4514P38 = new C5108me(sharedPreferences3, interfaceC1809a135, 19);
                        c1836h06.m4545k0(objM4514P38);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue5, "浮窗提醒", "抢到红包时短暂提示", false, (InterfaceC1231l) objM4514P38, c1836h06, 432, 8);
                    if (((Boolean) interfaceC1809a135.getValue()).booleanValue()) {
                        c1836h06.m4525a0(599511067);
                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                        InterfaceC1809a1 interfaceC1809a136 = this.f21606k;
                        String str28 = (String) interfaceC1809a136.getValue();
                        List list2 = AbstractC4955ho.f17690e;
                        Object objM4514P39 = c1836h06.m4514P();
                        if (objM4514P39 == c1823e) {
                            objM4514P39 = new C4881fg(interfaceC1809a136, 1);
                            c1836h06.m4545k0(objM4514P39);
                        }
                        C1836h0 c1836h07 = c1836h06;
                        AbstractC4955ho.m9571i4("浮窗文案", "支持下方变量", str28, list2, 0, (InterfaceC1231l) objM4514P39, c1836h07, 196662, 16);
                        c1836h06 = c1836h07;
                        c1836h06.m4553p(false);
                    } else {
                        c1836h06.m4525a0(599906999);
                        c1836h06.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                    InterfaceC1809a1 interfaceC1809a137 = this.f21607l;
                    boolean zBooleanValue6 = ((Boolean) interfaceC1809a137.getValue()).booleanValue();
                    boolean zM4538h6 = c1836h06.m4538h(sharedPreferences3);
                    Object objM4514P40 = c1836h06.m4514P();
                    if (zM4538h6 || objM4514P40 == c1823e) {
                        objM4514P40 = new C5108me(sharedPreferences3, interfaceC1809a137, 20);
                        c1836h06.m4545k0(objM4514P40);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue6, "通知铃声", "开启后播放通知铃声", false, (InterfaceC1231l) objM4514P40, c1836h06, 432, 8);
                    if (((Boolean) interfaceC1809a137.getValue()).booleanValue()) {
                        c1836h06.m4525a0(600318958);
                        AbstractC4955ho.m9312D1(0.0f, c1836h06, 0, 1);
                        ArrayList arrayListM9699w6 = AbstractC4955ho.m9699w6(new C3958e("选择系统铃声", 0), new C3958e("从文件选择铃声", 1));
                        boolean zM4538h7 = c1836h06.m4538h(sharedPreferences3) | c1836h06.m4538h(context3);
                        Object objM4514P41 = c1836h06.m4514P();
                        InterfaceC1809a1 interfaceC1809a138 = this.f21608m;
                        InterfaceC1809a1 interfaceC1809a139 = this.f21609n;
                        if (zM4538h7 || objM4514P41 == c1823e) {
                            sharedPreferences = sharedPreferences3;
                            f3 = 0.0f;
                            C4711aa c4711aa = new C4711aa(sharedPreferences, context3, interfaceC1809a138, interfaceC1809a139, this.f21610o);
                            context = context3;
                            interfaceC1809a1 = interfaceC1809a138;
                            interfaceC1809a12 = interfaceC1809a139;
                            c1836h06.m4545k0(c4711aa);
                            objM4514P41 = c4711aa;
                        } else {
                            f3 = 0.0f;
                            context = context3;
                            interfaceC1809a1 = interfaceC1809a138;
                            interfaceC1809a12 = interfaceC1809a139;
                            sharedPreferences = sharedPreferences3;
                        }
                        C1836h0 c1836h08 = c1836h06;
                        sharedPreferences3 = sharedPreferences;
                        AbstractC4955ho.m9719z2(sharedPreferences3, "hb_notify_sound_mode", "铃声模式", arrayListM9699w6, 0, (InterfaceC1231l) objM4514P41, c1836h08, 25008, 0);
                        AbstractC4955ho.m9312D1(f3, c1836h08, 0, 1);
                        AbstractC4955ho.m9296B1("当前铃声", AbstractC4955ho.m9421Q6(context, (String) interfaceC1809a12.getValue(), ((Number) interfaceC1809a1.getValue()).intValue()), null, c1836h08, 6, 4);
                        c1836h06 = c1836h08;
                        c1836h06.m4553p(false);
                    } else {
                        f3 = 0.0f;
                        c1836h06.m4525a0(603156791);
                        c1836h06.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(f3, c1836h06, 0, 1);
                    AbstractC4955ho.m9402O3(sharedPreferences3, "hb_notify_vibrate_enable", "通知震动", "开启后触发通知震动", false, c1836h06, 28080);
                    AbstractC4955ho.m9312D1(f3, c1836h06, 0, 1);
                    InterfaceC1809a1 interfaceC1809a140 = this.f21611p;
                    boolean zBooleanValue7 = ((Boolean) interfaceC1809a140.getValue()).booleanValue();
                    boolean zM4538h8 = c1836h06.m4538h(sharedPreferences3);
                    Object objM4514P42 = c1836h06.m4514P();
                    if (zM4538h8 || objM4514P42 == c1823e) {
                        objM4514P42 = new C5108me(sharedPreferences3, interfaceC1809a140, 21);
                        c1836h06.m4545k0(objM4514P42);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue7, "抢到红包播报", "抢到后用系统语音播报", false, (InterfaceC1231l) objM4514P42, c1836h06, 432, 8);
                    if (((Boolean) interfaceC1809a140.getValue()).booleanValue()) {
                        c1836h06.m4525a0(603620737);
                        AbstractC4955ho.m9312D1(f3, c1836h06, 0, 1);
                        InterfaceC1809a1 interfaceC1809a141 = this.f21612q;
                        String str29 = (String) interfaceC1809a141.getValue();
                        List list3 = AbstractC4955ho.f17690e;
                        Object objM4514P43 = c1836h06.m4514P();
                        if (objM4514P43 == c1823e) {
                            objM4514P43 = new C4881fg(interfaceC1809a141, 2);
                            c1836h06.m4545k0(objM4514P43);
                        }
                        f10 = f3;
                        C1836h0 c1836h09 = c1836h06;
                        AbstractC4955ho.m9571i4("播报文案", "支持下方变量", str29, list3, 0, (InterfaceC1231l) objM4514P43, c1836h09, 196662, 16);
                        c1836h06 = c1836h09;
                        c1836h06.m4553p(false);
                    } else {
                        f10 = f3;
                        c1836h06.m4525a0(604010903);
                        c1836h06.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(f10, c1836h06, 0, 1);
                    InterfaceC1809a1 interfaceC1809a142 = this.f21613r;
                    boolean zBooleanValue8 = ((Boolean) interfaceC1809a142.getValue()).booleanValue();
                    boolean zM4538h9 = c1836h06.m4538h(sharedPreferences3);
                    Object objM4514P44 = c1836h06.m4514P();
                    if (zM4538h9 || objM4514P44 == c1823e) {
                        objM4514P44 = new C5108me(sharedPreferences3, interfaceC1809a142, 22);
                        c1836h06.m4545k0(objM4514P44);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue8, "未抢到提醒", "未抢到红包时通知", false, (InterfaceC1231l) objM4514P44, c1836h06, 432, 8);
                    if (((Boolean) interfaceC1809a142.getValue()).booleanValue()) {
                        c1836h06.m4525a0(604372549);
                        AbstractC4955ho.m9312D1(f10, c1836h06, 0, 1);
                        InterfaceC1809a1 interfaceC1809a143 = this.f21614s;
                        String str30 = (String) interfaceC1809a143.getValue();
                        List list4 = AbstractC4955ho.f17690e;
                        Object objM4514P45 = c1836h06.m4514P();
                        if (objM4514P45 == c1823e) {
                            objM4514P45 = new C4881fg(interfaceC1809a143, 3);
                            c1836h06.m4545k0(objM4514P45);
                        }
                        C1836h0 c1836h010 = c1836h06;
                        AbstractC4955ho.m9571i4("未抢到通知栏文案", "支持下方变量", str30, list4, 0, (InterfaceC1231l) objM4514P45, c1836h010, 196662, 16);
                        c1836h06 = c1836h010;
                        c1836h06.m4553p(false);
                    } else {
                        c1836h06.m4525a0(604758871);
                        c1836h06.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(f10, c1836h06, 0, 1);
                    InterfaceC1809a1 interfaceC1809a144 = this.f21615t;
                    boolean zBooleanValue9 = ((Boolean) interfaceC1809a144.getValue()).booleanValue();
                    boolean zM4538h10 = c1836h06.m4538h(sharedPreferences3);
                    Object objM4514P46 = c1836h06.m4514P();
                    if (zM4538h10 || objM4514P46 == c1823e) {
                        objM4514P46 = new C5108me(sharedPreferences3, interfaceC1809a144, 18);
                        c1836h06.m4545k0(objM4514P46);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue9, "未抢到浮窗", "未抢到红包时短暂提示", false, (InterfaceC1231l) objM4514P46, c1836h06, 432, 8);
                    if (((Boolean) interfaceC1809a144.getValue()).booleanValue()) {
                        c1836h06.m4525a0(605118812);
                        AbstractC4955ho.m9312D1(f10, c1836h06, 0, 1);
                        InterfaceC1809a1 interfaceC1809a145 = this.f21616u;
                        String str31 = (String) interfaceC1809a145.getValue();
                        List list5 = AbstractC4955ho.f17690e;
                        Object objM4514P47 = c1836h06.m4514P();
                        if (objM4514P47 == c1823e) {
                            objM4514P47 = new C5109mf(interfaceC1809a145, 29);
                            c1836h06.m4545k0(objM4514P47);
                        }
                        C1836h0 c1836h011 = c1836h06;
                        AbstractC4955ho.m9571i4("未抢到浮窗文案", "支持下方变量", str31, list5, 0, (InterfaceC1231l) objM4514P47, c1836h011, 196662, 16);
                        c1836h011.m4553p(false);
                    } else {
                        c1836h06.m4525a0(605513783);
                        c1836h06.m4553p(false);
                    }
                } else {
                    c1836h06.m4519V();
                }
                break;
            default:
                C4731au c4731au = (C4731au) this.f21618w;
                C1142k2 c1142k2 = c4731au.f15941a;
                C1845j1 c1845j1 = (C1845j1) this.f21615t;
                C1845j1 c1845j12 = (C1845j1) this.f21616u;
                Context context4 = (Context) this.f21617v;
                C1836h0 c1836h012 = (C1836h0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c1836h012.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    C5850l c5850l = C5850l.f23787a;
                    InterfaceC5853o interfaceC5853oM6904g = AbstractC3222h1.m6904g(AbstractC3222h1.m6901d(c5850l, 1.0f), 0.0f, 520, 1);
                    C3211e c3211e = AbstractC3226j.f10300c;
                    C5843e c5843e = C5840b.f23773s;
                    C3256t c3256tM6935a = AbstractC3253s.m6935a(c3211e, c5843e, c1836h012, 0);
                    int iHashCode = Long.hashCode(c1836h012.f6095T);
                    C3878h c3878hM4546l = c1836h012.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h012, interfaceC5853oM6904g);
                    InterfaceC5605g.f22815f.getClass();
                    C5660y c5660y = C5601f.f22758b;
                    c1836h012.m4531d0();
                    if (c1836h012.f6094S) {
                        c1836h012.m4544k(c5660y);
                    } else {
                        c1836h012.m4551n0();
                    }
                    C5597e c5597e = C5601f.f22761e;
                    AbstractC1874r.m4615A(c5597e, c1836h012, c3256tM6935a);
                    C5597e c5597e2 = C5601f.f22760d;
                    AbstractC1874r.m4615A(c5597e2, c1836h012, c3878hM4546l);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    C5597e c5597e3 = C5601f.f22762f;
                    AbstractC1874r.m4615A(c5597e3, c1836h012, numValueOf);
                    C5593d c5593d = C5601f.f22763g;
                    AbstractC1874r.m4641w(c5593d, c1836h012);
                    C5597e c5597e4 = C5601f.f22759c;
                    AbstractC1874r.m4615A(c5597e4, c1836h012, interfaceC5853oM10543c);
                    InterfaceC5853o interfaceC5853oM6901d = AbstractC3222h1.m6901d(c5850l, 1.0f);
                    if (1.0f <= 0.0d) {
                        AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                    }
                    InterfaceC5853o interfaceC5853oM5441r = AbstractC2192n.m5441r(interfaceC5853oM6901d.mo10549d(new C3248q0(1.0f, false)), AbstractC2192n.m5440q(c1836h012), true, true);
                    C3256t c3256tM6935a2 = AbstractC3253s.m6935a(c3211e, c5843e, c1836h012, 0);
                    int iHashCode2 = Long.hashCode(c1836h012.f6095T);
                    C3878h c3878hM4546l2 = c1836h012.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c2 = AbstractC5839a.m10543c(c1836h012, interfaceC5853oM5441r);
                    c1836h012.m4531d0();
                    if (c1836h012.f6094S) {
                        c1836h012.m4544k(c5660y);
                    } else {
                        c1836h012.m4551n0();
                    }
                    AbstractC1874r.m4615A(c5597e, c1836h012, c3256tM6935a2);
                    AbstractC1874r.m4615A(c5597e2, c1836h012, c3878hM4546l2);
                    AbstractC2091b.m5169p(iHashCode2, c1836h012, c5597e3, c1836h012, c5593d);
                    AbstractC1874r.m4615A(c5597e4, c1836h012, interfaceC5853oM10543c2);
                    String strM2251n = AbstractC0921a.m2251n("Agent 正在修改插件 ", c1142k2.f3765c, "，确认后继续执行。");
                    C1858m2 c1858m2 = AbstractC0316d.f944a;
                    AbstractC4045s.m8250n(strM2251n, null, ((C0314b) c1836h012.m4542j(c1858m2)).m1237g(), AbstractC5700d.m10248D(13), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h012, 24576, 0, 262122);
                    float f12 = 12;
                    AbstractC4045s.m8250n("代码差异", AbstractC3208d.m6886p(c5850l, 0.0f, f12, 0.0f, 0.0f, 13), ((C0314b) c1836h012.m4542j(c1858m2)).m1238h(), AbstractC5700d.m10248D(12), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h012, 24630, 0, 262120);
                    C5491y2 c5491y2 = C5491y2.f22066n;
                    String str32 = c1142k2.f3766d;
                    if (AbstractC3149m.m6721t0(str32)) {
                        str32 = "无代码变化";
                    }
                    c5491y2.m9875T(str32, c1836h012, 48);
                    c1836h012.m4553p(true);
                    InterfaceC1809a1 interfaceC1809a146 = this.f21603h;
                    boolean zBooleanValue10 = ((Boolean) interfaceC1809a146.getValue()).booleanValue();
                    boolean zM4534f = c1836h012.m4534f(interfaceC1809a146);
                    Object objM4514P48 = c1836h012.m4514P();
                    C1823e c1823e5 = C1851l.f6155a;
                    if (zM4534f || objM4514P48 == c1823e5) {
                        objM4514P48 = new C5086lp(interfaceC1809a146, 14);
                        c1836h012.m4545k0(objM4514P48);
                    }
                    c5491y2.m9871N(zBooleanValue10, "确认后，本轮后续写入和最终提交不再询问", (InterfaceC1231l) objM4514P48, c1836h012, 3120);
                    InterfaceC5853o interfaceC5853oM6886p = AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l, 1.0f), 0.0f, f12, 0.0f, 0.0f, 13);
                    C3213e1 c3213e1M6892a = AbstractC3210d1.m6892a(AbstractC3226j.m6921g(10), C5840b.f23770p, c1836h012, 6);
                    int iHashCode3 = Long.hashCode(c1836h012.f6095T);
                    C3878h c3878hM4546l3 = c1836h012.m4546l();
                    InterfaceC5853o interfaceC5853oM10543c3 = AbstractC5839a.m10543c(c1836h012, interfaceC5853oM6886p);
                    c1836h012.m4531d0();
                    if (c1836h012.f6094S) {
                        c1836h012.m4544k(c5660y);
                    } else {
                        c1836h012.m4551n0();
                    }
                    AbstractC1874r.m4615A(c5597e, c1836h012, c3213e1M6892a);
                    AbstractC1874r.m4615A(c5597e2, c1836h012, c3878hM4546l3);
                    AbstractC2091b.m5169p(iHashCode3, c1836h012, c5597e3, c1836h012, c5593d);
                    AbstractC1874r.m4615A(c5597e4, c1836h012, interfaceC5853oM10543c3);
                    boolean zM4534f2 = c1836h012.m4534f(c1845j1) | c1836h012.m4534f(c1845j12) | c1836h012.m4538h(c4731au);
                    Object objM4514P49 = c1836h012.m4514P();
                    if (zM4534f2 || objM4514P49 == c1823e5) {
                        objM4514P49 = new C5538zh(c4731au, c1845j1, c1845j12, 11);
                        c1836h012.m4545k0(objM4514P49);
                    }
                    InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) objM4514P49;
                    if (1.0f <= 0.0d) {
                        AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                    }
                    AbstractC4045s.m8251o("取消修改", interfaceC1220a5, new C3248q0(1.0f, true), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h012), null, c1836h012, 6, 1912);
                    boolean zM4534f3 = c1836h012.m4534f(interfaceC1809a146) | c1836h012.m4538h(context4) | c1836h012.m4534f(c1845j1) | c1836h012.m4534f(c1845j12) | c1836h012.m4538h(c4731au);
                    Object objM4514P50 = c1836h012.m4514P();
                    if (zM4534f3 || objM4514P50 == c1823e5) {
                        c1836h0 = c1836h012;
                        f11 = 1.0f;
                        C5411vk c5411vk = new C5411vk(context4, interfaceC1809a146, this.f21604i, this.f21605j, this.f21606k, this.f21607l, this.f21608m, this.f21609n, this.f21610o, this.f21611p, this.f21612q, this.f21613r, this.f21614s, c1845j1, c1845j12, c4731au);
                        c1836h0.m4545k0(c5411vk);
                        objM4514P50 = c5411vk;
                    } else {
                        c1836h0 = c1836h012;
                        f11 = 1.0f;
                    }
                    InterfaceC1220a interfaceC1220a6 = (InterfaceC1220a) objM4514P50;
                    if (f11 <= 0.0d) {
                        AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                    }
                    C1836h0 c1836h013 = c1836h0;
                    AbstractC4045s.m8251o("确认并继续", interfaceC1220a6, new C3248q0(f11, true), false, 0.0f, 0.0f, 0.0f, AbstractC3994c.m8227a(c1836h0), null, c1836h013, 6, 1912);
                    c1836h013.m4553p(true);
                    c1836h013.m4553p(true);
                } else {
                    c1836h012.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5433w9(SharedPreferences sharedPreferences, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114) {
        this.f21602g = 2;
        this.f21618w = sharedPreferences;
        this.f21617v = context;
        this.f21603h = interfaceC1809a1;
        this.f21604i = interfaceC1809a12;
        this.f21605j = interfaceC1809a13;
        this.f21606k = interfaceC1809a14;
        this.f21607l = interfaceC1809a15;
        this.f21608m = interfaceC1809a16;
        this.f21609n = interfaceC1809a17;
        this.f21610o = interfaceC1809a18;
        this.f21611p = interfaceC1809a19;
        this.f21612q = interfaceC1809a110;
        this.f21613r = interfaceC1809a111;
        this.f21614s = interfaceC1809a112;
        this.f21615t = interfaceC1809a113;
        this.f21616u = interfaceC1809a114;
    }

    public /* synthetic */ C5433w9(Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, C1845j1 c1845j1, C1845j1 c1845j12, C4731au c4731au) {
        this.f21602g = 3;
        this.f21603h = interfaceC1809a1;
        this.f21618w = c4731au;
        this.f21615t = c1845j1;
        this.f21616u = c1845j12;
        this.f21617v = context;
        this.f21604i = interfaceC1809a12;
        this.f21605j = interfaceC1809a13;
        this.f21606k = interfaceC1809a14;
        this.f21607l = interfaceC1809a15;
        this.f21608m = interfaceC1809a16;
        this.f21609n = interfaceC1809a17;
        this.f21610o = interfaceC1809a18;
        this.f21611p = interfaceC1809a19;
        this.f21612q = interfaceC1809a110;
        this.f21613r = interfaceC1809a111;
        this.f21614s = interfaceC1809a112;
    }
}
