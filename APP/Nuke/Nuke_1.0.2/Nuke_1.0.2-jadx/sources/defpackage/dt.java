package defpackage;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dt {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Class a(ClassLoader classLoader, String str) {
        if (classLoader == null) {
            classLoader = null;
        }
        Class<?> cls = classLoader != null ? Class.forName(str, false, classLoader) : Class.forName(str);
        if (cls != null) {
            return cls;
        }
        c80.u("JVM class not resolved: ", str);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object b(Constructor constructor, Object[] objArr) {
        Object objNewInstance = constructor != null ? constructor.newInstance(Arrays.copyOf(objArr, objArr.length)) : null;
        if (objNewInstance == null) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            return objNewInstance;
        }
        String strP0 = mg.p0(objArr, null, null, 63);
        if (pv2.s0(strP0)) {
            strP0 = "(empty)";
        }
        throw new NoSuchMethodError("Could not find a suitable constructor for " + constructor + " with arguments: " + ((Object) strP0) + ".");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object c(Class cls, Object[] objArr) {
        Object next;
        Constructor constructor = null;
        if (objArr.length != 0) {
            for (Object obj : objArr) {
                if (obj == null) {
                }
            }
            s.h("Not allowed to create an instance with all null arguments for ", cls, ".");
            return null;
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj2 = objArr[i];
            arrayList.add(obj2 != null ? new p20(obj2.getClass()) : o20.a);
        }
        q20 q20Var = new q20(cls, arrayList);
        ConcurrentHashMap concurrentHashMap = a;
        Constructor constructor2 = (Constructor) concurrentHashMap.get(q20Var);
        if (constructor2 != null) {
            return b(constructor2, objArr);
        }
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        declaredConstructors.getClass();
        aj0 aj0Var = new aj0(new bj0(new bj0(declaredConstructors.length == 0 ? ee0.a : new ng(0, declaredConstructors), new gs(2), 0), new v(7, objArr), 0));
        loop2: while (true) {
            if (!aj0Var.hasNext()) {
                next = null;
                break;
            }
            next = aj0Var.next();
            Class<?>[] parameterTypes = ((Constructor) next).getParameterTypes();
            parameterTypes.getClass();
            int iMin = Math.min(parameterTypes.length, objArr.length);
            ArrayList<ow1> arrayList2 = new ArrayList(iMin);
            for (int i2 = 0; i2 < iMin; i2++) {
                arrayList2.add(new ow1(parameterTypes[i2], objArr[i2]));
            }
            if (!arrayList2.isEmpty()) {
                for (ow1 ow1Var : arrayList2) {
                    Class cls2 = (Class) ow1Var.h;
                    Object obj3 = ow1Var.i;
                    if (obj3 != null || cls2.isPrimitive()) {
                        if (obj3 != null) {
                            Class<?> cls3 = obj3.getClass();
                            if (t11.l(cls2, Boolean.TYPE)) {
                                cls2 = Boolean.class;
                            } else if (t11.l(cls2, Byte.TYPE)) {
                                cls2 = Byte.class;
                            } else if (t11.l(cls2, Character.TYPE)) {
                                cls2 = Character.class;
                            } else if (t11.l(cls2, Short.TYPE)) {
                                cls2 = Short.class;
                            } else if (t11.l(cls2, Integer.TYPE)) {
                                cls2 = Integer.class;
                            } else if (t11.l(cls2, Long.TYPE)) {
                                cls2 = Long.class;
                            } else if (t11.l(cls2, Float.TYPE)) {
                                cls2 = Float.class;
                            } else if (t11.l(cls2, Double.TYPE)) {
                                cls2 = Double.class;
                            } else if (t11.l(cls2, Void.TYPE)) {
                                cls2 = Void.class;
                            }
                            if (cls2.isAssignableFrom(cls3)) {
                            }
                        }
                    }
                }
                break loop2;
            }
            break;
        }
        Constructor constructor3 = (Constructor) next;
        if (constructor3 != null) {
            if (!ig1.a(constructor3)) {
                c80.n("Failed to make the constructor \"", constructor3, "\" accessible. Please check if the constructor is accessible or if the security manager allows it.");
                return null;
            }
            concurrentHashMap.put(q20Var, constructor3);
            constructor = constructor3;
        }
        return b(constructor, objArr);
    }
}
