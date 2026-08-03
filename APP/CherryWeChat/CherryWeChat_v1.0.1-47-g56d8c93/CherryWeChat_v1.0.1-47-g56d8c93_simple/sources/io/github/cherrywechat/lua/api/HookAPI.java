package io.github.cherrywechat.lua.api;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p000.AbstractC0213Ey;
import p000.AbstractC0295Gu;
import p000.AbstractC0585Nj;
import p000.AbstractC2453ra;
import p000.AbstractC2539ta;
import p000.C1312d9;
import p000.C1355e9;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public final class HookAPI {
    public static final HookAPI INSTANCE = null;
    private static final String TAG = null;
    private static final ConcurrentHashMap<String, XC_MethodHook.Unhook> activeHooks = null;
    private static final List<ClassLoader> classLoaders = null;

    static {
        TAG = AbstractC0295Gu.m625r(-297615463807029L);
        INSTANCE = new HookAPI();
        activeHooks = new ConcurrentHashMap();
        classLoaders = new ArrayList();
    }

    private HookAPI() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m3422a(Lua r0) {
        return register$lambda$8(r0);
    }

    public static final /* synthetic */ void access$pushMethodParam(HookAPI r0, Lua r1, XC_MethodHook.MethodHookParam r2) {
        r0.pushMethodParam(r1, r2);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m3423b(Lua r0) {
        return register$lambda$6(r0);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m3424c(Lua r0) {
        return register$lambda$7(r0);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m3425d(Lua r0) {
        return register$lambda$4(r0);
    }

    private final String doHook(Lua r17, int r18, boolean r19) {
        r17.getField(r18, AbstractC0295Gu.m625r(-282011847620661L));
        int r2 = -1;
        String r10 = r17.toString(-1);
        r17.pop(1);
        r17.getField(r18, AbstractC0295Gu.m625r(-281487861610549L));
        String r11 = r17.toString(-1);
        r17.pop(1);
        if (r10 == null) goto L51;
        if (r11 == null) goto L51;
        r17.getField(r18, AbstractC0295Gu.m625r(-281719789844533L));
        if (r17.isNil(-1) == false) goto L9;
    L11:
        List<String> r13 = null;
    L12:
        r17.pop(1);
        r17.getField(r18, AbstractC0295Gu.m625r(-281749854615605L));
        boolean r5 = r17.isFunction(-1);
        if (r5 == false) goto L15;
        int r7 = r17.ref();
    L16:
        r17.getField(r18, AbstractC0295Gu.m625r(-282329675200565L));
        boolean r8 = r17.isFunction(-1);
        if (r8 == false) goto L19;
        int r9 = r17.ref();
    L20:
        r17.getField(r18, AbstractC0295Gu.m625r(-282355445004341L));
        boolean r1 = r17.isFunction(-1);
        if (r1 == false) goto L24;
        r2 = r17.ref();
    L23:
        int r6 = r2;
        Class<?> r14 = findClass(r10);
        if (r14 != null) goto L29;
        AbstractC0295Gu.m625r(-282389804742709L);
        AbstractC0295Gu.m625r(-282437049382965L);
        return null;
    L29:
        HookAPI$doHook$callback$1 r12 = new HookAPI$doHook$callback$1(r19, r1, r17, r5, r6, r7, r8, r9);
        int r22 = 0;
        if (r13 == null) goto L36;
        ArrayList r3 = new ArrayList(AbstractC2539ta.m5019d0(r13, 10));     // Catch: Exception -> L49
        Iterator<T> r4 = r13.iterator();     // Catch: Exception -> L49
    L33:
        if (r4.hasNext() == false) goto L35;
        r3.add(INSTANCE.findClass((String) r4.next()));     // Catch: Exception -> L49
        goto L33
    L35:
        Class[] r23 = (Class[]) r3.toArray(new Class[0]);     // Catch: Exception -> L49
        XC_MethodHook.Unhook r15 = XposedBridge.hookMethod(XposedHelpers.findMethodExact(r14, r11, (Class[]) Arrays.copyOf(r23, r23.length)), r12);     // Catch: Exception -> L49
    L47:
        String r24 = r10 + '#' + r11 + '#' + System.currentTimeMillis();     // Catch: Exception -> L49
        activeHooks.put(r24, r15);     // Catch: Exception -> L49
        AbstractC0295Gu.m625r(-282196531214389L);     // Catch: Exception -> L49
        AbstractC0295Gu.m625r(-282243775854645L);     // Catch: Exception -> L49
        AbstractC0295Gu.m625r(-282282430560309L);     // Catch: Exception -> L49
        return r24;
    L36:
        Method[] r32 = r14.getDeclaredMethods();     // Catch: Exception -> L49
        AbstractC0295Gu.m625r(-282514358794293L);     // Catch: Exception -> L49
        ArrayList r42 = new ArrayList();     // Catch: Exception -> L49
        int r52 = r32.length;     // Catch: Exception -> L49
    L37:
        if (r22 >= r52) goto L43;
        Method r62 = r32[r22];     // Catch: Exception -> L49
        if (AbstractC0585Nj.m1134a(r62.getName(), r11) == false) goto L41;
        r42.add(r62);     // Catch: Exception -> L49
    L41:
        r22 = r22 + 1;     // Catch: Exception -> L49
        goto L37
    L43:
        if (r42.isEmpty() == false) goto L46;
        AbstractC0295Gu.m625r(-282067682195509L);     // Catch: Exception -> L49
        AbstractC0295Gu.m625r(-282114926835765L);     // Catch: Exception -> L49
        return null;
    L46:
        r15 = XposedBridge.hookMethod((Member) AbstractC2453ra.m4898h0(r42), r12);     // Catch: Exception -> L49
    L49:
        AbstractC0295Gu.m625r(-298246823999541L);
        AbstractC0295Gu.m625r(-298294068639797L);
        return null;
    L24:
        r17.pop(1);
        goto L23
    L19:
        r17.pop(1);
        r9 = -1;
        goto L20
    L15:
        r17.pop(1);
        r7 = -1;
        goto L16
    L9:
        if (r17.isTable(-1) == false) goto L11;
        r13 = readStringArray(r17, -1);
    L51:
        AbstractC0295Gu.m625r(-281517926381621L);
        AbstractC0295Gu.m625r(-281565171021877L);
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m3426e(Lua r0) {
        return register$lambda$0(r0);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m3427f(Lua r0) {
        return register$lambda$5(r0);
    }

    private final Class<?> findClass(String r3) {
        Iterator<ClassLoader> r0 = classLoaders.iterator();
    L4:
        if (r0.hasNext() == true) goto L13;
        return Class.forName(r3);
    L10:
        return null;
    L13:
        return XposedHelpers.findClass(r3, r0.next());
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m3428g(Lua r0) {
        return register$lambda$1(r0);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ int m3429h(Lua r0) {
        return register$lambda$2(r0);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ int m3430i(XC_MethodHook.MethodHookParam r0, Lua r1) {
        return pushMethodParam$lambda$15(r0, r1);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ int m3431j(XC_MethodHook.MethodHookParam r0, Lua r1) {
        return pushMethodParam$lambda$14(r0, r1);
    }

    private final void pushMethodParam(Lua r8, XC_MethodHook.MethodHookParam r9) {
        int r1 = 0;
        r8.createTable(0, 5);
        Object r0 = r9.thisObject;
        if (r0 == null) goto L5;
        r8.push(r0, Lua.Conversion.SEMI);
        r8.setField(-2, AbstractC0295Gu.m625r(-298354198181941L));
    L5:
        Object[] r02 = r9.args;
        if (r02 == null) goto L8;
        int r03 = r02.length;
    L9:
        r8.createTable(r03, 0);
        Object[] r04 = r9.args;
        if (r04 == null) goto L18;
        int r3 = r04.length;
        int r4 = 0;
    L12:
        if (r1 >= r3) goto L18;
        Object r5 = r04[r1];
        r4 = r4 + 1;
        if (r5 == null) goto L16;
        r8.push(r5, Lua.Conversion.SEMI);
    L17:
        r8.rawSetI(-2, r4);
        r1 = r1 + 1;
        goto L12
    L16:
        r8.pushNil();
    L18:
        r8.setField(-2, AbstractC0295Gu.m625r(-298401442822197L));
        Object r05 = r9.getResult();
        if (r05 == null) goto L21;
        r8.push(r05, Lua.Conversion.SEMI);
        r8.setField(-2, AbstractC0295Gu.m625r(-298422917658677L));
    L21:
        r8.push(r9.method.getName());
        r8.setField(-2, AbstractC0295Gu.m625r(-298452982429749L));
        r8.push(new C1312d9(r9, 3));
        r8.setField(-2, AbstractC0295Gu.m625r(-298483047200821L));
        r8.push(new C1312d9(r9, 4));
        r8.setField(-2, AbstractC0295Gu.m625r(-297976241059893L));
        return;
    L8:
        r03 = 0;
        goto L9
    }

    private static final int pushMethodParam$lambda$14(XC_MethodHook.MethodHookParam r2, Lua r3) {
        AbstractC0295Gu.m625r(-297598283937845L);
        r2.setResult(r3.toObject(1));
        return 0;
    }

    private static final int pushMethodParam$lambda$15(XC_MethodHook.MethodHookParam r2, Lua r3) {
        AbstractC0295Gu.m625r(-297606873872437L);
        int r0 = (int) r3.toNumber(1);
        Object r32 = r3.toObject(2);
        if (r0 < 0) goto L11;
        Object[] r22 = r2.args;
        if (r22 != null) goto L7;
        return 0;
    L7:
        if (r0 >= r22.length) goto L13;
        r22[r0] = r32;
        return 0;
    L13:
        return 0;
    L11:
        return 0;
    }

    private final List<String> readStringArray(Lua r3, int r4) {
        ArrayList r0 = new ArrayList();
        r3.pushValue(r4);
        r3.pushNil();
    L4:
        if (r3.next(-2) == 0) goto L9;
        String r42 = r3.toString(-1);
        if (r42 == null) goto L8;
        r0.add(r42);
    L8:
        r3.pop(1);
        goto L4
    L9:
        r3.pop(1);
        return r0;
    }

    private static final int register$lambda$0(Lua r6) {
        AbstractC0295Gu.m625r(-298242529032245L);
        if (r6.isTable(1) == true) goto L16;
        r6.push(false);
        r6.push(AbstractC0295Gu.m625r(-298800874780725L));
        return 2;
    L16:
        String r1 = INSTANCE.doHook(r6, 1, false);     // Catch: Exception -> L10
        if (r1 == null) goto L12;
        r6.push(r1);     // Catch: Exception -> L10
        return 1;
    L12:
        r6.push(false);     // Catch: Exception -> L10
        r6.push(AbstractC0295Gu.m625r(-298938313734197L));     // Catch: Exception -> L10
        return 2;
    L10:
        e = move-exception;
        AbstractC0295Gu.m625r(-298989853341749L);
        AbstractC0295Gu.m625r(-299037097982005L);
        r6.push(false);
        AbstractC0213Ey.m415m(-298534586808373L, new StringBuilder(), e, r6);
        return 2;
    }

    private static final int register$lambda$1(Lua r6) {
        AbstractC0295Gu.m625r(-298590421383221L);
        if (r6.isTable(1) == true) goto L16;
        r6.push(false);
        r6.push(AbstractC0295Gu.m625r(-298599011317813L));
        return 2;
    L16:
        String r1 = INSTANCE.doHook(r6, 1, true);     // Catch: Exception -> L10
        if (r1 == null) goto L12;
        r6.push(r1);     // Catch: Exception -> L10
        return 1;
    L12:
        r6.push(false);     // Catch: Exception -> L10
        r6.push(AbstractC0295Gu.m625r(-298766515042357L));     // Catch: Exception -> L10
        return 2;
    L10:
        e = move-exception;
        AbstractC0295Gu.m625r(-297168787208245L);
        AbstractC0295Gu.m625r(-297216031848501L);
        r6.push(false);
        AbstractC0213Ey.m415m(-297293341259829L, new StringBuilder(), e, r6);
        return 2;
    }

    private static final int register$lambda$2(Lua r4) {
        AbstractC0295Gu.m625r(-297379240605749L);
        String r1 = r4.toString(1);
        if (r1 == null) goto L8;
        XC_MethodHook.Unhook r12 = activeHooks.remove(r1);
        if (r12 == null) goto L7;
        r12.unhook();
        r4.push(true);
        AbstractC0295Gu.m625r(-297387830540341L);
        AbstractC0295Gu.m625r(-296885319366709L);
    L9:
        return 1;
    L7:
        r4.push(false);
        goto L9
    L8:
        r4.push(false);
        goto L9
    }

    private static final int register$lambda$4(Lua r4) {
        AbstractC0295Gu.m625r(-296932564006965L);
        ConcurrentHashMap<String, XC_MethodHook.Unhook> r0 = activeHooks;
        int r1 = r0.size();
        Collection<XC_MethodHook.Unhook> r02 = r0.values();
        AbstractC0295Gu.m625r(-296941153941557L);
        Iterator<T> r03 = r02.iterator();
    L4:
        if (r03.hasNext() == false) goto L6;
        ((XC_MethodHook.Unhook) r03.next()).unhook();
        goto L4
    L6:
        activeHooks.clear();
        r4.push(Double.valueOf(r1));
        AbstractC0295Gu.m625r(-297018463352885L);
        AbstractC0295Gu.m625r(-297065707993141L);
        AbstractC0295Gu.m625r(-297130132502581L);
        return 1;
    }

    private static final int register$lambda$5(Lua r3) {
        AbstractC0295Gu.m625r(-297709953087541L);
        String r1 = r3.toString(1);
        if (r1 != null) goto L6;
        return 0;
    L6:
        Class<?> r12 = INSTANCE.findClass(r1);
        if (r12 == null) goto L9;
        r3.push(r12, Lua.Conversion.SEMI);
    L10:
        return 1;
    L9:
        r3.pushNil();
        goto L10
    }

    private static final int register$lambda$6(Lua r8) {
        AbstractC0295Gu.m625r(-297718543022133L);
        Object r1 = r8.toObject(1);
        int r2 = 0;
        if (r1 != null) goto L5;
        return 0;
    L5:
        String r4 = r8.toString(2);
        if (r4 != null) goto L20;
        return 0;
    L20:
        int r5 = r8.getTop() - 2;     // Catch: Exception -> L11
        Object[] r6 = new Object[r5];     // Catch: Exception -> L11
    L9:
        if (r2 >= r5) goto L13;
        r6[r2] = r8.toObject(r2 + 3);     // Catch: Exception -> L11
        r2 = r2 + 1;     // Catch: Exception -> L11
        goto L9
    L13:
        Object r12 = XposedHelpers.callMethod(r1, r4, Arrays.copyOf(r6, r5));     // Catch: Exception -> L11
        if (r12 == null) goto L16;
        r8.push(r12, Lua.Conversion.SEMI);     // Catch: Exception -> L11
    L17:
        return 1;
    L16:
        r8.pushNil();     // Catch: Exception -> L11
    L11:
        e = move-exception;
        AbstractC0295Gu.m625r(-297727132956725L);
        AbstractC0295Gu.m625r(-297774377596981L);
        r8.pushNil();
        AbstractC0213Ey.m415m(-297855981975605L, new StringBuilder(), e, r8);
        return 2;
    }

    private static final int register$lambda$7(Lua r5) {
        AbstractC0295Gu.m625r(-297890341713973L);
        Object r1 = r5.toObject(1);
        if (r1 != null) goto L5;
        return 0;
    L5:
        String r3 = r5.toString(2);
        if (r3 != null) goto L16;
        return 0;
    L16:
        Object r12 = XposedHelpers.getObjectField(r1, r3);     // Catch: Exception -> L13
        if (r12 == null) goto L11;
        r5.push(r12, Lua.Conversion.SEMI);     // Catch: Exception -> L13
    L15:
    L14:
        return 1;
    L11:
        r5.pushNil();     // Catch: Exception -> L13
    L13:
        AbstractC0213Ey.m412j(-297898931648565L, -297946176288821L, r5);
        goto L14
    }

    private static final int register$lambda$8(Lua r5) {
        AbstractC0295Gu.m625r(-297469434918965L);
        Object r1 = r5.toObject(1);
        if (r1 != null) goto L5;
        return 0;
    L5:
        String r3 = r5.toString(2);
        if (r3 != null) goto L13;
        return 0;
    L13:
        XposedHelpers.setObjectField(r1, r3, r5.toObject(3));     // Catch: Exception -> L11
        r5.push(true);     // Catch: Exception -> L11
    L12:
        return 1;
    L11:
        AbstractC0295Gu.m625r(-297478024853557L);
        AbstractC0295Gu.m625r(-297525269493813L);
        r5.push(false);
        goto L12
    }

    public final void addClassLoader(ClassLoader r3) {
        AbstractC0295Gu.m625r(-283661115062325L);
        List<ClassLoader> r0 = classLoaders;
        if (r0.contains(r3) == true) goto L6;
        r0.add(r3);
        return;
    }

    public final void cleanup() {
        Collection<XC_MethodHook.Unhook> r0 = activeHooks.values();
        AbstractC0295Gu.m625r(-298006305830965L);
        Iterator<T> r02 = r0.iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((XC_MethodHook.Unhook) r02.next()).unhook();
        goto L4
    L6:
        activeHooks.clear();
        AbstractC0295Gu.m625r(-298083615242293L);
        AbstractC0295Gu.m625r(-298130859882549L);
    }

    public final int getActiveHookCount() {
        return activeHooks.size();
    }

    public final void register(Lua r5) {
        AbstractC0295Gu.m625r(-283141424019509L);
        r5.getGlobal(AbstractC0295Gu.m625r(-283158603888693L));
        if (r5.isNil(-1) == false) goto L5;
        r5.pop(1);
        r5.createTable(0, 5);
    L5:
        r5.push(new C1355e9(6));
        r5.setField(-2, AbstractC0295Gu.m625r(-283188668659765L));
        r5.push(new C1355e9(7));
        r5.setField(-2, AbstractC0295Gu.m625r(-283210143496245L));
        r5.push(new C1355e9(8));
        r5.setField(-2, AbstractC0295Gu.m625r(-283261683103797L));
        r5.push(new C1355e9(9));
        r5.setField(-2, AbstractC0295Gu.m625r(-283291747874869L));
        r5.push(new C1355e9(10));
        r5.setField(-2, AbstractC0295Gu.m625r(-283334697547829L));
        r5.push(new C1355e9(11));
        r5.setField(-2, AbstractC0295Gu.m625r(-283377647220789L));
        r5.push(new C1355e9(12));
        r5.setField(-2, AbstractC0295Gu.m625r(-281775624419381L));
        r5.push(new C1355e9(13));
        r5.setField(-2, AbstractC0295Gu.m625r(-281814279125045L));
        r5.setGlobal(AbstractC0295Gu.m625r(-281852933830709L));
        AbstractC0295Gu.m625r(-281882998601781L);
        AbstractC0295Gu.m625r(-281930243242037L);
    }

    public final void setClassLoaders(List<? extends ClassLoader> r3) {
        AbstractC0295Gu.m625r(-283626755323957L);
        List<ClassLoader> r0 = classLoaders;
        r0.clear();
        r0.addAll(r3);
    }
}
