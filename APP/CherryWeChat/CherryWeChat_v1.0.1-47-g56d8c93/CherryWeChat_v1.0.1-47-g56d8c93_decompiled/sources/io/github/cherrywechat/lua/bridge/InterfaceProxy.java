package io.github.cherrywechat.lua.bridge;

import android.os.Handler;
import android.os.Looper;
import io.github.cherrywechat.lua.LuaLocks;
import io.github.cherrywechat.lua.bridge.InterfaceProxy;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import p000.AbstractC0213Ey;
import p000.AbstractC0295Gu;
import p000.AbstractC0585Nj;
import p000.AbstractC2374ph;
import p000.InterfaceC0884Ui;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public final class InterfaceProxy {
    private static final String TAG = AbstractC0295Gu.m625r(-350422086711349L);
    public static final InterfaceProxy INSTANCE = new InterfaceProxy();
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());

    public static final class LuaInvocationHandler implements InvocationHandler {
        private final Class<?> interfaceClass;
        private final Lua lua;
        private final int tableRef;

        public LuaInvocationHandler(Lua lua, Class<?> cls, int i) {
            AbstractC0295Gu.m625r(-335187837712437L);
            AbstractC0295Gu.m625r(-335205017581621L);
            this.lua = lua;
            this.interfaceClass = cls;
            lua.pushValue(i);
            this.tableRef = lua.ref();
        }

        private final Object convertReturnValue(Object obj, Class<?> cls) {
            if (obj == null) {
                return getDefaultValue(cls);
            }
            if (!cls.isInstance(obj)) {
                boolean z = obj instanceof Number;
                Class cls2 = Boolean.TYPE;
                if (z) {
                    if (cls.equals(Integer.TYPE) || cls.equals(Integer.class)) {
                        return Integer.valueOf(((Number) obj).intValue());
                    }
                    if (cls.equals(Long.TYPE) || cls.equals(Long.class)) {
                        return Long.valueOf(((Number) obj).longValue());
                    }
                    if (cls.equals(Float.TYPE) || cls.equals(Float.class)) {
                        return Float.valueOf(((Number) obj).floatValue());
                    }
                    if (cls.equals(Double.TYPE) || cls.equals(Double.class)) {
                        return Double.valueOf(((Number) obj).doubleValue());
                    }
                    if (cls.equals(Short.TYPE) || cls.equals(Short.class)) {
                        return Short.valueOf(((Number) obj).shortValue());
                    }
                    if (cls.equals(Byte.TYPE) || cls.equals(Byte.class)) {
                        return Byte.valueOf(((Number) obj).byteValue());
                    }
                    if (cls.equals(cls2) || cls.equals(Boolean.class)) {
                        return Boolean.valueOf(((Number) obj).intValue() != 0);
                    }
                    return (Serializable) obj;
                }
                if (cls.equals(cls2) || cls.equals(Boolean.class)) {
                    if (obj instanceof Boolean) {
                        zBooleanValue = ((Boolean) obj).booleanValue();
                    } else if (!z ? !(obj instanceof String) || (((CharSequence) obj).length() > 0 && !obj.equals(AbstractC0295Gu.m625r(-351246720432181L))) : ((Number) obj).intValue() != 0) {
                        zBooleanValue = true;
                    }
                    return Boolean.valueOf(zBooleanValue);
                }
            }
            return obj;
        }

        private final Object getDefaultValue(Class<?> cls) {
            if (AbstractC0585Nj.m1134a(cls, Boolean.TYPE) || AbstractC0585Nj.m1134a(cls, Boolean.class)) {
                return Boolean.FALSE;
            }
            if (AbstractC0585Nj.m1134a(cls, Byte.TYPE) || AbstractC0585Nj.m1134a(cls, Byte.class)) {
                return (byte) 0;
            }
            if (AbstractC0585Nj.m1134a(cls, Short.TYPE) || AbstractC0585Nj.m1134a(cls, Short.class)) {
                return (short) 0;
            }
            if (AbstractC0585Nj.m1134a(cls, Integer.TYPE) || AbstractC0585Nj.m1134a(cls, Integer.class)) {
                return 0;
            }
            if (AbstractC0585Nj.m1134a(cls, Long.TYPE) || AbstractC0585Nj.m1134a(cls, Long.class)) {
                return 0L;
            }
            if (AbstractC0585Nj.m1134a(cls, Float.TYPE) || AbstractC0585Nj.m1134a(cls, Float.class)) {
                return Float.valueOf(0.0f);
            }
            if (AbstractC0585Nj.m1134a(cls, Double.TYPE) || AbstractC0585Nj.m1134a(cls, Double.class)) {
                return Double.valueOf(0.0d);
            }
            if (AbstractC0585Nj.m1134a(cls, Character.TYPE) || AbstractC0585Nj.m1134a(cls, Character.class)) {
                return (char) 0;
            }
            AbstractC0585Nj.m1134a(cls, Void.TYPE);
            return null;
        }

        private final Object handleCallResult(boolean z, Class<?> cls) {
            if (!z) {
                return getDefaultValue(cls);
            }
            Object object = this.lua.toObject(-1);
            this.lua.pop(1);
            return convertReturnValue(object, cls);
        }

        private final Object invokeLuaMethod(final String str, final Object[] objArr, final Class<?> cls) {
            return LuaLocks.INSTANCE.withLock(this.lua, new InterfaceC0884Ui() { // from class: io.github.cherrywechat.lua.bridge.a
                @Override // p000.InterfaceC0884Ui
                /* JADX INFO: renamed from: a */
                public final Object mo6a() {
                    return InterfaceProxy.LuaInvocationHandler.invokeLuaMethod$lambda$2(this.f5554a, objArr, cls, str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object invokeLuaMethod$lambda$2(LuaInvocationHandler luaInvocationHandler, Object[] objArr, Class cls, String str) {
            luaInvocationHandler.lua.refGet(luaInvocationHandler.tableRef);
            if (luaInvocationHandler.lua.isFunction(-1)) {
                for (Object obj : objArr) {
                    luaInvocationHandler.lua.push(obj, Lua.Conversion.SEMI);
                }
                try {
                    luaInvocationHandler.lua.pCall(objArr.length, 1);
                    return luaInvocationHandler.handleCallResult(true, cls);
                } catch (Exception e) {
                    AbstractC0213Ey.m411i(-351272490235957L, -350787158931509L, e);
                    return luaInvocationHandler.getDefaultValue(cls);
                }
            }
            luaInvocationHandler.lua.getField(-1, str);
            if (!luaInvocationHandler.lua.isFunction(-1)) {
                luaInvocationHandler.lua.pop(2);
                AbstractC0295Gu.m625r(-350860173375541L);
                AbstractC0295Gu.m625r(-350924597884981L);
                AbstractC0295Gu.m625r(-350963252590645L);
                return luaInvocationHandler.getDefaultValue(cls);
            }
            for (Object obj2 : objArr) {
                luaInvocationHandler.lua.push(obj2, Lua.Conversion.SEMI);
            }
            try {
                luaInvocationHandler.lua.pCall(objArr.length, 1);
                luaInvocationHandler.lua.remove(-2);
                return luaInvocationHandler.handleCallResult(true, cls);
            } catch (Exception e2) {
                luaInvocationHandler.lua.setTop(0);
                AbstractC0213Ey.m411i(-351620382586933L, -351684807096373L, e2);
                return luaInvocationHandler.getDefaultValue(cls);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            AbstractC0295Gu.m625r(-335269442091061L);
            String name = method.getName();
            if (name != null) {
                int iHashCode = name.hashCode();
                if (iHashCode != -1776922004) {
                    if (iHashCode != -1295482945) {
                        if (iHashCode == 147696667 && name.equals(AbstractC0295Gu.m625r(-335299506862133L))) {
                            return Integer.valueOf(System.identityHashCode(obj));
                        }
                    } else if (name.equals(AbstractC0295Gu.m625r(-335338161567797L))) {
                        Object obj2 = null;
                        if (objArr != null && objArr.length != 0) {
                            obj2 = objArr[0];
                        }
                        return Boolean.valueOf(obj == obj2);
                    }
                } else if (name.equals(AbstractC0295Gu.m625r(-334818470524981L))) {
                    return AbstractC0295Gu.m625r(-334857125230645L) + this.interfaceClass.getSimpleName() + '>';
                }
            }
            try {
                String name2 = method.getName();
                AbstractC0295Gu.m625r(-334900074903605L);
                if (objArr == null) {
                    objArr = new Object[0];
                }
                Class<?> returnType = method.getReturnType();
                AbstractC0295Gu.m625r(-334955909478453L);
                return invokeLuaMethod(name2, objArr, returnType);
            } catch (Exception unused) {
                AbstractC0295Gu.m625r(-335037513857077L);
                AbstractC0295Gu.m625r(-351044856969269L);
                method.getName();
                Class<?> returnType2 = method.getReturnType();
                AbstractC0295Gu.m625r(-351165116053557L);
                return getDefaultValue(returnType2);
            }
        }
    }

    public static final class LuaSingleMethodHandler implements InvocationHandler {
        private final int functionRef;
        private final Lua lua;
        private final String targetMethodName;

        public LuaSingleMethodHandler(Lua lua, String str, int i) {
            AbstractC0295Gu.m625r(-351757821540405L);
            AbstractC0295Gu.m625r(-351775001409589L);
            this.lua = lua;
            this.targetMethodName = str;
            lua.pushValue(i);
            this.functionRef = lua.ref();
        }

        private final Object getDefaultValue(Class<?> cls) {
            if (AbstractC0585Nj.m1134a(cls, Boolean.TYPE) || AbstractC0585Nj.m1134a(cls, Boolean.class)) {
                return Boolean.FALSE;
            }
            if (AbstractC0585Nj.m1134a(cls, Byte.TYPE) || AbstractC0585Nj.m1134a(cls, Byte.class)) {
                return (byte) 0;
            }
            if (AbstractC0585Nj.m1134a(cls, Short.TYPE) || AbstractC0585Nj.m1134a(cls, Short.class)) {
                return (short) 0;
            }
            if (AbstractC0585Nj.m1134a(cls, Integer.TYPE) || AbstractC0585Nj.m1134a(cls, Integer.class)) {
                return 0;
            }
            if (AbstractC0585Nj.m1134a(cls, Long.TYPE) || AbstractC0585Nj.m1134a(cls, Long.class)) {
                return 0L;
            }
            if (AbstractC0585Nj.m1134a(cls, Float.TYPE) || AbstractC0585Nj.m1134a(cls, Float.class)) {
                return Float.valueOf(0.0f);
            }
            if (AbstractC0585Nj.m1134a(cls, Double.TYPE) || AbstractC0585Nj.m1134a(cls, Double.class)) {
                return Double.valueOf(0.0d);
            }
            if (AbstractC0585Nj.m1134a(cls, Character.TYPE) || AbstractC0585Nj.m1134a(cls, Character.class)) {
                return (char) 0;
            }
            AbstractC0585Nj.m1134a(cls, Void.TYPE);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object invoke$lambda$1(LuaSingleMethodHandler luaSingleMethodHandler, Object[] objArr, Method method) {
            try {
                luaSingleMethodHandler.lua.refGet(luaSingleMethodHandler.functionRef);
                for (Object obj : objArr == null ? new Object[0] : objArr) {
                    luaSingleMethodHandler.lua.push(obj, Lua.Conversion.SEMI);
                }
                luaSingleMethodHandler.lua.pCall(objArr != null ? objArr.length : 0, 1);
                Object object = luaSingleMethodHandler.lua.toObject(-1);
                luaSingleMethodHandler.lua.pop(1);
                return object;
            } catch (Exception e) {
                AbstractC0213Ey.m411i(-349945345341493L, -350009769850933L, e);
                luaSingleMethodHandler.lua.setTop(0);
                Class<?> returnType = method.getReturnType();
                AbstractC0295Gu.m625r(-350134323902517L);
                return luaSingleMethodHandler.getDefaultValue(returnType);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, final Method method, final Object[] objArr) {
            AbstractC0295Gu.m625r(-351298260039733L);
            String name = method.getName();
            if (name != null) {
                int iHashCode = name.hashCode();
                if (iHashCode != -1776922004) {
                    if (iHashCode != -1295482945) {
                        if (iHashCode == 147696667 && name.equals(AbstractC0295Gu.m625r(-351328324810805L))) {
                            return Integer.valueOf(System.identityHashCode(obj));
                        }
                    } else if (name.equals(AbstractC0295Gu.m625r(-351366979516469L))) {
                        Object obj2 = null;
                        if (objArr != null && objArr.length != 0) {
                            obj2 = objArr[0];
                        }
                        return Boolean.valueOf(obj == obj2);
                    }
                } else if (name.equals(AbstractC0295Gu.m625r(-351397044287541L))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(AbstractC0295Gu.m625r(-351435698993205L));
                    return AbstractC2374ph.m4815l(sb, this.targetMethodName, '>');
                }
            }
            if (AbstractC0585Nj.m1134a(method.getName(), this.targetMethodName)) {
                return LuaLocks.INSTANCE.withLock(this.lua, new InterfaceC0884Ui() { // from class: io.github.cherrywechat.lua.bridge.b
                    @Override // p000.InterfaceC0884Ui
                    /* JADX INFO: renamed from: a */
                    public final Object mo6a() {
                        return InterfaceProxy.LuaSingleMethodHandler.invoke$lambda$1(this.f5558a, objArr, method);
                    }
                });
            }
            Class<?> returnType = method.getReturnType();
            AbstractC0295Gu.m625r(-351513008404533L);
            return getDefaultValue(returnType);
        }
    }

    private InterfaceProxy() {
    }

    public final Object create(Lua lua, Class<?> cls, int i) {
        AbstractC0295Gu.m625r(-349666172467253L);
        AbstractC0295Gu.m625r(-349683352336437L);
        if (!cls.isInterface()) {
            throw new IllegalArgumentException(cls.getName().concat(AbstractC0295Gu.m625r(-349747776845877L)).toString());
        }
        Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new LuaInvocationHandler(lua, cls, i));
        AbstractC0295Gu.m625r(-349837971159093L);
        return objNewProxyInstance;
    }

    public final Object createFromFunction(Lua lua, Class<?> cls, int i) {
        AbstractC0295Gu.m625r(-350482216253493L);
        AbstractC0295Gu.m625r(-350499396122677L);
        if (!cls.isInterface()) {
            throw new IllegalArgumentException(cls.getName().concat(AbstractC0295Gu.m625r(-350563820632117L)).toString());
        }
        Method[] methods = cls.getMethods();
        AbstractC0295Gu.m625r(-350654014945333L);
        ArrayList arrayList = new ArrayList();
        for (Method method : methods) {
            if (Modifier.isAbstract(method.getModifiers())) {
                arrayList.add(method);
            }
        }
        if (arrayList.size() == 1) {
            Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new LuaSingleMethodHandler(lua, ((Method) arrayList.get(0)).getName(), i));
            AbstractC0295Gu.m625r(-350327597430837L);
            return objNewProxyInstance;
        }
        throw new IllegalArgumentException(cls.getName() + AbstractC0295Gu.m625r(-350722734422069L) + arrayList.size() + AbstractC0295Gu.m625r(-350198748411957L));
    }
}
