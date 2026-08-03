package p136j8;

import android.content.Context;
import android.content.SharedPreferences;
import ch.C0570e;
import gg.AbstractC1416l;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p009a9.C0031h;
import p025bc.AbstractC0255e;
import p054dg.AbstractC0793l;
import p062e8.C0828b;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1235p;
import p086fh.C1253k;
import p099h.Hchat.utils.KavaReflector;
import p115hh.C1730o;
import p115hh.C1731p;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3963j;
import p300ub.AbstractC4302b;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: j8.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2093d {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f6997a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap f6998b = new ConcurrentHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m5177a(ClassLoader classLoader, Object obj, String str, ArrayList arrayList, Set set, int i9) {
        Object field;
        if (obj == null || i9 > 4 || !set.add(obj)) {
            return;
        }
        if (!(obj instanceof String)) {
            if (obj instanceof Object[]) {
                for (Object obj2 : (Object[]) obj) {
                    m5177a(classLoader, obj2, str, arrayList, set, i9 + 1);
                }
                return;
            }
            if (obj instanceof Collection) {
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    m5177a(classLoader, it.next(), str, arrayList, set, i9 + 1);
                }
                return;
            }
            String name = obj.getClass().getName();
            if (AbstractC3156t.m6740d0(name, "android.", false) || AbstractC3156t.m6740d0(name, "java.lang.", false) || AbstractC3156t.m6740d0(name, "java.io.", false)) {
                return;
            }
            for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                for (Field field2 : KavaReflector.declaredFields(superclass)) {
                    if (!field2.getType().isPrimitive() && (field = KavaReflector.readField(field2, obj)) != null) {
                        m5177a(classLoader, field, str, arrayList, set, i9 + 1);
                    }
                }
            }
            return;
        }
        String str2 = (String) obj;
        int i10 = -1;
        if (!AbstractC3149m.m6721t0(str2) && (AbstractC3149m.m6710i0(str2, '/') || AbstractC3149m.m6709h0(str2, "://", false))) {
            File file = new File(str2);
            if (m5188l(classLoader, str2)) {
                Locale locale = Locale.US;
                String strM5165l = AbstractC2091b.m5165l(locale, str2, locale);
                String name2 = file.getName();
                name2.getClass();
                String lowerCase = name2.toLowerCase(locale);
                lowerCase.getClass();
                int i11 = (AbstractC3149m.m6721t0(str) || !AbstractC1416l.m3825a(file.getName(), str)) ? 0 : 30;
                if (!AbstractC3149m.m6721t0(str)) {
                    String name3 = file.getName();
                    name3.getClass();
                    if (AbstractC3156t.m6740d0(name3, str, false)) {
                        i11 += 24;
                    }
                }
                if (!AbstractC3149m.m6721t0(str) && AbstractC3149m.m6709h0(str2, str, false)) {
                    i11 += 18;
                }
                int i12 = !AbstractC3156t.m6733W(lowerCase, "_t", false) ? i11 + 12 : i11 - 30;
                if (AbstractC3156t.m6733W(lowerCase, ".silk", false) || AbstractC3156t.m6733W(lowerCase, ".slk", false) || AbstractC3156t.m6733W(lowerCase, ".amr", false) || AbstractC3156t.m6733W(lowerCase, ".spx", false) || AbstractC3156t.m6733W(lowerCase, ".speex", false) || AbstractC3156t.m6733W(lowerCase, ".mp3", false)) {
                    i12 += 16;
                }
                if (AbstractC3149m.m6709h0(strM5165l, "/favorite", false) || AbstractC3149m.m6709h0(strM5165l, "/fav/", false)) {
                    i12 += 4;
                }
                if (AbstractC3149m.m6709h0(strM5165l, "voice", false)) {
                    i12 += 4;
                }
                i10 = i12;
                if (file.isFile() && file.length() > 0) {
                    i10 += 2;
                }
            }
        }
        Integer numValueOf = Integer.valueOf(i10);
        if (!(i10 >= 0)) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            arrayList.add(new C3958e(obj, Integer.valueOf(numValueOf.intValue())));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m5178b(Object obj) {
        String[] strArr = {"T", "Z"};
        for (int i9 = 0; i9 < 2; i9++) {
            Object field = KavaReflector.readField(obj, strArr[i9]);
            String str = field instanceof String ? (String) field : null;
            if (str != null) {
                String str2 = AbstractC3149m.m6721t0(str) ? null : str;
                if (str2 != null) {
                    return str2;
                }
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m5179c(ClassLoader classLoader, String str, String str2, Method method) {
        int i9;
        if (AbstractC3149m.m6721t0(str)) {
            return -1;
        }
        if (!AbstractC3149m.m6710i0(str, '/') && !AbstractC3149m.m6709h0(str, "://", false)) {
            return -1;
        }
        File file = new File(str);
        Locale locale = Locale.US;
        String strM5165l = AbstractC2091b.m5165l(locale, str, locale);
        String name = file.getName();
        name.getClass();
        String lowerCase = name.toLowerCase(locale);
        lowerCase.getClass();
        String name2 = method != null ? method.getName() : null;
        if (name2 == null) {
            i9 = 0;
        } else {
            int iHashCode = name2.hashCode();
            if (iHashCode != 88) {
                i9 = iHashCode != 119 ? 80 : 80;
            } else if (name2.equals("X")) {
                i9 = -20;
            }
        }
        if (!AbstractC3149m.m6721t0(str2) && AbstractC1416l.m3825a(file.getName(), str2)) {
            i9 += 40;
        }
        if (!AbstractC3149m.m6721t0(str2)) {
            String name3 = file.getName();
            name3.getClass();
            if (AbstractC3156t.m6740d0(name3, str2, false)) {
                i9 += 30;
            }
        }
        if (!AbstractC3149m.m6721t0(str2) && AbstractC3149m.m6709h0(str, str2, false)) {
            i9 += 20;
        }
        int i10 = !AbstractC3156t.m6733W(lowerCase, "_t", false) ? i9 + 10 : i9 - 30;
        if (AbstractC3149m.m6709h0(strM5165l, "/favorite", false) || AbstractC3149m.m6709h0(strM5165l, "/fav/", false)) {
            i10 += 8;
        }
        if (AbstractC3149m.m6709h0(strM5165l, "voice", false)) {
            i10 += 6;
        }
        return m5188l(classLoader, str) ? i10 + 24 : i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:117:0x0131 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX INFO: renamed from: d */
    public static List m5180d(Context context, ClassLoader classLoader, DexKitBridge dexKitBridge, Object obj, InterfaceC1235p interfaceC1235p) {
        ?? c3959f;
        ?? r72;
        Object c3959f2;
        int iM5179c;
        Class<?> cls = obj.getClass();
        String strM5178b = m5178b(obj);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ConcurrentHashMap concurrentHashMap = f6997a;
        Method method = (Method) concurrentHashMap.get(cls);
        if (method != null) {
            Object objInvoke = KavaReflector.invoke(method, null, obj);
            String str = objInvoke instanceof String ? (String) objInvoke : null;
            if (str != null) {
                if (!(m5179c(classLoader, str, strM5178b, method) >= 0)) {
                    str = null;
                }
                if (str != null) {
                    linkedHashSet.add(str);
                }
            }
        }
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_favorite_voice_method_cache");
        String strConcat = "fav_data_path_v2_".concat(cls.getName());
        String strM2091g = C0828b.m2091g(context, classLoader);
        Method methodM2087c = C0828b.m2087c(sharedPreferencesM8640c, strM2091g, classLoader, strConcat);
        if (methodM2087c != null && m5184h(cls, methodM2087c)) {
            concurrentHashMap.put(cls, methodM2087c);
            Object objInvoke2 = KavaReflector.invoke(methodM2087c, null, obj);
            String str2 = objInvoke2 instanceof String ? (String) objInvoke2 : null;
            if (str2 != null) {
                if (!(m5179c(classLoader, str2, strM5178b, methodM2087c) >= 0)) {
                    str2 = null;
                }
                if (str2 != null) {
                    linkedHashSet.add(str2);
                }
            }
        }
        C4173t c4173t = C4173t.f13710g;
        List<Method> list = c4173t;
        if (dexKitBridge != null) {
            try {
                C0570e c0570e = new C0570e();
                C1253k c1253k = new C1253k();
                C1253k.m3366q0(c1253k, "java.lang.String");
                c1253k.m3372o0(cls.getName());
                c0570e.f1764h = c1253k;
                C1731p<C1730o> c1731pFindMethod = dexKitBridge.findMethod(c0570e);
                ArrayList arrayList = new ArrayList();
                for (C1730o c1730o : c1731pFindMethod) {
                    try {
                        c1730o.getClass();
                        c3959f2 = c1730o.m4348p().m6023b(classLoader);
                    } catch (Throwable th2) {
                        c3959f2 = new C3959f(th2);
                    }
                    if (c3959f2 instanceof C3959f) {
                        c3959f2 = null;
                    }
                    Method method2 = (Method) c3959f2;
                    if (method2 != null) {
                        arrayList.add(method2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (m5184h(cls, (Method) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                HashSet hashSet = new HashSet();
                c3959f = new ArrayList();
                for (Object obj3 : arrayList2) {
                    if (hashSet.add(((Method) obj3).toGenericString())) {
                        c3959f.add(obj3);
                    }
                }
            } catch (Throwable th3) {
                c3959f = new C3959f(th3);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b == null) {
                r72 = c3959f;
            } else {
                interfaceC1235p.invoke("收藏媒体定位文件路径方法失败", thM8182b);
                r72 = c4173t;
            }
            list = (List) r72;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Method method3 : list) {
            Object objInvoke3 = KavaReflector.invoke(method3, null, obj);
            String str3 = objInvoke3 instanceof String ? (String) objInvoke3 : null;
            C3963j c3963j = (str3 == null || (iM5179c = m5179c(classLoader, str3, strM5178b, method3)) < 0) ? null : new C3963j(method3, str3, Integer.valueOf(iM5179c));
            if (c3963j != null) {
                arrayList3.add(c3963j);
            }
        }
        List listM8402K1 = AbstractC4166m.m8402K1(arrayList3, new C0031h(22));
        C3963j c3963j2 = (C3963j) AbstractC4166m.m8424v1(listM8402K1);
        if (c3963j2 != null) {
            Object obj4 = c3963j2.f12971g;
            concurrentHashMap.put(cls, obj4);
            C0828b.m2092h(sharedPreferencesM8640c, strM2091g, strConcat, (Method) obj4);
        }
        Iterator it = listM8402K1.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((C3963j) it.next()).f12972h);
        }
        return AbstractC4166m.m8407P1(linkedHashSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static int m5181e(Object obj) {
        Number numberM5183g = m5183g(obj, "field_type", "type");
        if (numberM5183g != null) {
            return numberM5183g.intValue();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x001f A[SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m5182f(Object obj) {
        Object next;
        Object field = KavaReflector.readField(obj, "field_favProto");
        if (field != null) {
            for (Class<?> superclass = field.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                for (Field field2 : KavaReflector.declaredFields(superclass)) {
                    if (Collection.class.isAssignableFrom(field2.getType())) {
                        Object field3 = KavaReflector.readField(field2, field);
                        Collection collection = field3 instanceof Collection ? (Collection) field3 : null;
                        if (collection != null) {
                            Iterator it = collection.iterator();
                            while (it.hasNext()) {
                                next = it.next();
                                if (next != null) {
                                    break;
                                }
                            }
                            next = null;
                            if (next == null) {
                                return next;
                            }
                        } else {
                            next = null;
                            if (next == null) {
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static Number m5183g(Object obj, String... strArr) {
        for (String str : strArr) {
            Object field = KavaReflector.readField(obj, str);
            if (field instanceof Number) {
                return (Number) field;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static boolean m5184h(Class cls, Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return Modifier.isStatic(method.getModifiers()) && AbstractC1416l.m3825a(method.getReturnType(), String.class) && parameterTypes.length == 1 && parameterTypes[0].isAssignableFrom(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static boolean m5185i(Class cls, Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return Modifier.isStatic(method.getModifiers()) && AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && parameterTypes.length == 2 && parameterTypes[0].isAssignableFrom(cls) && (AbstractC1416l.m3825a(parameterTypes[1], Boolean.TYPE) || AbstractC1416l.m3825a(parameterTypes[1], Boolean.class));
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: j */
    public static String m5186j(Context context, ClassLoader classLoader, String str, String str2, String str3) {
        InputStream inputStream;
        Object c3959f;
        if (AbstractC0921a.m2262y(str)) {
            return str;
        }
        boolean z9 = true;
        if (AbstractC3149m.m6721t0(str)) {
            inputStream = null;
        } else {
            String[] strArr = {"com.tencent.mm.vfs.w6", "com.tencent.mm.vfs.p6"};
            loop1: for (int i9 = 0; i9 < 2; i9++) {
                Class<?> clsLoadClass = KavaReflector.loadClass(strArr[i9], classLoader);
                if (clsLoadClass != null) {
                    String[] strArr2 = {"E", "F"};
                    int i10 = 0;
                    while (true) {
                        if (i10 >= 2) {
                            for (Method method : KavaReflector.declaredMethods(clsLoadClass)) {
                                if (Modifier.isStatic(method.getModifiers()) && AbstractC1416l.m3825a(method.getReturnType(), InputStream.class)) {
                                    Class<?>[] parameterTypes = method.getParameterTypes();
                                    if (parameterTypes.length == 1 && AbstractC1416l.m3825a(parameterTypes[0], String.class)) {
                                        Object objInvoke = KavaReflector.invoke(method, null, str);
                                        inputStream = objInvoke instanceof InputStream ? (InputStream) objInvoke : null;
                                        if (inputStream != null) {
                                            break loop1;
                                        }
                                    }
                                }
                            }
                        } else {
                            Method methodFindMethod = KavaReflector.findMethod(clsLoadClass, strArr2[i10], String.class);
                            if (methodFindMethod != null) {
                                Object objInvoke2 = KavaReflector.invoke(methodFindMethod, null, str);
                                InputStream inputStream2 = objInvoke2 instanceof InputStream ? (InputStream) objInvoke2 : null;
                                if (inputStream2 != null) {
                                    inputStream = inputStream2;
                                    break loop1;
                                }
                            }
                            i10++;
                        }
                    }
                }
            }
            inputStream = null;
        }
        if (inputStream == null) {
            return null;
        }
        String strM2023c0 = AbstractC0793l.m2023c0(new File(str));
        if (!(!AbstractC3149m.m6721t0(strM2023c0) && strM2023c0.length() <= 8)) {
            strM2023c0 = null;
        }
        if (strM2023c0 != null) {
            str3 = strM2023c0;
        }
        File file = new File(context.getCacheDir(), str2);
        if (!file.isDirectory() && !file.mkdirs()) {
            return null;
        }
        File file2 = new File(file, AbstractC0255e.m1021j("fav_", Integer.toHexString(str.hashCode()), ".", str3));
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2, false);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i11 = inputStream.read(bArr);
                        if (i11 <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, i11);
                    }
                    fileOutputStream.close();
                    inputStream.close();
                    if (!file2.isFile() || file2.length() <= 0) {
                        z9 = false;
                    }
                    if (!z9) {
                        file2 = null;
                    }
                    c3959f = file2 != null ? file2.getAbsolutePath() : null;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        return (String) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static Integer m5187k(Long l10) {
        if (l10 == null) {
            return null;
        }
        long jLongValue = l10.longValue();
        if (jLongValue <= 0) {
            return null;
        }
        if (1 <= jLongValue && jLongValue < 601) {
            jLongValue *= 1000;
        }
        long j3 = jLongValue >= 1 ? jLongValue : 1L;
        if (j3 > 2147483647L) {
            j3 = 2147483647L;
        }
        return Integer.valueOf((int) j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static boolean m5188l(ClassLoader classLoader, String str) {
        if (!AbstractC3149m.m6721t0(str)) {
            if (!AbstractC0921a.m2262y(str)) {
                String[] strArr = {"j", "k"};
                String[] strArr2 = {"com.tencent.mm.vfs.w6", "com.tencent.mm.vfs.p6"};
                for (int i9 = 0; i9 < 2; i9++) {
                    Class<?> clsLoadClass = KavaReflector.loadClass(strArr2[i9], classLoader);
                    if (clsLoadClass != null) {
                        for (Method method : KavaReflector.declaredMethods(clsLoadClass)) {
                            if (AbstractC4165l.m8378m0(strArr, method.getName()) && Modifier.isStatic(method.getModifiers())) {
                                Class<?>[] parameterTypes = method.getParameterTypes();
                                if (parameterTypes.length == 1 && AbstractC1416l.m3825a(parameterTypes[0], String.class)) {
                                    Object objInvoke = KavaReflector.invoke(method, null, str);
                                    if (!AbstractC1416l.m3825a(objInvoke, Boolean.TRUE) && (!(objInvoke instanceof Number) || ((Number) objInvoke).longValue() <= 0)) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static String m5189m(ClassLoader classLoader, Object obj) {
        Object next;
        String strM5178b = m5178b(obj);
        ArrayList arrayList = new ArrayList();
        Set setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        setNewSetFromMap.getClass();
        m5177a(classLoader, obj, strM5178b, arrayList, setNewSetFromMap, 0);
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                Integer numValueOf = Integer.valueOf(((Number) ((C3958e) next).f12962h).intValue());
                do {
                    Object next2 = it.next();
                    Integer numValueOf2 = Integer.valueOf(((Number) ((C3958e) next2).f12962h).intValue());
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        next = next2;
                        numValueOf = numValueOf2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        C3958e c3958e = (C3958e) next;
        if (c3958e != null) {
            return (String) c3958e.f12961g;
        }
        return null;
    }
}
