package p002A1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import p117X2.AbstractC1665j;
import p149d3.AbstractC1983k;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: A1.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0148u {

    /* JADX INFO: renamed from: a */
    public static final HashMap f548a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static final HashMap f549b = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m192a(Constructor constructor, InterfaceC0144q interfaceC0144q) {
        try {
            AbstractC1665j.m2982b(constructor.newInstance(interfaceC0144q));
            throw new ClassCastException();
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(e5);
        } catch (InstantiationException e6) {
            throw new RuntimeException(e6);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013e A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m193b(Class cls) {
        Constructor<?> declaredConstructor;
        boolean zBooleanValue;
        int length;
        int i5;
        HashMap map = f548a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i6 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r32 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r32 != null ? r32.getName() : "";
                AbstractC1665j.m2982b(name);
                if (name.length() != 0) {
                    AbstractC1665j.m2982b(canonicalName);
                    canonicalName = canonicalName.substring(name.length() + 1);
                    AbstractC1665j.m2984d(canonicalName, "substring(...)");
                }
                AbstractC1665j.m2982b(canonicalName);
                String strConcat = AbstractC1983k.m3654Q(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = name + '.' + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e5) {
                throw new RuntimeException(e5);
            }
            HashMap map2 = f549b;
            if (declaredConstructor != null) {
                map2.put(cls, AbstractC2352g.m4211y(declaredConstructor));
            } else {
                C0131d c0131d = C0131d.f523c;
                HashMap map3 = c0131d.f525b;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length2 = declaredMethods.length;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= length2) {
                                map3.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((InterfaceC0149v) declaredMethods[i7].getAnnotation(InterfaceC0149v.class)) != null) {
                                c0131d.m179a(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i7++;
                        }
                    } catch (NoClassDefFoundError e6) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e6);
                    }
                }
                if (!zBooleanValue) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC0144q.class.isAssignableFrom(superclass)) {
                        AbstractC1665j.m2982b(superclass);
                        if (m193b(superclass) != 1) {
                            Object obj = map2.get(superclass);
                            AbstractC1665j.m2982b(obj);
                            arrayList = new ArrayList((Collection) obj);
                            Class<?>[] interfaces = cls.getInterfaces();
                            AbstractC1665j.m2984d(interfaces, "getInterfaces(...)");
                            length = interfaces.length;
                            i5 = 0;
                            while (true) {
                                if (i5 < length) {
                                    Class<?> cls2 = interfaces[i5];
                                    if (cls2 != null && InterfaceC0144q.class.isAssignableFrom(cls2)) {
                                        AbstractC1665j.m2982b(cls2);
                                        if (m193b(cls2) == 1) {
                                            break;
                                        }
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        Object obj2 = map2.get(cls2);
                                        AbstractC1665j.m2982b(obj2);
                                        arrayList.addAll((Collection) obj2);
                                    }
                                    i5++;
                                } else if (arrayList != null) {
                                    map2.put(cls, arrayList);
                                }
                            }
                        }
                    } else {
                        Class<?>[] interfaces2 = cls.getInterfaces();
                        AbstractC1665j.m2984d(interfaces2, "getInterfaces(...)");
                        length = interfaces2.length;
                        i5 = 0;
                        while (true) {
                            if (i5 < length) {
                            }
                            i5++;
                        }
                    }
                }
            }
            i6 = 2;
        }
        map.put(cls, Integer.valueOf(i6));
        return i6;
    }
}
