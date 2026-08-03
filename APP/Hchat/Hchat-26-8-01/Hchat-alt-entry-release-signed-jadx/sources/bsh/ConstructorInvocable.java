package bsh;

import bsh.Invocable;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.util.stream.Stream;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ConstructorInvocable extends ExecutingInvocable {
    private Constructor<?> constructor;
    private final boolean isStatic;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ConstructorInvocable(Constructor<?> constructor) {
        super(constructor);
        this.constructor = constructor;
        this.isStatic = Reflect.isStatic(getDeclaringClass());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.ExecutingInvocable, bsh.Invocable
    public Invocable.ParameterType collectParamaters(Object obj, Object[] objArr) {
        if (isInnerClass() && !isStatic()) {
            objArr = Stream.concat(Stream.of(obj), Stream.of(objArr)).toArray();
        }
        return super.collectParamaters(obj, objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.Invocable
    public Class<?> getReturnType() {
        return getDeclaringClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.Invocable
    public boolean isInnerClass() {
        return getDeclaringClass().isMemberClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.Invocable
    public boolean isStatic() {
        return this.isStatic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.ExecutingInvocable, bsh.Invocable
    public MethodHandle lookup(MethodHandle methodHandle) {
        try {
            try {
                return super.lookup(MethodHandles.lookup().unreflectConstructor(this.constructor));
            } catch (Exception e6) {
                throw new RuntimeException(e6);
            }
        } finally {
            this.constructor = null;
        }
    }
}
