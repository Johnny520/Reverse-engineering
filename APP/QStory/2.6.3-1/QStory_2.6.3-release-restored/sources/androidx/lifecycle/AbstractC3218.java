package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import kotlin.text.AbstractC5971;
import net.bytebuddy.pool.TypePool;
import net.bytebuddy.utility.JavaConstant;
import p050.AbstractC7176;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3218 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final HashMap f7360 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final HashMap f7359 = new HashMap();

    /* JADX WARN: Removed duplicated region for block: B:58:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0129 A[SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m5056(Class cls) {
        Constructor<?> declaredConstructor;
        boolean zBooleanValue;
        int length;
        HashMap map = f7360;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            int i2 = 0;
            ArrayList arrayList = null;
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r4 != null ? r4.getName() : "";
                name.getClass();
                if (name.length() != 0) {
                    canonicalName.getClass();
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                canonicalName.getClass();
                String strConcat = AbstractC5971.m10696(canonicalName, ".", JavaConstant.Dynamic.DEFAULT_NAME).concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = name + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e) {
                C6755.m11872(e);
                return 0;
            }
            HashMap map2 = f7359;
            if (declaredConstructor != null) {
                map2.put(cls, AbstractC7176.m12487(declaredConstructor));
            } else {
                C3225 c3225 = C3225.f7376;
                HashMap map3 = c3225.f7377;
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
                            if (((InterfaceC3202) declaredMethods[i3].getAnnotation(InterfaceC3202.class)) != null) {
                                c3225.m5068(cls, declaredMethods);
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
                    if (superclass == null || !InterfaceC3222.class.isAssignableFrom(superclass)) {
                        Class<?>[] interfaces = cls.getInterfaces();
                        interfaces.getClass();
                        length = interfaces.length;
                        while (true) {
                            if (i2 < length) {
                                Class<?> cls2 = interfaces[i2];
                                if (cls2 != null && InterfaceC3222.class.isAssignableFrom(cls2)) {
                                    cls2.getClass();
                                    if (m5056(cls2) == 1) {
                                        break;
                                    }
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    Object obj = map2.get(cls2);
                                    obj.getClass();
                                    arrayList.addAll((Collection) obj);
                                }
                                i2++;
                            } else if (arrayList != null) {
                                map2.put(cls, arrayList);
                            }
                        }
                    } else {
                        superclass.getClass();
                        if (m5056(superclass) != 1) {
                            Object obj2 = map2.get(superclass);
                            obj2.getClass();
                            arrayList = new ArrayList((Collection) obj2);
                            Class<?>[] interfaces2 = cls.getInterfaces();
                            interfaces2.getClass();
                            length = interfaces2.length;
                            while (true) {
                                if (i2 < length) {
                                }
                                i2++;
                            }
                        }
                    }
                }
            }
            i = 2;
        }
        map.put(cls, Integer.valueOf(i));
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m5057(Constructor constructor, InterfaceC3222 interfaceC3222) {
        try {
            constructor.newInstance(interfaceC3222).getClass();
            throw new ClassCastException();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
