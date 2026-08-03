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
    public static final InstanceUtil INSTANCE = new InstanceUtil();
    private static final WeakCache<Class<?>, Constructor<?>[]> constructorCache = new WeakCache<>();
    private static final WeakCache<Class<?>, Field[]> fieldsCache = new WeakCache<>();
    private static final WeakCache<Class<?>, Method[]> methodsCache = new WeakCache<>();
    private static final WeakCache<Object, String> signCache = new WeakCache<>();

    /* JADX INFO: renamed from: org.luckypray.dexkit.util.InstanceUtil$getConstructorInstance$1 */
    public static final class C10321 extends AbstractC0308h implements InterfaceC0275a {
        final /* synthetic */ Constructor<?> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10321(Constructor<?> constructor) {
            super(0);
            this.$constructor = constructor;
        }

        @Override // p029P0.InterfaceC0275a
        public final String invoke() {
            return DexSignUtil.getConstructorSign(this.$constructor);
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.util.InstanceUtil$getFieldInstance$1 */
    public static final class C10331 extends AbstractC0308h implements InterfaceC0275a {
        final /* synthetic */ Field $field;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10331(Field field) {
            super(0);
            this.$field = field;
        }

        @Override // p029P0.InterfaceC0275a
        public final String invoke() {
            Class<?> type = this.$field.getType();
            AbstractC0307g.m702d(type, "field.type");
            return DexSignUtil.getTypeSign(type);
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.util.InstanceUtil$getMethodInstance$1 */
    public static final class C10341 extends AbstractC0308h implements InterfaceC0275a {
        final /* synthetic */ Method $method;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10341(Method method) {
            super(0);
            this.$method = method;
        }

        @Override // p029P0.InterfaceC0275a
        public final String invoke() {
            return DexSignUtil.getMethodSign(this.$method);
        }
    }

    private InstanceUtil() {
    }

    public final Class<?> getClassInstance(ClassLoader classLoader, DexClass dexClass) throws ClassNotFoundException {
        AbstractC0307g.m703e(classLoader, "classLoader");
        AbstractC0307g.m703e(dexClass, "dexClass");
        return getClassInstance(classLoader, dexClass.getTypeName());
    }

    public final Constructor<?> getConstructorInstance(ClassLoader classLoader, DexMethod dexMethod) throws Throwable {
        Class superclass;
        AbstractC0307g.m703e(classLoader, "classLoader");
        AbstractC0307g.m703e(dexMethod, "dexMethod");
        if (!dexMethod.isConstructor()) {
            throw new IllegalArgumentException(dexMethod + " not a constructor");
        }
        try {
            C0313m c0313m = new C0313m();
            c0313m.f595a = classLoader.loadClass(dexMethod.getClassName());
            do {
                WeakCache<Class<?>, Constructor<?>[]> weakCache = constructorCache;
                Object obj = c0313m.f595a;
                AbstractC0307g.m702d(obj, "clz");
                for (Constructor<?> constructor : weakCache.get((Class<?>) obj, new InstanceUtil$getConstructorInstance$declaredConstructors$1(c0313m))) {
                    if (AbstractC0307g.m699a(dexMethod.getMethodSign(), signCache.get(constructor, new C10321(constructor)))) {
                        constructor.setAccessible(true);
                        return constructor;
                    }
                }
                superclass = ((Class) c0313m.f595a).getSuperclass();
                c0313m.f595a = superclass;
            } while (superclass != null);
            throw new NoSuchMethodException("Constructor " + dexMethod + " not found");
        } catch (ClassNotFoundException e2) {
            Throwable thInitCause = new NoSuchMethodException("No such method: " + dexMethod).initCause(e2);
            AbstractC0307g.m702d(thInitCause, "NoSuchMethodException(\"N…$dexMethod\").initCause(e)");
            throw thInitCause;
        }
    }

    public final Field getFieldInstance(ClassLoader classLoader, DexField dexField) throws Throwable {
        Class superclass;
        AbstractC0307g.m703e(classLoader, "classLoader");
        AbstractC0307g.m703e(dexField, "dexField");
        try {
            C0313m c0313m = new C0313m();
            c0313m.f595a = classLoader.loadClass(dexField.getClassName());
            do {
                WeakCache<Class<?>, Field[]> weakCache = fieldsCache;
                Object obj = c0313m.f595a;
                AbstractC0307g.m702d(obj, "clz");
                for (Field field : weakCache.get((Class<?>) obj, new InstanceUtil$getFieldInstance$declaredFields$1(c0313m))) {
                    if (AbstractC0307g.m699a(dexField.getName(), field.getName()) && AbstractC0307g.m699a(dexField.getTypeSign(), signCache.get(field, new C10331(field)))) {
                        field.setAccessible(true);
                        return field;
                    }
                }
                superclass = ((Class) c0313m.f595a).getSuperclass();
                c0313m.f595a = superclass;
            } while (superclass != null);
            throw new NoSuchFieldException("Field " + dexField + " not found");
        } catch (ClassNotFoundException e2) {
            Throwable thInitCause = new NoSuchFieldException("No such field: " + dexField).initCause(e2);
            AbstractC0307g.m702d(thInitCause, "NoSuchFieldException(\"No… $dexField\").initCause(e)");
            throw thInitCause;
        }
    }

    public final Method getMethodInstance(ClassLoader classLoader, DexMethod dexMethod) throws Throwable {
        Class superclass;
        AbstractC0307g.m703e(classLoader, "classLoader");
        AbstractC0307g.m703e(dexMethod, "dexMethod");
        if (!dexMethod.isMethod()) {
            throw new IllegalArgumentException(dexMethod + " not a method");
        }
        try {
            C0313m c0313m = new C0313m();
            c0313m.f595a = classLoader.loadClass(dexMethod.getClassName());
            do {
                WeakCache<Class<?>, Method[]> weakCache = methodsCache;
                Object obj = c0313m.f595a;
                AbstractC0307g.m702d(obj, "clz");
                for (Method method : weakCache.get((Class<?>) obj, new InstanceUtil$getMethodInstance$declaredMethods$1(c0313m))) {
                    if (AbstractC0307g.m699a(method.getName(), dexMethod.getName()) && AbstractC0307g.m699a(dexMethod.getMethodSign(), signCache.get(method, new C10341(method)))) {
                        method.setAccessible(true);
                        return method;
                    }
                }
                superclass = ((Class) c0313m.f595a).getSuperclass();
                c0313m.f595a = superclass;
            } while (superclass != null);
            throw new NoSuchMethodException("Method " + dexMethod + " not found");
        } catch (ClassNotFoundException e2) {
            Throwable thInitCause = new NoSuchMethodException("No such method: " + dexMethod).initCause(e2);
            AbstractC0307g.m702d(thInitCause, "NoSuchMethodException(\"N…$dexMethod\").initCause(e)");
            throw thInitCause;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Class<?> getClassInstance(ClassLoader classLoader, String str) throws ClassNotFoundException {
        Class<?> clsLoadClass;
        AbstractC0307g.m703e(classLoader, "classLoader");
        AbstractC0307g.m703e(str, "typeName");
        if (AbstractC0433r.m1028C0(str, "[]")) {
            String strSubstring = str.substring(0, str.length() - 2);
            AbstractC0307g.m702d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return Array.newInstance(getClassInstance(classLoader, strSubstring), 0).getClass();
        }
        switch (str.hashCode()) {
            case -1325958191:
                clsLoadClass = !str.equals("double") ? classLoader.loadClass(str) : Double.TYPE;
                break;
            case 104431:
                if (str.equals("int")) {
                    clsLoadClass = Integer.TYPE;
                    break;
                }
                break;
            case 3039496:
                if (str.equals("byte")) {
                    clsLoadClass = Byte.TYPE;
                    break;
                }
                break;
            case 3052374:
                if (str.equals("char")) {
                    clsLoadClass = Character.TYPE;
                    break;
                }
                break;
            case 3327612:
                if (str.equals("long")) {
                    clsLoadClass = Long.TYPE;
                    break;
                }
                break;
            case 3625364:
                if (str.equals("void")) {
                    clsLoadClass = Void.TYPE;
                    break;
                }
                break;
            case 64711720:
                if (!str.equals("boolean")) {
                }
                break;
            case 97526364:
                if (str.equals("float")) {
                    clsLoadClass = Float.TYPE;
                    break;
                }
                break;
            case 109413500:
                if (str.equals("short")) {
                    clsLoadClass = Short.TYPE;
                    break;
                }
                break;
        }
        AbstractC0307g.m700b(clsLoadClass);
        return clsLoadClass;
    }
}
