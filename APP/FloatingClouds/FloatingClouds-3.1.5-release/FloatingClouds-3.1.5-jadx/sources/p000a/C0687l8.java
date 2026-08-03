package p000a;

import android.app.Activity;
import android.content.Intent;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import p000a.C0582fh;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.l8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0687l8 implements InterfaceC0064D7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2551a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [a.A8.handleHook(a.J8):void, a.J8.c(a.J8, java.lang.Class[], a.D7):io.github.libxposed.api.XposedInterface$HookHandle, a.l8.f(java.lang.Object):java.lang.Object, a.m8.handleHook(a.J8):void, a.s8.handleHook(a.J8):void, a.u8.handleHook(a.J8):void, a.w8.handleHook(a.J8):void, a.z8.handleHook(a.J8):void] */
    public /* synthetic */ C0687l8(int i) {
        this.f2551a = i;
    }

    @Override // p000a.InterfaceC0064D7
    /* JADX INFO: renamed from: f */
    public final Object mo53f(Object obj) throws IllegalAccessException {
        Intent intent;
        String stringExtra;
        Object objM12a;
        Object obj2;
        int iM2180a;
        Method method;
        int iM2181b;
        int iM2181b2;
        boolean z = false;
        z = false;
        z = false;
        boolean z2 = false;
        z = false;
        boolean z3 = false;
        z = false;
        boolean z4 = false;
        int i = 0;
        z = false;
        boolean z5 = false;
        z = false;
        boolean z6 = false;
        z = false;
        boolean z7 = false;
        z = false;
        z = false;
        switch (this.f2551a) {
            case 0:
                Method method2 = (Method) obj;
                C0631i9.m1482e(method2, "m");
                if (C0631i9.m1478a(method2.getName(), "Q") && method2.getParameterTypes().length == 1 && C0631i9.m1478a(method2.getParameterTypes()[0], String.class)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                Method method3 = (Method) obj;
                C0631i9.m1482e(method3, "m");
                if (C0631i9.m1478a(method3.getName(), "S") && method3.getParameterTypes().length == 1) {
                    z7 = true;
                }
                return Boolean.valueOf(z7);
            case 2:
                Method method4 = (Method) obj;
                C0631i9.m1482e(method4, "m");
                if (C0631i9.m1478a(method4.getName(), "setAdapter") && method4.getParameterTypes().length == 1) {
                    z6 = true;
                }
                return Boolean.valueOf(z6);
            case 3:
                XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain, "chain");
                if (!C0820s8.m1920b()) {
                    return chain.proceed();
                }
                chain.proceed();
                Object thisObject = chain.getThisObject();
                Activity activity = thisObject instanceof Activity ? (Activity) thisObject : null;
                if (activity == null || (intent = activity.getIntent()) == null || (stringExtra = intent.getStringExtra("Contact_User")) == null) {
                    return null;
                }
                ExecutorService executorService = C0582fh.f2149G;
                if (!C0582fh.a.m1423a(stringExtra) || (objM12a = C0002A1.m12a(activity, "getPreferenceScreen", new Object[0])) == null) {
                    return null;
                }
                Boolean bool = Boolean.TRUE;
                if (C0002A1.m12a(objM12a, "m", "contact_profile_sns", bool) != null) {
                    return null;
                }
                C0002A1.m12a(objM12a, "l", "contact_profile_sns", bool);
                return null;
            case 4:
                XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain2, "chain");
                chain2.proceed();
                Object thisObject2 = chain2.getThisObject();
                C0631i9.m1481d(thisObject2, "getThisObject(...)");
                C0820s8.m1919a(thisObject2);
                return null;
            case 5:
                XposedInterface.Chain chain3 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain3, "chain");
                chain3.proceed();
                Object thisObject3 = chain3.getThisObject();
                C0631i9.m1481d(thisObject3, "getThisObject(...)");
                C0820s8.m1919a(thisObject3);
                return null;
            case 6:
                Method method5 = (Method) obj;
                C0631i9.m1482e(method5, "m");
                if (C0631i9.m1478a(method5.getName(), "setAdapter") && method5.getParameterTypes().length == 1) {
                    z5 = true;
                }
                return Boolean.valueOf(z5);
            case 7:
                XposedInterface.Chain chain4 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain4, "chain");
                chain4.proceed();
                if (C0896w8.m2182c()) {
                    HashSet hashSetM2184e = C0896w8.m2184e();
                    Object thisObject4 = chain4.getThisObject();
                    C0631i9.m1481d(thisObject4, "getThisObject(...)");
                    Class<?> superclass = thisObject4.getClass();
                    while (true) {
                        if (superclass != null) {
                            C0112G1 c0112g1M2122I = C0889w1.m2122I(superclass.getDeclaredFields());
                            while (c0112g1M2122I.hasNext()) {
                                Field field = (Field) c0112g1M2122I.next();
                                if (field.getType().getName().endsWith("CommentListAdapter")) {
                                    field.setAccessible(true);
                                    obj2 = field.get(thisObject4);
                                }
                            }
                            superclass = superclass.getSuperclass();
                        } else {
                            obj2 = null;
                        }
                    }
                    if (obj2 != null && (iM2180a = C0896w8.m2180a(obj2, hashSetM2184e)) > 0) {
                        C0908x1.m2194b(Arrays.copyOf(new Object[]{C0944z.m2225e("[HideSnsInteraction] initView filter ", iM2180a)}, 1));
                        try {
                            Method[] methods = obj2.getClass().getMethods();
                            C0631i9.m1481d(methods, "getMethods(...)");
                            int length = methods.length;
                            while (true) {
                                if (i < length) {
                                    method = methods[i];
                                    if (C0631i9.m1478a(method.getName(), "notifyDataSetChanged")) {
                                        Class<?>[] parameterTypes = method.getParameterTypes();
                                        C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                                        if (parameterTypes.length == 0) {
                                        }
                                    }
                                    i++;
                                } else {
                                    method = null;
                                }
                            }
                            if (method != null) {
                                method.setAccessible(true);
                            }
                            if (method != null) {
                                method.invoke(obj2, null);
                            }
                        } catch (Throwable th) {
                            C0920xd.m2206a(th);
                        }
                    }
                    break;
                }
                return null;
            case 8:
                Method method6 = (Method) obj;
                C0631i9.m1482e(method6, "m");
                if (C0631i9.m1478a(method6.getName(), "getCommentList")) {
                    Class<?>[] parameterTypes2 = method6.getParameterTypes();
                    C0631i9.m1481d(parameterTypes2, "getParameterTypes(...)");
                    if (parameterTypes2.length == 0) {
                        z4 = true;
                    }
                }
                return Boolean.valueOf(z4);
            case 9:
                XposedInterface.Chain chain5 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain5, "chain");
                Object objProceed = chain5.proceed();
                if (C0896w8.m2182c() && C0198Kf.m549b(objProceed) && (iM2181b = C0896w8.m2181b((List) objProceed, C0896w8.m2184e())) > 0) {
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{C0944z.m2225e("[HideSnsInteraction] timeline comment filter ", iM2181b)}, 1));
                }
                return objProceed;
            case 10:
                Method method7 = (Method) obj;
                C0631i9.m1482e(method7, "m");
                if (C0631i9.m1478a(method7.getName(), "P0")) {
                    Class<?>[] parameterTypes3 = method7.getParameterTypes();
                    C0631i9.m1481d(parameterTypes3, "getParameterTypes(...)");
                    if (parameterTypes3.length == 0) {
                        z3 = true;
                    }
                }
                return Boolean.valueOf(z3);
            case 11:
                XposedInterface.Chain chain6 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain6, "chain");
                Object objProceed2 = chain6.proceed();
                if (C0896w8.m2182c() && objProceed2 != null) {
                    for (Class<?> superclass2 = objProceed2.getClass(); superclass2 != null && !superclass2.equals(Object.class); superclass2 = superclass2.getSuperclass()) {
                        C0112G1 c0112g1M2122I2 = C0889w1.m2122I(superclass2.getDeclaredFields());
                        while (c0112g1M2122I2.hasNext()) {
                            Field field2 = (Field) c0112g1M2122I2.next();
                            if (List.class.isAssignableFrom(field2.getType())) {
                                try {
                                    field2.setAccessible(true);
                                    Object obj3 = field2.get(objProceed2);
                                    List list = C0198Kf.m549b(obj3) ? (List) obj3 : null;
                                    if (list != null) {
                                        int iM2181b3 = C0896w8.m2181b(list, C0896w8.m2184e());
                                        if (iM2181b3 > 0) {
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"[HideSnsInteraction] timeline like filter " + iM2181b3}, 1));
                                        }
                                        C0413Wf c0413Wf = C0413Wf.f1577a;
                                    }
                                } catch (Throwable th2) {
                                    C0920xd.m2206a(th2);
                                }
                            }
                        }
                    }
                }
                return objProceed2;
            case 12:
                Method method8 = (Method) obj;
                C0631i9.m1482e(method8, "m");
                if (method8.getParameterTypes().length == 2 && List.class.isAssignableFrom(method8.getParameterTypes()[0]) && (C0631i9.m1478a(method8.getParameterTypes()[1], Boolean.TYPE) || C0631i9.m1478a(method8.getParameterTypes()[1], Boolean.class))) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 13:
                XposedInterface.Chain chain7 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain7, "chain");
                if (C0896w8.m2182c()) {
                    List args = chain7.getArgs();
                    C0631i9.m1481d(args, "getArgs(...)");
                    Object objM1951o0 = C0834t3.m1951o0(args, 0);
                    List list2 = C0198Kf.m549b(objM1951o0) ? (List) objM1951o0 : null;
                    if (list2 != null && (iM2181b2 = C0896w8.m2181b(list2, C0896w8.m2184e())) > 0) {
                        C0908x1.m2194b(Arrays.copyOf(new Object[]{C0944z.m2225e("[HideSnsInteraction] b8 filter ", iM2181b2)}, 1));
                    }
                }
                return chain7.proceed();
            case 14:
                return ((Class) obj).getName();
            case 15:
                Method method9 = (Method) obj;
                C0631i9.m1482e(method9, "it");
                String name = method9.getName();
                Class<?>[] parameterTypes4 = method9.getParameterTypes();
                C0631i9.m1481d(parameterTypes4, "getParameterTypes(...)");
                return name + "(" + C0238N1.m631e0(parameterTypes4, null, new C0687l8(17), 31) + ")";
            case 16:
                Field field3 = (Field) obj;
                C0631i9.m1482e(field3, "it");
                String name2 = field3.getName();
                C0631i9.m1481d(name2, "getName(...)");
                return name2;
            case 17:
                return ((Class) obj).getName();
            case 18:
                Class cls = (Class) obj;
                return cls != null ? cls.getSimpleName() : "?";
            case 19:
                XposedInterface.Chain chain8 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain8, "chain");
                return C0316R8.m867j(chain8);
            case 20:
                XposedInterface.Chain chain9 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain9, "chain");
                return C0316R8.m866h(chain9);
            case 21:
                XposedInterface.Chain chain10 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain10, "chain");
                return C0316R8.m865g(chain10);
            case 22:
                XposedInterface.Chain chain11 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain11, "chain");
                return C0316R8.m866h(chain11);
            case 23:
                XposedInterface.Chain chain12 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain12, "chain");
                return C0316R8.m866h(chain12);
            case 24:
                XposedInterface.Chain chain13 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain13, "chain");
                List args2 = chain13.getArgs();
                C0631i9.m1481d(args2, "getArgs(...)");
                Object objM1951o02 = C0834t3.m1951o0(args2, 2);
                Intent intent2 = objM1951o02 instanceof Intent ? (Intent) objM1951o02 : null;
                if (intent2 == null || !C0316R8.m875t(intent2)) {
                    return chain13.proceed();
                }
                C0316R8.m873r("intercept IActivityManager.startActivity intent=" + intent2.getComponent());
                return 0;
            case 25:
                XposedInterface.Chain chain14 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain14, "chain");
                List args3 = chain14.getArgs();
                C0631i9.m1481d(args3, "getArgs(...)");
                Object objM1951o03 = C0834t3.m1951o0(args3, 1);
                Intent intent3 = objM1951o03 instanceof Intent ? (Intent) objM1951o03 : null;
                if (intent3 == null || !C0316R8.m875t(intent3)) {
                    return chain14.proceed();
                }
                C0316R8.m873r("intercept IActivityManager.startService intent=" + intent3.getComponent());
                return null;
            case 26:
                XposedInterface.Chain chain15 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain15, "chain");
                List args4 = chain15.getArgs();
                C0631i9.m1481d(args4, "getArgs(...)");
                Object objM1951o04 = C0834t3.m1951o0(args4, 2);
                Intent intent4 = objM1951o04 instanceof Intent ? (Intent) objM1951o04 : null;
                if (intent4 == null || !C0316R8.m875t(intent4)) {
                    return chain15.proceed();
                }
                C0316R8.m873r("intercept IActivityManager.bindService intent=" + intent4.getComponent());
                return 0;
            case 27:
                XposedInterface.Chain chain16 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain16, "chain");
                List args5 = chain16.getArgs();
                C0631i9.m1481d(args5, "getArgs(...)");
                Object objM1951o05 = C0834t3.m1951o0(args5, 4);
                Intent intent5 = objM1951o05 instanceof Intent ? (Intent) objM1951o05 : null;
                if (intent5 == null || !C0316R8.m875t(intent5)) {
                    return chain16.proceed();
                }
                C0316R8.m873r("intercept Instrumentation.execStartActivity intent=" + intent5.getComponent());
                return null;
            case 28:
                XposedInterface.Chain chain17 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain17, "chain");
                return C0316R8.m864f(chain17);
            default:
                XposedInterface.Chain chain18 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain18, "chain");
                return C0316R8.m864f(chain18);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [a.R8.handleHook(a.J8):void, a.s8.handleHook(a.J8):void, a.w8.handleHook(a.J8):void] */
    public /* synthetic */ C0687l8(IPlugin iPlugin, int i) {
        this.f2551a = i;
    }
}
