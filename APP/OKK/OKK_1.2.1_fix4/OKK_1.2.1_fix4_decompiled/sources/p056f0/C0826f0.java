package p056f0;

import android.R;
import android.util.SparseArray;
import android.widget.BaseAdapter;
import de.robv.android.xposed.AbstractC0762d;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0139e;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0188s;
import p009E0.C0172c;
import p009E0.C0180k;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p037U.AbstractC0358S;
import p040V0.AbstractC0407j;
import p040V0.C0401d;
import p040V0.C0402e;
import p040V0.C0406i;
import p049b0.C0565o;
import p049b0.C0566p;
import p050c0.C0591H;

/* JADX INFO: renamed from: f0.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0826f0 {

    /* JADX INFO: renamed from: a */
    public static final C0826f0 f2992a = new C0826f0();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f2993b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f2994c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static final Set f2995d = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: e */
    public static final AtomicBoolean f2996e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public static volatile Field f2997f;

    /* JADX INFO: renamed from: a */
    public static final void m2135a(Object obj) {
        Object objM116u;
        try {
            Iterator it = C0566p.m1377b(obj).iterator();
            int size = 0;
            while (it.hasNext()) {
                Object obj2 = ((C0139e) it.next()).f329b;
                List list = AbstractC0317q.m713b(obj2) ? (List) obj2 : null;
                if (list != null) {
                    int size2 = list.size();
                    AbstractC0188s.m562n0(list, new C0591H());
                    size += size2 - list.size();
                }
            }
            if (size > 0) {
                m2146l("modern placeholders removed=" + size);
            }
            objM116u = C0146l.f339a;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        Throwable thM465a = AbstractC0141g.m465a(objM116u);
        if (thM465a != null) {
            m2146l("modern cleanup fail: " + thM465a.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Object m2136b(Class cls, Object obj) {
        Object objM116u;
        try {
            Field fieldM2138d = m2138d(obj.getClass(), new C0816a0(2, cls));
            if (fieldM2138d != null) {
                fieldM2138d.setAccessible(true);
                objM116u = fieldM2138d.get(obj);
            } else {
                objM116u = null;
            }
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            return null;
        }
        return objM116u;
    }

    /* JADX INFO: renamed from: c */
    public static Object[] m2137c(Class[] clsArr) {
        Object objValueOf;
        ArrayList arrayList = new ArrayList(clsArr.length);
        int length = clsArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            Class cls = clsArr[i2];
            int i4 = i3 + 1;
            if (i3 == 0) {
                objValueOf = 168566822;
            } else if (AbstractC0307g.m699a(cls, String.class) && i3 == 1) {
                objValueOf = "OKK";
            } else if (AbstractC0307g.m699a(cls, String.class)) {
                objValueOf = "";
            } else {
                Class cls2 = Integer.TYPE;
                if (AbstractC0307g.m699a(cls, cls2) || AbstractC0307g.m699a(cls, cls2)) {
                    objValueOf = Integer.valueOf(i3 == 3 ? R.drawable.ic_menu_manage : 0);
                } else {
                    objValueOf = null;
                }
            }
            arrayList.add(objValueOf);
            i2++;
            i3 = i4;
        }
        return arrayList.toArray(new Object[0]);
    }

    /* JADX INFO: renamed from: d */
    public static Field m2138d(Class cls, InterfaceC0286l interfaceC0286l) {
        Field field;
        C0406i c0406iM861K = AbstractC0358S.m861K(new C0565o(cls, null));
        while (c0406iM861K.hasNext()) {
            Field[] declaredFields = ((Class) c0406iM861K.next()).getDeclaredFields();
            AbstractC0307g.m702d(declaredFields, "getDeclaredFields(...)");
            int length = declaredFields.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    field = null;
                    break;
                }
                field = declaredFields[i2];
                if (((Boolean) interfaceC0286l.invoke(field)).booleanValue()) {
                    break;
                }
                i2++;
            }
            if (field != null) {
                return field;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static SparseArray m2139e(Object obj) {
        Object objM116u;
        C0406i c0406iM861K = AbstractC0358S.m861K(new C0565o(obj.getClass(), null));
        while (c0406iM861K.hasNext()) {
            C0172c c0172cM714c = AbstractC0317q.m714c(((Class) c0406iM861K.next()).getDeclaredFields());
            while (c0172cM714c.hasNext()) {
                Field field = (Field) c0172cM714c.next();
                if (SparseArray.class.isAssignableFrom(field.getType())) {
                    field.setAccessible(true);
                    try {
                        Object obj2 = field.get(obj);
                        objM116u = obj2 instanceof SparseArray ? (SparseArray) obj2 : null;
                    } catch (Throwable th) {
                        objM116u = AbstractC0040p.m116u(th);
                    }
                    if (objM116u instanceof C0140f) {
                        objM116u = null;
                    }
                    SparseArray sparseArray = (SparseArray) objM116u;
                    if (sparseArray != null && sparseArray.size() != 0) {
                        int size = sparseArray.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                Object objValueAt = sparseArray.valueAt(0);
                                if (objValueAt != null && !objValueAt.getClass().isPrimitive() && !objValueAt.getClass().equals(String.class)) {
                                    return sparseArray;
                                }
                            } else {
                                if (sparseArray.keyAt(i2) != i2) {
                                    break;
                                }
                                i2++;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static void m2140f(Object obj) {
        Object objM116u;
        SparseArray sparseArrayM2143i;
        int i2;
        Object objM2144j;
        Object next;
        Object objM2144j2;
        try {
            sparseArrayM2143i = m2143i(obj);
            i2 = 0;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (sparseArrayM2143i == null) {
            if (f2996e.compareAndSet(false, true)) {
                m2146l("plus menu map not found on " + obj.getClass().getName() + " (rg.s 未赋值且无数据管理器渲染 map)");
                return;
            }
            return;
        }
        int size = sparseArrayM2143i.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object objValueAt = sparseArrayM2143i.valueAt(i3);
            if (objValueAt != null && (objM2144j2 = m2144j(objValueAt)) != null && m2145k(objM2144j2) == 168566822) {
                return;
            }
        }
        if (sparseArrayM2143i.size() == 0) {
            m2146l("plus menu map empty, skip inject (retry on next rebuild)");
            return;
        }
        Object objValueAt2 = sparseArrayM2143i.valueAt(0);
        if (objValueAt2 == null || (objM2144j = m2144j(objValueAt2)) == null) {
            return;
        }
        Class<?> cls = objM2144j.getClass();
        Class<?> cls2 = objValueAt2.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        AbstractC0307g.m702d(constructors, "getConstructors(...)");
        ArrayList arrayList = new ArrayList();
        for (Constructor<?> constructor : constructors) {
            int length = constructor.getParameterTypes().length;
            if (4 <= length && length < 7) {
                arrayList.add(constructor);
            }
        }
        Iterator it = arrayList.iterator();
        Constructor<?> constructor2 = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length2 = ((Constructor) next).getParameterTypes().length;
                do {
                    Object next2 = it.next();
                    int length3 = ((Constructor) next2).getParameterTypes().length;
                    if (length2 < length3) {
                        next = next2;
                        length2 = length3;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Constructor constructor3 = (Constructor) next;
        if (constructor3 == null) {
            m2146l("pg ctor not found on " + cls.getName());
            return;
        }
        constructor3.setAccessible(true);
        Class<?>[] parameterTypes = constructor3.getParameterTypes();
        AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
        Object[] objArrM2137c = m2137c(parameterTypes);
        Object objNewInstance = constructor3.newInstance(Arrays.copyOf(objArrM2137c, objArrM2137c.length));
        Constructor<?>[] constructors2 = cls2.getConstructors();
        AbstractC0307g.m702d(constructors2, "getConstructors(...)");
        int length4 = constructors2.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length4) {
                break;
            }
            Constructor<?> constructor4 = constructors2[i4];
            if (constructor4.getParameterTypes().length == 1) {
                constructor2 = constructor4;
                break;
            }
            i4++;
        }
        if (constructor2 == null) {
            m2146l("og ctor not found on " + cls2.getName());
            return;
        }
        constructor2.setAccessible(true);
        Object objNewInstance2 = constructor2.newInstance(objNewInstance);
        while (sparseArrayM2143i.get(i2) != null) {
            i2++;
        }
        sparseArrayM2143i.put(i2, objNewInstance2);
        m2142h(obj);
        m2146l("plus menu item injected key=" + i2 + " size=" + sparseArrayM2143i.size() + " pg=" + cls.getName() + " og=" + cls2.getName() + " holder=" + obj.getClass().getName());
        objM116u = C0146l.f339a;
        Throwable thM465a = AbstractC0141g.m465a(objM116u);
        if (thM465a != null) {
            m2146l("plus item inject fail: " + thM465a.getMessage());
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m2141g(Object obj) {
        Object objM116u;
        if (obj == null) {
            return null;
        }
        Object objM1376a = C0566p.m1376a(obj, new String[]{"A6"});
        String str = objM1376a instanceof String ? (String) objM1376a : null;
        if (str != null) {
            return str;
        }
        try {
            Object objM887g = AbstractC0358S.m887g(obj, "A6", new Object[0]);
            objM116u = objM887g instanceof String ? (String) objM887g : null;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        return (String) (objM116u instanceof C0140f ? null : objM116u);
    }

    /* JADX INFO: renamed from: h */
    public static void m2142h(Object obj) {
        Object objM116u;
        Object objM116u2;
        Object next;
        try {
            Field fieldM2138d = m2138d(obj.getClass(), new C0813Y(13));
            if (fieldM2138d != null) {
                fieldM2138d.setAccessible(true);
                objM116u = fieldM2138d.get(obj);
            } else {
                objM116u = null;
            }
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            objM116u = null;
        }
        if (objM116u == null) {
            try {
                C0401d c0401d = new C0401d(AbstractC0407j.m994y0(new C0180k(4, new C0565o(obj.getClass(), null)), new C0813Y(14)));
                while (true) {
                    if (!c0401d.hasNext()) {
                        next = null;
                        break;
                    }
                    next = c0401d.next();
                    Method method = (Method) next;
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0 && BaseAdapter.class.isAssignableFrom(method.getReturnType())) {
                        break;
                    }
                }
                Method method2 = (Method) next;
                if (method2 != null) {
                    method2.setAccessible(true);
                    objM116u2 = method2.invoke(obj, null);
                } else {
                    objM116u2 = null;
                }
            } catch (Throwable th2) {
                objM116u2 = AbstractC0040p.m116u(th2);
            }
            Object obj2 = objM116u2 instanceof C0140f ? null : objM116u2;
            if (obj2 == null) {
                return;
            } else {
                objM116u = obj2;
            }
        }
        try {
            AbstractC0358S.m887g(objM116u, "notifyDataSetChanged", new Object[0]);
        } catch (Throwable th3) {
            AbstractC0040p.m116u(th3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x005e, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SparseArray m2143i(Object obj) {
        Object objM116u;
        SparseArray sparseArray;
        Object objM116u2;
        Field fieldM2138d = m2138d(obj.getClass(), new C0813Y(12));
        if (fieldM2138d != null) {
            try {
                fieldM2138d.setAccessible(true);
                Object obj2 = fieldM2138d.get(obj);
                objM116u = obj2 instanceof SparseArray ? (SparseArray) obj2 : null;
            } catch (Throwable th) {
                objM116u = AbstractC0040p.m116u(th);
            }
            if (objM116u instanceof C0140f) {
                objM116u = null;
            }
            sparseArray = (SparseArray) objM116u;
        } else {
            sparseArray = null;
        }
        if (sparseArray != null && sparseArray.size() > 0) {
            return sparseArray;
        }
        try {
            C0406i c0406iM861K = AbstractC0358S.m861K(new C0565o(obj.getClass(), null));
            loop0: while (true) {
                if (!c0406iM861K.hasNext()) {
                    objM116u2 = null;
                    break;
                }
                C0172c c0172cM714c = AbstractC0317q.m714c(((Class) c0406iM861K.next()).getDeclaredFields());
                while (c0172cM714c.hasNext()) {
                    Field field = (Field) c0172cM714c.next();
                    if (!field.getType().isPrimitive() && !AbstractC0307g.m699a(field.getType(), String.class) && !SparseArray.class.isAssignableFrom(field.getType())) {
                        Field[] declaredFields = field.getType().getDeclaredFields();
                        AbstractC0307g.m702d(declaredFields, "getDeclaredFields(...)");
                        int length = declaredFields.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            }
                            if (SparseArray.class.isAssignableFrom(declaredFields[i2].getType())) {
                                field.setAccessible(true);
                                Object obj3 = field.get(obj);
                                if (obj3 != null && (objM116u2 = m2139e(obj3)) != null) {
                                    break loop0;
                                }
                            } else {
                                i2++;
                            }
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            objM116u2 = AbstractC0040p.m116u(th2);
        }
        return (SparseArray) (objM116u2 instanceof C0140f ? null : objM116u2);
    }

    /* JADX INFO: renamed from: j */
    public static Object m2144j(Object obj) {
        Object objM116u;
        Field fieldM2138d = m2138d(obj.getClass(), new C0813Y(7));
        if (fieldM2138d == null) {
            return null;
        }
        try {
            fieldM2138d.setAccessible(true);
            objM116u = fieldM2138d.get(obj);
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            return null;
        }
        return objM116u;
    }

    /* JADX INFO: renamed from: k */
    public static int m2145k(Object obj) {
        Object objM116u;
        Object next;
        Object objM116u2;
        Object next2;
        Constructor constructor;
        Object objM116u3;
        Class<?> cls = obj.getClass();
        Field field = f2997f;
        if (field == null || !field.getDeclaringClass().isAssignableFrom(cls)) {
            try {
                Constructor<?>[] constructors = cls.getConstructors();
                AbstractC0307g.m702d(constructors, "getConstructors(...)");
                ArrayList arrayList = new ArrayList();
                for (Constructor<?> constructor2 : constructors) {
                    int length = constructor2.getParameterTypes().length;
                    if (4 <= length && length < 7) {
                        arrayList.add(constructor2);
                    }
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    next2 = it.next();
                    if (it.hasNext()) {
                        int length2 = ((Constructor) next2).getParameterTypes().length;
                        do {
                            Object next3 = it.next();
                            int length3 = ((Constructor) next3).getParameterTypes().length;
                            if (length2 < length3) {
                                next2 = next3;
                                length2 = length3;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next2 = null;
                }
                constructor = (Constructor) next2;
            } catch (Throwable th) {
                objM116u = AbstractC0040p.m116u(th);
            }
            if (constructor != null) {
                constructor.setAccessible(true);
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                Object[] objArrM2137c = m2137c(parameterTypes);
                objArrM2137c[0] = 1513913873;
                objM116u = constructor.newInstance(Arrays.copyOf(objArrM2137c, objArrM2137c.length));
                if (objM116u instanceof C0140f) {
                    objM116u = null;
                }
                if (objM116u != null) {
                    C0401d c0401d = new C0401d(new C0402e(AbstractC0407j.m994y0(new C0180k(4, new C0565o(cls, null)), new C0813Y(15)), true, new C0813Y(17)));
                    while (true) {
                        if (!c0401d.hasNext()) {
                            next = null;
                            break;
                        }
                        next = c0401d.next();
                        Field field2 = (Field) next;
                        try {
                            field2.setAccessible(true);
                            objM116u2 = Boolean.valueOf(field2.getInt(objM116u) == 1513913873);
                        } catch (Throwable th2) {
                            objM116u2 = AbstractC0040p.m116u(th2);
                        }
                        Object obj2 = Boolean.FALSE;
                        if (objM116u2 instanceof C0140f) {
                            objM116u2 = obj2;
                        }
                        if (((Boolean) objM116u2).booleanValue()) {
                            break;
                        }
                    }
                    field = (Field) next;
                    if (field != null) {
                        f2997f = field;
                        m2146l("pg id field resolved=" + field.getDeclaringClass().getSimpleName() + "." + field.getName());
                    }
                }
            }
            field = null;
        }
        if (field != null) {
            try {
                field.setAccessible(true);
                return field.getInt(obj);
            } catch (Throwable th3) {
                AbstractC0040p.m116u(th3);
            }
        }
        C0401d c0401d2 = new C0401d(new C0402e(AbstractC0407j.m994y0(new C0180k(4, new C0565o(obj.getClass(), null)), new C0813Y(10)), true, new C0813Y(11)));
        while (c0401d2.hasNext()) {
            Field field3 = (Field) c0401d2.next();
            try {
                field3.setAccessible(true);
                objM116u3 = Boolean.valueOf(field3.getInt(obj) == 168566822);
            } catch (Throwable th4) {
                objM116u3 = AbstractC0040p.m116u(th4);
            }
            Object obj3 = Boolean.FALSE;
            if (objM116u3 instanceof C0140f) {
                objM116u3 = obj3;
            }
            if (((Boolean) objM116u3).booleanValue()) {
                return 168566822;
            }
        }
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: l */
    public static void m2146l(String str) {
        try {
            AbstractC0762d.m1954d("[OKK-SettingsEntry] " + str);
        } catch (Throwable unused) {
        }
    }
}
