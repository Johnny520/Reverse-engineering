package party.iroiro.luajava;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import p000.AbstractC0213Ey;
import party.iroiro.luajava.Lua;
import party.iroiro.luajava.LuaException;
import party.iroiro.luajava.util.ClassUtils;
import party.iroiro.luajava.util.LRUCache;
import party.iroiro.luajava.value.LuaValue;

/* JADX INFO: loaded from: classes.dex */
public abstract class JuaAPI {
    private static final Pattern COMMA_SPLIT = null;
    private static final LRUCache<Class<?>, Boolean, Constructor<?>[]> CONSTRUCTORS_CACHE = null;
    private static final LRUCache<Class<?>, String, Constructor<?>> CONSTRUCTOR_CACHE = null;
    static final ExecutableWrapper<Constructor<?>> CONSTRUCTOR_WRAPPER = null;
    private static final LRUCache<String, String, Method> JAVA_LIB_CACHE = null;
    private static final LRUCache<Class<?>, String, Method[]> MEMBER_METHOD_CACHE = null;
    private static final LRUCache<Class<?>, String, Method> METHOD_CACHE = null;
    static final ExecutableWrapper<Method> METHOD_WRAPPER = null;
    private static final LRUCache<Class<?>, String, OptionalField> OBJECT_FIELD_CACHE = null;

    public interface ExecutableWrapper<T> {
        Class<?>[] getParameterTypes(T r1);
    }

    public static final class OptionalField {
        public final Field field;

        public /* synthetic */ OptionalField(Field r1, C23611 r2) {
            this(r1);
        }

        private OptionalField(Field r1) {
            this.field = r1;
        }
    }

    static {
        JAVA_LIB_CACHE = new LRUCache(25, 5, 4);
        CONSTRUCTORS_CACHE = new LRUCache(25, 1, 4);
        MEMBER_METHOD_CACHE = new LRUCache(25, 10, 4);
        OBJECT_FIELD_CACHE = new LRUCache(25, 10, 4);
        CONSTRUCTOR_CACHE = new LRUCache(25, 5, 4);
        METHOD_CACHE = new LRUCache(25, 50, 4);
        COMMA_SPLIT = Pattern.compile(",");
        CONSTRUCTOR_WRAPPER = new C23622();
        METHOD_WRAPPER = new C23633();
    }

    public JuaAPI() {
    }

    private static void addNameMatching(Class<?> r5, String r6, List<Method> r7) {
        Method[] r52 = r5.getMethods();
        int r0 = r52.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L10;
        Method r2 = r52[r1];
        if (Modifier.isPublic(r2.getModifiers() & r2.getDeclaringClass().getModifiers()) == false) goto L9;
        if (r2.getName().equals(r6) == false) goto L9;
        r7.add(r2);
    L9:
        r1 = r1 + 1;
        goto L3
    }

    public static ByteBuffer allocateDirect(int r0) {
        return ByteBuffer.allocateDirect(r0);
    }

    public static int arrayIndex(int r1, Object r2, int r3) {
        AbstractLua r12 = Jua.get(r1);
        r12.push(Array.get(r2, r3 - 1), Lua.Conversion.SEMI);     // Catch: Exception -> L5
        return 1;
    L5:
        e = move-exception;
        return r12.error(e);
    }

    public static int arrayLength(Object r0) {
        return Array.getLength(r0);
    L4:
        return -1;
    }

    public static int arrayNew(int r7, Object r8, int r9) {
        AbstractLua r72 = Jua.get(r7);
        if ((r8 instanceof Class) == true) goto L5;
    L23:
        r72.push("bad argument #1 to 'java.array' (expecting Class<?>)");
        return -1;
    L5:
        if (r8 == Void.TYPE) goto L23;
        Class r82 = (Class) r8;
        if (r9 < 0) goto L9;
        r72.pushJavaArray(Array.newInstance(r82, r9));
        return 1;
    L9:
        int[] r0 = new int[-r9];
        int r2 = r9;
    L10:
        if (r2 > (-1)) goto L20;
        if (r72.isNumber(r2) == false) goto L13;
        int r3 = (int) r72.toNumber(r2);
        if (r3 < 0) goto L17;
        r0[r2 - r9] = r3;
        r2 = r2 + 1;
        goto L10
    L17:
        r72.push("bad argument #" + ((r2 - r9) + 2) + " to 'java.array' (expecting non negative)");
        return -1;
    L13:
        r72.push("bad argument #" + ((r2 - r9) + 2) + " to 'java.array' (expecting number)");
        return -1;
    L20:
        r72.pushJavaArray(Array.newInstance(r82, r0));
        return 1;
    }

    public static int arrayNewIndex(int r2, Object r3, int r4) {
        AbstractLua r22 = Jua.get(r2);
        Array.set(r3, r4 - 1, r22.toObject(r22.getTop(), r3.getClass().getComponentType()));     // Catch: Exception -> L6
        return 0;
    L6:
        e = move-exception;
        return r22.error(e);
    }

    public static int classIndex(int r3, Class<?> r4, String r5) {
        AbstractLua r32 = Jua.get(r3);
        if (r5.equals("class") == false) goto L6;
        r32.pushJavaObject(r4);
        return 1;
    L6:
        int r0 = fieldIndex(r32, r4, null, r5);
        if (r0 != 1) goto L12;
        return 1;
    L12:
        r32.pushJavaClass(ClassUtils.forName(r4.getName() + '$' + r5));     // Catch: ClassNotFoundException -> L11
        return 1;
    L11:
        return r0;
    }

    public static int classInvoke(int r1, Class<?> r2, String r3, int r4) {
        return methodInvoke(r1, r2, null, r3, r4);
    }

    public static int classNew(int r4, Object r5, int r6) {
        AbstractLua r42 = Jua.get(r4);
        if ((r5 instanceof Class) == false) goto L21;
        Class<?> r52 = (Class) r5;
        if (r52.isInterface() == true) goto L23;
        Object[] r62 = new Object[r6];
        LRUCache<Class<?>, Boolean, Constructor<?>[]> r0 = CONSTRUCTORS_CACHE;
        Boolean r2 = Boolean.TRUE;
        Constructor<?>[] r3 = r0.get(r52, r2);
        if (r3 != null) goto L15;
        r3 = r52.getConstructors();
        r0.put(r52, r2, r3);
    L15:
        Constructor r53 = (Constructor) matchMethod(r42, r3, CONSTRUCTOR_WRAPPER, r62);
        if (r53 != null) goto L18;
        r42.push("no matching constructor found");
        return -1;
    L18:
        return construct(r42, r62, r53);
    L23:
        r42.pushJavaObject(r42.createProxy(new Class[]{r52}, Lua.Conversion.SEMI));     // Catch: IllegalArgumentException -> L9
        return 1;
    L9:
        e = move-exception;
        return r42.error(e);
    L21:
        r42.push("bad argument #1 to java.new (expecting Class<?>)");
        return -1;
    }

    public static int classNewIndex(int r1, Class<?> r2, String r3) {
        return fieldNewIndex(r1, r2, null, r3);
    }

    private static int construct(Lua r0, Object[] r1, Constructor<?> r2) {
        r0.pushJavaObject(r2.newInstance(r1));     // Catch: InvocationTargetException -> L5 IllegalAccessException -> L7 InstantiationException -> L9
        return 1;
    L7:
        e = e;
    L14:
        return r0.error(e);
    L9:
        e = e;
    L5:
        e = move-exception;
        return r0.error(e.getCause());
    }

    private static Number convertBoxedNumber(Number r1, Class<?> r2) {
        if (Byte.class != r2) goto L7;
        return Byte.valueOf(r1.byteValue());
    L7:
        if (Short.class != r2) goto L11;
        return Short.valueOf(r1.shortValue());
    L11:
        if (Integer.class != r2) goto L15;
        return Integer.valueOf(r1.intValue());
    L15:
        if (Long.class != r2) goto L19;
        return Long.valueOf(r1.longValue());
    L19:
        if (Float.class != r2) goto L23;
        return Float.valueOf(r1.floatValue());
    L23:
        if (Double.class != r2) goto L27;
        return Double.valueOf(r1.doubleValue());
    L27:
        throw new IllegalArgumentException("Unsupported conversion");
    }

    public static Object convertFromLua(Lua r7, Class<?> r8, int r9) {
        Lua.LuaType r0 = r7.type(r9);
        if (r0 != Lua.LuaType.NIL) goto L11;
        if (r8.isPrimitive() == true) goto L9;
        return null;
    L9:
        throw new IllegalArgumentException("Primitive not accepting null values");
    L11:
        if (r0 != Lua.LuaType.BOOLEAN) goto L19;
        if (r8 == Boolean.TYPE) goto L17;
        if (r8.isAssignableFrom(Boolean.class) == true) goto L17;
    L94:
        if (r8.isAssignableFrom(LuaValue.class) == false) goto L98;
        r7.pushValue(r9);
        return r7.get();
    L98:
        throw new IllegalArgumentException("Unable to convert to ".concat(r8.getName()));
    L17:
        return Boolean.valueOf(r7.toBoolean(r9));
    L19:
        if (r0 == Lua.LuaType.STRING) goto L21;
        boolean r5 = false;
        if (r0 != Lua.LuaType.NUMBER) goto L55;
        if (r8.isPrimitive() == true) goto L49;
        if (Number.class.isAssignableFrom(r8) == true) goto L49;
        if (Character.class == r8) goto L38;
        if (Boolean.class == r8) goto L41;
        if (r8 != Object.class) goto L94;
        return Double.valueOf(r7.toNumber(r9));
    L41:
        if (r7.toNumber(r9) == 0.0d) goto L44;
        r5 = true;
    L44:
        return Boolean.valueOf(r5);
    L38:
        return Character.valueOf((char) r7.toNumber(r9));
    L49:
        if (r7.isInteger(r9) == false) goto L51;
        Number r72 = Long.valueOf(r7.toInteger(r9));
    L53:
        return convertNumber(r72, r8);
    L51:
        r72 = Double.valueOf(r7.toNumber(r9));
        goto L53
    L55:
        if (r0 != Lua.LuaType.USERDATA) goto L66;
        Object r02 = r7.toJavaObject(r9);
        if (r02 == null) goto L94;
        if (r8.isAssignableFrom(r02.getClass()) == false) goto L62;
        return r02;
    L62:
        if (Number.class.isAssignableFrom(r02.getClass()) == false) goto L94;
        return convertNumber((Number) r02, r8);
    L66:
        if (r0 != Lua.LuaType.TABLE) goto L88;
        if (r8.isAssignableFrom(List.class) == false) goto L72;
        return r7.toList(r9);
    L72:
        if (r8.isArray() == false) goto L78;
        if (r8.getComponentType() != Object.class) goto L78;
        List<?> r73 = r7.toList(r9);
        Objects.requireNonNull(r73);
        return r73.toArray(new Object[0]);
    L78:
        if (r8.isAssignableFrom(Map.class) == false) goto L82;
        return r7.toMap(r9);
    L82:
        if (r8.isInterface() == false) goto L94;
        if (r8.isAnnotation() == true) goto L94;
        r7.pushValue(r9);
        return r7.createProxy(new Class[]{r8}, Lua.Conversion.SEMI);
    L88:
        if (r0 != Lua.LuaType.FUNCTION) goto L94;
        String r03 = ClassUtils.getLuaFunctionalDescriptor(new Class[]{r8});
        if (r03 == null) goto L94;
        r7.pushValue(r9);
        r7.createTable(0, 1);
        r7.insert(r7.getTop() - 1);
        r7.setField(-2, r03);
        return r7.createProxy(new Class[]{r8}, Lua.Conversion.SEMI);
    L21:
        if (r8.isAssignableFrom(String.class) == false) goto L25;
        return r7.toString(r9);
    L25:
        if (r8.isAssignableFrom(ByteBuffer.class) == false) goto L94;
        return r7.toBuffer(r9);
    }

    private static Object convertNumber(Number r1, Class<?> r2) {
        if (r2.isPrimitive() == false) goto L39;
        if (Boolean.TYPE != r2) goto L13;
        if (r1.intValue() == 0) goto L9;
        boolean r12 = true;
    L11:
        return Boolean.valueOf(r12);
    L9:
        r12 = false;
        goto L11
    L13:
        if (Character.TYPE != r2) goto L17;
        return Character.valueOf((char) r1.byteValue());
    L17:
        if (Byte.TYPE != r2) goto L21;
        return Byte.valueOf(r1.byteValue());
    L21:
        if (Short.TYPE != r2) goto L25;
        return Short.valueOf(r1.shortValue());
    L25:
        if (Integer.TYPE != r2) goto L29;
        return Integer.valueOf(r1.intValue());
    L29:
        if (Long.TYPE != r2) goto L33;
        return Long.valueOf(r1.longValue());
    L33:
        if (Float.TYPE != r2) goto L37;
        return Float.valueOf(r1.floatValue());
    L37:
        return Double.valueOf(r1.doubleValue());
    L39:
        return convertBoxedNumber(r1, r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int fieldIndex(Lua r5, Class<?> r6, Object r7, String r8) {
        C23611 r1 = null;
        Object[] r12 = 0;
        Object[] r13 = 0;
        LRUCache<Class<?>, String, OptionalField> r2 = OBJECT_FIELD_CACHE;     // Catch: Throwable -> L12
        OptionalField r3 = r2.get(r6, r8);     // Catch: Throwable -> L12
        if (r3 != null) goto L6;
        Field r32 = r6.getField(r8);     // Catch: Throwable -> L12
        r2.put(r6, r8, new OptionalField(r32, r1));     // Catch: Throwable -> L12
    L9:
        r5.push(r32.get(r7), Lua.Conversion.SEMI);     // Catch: Throwable -> L12
        return 1;
    L6:
        r32 = r3.field;     // Catch: Throwable -> L12
        if (r32 != null) goto L9;
        return 2;
    L12:
        OBJECT_FIELD_CACHE.put(r6, r8, new OptionalField(r13 == true ? 1 : 0, r12 == true ? 1 : 0));
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int fieldNewIndex(int r4, Class<?> r5, Object r6, String r7) {
        AbstractLua r42 = Jua.get(r4);
        C23611 r0 = null;
        Object[] r02 = 0;
        Object[] r03 = 0;
        LRUCache<Class<?>, String, OptionalField> r1 = OBJECT_FIELD_CACHE;     // Catch: IllegalArgumentException -> L6 IllegalAccessException -> L8 NoSuchFieldException -> L10
        OptionalField r2 = r1.get(r5, r7);     // Catch: IllegalArgumentException -> L6 IllegalAccessException -> L8 NoSuchFieldException -> L10
        if (r2 != null) goto L12;
        Field r22 = r5.getField(r7);     // Catch: IllegalArgumentException -> L6 IllegalAccessException -> L8 NoSuchFieldException -> L10
        r1.put(r5, r7, new OptionalField(r22, r0));     // Catch: IllegalArgumentException -> L6 IllegalAccessException -> L8 NoSuchFieldException -> L10
    L16:
        r22.set(r6, convertFromLua(r42, r22.getType(), 3));     // Catch: IllegalArgumentException -> L6 IllegalAccessException -> L8 NoSuchFieldException -> L10
        return 0;
    L12:
        r22 = r2.field;     // Catch: IllegalArgumentException -> L6 IllegalAccessException -> L8 NoSuchFieldException -> L10
        if (r22 != null) goto L16;
        return r42.error(new NoSuchFieldException(r7));
    L8:
        e = e;
    L19:
        OBJECT_FIELD_CACHE.put(r5, r7, new OptionalField(r03 == true ? 1 : 0, r02 == true ? 1 : 0));
        return r42.error(e);
    L6:
        e = e;
    L10:
        e = e;
        goto L19
    }

    public static int freeThreadId(int r2) {
        AbstractLua r22 = Jua.get(r2);
        if (r22.getMainState() == r22) goto L7;
        r22.close();
        return 0;
    L7:
        throw new LuaException(LuaException.LuaError.MEMORY, "unable to detach a main state");
    }

    public static Class<?>[] getClasses(String r3) {
        int r0 = 0;
        if (r3 == null) goto L16;
        if (r3.isEmpty() == true) goto L16;
        String[] r32 = COMMA_SPLIT.split(r3);
        Class<?>[] r1 = new Class[r32.length];
    L9:
        if (r0 >= r32.length) goto L14;
        r1[r0] = ClassUtils.forName(r32[r0]);     // Catch: ClassNotFoundException -> L12
    L13:
        r0 = r0 + 1;
    L12:
        r1[r0] = null;
        goto L13
    L14:
        return r1;
    L16:
        return new Class[0];
    }

    public static int javaImport(int r0, String r1) {
        AbstractLua r02 = Jua.get(r0);
        r02.pushJavaClass(ClassUtils.forName(r1));     // Catch: ClassNotFoundException -> L6
        return 1;
    L6:
        e = move-exception;
        return r02.error(e);
    }

    private static int juaFunctionCall(int r0, Object r1, int r2) {
        AbstractLua r02 = Jua.get(r0);
        if ((r1 instanceof JFunction) == true) goto L5;
        r02.push("error invoking object (expecting a JFunction)");
        return -1;
    L5:
        return ((JFunction) r1).__call(r02);
    }

    public static int load(int r3, String r4) {
        AbstractLua r32 = Jua.get(r3);
        r32.loadExternal(r4);     // Catch: LuaException -> L5
        return 1;
    L5:
        e = move-exception;
        r32.push("\n  no module '" + r4 + "': " + e);
        return 1;
    }

    public static int loadLib(int r6, String r7, String r8) {
        AbstractLua r62 = Jua.get(r6);
        LRUCache<String, String, Method> r2 = JAVA_LIB_CACHE;     // Catch: Throwable -> L12
        final Method r3 = r2.get(r7, r8);     // Catch: Throwable -> L12
        if (r3 != null) goto L7;
        r3 = ClassUtils.forName(r7).getDeclaredMethod(r8, new Class[]{Lua.class});     // Catch: Throwable -> L12
    L7:
        if (r3.getReturnType() != Integer.TYPE) goto L10;
        r2.put(r7, r8, r3);     // Catch: Throwable -> L12
        r62.push(new C23611(r3));     // Catch: Throwable -> L12
        return 1;
    L10:
        r62.pushNil();     // Catch: Throwable -> L12
        r62.push("\n  no method '" + r8 + "': not returning int values");     // Catch: Throwable -> L12
        return 2;
    L12:
        r62.pushNil();
        r62.push("\n  no method '" + r8 + "': no such method");
        return 2;
    }

    public static int loadModule(int r2, String r3) {
        int r0 = r3.lastIndexOf(46);
        if (r0 != (-1)) goto L7;
        AbstractLua r22 = Jua.get(r2);
        r22.pushNil();
        r22.push("\n  no method '" + r3 + "': invalid name");
        return 2;
    L7:
        return loadLib(r2, r3.substring(0, r0), r3.substring(r0 + 1));
    }

    private static Class<?> looseGetClass(Lua r2, int r3) {
        if (r2.isUserdata(r3) == false) goto L9;
        Object r22 = r2.toJavaObject(r3);
        if ((r22 instanceof Class) == true) goto L7;
        return null;
    L7:
        return (Class) r22;
    L9:
        String r23 = r2.toString(r3);
        if (r23 != null) goto L15;
    L13:
        return null;
    L15:
        return ClassUtils.forName(r23);
    }

    public static int luaify(int r2) {
        AbstractLua r22 = Jua.get(r2);
        Object r0 = r22.toJavaObject(-1);
        if (r0 == null) goto L7;
        r22.push(r0, Lua.Conversion.FULL);
        return 1;
    L7:
        return 1;
    }

    private static <T> T matchMethod(Lua r8, T[] r9, ExecutableWrapper<T> r10, Object[] r11) {
        int r0 = r9.length;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L13;
        T r3 = r9[r2];
        Class<?>[] r4 = r10.getParameterTypes(r3);
        if (r4.length != r11.length) goto L12;
        int r5 = 0;
    L16:
        if (r5 == r11.length) goto L11;
        r11[r5] = convertFromLua(r8, r4[r5], (-r11.length) + r5);     // Catch: IllegalArgumentException -> L15
        r5 = r5 + 1;
        goto L16
    L11:
        return r3;
    L12:
        r2 = r2 + 1;
        goto L3
    L13:
        return null;
    }

    public static int methodInvoke(int r6, Class<?> r7, Object r8, String r9, int r10) {
        AbstractLua r62 = Jua.get(r6);
        Object[] r102 = new Object[r10];
        Method[] r0 = MEMBER_METHOD_CACHE.get(r7, r9);
        int r1 = 0;
        if (r0 != null) goto L14;
        ArrayList r02 = new ArrayList();
        Class<?> r2 = r7;
    L6:
        if (Modifier.isPublic(r2.getModifiers()) == true) goto L8;
        r2 = r2.getSuperclass();
        goto L6
    L8:
        addNameMatching(r2, r9, r02);
        if (r02.isEmpty() == false) goto L13;
        Class<?>[] r22 = r7.getInterfaces();
        int r3 = r22.length;
        int r4 = 0;
    L11:
        if (r4 >= r3) goto L13;
        addNameMatching(r22[r4], r9, r02);
        r4 = r4 + 1;
    L13:
        r0 = (Method[]) r02.toArray(new Method[0]);
        MEMBER_METHOD_CACHE.put(r7, r9, r0);
    L14:
        Method r23 = (Method) matchMethod(r62, r0, METHOD_WRAPPER, r102);
        if (r23 != null) goto L22;
        StringBuilder r82 = new StringBuilder("no matching method found: ");
        r82.append(r7.getCanonicalName());
        r82.append(".");
        r82.append(r9);
        r82.append(Arrays.toString(r102));
        int r72 = r0.length;
    L17:
        if (r1 >= r72) goto L19;
        Method r92 = r0[r1];
        r82.append("\n");
        r82.append(r92.toGenericString());
        r1 = r1 + 1;
        goto L17
    L19:
        r62.push(r82.toString());
        return -1;
    L22:
        return methodInvoke(r62, r23, r8, r102);
    }

    public static int objectIndex(int r1, Object r2, String r3) {
        return fieldIndex(Jua.get(r1), r2.getClass(), r2, r3);
    }

    public static int objectInvoke(int r1, Object r2, String r3, int r4) {
        if (r3 != null) goto L6;
        return juaFunctionCall(r1, r2, r4);
    L6:
        return methodInvoke(r1, r2.getClass(), r2, r3, r4);
    }

    public static int objectNewIndex(int r1, Object r2, String r3) {
        return fieldNewIndex(r1, r2.getClass(), r2, r3);
    }

    public static int proxy(int r6) {
        AbstractLua r62 = Jua.get(r6);
        int r0 = r62.getTop() - 1;
        LinkedList r2 = new LinkedList();
        int r3 = 1;
    L3:
        if (r3 > r0) goto L11;
        Class<?> r4 = looseGetClass(r62, r3);
        if (r4 == null) goto L9;
        if (r4.isInterface() == false) goto L9;
        r2.add(r4);
        r3 = r3 + 1;
    L9:
        r62.push("bad argument #" + r3 + " to 'java.proxy' (expecting an interface)");
        return -1;
    L11:
        r62.pushJavaObject(r62.createProxy((Class[]) r2.toArray(new Class[0]), Lua.Conversion.SEMI));
        return 1;
    }

    private static int specialInvoke(AbstractLua r0, Method r1, Object r2, Object[] r3) {
        Object r12 = r0.invokeSpecial(r2, r1, r3);     // Catch: Throwable -> L8
        if (r12 != null) goto L6;
        return 0;
    L6:
        r0.push(r12, Lua.Conversion.SEMI);
        return 1;
    L8:
        th = move-exception;
        return r0.error(th);
    }

    public static int threadNewId(int r0, long r1) {
        return AbstractLua.adopt(r0, r1);
    }

    public static int unwrap(int r2, Object r3) {
        AbstractLua r22 = Jua.get(r2);
        InvocationHandler r32 = Proxy.getInvocationHandler(r3);     // Catch: SecurityException -> L9 IllegalArgumentException -> L11
        if ((r32 instanceof LuaProxy) == false) goto L14;
        LuaProxy r33 = (LuaProxy) r32;     // Catch: SecurityException -> L9 IllegalArgumentException -> L11
        if (r33.f8318L.mainThread != r22.getMainState()) goto L13;
        r22.refGet(r33.ref);     // Catch: SecurityException -> L9 IllegalArgumentException -> L11
        return 1;
    L13:
        r22.push("Proxied table is on different states");     // Catch: SecurityException -> L9 IllegalArgumentException -> L11
        return -1;
    L14:
        r22.push("No a LuaProxy backed object");     // Catch: SecurityException -> L9 IllegalArgumentException -> L11
        return -1;
    L11:
        e = e;
    L18:
        return r22.error(e);
    L9:
        e = e;
        goto L18
    }

    public static int classInvoke(int r6, Class<?> r7, String r8, String r9, int r10) {
        return methodInvoke(r6, r7, null, r8, r9, r10);
    }

    public static int objectInvoke(int r8, Object r9, String r10, String r11, int r12) {
        int r0 = r10.indexOf(58);
        if (r0 == (-1)) goto L5;
        String r82 = r10.substring(0, r0);
        String r4 = r10.substring(r0 + 1);
        return methodInvoke(r8, ClassUtils.forName(r82), r9, r4, r11, r12);
    L9:
        e = move-exception;
        return Jua.get(r8).error(e);
    L5:
        return methodInvoke(r8, r9.getClass(), r9, r10, r11, r12);
    }

    private static Constructor<?> matchMethod(Class<?> r2, String r3) {
        LRUCache<Class<?>, String, Constructor<?>> r0 = CONSTRUCTOR_CACHE;
        Constructor<?> r1 = r0.get(r2, r3);
        if (r1 == null) goto L10;
        return r1;
    L10:
        Constructor<?> r12 = r2.getConstructor(getClasses(r3));     // Catch: NoSuchMethodException -> L8
        r0.put(r2, r3, r12);     // Catch: NoSuchMethodException -> L8
        return r12;
    L8:
        return null;
    }

    private static Method matchMethod(Class<?> r3, String r4, String r5) {
        String r0 = r4 + ",," + r5;
        LRUCache<Class<?>, String, Method> r1 = METHOD_CACHE;
        Method r2 = r1.get(r3, r0);
        if (r2 == null) goto L10;
        return r2;
    L10:
        Method r42 = r3.getMethod(r4, getClasses(r5));     // Catch: NoSuchMethodException -> L8
        r1.put(r3, r0, r42);     // Catch: NoSuchMethodException -> L8
        return r42;
    L8:
        return null;
    }

    public static int methodInvoke(int r7, Class<?> r8, Object r9, String r10, String r11, int r12) {
        AbstractLua r72 = Jua.get(r7);
        if ("new".equals(r10) == false) goto L15;
        if (r9 != null) goto L13;
        Constructor<?> r82 = matchMethod(r8, r11);
        if (r82 == null) goto L11;
        Object[] r92 = new Object[r12];
        if (matchMethod(r72, new Constructor[]{r82}, CONSTRUCTOR_WRAPPER, r92) == null) goto L11;
        return construct(r72, r92, r82);
    L11:
        r72.push("no matching constructor found");
        return -1;
    L13:
        r72.push("bad argument to constructor (Class<?> expected, got Object)");
        return -1;
    L15:
        Method r0 = matchMethod(r8, r10, r11);
        if (r0 == null) goto L26;
        Object[] r122 = new Object[r12];
        if (matchMethod(r72, new Method[]{r0}, METHOD_WRAPPER, r122) != null) goto L20;
        String r83 = "no matching method found: " + r8.getCanonicalName() + "." + r10 + "(" + r11 + "): " + Arrays.toString(r122);
    L27:
        r72.push(r83);
        return -1;
    L20:
        if (r8.isInterface() == false) goto L24;
        return specialInvoke(r72, r0, r9, r122);
    L24:
        return methodInvoke(r72, r0, r9, r122);
    L26:
        StringBuilder r93 = new StringBuilder("no matching method found: ");
        r93.append(r8.getCanonicalName());
        r93.append(".");
        r93.append(r10);
        r93.append("(");
        r83 = AbstractC0213Ey.m410h(r93, r11, ")");
        goto L27
    }

    public static int methodInvoke(Lua r0, Method r1, Object r2, Object[] r3) {
        Object r12 = r1.invoke(r2, r3);     // Catch: InvocationTargetException -> L8 IllegalAccessException -> L11
        if (r12 != null) goto L6;
        return 0;
    L6:
        r0.push(r12, Lua.Conversion.SEMI);
        return 1;
    L11:
        e = move-exception;
        return r0.error(e);
    L8:
        e = move-exception;
        return r0.error(e.getCause());
    }
}
