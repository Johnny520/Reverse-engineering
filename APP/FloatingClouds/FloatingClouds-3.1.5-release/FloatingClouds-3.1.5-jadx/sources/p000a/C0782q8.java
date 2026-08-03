package p000a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;
import p000a.C0186K3;
import p000a.C0582fh;
import p000a.C0901wd;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.q8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0782q8 implements IPlugin {

    /* JADX INFO: renamed from: d */
    public volatile String f3086d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f3087e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f3088f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f3089g;

    /* JADX INFO: renamed from: i */
    public volatile C0173J8 f3091i;

    /* JADX INFO: renamed from: a */
    public volatile String f3083a = "yj5.j";

    /* JADX INFO: renamed from: b */
    public volatile String f3084b = "ri5.j";

    /* JADX INFO: renamed from: c */
    public final Handler f3085c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: h */
    public final ThreadLocal<Boolean> f3090h = new ThreadLocal<>();

    /* JADX INFO: renamed from: j */
    public final Set<Object> f3092j = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: a */
    public static String m1823a(Context context) {
        for (int i = 0; i < 8 && context != null; i++) {
            if (context instanceof Activity) {
                return context.getClass().getName();
            }
            ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
            context = contextWrapper != null ? contextWrapper.getBaseContext() : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static String m1824d(Object obj) {
        C0901wd.a aVarM2206a;
        try {
            for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                if (superclass.equals(Object.class)) {
                    break;
                }
                C0112G1 c0112g1M2122I = C0889w1.m2122I(superclass.getDeclaredFields());
                while (c0112g1M2122I.hasNext()) {
                    Field field = (Field) c0112g1M2122I.next();
                    if (!Modifier.isStatic(field.getModifiers()) && C0631i9.m1478a(field.getType(), String.class)) {
                        field.setAccessible(true);
                        Object obj2 = field.get(obj);
                        String str = obj2 instanceof String ? (String) obj2 : null;
                        if (str != null && C0943yh.m2221a(str)) {
                            return str;
                        }
                    }
                }
            }
            aVarM2206a = null;
        } catch (Throwable th) {
            aVarM2206a = C0920xd.m2206a(th);
        }
        return (String) (aVarM2206a == null ? aVarM2206a : null);
    }

    /* JADX INFO: renamed from: i */
    public static Field m1825i(Class cls, String str) {
        while (cls != null) {
            C0112G1 c0112g1M2122I = C0889w1.m2122I(cls.getDeclaredFields());
            while (c0112g1M2122I.hasNext()) {
                Field field = (Field) c0112g1M2122I.next();
                if (C0631i9.m1478a(field.getName(), str)) {
                    return field;
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m1826j() {
        C0186K3.f638a.getClass();
        return C0186K3.a.m511l() && C0186K3.a.m508i().f2439i;
    }

    /* JADX INFO: renamed from: k */
    public static void m1827k(Object obj) {
        Method method;
        try {
            Method[] methods = obj.getClass().getMethods();
            C0631i9.m1481d(methods, "getMethods(...)");
            int length = methods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    method = null;
                    break;
                }
                method = methods[i];
                if (C0631i9.m1478a(method.getName(), "notifyDataSetChanged")) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0) {
                        break;
                    }
                }
                i++;
            }
            if (method != null) {
                method.setAccessible(true);
                method.invoke(obj, null);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: l */
    public static Class m1828l(ClassLoader classLoader) {
        Class<?> cls;
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
        C0597gd c0597gdM1467a = C0616hd.m1467a("F021_select_contact_mvvm_list", c0578fd);
        if (!c0597gdM1467a.f2208a || (cls = c0597gdM1467a.f2209b) == null) {
            C0647j6 c0647j6 = c0597gdM1467a.f2210c;
            C0908x1.m2197e(Arrays.copyOf(new Object[]{C0944z.m2227g("MyPlugin-DexKit: SelectContactMvvmList resolve FAILED (reason=", c0647j6 != null ? c0647j6.f2390c : null, ")")}, 1));
            return null;
        }
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"MyPlugin-DexKit: SelectContactMvvmList resolved via " + c0597gdM1467a.f2211d + ": " + cls.getName()}, 1));
        return c0597gdM1467a.f2209b;
    }

    /* JADX INFO: renamed from: b */
    public final String m1829b(Object obj) {
        try {
            String name = obj.getClass().getName();
            if (name.equals(this.f3083a)) {
                Object objM19h = C0002A1.m19h(obj, "f472211d");
                String strM1830c = objM19h instanceof String ? (String) objM19h : null;
                return (strM1830c == null && (strM1830c = m1830c(obj)) == null) ? m1824d(obj) : strM1830c;
            }
            if (name.equals(this.f3084b)) {
                String strM1830c2 = m1830c(obj);
                return strM1830c2 == null ? m1824d(obj) : strM1830c2;
            }
            if (name.equals("com.tencent.mm.ui.transmit.recent.ForwardConversationInfo")) {
                Object objM19h2 = C0002A1.m19h(obj, "f211020d");
                String str = objM19h2 instanceof String ? (String) objM19h2 : null;
                if (str == null) {
                    Object objM19h3 = C0002A1.m19h(obj, "f189977d");
                    str = objM19h3 instanceof String ? (String) objM19h3 : null;
                    if (str == null) {
                        return m1824d(obj);
                    }
                }
                return str;
            }
            if (name.equals("com.tencent.mm.ui.contact.v8")) {
                Object objM19h4 = C0002A1.m19h(obj, "f207195d");
                if (objM19h4 == null) {
                    objM19h4 = C0002A1.m19h(obj, "d");
                }
                return objM19h4 != null ? m1829b(objM19h4) : m1824d(obj);
            }
            if (!name.equals("com.tencent.mm.ui.contact.w8")) {
                return m1824d(obj);
            }
            Object objM19h5 = C0002A1.m19h(obj, "f207206a");
            String str2 = objM19h5 instanceof String ? (String) objM19h5 : null;
            if (str2 == null) {
                Object objM19h6 = C0002A1.m19h(obj, "a");
                str2 = objM19h6 instanceof String ? (String) objM19h6 : null;
                if (str2 == null) {
                    return m1824d(obj);
                }
            }
            return str2;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m1830c(Object obj) {
        String str;
        String str2;
        boolean z;
        try {
            if (!this.f3087e || this.f3086d == null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                    C0112G1 c0112g1M2122I = C0889w1.m2122I(superclass.getDeclaredFields());
                    while (c0112g1M2122I.hasNext()) {
                        Field field = (Field) c0112g1M2122I.next();
                        if (!Modifier.isStatic(field.getModifiers()) && C0631i9.m1478a(field.getType(), String.class)) {
                            field.setAccessible(true);
                            Object obj2 = field.get(obj);
                            String str3 = obj2 instanceof String ? (String) obj2 : null;
                            if (str3 != null && C0943yh.m2221a(str3)) {
                                linkedHashMap.put(field.getName(), str3);
                            }
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    Iterator it = linkedHashMap.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str = null;
                            str2 = null;
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        str2 = (String) entry.getKey();
                        str = (String) entry.getValue();
                        if (C0943yh.m2221a(str)) {
                            Pattern patternCompile = Pattern.compile(".*-\\d+-\\d+$");
                            C0631i9.m1481d(patternCompile, "compile(...)");
                            C0631i9.m1482e(str, "input");
                            z = !patternCompile.matcher(str).matches();
                        } else {
                            z = false;
                        }
                        if (z) {
                            break;
                        }
                    }
                    if (str2 == null) {
                        Set setEntrySet = linkedHashMap.entrySet();
                        C0631i9.m1481d(setEntrySet, "<get-entries>(...)");
                        Object objM1948l0 = C0834t3.m1948l0(setEntrySet);
                        C0631i9.m1481d(objM1948l0, "first(...)");
                        Map.Entry entry2 = (Map.Entry) objM1948l0;
                        str2 = (String) entry2.getKey();
                        str = (String) entry2.getValue();
                    }
                    this.f3086d = str2;
                    this.f3087e = true;
                    String strM143X = str != null ? C0053Ce.m143X(str, 30) : null;
                    Log.i("MyPlugin-DexKit", "[RecentForward] DexKit-auto: ri5.j wxid field='" + str2 + "' value='" + strM143X + "' (" + linkedHashMap.size() + " candidates: " + linkedHashMap.keySet() + ")");
                    return str;
                }
            } else {
                String str4 = this.f3086d;
                C0631i9.m1479b(str4);
                Object objM19h = C0002A1.m19h(obj, str4);
                if (objM19h instanceof String) {
                    return (String) objM19h;
                }
            }
            return null;
        } catch (Throwable th) {
            Log.w("MyPlugin-DexKit", "[RecentForward] extractWxidAutoDiscover err: " + th.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1831e(Object obj) {
        try {
            Iterator it = C0739o3.m1757d0("C", "B", "data", "d").iterator();
            while (it.hasNext()) {
                Object objM19h = C0002A1.m19h(obj, (String) it.next());
                List<?> list = C0198Kf.m549b(objM19h) ? (List) objM19h : null;
                if (list != null) {
                    m1833g(list);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public final ArrayList m1832f(List list) {
        boolean zM1423a;
        if (!this.f3088f && !list.isEmpty()) {
            this.f3088f = true;
            StringBuilder sb = new StringBuilder(C0944z.m2225e("[DIAG-ri5j] list.size=", list.size()));
            int iMin = Math.min(5, list.size());
            for (int i = 0; i < iMin; i++) {
                Object obj = list.get(i);
                if (obj != null) {
                    sb.append(" | [" + i + "]cls=" + obj.getClass().getName());
                    try {
                        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                            C0112G1 c0112g1M2122I = C0889w1.m2122I(superclass.getDeclaredFields());
                            while (c0112g1M2122I.hasNext()) {
                                Field field = (Field) c0112g1M2122I.next();
                                if (!Modifier.isStatic(field.getModifiers()) && C0631i9.m1478a(field.getType(), String.class)) {
                                    field.setAccessible(true);
                                    Object obj2 = field.get(obj);
                                    String str = obj2 instanceof String ? (String) obj2 : null;
                                    if (str != null) {
                                        sb.append(" " + field.getName() + "=" + C0053Ce.m143X(str, 40));
                                    }
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                    sb.append(" wxid=");
                    String strM1829b = m1829b(obj);
                    if (strM1829b == null) {
                        strM1829b = "NULL";
                    }
                    sb.append(strM1829b);
                }
            }
            Log.i("MyPlugin-DexKit", "[RecentForward] " + ((Object) sb));
        }
        ArrayList arrayList = new ArrayList(list.size());
        boolean z = false;
        for (Object obj3 : list) {
            if (obj3 == null) {
                arrayList.add(null);
            } else {
                String strM1829b2 = m1829b(obj3);
                if (strM1829b2 == null) {
                    zM1423a = false;
                } else {
                    ExecutorService executorService = C0582fh.f2149G;
                    zM1423a = C0582fh.a.m1423a(strM1829b2);
                }
                if (zM1423a) {
                    z = true;
                } else {
                    arrayList.add(obj3);
                }
            }
        }
        if (z) {
            return arrayList;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final int m1833g(List<?> list) {
        boolean zM1423a;
        if (list.isEmpty()) {
            return 0;
        }
        Iterator<?> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null) {
                String strM1829b = m1829b(next);
                if (strM1829b == null) {
                    zM1423a = false;
                } else {
                    ExecutorService executorService = C0582fh.f2149G;
                    zM1423a = C0582fh.a.m1423a(strM1829b);
                }
                if (zM1423a) {
                    it.remove();
                    i++;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: h */
    public final void m1834h(Object obj) {
        int iM1833g;
        for (String str : C0739o3.m1757d0("o", "p", "h", "C")) {
            try {
                Field fieldM1825i = m1825i(obj.getClass(), str);
                if (fieldM1825i != null) {
                    fieldM1825i.setAccessible(true);
                    Object obj2 = fieldM1825i.get(obj);
                    List<?> list = C0198Kf.m549b(obj2) ? (List) obj2 : null;
                    if (list != null && !list.isEmpty() && (iM1833g = m1833g(list)) > 0) {
                        Log.i("MyPlugin-DexKit", "[RecentForward] SelectContactMvvmList." + str + " filtered " + iM1833g + ", now " + list.size());
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:84|(2:223|120)|(21:122|225|143|(16:145|221|165|(7:227|168|169|(1:173)|174|177|(1:179))|210|180|(8:182|208|190|(3:192|205|206)(4:193|(2:196|194)|229|199)|202|(1:204)|205|206)(1:183)|187|(1:189)|208|190|(0)(0)|202|(0)|205|206)(4:146|(4:149|(1:237)(3:232|153|(3:234|155|239)(3:233|156|238))|235|147)|230|159)|162|(1:164)|221|165|(0)|210|180|(0)(0)|187|(0)|208|190|(0)(0)|202|(0)|205|206)(4:123|(5:126|(1:(2:128|(2:245|130)(1:131))(2:246|134))|(3:240|136|244)(1:243)|242|124)|241|137)|140|(1:142)|225|143|(0)(0)|162|(0)|221|165|(0)|210|180|(0)(0)|187|(0)|208|190|(0)(0)|202|(0)|205|206) */
    /* JADX WARN: Can't wrap try/catch for region: R(26:84|223|120|(21:122|225|143|(16:145|221|165|(7:227|168|169|(1:173)|174|177|(1:179))|210|180|(8:182|208|190|(3:192|205|206)(4:193|(2:196|194)|229|199)|202|(1:204)|205|206)(1:183)|187|(1:189)|208|190|(0)(0)|202|(0)|205|206)(4:146|(4:149|(1:237)(3:232|153|(3:234|155|239)(3:233|156|238))|235|147)|230|159)|162|(1:164)|221|165|(0)|210|180|(0)(0)|187|(0)|208|190|(0)(0)|202|(0)|205|206)(4:123|(5:126|(1:(2:128|(2:245|130)(1:131))(2:246|134))|(3:240|136|244)(1:243)|242|124)|241|137)|140|(1:142)|225|143|(0)(0)|162|(0)|221|165|(0)|210|180|(0)(0)|187|(0)|208|190|(0)(0)|202|(0)|205|206) */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x03fc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0422, code lost:
    
        r0 = p000a.C0920xd.m2206a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0455, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0470, code lost:
    
        r0 = p000a.C0920xd.m2206a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x04b1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x04b2, code lost:
    
        r0 = p000a.C0920xd.m2206a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0501, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x050e, code lost:
    
        r0 = p000a.C0920xd.m2206a(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x032d A[Catch: all -> 0x035a, TryCatch #8 {all -> 0x035a, blocks: (B:120:0x0321, B:123:0x032d, B:124:0x0335, B:126:0x033b, B:128:0x034c, B:136:0x035f, B:131:0x0357, B:137:0x0387), top: B:223:0x0321 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03b5 A[Catch: all -> 0x03fc, TryCatch #9 {all -> 0x03fc, blocks: (B:143:0x03a9, B:146:0x03b5, B:147:0x03bd, B:149:0x03c3, B:151:0x03d3, B:153:0x03df, B:156:0x03ea, B:159:0x03fe), top: B:225:0x03a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0498 A[Catch: all -> 0x04b1, TRY_LEAVE, TryCatch #1 {all -> 0x04b1, blocks: (B:180:0x048f, B:183:0x0498), top: B:210:0x048f }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04da A[Catch: all -> 0x0501, TryCatch #0 {all -> 0x0501, blocks: (B:190:0x04d1, B:193:0x04da, B:194:0x04e8, B:196:0x04ee, B:199:0x0503), top: B:208:0x04d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x044a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleHook(C0173J8 c0173j8) {
        int i;
        String name;
        int i2;
        ClassLoader classLoader;
        Object objM2206a;
        Method method;
        int i3;
        Executable executable;
        Object objM2206a2;
        Object objM2206a3;
        Throwable thM2189a;
        Object objM2206a4;
        Throwable thM2189a2;
        Object objM2206a5;
        Throwable thM2189a3;
        Object objM2206a6;
        Throwable thM2189a4;
        Class clsM13b;
        Class clsM13b2;
        Class clsM1828l;
        Method method2;
        Method[] methodArr;
        Class<?> cls;
        C0631i9.m1482e(c0173j8, "session");
        ClassLoader classLoader2 = c0173j8.f608a;
        C0186K3.f638a.getClass();
        if (!C0186K3.a.m508i().f2439i) {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"MyPlugin-DexKit: [RecentForward] switch off, skip"}, 1));
            return;
        }
        if (C0021B1.f64a == -1) {
            try {
                Context context = C0889w1.f3488p;
                C0631i9.m1479b(context);
                i = context.getPackageManager().getPackageInfo("com.tencent.mm", 0).versionCode;
            } catch (Exception e) {
                C0908x1.m2193a(Arrays.copyOf(new Object[]{e}, 1));
                i = -1;
            }
            C0021B1.f64a = i;
        }
        C0578fd c0578fd = new C0578fd(C0021B1.f64a, classLoader2);
        C0616hd.f2278a.getClass();
        C0597gd c0597gdM1467a = C0616hd.m1467a("F021_recent_forward_adapter", c0578fd);
        Class<?> clsLoadClass = null;
        if (!c0597gdM1467a.f2208a || (cls = c0597gdM1467a.f2209b) == null) {
            C0647j6 c0647j6 = c0597gdM1467a.f2210c;
            C0908x1.m2197e(Arrays.copyOf(new Object[]{C0944z.m2227g("MyPlugin-DexKit: adapter resolve FAILED (reason=", c0647j6 != null ? c0647j6.f2390c : null, ")")}, 1));
            name = null;
        } else {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"MyPlugin-DexKit: adapter resolved via " + c0597gdM1467a.f2211d + ": " + cls.getName()}, 1));
            name = c0597gdM1467a.f2209b.getName();
        }
        if (C0021B1.f64a == -1) {
            try {
                Context context2 = C0889w1.f3488p;
                C0631i9.m1479b(context2);
                i2 = context2.getPackageManager().getPackageInfo("com.tencent.mm", 0).versionCode;
            } catch (Exception e2) {
                C0908x1.m2193a(Arrays.copyOf(new Object[]{e2}, 1));
                i2 = -1;
            }
            C0021B1.f64a = i2;
        }
        C0597gd c0597gdM1467a2 = C0616hd.m1467a("forward_data_item", new C0578fd(C0021B1.f64a, classLoader2));
        Class<?> cls2 = c0597gdM1467a2.f2209b;
        this.f3083a = cls2 != null ? cls2.getName() : "yj5.j";
        Class<?> clsM1426a = c0597gdM1467a2.m1426a("legacyDataItem");
        this.f3084b = clsM1426a != null ? clsM1426a.getName() : "ri5.j";
        this.f3091i = c0173j8;
        String str = this.f3083a;
        EnumC0521cd enumC0521cd = c0597gdM1467a2.f2211d;
        StringBuilder sbM2229i = C0944z.m2229i("MyPlugin-DexKit: [RecentForward] handleHook START (adapter=", name, " dataItem=", str, " via=");
        sbM2229i.append(enumC0521cd);
        sbM2229i.append(")");
        C0908x1.m2194b(Arrays.copyOf(new Object[]{sbM2229i.toString()}, 1));
        if (name != null) {
            try {
                Class clsM13b3 = C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.view.recyclerview.WxRecyclerView");
                if (clsM13b3 != null) {
                    Method[] declaredMethods = clsM13b3.getDeclaredMethods();
                    C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
                    int length = declaredMethods.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            classLoader = classLoader2;
                            executable = null;
                            break;
                        }
                        Method method3 = declaredMethods[i4];
                        Method[] methodArr2 = declaredMethods;
                        if (C0631i9.m1478a(method3.getName(), "setAdapter")) {
                            classLoader = classLoader2;
                            if (method3.getParameterTypes().length == 1) {
                                executable = method3;
                                break;
                            }
                        } else {
                            classLoader = classLoader2;
                        }
                        i4++;
                        declaredMethods = methodArr2;
                        classLoader2 = classLoader;
                    }
                    if (executable != null) {
                        try {
                            c0173j8.m470f(executable).intercept(new C0740o4(this, 3, name));
                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"MyPlugin-DexKit: [RecentForward] hooked WxRecyclerView.setAdapter for " + name}, 1));
                        } catch (Throwable th) {
                            th = th;
                            objM2206a = C0920xd.m2206a(th);
                        }
                    }
                } else {
                    classLoader = classLoader2;
                }
                Class clsM13b4 = C0002A1.m13b(c0173j8.f608a, "androidx.recyclerview.widget.RecyclerView");
                if (clsM13b4 != null) {
                    Method[] declaredMethods2 = clsM13b4.getDeclaredMethods();
                    C0631i9.m1481d(declaredMethods2, "getDeclaredMethods(...)");
                    int length2 = declaredMethods2.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length2) {
                            method = null;
                            break;
                        }
                        method = declaredMethods2[i5];
                        if (C0631i9.m1478a(method.getName(), "setAdapter")) {
                            i3 = length2;
                            if (method.getParameterTypes().length == 1) {
                                break;
                            }
                        } else {
                            i3 = length2;
                        }
                        i5++;
                        length2 = i3;
                    }
                    if (method != null) {
                        c0173j8.m470f(method).intercept(new C0725n8(this, 2));
                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"MyPlugin-DexKit: [RecentForward] hooked RecyclerView.setAdapter for WxRecyclerAdapter"}, 1));
                    }
                }
                objM2206a = C0413Wf.f1577a;
            } catch (Throwable th2) {
                th = th2;
                classLoader = classLoader2;
            }
            Throwable thM2189a5 = C0901wd.m2189a(objM2206a);
            if (thM2189a5 != null) {
                C0908x1.m2197e(Arrays.copyOf(new Object[]{C0944z.m2231k("MyPlugin-DexKit: [RecentForward] hookXm3T0AdapterCapture FAIL: ", thM2189a5.getMessage())}, 1));
            }
        } else {
            classLoader = classLoader2;
        }
        try {
            clsM1828l = m1828l(classLoader);
        } catch (Throwable th3) {
            objM2206a2 = C0920xd.m2206a(th3);
        }
        if (clsM1828l != null) {
            Method[] declaredMethods3 = clsM1828l.getDeclaredMethods();
            C0631i9.m1481d(declaredMethods3, "getDeclaredMethods(...)");
            int length3 = declaredMethods3.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length3) {
                    method2 = null;
                    break;
                }
                method2 = declaredMethods3[i6];
                if (C0631i9.m1478a(method2.getName(), "e")) {
                    methodArr = declaredMethods3;
                    if (method2.getParameterTypes().length == 1 && List.class.isAssignableFrom(method2.getParameterTypes()[0])) {
                        break;
                    }
                } else {
                    methodArr = declaredMethods3;
                }
                i6++;
                declaredMethods3 = methodArr;
            }
            if (method2 != null) {
                method2.setAccessible(true);
                c0173j8.m470f(method2).intercept(new C0725n8(this, 3));
                Log.i("MyPlugin-DexKit", "[RecentForward] hooked SelectContactMvvmList.e(List)");
            }
            C0112G1 c0112g1M2122I = C0889w1.m2122I(clsM1828l.getDeclaredMethods());
            while (c0112g1M2122I.hasNext()) {
                Method method4 = (Method) c0112g1M2122I.next();
                if (!Modifier.isStatic(method4.getModifiers()) && !C0631i9.m1478a(method4.getName(), "e")) {
                    Class<?>[] parameterTypes = method4.getParameterTypes();
                    C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length != 0) {
                        method4.setAccessible(true);
                        c0173j8.m470f(method4).intercept(new C0725n8(this, 4));
                    }
                }
            }
            objM2206a2 = Integer.valueOf(Log.i("MyPlugin-DexKit", "[RecentForward] hooked SelectContactMvvmList all methods (" + clsM1828l.getDeclaredMethods().length + ")"));
            Throwable thM2189a6 = C0901wd.m2189a(objM2206a2);
            if (thM2189a6 != null) {
                Log.w("MyPlugin-DexKit", "[RecentForward] hookSelectContactMvvmLiveData FAIL: " + thM2189a6.getMessage());
            }
            clsM13b2 = C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.view.recyclerview.WxRecyclerAdapter");
            if (clsM13b2 != null) {
            }
            thM2189a = C0901wd.m2189a(objM2206a3);
            if (thM2189a != null) {
            }
            clsM13b = C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.ui.contact.p6");
            if (clsM13b == null) {
            }
            thM2189a2 = C0901wd.m2189a(objM2206a4);
            if (thM2189a2 != null) {
            }
            if (C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.ui.contact.item.q1") != null) {
            }
            if (C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.pluginsdk.forward.m") != null) {
            }
            thM2189a3 = C0901wd.m2189a(objM2206a5);
            if (thM2189a3 != null) {
            }
            if (C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.ui.transmit.recent.i") == null) {
            }
            thM2189a4 = C0901wd.m2189a(objM2206a6);
            if (thM2189a4 != null) {
            }
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"MyPlugin-DexKit: [RecentForward] handleHook DONE, all hooks registered"}, 1));
        }
        C0908x1.m2197e(Arrays.copyOf(new Object[]{"MyPlugin-DexKit: [RecentForward] SelectContactMvvmList not found"}, 1));
        try {
            clsM13b2 = C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.view.recyclerview.WxRecyclerAdapter");
        } catch (Throwable th4) {
            objM2206a3 = C0920xd.m2206a(th4);
        }
        if (clsM13b2 != null) {
            clsM13b = C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.ui.contact.p6");
            if (clsM13b == null) {
                if (C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.ui.contact.item.q1") != null) {
                    try {
                        clsLoadClass = c0173j8.f608a.loadClass("com.tencent.mm.ui.contact.item.b");
                    } catch (Exception unused) {
                    }
                    Class<?> cls3 = clsLoadClass;
                    if (cls3 != null) {
                        final int i7 = 0;
                        C0173J8.m463a(c0173j8, "com.tencent.mm.ui.contact.item.q1", "a", new Class[]{Context.class, cls3}, new InterfaceC0064D7(this) { // from class: a.p8

                            /* JADX INFO: renamed from: b */
                            public final /* synthetic */ C0782q8 f3026b;

                            {
                                this.f3026b = this;
                            }

                            @Override // p000a.InterfaceC0064D7
                            /* JADX INFO: renamed from: f */
                            public final Object mo53f(Object obj) {
                                int iM1833g;
                                switch (i7) {
                                    case 0:
                                        C0782q8 c0782q8 = this.f3026b;
                                        XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                                        C0631i9.m1482e(chain, "chain");
                                        Object objProceed = chain.proceed();
                                        try {
                                            if (C0782q8.m1826j()) {
                                                Object thisObject = chain.getThisObject();
                                                C0631i9.m1481d(thisObject, "getThisObject(...)");
                                                c0782q8.m1831e(thisObject);
                                                Object thisObject2 = chain.getThisObject();
                                                C0631i9.m1481d(thisObject2, "getThisObject(...)");
                                                Iterator it = C0739o3.m1757d0("G", "F").iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        Object objM19h = C0002A1.m19h(thisObject2, (String) it.next());
                                                        if (objM19h != null) {
                                                            C0002A1.m12a(objM19h, "notifyDataSetChanged", new Object[0]);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (Exception unused2) {
                                        }
                                        return objProceed;
                                    default:
                                        C0782q8 c0782q82 = this.f3026b;
                                        XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                                        C0631i9.m1482e(chain2, "chain");
                                        Object objProceed2 = chain2.proceed();
                                        try {
                                            if (C0782q8.m1826j()) {
                                                Object objM19h2 = C0002A1.m19h(chain2.getThisObject(), "d");
                                                List<?> list = C0198Kf.m549b(objM19h2) ? (List) objM19h2 : null;
                                                if (list != null && (iM1833g = c0782q82.m1833g(list)) > 0) {
                                                    Log.i("MyPlugin-DexKit", "[RecentForward] bottom forward.m filtered " + iM1833g);
                                                }
                                                break;
                                            }
                                        } catch (Exception unused3) {
                                        }
                                        return objProceed2;
                                }
                            }
                        });
                        Log.i("MyPlugin-DexKit", "[RecentForward] hooked old q1.a(Context, item.b)");
                    }
                    Object objM2206a7 = C0413Wf.f1577a;
                    Throwable thM2189a7 = C0901wd.m2189a(objM2206a7);
                    if (thM2189a7 != null) {
                        Log.w("MyPlugin-DexKit", "[RecentForward] hookOldQ1Path FAIL: " + thM2189a7.getMessage());
                    }
                }
                if (C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.pluginsdk.forward.m") != null) {
                    if (C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.ui.transmit.recent.i") == null) {
                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"MyPlugin-DexKit: [RecentForward] handleHook DONE, all hooks registered"}, 1));
                    }
                    for (String str2 : C0739o3.m1757d0("a", "b")) {
                        C0173J8.m463a(c0173j8, "com.tencent.mm.ui.transmit.recent.i", str2, new Class[0], new C0683l4(this, 1, str2));
                    }
                    objM2206a6 = Integer.valueOf(Log.i("MyPlugin-DexKit", "[RecentForward] hooked forward provider a/b"));
                    thM2189a4 = C0901wd.m2189a(objM2206a6);
                    if (thM2189a4 != null) {
                        Log.w("MyPlugin-DexKit", "[RecentForward] hookForwardDataProvider FAIL: " + thM2189a4.getMessage());
                    }
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"MyPlugin-DexKit: [RecentForward] handleHook DONE, all hooks registered"}, 1));
                }
                final int i8 = 1;
                C0173J8.m463a(c0173j8, "com.tencent.mm.pluginsdk.forward.m", "qh", new Class[0], new InterfaceC0064D7(this) { // from class: a.p8

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ C0782q8 f3026b;

                    {
                        this.f3026b = this;
                    }

                    @Override // p000a.InterfaceC0064D7
                    /* JADX INFO: renamed from: f */
                    public final Object mo53f(Object obj) {
                        int iM1833g;
                        switch (i8) {
                            case 0:
                                C0782q8 c0782q8 = this.f3026b;
                                XposedInterface.Chain chain = (XposedInterface.Chain) obj;
                                C0631i9.m1482e(chain, "chain");
                                Object objProceed = chain.proceed();
                                try {
                                    if (C0782q8.m1826j()) {
                                        Object thisObject = chain.getThisObject();
                                        C0631i9.m1481d(thisObject, "getThisObject(...)");
                                        c0782q8.m1831e(thisObject);
                                        Object thisObject2 = chain.getThisObject();
                                        C0631i9.m1481d(thisObject2, "getThisObject(...)");
                                        Iterator it = C0739o3.m1757d0("G", "F").iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                Object objM19h = C0002A1.m19h(thisObject2, (String) it.next());
                                                if (objM19h != null) {
                                                    C0002A1.m12a(objM19h, "notifyDataSetChanged", new Object[0]);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception unused2) {
                                }
                                return objProceed;
                            default:
                                C0782q8 c0782q82 = this.f3026b;
                                XposedInterface.Chain chain2 = (XposedInterface.Chain) obj;
                                C0631i9.m1482e(chain2, "chain");
                                Object objProceed2 = chain2.proceed();
                                try {
                                    if (C0782q8.m1826j()) {
                                        Object objM19h2 = C0002A1.m19h(chain2.getThisObject(), "d");
                                        List<?> list = C0198Kf.m549b(objM19h2) ? (List) objM19h2 : null;
                                        if (list != null && (iM1833g = c0782q82.m1833g(list)) > 0) {
                                            Log.i("MyPlugin-DexKit", "[RecentForward] bottom forward.m filtered " + iM1833g);
                                        }
                                        break;
                                    }
                                } catch (Exception unused3) {
                                }
                                return objProceed2;
                        }
                    }
                });
                objM2206a5 = Integer.valueOf(Log.i("MyPlugin-DexKit", "[RecentForward] hooked bottom forward.m.qh"));
                thM2189a3 = C0901wd.m2189a(objM2206a5);
                if (thM2189a3 != null) {
                    Log.w("MyPlugin-DexKit", "[RecentForward] hookBottomForwardMenu FAIL: " + thM2189a3.getMessage());
                }
                if (C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.ui.transmit.recent.i") == null) {
                }
                thM2189a4 = C0901wd.m2189a(objM2206a6);
                if (thM2189a4 != null) {
                }
                C0908x1.m2194b(Arrays.copyOf(new Object[]{"MyPlugin-DexKit: [RecentForward] handleHook DONE, all hooks registered"}, 1));
            }
            C0112G1 c0112g1M2122I2 = C0889w1.m2122I(clsM13b.getDeclaredMethods());
            while (c0112g1M2122I2.hasNext()) {
                Method method5 = (Method) c0112g1M2122I2.next();
                if (!Modifier.isStatic(method5.getModifiers()) && !C0631i9.m1478a(method5.getReturnType(), Void.TYPE)) {
                    Class<?>[] parameterTypes2 = method5.getParameterTypes();
                    C0631i9.m1481d(parameterTypes2, "getParameterTypes(...)");
                    if (parameterTypes2.length != 0) {
                        method5.setAccessible(true);
                        c0173j8.m470f(method5).intercept(new C0725n8(this, 1));
                    }
                }
            }
            objM2206a4 = Integer.valueOf(Log.i("MyPlugin-DexKit", "[RecentForward] hooked old p6 (" + clsM13b.getDeclaredMethods().length + " methods)"));
            thM2189a2 = C0901wd.m2189a(objM2206a4);
            if (thM2189a2 != null) {
                Log.w("MyPlugin-DexKit", "[RecentForward] hookOldP6Path FAIL: " + thM2189a2.getMessage());
            }
            if (C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.ui.contact.item.q1") != null) {
            }
            if (C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.pluginsdk.forward.m") != null) {
            }
            thM2189a3 = C0901wd.m2189a(objM2206a5);
            if (thM2189a3 != null) {
            }
            if (C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.ui.transmit.recent.i") == null) {
            }
            thM2189a4 = C0901wd.m2189a(objM2206a6);
            if (thM2189a4 != null) {
            }
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"MyPlugin-DexKit: [RecentForward] handleHook DONE, all hooks registered"}, 1));
        }
        C0112G1 c0112g1M2122I3 = C0889w1.m2122I(clsM13b2.getDeclaredConstructors());
        while (c0112g1M2122I3.hasNext()) {
            Constructor constructor = (Constructor) c0112g1M2122I3.next();
            Class<?>[] parameterTypes3 = constructor.getParameterTypes();
            C0631i9.m1481d(parameterTypes3, "getParameterTypes(...)");
            int length4 = parameterTypes3.length;
            final int i9 = 0;
            while (true) {
                if (i9 >= length4) {
                    i9 = -1;
                    break;
                } else if (C0631i9.m1478a(parameterTypes3[i9], ArrayList.class)) {
                    break;
                } else {
                    i9++;
                }
            }
            if (i9 >= 0) {
                constructor.setAccessible(true);
                c0173j8.m470f(constructor).intercept(new XposedInterface.Hooker() { // from class: a.o8
                    public final Object intercept(XposedInterface.Chain chain) {
                        int iM1833g;
                        C0782q8 c0782q8 = this.f2946a;
                        int i10 = i9;
                        C0631i9.m1482e(chain, "chain");
                        Object objProceed = chain.proceed();
                        try {
                            if (C0782q8.m1826j()) {
                                List args = chain.getArgs();
                                C0631i9.m1481d(args, "getArgs(...)");
                                Object objM1951o0 = C0834t3.m1951o0(args, i10);
                                List<?> list = C0198Kf.m549b(objM1951o0) ? (List) objM1951o0 : null;
                                if (list != null && (iM1833g = c0782q8.m1833g(list)) > 0) {
                                    Log.i("MyPlugin-DexKit", "[RecentForward] WxRecyclerAdapter ctor filtered " + iM1833g + " items");
                                    return objProceed;
                                }
                            }
                        } catch (Throwable th5) {
                            Log.w("MyPlugin-DexKit", "[RecentForward] WxRecyclerAdapter ctor filter err: " + th5.getMessage());
                        }
                        return objProceed;
                    }
                });
                Log.i("MyPlugin-DexKit", "[RecentForward] hooked WxRecyclerAdapter ctor (ArrayList@" + i9 + ")");
            }
        }
        objM2206a3 = C0413Wf.f1577a;
        thM2189a = C0901wd.m2189a(objM2206a3);
        if (thM2189a != null) {
            Log.w("MyPlugin-DexKit", "[RecentForward] hookWxRecyclerAdapterCtor FAIL: " + thM2189a.getMessage());
        }
        clsM13b = C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.ui.contact.p6");
        if (clsM13b == null) {
        }
        thM2189a2 = C0901wd.m2189a(objM2206a4);
        if (thM2189a2 != null) {
        }
        if (C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.ui.contact.item.q1") != null) {
        }
        if (C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.pluginsdk.forward.m") != null) {
        }
        thM2189a3 = C0901wd.m2189a(objM2206a5);
        if (thM2189a3 != null) {
        }
        if (C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.ui.transmit.recent.i") == null) {
        }
        thM2189a4 = C0901wd.m2189a(objM2206a6);
        if (thM2189a4 != null) {
        }
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"MyPlugin-DexKit: [RecentForward] handleHook DONE, all hooks registered"}, 1));
    }

    /* JADX INFO: renamed from: m */
    public final void m1835m(Object obj) {
        Method method;
        m1836n(obj);
        long[] jArr = {100, 300, 800};
        for (int i = 0; i < 3; i++) {
            this.f3085c.postDelayed(new RunnableC0273P0(this, 7, obj), jArr[i]);
        }
        if (this.f3092j.contains(obj)) {
            return;
        }
        this.f3092j.add(obj);
        C0173J8 c0173j8 = this.f3091i;
        if (c0173j8 == null) {
            return;
        }
        try {
            Method[] methods = obj.getClass().getMethods();
            C0631i9.m1481d(methods, "getMethods(...)");
            int length = methods.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    method = null;
                    break;
                }
                method = methods[i2];
                if (C0631i9.m1478a(method.getName(), "notifyDataSetChanged")) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0) {
                        break;
                    }
                }
                i2++;
            }
            if (method == null) {
                return;
            }
            c0173j8.m470f(method).intercept(new C0725n8(this, 0));
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"MyPlugin-DexKit: [RecentForward] Phase6-2: notifyDataSetChanged hook installed on " + obj.getClass().getSimpleName()}, 1));
            C0413Wf c0413Wf = C0413Wf.f1577a;
        } catch (Throwable th) {
            C0920xd.m2206a(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ff, code lost:
    
        m1827k(r13);
        android.util.Log.i("MyPlugin-DexKit", "[RecentForward] adapter." + r2 + " filtered " + r4 + ", now " + r3.size());
     */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1836n(Object obj) {
        String strM1829b;
        try {
            if (m1826j()) {
                Boolean bool = this.f3090h.get();
                Boolean bool2 = Boolean.TRUE;
                if (C0631i9.m1478a(bool, bool2)) {
                    return;
                }
                this.f3090h.set(bool2);
                try {
                    Iterator it = C0739o3.m1757d0("data", "o", "p", "f152040o", "h", "C", "d").iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str = (String) it.next();
                        Field fieldM1825i = m1825i(obj.getClass(), str);
                        if (fieldM1825i != null) {
                            fieldM1825i.setAccessible(true);
                            Object obj2 = fieldM1825i.get(obj);
                            List<?> list = C0198Kf.m549b(obj2) ? (List) obj2 : null;
                            if (list != null && !list.isEmpty()) {
                                if (!this.f3089g) {
                                    this.f3089g = true;
                                    StringBuilder sb = new StringBuilder("[DBG] adapter." + str + " size=" + list.size());
                                    int iMin = Math.min(3, list.size());
                                    for (int i = 0; i < iMin; i++) {
                                        Object obj3 = list.get(i);
                                        String name = obj3 != null ? obj3.getClass().getName() : null;
                                        if (obj3 == null || (strM1829b = m1829b(obj3)) == null) {
                                            strM1829b = "?";
                                        }
                                        sb.append(" | [" + i + "]" + name + "=wxid:" + strM1829b);
                                    }
                                    Log.i("MyPlugin-DexKit", "[RecentForward] " + ((Object) sb));
                                }
                                int iM1833g = m1833g(list);
                                if (iM1833g > 0) {
                                    break;
                                }
                            }
                        }
                    }
                    this.f3090h.set(Boolean.FALSE);
                } catch (Throwable th) {
                    this.f3090h.set(Boolean.FALSE);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            Log.w("MyPlugin-DexKit", "[RecentForward] tryFilterAdapterData err: " + th2.getMessage());
        }
    }
}
