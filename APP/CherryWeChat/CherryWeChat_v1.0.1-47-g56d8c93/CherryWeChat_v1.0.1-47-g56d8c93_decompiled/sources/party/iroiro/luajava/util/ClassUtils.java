package party.iroiro.luajava.util;

import java.io.Closeable;
import java.io.Externalizable;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import party.iroiro.luajava.util.LRUCache;

/* JADX INFO: loaded from: classes.dex */
public abstract class ClassUtils {
    public static final String ARRAY_SUFFIX = "[]";
    public static volatile ClassLoader DEFAULT_CLASS_LOADER = null;
    private static final String INTERNAL_ARRAY_PREFIX = "[";
    private static final Method IS_DEFAULT;
    private static final char NESTED_CLASS_SEPARATOR = '$';
    private static final String NON_PRIMITIVE_ARRAY_PREFIX = "[L";
    private static final Set<String> OBJECT_METHODS;
    private static final char PACKAGE_SEPARATOR = '.';
    private static final Map<String, Class<?>> commonClassCache;
    private static final Map<String, Class<?>> primitiveTypeNameMap;
    private static final Map<Class<?>, Class<?>> primitiveWrapperTypeMap;
    private static final Map<String, Class<?>> queryClassCache;

    static {
        IdentityHashMap identityHashMap = new IdentityHashMap(9);
        primitiveWrapperTypeMap = identityHashMap;
        primitiveTypeNameMap = new HashMap(32);
        commonClassCache = new HashMap(64);
        queryClassCache = Collections.synchronizedMap(new LRUCache.Cache(256));
        identityHashMap.put(Boolean.class, Boolean.TYPE);
        identityHashMap.put(Byte.class, Byte.TYPE);
        identityHashMap.put(Character.class, Character.TYPE);
        identityHashMap.put(Double.class, Double.TYPE);
        identityHashMap.put(Float.class, Float.TYPE);
        identityHashMap.put(Integer.class, Integer.TYPE);
        identityHashMap.put(Long.class, Long.TYPE);
        identityHashMap.put(Short.class, Short.TYPE);
        identityHashMap.put(Void.class, Void.TYPE);
        Iterator it = identityHashMap.entrySet().iterator();
        while (it.hasNext()) {
            registerCommonClasses((Class) ((Map.Entry) it.next()).getKey());
        }
        HashSet<Class<?>> hashSet = new HashSet(32);
        hashSet.addAll(primitiveWrapperTypeMap.values());
        Collections.addAll(hashSet, boolean[].class, byte[].class, char[].class, double[].class, float[].class, int[].class, long[].class, short[].class);
        for (Class<?> cls : hashSet) {
            primitiveTypeNameMap.put(cls.getName(), cls);
        }
        registerCommonClasses(Boolean[].class, Byte[].class, Character[].class, Double[].class, Float[].class, Integer[].class, Long[].class, Short[].class);
        registerCommonClasses(Number.class, Number[].class, String.class, String[].class, Class.class, Class[].class, Object.class, Object[].class);
        registerCommonClasses(Throwable.class, Exception.class, RuntimeException.class, Error.class, StackTraceElement.class, StackTraceElement[].class);
        registerCommonClasses(Enum.class, Iterable.class, Iterator.class, Enumeration.class, Collection.class, List.class, Set.class, Map.class, Map.Entry.class);
        registerOptionalClasses();
        registerCommonClasses(Serializable.class, Externalizable.class, Closeable.class, AutoCloseable.class, Cloneable.class, Comparable.class);
        Method method = null;
        DEFAULT_CLASS_LOADER = null;
        HashSet hashSet2 = new HashSet();
        Collections.addAll(hashSet2, "equals", "hashCode", "toString");
        OBJECT_METHODS = Collections.unmodifiableSet(hashSet2);
        try {
            method = Method.class.getMethod("isDefault", null);
        } catch (NoSuchMethodException unused) {
        }
        IS_DEFAULT = method;
    }

    private static boolean allInterfaces(Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!cls.isInterface() || cls.isAnnotation()) {
                return false;
            }
        }
        return true;
    }

    private static Class<?> forName(String str, ClassLoader classLoader) throws ClassNotFoundException {
        Class<?> clsResolvePrimitiveClassName = resolvePrimitiveClassName(str);
        if (clsResolvePrimitiveClassName == null) {
            clsResolvePrimitiveClassName = commonClassCache.get(str);
        }
        if (clsResolvePrimitiveClassName != null) {
            return clsResolvePrimitiveClassName;
        }
        Map<String, Class<?>> map = queryClassCache;
        Class<?> cls = map.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> clsForNameSlow = forNameSlow(str, classLoader);
        map.put(str, clsForNameSlow);
        return clsForNameSlow;
    }

    private static Class<?> forNameSlow(String str, ClassLoader classLoader) throws ClassNotFoundException {
        if (str.endsWith(ARRAY_SUFFIX)) {
            return Array.newInstance(forName(str.substring(0, str.length() - 2), classLoader), 0).getClass();
        }
        if (str.startsWith(NON_PRIMITIVE_ARRAY_PREFIX) && str.endsWith(";")) {
            return Array.newInstance(forName(str.substring(2, str.length() - 1), classLoader), 0).getClass();
        }
        if (str.startsWith(INTERNAL_ARRAY_PREFIX)) {
            return Array.newInstance(forName(str.substring(1), classLoader), 0).getClass();
        }
        if (classLoader == null) {
            classLoader = getDefaultClassLoader();
        }
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException e) {
            int iLastIndexOf = str.lastIndexOf(46);
            int iLastIndexOf2 = str.lastIndexOf(46, iLastIndexOf - 1);
            if (iLastIndexOf != -1 && iLastIndexOf2 != -1 && Character.isUpperCase(str.charAt(iLastIndexOf2 + 1))) {
                try {
                    return Class.forName(str.substring(0, iLastIndexOf) + NESTED_CLASS_SEPARATOR + str.substring(iLastIndexOf + 1), false, classLoader);
                } catch (ClassNotFoundException unused) {
                    throw e;
                }
            }
            throw e;
        }
    }

    public static ClassLoader getDefaultClassLoader() {
        ClassLoader contextClassLoader = DEFAULT_CLASS_LOADER;
        if (contextClassLoader != null) {
            return contextClassLoader;
        }
        try {
            contextClassLoader = Thread.currentThread().getContextClassLoader();
        } catch (Throwable unused) {
        }
        if (contextClassLoader != null) {
            return contextClassLoader;
        }
        ClassLoader classLoader = ClassUtils.class.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        try {
            return ClassLoader.getSystemClassLoader();
        } catch (Throwable unused2) {
            return classLoader;
        }
    }

    public static String getLuaFunctionalDescriptor(Class<?>... clsArr) {
        if (!allInterfaces(clsArr)) {
            return null;
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        Collections.addAll(arrayDeque, clsArr);
        String str = null;
        while (!arrayDeque.isEmpty()) {
            Class cls = (Class) arrayDeque.poll();
            for (Method method : cls.getDeclaredMethods()) {
                if (Modifier.isAbstract(method.getModifiers())) {
                    String name = method.getName();
                    if (OBJECT_METHODS.contains(name)) {
                        continue;
                    } else if (str == null) {
                        str = name;
                    } else if (!str.equals(name)) {
                        return null;
                    }
                }
            }
            Collections.addAll(arrayDeque, cls.getInterfaces());
        }
        return str;
    }

    public static boolean isDefault(Method method) {
        Method method2 = IS_DEFAULT;
        if (method2 == null) {
            return false;
        }
        try {
            return ((Boolean) method2.invoke(method, null)).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    private static void registerCommonClasses(Class<?>... clsArr) {
        for (Class<?> cls : clsArr) {
            commonClassCache.put(cls.getName(), cls);
        }
    }

    private static void registerOptionalClasses() {
        try {
            registerCommonClasses(Class.forName("java.util.Optional"));
        } catch (ClassNotFoundException unused) {
        }
    }

    public static Class<?> resolvePrimitiveClassName(String str) {
        if (str == null || str.length() > 7) {
            return null;
        }
        return primitiveTypeNameMap.get(str);
    }

    public static Class<?> forName(String str) throws ClassNotFoundException {
        try {
            return forName(str, null);
        } catch (ClassNotFoundException e) {
            try {
                try {
                    return forName(str, ClassUtils.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    return forName(str, ClassLoader.getSystemClassLoader());
                }
            } catch (ClassNotFoundException unused2) {
                throw e;
            }
        }
    }
}
