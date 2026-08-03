package party.iroiro.luajava.util;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class Type {
    public Type() {
    }

    private static void appendDescriptor(Class<?> r1, StringBuilder r2) {
    L3:
        if (r1.isArray() == false) goto L6;
        r2.append('[');
        r1 = r1.getComponentType();
        goto L3
    L6:
        if (r1.isPrimitive() == false) goto L9;
        r2.append(getPrimitiveDescriptor(r1));
        return;
    L9:
        r2.append('L');
        r2.append(getInternalName(r1));
        r2.append(';');
    }

    public static String getInternalName(Class<?> r2) {
        return r2.getName().replace('.', '/');
    }

    public static String getMethodDescriptor(Method r5) {
        StringBuilder r0 = new StringBuilder();
        r0.append('(');
        Class<?>[] r1 = r5.getParameterTypes();
        int r2 = r1.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L5;
        appendDescriptor(r1[r3], r0);
        r3 = r3 + 1;
        goto L3
    L5:
        r0.append(')');
        appendDescriptor(r5.getReturnType(), r0);
        return r0.toString();
    }

    public static char getPrimitiveDescriptor(Class<?> r1) {
        if (r1 != Integer.TYPE) goto L7;
        return 'I';
    L7:
        if (r1 != Void.TYPE) goto L11;
        return 'V';
    L11:
        if (r1 != Boolean.TYPE) goto L15;
        return 'Z';
    L15:
        if (r1 != Byte.TYPE) goto L19;
        return 'B';
    L19:
        if (r1 != Character.TYPE) goto L23;
        return 'C';
    L23:
        if (r1 != Short.TYPE) goto L27;
        return 'S';
    L27:
        if (r1 != Double.TYPE) goto L31;
        return 'D';
    L31:
        if (r1 != Float.TYPE) goto L35;
        return 'F';
    L35:
        if (r1 != Long.TYPE) goto L39;
        return 'J';
    L39:
        throw new AssertionError();
    }
}
