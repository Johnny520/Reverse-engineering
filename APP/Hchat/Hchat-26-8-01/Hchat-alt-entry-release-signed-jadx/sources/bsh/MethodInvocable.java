package bsh;

import bsh.Invocable;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.util.regex.Pattern;
import p025bc.AbstractC0255e;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class MethodInvocable extends ExecutingInvocable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Pattern PROPERTY_PATTERN = Pattern.compile("(?:[gs]et|is)\\p{javaUpperCase}.*");
    private boolean getter;
    private Method method;
    private boolean setter;
    private final Class<?> type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MethodInvocable(Method method) {
        super(method);
        this.getter = false;
        this.setter = false;
        this.method = method;
        Class<?> returnType = method.getReturnType();
        this.type = returnType;
        this.lastParameterIndex = getParameterCount() - (isVarArgs() ? 1 : 0);
        if (PROPERTY_PATTERN.matcher(getName()).matches()) {
            boolean zStartsWith = getName().startsWith("set");
            this.setter = zStartsWith;
            Class<?> cls = Void.TYPE;
            this.getter = (zStartsWith || getParameterCount() != 0 || returnType == cls) ? false : true;
            this.setter &= getParameterCount() == 1 && returnType == cls;
            if (this.getter && getName().startsWith("is")) {
                this.getter = returnType == Boolean.class || returnType == Boolean.TYPE;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static MethodHandle getHandle(Method method) {
        String name = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        Class<?> declaringClass = method.getDeclaringClass();
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        Class<?> superclass = declaringClass;
        while (superclass != null) {
            if (method != null) {
                try {
                    return lookup.unreflect(method);
                } catch (IllegalAccessException unused) {
                }
            }
            for (Class<?> cls : superclass.getInterfaces()) {
                try {
                    return lookup.unreflect(cls.getDeclaredMethod(name, parameterTypes));
                } catch (IllegalAccessException | NoSuchMethodException | SecurityException unused2) {
                }
            }
            superclass = superclass.getSuperclass();
            if (superclass != null) {
                try {
                    method = superclass.getDeclaredMethod(name, parameterTypes);
                } catch (NoSuchMethodException | SecurityException unused3) {
                    method = null;
                }
            }
        }
        StringBuilder sbM1026o = AbstractC0255e.m1026o("MethodHandle lookup failed to find a ", name, " in ");
        sbM1026o.append(declaringClass.getName());
        throw new RuntimeException(sbM1026o.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.ExecutingInvocable, bsh.Invocable
    public Invocable.ParameterType collectParamaters(Object obj, Object[] objArr) {
        Invocable.ParameterType parameterTypeCollectParamaters = super.collectParamaters(obj, objArr);
        if (!isStatic()) {
            this.parameters.add(0, obj);
        }
        return new Invocable.ParameterType(this.parameters, parameterTypeCollectParamaters.isFixedArity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.Invocable
    public Class<?> getReturnType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.Invocable
    public boolean isGetter() {
        return this.getter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.Invocable
    public boolean isSetter() {
        return this.setter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.ExecutingInvocable, bsh.Invocable
    public MethodHandle lookup(MethodHandle methodHandle) {
        try {
            try {
                return super.lookup(getHandle(this.method));
            } catch (Exception e6) {
                throw new RuntimeException(e6);
            }
        } finally {
            this.method = null;
        }
    }
}
