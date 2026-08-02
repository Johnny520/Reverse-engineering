package defpackage;

import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hn1 implements xm0 {
    public final /* synthetic */ int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ls1.<init>():void] */
    public /* synthetic */ hn1(ls1 ls1Var) {
        this.h = 5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        switch (this.h) {
            case 0:
                return in1.b.d();
            case 1:
                return kn1.b.d();
            case 2:
                return ed3.a();
            case 3:
                return p40.M(po1.a);
            case 4:
                tu2 tu2Var = ur1.a;
                return Boolean.FALSE;
            case 5:
                yv2 yv2Var = yv2.j;
                yo2[] yo2VarArr = new yo2[0];
                if (pv2.s0("kotlin.Unit")) {
                    s.j("Blank serial names are prohibited");
                } else {
                    if (!(yv2Var == yv2.g)) {
                        ct ctVar = new ct("kotlin.Unit");
                        return new ap2("kotlin.Unit", yv2Var, ctVar.b.size(), mg.t0(yo2VarArr), ctVar);
                    }
                    s.j("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                }
                return null;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return new vv1();
            case 7:
                c60 c60Var = o90.a;
                return t50.j;
            case 8:
                f12.d.getClass();
                f12.j();
                return a83.a;
            case 9:
                return new pa2();
            case 10:
                return new dc2(new LinkedHashMap());
            case 11:
                tu2 tu2Var2 = hc2.a;
                return null;
            case 12:
                ow1[] ow1VarArr = {new ow1("nuke:runtime", cf2.b), new ow1("nuke:internal", cf2.c), new ow1("nuke:host-objects", cf2.h), new ow1("nuke:log", cf2.d), new ow1("nuke:timers", cf2.j), new ow1("nuke:encoding", cf2.k), new ow1("nuke:crypto", cf2.l), new ow1("nuke:fs", cf2.m), new ow1("nuke:http", cf2.n), new ow1("nuke:config", cf2.e), new ow1("nuke:ui", cf2.f), new ow1("nuke:messaging", cf2.g), new ow1("nuke:host", cf2.i)};
                LinkedHashMap linkedHashMap = new LinkedHashMap(xe1.U(13));
                we1.s0(linkedHashMap, ow1VarArr);
                return linkedHashMap;
            case 13:
                return op0.u(null);
            case 14:
                return new nl2(0);
            case 15:
                my myVar = jn2.a;
                return null;
            case 16:
                Method methodE = gp2.b.e();
                ig1.a(methodE);
                return methodE;
            case 17:
                return up0.H("com.tencent.mm.plugin.setting.ui.setting_new.settings.other.SettingGroupPlugin");
            case 18:
                return up0.H("com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupMain");
            case 19:
                return new hq2();
            case AIChatConfig.MaxContextRounds /* 20 */:
                return vs2.b.e();
            case 21:
                return ws2.b.e();
            case 22:
                return us2.b.e();
            case 23:
                return new za0(0.0f);
            case 24:
                return up0.H("com.tencent.mm.ui.conversation.ConversationFolderItemView");
            case 25:
                return up0.H("com.tencent.mm.pluginsdk.ui.chat.ChatFooter");
            case 26:
                my myVar2 = az2.a;
                return null;
            case 27:
                return r63.a;
            case 28:
                return l60.a;
            default:
                return new o63(null, 32767);
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [f12.g():void, gf1.P(px):nl2, jn1.<clinit>():void, kj1.<init>(int):void, op0.b(kw, px, int):void, r02.<clinit>():void, rg3.g(in0, px, int):void] */
    public /* synthetic */ hn1(int i) {
        this.h = i;
    }
}
