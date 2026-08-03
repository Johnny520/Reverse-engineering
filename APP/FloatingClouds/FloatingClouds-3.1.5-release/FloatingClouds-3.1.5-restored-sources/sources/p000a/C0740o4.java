package p000a;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p000a.C0186K3;
import p000a.C0901wd;
import top.mmjz.floatingclouds.bean.MaskItemBean;

/* JADX INFO: renamed from: a.o4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0740o4 implements XposedInterface.Hooker {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2923a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2924b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2925c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0740o4(Object obj, int i, Object obj2) {
        this.f2923a = i;
        this.f2924b = obj;
        this.f2925c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00cf  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m1760a(XposedInterface.Chain chain) {
        Object objM2206a;
        boolean zBooleanValue;
        boolean zM1456f;
        ClassLoader classLoader = (ClassLoader) this.f2924b;
        C0611h8 c0611h8 = (C0611h8) this.f2925c;
        C0631i9.m1482e(chain, "chain");
        boolean z = false;
        Object obj = chain.getArgs().get(0);
        if (obj != null) {
            int i = -1;
            if (C0021B1.f64a == -1) {
                try {
                    Context context = C0889w1.f3488p;
                    C0631i9.m1479b(context);
                    i = context.getPackageManager().getPackageInfo("com.tencent.mm", 0).versionCode;
                } catch (Exception e) {
                    C0908x1.m2193a(Arrays.copyOf(new Object[]{e}, 1));
                }
                C0021B1.f64a = i;
            }
            C0578fd c0578fd = new C0578fd(C0021B1.f64a, classLoader);
            C0616hd.f2278a.getClass();
            C0597gd c0597gdM1467a = C0616hd.m1467a("F004_contact_adapter_locator", c0578fd);
            Class<?> cls = c0597gdM1467a.f2209b;
            ActivityC0422X6 activityC0422X6 = null;
            String name = cls != null ? cls.getName() : null;
            if (name == null || !obj.getClass().getName().equals(name)) {
                Object thisObject = chain.getThisObject();
                View view = thisObject instanceof View ? (View) thisObject : null;
                if (view == null) {
                    zBooleanValue = false;
                } else {
                    try {
                        Context context2 = view.getContext();
                        C0631i9.m1481d(context2, "getContext(...)");
                        while (true) {
                            if (context2 == null) {
                                break;
                            }
                            if (context2 instanceof ActivityC0422X6) {
                                activityC0422X6 = (ActivityC0422X6) context2;
                                break;
                            }
                            ContextWrapper contextWrapper = context2 instanceof ContextWrapper ? (ContextWrapper) context2 : null;
                            context2 = contextWrapper != null ? contextWrapper.getBaseContext() : null;
                        }
                        if (activityC0422X6 == null) {
                            zM1456f = false;
                        } else {
                            AbstractC0553e7 supportFragmentManager = activityC0422X6.getSupportFragmentManager();
                            C0631i9.m1481d(supportFragmentManager, "getSupportFragmentManager(...)");
                            zM1456f = C0611h8.m1456f(c0611h8, view, supportFragmentManager);
                        }
                        objM2206a = Boolean.valueOf(zM1456f);
                    } catch (Throwable th) {
                        objM2206a = C0920xd.m2206a(th);
                    }
                    Object obj2 = Boolean.FALSE;
                    if (objM2206a instanceof C0901wd.a) {
                        objM2206a = obj2;
                    }
                    zBooleanValue = ((Boolean) objM2206a).booleanValue();
                }
                if (zBooleanValue && C0611h8.m1457g(obj)) {
                    z = true;
                }
                if (z) {
                    String strM2227g = (name == null || !obj.getClass().getName().equals(name)) ? "HOST_FRAGMENT" : C0944z.m2227g("ENGINE(", name, ")");
                    c0611h8.f2263e = chain.getThisObject();
                    c0611h8.f2262d = obj;
                    String name2 = obj.getClass().getName();
                    EnumC0521cd enumC0521cd = c0597gdM1467a.f2211d;
                    StringBuilder sbM2229i = C0944z.m2229i("HideContactList: captured contact adapter via setAdapter -> ", name2, " via=", strM2227g, " path=");
                    sbM2229i.append(enumC0521cd);
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{sbM2229i.toString()}, 1));
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0221M2(11, c0611h8), 60L);
                }
            }
        }
        return chain.proceed();
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x026b, code lost:
    
        r19 = r10;
        r5 = r14.getClass();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0273, code lost:
    
        if (r5 == null) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0279, code lost:
    
        if (r5.equals(r7) != false) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x027c, code lost:
    
        if (r8 >= 2) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x027e, code lost:
    
        r10 = p000a.C0889w1.m2122I(r5.getDeclaredFields());
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x028a, code lost:
    
        if (r10.hasNext() == false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x028c, code lost:
    
        r0 = (java.lang.reflect.Field) r10.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x029a, code lost:
    
        if (java.lang.reflect.Modifier.isStatic(r0.getModifiers()) != false) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02a4, code lost:
    
        if (r0.getType().isPrimitive() != false) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02a6, code lost:
    
        r20 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02b2, code lost:
    
        if (p000a.C0631i9.m1478a(r0.getType(), java.lang.String.class) == false) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02b4, code lost:
    
        r5 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02b7, code lost:
    
        r0.setAccessible(r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02bc, code lost:
    
        r0 = r0.get(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02c1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02c2, code lost:
    
        r0 = p000a.C0920xd.m2206a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x037d, code lost:
    
        r21 = r6;
        r22 = r7;
        r5 = r5.getSuperclass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0387, code lost:
    
        r8 = r8 + 1;
        r6 = r21;
        r7 = r22;
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0393, code lost:
    
        r21 = r6;
        r0 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0331 A[Catch: all -> 0x0342, TryCatch #6 {all -> 0x0342, blocks: (B:161:0x02e8, B:165:0x02f3, B:166:0x02fb, B:168:0x0301, B:170:0x0314, B:175:0x0324, B:180:0x0331, B:182:0x0335, B:184:0x033e, B:187:0x0344, B:189:0x034e, B:191:0x0352, B:193:0x035b, B:174:0x0320, B:195:0x0361, B:198:0x037d, B:171:0x031a), top: B:378:0x02e8, inners: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03bc A[PHI: r16 r21
  0x03bc: PHI (r16v6 java.lang.Object) = (r16v3 java.lang.Object), (r16v3 java.lang.Object), (r16v7 java.lang.Object) binds: [B:208:0x03a9, B:210:0x03af, B:81:0x01c9] A[DONT_GENERATE, DONT_INLINE]
  0x03bc: PHI (r21v10 java.lang.Object) = (r21v3 java.lang.Object), (r21v3 java.lang.Object), (r21v11 java.lang.Object) binds: [B:208:0x03a9, B:210:0x03af, B:81:0x01c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:459:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object intercept(XposedInterface.Chain chain) {
        Object obj;
        Object objM2206a;
        Throwable thM2189a;
        String strM1895a;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object objM2206a2;
        String str;
        Class<?> superclass;
        int i;
        Class<Object> cls;
        Class<?> superclass2;
        Class<?> cls2;
        Object objM2206a3;
        int i2;
        C0112G1 c0112g1M2122I;
        int i3;
        Field field;
        Object objM2206a4;
        Object objM2206a5;
        Method method;
        int i4 = 3;
        Object obj6 = null;
        int i5 = 0;
        boolean z = true;
        switch (this.f2923a) {
            case 0:
                C0816s4 c0816s4 = (C0816s4) this.f2924b;
                C0173J8 c0173j8 = (C0173J8) this.f2925c;
                C0631i9.m1482e(chain, "chain");
                Object objProceed = chain.proceed();
                Object obj7 = chain.getArgs().get(0);
                if (obj7 != null) {
                    String name = obj7.getClass().getName();
                    C0908x1.m2194b("[SetAdapter] ".concat(name));
                    if (!C0015Ae.m49H(name, "android.", false) && !C0015Ae.m49H(name, "androidx.", false) && !C0015Ae.m49H(name, "java.", false) && !C0015Ae.m49H(name, "com.tencent.mm.ui.contact", false) && !C0015Ae.m49H(name, "com.tencent.mm.plugin.fts", false)) {
                        if (C0889w1.f3490r == null || C0889w1.f3491s == null) {
                            c0816s4.getClass();
                            try {
                                C0816s4.m1889A(new HashSet(), obj7, 0);
                                C0413Wf c0413Wf = C0413Wf.f1577a;
                            } catch (Throwable th) {
                                C0920xd.m2206a(th);
                            }
                        }
                        List<String> list = c0816s4.f3237d;
                        if (list == null || !list.contains(name)) {
                            obj = objProceed;
                        } else {
                            C0915x8 c0915x8 = C0915x8.f3530a;
                            if (!C0915x8.m2203a()) {
                                try {
                                    Field declaredField = obj7.getClass().getDeclaredField("e");
                                    declaredField.setAccessible(true);
                                    Object obj8 = declaredField.get(obj7);
                                    ArrayList arrayList = obj8 instanceof ArrayList ? (ArrayList) obj8 : null;
                                    if (arrayList == null || arrayList.isEmpty()) {
                                        obj = objProceed;
                                    } else {
                                        C0186K3.f638a.getClass();
                                        ArrayList arrayListM505f = C0186K3.a.m505f();
                                        ArrayList arrayList2 = new ArrayList(C0758p3.m1800g0(arrayListM505f, 10));
                                        Iterator it = arrayListM505f.iterator();
                                        while (it.hasNext()) {
                                            arrayList2.add(((MaskItemBean) it.next()).getMaskId());
                                        }
                                        HashSet hashSet = new HashSet(arrayList2);
                                        String str2 = "lr.f1: " + arrayList.size() + " items, masked=" + hashSet.size();
                                        C0631i9.m1482e(str2, "msg");
                                        C0908x1.m2194b("[ConvRV] " + str2);
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it2 = arrayList.iterator();
                                        C0631i9.m1481d(it2, "iterator(...)");
                                        while (it2.hasNext()) {
                                            Object next = it2.next();
                                            if (next != null) {
                                                try {
                                                    Class<?> superclass3 = next.getClass();
                                                    strM1895a = null;
                                                    while (true) {
                                                        if (superclass3 != null) {
                                                            try {
                                                                Field declaredField2 = superclass3.getDeclaredField("a");
                                                                obj = objProceed;
                                                                try {
                                                                    try {
                                                                        declaredField2.setAccessible(true);
                                                                        obj2 = declaredField2.get(next);
                                                                    } catch (Exception unused) {
                                                                        continue;
                                                                    }
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    C0920xd.m2206a(th);
                                                                }
                                                            } catch (Exception unused2) {
                                                                obj = objProceed;
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                obj = objProceed;
                                                            }
                                                            if (obj2 == null || (strM1895a = c0816s4.m1895a(obj2)) == null) {
                                                                superclass3 = superclass3.getSuperclass();
                                                                objProceed = obj;
                                                            }
                                                        } else {
                                                            obj = objProceed;
                                                        }
                                                        break;
                                                    }
                                                    C0413Wf c0413Wf2 = C0413Wf.f1577a;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    obj = objProceed;
                                                    strM1895a = null;
                                                }
                                                String str3 = strM1895a;
                                                if (str3 != null) {
                                                    try {
                                                        if (hashSet.contains(str3)) {
                                                            arrayList3.add(next);
                                                            String str4 = "lr.f1 HIDE: " + ((Object) str3);
                                                            C0631i9.m1482e(str4, "msg");
                                                            C0908x1.m2194b("[ConvRV] " + str4);
                                                        }
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        objM2206a = C0920xd.m2206a(th);
                                                        thM2189a = C0901wd.m2189a(objM2206a);
                                                        if (thM2189a != null) {
                                                        }
                                                        if (!c0816s4.f3254u.contains(obj7.getClass())) {
                                                        }
                                                    }
                                                }
                                                objProceed = obj;
                                            }
                                            break;
                                        }
                                        obj = objProceed;
                                        if (!arrayList3.isEmpty()) {
                                            if ((arrayList instanceof InterfaceC0783q9) && !(arrayList instanceof InterfaceC0802r9)) {
                                                C0198Kf.m550c(arrayList, "kotlin.collections.MutableCollection");
                                                throw null;
                                            }
                                            arrayList.removeAll(arrayList3);
                                            obj7.getClass().getMethod("notifyDataSetChanged", null).invoke(obj7, null);
                                        }
                                    }
                                    objM2206a = C0413Wf.f1577a;
                                } catch (Throwable th6) {
                                    th = th6;
                                    obj = objProceed;
                                }
                                thM2189a = C0901wd.m2189a(objM2206a);
                                if (thM2189a != null) {
                                    C0908x1.m2193a("[ConvRV] lr.f1 process fail", thM2189a);
                                }
                            }
                        }
                        if (!c0816s4.f3254u.contains(obj7.getClass())) {
                            return obj;
                        }
                        c0816s4.f3254u.add(obj7.getClass());
                        try {
                            Method[] methods = obj7.getClass().getMethods();
                            C0631i9.m1481d(methods, "getMethods(...)");
                            ArrayList arrayList4 = new ArrayList();
                            for (Method method2 : methods) {
                                if (C0631i9.m1478a(method2.getName(), "onBindViewHolder") && method2.getParameterTypes().length == 2) {
                                    arrayList4.add(method2);
                                }
                            }
                            if (arrayList4.isEmpty()) {
                                String str5 = "onBindViewHolder NOT found in " + obj7.getClass().getName() + " hierarchy";
                                C0631i9.m1482e(str5, "msg");
                                C0908x1.m2194b("[ConvRV] " + str5);
                            } else {
                                Method method3 = (Method) arrayList4.get(0);
                                String str6 = "hooking onBindViewHolder in " + method3.getDeclaringClass().getName() + " for adapter " + obj7.getClass().getName();
                                C0631i9.m1482e(str6, "msg");
                                C0908x1.m2194b("[ConvRV] " + str6);
                                c0173j8.m470f(method3).intercept(new C0759p4(c0816s4, 1));
                            }
                            C0413Wf c0413Wf3 = C0413Wf.f1577a;
                        } catch (Throwable th7) {
                            C0920xd.m2206a(th7);
                        }
                        try {
                            Method[] methods2 = obj7.getClass().getMethods();
                            C0631i9.m1481d(methods2, "getMethods(...)");
                            ArrayList arrayList5 = new ArrayList();
                            for (Method method4 : methods2) {
                                if (C0631i9.m1478a(method4.getName(), "submitList") && method4.getParameterTypes().length >= 1 && List.class.isAssignableFrom(method4.getParameterTypes()[0])) {
                                    arrayList5.add(method4);
                                }
                            }
                            if (!arrayList5.isEmpty()) {
                                Method method5 = (Method) arrayList5.get(0);
                                C0631i9.m1479b(method5);
                                c0173j8.m470f(method5).intercept(new C0740o4(obj7, c0816s4));
                                String str7 = "hooked submitList on " + obj7.getClass().getName();
                                C0631i9.m1482e(str7, "msg");
                                C0908x1.m2194b("[ConvRV] " + str7);
                            }
                            C0413Wf c0413Wf4 = C0413Wf.f1577a;
                            return obj;
                        } catch (Throwable th8) {
                            C0920xd.m2206a(th8);
                            return obj;
                        }
                    }
                    break;
                }
                return objProceed;
            case 1:
                obj3 = this.f2925c;
                C0631i9.m1482e(chain, "slChain");
                Object obj9 = chain.getArgs().get(0);
                List list2 = obj9 instanceof List ? (List) obj9 : null;
                if (list2 == null) {
                    return chain.proceed();
                }
                C0186K3.f638a.getClass();
                if (!C0186K3.a.m511l() || !C0186K3.a.m508i().f2444n) {
                    return chain.proceed();
                }
                if (C0186K3.a.m505f().isEmpty()) {
                    return chain.proceed();
                }
                C0915x8 c0915x82 = C0915x8.f3530a;
                if (C0915x8.m2203a()) {
                    return chain.proceed();
                }
                ArrayList arrayListM505f2 = C0186K3.a.m505f();
                ArrayList arrayList6 = new ArrayList(C0758p3.m1800g0(arrayListM505f2, 10));
                Iterator it3 = arrayListM505f2.iterator();
                while (it3.hasNext()) {
                    arrayList6.add(((MaskItemBean) it3.next()).getMaskId());
                }
                HashSet hashSet2 = new HashSet(arrayList6);
                ArrayList arrayList7 = new ArrayList();
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    if (next2 == null) {
                        obj4 = obj3;
                        obj5 = obj6;
                    } else {
                        ((C0816s4) this.f2924b).getClass();
                        try {
                            superclass = next2.getClass();
                            obj5 = obj6;
                            i = i5;
                        } catch (Throwable th9) {
                            th = th9;
                            obj4 = obj3;
                            obj5 = obj6;
                        }
                        while (true) {
                            cls = Object.class;
                            if (superclass != null) {
                                try {
                                    if (!superclass.equals(cls) && i < i4) {
                                        C0112G1 c0112g1M2122I2 = C0889w1.m2122I(superclass.getDeclaredFields());
                                        while (c0112g1M2122I2.hasNext()) {
                                            Field field2 = (Field) c0112g1M2122I2.next();
                                            if (!Modifier.isStatic(field2.getModifiers())) {
                                                field2.setAccessible(z);
                                                try {
                                                    objM2206a5 = field2.get(next2);
                                                } catch (Throwable th10) {
                                                    objM2206a5 = C0920xd.m2206a(th10);
                                                }
                                                boolean z2 = z;
                                                try {
                                                    if (objM2206a5 instanceof C0901wd.a) {
                                                        objM2206a5 = obj5;
                                                    }
                                                    if (objM2206a5 != null) {
                                                        if ((objM2206a5 instanceof String) && C0943yh.m2221a((String) objM2206a5)) {
                                                            objM2206a2 = (String) objM2206a5;
                                                        } else if (C0631i9.m1478a(field2.getName(), "field_username") && (objM2206a5 instanceof String) && !C0034Be.m101P((CharSequence) objM2206a5)) {
                                                            objM2206a2 = (String) objM2206a5;
                                                        }
                                                    }
                                                    z = z2;
                                                } catch (Throwable th11) {
                                                    th = th11;
                                                    obj4 = obj3;
                                                    objM2206a2 = C0920xd.m2206a(th);
                                                    if (objM2206a2 instanceof C0901wd.a) {
                                                    }
                                                    str = (String) objM2206a2;
                                                    if (str == null) {
                                                        arrayList7.add(next2);
                                                    }
                                                    obj6 = obj5;
                                                    obj3 = obj4;
                                                    i4 = 3;
                                                    i5 = 0;
                                                    z = true;
                                                }
                                                break;
                                            }
                                        }
                                        superclass = superclass.getSuperclass();
                                        i++;
                                        z = z;
                                        i4 = 3;
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    obj4 = obj3;
                                    objM2206a2 = C0920xd.m2206a(th);
                                }
                                if (objM2206a2 instanceof C0901wd.a) {
                                    objM2206a2 = obj5;
                                }
                                str = (String) objM2206a2;
                                if (str == null || !hashSet2.contains(str)) {
                                }
                                obj6 = obj5;
                                obj3 = obj4;
                                i4 = 3;
                                i5 = 0;
                                z = true;
                                break;
                            }
                            break;
                        }
                        obj4 = obj3;
                        if (objM2206a2 instanceof C0901wd.a) {
                        }
                        str = (String) objM2206a2;
                        if (str == null) {
                        }
                        obj6 = obj5;
                        obj3 = obj4;
                        i4 = 3;
                        i5 = 0;
                        z = true;
                    }
                    arrayList7.add(next2);
                    obj6 = obj5;
                    obj3 = obj4;
                    i4 = 3;
                    i5 = 0;
                    z = true;
                }
                Object obj10 = obj3;
                if (arrayList7.size() >= list2.size()) {
                    return chain.proceed();
                }
                String str8 = "submitList FILTER: " + list2.size() + " -> " + arrayList7.size() + " (adapter=" + obj10.getClass().getName() + ")";
                C0631i9.m1482e(str8, "msg");
                C0908x1.m2194b("[ConvRV] ".concat(str8));
                List args = chain.getArgs();
                C0631i9.m1481d(args, "getArgs(...)");
                int size = args.size();
                Object[] objArr = new Object[size];
                int i6 = 0;
                while (i6 < size) {
                    objArr[i6] = i6 == 0 ? arrayList7 : args.get(i6);
                    i6++;
                }
                return chain.proceed(objArr);
            case 2:
                return m1760a(chain);
            case 3:
                C0782q8 c0782q8 = (C0782q8) this.f2924b;
                String str9 = (String) this.f2925c;
                C0631i9.m1482e(chain, "chain");
                Object thisObject = chain.getThisObject();
                Object obj11 = chain.getArgs().get(0);
                chain.proceed();
                try {
                    if (C0782q8.m1826j() && obj11 != null) {
                        String name2 = obj11.getClass().getName();
                        if (name2.equals(str9) && (thisObject instanceof View) && C0631i9.m1478a(C0782q8.m1823a(((View) thisObject).getContext()), "com.tencent.mm.ui.mvvm.MvvmContactListUI")) {
                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"MyPlugin-DexKit: [RecentForward] adapter captured from WxRecyclerView (" + name2 + "), scheduling filter"}, 1));
                            c0782q8.m1835m(obj11);
                            break;
                        }
                    }
                } catch (Throwable th13) {
                    C0908x1.m2197e(Arrays.copyOf(new Object[]{C0944z.m2231k("MyPlugin-DexKit: [RecentForward] setAdapter filter err: ", th13.getMessage())}, 1));
                }
                return null;
            default:
                C0820s8 c0820s8 = (C0820s8) this.f2924b;
                C0173J8 c0173j82 = (C0173J8) this.f2925c;
                C0631i9.m1482e(chain, "chain");
                Object obj12 = chain.getArgs().get(0);
                chain.proceed();
                if (obj12 != null && C0820s8.m1920b()) {
                    String name3 = obj12.getClass().getName();
                    if (C0034Be.m94I(name3, "sns", false) || C0034Be.m94I(name3, "Sns", false)) {
                        c0820s8.f3273a = obj12;
                        if (!c0820s8.f3274b) {
                            c0820s8.f3274b = true;
                            Method[] methods3 = obj12.getClass().getMethods();
                            C0631i9.m1481d(methods3, "getMethods(...)");
                            int length = methods3.length;
                            while (true) {
                                if (i5 < length) {
                                    method = methods3[i5];
                                    if (method.getParameterTypes().length != 2 || !C0631i9.m1478a(method.getParameterTypes()[1], Integer.TYPE)) {
                                        i5++;
                                    }
                                } else {
                                    method = null;
                                }
                            }
                            if (method != null) {
                                method.setAccessible(true);
                                c0173j82.m470f(method).intercept(new C0700m2(3, c0820s8));
                                ConcurrentHashMap<String, C0101F8> concurrentHashMap = C0083E8.f263a;
                                C0083E8.m209b("F006", "timelineBind", obj12.getClass().getSimpleName());
                            }
                        }
                    } else {
                        boolean z3 = C0088Ed.f269a;
                        Class<?> cls3 = C0088Ed.f281m;
                        if (name3.equals(cls3 != null ? cls3.getName() : null)) {
                        }
                    }
                }
                return null;
        }
        if (objM2206a4 instanceof C0901wd.a) {
            objM2206a4 = obj5;
        }
        if (objM2206a4 != null) {
            if ((objM2206a4 instanceof String) && C0943yh.m2221a((String) objM2206a4)) {
                objM2206a2 = (String) objM2206a4;
            } else if (C0631i9.m1478a(field.getName(), "field_username") && (objM2206a4 instanceof String) && !C0034Be.m101P((CharSequence) objM2206a4)) {
                objM2206a2 = (String) objM2206a4;
            }
            if (objM2206a2 instanceof C0901wd.a) {
            }
            str = (String) objM2206a2;
            if (str == null) {
            }
            obj6 = obj5;
            obj3 = obj4;
            i4 = 3;
            i5 = 0;
            z = true;
        }
        i2 = i3;
        c0112g1M2122I = c0112g1;
        Object obj13 = objM2206a3 instanceof C0901wd.a ? obj5 : objM2206a3;
        if (obj13 == null || (obj13 instanceof List) || (obj13 instanceof Object[])) {
            superclass2 = cls2;
        } else {
            Class<?> superclass4 = obj13.getClass();
            obj4 = obj3;
            i2 = 0;
            while (superclass4 != null) {
                try {
                    if (superclass4.equals(cls)) {
                        superclass2 = cls2;
                        obj3 = obj4;
                    } else {
                        Class<Object> cls4 = cls;
                        if (i2 < 2) {
                            c0112g1M2122I = C0889w1.m2122I(superclass4.getDeclaredFields());
                            while (c0112g1M2122I.hasNext()) {
                                i3 = i2;
                                field = (Field) c0112g1M2122I.next();
                                if (Modifier.isStatic(field.getModifiers())) {
                                    i2 = i3;
                                } else {
                                    C0112G1 c0112g1 = c0112g1M2122I;
                                    field.setAccessible(true);
                                    try {
                                        objM2206a4 = field.get(obj13);
                                    } catch (Throwable th14) {
                                        objM2206a4 = C0920xd.m2206a(th14);
                                    }
                                    if (objM2206a4 instanceof C0901wd.a) {
                                    }
                                    if (objM2206a4 != null) {
                                    }
                                    i2 = i3;
                                    c0112g1M2122I = c0112g1;
                                }
                            }
                            superclass4 = superclass4.getSuperclass();
                            i2++;
                            cls = cls4;
                        } else {
                            superclass2 = cls2;
                            obj3 = obj4;
                            cls = cls4;
                        }
                    }
                } catch (Throwable th15) {
                    th = th15;
                    objM2206a2 = C0920xd.m2206a(th);
                }
                if (objM2206a2 instanceof C0901wd.a) {
                }
                str = (String) objM2206a2;
                if (str == null) {
                }
                obj6 = obj5;
                obj3 = obj4;
                i4 = 3;
                i5 = 0;
                z = true;
            }
            superclass2 = cls2;
            obj3 = obj4;
        }
        boolean z4 = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C0740o4(Object obj, C0816s4 c0816s4) {
        this.f2923a = 1;
        this.f2925c = obj;
        this.f2924b = c0816s4;
    }
}
