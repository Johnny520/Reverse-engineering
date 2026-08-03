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
    private static final Method IS_DEFAULT = null;
    private static final char NESTED_CLASS_SEPARATOR = '$';
    private static final String NON_PRIMITIVE_ARRAY_PREFIX = "[L";
    private static final Set<String> OBJECT_METHODS = null;
    private static final char PACKAGE_SEPARATOR = '.';
    private static final Map<String, Class<?>> commonClassCache = null;
    private static final Map<String, Class<?>> primitiveTypeNameMap = null;
    private static final Map<Class<?>, Class<?>> primitiveWrapperTypeMap = null;
    private static final Map<String, Class<?>> queryClassCache = null;

    static {
        IdentityHashMap r0 = new IdentityHashMap(9);
        primitiveWrapperTypeMap = r0;
        primitiveTypeNameMap = new HashMap(32);
        commonClassCache = new HashMap(64);
        queryClassCache = Collections.synchronizedMap(new LRUCache.Cache(256));
        r0.put(Boolean.class, Boolean.TYPE);
        r0.put(Byte.class, Byte.TYPE);
        r0.put(Character.class, Character.TYPE);
        r0.put(Double.class, Double.TYPE);
        r0.put(Float.class, Float.TYPE);
        r0.put(Integer.class, Integer.TYPE);
        r0.put(Long.class, Long.TYPE);
        r0.put(Short.class, Short.TYPE);
        r0.put(Void.class, Void.TYPE);
        Iterator r02 = r0.entrySet().iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        registerCommonClasses(new Class[]{(Class) ((Map.Entry) r02.next()).getKey()});
        goto L4
    L6:
        HashSet r03 = new HashSet(32);
        r03.addAll(primitiveWrapperTypeMap.values());
        Collections.addAll(r03, new Class[]{boolean[].class, byte[].class, char[].class, double[].class, float[].class, int[].class, long[].class, short[].class});
        Iterator r04 = r03.iterator();
    L8:
        if (r04.hasNext() == false) goto L10;
        Class<?> r1 = (Class) r04.next();
        primitiveTypeNameMap.put(r1.getName(), r1);
        goto L8
    L10:
        registerCommonClasses(new Class[]{Boolean[].class, Byte[].class, Character[].class, Double[].class, Float[].class, Integer[].class, Long[].class, Short[].class});
        registerCommonClasses(new Class[]{Number.class, Number[].class, String.class, String[].class, Class.class, Class[].class, Object.class, Object[].class});
        registerCommonClasses(new Class[]{Throwable.class, Exception.class, RuntimeException.class, Error.class, StackTraceElement.class, StackTraceElement[].class});
        registerCommonClasses(new Class[]{Enum.class, Iterable.class, Iterator.class, Enumeration.class, Collection.class, List.class, Set.class, Map.class, Map.Entry.class});
        registerOptionalClasses();
        registerCommonClasses(new Class[]{Serializable.class, Externalizable.class, Closeable.class, AutoCloseable.class, Cloneable.class, Comparable.class});
        Method r05 = null;
        DEFAULT_CLASS_LOADER = null;
        HashSet r12 = new HashSet();
        Collections.addAll(r12, new String[]{"equals", "hashCode", "toString"});
        OBJECT_METHODS = Collections.unmodifiableSet(r12);
        r05 = Method.class.getMethod("isDefault", null);     // Catch: NoSuchMethodException -> L14
    L12:
        IS_DEFAULT = r05;
    }

    public ClassUtils() {
    }

    private static boolean allInterfaces(Class<?>[] r5) {
        int r0 = r5.length;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L11;
        Class<?> r3 = r5[r2];
        if (r3.isInterface() == false) goto L10;
        if (r3.isAnnotation() == true) goto L10;
        r2 = r2 + 1;
    L10:
        return false;
    L11:
        return true;
    }

    private static Class<?> forName(String r2, ClassLoader r3) {
        Class<?> r0 = resolvePrimitiveClassName(r2);
        if (r0 != null) goto L5;
        r0 = commonClassCache.get(r2);
    L5:
        if (r0 == null) goto L7;
        return r0;
    L7:
        Map<String, Class<?>> r02 = queryClassCache;
        Class<?> r1 = r02.get(r2);
        if (r1 == null) goto L10;
        return r1;
    L10:
        Class<?> r32 = forNameSlow(r2, r3);
        r02.put(r2, r32);
        return r32;
    }

    private static Class<?> forNameSlow(String r6, ClassLoader r7) {
        if (r6.endsWith(ARRAY_SUFFIX) == false) goto L7;
        return Array.newInstance(forName(r6.substring(0, r6.length() - 2), r7), 0).getClass();
    L7:
        if (r6.startsWith(NON_PRIMITIVE_ARRAY_PREFIX) == false) goto L13;
        if (r6.endsWith(";") == false) goto L13;
        return Array.newInstance(forName(r6.substring(2, r6.length() - 1), r7), 0).getClass();
    L13:
        if (r6.startsWith(INTERNAL_ARRAY_PREFIX) == true) goto L15;
        if (r7 != null) goto L33;
        r7 = getDefaultClassLoader();
    L33:
        return Class.forName(r6, false, r7);
    L20:
        e = move-exception;
        int r4 = r6.lastIndexOf(46);
        int r1 = r6.lastIndexOf(46, r4 - 1);
        if (r4 == (-1)) goto L29;
        if (r1 == (-1)) goto L29;
        if (Character.isUpperCase(r6.charAt(r1 + 1)) == false) goto L29;
        return Class.forName(r6.substring(0, r4) + NESTED_CLASS_SEPARATOR + r6.substring(r4 + 1), false, r7);
    L29:
        throw e;
    L15:
        return Array.newInstance(forName(r6.substring(1), r7), 0).getClass();
    }

    public static ClassLoader getDefaultClassLoader() {
        ClassLoader r0 = DEFAULT_CLASS_LOADER;
        if (r0 == null) goto L15;
        return r0;
    L15:
        r0 = Thread.currentThread().getContextClassLoader();     // Catch: Throwable -> L11
    L6:
        if (r0 != null) goto L17;
        ClassLoader r02 = ClassUtils.class.getClassLoader();
        if (r02 != null) goto L18;
        return ClassLoader.getSystemClassLoader();
    L19:
        return r02;
    L18:
        return r02;
    L17:
        return r0;
    }

    public static String getLuaFunctionalDescriptor(Class<?>... r8) {
        if (allInterfaces(r8) == false) goto L22;
        ArrayDeque r0 = new ArrayDeque(1);
        Collections.addAll(r0, r8);
        String r82 = null;
    L6:
        if (r0.isEmpty() == true) goto L21;
        Class r2 = (Class) r0.poll();
        Method[] r3 = r2.getDeclaredMethods();
        int r4 = r3.length;
        int r5 = 0;
    L8:
        if (r5 >= r4) goto L20;
        Method r6 = r3[r5];
        if (Modifier.isAbstract(r6.getModifiers()) == false) goto L19;
        String r62 = r6.getName();
        if (OBJECT_METHODS.contains(r62) == true) goto L19;
        if (r82 != null) goto L17;
        r82 = r62;
        goto L19
    L17:
        if (r82.equals(r62) == true) goto L19;
        return null;
    L19:
        r5 = r5 + 1;
        goto L8
    L20:
        Collections.addAll(r0, r2.getInterfaces());
        goto L6
    L21:
        return r82;
    L22:
        return null;
    }

    public static boolean isDefault(Method r3) {
        Method r0 = IS_DEFAULT;
        if (r0 != null) goto L9;
        return false;
    L9:
        return ((Boolean) r0.invoke(r3, null)).booleanValue();
    L8:
        return false;
    }

    private static void registerCommonClasses(Class<?>... r5) {
        int r0 = r5.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        Class<?> r2 = r5[r1];
        commonClassCache.put(r2.getName(), r2);
        r1 = r1 + 1;
        goto L3
    }

    private static void registerOptionalClasses() {
        registerCommonClasses(new Class[]{Class.forName("java.util.Optional")});     // Catch: ClassNotFoundException -> L4
        return;
    }

    public static Class<?> resolvePrimitiveClassName(String r2) {
        if (r2 != null) goto L4;
        return null;
    L4:
        if (r2.length() <= 7) goto L6;
        return null;
    L6:
        return primitiveTypeNameMap.get(r2);
    }

    public static Class<?> forName(String r2) {
        return forName(r2, null);
    L5:
        e = move-exception;
        return forName(r2, ClassUtils.class.getClassLoader());
    L8:
        return forName(r2, ClassLoader.getSystemClassLoader());
    L10:
        throw e;
    }
}
