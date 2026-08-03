package io.github.cherrywechat.lua.bridge;

import android.os.Handler;
import android.os.Looper;
import io.github.cherrywechat.lua.LuaLocks;
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
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public final class InterfaceProxy {
    public static final InterfaceProxy INSTANCE = null;
    private static final String TAG = null;
    private static final Handler mainHandler = null;

    public static final class LuaInvocationHandler implements InvocationHandler {
        private final Class<?> interfaceClass;
        private final Lua lua;
        private final int tableRef;

        public LuaInvocationHandler(Lua r3, Class<?> r4, int r5) {
            AbstractC0295Gu.m625r(-335187837712437L);
            AbstractC0295Gu.m625r(-335205017581621L);
            this.lua = r3;
            this.interfaceClass = r4;
            r3.pushValue(r5);
            this.tableRef = r3.ref();
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Object m3507a(LuaInvocationHandler r0, Object[] r1, Class r2, String r3) {
            return invokeLuaMethod$lambda$2(r0, r1, r2, r3);
        }

        private final Object convertReturnValue(Object r6, Class<?> r7) {
            if (r6 != null) goto L6;
            return getDefaultValue(r7);
        L6:
            if (r7.isInstance(r6) == true) goto L69;
            boolean r0 = r6 instanceof Number;
            Class r2 = Boolean.TYPE;
            boolean r3 = false;
            if (r0 == false) goto L65;
            if (r7.equals(Integer.TYPE) == true) goto L63;
            if (r7.equals(Integer.class) == true) goto L63;
            if (r7.equals(Long.TYPE) == true) goto L61;
            if (r7.equals(Long.class) == true) goto L61;
            if (r7.equals(Float.TYPE) == true) goto L59;
            if (r7.equals(Float.class) == true) goto L59;
            if (r7.equals(Double.TYPE) == true) goto L57;
            if (r7.equals(Double.class) == true) goto L57;
            if (r7.equals(Short.TYPE) == true) goto L55;
            if (r7.equals(Short.class) == true) goto L55;
            if (r7.equals(Byte.TYPE) == true) goto L53;
            if (r7.equals(Byte.class) == true) goto L53;
            if (r7.equals(r2) == true) goto L48;
            if (r7.equals(Boolean.class) == true) goto L48;
            return (Serializable) r6;
        L48:
            if (((Number) r6).intValue() == 0) goto L51;
            r3 = true;
        L51:
            return Boolean.valueOf(r3);
        L53:
            return Byte.valueOf(((Number) r6).byteValue());
        L55:
            return Short.valueOf(((Number) r6).shortValue());
        L57:
            return Double.valueOf(((Number) r6).doubleValue());
        L59:
            return Float.valueOf(((Number) r6).floatValue());
        L61:
            return Long.valueOf(((Number) r6).longValue());
        L63:
            return Integer.valueOf(((Number) r6).intValue());
        L65:
            if (r7.equals(r2) == true) goto L71;
            if (r7.equals(Boolean.class) == false) goto L69;
        L71:
            if ((r6 instanceof Boolean) == false) goto L73;
            r3 = ((Boolean) r6).booleanValue();
        L85:
            return Boolean.valueOf(r3);
        L73:
            if (r0 == false) goto L78;
            if (((Number) r6).intValue() == 0) goto L85;
        L76:
            r3 = true;
            goto L85
        L78:
            if ((r6 instanceof String) == false) goto L76;
            if (((CharSequence) r6).length() <= 0) goto L85;
            if (r6.equals(AbstractC0295Gu.m625r(-351246720432181L)) == true) goto L85;
        L69:
            return r6;
        }

        private final Object getDefaultValue(Class<?> r3) {
            if (AbstractC0585Nj.m1134a(r3, Boolean.TYPE) == true) goto L59;
            if (AbstractC0585Nj.m1134a(r3, Boolean.class) == true) goto L59;
            if (AbstractC0585Nj.m1134a(r3, Byte.TYPE) == true) goto L57;
            if (AbstractC0585Nj.m1134a(r3, Byte.class) == true) goto L57;
            if (AbstractC0585Nj.m1134a(r3, Short.TYPE) == true) goto L55;
            if (AbstractC0585Nj.m1134a(r3, Short.class) == true) goto L55;
            if (AbstractC0585Nj.m1134a(r3, Integer.TYPE) == true) goto L53;
            if (AbstractC0585Nj.m1134a(r3, Integer.class) == true) goto L53;
            if (AbstractC0585Nj.m1134a(r3, Long.TYPE) == true) goto L51;
            if (AbstractC0585Nj.m1134a(r3, Long.class) == true) goto L51;
            if (AbstractC0585Nj.m1134a(r3, Float.TYPE) == true) goto L49;
            if (AbstractC0585Nj.m1134a(r3, Float.class) == true) goto L49;
            if (AbstractC0585Nj.m1134a(r3, Double.TYPE) == true) goto L47;
            if (AbstractC0585Nj.m1134a(r3, Double.class) == true) goto L47;
            if (AbstractC0585Nj.m1134a(r3, Character.TYPE) == true) goto L45;
            if (AbstractC0585Nj.m1134a(r3, Character.class) == true) goto L45;
            AbstractC0585Nj.m1134a(r3, Void.TYPE);
            return null;
        L45:
            return (char) 0;
        L47:
            return Double.valueOf(0.0d);
        L49:
            return Float.valueOf(0.0f);
        L51:
            return 0L;
        L53:
            return 0;
        L55:
            return (short) 0;
        L57:
            return (byte) 0;
        L59:
            return Boolean.FALSE;
        }

        private final Object handleCallResult(boolean r3, Class<?> r4) {
            if (r3 == false) goto L6;
            Object r32 = this.lua.toObject(-1);
            this.lua.pop(1);
            return convertReturnValue(r32, r4);
        L6:
            return getDefaultValue(r4);
        }

        private final Object invokeLuaMethod(final String r4, final Object[] r5, final Class<?> r6) {
            return LuaLocks.INSTANCE.withLock(this.lua, new C1556a(this, r5, r6, r4));
        }

        private static final Object invokeLuaMethod$lambda$2(LuaInvocationHandler r6, Object[] r7, Class r8, String r9) {
            r6.lua.refGet(r6.tableRef);
            int r2 = 0;
            if (r6.lua.isFunction(-1) == false) goto L12;
            int r92 = r7.length;
        L5:
            if (r2 >= r92) goto L26;
            r6.lua.push(r7[r2], Lua.Conversion.SEMI);
            r2 = r2 + 1;
            goto L5
        L26:
            r6.lua.pCall(r7.length, 1);     // Catch: Exception -> L9
            return r6.handleCallResult(true, r8);
        L9:
            e = move-exception;
            AbstractC0213Ey.m411i(-351272490235957L, -350787158931509L, e);
            return r6.getDefaultValue(r8);
        L12:
            r6.lua.getField(-1, r9);
            if (r6.lua.isFunction(-1) == true) goto L16;
            r6.lua.pop(2);
            AbstractC0295Gu.m625r(-350860173375541L);
            AbstractC0295Gu.m625r(-350924597884981L);
            AbstractC0295Gu.m625r(-350963252590645L);
            return r6.getDefaultValue(r8);
        L16:
            int r93 = r7.length;
            int r0 = 0;
        L17:
            if (r0 >= r93) goto L24;
            r6.lua.push(r7[r0], Lua.Conversion.SEMI);
            r0 = r0 + 1;
            goto L17
        L24:
            r6.lua.pCall(r7.length, 1);     // Catch: Exception -> L21
            r6.lua.remove(-2);     // Catch: Exception -> L21
            return r6.handleCallResult(true, r8);
        L21:
            e = move-exception;
            r6.lua.setTop(0);
            AbstractC0213Ey.m411i(-351620382586933L, -351684807096373L, e);
            return r6.getDefaultValue(r8);
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object r5, Method r6, Object[] r7) {
            AbstractC0295Gu.m625r(-335269442091061L);
            String r0 = r6.getName();
            boolean r1 = false;
            if (r0 == null) goto L41;
            int r2 = r0.hashCode();
            if (r2 == (-1776922004)) goto L30;
            if (r2 == (-1295482945)) goto L17;
            if (r2 != 147696667) goto L41;
            if (r0.equals(AbstractC0295Gu.m625r(-335299506862133L)) == false) goto L41;
            return Integer.valueOf(System.identityHashCode(r5));
        L17:
            if (r0.equals(AbstractC0295Gu.m625r(-335338161567797L)) == false) goto L41;
            Object r62 = null;
            if (r7 != null) goto L22;
        L25:
            if (r5 != r62) goto L28;
            r1 = true;
        L28:
            return Boolean.valueOf(r1);
        L22:
            if (r7.length == 0) goto L25;
            r62 = r7[0];
            goto L25
        L30:
            if (r0.equals(AbstractC0295Gu.m625r(-334818470524981L)) == false) goto L41;
            return AbstractC0295Gu.m625r(-334857125230645L) + this.interfaceClass.getSimpleName() + '>';
        L41:
            String r52 = r6.getName();     // Catch: Exception -> L39
            AbstractC0295Gu.m625r(-334900074903605L);     // Catch: Exception -> L39
            if (r7 != null) goto L37;
            r7 = new Object[0];     // Catch: Exception -> L39
        L37:
            Class<?> r02 = r6.getReturnType();     // Catch: Exception -> L39
            AbstractC0295Gu.m625r(-334955909478453L);     // Catch: Exception -> L39
            return invokeLuaMethod(r52, r7, r02);
        L39:
            AbstractC0295Gu.m625r(-335037513857077L);
            AbstractC0295Gu.m625r(-351044856969269L);
            r6.getName();
            Class<?> r53 = r6.getReturnType();
            AbstractC0295Gu.m625r(-351165116053557L);
            return getDefaultValue(r53);
        }
    }

    public static final class LuaSingleMethodHandler implements InvocationHandler {
        private final int functionRef;
        private final Lua lua;
        private final String targetMethodName;

        public LuaSingleMethodHandler(Lua r3, String r4, int r5) {
            AbstractC0295Gu.m625r(-351757821540405L);
            AbstractC0295Gu.m625r(-351775001409589L);
            this.lua = r3;
            this.targetMethodName = r4;
            r3.pushValue(r5);
            this.functionRef = r3.ref();
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Object m3508a(LuaSingleMethodHandler r0, Object[] r1, Method r2) {
            return invoke$lambda$1(r0, r1, r2);
        }

        private final Object getDefaultValue(Class<?> r3) {
            if (AbstractC0585Nj.m1134a(r3, Boolean.TYPE) == true) goto L59;
            if (AbstractC0585Nj.m1134a(r3, Boolean.class) == true) goto L59;
            if (AbstractC0585Nj.m1134a(r3, Byte.TYPE) == true) goto L57;
            if (AbstractC0585Nj.m1134a(r3, Byte.class) == true) goto L57;
            if (AbstractC0585Nj.m1134a(r3, Short.TYPE) == true) goto L55;
            if (AbstractC0585Nj.m1134a(r3, Short.class) == true) goto L55;
            if (AbstractC0585Nj.m1134a(r3, Integer.TYPE) == true) goto L53;
            if (AbstractC0585Nj.m1134a(r3, Integer.class) == true) goto L53;
            if (AbstractC0585Nj.m1134a(r3, Long.TYPE) == true) goto L51;
            if (AbstractC0585Nj.m1134a(r3, Long.class) == true) goto L51;
            if (AbstractC0585Nj.m1134a(r3, Float.TYPE) == true) goto L49;
            if (AbstractC0585Nj.m1134a(r3, Float.class) == true) goto L49;
            if (AbstractC0585Nj.m1134a(r3, Double.TYPE) == true) goto L47;
            if (AbstractC0585Nj.m1134a(r3, Double.class) == true) goto L47;
            if (AbstractC0585Nj.m1134a(r3, Character.TYPE) == true) goto L45;
            if (AbstractC0585Nj.m1134a(r3, Character.class) == true) goto L45;
            AbstractC0585Nj.m1134a(r3, Void.TYPE);
            return null;
        L45:
            return (char) 0;
        L47:
            return Double.valueOf(0.0d);
        L49:
            return Float.valueOf(0.0f);
        L51:
            return 0L;
        L53:
            return 0;
        L55:
            return (short) 0;
        L57:
            return (byte) 0;
        L59:
            return Boolean.FALSE;
        }

        private static final Object invoke$lambda$1(LuaSingleMethodHandler r7, Object[] r8, Method r9) {
            r7.lua.refGet(r7.functionRef);     // Catch: Exception -> L6
            if (r8 != null) goto L8;
            Object[] r1 = new Object[0];     // Catch: Exception -> L6
        L9:
            int r2 = r1.length;     // Catch: Exception -> L6
            int r3 = 0;
        L10:
            if (r3 >= r2) goto L12;
            r7.lua.push(r1[r3], Lua.Conversion.SEMI);     // Catch: Exception -> L6
            r3 = r3 + 1;     // Catch: Exception -> L6
            goto L10
        L12:
            Lua r12 = r7.lua;     // Catch: Exception -> L6
            if (r8 == null) goto L15;
            int r82 = r8.length;     // Catch: Exception -> L6
        L16:
            r12.pCall(r82, 1);     // Catch: Exception -> L6
            Object r83 = r7.lua.toObject(-1);     // Catch: Exception -> L6
            r7.lua.pop(1);     // Catch: Exception -> L6
            return r83;
        L15:
            r82 = 0;
            goto L16
        L8:
            r1 = r8;
        L6:
            e = move-exception;
            AbstractC0213Ey.m411i(-349945345341493L, -350009769850933L, e);
            r7.lua.setTop(0);
            Class<?> r84 = r9.getReturnType();
            AbstractC0295Gu.m625r(-350134323902517L);
            return r7.getDefaultValue(r84);
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object r4, final Method r5, final Object[] r6) {
            AbstractC0295Gu.m625r(-351298260039733L);
            String r0 = r5.getName();
            if (r0 == null) goto L35;
            int r1 = r0.hashCode();
            if (r1 == (-1776922004)) goto L30;
            if (r1 == (-1295482945)) goto L17;
            if (r1 != 147696667) goto L35;
            if (r0.equals(AbstractC0295Gu.m625r(-351328324810805L)) == false) goto L35;
            return Integer.valueOf(System.identityHashCode(r4));
        L17:
            if (r0.equals(AbstractC0295Gu.m625r(-351366979516469L)) == false) goto L35;
            boolean r52 = false;
            Object r02 = null;
            if (r6 != null) goto L22;
        L25:
            if (r4 != r02) goto L28;
            r52 = true;
        L28:
            return Boolean.valueOf(r52);
        L22:
            if (r6.length == 0) goto L25;
            r02 = r6[0];
            goto L25
        L30:
            if (r0.equals(AbstractC0295Gu.m625r(-351397044287541L)) == false) goto L35;
            StringBuilder r42 = new StringBuilder();
            r42.append(AbstractC0295Gu.m625r(-351435698993205L));
            return AbstractC2374ph.m4815l(r42, this.targetMethodName, '>');
        L35:
            if (AbstractC0585Nj.m1134a(r5.getName(), this.targetMethodName) == true) goto L39;
            Class<?> r43 = r5.getReturnType();
            AbstractC0295Gu.m625r(-351513008404533L);
            return getDefaultValue(r43);
        L39:
            return LuaLocks.INSTANCE.withLock(this.lua, new C1557b(this, r6, r5));
        }
    }

    static {
        TAG = AbstractC0295Gu.m625r(-350422086711349L);
        INSTANCE = new InterfaceProxy();
        mainHandler = new Handler(Looper.getMainLooper());
    }

    private InterfaceProxy() {
    }

    public final Object create(Lua r3, Class<?> r4, int r5) {
        AbstractC0295Gu.m625r(-349666172467253L);
        AbstractC0295Gu.m625r(-349683352336437L);
        if (r4.isInterface() == false) goto L7;
        LuaInvocationHandler r0 = new LuaInvocationHandler(r3, r4, r5);
        Object r32 = Proxy.newProxyInstance(r4.getClassLoader(), new Class[]{r4}, r0);
        AbstractC0295Gu.m625r(-349837971159093L);
        return r32;
    L7:
        throw new IllegalArgumentException(r4.getName().concat(AbstractC0295Gu.m625r(-349747776845877L)).toString());
    }

    public final Object createFromFunction(Lua r8, Class<?> r9, int r10) {
        AbstractC0295Gu.m625r(-350482216253493L);
        AbstractC0295Gu.m625r(-350499396122677L);
        if (r9.isInterface() == false) goto L17;
        Method[] r0 = r9.getMethods();
        AbstractC0295Gu.m625r(-350654014945333L);
        ArrayList r1 = new ArrayList();
        int r2 = r0.length;
        int r4 = 0;
    L5:
        if (r4 >= r2) goto L11;
        Method r5 = r0[r4];
        if (Modifier.isAbstract(r5.getModifiers()) == false) goto L9;
        r1.add(r5);
    L9:
        r4 = r4 + 1;
        goto L5
    L11:
        if (r1.size() != 1) goto L15;
        Object r82 = Proxy.newProxyInstance(r9.getClassLoader(), new Class[]{r9}, new LuaSingleMethodHandler(r8, ((Method) r1.get(0)).getName(), r10));
        AbstractC0295Gu.m625r(-350327597430837L);
        return r82;
    L15:
        throw new IllegalArgumentException(r9.getName() + AbstractC0295Gu.m625r(-350722734422069L) + r1.size() + AbstractC0295Gu.m625r(-350198748411957L));
    L17:
        throw new IllegalArgumentException(r9.getName().concat(AbstractC0295Gu.m625r(-350563820632117L)).toString());
    }
}
