package bsh;

import bsh.Invocable;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Array;
import java.lang.reflect.Executable;
import java.lang.reflect.Member;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
abstract class ExecutingInvocable extends Invocable {
    private final boolean isVarargs;
    private final int parameterCount;
    private final Class<?>[] parameterTypes;
    private final Class<?> varArgsType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: M extends java.lang.reflect.Executable & java.lang.reflect.Member */
    /* JADX WARN: Multi-variable type inference failed */
    public <M extends Executable & Member> ExecutingInvocable(M m10) {
        super(m10);
        this.parameterTypes = m10.getParameterTypes();
        int parameterCount = m10.getParameterCount();
        this.parameterCount = parameterCount;
        this.isVarargs = m10.isVarArgs();
        this.lastParameterIndex = parameterCount > 1 ? parameterCount - 1 : 0;
        this.varArgsType = isVarArgs() ? getParameterTypes()[this.lastParameterIndex] : Void.TYPE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.Invocable
    public Invocable.ParameterType collectParamaters(Object obj, Object[] objArr) {
        super.collectParamaters(obj, objArr);
        boolean z9 = false;
        z9 = false;
        z9 = false;
        if (isVarArgs()) {
            if (getLastParameterIndex() < objArr.length) {
                Object obj2 = objArr[getLastParameterIndex()];
                if (getParameterCount() == objArr.length && obj2 != null && obj2.getClass().isArray() && getVarArgsComponentType().isAssignableFrom(obj2.getClass().getComponentType())) {
                    this.parameters.add(obj2);
                } else if (getParameterCount() == objArr.length && obj2 != null && obj2.getClass().isArray() && Object[].class.isAssignableFrom(obj2.getClass())) {
                    Object[] objArr2 = (Object[]) obj2;
                    Object objNewInstance = Array.newInstance(getVarArgsComponentType(), objArr2.length);
                    for (int i9 = 0; i9 < objArr2.length; i9++) {
                        Array.set(objNewInstance, i9, super.coerceToType(objArr2[i9], getVarArgsComponentType()));
                    }
                    this.parameters.add(objNewInstance);
                } else {
                    int length = objArr.length - getLastParameterIndex();
                    Object objNewInstance2 = Array.newInstance(getVarArgsComponentType(), length);
                    for (int i10 = 0; i10 < length; i10++) {
                        Array.set(objNewInstance2, i10, super.coerceToType(objArr[getLastParameterIndex() + i10], getVarArgsComponentType()));
                    }
                    this.parameters.add(objNewInstance2);
                }
            } else {
                this.parameters.add(Array.newInstance(getVarArgsComponentType(), 0));
            }
            z9 = true;
        } else if (objArr != null && getLastParameterIndex() < objArr.length) {
            this.parameters.add(super.coerceToType(objArr[getLastParameterIndex()], getParameterTypes()[getLastParameterIndex()]));
        }
        return new Invocable.ParameterType(this.parameters, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.Invocable
    public int getParameterCount() {
        return this.parameterCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.Invocable
    public Class<?>[] getParameterTypes() {
        return this.parameterTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.Invocable
    public Class<?> getVarArgsComponentType() {
        return Types.arrayElementType(getVarArgsType());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.Invocable
    public Class<?> getVarArgsType() {
        return this.varArgsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.Invocable
    public boolean isVarArgs() {
        return this.isVarargs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.Invocable
    public MethodHandle lookup(MethodHandle methodHandle) {
        return (!isVarArgs() || methodHandle == null) ? methodHandle : methodHandle.asVarargsCollector(getVarArgsType());
    }
}
