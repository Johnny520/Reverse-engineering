package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gt {
    public static final gt c = new gt();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(HashMap map, ft ftVar, z91 z91Var, Class cls) {
        z91 z91Var2 = (z91) map.get(ftVar);
        if (z91Var2 == null || z91Var == z91Var2) {
            if (z91Var2 == null) {
                map.put(ftVar, z91Var);
                return;
            }
            return;
        }
        String name = ftVar.b.getName();
        String name2 = cls.getName();
        String strValueOf = String.valueOf(z91Var2);
        String strValueOf2 = String.valueOf(z91Var);
        StringBuilder sbO = vi0.o("Method ", name, " in ", name2, " already declared with different @OnLifecycleEvent value: previous value ");
        sbO.append(strValueOf);
        sbO.append(", new value ");
        sbO.append(strValueOf2);
        throw new IllegalArgumentException(sbO.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final et a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.a;
        if (superclass != null) {
            et etVarA = (et) map2.get(superclass);
            if (etVarA == null) {
                etVarA = a(superclass, null);
            }
            map.putAll(etVarA.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            et etVarA2 = (et) map2.get(cls2);
            if (etVarA2 == null) {
                etVarA2 = a(cls2, null);
            }
            for (Map.Entry entry : etVarA2.b.entrySet()) {
                b(map, (ft) entry.getKey(), (z91) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            tt1 tt1Var = (tt1) method.getAnnotation(tt1.class);
            if (tt1Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!ia1.class.isAssignableFrom(parameterTypes[0])) {
                        s.j("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                z91 z91VarValue = tt1Var.value();
                if (parameterTypes.length > 1) {
                    if (!z91.class.isAssignableFrom(parameterTypes[1])) {
                        s.j("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (z91VarValue != z91.ON_ANY) {
                        s.j("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    s.j("cannot have more than 2 params");
                    return null;
                }
                b(map, new ft(method, i), z91VarValue, cls);
                z = true;
            }
        }
        et etVar = new et(map);
        map2.put(cls, etVar);
        this.b.put(cls, Boolean.valueOf(z));
        return etVar;
    }
}
