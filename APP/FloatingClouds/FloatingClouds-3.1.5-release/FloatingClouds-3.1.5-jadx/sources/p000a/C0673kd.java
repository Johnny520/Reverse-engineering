package p000a;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import p000a.C0186K3;
import p000a.C0518ca;
import p000a.C0597gd;
import p000a.C0816s4;

/* JADX INFO: renamed from: a.kd */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0673kd implements InterfaceC0064D7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2512a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [a.O8.f(java.lang.Object):java.lang.Object] */
    public /* synthetic */ C0673kd(int i) {
        this.f2512a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0373 A[LOOP:0: B:144:0x032f->B:159:0x0373, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0376 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.Map] */
    @Override // p000a.InterfaceC0064D7
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo53f(Object obj) {
        Iterable iterableM2157p;
        Class clsM135g;
        C0597gd c0597gd;
        Class clsM135g2;
        switch (this.f2512a) {
            case 0:
                C0578fd c0578fd = (C0578fd) obj;
                C0631i9.m1482e(c0578fd, "ctx");
                C0052Cd.f184a.getClass();
                ?? r5 = C0475a5.f1753a;
                String str = r5 != 0 ? (String) r5.get("rule_class_".concat("sns_info_model")) : null;
                ClassLoader classLoader = c0578fd.f2146b;
                if (str != null && (clsM135g2 = C0052Cd.m135g(classLoader, str)) != null) {
                    return C0597gd.a.m1428a(clsM135g2, EnumC0521cd.f1910c, null, null, 28);
                }
                boolean zM2121H = C0889w1.m2121H();
                EnumC0521cd enumC0521cd = EnumC0521cd.f1909b;
                if (zM2121H) {
                    try {
                        iterableM2157p = C0889w1.m2157p("e4.p");
                    } catch (Exception unused) {
                        iterableM2157p = C0439Y5.f1645a;
                    }
                    Iterator it = iterableM2157p.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String str2 = (String) it.next();
                            C0052Cd.f184a.getClass();
                            clsM135g = C0052Cd.m135g(classLoader, str2);
                            if (clsM135g != null) {
                                Method[] declaredMethods = clsM135g.getDeclaredMethods();
                                C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
                                int length = declaredMethods.length;
                                for (?? r12 = z; r12 < length; r12++) {
                                    Method method = declaredMethods[r12];
                                    if (C0631i9.m1478a(method.getName(), "getCommentList")) {
                                        Class<?>[] parameterTypes = method.getParameterTypes();
                                        C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                                        if (parameterTypes.length == 0) {
                                            if (clsM135g == null) {
                                                z = false;
                                            }
                                        }
                                    }
                                }
                                clsM135g = null;
                                if (clsM135g == null) {
                                }
                            } else {
                                clsM135g = null;
                                if (clsM135g == null) {
                                }
                            }
                        } else {
                            clsM135g = null;
                        }
                    }
                    if (clsM135g != null) {
                        C0475a5.m1159h("sns_info_model", clsM135g.getName());
                        C0908x1.m2194b("RuleSystem", C0944z.m2227g("SNS_INFO_MODEL_RESOLVED cls=", clsM135g.getName(), " via=DkBridge"));
                        return C0597gd.a.m1428a(clsM135g, EnumC0521cd.f1908a, null, null, 28);
                    }
                    c0597gd = new C0597gd(false, null, new C0647j6("SNS_INFO_NOT_FOUND", "sns_info_model", "no class with getCommentList found", "", System.currentTimeMillis()), enumC0521cd, EnumC0540dd.f1946c, null, null);
                    break;
                } else {
                    c0597gd = new C0597gd(false, null, new C0647j6("DK_NOT_READY", "sns_info_model", "DkBridge not initialized", "", System.currentTimeMillis()), enumC0521cd, EnumC0540dd.f1945b, null, null);
                }
                return c0597gd;
            case 1:
                Class cls = (Class) obj;
                C0631i9.m1482e(cls, "it");
                return cls.getSuperclass();
            case 2:
                Class cls2 = (Class) obj;
                C0631i9.m1482e(cls2, "it");
                Method[] declaredMethods2 = cls2.getDeclaredMethods();
                C0631i9.m1481d(declaredMethods2, "getDeclaredMethods(...)");
                return declaredMethods2.length == 0 ? C0476a6.f1788a : new C0220M1(0, declaredMethods2);
            case 3:
                return ((Class) obj).getName();
            case 4:
                C0799r6 c0799r6 = (C0799r6) obj;
                C0631i9.m1482e(c0799r6, "it");
                return c0799r6.m1856b().f1641b;
            case 5:
                C0799r6 c0799r62 = (C0799r6) obj;
                C0631i9.m1482e(c0799r62, "it");
                return c0799r62.m1856b().f1641b;
            case 6:
                C0088Ed.f270b = (Class) obj;
                return C0413Wf.f1577a;
            case 7:
                C0088Ed.f278j = (Class) obj;
                return C0413Wf.f1577a;
            case 8:
                C0088Ed.f279k = (Class) obj;
                return C0413Wf.f1577a;
            case 9:
                C0088Ed.f281m = (Class) obj;
                return C0413Wf.f1577a;
            case 10:
                C0088Ed.f282n = (Class) obj;
                return C0413Wf.f1577a;
            case 11:
                C0088Ed.f274f = (Class) obj;
                return C0413Wf.f1577a;
            case 12:
                C0088Ed.f283o = (Class) obj;
                return C0413Wf.f1577a;
            case 13:
                C0088Ed.f271c = (Class) obj;
                return C0413Wf.f1577a;
            case 14:
                C0088Ed.f280l = (Class) obj;
                return C0413Wf.f1577a;
            case 15:
                C0088Ed.f272d = (Class) obj;
                return C0413Wf.f1577a;
            case 16:
                C0088Ed.f273e = (Class) obj;
                return C0413Wf.f1577a;
            case 17:
                C0088Ed.f275g = (Class) obj;
                return C0413Wf.f1577a;
            case 18:
                C0088Ed.f276h = (Class) obj;
                return C0413Wf.f1577a;
            case 19:
                C0088Ed.f277i = (Class) obj;
                return C0413Wf.f1577a;
            case 20:
                XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain, "chain");
                Object thisObject = chain.getThisObject();
                Activity activity = thisObject instanceof Activity ? (Activity) thisObject : null;
                Object obj2 = chain.getArgs().get(0);
                String str3 = obj2 instanceof String ? (String) obj2 : null;
                if (str3 == null) {
                    str3 = "";
                }
                chain.proceed();
                C0186K3.f638a.getClass();
                C0653jc c0653jcM508i = C0186K3.a.m508i();
                if (!str3.equals(c0653jcM508i.f2424P)) {
                    if (str3.equals(c0653jcM508i.f2425Q) && C0186K3.a.m511l()) {
                        if (C0376Ue.f1410t != null && C0186K3.a.m511l()) {
                            if (C0915x8.f3530a.m2205c(C0518ca.b.f1899c, C0518ca.c.f1903c, C0726n9.m1681z(C0518ca.b.f1897a, C0518ca.b.f1898b))) {
                                C0908x1.m2194b(Arrays.copyOf(new Object[]{"TempUnhideTrigger: command unhide triggered"}, 1));
                                C0816s4 c0816s4 = C0816s4.f3220I;
                                if (c0816s4 != null) {
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    boolean z = jCurrentTimeMillis - C0816s4.f3223L < 500;
                                    C0816s4.f3223L = jCurrentTimeMillis;
                                    if (!z) {
                                        C0816s4.a.C1338a.EnumC1339a enumC1339a = C0816s4.a.C1338a.EnumC1339a.f3263c;
                                        c0816s4.m1914y(false, enumC1339a, new C0664k4(c0816s4, 6));
                                        c0816s4.m1915z(false, enumC1339a);
                                    }
                                    c0816s4.f3247n.clear();
                                    c0816s4.f3256w.clear();
                                    View view = c0816s4.f3242i;
                                    C0908x1.m2194b(Arrays.copyOf(new Object[]{C0944z.m2231k("HideMainUI: onStateUnhideCommand immediate refresh rootView=", view != null ? view.getClass().getSimpleName() : null)}, 1));
                                    View view2 = c0816s4.f3242i;
                                    if (view2 != null) {
                                        try {
                                            c0816s4.m1898d(view2);
                                            C0413Wf c0413Wf = C0413Wf.f1577a;
                                        } catch (Throwable th) {
                                            C0920xd.m2206a(th);
                                        }
                                    }
                                    C0816s4.m1894x();
                                }
                            } else {
                                C0908x1.m2194b(Arrays.copyOf(new Object[]{"TempUnhideTrigger: command unhide BLOCKED (state=" + C0915x8.f3531b + ")"}, 1));
                            }
                        }
                        if (activity != null) {
                            activity.finish();
                        }
                    }
                    break;
                } else if (activity != null) {
                    activity.finish();
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0679l0(3), 250L);
                }
                return C0413Wf.f1577a;
            case 21:
                return Boolean.valueOf(obj == null);
            case 22:
                XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain2, "chain");
                C0637if.f2311a.getClass();
                return C0637if.m1491e(chain2);
            case 23:
                XposedInterface.Chain chain3 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain3, "chain");
                C0637if.f2311a.getClass();
                return C0637if.m1491e(chain3);
            case 24:
                XposedInterface.Chain chain4 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain4, "chain");
                C0637if.f2311a.getClass();
                return C0637if.m1491e(chain4);
            case 25:
                XposedInterface.Chain chain5 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain5, "chain");
                C0637if.f2311a.getClass();
                return C0637if.m1492f(chain5);
            case 26:
                XposedInterface.Chain chain6 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain6, "chain");
                C0637if.f2311a.getClass();
                return C0637if.m1492f(chain6);
            case 27:
                return ((Class) obj).getName();
            case 28:
                Method method2 = (Method) obj;
                return method2.getDeclaringClass().getName() + "#" + method2.getName();
            default:
                XposedInterface.Chain chain7 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain7, "chain");
                Object objProceed = chain7.proceed();
                C0186K3.f638a.getClass();
                if (C0186K3.a.m508i().f2456z) {
                    Object thisObject2 = chain7.getThisObject();
                    Activity activity2 = thisObject2 instanceof Activity ? (Activity) thisObject2 : null;
                    if (activity2 != null) {
                        try {
                            activity2.finish();
                            C0413Wf c0413Wf2 = C0413Wf.f1577a;
                        } catch (Throwable th2) {
                            C0920xd.m2206a(th2);
                        }
                    }
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"WXMaskPlugin: blocked scan login dialog"}, 1));
                    break;
                }
                return objProceed;
        }
    }
}
