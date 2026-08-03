package p000a;

import android.os.Bundle;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import p000a.C0186K3;
import p000a.C0582fh;
import p000a.C0901wd;
import top.mmjz.floatingclouds.bean.MaskItemBean;

/* JADX INFO: renamed from: a.h4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0607h4 implements InterfaceC0064D7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2238a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0816s4 f2239b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0607h4(C0816s4 c0816s4, int i) {
        this.f2238a = i;
        this.f2239b = c0816s4;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:263:0x0446 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:228:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x044f  */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v3, types: [a.wd$a] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // p000a.InterfaceC0064D7
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo53f(Object obj) {
        int i;
        ?? M2206a;
        boolean z;
        String str;
        Class<?> superclass;
        Object objM2206a;
        Method method;
        Field field;
        int[] iArr;
        String string;
        int i2 = 0;
        boolean z2 = true;
        switch (this.f2238a) {
            case 0:
                C0816s4 c0816s4 = this.f2239b;
                XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain, "chain2");
                C0186K3.f638a.getClass();
                if (!C0186K3.a.m511l() || !C0186K3.a.m508i().f2444n) {
                    return chain.proceed();
                }
                C0915x8 c0915x8 = C0915x8.f3530a;
                if (C0915x8.m2203a() || C0889w1.f3489q) {
                    return chain.proceed();
                }
                ArrayList arrayListM505f = C0186K3.a.m505f();
                if (arrayListM505f.isEmpty()) {
                    return chain.proceed();
                }
                ArrayList arrayList = new ArrayList(C0758p3.m1800g0(arrayListM505f, 10));
                Iterator it = arrayListM505f.iterator();
                while (it.hasNext()) {
                    arrayList.add(((MaskItemBean) it.next()).getMaskId());
                }
                HashSet hashSet = new HashSet(arrayList);
                Object obj2 = chain.getArgs().get(0);
                List list = obj2 instanceof List ? (List) obj2 : null;
                if (list != null && !list.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list) {
                        if (obj3 == null) {
                            i = i2;
                        } else {
                            c0816s4.getClass();
                            try {
                                superclass = obj3.getClass();
                                i = i2;
                            } catch (Throwable th) {
                                th = th;
                                i = i2;
                            }
                            while (superclass != null) {
                                try {
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                if (superclass.equals(Object.class) || i2 >= 3) {
                                    M2206a = 0;
                                    z = M2206a instanceof C0901wd.a;
                                    ?? r1 = M2206a;
                                    if (z) {
                                        r1 = 0;
                                    }
                                    str = (String) r1;
                                    if (str == null || !hashSet.contains(str)) {
                                    }
                                    i2 = i;
                                    z2 = true;
                                } else {
                                    C0112G1 c0112g1M2122I = C0889w1.m2122I(superclass.getDeclaredFields());
                                    while (c0112g1M2122I.hasNext()) {
                                        Field field2 = (Field) c0112g1M2122I.next();
                                        if (!Modifier.isStatic(field2.getModifiers()) && !field2.getType().isPrimitive()) {
                                            if (!C0631i9.m1478a(field2.getType(), String.class)) {
                                                field2.setAccessible(z2);
                                                try {
                                                    objM2206a = field2.get(obj3);
                                                } catch (Throwable th3) {
                                                    objM2206a = C0920xd.m2206a(th3);
                                                }
                                                if (objM2206a instanceof C0901wd.a) {
                                                    objM2206a = null;
                                                }
                                                if (objM2206a != null) {
                                                    Method[] methods = objM2206a.getClass().getMethods();
                                                    boolean z3 = z2;
                                                    C0631i9.m1481d(methods, "getMethods(...)");
                                                    int length = methods.length;
                                                    int i3 = i;
                                                    while (true) {
                                                        if (i3 < length) {
                                                            Method method2 = methods[i3];
                                                            int i4 = i3;
                                                            Method[] methodArr = methods;
                                                            if (C0631i9.m1478a(method2.getName(), "i1")) {
                                                                Class<?>[] parameterTypes = method2.getParameterTypes();
                                                                C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                                                                if (parameterTypes.length == 0 && C0631i9.m1478a(method2.getReturnType(), String.class)) {
                                                                    method = method2;
                                                                }
                                                            }
                                                            i3 = i4 + 1;
                                                            methods = methodArr;
                                                        } else {
                                                            method = null;
                                                        }
                                                    }
                                                    if (method != null) {
                                                        try {
                                                            method.setAccessible(z3);
                                                            Object objInvoke = method.invoke(objM2206a, null);
                                                            M2206a = objInvoke instanceof String ? (String) objInvoke : 0;
                                                            if (M2206a == 0 || C0034Be.m101P(M2206a)) {
                                                            }
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            M2206a = C0920xd.m2206a(th);
                                                        }
                                                        z = M2206a instanceof C0901wd.a;
                                                        ?? r12 = M2206a;
                                                        if (z) {
                                                        }
                                                        str = (String) r12;
                                                        if (str == null) {
                                                        }
                                                        i2 = i;
                                                        z2 = true;
                                                    }
                                                    Field[] declaredFields = objM2206a.getClass().getDeclaredFields();
                                                    C0631i9.m1481d(declaredFields, "getDeclaredFields(...)");
                                                    int length2 = declaredFields.length;
                                                    int i5 = i;
                                                    while (true) {
                                                        if (i5 < length2) {
                                                            Field field3 = declaredFields[i5];
                                                            Field[] fieldArr = declaredFields;
                                                            int i6 = i5;
                                                            if (C0631i9.m1478a(field3.getName(), "field_username")) {
                                                                field = field3;
                                                            } else {
                                                                i5 = i6 + 1;
                                                                declaredFields = fieldArr;
                                                            }
                                                        } else {
                                                            field = null;
                                                        }
                                                    }
                                                    if (field != null) {
                                                        field.setAccessible(true);
                                                        Object obj4 = field.get(objM2206a);
                                                        M2206a = obj4 instanceof String ? (String) obj4 : 0;
                                                        if (M2206a != 0 && !C0034Be.m101P(M2206a)) {
                                                            z = M2206a instanceof C0901wd.a;
                                                            ?? r122 = M2206a;
                                                            if (z) {
                                                            }
                                                            str = (String) r122;
                                                            if (str == null) {
                                                            }
                                                            i2 = i;
                                                            z2 = true;
                                                        }
                                                    }
                                                    z2 = true;
                                                }
                                                break;
                                            }
                                        }
                                    }
                                    superclass = superclass.getSuperclass();
                                    i2++;
                                    z2 = true;
                                }
                                M2206a = C0920xd.m2206a(th);
                                z = M2206a instanceof C0901wd.a;
                                ?? r1222 = M2206a;
                                if (z) {
                                }
                                str = (String) r1222;
                                if (str == null) {
                                }
                                i2 = i;
                                z2 = true;
                                break;
                            }
                            M2206a = 0;
                            z = M2206a instanceof C0901wd.a;
                            ?? r12222 = M2206a;
                            if (z) {
                            }
                            str = (String) r12222;
                            if (str == null) {
                            }
                            i2 = i;
                            z2 = true;
                        }
                        arrayList2.add(obj3);
                        i2 = i;
                        z2 = true;
                    }
                    int i7 = i2;
                    if (arrayList2.size() >= list.size()) {
                        return chain.proceed();
                    }
                    String str2 = "fh5.a FILTER: " + list.size() + " -> " + arrayList2.size();
                    C0631i9.m1482e(str2, "msg");
                    C0908x1.m2194b("[ConvRV] ".concat(str2));
                    List[] listArr = new List[1];
                    listArr[i7] = arrayList2;
                    return chain.proceed(listArr);
                }
                return chain.proceed();
            case 1:
                C0816s4 c0816s42 = this.f2239b;
                XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain2, "chain3");
                int i8 = c0816s42.f3258y;
                if (i8 < 5) {
                    c0816s42.f3258y = i8 + 1;
                    Object obj5 = chain2.getArgs().get(0);
                    List args = chain2.getArgs();
                    C0631i9.m1481d(args, "getArgs(...)");
                    String str3 = "DIAG fh5.w0.i CALLED: arg0=" + obj5 + " arg2=" + C0834t3.m1951o0(args, 2);
                    C0631i9.m1482e(str3, "msg");
                    C0908x1.m2194b("[ConvRV] ".concat(str3));
                }
                C0186K3.f638a.getClass();
                if (!C0186K3.a.m511l() || !C0186K3.a.m508i().f2444n) {
                    return chain2.proceed();
                }
                C0915x8 c0915x82 = C0915x8.f3530a;
                if (C0915x8.m2203a() || C0889w1.f3489q) {
                    return chain2.proceed();
                }
                List args2 = chain2.getArgs();
                C0631i9.m1481d(args2, "getArgs(...)");
                Object objM1951o0 = C0834t3.m1951o0(args2, 2);
                String str4 = objM1951o0 instanceof String ? (String) objM1951o0 : null;
                if (str4 != null && C0015Ae.m49H(str4, "wxid_", false)) {
                    ExecutorService executorService = C0582fh.f2149G;
                    boolean zM1423a = C0582fh.a.m1423a(str4);
                    if (zM1423a && c0816s42.f3258y < 10) {
                        String str5 = "DIAG W0-I MASKED HIT: " + str4 + " containChatUser=" + zM1423a;
                        C0631i9.m1482e(str5, "msg");
                        C0908x1.m2194b("[ConvRV] ".concat(str5));
                    }
                }
                if (str4 != null) {
                    ExecutorService executorService2 = C0582fh.f2149G;
                    if (C0582fh.a.m1423a(str4)) {
                        String str6 = "W0-I-BLOCK: " + str4 + " event blocked at entry";
                        C0631i9.m1482e(str6, "msg");
                        C0908x1.m2194b("[ConvRV] ".concat(str6));
                        return null;
                    }
                }
                return chain2.proceed();
            case 2:
                XposedInterface.Chain chain3 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain3, "chain");
                return this.f2239b.m1896b(chain3);
            case 3:
                XposedInterface.Chain chain4 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain4, "chain");
                C0816s4 c0816s43 = this.f2239b;
                C0186K3.f638a.getClass();
                C0653jc c0653jcM508i = C0186K3.a.m508i();
                if (!c0653jcM508i.f2444n || !C0186K3.a.m511l()) {
                    return chain4.proceed();
                }
                if (!C0631i9.m1478a(c0816s43.f3255v.get(), Boolean.TRUE)) {
                    C0915x8 c0915x83 = C0915x8.f3530a;
                    if (!C0915x8.m2203a() && !C0186K3.a.m505f().isEmpty()) {
                        Object thisObject = chain4.getThisObject();
                        if (thisObject != null && c0816s43.m1900g(thisObject, c0653jcM508i) != 0 && (iArr = c0816s43.f3246m.get(thisObject)) != null) {
                            Integer num = c0816s43.f3248o.get(thisObject);
                            int iIntValue = num != null ? num.intValue() : iArr.length;
                            Object obj6 = chain4.getArgs().get(0);
                            Integer num2 = obj6 instanceof Integer ? (Integer) obj6 : null;
                            if (num2 == null) {
                                return chain4.proceed();
                            }
                            int iIntValue2 = num2.intValue();
                            return (iIntValue2 < 0 || iIntValue2 >= iIntValue) ? chain4.proceed() : chain4.proceed(new Integer[]{Integer.valueOf(iArr[iIntValue2])});
                        }
                        return chain4.proceed();
                    }
                }
                return chain4.proceed();
            case 4:
                XposedInterface.Chain chain5 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain5, "chain");
                Object objProceed = chain5.proceed();
                Object thisObject2 = chain5.getThisObject();
                if (thisObject2 != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C0816s4 c0816s44 = this.f2239b;
                    Long l = c0816s44.f3250q.get(thisObject2);
                    if (jCurrentTimeMillis - (l != null ? l.longValue() : 0L) > 50) {
                        Long l2 = c0816s44.f3251r.get(thisObject2);
                        if (jCurrentTimeMillis - (l2 != null ? l2.longValue() : 0L) >= 200) {
                            c0816s44.f3256w.clear();
                            c0816s44.f3247n.put(thisObject2, Boolean.TRUE);
                            c0816s44.f3250q.put(thisObject2, Long.valueOf(jCurrentTimeMillis));
                        }
                    }
                }
                return objProceed;
            default:
                XposedInterface.Chain chain6 = (XposedInterface.Chain) obj;
                C0631i9.m1482e(chain6, "chain");
                Object objProceed2 = chain6.proceed();
                C0915x8 c0915x84 = C0915x8.f3530a;
                if (C0915x8.m2203a()) {
                    try {
                        Object objM12a = C0002A1.m12a(chain6.getThisObject(), "getArguments", new Object[0]);
                        Bundle bundle = objM12a instanceof Bundle ? (Bundle) objM12a : null;
                        string = bundle != null ? bundle.getString("Chat_User") : null;
                    } catch (Throwable th5) {
                        th = th5;
                        string = null;
                    }
                    try {
                        C0413Wf c0413Wf = C0413Wf.f1577a;
                    } catch (Throwable th6) {
                        th = th6;
                        C0920xd.m2206a(th);
                    }
                    this.f2239b.m1902i(string, "onActivityCreated");
                    break;
                }
                return objProceed2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C0607h4(C0816s4 c0816s4, C0173J8 c0173j8, int i) {
        this.f2238a = i;
        this.f2239b = c0816s4;
    }
}
