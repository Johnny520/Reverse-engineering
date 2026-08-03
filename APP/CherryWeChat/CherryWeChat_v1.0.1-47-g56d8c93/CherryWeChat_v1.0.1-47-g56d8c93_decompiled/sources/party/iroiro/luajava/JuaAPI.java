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
    private static final LRUCache<String, String, Method> JAVA_LIB_CACHE = new LRUCache<>(25, 5, 4);
    private static final LRUCache<Class<?>, Boolean, Constructor<?>[]> CONSTRUCTORS_CACHE = new LRUCache<>(25, 1, 4);
    private static final LRUCache<Class<?>, String, Method[]> MEMBER_METHOD_CACHE = new LRUCache<>(25, 10, 4);
    private static final LRUCache<Class<?>, String, OptionalField> OBJECT_FIELD_CACHE = new LRUCache<>(25, 10, 4);
    private static final LRUCache<Class<?>, String, Constructor<?>> CONSTRUCTOR_CACHE = new LRUCache<>(25, 5, 4);
    private static final LRUCache<Class<?>, String, Method> METHOD_CACHE = new LRUCache<>(25, 50, 4);
    private static final Pattern COMMA_SPLIT = Pattern.compile(",");
    static final ExecutableWrapper<Constructor<?>> CONSTRUCTOR_WRAPPER = new ExecutableWrapper<Constructor<?>>() { // from class: party.iroiro.luajava.JuaAPI.2
        @Override // party.iroiro.luajava.JuaAPI.ExecutableWrapper
        public Class<?>[] getParameterTypes(Constructor<?> constructor) {
            return constructor.getParameterTypes();
        }
    };
    static final ExecutableWrapper<Method> METHOD_WRAPPER = new ExecutableWrapper<Method>() { // from class: party.iroiro.luajava.JuaAPI.3
        @Override // party.iroiro.luajava.JuaAPI.ExecutableWrapper
        public Class<?>[] getParameterTypes(Method method) {
            return method.getParameterTypes();
        }
    };

    public interface ExecutableWrapper<T> {
        Class<?>[] getParameterTypes(T t);
    }

    public static final class OptionalField {
        public final Field field;

        private OptionalField(Field field) {
            this.field = field;
        }
    }

    private static void addNameMatching(Class<?> cls, String str, List<Method> list) {
        for (Method method : cls.getMethods()) {
            if (Modifier.isPublic(method.getModifiers() & method.getDeclaringClass().getModifiers()) && method.getName().equals(str)) {
                list.add(method);
            }
        }
    }

    public static ByteBuffer allocateDirect(int i) {
        return ByteBuffer.allocateDirect(i);
    }

    public static int arrayIndex(int i, Object obj, int i2) {
        AbstractLua abstractLua = Jua.get(i);
        try {
            abstractLua.push(Array.get(obj, i2 - 1), Lua.Conversion.SEMI);
            return 1;
        } catch (Exception e) {
            return abstractLua.error(e);
        }
    }

    public static int arrayLength(Object obj) {
        try {
            return Array.getLength(obj);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static int arrayNew(int i, Object obj, int i2) {
        AbstractLua abstractLua = Jua.get(i);
        if (!(obj instanceof Class) || obj == Void.TYPE) {
            abstractLua.push("bad argument #1 to 'java.array' (expecting Class<?>)");
            return -1;
        }
        Class cls = (Class) obj;
        if (i2 >= 0) {
            abstractLua.pushJavaArray(Array.newInstance((Class<?>) cls, i2));
            return 1;
        }
        int[] iArr = new int[-i2];
        for (int i3 = i2; i3 <= -1; i3++) {
            if (!abstractLua.isNumber(i3)) {
                abstractLua.push("bad argument #" + ((i3 - i2) + 2) + " to 'java.array' (expecting number)");
                return -1;
            }
            int number = (int) abstractLua.toNumber(i3);
            if (number < 0) {
                abstractLua.push("bad argument #" + ((i3 - i2) + 2) + " to 'java.array' (expecting non negative)");
                return -1;
            }
            iArr[i3 - i2] = number;
        }
        abstractLua.pushJavaArray(Array.newInstance((Class<?>) cls, iArr));
        return 1;
    }

    public static int arrayNewIndex(int i, Object obj, int i2) {
        AbstractLua abstractLua = Jua.get(i);
        try {
            Array.set(obj, i2 - 1, abstractLua.toObject(abstractLua.getTop(), obj.getClass().getComponentType()));
            return 0;
        } catch (Exception e) {
            return abstractLua.error(e);
        }
    }

    public static int classIndex(int i, Class<?> cls, String str) {
        AbstractLua abstractLua = Jua.get(i);
        if (str.equals("class")) {
            abstractLua.pushJavaObject(cls);
            return 1;
        }
        int iFieldIndex = fieldIndex(abstractLua, cls, null, str);
        if (iFieldIndex == 1) {
            return 1;
        }
        try {
            abstractLua.pushJavaClass(ClassUtils.forName(cls.getName() + '$' + str));
            return 1;
        } catch (ClassNotFoundException unused) {
            return iFieldIndex;
        }
    }

    public static int classInvoke(int i, Class<?> cls, String str, int i2) {
        return methodInvoke(i, cls, null, str, i2);
    }

    public static int classNew(int i, Object obj, int i2) {
        AbstractLua abstractLua = Jua.get(i);
        if (!(obj instanceof Class)) {
            abstractLua.push("bad argument #1 to java.new (expecting Class<?>)");
            return -1;
        }
        Class<?> cls = (Class) obj;
        if (cls.isInterface()) {
            try {
                abstractLua.pushJavaObject(abstractLua.createProxy(new Class[]{cls}, Lua.Conversion.SEMI));
                return 1;
            } catch (IllegalArgumentException e) {
                return abstractLua.error(e);
            }
        }
        Object[] objArr = new Object[i2];
        LRUCache<Class<?>, Boolean, Constructor<?>[]> lRUCache = CONSTRUCTORS_CACHE;
        Boolean bool = Boolean.TRUE;
        Constructor<?>[] constructors = lRUCache.get(cls, bool);
        if (constructors == null) {
            constructors = cls.getConstructors();
            lRUCache.put(cls, bool, constructors);
        }
        Constructor constructor = (Constructor) matchMethod(abstractLua, constructors, CONSTRUCTOR_WRAPPER, objArr);
        if (constructor != null) {
            return construct(abstractLua, objArr, constructor);
        }
        abstractLua.push("no matching constructor found");
        return -1;
    }

    public static int classNewIndex(int i, Class<?> cls, String str) {
        return fieldNewIndex(i, cls, null, str);
    }

    private static int construct(Lua lua, Object[] objArr, Constructor<?> constructor) {
        try {
            lua.pushJavaObject(constructor.newInstance(objArr));
            return 1;
        } catch (IllegalAccessException e) {
            e = e;
            return lua.error(e);
        } catch (InstantiationException e2) {
            e = e2;
            return lua.error(e);
        } catch (InvocationTargetException e3) {
            return lua.error(e3.getCause());
        }
    }

    private static Number convertBoxedNumber(Number number, Class<?> cls) {
        if (Byte.class == cls) {
            return Byte.valueOf(number.byteValue());
        }
        if (Short.class == cls) {
            return Short.valueOf(number.shortValue());
        }
        if (Integer.class == cls) {
            return Integer.valueOf(number.intValue());
        }
        if (Long.class == cls) {
            return Long.valueOf(number.longValue());
        }
        if (Float.class == cls) {
            return Float.valueOf(number.floatValue());
        }
        if (Double.class == cls) {
            return Double.valueOf(number.doubleValue());
        }
        throw new IllegalArgumentException("Unsupported conversion");
    }

    public static Object convertFromLua(Lua lua, Class<?> cls, int i) {
        String luaFunctionalDescriptor;
        Lua.LuaType luaTypeType = lua.type(i);
        if (luaTypeType == Lua.LuaType.NIL) {
            if (cls.isPrimitive()) {
                throw new IllegalArgumentException("Primitive not accepting null values");
            }
            return null;
        }
        if (luaTypeType == Lua.LuaType.BOOLEAN) {
            if (cls == Boolean.TYPE || cls.isAssignableFrom(Boolean.class)) {
                return Boolean.valueOf(lua.toBoolean(i));
            }
        } else if (luaTypeType != Lua.LuaType.STRING) {
            if (luaTypeType == Lua.LuaType.NUMBER) {
                if (cls.isPrimitive() || Number.class.isAssignableFrom(cls)) {
                    return convertNumber(lua.isInteger(i) ? Long.valueOf(lua.toInteger(i)) : Double.valueOf(lua.toNumber(i)), cls);
                }
                if (Character.class == cls) {
                    return Character.valueOf((char) lua.toNumber(i));
                }
                if (Boolean.class == cls) {
                    return Boolean.valueOf(lua.toNumber(i) != 0.0d);
                }
                if (cls == Object.class) {
                    return Double.valueOf(lua.toNumber(i));
                }
            } else if (luaTypeType == Lua.LuaType.USERDATA) {
                Object javaObject = lua.toJavaObject(i);
                if (javaObject != null) {
                    if (cls.isAssignableFrom(javaObject.getClass())) {
                        return javaObject;
                    }
                    if (Number.class.isAssignableFrom(javaObject.getClass())) {
                        return convertNumber((Number) javaObject, cls);
                    }
                }
            } else if (luaTypeType == Lua.LuaType.TABLE) {
                if (cls.isAssignableFrom(List.class)) {
                    return lua.toList(i);
                }
                if (cls.isArray() && cls.getComponentType() == Object.class) {
                    List<?> list = lua.toList(i);
                    Objects.requireNonNull(list);
                    return list.toArray(new Object[0]);
                }
                if (cls.isAssignableFrom(Map.class)) {
                    return lua.toMap(i);
                }
                if (cls.isInterface() && !cls.isAnnotation()) {
                    lua.pushValue(i);
                    return lua.createProxy(new Class[]{cls}, Lua.Conversion.SEMI);
                }
            } else if (luaTypeType == Lua.LuaType.FUNCTION && (luaFunctionalDescriptor = ClassUtils.getLuaFunctionalDescriptor(cls)) != null) {
                lua.pushValue(i);
                lua.createTable(0, 1);
                lua.insert(lua.getTop() - 1);
                lua.setField(-2, luaFunctionalDescriptor);
                return lua.createProxy(new Class[]{cls}, Lua.Conversion.SEMI);
            }
        } else {
            if (cls.isAssignableFrom(String.class)) {
                return lua.toString(i);
            }
            if (cls.isAssignableFrom(ByteBuffer.class)) {
                return lua.toBuffer(i);
            }
        }
        if (!cls.isAssignableFrom(LuaValue.class)) {
            throw new IllegalArgumentException("Unable to convert to ".concat(cls.getName()));
        }
        lua.pushValue(i);
        return lua.get();
    }

    private static Object convertNumber(Number number, Class<?> cls) {
        if (!cls.isPrimitive()) {
            return convertBoxedNumber(number, cls);
        }
        if (Boolean.TYPE == cls) {
            return Boolean.valueOf(number.intValue() != 0);
        }
        return Character.TYPE == cls ? Character.valueOf((char) number.byteValue()) : Byte.TYPE == cls ? Byte.valueOf(number.byteValue()) : Short.TYPE == cls ? Short.valueOf(number.shortValue()) : Integer.TYPE == cls ? Integer.valueOf(number.intValue()) : Long.TYPE == cls ? Long.valueOf(number.longValue()) : Float.TYPE == cls ? Float.valueOf(number.floatValue()) : Double.valueOf(number.doubleValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int fieldIndex(Lua lua, Class<?> cls, Object obj, String str) {
        Field field;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        try {
            LRUCache<Class<?>, String, OptionalField> lRUCache = OBJECT_FIELD_CACHE;
            OptionalField optionalField = lRUCache.get(cls, str);
            if (optionalField == null) {
                field = cls.getField(str);
                lRUCache.put(cls, str, new OptionalField(field));
            } else {
                field = optionalField.field;
                if (field == null) {
                    return 2;
                }
            }
            lua.push(field.get(obj), Lua.Conversion.SEMI);
            return 1;
        } catch (IllegalAccessException | NoSuchFieldException | NullPointerException unused) {
            OBJECT_FIELD_CACHE.put(cls, str, new OptionalField(objArr2 == true ? 1 : 0));
            return 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int fieldNewIndex(int i, Class<?> cls, Object obj, String str) {
        Field field;
        AbstractLua abstractLua = Jua.get(i);
        try {
            LRUCache<Class<?>, String, OptionalField> lRUCache = OBJECT_FIELD_CACHE;
            OptionalField optionalField = lRUCache.get(cls, str);
            if (optionalField == null) {
                field = cls.getField(str);
                lRUCache.put(cls, str, new OptionalField(field));
            } else {
                field = optionalField.field;
                if (field == null) {
                    return abstractLua.error(new NoSuchFieldException(str));
                }
            }
            field.set(obj, convertFromLua(abstractLua, field.getType(), 3));
            return 0;
        } catch (IllegalAccessException e) {
            e = e;
            OBJECT_FIELD_CACHE.put(cls, str, new OptionalField(0 == true ? 1 : 0));
            return abstractLua.error(e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            OBJECT_FIELD_CACHE.put(cls, str, new OptionalField(0 == true ? 1 : 0));
            return abstractLua.error(e);
        } catch (NoSuchFieldException e3) {
            e = e3;
            OBJECT_FIELD_CACHE.put(cls, str, new OptionalField(0 == true ? 1 : 0));
            return abstractLua.error(e);
        }
    }

    public static int freeThreadId(int i) {
        AbstractLua abstractLua = Jua.get(i);
        if (abstractLua.getMainState() == abstractLua) {
            throw new LuaException(LuaException.LuaError.MEMORY, "unable to detach a main state");
        }
        abstractLua.close();
        return 0;
    }

    public static Class<?>[] getClasses(String str) {
        if (str == null || str.isEmpty()) {
            return new Class[0];
        }
        String[] strArrSplit = COMMA_SPLIT.split(str);
        Class<?>[] clsArr = new Class[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                clsArr[i] = ClassUtils.forName(strArrSplit[i]);
            } catch (ClassNotFoundException unused) {
                clsArr[i] = null;
            }
        }
        return clsArr;
    }

    public static int javaImport(int i, String str) {
        AbstractLua abstractLua = Jua.get(i);
        try {
            abstractLua.pushJavaClass(ClassUtils.forName(str));
            return 1;
        } catch (ClassNotFoundException e) {
            return abstractLua.error(e);
        }
    }

    private static int juaFunctionCall(int i, Object obj, int i2) {
        AbstractLua abstractLua = Jua.get(i);
        if (obj instanceof JFunction) {
            return ((JFunction) obj).__call(abstractLua);
        }
        abstractLua.push("error invoking object (expecting a JFunction)");
        return -1;
    }

    public static int load(int i, String str) {
        AbstractLua abstractLua = Jua.get(i);
        try {
            abstractLua.loadExternal(str);
            return 1;
        } catch (LuaException e) {
            abstractLua.push("\n  no module '" + str + "': " + e);
            return 1;
        }
    }

    public static int loadLib(int i, String str, String str2) {
        AbstractLua abstractLua = Jua.get(i);
        try {
            LRUCache<String, String, Method> lRUCache = JAVA_LIB_CACHE;
            final Method declaredMethod = lRUCache.get(str, str2);
            if (declaredMethod == null) {
                declaredMethod = ClassUtils.forName(str).getDeclaredMethod(str2, Lua.class);
            }
            if (declaredMethod.getReturnType() == Integer.TYPE) {
                lRUCache.put(str, str2, declaredMethod);
                abstractLua.push(new JFunction() { // from class: party.iroiro.luajava.JuaAPI.1
                    @Override // party.iroiro.luajava.JFunction
                    public int __call(Lua lua) {
                        try {
                            return ((Integer) declaredMethod.invoke(null, lua)).intValue();
                        } catch (IllegalAccessException e) {
                            return lua.error(e);
                        } catch (InvocationTargetException e2) {
                            return lua.error(e2.getCause());
                        }
                    }
                });
                return 1;
            }
            abstractLua.pushNil();
            abstractLua.push("\n  no method '" + str2 + "': not returning int values");
            return 2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            abstractLua.pushNil();
            abstractLua.push("\n  no method '" + str2 + "': no such method");
            return 2;
        }
    }

    public static int loadModule(int i, String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            return loadLib(i, str.substring(0, iLastIndexOf), str.substring(iLastIndexOf + 1));
        }
        AbstractLua abstractLua = Jua.get(i);
        abstractLua.pushNil();
        abstractLua.push("\n  no method '" + str + "': invalid name");
        return 2;
    }

    private static Class<?> looseGetClass(Lua lua, int i) {
        if (lua.isUserdata(i)) {
            Object javaObject = lua.toJavaObject(i);
            if (javaObject instanceof Class) {
                return (Class) javaObject;
            }
            return null;
        }
        String string = lua.toString(i);
        if (string != null) {
            try {
                return ClassUtils.forName(string);
            } catch (ClassNotFoundException unused) {
            }
        }
        return null;
    }

    public static int luaify(int i) {
        AbstractLua abstractLua = Jua.get(i);
        Object javaObject = abstractLua.toJavaObject(-1);
        if (javaObject == null) {
            return 1;
        }
        abstractLua.push(javaObject, Lua.Conversion.FULL);
        return 1;
    }

    private static <T> T matchMethod(Lua lua, T[] tArr, ExecutableWrapper<T> executableWrapper, Object[] objArr) {
        for (T t : tArr) {
            Class<?>[] parameterTypes = executableWrapper.getParameterTypes(t);
            if (parameterTypes.length == objArr.length) {
                for (int i = 0; i != objArr.length; i++) {
                    try {
                        objArr[i] = convertFromLua(lua, parameterTypes[i], (-objArr.length) + i);
                    } catch (IllegalArgumentException unused) {
                        continue;
                    }
                }
                return t;
            }
        }
        return null;
    }

    public static int methodInvoke(int i, Class<?> cls, Object obj, String str, int i2) {
        AbstractLua abstractLua = Jua.get(i);
        Object[] objArr = new Object[i2];
        Method[] methodArr = MEMBER_METHOD_CACHE.get(cls, str);
        if (methodArr == null) {
            ArrayList arrayList = new ArrayList();
            Class<?> superclass = cls;
            while (!Modifier.isPublic(superclass.getModifiers())) {
                superclass = superclass.getSuperclass();
            }
            addNameMatching(superclass, str, arrayList);
            if (arrayList.isEmpty()) {
                for (Class<?> cls2 : cls.getInterfaces()) {
                    addNameMatching(cls2, str, arrayList);
                }
            }
            methodArr = (Method[]) arrayList.toArray(new Method[0]);
            MEMBER_METHOD_CACHE.put(cls, str, methodArr);
        }
        Method method = (Method) matchMethod(abstractLua, methodArr, METHOD_WRAPPER, objArr);
        if (method != null) {
            return methodInvoke(abstractLua, method, obj, objArr);
        }
        StringBuilder sb = new StringBuilder("no matching method found: ");
        sb.append(cls.getCanonicalName());
        sb.append(".");
        sb.append(str);
        sb.append(Arrays.toString(objArr));
        for (Method method2 : methodArr) {
            sb.append("\n");
            sb.append(method2.toGenericString());
        }
        abstractLua.push(sb.toString());
        return -1;
    }

    public static int objectIndex(int i, Object obj, String str) {
        return fieldIndex(Jua.get(i), obj.getClass(), obj, str);
    }

    public static int objectInvoke(int i, Object obj, String str, int i2) {
        return str == null ? juaFunctionCall(i, obj, i2) : methodInvoke(i, obj.getClass(), obj, str, i2);
    }

    public static int objectNewIndex(int i, Object obj, String str) {
        return fieldNewIndex(i, obj.getClass(), obj, str);
    }

    public static int proxy(int i) {
        AbstractLua abstractLua = Jua.get(i);
        int top = abstractLua.getTop() - 1;
        LinkedList linkedList = new LinkedList();
        for (int i2 = 1; i2 <= top; i2++) {
            Class<?> clsLooseGetClass = looseGetClass(abstractLua, i2);
            if (clsLooseGetClass == null || !clsLooseGetClass.isInterface()) {
                abstractLua.push("bad argument #" + i2 + " to 'java.proxy' (expecting an interface)");
                return -1;
            }
            linkedList.add(clsLooseGetClass);
        }
        abstractLua.pushJavaObject(abstractLua.createProxy((Class[]) linkedList.toArray(new Class[0]), Lua.Conversion.SEMI));
        return 1;
    }

    private static int specialInvoke(AbstractLua abstractLua, Method method, Object obj, Object[] objArr) {
        try {
            Object objInvokeSpecial = abstractLua.invokeSpecial(obj, method, objArr);
            if (objInvokeSpecial == null) {
                return 0;
            }
            abstractLua.push(objInvokeSpecial, Lua.Conversion.SEMI);
            return 1;
        } catch (Throwable th) {
            return abstractLua.error(th);
        }
    }

    public static int threadNewId(int i, long j) {
        return AbstractLua.adopt(i, j);
    }

    public static int unwrap(int i, Object obj) {
        AbstractLua abstractLua = Jua.get(i);
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(obj);
            if (!(invocationHandler instanceof LuaProxy)) {
                abstractLua.push("No a LuaProxy backed object");
                return -1;
            }
            LuaProxy luaProxy = (LuaProxy) invocationHandler;
            if (luaProxy.f8318L.mainThread == abstractLua.getMainState()) {
                abstractLua.refGet(luaProxy.ref);
                return 1;
            }
            abstractLua.push("Proxied table is on different states");
            return -1;
        } catch (IllegalArgumentException e) {
            e = e;
            return abstractLua.error(e);
        } catch (SecurityException e2) {
            e = e2;
            return abstractLua.error(e);
        }
    }

    public static int classInvoke(int i, Class<?> cls, String str, String str2, int i2) {
        return methodInvoke(i, cls, null, str, str2, i2);
    }

    public static int objectInvoke(int i, Object obj, String str, String str2, int i2) {
        int iIndexOf = str.indexOf(58);
        if (iIndexOf == -1) {
            return methodInvoke(i, obj.getClass(), obj, str, str2, i2);
        }
        String strSubstring = str.substring(0, iIndexOf);
        try {
            return methodInvoke(i, ClassUtils.forName(strSubstring), obj, str.substring(iIndexOf + 1), str2, i2);
        } catch (ClassNotFoundException e) {
            return Jua.get(i).error(e);
        }
    }

    private static Constructor<?> matchMethod(Class<?> cls, String str) {
        LRUCache<Class<?>, String, Constructor<?>> lRUCache = CONSTRUCTOR_CACHE;
        Constructor<?> constructor = lRUCache.get(cls, str);
        if (constructor != null) {
            return constructor;
        }
        try {
            Constructor<?> constructor2 = cls.getConstructor(getClasses(str));
            lRUCache.put(cls, str, constructor2);
            return constructor2;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private static Method matchMethod(Class<?> cls, String str, String str2) {
        String str3 = str + ",," + str2;
        LRUCache<Class<?>, String, Method> lRUCache = METHOD_CACHE;
        Method method = lRUCache.get(cls, str3);
        if (method != null) {
            return method;
        }
        try {
            Method method2 = cls.getMethod(str, getClasses(str2));
            lRUCache.put(cls, str3, method2);
            return method2;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static int methodInvoke(int i, Class<?> cls, Object obj, String str, String str2, int i2) {
        String strM410h;
        AbstractLua abstractLua = Jua.get(i);
        if ("new".equals(str)) {
            if (obj == null) {
                Constructor<?> constructorMatchMethod = matchMethod(cls, str2);
                if (constructorMatchMethod != null) {
                    Object[] objArr = new Object[i2];
                    if (matchMethod(abstractLua, new Constructor[]{constructorMatchMethod}, CONSTRUCTOR_WRAPPER, objArr) != null) {
                        return construct(abstractLua, objArr, constructorMatchMethod);
                    }
                }
                abstractLua.push("no matching constructor found");
                return -1;
            }
            abstractLua.push("bad argument to constructor (Class<?> expected, got Object)");
            return -1;
        }
        Method methodMatchMethod = matchMethod(cls, str, str2);
        if (methodMatchMethod != null) {
            Object[] objArr2 = new Object[i2];
            if (matchMethod(abstractLua, new Method[]{methodMatchMethod}, METHOD_WRAPPER, objArr2) != null) {
                if (cls.isInterface()) {
                    return specialInvoke(abstractLua, methodMatchMethod, obj, objArr2);
                }
                return methodInvoke(abstractLua, methodMatchMethod, obj, objArr2);
            }
            strM410h = "no matching method found: " + cls.getCanonicalName() + "." + str + "(" + str2 + "): " + Arrays.toString(objArr2);
        } else {
            StringBuilder sb = new StringBuilder("no matching method found: ");
            sb.append(cls.getCanonicalName());
            sb.append(".");
            sb.append(str);
            sb.append("(");
            strM410h = AbstractC0213Ey.m410h(sb, str2, ")");
        }
        abstractLua.push(strM410h);
        return -1;
    }

    public static int methodInvoke(Lua lua, Method method, Object obj, Object[] objArr) {
        try {
            Object objInvoke = method.invoke(obj, objArr);
            if (objInvoke == null) {
                return 0;
            }
            lua.push(objInvoke, Lua.Conversion.SEMI);
            return 1;
        } catch (IllegalAccessException e) {
            return lua.error(e);
        } catch (InvocationTargetException e2) {
            return lua.error(e2.getCause());
        }
    }
}
