package party.iroiro.luajava.util;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class Type {
    private static void appendDescriptor(Class<?> cls, StringBuilder sb) {
        while (cls.isArray()) {
            sb.append('[');
            cls = cls.getComponentType();
        }
        if (cls.isPrimitive()) {
            sb.append(getPrimitiveDescriptor(cls));
            return;
        }
        sb.append('L');
        sb.append(getInternalName(cls));
        sb.append(';');
    }

    public static String getInternalName(Class<?> cls) {
        return cls.getName().replace('.', '/');
    }

    public static String getMethodDescriptor(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        for (Class<?> cls : method.getParameterTypes()) {
            appendDescriptor(cls, sb);
        }
        sb.append(')');
        appendDescriptor(method.getReturnType(), sb);
        return sb.toString();
    }

    public static char getPrimitiveDescriptor(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return 'I';
        }
        if (cls == Void.TYPE) {
            return 'V';
        }
        if (cls == Boolean.TYPE) {
            return 'Z';
        }
        if (cls == Byte.TYPE) {
            return 'B';
        }
        if (cls == Character.TYPE) {
            return 'C';
        }
        if (cls == Short.TYPE) {
            return 'S';
        }
        if (cls == Double.TYPE) {
            return 'D';
        }
        if (cls == Float.TYPE) {
            return 'F';
        }
        if (cls == Long.TYPE) {
            return 'J';
        }
        throw new AssertionError();
    }
}
