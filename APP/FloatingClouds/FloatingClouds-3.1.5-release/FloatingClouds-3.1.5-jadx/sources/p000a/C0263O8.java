package p000a;

import android.R;
import android.app.Activity;
import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import io.github.libxposed.api.XposedInterface;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
import p000a.C0475a5;
import p000a.C0518ca;
import p000a.C0582fh;
import p000a.C0597gd;
import p000a.C0913x6;

/* JADX INFO: renamed from: a.O8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0263O8 implements InterfaceC0064D7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f946a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [a.A3.a():java.lang.Object, a.Rb.h(java.lang.ClassLoader):java.lang.Class, a.Rb.k(java.lang.ClassLoader):java.lang.Class, a.T9.handleHook(a.J8):void, a.hd.a(java.lang.String, a.fd):a.gd] */
    public /* synthetic */ C0263O8(int i) {
        this.f946a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x092e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0267  */
    /* JADX WARN: Type inference failed for: r0v122, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v176, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v189, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v91, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v95, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p000a.InterfaceC0064D7
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo53f(Object obj) {
        String str;
        Object next;
        String strM1250a;
        Set<String> setKeySet;
        ViewGroup viewGroup;
        String string;
        String str2;
        String str3;
        boolean z;
        boolean z2;
        int i;
        String name;
        Iterable iterableM2159r;
        Class clsM135g;
        Class clsM135g2;
        long j;
        Serializable serializable;
        C0475a5.d dVar;
        Class cls;
        Serializable serializable2;
        String name2;
        Serializable serializable3;
        String str4;
        Serializable serializable4;
        String str5;
        Serializable serializable5;
        String name3;
        Serializable serializable6;
        String str6;
        Class cls2 = Void.TYPE;
        Class cls3 = Boolean.TYPE;
        EnumC0521cd enumC0521cd = EnumC0521cd.f1908a;
        EnumC0521cd enumC0521cd2 = EnumC0521cd.f1910c;
        switch (this.f946a) {
            case 0:
                XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain, "chain");
                return C0316R8.m864f(chain);
            case 1:
                Method method = (Method) obj;
                C0631i9.m1482e(method, "m");
                String name4 = method.getName();
                return Boolean.valueOf((C0631i9.m1478a(name4, "a") || C0631i9.m1478a(name4, "b")) && method.getParameterTypes().length >= 1);
            case 2:
                XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain2, "chain");
                List args = chain2.getArgs();
                C0631i9.m1481d(args, "getArgs(...)");
                Object objM1951o0 = C0834t3.m1951o0(args, 2);
                Intent intent = objM1951o0 instanceof Intent ? (Intent) objM1951o0 : null;
                if (intent == null || !C0316R8.m875t(intent)) {
                    return chain2.proceed();
                }
                C0316R8.m873r("intercept IActivityTaskManager.startActivity intent=" + intent.getComponent());
                return 0;
            case 3:
                XposedInterface.Chain chain3 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain3, "chain");
                return C0316R8.m865g(chain3);
            case 4:
                XposedInterface.Chain chain4 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain4, "chain");
                return C0316R8.m865g(chain4);
            case 5:
                XposedInterface.Chain chain5 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain5, "chain");
                return C0316R8.m865g(chain5);
            case 6:
                XposedInterface.Chain chain6 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain6, "chain");
                return C0316R8.m865g(chain6);
            case 7:
                XposedInterface.Chain chain7 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain7, "chain");
                List args2 = chain7.getArgs();
                C0631i9.m1481d(args2, "getArgs(...)");
                Object objM1951o02 = C0834t3.m1951o0(args2, 1);
                final Bundle bundle = objM1951o02 instanceof Bundle ? (Bundle) objM1951o02 : null;
                if (bundle == null || (setKeySet = bundle.keySet()) == null) {
                    str = "null";
                } else {
                    final int i2 = 0;
                    String strM1952p0 = C0834t3.m1952p0(setKeySet, ", ", new InterfaceC0064D7() { // from class: a.Q8
                        @Override // p000a.InterfaceC0064D7
                        /* JADX INFO: renamed from: f */
                        public final Object mo53f(Object obj2) {
                            String str7 = (String) obj2;
                            switch (i2) {
                                case 0:
                                    return str7 + "=" + bundle.get(str7);
                                default:
                                    Object obj3 = bundle.get(str7);
                                    if (obj3 instanceof String) {
                                        return (String) obj3;
                                    }
                                    if (obj3 instanceof CharSequence) {
                                        return obj3.toString();
                                    }
                                    return null;
                            }
                        }
                    }, 30);
                    if (strM1952p0 != null) {
                        str = strM1952p0;
                    }
                }
                C0316R8.m873r("TelecomManager.addNewIncomingCall extras={" + str + "}");
                if (bundle == null) {
                    strM1250a = null;
                } else {
                    Set<String> setKeySet2 = bundle.keySet();
                    C0631i9.m1481d(setKeySet2, "keySet(...)");
                    final int i3 = 1;
                    C0913x6.a aVar = new C0913x6.a(new C0913x6(new C0035Bf(new C0220M1(1, setKeySet2), new InterfaceC0064D7() { // from class: a.Q8
                        @Override // p000a.InterfaceC0064D7
                        /* JADX INFO: renamed from: f */
                        public final Object mo53f(Object obj2) {
                            String str7 = (String) obj2;
                            switch (i3) {
                                case 0:
                                    return str7 + "=" + bundle.get(str7);
                                default:
                                    Object obj3 = bundle.get(str7);
                                    if (obj3 instanceof String) {
                                        return (String) obj3;
                                    }
                                    if (obj3 instanceof CharSequence) {
                                        return obj3.toString();
                                    }
                                    return null;
                            }
                        }
                    }), new C0673kd(21)));
                    while (true) {
                        if (aVar.hasNext()) {
                            next = aVar.next();
                            if (C0943yh.m2221a((String) next)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    strM1250a = (String) next;
                }
                if (strM1250a == null) {
                    strM1250a = C0506bh.m1250a();
                    if (strM1250a != null) {
                        ExecutorService executorService = C0582fh.f2149G;
                        if (!C0582fh.a.m1423a(strM1250a)) {
                            strM1250a = null;
                        }
                    }
                }
                if (strM1250a != null) {
                    ExecutorService executorService2 = C0582fh.f2149G;
                    if (C0582fh.a.m1423a(strM1250a)) {
                        C0316R8.m873r("intercept TelecomManager.addNewIncomingCall for blacklisted user=".concat(strM1250a));
                        C0506bh.m1256g(strM1250a);
                        return null;
                    }
                }
                return chain7.proceed();
            case 8:
                XposedInterface.Chain chain8 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain8, "chain");
                List args3 = chain8.getArgs();
                C0631i9.m1481d(args3, "getArgs(...)");
                Object objM1951o03 = C0834t3.m1951o0(args3, 1);
                Notification notification = objM1951o03 instanceof Notification ? (Notification) objM1951o03 : null;
                if (notification == null || !C0506bh.m1251b() || !C0316R8.m872q(notification)) {
                    return chain8.proceed();
                }
                C0316R8.m873r("intercept Service.startForeground");
                return null;
            case 9:
                XposedInterface.Chain chain9 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain9, "chain");
                return C0316R8.m865g(chain9);
            case 10:
                XposedInterface.Chain chain10 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain10, "chain");
                return C0316R8.m865g(chain10);
            case 11:
                XposedInterface.Chain chain11 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain11, "chain");
                return C0316R8.m866h(chain11);
            case 12:
                XposedInterface.Chain chain12 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain12, "chain");
                return C0316R8.m866h(chain12);
            case 13:
                Method method2 = (Method) obj;
                C0631i9.m1482e(method2, "m");
                return Boolean.valueOf(C0631i9.m1478a(method2.getName(), "setOnItemLongClickListener") && method2.getParameterTypes().length == 1);
            case 14:
                ((Boolean) obj).booleanValue();
                return C0413Wf.f1577a;
            case 15:
                XposedInterface.Chain chain13 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain13, "chain");
                Log.e("FC_DEBUG", "MaskUIManager: SettingsCareModeIntro.initView FIRED!");
                Object objProceed = chain13.proceed();
                Object thisObject = chain13.getThisObject();
                Activity activity = thisObject instanceof Activity ? (Activity) thisObject : null;
                if (activity != null && (viewGroup = (ViewGroup) activity.findViewById(R.id.content)) != null) {
                    C0320Rc c0320Rc = new C0320Rc();
                    C0841ta.m1963a(viewGroup, new C0387V7(c0320Rc, activity, 1));
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{C0944z.m2223c(c0320Rc.f1153a, "MaskUIManager: ", " long-click views")}, 1));
                }
                return objProceed;
            case 16:
                XposedInterface.Chain chain14 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain14, "chain");
                Object objProceed2 = chain14.proceed();
                try {
                    List args4 = chain14.getArgs();
                    C0631i9.m1481d(args4, "getArgs(...)");
                    Object objM1950n0 = C0834t3.m1950n0(args4);
                    if (objM1950n0 != null) {
                        Object objM19h = C0002A1.m19h(objM1950n0, "field_talker");
                        String str7 = objM19h instanceof String ? (String) objM19h : null;
                        if (str7 != null && !C0034Be.m101P(str7)) {
                            ExecutorService executorService3 = C0582fh.f2149G;
                            if (C0582fh.a.m1423a(str7)) {
                                Object objM19h2 = C0002A1.m19h(objM1950n0, "field_isSend");
                                boolean zBooleanValue = objM19h2 instanceof Boolean ? ((Boolean) objM19h2).booleanValue() : (objM19h2 instanceof Number) && ((Number) objM19h2).intValue() != 0;
                                CopyOnWriteArrayList<C0518ca.d> copyOnWriteArrayList = C0518ca.f1891a;
                                C0518ca.m1279a(new C0518ca.a.b(str7, zBooleanValue));
                                break;
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
                return objProceed2;
            case 17:
                XposedInterface.Chain chain15 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain15, "chain");
                List args5 = chain15.getArgs();
                C0631i9.m1481d(args5, "getArgs(...)");
                Object objM1951o04 = C0834t3.m1951o0(args5, 0);
                String str8 = objM1951o04 instanceof String ? (String) objM1951o04 : null;
                if (str8 != null) {
                    ExecutorService executorService4 = C0582fh.f2149G;
                    if (C0582fh.a.m1423a(str8)) {
                        C0915x8 c0915x8 = C0915x8.f3530a;
                        if (!C0915x8.m2203a()) {
                            C0908x1.m2194b(Arrays.copyOf(new Object[]{C0944z.m2227g("[MuteNotifPart] SUPPRESS notification for masked user=", str8, " (m0.b)")}, 1));
                            return Boolean.FALSE;
                        }
                    }
                }
                return chain15.proceed();
            case 18:
                XposedInterface.Chain chain16 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain16, "chain");
                List args6 = chain16.getArgs();
                C0631i9.m1481d(args6, "getArgs(...)");
                Object objM1951o05 = C0834t3.m1951o0(args6, 0);
                if (objM1951o05 == null) {
                    return chain16.proceed();
                }
                Iterator it = C0739o3.m1757d0("h", "f74979h", "userName", "talker").iterator();
                while (true) {
                    if (it.hasNext()) {
                        try {
                            Field declaredField = objM1951o05.getClass().getDeclaredField((String) it.next());
                            declaredField.setAccessible(true);
                            Object obj2 = declaredField.get(objM1951o05);
                            str3 = obj2 instanceof String ? (String) obj2 : null;
                        } catch (NoSuchFieldException unused2) {
                        }
                        if (str3 != null && !C0034Be.m101P(str3)) {
                            str2 = str3;
                        }
                    } else {
                        try {
                            string = objM1951o05.toString();
                        } catch (Throwable unused3) {
                        }
                        if (C0034Be.m94I(string, "userName:", false)) {
                            C0631i9.m1482e(string, "<this>");
                            C0631i9.m1482e(string, "missingDelimiterValue");
                            int iM99N = C0034Be.m99N(string, "userName:", 0, false, 6);
                            if (iM99N != -1) {
                                string = string.substring("userName:".length() + iM99N, string.length());
                                C0631i9.m1481d(string, "substring(...)");
                            }
                            String string2 = C0034Be.m107V(string).toString();
                            str2 = !C0034Be.m101P(string2) ? string2 : null;
                        }
                    }
                }
                if (str2 != null) {
                    ExecutorService executorService5 = C0582fh.f2149G;
                    if (C0582fh.a.m1423a(str2)) {
                        C0915x8 c0915x82 = C0915x8.f3530a;
                        if (!C0915x8.m2203a()) {
                            C0908x1.m2194b(Arrays.copyOf(new Object[]{C0944z.m2227g("[MuteNotifPart] SUPPRESS notification for masked user=", str2, " (a.a fallback)")}, 1));
                            return -1;
                        }
                    }
                }
                return chain16.proceed();
            case 19:
                Method method3 = (Method) obj;
                C0631i9.m1482e(method3, "m");
                return Boolean.valueOf((C0631i9.m1478a(method3.getName(), "x") || C0631i9.m1478a(method3.getName(), "p")) && method3.getParameterTypes().length == 1 && C0631i9.m1478a(method3.getParameterTypes()[0], String.class) && !method3.getReturnType().isPrimitive() && !C0631i9.m1478a(method3.getReturnType(), cls2));
            case 20:
                Class cls4 = (Class) obj;
                C0631i9.m1482e(cls4, "cls");
                Method[] declaredMethods = cls4.getDeclaredMethods();
                C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
                int length = declaredMethods.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        Method method4 = declaredMethods[i4];
                        if (C0631i9.m1478a(method4.getReturnType(), cls2) && method4.getParameterTypes().length == 4 && C0631i9.m1478a(method4.getParameterTypes()[0], String.class) && C0631i9.m1478a(method4.getParameterTypes()[1], cls3) && C0631i9.m1478a(method4.getParameterTypes()[2], cls3) && C0631i9.m1478a(method4.getParameterTypes()[3], Long.TYPE)) {
                            z = true;
                        } else {
                            i4++;
                        }
                    } else {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 21:
                Class cls5 = (Class) obj;
                C0631i9.m1482e(cls5, "cls");
                Method[] declaredMethods2 = cls5.getDeclaredMethods();
                C0631i9.m1481d(declaredMethods2, "getDeclaredMethods(...)");
                int length2 = declaredMethods2.length;
                int i5 = 0;
                while (true) {
                    if (i5 < length2) {
                        Method method5 = declaredMethods2[i5];
                        if (C0631i9.m1478a(method5.getName(), "a") && C0631i9.m1478a(method5.getReturnType(), cls3)) {
                            i = 1;
                            if (method5.getParameterTypes().length == 1) {
                                z2 = true;
                            }
                        } else {
                            i = 1;
                        }
                        i5 += i;
                    } else {
                        z2 = false;
                    }
                }
                return Boolean.valueOf(z2);
            case 22:
                C0597gd c0597gd = (C0597gd) obj;
                if (c0597gd == null) {
                    return "NA";
                }
                Class<?> cls6 = c0597gd.f2209b;
                if (cls6 != null) {
                    name = cls6.getName();
                } else {
                    Method method6 = c0597gd.f2213f;
                    if (method6 != null) {
                        String str9 = method6.getDeclaringClass().getName() + "#" + method6.getName();
                        name = str9 == null ? "null" : str9;
                    }
                }
                return (c0597gd.f2208a ? "ok" : "fail") + ":" + name + "|" + c0597gd.f2211d;
            case 23:
                C0578fd c0578fd = (C0578fd) obj;
                C0631i9.m1482e(c0578fd, "ctx");
                return C0002A1.m13b(c0578fd.f2146b, "com.tencent.mm.storage.f9");
            case 24:
                C0578fd c0578fd2 = (C0578fd) obj;
                C0631i9.m1482e(c0578fd2, "ctx");
                return C0002A1.m13b(c0578fd2.f2146b, "com.tencent.mm.booter.notification.m0");
            case 25:
                C0578fd c0578fd3 = (C0578fd) obj;
                C0631i9.m1482e(c0578fd3, "ctx");
                C0052Cd.f184a.getClass();
                C0475a5.e eVarM1156e = C0475a5.m1156e();
                EnumC0521cd enumC0521cd3 = EnumC0521cd.f1909b;
                if (eVarM1156e == null) {
                    return new C0597gd(false, null, new C0647j6("MSG_STORAGE_CACHE_EMPTY", "F017_msg_storage", "DexKitCache.getMsgStorageInfo() returned null (scan not completed)", "", System.currentTimeMillis()), enumC0521cd3, EnumC0540dd.f1946c, null, null);
                }
                String str10 = eVarM1156e.f1768a;
                ClassLoader classLoader = c0578fd3.f2146b;
                Class clsM135g3 = C0052Cd.m135g(classLoader, str10);
                if (clsM135g3 == null) {
                    return new C0597gd(false, null, new C0647j6("CLASS_LOAD_FAILED", "F017_msg_storage", C0944z.m2227g("forName(", str10, ") failed"), "", System.currentTimeMillis()), enumC0521cd3, EnumC0540dd.f1947d, null, null);
                }
                String str11 = eVarM1156e.f1770c;
                Class clsM135g4 = C0052Cd.m135g(classLoader, str11);
                StringBuilder sb = new StringBuilder("MSG_STORAGE_RESOLVED storage=");
                sb.append(str10);
                sb.append(" method=");
                String str12 = eVarM1156e.f1769b;
                sb.append(str12);
                sb.append(" msgInfo=");
                sb.append(str11);
                C0908x1.m2194b("RuleSystem", sb.toString());
                C0631i9.m1480c(clsM135g4, "null cannot be cast to non-null type kotlin.Any");
                return C0597gd.a.m1428a(clsM135g3, enumC0521cd2, null, C0499ba.m1229E(new C0710mc("msgInfoClass", clsM135g4), new C0710mc("insertMethod", str12)), 12);
            case 26:
                C0578fd c0578fd4 = (C0578fd) obj;
                C0631i9.m1482e(c0578fd4, "ctx");
                C0052Cd.f184a.getClass();
                ?? r0 = C0475a5.f1753a;
                String str13 = r0 != 0 ? (String) r0.get("rule_class_".concat("notification_precheck")) : null;
                ClassLoader classLoader2 = c0578fd4.f2146b;
                if (str13 != null && (clsM135g2 = C0052Cd.m135g(classLoader2, str13)) != null) {
                    return C0597gd.a.m1428a(clsM135g2, enumC0521cd2, null, null, 28);
                }
                if (C0889w1.m2121H()) {
                    try {
                        iterableM2159r = C0889w1.m2159r("preTalkerMute", null);
                    } catch (Exception unused4) {
                        iterableM2159r = C0439Y5.f1645a;
                    }
                    Iterator it2 = iterableM2159r.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            String str14 = (String) it2.next();
                            C0052Cd.f184a.getClass();
                            clsM135g = C0052Cd.m135g(classLoader2, str14);
                            if (clsM135g != null) {
                            }
                        } else {
                            clsM135g = null;
                        }
                    }
                    if (clsM135g != null) {
                        C0475a5.m1159h("notification_precheck", clsM135g.getName());
                        C0908x1.m2194b("RuleSystem", C0944z.m2227g("NOTIFICATION_PRECHECK_RESOLVED cls=", clsM135g.getName(), " via=DkBridge(string)"));
                        return C0597gd.a.m1428a(clsM135g, enumC0521cd, null, null, 28);
                    }
                    break;
                }
                Class clsM135g5 = C0052Cd.m135g(classLoader2, "com.tencent.mm.booter.notification.m0");
                EnumC0521cd enumC0521cd4 = EnumC0521cd.f1909b;
                if (clsM135g5 == null) {
                    return new C0597gd(false, null, new C0647j6("NOTIFICATION_PRECHECK_NOT_FOUND", "notification_precheck", "no notification precheck class found", "", System.currentTimeMillis()), enumC0521cd4, EnumC0540dd.f1946c, null, null);
                }
                C0908x1.m2194b("RuleSystem", C0944z.m2227g("NOTIFICATION_PRECHECK_RESOLVED cls=", clsM135g5.getName(), " via=LITERAL_FALLBACK"));
                return C0597gd.a.m1428a(clsM135g5, enumC0521cd4, null, null, 28);
            case 27:
                C0578fd c0578fd5 = (C0578fd) obj;
                C0631i9.m1482e(c0578fd5, "ctx");
                return C0002A1.m13b(c0578fd5.f2146b, "fh5.w0");
            case 28:
                C0578fd c0578fd6 = (C0578fd) obj;
                C0631i9.m1482e(c0578fd6, "ctx");
                C0052Cd.f184a.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                ClassLoader classLoader3 = c0578fd6.f2146b;
                Class clsM135g6 = C0052Cd.m135g(classLoader3, "fh5.w0");
                Class clsM135g7 = C0052Cd.m135g(classLoader3, "fh5.w");
                Class clsM135g8 = C0052Cd.m135g(classLoader3, "fh5.a");
                C0475a5.d dVarM1153b = C0475a5.m1153b();
                if (dVarM1153b != null) {
                    ?? r1 = dVarM1153b.f1762a;
                    if (r1.isEmpty()) {
                        j = jCurrentTimeMillis;
                        serializable = "";
                    } else {
                        ?? r02 = dVarM1153b.f1763b;
                        C0144Hf c0144HfM137j = C0052Cd.m137j(classLoader3, r1, r02, clsM135g6, clsM135g7, clsM135g8);
                        j = jCurrentTimeMillis;
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
                        Serializable serializable7 = c0144HfM137j.f500a;
                        Class cls7 = (Class) serializable7;
                        if (cls7 != null) {
                            String name5 = cls7.getName();
                            serializable4 = serializable7;
                            str5 = name5;
                        } else {
                            serializable4 = serializable7;
                            str5 = "null";
                        }
                        serializable = "";
                        Serializable serializable8 = c0144HfM137j.f501b;
                        Class cls8 = (Class) serializable8;
                        if (cls8 != null) {
                            serializable5 = serializable8;
                            name3 = cls8.getName();
                        } else {
                            serializable5 = serializable8;
                            name3 = "null";
                        }
                        Serializable serializable9 = c0144HfM137j.f502c;
                        Class cls9 = (Class) serializable9;
                        if (cls9 != null) {
                            String name6 = cls9.getName();
                            serializable6 = serializable9;
                            str6 = name6;
                        } else {
                            serializable6 = serializable9;
                            str6 = "null";
                        }
                        StringBuilder sbM2229i = C0944z.m2229i("CONV_LIST_RESOLVER_REPORT feature=conv_list_classes path=DEXKIT_RULE fallback=false adapter=", str5, " datasource=", name3, " snapshot=");
                        sbM2229i.append(str6);
                        sbM2229i.append(" time=");
                        sbM2229i.append(jCurrentTimeMillis2);
                        sbM2229i.append("ms");
                        C0908x1.m2194b("RuleSystem", sbM2229i.toString());
                        if (serializable4 != null) {
                            Class cls10 = (Class) serializable4;
                            return C0597gd.a.m1428a(cls10, enumC0521cd, null, C0499ba.m1229E(new C0710mc("dataSourceClass", serializable5 == null ? serializable : serializable5), new C0710mc("snapshotClass", serializable6 == null ? serializable : serializable6), new C0710mc("adapterNames", C0834t3.m1959w0(new LinkedHashSet(C0834t3.m1953q0(C0834t3.m1953q0((List) r1, (List) r02), C0238N1.m629c0(new String[]{cls10.getName(), cls8 != null ? cls8.getName() : null})))))), 12);
                        }
                    }
                }
                JSONObject jSONObjectM1155d = C0475a5.m1155d("conv_adapter_structural_v1");
                if (jSONObjectM1155d == null) {
                    dVar = null;
                } else {
                    try {
                        List listM1158g = C0475a5.m1158g("adapterClassNames", jSONObjectM1155d);
                        List listM1158g2 = C0475a5.m1158g("dataSourceClassNames", jSONObjectM1155d);
                        C0439Y5 c0439y5 = C0439Y5.f1645a;
                        dVar = new C0475a5.d(listM1158g, listM1158g2, c0439y5, c0439y5, c0439y5, c0439y5);
                    } catch (Throwable th) {
                        C0908x1.m2197e("DexKitCache: parse ConvAdapterStructural failed", th);
                        dVar = null;
                    }
                }
                if (dVar != null) {
                    ?? r12 = dVar.f1762a;
                    if (r12.isEmpty()) {
                        cls = clsM135g6;
                    } else {
                        ?? r03 = dVar.f1763b;
                        C0144Hf c0144HfM137j2 = C0052Cd.m137j(classLoader3, r12, r03, clsM135g6, clsM135g7, clsM135g8);
                        cls = clsM135g6;
                        long jCurrentTimeMillis3 = System.currentTimeMillis() - j;
                        Serializable serializable10 = c0144HfM137j2.f500a;
                        Class cls11 = (Class) serializable10;
                        String name7 = cls11 != null ? cls11.getName() : "null";
                        Serializable serializable11 = c0144HfM137j2.f501b;
                        Class cls12 = (Class) serializable11;
                        if (cls12 != null) {
                            serializable2 = serializable10;
                            name2 = cls12.getName();
                        } else {
                            serializable2 = serializable10;
                            name2 = "null";
                        }
                        Serializable serializable12 = c0144HfM137j2.f502c;
                        Class cls13 = (Class) serializable12;
                        if (cls13 != null) {
                            String name8 = cls13.getName();
                            serializable3 = serializable12;
                            str4 = name8;
                        } else {
                            serializable3 = serializable12;
                            str4 = "null";
                        }
                        StringBuilder sbM2229i2 = C0944z.m2229i("CONV_LIST_RESOLVER_REPORT feature=conv_list_classes path=DEXKIT_STRUCTURAL fallback=false adapter=", name7, " datasource=", name2, " snapshot=");
                        sbM2229i2.append(str4);
                        sbM2229i2.append(" time=");
                        sbM2229i2.append(jCurrentTimeMillis3);
                        sbM2229i2.append("ms");
                        C0908x1.m2194b("RuleSystem", sbM2229i2.toString());
                        if (serializable2 != null) {
                            Class cls14 = (Class) serializable2;
                            return C0597gd.a.m1428a(cls14, enumC0521cd2, null, C0499ba.m1229E(new C0710mc("dataSourceClass", serializable11 == null ? serializable : serializable11), new C0710mc("snapshotClass", serializable3 == null ? serializable : serializable3), new C0710mc("adapterNames", C0834t3.m1959w0(new LinkedHashSet(C0834t3.m1953q0(C0834t3.m1953q0((List) r12, (List) r03), C0238N1.m629c0(new String[]{cls14.getName(), cls12 != null ? cls12.getName() : null})))))), 12);
                        }
                    }
                }
                long jCurrentTimeMillis4 = System.currentTimeMillis() - j;
                String name9 = cls != null ? cls.getName() : "null";
                String name10 = clsM135g7 != null ? clsM135g7.getName() : "null";
                String name11 = clsM135g8 != null ? clsM135g8.getName() : "null";
                StringBuilder sbM2229i3 = C0944z.m2229i("CONV_LIST_RESOLVER_REPORT feature=conv_list_classes path=LITERAL_FALLBACK fallback=true adapter=", name9, " datasource=", name10, " snapshot=");
                sbM2229i3.append(name11);
                sbM2229i3.append(" time=");
                sbM2229i3.append(jCurrentTimeMillis4);
                sbM2229i3.append("ms");
                C0908x1.m2194b("RuleSystem", sbM2229i3.toString());
                EnumC0521cd enumC0521cd5 = EnumC0521cd.f1909b;
                if (cls != null) {
                    return C0597gd.a.m1428a(cls, enumC0521cd5, null, C0499ba.m1229E(new C0710mc("dataSourceClass", clsM135g7 == null ? serializable : clsM135g7), new C0710mc("snapshotClass", clsM135g8 == null ? serializable : clsM135g8), new C0710mc("adapterNames", C0238N1.m629c0(new String[]{cls.getName(), clsM135g7 != null ? clsM135g7.getName() : null, "bm3.m", "sc3.x", "sc3.x3", "va5.a", "lr.f1"}))), 12);
                }
                return new C0597gd(false, null, new C0647j6("CONV_LIST_NOT_FOUND", "conv_list_classes", "all resolution strategies failed", "", System.currentTimeMillis()), enumC0521cd5, EnumC0540dd.f1946c, null, null);
            default:
                C0578fd c0578fd7 = (C0578fd) obj;
                C0631i9.m1482e(c0578fd7, "ctx");
                return C0002A1.m13b(c0578fd7.f2146b, "xc4.k");
        }
    }
}
