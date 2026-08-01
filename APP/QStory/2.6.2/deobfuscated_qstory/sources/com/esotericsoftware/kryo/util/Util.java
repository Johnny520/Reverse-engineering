package com.esotericsoftware.kryo.util;

import androidx.activity.AbstractC0053;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.SerializerFactory;
import com.esotericsoftware.kryo.serializers.ClosureSerializer;
import com.esotericsoftware.kryo.serializers.FieldSerializer;
import com.esotericsoftware.kryo.util.Generics;
import com.esotericsoftware.minlog.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class Util {
    public static final boolean isAndroid = "Dalvik".equals(System.getProperty("java.vm.name"));
    public static final int maxArraySize = 2147483639;
    private static final Map<Class<?>, Class<?>> primitiveWrappers;
    public static final boolean unsafe;

    static {
        boolean z = false;
        if (!"false".equals(System.getProperty("kryo.unsafe"))) {
            try {
                if (Class.forName("com.esotericsoftware.kryo.unsafe.UnsafeUtil", true, FieldSerializer.class.getClassLoader()).getField("unsafe").get(null) != null) {
                    z = true;
                }
            } catch (Throwable th) {
                if (Log.TRACE) {
                    Log.trace("kryo", "Unsafe is unavailable.", th);
                }
            }
        } else if (Log.TRACE) {
            Log.trace("kryo", "Unsafe is disabled.");
        }
        unsafe = z;
        HashMap map = new HashMap();
        primitiveWrappers = map;
        map.put(Boolean.TYPE, Boolean.class);
        map.put(Byte.TYPE, Byte.class);
        map.put(Character.TYPE, Character.class);
        map.put(Double.TYPE, Double.class);
        map.put(Float.TYPE, Float.class);
        map.put(Integer.TYPE, Integer.class);
        map.put(Long.TYPE, Long.class);
        map.put(Short.TYPE, Short.class);
    }

    public static String canonicalName(Class cls) {
        if (cls == null) {
            return "null";
        }
        String canonicalName = cls.getCanonicalName();
        return canonicalName != null ? canonicalName : className(cls);
    }

    public static String className(Class cls) {
        if (cls == null) {
            return "null";
        }
        if (!cls.isArray()) {
            return (cls.isPrimitive() || cls == Object.class || cls == Boolean.class || cls == Byte.class || cls == Character.class || cls == Short.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class) ? cls.getSimpleName() : cls.getName();
        }
        Class elementClass = getElementClass(cls);
        StringBuilder sb = new StringBuilder(16);
        int dimensionCount = getDimensionCount(cls);
        for (int i = 0; i < dimensionCount; i++) {
            sb.append("[]");
        }
        return className(elementClass) + ((Object) sb);
    }

    public static String classNames(Class[] clsArr) {
        StringBuilder sb = new StringBuilder(32);
        int length = clsArr.length;
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(className(clsArr[i]));
        }
        return sb.toString();
    }

    public static Class getArrayType(Class cls) {
        return cls == String.class ? String[].class : cls == Integer.class ? Integer[].class : cls == Float.class ? Float[].class : cls == Boolean.class ? Boolean[].class : cls == Byte.class ? Byte[].class : cls == Long.class ? Long[].class : cls == Character.class ? Character[].class : cls == Double.class ? Double[].class : cls == Short.class ? Short[].class : Array.newInstance((Class<?>) cls, 0).getClass();
    }

    public static int getDimensionCount(Class cls) {
        int i = 0;
        for (Class<?> componentType = cls.getComponentType(); componentType != null; componentType = componentType.getComponentType()) {
            i++;
        }
        return i;
    }

    public static Class getElementClass(Class cls) {
        while (cls.getComponentType() != null) {
            cls = cls.getComponentType();
        }
        return cls;
    }

    public static Class getPrimitiveClass(Class cls) {
        return cls == Integer.class ? Integer.TYPE : cls == Float.class ? Float.TYPE : cls == Boolean.class ? Boolean.TYPE : cls == Byte.class ? Byte.TYPE : cls == Long.class ? Long.TYPE : cls == Character.class ? Character.TYPE : cls == Double.class ? Double.TYPE : cls == Short.class ? Short.TYPE : cls == Void.class ? Void.TYPE : cls;
    }

    private static Class<?> getPrimitiveWrapper(Class<?> cls) {
        if (cls.isPrimitive()) {
            return primitiveWrappers.get(cls);
        }
        C5919.m11249("Argument has to be primitive type");
        return null;
    }

    public static Class getWrapperClass(Class cls) {
        return cls == Integer.TYPE ? Integer.class : cls == Float.TYPE ? Float.class : cls == Boolean.TYPE ? Boolean.class : cls == Byte.TYPE ? Byte.class : cls == Long.TYPE ? Long.class : cls == Character.TYPE ? Character.class : cls == Double.TYPE ? Double.class : cls == Short.TYPE ? Short.class : cls;
    }

    public static boolean isAscii(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) > 127) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAssignableTo(Class<?> cls, Class<?> cls2) {
        if (cls2 == Object.class || cls2.isAssignableFrom(cls)) {
            return true;
        }
        if (cls.isPrimitive()) {
            return isPrimitiveWrapperOf(cls2, cls) || cls2.isAssignableFrom(getPrimitiveWrapper(cls));
        }
        if (cls2.isPrimitive()) {
            return isPrimitiveWrapperOf(cls, cls2);
        }
        if (cls == ClosureSerializer.Closure.class) {
            return cls2.isInterface();
        }
        return false;
    }

    public static boolean isClassAvailable(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Exception unused) {
            Log.debug("kryo", "Class not available: " + str);
            return false;
        }
    }

    public static boolean isEnum(Class cls) {
        return Enum.class.isAssignableFrom(cls) && cls != Enum.class;
    }

    private static boolean isPrimitiveWrapperOf(Class<?> cls, Class<?> cls2) {
        return getPrimitiveWrapper(cls2) == cls;
    }

    public static boolean isUnsafeAvailable() {
        return unsafe;
    }

    public static boolean isWrapperClass(Class cls) {
        return cls == Integer.class || cls == Float.class || cls == Boolean.class || cls == Byte.class || cls == Long.class || cls == Character.class || cls == Double.class || cls == Short.class;
    }

    public static void log(String str, Object obj, int i) {
        if (obj == null) {
            if (Log.TRACE) {
                StringBuilder sbM11553 = AbstractC6136.m11553(str, ": null");
                sbM11553.append(pos(i));
                Log.trace("kryo", sbM11553.toString());
                return;
            }
            return;
        }
        Class<?> cls = obj.getClass();
        if (!cls.isPrimitive() && !isWrapperClass(cls) && cls != String.class) {
            StringBuilder sbM115532 = AbstractC6136.m11553(str, ": ");
            sbM115532.append(string(obj));
            sbM115532.append(pos(i));
            Log.debug("kryo", sbM115532.toString());
            return;
        }
        if (Log.TRACE) {
            StringBuilder sbM115533 = AbstractC6136.m11553(str, ": ");
            sbM115533.append(string(obj));
            sbM115533.append(pos(i));
            Log.trace("kryo", sbM115533.toString());
        }
    }

    public static <T extends SerializerFactory> T newFactory(Class<T> cls, Class<? extends Serializer> cls2) {
        if (cls2 != null) {
            try {
                try {
                    return cls.getConstructor(Class.class).newInstance(cls2);
                } catch (NoSuchMethodException unused) {
                    return cls.newInstance();
                }
            } catch (Exception e) {
                if (cls2 == null) {
                    throw new IllegalArgumentException("Unable to create serializer factory: ".concat(cls.getName()), e);
                }
                C3075.m6913("Unable to create serializer factory \"", cls.getName(), "\" for serializer class: ", className(cls2), e);
                return null;
            }
        }
        return cls.newInstance();
    }

    public static String pos(int i) {
        return i == -1 ? "" : AbstractC0053.m161(i, " [", "]");
    }

    public static String simpleName(Class cls, Generics.GenericType genericType) {
        StringBuilder sb = new StringBuilder(32);
        sb.append((cls.isArray() ? getElementClass(cls) : cls).getSimpleName());
        if (genericType.arguments != null) {
            sb.append('<');
            int length = genericType.arguments.length;
            for (int i = 0; i < length; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(genericType.arguments[i].toString());
            }
            sb.append('>');
        }
        if (cls.isArray()) {
            int dimensionCount = getDimensionCount(cls);
            for (int i2 = 0; i2 < dimensionCount; i2++) {
                sb.append("[]");
            }
        }
        return sb.toString();
    }

    public static String string(Object obj) {
        if (obj == null) {
            return "null";
        }
        Class<?> cls = obj.getClass();
        if (cls.isArray()) {
            return className(cls);
        }
        String strClassName = Log.TRACE ? className(cls) : cls.getSimpleName();
        try {
            if (cls.getMethod("toString", null).getDeclaringClass() == Object.class) {
                return strClassName;
            }
        } catch (Exception unused) {
        }
        try {
            String str = String.valueOf(obj) + " (" + strClassName + ")";
            return str.length() > 97 ? str.substring(0, 97).concat("...") : str;
        } catch (Throwable th) {
            return strClassName + " (toString exception: " + th + ")";
        }
    }

    public static String simpleName(Type type) {
        return type instanceof Class ? ((Class) type).getSimpleName() : type.toString();
    }
}
