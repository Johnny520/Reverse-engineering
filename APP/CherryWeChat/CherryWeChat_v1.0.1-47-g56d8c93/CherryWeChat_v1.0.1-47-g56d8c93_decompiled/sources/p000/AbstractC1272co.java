package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: co */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1272co {

    /* JADX INFO: renamed from: a */
    public static final HashMap f4333a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static final HashMap f4334b = new HashMap();

    /* JADX INFO: renamed from: a */
    public static void m2410a(Constructor constructor, InterfaceC1018Xn interfaceC1018Xn) {
        try {
            constructor.newInstance(interfaceC1018Xn);
            throw new ClassCastException();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m2411b(Class cls) {
        Constructor<?> declaredConstructor;
        boolean zBooleanValue;
        int length;
        int i;
        HashMap map = f4333a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i2 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r3 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r3 != null ? r3.getName() : "";
                if (name.length() != 0) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String strConcat = AbstractC0085Bz.m133K(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = name + '.' + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            HashMap map2 = f4334b;
            if (declaredConstructor != null) {
                map2.put(cls, Collections.singletonList(declaredConstructor));
            } else {
                C0397J9 c0397j9 = C0397J9.f1340c;
                HashMap map3 = c0397j9.f1342b;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length2 = declaredMethods.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length2) {
                                map3.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((InterfaceC2429qt) declaredMethods[i3].getAnnotation(InterfaceC2429qt.class)) != null) {
                                c0397j9.m835a(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i3++;
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!zBooleanValue) {
                    Class superclass = cls.getSuperclass();
                    if (!(superclass != null && InterfaceC1018Xn.class.isAssignableFrom(superclass))) {
                        Class<?>[] interfaces = cls.getInterfaces();
                        length = interfaces.length;
                        i = 0;
                        while (true) {
                            if (i < length) {
                                Class<?> cls2 = interfaces[i];
                                if (cls2 != null && InterfaceC1018Xn.class.isAssignableFrom(cls2)) {
                                    if (m2411b(cls2) == 1) {
                                        break;
                                    }
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.addAll((Collection) map2.get(cls2));
                                }
                                i++;
                            } else if (arrayList != null) {
                                map2.put(cls, arrayList);
                            }
                        }
                    } else if (m2411b(superclass) != 1) {
                        arrayList = new ArrayList((Collection) map2.get(superclass));
                        Class<?>[] interfaces2 = cls.getInterfaces();
                        length = interfaces2.length;
                        i = 0;
                        while (true) {
                            if (i < length) {
                            }
                            i++;
                        }
                    }
                }
            }
            i2 = 2;
        }
        map.put(cls, Integer.valueOf(i2));
        return i2;
    }
}
