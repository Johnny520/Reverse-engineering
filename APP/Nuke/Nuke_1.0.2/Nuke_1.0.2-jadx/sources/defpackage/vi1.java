package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vi1 implements in0 {
    public final /* synthetic */ int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [eu.G(int, java.util.List):int, kj1.<init>(java.io.File, int):void, ll1.a(org.luckypray.dexkit.DexKitBridge):void, op1.<init>(bi0):void, pp0.g(ep1, uh1, kw, kw, px, int):void, qp0.f(uh1, boolean, java.lang.String, nn0, kw, px, int):void, vi1.j(java.lang.Object):java.lang.Object] */
    public /* synthetic */ vi1(int i) {
        this.h = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls;
        Class cls2;
        Object x92Var;
        Object x92Var2;
        Object x92Var3;
        Object x92Var4;
        Object x92Var5;
        Object x92Var6;
        int i = this.h;
        Object obj2 = a83.a;
        switch (i) {
            case 0:
                dj0 dj0Var = (dj0) obj;
                dj0Var.getClass();
                dj0Var.t = mg.t0(new String[]{"com.tencent.mm.storage"});
                yg1 yg1Var = new yg1();
                yg1Var.j0("MicroMsg.MsgInfo", "[parseNewXmlSysMsg]");
                dj0Var.u = yg1Var;
                return obj2;
            case 1:
                dj0 dj0Var2 = (dj0) obj;
                dj0Var2.getClass();
                dj0Var2.t = mg.t0(new String[]{"com.tencent.mm.storage"});
                yg1 yg1Var2 = new yg1();
                yg1Var2.f0(Long.TYPE);
                yg1Var2.j0("check table name from id:%d table:%s getTableNameByLocalId:%s");
                dj0Var2.u = yg1Var2;
                return obj2;
            case 2:
                jg3 jg3Var = (jg3) obj;
                jg3Var.getClass();
                Object obj3 = jg3Var.a()[0];
                if (obj3 != null) {
                    sg1 sg1VarV = op0.y(obj3).v();
                    cls = Integer.class;
                    Class<Integer> clsA = p40.A(d72.a(cls));
                    if (clsA == null) {
                        clsA = cls;
                    }
                    Class<Integer> clsA2 = p40.A(d72.a(cls));
                    if (clsA2 == null) {
                        clsA2 = cls;
                    }
                    Class<Integer> clsA3 = p40.A(d72.a(cls));
                    if (clsA3 == null) {
                        clsA3 = cls;
                    }
                    cls2 = CharSequence.class;
                    Class<CharSequence> clsA4 = p40.A(d72.a(cls2));
                    cls2 = clsA4 != null ? clsA4 : CharSequence.class;
                    Class<Integer> clsA5 = p40.A(d72.a(cls));
                    sg1VarV.d(clsA, clsA2, clsA3, cls2, clsA5 != null ? clsA5 : Integer.class);
                    Iterator it = du.F0(jd3.a).iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        c80.g();
                        return null;
                    }
                }
                return obj2;
            case 3:
                jg3 jg3Var2 = (jg3) obj;
                jg3Var2.getClass();
                if (jg3Var2.a.thisObject != null) {
                    Object obj4 = jg3Var2.a()[0];
                    MenuItem menuItem = obj4 instanceof MenuItem ? (MenuItem) obj4 : null;
                    if (menuItem != null) {
                        CopyOnWriteArrayList copyOnWriteArrayList = jd3.a;
                        menuItem.getItemId();
                        Iterator it2 = jd3.a.iterator();
                        if (it2.hasNext()) {
                            it2.next().getClass();
                            c80.g();
                            return null;
                        }
                    }
                }
                return obj2;
            case 4:
                cj0 cj0Var = (cj0) obj;
                cj0Var.getClass();
                cj0Var.t = mg.t0(new String[]{"com.tencent.mm.ui.chatting.viewitems"});
                at atVar = new at();
                atVar.d0("ItemDataTag", "getCurrentMsg2 err");
                cj0Var.u = atVar;
                return obj2;
            case 5:
                cj0 cj0Var2 = (cj0) obj;
                cj0Var2.getClass();
                cj0Var2.t = mg.t0(new String[]{"com.tencent.mm.storage"});
                at atVar2 = new at();
                atVar2.d0("set msg status fail, msgId:%d, type:%d, userName:%s %s");
                cj0Var2.u = atVar2;
                return obj2;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                dj0 dj0Var3 = (dj0) obj;
                dj0Var3.getClass();
                dj0Var3.t = mg.t0(new String[]{"com.tencent.mm.ui.chatting.viewitems"});
                yg1 yg1Var3 = new yg1();
                yg1Var3.j0("MicroMsg.ChattingItem", "on create context menu, match qcontact or tcontact, remove favorite menu item");
                dj0Var3.u = yg1Var3;
                return obj2;
            case 7:
                dj0 dj0Var4 = (dj0) obj;
                dj0Var4.getClass();
                dj0Var4.t = mg.t0(new String[]{"com.tencent.mm.ui.chatting.viewitems"});
                yg1 yg1Var4 = new yg1();
                yg1Var4.j0("context item select failed, null dataTag", "MicroMsg.ChattingItem");
                dj0Var4.u = yg1Var4;
                return obj2;
            case 8:
                rw1 rw1Var = (rw1) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(rw1Var.b);
                sb.append(", ");
                return vi0.m(sb, rw1Var.c, ')');
            case 9:
                cj0 cj0Var3 = (cj0) obj;
                cj0Var3.getClass();
                cj0Var3.t = mg.t0(new String[]{"com.tencent.mm.vfs"});
                at atVar3 = new at();
                atVar3.d0("Base directory exists but is not a directory,");
                cj0Var3.u = atVar3;
                return obj2;
            case 10:
                yg1 yg1Var5 = (yg1) obj;
                yg1Var5.getClass();
                yg1Var5.t = new lv2("onGYNetEnd", 5);
                yg1Var5.d0(3);
                at atVar4 = new at();
                atVar4.d0("MicroMsg.NetSceneOpenLuckyMoney", "/cgi-bin/mmpay-bin/openwxhb");
                yg1Var5.v = atVar4;
                return obj2;
            case 11:
                dj0 dj0Var5 = (dj0) obj;
                dj0Var5.getClass();
                dj0Var5.t = mg.t0(new String[]{"com.tencent.mm.plugin.luckymoney.model"});
                dj0Var5.c0(new vi1(10));
                return obj2;
            case 12:
                cj0 cj0Var4 = (cj0) obj;
                cj0Var4.getClass();
                cj0Var4.t = mg.t0(new String[]{"com.tencent.mm.modelbase"});
                at atVar5 = new at();
                atVar5.d0("MicroMsg.NetSceneQueue", "doScene failed", "reset::cancel scene", "clearRunningQueue");
                cj0Var4.u = atVar5;
                return obj2;
            case 13:
                yg1 yg1Var6 = (yg1) obj;
                yg1Var6.getClass();
                yg1Var6.t = new lv2("onGYNetEnd", 5);
                yg1Var6.d0(3);
                at atVar6 = new at();
                atVar6.d0("MicroMsg.NetSceneReceiveLuckyMoney", "/cgi-bin/mmpay-bin/receivewxhb");
                yg1Var6.v = atVar6;
                return obj2;
            case 14:
                dj0 dj0Var6 = (dj0) obj;
                dj0Var6.getClass();
                dj0Var6.t = mg.t0(new String[]{"com.tencent.mm.plugin.luckymoney.model"});
                dj0Var6.c0(new vi1(13));
                return obj2;
            case 15:
                cj0 cj0Var5 = (cj0) obj;
                cj0Var5.getClass();
                at atVar7 = new at();
                atVar7.d0("MicroMsg.NetSceneSendMsg", "send msg fail ret = %s MsgId=%s MsgSource=%s");
                cj0Var5.u = atVar7;
                return obj2;
            case 16:
                cj0 cj0Var6 = (cj0) obj;
                cj0Var6.getClass();
                cj0Var6.t = mg.t0(new String[]{"com.tencent.mm.plugin.remittance.model"});
                at atVar8 = new at();
                atVar8.d0("Micromsg.NetSceneTenpayRemittanceConfirm", "/cgi-bin/mmpay-bin/transferoperation", "account click info , key is %s, value is %s");
                cj0Var6.u = atVar8;
                return obj2;
            case 17:
                cj0 cj0Var7 = (cj0) obj;
                cj0Var7.getClass();
                cj0Var7.t = mg.t0(new String[]{"com.tencent.mm.modelsimple"});
                at atVar9 = new at();
                atVar9.d0("null cannot be cast to non-null type com.tencent.mm.protocal.MMTypingSend.Req");
                cj0Var7.u = atVar9;
                return obj2;
            case 18:
                ea eaVar = ((qn1) obj).a;
                if (eaVar != null) {
                    eaVar.a();
                }
                return obj2;
            case 19:
                ((zn2) obj).getClass();
                return obj2;
            case AIChatConfig.MaxContextRounds /* 20 */:
                d31 d31Var = (d31) obj;
                d31Var.getClass();
                d31Var.b = true;
                return obj2;
            case 21:
                jg3 jg3Var3 = (jg3) obj;
                jg3Var3.getClass();
                if (!pp1.e.get()) {
                    Object obj5 = jg3Var3.a.thisObject;
                    obj5.getClass();
                    pp1.g((Activity) obj5);
                }
                return obj2;
            case 22:
                jg3 jg3Var4 = (jg3) obj;
                jg3Var4.getClass();
                Context context = (Application) jg3Var4.a()[0];
                if (context != null) {
                    pp1 pp1Var = pp1.a;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    up0.i = applicationContext;
                    ClassLoader classLoader = context.getClassLoader();
                    classLoader.getClass();
                    up0.j = classLoader;
                    vj[] vjVarArrA = pp1.a();
                    if (pp1.d.compareAndSet(false, true)) {
                        SystemClock.elapsedRealtime();
                        try {
                            if (te.S(pp1.d())) {
                                vjVarArrA.getClass();
                                boolean zF = pp1.f();
                                for (vj vjVar : vjVarArrA) {
                                    if (!(vjVar instanceof tb1) && vjVar.c()) {
                                        op0.q(vjVar, zF);
                                    }
                                }
                            } else {
                                try {
                                    XposedBridge.log("[NukeCore]Skip early hook installation: dex cache is invalid");
                                    x92Var3 = obj2;
                                } catch (Throwable th) {
                                    x92Var3 = new x92(th);
                                }
                                if (x92Var3 instanceof x92) {
                                    Log.println(4, "NukeCore", "Skip early hook installation: dex cache is invalid");
                                }
                            }
                            x92Var = obj2;
                        } catch (Throwable th2) {
                            x92Var = new x92(th2);
                        }
                        Throwable thA = y92.a(x92Var);
                        if (thA != null) {
                            String string = "Early hook installation failed: ".concat(fg1.Q(thA)).toString();
                            try {
                                XposedBridge.log("[NukeCore]" + string);
                                x92Var2 = obj2;
                            } catch (Throwable th3) {
                                x92Var2 = new x92(th3);
                            }
                            if (x92Var2 instanceof x92) {
                                Log.println(6, "NukeCore", string);
                            }
                        }
                    }
                }
                return obj2;
            case 23:
                jg3 jg3Var5 = (jg3) obj;
                pp1 pp1Var2 = pp1.a;
                jg3Var5.getClass();
                Application application = (Application) jg3Var5.a()[0];
                if (application != null) {
                    Context applicationContext2 = application.getApplicationContext();
                    if (applicationContext2 == null) {
                        applicationContext2 = application;
                    }
                    up0.i = applicationContext2;
                    ClassLoader classLoader2 = application.getClassLoader();
                    classLoader2.getClass();
                    up0.j = classLoader2;
                    String str = up0.l;
                    if (str == null) {
                        t11.S("moduleApkPath");
                        throw null;
                    }
                    Resources resources = application.getResources();
                    resources.getClass();
                    lg3.b(resources, str);
                    try {
                    } catch (Throwable th4) {
                        x92Var4 = new x92(th4);
                    }
                    if (up0.l == null) {
                        t11.S("moduleApkPath");
                        throw null;
                    }
                    c5.a(application);
                    x92Var4 = obj2;
                    Throwable thA2 = y92.a(x92Var4);
                    if (thA2 != null) {
                        String string2 = "Install ProxyInstrumentation failed; Activity.onResume fallback remains active: ".concat(fg1.Q(thA2)).toString();
                        try {
                            XposedBridge.log("[NukeCore]" + string2);
                            x92Var6 = obj2;
                        } catch (Throwable th5) {
                            x92Var6 = new x92(th5);
                        }
                        if (x92Var6 instanceof x92) {
                            Log.println(6, "NukeCore", string2);
                        }
                    }
                    vj[] vjVarArrA2 = pp1.a();
                    AtomicBoolean atomicBoolean = aq1.a;
                    op1 op1VarC = pp1.c();
                    op1 op1VarB = pp1.b();
                    op1VarC.getClass();
                    op1VarB.getClass();
                    vjVarArrA2.getClass();
                    aq1.a(op1VarC, op1VarB, vjVarArrA2);
                    if (te.S(pp1.d())) {
                        pp1.i(vjVarArrA2);
                    } else {
                        try {
                            XposedBridge.log("[NukeCore]Defer dex analysis until runtime entry Activity is ready");
                            x92Var5 = obj2;
                        } catch (Throwable th6) {
                            x92Var5 = new x92(th6);
                        }
                        if (x92Var5 instanceof x92) {
                            Log.println(4, "NukeCore", "Defer dex analysis until runtime entry Activity is ready");
                        }
                    }
                }
                return obj2;
            case 24:
                p51 p51Var = (p51) obj;
                p51Var.getClass();
                p51Var.a = 150;
                p51Var.a(Float.valueOf(1.0f), 0);
                p51Var.a(Float.valueOf(1.018f), 45);
                p51Var.a(Float.valueOf(0.92f), 150);
                return obj2;
            case 25:
                p51 p51Var2 = (p51) obj;
                p51Var2.getClass();
                p51Var2.a = 160;
                p51Var2.a(Float.valueOf(0.0f), 0);
                Float fValueOf = Float.valueOf(1.0f);
                p51Var2.a(fValueOf, 80);
                p51Var2.a(fValueOf, 160);
                return obj2;
            case 26:
                p51 p51Var3 = (p51) obj;
                p51Var3.getClass();
                p51Var3.a = 300;
                p51Var3.a(Float.valueOf(0.94f), 0);
                p51Var3.a(Float.valueOf(1.025f), 110);
                p51Var3.a(Float.valueOf(0.995f), 210);
                p51Var3.a(Float.valueOf(1.0f), 300);
                return obj2;
            case 27:
                p51 p51Var4 = (p51) obj;
                p51Var4.getClass();
                p51Var4.a = 150;
                p51Var4.a(Float.valueOf(1.0f), 0);
                p51Var4.a(Float.valueOf(1.012f), 45);
                p51Var4.a(Float.valueOf(0.94f), 150);
                return obj2;
            case 28:
                p51 p51Var5 = (p51) obj;
                p51Var5.getClass();
                p51Var5.a = 300;
                p51Var5.a(Float.valueOf(0.92f), 0);
                p51Var5.a(Float.valueOf(1.04f), 110);
                p51Var5.a(Float.valueOf(0.99f), 210);
                p51Var5.a(Float.valueOf(1.0f), 300);
                return obj2;
            default:
                d31 d31Var2 = (d31) obj;
                d31Var2.getClass();
                d31Var2.c = false;
                return obj2;
        }
    }
}
