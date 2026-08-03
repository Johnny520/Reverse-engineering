package p000a;

import androidx.lifecycle.C1112a;
import androidx.lifecycle.InterfaceC1113b;
import androidx.lifecycle.InterfaceC1120i;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: renamed from: a.A9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0010A9 {

    /* JADX INFO: renamed from: a */
    public static final HashMap f50a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static final HashMap f51b = new HashMap();

    /* JADX INFO: renamed from: a */
    public static InterfaceC1113b m41a(Constructor constructor, InterfaceC0916x9 interfaceC0916x9) {
        try {
            Object objNewInstance = constructor.newInstance(interfaceC0916x9);
            C0631i9.m1481d(objNewInstance, "{\n            constructo…tance(`object`)\n        }");
            return (InterfaceC1113b) objNewInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0148 A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m42b(Class cls) {
        Constructor<?> declaredConstructor;
        boolean zBooleanValue;
        int length;
        int i;
        HashMap map = f50a;
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
                C0631i9.m1481d(name, "fullPackage");
                if (name.length() != 0) {
                    C0631i9.m1481d(canonicalName, "name");
                    canonicalName = canonicalName.substring(name.length() + 1);
                    C0631i9.m1481d(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                C0631i9.m1481d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String strConcat = C0015Ae.m48G(canonicalName, ".", "_").concat("_LifecycleAdapter");
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
            HashMap map2 = f51b;
            if (declaredConstructor != null) {
                map2.put(cls, C0889w1.m2124K(declaredConstructor));
            } else {
                C1112a c1112a = C1112a.f4665c;
                HashMap map3 = c1112a.f4667b;
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
                            if (((InterfaceC1120i) declaredMethods[i3].getAnnotation(InterfaceC1120i.class)) != null) {
                                c1112a.m2587a(cls, declaredMethods);
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
                    if (superclass != null && InterfaceC0916x9.class.isAssignableFrom(superclass)) {
                        C0631i9.m1481d(superclass, "superclass");
                        if (m42b(superclass) != 1) {
                            Object obj = map2.get(superclass);
                            C0631i9.m1479b(obj);
                            arrayList = new ArrayList((Collection) obj);
                            Class<?>[] interfaces = cls.getInterfaces();
                            C0631i9.m1481d(interfaces, "klass.interfaces");
                            length = interfaces.length;
                            i = 0;
                            while (true) {
                                if (i < length) {
                                    Class<?> cls2 = interfaces[i];
                                    if (cls2 != null && InterfaceC0916x9.class.isAssignableFrom(cls2)) {
                                        C0631i9.m1481d(cls2, "intrface");
                                        if (m42b(cls2) == 1) {
                                            break;
                                        }
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        Object obj2 = map2.get(cls2);
                                        C0631i9.m1479b(obj2);
                                        arrayList.addAll((Collection) obj2);
                                    }
                                    i++;
                                } else if (arrayList != null) {
                                    map2.put(cls, arrayList);
                                }
                            }
                        }
                    } else {
                        Class<?>[] interfaces2 = cls.getInterfaces();
                        C0631i9.m1481d(interfaces2, "klass.interfaces");
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
