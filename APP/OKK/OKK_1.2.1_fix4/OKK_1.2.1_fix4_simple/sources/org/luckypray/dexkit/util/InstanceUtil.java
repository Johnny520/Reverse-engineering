package org.luckypray.dexkit.util;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.luckypray.dexkit.wrap.DexClass;
import org.luckypray.dexkit.wrap.DexField;
import org.luckypray.dexkit.wrap.DexMethod;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0308h;
import p031Q0.C0313m;
import p042W0.AbstractC0433r;

/* JADX INFO: loaded from: classes.dex */
public final class InstanceUtil {
    public static final InstanceUtil INSTANCE = null;
    private static final WeakCache<Class<?>, Constructor<?>[]> constructorCache = null;
    private static final WeakCache<Class<?>, Field[]> fieldsCache = null;
    private static final WeakCache<Class<?>, Method[]> methodsCache = null;
    private static final WeakCache<Object, String> signCache = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.util.InstanceUtil$getConstructorInstance$1 */
    public static final class C10341 extends AbstractC0308h implements InterfaceC0275a {
        final /* synthetic */ Constructor<?> $constructor;

        public C10341(Constructor<?> r1) {
            this.$constructor = r1;
            super(0);
        }

        @Override // p029P0.InterfaceC0275a
        public /* bridge */ /* synthetic */ Object invoke() {
            return invoke();
        }

        @Override // p029P0.InterfaceC0275a
        public final String invoke() {
            return DexSignUtil.getConstructorSign(this.$constructor);
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.util.InstanceUtil$getFieldInstance$1, reason: case insensitive filesystem */
    public static final class C13021 extends AbstractC0308h implements InterfaceC0275a {
        final /* synthetic */ Field $field;

        public C13021(Field r1) {
            this.$field = r1;
            super(0);
        }

        @Override // p029P0.InterfaceC0275a
        public /* bridge */ /* synthetic */ Object invoke() {
            return invoke();
        }

        @Override // p029P0.InterfaceC0275a
        public final String invoke() {
            Class<?> r02 = this.$field.getType();
            AbstractC0307g.m702d(r02, "field.type");
            return DexSignUtil.getTypeSign(r02);
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.util.InstanceUtil$getMethodInstance$1, reason: case insensitive filesystem */
    public static final class C13031 extends AbstractC0308h implements InterfaceC0275a {
        final /* synthetic */ Method $method;

        public C13031(Method r1) {
            this.$method = r1;
            super(0);
        }

        @Override // p029P0.InterfaceC0275a
        public /* bridge */ /* synthetic */ Object invoke() {
            return invoke();
        }

        @Override // p029P0.InterfaceC0275a
        public final String invoke() {
            return DexSignUtil.getMethodSign(this.$method);
        }
    }

    static {
        INSTANCE = new InstanceUtil();
        constructorCache = new WeakCache();
        fieldsCache = new WeakCache();
        methodsCache = new WeakCache();
        signCache = new WeakCache();
    }

    private InstanceUtil() {
    }

    public final Class<?> getClassInstance(ClassLoader r2, DexClass r3) throws ClassNotFoundException {
        AbstractC0307g.m703e(r2, "classLoader");
        AbstractC0307g.m703e(r3, "dexClass");
        return getClassInstance(r2, r3.getTypeName());
    }

    public final Constructor<?> getConstructorInstance(ClassLoader r8, DexMethod r9) throws NoSuchMethodException {
        AbstractC0307g.m703e(r8, "classLoader");
        AbstractC0307g.m703e(r9, "dexMethod");
        if (r9.isConstructor() == false) goto L22;
        C0313m r02 = new C0313m();     // Catch: ClassNotFoundException -> L11
        r02.f595a = r8.loadClass(r9.getClassName());     // Catch: ClassNotFoundException -> L11
    L5:
        WeakCache<Class<?>, Constructor<?>[]> r82 = constructorCache;     // Catch: ClassNotFoundException -> L11
        Object r1 = r02.f595a;     // Catch: ClassNotFoundException -> L11
        AbstractC0307g.m702d(r1, "clz");     // Catch: ClassNotFoundException -> L11
        Constructor<?>[] r83 = r82.get((Class<?>) r1, new InstanceUtil$getConstructorInstance$declaredConstructors$1(r02));     // Catch: ClassNotFoundException -> L11
        int r12 = r83.length;     // Catch: ClassNotFoundException -> L11
        int r2 = 0;
    L6:
        if (r2 >= r12) goto L14;
        Constructor<?> r3 = r83[r2];     // Catch: ClassNotFoundException -> L11
        if (AbstractC0307g.m699a(r9.getMethodSign(), signCache.get(r3, new C10341(r3))) == true) goto L9;
        r2 = r2 + 1;     // Catch: ClassNotFoundException -> L11
        goto L6
    L9:
        r3.setAccessible(true);     // Catch: ClassNotFoundException -> L11
        return r3;
    L14:
        Class r84 = ((Class) r02.f595a).getSuperclass();     // Catch: ClassNotFoundException -> L11
        r02.f595a = r84;     // Catch: ClassNotFoundException -> L11
        if (r84 != null) goto L5;
        throw new NoSuchMethodException("Constructor " + r9 + " not found");     // Catch: ClassNotFoundException -> L11
    L11:
        e = move-exception;
        Throwable r85 = new NoSuchMethodException("No such method: " + r9).initCause(e);
        AbstractC0307g.m702d(r85, "NoSuchMethodException(\"N…$dexMethod\").initCause(e)");
        throw r85;
    L22:
        throw new IllegalArgumentException(r9 + " not a constructor");
    }

    public final Field getFieldInstance(ClassLoader r8, DexField r9) throws NoSuchFieldException {
        AbstractC0307g.m703e(r8, "classLoader");
        AbstractC0307g.m703e(r9, "dexField");
        C0313m r02 = new C0313m();     // Catch: ClassNotFoundException -> L12
        r02.f595a = r8.loadClass(r9.getClassName());     // Catch: ClassNotFoundException -> L12
    L4:
        WeakCache<Class<?>, Field[]> r82 = fieldsCache;     // Catch: ClassNotFoundException -> L12
        Object r1 = r02.f595a;     // Catch: ClassNotFoundException -> L12
        AbstractC0307g.m702d(r1, "clz");     // Catch: ClassNotFoundException -> L12
        Field[] r83 = r82.get((Class<?>) r1, new InstanceUtil$getFieldInstance$declaredFields$1(r02));     // Catch: ClassNotFoundException -> L12
        int r12 = r83.length;     // Catch: ClassNotFoundException -> L12
        int r2 = 0;
    L5:
        if (r2 >= r12) goto L15;
        Field r3 = r83[r2];     // Catch: ClassNotFoundException -> L12
        if (AbstractC0307g.m699a(r9.getName(), r3.getName()) == false) goto L14;
        if (AbstractC0307g.m699a(r9.getTypeSign(), signCache.get(r3, new C13021(r3))) == false) goto L14;
        r3.setAccessible(true);     // Catch: ClassNotFoundException -> L12
        return r3;
    L14:
        r2 = r2 + 1;     // Catch: ClassNotFoundException -> L12
        goto L5
    L15:
        Class r84 = ((Class) r02.f595a).getSuperclass();     // Catch: ClassNotFoundException -> L12
        r02.f595a = r84;     // Catch: ClassNotFoundException -> L12
        if (r84 != null) goto L4;
        throw new NoSuchFieldException("Field " + r9 + " not found");     // Catch: ClassNotFoundException -> L12
    L12:
        e = move-exception;
        Throwable r85 = new NoSuchFieldException("No such field: " + r9).initCause(e);
        AbstractC0307g.m702d(r85, "NoSuchFieldException(\"No… $dexField\").initCause(e)");
        throw r85;
    }

    public final Method getMethodInstance(ClassLoader r8, DexMethod r9) throws NoSuchMethodException {
        AbstractC0307g.m703e(r8, "classLoader");
        AbstractC0307g.m703e(r9, "dexMethod");
        if (r9.isMethod() == false) goto L24;
        C0313m r02 = new C0313m();     // Catch: ClassNotFoundException -> L13
        r02.f595a = r8.loadClass(r9.getClassName());     // Catch: ClassNotFoundException -> L13
    L5:
        WeakCache<Class<?>, Method[]> r82 = methodsCache;     // Catch: ClassNotFoundException -> L13
        Object r1 = r02.f595a;     // Catch: ClassNotFoundException -> L13
        AbstractC0307g.m702d(r1, "clz");     // Catch: ClassNotFoundException -> L13
        Method[] r83 = r82.get((Class<?>) r1, new InstanceUtil$getMethodInstance$declaredMethods$1(r02));     // Catch: ClassNotFoundException -> L13
        int r12 = r83.length;     // Catch: ClassNotFoundException -> L13
        int r2 = 0;
    L6:
        if (r2 >= r12) goto L16;
        Method r3 = r83[r2];     // Catch: ClassNotFoundException -> L13
        if (AbstractC0307g.m699a(r3.getName(), r9.getName()) == false) goto L15;
        if (AbstractC0307g.m699a(r9.getMethodSign(), signCache.get(r3, new C13031(r3))) == false) goto L15;
        r3.setAccessible(true);     // Catch: ClassNotFoundException -> L13
        return r3;
    L15:
        r2 = r2 + 1;     // Catch: ClassNotFoundException -> L13
        goto L6
    L16:
        Class r84 = ((Class) r02.f595a).getSuperclass();     // Catch: ClassNotFoundException -> L13
        r02.f595a = r84;     // Catch: ClassNotFoundException -> L13
        if (r84 != null) goto L5;
        throw new NoSuchMethodException("Method " + r9 + " not found");     // Catch: ClassNotFoundException -> L13
    L13:
        e = move-exception;
        Throwable r85 = new NoSuchMethodException("No such method: " + r9).initCause(e);
        AbstractC0307g.m702d(r85, "NoSuchMethodException(\"N…$dexMethod\").initCause(e)");
        throw r85;
    L24:
        throw new IllegalArgumentException(r9 + " not a method");
    }

    public final Class<?> getClassInstance(ClassLoader r3, String r4) throws ClassNotFoundException {
        AbstractC0307g.m703e(r3, "classLoader");
        AbstractC0307g.m703e(r4, "typeName");
        if (AbstractC0433r.m1028C0(r4, "[]") == false) goto L7;
        String r42 = r4.substring(0, r4.length() - 2);
        AbstractC0307g.m702d(r42, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return Array.newInstance(getClassInstance(r3, r42), 0).getClass();
    L7:
        switch(r4.hashCode()) {
            case -1325958191: goto L41;
            case 104431: goto L38;
            case 3039496: goto L34;
            case 3052374: goto L30;
            case 3327612: goto L26;
            case 3625364: goto L22;
            case 64711720: goto L18;
            case 97526364: goto L14;
            case 109413500: goto L10;
            default: goto L42;
        };
    L42:
        Class<?> r32 = r3.loadClass(r4);
    L44:
        AbstractC0307g.m700b(r32);
        return r32;
    L10:
        if (r4.equals("short") == false) goto L42;
        r32 = Short.TYPE;
        goto L44
    L14:
        if (r4.equals("float") == false) goto L42;
        r32 = Float.TYPE;
        goto L44
    L18:
        if (r4.equals("boolean") == false) goto L42;
    L20:
        r32 = Integer.TYPE;
        goto L44
    L22:
        if (r4.equals("void") == false) goto L42;
        r32 = Void.TYPE;
        goto L44
    L26:
        if (r4.equals("long") == false) goto L42;
        r32 = Long.TYPE;
        goto L44
    L30:
        if (r4.equals("char") == false) goto L42;
        r32 = Character.TYPE;
        goto L44
    L34:
        if (r4.equals("byte") == false) goto L42;
        r32 = Byte.TYPE;
        goto L44
    L38:
        if (r4.equals("int") == true) goto L20;
    L41:
        if (r4.equals("double") == false) goto L42;
        r32 = Double.TYPE;
        goto L44
    }
}
