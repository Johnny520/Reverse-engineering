package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import p001A0.AbstractC0040p;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: androidx.lifecycle.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0544u {

    /* JADX INFO: renamed from: a */
    public static final HashMap f1499a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static final HashMap f1500b = new HashMap();

    /* JADX INFO: renamed from: a */
    public static void m1260a(Constructor constructor, Object obj) {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            AbstractC0307g.m702d(objNewInstance, "{\n            constructo…tance(`object`)\n        }");
            AbstractC0324d.m724g(objNewInstance);
            throw null;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0149 A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m1261b(Class cls) {
        Constructor<?> declaredConstructor;
        boolean zBooleanValue;
        int length;
        int i2;
        HashMap map = f1499a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i3 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r4 != null ? r4.getName() : "";
                AbstractC0307g.m702d(name, "fullPackage");
                if (name.length() != 0) {
                    AbstractC0307g.m702d(canonicalName, "name");
                    canonicalName = canonicalName.substring(name.length() + 1);
                    AbstractC0307g.m702d(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                AbstractC0307g.m702d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String strConcat = AbstractC0433r.m1031F0(canonicalName, ".", "_", false).concat("_LifecycleAdapter");
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
            HashMap map2 = f1500b;
            if (declaredConstructor != null) {
                map2.put(cls, AbstractC0040p.m82F(declaredConstructor));
            } else {
                C0526c c0526c = C0526c.f1477c;
                HashMap map3 = c0526c.f1479b;
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
                            if (((InterfaceC0546w) declaredMethods[i4].getAnnotation(InterfaceC0546w.class)) != null) {
                                c0526c.m1250a(cls, declaredMethods);
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
                    if (superclass != null && InterfaceC0540q.class.isAssignableFrom(superclass)) {
                        AbstractC0307g.m702d(superclass, "superclass");
                        if (m1261b(superclass) != 1) {
                            Object obj = map2.get(superclass);
                            AbstractC0307g.m700b(obj);
                            arrayList = new ArrayList((Collection) obj);
                            Class<?>[] interfaces = cls.getInterfaces();
                            AbstractC0307g.m702d(interfaces, "klass.interfaces");
                            length = interfaces.length;
                            i2 = 0;
                            while (true) {
                                if (i2 < length) {
                                    Class<?> cls2 = interfaces[i2];
                                    if (cls2 != null && InterfaceC0540q.class.isAssignableFrom(cls2)) {
                                        AbstractC0307g.m702d(cls2, "intrface");
                                        if (m1261b(cls2) == 1) {
                                            break;
                                        }
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        Object obj2 = map2.get(cls2);
                                        AbstractC0307g.m700b(obj2);
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
                        AbstractC0307g.m702d(interfaces2, "klass.interfaces");
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
