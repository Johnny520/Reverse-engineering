package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Patterns;
import gg.AbstractC1416l;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.regex.Matcher;
import okhttp3.HttpUrl;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p345x8.C5724q;
import sh.C4056v1;

/* JADX INFO: renamed from: wb.jf */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5010jf implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18104g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f18105h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f18106i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f18107j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f18108k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f18109l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f18110m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f18111n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f18112o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f18113p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f18114q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1809a1 f18115r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC1809a1 f18116s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC1809a1 f18117t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f18118u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f18119v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f18120w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f18121x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f18122y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f18123z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5010jf(Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114, InterfaceC1809a1 interfaceC1809a115, InterfaceC1809a1 interfaceC1809a116, InterfaceC1809a1 interfaceC1809a117, InterfaceC3599t interfaceC3599t) {
        this.f18118u = context;
        this.f18119v = interfaceC3599t;
        this.f18105h = interfaceC1809a1;
        this.f18106i = interfaceC1809a12;
        this.f18107j = interfaceC1809a13;
        this.f18108k = interfaceC1809a14;
        this.f18109l = interfaceC1809a15;
        this.f18110m = interfaceC1809a16;
        this.f18111n = interfaceC1809a17;
        this.f18112o = interfaceC1809a18;
        this.f18113p = interfaceC1809a19;
        this.f18114q = interfaceC1809a110;
        this.f18115r = interfaceC1809a111;
        this.f18116s = interfaceC1809a112;
        this.f18117t = interfaceC1809a113;
        this.f18120w = interfaceC1809a114;
        this.f18121x = interfaceC1809a115;
        this.f18122y = interfaceC1809a116;
        this.f18123z = interfaceC1809a117;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:206:0x0539 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        int i9;
        final InterfaceC1809a1 interfaceC1809a1;
        String str;
        InterfaceC1809a1 interfaceC1809a12;
        String str2;
        InterfaceC1809a1 interfaceC1809a13;
        int i10 = this.f18104g;
        InterfaceC1809a1 interfaceC1809a14 = this.f18112o;
        InterfaceC1809a1 interfaceC1809a15 = this.f18111n;
        InterfaceC1809a1 interfaceC1809a16 = this.f18110m;
        InterfaceC1809a1 interfaceC1809a17 = this.f18109l;
        InterfaceC1809a1 interfaceC1809a18 = this.f18108k;
        InterfaceC1809a1 interfaceC1809a19 = this.f18107j;
        InterfaceC1809a1 interfaceC1809a110 = this.f18106i;
        InterfaceC1809a1 interfaceC1809a111 = this.f18105h;
        C3967n c3967n = C3967n.f12976a;
        C1823e c1823e = C1851l.f6155a;
        Object obj3 = this.f18123z;
        Object obj4 = this.f18122y;
        Object obj5 = this.f18120w;
        Object obj6 = this.f18119v;
        Object obj7 = this.f18121x;
        Object obj8 = this.f18118u;
        switch (i10) {
            case 0:
                SharedPreferences sharedPreferences = (SharedPreferences) obj8;
                List list = (List) obj6;
                String str3 = (String) obj7;
                List list2 = (List) obj5;
                Set set = (Set) obj4;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) obj3;
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c1836h0.m4519V();
                } else {
                    boolean zBooleanValue = ((Boolean) interfaceC1809a111.getValue()).booleanValue();
                    boolean zM4538h = c1836h0.m4538h(sharedPreferences);
                    Object objM4514P = c1836h0.m4514P();
                    if (zM4538h || objM4514P == c1823e) {
                        objM4514P = new C5441wh(sharedPreferences, interfaceC1809a111, 7);
                        c1836h0.m4545k0(objM4514P);
                    }
                    AbstractC4955ho.m9410P3(zBooleanValue, "自动播放语音", "播报允许名单内收到的消息", false, (InterfaceC1231l) objM4514P, c1836h0, 432, 8);
                    if (!((Boolean) interfaceC1809a111.getValue()).booleanValue()) {
                        c1836h0.m4525a0(2014271005);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(2009552495);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        String str4 = (String) interfaceC1809a110.getValue();
                        boolean zM4538h2 = c1836h0.m4538h(sharedPreferences);
                        Object objM4514P2 = c1836h0.m4514P();
                        if (zM4538h2 || objM4514P2 == c1823e) {
                            objM4514P2 = new C4746bc(sharedPreferences, interfaceC1809a110, interfaceC1809a19, 5);
                            c1836h0.m4545k0(objM4514P2);
                        }
                        AbstractC4955ho.m9353I2("语音引擎", "选择文字消息使用的 TTS 引擎", list, str4, (InterfaceC1231l) objM4514P2, false, c1836h0, 54, 32);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        String strM9263g = ((Boolean) interfaceC1809a18.getValue()).booleanValue() ? "正在读取所选引擎的角色，仅影响文字消息" : !AbstractC3149m.m6721t0((String) interfaceC1809a17.getValue()) ? AbstractC4855en.m9263g("读取失败：", (String) interfaceC1809a17.getValue()) : !AbstractC3149m.m6721t0((String) interfaceC1809a16.getValue()) ? AbstractC0921a.m2251n("系统默认不可用，已临时使用 ", str3, "，仅影响文字消息") : ((List) interfaceC1809a15.getValue()).isEmpty() ? "所选引擎未提供可选角色，将跟随引擎默认" : "选择所选引擎提供的角色，仅影响文字消息";
                        String str5 = (String) interfaceC1809a19.getValue();
                        boolean z9 = !((Boolean) interfaceC1809a18.getValue()).booleanValue();
                        boolean zM4538h3 = c1836h0.m4538h(sharedPreferences);
                        Object objM4514P3 = c1836h0.m4514P();
                        if (zM4538h3 || objM4514P3 == c1823e) {
                            objM4514P3 = new C5441wh(sharedPreferences, interfaceC1809a19, 8);
                            c1836h0.m4545k0(objM4514P3);
                        }
                        AbstractC4955ho.m9353I2("播报角色", strM9263g, list2, str5, (InterfaceC1231l) objM4514P3, z9, c1836h0, 6, 0);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        boolean zBooleanValue2 = ((Boolean) interfaceC1809a14.getValue()).booleanValue();
                        boolean zM4538h4 = c1836h0.m4538h(sharedPreferences);
                        Object objM4514P4 = c1836h0.m4514P();
                        if (zM4538h4 || objM4514P4 == c1823e) {
                            objM4514P4 = new C5441wh(sharedPreferences, interfaceC1809a14, 9);
                            c1836h0.m4545k0(objM4514P4);
                        }
                        AbstractC4955ho.m9410P3(zBooleanValue2, "播放语音消息", "收到语音时直接播放原语音，不使用 TTS", false, (InterfaceC1231l) objM4514P4, c1836h0, 432, 8);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        InterfaceC1809a1 interfaceC1809a112 = this.f18113p;
                        boolean zBooleanValue3 = ((Boolean) interfaceC1809a112.getValue()).booleanValue();
                        boolean zM4538h5 = c1836h0.m4538h(sharedPreferences);
                        Object objM4514P5 = c1836h0.m4514P();
                        if (zM4538h5 || objM4514P5 == c1823e) {
                            objM4514P5 = new C5441wh(sharedPreferences, interfaceC1809a112, 10);
                            c1836h0.m4545k0(objM4514P5);
                        }
                        AbstractC4955ho.m9410P3(zBooleanValue3, "音键控制", "音量减：暂停\n音量加：继续\n暂停时再按音量减：跳过", false, (InterfaceC1231l) objM4514P5, c1836h0, 432, 8);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        InterfaceC1809a1 interfaceC1809a113 = this.f18114q;
                        boolean zBooleanValue4 = ((Boolean) interfaceC1809a113.getValue()).booleanValue();
                        boolean zM4538h6 = c1836h0.m4538h(sharedPreferences);
                        Object objM4514P6 = c1836h0.m4514P();
                        if (zM4538h6 || objM4514P6 == c1823e) {
                            objM4514P6 = new C5441wh(sharedPreferences, interfaceC1809a113, 11);
                            c1836h0.m4545k0(objM4514P6);
                        }
                        AbstractC4955ho.m9410P3(zBooleanValue4, "播报发送人", "在消息正文前播报发送人", false, (InterfaceC1231l) objM4514P6, c1836h0, 432, 8);
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                        InterfaceC1809a1 interfaceC1809a114 = this.f18115r;
                        boolean zBooleanValue5 = ((Boolean) interfaceC1809a114.getValue()).booleanValue();
                        boolean zM4538h7 = c1836h0.m4538h(sharedPreferences);
                        Object objM4514P7 = c1836h0.m4514P();
                        if (zM4538h7 || objM4514P7 == c1823e) {
                            objM4514P7 = new C5441wh(sharedPreferences, interfaceC1809a114, 12);
                            c1836h0.m4545k0(objM4514P7);
                        }
                        AbstractC4955ho.m9410P3(zBooleanValue5, "免打扰", "指定时段内暂停自动播报", false, (InterfaceC1231l) objM4514P7, c1836h0, 432, 8);
                        if (((Boolean) interfaceC1809a114.getValue()).booleanValue()) {
                            c1836h0.m4525a0(2013233156);
                            AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                            InterfaceC1809a1 interfaceC1809a115 = this.f18116s;
                            String str6 = (String) interfaceC1809a115.getValue();
                            boolean zM4538h8 = c1836h0.m4538h(sharedPreferences);
                            Object objM4514P8 = c1836h0.m4514P();
                            if (zM4538h8 || objM4514P8 == c1823e) {
                                objM4514P8 = new C5441wh(sharedPreferences, interfaceC1809a115, 13);
                                c1836h0.m4545k0(objM4514P8);
                            }
                            AbstractC4955ho.m9474X3(6, 4, (InterfaceC1231l) objM4514P8, c1836h0, "开始时间", str6, false);
                            AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                            InterfaceC1809a1 interfaceC1809a116 = this.f18117t;
                            String str7 = (String) interfaceC1809a116.getValue();
                            boolean zM4538h9 = c1836h0.m4538h(sharedPreferences);
                            Object objM4514P9 = c1836h0.m4514P();
                            if (zM4538h9 || objM4514P9 == c1823e) {
                                objM4514P9 = new C5441wh(sharedPreferences, interfaceC1809a116, 14);
                                c1836h0.m4545k0(objM4514P9);
                            }
                            AbstractC4955ho.m9474X3(6, 4, (InterfaceC1231l) objM4514P9, c1836h0, "结束时间", str7, false);
                            i9 = 0;
                            c1836h0.m4553p(false);
                        } else {
                            i9 = 0;
                            c1836h0.m4525a0(2013810717);
                            c1836h0.m4553p(false);
                        }
                        AbstractC4955ho.m9312D1(0.0f, c1836h0, i9, 1);
                        AbstractC4955ho.m9503b("设置允许名单", set.isEmpty() ? "未设置" : AbstractC0921a.m2250m(set.size(), "已选择 ", " 个聊天"), interfaceC1220a, c1836h0, 6);
                        c1836h0.m4553p(false);
                    }
                }
                break;
            case 1:
                final Context context = (Context) obj8;
                final InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj6;
                final InterfaceC1809a1 interfaceC1809a117 = (InterfaceC1809a1) obj5;
                final InterfaceC1809a1 interfaceC1809a118 = (InterfaceC1809a1) obj7;
                final InterfaceC1809a1 interfaceC1809a119 = (InterfaceC1809a1) obj4;
                final InterfaceC1809a1 interfaceC1809a120 = (InterfaceC1809a1) obj3;
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c1836h02.m4519V();
                } else {
                    ExecutorService executorService = C5724q.f23297a;
                    AbstractC4955ho.m9296B1("UUID", C5724q.m10352X(context), null, c1836h02, 6, 4);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    AbstractC4955ho.m9296B1("MAC 地址", C5724q.m10351W(context), null, c1836h02, 6, 4);
                    AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                    InterfaceC1809a1 interfaceC1809a121 = this.f18105h;
                    String str8 = (String) interfaceC1809a121.getValue();
                    if (AbstractC3149m.m6721t0(str8)) {
                        str8 = "请求 OTA 获取验证码或绑定状态";
                    }
                    boolean zM4538h10 = c1836h02.m4538h(interfaceC3599t) | c1836h02.m4538h(context);
                    Object objM4514P10 = c1836h02.m4514P();
                    if (zM4538h10 || objM4514P10 == c1823e) {
                        final InterfaceC1809a1 interfaceC1809a122 = this.f18106i;
                        final InterfaceC1809a1 interfaceC1809a123 = this.f18107j;
                        final InterfaceC1809a1 interfaceC1809a124 = this.f18108k;
                        final InterfaceC1809a1 interfaceC1809a125 = this.f18109l;
                        final InterfaceC1809a1 interfaceC1809a126 = this.f18110m;
                        final InterfaceC1809a1 interfaceC1809a127 = this.f18111n;
                        final InterfaceC1809a1 interfaceC1809a128 = this.f18112o;
                        final InterfaceC1809a1 interfaceC1809a129 = this.f18113p;
                        final InterfaceC1809a1 interfaceC1809a130 = this.f18114q;
                        final InterfaceC1809a1 interfaceC1809a131 = this.f18115r;
                        final InterfaceC1809a1 interfaceC1809a132 = this.f18116s;
                        final InterfaceC1809a1 interfaceC1809a133 = this.f18117t;
                        interfaceC1809a1 = interfaceC1809a121;
                        objM4514P10 = new InterfaceC1220a() { // from class: wb.vi
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1220a
                            public final Object invoke() {
                                InterfaceC1809a1 interfaceC1809a134 = interfaceC1809a1;
                                interfaceC1809a134.setValue("正在请求...");
                                AbstractC3603v.m7563q(interfaceC3599t, null, new C4921gn(context, interfaceC1809a122, interfaceC1809a123, interfaceC1809a124, interfaceC1809a125, interfaceC1809a126, interfaceC1809a127, interfaceC1809a128, interfaceC1809a129, interfaceC1809a130, interfaceC1809a131, interfaceC1809a132, interfaceC1809a133, interfaceC1809a117, interfaceC1809a118, interfaceC1809a119, interfaceC1809a120, interfaceC1809a134, null), 3);
                                return C3967n.f12976a;
                            }
                        };
                        context = context;
                        c1836h02.m4545k0(objM4514P10);
                    } else {
                        interfaceC1809a1 = interfaceC1809a121;
                    }
                    AbstractC4955ho.m9503b("绑定设备", str8, (InterfaceC1220a) objM4514P10, c1836h02, 6);
                    boolean zM4534f = c1836h02.m4534f((String) interfaceC1809a1.getValue());
                    Object objM4514P11 = c1836h02.m4514P();
                    Object obj9 = objM4514P11;
                    if (zM4534f || objM4514P11 == c1823e) {
                        Matcher matcher = Patterns.WEB_URL.matcher((String) interfaceC1809a1.getValue());
                        while (true) {
                            if (matcher.find()) {
                                String strGroup = matcher.group();
                                str = strGroup;
                                if (strGroup == null) {
                                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                                }
                                if (AbstractC3156t.m6740d0(str, "http://", true) || AbstractC3156t.m6740d0(str, "https://", true)) {
                                }
                            } else {
                                str = null;
                            }
                        }
                        c1836h02.m4545k0(str);
                        obj9 = str;
                    }
                    String str9 = (String) obj9;
                    if (str9 == null) {
                        c1836h02.m4525a0(1825402460);
                        c1836h02.m4553p(false);
                    } else {
                        c1836h02.m4525a0(1825135302);
                        AbstractC4955ho.m9312D1(0.0f, c1836h02, 0, 1);
                        boolean zM4538h11 = c1836h02.m4538h(context) | c1836h02.m4534f(str9);
                        Object objM4514P12 = c1836h02.m4514P();
                        if (zM4538h11 || objM4514P12 == c1823e) {
                            objM4514P12 = new C4056v1(context, 29, str9);
                            c1836h02.m4545k0(objM4514P12);
                        }
                        AbstractC4955ho.m9296B1("绑定链接", str9, (InterfaceC1220a) objM4514P12, c1836h02, 6, 0);
                        c1836h02.m4553p(false);
                    }
                }
                break;
            default:
                SharedPreferences sharedPreferences2 = (SharedPreferences) obj8;
                String str10 = (String) obj7;
                Context context2 = (Context) obj6;
                InterfaceC1809a1 interfaceC1809a134 = (InterfaceC1809a1) obj5;
                InterfaceC1809a1 interfaceC1809a135 = (InterfaceC1809a1) obj4;
                InterfaceC1809a1 interfaceC1809a136 = (InterfaceC1809a1) obj3;
                C1836h0 c1836h03 = (C1836h0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    c1836h03.m4519V();
                } else {
                    String str11 = (String) interfaceC1809a111.getValue();
                    if (AbstractC1416l.m3825a(str11, "custom")) {
                        str2 = "单独设置";
                        interfaceC1809a12 = interfaceC1809a136;
                    } else {
                        interfaceC1809a12 = interfaceC1809a136;
                        str2 = AbstractC1416l.m3825a(str11, "none") ? "不发媒体" : "跟随全局";
                    }
                    List listM9356I5 = AbstractC4955ho.m9356I5();
                    String str12 = (String) interfaceC1809a111.getValue();
                    boolean zM4534f2 = c1836h03.m4534f(interfaceC1809a111) | c1836h03.m4538h(sharedPreferences2) | c1836h03.m4534f(str10);
                    Object objM4514P13 = c1836h03.m4514P();
                    if (zM4534f2 || objM4514P13 == c1823e) {
                        objM4514P13 = new C5402vb(sharedPreferences2, str10, interfaceC1809a111, 12);
                        c1836h03.m4545k0(objM4514P13);
                    }
                    AbstractC4955ho.m9353I2("媒体设置", str2, listM9356I5, str12, (InterfaceC1231l) objM4514P13, false, c1836h03, 6, 32);
                    if (!AbstractC1416l.m3825a((String) interfaceC1809a111.getValue(), "custom")) {
                        c1836h03.m4525a0(111094156);
                        c1836h03.m4553p(false);
                    } else {
                        c1836h03.m4525a0(107927661);
                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                        String strM9372K5 = AbstractC4955ho.m9372K5((String) interfaceC1809a110.getValue());
                        List listM9364J5 = AbstractC4955ho.m9364J5();
                        String str13 = (String) interfaceC1809a110.getValue();
                        boolean zM4534f3 = c1836h03.m4534f(interfaceC1809a110) | c1836h03.m4538h(sharedPreferences2) | c1836h03.m4534f(str10);
                        Object objM4514P14 = c1836h03.m4514P();
                        if (zM4534f3 || objM4514P14 == c1823e) {
                            objM4514P14 = new C5402vb(sharedPreferences2, str10, interfaceC1809a110, 13);
                            c1836h03.m4545k0(objM4514P14);
                        }
                        AbstractC4955ho.m9353I2("媒体顺序", strM9372K5, listM9364J5, str13, (InterfaceC1231l) objM4514P14, false, c1836h03, 6, 32);
                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                        String str14 = (String) interfaceC1809a19.getValue();
                        boolean zM4534f4 = c1836h03.m4534f(interfaceC1809a19);
                        Object objM4514P15 = c1836h03.m4514P();
                        if (zM4534f4 || objM4514P15 == c1823e) {
                            objM4514P15 = new C4720aj(interfaceC1809a19, 29);
                            c1836h03.m4545k0(objM4514P15);
                        }
                        AbstractC4955ho.m9304C1("媒体类型顺序", "英文逗号分隔：image,voice,emoji,video,file,favorite", str14, 0, (InterfaceC1231l) objM4514P15, c1836h03, 54, 8);
                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                        String str15 = (String) interfaceC1809a18.getValue();
                        boolean zM4534f5 = c1836h03.m4534f(interfaceC1809a18);
                        Object objM4514P16 = c1836h03.m4514P();
                        if (zM4534f5 || objM4514P16 == c1823e) {
                            objM4514P16 = new C4917gj(interfaceC1809a18, 0);
                            c1836h03.m4545k0(objM4514P16);
                        }
                        AbstractC4955ho.m9613n1(context2, "进群图片", str15, 3, null, (InterfaceC1231l) objM4514P16, c1836h03, 3120, 16);
                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                        String str16 = (String) interfaceC1809a17.getValue();
                        boolean zM4534f6 = c1836h03.m4534f(interfaceC1809a17);
                        Object objM4514P17 = c1836h03.m4514P();
                        if (zM4534f6 || objM4514P17 == c1823e) {
                            objM4514P17 = new C4917gj(interfaceC1809a17, 1);
                            c1836h03.m4545k0(objM4514P17);
                        }
                        AbstractC4955ho.m9613n1(context2, "退群图片", str16, 3, null, (InterfaceC1231l) objM4514P17, c1836h03, 3120, 16);
                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                        String str17 = (String) interfaceC1809a16.getValue();
                        boolean zM4534f7 = c1836h03.m4534f(interfaceC1809a16);
                        Object objM4514P18 = c1836h03.m4514P();
                        if (zM4534f7 || objM4514P18 == c1823e) {
                            objM4514P18 = new C4917gj(interfaceC1809a16, 2);
                            c1836h03.m4545k0(objM4514P18);
                        }
                        AbstractC4955ho.m9613n1(context2, "进群语音", str17, 4, null, (InterfaceC1231l) objM4514P18, c1836h03, 3120, 16);
                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                        String str18 = (String) interfaceC1809a15.getValue();
                        boolean zM4534f8 = c1836h03.m4534f(interfaceC1809a15);
                        Object objM4514P19 = c1836h03.m4514P();
                        if (zM4534f8 || objM4514P19 == c1823e) {
                            objM4514P19 = new C4917gj(interfaceC1809a15, 3);
                            c1836h03.m4545k0(objM4514P19);
                        }
                        AbstractC4955ho.m9613n1(context2, "退群语音", str18, 4, null, (InterfaceC1231l) objM4514P19, c1836h03, 3120, 16);
                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                        String str19 = (String) interfaceC1809a14.getValue();
                        boolean zM4534f9 = c1836h03.m4534f(interfaceC1809a14);
                        Object objM4514P20 = c1836h03.m4514P();
                        if (zM4534f9 || objM4514P20 == c1823e) {
                            objM4514P20 = new C4917gj(interfaceC1809a14, 4);
                            c1836h03.m4545k0(objM4514P20);
                        }
                        AbstractC4955ho.m9613n1(context2, "进群表情", str19, 6, null, (InterfaceC1231l) objM4514P20, c1836h03, 3120, 16);
                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                        InterfaceC1809a1 interfaceC1809a137 = this.f18113p;
                        String str20 = (String) interfaceC1809a137.getValue();
                        boolean zM4534f10 = c1836h03.m4534f(interfaceC1809a137);
                        Object objM4514P21 = c1836h03.m4514P();
                        if (zM4534f10 || objM4514P21 == c1823e) {
                            objM4514P21 = new C4917gj(interfaceC1809a137, 5);
                            c1836h03.m4545k0(objM4514P21);
                        }
                        AbstractC4955ho.m9613n1(context2, "退群表情", str20, 6, null, (InterfaceC1231l) objM4514P21, c1836h03, 3120, 16);
                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                        InterfaceC1809a1 interfaceC1809a138 = this.f18114q;
                        String str21 = (String) interfaceC1809a138.getValue();
                        boolean zM4534f11 = c1836h03.m4534f(interfaceC1809a138);
                        Object objM4514P22 = c1836h03.m4514P();
                        if (zM4534f11 || objM4514P22 == c1823e) {
                            objM4514P22 = new C4917gj(interfaceC1809a138, 6);
                            c1836h03.m4545k0(objM4514P22);
                        }
                        AbstractC4955ho.m9613n1(context2, "进群视频", str21, 5, null, (InterfaceC1231l) objM4514P22, c1836h03, 3120, 16);
                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                        InterfaceC1809a1 interfaceC1809a139 = this.f18115r;
                        String str22 = (String) interfaceC1809a139.getValue();
                        boolean zM4534f12 = c1836h03.m4534f(interfaceC1809a139);
                        Object objM4514P23 = c1836h03.m4514P();
                        if (zM4534f12 || objM4514P23 == c1823e) {
                            objM4514P23 = new C4720aj(interfaceC1809a139, 22);
                            c1836h03.m4545k0(objM4514P23);
                        }
                        AbstractC4955ho.m9613n1(context2, "退群视频", str22, 5, null, (InterfaceC1231l) objM4514P23, c1836h03, 3120, 16);
                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                        InterfaceC1809a1 interfaceC1809a140 = this.f18116s;
                        String str23 = (String) interfaceC1809a140.getValue();
                        boolean zM4534f13 = c1836h03.m4534f(interfaceC1809a140);
                        Object objM4514P24 = c1836h03.m4514P();
                        if (zM4534f13 || objM4514P24 == c1823e) {
                            objM4514P24 = new C4720aj(interfaceC1809a140, 23);
                            c1836h03.m4545k0(objM4514P24);
                        }
                        AbstractC4955ho.m9613n1(context2, "进群文件", str23, 7, null, (InterfaceC1231l) objM4514P24, c1836h03, 3120, 16);
                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                        InterfaceC1809a1 interfaceC1809a141 = this.f18117t;
                        String str24 = (String) interfaceC1809a141.getValue();
                        boolean zM4534f14 = c1836h03.m4534f(interfaceC1809a141);
                        Object objM4514P25 = c1836h03.m4514P();
                        if (zM4534f14 || objM4514P25 == c1823e) {
                            objM4514P25 = new C4720aj(interfaceC1809a141, 24);
                            c1836h03.m4545k0(objM4514P25);
                        }
                        AbstractC4955ho.m9613n1(context2, "退群文件", str24, 7, null, (InterfaceC1231l) objM4514P25, c1836h03, 3120, 16);
                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                        String str25 = (String) interfaceC1809a134.getValue();
                        Object objM4514P26 = c1836h03.m4514P();
                        if (objM4514P26 == c1823e) {
                            interfaceC1809a13 = interfaceC1809a12;
                            objM4514P26 = new C4720aj(interfaceC1809a13, 25);
                            c1836h03.m4545k0(objM4514P26);
                        } else {
                            interfaceC1809a13 = interfaceC1809a12;
                        }
                        InterfaceC1231l interfaceC1231l = (InterfaceC1231l) objM4514P26;
                        boolean zM4534f15 = c1836h03.m4534f(interfaceC1809a134);
                        Object objM4514P27 = c1836h03.m4514P();
                        if (zM4534f15 || objM4514P27 == c1823e) {
                            objM4514P27 = new C4720aj(interfaceC1809a134, 26);
                            c1836h03.m4545k0(objM4514P27);
                        }
                        AbstractC4955ho.m9613n1(context2, "进群收藏", str25, 9, interfaceC1231l, (InterfaceC1231l) objM4514P27, c1836h03, 27696, 0);
                        AbstractC4955ho.m9312D1(0.0f, c1836h03, 0, 1);
                        String str26 = (String) interfaceC1809a135.getValue();
                        Object objM4514P28 = c1836h03.m4514P();
                        if (objM4514P28 == c1823e) {
                            objM4514P28 = new C4720aj(interfaceC1809a13, 27);
                            c1836h03.m4545k0(objM4514P28);
                        }
                        InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) objM4514P28;
                        boolean zM4534f16 = c1836h03.m4534f(interfaceC1809a135);
                        Object objM4514P29 = c1836h03.m4514P();
                        if (zM4534f16 || objM4514P29 == c1823e) {
                            objM4514P29 = new C4720aj(interfaceC1809a135, 28);
                            c1836h03.m4545k0(objM4514P29);
                        }
                        AbstractC4955ho.m9613n1(context2, "退群收藏", str26, 9, interfaceC1231l2, (InterfaceC1231l) objM4514P29, c1836h03, 27696, 0);
                        c1836h03.m4553p(false);
                    }
                }
                break;
        }
        return c3967n;
    }

    public /* synthetic */ C5010jf(SharedPreferences sharedPreferences, List list, String str, List list2, Set set, InterfaceC1220a interfaceC1220a, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113) {
        this.f18118u = sharedPreferences;
        this.f18119v = list;
        this.f18121x = str;
        this.f18120w = list2;
        this.f18122y = set;
        this.f18123z = interfaceC1220a;
        this.f18105h = interfaceC1809a1;
        this.f18106i = interfaceC1809a12;
        this.f18107j = interfaceC1809a13;
        this.f18108k = interfaceC1809a14;
        this.f18109l = interfaceC1809a15;
        this.f18110m = interfaceC1809a16;
        this.f18111n = interfaceC1809a17;
        this.f18112o = interfaceC1809a18;
        this.f18113p = interfaceC1809a19;
        this.f18114q = interfaceC1809a110;
        this.f18115r = interfaceC1809a111;
        this.f18116s = interfaceC1809a112;
        this.f18117t = interfaceC1809a113;
    }

    public /* synthetic */ C5010jf(InterfaceC1809a1 interfaceC1809a1, SharedPreferences sharedPreferences, String str, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, Context context, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114, InterfaceC1809a1 interfaceC1809a115, InterfaceC1809a1 interfaceC1809a116) {
        this.f18105h = interfaceC1809a1;
        this.f18118u = sharedPreferences;
        this.f18121x = str;
        this.f18106i = interfaceC1809a12;
        this.f18107j = interfaceC1809a13;
        this.f18119v = context;
        this.f18108k = interfaceC1809a14;
        this.f18109l = interfaceC1809a15;
        this.f18110m = interfaceC1809a16;
        this.f18111n = interfaceC1809a17;
        this.f18112o = interfaceC1809a18;
        this.f18113p = interfaceC1809a19;
        this.f18114q = interfaceC1809a110;
        this.f18115r = interfaceC1809a111;
        this.f18116s = interfaceC1809a112;
        this.f18117t = interfaceC1809a113;
        this.f18120w = interfaceC1809a114;
        this.f18122y = interfaceC1809a115;
        this.f18123z = interfaceC1809a116;
    }
}
