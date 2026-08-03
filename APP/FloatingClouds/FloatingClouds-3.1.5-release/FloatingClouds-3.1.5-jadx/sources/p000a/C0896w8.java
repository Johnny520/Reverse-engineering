package p000a;

import android.content.Context;
import android.database.Cursor;
import android.widget.BaseAdapter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import p000a.C0186K3;
import top.mmjz.floatingclouds.bean.MaskItemBean;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.w8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0896w8 implements IPlugin {

    /* JADX INFO: renamed from: a */
    public final WeakHashMap<Cursor, C0322Re> f3498a = new WeakHashMap<>();

    /* JADX INFO: renamed from: a */
    public static int m2180a(Object obj, HashSet hashSet) {
        int iM2181b = 0;
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            C0112G1 c0112g1M2122I = C0889w1.m2122I(superclass.getDeclaredFields());
            while (c0112g1M2122I.hasNext()) {
                Field field = (Field) c0112g1M2122I.next();
                if (List.class.isAssignableFrom(field.getType())) {
                    field.setAccessible(true);
                    Object obj2 = field.get(obj);
                    List list = C0198Kf.m549b(obj2) ? (List) obj2 : null;
                    if (list != null) {
                        iM2181b += m2181b(list, hashSet);
                    }
                }
            }
        }
        return iM2181b;
    }

    /* JADX INFO: renamed from: b */
    public static int m2181b(List list, HashSet hashSet) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
                C0631i9.m1481d(setNewSetFromMap, "newSetFromMap(...)");
                if (m2183d(next, hashSet, 0, setNewSetFromMap)) {
                    it.remove();
                    i++;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2182c() {
        C0186K3.f638a.getClass();
        return C0186K3.a.m511l() && C0186K3.a.m508i().f2442l && !C0186K3.a.m505f().isEmpty();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m2183d(Object obj, HashSet hashSet, int i, Set set) {
        if (obj != null && i <= 3 && set.add(obj)) {
            if (obj instanceof String) {
                return hashSet.contains(obj);
            }
            if (obj instanceof CharSequence) {
                return hashSet.contains(obj.toString());
            }
            if (obj instanceof Object[]) {
                for (Object obj2 : (Object[]) obj) {
                    if (m2183d(obj2, hashSet, i + 1, set)) {
                        return true;
                    }
                }
            } else if (obj instanceof Iterable) {
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    if (m2183d(it.next(), hashSet, i + 1, set)) {
                        return true;
                    }
                }
            } else {
                String name = obj.getClass().getName();
                if (!C0015Ae.m49H(name, "java.", false) && !C0015Ae.m49H(name, "android.", false) && !C0015Ae.m49H(name, "kotlin.", false) && !C0015Ae.m49H(name, "androidx.", false)) {
                    for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                        C0112G1 c0112g1M2122I = C0889w1.m2122I(superclass.getDeclaredFields());
                        while (c0112g1M2122I.hasNext()) {
                            Field field = (Field) c0112g1M2122I.next();
                            if (!Modifier.isStatic(field.getModifiers()) && !field.getType().isPrimitive()) {
                                try {
                                    field.setAccessible(true);
                                    Object obj3 = field.get(obj);
                                    if (obj3 != null && m2183d(obj3, hashSet, i + 1, set)) {
                                        return true;
                                    }
                                } catch (Throwable unused) {
                                    continue;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static HashSet m2184e() {
        C0186K3.f638a.getClass();
        ArrayList arrayListM505f = C0186K3.a.m505f();
        ArrayList arrayList = new ArrayList(C0758p3.m1800g0(arrayListM505f, 10));
        Iterator it = arrayListM505f.iterator();
        while (it.hasNext()) {
            arrayList.add(((MaskItemBean) it.next()).getMaskId());
        }
        return C0834t3.m1957u0(arrayList);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:0|2|(1:4)(5:5|(5:7|(3:9|(2:11|174)(1:175)|12)|173|(2:14|171)(1:172)|15)|170|16|(1:18)(23:19|(8:22|150|23|177|24|179|178|20)|176|27|(1:29)|31|(1:33)(4:143|34|(1:36)(1:39)|142)|42|(1:44)(8:45|132|46|47|(1:(3:145|49|169)(2:168|52))|(1:54)|57|58)|60|(1:62)(4:148|63|(1:65)(1:68)|147)|71|(6:138|73|74|140|75|82)(1:83)|84|(8:86|136|87|(1:89)(1:90)|91|(1:93)(1:94)|95|(1:97))(3:100|(1:102)|103)|134|104|(4:107|(3:154|109|158)(4:153|(3:112|(2:113|(2:115|(2:167|165)(3:164|119|162))(0))|122)|160|(1:155)(1:157))|156|105)|152|(1:125)|(1:129)|130|131))|30|31|(0)(0)|42|(0)(0)|60|(0)(0)|71|(0)(0)|84|(0)(0)|134|104|(1:105)|152|(0)|(0)|130|131) */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0361, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x037a, code lost:
    
        p000a.C0908x1.m2193a(java.util.Arrays.copyOf(new java.lang.Object[]{"[HideSnsInteraction] snsMsg FAILED", r0}, 2));
        r9 = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02e1 A[Catch: all -> 0x0361, TryCatch #1 {all -> 0x0361, blocks: (B:104:0x02ca, B:105:0x02db, B:107:0x02e1, B:112:0x02f4, B:113:0x02fc, B:115:0x0302, B:117:0x0312, B:119:0x031e, B:122:0x0363, B:125:0x036c), top: B:134:0x02ca }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x036c A[Catch: all -> 0x0361, TRY_LEAVE, TryCatch #1 {all -> 0x0361, blocks: (B:104:0x02ca, B:105:0x02db, B:107:0x02e1, B:112:0x02f4, B:113:0x02fc, B:115:0x0302, B:117:0x0312, B:119:0x031e, B:122:0x0363, B:125:0x036c), top: B:134:0x02ca }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0184 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0224  */
    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleHook(C0173J8 c0173j8) {
        Class<?> cls;
        Class<?> cls2;
        Executable declaredMethod;
        Class<?> cls3;
        int i;
        Context context;
        Class<?> cls4;
        int i2;
        int i3;
        C0631i9.m1482e(c0173j8, "session");
        boolean z = C0088Ed.f269a;
        Class<?> cls5 = C0088Ed.f271c;
        if (cls5 == null) {
            C0908x1.m2197e(Arrays.copyOf(new Object[]{"[HideSnsInteraction] ctor: CommentListAdapter cls NULL"}, 1));
        } else {
            Constructor<?>[] declaredConstructors = cls5.getDeclaredConstructors();
            C0631i9.m1481d(declaredConstructors, "getDeclaredConstructors(...)");
            ArrayList<Executable> arrayList = new ArrayList();
            for (Constructor<?> constructor : declaredConstructors) {
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                int i4 = 0;
                for (Class<?> cls6 : parameterTypes) {
                    if (List.class.isAssignableFrom(cls6)) {
                        i4++;
                    }
                }
                if (i4 >= 1) {
                    arrayList.add(constructor);
                }
            }
            if (!arrayList.isEmpty()) {
                int i5 = 0;
                for (Executable executable : arrayList) {
                    try {
                        C0631i9.m1479b(executable);
                        c0173j8.m470f(executable).intercept(new C0877v8(this, 0));
                        i5++;
                    } catch (Throwable th) {
                        C0908x1.m2197e(Arrays.copyOf(new Object[]{"[HideSnsInteraction] ctor hook fail", th}, 2));
                    }
                }
                C0908x1.m2194b(Arrays.copyOf(new Object[]{C0944z.m2225e("[HideSnsInteraction] OK ctor hooks=", i5)}, 1));
                int i6 = i5 > 0 ? 1 : 0;
                boolean z2 = C0088Ed.f269a;
                cls = C0088Ed.f270b;
                if (cls != null) {
                    C0908x1.m2197e(Arrays.copyOf(new Object[]{"[HideSnsInteraction] initView: snsCommentDetailUICls NULL"}, 1));
                } else {
                    try {
                        if (C0173J8.m467e(c0173j8, cls.getName(), "initView", new C0687l8(this, 7)) != null) {
                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"[HideSnsInteraction] OK initView"}, 1));
                            i6++;
                        } else {
                            C0908x1.m2197e(Arrays.copyOf(new Object[]{"[HideSnsInteraction] initView NOT FOUND"}, 1));
                        }
                    } catch (Throwable th2) {
                        C0908x1.m2193a(Arrays.copyOf(new Object[]{"[HideSnsInteraction] initView FAILED", th2}, 2));
                    }
                }
                boolean z3 = C0088Ed.f269a;
                cls2 = C0088Ed.f271c;
                if (cls2 != null) {
                    C0908x1.m2197e(Arrays.copyOf(new Object[]{"[HideSnsInteraction] ndc: CommentListAdapter cls NULL"}, 1));
                } else {
                    int i7 = 0;
                    try {
                        Class[] clsArr = new Class[0];
                        Class<?> superclass = cls2;
                        while (true) {
                            if (superclass == null) {
                                declaredMethod = null;
                                break;
                            }
                            try {
                                declaredMethod = superclass.getDeclaredMethod("notifyDataSetChanged", (Class[]) Arrays.copyOf(clsArr, i7));
                                declaredMethod.setAccessible(true);
                                break;
                            } catch (NoSuchMethodException unused) {
                                superclass = superclass.getSuperclass();
                                i7 = 0;
                            }
                        }
                        if (declaredMethod == null) {
                            declaredMethod = BaseAdapter.class.getDeclaredMethod("notifyDataSetChanged", null);
                        }
                        C0631i9.m1479b(declaredMethod);
                        c0173j8.m470f(declaredMethod).intercept(new C0700m2(this, cls2));
                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"[HideSnsInteraction] OK ndc"}, 1));
                        i6++;
                    } catch (Throwable th3) {
                        C0908x1.m2193a(Arrays.copyOf(new Object[]{"[HideSnsInteraction] ndc FAILED", th3}, 2));
                    }
                }
                boolean z4 = C0088Ed.f269a;
                cls3 = C0088Ed.f270b;
                if (cls3 != null) {
                    C0908x1.m2197e(Arrays.copyOf(new Object[]{"[HideSnsInteraction] b8: snsCommentDetailUICls NULL"}, 1));
                } else {
                    try {
                        ArrayList arrayListM464b = C0173J8.m464b(c0173j8, cls3.getName(), new C0687l8(12), new C0687l8(this, 13));
                        if (arrayListM464b.isEmpty()) {
                            C0908x1.m2197e(Arrays.copyOf(new Object[]{"[HideSnsInteraction] b8 NOT FOUND"}, 1));
                        } else {
                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"[HideSnsInteraction] OK b8 hooks=" + arrayListM464b.size()}, 1));
                            i6++;
                        }
                    } catch (Throwable th4) {
                        C0908x1.m2193a(Arrays.copyOf(new Object[]{"[HideSnsInteraction] b8 FAILED", th4}, 2));
                    }
                }
                int i8 = -1;
                if (C0021B1.f64a != -1) {
                    try {
                        context = C0889w1.f3488p;
                        C0631i9.m1479b(context);
                        i = 0;
                    } catch (Exception e) {
                        e = e;
                        i = 0;
                    }
                    try {
                        i8 = context.getPackageManager().getPackageInfo("com.tencent.mm", 0).versionCode;
                    } catch (Exception e2) {
                        e = e2;
                        C0908x1.m2193a(Arrays.copyOf(new Object[]{e}, 1));
                    }
                    C0021B1.f64a = i8;
                } else {
                    i = 0;
                }
                C0578fd c0578fd = new C0578fd(C0021B1.f64a, c0173j8.f608a);
                C0616hd.f2278a.getClass();
                C0597gd c0597gdM1467a = C0616hd.m1467a("sns_info_model", c0578fd);
                cls4 = c0597gdM1467a.f2209b;
                if (cls4 == null) {
                    String name = cls4.getName();
                    try {
                        if (C0173J8.m464b(c0173j8, name, new C0687l8(8), new C0687l8(this, 9)).isEmpty()) {
                            C0908x1.m2197e(Arrays.copyOf(new Object[]{"[HideSnsInteraction] timeline: getCommentList not found on ".concat(name)}, 1));
                            i3 = i;
                        } else {
                            i3 = 1;
                        }
                        if (C0173J8.m464b(c0173j8, name, new C0687l8(10), new C0687l8(this, 11)).isEmpty()) {
                            C0908x1.m2197e(Arrays.copyOf(new Object[]{"[HideSnsInteraction] timeline: P0 not found on ".concat(name)}, 1));
                        } else {
                            i3++;
                        }
                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"[HideSnsInteraction] OK timeline model hooks ok=" + i3 + "/2 (" + name + ")"}, 1));
                        if (i3 > 0) {
                            i6++;
                        }
                    } catch (Throwable th5) {
                        C0908x1.m2193a(Arrays.copyOf(new Object[]{"[HideSnsInteraction] timeline FAILED", th5}, 2));
                    }
                } else {
                    C0647j6 c0647j6 = c0597gdM1467a.f2210c;
                    C0908x1.m2197e(Arrays.copyOf(new Object[]{C0944z.m2231k("[HideSnsInteraction] sns_info_model resolve FAILED: ", c0647j6 != null ? c0647j6.f2390c : null)}, 1));
                }
                i2 = i;
                for (String str : C0739o3.m1757d0("com.tencent.mm.plugin.sns.ui.rm", "com.tencent.mm.plugin.sns.ui.bm")) {
                    Class clsM13b = C0002A1.m13b(c0173j8.f608a, str);
                    if (clsM13b != null) {
                        while (clsM13b != null && i2 == 0) {
                            C0112G1 c0112g1M2122I = C0889w1.m2122I(clsM13b.getDeclaredMethods());
                            while (true) {
                                if (c0112g1M2122I.hasNext()) {
                                    Method method = (Method) c0112g1M2122I.next();
                                    Class<?>[] parameterTypes2 = method.getParameterTypes();
                                    C0631i9.m1481d(parameterTypes2, "getParameterTypes(...)");
                                    if (parameterTypes2.length == 0 && Cursor.class.isAssignableFrom(method.getReturnType())) {
                                        c0173j8.m470f(method).intercept(new C0700m2(6, this));
                                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"[HideSnsInteraction] OK snsMsg cursor hook via " + str + " -> " + clsM13b.getName() + "." + method.getName()}, 1));
                                        i2 = 1;
                                        break;
                                    }
                                }
                            }
                            clsM13b = clsM13b.getSuperclass();
                        }
                        if (i2 != 0) {
                            break;
                        }
                    }
                }
                if (i2 == 0) {
                    C0908x1.m2197e(Arrays.copyOf(new Object[]{"[HideSnsInteraction] snsMsg: no cursor method found on rm/bm"}, 1));
                }
                if (i2 != 0) {
                    i6++;
                }
                C0908x1.m2194b(Arrays.copyOf(new Object[]{C0944z.m2223c(i6, "[HideSnsInteraction] registered ", "/6 OK")}, 1));
                ConcurrentHashMap<String, C0101F8> concurrentHashMap = C0083E8.f263a;
                C0083E8.m209b("F007", "snsInteraction", "registered=" + i6 + "/6");
            }
            C0908x1.m2197e(Arrays.copyOf(new Object[]{"[HideSnsInteraction] ctor: no List-param ctor"}, 1));
        }
        boolean z22 = C0088Ed.f269a;
        cls = C0088Ed.f270b;
        if (cls != null) {
        }
        boolean z32 = C0088Ed.f269a;
        cls2 = C0088Ed.f271c;
        if (cls2 != null) {
        }
        boolean z42 = C0088Ed.f269a;
        cls3 = C0088Ed.f270b;
        if (cls3 != null) {
        }
        int i82 = -1;
        if (C0021B1.f64a != -1) {
        }
        C0578fd c0578fd2 = new C0578fd(C0021B1.f64a, c0173j8.f608a);
        C0616hd.f2278a.getClass();
        C0597gd c0597gdM1467a2 = C0616hd.m1467a("sns_info_model", c0578fd2);
        cls4 = c0597gdM1467a2.f2209b;
        if (cls4 == null) {
        }
        i2 = i;
        while (r0.hasNext()) {
        }
        if (i2 == 0) {
        }
        if (i2 != 0) {
        }
        C0908x1.m2194b(Arrays.copyOf(new Object[]{C0944z.m2223c(i6, "[HideSnsInteraction] registered ", "/6 OK")}, 1));
        ConcurrentHashMap<String, C0101F8> concurrentHashMap2 = C0083E8.f263a;
        C0083E8.m209b("F007", "snsInteraction", "registered=" + i6 + "/6");
    }
}
