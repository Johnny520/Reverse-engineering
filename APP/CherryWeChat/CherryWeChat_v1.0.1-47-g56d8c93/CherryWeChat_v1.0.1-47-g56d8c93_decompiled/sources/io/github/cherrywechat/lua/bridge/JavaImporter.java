package io.github.cherrywechat.lua.bridge;

import io.github.cherrywechat.lua.bridge.JavaImporter;
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
import p000.C1227bm;
import p000.C1355e9;
import p000.C2694x;
import party.iroiro.luajava.JFunction;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public final class JavaImporter {
    private static final String TAG = AbstractC0295Gu.m625r(-347140731697205L);
    public static final JavaImporter INSTANCE = new JavaImporter();
    private static final ConcurrentHashMap<String, Class<?>> classCache = new ConcurrentHashMap<>();
    private static final Map<String, String> packageAliases = AbstractC2598uq.m5110L(new C0208Et(AbstractC0295Gu.m625r(-345547298830389L), AbstractC0295Gu.m625r(-345555888764981L)), new C0208Et(AbstractC0295Gu.m625r(-345598838437941L), AbstractC0295Gu.m625r(-345616018307125L)), new C0208Et(AbstractC0295Gu.m625r(-345689032751157L), AbstractC0295Gu.m625r(-345714802554933L)), new C0208Et(AbstractC0295Gu.m625r(-345255241054261L), AbstractC0295Gu.m625r(-345276715890741L)), new C0208Et(AbstractC0295Gu.m625r(-345354025302069L), AbstractC0295Gu.m625r(-345388385040437L)), new C0208Et(AbstractC0295Gu.m625r(-345491464255541L), AbstractC0295Gu.m625r(-345521529026613L)), new C0208Et(AbstractC0295Gu.m625r(-346170069088309L), AbstractC0295Gu.m625r(-346200133859381L)), new C0208Et(AbstractC0295Gu.m625r(-346277443270709L), AbstractC0295Gu.m625r(-346311803009077L)), new C0208Et(AbstractC0295Gu.m625r(-345843651573813L), AbstractC0295Gu.m625r(-345873716344885L)));

    private JavaImporter() {
    }

    private final Class<?> boxPrimitive(Class<?> cls) {
        return AbstractC0585Nj.m1134a(cls, Boolean.TYPE) ? Boolean.class : AbstractC0585Nj.m1134a(cls, Byte.TYPE) ? Byte.class : AbstractC0585Nj.m1134a(cls, Character.TYPE) ? Character.class : AbstractC0585Nj.m1134a(cls, Short.TYPE) ? Short.class : AbstractC0585Nj.m1134a(cls, Integer.TYPE) ? Integer.class : AbstractC0585Nj.m1134a(cls, Long.TYPE) ? Long.class : AbstractC0585Nj.m1134a(cls, Float.TYPE) ? Float.class : AbstractC0585Nj.m1134a(cls, Double.TYPE) ? Double.class : cls;
    }

    private final Constructor<?> findMatchingConstructor(Class<?> cls, Class<?>[] clsArr) {
        Constructor<?>[] constructors = cls.getConstructors();
        C2694x c2694x = new C2694x(1, constructors);
        while (c2694x.hasNext()) {
            Constructor<?> constructor = (Constructor) c2694x.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            AbstractC0295Gu.m625r(-349541618415669L);
            if (isMatchingSignature(parameterTypes, clsArr)) {
                return constructor;
            }
        }
        C2694x c2694x2 = new C2694x(1, constructors);
        while (c2694x2.hasNext()) {
            Constructor<?> constructor2 = (Constructor) c2694x2.next();
            Class<?>[] parameterTypes2 = constructor2.getParameterTypes();
            AbstractC0295Gu.m625r(-349640402663477L);
            if (isLooseMatchingSignature(parameterTypes2, clsArr)) {
                return constructor2;
            }
        }
        return null;
    }

    private final Method findMatchingMethod(List<Method> list, Class<?>[] clsArr) {
        for (Method method : list) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            AbstractC0295Gu.m625r(-349189431097397L);
            if (isMatchingSignature(parameterTypes, clsArr)) {
                return method;
            }
        }
        for (Method method2 : list) {
            Class<?>[] parameterTypes2 = method2.getParameterTypes();
            AbstractC0295Gu.m625r(-349288215345205L);
            if (isLooseMatchingSignature(parameterTypes2, clsArr)) {
                return method2;
            }
        }
        return null;
    }

    private final boolean isAssignable(Class<?> cls, Class<?> cls2) {
        if (cls.isAssignableFrom(cls2)) {
            return true;
        }
        return boxPrimitive(cls).isAssignableFrom(boxPrimitive(cls2));
    }

    private final boolean isLooseAssignable(Class<?> cls, Class<?> cls2) {
        if (isAssignable(cls, cls2)) {
            return true;
        }
        Set setM997B = AbstractC0513Lx.m997B(Byte.TYPE, Short.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class);
        if (setM997B.contains(boxPrimitive(cls)) && setM997B.contains(boxPrimitive(cls2))) {
            return true;
        }
        return AbstractC0585Nj.m1134a(cls, CharSequence.class) && AbstractC0585Nj.m1134a(cls2, String.class);
    }

    private final boolean isLooseMatchingSignature(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        int length = clsArr.length;
        for (int i = 0; i < length; i++) {
            Class<?> cls = clsArr[i];
            Class<?> cls2 = clsArr2[i];
            if (cls2 != null && !isLooseAssignable(cls, cls2)) {
                return false;
            }
        }
        return true;
    }

    private final boolean isMatchingSignature(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        int length = clsArr.length;
        for (int i = 0; i < length; i++) {
            Class<?> cls = clsArr[i];
            Class<?> cls2 = clsArr2[i];
            if (cls2 == null) {
                if (cls.isPrimitive()) {
                    return false;
                }
            } else if (!isAssignable(cls, cls2)) {
                return false;
            }
        }
        return true;
    }

    private final Class<?> loadClass(String str, List<? extends ClassLoader> list) {
        String str2 = packageAliases.get(str);
        if (str2 != null) {
            str = str2;
        }
        Class<?> cls = classCache.get(str);
        if (cls != null) {
            return cls;
        }
        if (AbstractC0085Bz.m132J(str, false, AbstractC0295Gu.m625r(-348549480970293L))) {
            AbstractC0295Gu.m625r(-348562365872181L);
            AbstractC0295Gu.m625r(-348618200447029L);
            return null;
        }
        Iterator<? extends ClassLoader> it = list.iterator();
        while (it.hasNext()) {
            try {
                Class<?> clsLoadClass = it.next().loadClass(str);
                classCache.put(str, clsLoadClass);
                return clsLoadClass;
            } catch (ClassNotFoundException unused) {
            }
        }
        try {
            Class<?> cls2 = Class.forName(str);
            classCache.put(str, cls2);
            return cls2;
        } catch (ClassNotFoundException unused2) {
            return tryLoadInnerClass(str, list);
        }
    }

    private final void pushClassWrapper(Lua lua, Class<?> cls) {
        lua.createTable(0, 4);
        lua.push(new C1227bm(0, cls));
        lua.setField(-2, AbstractC0295Gu.m625r(-349378409658421L));
        lua.push(new C1227bm(1, cls));
        lua.setField(-2, AbstractC0295Gu.m625r(-349408474429493L));
        lua.push(new C1227bm(2, cls));
        lua.setField(-2, AbstractC0295Gu.m625r(-349442834167861L));
        lua.createTable(0, 1);
        lua.push(cls, Lua.Conversion.SEMI);
        lua.setField(-2, AbstractC0295Gu.m625r(-349490078808117L));
        lua.insert(-2);
        lua.setMetatable(-2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pushClassWrapper$lambda$3(Class cls, Lua lua) {
        AbstractC0295Gu.m625r(-347716257314869L);
        try {
            int top = lua.getTop() - 1;
            Object[] objArr = new Object[top];
            for (int i = 0; i < top; i++) {
                objArr[i] = lua.toObject(i + 2);
            }
            ArrayList arrayList = new ArrayList(top);
            for (int i2 = 0; i2 < top; i2++) {
                Object obj = objArr[i2];
                arrayList.add(obj != null ? obj.getClass() : null);
            }
            Constructor<?> constructorFindMatchingConstructor = INSTANCE.findMatchingConstructor(cls, (Class[]) arrayList.toArray(new Class[0]));
            if (constructorFindMatchingConstructor != null) {
                constructorFindMatchingConstructor.setAccessible(true);
                lua.push(constructorFindMatchingConstructor.newInstance(Arrays.copyOf(objArr, top)), Lua.Conversion.SEMI);
                return 1;
            }
            lua.pushNil();
            lua.push(AbstractC0295Gu.m625r(-348274603063349L) + cls.getSimpleName());
            return 2;
        } catch (Exception e) {
            AbstractC0295Gu.m625r(-348424926918709L);
            AbstractC0295Gu.m625r(-348480761493557L);
            lua.pushNil();
            AbstractC0213Ey.m415m(-348034084894773L, new StringBuilder(), e, lua);
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2, types: [party.iroiro.luajava.Lua] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.reflect.Method[]] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.lang.reflect.Method] */
    public static final int pushClassWrapper$lambda$5(Class cls, Lua lua) {
        ?? methods;
        Field field;
        AbstractC0295Gu.m625r(-348119984240693L);
        String string = lua.toString(2);
        if (string == null) {
            return 0;
        }
        Class<?> cls2 = null;
        try {
            try {
                field = cls.getField(string);
            } catch (NoSuchFieldException unused) {
                field = null;
            }
        } catch (Exception unused2) {
            methods = lua;
            AbstractC0213Ey.m412j(-348197293652021L, -348253128226869L, methods);
            return 1;
        }
        if (field != null && Modifier.isStatic(field.getModifiers())) {
            field.setAccessible(true);
            lua.push(field.get(null), Lua.Conversion.SEMI);
            return 1;
        }
        methods = cls.getMethods();
        AbstractC0295Gu.m625r(-348128574175285L);
        ArrayList arrayList = new ArrayList();
        for (?? r4 : methods) {
            if (AbstractC0585Nj.m1134a(r4.getName(), string) && Modifier.isStatic(r4.getModifiers())) {
                arrayList.add(r4);
            }
        }
        try {
        } catch (Exception unused3) {
            AbstractC0213Ey.m412j(-348197293652021L, -348253128226869L, methods);
        }
        if (!arrayList.isEmpty()) {
            INSTANCE.pushMethodWrapper(lua, null, cls, string, arrayList);
            return 1;
        }
        try {
            cls2 = Class.forName(cls.getName() + '$' + string);
        } catch (ClassNotFoundException unused4) {
        }
        if (cls2 != null) {
            INSTANCE.pushClassWrapper(lua, cls2);
            return 1;
        }
        lua.pushNil();
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pushClassWrapper$lambda$6(Class cls, Lua lua) {
        AbstractC0295Gu.m625r(-346702645033013L);
        lua.push(AbstractC0295Gu.m625r(-346711234967605L) + cls.getName() + '>');
        return 1;
    }

    private final void pushMethodWrapper(Lua lua, final Object obj, Class<?> cls, final String str, final List<Method> list) {
        lua.push(new JFunction() { // from class: am
            @Override // party.iroiro.luajava.JFunction
            public final int __call(Lua lua2) {
                return JavaImporter.pushMethodWrapper$lambda$8(list, obj, str, lua2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int pushMethodWrapper$lambda$8(List list, Object obj, String str, Lua lua) {
        String message;
        AbstractC0295Gu.m625r(-346758479607861L);
        try {
            int top = lua.getTop();
            Object[] objArr = new Object[top];
            int i = 0;
            while (i < top) {
                int i2 = i + 1;
                objArr[i] = lua.toObject(i2);
                i = i2;
            }
            ArrayList arrayList = new ArrayList(top);
            for (int i3 = 0; i3 < top; i3++) {
                Object obj2 = objArr[i3];
                arrayList.add(obj2 != null ? obj2.getClass() : null);
            }
            Method methodFindMatchingMethod = INSTANCE.findMatchingMethod(list, (Class[]) arrayList.toArray(new Class[0]));
            if (methodFindMatchingMethod != null) {
                methodFindMatchingMethod.setAccessible(true);
                Object objInvoke = methodFindMatchingMethod.invoke(obj, Arrays.copyOf(objArr, top));
                if (AbstractC0585Nj.m1134a(methodFindMatchingMethod.getReturnType(), Void.TYPE)) {
                    return 0;
                }
                lua.push(objInvoke, Lua.Conversion.SEMI);
                return 1;
            }
            lua.pushNil();
            lua.push(AbstractC0295Gu.m625r(-346767069542453L) + str + AbstractC0295Gu.m625r(-346857263855669L));
            return 2;
        } catch (Exception e) {
            AbstractC0295Gu.m625r(-346891623594037L);
            AbstractC0295Gu.m625r(-346397702354997L);
            lua.pushNil();
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC0295Gu.m625r(-346487896668213L));
            Throwable cause = e.getCause();
            if (cause == null || (message = cause.getMessage()) == null) {
                message = e.getMessage();
            }
            sb.append(message);
            lua.push(sb.toString());
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$0(List list, Lua lua) {
        AbstractC0295Gu.m625r(-347935300646965L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        try {
            JavaImporter javaImporter = INSTANCE;
            Class<?> clsLoadClass = javaImporter.loadClass(string, list);
            if (clsLoadClass != null) {
                javaImporter.pushClassWrapper(lua, clsLoadClass);
                return 1;
            }
            lua.pushNil();
            lua.push(AbstractC0295Gu.m625r(-347943890581557L).concat(string));
            return 2;
        } catch (Exception e) {
            AbstractC0295Gu.m625r(-347471444178997L);
            AbstractC0295Gu.m625r(-347527278753845L);
            lua.pushNil();
            AbstractC0213Ey.m415m(-347634652936245L, new StringBuilder(), e, lua);
            return 2;
        }
    }

    private final void registerLuaJavaNamespace(Lua lua, List<? extends ClassLoader> list) {
        lua.createTable(0, 4);
        lua.push(new C1102Zl(1, list));
        lua.setField(-2, AbstractC0295Gu.m625r(-347737732151349L));
        lua.push(new C1102Zl(2, list));
        lua.setField(-2, AbstractC0295Gu.m625r(-347780681824309L));
        lua.push(new C1102Zl(3, list));
        lua.setField(-2, AbstractC0295Gu.m625r(-347832221431861L));
        lua.setGlobal(AbstractC0295Gu.m625r(-347883761039413L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerLuaJavaNamespace$lambda$11(List list, Lua lua) {
        AbstractC0295Gu.m625r(-346560911112245L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        Class<?> clsLoadClass = INSTANCE.loadClass(string, list);
        if (clsLoadClass == null) {
            lua.pushNil();
            lua.push(AbstractC0295Gu.m625r(-346569501046837L).concat(string));
            return 2;
        }
        try {
            int top = lua.getTop() - 1;
            Object[] objArr = new Object[top];
            for (int i = 0; i < top; i++) {
                objArr[i] = lua.toObject(i + 2);
            }
            ArrayList arrayList = new ArrayList(top);
            for (int i2 = 0; i2 < top; i2++) {
                Object obj = objArr[i2];
                arrayList.add(obj != null ? obj.getClass() : null);
            }
            Constructor<?> constructorFindMatchingConstructor = INSTANCE.findMatchingConstructor(clsLoadClass, (Class[]) arrayList.toArray(new Class[0]));
            if (constructorFindMatchingConstructor != null) {
                constructorFindMatchingConstructor.setAccessible(true);
                lua.push(constructorFindMatchingConstructor.newInstance(Arrays.copyOf(objArr, top)), Lua.Conversion.SEMI);
                return 1;
            }
            lua.pushNil();
            lua.push(AbstractC0295Gu.m625r(-347196566272053L));
            return 2;
        } catch (Exception e) {
            lua.pushNil();
            AbstractC0213Ey.m415m(-347299645487157L, new StringBuilder(), e, lua);
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerLuaJavaNamespace$lambda$12(List list, Lua lua) {
        AbstractC0295Gu.m625r(-347334005225525L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        Class<?> clsLoadClass = INSTANCE.loadClass(string, list);
        if (clsLoadClass == null || !clsLoadClass.isInterface()) {
            lua.pushNil();
            lua.push(AbstractC0295Gu.m625r(-347342595160117L).concat(string));
            return 2;
        }
        try {
            lua.push(InterfaceProxy.INSTANCE.create(lua, clsLoadClass, 2), Lua.Conversion.SEMI);
            return 1;
        } catch (Exception e) {
            lua.pushNil();
            AbstractC0213Ey.m415m(-347424199538741L, new StringBuilder(), e, lua);
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerLuaJavaNamespace$lambda$9(List list, Lua lua) {
        AbstractC0295Gu.m625r(-346552321177653L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        JavaImporter javaImporter = INSTANCE;
        Class<?> clsLoadClass = javaImporter.loadClass(string, list);
        if (clsLoadClass != null) {
            javaImporter.pushClassWrapper(lua, clsLoadClass);
        } else {
            lua.pushNil();
        }
        return 1;
    }

    private final void registerNewFunction(Lua lua) {
        lua.push(new C1355e9(14));
        lua.setGlobal(AbstractC0295Gu.m625r(-347918120777781L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int registerNewFunction$lambda$14(Lua lua) {
        Class<?> cls;
        AbstractC0295Gu.m625r(-346934573266997L);
        int i = 1;
        Object object = lua.toObject(1);
        if (object instanceof Class) {
            cls = (Class) object;
        } else if (object instanceof String) {
            try {
                cls = Class.forName((String) object);
            } catch (Exception unused) {
                cls = null;
            }
        } else {
            cls = null;
        }
        if (cls == null) {
            lua.pushNil();
            lua.push(AbstractC0295Gu.m625r(-346943163201589L));
            return 2;
        }
        try {
            int top = lua.getTop() - 1;
            Object[] objArr = new Object[top];
            for (int i2 = 0; i2 < top; i2++) {
                objArr[i2] = lua.toObject(i2 + 2);
            }
            ArrayList arrayList = new ArrayList(top);
            for (int i3 = 0; i3 < top; i3++) {
                Object obj = objArr[i3];
                arrayList.add(obj != null ? obj.getClass() : null);
            }
            Constructor<?> constructorFindMatchingConstructor = INSTANCE.findMatchingConstructor(cls, (Class[]) arrayList.toArray(new Class[0]));
            if (constructorFindMatchingConstructor != null) {
                constructorFindMatchingConstructor.setAccessible(true);
                lua.push(constructorFindMatchingConstructor.newInstance(Arrays.copyOf(objArr, top)), Lua.Conversion.SEMI);
            } else {
                lua.pushNil();
                lua.push(AbstractC0295Gu.m625r(-347003292743733L));
                i = 2;
            }
            return i;
        } catch (Exception e) {
            lua.pushNil();
            AbstractC0213Ey.m415m(-347106371958837L, new StringBuilder(), e, lua);
            return 2;
        }
    }

    private final Class<?> tryLoadInnerClass(String str, List<? extends ClassLoader> list) {
        if (!AbstractC2564tz.m5051L(str, AbstractC0295Gu.m625r(-348794294106165L), false)) {
            return null;
        }
        List listM5065Z = AbstractC2564tz.m5065Z(str, new String[]{AbstractC0295Gu.m625r(-348802884040757L)}, 6);
        for (int size = listM5065Z.size() - 1; size > 0; size--) {
            String str2 = AbstractC2453ra.m4901k0(listM5065Z.subList(0, size), AbstractC0295Gu.m625r(-348811473975349L), null, null, null, 62) + '$' + AbstractC2453ra.m4901k0(listM5065Z.subList(size, listM5065Z.size()), AbstractC0295Gu.m625r(-348820063909941L), null, null, null, 62);
            Iterator<? extends ClassLoader> it = list.iterator();
            while (it.hasNext()) {
                try {
                    Class<?> clsLoadClass = it.next().loadClass(str2);
                    classCache.put(str, clsLoadClass);
                    return clsLoadClass;
                } catch (ClassNotFoundException unused) {
                }
            }
        }
        return null;
    }

    public final void clearCache() {
        classCache.clear();
    }

    public final void register(Lua lua, List<? extends ClassLoader> list) {
        AbstractC0295Gu.m625r(-348837243779125L);
        AbstractC0295Gu.m625r(-348854423648309L);
        lua.push(new C1102Zl(0, list));
        lua.setGlobal(AbstractC0295Gu.m625r(-348910258223157L));
        registerLuaJavaNamespace(lua, list);
        registerNewFunction(lua);
        AbstractC0295Gu.m625r(-348940322994229L);
        AbstractC0295Gu.m625r(-348996157569077L);
    }
}
