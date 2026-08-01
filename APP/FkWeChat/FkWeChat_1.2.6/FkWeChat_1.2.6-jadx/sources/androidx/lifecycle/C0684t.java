package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.C5750e;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1027c;
import p055e.AbstractC1960a;
import p185m8.AbstractC5112w;
import p299ub.AbstractC8611a0;

/* JADX INFO: renamed from: androidx.lifecycle.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0684t {

    /* JADX INFO: renamed from: a */
    public static final C0684t f2003a = new C0684t();

    /* JADX INFO: renamed from: b */
    public static final Map f2004b = new HashMap();

    /* JADX INFO: renamed from: c */
    public static final Map f2005c = new HashMap();

    /* JADX INFO: renamed from: c */
    public static final String m2682c(String str) {
        str.getClass();
        return AbstractC8611a0.m33069N(str, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC0672m m2683f(Object obj) {
        obj.getClass();
        boolean z10 = obj instanceof InterfaceC0672m;
        boolean z11 = obj instanceof InterfaceC0656e;
        if (z10 && z11) {
            return new C0658f((InterfaceC0656e) obj, (InterfaceC0672m) obj);
        }
        if (z11) {
            return new C0658f((InterfaceC0656e) obj, null);
        }
        if (z10) {
            return (InterfaceC0672m) obj;
        }
        Class<?> cls = obj.getClass();
        C0684t c0684t = f2003a;
        if (c0684t.m2686d(cls) != 2) {
            return new C0689y(obj);
        }
        Object obj2 = f2005c.get(cls);
        obj2.getClass();
        List list = (List) obj2;
        if (list.size() == 1) {
            c0684t.m2684a((Constructor) list.get(0), obj);
            return new C0669k0(null);
        }
        int size = list.size();
        InterfaceC0662h[] interfaceC0662hArr = new InterfaceC0662h[size];
        for (int i10 = 0; i10 < size; i10++) {
            f2003a.m2684a((Constructor) list.get(i10), obj);
            interfaceC0662hArr[i10] = null;
        }
        return new C0654d(interfaceC0662hArr);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0662h m2684a(Constructor constructor, Object obj) {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            objNewInstance.getClass();
            AbstractC1960a.m7104a(objNewInstance);
            return null;
        } catch (IllegalAccessException e10) {
            C5750e.m23251a(e10);
            return null;
        } catch (InstantiationException e11) {
            C5750e.m23251a(e11);
            return null;
        } catch (InvocationTargetException e12) {
            C5750e.m23251a(e12);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Constructor m2685b(Class cls) {
        try {
            Package r02 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r02 != null ? r02.getName() : _UrlKt.FRAGMENT_ENCODE_SET;
            name.getClass();
            if (name.length() != 0) {
                canonicalName.getClass();
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            canonicalName.getClass();
            String strM2682c = m2682c(canonicalName);
            if (name.length() != 0) {
                strM2682c = name + '.' + strM2682c;
            }
            Constructor<?> declaredConstructor = Class.forName(strM2682c).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            C5750e.m23251a(e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m2686d(Class cls) {
        Map map = f2004b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iM2688g = m2688g(cls);
        map.put(cls, Integer.valueOf(iM2688g));
        return iM2688g;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2687e(Class cls) {
        return cls != null && InterfaceC0674n.class.isAssignableFrom(cls);
    }

    /* JADX INFO: renamed from: g */
    public final int m2688g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor constructorM2685b = m2685b(cls);
        if (constructorM2685b != null) {
            f2005c.put(cls, AbstractC5112w.m20789e(constructorM2685b));
            return 2;
        }
        if (C0652c.f1931c.m2588d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (m2687e(superclass)) {
            superclass.getClass();
            if (m2686d(superclass) == 1) {
                return 1;
            }
            Object obj = f2005c.get(superclass);
            obj.getClass();
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Iterator itM3774a = AbstractC1027c.m3774a(cls.getInterfaces());
        while (itM3774a.hasNext()) {
            Class cls2 = (Class) itM3774a.next();
            if (m2687e(cls2)) {
                cls2.getClass();
                if (m2686d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = f2005c.get(cls2);
                obj2.getClass();
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f2005c.put(cls, arrayList);
        return 2;
    }
}
