package p000a;

import android.view.View;
import android.widget.ListAdapter;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import p000a.C0186K3;
import p000a.C0582fh;
import p000a.C0901wd;

/* JADX INFO: renamed from: a.p4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0759p4 implements XposedInterface.Hooker {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2984a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0816s4 f2985b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0759p4(C0816s4 c0816s4, int i) {
        this.f2984a = i;
        this.f2985b = c0816s4;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:112|(3:114|(0)(1:117)|(2:161|(2:163|(1:354)(7:285|166|(1:168)(1:172)|174|(1:176)(1:177)|178|(8:180|(6:183|307|184|314|313|181)|283|188|301|192|196|197)(1:353)))(1:352))(1:351))(1:118)|297|119|120|(3:299|122|(6:318|151|156|(1:158)|159|(0)(0))(4:126|(4:129|(10:321|131|279|132|136|(1:138)|(1:140)(2:144|(1:146)(3:147|148|324))|141|148|324)(3:320|149|323)|322|127)|319|150))|316|151|156|(0)|159|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02d4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02d5, code lost:
    
        r19 = r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:351:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0 A[Catch: all -> 0x00af, TryCatch #6 {all -> 0x00af, blocks: (B:21:0x0073, B:23:0x0083, B:25:0x0093, B:27:0x009b, B:37:0x00bc, B:39:0x00ca, B:42:0x00d0, B:44:0x00da, B:48:0x00e2, B:50:0x00e8, B:52:0x00ee, B:55:0x00f4, B:57:0x00fe, B:61:0x0106, B:63:0x010c, B:65:0x0112, B:68:0x0118, B:70:0x0121, B:74:0x012a, B:75:0x0132, B:77:0x0138, B:79:0x0148, B:84:0x0158, B:87:0x015d, B:89:0x0161, B:91:0x016a, B:93:0x0172, B:95:0x0176, B:83:0x0154, B:100:0x0196, B:34:0x00b4, B:80:0x014e), top: B:289:0x0073, inners: #9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object intercept(XposedInterface.Chain chain) {
        Object item;
        Class<?> superclass;
        Class<Object> cls;
        int i;
        Object objM2206a;
        Object obj;
        Object obj2;
        Object objM2206a2;
        Object objM2206a3;
        Field field;
        String str;
        Object objM2206a4;
        Integer num;
        Method method;
        Object objM2206a5;
        Object obj3;
        Class<Object> cls2 = Object.class;
        C0816s4 c0816s4 = this.f2985b;
        switch (this.f2984a) {
            case 0:
                Class<Object> cls3 = cls2;
                C0631i9.m1482e(chain, "chain");
                Object objProceed = chain.proceed();
                C0186K3.f638a.getClass();
                if (C0186K3.a.m508i().f2444n && !C0186K3.a.m505f().isEmpty()) {
                    Object thisObject = chain.getThisObject();
                    ListAdapter listAdapter = thisObject instanceof ListAdapter ? (ListAdapter) thisObject : null;
                    if (listAdapter != null) {
                        Object obj4 = chain.getArgs().get(0);
                        Integer num2 = obj4 instanceof Integer ? (Integer) obj4 : null;
                        if (num2 != null && (item = listAdapter.getItem(num2.intValue())) != null) {
                            View view = objProceed instanceof View ? (View) objProceed : null;
                            if (view != null) {
                                Object objM18g = C0002A1.m18g(item);
                                String str2 = objM18g instanceof String ? (String) objM18g : null;
                                if (str2 == null) {
                                    Object objM19h = C0002A1.m19h(item, "field_username");
                                    String str3 = objM19h instanceof String ? (String) objM19h : null;
                                    if (str3 != null) {
                                        str2 = str3;
                                        ExecutorService executorService = C0582fh.f2149G;
                                        if (C0582fh.a.m1423a(str2)) {
                                            for (String str4 : C0739o3.m1757d0("field_content", "field_digest")) {
                                                try {
                                                    Class<?> superclass2 = item.getClass();
                                                    while (true) {
                                                        if (superclass2 != null) {
                                                            cls = cls3;
                                                            try {
                                                                if (!superclass2.equals(cls)) {
                                                                    try {
                                                                        Field declaredField = superclass2.getDeclaredField(str4);
                                                                        declaredField.setAccessible(true);
                                                                        declaredField.set(item, "");
                                                                    } catch (NoSuchFieldException unused) {
                                                                        superclass2 = superclass2.getSuperclass();
                                                                        cls3 = cls;
                                                                    }
                                                                }
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                C0920xd.m2206a(th);
                                                            }
                                                        } else {
                                                            cls = cls3;
                                                        }
                                                    }
                                                    C0413Wf c0413Wf = C0413Wf.f1577a;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    cls = cls3;
                                                }
                                                cls3 = cls;
                                            }
                                            Class<Object> cls4 = cls3;
                                            try {
                                            } catch (Throwable th3) {
                                                C0920xd.m2206a(th3);
                                            }
                                            for (superclass = item.getClass(); superclass != null && !superclass.equals(cls4); superclass = superclass.getSuperclass()) {
                                                try {
                                                    Field declaredField2 = superclass.getDeclaredField("field_msgType");
                                                    try {
                                                        declaredField2.setAccessible(true);
                                                        declaredField2.set(item, "1");
                                                        C0413Wf c0413Wf2 = C0413Wf.f1577a;
                                                        c0816s4.m1905m(view);
                                                        c0816s4.m1904l(view);
                                                    } catch (NoSuchFieldException unused2) {
                                                        continue;
                                                    }
                                                } catch (NoSuchFieldException unused3) {
                                                }
                                            }
                                            C0413Wf c0413Wf22 = C0413Wf.f1577a;
                                            c0816s4.m1905m(view);
                                            c0816s4.m1904l(view);
                                        }
                                    }
                                } else {
                                    ExecutorService executorService2 = C0582fh.f2149G;
                                    if (C0582fh.a.m1423a(str2)) {
                                    }
                                }
                            }
                        }
                    }
                }
                return objProceed;
            case 1:
                String str5 = "\"";
                C0631i9.m1482e(chain, "c");
                Object objProceed2 = chain.proceed();
                C0915x8 c0915x8 = C0915x8.f3530a;
                if (!C0915x8.m2203a()) {
                    C0186K3.f638a.getClass();
                    if (!C0186K3.a.m505f().isEmpty() && C0186K3.a.m508i().f2444n) {
                        List args = chain.getArgs();
                        C0631i9.m1481d(args, "getArgs(...)");
                        Object objM1951o0 = C0834t3.m1951o0(args, 1);
                        Integer num3 = objM1951o0 instanceof Integer ? (Integer) objM1951o0 : null;
                        if (num3 != null) {
                            int iIntValue = num3.intValue();
                            Object thisObject2 = chain.getThisObject();
                            try {
                                i = 0;
                            } catch (Throwable th4) {
                                th = th4;
                                i = 0;
                            }
                            try {
                                Method[] methods = thisObject2.getClass().getMethods();
                                C0631i9.m1481d(methods, "getMethods(...)");
                                int length = methods.length;
                                num = num3;
                                int i2 = 0;
                                while (true) {
                                    if (i2 < length) {
                                        Method method2 = methods[i2];
                                        int i3 = i2;
                                        if (C0631i9.m1478a(method2.getName(), "getItem")) {
                                            if (method2.getParameterTypes().length == 1) {
                                                method = C0631i9.m1478a(method2.getParameterTypes()[0], Integer.TYPE) ? method2 : null;
                                            }
                                        }
                                        i2 = i3 + 1;
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                objM2206a = C0920xd.m2206a(th);
                            }
                            if (method != null) {
                                method.setAccessible(true);
                                objM2206a = method.invoke(thisObject2, num);
                                if (objM2206a == null || (objM2206a instanceof View)) {
                                    Object objM19h2 = C0002A1.m19h(thisObject2, "data");
                                    List list = objM19h2 instanceof List ? (List) objM19h2 : null;
                                    if (list == null || iIntValue < 0 || iIntValue >= list.size() || (objM2206a = list.get(iIntValue)) == null || (objM2206a instanceof View)) {
                                        Object objM19h3 = C0002A1.m19h(thisObject2, "e");
                                        List list2 = objM19h3 instanceof List ? (List) objM19h3 : null;
                                        if (list2 == null || iIntValue < 0 || iIntValue >= list2.size() || (objM2206a = list2.get(iIntValue)) == null || (objM2206a instanceof View)) {
                                            Class<?> superclass3 = thisObject2.getClass();
                                            int i4 = 0;
                                            while (superclass3 != null) {
                                                if (superclass3.equals(cls2) || i4 >= 5) {
                                                    objM2206a = null;
                                                } else {
                                                    C0112G1 c0112g1M2122I = C0889w1.m2122I(superclass3.getDeclaredFields());
                                                    while (c0112g1M2122I.hasNext()) {
                                                        Field field2 = (Field) c0112g1M2122I.next();
                                                        if (!Modifier.isStatic(field2.getModifiers())) {
                                                            Class<?> cls5 = superclass3;
                                                            field2.setAccessible(true);
                                                            try {
                                                                objM2206a5 = field2.get(thisObject2);
                                                            } catch (Throwable th6) {
                                                                objM2206a5 = C0920xd.m2206a(th6);
                                                            }
                                                            if (objM2206a5 instanceof C0901wd.a) {
                                                                objM2206a5 = null;
                                                            }
                                                            if (!(objM2206a5 instanceof List) || iIntValue >= ((List) objM2206a5).size() || (obj3 = ((List) objM2206a5).get(iIntValue)) == null || (obj3 instanceof View)) {
                                                                superclass3 = cls5;
                                                            } else {
                                                                int i5 = i4;
                                                                if (C0034Be.m94I(obj3.getClass().getName(), "ViewHolder", true)) {
                                                                    superclass3 = cls5;
                                                                    i4 = i5;
                                                                } else {
                                                                    objM2206a = obj3;
                                                                }
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    int i6 = i4;
                                                    superclass3 = superclass3.getSuperclass();
                                                    i4 = i6 + 1;
                                                }
                                            }
                                            objM2206a = null;
                                        }
                                    }
                                }
                                Object obj5 = objM2206a instanceof C0901wd.a ? null : objM2206a;
                                if (obj5 != null) {
                                    String strM1895a = c0816s4.m1895a(obj5);
                                    ConcurrentHashMap<Class<?>, Boolean> concurrentHashMap = c0816s4.f3259z;
                                    if (concurrentHashMap.containsKey(thisObject2.getClass())) {
                                        obj = thisObject2;
                                        if (!C0631i9.m1478a(concurrentHashMap.get(thisObject2.getClass()), Boolean.FALSE)) {
                                            obj2 = objProceed2;
                                        }
                                        if (strM1895a != null) {
                                            return obj2;
                                        }
                                        ExecutorService executorService3 = C0582fh.f2149G;
                                        if (!C0582fh.a.m1423a(strM1895a)) {
                                            return obj2;
                                        }
                                        concurrentHashMap.put(obj.getClass(), Boolean.TRUE);
                                        Object obj6 = chain.getArgs().get(i);
                                        if (obj6 == null) {
                                            return obj2;
                                        }
                                        try {
                                            Object objM19h4 = C0002A1.m19h(obj6, "itemView");
                                            objM2206a4 = objM19h4 instanceof View ? (View) objM19h4 : null;
                                            break;
                                        } catch (Throwable th7) {
                                            objM2206a4 = C0920xd.m2206a(th7);
                                        }
                                        View view2 = (View) (objM2206a4 instanceof C0901wd.a ? null : objM2206a4);
                                        if (view2 == null) {
                                            return obj2;
                                        }
                                        Iterator it = C0739o3.m1757d0("field_content", "field_digest", "field_msgContent", "field_summary").iterator();
                                        while (it.hasNext()) {
                                            try {
                                                C0002A1.m20i(obj5, (String) it.next(), "");
                                                C0413Wf c0413Wf3 = C0413Wf.f1577a;
                                            } catch (Throwable th8) {
                                                C0920xd.m2206a(th8);
                                            }
                                        }
                                        try {
                                            C0002A1.m20i(obj5, "field_msgType", "1");
                                            C0413Wf c0413Wf4 = C0413Wf.f1577a;
                                            break;
                                        } catch (Throwable th9) {
                                            C0920xd.m2206a(th9);
                                        }
                                        try {
                                            C0002A1.m12a(obj5, "setDigest", "");
                                            break;
                                        } catch (Throwable th10) {
                                            C0920xd.m2206a(th10);
                                        }
                                        c0816s4.m1904l(view2);
                                        c0816s4.m1905m(view2);
                                        return obj2;
                                    }
                                    obj = thisObject2;
                                    Class<?> cls6 = obj5.getClass();
                                    StringBuilder sb = new StringBuilder();
                                    obj2 = objProceed2;
                                    int i7 = i;
                                    Class<?> superclass4 = cls6;
                                    while (superclass4 != null) {
                                        try {
                                        } catch (Throwable th11) {
                                            th = th11;
                                            objM2206a2 = C0920xd.m2206a(th);
                                            if (objM2206a2 instanceof C0901wd.a) {
                                            }
                                            C0631i9.m1481d(objM2206a2, "getOrDefault(...)");
                                            String str6 = "onBindVH adapter=" + obj.getClass().getName() + " pos=" + iIntValue + " item=" + obj5.getClass().getName() + " chatUser=" + strM1895a + " fields=[" + ((String) objM2206a2) + "]";
                                            C0631i9.m1482e(str6, "msg");
                                            C0908x1.m2194b("[ConvRV] ".concat(str6));
                                            if (strM1895a != null) {
                                            }
                                        }
                                        if (superclass4.equals(cls2) || i7 >= 3) {
                                            objM2206a2 = sb.toString();
                                            if (objM2206a2 instanceof C0901wd.a) {
                                                objM2206a2 = "DUMP_FAIL";
                                            }
                                            C0631i9.m1481d(objM2206a2, "getOrDefault(...)");
                                            String str62 = "onBindVH adapter=" + obj.getClass().getName() + " pos=" + iIntValue + " item=" + obj5.getClass().getName() + " chatUser=" + strM1895a + " fields=[" + ((String) objM2206a2) + "]";
                                            C0631i9.m1482e(str62, "msg");
                                            C0908x1.m2194b("[ConvRV] ".concat(str62));
                                            if (strM1895a != null) {
                                            }
                                        } else {
                                            C0112G1 c0112g1M2122I2 = C0889w1.m2122I(superclass4.getDeclaredFields());
                                            while (c0112g1M2122I2.hasNext()) {
                                                int i8 = i7;
                                                Field field3 = (Field) c0112g1M2122I2.next();
                                                if (Modifier.isStatic(field3.getModifiers())) {
                                                    i7 = i8;
                                                } else {
                                                    Class<?> cls7 = superclass4;
                                                    field3.setAccessible(true);
                                                    try {
                                                        objM2206a3 = field3.get(obj5);
                                                    } catch (Throwable th12) {
                                                        objM2206a3 = C0920xd.m2206a(th12);
                                                    }
                                                    if (objM2206a3 instanceof C0901wd.a) {
                                                        objM2206a3 = null;
                                                    }
                                                    if (objM2206a3 == null) {
                                                        str = "null";
                                                    } else if (objM2206a3 instanceof String) {
                                                        str = str5 + C0053Ce.m143X((String) objM2206a3, 30) + str5;
                                                    } else {
                                                        field = field3;
                                                        str = objM2206a3.getClass().getSimpleName() + "@" + System.identityHashCode(objM2206a3);
                                                        sb.append(" " + cls7.getSimpleName() + "." + field.getName() + "=" + str);
                                                        i7 = i8;
                                                        superclass4 = cls7;
                                                        str5 = str5;
                                                        cls2 = cls2;
                                                    }
                                                    field = field3;
                                                    sb.append(" " + cls7.getSimpleName() + "." + field.getName() + "=" + str);
                                                    i7 = i8;
                                                    superclass4 = cls7;
                                                    str5 = str5;
                                                    cls2 = cls2;
                                                }
                                                break;
                                            }
                                            superclass4 = superclass4.getSuperclass();
                                            i7++;
                                            str5 = str5;
                                            cls2 = cls2;
                                        }
                                    }
                                    objM2206a2 = sb.toString();
                                    if (objM2206a2 instanceof C0901wd.a) {
                                    }
                                    C0631i9.m1481d(objM2206a2, "getOrDefault(...)");
                                    String str622 = "onBindVH adapter=" + obj.getClass().getName() + " pos=" + iIntValue + " item=" + obj5.getClass().getName() + " chatUser=" + strM1895a + " fields=[" + ((String) objM2206a2) + "]";
                                    C0631i9.m1482e(str622, "msg");
                                    C0908x1.m2194b("[ConvRV] ".concat(str622));
                                    if (strM1895a != null) {
                                    }
                                }
                            }
                        }
                    }
                }
                return objProceed2;
            default:
                C0631i9.m1482e(chain, "c");
                return c0816s4.m1896b(chain);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C0759p4(C0816s4 c0816s4, C0173J8 c0173j8) {
        this.f2984a = 2;
        this.f2985b = c0816s4;
    }
}
