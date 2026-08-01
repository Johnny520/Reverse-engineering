package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import p006D.AbstractC0079h;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0307q;

/* JADX INFO: renamed from: androidx.lifecycle.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0487v {

    /* JADX INFO: renamed from: a */
    public static final HashMap f1534a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static final HashMap f1535b = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m935a(Constructor constructor, InterfaceC0483r interfaceC0483r) {
        try {
            AbstractC0223g.m417d(constructor.newInstance(interfaceC0483r), "{\n            constructo…tance(`object`)\n        }");
            throw new ClassCastException();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0148 A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m936b(Class cls) {
        Constructor<?> declaredConstructor;
        boolean zBooleanValue;
        int length;
        int i2;
        HashMap map = f1534a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i3 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r3 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r3 != null ? r3.getName() : "";
                AbstractC0223g.m417d(name, "fullPackage");
                if (name.length() != 0) {
                    AbstractC0223g.m417d(canonicalName, "name");
                    canonicalName = canonicalName.substring(name.length() + 1);
                    AbstractC0223g.m417d(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                AbstractC0223g.m417d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String strConcat = AbstractC0307q.m537g0(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = name + '.' + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException(e2);
            }
            HashMap map2 = f1535b;
            if (declaredConstructor != null) {
                map2.put(cls, AbstractC0079h.m167E(declaredConstructor));
            } else {
                C0469d c0469d = C0469d.f1512c;
                HashMap map3 = c0469d.f1514b;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length2 = declaredMethods.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length2) {
                                map3.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((InterfaceC0490y) declaredMethods[i4].getAnnotation(InterfaceC0490y.class)) != null) {
                                c0469d.m923a(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i4++;
                        }
                    } catch (NoClassDefFoundError e3) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e3);
                    }
                }
                if (!zBooleanValue) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC0483r.class.isAssignableFrom(superclass)) {
                        AbstractC0223g.m417d(superclass, "superclass");
                        if (m936b(superclass) != 1) {
                            Object obj = map2.get(superclass);
                            AbstractC0223g.m415b(obj);
                            arrayList = new ArrayList((Collection) obj);
                            Class<?>[] interfaces = cls.getInterfaces();
                            AbstractC0223g.m417d(interfaces, "klass.interfaces");
                            length = interfaces.length;
                            i2 = 0;
                            while (true) {
                                if (i2 < length) {
                                    Class<?> cls2 = interfaces[i2];
                                    if (cls2 != null && InterfaceC0483r.class.isAssignableFrom(cls2)) {
                                        AbstractC0223g.m417d(cls2, "intrface");
                                        if (m936b(cls2) == 1) {
                                            break;
                                        }
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        Object obj2 = map2.get(cls2);
                                        AbstractC0223g.m415b(obj2);
                                        arrayList.addAll((Collection) obj2);
                                    }
                                    i2++;
                                } else if (arrayList != null) {
                                    map2.put(cls, arrayList);
                                }
                            }
                        }
                    } else {
                        Class<?>[] interfaces2 = cls.getInterfaces();
                        AbstractC0223g.m417d(interfaces2, "klass.interfaces");
                        length = interfaces2.length;
                        i2 = 0;
                        while (true) {
                            if (i2 < length) {
                            }
                            i2++;
                        }
                    }
                }
            }
            i3 = 2;
        }
        map.put(cls, Integer.valueOf(i3));
        return i3;
    }
}
