package io.github.cherrywechat.lua.api;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import io.github.cherrywechat.lua.LuaLocks;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p000.AbstractC0213Ey;
import p000.AbstractC0295Gu;
import p000.AbstractC0585Nj;
import p000.AbstractC2453ra;
import p000.AbstractC2496sa;
import p000.AbstractC2539ta;
import p000.C0829TC;
import p000.C1207b9;
import p000.C1250c9;
import p000.C1312d9;
import p000.C1355e9;
import p000.C1399f9;
import p000.C2322og;
import p000.C2694x;
import p000.InterfaceC2279ng;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public final class CherryXposedAPI {
    public static final CherryXposedAPI INSTANCE = null;
    private static final String TAG = null;
    private static final ConcurrentHashMap<String, XC_MethodHook.Unhook> activeHooks = null;
    private static final List<ClassLoader> classLoaders = null;
    private static long hookCounter;

    public enum HookType extends Enum<HookType> {
        private static final /* synthetic */ InterfaceC2279ng $ENTRIES = null;
        private static final /* synthetic */ HookType[] $VALUES = null;
        public static final HookType AFTER = null;
        public static final HookType BEFORE = null;
        public static final HookType NORMAL = null;
        public static final HookType REPLACE = null;

        private static final /* synthetic */ HookType[] $values() {
            return new HookType[]{NORMAL, BEFORE, AFTER, REPLACE};
        }

        static {
            NORMAL = new HookType(AbstractC0295Gu.m625r(-313133180647477L), 0);
            BEFORE = new HookType(AbstractC0295Gu.m625r(-313163245418549L), 1);
            AFTER = new HookType(AbstractC0295Gu.m625r(-313193310189621L), 2);
            REPLACE = new HookType(AbstractC0295Gu.m625r(-313219079993397L), 3);
            HookType[] r0 = $values();
            $VALUES = r0;
            $ENTRIES = new C2322og(r0);
        }

        HookType(String r1, int r2) {
        }

        public static InterfaceC2279ng getEntries() {
            return $ENTRIES;
        }

        public static HookType valueOf(String r1) {
            return (HookType) Enum.valueOf(HookType.class, r1);
        }

        public static HookType[] values() {
            return (HookType[]) $VALUES.clone();
        }
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[HookType.values().length];
            r0[HookType.REPLACE.ordinal()] = 1;     // Catch: NoSuchFieldError -> L8
        L11:
            r0[HookType.BEFORE.ordinal()] = 2;     // Catch: NoSuchFieldError -> L9
        L15:
            r0[HookType.AFTER.ordinal()] = 3;     // Catch: NoSuchFieldError -> L10
        L6:
            $EnumSwitchMapping$0 = r0;
        }
    }

    /* JADX INFO: renamed from: io.github.cherrywechat.lua.api.CherryXposedAPI$createMethodCallback$1 */
    public static final class C15531 extends XC_MethodHook {
        final /* synthetic */ int $afterRef;
        final /* synthetic */ int $beforeRef;
        final /* synthetic */ boolean $isReplace;
        final /* synthetic */ Lua $lua;
        final /* synthetic */ int $replaceRef;

        public C15531(boolean r1, int r2, Lua r3, int r4, int r5) {
            this.$isReplace = r1;
            this.$replaceRef = r2;
            this.$lua = r3;
            this.$beforeRef = r4;
            this.$afterRef = r5;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ C0829TC m3418a(Lua r0, int r1, XC_MethodHook.MethodHookParam r2) {
            return beforeHookedMethod$lambda$0(r0, r1, r2);
        }

        private static final C0829TC afterHookedMethod$lambda$2(Lua r1, int r2, XC_MethodHook.MethodHookParam r3) {
            r1.refGet(r2);     // Catch: Exception -> L5
            CherryXposedAPI.access$pushMethodParam(CherryXposedAPI.INSTANCE, r1, r3);     // Catch: Exception -> L5
            r1.pCall(1, 0);     // Catch: Exception -> L5
        L7:
            return C0829TC.f2620a;
        L5:
            AbstractC0295Gu.m625r(-312780993329205L);
            AbstractC0295Gu.m625r(-312299956992053L);
            r1.setTop(0);
            goto L7
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ C0829TC m3419b(Lua r0, int r1, XC_MethodHook.MethodHookParam r2) {
            return afterHookedMethod$lambda$2(r0, r1, r2);
        }

        private static final C0829TC beforeHookedMethod$lambda$0(Lua r1, int r2, XC_MethodHook.MethodHookParam r3) {
            r1.refGet(r2);     // Catch: Exception -> L4
            CherryXposedAPI.access$pushMethodParam(CherryXposedAPI.INSTANCE, r1, r3);     // Catch: Exception -> L4
            r1.pCall(1, 1);     // Catch: Exception -> L4
            r3.setResult(r1.toObject(-1));     // Catch: Exception -> L4
            r1.pop(1);     // Catch: Exception -> L4
        L6:
            return C0829TC.f2620a;
        L4:
            AbstractC0295Gu.m625r(-314099548289077L);
            AbstractC0295Gu.m625r(-314168267765813L);
            r1.setTop(0);
            goto L6
        }

        private static final C0829TC beforeHookedMethod$lambda$1(Lua r1, int r2, XC_MethodHook.MethodHookParam r3) {
            r1.refGet(r2);     // Catch: Exception -> L5
            CherryXposedAPI.access$pushMethodParam(CherryXposedAPI.INSTANCE, r1, r3);     // Catch: Exception -> L5
            r1.pCall(1, 0);     // Catch: Exception -> L5
        L7:
            return C0829TC.f2620a;
        L5:
            AbstractC0295Gu.m625r(-312617784571957L);
            AbstractC0295Gu.m625r(-312686504048693L);
            r1.setTop(0);
            goto L7
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ C0829TC m3420c(Lua r0, int r1, XC_MethodHook.MethodHookParam r2) {
            return beforeHookedMethod$lambda$1(r0, r1, r2);
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam r6) {
            AbstractC0295Gu.m625r(-314073778485301L);
            if (this.$isReplace == true) goto L10;
            int r0 = this.$afterRef;
            if (r0 < 0) goto L9;
            LuaLocks r1 = LuaLocks.INSTANCE;
            Lua r2 = this.$lua;
            r1.withLock(r2, new C1399f9(r2, r0, r6, 2));
            return;
        L9:
            return;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam r6) {
            AbstractC0295Gu.m625r(-314048008681525L);
            if (this.$isReplace == false) goto L8;
            int r0 = this.$replaceRef;
            if (r0 < 0) goto L8;
            LuaLocks r1 = LuaLocks.INSTANCE;
            Lua r2 = this.$lua;
            r1.withLock(r2, new C1399f9(r2, r0, r6, 0));
            return;
        L8:
            int r02 = this.$beforeRef;
            if (r02 < 0) goto L12;
            LuaLocks r12 = LuaLocks.INSTANCE;
            Lua r22 = this.$lua;
            r12.withLock(r22, new C1399f9(r22, r02, r6, 1));
            return;
        }
    }

    /* JADX INFO: renamed from: io.github.cherrywechat.lua.api.CherryXposedAPI$createReplaceCallback$1 */
    public static final class C15541 extends XC_MethodReplacement {
        final /* synthetic */ Lua $lua;
        final /* synthetic */ int $replaceRef;

        public C15541(Lua r1, int r2) {
            this.$lua = r1;
            this.$replaceRef = r2;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Object m3421a(Lua r0, int r1, XC_MethodHook.MethodHookParam r2) {
            return replaceHookedMethod$lambda$0(r0, r1, r2);
        }

        private static final Object replaceHookedMethod$lambda$0(Lua r0, int r1, XC_MethodHook.MethodHookParam r2) {
            r0.refGet(r1);     // Catch: Exception -> L4
            CherryXposedAPI.access$pushMethodParam(CherryXposedAPI.INSTANCE, r0, r2);     // Catch: Exception -> L4
            r0.pCall(1, 1);     // Catch: Exception -> L4
            Object r22 = r0.toObject(-1);     // Catch: Exception -> L4
            r0.pop(1);     // Catch: Exception -> L4
            return r22;
        L4:
            AbstractC0295Gu.m625r(-312415921109045L);
            AbstractC0295Gu.m625r(-312484640585781L);
            r0.setTop(0);
            return null;
        }

        public Object replaceHookedMethod(XC_MethodHook.MethodHookParam r6) {
            AbstractC0295Gu.m625r(-312390151305269L);
            LuaLocks r0 = LuaLocks.INSTANCE;
            Lua r1 = this.$lua;
            return r0.withLock(r1, new C1399f9(r1, this.$replaceRef, r6, 3));
        }
    }

    static {
        TAG = AbstractC0295Gu.m625r(-283055524673589L);
        INSTANCE = new CherryXposedAPI();
        classLoaders = new ArrayList();
        activeHooks = new ConcurrentHashMap();
    }

    private CherryXposedAPI() {
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ int m3364A(Lua r0) {
        return registerClassAPI$lambda$20(r0);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ int m3365B(Lua r0) {
        return registerClassAPI$lambda$13(r0);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ int m3366C(Lua r0) {
        return registerFieldAPI$lambda$35(r0);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ int m3367D(Lua r0) {
        return registerReflectionAPI$lambda$55(r0);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ int m3368E(Lua r0) {
        return registerMethodAPI$lambda$22(r0);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ int m3369F(Lua r0) {
        return registerHookAPI$lambda$4(r0);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ int m3370G(Lua r0) {
        return registerFieldAPI$lambda$38(r0);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ int m3371H(Lua r0) {
        return registerMethodAPI$lambda$23(r0);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ int m3372I(Lua r0) {
        return registerConstructorAPI$lambda$48(r0);
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ int m3373J(XC_MethodHook.MethodHookParam r0, Lua r1) {
        return pushMethodParam$lambda$76(r0, r1);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ int m3374K(Lua r0) {
        return registerClassAPI$lambda$18(r0);
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ int m3375L(Lua r0) {
        return registerHookAPI$lambda$11(r0);
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ int m3376M(Lua r0) {
        return registerClassAPI$lambda$12(r0);
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ int m3377N(Lua r0) {
        return registerFieldAPI$lambda$42(r0);
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ int m3378O(Lua r0) {
        return registerHookManagementAPI$lambda$63(r0);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ int m3379P(Lua r0) {
        return registerHookAPI$lambda$2(r0);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ int m3380Q(Lua r0) {
        return registerClassAPI$lambda$16(r0);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ int m3381R(Lua r0) {
        return registerFieldAPI$lambda$37(r0);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ int m3382S(Lua r0) {
        return registerReflectionAPI$lambda$56(r0);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ int m3383T(XC_MethodHook.MethodHookParam r0, Lua r1) {
        return pushMethodParam$lambda$74(r0, r1);
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ int m3384U(Lua r0) {
        return registerReflectionAPI$lambda$49(r0);
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ int m3385V(Lua r0) {
        return registerFieldAPI$lambda$39(r0);
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ int m3386W(Lua r0) {
        return registerHookAPI$lambda$8(r0);
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ int m3387X(Lua r0) {
        return registerHookAPI$lambda$1(r0);
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ int m3388Y(Lua r0) {
        return registerMethodAPI$lambda$29(r0);
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ int m3389Z(Lua r0) {
        return registerFieldAPI$lambda$33(r0);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m3390a(Lua r0) {
        return registerReflectionAPI$lambda$54(r0);
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ int m3391a0(Lua r0) {
        return registerFieldAPI$lambda$31(r0);
    }

    public static final /* synthetic */ void access$pushMethodParam(CherryXposedAPI r0, Lua r1, XC_MethodHook.MethodHookParam r2) {
        r0.pushMethodParam(r1, r2);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m3392b(Lua r0) {
        return registerReflectionAPI$lambda$57(r0);
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ int m3393b0(Lua r0) {
        return registerFieldAPI$lambda$40(r0);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m3394c(Lua r0) {
        return registerClassAPI$lambda$15(r0);
    }

    private final XC_MethodHook createMethodCallback(Lua r7, int r8, int r9, int r10, boolean r11) {
        return new C15531(r11, r10, r7, r8, r9);
    }

    private final XC_MethodReplacement createReplaceCallback(Lua r2, int r3) {
        return new C15541(r2, r3);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m3395d(Lua r0) {
        return registerConstructorAPI$lambda$44(r0);
    }

    private final String doHook(Lua r15, int r16, HookType r17) {
        r15.getField(r16, AbstractC0295Gu.m625r(-309959199815733L));
        int r1 = -1;
        String r2 = r15.toString(-1);
        r15.pop(1);
        r15.getField(r16, AbstractC0295Gu.m625r(-309984969619509L));
        String r4 = r15.toString(-1);
        r15.pop(1);
        if (r2 == null) goto L59;
        if (r4 == null) goto L59;
        r15.getField(r16, AbstractC0295Gu.m625r(-309688616876085L));
        if (r15.isNil(-1) == false) goto L9;
    L11:
        List<String> r6 = null;
    L12:
        r15.pop(1);
        r15.getField(r16, AbstractC0295Gu.m625r(-309718681647157L));
        if (r15.isFunction(-1) == false) goto L15;
        int r10 = r15.ref();
    L16:
        r15.getField(r16, AbstractC0295Gu.m625r(-309748746418229L));
        if (r15.isFunction(-1) == false) goto L19;
        int r11 = r15.ref();
    L20:
        r15.getField(r16, AbstractC0295Gu.m625r(-309774516222005L));
        if (r15.isFunction(-1) == false) goto L24;
        r1 = r15.ref();
    L23:
        int r12 = r1;
        Class<?> r0 = findClass(r2);
        if (r0 != null) goto L29;
        AbstractC0295Gu.m625r(-308159608518709L);
        AbstractC0295Gu.m625r(-308228327995445L);
        return null;
    L29:
        int r7 = 0;
        if (WhenMappings.$EnumSwitchMapping$0[r17.ordinal()] != 1) goto L33;
        XC_MethodReplacement r152 = createReplaceCallback(r15, r12);
    L61:
        if (r6 == null) goto L44;
        ArrayList r13 = new ArrayList(AbstractC2539ta.m5019d0(r6, 10));     // Catch: Exception -> L57
        Iterator<T> r3 = r6.iterator();     // Catch: Exception -> L57
    L41:
        if (r3.hasNext() == false) goto L43;
        r13.add(INSTANCE.findClass((String) r3.next()));     // Catch: Exception -> L57
        goto L41
    L43:
        Class[] r14 = (Class[]) r13.toArray(new Class[0]);     // Catch: Exception -> L57
        XC_MethodHook.Unhook r153 = XposedBridge.hookMethod(XposedHelpers.findMethodExact(r0, r4, (Class[]) Arrays.copyOf(r14, r14.length)), r152);     // Catch: Exception -> L57
    L55:
        String r02 = generateHookId(r2, r4);     // Catch: Exception -> L57
        activeHooks.put(r02, r153);     // Catch: Exception -> L57
        AbstractC0295Gu.m625r(-308009284663349L);     // Catch: Exception -> L57
        AbstractC0295Gu.m625r(-308078004140085L);     // Catch: Exception -> L57
        AbstractC0295Gu.m625r(-308116658845749L);     // Catch: Exception -> L57
        return r02;
    L44:
        Method[] r03 = r0.getDeclaredMethods();     // Catch: Exception -> L57
        AbstractC0295Gu.m625r(-308305637406773L);     // Catch: Exception -> L57
        ArrayList r18 = new ArrayList();     // Catch: Exception -> L57
        int r32 = r03.length;     // Catch: Exception -> L57
    L45:
        if (r7 >= r32) goto L51;
        Method r62 = r03[r7];     // Catch: Exception -> L57
        if (AbstractC0585Nj.m1134a(r62.getName(), r4) == false) goto L49;
        r18.add(r62);     // Catch: Exception -> L57
    L49:
        r7 = r7 + 1;     // Catch: Exception -> L57
        goto L45
    L51:
        if (r18.isEmpty() == false) goto L54;
        AbstractC0295Gu.m625r(-308408716621877L);     // Catch: Exception -> L57
        AbstractC0295Gu.m625r(-307927680284725L);     // Catch: Exception -> L57
        return null;
    L54:
        r153 = XposedBridge.hookMethod((Member) AbstractC2453ra.m4898h0(r18), r152);     // Catch: Exception -> L57
    L57:
        AbstractC0295Gu.m625r(-308138133682229L);
        AbstractC0295Gu.m625r(-308756608972853L);
        return null;
    L33:
        if (r17 != HookType.REPLACE) goto L36;
        boolean r132 = true;
    L37:
        r152 = createMethodCallback(r15, r10, r11, r12, r132);
        goto L61
    L36:
        r132 = false;
        goto L37
    L24:
        r15.pop(1);
        goto L23
    L19:
        r15.pop(1);
        r11 = -1;
        goto L20
    L15:
        r15.pop(1);
        r10 = -1;
        goto L16
    L9:
        if (r15.isTable(-1) == false) goto L11;
        r6 = readStringArray(r15, -1);
    L59:
        AbstractC0295Gu.m625r(-310015034390581L);
        AbstractC0295Gu.m625r(-309533998053429L);
        return null;
    }

    private final String doHookConstructor(Lua r13, int r14) {
        r13.getField(r14, AbstractC0295Gu.m625r(-308520385771573L));
        int r0 = -1;
        String r1 = r13.toString(-1);
        r13.pop(1);
        if (r1 != null) goto L6;
        AbstractC0295Gu.m625r(-308546155575349L);
        AbstractC0295Gu.m625r(-308614875052085L);
        return null;
    L6:
        r13.getField(r14, AbstractC0295Gu.m625r(-289536630323253L));
        if (r13.isNil(-1) == false) goto L9;
    L11:
        List<String> r4 = null;
    L12:
        r13.pop(1);
        r13.getField(r14, AbstractC0295Gu.m625r(-289566695094325L));
        if (r13.isFunction(-1) == false) goto L15;
        int r8 = r13.ref();
    L16:
        r13.getField(r14, AbstractC0295Gu.m625r(-289596759865397L));
        if (r13.isFunction(-1) == false) goto L20;
        r0 = r13.ref();
    L19:
        int r9 = r0;
        Class<?> r142 = findClass(r1);
        if (r142 != null) goto L24;
        return null;
    L24:
        XC_MethodHook r132 = createMethodCallback(r13, r8, r9, -1, false);
        if (r4 == null) goto L31;
        ArrayList r2 = new ArrayList(AbstractC2539ta.m5019d0(r4, 10));     // Catch: Exception -> L41
        Iterator<T> r42 = r4.iterator();     // Catch: Exception -> L41
    L28:
        if (r42.hasNext() == false) goto L30;
        r2.add(INSTANCE.findClass((String) r42.next()));     // Catch: Exception -> L41
        goto L28
    L30:
        Class[] r02 = (Class[]) r2.toArray(new Class[0]);     // Catch: Exception -> L41
        XC_MethodHook.Unhook r133 = XposedBridge.hookMethod(XposedHelpers.findConstructorExact(r142, (Class[]) Arrays.copyOf(r02, r02.length)), r132);     // Catch: Exception -> L41
    L37:
        String r143 = generateHookId(r1, AbstractC0295Gu.m625r(-289622529669173L));     // Catch: Exception -> L41
        activeHooks.put(r143, r133);     // Catch: Exception -> L41
        return r143;
    L31:
        Constructor<?>[] r144 = r142.getDeclaredConstructors();     // Catch: Exception -> L41
        if (r144.length != 0) goto L35;
        return null;
    L35:
        if (r144.length == 0) goto L40;
        r133 = XposedBridge.hookMethod(r144[0], r132);     // Catch: Exception -> L41
        goto L37
    L40:
        throw new NoSuchElementException("Array is empty.");     // Catch: Exception -> L41
    L41:
        AbstractC0295Gu.m625r(-289652594440245L);
        AbstractC0295Gu.m625r(-289721313916981L);
        return null;
    L20:
        r13.pop(1);
        goto L19
    L15:
        r13.pop(1);
        r8 = -1;
        goto L16
    L9:
        if (r13.isTable(-1) == false) goto L11;
        r4 = readStringArray(r13, -1);
        goto L12
    }

    private final String doSimpleHook(Lua r14, HookType r15) {
        boolean r2 = true;
        String r6 = r14.toString(1);
        if (r6 != null) goto L5;
        return null;
    L5:
        String r8 = r14.toString(2);
        if (r8 != null) goto L8;
        return null;
    L8:
        int r5 = 4;
        int r9 = 0;
        if (r14.getTop() >= 4) goto L11;
    L13:
        r2 = false;
    L14:
        if (r2 == true) goto L18;
        r5 = 3;
    L18:
        if (r14.isFunction(r5) == true) goto L20;
        return null;
    L20:
        if (r2 == false) goto L22;
        List<String> r11 = readStringArray(r14, 3);
    L23:
        r14.pushValue(r5);
        int r22 = r14.ref();
        Class<?> r12 = findClass(r6);
        if (r12 != null) goto L26;
        return null;
    L26:
        int r4 = WhenMappings.$EnumSwitchMapping$0[r15.ordinal()];
        if (r4 == 2) goto L31;
        if (r4 == 3) goto L30;
        return null;
    L30:
        XC_MethodHook r1 = createMethodCallback(r14, -1, r22, -1, false);
    L52:
        if (r11 == null) goto L38;
        ArrayList r23 = new ArrayList(AbstractC2539ta.m5019d0(r11, 10));     // Catch: Exception -> L50
        Iterator<T> r3 = r11.iterator();     // Catch: Exception -> L50
    L35:
        if (r3.hasNext() == false) goto L37;
        r23.add(INSTANCE.findClass((String) r3.next()));     // Catch: Exception -> L50
        goto L35
    L37:
        Class[] r24 = (Class[]) r23.toArray(new Class[0]);     // Catch: Exception -> L50
        XC_MethodHook.Unhook r13 = XposedBridge.hookMethod(XposedHelpers.findMethodExact(r12, r8, (Class[]) Arrays.copyOf(r24, r24.length)), r1);     // Catch: Exception -> L50
    L48:
        String r25 = generateHookId(r6, r8);     // Catch: Exception -> L50
        activeHooks.put(r25, r13);     // Catch: Exception -> L50
        return r25;
    L38:
        Method[] r26 = r12.getDeclaredMethods();     // Catch: Exception -> L50
        AbstractC0295Gu.m625r(-308816738514997L);     // Catch: Exception -> L50
        ArrayList r32 = new ArrayList();     // Catch: Exception -> L50
        int r42 = r26.length;     // Catch: Exception -> L50
    L39:
        if (r9 >= r42) goto L45;
        Method r52 = r26[r9];     // Catch: Exception -> L50
        if (AbstractC0585Nj.m1134a(r52.getName(), r8) == false) goto L43;
        r32.add(r52);     // Catch: Exception -> L50
    L43:
        r9 = r9 + 1;     // Catch: Exception -> L50
        goto L39
    L45:
        if (r32.isEmpty() == false) goto L47;
        return null;
    L47:
        r13 = XposedBridge.hookMethod((Member) AbstractC2453ra.m4898h0(r32), r1);     // Catch: Exception -> L50
    L50:
        AbstractC0295Gu.m625r(-308919817730101L);
        AbstractC0295Gu.m625r(-308438781392949L);
        return null;
    L31:
        r1 = createMethodCallback(r14, r22, -1, -1, false);
        goto L52
    L22:
        r11 = null;
        goto L23
    L11:
        if (r14.isTable(3) == false) goto L13;
        goto L13
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m3396e(XC_MethodHook.MethodHookParam r0, Lua r1) {
        return pushMethodParam$lambda$75(r0, r1);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m3397f(Lua r0) {
        return registerHookAPI$lambda$0(r0);
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
    public static /* synthetic */ int m3398g(Lua r0) {
        return registerFieldAPI$lambda$30(r0);
    }

    private final String generateHookId(String r4, String r5) {
        StringBuilder r0 = new StringBuilder();
        r0.append(r4);
        r0.append('#');
        r0.append(r5);
        r0.append('#');
        long r42 = hookCounter + 1;
        hookCounter = r42;
        r0.append(r42);
        return r0.toString();
    }

    private final Object[] getArgsFromStack(Lua r5, int r6) {
        int r0 = (r5.getTop() - r6) + 1;
        int r1 = 0;
        if (r0 <= 0) goto L9;
        Object[] r2 = new Object[r0];
    L5:
        if (r1 >= r0) goto L7;
        r2[r1] = r5.toObject(r6 + r1);
        r1 = r1 + 1;
        goto L5
    L7:
        return r2;
    L9:
        return new Object[0];
    }

    private final Class<?> getClassFromArg(Lua r1, int r2) {
        Object r12 = r1.toObject(r2);
        if ((r12 instanceof Class) == false) goto L7;
        return (Class) r12;
    L7:
        if ((r12 instanceof String) == true) goto L9;
        return null;
    L9:
        return findClass((String) r12);
    }

    private final List<Class<?>> getParamTypesFromStack(Lua r5, int r6) {
        ArrayList r0 = new ArrayList();
        int r1 = r5.getTop();
        if (r6 > r1) goto L14;
    L4:
        Object r2 = r5.toObject(r6);
        if ((r2 instanceof Class) == false) goto L8;
        r0.add(r2);
    L12:
        if (r6 == r1) goto L14;
        r6 = r6 + 1;
        goto L4
    L8:
        if ((r2 instanceof String) == false) goto L12;
        Class<?> r22 = findClass((String) r2);
        if (r22 == null) goto L12;
        r0.add(r22);
    L14:
        return r0;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ int m3399h(Lua r0) {
        return registerFieldAPI$lambda$34(r0);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ int m3400i(Lua r0) {
        return registerReflectionAPI$lambda$58(r0);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ int m3401j(Lua r0) {
        return registerReflectionAPI$lambda$50(r0);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ int m3402k(Lua r0) {
        return registerConstructorAPI$lambda$45(r0);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ int m3403l(Lua r0) {
        return registerReflectionAPI$lambda$53(r0);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ int m3404m(Lua r0) {
        return registerClassAPI$lambda$14(r0);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ int m3405n(Lua r0) {
        return registerConstructorAPI$lambda$47(r0);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ int m3406o(Lua r0) {
        return registerMethodAPI$lambda$24(r0);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ int m3407p(Lua r0) {
        return registerFieldAPI$lambda$36(r0);
    }

    private final void pushMethodParam(Lua r8, XC_MethodHook.MethodHookParam r9) {
        int r1 = 0;
        r8.createTable(0, 6);
        Object r0 = r9.thisObject;
        if (r0 == null) goto L5;
        r8.push(r0, Lua.Conversion.SEMI);
        r8.setField(-2, AbstractC0295Gu.m625r(-289283227252789L));
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
        r8.setField(-2, AbstractC0295Gu.m625r(-289330471893045L));
        Object r05 = r9.getResult();
        if (r05 == null) goto L21;
        r8.push(r05, Lua.Conversion.SEMI);
        r8.setField(-2, AbstractC0295Gu.m625r(-289351946729525L));
    L21:
        r8.push(r9.method.getName());
        r8.setField(-2, AbstractC0295Gu.m625r(-289382011500597L));
        r8.push(new C1312d9(r9, 0));
        r8.setField(-2, AbstractC0295Gu.m625r(-289412076271669L));
        r8.push(new C1312d9(r9, 1));
        r8.setField(-2, AbstractC0295Gu.m625r(-290004781758517L));
        r8.push(new C1312d9(r9, 2));
        r8.setField(-2, AbstractC0295Gu.m625r(-290034846529589L));
        return;
    L8:
        r03 = 0;
        goto L9
    }

    private static final int pushMethodParam$lambda$74(XC_MethodHook.MethodHookParam r2, Lua r3) {
        AbstractC0295Gu.m625r(-283029754869813L);
        r2.setResult(r3.toObject(1));
        return 0;
    }

    private static final int pushMethodParam$lambda$75(XC_MethodHook.MethodHookParam r2, Lua r3) {
        AbstractC0295Gu.m625r(-283038344804405L);
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

    private static final int pushMethodParam$lambda$76(XC_MethodHook.MethodHookParam r3, Lua r4) {
        AbstractC0295Gu.m625r(-283046934738997L);
        int r1 = (int) r4.toNumber(1);
        if (r1 < 0) goto L9;
        Object[] r32 = r3.args;
        if (r32 == null) goto L9;
        if (r1 >= r32.length) goto L9;
        INSTANCE.pushResult(r4, r32[r1]);
    L10:
        return 1;
    L9:
        r4.pushNil();
        goto L10
    }

    private final void pushResult(Lua r2, Object r3) {
        if (r3 == null) goto L5;
        r2.push(r3, Lua.Conversion.SEMI);
        return;
    L5:
        r2.pushNil();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ int m3408q(Lua r0) {
        return registerHookManagementAPI$lambda$64(r0);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ int m3409r(Lua r0) {
        return registerHookAPI$lambda$3(r0);
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

    private final void registerClassAPI(Lua r5) {
        r5.push(new C1250c9(1));
        r5.setField(-2, AbstractC0295Gu.m625r(-311213330266165L));
        r5.push(new C1250c9(2));
        r5.setField(-2, AbstractC0295Gu.m625r(-311256279939125L));
        r5.push(new C1250c9(3));
        r5.setField(-2, AbstractC0295Gu.m625r(-311333589350453L));
        r5.push(new C1250c9(5));
        r5.setField(-2, AbstractC0295Gu.m625r(-311385128958005L));
        r5.push(new C1250c9(6));
        r5.setField(-2, AbstractC0295Gu.m625r(-311990719346741L));
        r5.push(new C1250c9(7));
        r5.setField(-2, AbstractC0295Gu.m625r(-312050848888885L));
        r5.push(new C1250c9(8));
        r5.setField(-2, AbstractC0295Gu.m625r(-312110978431029L));
        r5.push(new C1250c9(9));
        r5.setField(-2, AbstractC0295Gu.m625r(-312158223071285L));
    }

    private static final int registerClassAPI$lambda$12(Lua r3) {
        AbstractC0295Gu.m625r(-287586715170869L);
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

    private static final int registerClassAPI$lambda$13(Lua r3) {
        AbstractC0295Gu.m625r(-287595305105461L);
        String r1 = r3.toString(1);
        if (r1 != null) goto L13;
        return 0;
    L13:
        Class<?> r12 = INSTANCE.findClass(r1);     // Catch: Exception -> L8
    L9:
        if (r12 == null) goto L11;
        r3.push(r12, Lua.Conversion.SEMI);
    L12:
        return 1;
    L11:
        r3.pushNil();
    L8:
        r12 = null;
        goto L9
    }

    private static final int registerClassAPI$lambda$14(Lua r4) {
        AbstractC0295Gu.m625r(-287603895040053L);
        String r1 = r4.toString(1);
        boolean r2 = false;
        if (r1 != null) goto L11;
        return 0;
    L11:
        if (INSTANCE.findClass(r1) == null) goto L8;
        r2 = true;
    L8:
        r4.push(r2);
        return 1;
    }

    private static final int registerClassAPI$lambda$15(Lua r2) {
        AbstractC0295Gu.m625r(-287612484974645L);
        Object r1 = r2.toObject(1);
        if (r1 == null) goto L5;
        r2.push(r1.getClass().getName());
    L6:
        return 1;
    L5:
        r2.pushNil();
        goto L6
    }

    private static final int registerClassAPI$lambda$16(Lua r3) {
        AbstractC0295Gu.m625r(-287621074909237L);
        Class<?> r0 = INSTANCE.getClassFromArg(r3, 1);
        if (r0 == null) goto L5;
        Class<? super Object> r2 = r0.getSuperclass();
    L6:
        if (r2 == null) goto L8;
        r3.push(r0.getSuperclass(), Lua.Conversion.SEMI);
    L9:
        return 1;
    L8:
        r3.pushNil();
        goto L9
    L5:
        r2 = null;
        goto L6
    }

    private static final int registerClassAPI$lambda$18(Lua r7) {
        AbstractC0295Gu.m625r(-287629664843829L);
        Class<?> r0 = INSTANCE.getClassFromArg(r7, 1);
        int r2 = 0;
        if (r0 == null) goto L7;
        Class<?>[] r02 = r0.getInterfaces();
        r7.createTable(r02.length, 0);
        int r3 = r02.length;
        int r4 = 0;
    L5:
        if (r2 >= r3) goto L8;
        r4 = r4 + 1;
        r7.push(r02[r2], Lua.Conversion.SEMI);
        r7.rawSetI(-2, r4);
        r2 = r2 + 1;
    L8:
        return 1;
    L7:
        r7.createTable(0, 0);
        goto L8
    }

    private static final int registerClassAPI$lambda$20(Lua r5) {
        AbstractC0295Gu.m625r(-287638254778421L);
        Object r1 = r5.toObject(1);
        boolean r2 = false;
        if (r1 != null) goto L6;
        r5.push(false);
        return 1;
    L6:
        Class<?> r3 = INSTANCE.getClassFromArg(r5, 2);
        if (r3 == null) goto L9;
        r2 = r3.isInstance(r1);
    L9:
        r5.push(r2);
        return 1;
    }

    private static final int registerClassAPI$lambda$21(Lua r4) {
        AbstractC0295Gu.m625r(-287646844713013L);
        CherryXposedAPI r0 = INSTANCE;
        Class<?> r2 = r0.getClassFromArg(r4, 1);
        Class<?> r02 = r0.getClassFromArg(r4, 2);
        if (r2 == null) goto L5;
        boolean r03 = r2.isAssignableFrom(r02);
    L6:
        r4.push(r03);
        return 1;
    L5:
        r03 = false;
        goto L6
    }

    private final void registerConstructorAPI(Lua r5) {
        r5.push(new C1207b9(15));
        r5.setField(-2, AbstractC0295Gu.m625r(-311032941639733L));
        r5.push(new C1207b9(26));
        r5.setField(-2, AbstractC0295Gu.m625r(-311084481247285L));
        r5.push(new C1250c9(4));
        r5.setField(-2, AbstractC0295Gu.m625r(-311153200724021L));
        r5.push(new C1250c9(15));
        r5.setField(-2, AbstractC0295Gu.m625r(-310710819092533L));
        r5.push(new C1250c9(26));
        r5.setField(-2, AbstractC0295Gu.m625r(-310779538569269L));
    }

    private static final int registerConstructorAPI$lambda$43(Lua r6) {
        AbstractC0295Gu.m625r(-285001144858677L);
        CherryXposedAPI r0 = INSTANCE;
        Class<?> r2 = r0.getClassFromArg(r6, 1);
        if (r2 != null) goto L16;
        return 0;
    L16:
        Object[] r02 = r0.getArgsFromStack(r6, 2);     // Catch: Exception -> L9
        if (r02.length != 0) goto L11;
        Object r03 = XposedHelpers.newInstance(r2, new Object[0]);     // Catch: Exception -> L9
    L12:
        r6.push(r03, Lua.Conversion.SEMI);     // Catch: Exception -> L9
        return 1;
    L11:
        r03 = XposedHelpers.newInstance(r2, Arrays.copyOf(r02, r02.length));     // Catch: Exception -> L9
    L9:
        e = move-exception;
        AbstractC0295Gu.m625r(-285009734793269L);
        AbstractC0295Gu.m625r(-285628210083893L);
        r6.pushNil();
        AbstractC0213Ey.m415m(-285705519495221L, new StringBuilder(), e, r6);
        return 2;
    }

    private static final int registerConstructorAPI$lambda$44(Lua r6) {
        AbstractC0295Gu.m625r(-285739879233589L);
        CherryXposedAPI r0 = INSTANCE;
        Class<?> r2 = r0.getClassFromArg(r6, 1);
        if (r2 != null) goto L20;
        return 0;
    L20:
        List<Class<?>> r02 = r0.getParamTypesFromStack(r6, 2);     // Catch: Exception -> L18
        if (r02.isEmpty() == false) goto L12;
        Constructor<?>[] r03 = r2.getDeclaredConstructors();     // Catch: Exception -> L18
        AbstractC0295Gu.m625r(-285748469168181L);     // Catch: Exception -> L18
        if (r03.length != 0) goto L11;
        Constructor<?> r04 = null;
    L13:
        if (r04 == null) goto L16;
        r6.push(r04, Lua.Conversion.SEMI);     // Catch: Exception -> L18
        return 1;
    L16:
        r6.pushNil();     // Catch: Exception -> L18
        return 1;
    L11:
        r04 = r03[0];     // Catch: Exception -> L18
        goto L13
    L12:
        Class[] r05 = (Class[]) r02.toArray(new Class[0]);     // Catch: Exception -> L18
        r04 = XposedHelpers.findConstructorExact(r2, (Class[]) Arrays.copyOf(r05, r05.length));     // Catch: Exception -> L18
    L18:
        AbstractC0213Ey.m412j(-285873023219765L, -285391986882613L, r6);
        return 1;
    }

    private static final int registerConstructorAPI$lambda$45(Lua r6) {
        AbstractC0295Gu.m625r(-285486476163125L);
        CherryXposedAPI r0 = INSTANCE;
        Class<?> r2 = r0.getClassFromArg(r6, 1);
        if (r2 != null) goto L11;
        return 0;
    L11:
        Object[] r02 = r0.getArgsFromStack(r6, 2);     // Catch: Exception -> L9
        r6.push(XposedHelpers.findConstructorBestMatch(r2, Arrays.copyOf(r02, r02.length)), Lua.Conversion.SEMI);     // Catch: Exception -> L9
    L10:
        return 1;
    L9:
        AbstractC0213Ey.m412j(-285495066097717L, -285563785574453L, r6);
        goto L10
    }

    private static final int registerConstructorAPI$lambda$47(Lua r7) {
        AbstractC0295Gu.m625r(-284047662118965L);
        Class<?> r0 = INSTANCE.getClassFromArg(r7, 1);
        int r2 = 0;
        if (r0 != null) goto L5;
        return 0;
    L5:
        Constructor<?>[] r02 = r0.getDeclaredConstructors();
        r7.createTable(r02.length, 0);
        int r3 = r02.length;
        int r4 = 0;
    L6:
        if (r2 >= r3) goto L8;
        r4 = r4 + 1;
        r7.push(r02[r2], Lua.Conversion.SEMI);
        r7.rawSetI(-2, r4);
        r2 = r2 + 1;
        goto L6
    L8:
        return 1;
    }

    private static final int registerConstructorAPI$lambda$48(Lua r5) {
        AbstractC0295Gu.m625r(-284056252053557L);
        Object r1 = r5.toObject(1);
        if ((r1 instanceof Constructor) == false) goto L5;
        Constructor r12 = (Constructor) r1;
    L6:
        if (r12 != null) goto L13;
        return 0;
    L13:
        Object[] r2 = INSTANCE.getArgsFromStack(r5, 2);     // Catch: Exception -> L11
        r12.setAccessible(true);     // Catch: Exception -> L11
        r5.push(r12.newInstance(Arrays.copyOf(r2, r2.length)), Lua.Conversion.SEMI);     // Catch: Exception -> L11
    L12:
        return 1;
    L11:
        AbstractC0213Ey.m412j(-284064841988149L, -284133561464885L, r5);
        goto L12
    L5:
        r12 = null;
        goto L6
    }

    private final void registerFieldAPI(Lua r5) {
        r5.push(new C1250c9(18));
        r5.setField(-2, AbstractC0295Gu.m625r(-310388696545333L));
        r5.push(new C1250c9(21));
        r5.setField(-2, AbstractC0295Gu.m625r(-310427351250997L));
        r5.push(new C1250c9(22));
        r5.setField(-2, AbstractC0295Gu.m625r(-310466005956661L));
        r5.push(new C1250c9(23));
        r5.setField(-2, AbstractC0295Gu.m625r(-310530430466101L));
        r5.push(new C1250c9(24));
        r5.setField(-2, AbstractC0295Gu.m625r(-310594854975541L));
        r5.push(new C1250c9(25));
        r5.setField(-2, AbstractC0295Gu.m625r(-310096638769205L));
        r5.push(new C1250c9(27));
        r5.setField(-2, AbstractC0295Gu.m625r(-310148178376757L));
        r5.push(new C1250c9(28));
        r5.setField(-2, AbstractC0295Gu.m625r(-310216897853493L));
        r5.push(new C1250c9(29));
        r5.setField(-2, AbstractC0295Gu.m625r(-310285617330229L));
        r5.push(new C1355e9(0));
        r5.setField(-2, AbstractC0295Gu.m625r(-310891207718965L));
        r5.push(new C1250c9(19));
        r5.setField(-2, AbstractC0295Gu.m625r(-310947042293813L));
        r5.push(new C1250c9(20));
        r5.setField(-2, AbstractC0295Gu.m625r(-310989991966773L));
    }

    private static final int registerFieldAPI$lambda$30(Lua r5) {
        AbstractC0295Gu.m625r(-286478613608501L);
        Object r1 = r5.toObject(1);
        if (r1 != null) goto L5;
        return 0;
    L5:
        String r3 = r5.toString(2);
        if (r3 != null) goto L12;
        return 0;
    L12:
        Object r12 = XposedHelpers.getObjectField(r1, r3);     // Catch: Exception -> L10
        INSTANCE.pushResult(r5, r12);     // Catch: Exception -> L10
    L11:
        return 1;
    L10:
        AbstractC0213Ey.m412j(-286487203543093L, -286555923019829L, r5);
        goto L11
    }

    private static final int registerFieldAPI$lambda$31(Lua r5) {
        AbstractC0295Gu.m625r(-286628937463861L);
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
        AbstractC0295Gu.m625r(-286637527398453L);
        AbstractC0295Gu.m625r(-285056979433525L);
        r5.push(false);
        goto L12
    }

    private static final int registerFieldAPI$lambda$32(Lua r6) {
        AbstractC0295Gu.m625r(-285129993877557L);
        CherryXposedAPI r0 = INSTANCE;
        Class<?> r2 = r0.getClassFromArg(r6, 1);
        if (r2 != null) goto L5;
        return 0;
    L5:
        String r4 = r6.toString(2);
        if (r4 != null) goto L12;
        return 0;
    L12:
        r0.pushResult(r6, XposedHelpers.getStaticObjectField(r2, r4));     // Catch: Exception -> L10
    L11:
        return 1;
    L10:
        AbstractC0213Ey.m412j(-285138583812149L, -285207303288885L, r6);
        goto L11
    }

    private static final int registerFieldAPI$lambda$33(Lua r5) {
        AbstractC0295Gu.m625r(-285306087536693L);
        Class<?> r0 = INSTANCE.getClassFromArg(r5, 1);
        if (r0 != null) goto L5;
        return 0;
    L5:
        String r3 = r5.toString(2);
        if (r3 != null) goto L13;
        return 0;
    L13:
        XposedHelpers.setStaticObjectField(r0, r3, r5.toObject(3));     // Catch: Exception -> L11
        r5.push(true);     // Catch: Exception -> L11
    L12:
        return 1;
    L11:
        AbstractC0295Gu.m625r(-285314677471285L);
        AbstractC0295Gu.m625r(-284833641134133L);
        r5.push(false);
        goto L12
    }

    private static final int registerFieldAPI$lambda$34(Lua r4) {
        AbstractC0295Gu.m625r(-284932425381941L);
        if (r4.toObject(1) != null) goto L6;
        return 0;
    L6:
        if (r4.toString(2) != null) goto L12;
        return 0;
    L12:
        r4.push(Double.valueOf(XposedHelpers.getIntField(r1, r3)));     // Catch: Exception -> L10
    L11:
        return 1;
    L10:
        r4.push(Double.valueOf(0.0d));
        goto L11
    }

    private static final int registerFieldAPI$lambda$35(Lua r6) {
        AbstractC0295Gu.m625r(-284941015316533L);
        Object r1 = r6.toObject(1);
        if (r1 != null) goto L5;
        return 0;
    L5:
        String r3 = r6.toString(2);
        if (r3 != null) goto L13;
        return 0;
    L13:
        XposedHelpers.setIntField(r1, r3, (int) r6.toNumber(3));     // Catch: Exception -> L11
        r6.push(true);     // Catch: Exception -> L11
    L12:
        return 1;
    L11:
        r6.push(false);
        goto L12
    }

    private static final int registerFieldAPI$lambda$36(Lua r4) {
        AbstractC0295Gu.m625r(-284949605251125L);
        Object r1 = r4.toObject(1);
        if (r1 != null) goto L5;
        return 0;
    L5:
        String r3 = r4.toString(2);
        if (r3 != null) goto L12;
        return 0;
    L12:
        r4.push(XposedHelpers.getBooleanField(r1, r3));     // Catch: Exception -> L10
    L11:
        return 1;
    L10:
        r4.push(false);
        goto L11
    }

    private static final int registerFieldAPI$lambda$37(Lua r5) {
        AbstractC0295Gu.m625r(-284958195185717L);
        Object r1 = r5.toObject(1);
        if (r1 != null) goto L5;
        return 0;
    L5:
        String r3 = r5.toString(2);
        if (r3 != null) goto L13;
        return 0;
    L13:
        XposedHelpers.setBooleanField(r1, r3, r5.toBoolean(3));     // Catch: Exception -> L11
        r5.push(true);     // Catch: Exception -> L11
    L12:
        return 1;
    L11:
        r5.push(false);
        goto L12
    }

    private static final int registerFieldAPI$lambda$38(Lua r4) {
        AbstractC0295Gu.m625r(-284966785120309L);
        if (r4.toObject(1) != null) goto L6;
        return 0;
    L6:
        if (r4.toString(2) != null) goto L12;
        return 0;
    L12:
        r4.push(Double.valueOf(XposedHelpers.getLongField(r1, r3)));     // Catch: Exception -> L10
    L11:
        return 1;
    L10:
        r4.push(Double.valueOf(0.0d));
        goto L11
    }

    private static final int registerFieldAPI$lambda$39(Lua r6) {
        AbstractC0295Gu.m625r(-284975375054901L);
        Object r1 = r6.toObject(1);
        if (r1 != null) goto L5;
        return 0;
    L5:
        String r3 = r6.toString(2);
        if (r3 != null) goto L13;
        return 0;
    L13:
        XposedHelpers.setLongField(r1, r3, (long) r6.toNumber(3));     // Catch: Exception -> L11
        r6.push(true);     // Catch: Exception -> L11
    L12:
        return 1;
    L11:
        r6.push(false);
        goto L12
    }

    private static final int registerFieldAPI$lambda$40(Lua r4) {
        AbstractC0295Gu.m625r(-284983964989493L);
        Class<?> r0 = INSTANCE.getClassFromArg(r4, 1);
        if (r0 != null) goto L5;
        return 0;
    L5:
        String r3 = r4.toString(2);
        if (r3 != null) goto L12;
        return 0;
    L12:
        r4.push(XposedHelpers.findField(r0, r3), Lua.Conversion.SEMI);     // Catch: Exception -> L10
    L11:
        return 1;
    L10:
        r4.pushNil();
        goto L11
    }

    private static final int registerFieldAPI$lambda$42(Lua r7) {
        AbstractC0295Gu.m625r(-284992554924085L);
        Class<?> r0 = INSTANCE.getClassFromArg(r7, 1);
        int r2 = 0;
        if (r0 != null) goto L5;
        return 0;
    L5:
        Field[] r02 = r0.getDeclaredFields();
        r7.createTable(r02.length, 0);
        int r3 = r02.length;
        int r4 = 0;
    L6:
        if (r2 >= r3) goto L8;
        r4 = r4 + 1;
        r7.push(r02[r2], Lua.Conversion.SEMI);
        r7.rawSetI(-2, r4);
        r2 = r2 + 1;
        goto L6
    L8:
        return 1;
    }

    private final void registerHookAPI(Lua r5) {
        r5.push(new C1250c9(10));
        r5.setField(-2, AbstractC0295Gu.m625r(-313030101432373L));
        r5.push(new C1250c9(11));
        r5.setField(-2, AbstractC0295Gu.m625r(-313051576268853L));
        r5.push(new C1250c9(12));
        r5.setField(-2, AbstractC0295Gu.m625r(-311449553467445L));
        r5.push(new C1250c9(13));
        r5.setField(-2, AbstractC0295Gu.m625r(-311492503140405L));
        r5.push(new C1250c9(14));
        r5.setField(-2, AbstractC0295Gu.m625r(-311544042747957L));
        r5.push(new C1250c9(16));
        r5.setField(-2, AbstractC0295Gu.m625r(-311612762224693L));
        r5.push(new C1250c9(17));
        r5.setField(-2, AbstractC0295Gu.m625r(-311677186734133L));
    }

    private static final int registerHookAPI$lambda$0(Lua r5) {
        AbstractC0295Gu.m625r(-289807213262901L);
        if (r5.isTable(1) == true) goto L16;
        r5.pushNil();
        r5.push(AbstractC0295Gu.m625r(-289815803197493L));
        return 2;
    L16:
        String r1 = INSTANCE.doHook(r5, 1, HookType.NORMAL);     // Catch: Exception -> L10
        if (r1 == null) goto L12;
        r5.push(r1);     // Catch: Exception -> L10
        return 1;
    L12:
        r5.pushNil();     // Catch: Exception -> L10
        r5.push(AbstractC0295Gu.m625r(-289953242150965L));     // Catch: Exception -> L10
        return 2;
    L10:
        e = move-exception;
        AbstractC0295Gu.m625r(-288355514316853L);
        AbstractC0295Gu.m625r(-288424233793589L);
        r5.pushNil();
        AbstractC0213Ey.m415m(-288471478433845L, new StringBuilder(), e, r5);
        return 2;
    }

    private static final int registerHookAPI$lambda$1(Lua r4) {
        AbstractC0295Gu.m625r(-288527313008693L);
        String r0 = INSTANCE.doSimpleHook(r4, HookType.BEFORE);     // Catch: Exception -> L8
        if (r0 == null) goto L6;
        r4.push(r0);     // Catch: Exception -> L8
    L11:
        return 1;
    L6:
        r4.pushNil();     // Catch: Exception -> L8
    L8:
        AbstractC0213Ey.m412j(-288535902943285L, -288604622420021L, r4);
        return 1;
    }

    private static final int registerHookAPI$lambda$11(Lua r12) {
        AbstractC0295Gu.m625r(-287917427652661L);
        String r1 = r12.toString(1);
        int r2 = 0;
        if (r1 != null) goto L6;
        return 0;
    L6:
        if (r12.isFunction(2) == true) goto L8;
        return 0;
    L8:
        r12.pushValue(2);
        int r7 = r12.ref();
        Class<?> r3 = INSTANCE.findClass(r1);     // Catch: Exception -> L13
        if (r3 != null) goto L14;
        r12.pushNil();     // Catch: Exception -> L13
        return 1;
    L14:
        ArrayList r4 = new ArrayList();     // Catch: Exception -> L13
        int r5 = 1;
        C2694x r11 = new C2694x(r5, r3.getDeclaredConstructors());     // Catch: Exception -> L13
    L16:
        if (r11.hasNext() == false) goto L20;
        Constructor r32 = (Constructor) r11.next();     // Catch: Exception -> L13
        CherryXposedAPI r52 = INSTANCE;     // Catch: Exception -> L13
        Lua r6 = r12;
        XC_MethodHook.Unhook r122 = XposedBridge.hookMethod(r32, r52.createMethodCallback(r6, r7, -1, -1, false));     // Catch: Exception -> L30
        String r33 = r52.generateHookId(r1, AbstractC0295Gu.m625r(-287926017587253L));     // Catch: Exception -> L30
        activeHooks.put(r33, r122);     // Catch: Exception -> L30
        r4.add(r33);     // Catch: Exception -> L30
        r12 = r6;
    L28:
        AbstractC0213Ey.m412j(-287956082358325L, -288024801835061L, r6);
    L29:
        return 1;
    L20:
        r6 = r12;
        r6.createTable(r4.size(), 0);     // Catch: Exception -> L30
        Iterator r123 = r4.iterator();     // Catch: Exception -> L30
    L22:
        if (r123.hasNext() == false) goto L29;
        Object r13 = r123.next();     // Catch: Exception -> L30
        int r34 = r2 + 1;     // Catch: Exception -> L30
        if (r2 < 0) goto L26;
        r6.push((String) r13);     // Catch: Exception -> L30
        r6.rawSetI(-2, r34);     // Catch: Exception -> L30
        r2 = r34;
        goto L22
    L26:
        AbstractC2496sa.m4978c0();     // Catch: Exception -> L30
        throw null;     // Catch: Exception -> L30
    L13:
        r6 = r12;
        goto L28
    }

    private static final int registerHookAPI$lambda$2(Lua r4) {
        AbstractC0295Gu.m625r(-288127881050165L);
        String r0 = INSTANCE.doSimpleHook(r4, HookType.AFTER);     // Catch: Exception -> L8
        if (r0 == null) goto L6;
        r4.push(r0);     // Catch: Exception -> L8
    L11:
        return 1;
    L6:
        r4.pushNil();     // Catch: Exception -> L8
    L8:
        AbstractC0213Ey.m412j(-288136470984757L, -288205190461493L, r4);
        return 1;
    }

    private static final int registerHookAPI$lambda$3(Lua r5) {
        AbstractC0295Gu.m625r(-288273909938229L);
        if (r5.isTable(1) == true) goto L16;
        r5.pushNil();
        r5.push(AbstractC0295Gu.m625r(-288282499872821L));
        return 2;
    L16:
        String r1 = INSTANCE.doHook(r5, 1, HookType.REPLACE);     // Catch: Exception -> L10
        if (r1 == null) goto L12;
        r5.push(r1);     // Catch: Exception -> L10
        return 1;
    L12:
        r5.pushNil();     // Catch: Exception -> L10
        r5.push(AbstractC0295Gu.m625r(-288999759411253L));     // Catch: Exception -> L10
        return 2;
    L10:
        e = move-exception;
        AbstractC0295Gu.m625r(-289051299018805L);
        AbstractC0295Gu.m625r(-289120018495541L);
        r5.pushNil();
        AbstractC0213Ey.m415m(-288647572092981L, new StringBuilder(), e, r5);
        return 2;
    }

    private static final int registerHookAPI$lambda$4(Lua r5) {
        AbstractC0295Gu.m625r(-288733471438901L);
        if (r5.isTable(1) == true) goto L16;
        r5.pushNil();
        r5.push(AbstractC0295Gu.m625r(-288742061373493L));
        return 2;
    L16:
        String r1 = INSTANCE.doHookConstructor(r5, 1);     // Catch: Exception -> L10
        if (r1 == null) goto L12;
        r5.push(r1);     // Catch: Exception -> L10
        return 1;
    L12:
        r5.pushNil();     // Catch: Exception -> L10
        r5.push(AbstractC0295Gu.m625r(-287277477525557L));     // Catch: Exception -> L10
        return 2;
    L10:
        e = move-exception;
        AbstractC0295Gu.m625r(-287380556740661L);
        AbstractC0295Gu.m625r(-287449276217397L);
        r5.pushNil();
        AbstractC0213Ey.m415m(-286994009684021L, new StringBuilder(), e, r5);
        return 2;
    }

    private static final int registerHookAPI$lambda$8(Lua r13) {
        AbstractC0295Gu.m625r(-287097088899125L);
        String r1 = r13.toString(1);
        int r2 = 0;
        if (r1 != null) goto L5;
        return 0;
    L5:
        String r3 = r13.toString(2);
        if (r3 != null) goto L9;
        return 0;
    L9:
        if (r13.isFunction(3) == true) goto L11;
        return 0;
    L11:
        r13.pushValue(3);
        int r8 = r13.ref();
        Class<?> r4 = INSTANCE.findClass(r1);     // Catch: Exception -> L16
        if (r4 != null) goto L17;
        r13.pushNil();     // Catch: Exception -> L16
        return 1;
    L17:
        ArrayList r5 = new ArrayList();     // Catch: Exception -> L16
        Method[] r42 = r4.getDeclaredMethods();     // Catch: Exception -> L16
        AbstractC0295Gu.m625r(-287105678833717L);     // Catch: Exception -> L16
        ArrayList r6 = new ArrayList();     // Catch: Exception -> L16
        int r7 = r42.length;     // Catch: Exception -> L16
        int r9 = 0;
    L18:
        if (r9 >= r7) goto L23;
        Method r10 = r42[r9];     // Catch: Exception -> L16
        if (AbstractC0585Nj.m1134a(r10.getName(), r3) == false) goto L22;
        r6.add(r10);     // Catch: Exception -> L16
    L22:
        r9 = r9 + 1;     // Catch: Exception -> L16
        goto L18
    L23:
        Iterator r43 = r6.iterator();     // Catch: Exception -> L16
    L25:
        if (r43.hasNext() == false) goto L29;
        Method r12 = (Method) r43.next();     // Catch: Exception -> L16
        CherryXposedAPI r62 = INSTANCE;     // Catch: Exception -> L16
        Lua r72 = r13;
        XC_MethodHook.Unhook r132 = XposedBridge.hookMethod(r12, r62.createMethodCallback(r72, r8, -1, -1, false));     // Catch: Exception -> L39
        String r63 = r62.generateHookId(r1, r3);     // Catch: Exception -> L39
        activeHooks.put(r63, r132);     // Catch: Exception -> L39
        r5.add(r63);     // Catch: Exception -> L39
        r13 = r72;
    L37:
        AbstractC0213Ey.m412j(-287208758048821L, -287827233339445L, r72);
    L38:
        return 1;
    L29:
        r72 = r13;
        r72.createTable(r5.size(), 0);     // Catch: Exception -> L39
        Iterator r133 = r5.iterator();     // Catch: Exception -> L39
    L31:
        if (r133.hasNext() == false) goto L38;
        Object r14 = r133.next();     // Catch: Exception -> L39
        int r32 = r2 + 1;     // Catch: Exception -> L39
        if (r2 < 0) goto L35;
        r72.push((String) r14);     // Catch: Exception -> L39
        r72.rawSetI(-2, r32);     // Catch: Exception -> L39
        r2 = r32;
        goto L31
    L35:
        AbstractC2496sa.m4978c0();     // Catch: Exception -> L39
        throw null;     // Catch: Exception -> L39
    L16:
        r72 = r13;
        goto L37
    }

    private final void registerHookManagementAPI(Lua r5) {
        r5.push(new C1207b9(20));
        r5.setField(-2, AbstractC0295Gu.m625r(-309190400669749L));
        r5.push(new C1207b9(21));
        r5.setField(-2, AbstractC0295Gu.m625r(-309220465440821L));
        r5.push(new C1207b9(22));
        r5.setField(-2, AbstractC0295Gu.m625r(-309813170927669L));
        r5.push(new C1207b9(23));
        r5.setField(-2, AbstractC0295Gu.m625r(-309877595437109L));
    }

    private static final int registerHookManagementAPI$lambda$59(Lua r4) {
        AbstractC0295Gu.m625r(-284769216624693L);
        String r1 = r4.toString(1);
        if (r1 != null) goto L5;
        return 0;
    L5:
        XC_MethodHook.Unhook r12 = activeHooks.remove(r1);
        if (r12 == null) goto L8;
        r12.unhook();
        AbstractC0295Gu.m625r(-284228050745397L);
        AbstractC0295Gu.m625r(-284296770222133L);
        r4.push(true);
    L9:
        return 1;
    L8:
        r4.push(false);
        goto L9
    }

    private static final int registerHookManagementAPI$lambda$61(Lua r4) {
        AbstractC0295Gu.m625r(-284344014862389L);
        ConcurrentHashMap<String, XC_MethodHook.Unhook> r0 = activeHooks;
        int r1 = r0.size();
        Collection<XC_MethodHook.Unhook> r02 = r0.values();
        AbstractC0295Gu.m625r(-284352604796981L);
        Iterator<T> r03 = r02.iterator();
    L4:
        if (r03.hasNext() == false) goto L6;
        ((XC_MethodHook.Unhook) r03.next()).unhook();
        goto L4
    L6:
        activeHooks.clear();
        AbstractC0295Gu.m625r(-284429914208309L);
        AbstractC0295Gu.m625r(-284498633685045L);
        AbstractC0295Gu.m625r(-282913790752821L);
        r4.push(Double.valueOf(r1));
        return 1;
    }

    private static final int registerHookManagementAPI$lambda$63(Lua r4) {
        AbstractC0295Gu.m625r(-282943855523893L);
        Set<String> r0 = activeHooks.keySet();
        AbstractC0295Gu.m625r(-282952445458485L);
        List r02 = AbstractC2453ra.m4908r0(r0);
        int r2 = 0;
        r4.createTable(r02.size(), 0);
        Iterator r03 = r02.iterator();
    L4:
        if (r03.hasNext() == false) goto L10;
        Object r1 = r03.next();
        int r3 = r2 + 1;
        if (r2 < 0) goto L8;
        r4.push((String) r1);
        r4.rawSetI(-2, r3);
        r2 = r3;
        goto L4
    L8:
        AbstractC2496sa.m4978c0();
        throw null;
    L10:
        return 1;
    }

    private static final int registerHookManagementAPI$lambda$64(Lua r2) {
        AbstractC0295Gu.m625r(-283021164935221L);
        r2.push(Double.valueOf(activeHooks.size()));
        return 1;
    }

    private final void registerMethodAPI(Lua r5) {
        r5.push(new C1207b9(24));
        r5.setField(-2, AbstractC0295Gu.m625r(-312231237515317L));
        r5.push(new C1207b9(25));
        r5.setField(-2, AbstractC0295Gu.m625r(-311728726341685L));
        r5.push(new C1207b9(27));
        r5.setField(-2, AbstractC0295Gu.m625r(-311801740785717L));
        r5.push(new C1207b9(28));
        r5.setField(-2, AbstractC0295Gu.m625r(-311857575360565L));
        r5.push(new C1207b9(29));
        r5.setField(-2, AbstractC0295Gu.m625r(-311904820000821L));
        r5.push(new C1250c9(0));
        r5.setField(-2, AbstractC0295Gu.m625r(-310341451905077L));
    }

    private static final int registerMethodAPI$lambda$22(Lua r7) {
        AbstractC0295Gu.m625r(-287655434647605L);
        Object r1 = r7.toObject(1);
        if (r1 != null) goto L5;
        return 0;
    L5:
        String r4 = r7.toString(2);
        if (r4 != null) goto L13;
        return 0;
    L13:
        CherryXposedAPI r2 = INSTANCE;     // Catch: Exception -> L10
        Object[] r5 = r2.getArgsFromStack(r7, 3);     // Catch: Exception -> L10
        r2.pushResult(r7, XposedHelpers.callMethod(r1, r4, Arrays.copyOf(r5, r5.length)));     // Catch: Exception -> L10
        return 1;
    L10:
        e = move-exception;
        AbstractC0295Gu.m625r(-287664024582197L);
        AbstractC0295Gu.m625r(-287732744058933L);
        r7.pushNil();
        AbstractC0213Ey.m415m(-286165080995893L, new StringBuilder(), e, r7);
        return 2;
    }

    private static final int registerMethodAPI$lambda$23(Lua r7) {
        AbstractC0295Gu.m625r(-286199440734261L);
        CherryXposedAPI r0 = INSTANCE;
        Class<?> r2 = r0.getClassFromArg(r7, 1);
        if (r2 != null) goto L5;
        return 0;
    L5:
        String r5 = r7.toString(2);
        if (r5 != null) goto L14;
        return 0;
    L14:
        Object[] r3 = r0.getArgsFromStack(r7, 3);     // Catch: Exception -> L11
        r0.pushResult(r7, XposedHelpers.callStaticMethod(r2, r5, Arrays.copyOf(r3, r3.length)));     // Catch: Exception -> L11
        return 1;
    L11:
        e = move-exception;
        AbstractC0295Gu.m625r(-286208030668853L);
        AbstractC0295Gu.m625r(-286276750145589L);
        r7.pushNil();
        AbstractC0213Ey.m415m(-286384124327989L, new StringBuilder(), e, r7);
        return 2;
    }

    private static final int registerMethodAPI$lambda$24(Lua r6) {
        AbstractC0295Gu.m625r(-286418484066357L);
        Object r1 = r6.toObject(1);
        if ((r1 instanceof Method) == false) goto L5;
        Method r12 = (Method) r1;
    L6:
        if (r12 != null) goto L9;
        return 0;
    L9:
        Object r2 = r6.toObject(2);
        CherryXposedAPI r3 = INSTANCE;     // Catch: Exception -> L12
        Object[] r4 = r3.getArgsFromStack(r6, 3);     // Catch: Exception -> L12
        r12.setAccessible(true);     // Catch: Exception -> L12
        r3.pushResult(r6, r12.invoke(r2, Arrays.copyOf(r4, r4.length)));     // Catch: Exception -> L12
    L13:
        return 1;
    L12:
        AbstractC0213Ey.m412j(-285877318187061L, -285946037663797L, r6);
        goto L13
    L5:
        r12 = null;
        goto L6
    }

    private static final int registerMethodAPI$lambda$26(Lua r7) {
        AbstractC0295Gu.m625r(-286027642042421L);
        CherryXposedAPI r0 = INSTANCE;
        Class<?> r2 = r0.getClassFromArg(r7, 1);
        int r3 = 0;
        if (r2 != null) goto L5;
        return 0;
    L5:
        String r4 = r7.toString(2);
        if (r4 != null) goto L25;
        return 0;
    L25:
        List<Class<?>> r02 = r0.getParamTypesFromStack(r7, 3);     // Catch: Exception -> L23
        if (r02.isEmpty() == false) goto L18;
        Method[] r03 = r2.getDeclaredMethods();     // Catch: Exception -> L23
        AbstractC0295Gu.m625r(-286036231977013L);     // Catch: Exception -> L23
        int r22 = r03.length;     // Catch: Exception -> L23
    L12:
        if (r3 >= r22) goto L17;
        Method r5 = r03[r3];     // Catch: Exception -> L23
        if (AbstractC0585Nj.m1134a(r5.getName(), r4) == true) goto L19;
        r3 = r3 + 1;     // Catch: Exception -> L23
    L19:
        if (r5 == null) goto L21;
        r7.push(r5, Lua.Conversion.SEMI);     // Catch: Exception -> L23
    L24:
        return 1;
    L21:
        r7.pushNil();     // Catch: Exception -> L23
        goto L24
    L17:
        r5 = null;
        goto L19
    L18:
        Class[] r04 = (Class[]) r02.toArray(new Class[0]);     // Catch: Exception -> L23
        r5 = XposedHelpers.findMethodExact(r2, r4, (Class[]) Arrays.copyOf(r04, r04.length));     // Catch: Exception -> L23
    L23:
        AbstractC0213Ey.m412j(-286139311192117L, -286757786482741L, r7);
        goto L24
    }

    private static final int registerMethodAPI$lambda$27(Lua r6) {
        AbstractC0295Gu.m625r(-286830800926773L);
        CherryXposedAPI r0 = INSTANCE;
        Class<?> r2 = r0.getClassFromArg(r6, 1);
        if (r2 != null) goto L5;
        return 0;
    L5:
        String r4 = r6.toString(2);
        if (r4 != null) goto L13;
        return 0;
    L13:
        Object[] r02 = r0.getArgsFromStack(r6, 3);     // Catch: Exception -> L11
        r6.push(XposedHelpers.findMethodBestMatch(r2, r4, Arrays.copyOf(r02, r02.length)), Lua.Conversion.SEMI);     // Catch: Exception -> L11
    L12:
        return 1;
    L11:
        AbstractC0213Ey.m412j(-286839390861365L, -286908110338101L, r6);
        goto L12
    }

    private static final int registerMethodAPI$lambda$29(Lua r7) {
        AbstractC0295Gu.m625r(-286470023673909L);
        Class<?> r0 = INSTANCE.getClassFromArg(r7, 1);
        int r2 = 0;
        if (r0 != null) goto L5;
        return 0;
    L5:
        Method[] r02 = r0.getDeclaredMethods();
        r7.createTable(r02.length, 0);
        int r3 = r02.length;
        int r4 = 0;
    L6:
        if (r2 >= r3) goto L8;
        r4 = r4 + 1;
        r7.push(r02[r2], Lua.Conversion.SEMI);
        r7.rawSetI(-2, r4);
        r2 = r2 + 1;
        goto L6
    L8:
        return 1;
    }

    private final void registerReflectionAPI(Lua r5) {
        r5.push(new C1355e9(1));
        r5.setField(-2, AbstractC0295Gu.m625r(-310856847980597L));
        r5.push(new C1355e9(2));
        r5.setField(-2, AbstractC0295Gu.m625r(-309267710081077L));
        r5.push(new C1355e9(3));
        r5.setField(-2, AbstractC0295Gu.m625r(-309323544655925L));
        r5.push(new C1355e9(4));
        r5.setField(-2, AbstractC0295Gu.m625r(-309400854067253L));
        r5.push(new C1355e9(5));
        r5.setField(-2, AbstractC0295Gu.m625r(-309460983609397L));
        r5.push(new C1207b9(16));
        r5.setField(-2, AbstractC0295Gu.m625r(-308967062370357L));
        r5.push(new C1207b9(17));
        r5.setField(-2, AbstractC0295Gu.m625r(-309044371781685L));
        r5.push(new C1207b9(18));
        r5.setField(-2, AbstractC0295Gu.m625r(-309061551650869L));
        r5.push(new C1207b9(19));
        r5.setField(-2, AbstractC0295Gu.m625r(-309125976160309L));
    }

    private static final int registerReflectionAPI$lambda$49(Lua r4) {
        AbstractC0295Gu.m625r(-283686884866101L);
        Object r1 = r4.toObject(1);
        if ((r1 instanceof AccessibleObject) == false) goto L5;
        AccessibleObject r12 = (AccessibleObject) r1;
    L7:
        if (r12 != null) goto L14;
        return 0;
    L14:
        r12.setAccessible(r4.toBoolean(2));     // Catch: Exception -> L12
        r4.push(true);     // Catch: Exception -> L12
    L13:
        return 1;
    L12:
        r4.push(false);
        goto L13
    L5:
        r12 = null;
        goto L7
    }

    private static final int registerReflectionAPI$lambda$50(Lua r6) {
        AbstractC0295Gu.m625r(-283695474800693L);
        Object r1 = r6.toObject(1);
        if ((r1 instanceof Method) == false) goto L6;
        int r12 = ((Method) r1).getModifiers();
    L14:
        r6.createTable(0, 10);
        r6.push(Modifier.isPublic(r12));
        r6.setField(-2, AbstractC0295Gu.m625r(-283704064735285L));
        r6.push(Modifier.isPrivate(r12));
        r6.setField(-2, AbstractC0295Gu.m625r(-283742719440949L));
        r6.push(Modifier.isProtected(r12));
        r6.setField(-2, AbstractC0295Gu.m625r(-283785669113909L));
        r6.push(Modifier.isStatic(r12));
        r6.setField(-2, AbstractC0295Gu.m625r(-283837208721461L));
        r6.push(Modifier.isFinal(r12));
        r6.setField(-2, AbstractC0295Gu.m625r(-283875863427125L));
        r6.push(Modifier.isAbstract(r12));
        r6.setField(-2, AbstractC0295Gu.m625r(-283910223165493L));
        r6.push(Modifier.isNative(r12));
        r6.setField(-2, AbstractC0295Gu.m625r(-284507223619637L));
        r6.push(Modifier.isSynchronized(r12));
        r6.setField(-2, AbstractC0295Gu.m625r(-284545878325301L));
        r6.push(Modifier.isVolatile(r12));
        r6.setField(-2, AbstractC0295Gu.m625r(-284610302834741L));
        r6.push(Modifier.isTransient(r12));
        r6.setField(-2, AbstractC0295Gu.m625r(-284657547474997L));
        return 1;
    L6:
        if ((r1 instanceof Field) == false) goto L9;
        r12 = ((Field) r1).getModifiers();
        goto L14
    L9:
        if ((r1 instanceof Constructor) == false) goto L12;
        r12 = ((Constructor) r1).getModifiers();
        goto L14
    L12:
        if ((r1 instanceof Class) == false) goto L16;
        r12 = ((Class) r1).getModifiers();
        goto L14
    L16:
        return 0;
    }

    private static final int registerReflectionAPI$lambda$52(Lua r7) {
        AbstractC0295Gu.m625r(-284709087082549L);
        Object r1 = r7.toObject(1);
        int r3 = 0;
        if ((r1 instanceof Method) == false) goto L6;
        Class<?>[] r12 = ((Method) r1).getParameterTypes();
    L8:
        r7.createTable(r12.length, 0);
        int r2 = r12.length;
        int r4 = 0;
    L9:
        if (r3 >= r2) goto L11;
        r4 = r4 + 1;
        r7.push(r12[r3], Lua.Conversion.SEMI);
        r7.rawSetI(-2, r4);
        r3 = r3 + 1;
        goto L9
    L11:
        return 1;
    L6:
        if ((r1 instanceof Constructor) == false) goto L12;
        r12 = ((Constructor) r1).getParameterTypes();
        goto L8
    L12:
        return 0;
    }

    private static final int registerReflectionAPI$lambda$53(Lua r3) {
        AbstractC0295Gu.m625r(-284717677017141L);
        Object r1 = r3.toObject(1);
        if ((r1 instanceof Method) == false) goto L5;
        Method r12 = (Method) r1;
    L6:
        if (r12 != null) goto L9;
        return 0;
    L9:
        r3.push(r12.getReturnType(), Lua.Conversion.SEMI);
        return 1;
    L5:
        r12 = null;
        goto L6
    }

    private static final int registerReflectionAPI$lambda$54(Lua r3) {
        AbstractC0295Gu.m625r(-284726266951733L);
        Object r1 = r3.toObject(1);
        if ((r1 instanceof Field) == false) goto L5;
        Field r12 = (Field) r1;
    L6:
        if (r12 != null) goto L9;
        return 0;
    L9:
        r3.push(r12.getType(), Lua.Conversion.SEMI);
        return 1;
    L5:
        r12 = null;
        goto L6
    }

    private static final int registerReflectionAPI$lambda$55(Lua r3) {
        AbstractC0295Gu.m625r(-284734856886325L);
        Object r1 = r3.toObject(1);
        if ((r1 instanceof Method) == false) goto L6;
        Class<?> r12 = ((Method) r1).getDeclaringClass();
    L11:
        r3.push(r12, Lua.Conversion.SEMI);
        return 1;
    L6:
        if ((r1 instanceof Field) == false) goto L9;
        r12 = ((Field) r1).getDeclaringClass();
        goto L11
    L9:
        if ((r1 instanceof Constructor) == false) goto L13;
        r12 = ((Constructor) r1).getDeclaringClass();
        goto L11
    L13:
        return 0;
    }

    private static final int registerReflectionAPI$lambda$56(Lua r2) {
        AbstractC0295Gu.m625r(-284743446820917L);
        r2.toString(1);
        return 0;
    }

    private static final int registerReflectionAPI$lambda$57(Lua r2) {
        AbstractC0295Gu.m625r(-284752036755509L);
        List<ClassLoader> r0 = classLoaders;
        if (r0.isEmpty() == true) goto L5;
        r2.push(r0.get(0), Lua.Conversion.SEMI);
        return 1;
    L5:
        r2.pushNil();
        return 1;
    }

    private static final int registerReflectionAPI$lambda$58(Lua r4) {
        AbstractC0295Gu.m625r(-284760626690101L);
        Object r1 = r4.toObject(1);
        if ((r1 instanceof ClassLoader) == false) goto L5;
        ClassLoader r12 = (ClassLoader) r1;
    L6:
        if (r12 != null) goto L9;
        return 0;
    L9:
        List<ClassLoader> r2 = classLoaders;
        if (r2.contains(r12) == true) goto L12;
        r2.add(r12);
    L12:
        r4.push(true);
        return 1;
    L5:
        r12 = null;
        goto L6
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ int m3410s(Lua r0) {
        return registerConstructorAPI$lambda$43(r0);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ int m3411t(Lua r0) {
        return registerHookManagementAPI$lambda$61(r0);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ int m3412u(Lua r0) {
        return registerMethodAPI$lambda$27(r0);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ int m3413v(Lua r0) {
        return registerReflectionAPI$lambda$52(r0);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ int m3414w(Lua r0) {
        return registerMethodAPI$lambda$26(r0);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ int m3415x(Lua r0) {
        return registerFieldAPI$lambda$32(r0);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ int m3416y(Lua r0) {
        return registerClassAPI$lambda$21(r0);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ int m3417z(Lua r0) {
        return registerHookManagementAPI$lambda$59(r0);
    }

    public final void cleanup() {
        Collection<XC_MethodHook.Unhook> r0 = activeHooks.values();
        AbstractC0295Gu.m625r(-290064911300661L);
        Iterator<T> r02 = r0.iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((XC_MethodHook.Unhook) r02.next()).unhook();
        goto L4
    L6:
        activeHooks.clear();
        AbstractC0295Gu.m625r(-290142220711989L);
        AbstractC0295Gu.m625r(-290210940188725L);
    }

    public final void register(Lua r3, List<? extends ClassLoader> r4) {
        AbstractC0295Gu.m625r(-313253439731765L);
        AbstractC0295Gu.m625r(-313270619600949L);
        List<ClassLoader> r0 = classLoaders;
        r0.clear();
        r0.addAll(r4);
        r3.createTable(0, 40);
        registerHookAPI(r3);
        registerClassAPI(r3);
        registerMethodAPI(r3);
        registerFieldAPI(r3);
        registerConstructorAPI(r3);
        registerReflectionAPI(r3);
        registerHookManagementAPI(r3);
        AbstractC0295Gu.m625r(-313304979339317L);
        AbstractC0295Gu.m625r(-312823943002165L);
        r0.size();
        AbstractC0295Gu.m625r(-312965676922933L);
    }
}
