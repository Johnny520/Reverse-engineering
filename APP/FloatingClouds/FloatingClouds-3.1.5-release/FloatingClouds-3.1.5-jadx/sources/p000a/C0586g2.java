package p000a;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import p000a.C0186K3;
import p000a.C0582fh;
import p000a.C0723n6;

/* JADX INFO: renamed from: a.g2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0586g2 implements InterfaceC0064D7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2183a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [a.h8.handleHook(a.J8):void, a.m2.intercept(io.github.libxposed.api.XposedInterface$Chain):java.lang.Object, a.n6.a(android.content.Context):void, a.o6.a(a.o6, a.s7):java.lang.Object, a.s4.handleHook(a.J8):void, a.z4.a():void] */
    public /* synthetic */ C0586g2(int i) {
        this.f2183a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:250:0x05b5  */
    @Override // p000a.InterfaceC0064D7
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo53f(Object obj) {
        boolean z;
        Method method;
        Object objM2206a;
        Object objInvoke;
        Intent intent;
        String stringExtra;
        Object objM2206a2;
        boolean z2 = false;
        switch (this.f2183a) {
            case 0:
                XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain, "chain");
                Object objProceed = chain.proceed();
                Object thisObject = chain.getThisObject();
                Activity activity = thisObject instanceof Activity ? (Activity) thisObject : null;
                if (activity != null && !activity.isFinishing()) {
                    C0186K3.f638a.getClass();
                    if (C0186K3.a.m508i().f2450t && C0186K3.a.m511l() && !C0186K3.a.m510k()) {
                        C0915x8 c0915x8 = C0915x8.f3530a;
                        if (C0915x8.m2203a()) {
                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"BlockContactInfo: blockBypass active, SKIP block (allow contact info)"}, 1));
                        } else {
                            Intent intent2 = activity.getIntent();
                            String stringExtra2 = intent2 != null ? intent2.getStringExtra("Contact_User") : null;
                            if (stringExtra2 != null && !C0034Be.m101P(stringExtra2)) {
                                ExecutorService executorService = C0582fh.f2149G;
                                if (C0582fh.a.m1423a(stringExtra2)) {
                                    C0908x1.m2194b(Arrays.copyOf(new Object[]{C0944z.m2227g("BlockContactInfo: BLOCK ContactInfoUI.onCreate for ", stringExtra2, ", finishing activity")}, 1));
                                    activity.finish();
                                }
                            }
                        }
                    }
                }
                return objProceed;
            case 1:
                XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain2, "chain");
                Object thisObject2 = chain2.getThisObject();
                Activity activity2 = thisObject2 instanceof Activity ? (Activity) thisObject2 : null;
                if (activity2 == null || activity2.isFinishing()) {
                    return chain2.proceed();
                }
                C0186K3.f638a.getClass();
                if (!C0186K3.a.m508i().f2450t || !C0186K3.a.m511l()) {
                    return chain2.proceed();
                }
                if (C0186K3.a.m510k()) {
                    return chain2.proceed();
                }
                C0915x8 c0915x82 = C0915x8.f3530a;
                if (C0915x8.m2203a()) {
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"BlockContactInfo: blockBypass active, SKIP block (allow contact info)"}, 1));
                    return chain2.proceed();
                }
                Intent intent3 = activity2.getIntent();
                String stringExtra3 = intent3 != null ? intent3.getStringExtra("Contact_User") : null;
                if (stringExtra3 == null || C0034Be.m101P(stringExtra3)) {
                    return chain2.proceed();
                }
                ExecutorService executorService2 = C0582fh.f2149G;
                if (!C0582fh.a.m1423a(stringExtra3)) {
                    return chain2.proceed();
                }
                C0908x1.m2194b(Arrays.copyOf(new Object[]{C0944z.m2227g("BlockContactInfo: BLOCK ContactInfoUI.onResume (fallback) for ", stringExtra3, ", finishing")}, 1));
                activity2.finish();
                return null;
            case 2:
                C0631i9.m1482e((String) obj, "it");
                return "?";
            case 3:
                Method method2 = (Method) obj;
                C0631i9.m1482e(method2, "m");
                if (C0631i9.m1478a(method2.getName(), "rawQueryWithFactory")) {
                    C0726n9.m1670m("rawQueryWithFactory", Integer.valueOf(method2.getParameterTypes().length));
                    z = method2.getParameterTypes().length == 4;
                }
                return Boolean.valueOf(z);
            case 4:
                return C0944z.m2227g("\"", (String) obj, "\"");
            case 5:
                XposedInterface.Chain chain3 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain3, "chain");
                return chain3.proceed();
            case 6:
                XposedInterface.Chain chain4 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain4, "chain");
                Object objProceed2 = chain4.proceed();
                C0915x8 c0915x83 = C0915x8.f3530a;
                if (C0915x8.m2203a()) {
                    C0816s4.f3218G = true;
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"[ProfileWhitelist] 临时解除期间打开资料页: " + C0889w1.f3478f + ".ContactInfoUI"}, 1));
                }
                return objProceed2;
            case 7:
                Class cls = (Class) obj;
                C0631i9.m1482e(cls, "it");
                return cls.getSuperclass();
            case 8:
                return ((Class) obj).getName();
            case 9:
                StackTraceElement stackTraceElement = (StackTraceElement) obj;
                String className = stackTraceElement.getClassName();
                C0631i9.m1481d(className, "getClassName(...)");
                return C0034Be.m105T(className, '.') + "." + stackTraceElement.getMethodName() + ":" + stackTraceElement.getLineNumber();
            case 10:
                Map.Entry entry = (Map.Entry) obj;
                C0631i9.m1482e(entry, "<destruct>");
                return ((String) entry.getKey()) + "=" + ((C0761p6) entry.getValue()).f2992b;
            case 11:
                XposedInterface.Chain chain5 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain5, "chain");
                Object objProceed3 = chain5.proceed();
                Object obj2 = chain5.getArgs().get(0);
                Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                if (num != null) {
                    String strM2223c = C0944z.m2223c(num.intValue(), "[ContactLabel-mb getView:", "]");
                    Object thisObject3 = chain5.getThisObject();
                    if (thisObject3 != null) {
                        try {
                            method = thisObject3.getClass().getMethod("getItem", Integer.TYPE);
                        } catch (Throwable th) {
                            objM2206a = C0920xd.m2206a(th);
                        }
                    } else {
                        method = null;
                    }
                    if (method != null && (objInvoke = method.invoke(thisObject3, num)) != null) {
                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"[DIAG-SNS] " + strM2223c + " class=" + objInvoke.getClass().getName()}, 1));
                        C0627i5.m1477a(objInvoke, strM2223c);
                        objM2206a = C0413Wf.f1577a;
                        Throwable thM2189a = C0901wd.m2189a(objM2206a);
                        if (thM2189a != null) {
                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"[DIAG-SNS] " + strM2223c + " FAILED: " + thM2189a.getMessage()}, 1));
                        }
                    }
                }
                return objProceed3;
            case 12:
                XposedInterface.Chain chain6 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain6, "chain");
                Object objProceed4 = chain6.proceed();
                Object obj3 = chain6.getArgs().get(0);
                Integer num2 = obj3 instanceof Integer ? (Integer) obj3 : null;
                if (num2 != null) {
                    int iIntValue = num2.intValue();
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"[DIAG-LABEL] mb getItem[" + iIntValue + "] class=" + (objProceed4 != null ? objProceed4.getClass().getName() : "null")}, 1));
                    StringBuilder sb = new StringBuilder("ContactLabel item[");
                    sb.append(iIntValue);
                    sb.append("]");
                    C0627i5.m1477a(objProceed4, sb.toString());
                }
                return objProceed4;
            case 13:
                XposedInterface.Chain chain7 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain7, "chain");
                Object objProceed5 = chain7.proceed();
                Integer num3 = objProceed5 instanceof Integer ? (Integer) objProceed5 : null;
                int iIntValue2 = num3 != null ? num3.intValue() : 0;
                C0726n9.m1677t(C0944z.m2225e("[DIAG-LABEL] mb getCount=", iIntValue2));
                return Integer.valueOf(iIntValue2);
            case 14:
                C0631i9.m1482e((String) obj, "it");
                return "?";
            case 15:
                XposedInterface.Chain chain8 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain8, "chain");
                Object objProceed6 = chain8.proceed();
                Object thisObject4 = chain8.getThisObject();
                Activity activity3 = thisObject4 instanceof Activity ? (Activity) thisObject4 : null;
                if (activity3 != null) {
                    String name = activity3.getClass().getName();
                    if (name.equals("com.tencent.mm.ui.chatting.ChattingUI") || name.equals("com.tencent.mm.ui.LauncherUI")) {
                        C0186K3.f638a.getClass();
                        if (C0186K3.a.m511l() && !C0186K3.a.m510k() && C0186K3.a.m508i().f2449s && !C0186K3.a.m505f().isEmpty()) {
                            C0915x8 c0915x84 = C0915x8.f3530a;
                            if (!C0915x8.m2203a() && !C0816s4.f3217F && (intent = activity3.getIntent()) != null && (stringExtra = intent.getStringExtra("Chat_User")) != null && !C0034Be.m101P(stringExtra)) {
                                ExecutorService executorService3 = C0582fh.f2149G;
                                if (C0582fh.a.m1423a(stringExtra)) {
                                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"blockEnterChat(onCreate): finishing " + activity3.getClass().getSimpleName() + " for " + stringExtra}, 1));
                                    activity3.finish();
                                }
                            }
                        }
                    }
                }
                return objProceed6;
            case 16:
                Map.Entry entry2 = (Map.Entry) obj;
                C0631i9.m1482e(entry2, "it");
                return entry2.getKey() + "=" + entry2.getValue();
            case 17:
                Map.Entry entry3 = (Map.Entry) obj;
                C0631i9.m1482e(entry3, "<destruct>");
                String str = (String) entry3.getKey();
                C0723n6.b bVar = (C0723n6.b) entry3.getValue();
                return str + "=" + bVar.f2827a + "(" + bVar.f2828b + "ms)";
            case 18:
                Method method3 = (Method) obj;
                C0631i9.m1482e(method3, "mtd");
                if (C0631i9.m1478a(method3.getName(), "setAdapter") && method3.getParameterTypes().length == 1) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 19:
                Method method4 = (Method) obj;
                C0631i9.m1482e(method4, "mtd");
                if (C0631i9.m1478a(method4.getName(), "e") && method4.getParameterTypes().length == 1 && C0631i9.m1478a(method4.getParameterTypes()[0], List.class) && C0631i9.m1478a(method4.getReturnType(), List.class)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 20:
                Method method5 = (Method) obj;
                C0631i9.m1482e(method5, "mtd");
                if (C0631i9.m1478a(method5.getName(), "e") && method5.getParameterTypes().length == 1 && C0631i9.m1478a(method5.getParameterTypes()[0], List.class) && C0631i9.m1478a(method5.getReturnType(), List.class)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 21:
                Method method6 = (Method) obj;
                C0631i9.m1482e(method6, "m");
                if (C0631i9.m1478a(method6.getName(), "q")) {
                    Class<?>[] parameterTypes = method6.getParameterTypes();
                    C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            case 22:
                Method method7 = (Method) obj;
                C0631i9.m1482e(method7, "m");
                if (C0631i9.m1478a(method7.getName(), "c") && method7.getParameterTypes().length == 1 && C0631i9.m1478a(method7.getParameterTypes()[0], List.class)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 23:
                Method method8 = (Method) obj;
                C0631i9.m1482e(method8, "m");
                if (C0631i9.m1478a(method8.getName(), "c") && method8.getParameterTypes().length == 1 && C0631i9.m1478a(method8.getParameterTypes()[0], List.class)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 24:
                Method method9 = (Method) obj;
                C0631i9.m1482e(method9, "m");
                if (C0631i9.m1478a(method9.getName(), "onCreate") && method9.getParameterTypes().length == 1 && C0631i9.m1478a(method9.getParameterTypes()[0], Bundle.class)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 25:
                XposedInterface.Chain chain9 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain9, "chain");
                chain9.proceed();
                try {
                    Object thisObject5 = chain9.getThisObject();
                    if (C0706m8.m1610m() && (thisObject5 instanceof Activity) && !C0706m8.m1609k().isEmpty()) {
                        Object objM1608i = C0706m8.m1608i(thisObject5, "G");
                        String str2 = objM1608i instanceof String ? (String) objM1608i : null;
                        if (str2 != null && C0706m8.m1611n(str2)) {
                            ((Activity) thisObject5).finish();
                        }
                    }
                    objM2206a2 = C0413Wf.f1577a;
                    break;
                } catch (Throwable th2) {
                    objM2206a2 = C0920xd.m2206a(th2);
                }
                return new C0901wd(objM2206a2);
            case 26:
                Method method10 = (Method) obj;
                C0631i9.m1482e(method10, "m");
                if (C0631i9.m1478a(method10.getName(), "B7") && method10.getParameterTypes().length == 1 && C0631i9.m1478a(method10.getParameterTypes()[0], Boolean.TYPE)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 27:
                XposedInterface.Chain chain10 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain10, "chain");
                Object objProceed7 = chain10.proceed();
                Object obj4 = objProceed7 == null ? null : objProceed7;
                if (obj4 != null) {
                    try {
                        Object objM1603c = C0706m8.m1603c(obj4, "getSnsId");
                        String str3 = objM1603c instanceof String ? (String) objM1603c : null;
                        if (str3 != null && C0706m8.m1611n(str3)) {
                            Object thisObject6 = chain10.getThisObject();
                            Activity activity4 = thisObject6 instanceof Activity ? (Activity) thisObject6 : null;
                            if (activity4 != null) {
                                activity4.finish();
                            }
                        }
                    } catch (Throwable th3) {
                        C0920xd.m2206a(th3);
                    }
                }
                C0413Wf c0413Wf = C0413Wf.f1577a;
                return objProceed7;
            case 28:
                Method method11 = (Method) obj;
                C0631i9.m1482e(method11, "m");
                if (C0631i9.m1478a(method11.getName(), "e") && method11.getParameterTypes().length == 1) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            default:
                Method method12 = (Method) obj;
                C0631i9.m1482e(method12, "m");
                if (C0631i9.m1478a(method12.getName(), "setAdapter") && method12.getParameterTypes().length == 1) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [a.s4.handleHook(a.J8):void] */
    public /* synthetic */ C0586g2(int i, Object obj) {
        this.f2183a = i;
    }
}
