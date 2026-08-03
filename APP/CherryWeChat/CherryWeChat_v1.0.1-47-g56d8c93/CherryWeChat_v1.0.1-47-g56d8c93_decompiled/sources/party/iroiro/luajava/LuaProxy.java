package party.iroiro.luajava;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
import party.iroiro.luajava.Lua;
import party.iroiro.luajava.LuaException;
import party.iroiro.luajava.cleaner.LuaReferable;
import party.iroiro.luajava.util.ClassUtils;

/* JADX INFO: loaded from: classes.dex */
public final class LuaProxy implements InvocationHandler, LuaReferable {

    /* JADX INFO: renamed from: L */
    final AbstractLua f8318L;
    private final Lua.Conversion degree;
    private final Class<?>[] interfaces;
    final int ref;

    public LuaProxy(int i, AbstractLua abstractLua, Lua.Conversion conversion, Class<?>[] clsArr) {
        this.ref = i;
        this.f8318L = abstractLua;
        this.degree = conversion;
        this.interfaces = clsArr;
    }

    private Object callDefaultMethod(Object obj, Method method, Object[] objArr) {
        return ClassUtils.isDefault(method) ? this.f8318L.invokeSpecial(obj, method, objArr) : callObjectDefault(obj, method, objArr);
    }

    private Object callObjectDefault(Object obj, Method method, Object[] objArr) {
        if (methodEquals(method, Integer.TYPE, "hashCode", new Class[0])) {
            return Integer.valueOf(hashCode());
        }
        if (methodEquals(method, Boolean.TYPE, "equals", Object.class)) {
            Objects.requireNonNull(objArr);
            return Boolean.valueOf(obj == objArr[0]);
        }
        if (!methodEquals(method, String.class, "toString", new Class[0])) {
            throw new LuaException(LuaException.LuaError.JAVA, "method not implemented: " + method);
        }
        return "LuaProxy" + Arrays.toString(this.interfaces) + "@" + Integer.toHexString(hashCode());
    }

    public static boolean methodEquals(Method method, Class<?> cls, String str, Class<?>... clsArr) {
        return method.getReturnType() == cls && str.equals(method.getName()) && Arrays.equals(method.getParameterTypes(), clsArr);
    }

    private Object syncFreeInvoke(Object obj, Method method, Object[] objArr) {
        if (this.f8318L.mainThread.isClosed()) {
            throw new LuaException(LuaException.LuaError.JAVA, "lua state closed");
        }
        int top = this.f8318L.getTop();
        this.f8318L.refGet(this.ref);
        this.f8318L.getField(-1, method.getName());
        if (this.f8318L.isNil(-1)) {
            this.f8318L.setTop(top);
            return callDefaultMethod(obj, method, objArr);
        }
        this.f8318L.pushJavaObject(obj);
        Class<?> returnType = method.getReturnType();
        Class<?> cls = Void.TYPE;
        int i = returnType == cls ? 0 : 1;
        if (objArr == null) {
            this.f8318L.pCall(1, i);
        } else {
            for (Object obj2 : objArr) {
                this.f8318L.push(obj2, this.degree);
            }
            this.f8318L.pCall(objArr.length + 1, i);
        }
        try {
            if (method.getReturnType() == cls) {
                this.f8318L.setTop(top);
                return null;
            }
            Object objConvertFromLua = JuaAPI.convertFromLua(this.f8318L, method.getReturnType(), -1);
            this.f8318L.setTop(top);
            return objConvertFromLua;
        } catch (IllegalArgumentException e) {
            this.f8318L.setTop(top);
            throw e;
        }
    }

    @Override // party.iroiro.luajava.cleaner.LuaReferable
    public int getReference() {
        return this.ref;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        Object objSyncFreeInvoke;
        if (!this.f8318L.shouldSynchronize()) {
            return syncFreeInvoke(obj, method, objArr);
        }
        synchronized (this.f8318L.getMainState()) {
            objSyncFreeInvoke = syncFreeInvoke(obj, method, objArr);
        }
        return objSyncFreeInvoke;
    }
}
