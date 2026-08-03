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
    private static long hookCounter;
    private static final String TAG = AbstractC0295Gu.m625r(-283055524673589L);
    public static final CherryXposedAPI INSTANCE = new CherryXposedAPI();
    private static final List<ClassLoader> classLoaders = new ArrayList();
    private static final ConcurrentHashMap<String, XC_MethodHook.Unhook> activeHooks = new ConcurrentHashMap<>();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class HookType {
        private static final /* synthetic */ InterfaceC2279ng $ENTRIES;
        private static final /* synthetic */ HookType[] $VALUES;
        public static final HookType NORMAL = new HookType(AbstractC0295Gu.m625r(-313133180647477L), 0);
        public static final HookType BEFORE = new HookType(AbstractC0295Gu.m625r(-313163245418549L), 1);
        public static final HookType AFTER = new HookType(AbstractC0295Gu.m625r(-313193310189621L), 2);
        public static final HookType REPLACE = new HookType(AbstractC0295Gu.m625r(-313219079993397L), 3);

        private static final /* synthetic */ HookType[] $values() {
            return new HookType[]{NORMAL, BEFORE, AFTER, REPLACE};
        }

        static {
            HookType[] hookTypeArr$values = $values();
            $VALUES = hookTypeArr$values;
            $ENTRIES = new C2322og(hookTypeArr$values);
        }

        private HookType(String str, int i) {
        }

        public static InterfaceC2279ng getEntries() {
            return $ENTRIES;
        }

        public static HookType valueOf(String str) {
            return (HookType) Enum.valueOf(HookType.class, str);
        }

        public static HookType[] values() {
            return (HookType[]) $VALUES.clone();
        }
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HookType.values().length];
            try {
                iArr[HookType.REPLACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HookType.BEFORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HookType.AFTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.github.cherrywechat.lua.api.CherryXposedAPI$createMethodCallback$1 */
    public static final class C15531 extends XC_MethodHook {
        final /* synthetic */ int $afterRef;
        final /* synthetic */ int $beforeRef;
        final /* synthetic */ boolean $isReplace;
        final /* synthetic */ Lua $lua;
        final /* synthetic */ int $replaceRef;

        public C15531(boolean z, int i, Lua lua, int i2, int i3) {
            this.$isReplace = z;
            this.$replaceRef = i;
            this.$lua = lua;
            this.$beforeRef = i2;
            this.$afterRef = i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C0829TC afterHookedMethod$lambda$2(Lua lua, int i, XC_MethodHook.MethodHookParam methodHookParam) {
            try {
                lua.refGet(i);
                CherryXposedAPI.INSTANCE.pushMethodParam(lua, methodHookParam);
                lua.pCall(1, 0);
            } catch (Exception unused) {
                AbstractC0295Gu.m625r(-312780993329205L);
                AbstractC0295Gu.m625r(-312299956992053L);
                lua.setTop(0);
            }
            return C0829TC.f2620a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C0829TC beforeHookedMethod$lambda$0(Lua lua, int i, XC_MethodHook.MethodHookParam methodHookParam) {
            try {
                lua.refGet(i);
                CherryXposedAPI.INSTANCE.pushMethodParam(lua, methodHookParam);
                lua.pCall(1, 1);
                methodHookParam.setResult(lua.toObject(-1));
                lua.pop(1);
            } catch (Exception unused) {
                AbstractC0295Gu.m625r(-314099548289077L);
                AbstractC0295Gu.m625r(-314168267765813L);
                lua.setTop(0);
            }
            return C0829TC.f2620a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C0829TC beforeHookedMethod$lambda$1(Lua lua, int i, XC_MethodHook.MethodHookParam methodHookParam) {
            try {
                lua.refGet(i);
                CherryXposedAPI.INSTANCE.pushMethodParam(lua, methodHookParam);
                lua.pCall(1, 0);
            } catch (Exception unused) {
                AbstractC0295Gu.m625r(-312617784571957L);
                AbstractC0295Gu.m625r(-312686504048693L);
                lua.setTop(0);
            }
            return C0829TC.f2620a;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            int i;
            AbstractC0295Gu.m625r(-314073778485301L);
            if (!this.$isReplace && (i = this.$afterRef) >= 0) {
                LuaLocks luaLocks = LuaLocks.INSTANCE;
                Lua lua = this.$lua;
                luaLocks.withLock(lua, new C1399f9(lua, i, methodHookParam, 2));
            }
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            int i;
            AbstractC0295Gu.m625r(-314048008681525L);
            if (this.$isReplace && (i = this.$replaceRef) >= 0) {
                LuaLocks luaLocks = LuaLocks.INSTANCE;
                Lua lua = this.$lua;
                luaLocks.withLock(lua, new C1399f9(lua, i, methodHookParam, 0));
            } else {
                int i2 = this.$beforeRef;
                if (i2 >= 0) {
                    LuaLocks luaLocks2 = LuaLocks.INSTANCE;
                    Lua lua2 = this.$lua;
                    luaLocks2.withLock(lua2, new C1399f9(lua2, i2, methodHookParam, 1));
                }
            }
        }
    }

    /* JADX INFO: renamed from: io.github.cherrywechat.lua.api.CherryXposedAPI$createReplaceCallback$1 */
    public static final class C15541 extends XC_MethodReplacement {
        final /* synthetic */ Lua $lua;
        final /* synthetic */ int $replaceRef;

        public C15541(Lua lua, int i) {
            this.$lua = lua;
            this.$replaceRef = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object replaceHookedMethod$lambda$0(Lua lua, int i, XC_MethodHook.MethodHookParam methodHookParam) {
            try {
                lua.refGet(i);
                CherryXposedAPI.INSTANCE.pushMethodParam(lua, methodHookParam);
                lua.pCall(1, 1);
                Object object = lua.toObject(-1);
                lua.pop(1);
                return object;
            } catch (Exception unused) {
                AbstractC0295Gu.m625r(-312415921109045L);
                AbstractC0295Gu.m625r(-312484640585781L);
                lua.setTop(0);
                return null;
            }
        }

        public Object replaceHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            AbstractC0295Gu.m625r(-312390151305269L);
            LuaLocks luaLocks = LuaLocks.INSTANCE;
            Lua lua = this.$lua;
            return luaLocks.withLock(lua, new C1399f9(lua, this.$replaceRef, methodHookParam, 3));
        }
    }

    private CherryXposedAPI() {
    }

    private final XC_MethodHook createMethodCallback(Lua lua, int i, int i2, int i3, boolean z) {
        return new C15531(z, i3, lua, i, i2);
    }

    private final XC_MethodReplacement createReplaceCallback(Lua lua, int i) {
        return new C15541(lua, i);
    }

    private final String doHook(Lua lua, int i, HookType hookType) {
        int iRef;
        int iRef2;
        XC_MethodHook.Unhook unhookHookMethod;
        lua.getField(i, AbstractC0295Gu.m625r(-309959199815733L));
        int iRef3 = -1;
        String string = lua.toString(-1);
        lua.pop(1);
        lua.getField(i, AbstractC0295Gu.m625r(-309984969619509L));
        String string2 = lua.toString(-1);
        lua.pop(1);
        if (string == null || string2 == null) {
            AbstractC0295Gu.m625r(-310015034390581L);
            AbstractC0295Gu.m625r(-309533998053429L);
            return null;
        }
        lua.getField(i, AbstractC0295Gu.m625r(-309688616876085L));
        List<String> stringArray = (lua.isNil(-1) || !lua.isTable(-1)) ? null : readStringArray(lua, -1);
        lua.pop(1);
        lua.getField(i, AbstractC0295Gu.m625r(-309718681647157L));
        if (lua.isFunction(-1)) {
            iRef = lua.ref();
        } else {
            lua.pop(1);
            iRef = -1;
        }
        lua.getField(i, AbstractC0295Gu.m625r(-309748746418229L));
        if (lua.isFunction(-1)) {
            iRef2 = lua.ref();
        } else {
            lua.pop(1);
            iRef2 = -1;
        }
        lua.getField(i, AbstractC0295Gu.m625r(-309774516222005L));
        if (lua.isFunction(-1)) {
            iRef3 = lua.ref();
        } else {
            lua.pop(1);
        }
        int i2 = iRef3;
        Class<?> clsFindClass = findClass(string);
        if (clsFindClass == null) {
            AbstractC0295Gu.m625r(-308159608518709L);
            AbstractC0295Gu.m625r(-308228327995445L);
            return null;
        }
        XC_MethodReplacement xC_MethodReplacementCreateReplaceCallback = WhenMappings.$EnumSwitchMapping$0[hookType.ordinal()] == 1 ? createReplaceCallback(lua, i2) : createMethodCallback(lua, iRef, iRef2, i2, hookType == HookType.REPLACE);
        try {
            if (stringArray != null) {
                ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(stringArray, 10));
                Iterator<T> it = stringArray.iterator();
                while (it.hasNext()) {
                    arrayList.add(INSTANCE.findClass((String) it.next()));
                }
                Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
                unhookHookMethod = XposedBridge.hookMethod(XposedHelpers.findMethodExact(clsFindClass, string2, (Class[]) Arrays.copyOf(clsArr, clsArr.length)), xC_MethodReplacementCreateReplaceCallback);
            } else {
                Method[] declaredMethods = clsFindClass.getDeclaredMethods();
                AbstractC0295Gu.m625r(-308305637406773L);
                ArrayList arrayList2 = new ArrayList();
                for (Method method : declaredMethods) {
                    if (AbstractC0585Nj.m1134a(method.getName(), string2)) {
                        arrayList2.add(method);
                    }
                }
                if (arrayList2.isEmpty()) {
                    AbstractC0295Gu.m625r(-308408716621877L);
                    AbstractC0295Gu.m625r(-307927680284725L);
                    return null;
                }
                unhookHookMethod = XposedBridge.hookMethod((Member) AbstractC2453ra.m4898h0(arrayList2), xC_MethodReplacementCreateReplaceCallback);
            }
            String strGenerateHookId = generateHookId(string, string2);
            activeHooks.put(strGenerateHookId, unhookHookMethod);
            AbstractC0295Gu.m625r(-308009284663349L);
            AbstractC0295Gu.m625r(-308078004140085L);
            AbstractC0295Gu.m625r(-308116658845749L);
            return strGenerateHookId;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-308138133682229L);
            AbstractC0295Gu.m625r(-308756608972853L);
            return null;
        }
    }

    private final String doHookConstructor(Lua lua, int i) {
        int iRef;
        XC_MethodHook.Unhook unhookHookMethod;
        lua.getField(i, AbstractC0295Gu.m625r(-308520385771573L));
        int iRef2 = -1;
        String string = lua.toString(-1);
        lua.pop(1);
        if (string == null) {
            AbstractC0295Gu.m625r(-308546155575349L);
            AbstractC0295Gu.m625r(-308614875052085L);
            return null;
        }
        lua.getField(i, AbstractC0295Gu.m625r(-289536630323253L));
        List<String> stringArray = (lua.isNil(-1) || !lua.isTable(-1)) ? null : readStringArray(lua, -1);
        lua.pop(1);
        lua.getField(i, AbstractC0295Gu.m625r(-289566695094325L));
        if (lua.isFunction(-1)) {
            iRef = lua.ref();
        } else {
            lua.pop(1);
            iRef = -1;
        }
        lua.getField(i, AbstractC0295Gu.m625r(-289596759865397L));
        if (lua.isFunction(-1)) {
            iRef2 = lua.ref();
        } else {
            lua.pop(1);
        }
        int i2 = iRef2;
        Class<?> clsFindClass = findClass(string);
        if (clsFindClass == null) {
            return null;
        }
        XC_MethodHook xC_MethodHookCreateMethodCallback = createMethodCallback(lua, iRef, i2, -1, false);
        try {
            if (stringArray != null) {
                ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(stringArray, 10));
                Iterator<T> it = stringArray.iterator();
                while (it.hasNext()) {
                    arrayList.add(INSTANCE.findClass((String) it.next()));
                }
                Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
                unhookHookMethod = XposedBridge.hookMethod(XposedHelpers.findConstructorExact(clsFindClass, (Class[]) Arrays.copyOf(clsArr, clsArr.length)), xC_MethodHookCreateMethodCallback);
            } else {
                Constructor<?>[] declaredConstructors = clsFindClass.getDeclaredConstructors();
                if (declaredConstructors.length == 0) {
                    return null;
                }
                if (declaredConstructors.length == 0) {
                    throw new NoSuchElementException("Array is empty.");
                }
                unhookHookMethod = XposedBridge.hookMethod(declaredConstructors[0], xC_MethodHookCreateMethodCallback);
            }
            String strGenerateHookId = generateHookId(string, AbstractC0295Gu.m625r(-289622529669173L));
            activeHooks.put(strGenerateHookId, unhookHookMethod);
            return strGenerateHookId;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-289652594440245L);
            AbstractC0295Gu.m625r(-289721313916981L);
            return null;
        }
    }

    private final String doSimpleHook(Lua lua, HookType hookType) {
        String string;
        XC_MethodHook xC_MethodHookCreateMethodCallback;
        XC_MethodHook.Unhook unhookHookMethod;
        String string2 = lua.toString(1);
        if (string2 == null || (string = lua.toString(2)) == null) {
            return null;
        }
        boolean z = lua.getTop() >= 4 && lua.isTable(3);
        int i = z ? 4 : 3;
        if (!lua.isFunction(i)) {
            return null;
        }
        List<String> stringArray = z ? readStringArray(lua, 3) : null;
        lua.pushValue(i);
        int iRef = lua.ref();
        Class<?> clsFindClass = findClass(string2);
        if (clsFindClass == null) {
            return null;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[hookType.ordinal()];
        if (i2 == 2) {
            xC_MethodHookCreateMethodCallback = createMethodCallback(lua, iRef, -1, -1, false);
        } else {
            if (i2 != 3) {
                return null;
            }
            xC_MethodHookCreateMethodCallback = createMethodCallback(lua, -1, iRef, -1, false);
        }
        try {
            if (stringArray != null) {
                ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(stringArray, 10));
                Iterator<T> it = stringArray.iterator();
                while (it.hasNext()) {
                    arrayList.add(INSTANCE.findClass((String) it.next()));
                }
                Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
                unhookHookMethod = XposedBridge.hookMethod(XposedHelpers.findMethodExact(clsFindClass, string, (Class[]) Arrays.copyOf(clsArr, clsArr.length)), xC_MethodHookCreateMethodCallback);
            } else {
                Method[] declaredMethods = clsFindClass.getDeclaredMethods();
                AbstractC0295Gu.m625r(-308816738514997L);
                ArrayList arrayList2 = new ArrayList();
                for (Method method : declaredMethods) {
                    if (AbstractC0585Nj.m1134a(method.getName(), string)) {
                        arrayList2.add(method);
                    }
                }
                if (arrayList2.isEmpty()) {
                    return null;
                }
                unhookHookMethod = XposedBridge.hookMethod((Member) AbstractC2453ra.m4898h0(arrayList2), xC_MethodHookCreateMethodCallback);
            }
            String strGenerateHookId = generateHookId(string2, string);
            activeHooks.put(strGenerateHookId, unhookHookMethod);
            return strGenerateHookId;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-308919817730101L);
            AbstractC0295Gu.m625r(-308438781392949L);
            return null;
        }
    }

    private final Class<?> findClass(String str) {
        Iterator<ClassLoader> it = classLoaders.iterator();
        while (it.hasNext()) {
            try {
                return XposedHelpers.findClass(str, it.next());
            } catch (Exception unused) {
            }
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    private final String generateHookId(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('#');
        sb.append(str2);
        sb.append('#');
        long j = hookCounter + 1;
        hookCounter = j;
        sb.append(j);
        return sb.toString();
    }

    private final Object[] getArgsFromStack(Lua lua, int i) {
        int top = (lua.getTop() - i) + 1;
        if (top <= 0) {
            return new Object[0];
        }
        Object[] objArr = new Object[top];
        for (int i2 = 0; i2 < top; i2++) {
            objArr[i2] = lua.toObject(i + i2);
        }
        return objArr;
    }

    private final Class<?> getClassFromArg(Lua lua, int i) {
        Object object = lua.toObject(i);
        if (object instanceof Class) {
            return (Class) object;
        }
        if (object instanceof String) {
            return findClass((String) object);
        }
        return null;
    }

    private final List<Class<?>> getParamTypesFromStack(Lua lua, int i) {
        Class<?> clsFindClass;
        ArrayList arrayList = new ArrayList();
        int top = lua.getTop();
        if (i <= top) {
            while (true) {
                Object object = lua.toObject(i);
                if (object instanceof Class) {
                    arrayList.add(object);
                } else if ((object instanceof String) && (clsFindClass = findClass((String) object)) != null) {
                    arrayList.add(clsFindClass);
                }
                if (i == top) {
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pushMethodParam(Lua lua, XC_MethodHook.MethodHookParam methodHookParam) {
        lua.createTable(0, 6);
        Object obj = methodHookParam.thisObject;
        if (obj != null) {
            lua.push(obj, Lua.Conversion.SEMI);
            lua.setField(-2, AbstractC0295Gu.m625r(-289283227252789L));
        }
        Object[] objArr = methodHookParam.args;
        lua.createTable(objArr != null ? objArr.length : 0, 0);
        Object[] objArr2 = methodHookParam.args;
        if (objArr2 != null) {
            int i = 0;
            for (Object obj2 : objArr2) {
                i++;
                if (obj2 != null) {
                    lua.push(obj2, Lua.Conversion.SEMI);
                } else {
                    lua.pushNil();
                }
                lua.rawSetI(-2, i);
            }
        }
        lua.setField(-2, AbstractC0295Gu.m625r(-289330471893045L));
        Object result = methodHookParam.getResult();
        if (result != null) {
            lua.push(result, Lua.Conversion.SEMI);
            lua.setField(-2, AbstractC0295Gu.m625r(-289351946729525L));
        }
        lua.push(methodHookParam.method.getName());
        lua.setField(-2, AbstractC0295Gu.m625r(-289382011500597L));
        lua.push(new C1312d9(methodHookParam, 0));
        lua.setField(-2, AbstractC0295Gu.m625r(-289412076271669L));
        lua.push(new C1312d9(methodHookParam, 1));
        lua.setField(-2, AbstractC0295Gu.m625r(-290004781758517L));
        lua.push(new C1312d9(methodHookParam, 2));
        lua.setField(-2, AbstractC0295Gu.m625r(-290034846529589L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pushMethodParam$lambda$74(XC_MethodHook.MethodHookParam methodHookParam, Lua lua) {
        AbstractC0295Gu.m625r(-283029754869813L);
        methodHookParam.setResult(lua.toObject(1));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pushMethodParam$lambda$75(XC_MethodHook.MethodHookParam methodHookParam, Lua lua) {
        Object[] objArr;
        AbstractC0295Gu.m625r(-283038344804405L);
        int number = (int) lua.toNumber(1);
        Object object = lua.toObject(2);
        if (number < 0 || (objArr = methodHookParam.args) == null || number >= objArr.length) {
            return 0;
        }
        objArr[number] = object;
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pushMethodParam$lambda$76(XC_MethodHook.MethodHookParam methodHookParam, Lua lua) {
        Object[] objArr;
        AbstractC0295Gu.m625r(-283046934738997L);
        int number = (int) lua.toNumber(1);
        if (number < 0 || (objArr = methodHookParam.args) == null || number >= objArr.length) {
            lua.pushNil();
        } else {
            INSTANCE.pushResult(lua, objArr[number]);
        }
        return 1;
    }

    private final void pushResult(Lua lua, Object obj) {
        if (obj != null) {
            lua.push(obj, Lua.Conversion.SEMI);
        } else {
            lua.pushNil();
        }
    }

    private final List<String> readStringArray(Lua lua, int i) {
        ArrayList arrayList = new ArrayList();
        lua.pushValue(i);
        lua.pushNil();
        while (lua.next(-2) != 0) {
            String string = lua.toString(-1);
            if (string != null) {
                arrayList.add(string);
            }
            lua.pop(1);
        }
        lua.pop(1);
        return arrayList;
    }

    private final void registerClassAPI(Lua lua) {
        lua.push(new C1250c9(1));
        lua.setField(-2, AbstractC0295Gu.m625r(-311213330266165L));
        lua.push(new C1250c9(2));
        lua.setField(-2, AbstractC0295Gu.m625r(-311256279939125L));
        lua.push(new C1250c9(3));
        lua.setField(-2, AbstractC0295Gu.m625r(-311333589350453L));
        lua.push(new C1250c9(5));
        lua.setField(-2, AbstractC0295Gu.m625r(-311385128958005L));
        lua.push(new C1250c9(6));
        lua.setField(-2, AbstractC0295Gu.m625r(-311990719346741L));
        lua.push(new C1250c9(7));
        lua.setField(-2, AbstractC0295Gu.m625r(-312050848888885L));
        lua.push(new C1250c9(8));
        lua.setField(-2, AbstractC0295Gu.m625r(-312110978431029L));
        lua.push(new C1250c9(9));
        lua.setField(-2, AbstractC0295Gu.m625r(-312158223071285L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerClassAPI$lambda$12(Lua lua) {
        AbstractC0295Gu.m625r(-287586715170869L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        Class<?> clsFindClass = INSTANCE.findClass(string);
        if (clsFindClass != null) {
            lua.push(clsFindClass, Lua.Conversion.SEMI);
        } else {
            lua.pushNil();
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerClassAPI$lambda$13(Lua lua) {
        Class<?> clsFindClass;
        AbstractC0295Gu.m625r(-287595305105461L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        try {
            clsFindClass = INSTANCE.findClass(string);
        } catch (Exception unused) {
            clsFindClass = null;
        }
        if (clsFindClass != null) {
            lua.push(clsFindClass, Lua.Conversion.SEMI);
        } else {
            lua.pushNil();
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerClassAPI$lambda$14(Lua lua) {
        AbstractC0295Gu.m625r(-287603895040053L);
        String string = lua.toString(1);
        boolean z = false;
        if (string == null) {
            return 0;
        }
        try {
            if (INSTANCE.findClass(string) != null) {
                z = true;
            }
        } catch (Exception unused) {
        }
        lua.push(z);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerClassAPI$lambda$15(Lua lua) {
        AbstractC0295Gu.m625r(-287612484974645L);
        Object object = lua.toObject(1);
        if (object != null) {
            lua.push(object.getClass().getName());
        } else {
            lua.pushNil();
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerClassAPI$lambda$16(Lua lua) {
        AbstractC0295Gu.m625r(-287621074909237L);
        Class<?> classFromArg = INSTANCE.getClassFromArg(lua, 1);
        if ((classFromArg != null ? classFromArg.getSuperclass() : null) != null) {
            lua.push(classFromArg.getSuperclass(), Lua.Conversion.SEMI);
        } else {
            lua.pushNil();
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerClassAPI$lambda$18(Lua lua) {
        AbstractC0295Gu.m625r(-287629664843829L);
        Class<?> classFromArg = INSTANCE.getClassFromArg(lua, 1);
        if (classFromArg != null) {
            Class<?>[] interfaces = classFromArg.getInterfaces();
            lua.createTable(interfaces.length, 0);
            int i = 0;
            for (Class<?> cls : interfaces) {
                i++;
                lua.push(cls, Lua.Conversion.SEMI);
                lua.rawSetI(-2, i);
            }
        } else {
            lua.createTable(0, 0);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerClassAPI$lambda$20(Lua lua) {
        AbstractC0295Gu.m625r(-287638254778421L);
        Object object = lua.toObject(1);
        if (object == null) {
            lua.push(false);
            return 1;
        }
        Class<?> classFromArg = INSTANCE.getClassFromArg(lua, 2);
        lua.push(classFromArg != null ? classFromArg.isInstance(object) : false);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerClassAPI$lambda$21(Lua lua) {
        AbstractC0295Gu.m625r(-287646844713013L);
        CherryXposedAPI cherryXposedAPI = INSTANCE;
        Class<?> classFromArg = cherryXposedAPI.getClassFromArg(lua, 1);
        lua.push(classFromArg != null ? classFromArg.isAssignableFrom(cherryXposedAPI.getClassFromArg(lua, 2)) : false);
        return 1;
    }

    private final void registerConstructorAPI(Lua lua) {
        lua.push(new C1207b9(15));
        lua.setField(-2, AbstractC0295Gu.m625r(-311032941639733L));
        lua.push(new C1207b9(26));
        lua.setField(-2, AbstractC0295Gu.m625r(-311084481247285L));
        lua.push(new C1250c9(4));
        lua.setField(-2, AbstractC0295Gu.m625r(-311153200724021L));
        lua.push(new C1250c9(15));
        lua.setField(-2, AbstractC0295Gu.m625r(-310710819092533L));
        lua.push(new C1250c9(26));
        lua.setField(-2, AbstractC0295Gu.m625r(-310779538569269L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerConstructorAPI$lambda$43(Lua lua) {
        AbstractC0295Gu.m625r(-285001144858677L);
        CherryXposedAPI cherryXposedAPI = INSTANCE;
        Class<?> classFromArg = cherryXposedAPI.getClassFromArg(lua, 1);
        if (classFromArg == null) {
            return 0;
        }
        try {
            Object[] argsFromStack = cherryXposedAPI.getArgsFromStack(lua, 2);
            lua.push(argsFromStack.length == 0 ? XposedHelpers.newInstance(classFromArg, new Object[0]) : XposedHelpers.newInstance(classFromArg, Arrays.copyOf(argsFromStack, argsFromStack.length)), Lua.Conversion.SEMI);
            return 1;
        } catch (Exception e) {
            AbstractC0295Gu.m625r(-285009734793269L);
            AbstractC0295Gu.m625r(-285628210083893L);
            lua.pushNil();
            AbstractC0213Ey.m415m(-285705519495221L, new StringBuilder(), e, lua);
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerConstructorAPI$lambda$44(Lua lua) {
        Constructor<?> constructorFindConstructorExact;
        AbstractC0295Gu.m625r(-285739879233589L);
        CherryXposedAPI cherryXposedAPI = INSTANCE;
        Class<?> classFromArg = cherryXposedAPI.getClassFromArg(lua, 1);
        if (classFromArg == null) {
            return 0;
        }
        try {
            List<Class<?>> paramTypesFromStack = cherryXposedAPI.getParamTypesFromStack(lua, 2);
            if (paramTypesFromStack.isEmpty()) {
                Constructor<?>[] declaredConstructors = classFromArg.getDeclaredConstructors();
                AbstractC0295Gu.m625r(-285748469168181L);
                constructorFindConstructorExact = declaredConstructors.length == 0 ? null : declaredConstructors[0];
            } else {
                Class[] clsArr = (Class[]) paramTypesFromStack.toArray(new Class[0]);
                constructorFindConstructorExact = XposedHelpers.findConstructorExact(classFromArg, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            }
            if (constructorFindConstructorExact != null) {
                lua.push(constructorFindConstructorExact, Lua.Conversion.SEMI);
                return 1;
            }
            lua.pushNil();
            return 1;
        } catch (Exception unused) {
            AbstractC0213Ey.m412j(-285873023219765L, -285391986882613L, lua);
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerConstructorAPI$lambda$45(Lua lua) {
        AbstractC0295Gu.m625r(-285486476163125L);
        CherryXposedAPI cherryXposedAPI = INSTANCE;
        Class<?> classFromArg = cherryXposedAPI.getClassFromArg(lua, 1);
        if (classFromArg == null) {
            return 0;
        }
        try {
            Object[] argsFromStack = cherryXposedAPI.getArgsFromStack(lua, 2);
            lua.push(XposedHelpers.findConstructorBestMatch(classFromArg, Arrays.copyOf(argsFromStack, argsFromStack.length)), Lua.Conversion.SEMI);
        } catch (Exception unused) {
            AbstractC0213Ey.m412j(-285495066097717L, -285563785574453L, lua);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerConstructorAPI$lambda$47(Lua lua) {
        AbstractC0295Gu.m625r(-284047662118965L);
        Class<?> classFromArg = INSTANCE.getClassFromArg(lua, 1);
        if (classFromArg == null) {
            return 0;
        }
        Constructor<?>[] declaredConstructors = classFromArg.getDeclaredConstructors();
        lua.createTable(declaredConstructors.length, 0);
        int i = 0;
        for (Constructor<?> constructor : declaredConstructors) {
            i++;
            lua.push(constructor, Lua.Conversion.SEMI);
            lua.rawSetI(-2, i);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerConstructorAPI$lambda$48(Lua lua) {
        AbstractC0295Gu.m625r(-284056252053557L);
        Object object = lua.toObject(1);
        Constructor constructor = object instanceof Constructor ? (Constructor) object : null;
        if (constructor == null) {
            return 0;
        }
        try {
            Object[] argsFromStack = INSTANCE.getArgsFromStack(lua, 2);
            constructor.setAccessible(true);
            lua.push(constructor.newInstance(Arrays.copyOf(argsFromStack, argsFromStack.length)), Lua.Conversion.SEMI);
        } catch (Exception unused) {
            AbstractC0213Ey.m412j(-284064841988149L, -284133561464885L, lua);
        }
        return 1;
    }

    private final void registerFieldAPI(Lua lua) {
        lua.push(new C1250c9(18));
        lua.setField(-2, AbstractC0295Gu.m625r(-310388696545333L));
        lua.push(new C1250c9(21));
        lua.setField(-2, AbstractC0295Gu.m625r(-310427351250997L));
        lua.push(new C1250c9(22));
        lua.setField(-2, AbstractC0295Gu.m625r(-310466005956661L));
        lua.push(new C1250c9(23));
        lua.setField(-2, AbstractC0295Gu.m625r(-310530430466101L));
        lua.push(new C1250c9(24));
        lua.setField(-2, AbstractC0295Gu.m625r(-310594854975541L));
        lua.push(new C1250c9(25));
        lua.setField(-2, AbstractC0295Gu.m625r(-310096638769205L));
        lua.push(new C1250c9(27));
        lua.setField(-2, AbstractC0295Gu.m625r(-310148178376757L));
        lua.push(new C1250c9(28));
        lua.setField(-2, AbstractC0295Gu.m625r(-310216897853493L));
        lua.push(new C1250c9(29));
        lua.setField(-2, AbstractC0295Gu.m625r(-310285617330229L));
        lua.push(new C1355e9(0));
        lua.setField(-2, AbstractC0295Gu.m625r(-310891207718965L));
        lua.push(new C1250c9(19));
        lua.setField(-2, AbstractC0295Gu.m625r(-310947042293813L));
        lua.push(new C1250c9(20));
        lua.setField(-2, AbstractC0295Gu.m625r(-310989991966773L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerFieldAPI$lambda$30(Lua lua) {
        String string;
        AbstractC0295Gu.m625r(-286478613608501L);
        Object object = lua.toObject(1);
        if (object == null || (string = lua.toString(2)) == null) {
            return 0;
        }
        try {
            INSTANCE.pushResult(lua, XposedHelpers.getObjectField(object, string));
        } catch (Exception unused) {
            AbstractC0213Ey.m412j(-286487203543093L, -286555923019829L, lua);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerFieldAPI$lambda$31(Lua lua) {
        String string;
        AbstractC0295Gu.m625r(-286628937463861L);
        Object object = lua.toObject(1);
        if (object == null || (string = lua.toString(2)) == null) {
            return 0;
        }
        try {
            XposedHelpers.setObjectField(object, string, lua.toObject(3));
            lua.push(true);
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-286637527398453L);
            AbstractC0295Gu.m625r(-285056979433525L);
            lua.push(false);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerFieldAPI$lambda$32(Lua lua) {
        String string;
        AbstractC0295Gu.m625r(-285129993877557L);
        CherryXposedAPI cherryXposedAPI = INSTANCE;
        Class<?> classFromArg = cherryXposedAPI.getClassFromArg(lua, 1);
        if (classFromArg == null || (string = lua.toString(2)) == null) {
            return 0;
        }
        try {
            cherryXposedAPI.pushResult(lua, XposedHelpers.getStaticObjectField(classFromArg, string));
        } catch (Exception unused) {
            AbstractC0213Ey.m412j(-285138583812149L, -285207303288885L, lua);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerFieldAPI$lambda$33(Lua lua) {
        String string;
        AbstractC0295Gu.m625r(-285306087536693L);
        Class<?> classFromArg = INSTANCE.getClassFromArg(lua, 1);
        if (classFromArg == null || (string = lua.toString(2)) == null) {
            return 0;
        }
        try {
            XposedHelpers.setStaticObjectField(classFromArg, string, lua.toObject(3));
            lua.push(true);
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-285314677471285L);
            AbstractC0295Gu.m625r(-284833641134133L);
            lua.push(false);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerFieldAPI$lambda$34(Lua lua) {
        String string;
        AbstractC0295Gu.m625r(-284932425381941L);
        if (lua.toObject(1) == null || (string = lua.toString(2)) == null) {
            return 0;
        }
        try {
            lua.push(Double.valueOf(XposedHelpers.getIntField(r1, string)));
        } catch (Exception unused) {
            lua.push(Double.valueOf(0.0d));
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerFieldAPI$lambda$35(Lua lua) {
        String string;
        AbstractC0295Gu.m625r(-284941015316533L);
        Object object = lua.toObject(1);
        if (object == null || (string = lua.toString(2)) == null) {
            return 0;
        }
        try {
            XposedHelpers.setIntField(object, string, (int) lua.toNumber(3));
            lua.push(true);
        } catch (Exception unused) {
            lua.push(false);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerFieldAPI$lambda$36(Lua lua) {
        String string;
        AbstractC0295Gu.m625r(-284949605251125L);
        Object object = lua.toObject(1);
        if (object == null || (string = lua.toString(2)) == null) {
            return 0;
        }
        try {
            lua.push(XposedHelpers.getBooleanField(object, string));
        } catch (Exception unused) {
            lua.push(false);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerFieldAPI$lambda$37(Lua lua) {
        String string;
        AbstractC0295Gu.m625r(-284958195185717L);
        Object object = lua.toObject(1);
        if (object == null || (string = lua.toString(2)) == null) {
            return 0;
        }
        try {
            XposedHelpers.setBooleanField(object, string, lua.toBoolean(3));
            lua.push(true);
        } catch (Exception unused) {
            lua.push(false);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerFieldAPI$lambda$38(Lua lua) {
        String string;
        AbstractC0295Gu.m625r(-284966785120309L);
        if (lua.toObject(1) == null || (string = lua.toString(2)) == null) {
            return 0;
        }
        try {
            lua.push(Double.valueOf(XposedHelpers.getLongField(r1, string)));
        } catch (Exception unused) {
            lua.push(Double.valueOf(0.0d));
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerFieldAPI$lambda$39(Lua lua) {
        String string;
        AbstractC0295Gu.m625r(-284975375054901L);
        Object object = lua.toObject(1);
        if (object == null || (string = lua.toString(2)) == null) {
            return 0;
        }
        try {
            XposedHelpers.setLongField(object, string, (long) lua.toNumber(3));
            lua.push(true);
        } catch (Exception unused) {
            lua.push(false);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerFieldAPI$lambda$40(Lua lua) {
        String string;
        AbstractC0295Gu.m625r(-284983964989493L);
        Class<?> classFromArg = INSTANCE.getClassFromArg(lua, 1);
        if (classFromArg == null || (string = lua.toString(2)) == null) {
            return 0;
        }
        try {
            lua.push(XposedHelpers.findField(classFromArg, string), Lua.Conversion.SEMI);
        } catch (Exception unused) {
            lua.pushNil();
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerFieldAPI$lambda$42(Lua lua) {
        AbstractC0295Gu.m625r(-284992554924085L);
        Class<?> classFromArg = INSTANCE.getClassFromArg(lua, 1);
        if (classFromArg == null) {
            return 0;
        }
        Field[] declaredFields = classFromArg.getDeclaredFields();
        lua.createTable(declaredFields.length, 0);
        int i = 0;
        for (Field field : declaredFields) {
            i++;
            lua.push(field, Lua.Conversion.SEMI);
            lua.rawSetI(-2, i);
        }
        return 1;
    }

    private final void registerHookAPI(Lua lua) {
        lua.push(new C1250c9(10));
        lua.setField(-2, AbstractC0295Gu.m625r(-313030101432373L));
        lua.push(new C1250c9(11));
        lua.setField(-2, AbstractC0295Gu.m625r(-313051576268853L));
        lua.push(new C1250c9(12));
        lua.setField(-2, AbstractC0295Gu.m625r(-311449553467445L));
        lua.push(new C1250c9(13));
        lua.setField(-2, AbstractC0295Gu.m625r(-311492503140405L));
        lua.push(new C1250c9(14));
        lua.setField(-2, AbstractC0295Gu.m625r(-311544042747957L));
        lua.push(new C1250c9(16));
        lua.setField(-2, AbstractC0295Gu.m625r(-311612762224693L));
        lua.push(new C1250c9(17));
        lua.setField(-2, AbstractC0295Gu.m625r(-311677186734133L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerHookAPI$lambda$0(Lua lua) {
        AbstractC0295Gu.m625r(-289807213262901L);
        if (!lua.isTable(1)) {
            lua.pushNil();
            lua.push(AbstractC0295Gu.m625r(-289815803197493L));
            return 2;
        }
        try {
            String strDoHook = INSTANCE.doHook(lua, 1, HookType.NORMAL);
            if (strDoHook != null) {
                lua.push(strDoHook);
                return 1;
            }
            lua.pushNil();
            lua.push(AbstractC0295Gu.m625r(-289953242150965L));
            return 2;
        } catch (Exception e) {
            AbstractC0295Gu.m625r(-288355514316853L);
            AbstractC0295Gu.m625r(-288424233793589L);
            lua.pushNil();
            AbstractC0213Ey.m415m(-288471478433845L, new StringBuilder(), e, lua);
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerHookAPI$lambda$1(Lua lua) {
        AbstractC0295Gu.m625r(-288527313008693L);
        try {
            String strDoSimpleHook = INSTANCE.doSimpleHook(lua, HookType.BEFORE);
            if (strDoSimpleHook != null) {
                lua.push(strDoSimpleHook);
            } else {
                lua.pushNil();
            }
            return 1;
        } catch (Exception unused) {
            AbstractC0213Ey.m412j(-288535902943285L, -288604622420021L, lua);
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerHookAPI$lambda$11(Lua lua) {
        Lua lua2;
        Class<?> clsFindClass;
        AbstractC0295Gu.m625r(-287917427652661L);
        String string = lua.toString(1);
        int i = 0;
        if (string == null || !lua.isFunction(2)) {
            return 0;
        }
        lua.pushValue(2);
        int iRef = lua.ref();
        try {
            clsFindClass = INSTANCE.findClass(string);
        } catch (Exception unused) {
            lua2 = lua;
        }
        if (clsFindClass == null) {
            lua.pushNil();
            return 1;
        }
        ArrayList arrayList = new ArrayList();
        C2694x c2694x = new C2694x(1, clsFindClass.getDeclaredConstructors());
        while (c2694x.hasNext()) {
            Constructor constructor = (Constructor) c2694x.next();
            CherryXposedAPI cherryXposedAPI = INSTANCE;
            lua2 = lua;
            try {
                XC_MethodHook.Unhook unhookHookMethod = XposedBridge.hookMethod(constructor, cherryXposedAPI.createMethodCallback(lua2, iRef, -1, -1, false));
                String strGenerateHookId = cherryXposedAPI.generateHookId(string, AbstractC0295Gu.m625r(-287926017587253L));
                activeHooks.put(strGenerateHookId, unhookHookMethod);
                arrayList.add(strGenerateHookId);
                lua = lua2;
            } catch (Exception unused2) {
                AbstractC0213Ey.m412j(-287956082358325L, -288024801835061L, lua2);
                return 1;
            }
        }
        lua2 = lua;
        lua2.createTable(arrayList.size(), 0);
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC2496sa.m4978c0();
                throw null;
            }
            lua2.push((String) obj);
            lua2.rawSetI(-2, i2);
            i = i2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerHookAPI$lambda$2(Lua lua) {
        AbstractC0295Gu.m625r(-288127881050165L);
        try {
            String strDoSimpleHook = INSTANCE.doSimpleHook(lua, HookType.AFTER);
            if (strDoSimpleHook != null) {
                lua.push(strDoSimpleHook);
            } else {
                lua.pushNil();
            }
            return 1;
        } catch (Exception unused) {
            AbstractC0213Ey.m412j(-288136470984757L, -288205190461493L, lua);
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerHookAPI$lambda$3(Lua lua) {
        AbstractC0295Gu.m625r(-288273909938229L);
        if (!lua.isTable(1)) {
            lua.pushNil();
            lua.push(AbstractC0295Gu.m625r(-288282499872821L));
            return 2;
        }
        try {
            String strDoHook = INSTANCE.doHook(lua, 1, HookType.REPLACE);
            if (strDoHook != null) {
                lua.push(strDoHook);
                return 1;
            }
            lua.pushNil();
            lua.push(AbstractC0295Gu.m625r(-288999759411253L));
            return 2;
        } catch (Exception e) {
            AbstractC0295Gu.m625r(-289051299018805L);
            AbstractC0295Gu.m625r(-289120018495541L);
            lua.pushNil();
            AbstractC0213Ey.m415m(-288647572092981L, new StringBuilder(), e, lua);
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerHookAPI$lambda$4(Lua lua) {
        AbstractC0295Gu.m625r(-288733471438901L);
        if (!lua.isTable(1)) {
            lua.pushNil();
            lua.push(AbstractC0295Gu.m625r(-288742061373493L));
            return 2;
        }
        try {
            String strDoHookConstructor = INSTANCE.doHookConstructor(lua, 1);
            if (strDoHookConstructor != null) {
                lua.push(strDoHookConstructor);
                return 1;
            }
            lua.pushNil();
            lua.push(AbstractC0295Gu.m625r(-287277477525557L));
            return 2;
        } catch (Exception e) {
            AbstractC0295Gu.m625r(-287380556740661L);
            AbstractC0295Gu.m625r(-287449276217397L);
            lua.pushNil();
            AbstractC0213Ey.m415m(-286994009684021L, new StringBuilder(), e, lua);
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerHookAPI$lambda$8(Lua lua) {
        String string;
        Lua lua2;
        Class<?> clsFindClass;
        AbstractC0295Gu.m625r(-287097088899125L);
        String string2 = lua.toString(1);
        int i = 0;
        if (string2 == null || (string = lua.toString(2)) == null || !lua.isFunction(3)) {
            return 0;
        }
        lua.pushValue(3);
        int iRef = lua.ref();
        try {
            clsFindClass = INSTANCE.findClass(string2);
        } catch (Exception unused) {
            lua2 = lua;
        }
        if (clsFindClass == null) {
            lua.pushNil();
            return 1;
        }
        ArrayList arrayList = new ArrayList();
        Method[] declaredMethods = clsFindClass.getDeclaredMethods();
        AbstractC0295Gu.m625r(-287105678833717L);
        ArrayList<Method> arrayList2 = new ArrayList();
        for (Method method : declaredMethods) {
            if (AbstractC0585Nj.m1134a(method.getName(), string)) {
                arrayList2.add(method);
            }
        }
        for (Method method2 : arrayList2) {
            CherryXposedAPI cherryXposedAPI = INSTANCE;
            lua2 = lua;
            try {
                XC_MethodHook.Unhook unhookHookMethod = XposedBridge.hookMethod(method2, cherryXposedAPI.createMethodCallback(lua2, iRef, -1, -1, false));
                String strGenerateHookId = cherryXposedAPI.generateHookId(string2, string);
                activeHooks.put(strGenerateHookId, unhookHookMethod);
                arrayList.add(strGenerateHookId);
                lua = lua2;
            } catch (Exception unused2) {
                AbstractC0213Ey.m412j(-287208758048821L, -287827233339445L, lua2);
                return 1;
            }
        }
        lua2 = lua;
        lua2.createTable(arrayList.size(), 0);
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC2496sa.m4978c0();
                throw null;
            }
            lua2.push((String) obj);
            lua2.rawSetI(-2, i2);
            i = i2;
        }
        return 1;
    }

    private final void registerHookManagementAPI(Lua lua) {
        lua.push(new C1207b9(20));
        lua.setField(-2, AbstractC0295Gu.m625r(-309190400669749L));
        lua.push(new C1207b9(21));
        lua.setField(-2, AbstractC0295Gu.m625r(-309220465440821L));
        lua.push(new C1207b9(22));
        lua.setField(-2, AbstractC0295Gu.m625r(-309813170927669L));
        lua.push(new C1207b9(23));
        lua.setField(-2, AbstractC0295Gu.m625r(-309877595437109L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerHookManagementAPI$lambda$59(Lua lua) {
        AbstractC0295Gu.m625r(-284769216624693L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        XC_MethodHook.Unhook unhookRemove = activeHooks.remove(string);
        if (unhookRemove != null) {
            unhookRemove.unhook();
            AbstractC0295Gu.m625r(-284228050745397L);
            AbstractC0295Gu.m625r(-284296770222133L);
            lua.push(true);
        } else {
            lua.push(false);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerHookManagementAPI$lambda$61(Lua lua) {
        AbstractC0295Gu.m625r(-284344014862389L);
        ConcurrentHashMap<String, XC_MethodHook.Unhook> concurrentHashMap = activeHooks;
        int size = concurrentHashMap.size();
        Collection<XC_MethodHook.Unhook> collectionValues = concurrentHashMap.values();
        AbstractC0295Gu.m625r(-284352604796981L);
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((XC_MethodHook.Unhook) it.next()).unhook();
        }
        activeHooks.clear();
        AbstractC0295Gu.m625r(-284429914208309L);
        AbstractC0295Gu.m625r(-284498633685045L);
        AbstractC0295Gu.m625r(-282913790752821L);
        lua.push(Double.valueOf(size));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerHookManagementAPI$lambda$63(Lua lua) {
        AbstractC0295Gu.m625r(-282943855523893L);
        Set<String> setKeySet = activeHooks.keySet();
        AbstractC0295Gu.m625r(-282952445458485L);
        List listM4908r0 = AbstractC2453ra.m4908r0(setKeySet);
        int i = 0;
        lua.createTable(listM4908r0.size(), 0);
        for (Object obj : listM4908r0) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC2496sa.m4978c0();
                throw null;
            }
            lua.push((String) obj);
            lua.rawSetI(-2, i2);
            i = i2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerHookManagementAPI$lambda$64(Lua lua) {
        AbstractC0295Gu.m625r(-283021164935221L);
        lua.push(Double.valueOf(activeHooks.size()));
        return 1;
    }

    private final void registerMethodAPI(Lua lua) {
        lua.push(new C1207b9(24));
        lua.setField(-2, AbstractC0295Gu.m625r(-312231237515317L));
        lua.push(new C1207b9(25));
        lua.setField(-2, AbstractC0295Gu.m625r(-311728726341685L));
        lua.push(new C1207b9(27));
        lua.setField(-2, AbstractC0295Gu.m625r(-311801740785717L));
        lua.push(new C1207b9(28));
        lua.setField(-2, AbstractC0295Gu.m625r(-311857575360565L));
        lua.push(new C1207b9(29));
        lua.setField(-2, AbstractC0295Gu.m625r(-311904820000821L));
        lua.push(new C1250c9(0));
        lua.setField(-2, AbstractC0295Gu.m625r(-310341451905077L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerMethodAPI$lambda$22(Lua lua) {
        String string;
        AbstractC0295Gu.m625r(-287655434647605L);
        Object object = lua.toObject(1);
        if (object == null || (string = lua.toString(2)) == null) {
            return 0;
        }
        try {
            CherryXposedAPI cherryXposedAPI = INSTANCE;
            Object[] argsFromStack = cherryXposedAPI.getArgsFromStack(lua, 3);
            cherryXposedAPI.pushResult(lua, XposedHelpers.callMethod(object, string, Arrays.copyOf(argsFromStack, argsFromStack.length)));
            return 1;
        } catch (Exception e) {
            AbstractC0295Gu.m625r(-287664024582197L);
            AbstractC0295Gu.m625r(-287732744058933L);
            lua.pushNil();
            AbstractC0213Ey.m415m(-286165080995893L, new StringBuilder(), e, lua);
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerMethodAPI$lambda$23(Lua lua) {
        String string;
        AbstractC0295Gu.m625r(-286199440734261L);
        CherryXposedAPI cherryXposedAPI = INSTANCE;
        Class<?> classFromArg = cherryXposedAPI.getClassFromArg(lua, 1);
        if (classFromArg == null || (string = lua.toString(2)) == null) {
            return 0;
        }
        try {
            Object[] argsFromStack = cherryXposedAPI.getArgsFromStack(lua, 3);
            cherryXposedAPI.pushResult(lua, XposedHelpers.callStaticMethod(classFromArg, string, Arrays.copyOf(argsFromStack, argsFromStack.length)));
            return 1;
        } catch (Exception e) {
            AbstractC0295Gu.m625r(-286208030668853L);
            AbstractC0295Gu.m625r(-286276750145589L);
            lua.pushNil();
            AbstractC0213Ey.m415m(-286384124327989L, new StringBuilder(), e, lua);
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerMethodAPI$lambda$24(Lua lua) {
        AbstractC0295Gu.m625r(-286418484066357L);
        Object object = lua.toObject(1);
        Method method = object instanceof Method ? (Method) object : null;
        if (method == null) {
            return 0;
        }
        Object object2 = lua.toObject(2);
        try {
            CherryXposedAPI cherryXposedAPI = INSTANCE;
            Object[] argsFromStack = cherryXposedAPI.getArgsFromStack(lua, 3);
            method.setAccessible(true);
            cherryXposedAPI.pushResult(lua, method.invoke(object2, Arrays.copyOf(argsFromStack, argsFromStack.length)));
        } catch (Exception unused) {
            AbstractC0213Ey.m412j(-285877318187061L, -285946037663797L, lua);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerMethodAPI$lambda$26(Lua lua) {
        String string;
        Method methodFindMethodExact;
        AbstractC0295Gu.m625r(-286027642042421L);
        CherryXposedAPI cherryXposedAPI = INSTANCE;
        Class<?> classFromArg = cherryXposedAPI.getClassFromArg(lua, 1);
        int i = 0;
        if (classFromArg == null || (string = lua.toString(2)) == null) {
            return 0;
        }
        try {
            List<Class<?>> paramTypesFromStack = cherryXposedAPI.getParamTypesFromStack(lua, 3);
            if (paramTypesFromStack.isEmpty()) {
                Method[] declaredMethods = classFromArg.getDeclaredMethods();
                AbstractC0295Gu.m625r(-286036231977013L);
                int length = declaredMethods.length;
                while (true) {
                    if (i >= length) {
                        methodFindMethodExact = null;
                        break;
                    }
                    methodFindMethodExact = declaredMethods[i];
                    if (AbstractC0585Nj.m1134a(methodFindMethodExact.getName(), string)) {
                        break;
                    }
                    i++;
                }
            } else {
                Class[] clsArr = (Class[]) paramTypesFromStack.toArray(new Class[0]);
                methodFindMethodExact = XposedHelpers.findMethodExact(classFromArg, string, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            }
            if (methodFindMethodExact != null) {
                lua.push(methodFindMethodExact, Lua.Conversion.SEMI);
            } else {
                lua.pushNil();
            }
        } catch (Exception unused) {
            AbstractC0213Ey.m412j(-286139311192117L, -286757786482741L, lua);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerMethodAPI$lambda$27(Lua lua) {
        String string;
        AbstractC0295Gu.m625r(-286830800926773L);
        CherryXposedAPI cherryXposedAPI = INSTANCE;
        Class<?> classFromArg = cherryXposedAPI.getClassFromArg(lua, 1);
        if (classFromArg == null || (string = lua.toString(2)) == null) {
            return 0;
        }
        try {
            Object[] argsFromStack = cherryXposedAPI.getArgsFromStack(lua, 3);
            lua.push(XposedHelpers.findMethodBestMatch(classFromArg, string, Arrays.copyOf(argsFromStack, argsFromStack.length)), Lua.Conversion.SEMI);
        } catch (Exception unused) {
            AbstractC0213Ey.m412j(-286839390861365L, -286908110338101L, lua);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerMethodAPI$lambda$29(Lua lua) {
        AbstractC0295Gu.m625r(-286470023673909L);
        Class<?> classFromArg = INSTANCE.getClassFromArg(lua, 1);
        if (classFromArg == null) {
            return 0;
        }
        Method[] declaredMethods = classFromArg.getDeclaredMethods();
        lua.createTable(declaredMethods.length, 0);
        int i = 0;
        for (Method method : declaredMethods) {
            i++;
            lua.push(method, Lua.Conversion.SEMI);
            lua.rawSetI(-2, i);
        }
        return 1;
    }

    private final void registerReflectionAPI(Lua lua) {
        lua.push(new C1355e9(1));
        lua.setField(-2, AbstractC0295Gu.m625r(-310856847980597L));
        lua.push(new C1355e9(2));
        lua.setField(-2, AbstractC0295Gu.m625r(-309267710081077L));
        lua.push(new C1355e9(3));
        lua.setField(-2, AbstractC0295Gu.m625r(-309323544655925L));
        lua.push(new C1355e9(4));
        lua.setField(-2, AbstractC0295Gu.m625r(-309400854067253L));
        lua.push(new C1355e9(5));
        lua.setField(-2, AbstractC0295Gu.m625r(-309460983609397L));
        lua.push(new C1207b9(16));
        lua.setField(-2, AbstractC0295Gu.m625r(-308967062370357L));
        lua.push(new C1207b9(17));
        lua.setField(-2, AbstractC0295Gu.m625r(-309044371781685L));
        lua.push(new C1207b9(18));
        lua.setField(-2, AbstractC0295Gu.m625r(-309061551650869L));
        lua.push(new C1207b9(19));
        lua.setField(-2, AbstractC0295Gu.m625r(-309125976160309L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerReflectionAPI$lambda$49(Lua lua) {
        AbstractC0295Gu.m625r(-283686884866101L);
        Object object = lua.toObject(1);
        AccessibleObject accessibleObject = object instanceof AccessibleObject ? (AccessibleObject) object : null;
        if (accessibleObject == null) {
            return 0;
        }
        try {
            accessibleObject.setAccessible(lua.toBoolean(2));
            lua.push(true);
        } catch (Exception unused) {
            lua.push(false);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerReflectionAPI$lambda$50(Lua lua) {
        int modifiers;
        AbstractC0295Gu.m625r(-283695474800693L);
        Object object = lua.toObject(1);
        if (object instanceof Method) {
            modifiers = ((Method) object).getModifiers();
        } else if (object instanceof Field) {
            modifiers = ((Field) object).getModifiers();
        } else if (object instanceof Constructor) {
            modifiers = ((Constructor) object).getModifiers();
        } else {
            if (!(object instanceof Class)) {
                return 0;
            }
            modifiers = ((Class) object).getModifiers();
        }
        lua.createTable(0, 10);
        lua.push(Modifier.isPublic(modifiers));
        lua.setField(-2, AbstractC0295Gu.m625r(-283704064735285L));
        lua.push(Modifier.isPrivate(modifiers));
        lua.setField(-2, AbstractC0295Gu.m625r(-283742719440949L));
        lua.push(Modifier.isProtected(modifiers));
        lua.setField(-2, AbstractC0295Gu.m625r(-283785669113909L));
        lua.push(Modifier.isStatic(modifiers));
        lua.setField(-2, AbstractC0295Gu.m625r(-283837208721461L));
        lua.push(Modifier.isFinal(modifiers));
        lua.setField(-2, AbstractC0295Gu.m625r(-283875863427125L));
        lua.push(Modifier.isAbstract(modifiers));
        lua.setField(-2, AbstractC0295Gu.m625r(-283910223165493L));
        lua.push(Modifier.isNative(modifiers));
        lua.setField(-2, AbstractC0295Gu.m625r(-284507223619637L));
        lua.push(Modifier.isSynchronized(modifiers));
        lua.setField(-2, AbstractC0295Gu.m625r(-284545878325301L));
        lua.push(Modifier.isVolatile(modifiers));
        lua.setField(-2, AbstractC0295Gu.m625r(-284610302834741L));
        lua.push(Modifier.isTransient(modifiers));
        lua.setField(-2, AbstractC0295Gu.m625r(-284657547474997L));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerReflectionAPI$lambda$52(Lua lua) {
        Class<?>[] parameterTypes;
        AbstractC0295Gu.m625r(-284709087082549L);
        Object object = lua.toObject(1);
        if (object instanceof Method) {
            parameterTypes = ((Method) object).getParameterTypes();
        } else {
            if (!(object instanceof Constructor)) {
                return 0;
            }
            parameterTypes = ((Constructor) object).getParameterTypes();
        }
        lua.createTable(parameterTypes.length, 0);
        int i = 0;
        for (Class<?> cls : parameterTypes) {
            i++;
            lua.push(cls, Lua.Conversion.SEMI);
            lua.rawSetI(-2, i);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerReflectionAPI$lambda$53(Lua lua) {
        AbstractC0295Gu.m625r(-284717677017141L);
        Object object = lua.toObject(1);
        Method method = object instanceof Method ? (Method) object : null;
        if (method == null) {
            return 0;
        }
        lua.push(method.getReturnType(), Lua.Conversion.SEMI);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerReflectionAPI$lambda$54(Lua lua) {
        AbstractC0295Gu.m625r(-284726266951733L);
        Object object = lua.toObject(1);
        Field field = object instanceof Field ? (Field) object : null;
        if (field == null) {
            return 0;
        }
        lua.push(field.getType(), Lua.Conversion.SEMI);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerReflectionAPI$lambda$55(Lua lua) {
        Class<?> declaringClass;
        AbstractC0295Gu.m625r(-284734856886325L);
        Object object = lua.toObject(1);
        if (object instanceof Method) {
            declaringClass = ((Method) object).getDeclaringClass();
        } else if (object instanceof Field) {
            declaringClass = ((Field) object).getDeclaringClass();
        } else {
            if (!(object instanceof Constructor)) {
                return 0;
            }
            declaringClass = ((Constructor) object).getDeclaringClass();
        }
        lua.push(declaringClass, Lua.Conversion.SEMI);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerReflectionAPI$lambda$56(Lua lua) {
        AbstractC0295Gu.m625r(-284743446820917L);
        lua.toString(1);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerReflectionAPI$lambda$57(Lua lua) {
        AbstractC0295Gu.m625r(-284752036755509L);
        List<ClassLoader> list = classLoaders;
        if (list.isEmpty()) {
            lua.pushNil();
            return 1;
        }
        lua.push(list.get(0), Lua.Conversion.SEMI);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerReflectionAPI$lambda$58(Lua lua) {
        AbstractC0295Gu.m625r(-284760626690101L);
        Object object = lua.toObject(1);
        ClassLoader classLoader = object instanceof ClassLoader ? (ClassLoader) object : null;
        if (classLoader == null) {
            return 0;
        }
        List<ClassLoader> list = classLoaders;
        if (!list.contains(classLoader)) {
            list.add(classLoader);
        }
        lua.push(true);
        return 1;
    }

    public final void cleanup() {
        Collection<XC_MethodHook.Unhook> collectionValues = activeHooks.values();
        AbstractC0295Gu.m625r(-290064911300661L);
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((XC_MethodHook.Unhook) it.next()).unhook();
        }
        activeHooks.clear();
        AbstractC0295Gu.m625r(-290142220711989L);
        AbstractC0295Gu.m625r(-290210940188725L);
    }

    public final void register(Lua lua, List<? extends ClassLoader> list) {
        AbstractC0295Gu.m625r(-313253439731765L);
        AbstractC0295Gu.m625r(-313270619600949L);
        List<ClassLoader> list2 = classLoaders;
        list2.clear();
        list2.addAll(list);
        lua.createTable(0, 40);
        registerHookAPI(lua);
        registerClassAPI(lua);
        registerMethodAPI(lua);
        registerFieldAPI(lua);
        registerConstructorAPI(lua);
        registerReflectionAPI(lua);
        registerHookManagementAPI(lua);
        AbstractC0295Gu.m625r(-313304979339317L);
        AbstractC0295Gu.m625r(-312823943002165L);
        list2.size();
        AbstractC0295Gu.m625r(-312965676922933L);
    }
}
