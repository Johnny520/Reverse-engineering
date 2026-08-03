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
    private static final String TAG = AbstractC0295Gu.m625r(-297615463807029L);
    public static final HookAPI INSTANCE = new HookAPI();
    private static final ConcurrentHashMap<String, XC_MethodHook.Unhook> activeHooks = new ConcurrentHashMap<>();
    private static final List<ClassLoader> classLoaders = new ArrayList();

    private HookAPI() {
    }

    private final String doHook(Lua lua, int i, boolean z) {
        int iRef;
        int iRef2;
        XC_MethodHook.Unhook unhookHookMethod;
        lua.getField(i, AbstractC0295Gu.m625r(-282011847620661L));
        int iRef3 = -1;
        String string = lua.toString(-1);
        lua.pop(1);
        lua.getField(i, AbstractC0295Gu.m625r(-281487861610549L));
        String string2 = lua.toString(-1);
        lua.pop(1);
        if (string == null || string2 == null) {
            AbstractC0295Gu.m625r(-281517926381621L);
            AbstractC0295Gu.m625r(-281565171021877L);
            return null;
        }
        lua.getField(i, AbstractC0295Gu.m625r(-281719789844533L));
        List<String> stringArray = (lua.isNil(-1) || !lua.isTable(-1)) ? null : readStringArray(lua, -1);
        lua.pop(1);
        lua.getField(i, AbstractC0295Gu.m625r(-281749854615605L));
        boolean zIsFunction = lua.isFunction(-1);
        if (zIsFunction) {
            iRef = lua.ref();
        } else {
            lua.pop(1);
            iRef = -1;
        }
        lua.getField(i, AbstractC0295Gu.m625r(-282329675200565L));
        boolean zIsFunction2 = lua.isFunction(-1);
        if (zIsFunction2) {
            iRef2 = lua.ref();
        } else {
            lua.pop(1);
            iRef2 = -1;
        }
        lua.getField(i, AbstractC0295Gu.m625r(-282355445004341L));
        boolean zIsFunction3 = lua.isFunction(-1);
        if (zIsFunction3) {
            iRef3 = lua.ref();
        } else {
            lua.pop(1);
        }
        int i2 = iRef3;
        Class<?> clsFindClass = findClass(string);
        if (clsFindClass == null) {
            AbstractC0295Gu.m625r(-282389804742709L);
            AbstractC0295Gu.m625r(-282437049382965L);
            return null;
        }
        HookAPI$doHook$callback$1 hookAPI$doHook$callback$1 = new HookAPI$doHook$callback$1(z, zIsFunction3, lua, zIsFunction, i2, iRef, zIsFunction2, iRef2);
        try {
            if (stringArray != null) {
                ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(stringArray, 10));
                Iterator<T> it = stringArray.iterator();
                while (it.hasNext()) {
                    arrayList.add(INSTANCE.findClass((String) it.next()));
                }
                Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
                unhookHookMethod = XposedBridge.hookMethod(XposedHelpers.findMethodExact(clsFindClass, string2, (Class[]) Arrays.copyOf(clsArr, clsArr.length)), hookAPI$doHook$callback$1);
            } else {
                Method[] declaredMethods = clsFindClass.getDeclaredMethods();
                AbstractC0295Gu.m625r(-282514358794293L);
                ArrayList arrayList2 = new ArrayList();
                for (Method method : declaredMethods) {
                    if (AbstractC0585Nj.m1134a(method.getName(), string2)) {
                        arrayList2.add(method);
                    }
                }
                if (arrayList2.isEmpty()) {
                    AbstractC0295Gu.m625r(-282067682195509L);
                    AbstractC0295Gu.m625r(-282114926835765L);
                    return null;
                }
                unhookHookMethod = XposedBridge.hookMethod((Member) AbstractC2453ra.m4898h0(arrayList2), hookAPI$doHook$callback$1);
            }
            String str = string + '#' + string2 + '#' + System.currentTimeMillis();
            activeHooks.put(str, unhookHookMethod);
            AbstractC0295Gu.m625r(-282196531214389L);
            AbstractC0295Gu.m625r(-282243775854645L);
            AbstractC0295Gu.m625r(-282282430560309L);
            return str;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-298246823999541L);
            AbstractC0295Gu.m625r(-298294068639797L);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void pushMethodParam(Lua lua, XC_MethodHook.MethodHookParam methodHookParam) {
        lua.createTable(0, 5);
        Object obj = methodHookParam.thisObject;
        if (obj != null) {
            lua.push(obj, Lua.Conversion.SEMI);
            lua.setField(-2, AbstractC0295Gu.m625r(-298354198181941L));
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
        lua.setField(-2, AbstractC0295Gu.m625r(-298401442822197L));
        Object result = methodHookParam.getResult();
        if (result != null) {
            lua.push(result, Lua.Conversion.SEMI);
            lua.setField(-2, AbstractC0295Gu.m625r(-298422917658677L));
        }
        lua.push(methodHookParam.method.getName());
        lua.setField(-2, AbstractC0295Gu.m625r(-298452982429749L));
        lua.push(new C1312d9(methodHookParam, 3));
        lua.setField(-2, AbstractC0295Gu.m625r(-298483047200821L));
        lua.push(new C1312d9(methodHookParam, 4));
        lua.setField(-2, AbstractC0295Gu.m625r(-297976241059893L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pushMethodParam$lambda$14(XC_MethodHook.MethodHookParam methodHookParam, Lua lua) {
        AbstractC0295Gu.m625r(-297598283937845L);
        methodHookParam.setResult(lua.toObject(1));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pushMethodParam$lambda$15(XC_MethodHook.MethodHookParam methodHookParam, Lua lua) {
        Object[] objArr;
        AbstractC0295Gu.m625r(-297606873872437L);
        int number = (int) lua.toNumber(1);
        Object object = lua.toObject(2);
        if (number < 0 || (objArr = methodHookParam.args) == null || number >= objArr.length) {
            return 0;
        }
        objArr[number] = object;
        return 0;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$0(Lua lua) {
        AbstractC0295Gu.m625r(-298242529032245L);
        if (!lua.isTable(1)) {
            lua.push(false);
            lua.push(AbstractC0295Gu.m625r(-298800874780725L));
            return 2;
        }
        try {
            String strDoHook = INSTANCE.doHook(lua, 1, false);
            if (strDoHook != null) {
                lua.push(strDoHook);
                return 1;
            }
            lua.push(false);
            lua.push(AbstractC0295Gu.m625r(-298938313734197L));
            return 2;
        } catch (Exception e) {
            AbstractC0295Gu.m625r(-298989853341749L);
            AbstractC0295Gu.m625r(-299037097982005L);
            lua.push(false);
            AbstractC0213Ey.m415m(-298534586808373L, new StringBuilder(), e, lua);
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$1(Lua lua) {
        AbstractC0295Gu.m625r(-298590421383221L);
        if (!lua.isTable(1)) {
            lua.push(false);
            lua.push(AbstractC0295Gu.m625r(-298599011317813L));
            return 2;
        }
        try {
            String strDoHook = INSTANCE.doHook(lua, 1, true);
            if (strDoHook != null) {
                lua.push(strDoHook);
                return 1;
            }
            lua.push(false);
            lua.push(AbstractC0295Gu.m625r(-298766515042357L));
            return 2;
        } catch (Exception e) {
            AbstractC0295Gu.m625r(-297168787208245L);
            AbstractC0295Gu.m625r(-297216031848501L);
            lua.push(false);
            AbstractC0213Ey.m415m(-297293341259829L, new StringBuilder(), e, lua);
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$2(Lua lua) {
        XC_MethodHook.Unhook unhookRemove;
        AbstractC0295Gu.m625r(-297379240605749L);
        String string = lua.toString(1);
        if (string == null || (unhookRemove = activeHooks.remove(string)) == null) {
            lua.push(false);
        } else {
            unhookRemove.unhook();
            lua.push(true);
            AbstractC0295Gu.m625r(-297387830540341L);
            AbstractC0295Gu.m625r(-296885319366709L);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$4(Lua lua) {
        AbstractC0295Gu.m625r(-296932564006965L);
        ConcurrentHashMap<String, XC_MethodHook.Unhook> concurrentHashMap = activeHooks;
        int size = concurrentHashMap.size();
        Collection<XC_MethodHook.Unhook> collectionValues = concurrentHashMap.values();
        AbstractC0295Gu.m625r(-296941153941557L);
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((XC_MethodHook.Unhook) it.next()).unhook();
        }
        activeHooks.clear();
        lua.push(Double.valueOf(size));
        AbstractC0295Gu.m625r(-297018463352885L);
        AbstractC0295Gu.m625r(-297065707993141L);
        AbstractC0295Gu.m625r(-297130132502581L);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$5(Lua lua) {
        AbstractC0295Gu.m625r(-297709953087541L);
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
    public static final int register$lambda$6(Lua lua) {
        String string;
        AbstractC0295Gu.m625r(-297718543022133L);
        Object object = lua.toObject(1);
        if (object == null || (string = lua.toString(2)) == null) {
            return 0;
        }
        try {
            int top = lua.getTop() - 2;
            Object[] objArr = new Object[top];
            for (int i = 0; i < top; i++) {
                objArr[i] = lua.toObject(i + 3);
            }
            Object objCallMethod = XposedHelpers.callMethod(object, string, Arrays.copyOf(objArr, top));
            if (objCallMethod != null) {
                lua.push(objCallMethod, Lua.Conversion.SEMI);
            } else {
                lua.pushNil();
            }
            return 1;
        } catch (Exception e) {
            AbstractC0295Gu.m625r(-297727132956725L);
            AbstractC0295Gu.m625r(-297774377596981L);
            lua.pushNil();
            AbstractC0213Ey.m415m(-297855981975605L, new StringBuilder(), e, lua);
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$7(Lua lua) {
        String string;
        AbstractC0295Gu.m625r(-297890341713973L);
        Object object = lua.toObject(1);
        if (object == null || (string = lua.toString(2)) == null) {
            return 0;
        }
        try {
            Object objectField = XposedHelpers.getObjectField(object, string);
            if (objectField != null) {
                lua.push(objectField, Lua.Conversion.SEMI);
            } else {
                lua.pushNil();
            }
        } catch (Exception unused) {
            AbstractC0213Ey.m412j(-297898931648565L, -297946176288821L, lua);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$8(Lua lua) {
        String string;
        AbstractC0295Gu.m625r(-297469434918965L);
        Object object = lua.toObject(1);
        if (object == null || (string = lua.toString(2)) == null) {
            return 0;
        }
        try {
            XposedHelpers.setObjectField(object, string, lua.toObject(3));
            lua.push(true);
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-297478024853557L);
            AbstractC0295Gu.m625r(-297525269493813L);
            lua.push(false);
        }
        return 1;
    }

    public final void addClassLoader(ClassLoader classLoader) {
        AbstractC0295Gu.m625r(-283661115062325L);
        List<ClassLoader> list = classLoaders;
        if (list.contains(classLoader)) {
            return;
        }
        list.add(classLoader);
    }

    public final void cleanup() {
        Collection<XC_MethodHook.Unhook> collectionValues = activeHooks.values();
        AbstractC0295Gu.m625r(-298006305830965L);
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((XC_MethodHook.Unhook) it.next()).unhook();
        }
        activeHooks.clear();
        AbstractC0295Gu.m625r(-298083615242293L);
        AbstractC0295Gu.m625r(-298130859882549L);
    }

    public final int getActiveHookCount() {
        return activeHooks.size();
    }

    public final void register(Lua lua) {
        AbstractC0295Gu.m625r(-283141424019509L);
        lua.getGlobal(AbstractC0295Gu.m625r(-283158603888693L));
        if (lua.isNil(-1)) {
            lua.pop(1);
            lua.createTable(0, 5);
        }
        lua.push(new C1355e9(6));
        lua.setField(-2, AbstractC0295Gu.m625r(-283188668659765L));
        lua.push(new C1355e9(7));
        lua.setField(-2, AbstractC0295Gu.m625r(-283210143496245L));
        lua.push(new C1355e9(8));
        lua.setField(-2, AbstractC0295Gu.m625r(-283261683103797L));
        lua.push(new C1355e9(9));
        lua.setField(-2, AbstractC0295Gu.m625r(-283291747874869L));
        lua.push(new C1355e9(10));
        lua.setField(-2, AbstractC0295Gu.m625r(-283334697547829L));
        lua.push(new C1355e9(11));
        lua.setField(-2, AbstractC0295Gu.m625r(-283377647220789L));
        lua.push(new C1355e9(12));
        lua.setField(-2, AbstractC0295Gu.m625r(-281775624419381L));
        lua.push(new C1355e9(13));
        lua.setField(-2, AbstractC0295Gu.m625r(-281814279125045L));
        lua.setGlobal(AbstractC0295Gu.m625r(-281852933830709L));
        AbstractC0295Gu.m625r(-281882998601781L);
        AbstractC0295Gu.m625r(-281930243242037L);
    }

    public final void setClassLoaders(List<? extends ClassLoader> list) {
        AbstractC0295Gu.m625r(-283626755323957L);
        List<ClassLoader> list2 = classLoaders;
        list2.clear();
        list2.addAll(list);
    }
}
