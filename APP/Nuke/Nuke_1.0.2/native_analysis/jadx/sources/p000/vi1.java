package p000;

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
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vi1 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f11975h;

    public /* synthetic */ vi1(int i) {
        this.f11975h = i;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls;
        Class cls2;
        Object x92Var;
        Object x92Var2;
        Object x92Var3;
        Object x92Var4;
        Object x92Var5;
        Object x92Var6;
        int i = this.f11975h;
        Object obj2 = a83.f116a;
        switch (i) {
            case 0:
                dj0 dj0Var = (dj0) obj;
                dj0Var.getClass();
                dj0Var.f2077t = AbstractC0460mg.m3105t0(new String[]{"com.tencent.mm.storage"});
                yg1 yg1Var = new yg1();
                yg1Var.m6277j0("MicroMsg.MsgInfo", "[parseNewXmlSysMsg]");
                dj0Var.f2078u = yg1Var;
                return obj2;
            case 1:
                dj0 dj0Var2 = (dj0) obj;
                dj0Var2.getClass();
                dj0Var2.f2077t = AbstractC0460mg.m3105t0(new String[]{"com.tencent.mm.storage"});
                yg1 yg1Var2 = new yg1();
                yg1Var2.m6273f0(Long.TYPE);
                yg1Var2.m6277j0("check table name from id:%d table:%s getTableNameByLocalId:%s");
                dj0Var2.f2078u = yg1Var2;
                return obj2;
            case 2:
                jg3 jg3Var = (jg3) obj;
                jg3Var.getClass();
                Object obj3 = jg3Var.m2496a()[0];
                if (obj3 != null) {
                    sg1 sg1VarM3244v = op0.m3602y(obj3).m3244v();
                    cls = Integer.class;
                    Class<Integer> clsM3691A = p40.m3691A(d72.m967a(cls));
                    if (clsM3691A == null) {
                        clsM3691A = cls;
                    }
                    Class<Integer> clsM3691A2 = p40.m3691A(d72.m967a(cls));
                    if (clsM3691A2 == null) {
                        clsM3691A2 = cls;
                    }
                    Class<Integer> clsM3691A3 = p40.m3691A(d72.m967a(cls));
                    if (clsM3691A3 == null) {
                        clsM3691A3 = cls;
                    }
                    cls2 = CharSequence.class;
                    Class<CharSequence> clsM3691A4 = p40.m3691A(d72.m967a(cls2));
                    cls2 = clsM3691A4 != null ? clsM3691A4 : CharSequence.class;
                    Class<Integer> clsM3691A5 = p40.m3691A(d72.m967a(cls));
                    sg1VarM3244v.m4864d(clsM3691A, clsM3691A2, clsM3691A3, cls2, clsM3691A5 != null ? clsM3691A5 : Integer.class);
                    Iterator it = AbstractC0142du.m1148F0(jd3.f4989a).iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        c80.m664g();
                        return null;
                    }
                }
                return obj2;
            case 3:
                jg3 jg3Var2 = (jg3) obj;
                jg3Var2.getClass();
                if (jg3Var2.f5028a.thisObject != null) {
                    Object obj4 = jg3Var2.m2496a()[0];
                    MenuItem menuItem = obj4 instanceof MenuItem ? (MenuItem) obj4 : null;
                    if (menuItem != null) {
                        CopyOnWriteArrayList copyOnWriteArrayList = jd3.f4989a;
                        menuItem.getItemId();
                        Iterator it2 = jd3.f4989a.iterator();
                        if (it2.hasNext()) {
                            it2.next().getClass();
                            c80.m664g();
                            return null;
                        }
                    }
                }
                return obj2;
            case 4:
                cj0 cj0Var = (cj0) obj;
                cj0Var.getClass();
                cj0Var.f1584t = AbstractC0460mg.m3105t0(new String[]{"com.tencent.mm.ui.chatting.viewitems"});
                C0030at c0030at = new C0030at();
                c0030at.m272d0("ItemDataTag", "getCurrentMsg2 err");
                cj0Var.f1585u = c0030at;
                return obj2;
            case 5:
                cj0 cj0Var2 = (cj0) obj;
                cj0Var2.getClass();
                cj0Var2.f1584t = AbstractC0460mg.m3105t0(new String[]{"com.tencent.mm.storage"});
                C0030at c0030at2 = new C0030at();
                c0030at2.m272d0("set msg status fail, msgId:%d, type:%d, userName:%s %s");
                cj0Var2.f1585u = c0030at2;
                return obj2;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                dj0 dj0Var3 = (dj0) obj;
                dj0Var3.getClass();
                dj0Var3.f2077t = AbstractC0460mg.m3105t0(new String[]{"com.tencent.mm.ui.chatting.viewitems"});
                yg1 yg1Var3 = new yg1();
                yg1Var3.m6277j0("MicroMsg.ChattingItem", "on create context menu, match qcontact or tcontact, remove favorite menu item");
                dj0Var3.f2078u = yg1Var3;
                return obj2;
            case 7:
                dj0 dj0Var4 = (dj0) obj;
                dj0Var4.getClass();
                dj0Var4.f2077t = AbstractC0460mg.m3105t0(new String[]{"com.tencent.mm.ui.chatting.viewitems"});
                yg1 yg1Var4 = new yg1();
                yg1Var4.m6277j0("context item select failed, null dataTag", "MicroMsg.ChattingItem");
                dj0Var4.f2078u = yg1Var4;
                return obj2;
            case 8:
                rw1 rw1Var = (rw1) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(rw1Var.f9776b);
                sb.append(", ");
                return vi0.m5694m(sb, rw1Var.f9777c, ')');
            case 9:
                cj0 cj0Var3 = (cj0) obj;
                cj0Var3.getClass();
                cj0Var3.f1584t = AbstractC0460mg.m3105t0(new String[]{"com.tencent.mm.vfs"});
                C0030at c0030at3 = new C0030at();
                c0030at3.m272d0("Base directory exists but is not a directory,");
                cj0Var3.f1585u = c0030at3;
                return obj2;
            case 10:
                yg1 yg1Var5 = (yg1) obj;
                yg1Var5.getClass();
                yg1Var5.f13445t = new lv2("onGYNetEnd", 5);
                yg1Var5.m6271d0(3);
                C0030at c0030at4 = new C0030at();
                c0030at4.m272d0("MicroMsg.NetSceneOpenLuckyMoney", "/cgi-bin/mmpay-bin/openwxhb");
                yg1Var5.f13447v = c0030at4;
                return obj2;
            case 11:
                dj0 dj0Var5 = (dj0) obj;
                dj0Var5.getClass();
                dj0Var5.f2077t = AbstractC0460mg.m3105t0(new String[]{"com.tencent.mm.plugin.luckymoney.model"});
                dj0Var5.m1030c0(new vi1(10));
                return obj2;
            case 12:
                cj0 cj0Var4 = (cj0) obj;
                cj0Var4.getClass();
                cj0Var4.f1584t = AbstractC0460mg.m3105t0(new String[]{"com.tencent.mm.modelbase"});
                C0030at c0030at5 = new C0030at();
                c0030at5.m272d0("MicroMsg.NetSceneQueue", "doScene failed", "reset::cancel scene", "clearRunningQueue");
                cj0Var4.f1585u = c0030at5;
                return obj2;
            case 13:
                yg1 yg1Var6 = (yg1) obj;
                yg1Var6.getClass();
                yg1Var6.f13445t = new lv2("onGYNetEnd", 5);
                yg1Var6.m6271d0(3);
                C0030at c0030at6 = new C0030at();
                c0030at6.m272d0("MicroMsg.NetSceneReceiveLuckyMoney", "/cgi-bin/mmpay-bin/receivewxhb");
                yg1Var6.f13447v = c0030at6;
                return obj2;
            case 14:
                dj0 dj0Var6 = (dj0) obj;
                dj0Var6.getClass();
                dj0Var6.f2077t = AbstractC0460mg.m3105t0(new String[]{"com.tencent.mm.plugin.luckymoney.model"});
                dj0Var6.m1030c0(new vi1(13));
                return obj2;
            case 15:
                cj0 cj0Var5 = (cj0) obj;
                cj0Var5.getClass();
                C0030at c0030at7 = new C0030at();
                c0030at7.m272d0("MicroMsg.NetSceneSendMsg", "send msg fail ret = %s MsgId=%s MsgSource=%s");
                cj0Var5.f1585u = c0030at7;
                return obj2;
            case 16:
                cj0 cj0Var6 = (cj0) obj;
                cj0Var6.getClass();
                cj0Var6.f1584t = AbstractC0460mg.m3105t0(new String[]{"com.tencent.mm.plugin.remittance.model"});
                C0030at c0030at8 = new C0030at();
                c0030at8.m272d0("Micromsg.NetSceneTenpayRemittanceConfirm", "/cgi-bin/mmpay-bin/transferoperation", "account click info , key is %s, value is %s");
                cj0Var6.f1585u = c0030at8;
                return obj2;
            case 17:
                cj0 cj0Var7 = (cj0) obj;
                cj0Var7.getClass();
                cj0Var7.f1584t = AbstractC0460mg.m3105t0(new String[]{"com.tencent.mm.modelsimple"});
                C0030at c0030at9 = new C0030at();
                c0030at9.m272d0("null cannot be cast to non-null type com.tencent.mm.protocal.MMTypingSend.Req");
                cj0Var7.f1585u = c0030at9;
                return obj2;
            case 18:
                C0159ea c0159ea = ((qn1) obj).f9046a;
                if (c0159ea != null) {
                    c0159ea.mo6a();
                }
                return obj2;
            case 19:
                ((zn2) obj).getClass();
                return obj2;
            case AIChatConfig.MaxContextRounds /* 20 */:
                d31 d31Var = (d31) obj;
                d31Var.getClass();
                d31Var.f1848b = true;
                return obj2;
            case 21:
                jg3 jg3Var3 = (jg3) obj;
                jg3Var3.getClass();
                if (!pp1.f8449e.get()) {
                    Object obj5 = jg3Var3.f5028a.thisObject;
                    obj5.getClass();
                    pp1.m3935g((Activity) obj5);
                }
                return obj2;
            case 22:
                jg3 jg3Var4 = (jg3) obj;
                jg3Var4.getClass();
                Context context = (Application) jg3Var4.m2496a()[0];
                if (context != null) {
                    pp1 pp1Var = pp1.f8445a;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    up0.f11401i = applicationContext;
                    ClassLoader classLoader = context.getClassLoader();
                    classLoader.getClass();
                    up0.f11402j = classLoader;
                    AbstractC0812vj[] abstractC0812vjArrM3929a = pp1.m3929a();
                    if (pp1.f8448d.compareAndSet(false, true)) {
                        SystemClock.elapsedRealtime();
                        try {
                            if (AbstractC0731te.m5190S(pp1.m3932d())) {
                                abstractC0812vjArrM3929a.getClass();
                                boolean zM3934f = pp1.m3934f();
                                for (AbstractC0812vj abstractC0812vj : abstractC0812vjArrM3929a) {
                                    if (!(abstractC0812vj instanceof tb1) && abstractC0812vj.mo849c()) {
                                        op0.m3594q(abstractC0812vj, zM3934f);
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
                        Throwable thM6237a = y92.m6237a(x92Var);
                        if (thM6237a != null) {
                            String string = "Early hook installation failed: ".concat(fg1.m1624Q(thM6237a)).toString();
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
                pp1 pp1Var2 = pp1.f8445a;
                jg3Var5.getClass();
                Application application = (Application) jg3Var5.m2496a()[0];
                if (application != null) {
                    Context applicationContext2 = application.getApplicationContext();
                    if (applicationContext2 == null) {
                        applicationContext2 = application;
                    }
                    up0.f11401i = applicationContext2;
                    ClassLoader classLoader2 = application.getClassLoader();
                    classLoader2.getClass();
                    up0.f11402j = classLoader2;
                    String str = up0.f11404l;
                    if (str == null) {
                        t11.m5067S("moduleApkPath");
                        throw null;
                    }
                    Resources resources = application.getResources();
                    resources.getClass();
                    lg3.m2910b(resources, str);
                    try {
                    } catch (Throwable th4) {
                        x92Var4 = new x92(th4);
                    }
                    if (up0.f11404l == null) {
                        t11.m5067S("moduleApkPath");
                        throw null;
                    }
                    AbstractC0079c5.m637a(application);
                    x92Var4 = obj2;
                    Throwable thM6237a2 = y92.m6237a(x92Var4);
                    if (thM6237a2 != null) {
                        String string2 = "Install ProxyInstrumentation failed; Activity.onResume fallback remains active: ".concat(fg1.m1624Q(thM6237a2)).toString();
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
                    AbstractC0812vj[] abstractC0812vjArrM3929a2 = pp1.m3929a();
                    AtomicBoolean atomicBoolean = aq1.f335a;
                    op1 op1VarM3931c = pp1.m3931c();
                    op1 op1VarM3930b = pp1.m3930b();
                    op1VarM3931c.getClass();
                    op1VarM3930b.getClass();
                    abstractC0812vjArrM3929a2.getClass();
                    aq1.m259a(op1VarM3931c, op1VarM3930b, abstractC0812vjArrM3929a2);
                    if (AbstractC0731te.m5190S(pp1.m3932d())) {
                        pp1.m3937i(abstractC0812vjArrM3929a2);
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
                p51Var.f7980a = 150;
                p51Var.m3744a(Float.valueOf(1.0f), 0);
                p51Var.m3744a(Float.valueOf(1.018f), 45);
                p51Var.m3744a(Float.valueOf(0.92f), 150);
                return obj2;
            case 25:
                p51 p51Var2 = (p51) obj;
                p51Var2.getClass();
                p51Var2.f7980a = 160;
                p51Var2.m3744a(Float.valueOf(0.0f), 0);
                Float fValueOf = Float.valueOf(1.0f);
                p51Var2.m3744a(fValueOf, 80);
                p51Var2.m3744a(fValueOf, 160);
                return obj2;
            case 26:
                p51 p51Var3 = (p51) obj;
                p51Var3.getClass();
                p51Var3.f7980a = 300;
                p51Var3.m3744a(Float.valueOf(0.94f), 0);
                p51Var3.m3744a(Float.valueOf(1.025f), 110);
                p51Var3.m3744a(Float.valueOf(0.995f), 210);
                p51Var3.m3744a(Float.valueOf(1.0f), 300);
                return obj2;
            case 27:
                p51 p51Var4 = (p51) obj;
                p51Var4.getClass();
                p51Var4.f7980a = 150;
                p51Var4.m3744a(Float.valueOf(1.0f), 0);
                p51Var4.m3744a(Float.valueOf(1.012f), 45);
                p51Var4.m3744a(Float.valueOf(0.94f), 150);
                return obj2;
            case 28:
                p51 p51Var5 = (p51) obj;
                p51Var5.getClass();
                p51Var5.f7980a = 300;
                p51Var5.m3744a(Float.valueOf(0.92f), 0);
                p51Var5.m3744a(Float.valueOf(1.04f), 110);
                p51Var5.m3744a(Float.valueOf(0.99f), 210);
                p51Var5.m3744a(Float.valueOf(1.0f), 300);
                return obj2;
            default:
                d31 d31Var2 = (d31) obj;
                d31Var2.getClass();
                d31Var2.f1849c = false;
                return obj2;
        }
    }
}
