package p000a;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.C0186K3;
import p000a.C0582fh;
import p000a.C0653jc;
import p000a.C0901wd;

/* JADX INFO: renamed from: a.l4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0683l4 implements InterfaceC0064D7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2544a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2545b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2546c;

    public /* synthetic */ C0683l4(Object obj, int i, Object obj2) {
        this.f2544a = i;
        this.f2545b = obj;
        this.f2546c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x0394 A[Catch: all -> 0x0378, TryCatch #2 {all -> 0x0378, blocks: (B:134:0x0302, B:138:0x0318, B:140:0x0326, B:142:0x0332, B:144:0x033c, B:146:0x0350, B:148:0x035e, B:150:0x0368, B:158:0x0381, B:159:0x0386, B:163:0x0394, B:165:0x039e, B:167:0x03ae, B:169:0x03ba, B:171:0x03c2, B:178:0x03d7, B:175:0x03d1, B:180:0x0413), top: B:193:0x0302 }] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, java.util.List] */
    @Override // p000a.InterfaceC0064D7
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo53f(Object obj) throws JSONException {
        int i;
        Field[] declaredFields;
        int length;
        int i2;
        Field field;
        Method method;
        int i3;
        int i4;
        int iM1833g;
        Object objM2206a;
        Method method2;
        int iM157b;
        switch (this.f2544a) {
            case 0:
                Method method3 = (Method) this.f2545b;
                C0816s4 c0816s4 = (C0816s4) this.f2546c;
                XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain, "chain");
                Object thisObject = chain.getThisObject();
                if (thisObject != null) {
                    C0889w1.m2144c(thisObject, method3);
                }
                Object obj2 = chain.getArgs().get(1);
                String str = obj2 instanceof String ? (String) obj2 : null;
                int i5 = c0816s4.f3257x;
                if (i5 < 5) {
                    c0816s4.f3257x = i5 + 1;
                    i = 0;
                    String str2 = "DIAG fh5.w.k CALLED: type=" + chain.getArgs().get(0) + " username=" + str + " dsReady=" + ((C0889w1.f3490r == null || C0889w1.f3491s == null) ? false : true);
                    C0631i9.m1482e(str2, "msg");
                    C0908x1.m2194b("[ConvRV] ".concat(str2));
                } else {
                    i = 0;
                }
                C0186K3.f638a.getClass();
                if (!C0186K3.a.m511l() || !C0186K3.a.m508i().f2444n) {
                    return chain.proceed();
                }
                C0915x8 c0915x8 = C0915x8.f3530a;
                if (C0915x8.m2203a() || C0889w1.f3489q) {
                    return chain.proceed();
                }
                if (str != null) {
                    ExecutorService executorService = C0582fh.f2149G;
                    if (C0582fh.a.m1423a(str)) {
                        Object thisObject2 = chain.getThisObject();
                        try {
                            declaredFields = thisObject2.getClass().getDeclaredFields();
                            C0631i9.m1481d(declaredFields, "getDeclaredFields(...)");
                            length = declaredFields.length;
                        } catch (Throwable th) {
                            C0920xd.m2206a(th);
                        }
                        for (i2 = i; i2 < length; i2++) {
                            Field field2 = declaredFields[i2];
                            if (!C0631i9.m1478a(field2.getName(), "f269481g") && !C0631i9.m1478a(field2.getName(), "g")) {
                                if (!Modifier.isStatic(field2.getModifiers())) {
                                    Method[] declaredMethods = field2.getType().getDeclaredMethods();
                                    C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
                                    int i6 = i;
                                    for (int length2 = declaredMethods.length; i6 < length2; length2 = i4) {
                                        Method method4 = declaredMethods[i6];
                                        int i7 = i6;
                                        if (C0631i9.m1478a(method4.getName(), "c")) {
                                            i4 = length2;
                                            if (method4.getParameterTypes().length != 1) {
                                                i6 = i7 + 1;
                                            } else if (C0631i9.m1478a(method4.getParameterTypes()[i], String.class)) {
                                            }
                                        } else {
                                            i4 = length2;
                                        }
                                        i6 = i7 + 1;
                                    }
                                }
                            }
                            field = field2;
                            if (field != null) {
                                field.setAccessible(true);
                                Object obj3 = field.get(thisObject2);
                                if (obj3 != null) {
                                    Method[] methods = obj3.getClass().getMethods();
                                    C0631i9.m1481d(methods, "getMethods(...)");
                                    int length3 = methods.length;
                                    int i8 = i;
                                    while (true) {
                                        if (i8 < length3) {
                                            method = methods[i8];
                                            if (C0631i9.m1478a(method.getName(), "c")) {
                                                i3 = 1;
                                                if (method.getParameterTypes().length != 1) {
                                                    continue;
                                                } else {
                                                    if (C0631i9.m1478a(method.getParameterTypes()[i], String.class)) {
                                                    }
                                                    i3 = 1;
                                                }
                                            } else {
                                                i3 = 1;
                                            }
                                            i8 += i3;
                                        } else {
                                            method = null;
                                        }
                                    }
                                    if (method != null) {
                                        method.setAccessible(true);
                                        method.invoke(obj3, str);
                                        String str3 = "EVENT-FILTER: " + str + " forced submitRemove";
                                        C0631i9.m1482e(str3, "msg");
                                        C0908x1.m2194b("[ConvRV] " + str3);
                                        return null;
                                    }
                                }
                            }
                            C0413Wf c0413Wf = C0413Wf.f1577a;
                            String str4 = "EVENT-FILTER: " + str + " blocked (fallback)";
                            C0631i9.m1482e(str4, "msg");
                            C0908x1.m2194b("[ConvRV] ".concat(str4));
                            return null;
                        }
                        field = null;
                        if (field != null) {
                        }
                        C0413Wf c0413Wf2 = C0413Wf.f1577a;
                        String str42 = "EVENT-FILTER: " + str + " blocked (fallback)";
                        C0631i9.m1482e(str42, "msg");
                        C0908x1.m2194b("[ConvRV] ".concat(str42));
                        return null;
                    }
                }
                return chain.proceed();
            case 1:
                C0782q8 c0782q8 = (C0782q8) this.f2545b;
                String str5 = (String) this.f2546c;
                XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain2, "chain");
                Object objProceed = chain2.proceed();
                try {
                    if (C0782q8.m1826j()) {
                        List<?> list = C0198Kf.m549b(objProceed) ? (List) objProceed : null;
                        if (list != null && (iM1833g = c0782q8.m1833g(list)) > 0) {
                            Log.i("MyPlugin-DexKit", "[RecentForward] provider." + str5 + " filtered " + iM1833g);
                        }
                        break;
                    }
                } catch (Exception unused) {
                }
                return objProceed;
            case 2:
                Class cls = (Class) this.f2546c;
                XposedInterface.Chain chain3 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain3, "chain");
                Object objProceed2 = chain3.proceed();
                C0801r8 c0801r8 = (C0801r8) this.f2545b;
                C0186K3.f638a.getClass();
                if (C0186K3.a.m511l() && C0186K3.a.m508i().f2431a) {
                    Object obj4 = chain3.getArgs().get(0);
                    Integer num = obj4 instanceof Integer ? (Integer) obj4 : null;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        View view = objProceed2 instanceof View ? (View) objProceed2 : null;
                        if (view != null) {
                            try {
                                Method[] methods2 = cls.getMethods();
                                C0631i9.m1481d(methods2, "getMethods(...)");
                                int length4 = methods2.length;
                                int i9 = 0;
                                while (true) {
                                    if (i9 < length4) {
                                        method2 = methods2[i9];
                                        if (!C0631i9.m1478a(method2.getName(), "getItem") || method2.getParameterTypes().length != 1 || !C0631i9.m1478a(method2.getParameterTypes()[0], Integer.TYPE)) {
                                            i9++;
                                        }
                                    } else {
                                        method2 = null;
                                    }
                                }
                                objM2206a = method2 != null ? method2.invoke(chain3.getThisObject(), num) : null;
                            } catch (Throwable th2) {
                                objM2206a = C0920xd.m2206a(th2);
                            }
                            Object obj5 = objM2206a instanceof C0901wd.a ? null : objM2206a;
                            if (obj5 != null && c0801r8.m1861b(obj5)) {
                                view.setVisibility(8);
                                view.setLayoutParams(new AbsListView.LayoutParams(0, 0));
                                C0726n9.m1670m("HideSearchList: hidden search result at position " + iIntValue);
                            }
                        }
                    }
                    break;
                }
                return objProceed2;
            case 3:
                XposedInterface.Chain chain4 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain4, "chain");
                Object objProceed3 = chain4.proceed();
                C0009A8 c0009a8 = (C0009A8) this.f2545b;
                C0186K3.f638a.getClass();
                if (C0186K3.a.m511l() && C0186K3.a.m508i().f2434d) {
                    Object thisObject3 = chain4.getThisObject();
                    Activity activity = thisObject3 instanceof Activity ? (Activity) thisObject3 : null;
                    if (activity != null && !C0009A8.m39c(activity, this.f2546c)) {
                        c0009a8.m40d(activity, 0);
                    }
                }
                return objProceed3;
            case 4:
                String str6 = (String) this.f2546c;
                XposedInterface.Chain chain5 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain5, "chain");
                Object objProceed4 = chain5.proceed();
                ((C0065D8) this.f2545b).getClass();
                if (C0065D8.m162i()) {
                    try {
                        HashSet hashSetM161f = C0065D8.m161f();
                        if (!hashSetM161f.isEmpty()) {
                            ArrayList arrayList = objProceed4 instanceof ArrayList ? (ArrayList) objProceed4 : null;
                            if (arrayList != null && (iM157b = C0065D8.m157b(arrayList, hashSetM161f)) > 0) {
                                C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideTextStatus: [" + str6 + "] filtered " + iM157b + " masked cards from R6 output"}, 1));
                            }
                            break;
                        }
                    } catch (Throwable th3) {
                        C0908x1.m2193a(Arrays.copyOf(new Object[]{"HideTextStatus: [" + str6 + "] filter output error (safe skip): " + th3.getMessage()}, 1));
                    }
                }
                return objProceed4;
            case 5:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C0425X9 c0425x9 = (C0425X9) this.f2545b;
                c0425x9.getClass();
                JSONObject jSONObject = new JSONObject(C0653jc.a.m1518b((C0653jc) this.f2546c));
                jSONObject.put("hideMaskedMessageNotification", zBooleanValue);
                String string = jSONObject.toString();
                C0631i9.m1481d(string, "toString(...)");
                C0653jc c0653jcM1517a = C0653jc.a.m1517a(string);
                C0186K3.f638a.getClass();
                C0186K3.a.m519t(c0653jcM1517a);
                c0425x9.m1069F();
                return C0413Wf.f1577a;
            default:
                C0879va c0879va = (C0879va) this.f2545b;
                ClassLoader classLoader = (ClassLoader) this.f2546c;
                XposedInterface.Chain chain6 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain6, "chain");
                try {
                    List args = chain6.getArgs();
                    C0631i9.m1481d(args, "getArgs(...)");
                    c0879va.m2104b(C0834t3.m1950n0(args), classLoader);
                    break;
                } catch (Throwable th4) {
                    C0908x1.m2193a(Arrays.copyOf(new Object[]{"[MaskedMsgVibrate] onMessageInserted fail", th4}, 2));
                }
                return chain6.proceed();
        }
    }
}
