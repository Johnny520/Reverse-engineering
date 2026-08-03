package bsh;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class FieldAccess extends Invocable {
    private Field field;
    private boolean getter;
    private MethodHandle setter;
    private final Class<?> type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldAccess(Field field) {
        super(field);
        this.getter = false;
        this.type = field.getType();
        this.field = field;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.Invocable
    public int getParameterCount() {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.Invocable
    public Class<?>[] getParameterTypes() {
        return new Class[]{this.type};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.Invocable
    public Class<?> getReturnType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MethodHandle getSetterHandle() {
        if (this.setter == null) {
            this.setter = lookup();
        }
        return this.setter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // bsh.Invocable
    public synchronized Object invoke(Object obj, Object... objArr) {
        try {
            if (objArr.length == 0) {
                if (isStatic()) {
                    return Primitive.wrap((Object) getMethodHandle().invoke(), getReturnType());
                }
                return Primitive.wrap((Object) getMethodHandle().invoke(obj), getReturnType());
            }
            if (isStatic()) {
                return (Object) getSetterHandle().invoke(super.coerceToType(objArr[0], getParameterTypes()[0]));
            }
            return (Object) getSetterHandle().invoke(obj, super.coerceToType(objArr[0], getParameterTypes()[0]));
        } catch (Throwable th2) {
            throw new InvocationTargetException(th2.getCause());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.Invocable
    public MethodHandle lookup(MethodHandle methodHandle) {
        try {
            try {
                return MethodHandles.lookup().unreflectGetter(this.field);
            } catch (Exception e6) {
                throw new RuntimeException(e6);
            }
        } finally {
            this.getter = true;
            if (this.setter != null) {
                this.field = null;
            }
        }
    }

    public MethodHandle lookup() {
        try {
            try {
                return MethodHandles.lookup().unreflectSetter(this.field);
            } catch (Exception e6) {
                throw new RuntimeException(e6);
            }
        } finally {
            if (this.getter) {
                this.field = null;
            }
        }
    }
}
