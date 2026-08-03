package p332wb;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;
import p036c9.C0416a1;
import p036c9.C0427d0;
import p036c9.C0482r0;
import p051db.C0768f;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p251r.C3641z;
import p266s0.AbstractC3879i;
import p269s3.AbstractC3924b;
import p276sf.C3967n;
import p276sf.InterfaceC3955b;
import p317vb.InterfaceC4544a;
import p345x8.C5709b;

/* JADX INFO: renamed from: wb.c5 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4772c5 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f16190g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f16191h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f16192i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f16193j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f16194k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f16195l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f16196m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f16197n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f16198o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f16199p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4772c5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i9) {
        this.f16190g = i9;
        this.f16191h = obj;
        this.f16192i = obj2;
        this.f16193j = obj3;
        this.f16194k = obj4;
        this.f16195l = obj5;
        this.f16196m = obj6;
        this.f16197n = obj7;
        this.f16198o = obj8;
        this.f16199p = obj9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16190g) {
            case 0:
                C0416a1 c0416a1 = (C0416a1) this.f16191h;
                Activity activity = (Activity) this.f16192i;
                String str = (String) this.f16193j;
                String str2 = (String) this.f16194k;
                String str3 = (String) this.f16195l;
                String str4 = (String) this.f16196m;
                C0482r0 c0482r0 = (C0482r0) this.f16197n;
                C0768f c0768f = (C0768f) this.f16198o;
                C5475xi c5475xi = (C5475xi) this.f16199p;
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC1874r.m4619a(AbstractC3924b.f12884a.mo4582a(c0416a1), AbstractC3879i.m8071e(-810466203, new C0427d0(activity, str, str2, str3, str4, c0482r0, c0768f, c5475xi, 2), c1836h0), c1836h0, 48);
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 1:
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f16191h;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f16192i;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f16193j;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f16194k;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f16195l;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f16196m;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f16197n;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f16198o;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f16199p;
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String str5 = (String) interfaceC1809a1.getValue();
                    Object objM4514P = c1836h02.m4514P();
                    C1823e c1823e = C1851l.f6155a;
                    if (objM4514P == c1823e) {
                        objM4514P = new C5070l9(interfaceC1809a1, 20);
                        c1836h02.m4545k0(objM4514P);
                    }
                    InterfaceC1220a interfaceC1220a = (InterfaceC1220a) objM4514P;
                    Object objM4514P2 = c1836h02.m4514P();
                    if (objM4514P2 == c1823e) {
                        objM4514P2 = new C4944hd(interfaceC1809a1, 13);
                        c1836h02.m4545k0(objM4514P2);
                    }
                    AbstractC4955ho.m9430S("群主颜色", "默认黄色，渐变用 #F59E0B,#FDE047", str5, false, interfaceC1220a, (InterfaceC1231l) objM4514P2, c1836h02, 221238, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    String str6 = (String) interfaceC1809a12.getValue();
                    Object objM4514P3 = c1836h02.m4514P();
                    if (objM4514P3 == c1823e) {
                        objM4514P3 = new C5070l9(interfaceC1809a12, 25);
                        c1836h02.m4545k0(objM4514P3);
                    }
                    InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) objM4514P3;
                    Object objM4514P4 = c1836h02.m4514P();
                    if (objM4514P4 == c1823e) {
                        objM4514P4 = new C4944hd(interfaceC1809a12, 14);
                        c1836h02.m4545k0(objM4514P4);
                    }
                    AbstractC4955ho.m9430S("群主文字颜色", "默认白色，支持渐变", str6, false, interfaceC1220a2, (InterfaceC1231l) objM4514P4, c1836h02, 221238, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    String str7 = (String) interfaceC1809a13.getValue();
                    Object objM4514P5 = c1836h02.m4514P();
                    if (objM4514P5 == c1823e) {
                        objM4514P5 = new C5070l9(interfaceC1809a13, 26);
                        c1836h02.m4545k0(objM4514P5);
                    }
                    InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) objM4514P5;
                    Object objM4514P6 = c1836h02.m4514P();
                    if (objM4514P6 == c1823e) {
                        objM4514P6 = new C4944hd(interfaceC1809a13, 15);
                        c1836h02.m4545k0(objM4514P6);
                    }
                    AbstractC4955ho.m9430S("管理员颜色", "默认绿色，渐变用 #22C55E,#14B8A6", str7, false, interfaceC1220a3, (InterfaceC1231l) objM4514P6, c1836h02, 221238, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    String str8 = (String) interfaceC1809a14.getValue();
                    Object objM4514P7 = c1836h02.m4514P();
                    if (objM4514P7 == c1823e) {
                        objM4514P7 = new C5070l9(interfaceC1809a14, 27);
                        c1836h02.m4545k0(objM4514P7);
                    }
                    InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) objM4514P7;
                    Object objM4514P8 = c1836h02.m4514P();
                    if (objM4514P8 == c1823e) {
                        objM4514P8 = new C4944hd(interfaceC1809a14, 16);
                        c1836h02.m4545k0(objM4514P8);
                    }
                    AbstractC4955ho.m9430S("管理员文字颜色", "默认白色，支持渐变", str8, false, interfaceC1220a4, (InterfaceC1231l) objM4514P8, c1836h02, 221238, 8);
                    C1836h0 c1836h03 = c1836h02;
                    if (((Boolean) interfaceC1809a15.getValue()).booleanValue()) {
                        c1836h03.m4525a0(1424769750);
                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                        String str9 = (String) interfaceC1809a16.getValue();
                        Object objM4514P9 = c1836h03.m4514P();
                        if (objM4514P9 == c1823e) {
                            objM4514P9 = new C5070l9(interfaceC1809a16, 28);
                            c1836h03.m4545k0(objM4514P9);
                        }
                        InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) objM4514P9;
                        Object objM4514P10 = c1836h03.m4514P();
                        if (objM4514P10 == c1823e) {
                            objM4514P10 = new C4944hd(interfaceC1809a16, 17);
                            c1836h03.m4545k0(objM4514P10);
                        }
                        AbstractC4955ho.m9430S("群员颜色", "默认灰色，渐变用 #64748B,#94A3B8", str9, false, interfaceC1220a5, (InterfaceC1231l) objM4514P10, c1836h03, 221238, 8);
                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                        String str10 = (String) interfaceC1809a17.getValue();
                        Object objM4514P11 = c1836h03.m4514P();
                        if (objM4514P11 == c1823e) {
                            objM4514P11 = new C5070l9(interfaceC1809a17, 21);
                            c1836h03.m4545k0(objM4514P11);
                        }
                        InterfaceC1220a interfaceC1220a6 = (InterfaceC1220a) objM4514P11;
                        Object objM4514P12 = c1836h03.m4514P();
                        if (objM4514P12 == c1823e) {
                            objM4514P12 = new C4944hd(interfaceC1809a17, 10);
                            c1836h03.m4545k0(objM4514P12);
                        }
                        AbstractC4955ho.m9430S("群员文字颜色", "默认白色，支持渐变", str10, false, interfaceC1220a6, (InterfaceC1231l) objM4514P12, c1836h03, 221238, 8);
                        c1836h03 = c1836h03;
                        c1836h03.m4553p(false);
                    } else {
                        c1836h03.m4525a0(1425225264);
                        c1836h03.m4553p(false);
                    }
                    AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                    String str11 = (String) interfaceC1809a18.getValue();
                    Object objM4514P13 = c1836h03.m4514P();
                    if (objM4514P13 == c1823e) {
                        objM4514P13 = new C5070l9(interfaceC1809a18, 22);
                        c1836h03.m4545k0(objM4514P13);
                    }
                    InterfaceC1220a interfaceC1220a7 = (InterfaceC1220a) objM4514P13;
                    Object objM4514P14 = c1836h03.m4514P();
                    if (objM4514P14 == c1823e) {
                        objM4514P14 = new C4944hd(interfaceC1809a18, 11);
                        c1836h03.m4545k0(objM4514P14);
                    }
                    C1836h0 c1836h04 = c1836h03;
                    AbstractC4955ho.m9430S("自定义默认色", "点击聊天头衔可单独设置每个人的名称和颜色，支持渐变", str11, false, interfaceC1220a7, (InterfaceC1231l) objM4514P14, c1836h04, 221238, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h04, 0, 1);
                    String str12 = (String) interfaceC1809a19.getValue();
                    Object objM4514P15 = c1836h04.m4514P();
                    if (objM4514P15 == c1823e) {
                        objM4514P15 = new C5070l9(interfaceC1809a19, 23);
                        c1836h04.m4545k0(objM4514P15);
                    }
                    InterfaceC1220a interfaceC1220a8 = (InterfaceC1220a) objM4514P15;
                    Object objM4514P16 = c1836h04.m4514P();
                    if (objM4514P16 == c1823e) {
                        objM4514P16 = new C4944hd(interfaceC1809a19, 12);
                        c1836h04.m4545k0(objM4514P16);
                    }
                    AbstractC4955ho.m9430S("自定义文字默认色", "单人未设置文字颜色时使用，支持渐变", str12, false, interfaceC1220a8, (InterfaceC1231l) objM4514P16, c1836h04, 221238, 8);
                } else {
                    c1836h02.m4519V();
                }
                return C3967n.f12976a;
            case 2:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f16191h;
                Context context = (Context) this.f16192i;
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) this.f16193j;
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) this.f16194k;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) this.f16195l;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) this.f16196m;
                InterfaceC1809a1 interfaceC1809a114 = (InterfaceC1809a1) this.f16197n;
                InterfaceC1809a1 interfaceC1809a115 = (InterfaceC1809a1) this.f16198o;
                InterfaceC1809a1 interfaceC1809a116 = (InterfaceC1809a1) this.f16199p;
                C1836h0 c1836h05 = (C1836h0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c1836h05.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) interfaceC1809a110.getValue()).booleanValue();
                    boolean zM4538h = c1836h05.m4538h(sharedPreferences) | c1836h05.m4538h(context);
                    Object objM4514P17 = c1836h05.m4514P();
                    C1823e c1823e2 = C1851l.f6155a;
                    if (zM4538h || objM4514P17 == c1823e2) {
                        objM4514P17 = new C5337tc(interfaceC1809a110, sharedPreferences, context, 0);
                        c1836h05.m4545k0(objM4514P17);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue, "启用微信强保活", "开启后尝试保持微信息屏运行", false, (InterfaceC1231l) objM4514P17, c1836h05, 432, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    boolean zBooleanValue2 = ((Boolean) interfaceC1809a111.getValue()).booleanValue();
                    boolean zM4538h2 = c1836h05.m4538h(sharedPreferences) | c1836h05.m4538h(context);
                    Object objM4514P18 = c1836h05.m4514P();
                    if (zM4538h2 || objM4514P18 == c1823e2) {
                        objM4514P18 = new C5337tc(interfaceC1809a111, sharedPreferences, context, 1);
                        c1836h05.m4545k0(objM4514P18);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue2, "前台服务保活", "通过常驻通知提高后台存活率", false, (InterfaceC1231l) objM4514P18, c1836h05, 432, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    boolean zBooleanValue3 = ((Boolean) interfaceC1809a112.getValue()).booleanValue();
                    boolean zM4538h3 = c1836h05.m4538h(sharedPreferences) | c1836h05.m4538h(context);
                    Object objM4514P19 = c1836h05.m4514P();
                    if (zM4538h3 || objM4514P19 == c1823e2) {
                        objM4514P19 = new C5337tc(interfaceC1809a112, sharedPreferences, context, 2);
                        c1836h05.m4545k0(objM4514P19);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue3, "WakeLock 保活", "息屏后保持 CPU 运行，耗电会增加", false, (InterfaceC1231l) objM4514P19, c1836h05, 432, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    boolean zBooleanValue4 = ((Boolean) interfaceC1809a113.getValue()).booleanValue();
                    boolean zM4538h4 = c1836h05.m4538h(sharedPreferences) | c1836h05.m4538h(context);
                    Object objM4514P20 = c1836h05.m4514P();
                    if (zM4538h4 || objM4514P20 == c1823e2) {
                        objM4514P20 = new C5337tc(interfaceC1809a113, sharedPreferences, context, 3);
                        c1836h05.m4545k0(objM4514P20);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue4, "Root Doze 白名单", "有 Root 时执行 deviceidle 白名单命令", false, (InterfaceC1231l) objM4514P20, c1836h05, 432, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    boolean zBooleanValue5 = ((Boolean) interfaceC1809a114.getValue()).booleanValue();
                    boolean zM4538h5 = c1836h05.m4538h(sharedPreferences) | c1836h05.m4538h(context);
                    Object objM4514P21 = c1836h05.m4514P();
                    if (zM4538h5 || objM4514P21 == c1823e2) {
                        objM4514P21 = new C5337tc(interfaceC1809a114, sharedPreferences, context, 4);
                        c1836h05.m4545k0(objM4514P21);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue5, "Root 后台限制放行", "有 Root 时放行微信后台运行相关 AppOps", false, (InterfaceC1231l) objM4514P21, c1836h05, 432, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    boolean zBooleanValue6 = ((Boolean) interfaceC1809a115.getValue()).booleanValue();
                    boolean zM4538h6 = c1836h05.m4538h(sharedPreferences) | c1836h05.m4538h(context);
                    Object objM4514P22 = c1836h05.m4514P();
                    if (zM4538h6 || objM4514P22 == c1823e2) {
                        objM4514P22 = new C5337tc(interfaceC1809a115, sharedPreferences, context, 5);
                        c1836h05.m4545k0(objM4514P22);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue6, "看门狗拉起微信", "前台服务存活时定期尝试拉起微信", false, (InterfaceC1231l) objM4514P22, c1836h05, 432, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h05, 0, 1);
                    boolean zBooleanValue7 = ((Boolean) interfaceC1809a116.getValue()).booleanValue();
                    boolean zM4538h7 = c1836h05.m4538h(sharedPreferences) | c1836h05.m4538h(context);
                    Object objM4514P23 = c1836h05.m4514P();
                    if (zM4538h7 || objM4514P23 == c1823e2) {
                        objM4514P23 = new C5337tc(interfaceC1809a116, sharedPreferences, context, 6);
                        c1836h05.m4545k0(objM4514P23);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue7, "网络心跳保活", "定时发起轻量网络请求保持链路活跃", false, (InterfaceC1231l) objM4514P23, c1836h05, 432, 8);
                } else {
                    c1836h05.m4519V();
                }
                return C3967n.f12976a;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9302C((C5709b) this.f16191h, (C3641z) this.f16192i, (InterfaceC1231l) this.f16193j, (InterfaceC1220a) this.f16194k, (InterfaceC1220a) this.f16195l, (InterfaceC1220a) this.f16196m, (InterfaceC1231l) this.f16197n, (InterfaceC1231l) this.f16198o, (InterfaceC1231l) this.f16199p, (C1836h0) obj, AbstractC1874r.m4617C(114819073));
                break;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9649r1((Context) this.f16191h, (SharedPreferences) this.f16192i, (String) this.f16193j, (String) this.f16194k, (List) this.f16195l, (List) this.f16196m, (InterfaceC1231l) this.f16197n, (InterfaceC1220a) this.f16198o, (InterfaceC1220a) this.f16199p, (C1836h0) obj, AbstractC1874r.m4617C(100663297));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9434S3((InterfaceC4544a) this.f16191h, (SharedPreferences) this.f16192i, (String) this.f16193j, (String) this.f16194k, (String) this.f16195l, (InterfaceC1220a) this.f16196m, (InterfaceC1220a) this.f16197n, (InterfaceC1231l) this.f16198o, (InterfaceC1231l) this.f16199p, (C1836h0) obj, AbstractC1874r.m4617C(1572865));
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4772c5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, InterfaceC3955b interfaceC3955b, InterfaceC3955b interfaceC3955b2, InterfaceC3955b interfaceC3955b3, int i9, int i10) {
        this.f16190g = i10;
        this.f16191h = obj;
        this.f16192i = obj2;
        this.f16193j = obj3;
        this.f16194k = obj4;
        this.f16195l = obj5;
        this.f16196m = obj6;
        this.f16197n = interfaceC3955b;
        this.f16198o = interfaceC3955b2;
        this.f16199p = interfaceC3955b3;
    }
}
