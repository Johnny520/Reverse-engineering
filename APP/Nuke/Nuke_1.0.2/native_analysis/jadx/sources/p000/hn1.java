package p000;

import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hn1 implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f4088h;

    public /* synthetic */ hn1(ls1 ls1Var) {
        this.f4088h = 5;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f4088h) {
            case 0:
                return in1.f4703b.m5639d();
            case 1:
                return kn1.f5655b.m5639d();
            case 2:
                return ed3.m1340a();
            case 3:
                return p40.m3703M(po1.f8422a);
            case 4:
                tu2 tu2Var = ur1.f11452a;
                return Boolean.FALSE;
            case 5:
                yv2 yv2Var = yv2.f13635j;
                yo2[] yo2VarArr = new yo2[0];
                if (pv2.m4006s0("kotlin.Unit")) {
                    C0676s.m4651j("Blank serial names are prohibited");
                } else {
                    if (!(yv2Var == yv2.f13632g)) {
                        C0105ct c0105ct = new C0105ct("kotlin.Unit");
                        return new ap2("kotlin.Unit", yv2Var, c0105ct.f1715b.size(), AbstractC0460mg.m3105t0(yo2VarArr), c0105ct);
                    }
                    C0676s.m4651j("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                }
                return null;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return new vv1();
            case 7:
                c60 c60Var = o90.f7590a;
                return t50.f10560j;
            case 8:
                f12.f2735d.getClass();
                f12.m1490j();
                return a83.f116a;
            case 9:
                return new pa2();
            case 10:
                return new dc2(new LinkedHashMap());
            case 11:
                tu2 tu2Var2 = hc2.f3953a;
                return null;
            case 12:
                ow1[] ow1VarArr = {new ow1("nuke:runtime", cf2.f1504b), new ow1("nuke:internal", cf2.f1505c), new ow1("nuke:host-objects", cf2.f1510h), new ow1("nuke:log", cf2.f1506d), new ow1("nuke:timers", cf2.f1512j), new ow1("nuke:encoding", cf2.f1513k), new ow1("nuke:crypto", cf2.f1514l), new ow1("nuke:fs", cf2.f1515m), new ow1("nuke:http", cf2.f1516n), new ow1("nuke:config", cf2.f1507e), new ow1("nuke:ui", cf2.f1508f), new ow1("nuke:messaging", cf2.f1509g), new ow1("nuke:host", cf2.f1511i)};
                LinkedHashMap linkedHashMap = new LinkedHashMap(xe1.m6103U(13));
                we1.m5878s0(linkedHashMap, ow1VarArr);
                return linkedHashMap;
            case 13:
                return op0.m3598u(null);
            case 14:
                return new nl2(0);
            case 15:
                C0478my c0478my = jn2.f5125a;
                return null;
            case 16:
                Method methodM5640e = gp2.f3652b.m5640e();
                ig1.m2344a(methodM5640e);
                return methodM5640e;
            case 17:
                return up0.m5529H("com.tencent.mm.plugin.setting.ui.setting_new.settings.other.SettingGroupPlugin");
            case 18:
                return up0.m5529H("com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupMain");
            case 19:
                return new hq2();
            case AIChatConfig.MaxContextRounds /* 20 */:
                return vs2.f12166b.m5640e();
            case 21:
                return ws2.f12625b.m5640e();
            case 22:
                return us2.f11473b.m5640e();
            case 23:
                return new za0(0.0f);
            case 24:
                return up0.m5529H("com.tencent.mm.ui.conversation.ConversationFolderItemView");
            case 25:
                return up0.m5529H("com.tencent.mm.pluginsdk.ui.chat.ChatFooter");
            case 26:
                C0478my c0478my2 = az2.f456a;
                return null;
            case 27:
                return r63.f9409a;
            case 28:
                return l60.f5946a;
            default:
                return new o63(null, 32767);
        }
    }

    public /* synthetic */ hn1(int i) {
        this.f4088h = i;
    }
}
