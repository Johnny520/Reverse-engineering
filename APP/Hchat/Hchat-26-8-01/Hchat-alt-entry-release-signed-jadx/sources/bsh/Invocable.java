package bsh;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Invocable implements Member {
    private final Class<?> declaringClass;
    private final int flags;
    private final boolean isStatic;
    private final boolean isSynthetic;
    private final String name;
    private final String toString;
    private MethodHandle handle = null;
    protected final List<Object> parameters = new ArrayList();
    protected int lastParameterIndex = 0;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class ParameterType {
        boolean isFixedArity;
        List<Object> params;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ParameterType(List<Object> list, boolean z9) {
            this.params = list;
            this.isFixedArity = z9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public <M extends AccessibleObject & Member> Invocable(M m10) {
        M m11 = m10;
        this.flags = m11.getModifiers();
        this.declaringClass = m11.getDeclaringClass();
        this.name = m11.getName();
        this.toString = m10.toString();
        M m12 = m10;
        this.isStatic = Reflect.isStatic(m12);
        this.isSynthetic = m12.isSynthetic();
        if (!Capabilities.haveAccessibility() || m12.getDeclaringClass() == Class.class) {
            return;
        }
        try {
            m10.setAccessible(true);
        } catch (SecurityException unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Invocable get(Method method) {
        return new MethodInvocable(method);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private synchronized Object invokeTarget(Object obj, Object[] objArr) {
        try {
            Reflect.logInvokeMethod("Invoking method (entry): ", this, objArr);
            ParameterType parameterTypeCollectParamaters = collectParamaters(obj, objArr);
            List<?> list = parameterTypeCollectParamaters.params;
            Reflect.logInvokeMethod("Invoking method (after): ", this, list);
            if (getParameterCount() > 0) {
                MethodHandle methodHandle = getMethodHandle();
                if (parameterTypeCollectParamaters.isFixedArity) {
                    methodHandle = methodHandle.asFixedArity();
                }
                return methodHandle.invokeWithArguments(list);
            }
            if (!isStatic() && !(this instanceof ConstructorInvocable)) {
                return (Object) getMethodHandle().invoke(list.get(0));
            }
            return (Object) getMethodHandle().invoke();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] lambda$getParamTypeDescriptors$0(int i9) {
        return new String[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$hashCode$1(Class cls) {
        return Integer.valueOf(cls == null ? 39 : cls.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$hashCode$2(Integer num, Integer num2) {
        return Integer.valueOf(num.intValue() ^ num2.intValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object coerceToType(Object obj, Class<?> cls) {
        Class<?> type = Types.getType(obj);
        if (type == null || !cls.isAssignableFrom(type)) {
            obj = Types.castObject(obj, cls, 0);
        }
        return Primitive.unwrap(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ParameterType collectParamaters(Object obj, Object[] objArr) throws InvocationTargetException {
        if (getLastParameterIndex() > objArr.length) {
            throw new InvocationTargetException(null, "Insufficient parameters passed for method: " + getName() + Arrays.asList(getParameterTypes()));
        }
        this.parameters.clear();
        int i9 = 0;
        while (true) {
            int lastParameterIndex = getLastParameterIndex();
            List<Object> list = this.parameters;
            if (i9 >= lastParameterIndex) {
                return new ParameterType(list, false);
            }
            list.add(coerceToType(objArr[i9], getParameterTypes()[i9]));
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Invocable invocable = (Invocable) obj;
        if (!getName().equals(invocable.getName()) || getDeclaringClass() != invocable.getDeclaringClass() || getParameterCount() != invocable.getParameterCount() || getReturnType() != invocable.getReturnType() || getModifiers() != invocable.getModifiers()) {
            return false;
        }
        for (int i9 = 0; i9 < getParameterCount(); i9++) {
            if (getParameterTypes()[i9] != invocable.getParameterTypes()[i9]) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.Member
    public Class<?> getDeclaringClass() {
        return this.declaringClass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getLastParameterIndex() {
        return this.lastParameterIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getMethodDescriptor() {
        return methodType().toMethodDescriptorString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MethodHandle getMethodHandle() {
        if (this.handle == null) {
            this.handle = lookup(null);
        }
        return this.handle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.Member
    public int getModifiers() {
        return this.flags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.Member
    public String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String[] getParamTypeDescriptors() {
        return (String[]) methodType().parameterList().stream().map(new C0342b(1)).toArray(new C0348e(3));
    }

    public abstract int getParameterCount();

    public abstract Class<?>[] getParameterTypes();

    public abstract Class<?> getReturnType();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getReturnTypeDescriptor() {
        return BSHType.getTypeDescriptor(getReturnType());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class<?> getVarArgsComponentType() {
        return Void.TYPE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class<?> getVarArgsType() {
        return Void.TYPE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return (((((getClass().hashCode() ^ getName().hashCode()) ^ getDeclaringClass().hashCode()) ^ getParameterCount()) ^ getReturnType().hashCode()) ^ getModifiers()) ^ ((Integer) Stream.of((Object[]) getParameterTypes()).map(new C0342b(11)).reduce(75, new C0352i())).intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized Object invoke(Object obj, Object... objArr) {
        InvocationTargetException invocationTargetException;
        if (objArr == null) {
            objArr = Reflect.ZERO_ARGS;
            try {
            } finally {
            }
        }
        return Primitive.wrap(invokeTarget(obj, objArr), getReturnType());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isGetter() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isInnerClass() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isSetter() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isStatic() {
        return this.isStatic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.reflect.Member
    public boolean isSynthetic() {
        return this.isSynthetic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isVarArgs() {
        return false;
    }

    public abstract MethodHandle lookup(MethodHandle methodHandle);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MethodType methodType() {
        return MethodType.methodType(getReturnType(), getParameterTypes());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return this.toString;
    }

    public static Invocable get(Constructor<?> constructor) {
        return new ConstructorInvocable(constructor);
    }

    public static FieldAccess get(Field field) {
        return new FieldAccess(field);
    }
}
