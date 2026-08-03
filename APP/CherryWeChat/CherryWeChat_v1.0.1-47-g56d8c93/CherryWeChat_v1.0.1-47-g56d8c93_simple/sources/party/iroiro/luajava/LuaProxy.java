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

    public LuaProxy(int r1, AbstractLua r2, Lua.Conversion r3, Class<?>[] r4) {
        this.ref = r1;
        this.f8318L = r2;
        this.degree = r3;
        this.interfaces = r4;
    }

    private Object callDefaultMethod(Object r2, Method r3, Object[] r4) {
        if (ClassUtils.isDefault(r3) == false) goto L7;
        return this.f8318L.invokeSpecial(r2, r3, r4);
    L7:
        return callObjectDefault(r2, r3, r4);
    }

    private Object callObjectDefault(Object r5, Method r6, Object[] r7) {
        boolean r0 = false;
        if (methodEquals(r6, Integer.TYPE, "hashCode", new Class[0]) == false) goto L7;
        return Integer.valueOf(hashCode());
    L7:
        if (methodEquals(r6, Boolean.TYPE, "equals", new Class[]{Object.class}) == false) goto L14;
        Objects.requireNonNull(r7);
        if (r5 != r7[0]) goto L12;
        r0 = true;
    L12:
        return Boolean.valueOf(r0);
    L14:
        if (methodEquals(r6, String.class, "toString", new Class[0]) == false) goto L18;
        return "LuaProxy" + Arrays.toString(this.interfaces) + "@" + Integer.toHexString(hashCode());
    L18:
        throw new LuaException(LuaException.LuaError.JAVA, "method not implemented: " + r6);
    }

    public static boolean methodEquals(Method r1, Class<?> r2, String r3, Class<?>... r4) {
        if (r1.getReturnType() == r2) goto L5;
        return false;
    L5:
        if (r3.equals(r1.getName()) == true) goto L7;
        return false;
    L7:
        if (Arrays.equals(r1.getParameterTypes(), r4) == false) goto L13;
        return true;
    L13:
        return false;
    }

    private Object syncFreeInvoke(Object r10, Method r11, Object[] r12) {
        if (this.f8318L.mainThread.isClosed() == true) goto L29;
        int r0 = this.f8318L.getTop();
        this.f8318L.refGet(this.ref);
        this.f8318L.getField(-1, r11.getName());
        if (this.f8318L.isNil(-1) == false) goto L8;
        this.f8318L.setTop(r0);
        return callDefaultMethod(r10, r11, r12);
    L8:
        this.f8318L.pushJavaObject(r10);
        Class<?> r102 = r11.getReturnType();
        int r1 = 0;
        Class<?> r2 = Void.TYPE;
        if (r102 != r2) goto L11;
        int r103 = 0;
    L12:
        if (r12 != null) goto L14;
        this.f8318L.pCall(1, r103);
    L30:
    L22:
        e = move-exception;
        this.f8318L.setTop(r0);
        throw e;
    L19:
        if (r11.getReturnType() != r2) goto L24;
        this.f8318L.setTop(r0);     // Catch: IllegalArgumentException -> L22
        return null;
    L24:
        Object r104 = JuaAPI.convertFromLua(this.f8318L, r11.getReturnType(), -1);     // Catch: IllegalArgumentException -> L22
        this.f8318L.setTop(r0);     // Catch: IllegalArgumentException -> L22
        return r104;
    L14:
        int r5 = r12.length;
    L15:
        if (r1 >= r5) goto L17;
        this.f8318L.push(r12[r1], this.degree);
        r1 = r1 + 1;
        goto L15
    L17:
        this.f8318L.pCall(r12.length + 1, r103);
        goto L30
    L11:
        r103 = 1;
        goto L12
    L29:
        throw new LuaException(LuaException.LuaError.JAVA, "lua state closed");
    }

    @Override // party.iroiro.luajava.cleaner.LuaReferable
    public int getReference() {
        return this.ref;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object r2, Method r3, Object[] r4) {
        if (this.f8318L.shouldSynchronize() == false) goto L13;
        AbstractLua r0 = this.f8318L.getMainState();
        monitor-enter(r0);
        Object r22 = syncFreeInvoke(r2, r3, r4);     // Catch: Throwable -> L9
        monitor-exit(r0);     // Catch: Throwable -> L9
        return r22;
    L9:
        th = move-exception;
        throw th;
    L13:
        return syncFreeInvoke(r2, r3, r4);
    }
}
