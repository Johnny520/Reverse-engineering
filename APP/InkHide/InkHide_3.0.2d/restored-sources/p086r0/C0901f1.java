package p086r0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.p055lu.wxmask.MainHook;
import dalvik.system.DexFile;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p001A0.AbstractC0039l;
import p001A0.C0022W;
import p001A0.C0026a;
import p001A0.C0035h;
import p001A0.C0048u;
import p001A0.C0052y;
import p004C.C0060d;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p009E0.C0109i;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p011F0.AbstractC0125m;
import p011F0.C0131s;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0514f;
import p062e0.InterfaceC0551a;
import p070i0.AbstractC0731a;
import p084q0.C0808h;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1135r;
import p102z0.AbstractC1140w;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.f1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0901f1 implements InterfaceC0551a {

    /* JADX INFO: renamed from: j */
    public static final String[] f3167j = {"部分朋友可见", "部分可见", "朋友可见", "可见范围", "閮ㄥ垎鏈嬪弸鍙\ue21d\ue746"};

    /* JADX INFO: renamed from: k */
    public static final long[] f3168k = {0, 120, 360, 900, 1500, 2500};

    /* JADX INFO: renamed from: l */
    public static final String[] f3169l = {"com.tencent.mm.plugin.sns.ui.SnsUserUI", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI"};

    /* JADX INFO: renamed from: m */
    public static final String[] f3170m = {"com.tencent.mm.plugin.sns.model.", "com.tencent.mm.plugin.sns.ui.improve.", "com.tencent.mm.plugin.sns.ui.improve.component."};

    /* JADX INFO: renamed from: n */
    public static final Set f3171n = AbstractC0120h.m263k0(new String[]{"notifyDataSetChanged", "notifyItemInserted", "notifyItemRangeInserted"});

    /* JADX INFO: renamed from: o */
    public static final String[] f3172o = {"Username", "UserName", "userName", "username", "field_userName", "field_username"};

    /* JADX INFO: renamed from: p */
    public static final String[] f3173p = {"field_userName", "field_snsId", "field_createTime", "field_content", "LikeUserList", "CommentUserList"};

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f3174a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f3175b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap f3176c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public final ConcurrentHashMap f3177d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap f3178e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f */
    public final ConcurrentHashMap f3179f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: g */
    public volatile Object f3180g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f3181h;

    /* JADX INFO: renamed from: i */
    public volatile C0022W f3182i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m1915c(Object obj, Set set, Class cls) {
        if (cls == null || cls.isInstance(obj)) {
            String str = (String) m1917g(obj, "UserName");
            String string = str != null ? AbstractC0299i.m507C0(str).toString() : null;
            if (string != null && !AbstractC0307q.m534d0(string) && set.contains(string)) {
                return string;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static Field m1916e(Class cls, String str) {
        while (cls != null) {
            try {
                return cls.getDeclaredField(str);
            } catch (Throwable unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static Object m1917g(Object obj, String str) {
        Object c0104d;
        try {
            Field fieldM1916e = m1916e(obj.getClass(), str);
            if (fieldM1916e == null) {
                return null;
            }
            fieldM1916e.setAccessible(true);
            c0104d = fieldM1916e.get(obj);
            if (c0104d == null) {
                c0104d = null;
            }
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (c0104d instanceof C0104d) {
            return null;
        }
        return c0104d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static Set m1918h() {
        boolean z2 = AbstractC1126i.f3786a;
        ArrayList arrayListM266h0 = AbstractC0123k.m266h0(!C1124g.m2443s() ? C0131s.f426a : new ArrayList(((C0808h) AbstractC0503h.m988u(C0808h.class)).f2684a));
        ArrayList arrayList = new ArrayList(AbstractC0125m.m289c0(arrayListM266h0));
        Iterator it = arrayListM266h0.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC0299i.m507C0((String) it.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!AbstractC0307q.m534d0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        return AbstractC0123k.m265B0(arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static boolean m1919k(Object obj, String[] strArr) {
        for (String str : strArr) {
            if (m1916e(obj.getClass(), str) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static boolean m1920l(Class cls, Class cls2) {
        if (cls.getName().equals("com.tencent.mm.plugin.sns.ui.improve.component.g2") || cls2.isAssignableFrom(cls)) {
            return true;
        }
        while (cls != null) {
            if (cls.getName().equals("com.tencent.mm.view.recyclerview.WxRecyclerAdapter")) {
                return true;
            }
            cls = cls.getSuperclass();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static Field m1921m(Object obj, Class cls, Class cls2) {
        Field fieldM1916e;
        if (cls2 != null && cls2.isInstance(obj) && (fieldM1916e = m1916e(obj.getClass(), "UserName")) != null) {
            fieldM1916e.setAccessible(true);
            return fieldM1916e;
        }
        String[] strArr = f3172o;
        if (cls != null && cls.isInstance(obj)) {
            for (String str : strArr) {
                Field fieldM1916e2 = m1916e(obj.getClass(), str);
                if (fieldM1916e2 != null) {
                    fieldM1916e2.setAccessible(true);
                    return fieldM1916e2;
                }
            }
        }
        if (!m1919k(obj, f3173p) && !AbstractC0174d.m360p(obj, "com.tencent.mm.plugin.sns.", false)) {
            return null;
        }
        for (String str2 : strArr) {
            Field fieldM1916e3 = m1916e(obj.getClass(), str2);
            if (fieldM1916e3 != null) {
                fieldM1916e3.setAccessible(true);
                return fieldM1916e3;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        r1 = java.lang.Class.forName(r1, false, r9.getClassLoader());
     */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1922n(String str, Context context, Class cls, Class cls2, LinkedHashSet linkedHashSet) throws IOException {
        int i2;
        Object c0104d;
        DexFile dexFile = new DexFile(str);
        try {
            Enumeration<String> enumerationEntries = dexFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                String strNextElement = enumerationEntries.nextElement();
                String[] strArr = f3170m;
                int i3 = 0;
                while (true) {
                    if (i3 < 3) {
                        String str2 = strArr[i3];
                        AbstractC0223g.m415b(strNextElement);
                        if (AbstractC0307q.m538h0(strNextElement, false, str2)) {
                            try {
                                break;
                            } catch (Throwable th) {
                                c0104d = new C0104d(th);
                            }
                        } else {
                            i3++;
                        }
                    }
                }
            }
            return;
            if (c0104d instanceof C0104d) {
                c0104d = null;
            }
            Class cls3 = (Class) c0104d;
            if (cls3 != null) {
                Method[] declaredMethods = cls3.getDeclaredMethods();
                AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                for (Method method : declaredMethods) {
                    if (AbstractC0223g.m414a(method.getReturnType(), cls)) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length != 0 && (cls2 == null || !Arrays.equals(method.getParameterTypes(), new Class[]{cls2}))) {
                        }
                        linkedHashSet.add(cls3);
                        break;
                    }
                }
            }
        } finally {
            dexFile.close();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final List m1923a(Class cls) {
        ConcurrentHashMap concurrentHashMap = this.f3174a;
        Object obj = concurrentHashMap.get(cls);
        Object obj2 = obj;
        if (obj == null) {
            ArrayList arrayList = new ArrayList();
            for (Class superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                Field[] declaredFields = superclass.getDeclaredFields();
                AbstractC0223g.m417d(declaredFields, "getDeclaredFields(...)");
                for (Field field : declaredFields) {
                    field.setAccessible(true);
                    arrayList.add(field);
                }
            }
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, arrayList);
            obj2 = arrayList;
            if (objPutIfAbsent != null) {
                obj2 = objPutIfAbsent;
            }
        }
        return (List) obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m1924b(Object obj, Set set, Class cls, Class cls2) {
        Object c0104d;
        Object c0104d2;
        Iterable<Method> iterable;
        Object c0104d3;
        String strM1915c;
        if (cls == null || cls.isInstance(obj)) {
            if (cls != null || AbstractC0174d.m360p(obj, "com.tencent.mm.plugin.sns.", false)) {
                String strM1926f = m1926f(obj, set);
                if (strM1926f != null) {
                    return strM1926f;
                }
                try {
                    c0104d = obj.getClass().getMethod("getUserName", null);
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                if (c0104d instanceof C0104d) {
                    c0104d = null;
                }
                Method method = (Method) c0104d;
                if (method != null) {
                    try {
                        method.setAccessible(true);
                        Object objInvoke = method.invoke(obj, null);
                        c0104d2 = objInvoke instanceof String ? (String) objInvoke : null;
                    } catch (Throwable th2) {
                        c0104d2 = new C0104d(th2);
                    }
                    if (c0104d2 instanceof C0104d) {
                        c0104d2 = null;
                    }
                    String str = (String) c0104d2;
                    String string = str != null ? AbstractC0299i.m507C0(str).toString() : null;
                    if (string != null && !AbstractC0307q.m534d0(string) && set.contains(string)) {
                        return string;
                    }
                }
                Class<?> cls3 = obj.getClass();
                if (cls2 == null) {
                    iterable = C0131s.f426a;
                } else {
                    ConcurrentHashMap concurrentHashMap = this.f3179f;
                    Object obj2 = concurrentHashMap.get(cls3);
                    if (obj2 == null) {
                        Method[] declaredMethods = cls3.getDeclaredMethods();
                        AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                        ArrayList arrayList = new ArrayList();
                        for (Method method2 : declaredMethods) {
                            Class<?>[] parameterTypes = method2.getParameterTypes();
                            AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                            if (parameterTypes.length == 0 && AbstractC0223g.m414a(method2.getReturnType(), cls2)) {
                                arrayList.add(method2);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((Method) it.next()).setAccessible(true);
                        }
                        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls3, arrayList);
                        obj2 = objPutIfAbsent == null ? arrayList : objPutIfAbsent;
                    }
                    iterable = (List) obj2;
                }
                for (Method method3 : iterable) {
                    try {
                        method3.setAccessible(true);
                        c0104d3 = method3.invoke(obj, null);
                    } catch (Throwable th3) {
                        c0104d3 = new C0104d(th3);
                    }
                    if (c0104d3 instanceof C0104d) {
                        c0104d3 = null;
                    }
                    if (c0104d3 != null && (strM1915c = m1915c(c0104d3, set, cls2)) != null) {
                        return strM1915c;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x03a0, code lost:
    
        r0 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x011b A[EXC_TOP_SPLITTER, PHI: r0
  0x011b: PHI (r0v14 r0.b1) = (r0v13 r0.b1), (r0v143 r0.b1) binds: [B:34:0x0087, B:74:0x0117] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0405 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x02e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x02e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x025e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015c  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1925d(Object obj, Class cls, Class cls2) {
        Object c0104d;
        Object objInvoke;
        Object objM277s0;
        int i2;
        Iterator it;
        Object c0104d2;
        String strM1915c;
        Object obj2;
        Object c0104d3;
        Object c0104d4;
        String str;
        Object c0104d5;
        Object c0104d6;
        Object c0104d7;
        C0889b1 c0889b1;
        Object c0104d8;
        Field fieldM1921m;
        Object c0104d9;
        Field fieldM1921m2;
        int i3 = -1;
        boolean z2 = true;
        boolean z3 = false;
        if (obj != null && (obj == this.f3180g || obj.getClass().getName().equals("com.tencent.mm.plugin.sns.ui.improve.component.g2"))) {
            if (obj != this.f3180g) {
                this.f3180g = obj;
            }
            List list = (List) m1917g(obj, "data");
            if (list != null) {
                boolean z4 = AbstractC1126i.f3786a;
                if (C1124g.m2448x()) {
                    if (!C1124g.m2443s() || !C1124g.m2435k().getHideSnsCloseFriendPosts()) {
                        return false;
                    }
                    Set setM1918h = m1918h();
                    if (!setM1918h.isEmpty()) {
                        int size = list.size() - 1;
                        while (i3 < size) {
                            Object objM269k0 = AbstractC0123k.m269k0(list, size);
                            if (objM269k0 == null) {
                                i2 = i3;
                            } else {
                                String strM2515i = AbstractC1140w.m2515i(objM269k0, setM1918h, cls, cls2);
                                if (strM2515i != null) {
                                    i2 = i3;
                                    if (strM2515i == null) {
                                        list.remove(size);
                                    }
                                } else {
                                    ConcurrentHashMap concurrentHashMap = this.f3178e;
                                    C0889b1 c0889b12 = (C0889b1) concurrentHashMap.get(objM269k0.getClass());
                                    Object[] objArr = null;
                                    if (c0889b12 != null) {
                                        try {
                                            Method method = c0889b12.f3070a;
                                            if (method != null) {
                                                objInvoke = method.invoke(objM269k0, null);
                                            } else {
                                                Field field = c0889b12.f3071b;
                                                objInvoke = field != null ? field.get(objM269k0) : objM269k0;
                                            }
                                        } catch (Throwable th) {
                                            c0104d = new C0104d(th);
                                        }
                                        if (objInvoke == null) {
                                            c0104d = null;
                                            if (c0104d instanceof C0104d) {
                                                c0104d = null;
                                            }
                                            strM2515i = (String) c0104d;
                                            if (strM2515i == null || AbstractC0307q.m534d0(strM2515i)) {
                                                if (AbstractC0174d.m360p(objM269k0, "com.tencent.mm.plugin.sns.", z3) || ((strM2515i = m1926f(objM269k0, setM1918h)) == null && (strM2515i = m1915c(objM269k0, setM1918h, cls2)) == null && (strM2515i = m1924b(objM269k0, setM1918h, cls, cls2)) == null)) {
                                                    ConcurrentHashMap concurrentHashMap2 = this.f3176c;
                                                    Class<?> cls3 = objM269k0.getClass();
                                                    objM277s0 = concurrentHashMap2.get(cls3);
                                                    String[] strArr = f3173p;
                                                    if (objM277s0 != null) {
                                                        List listM1927i = m1927i(objM269k0.getClass());
                                                        i2 = i3;
                                                        ArrayList arrayList = new ArrayList();
                                                        for (Object obj3 : listM1927i) {
                                                            try {
                                                                c0104d6 = ((Method) obj3).invoke(objM269k0, objArr);
                                                            } catch (Throwable th2) {
                                                                c0104d6 = new C0104d(th2);
                                                            }
                                                            Object obj4 = c0104d6 instanceof C0104d ? null : c0104d6;
                                                            if (obj4 != null) {
                                                                if ((cls != null && cls.isInstance(obj4)) || ((cls2 != null && cls2.isInstance(obj4)) || AbstractC0174d.m360p(obj4, "com.tencent.mm.plugin.sns.", z3) || m1919k(obj4, strArr))) {
                                                                    arrayList.add(obj3);
                                                                    break;
                                                                    break;
                                                                }
                                                                List listM1923a = m1923a(obj4.getClass());
                                                                if (!listM1923a.isEmpty()) {
                                                                    Iterator it2 = listM1923a.iterator();
                                                                    while (it2.hasNext()) {
                                                                        try {
                                                                            c0104d7 = ((Field) it2.next()).get(obj4);
                                                                        } catch (Throwable th3) {
                                                                            c0104d7 = new C0104d(th3);
                                                                        }
                                                                        if (c0104d7 instanceof C0104d) {
                                                                            c0104d7 = null;
                                                                        }
                                                                        if (c0104d7 != null && ((cls2 != null && cls2.isInstance(c0104d7)) || ((cls != null && cls.isInstance(c0104d7)) || m1919k(c0104d7, strArr)))) {
                                                                            arrayList.add(obj3);
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            z3 = false;
                                                            objArr = null;
                                                        }
                                                        objM277s0 = AbstractC0123k.m277s0(arrayList, 2);
                                                        Object objPutIfAbsent = concurrentHashMap2.putIfAbsent(cls3, objM277s0);
                                                        if (objPutIfAbsent != null) {
                                                            objM277s0 = objPutIfAbsent;
                                                        }
                                                    } else {
                                                        i2 = i3;
                                                    }
                                                    it = ((List) objM277s0).iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            strM2515i = null;
                                                            break;
                                                        }
                                                        try {
                                                            c0104d4 = ((Method) it.next()).invoke(objM269k0, null);
                                                        } catch (Throwable th4) {
                                                            c0104d4 = new C0104d(th4);
                                                        }
                                                        if (c0104d4 instanceof C0104d) {
                                                            c0104d4 = null;
                                                        }
                                                        if (c0104d4 != null) {
                                                            String strM1915c2 = m1915c(c0104d4, setM1918h, cls2);
                                                            if (strM1915c2 == null && (strM1915c2 = m1924b(c0104d4, setM1918h, cls, cls2)) == null && (!m1919k(c0104d4, strArr) || (strM1915c2 = m1926f(c0104d4, setM1918h)) == null)) {
                                                                for (Field field2 : m1923a(c0104d4.getClass())) {
                                                                    try {
                                                                        field2.setAccessible(true);
                                                                        c0104d5 = field2.get(c0104d4);
                                                                    } catch (Throwable th5) {
                                                                        c0104d5 = new C0104d(th5);
                                                                    }
                                                                    if (c0104d5 instanceof C0104d) {
                                                                        c0104d5 = null;
                                                                    }
                                                                    if (c0104d5 != null && ((strM1915c2 = m1915c(c0104d5, setM1918h, cls2)) != null || (m1919k(c0104d5, strArr) && (strM1915c2 = m1926f(c0104d5, setM1918h)) != null))) {
                                                                        str = strM1915c2;
                                                                        break;
                                                                    }
                                                                }
                                                                str = null;
                                                                if (str == null) {
                                                                    strM2515i = str;
                                                                    break;
                                                                }
                                                            } else {
                                                                str = strM1915c2;
                                                                if (str == null) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (strM2515i == null) {
                                                        Class<?> cls4 = objM269k0.getClass();
                                                        ConcurrentHashMap concurrentHashMap3 = this.f3177d;
                                                        Object obj5 = concurrentHashMap3.get(cls4);
                                                        if (obj5 == null) {
                                                            Method[] declaredMethods = cls4.getDeclaredMethods();
                                                            AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                                                            ArrayList arrayList2 = new ArrayList();
                                                            int length = declaredMethods.length;
                                                            int i4 = 0;
                                                            while (i4 < length) {
                                                                Method method2 = declaredMethods[i4];
                                                                Class<?>[] parameterTypes = method2.getParameterTypes();
                                                                Method[] methodArr = declaredMethods;
                                                                AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                                                                if (parameterTypes.length == 0 && !method2.getReturnType().isPrimitive() && !AbstractC0223g.m414a(method2.getReturnType(), Void.TYPE) && ((cls2 != null && AbstractC0223g.m414a(method2.getReturnType(), cls2)) || (cls != null && AbstractC0223g.m414a(method2.getReturnType(), cls)))) {
                                                                    arrayList2.add(method2);
                                                                }
                                                                i4++;
                                                                declaredMethods = methodArr;
                                                            }
                                                            Iterator it3 = arrayList2.iterator();
                                                            while (it3.hasNext()) {
                                                                ((Method) it3.next()).setAccessible(true);
                                                            }
                                                            Object objPutIfAbsent2 = concurrentHashMap3.putIfAbsent(cls4, arrayList2);
                                                            obj5 = objPutIfAbsent2 == null ? arrayList2 : objPutIfAbsent2;
                                                        }
                                                        Iterator it4 = ((List) obj5).iterator();
                                                        while (true) {
                                                            if (!it4.hasNext()) {
                                                                Iterator it5 = m1923a(objM269k0.getClass()).iterator();
                                                                while (true) {
                                                                    if (!it5.hasNext()) {
                                                                        strM2515i = null;
                                                                        break;
                                                                    }
                                                                    Field field3 = (Field) it5.next();
                                                                    try {
                                                                        field3.setAccessible(true);
                                                                        c0104d2 = field3.get(objM269k0);
                                                                    } catch (Throwable th6) {
                                                                        c0104d2 = new C0104d(th6);
                                                                    }
                                                                    if (c0104d2 instanceof C0104d) {
                                                                        c0104d2 = null;
                                                                    }
                                                                    if (c0104d2 != null) {
                                                                        strM1915c = m1915c(c0104d2, setM1918h, cls2);
                                                                        if (strM1915c != null || (strM1915c = m1924b(c0104d2, setM1918h, cls, cls2)) != null) {
                                                                            break;
                                                                        }
                                                                        if (AbstractC0174d.m360p(c0104d2, "com.tencent.mm.plugin.sns.", false) && (strM2515i = m1926f(c0104d2, setM1918h)) != null) {
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                Method method3 = (Method) it4.next();
                                                                try {
                                                                    method3.setAccessible(true);
                                                                    obj2 = null;
                                                                    try {
                                                                        c0104d3 = method3.invoke(objM269k0, null);
                                                                    } catch (Throwable th7) {
                                                                        th = th7;
                                                                        c0104d3 = new C0104d(th);
                                                                    }
                                                                } catch (Throwable th8) {
                                                                    th = th8;
                                                                    obj2 = null;
                                                                }
                                                                if (c0104d3 instanceof C0104d) {
                                                                    c0104d3 = obj2;
                                                                }
                                                                if (c0104d3 != null) {
                                                                    strM1915c = m1915c(c0104d3, setM1918h, cls2);
                                                                    if (strM1915c != null || (strM1915c = m1924b(c0104d3, setM1918h, cls, cls2)) != null) {
                                                                        break;
                                                                    }
                                                                    strM2515i = m1926f(c0104d3, setM1918h);
                                                                    if (strM2515i != null) {
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                if (strM2515i == null) {
                                                }
                                            } else if (!setM1918h.contains(strM2515i)) {
                                                strM2515i = null;
                                            }
                                            i2 = i3;
                                            if (strM2515i == null) {
                                            }
                                        } else {
                                            Object obj6 = c0889b12.f3072c.get(objInvoke);
                                            String str2 = obj6 instanceof String ? (String) obj6 : null;
                                            if (str2 != null) {
                                                c0104d = AbstractC0299i.m507C0(str2).toString();
                                            }
                                            if (c0104d instanceof C0104d) {
                                            }
                                            strM2515i = (String) c0104d;
                                            if (strM2515i == null) {
                                                if (AbstractC0174d.m360p(objM269k0, "com.tencent.mm.plugin.sns.", z3)) {
                                                }
                                                ConcurrentHashMap concurrentHashMap22 = this.f3176c;
                                                Class<?> cls32 = objM269k0.getClass();
                                                objM277s0 = concurrentHashMap22.get(cls32);
                                                String[] strArr2 = f3173p;
                                                if (objM277s0 != null) {
                                                }
                                                it = ((List) objM277s0).iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                    }
                                                }
                                                if (strM2515i == null) {
                                                }
                                                if (strM2515i == null) {
                                                }
                                            }
                                        }
                                    } else {
                                        Field fieldM1921m3 = m1921m(objM269k0, cls, cls2);
                                        if (fieldM1921m3 == null) {
                                            Iterator it6 = m1927i(objM269k0.getClass()).iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    Method method4 = (Method) it6.next();
                                                    try {
                                                        c0104d9 = method4.invoke(objM269k0, null);
                                                    } catch (Throwable th9) {
                                                        c0104d9 = new C0104d(th9);
                                                    }
                                                    if (c0104d9 instanceof C0104d) {
                                                        c0104d9 = null;
                                                    }
                                                    if (c0104d9 != null && (fieldM1921m2 = m1921m(c0104d9, cls, cls2)) != null) {
                                                        c0889b1 = new C0889b1(method4, null, fieldM1921m2);
                                                        break;
                                                    }
                                                } else {
                                                    Iterator it7 = m1923a(objM269k0.getClass()).iterator();
                                                    while (true) {
                                                        if (!it7.hasNext()) {
                                                            c0889b1 = null;
                                                            break;
                                                        }
                                                        Field field4 = (Field) it7.next();
                                                        try {
                                                            c0104d8 = field4.get(objM269k0);
                                                        } catch (Throwable th10) {
                                                            c0104d8 = new C0104d(th10);
                                                        }
                                                        if (c0104d8 instanceof C0104d) {
                                                            c0104d8 = null;
                                                        }
                                                        if (c0104d8 != null && (fieldM1921m = m1921m(c0104d8, cls, cls2)) != null) {
                                                            c0889b1 = new C0889b1(null, field4, fieldM1921m);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            c0889b1 = new C0889b1(null, null, fieldM1921m3);
                                        }
                                        if (c0889b1 != null) {
                                            concurrentHashMap.put(objM269k0.getClass(), c0889b1);
                                            c0889b12 = c0889b1;
                                        } else {
                                            c0889b12 = null;
                                        }
                                        if (c0889b12 == null) {
                                            strM2515i = null;
                                        }
                                        if (strM2515i == null) {
                                        }
                                    }
                                }
                            }
                            size--;
                            i3 = i2;
                            z2 = true;
                            z3 = false;
                        }
                    }
                    return z2;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final String m1926f(Object obj, Set set) {
        Object c0104d;
        String[] strArr = f3172o;
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                for (Field field : m1923a(obj.getClass())) {
                    try {
                        field.setAccessible(true);
                        Object obj2 = field.get(obj);
                        c0104d = obj2 instanceof String ? (String) obj2 : null;
                    } catch (Throwable th) {
                        c0104d = new C0104d(th);
                    }
                    if (c0104d instanceof C0104d) {
                        c0104d = null;
                    }
                    String str = (String) c0104d;
                    String string = str != null ? AbstractC0299i.m507C0(str).toString() : null;
                    if (string != null && !AbstractC0307q.m534d0(string) && set.contains(string)) {
                        return string;
                    }
                }
                return null;
            }
            String str2 = (String) m1917g(obj, strArr[i2]);
            String string2 = str2 != null ? AbstractC0299i.m507C0(str2).toString() : null;
            if (string2 != null && !AbstractC0307q.m534d0(string2) && set.contains(string2)) {
                return string2;
            }
            i2++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:125:0x039a  */
    @Override // p062e0.InterfaceC0551a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleHook(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        int i2;
        String str;
        int i3;
        String str2;
        Class cls;
        int i4;
        Object c0104d;
        String[] strArr;
        C0901f1 c0901f1 = this;
        c0901f1.f3182i = AbstractC0039l.m75m(context);
        ConcurrentHashMap concurrentHashMap = AbstractC1140w.f3846a;
        AbstractC1140w.f3852g = c0901f1.f3182i;
        CopyOnWriteArrayList copyOnWriteArrayList = C0052y.f291a;
        C0052y.m98c(context, new C0048u("sns_moment", "朋友圈隐藏", new C0863P(25), new C0035h(context, 17), new C0060d(6, c0901f1), new C0026a(16)));
        if (AbstractC1135r.f3833e == -1) {
            try {
                i2 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
            } catch (Exception e2) {
                AbstractC0731a.m1385b(e2);
                i2 = -1;
            }
            AbstractC1135r.f3833e = i2;
        }
        int i5 = AbstractC1135r.f3833e;
        if (i5 == 3060 || i5 == 3080 || i5 == 3100 || i5 == 3120 || c0901f1.f3182i != null) {
            Class clsMo1021l = AbstractC0514f.f1622b.mo1021l(context.getClassLoader(), "com.tencent.mm.protocal.protobuf.SnsObject");
            if (clsMo1021l == null) {
                AbstractC0731a.m1387d("hide sns like SnsObject class missing");
                return;
            }
            Class clsMo1021l2 = AbstractC0514f.f1622b.mo1021l(context.getClassLoader(), "com.tencent.mm.plugin.sns.storage.SnsInfo");
            Class clsMo1021l3 = AbstractC0514f.f1622b.mo1021l(context.getClassLoader(), "com.tencent.mm.protocal.protobuf.TimeLineObject");
            Class clsMo1021l4 = AbstractC0514f.f1622b.mo1021l(context.getClassLoader(), "com.tencent.mm.view.recyclerview.WxRecyclerAdapter");
            String str3 = "onResume";
            String str4 = "getParameterTypes(...)";
            if (clsMo1021l4 == null) {
                AbstractC0731a.m1387d("hide sns posts adapter class missing");
                str = "onResume";
            } else {
                List listM1928j = c0901f1.m1928j();
                ArrayList arrayList = new ArrayList();
                Iterator it = listM1928j.iterator();
                while (it.hasNext()) {
                    Class clsMo1021l5 = AbstractC0514f.f1622b.mo1021l(context.getClassLoader(), (String) it.next());
                    if (clsMo1021l5 != null) {
                        arrayList.add(clsMo1021l5);
                    }
                }
                boolean z2 = true;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Class cls2 = (Class) it2.next();
                    Method[] declaredMethods = cls2.getDeclaredMethods();
                    AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                    ArrayList arrayList2 = new ArrayList();
                    int length = declaredMethods.length;
                    int i6 = 0;
                    while (i6 < length) {
                        int i7 = i6;
                        Method method = declaredMethods[i7];
                        Iterator it3 = it2;
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0) {
                            Class<?> returnType = method.getReturnType();
                            cls = cls2;
                            AbstractC0223g.m417d(returnType, "getReturnType(...)");
                            if (m1920l(returnType, clsMo1021l4)) {
                                arrayList2.add(method);
                            }
                        } else {
                            cls = cls2;
                        }
                        i6 = i7 + 1;
                        it2 = it3;
                        cls2 = cls;
                    }
                    Iterator it4 = it2;
                    Class cls3 = cls2;
                    Iterator it5 = arrayList2.iterator();
                    while (it5.hasNext()) {
                        Method method2 = (Method) it5.next();
                        Iterator it6 = it5;
                        String str5 = "hide-sns-posts-adapter-provider-" + method2.getDeclaringClass().getName() + "-" + method2.getName();
                        if (!MainHook.uniqueMetaStore.contains(str5)) {
                            method2.setAccessible(z2);
                            AbstractC0514f.m1027d(method2, new C0895d1(c0901f1, clsMo1021l2, clsMo1021l3, 0));
                            MainHook.uniqueMetaStore.add(str5);
                        }
                        it5 = it6;
                        z2 = true;
                    }
                    if (AbstractC1135r.f3833e == -1) {
                        try {
                            i3 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
                        } catch (Exception e3) {
                            AbstractC0731a.m1385b(e3);
                            i3 = -1;
                        }
                        AbstractC1135r.f3833e = i3;
                    }
                    if (AbstractC1135r.f3833e != 3060) {
                        Method[] declaredMethods2 = cls3.getDeclaredMethods();
                        AbstractC0223g.m417d(declaredMethods2, "getDeclaredMethods(...)");
                        ArrayList arrayList3 = new ArrayList();
                        int length2 = declaredMethods2.length;
                        int i8 = 0;
                        while (i8 < length2) {
                            Method method3 = declaredMethods2[i8];
                            Method[] methodArr = declaredMethods2;
                            if (method3.getParameterTypes().length == 1 && method3.getParameterTypes()[0].getName().equals("android.os.Bundle") && AbstractC0223g.m414a(method3.getName(), "onCreate")) {
                                arrayList3.add(method3);
                            }
                            i8++;
                            declaredMethods2 = methodArr;
                        }
                        Method[] declaredMethods3 = cls3.getDeclaredMethods();
                        AbstractC0223g.m417d(declaredMethods3, "getDeclaredMethods(...)");
                        ArrayList arrayList4 = new ArrayList();
                        int length3 = declaredMethods3.length;
                        int i9 = 0;
                        while (i9 < length3) {
                            Method method4 = declaredMethods3[i9];
                            Method[] methodArr2 = declaredMethods3;
                            Class<?>[] parameterTypes2 = method4.getParameterTypes();
                            AbstractC0223g.m417d(parameterTypes2, "getParameterTypes(...)");
                            if (parameterTypes2.length == 0 && AbstractC0223g.m414a(method4.getName(), str3)) {
                                arrayList4.add(method4);
                            }
                            i9++;
                            declaredMethods3 = methodArr2;
                        }
                        for (Method method5 : AbstractC0123k.m273o0(arrayList3, arrayList4)) {
                            String str6 = "hide-sns-posts-lifecycle-capture-" + method5.getDeclaringClass().getName() + "-" + method5.getName();
                            if (MainHook.uniqueMetaStore.contains(str6)) {
                                str2 = str3;
                            } else {
                                method5.setAccessible(true);
                                str2 = str3;
                                AbstractC0514f.m1027d(method5, new C0898e1(this, clsMo1021l4, clsMo1021l2, clsMo1021l3, 0));
                                MainHook.uniqueMetaStore.add(str6);
                            }
                            str3 = str2;
                        }
                        c0901f1 = this;
                    }
                    str3 = str3;
                    it2 = it4;
                    z2 = true;
                }
                str = str3;
                Method[] methods = clsMo1021l4.getMethods();
                AbstractC0223g.m417d(methods, "getMethods(...)");
                ArrayList arrayList5 = new ArrayList();
                int length4 = methods.length;
                int i10 = 0;
                while (i10 < length4) {
                    Method method6 = methods[i10];
                    Method[] methodArr3 = methods;
                    if (f3171n.contains(method6.getName())) {
                        arrayList5.add(method6);
                    }
                    i10++;
                    methods = methodArr3;
                }
                Iterator it7 = arrayList5.iterator();
                while (it7.hasNext()) {
                    Method method7 = (Method) it7.next();
                    String name = method7.getDeclaringClass().getName();
                    String name2 = method7.getName();
                    Class<?>[] parameterTypes3 = method7.getParameterTypes();
                    AbstractC0223g.m417d(parameterTypes3, str4);
                    Iterator it8 = it7;
                    String str7 = str4;
                    String str8 = "hide-sns-posts-" + name + "-" + name2 + "-" + AbstractC0120h.m260h0(parameterTypes3, "#", new C0863P(26), 30);
                    if (!MainHook.uniqueMetaStore.contains(str8)) {
                        method7.setAccessible(true);
                        AbstractC0514f.m1027d(method7, new C0895d1(c0901f1, clsMo1021l2, clsMo1021l3, 1));
                        MainHook.uniqueMetaStore.add(str8);
                    }
                    it7 = it8;
                    str4 = str7;
                }
            }
            String str9 = str4;
            C0022W c0022w = c0901f1.f3182i;
            List list = c0022w != null ? c0022w.f165c : null;
            List list2 = C0131s.f426a;
            if (list == null || list.isEmpty()) {
                if (AbstractC1135r.f3833e == -1) {
                    try {
                        i4 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
                    } catch (Exception e4) {
                        AbstractC0731a.m1385b(e4);
                        i4 = -1;
                    }
                    AbstractC1135r.f3833e = i4;
                }
                int i11 = AbstractC1135r.f3833e;
                if (i11 == 3100 || i11 == 3120) {
                    C0022W c0022w2 = c0901f1.f3182i;
                    List list3 = c0022w2 != null ? c0022w2.f165c : null;
                    if (list3 == null) {
                        list3 = list2;
                    }
                    List<String> listM281w0 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m274p0(list3, f3169l)));
                    ArrayList<Class> arrayList6 = new ArrayList();
                    for (String str10 : listM281w0) {
                        Class clsMo1021l6 = AbstractC0514f.f1622b.mo1021l(context.getClassLoader(), str10);
                        if (clsMo1021l6 == null) {
                            AbstractC0731a.m1387d("hide sns detail group icon activity missing", str10);
                        }
                        if (clsMo1021l6 != null) {
                            arrayList6.add(clsMo1021l6);
                        }
                    }
                    for (Class cls4 : arrayList6) {
                        for (Method method8 : AbstractC0120h.m255c0(new Method[]{AbstractC0514f.f1622b.mo1011b(cls4, str, new Object[0]), AbstractC0514f.f1622b.mo1011b(cls4, "onWindowFocusChanged", Boolean.TYPE)})) {
                            String str11 = "hide-sns-detail-group-icon-" + method8.getDeclaringClass().getName() + "-" + method8.getName();
                            if (!MainHook.uniqueMetaStore.contains(str11)) {
                                AbstractC0514f.m1027d(method8, new C0892c1(c0901f1, 0));
                                MainHook.uniqueMetaStore.add(str11);
                            }
                        }
                    }
                }
            }
            List<String> listM1928j2 = c0901f1.m1928j();
            ArrayList arrayList7 = new ArrayList();
            for (String str12 : listM1928j2) {
                Class clsMo1021l7 = AbstractC0514f.f1622b.mo1021l(context.getClassLoader(), str12);
                if (clsMo1021l7 == null) {
                    AbstractC0731a.m1387d("hide sns like target class missing", str12);
                }
                if (clsMo1021l7 != null) {
                    arrayList7.add(clsMo1021l7);
                }
            }
            C0022W c0022w3 = c0901f1.f3182i;
            List list4 = c0022w3 != null ? c0022w3.f164b : null;
            if (list4 != null) {
                list2 = list4;
            }
            ArrayList arrayList8 = new ArrayList();
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                Class clsMo1021l8 = AbstractC0514f.f1622b.mo1021l(context.getClassLoader(), (String) it9.next());
                if (clsMo1021l8 != null) {
                    arrayList8.add(clsMo1021l8);
                }
            }
            ArrayList arrayListM273o0 = AbstractC0123k.m273o0(arrayList7, arrayList8);
            ArrayList arrayList9 = new ArrayList();
            arrayList9.add(context.getPackageCodePath());
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo != null && (strArr = applicationInfo.splitSourceDirs) != null) {
                for (String str13 : strArr) {
                    arrayList9.add(str13);
                }
            }
            ArrayList arrayList10 = new ArrayList();
            for (Object obj : arrayList9) {
                if (!AbstractC0307q.m534d0((String) obj)) {
                    arrayList10.add(obj);
                }
            }
            List<String> listM281w02 = AbstractC0123k.m281w0(AbstractC0123k.m264A0(arrayList10));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (String str14 : listM281w02) {
                try {
                    m1922n(str14, context, clsMo1021l, clsMo1021l2, linkedHashSet);
                    c0104d = C0109i.f404a;
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                Throwable thM246a = AbstractC0105e.m246a(c0104d);
                if (thM246a != null) {
                    AbstractC0731a.m1387d("hide sns like dex scan fail", str14, thM246a);
                }
            }
            ArrayList arrayListM273o02 = AbstractC0123k.m273o0(arrayListM273o0, AbstractC0123k.m281w0(linkedHashSet));
            HashSet hashSet = new HashSet();
            ArrayList arrayList11 = new ArrayList();
            for (Object obj2 : arrayListM273o02) {
                if (hashSet.add(((Class) obj2).getName())) {
                    arrayList11.add(obj2);
                }
            }
            Iterator it10 = arrayList11.iterator();
            while (it10.hasNext()) {
                Method[] declaredMethods4 = ((Class) it10.next()).getDeclaredMethods();
                AbstractC0223g.m417d(declaredMethods4, "getDeclaredMethods(...)");
                ArrayList<Method> arrayList12 = new ArrayList();
                for (Method method9 : declaredMethods4) {
                    if (AbstractC0223g.m414a(method9.getReturnType(), clsMo1021l)) {
                        arrayList12.add(method9);
                    }
                }
                for (Method method10 : arrayList12) {
                    String name3 = method10.getDeclaringClass().getName();
                    String name4 = method10.getName();
                    Class<?>[] parameterTypes4 = method10.getParameterTypes();
                    String str15 = str9;
                    AbstractC0223g.m417d(parameterTypes4, str15);
                    String str16 = "hide-sns-like-" + name3 + "-" + name4 + "-" + AbstractC0120h.m260h0(parameterTypes4, "#", new C0863P(24), 30);
                    if (!MainHook.uniqueMetaStore.contains(str16)) {
                        method10.setAccessible(true);
                        AbstractC0514f.m1027d(method10, new C0892c1(c0901f1, 1));
                        MainHook.uniqueMetaStore.add(str16);
                    }
                    str9 = str15;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final List m1927i(Class cls) {
        ConcurrentHashMap concurrentHashMap = this.f3175b;
        Object obj = concurrentHashMap.get(cls);
        if (obj == null) {
            Method[] declaredMethods = cls.getDeclaredMethods();
            AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
            ArrayList arrayList = new ArrayList();
            for (Method method : declaredMethods) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                if (parameterTypes.length == 0 && !method.getReturnType().isPrimitive() && !AbstractC0223g.m414a(method.getReturnType(), Void.TYPE) && !AbstractC0223g.m414a(method.getReturnType(), String.class) && !method.getReturnType().getName().equals("java.lang.Class")) {
                    arrayList.add(method);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Method) it.next()).setAccessible(true);
            }
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, arrayList);
            obj = objPutIfAbsent == null ? arrayList : objPutIfAbsent;
        }
        return (List) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final List m1928j() {
        C0022W c0022w = this.f3182i;
        List list = c0022w != null ? c0022w.f163a : null;
        if (list == null) {
            list = C0131s.f426a;
        }
        return AbstractC0123k.m281w0(AbstractC0123k.m264A0(AbstractC0123k.m273o0(list, AbstractC0120h.m252Z(new String[]{"com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI"}))));
    }
}
