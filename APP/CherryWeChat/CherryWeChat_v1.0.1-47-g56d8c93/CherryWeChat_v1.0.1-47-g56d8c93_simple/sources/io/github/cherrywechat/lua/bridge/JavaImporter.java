package io.github.cherrywechat.lua.bridge;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p000.AbstractC0085Bz;
import p000.AbstractC0213Ey;
import p000.AbstractC0295Gu;
import p000.AbstractC0513Lx;
import p000.AbstractC0585Nj;
import p000.AbstractC2453ra;
import p000.AbstractC2564tz;
import p000.AbstractC2598uq;
import p000.C0208Et;
import p000.C1102Zl;
import p000.C1147am;
import p000.C1227bm;
import p000.C1355e9;
import p000.C2694x;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public final class JavaImporter {
    public static final JavaImporter INSTANCE = null;
    private static final String TAG = null;
    private static final ConcurrentHashMap<String, Class<?>> classCache = null;
    private static final Map<String, String> packageAliases = null;

    static {
        TAG = AbstractC0295Gu.m625r(-347140731697205L);
        INSTANCE = new JavaImporter();
        classCache = new ConcurrentHashMap();
        packageAliases = AbstractC2598uq.m5110L(new C0208Et[]{new C0208Et(AbstractC0295Gu.m625r(-345547298830389L), AbstractC0295Gu.m625r(-345555888764981L)), new C0208Et(AbstractC0295Gu.m625r(-345598838437941L), AbstractC0295Gu.m625r(-345616018307125L)), new C0208Et(AbstractC0295Gu.m625r(-345689032751157L), AbstractC0295Gu.m625r(-345714802554933L)), new C0208Et(AbstractC0295Gu.m625r(-345255241054261L), AbstractC0295Gu.m625r(-345276715890741L)), new C0208Et(AbstractC0295Gu.m625r(-345354025302069L), AbstractC0295Gu.m625r(-345388385040437L)), new C0208Et(AbstractC0295Gu.m625r(-345491464255541L), AbstractC0295Gu.m625r(-345521529026613L)), new C0208Et(AbstractC0295Gu.m625r(-346170069088309L), AbstractC0295Gu.m625r(-346200133859381L)), new C0208Et(AbstractC0295Gu.m625r(-346277443270709L), AbstractC0295Gu.m625r(-346311803009077L)), new C0208Et(AbstractC0295Gu.m625r(-345843651573813L), AbstractC0295Gu.m625r(-345873716344885L))});
    }

    private JavaImporter() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m3509a(List r0, Lua r1) {
        return registerLuaJavaNamespace$lambda$9(r0, r1);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m3510b(Class r0, Lua r1) {
        return pushClassWrapper$lambda$6(r0, r1);
    }

    private final Class<?> boxPrimitive(Class<?> r2) {
        if (AbstractC0585Nj.m1134a(r2, Boolean.TYPE) == false) goto L7;
        return Boolean.class;
    L7:
        if (AbstractC0585Nj.m1134a(r2, Byte.TYPE) == false) goto L11;
        return Byte.class;
    L11:
        if (AbstractC0585Nj.m1134a(r2, Character.TYPE) == false) goto L15;
        return Character.class;
    L15:
        if (AbstractC0585Nj.m1134a(r2, Short.TYPE) == false) goto L19;
        return Short.class;
    L19:
        if (AbstractC0585Nj.m1134a(r2, Integer.TYPE) == false) goto L23;
        return Integer.class;
    L23:
        if (AbstractC0585Nj.m1134a(r2, Long.TYPE) == false) goto L27;
        return Long.class;
    L27:
        if (AbstractC0585Nj.m1134a(r2, Float.TYPE) == false) goto L31;
        return Float.class;
    L31:
        if (AbstractC0585Nj.m1134a(r2, Double.TYPE) == false) goto L34;
        return Double.class;
    L34:
        return r2;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m3511c(List r0, Lua r1) {
        return registerLuaJavaNamespace$lambda$12(r0, r1);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m3512d(List r0, Object r1, String r2, Lua r3) {
        return pushMethodWrapper$lambda$8(r0, r1, r2, r3);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m3513e(List r0, Lua r1) {
        return register$lambda$0(r0, r1);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m3514f(Class r0, Lua r1) {
        return pushClassWrapper$lambda$3(r0, r1);
    }

    private final Constructor<?> findMatchingConstructor(Class<?> r6, Class<?>[] r7) {
        Constructor<?>[] r62 = r6.getConstructors();
        C2694x r0 = new C2694x(1, r62);
    L4:
        if (r0.hasNext() == false) goto L8;
        Constructor<?> r1 = (Constructor) r0.next();
        Class<?>[] r2 = r1.getParameterTypes();
        AbstractC0295Gu.m625r(-349541618415669L);
        if (isMatchingSignature(r2, r7) == false) goto L4;
        return r1;
    L8:
        C2694x r02 = new C2694x(1, r62);
    L10:
        if (r02.hasNext() == false) goto L14;
        Constructor<?> r63 = (Constructor) r02.next();
        Class<?>[] r12 = r63.getParameterTypes();
        AbstractC0295Gu.m625r(-349640402663477L);
        if (isLooseMatchingSignature(r12, r7) == false) goto L10;
        return r63;
    L14:
        return null;
    }

    private final Method findMatchingMethod(List<Method> r6, Class<?>[] r7) {
        Iterator<Method> r0 = r6.iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        Method r1 = r0.next();
        Class<?>[] r2 = r1.getParameterTypes();
        AbstractC0295Gu.m625r(-349189431097397L);
        if (isMatchingSignature(r2, r7) == false) goto L4;
        return r1;
    L8:
        Iterator<Method> r62 = r6.iterator();
    L10:
        if (r62.hasNext() == false) goto L14;
        Method r02 = r62.next();
        Class<?>[] r12 = r02.getParameterTypes();
        AbstractC0295Gu.m625r(-349288215345205L);
        if (isLooseMatchingSignature(r12, r7) == false) goto L10;
        return r02;
    L14:
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m3515g(Class r0, Lua r1) {
        return pushClassWrapper$lambda$5(r0, r1);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ int m3516h(List r0, Lua r1) {
        return registerLuaJavaNamespace$lambda$11(r0, r1);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ int m3517i(Lua r0) {
        return registerNewFunction$lambda$14(r0);
    }

    private final boolean isAssignable(Class<?> r2, Class<?> r3) {
        if (r2.isAssignableFrom(r3) == false) goto L7;
        return true;
    L7:
        return boxPrimitive(r2).isAssignableFrom(boxPrimitive(r3));
    }

    private final boolean isLooseAssignable(Class<?> r14, Class<?> r15) {
        if (isAssignable(r14, r15) == true) goto L18;
        Set r0 = AbstractC0513Lx.m997B(new Class[]{Byte.TYPE, Short.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class});
        if (r0.contains(boxPrimitive(r14)) == false) goto L11;
        if (r0.contains(boxPrimitive(r15)) == false) goto L11;
        return true;
    L11:
        if (AbstractC0585Nj.m1134a(r14, CharSequence.class) == true) goto L13;
        return false;
    L13:
        if (AbstractC0585Nj.m1134a(r15, String.class) == false) goto L20;
        return true;
    L20:
        return false;
    L18:
        return true;
    }

    private final boolean isLooseMatchingSignature(Class<?>[] r6, Class<?>[] r7) {
        if (r6.length == r7.length) goto L5;
        return false;
    L5:
        int r0 = r6.length;
        int r1 = 0;
    L6:
        if (r1 >= r0) goto L13;
        Class<?> r3 = r6[r1];
        Class<?> r4 = r7[r1];
        if (r4 == null) goto L12;
        if (isLooseAssignable(r3, r4) == true) goto L12;
        return false;
    L12:
        r1 = r1 + 1;
        goto L6
    L13:
        return true;
    }

    private final boolean isMatchingSignature(Class<?>[] r6, Class<?>[] r7) {
        if (r6.length == r7.length) goto L5;
        return false;
    L5:
        int r0 = r6.length;
        int r1 = 0;
    L6:
        if (r1 >= r0) goto L16;
        Class<?> r3 = r6[r1];
        Class<?> r4 = r7[r1];
        if (r4 != null) goto L13;
        if (r3.isPrimitive() == false) goto L15;
        return false;
    L15:
        r1 = r1 + 1;
        goto L6
    L13:
        if (isAssignable(r3, r4) == true) goto L15;
        return false;
    L16:
        return true;
    }

    private final Class<?> loadClass(String r4, List<? extends ClassLoader> r5) {
        String r0 = packageAliases.get(r4);
        if (r0 == null) goto L6;
        r4 = r0;
    L6:
        Class<?> r02 = classCache.get(r4);
        if (r02 == null) goto L10;
        return r02;
    L10:
        if (AbstractC0085Bz.m132J(r4, false, AbstractC0295Gu.m625r(-348549480970293L)) == false) goto L13;
        AbstractC0295Gu.m625r(-348562365872181L);
        AbstractC0295Gu.m625r(-348618200447029L);
        return null;
    L13:
        Iterator<? extends ClassLoader> r03 = r5.iterator();
    L15:
        if (r03.hasNext() == true) goto L26;
        Class<?> r04 = Class.forName(r4);     // Catch: ClassNotFoundException -> L21
        classCache.put(r4, r04);     // Catch: ClassNotFoundException -> L21
        return r04;
    L22:
        return tryLoadInnerClass(r4, r5);
    L26:
        Class<?> r1 = r03.next().loadClass(r4);     // Catch: ClassNotFoundException -> L23
        classCache.put(r4, r1);     // Catch: ClassNotFoundException -> L23
        return r1;
    }

    private final void pushClassWrapper(Lua r6, Class<?> r7) {
        r6.createTable(0, 4);
        r6.push(new C1227bm(0, r7));
        r6.setField(-2, AbstractC0295Gu.m625r(-349378409658421L));
        r6.push(new C1227bm(1, r7));
        r6.setField(-2, AbstractC0295Gu.m625r(-349408474429493L));
        r6.push(new C1227bm(2, r7));
        r6.setField(-2, AbstractC0295Gu.m625r(-349442834167861L));
        r6.createTable(0, 1);
        r6.push(r7, Lua.Conversion.SEMI);
        r6.setField(-2, AbstractC0295Gu.m625r(-349490078808117L));
        r6.insert(-2);
        r6.setMetatable(-2);
    }

    private static final int pushClassWrapper$lambda$3(Class r8, Lua r9) {
        AbstractC0295Gu.m625r(-347716257314869L);
        int r1 = r9.getTop() - 1;     // Catch: Exception -> L6
        Object[] r3 = new Object[r1];     // Catch: Exception -> L6
        int r5 = 0;
    L4:
        if (r5 >= r1) goto L8;
        r3[r5] = r9.toObject(r5 + 2);     // Catch: Exception -> L6
        r5 = r5 + 1;     // Catch: Exception -> L6
        goto L4
    L8:
        ArrayList r52 = new ArrayList(r1);     // Catch: Exception -> L6
        int r6 = 0;
    L9:
        if (r6 >= r1) goto L15;
        Object r7 = r3[r6];     // Catch: Exception -> L6
        if (r7 == null) goto L13;
        Class<?> r72 = r7.getClass();     // Catch: Exception -> L6
    L14:
        r52.add(r72);     // Catch: Exception -> L6
        r6 = r6 + 1;     // Catch: Exception -> L6
        goto L9
    L13:
        r72 = null;
        goto L14
    L15:
        Constructor<?> r4 = INSTANCE.findMatchingConstructor(r8, (Class[]) r52.toArray(new Class[0]));     // Catch: Exception -> L6
        if (r4 == null) goto L19;
        r4.setAccessible(true);     // Catch: Exception -> L6
        r9.push(r4.newInstance(Arrays.copyOf(r3, r1)), Lua.Conversion.SEMI);     // Catch: Exception -> L6
        return 1;
    L19:
        r9.pushNil();     // Catch: Exception -> L6
        r9.push(AbstractC0295Gu.m625r(-348274603063349L) + r8.getSimpleName());     // Catch: Exception -> L6
        return 2;
    L6:
        e = move-exception;
        AbstractC0295Gu.m625r(-348424926918709L);
        AbstractC0295Gu.m625r(-348480761493557L);
        r9.pushNil();
        AbstractC0213Ey.m415m(-348034084894773L, new StringBuilder(), e, r9);
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2, types: [party.iroiro.luajava.Lua] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.reflect.Method[]] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.lang.reflect.Method] */
    private static final int pushClassWrapper$lambda$5(Class r9, Lua r10) {
        AbstractC0295Gu.m625r(-348119984240693L);
        String r5 = r10.toString(2);
        int r0 = 0;
        if (r5 != null) goto L5;
        return 0;
    L5:
        Class<?> r1 = null;
        Field r2 = r9.getField(r5);     // Catch: Exception -> L8 NoSuchFieldException -> L9
    L10:
        if (r2 != null) goto L12;
    L15:
        ?? r22 = r9.getMethods();     // Catch: Exception -> L8
        AbstractC0295Gu.m625r(-348128574175285L);     // Catch: Exception -> L8
        ArrayList r6 = new ArrayList();     // Catch: Exception -> L8
        int r3 = r22.length;     // Catch: Exception -> L8
    L16:
        if (r0 >= r3) goto L40;
        ?? r4 = r22[r0];     // Catch: Exception -> L8
        if (AbstractC0585Nj.m1134a(r4.getName(), r5) == false) goto L22;
        if (Modifier.isStatic(r4.getModifiers()) == false) goto L22;
        r6.add(r4);     // Catch: Exception -> L8
    L22:
        r0 = r0 + 1;     // Catch: Exception -> L8
        goto L16
    L40:
        if (r6.isEmpty() == true) goto L41;
        INSTANCE.pushMethodWrapper(r10, null, r9, r5, r6);     // Catch: Exception -> L38
        return 1;
    L41:
        r1 = Class.forName(r9.getName() + '$' + r5);     // Catch: ClassNotFoundException -> L39 Exception -> L38
    L31:
        if (r1 == null) goto L34;
        INSTANCE.pushClassWrapper(r10, r1);     // Catch: Exception -> L38
        return 1;
    L34:
        r10.pushNil();     // Catch: Exception -> L38
    L37:
        return 1;
    L36:
        AbstractC0213Ey.m412j(-348197293652021L, -348253128226869L, r22);
        goto L37
    L12:
        if (Modifier.isStatic(r2.getModifiers()) == false) goto L15;
        r2.setAccessible(true);     // Catch: Exception -> L8
        r10.push(r2.get(null), Lua.Conversion.SEMI);     // Catch: Exception -> L8
        return 1;
    L9:
        r2 = null;
    L8:
        r22 = r10;
        goto L36
    }

    private static final int pushClassWrapper$lambda$6(Class r3, Lua r4) {
        AbstractC0295Gu.m625r(-346702645033013L);
        r4.push(AbstractC0295Gu.m625r(-346711234967605L) + r3.getName() + '>');
        return 1;
    }

    private final void pushMethodWrapper(Lua r1, final Object r2, Class<?> r3, final String r4, final List<Method> r5) {
        r1.push(new C1147am(r5, r2, r4));
    }

    private static final int pushMethodWrapper$lambda$8(List r7, Object r8, String r9, Lua r10) {
        AbstractC0295Gu.m625r(-346758479607861L);
        int r1 = r10.getTop();     // Catch: Exception -> L6
        Object[] r2 = new Object[r1];     // Catch: Exception -> L6
        int r4 = 0;
    L4:
        if (r4 >= r1) goto L8;
        int r5 = r4 + 1;     // Catch: Exception -> L6
        r2[r4] = r10.toObject(r5);     // Catch: Exception -> L6
        r4 = r5;
        goto L4
    L8:
        ArrayList r42 = new ArrayList(r1);     // Catch: Exception -> L6
        int r52 = 0;
    L9:
        if (r52 >= r1) goto L15;
        Object r6 = r2[r52];     // Catch: Exception -> L6
        if (r6 == null) goto L13;
        Class<?> r62 = r6.getClass();     // Catch: Exception -> L6
    L14:
        r42.add(r62);     // Catch: Exception -> L6
        r52 = r52 + 1;     // Catch: Exception -> L6
        goto L9
    L13:
        r62 = null;
        goto L14
    L15:
        Method r72 = INSTANCE.findMatchingMethod(r7, (Class[]) r42.toArray(new Class[0]));     // Catch: Exception -> L6
        if (r72 == null) goto L22;
        r72.setAccessible(true);     // Catch: Exception -> L6
        Object r82 = r72.invoke(r8, Arrays.copyOf(r2, r1));     // Catch: Exception -> L6
        if (AbstractC0585Nj.m1134a(r72.getReturnType(), Void.TYPE) == false) goto L20;
        return 0;
    L20:
        r10.push(r82, Lua.Conversion.SEMI);     // Catch: Exception -> L6
        return 1;
    L22:
        r10.pushNil();     // Catch: Exception -> L6
        r10.push(AbstractC0295Gu.m625r(-346767069542453L) + r9 + AbstractC0295Gu.m625r(-346857263855669L));     // Catch: Exception -> L6
        return 2;
    L6:
        e = move-exception;
        AbstractC0295Gu.m625r(-346891623594037L);
        AbstractC0295Gu.m625r(-346397702354997L);
        r10.pushNil();
        StringBuilder r83 = new StringBuilder();
        r83.append(AbstractC0295Gu.m625r(-346487896668213L));
        Throwable r92 = e.getCause();
        if (r92 == null) goto L28;
        String r93 = r92.getMessage();
        if (r93 == null) goto L28;
    L29:
        r83.append(r93);
        r10.push(r83.toString());
        return 2;
    L28:
        r93 = e.getMessage();
        goto L29
    }

    private static final int register$lambda$0(List r5, Lua r6) {
        AbstractC0295Gu.m625r(-347935300646965L);
        String r1 = r6.toString(1);
        if (r1 != null) goto L17;
        return 0;
    L17:
        JavaImporter r3 = INSTANCE;     // Catch: Exception -> L11
        Class<?> r52 = r3.loadClass(r1, r5);     // Catch: Exception -> L11
        if (r52 == null) goto L13;
        r3.pushClassWrapper(r6, r52);     // Catch: Exception -> L11
        return 1;
    L13:
        r6.pushNil();     // Catch: Exception -> L11
        r6.push(AbstractC0295Gu.m625r(-347943890581557L).concat(r1));     // Catch: Exception -> L11
        return 2;
    L11:
        e = move-exception;
        AbstractC0295Gu.m625r(-347471444178997L);
        AbstractC0295Gu.m625r(-347527278753845L);
        r6.pushNil();
        AbstractC0213Ey.m415m(-347634652936245L, new StringBuilder(), e, r6);
        return 2;
    }

    private final void registerLuaJavaNamespace(Lua r5, List<? extends ClassLoader> r6) {
        r5.createTable(0, 4);
        r5.push(new C1102Zl(1, r6));
        r5.setField(-2, AbstractC0295Gu.m625r(-347737732151349L));
        r5.push(new C1102Zl(2, r6));
        r5.setField(-2, AbstractC0295Gu.m625r(-347780681824309L));
        r5.push(new C1102Zl(3, r6));
        r5.setField(-2, AbstractC0295Gu.m625r(-347832221431861L));
        r5.setGlobal(AbstractC0295Gu.m625r(-347883761039413L));
    }

    private static final int registerLuaJavaNamespace$lambda$11(List r8, Lua r9) {
        AbstractC0295Gu.m625r(-346560911112245L);
        String r1 = r9.toString(1);
        if (r1 != null) goto L5;
        return 0;
    L5:
        Class<?> r82 = INSTANCE.loadClass(r1, r8);
        if (r82 != null) goto L29;
        r9.pushNil();
        r9.push(AbstractC0295Gu.m625r(-346569501046837L).concat(r1));
        return 2;
    L29:
        int r12 = r9.getTop() - 1;     // Catch: Exception -> L12
        Object[] r4 = new Object[r12];     // Catch: Exception -> L12
        int r5 = 0;
    L10:
        if (r5 >= r12) goto L14;
        r4[r5] = r9.toObject(r5 + 2);     // Catch: Exception -> L12
        r5 = r5 + 1;     // Catch: Exception -> L12
        goto L10
    L14:
        ArrayList r52 = new ArrayList(r12);     // Catch: Exception -> L12
        int r6 = 0;
    L15:
        if (r6 >= r12) goto L21;
        Object r7 = r4[r6];     // Catch: Exception -> L12
        if (r7 == null) goto L19;
        Class<?> r72 = r7.getClass();     // Catch: Exception -> L12
    L20:
        r52.add(r72);     // Catch: Exception -> L12
        r6 = r6 + 1;     // Catch: Exception -> L12
        goto L15
    L19:
        r72 = null;
        goto L20
    L21:
        Constructor<?> r83 = INSTANCE.findMatchingConstructor(r82, (Class[]) r52.toArray(new Class[0]));     // Catch: Exception -> L12
        if (r83 == null) goto L25;
        r83.setAccessible(true);     // Catch: Exception -> L12
        r9.push(r83.newInstance(Arrays.copyOf(r4, r12)), Lua.Conversion.SEMI);     // Catch: Exception -> L12
        return 1;
    L25:
        r9.pushNil();     // Catch: Exception -> L12
        r9.push(AbstractC0295Gu.m625r(-347196566272053L));     // Catch: Exception -> L12
        return 2;
    L12:
        e = move-exception;
        r9.pushNil();
        AbstractC0213Ey.m415m(-347299645487157L, new StringBuilder(), e, r9);
        return 2;
    }

    private static final int registerLuaJavaNamespace$lambda$12(List r5, Lua r6) {
        AbstractC0295Gu.m625r(-347334005225525L);
        String r1 = r6.toString(1);
        if (r1 != null) goto L6;
        return 0;
    L6:
        Class<?> r52 = INSTANCE.loadClass(r1, r5);
        if (r52 != null) goto L9;
    L16:
        r6.pushNil();
        r6.push(AbstractC0295Gu.m625r(-347342595160117L).concat(r1));
        return 2;
    L9:
        if (r52.isInterface() == false) goto L16;
        r6.push(InterfaceProxy.INSTANCE.create(r6, r52, 2), Lua.Conversion.SEMI);     // Catch: Exception -> L13
        return 1;
    L13:
        e = move-exception;
        r6.pushNil();
        AbstractC0213Ey.m415m(-347424199538741L, new StringBuilder(), e, r6);
        return 2;
    }

    private static final int registerLuaJavaNamespace$lambda$9(List r3, Lua r4) {
        AbstractC0295Gu.m625r(-346552321177653L);
        String r1 = r4.toString(1);
        if (r1 != null) goto L6;
        return 0;
    L6:
        JavaImporter r2 = INSTANCE;
        Class<?> r32 = r2.loadClass(r1, r3);
        if (r32 == null) goto L9;
        r2.pushClassWrapper(r4, r32);
    L10:
        return 1;
    L9:
        r4.pushNil();
        goto L10
    }

    private final void registerNewFunction(Lua r3) {
        r3.push(new C1355e9(14));
        r3.setGlobal(AbstractC0295Gu.m625r(-347918120777781L));
    }

    private static final int registerNewFunction$lambda$14(Lua r10) {
        AbstractC0295Gu.m625r(-346934573266997L);
        int r0 = 1;
        Object r1 = r10.toObject(1);
        if ((r1 instanceof Class) == false) goto L6;
        Class<?> r12 = (Class) r1;
    L11:
        if (r12 != null) goto L37;
        r10.pushNil();
        r10.push(AbstractC0295Gu.m625r(-346943163201589L));
        return 2;
    L37:
        int r4 = r10.getTop() - 1;     // Catch: Exception -> L17
        Object[] r5 = new Object[r4];     // Catch: Exception -> L17
        int r7 = 0;
    L15:
        if (r7 >= r4) goto L19;
        r5[r7] = r10.toObject(r7 + 2);     // Catch: Exception -> L17
        r7 = r7 + 1;     // Catch: Exception -> L17
        goto L15
    L19:
        ArrayList r72 = new ArrayList(r4);     // Catch: Exception -> L17
        int r8 = 0;
    L20:
        if (r8 >= r4) goto L26;
        Object r9 = r5[r8];     // Catch: Exception -> L17
        if (r9 == null) goto L24;
        Class<?> r92 = r9.getClass();     // Catch: Exception -> L17
    L25:
        r72.add(r92);     // Catch: Exception -> L17
        r8 = r8 + 1;     // Catch: Exception -> L17
        goto L20
    L24:
        r92 = null;
        goto L25
    L26:
        Constructor<?> r13 = INSTANCE.findMatchingConstructor(r12, (Class[]) r72.toArray(new Class[0]));     // Catch: Exception -> L17
        if (r13 == null) goto L29;
        r13.setAccessible(true);     // Catch: Exception -> L17
        r10.push(r13.newInstance(Arrays.copyOf(r5, r4)), Lua.Conversion.SEMI);     // Catch: Exception -> L17
    L42:
        return r0;
    L29:
        r10.pushNil();     // Catch: Exception -> L17
        r10.push(AbstractC0295Gu.m625r(-347003292743733L));     // Catch: Exception -> L17
        r0 = 2;
    L17:
        e = move-exception;
        r10.pushNil();
        AbstractC0213Ey.m415m(-347106371958837L, new StringBuilder(), e, r10);
        return 2;
    L6:
        if ((r1 instanceof String) == true) goto L35;
    L9:
        r12 = null;
        goto L11
    L35:
        r12 = Class.forName((String) r1);     // Catch: Exception -> L34
        goto L11
    }

    private final Class<?> tryLoadInnerClass(String r12, List<? extends ClassLoader> r13) {
        if (AbstractC2564tz.m5051L(r12, AbstractC0295Gu.m625r(-348794294106165L), false) == false) goto L13;
        List r0 = AbstractC2564tz.m5065Z(r12, new String[]{AbstractC0295Gu.m625r(-348802884040757L)}, 6);
        int r2 = r0.size() - 1;
    L5:
        if (r2 <= 0) goto L21;
        String r3 = AbstractC2453ra.m4901k0(r0.subList(0, r2), AbstractC0295Gu.m625r(-348811473975349L), null, null, null, 62) + '$' + AbstractC2453ra.m4901k0(r0.subList(r2, r0.size()), AbstractC0295Gu.m625r(-348820063909941L), null, null, null, 62);
        Iterator<? extends ClassLoader> r4 = r13.iterator();
    L8:
        if (r4.hasNext() == false) goto L12;
        Class<?> r5 = r4.next().loadClass(r3);     // Catch: ClassNotFoundException -> L15
        classCache.put(r12, r5);     // Catch: ClassNotFoundException -> L15
        return r5;
    L12:
        r2 = r2 - 1;
        goto L5
    L21:
        return null;
    L13:
        return null;
    }

    public final void clearCache() {
        classCache.clear();
    }

    public final void register(Lua r3, List<? extends ClassLoader> r4) {
        AbstractC0295Gu.m625r(-348837243779125L);
        AbstractC0295Gu.m625r(-348854423648309L);
        r3.push(new C1102Zl(0, r4));
        r3.setGlobal(AbstractC0295Gu.m625r(-348910258223157L));
        registerLuaJavaNamespace(r3, r4);
        registerNewFunction(r3);
        AbstractC0295Gu.m625r(-348940322994229L);
        AbstractC0295Gu.m625r(-348996157569077L);
    }
}
