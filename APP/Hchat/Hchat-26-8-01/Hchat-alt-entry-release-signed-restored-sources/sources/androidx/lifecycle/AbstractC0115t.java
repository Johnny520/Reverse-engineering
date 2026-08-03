package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p136j8.C2104o;
import p218og.AbstractC3156t;

/* JADX INFO: renamed from: androidx.lifecycle.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0115t {

    /* JADX INFO: renamed from: a */
    public static final HashMap f307a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static final HashMap f308b = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m560a(Constructor constructor, InterfaceC0111p interfaceC0111p) {
        try {
            constructor.newInstance(interfaceC0111p).getClass();
            throw new ClassCastException();
        } catch (IllegalAccessException e6) {
            throw new RuntimeException(e6);
        } catch (InstantiationException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0148 A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m561b(Class cls) {
        Constructor<?> declaredConstructor;
        boolean zBooleanValue;
        Class<?>[] interfaces;
        int i9;
        int i10;
        HashMap map = f307a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i11 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r42 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r42 != null ? r42.getName() : HttpUrl.FRAGMENT_ENCODE_SET;
                name.getClass();
                if (name.length() != 0) {
                    canonicalName.getClass();
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                canonicalName.getClass();
                String strConcat = AbstractC3156t.m6737a0(canonicalName, ".", "_", false).concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = name + '.' + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e6) {
                throw new RuntimeException(e6);
            }
            HashMap map2 = f308b;
            if (declaredConstructor != null) {
                map2.put(cls, AbstractC0000a.m99x0(declaredConstructor));
            } else {
                C0095c c0095c = C0095c.f277c;
                HashMap map3 = c0095c.f279b;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= length) {
                                map3.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((InterfaceC0116u) declaredMethods[i12].getAnnotation(InterfaceC0116u.class)) != null) {
                                c0095c.m540a(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i12++;
                        }
                    } catch (NoClassDefFoundError e7) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e7);
                    }
                }
                if (!zBooleanValue) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC0111p.class.isAssignableFrom(superclass)) {
                        superclass.getClass();
                        if (m561b(superclass) != 1) {
                            Object obj = map2.get(superclass);
                            obj.getClass();
                            arrayList = new ArrayList((Collection) obj);
                            interfaces = cls.getInterfaces();
                            interfaces.getClass();
                            i9 = 0;
                            while (true) {
                                if (!(i9 >= interfaces.length)) {
                                    i10 = i9 + 1;
                                    try {
                                        Class<?> cls2 = interfaces[i9];
                                        if (cls2 != null && InterfaceC0111p.class.isAssignableFrom(cls2)) {
                                            cls2.getClass();
                                            if (m561b(cls2) == 1) {
                                                break;
                                            }
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            Object obj2 = map2.get(cls2);
                                            obj2.getClass();
                                            arrayList.addAll((Collection) obj2);
                                        }
                                        i9 = i10;
                                    } catch (ArrayIndexOutOfBoundsException e10) {
                                        C2104o.m5287l(e10.getMessage());
                                        return 0;
                                    }
                                } else if (arrayList != null) {
                                    map2.put(cls, arrayList);
                                }
                            }
                        }
                    } else {
                        interfaces = cls.getInterfaces();
                        interfaces.getClass();
                        i9 = 0;
                        while (true) {
                            if (!(i9 >= interfaces.length)) {
                            }
                            i9 = i10;
                        }
                    }
                }
            }
            i11 = 2;
        }
        map.put(cls, Integer.valueOf(i11));
        return i11;
    }
}
