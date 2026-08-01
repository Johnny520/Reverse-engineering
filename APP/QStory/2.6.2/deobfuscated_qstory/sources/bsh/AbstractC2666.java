package bsh;

import androidx.activity.AbstractC0053;
import bsh.This;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p007.AbstractC6136;
import p280.C8370;
import p383.AbstractC9032;

/* JADX INFO: renamed from: bsh.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2666 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final WeakHashMap f7995;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Pattern f7996;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Object[] f8000 = new Object[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Class[] f7999 = new Class[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final WeakHashMap f7998 = new WeakHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Pattern f7997 = Pattern.compile("[^\\.]+|bsh\\..*");

    static {
        String property = Security.getProperty("package.access");
        if (property == null) {
            property = "null";
        }
        f7996 = Pattern.compile((String) Stream.of((Object[]) property.split(",")).filter(new C2641(7)).collect(Collectors.joining("|", "(?:", ").*")));
        f7995 = new WeakHashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static AbstractC2624 m5383(C2659 c2659, Class cls, Object obj, String str, Object[] objArr, boolean z) throws UtilTargetError {
        Interpreter interpreter;
        if (obj == Primitive.NULL) {
            throw new UtilTargetError(new NullPointerException(AbstractC0053.m156("Attempt to invoke method ", str, " on null value")));
        }
        Class[] clsArrM5351 = AbstractC2661.m5351(objArr);
        AbstractC2624 abstractC2624M5392 = m5392(cls, str, clsArrM5351, z);
        if (c2659 != null && (interpreter = c2659.f7964) != null && interpreter.getStrictJava() && abstractC2624M5392 != null) {
            Class cls2 = abstractC2624M5392.f7883;
            if (cls2.isInterface() && cls2 != cls && Modifier.isStatic(abstractC2624M5392.f7882)) {
                abstractC2624M5392 = null;
            }
        }
        if (abstractC2624M5392 != null) {
            return abstractC2624M5392;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "Static method " : "Method ");
        sb.append(AbstractC2628.m5289(str, clsArrM5351));
        sb.append(" not found in class'");
        sb.append(cls.getName());
        sb.append("'");
        throw new ReflectError(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static AbstractC2624 m5384(Class cls, String str, boolean z) {
        ConcurrentHashMap concurrentHashMap = ((C2655) C2659.f7958.m13853(cls)).f7946;
        AbstractC2624 abstractC2624 = !concurrentHashMap.containsKey(str) ? null : (AbstractC2624) concurrentHashMap.get(str);
        if (abstractC2624 == null) {
            throw new ReflectError(AbstractC6136.m11549(cls, AbstractC6136.m11550("No such field: ", str, " for class: ")));
        }
        if (!z || abstractC2624.mo5268()) {
            return abstractC2624;
        }
        throw new UtilEvalError(AbstractC6136.m11549(cls, AbstractC6136.m11550("Can't reach instance field: ", str, " from static context: ")));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static Object m5385(Object obj, Class cls, String str, Object[] objArr, Interpreter interpreter, CallStack callStack, InterfaceC2618 interfaceC2618) throws EvalError {
        Class cls2;
        cls2 = BigInteger.class;
        Class<BigInteger> cls3 = AbstractC2661.m5345(obj) ? BigDecimal.class : cls2;
        try {
            Object objM5402 = m5402(Primitive.castWrapper(cls3, obj), str, objArr, interpreter, callStack, interfaceC2618);
            return ((objM5402 instanceof Primitive) && ((Primitive) objM5402).getType() == cls3) ? Primitive.wrap(Primitive.castWrapper(cls, objM5402), (Class<?>) cls) : objM5402;
        } catch (TargetError e) {
            throw e.reThrow("Method found on " + cls3.getSimpleName() + " but with error");
        } catch (EvalError unused) {
            cls2 = AbstractC2661.m5345(obj) ? BigInteger.class : BigDecimal.class;
            Object objM54022 = m5402(Primitive.castWrapper(cls2, obj), str, objArr, interpreter, callStack, interfaceC2618);
            return ((objM54022 instanceof Primitive) && ((Primitive) objM54022).getType() == cls2) ? Primitive.wrap(Primitive.castWrapper(cls, objM54022), (Class<?>) cls) : objM54022;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static void m5386(String str, AbstractC2624 abstractC2624, Object[] objArr) {
        if (Interpreter.DEBUG.get().booleanValue()) {
            Interpreter.debug(str, abstractC2624, " with args:");
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                Interpreter.debug("args[", Integer.valueOf(i), "] = ", obj, " type = ", obj == null ? "<unknown>" : obj.getClass());
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static boolean m5387(Class cls) {
        return (cls == null || cls == GeneratedClass.class || !GeneratedClass.class.isAssignableFrom(cls)) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static Object m5388(C2659 c2659, Class cls, String str, Object[] objArr, InterfaceC2618 interfaceC2618) {
        Interpreter.debug("invoke static Method");
        NameSpace nameSpaceM5400 = m5400(cls);
        if (nameSpaceM5400 != null) {
            nameSpaceM5400.setNode(interfaceC2618);
        }
        return m5383(c2659, cls, null, str, objArr, true).mo5272(null, objArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static TargetError m5389(InvocationTargetException invocationTargetException, String str, CallStack callStack, InterfaceC2618 interfaceC2618) {
        String strM152 = AbstractC0053.m152("Method Invocation ", str);
        Throwable cause = invocationTargetException.getCause();
        boolean z = true;
        if ((cause instanceof EvalError) && (!(cause instanceof TargetError) || !((TargetError) cause).inNativeCode())) {
            z = false;
        }
        return new TargetError(strM152, cause, interfaceC2618, callStack, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static BshMethod m5390(Class cls, String str) {
        C2655 c2655 = (C2655) C2659.f7958.m13853(cls);
        AbstractC2624 abstractC2624 = !c2655.f7947.containsKey(str) ? null : (AbstractC2624) c2655.m5316(str).stream().filter(new C2641(1)).findFirst().get();
        if (abstractC2624 != null) {
            return new BshMethod(abstractC2624, (Object) null);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static Object m5391(Object obj, Object obj2, Object obj3) {
        Map map = AbstractC2661.f7970;
        if (obj instanceof Map) {
            return ((Map) obj).put(obj2, Primitive.unwrap(obj3));
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (obj2.equals(entry.getKey())) {
                return entry.setValue(Primitive.unwrap(obj3));
            }
            StringBuilder sb = new StringBuilder("No such property setter: ");
            sb.append(obj2);
            String strM5283 = AbstractC2628.m5283(obj);
            sb.append(" for type: ");
            sb.append(strM5283);
            throw new ReflectError(sb.toString());
        }
        Class<?> cls = obj.getClass();
        if (AbstractC2661.m5339(cls)) {
            return m5416(obj2, (Map.Entry[]) obj).setValue(Primitive.unwrap(obj3));
        }
        if (obj instanceof Class) {
            cls = (Class) obj;
        }
        AbstractC2624 abstractC2624M5317 = ((C2655) C2659.f7958.m13853(cls)).m5317(obj2.toString());
        if (abstractC2624M5317 != null) {
            try {
                return abstractC2624M5317.mo5272(obj, Primitive.unwrap(obj3));
            } catch (InvocationTargetException e) {
                throw new ReflectError("Property accessor threw exception: " + e.getCause(), e.getCause());
            }
        }
        StringBuilder sb2 = new StringBuilder("No such property setter: ");
        sb2.append(obj2);
        String strM5280 = AbstractC2628.m5280(cls);
        sb2.append(" for type: ");
        sb2.append(strM5280);
        throw new ReflectError(sb2.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static AbstractC2624 m5392(Class cls, String str, Class[] clsArr, boolean z) {
        if (cls == null) {
            C2632.m5297("null class");
            return null;
        }
        AbstractC2624 abstractC2624M5318 = ((C2655) C2659.f7958.m13853(cls)).m5318(str, clsArr);
        Interpreter.debug("resolved java method: ", abstractC2624M5318, " on class: ", cls);
        if (abstractC2624M5318 == null || !z || abstractC2624M5318.mo5268()) {
            return abstractC2624M5318;
        }
        throw new UtilEvalError("Cannot reach instance method: " + AbstractC2628.m5289(abstractC2624M5318.f7878, abstractC2624M5318.mo5264()) + " from static context: " + cls.getName());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static This m5393(Object obj, String str) {
        try {
            return (This) Primitive.unwrap(m5410(obj, This.Keys.BSHTHIS + str));
        } catch (Exception e) {
            C2632.m5293("Generated class: Error getting This ", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m5394(Class[] clsArr, Class[][] clsArr2) {
        int i = 1;
        while (true) {
            int i2 = -1;
            if (i > 4) {
                return -1;
            }
            Class[] clsArr3 = null;
            for (int i3 = 0; i3 < clsArr2.length; i3++) {
                Class[] clsArr4 = clsArr2[i3];
                if ((clsArr3 == null || !AbstractC2661.m5333(clsArr4, clsArr3)) && AbstractC2661.m5336(clsArr, clsArr4, i) && (clsArr3 == null || AbstractC2661.m5333(clsArr, clsArr4) || (AbstractC2661.m5336(clsArr4, clsArr3, 1) && !AbstractC2661.m5333(clsArr, clsArr3)))) {
                    i2 = i3;
                    clsArr3 = clsArr4;
                }
            }
            if (clsArr3 != null) {
                return i2;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static int m5395(Class[] clsArr, List list) {
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sbM148 = AbstractC0053.m148(i, "  ", "=");
            sbM148.append(((AbstractC2624) list.get(i)).f7879);
            Interpreter.debug(sbM148.toString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Class[] clsArrMo5264 = ((AbstractC2624) it.next()).mo5264();
            if (clsArr.length == clsArrMo5264.length) {
                arrayList2.add(Integer.valueOf(i2));
                arrayList.add(clsArrMo5264);
            }
            i2++;
        }
        int iM5394 = m5394(clsArr, (Class[][]) arrayList.toArray(new Class[arrayList.size()][]));
        if (iM5394 >= 0) {
            int iIntValue = ((Integer) arrayList2.get(iM5394)).intValue();
            Interpreter.debug(" remap=" + Arrays.toString(arrayList2.toArray(new Integer[0])));
            Interpreter.debug(" match=" + iIntValue);
            return iIntValue;
        }
        arrayList.clear();
        arrayList2.clear();
        Iterator it2 = list.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            AbstractC2624 abstractC2624 = (AbstractC2624) it2.next();
            Class[] clsArrMo52642 = abstractC2624.mo5264();
            if (abstractC2624.mo5269() && clsArr.length >= clsArrMo52642.length - 1) {
                Class[] clsArr2 = new Class[clsArr.length];
                System.arraycopy(clsArrMo52642, 0, clsArr2, 0, clsArrMo52642.length - 1);
                Arrays.fill(clsArr2, clsArrMo52642.length - 1, clsArr.length, abstractC2624.mo5270());
                arrayList2.add(Integer.valueOf(i3));
                arrayList.add(clsArr2);
            }
            i3++;
        }
        int iM53942 = m5394(clsArr, (Class[][]) arrayList.toArray(new Class[arrayList.size()][]));
        if (iM53942 >= 0) {
            iM53942 = ((Integer) arrayList2.get(iM53942)).intValue();
        }
        Interpreter.debug(" remap (varargs) =" + Arrays.toString(arrayList2.toArray(new Integer[0])));
        Interpreter.debug(" match (varargs) =" + iM53942);
        return iM53942;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m5396(Class[] clsArr, List list) {
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sbM148 = AbstractC0053.m148(i, "  ", ":");
            sbM148.append(((BshMethod) list.get(i)).toString());
            sbM148.append(" ");
            sbM148.append(((BshMethod) list.get(i)).getClass().getName());
            Interpreter.debug(sbM148.toString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Class<?>[] parameterTypes = ((BshMethod) it.next()).getParameterTypes();
            if (clsArr.length == parameterTypes.length) {
                arrayList2.add(Integer.valueOf(i2));
                arrayList.add(parameterTypes);
            }
            i2++;
        }
        int iM5394 = m5394(clsArr, (Class[][]) arrayList.toArray(new Class[arrayList.size()][]));
        if (iM5394 >= 0) {
            int iIntValue = ((Integer) arrayList2.get(iM5394)).intValue();
            Interpreter.debug(" remap: " + arrayList2);
            Interpreter.debug(" match:" + iIntValue);
            return iIntValue;
        }
        arrayList.clear();
        arrayList2.clear();
        Iterator it2 = list.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            BshMethod bshMethod = (BshMethod) it2.next();
            Class<?>[] parameterTypes2 = bshMethod.getParameterTypes();
            if (bshMethod.isVarArgs() && clsArr.length >= parameterTypes2.length - 1) {
                Class[] clsArr2 = new Class[clsArr.length];
                System.arraycopy(parameterTypes2, 0, clsArr2, 0, parameterTypes2.length - 1);
                Arrays.fill(clsArr2, parameterTypes2.length - 1, clsArr.length, parameterTypes2[parameterTypes2.length - 1].getComponentType());
                arrayList2.add(Integer.valueOf(i3));
                arrayList.add(clsArr2);
            }
            i3++;
        }
        int iM53942 = m5394(clsArr, (Class[][]) arrayList.toArray(new Class[arrayList.size()][]));
        if (iM53942 < 0) {
            return iM53942;
        }
        int iIntValue2 = ((Integer) arrayList2.get(iM53942)).intValue();
        Interpreter.debug(" remap (varargs): " + Arrays.toString(arrayList2.toArray(new Integer[0])));
        Interpreter.debug(" match (varargs):" + iIntValue2);
        return iIntValue2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Object m5397(Class cls, Object obj, Object[] objArr) throws InvocationTargetException {
        if (cls == null) {
            return Primitive.NULL;
        }
        if (cls.isInterface()) {
            throw new ReflectError(AbstractC9032.m14590(cls, "Can't create instance of an interface: "));
        }
        Class[] clsArrM5351 = AbstractC2661.m5351(objArr);
        if (cls.isMemberClass() && !Modifier.isStatic(cls.getModifiers()) && obj != null) {
            clsArrM5351 = (Class[]) Stream.concat(Stream.of(obj.getClass()), Stream.of((Object[]) clsArrM5351)).toArray(new C2649(9));
        }
        Interpreter.debug("Looking for most specific constructor: ", cls);
        AbstractC2624 abstractC2624M5318 = ((C2655) C2659.f7958.m13853(cls)).m5318(cls.getName(), clsArrM5351);
        if (abstractC2624M5318 == null || !(objArr.length == abstractC2624M5318.mo5265() || abstractC2624M5318.mo5269() || abstractC2624M5318.mo5271())) {
            if (clsArrM5351.length == 0) {
                throw new ReflectError(AbstractC9032.m14590(cls, "Can't find default constructor for: "));
            }
            throw new ReflectError("Can't find constructor: " + AbstractC2628.m5289(cls.getName(), clsArrM5351) + " in class: " + cls.getName());
        }
        try {
            return abstractC2624M5318.mo5272(obj, objArr);
        } catch (InvocationTargetException e) {
            if (!(e.getCause().getCause() instanceof IllegalAccessException)) {
                throw e;
            }
            throw new ReflectError("We don't have permission to create an instance. " + e.getCause().getCause().getMessage() + " Use setAccessibility(true) to enable access.", e.getCause().getCause());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m5398(String str, String str2) {
        WeakHashMap weakHashMap = f7998;
        if (!weakHashMap.containsKey(str2)) {
            char[] charArray = str2.toCharArray();
            charArray[0] = Character.toUpperCase(charArray[0]);
            weakHashMap.put(str2, new String(charArray));
        }
        StringBuilder sbM149 = AbstractC0053.m149(str);
        sbM149.append((String) weakHashMap.get(str2));
        return sbM149.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static NameSpace m5399(Object obj) {
        if (obj == null) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (!m5387(cls)) {
            return null;
        }
        try {
            return obj instanceof Proxy ? m5400(cls.getInterfaces()[0]) : m5393(obj, cls.getSimpleName()).namespace;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static NameSpace m5400(Class cls) {
        if (!m5387(cls)) {
            return null;
        }
        try {
            return m5411(cls, cls.getSimpleName()).namespace;
        } catch (Exception e) {
            if (e.getCause() instanceof UtilTargetError) {
                throw new InterpreterError(e.getCause().getCause().getMessage(), e.getCause().getCause());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static Object m5401(Class cls, Object[] objArr, Interpreter interpreter, CallStack callStack, InterfaceC2618 interfaceC2618) throws UtilEvalError {
        Object[] objArr2 = new Object[objArr.length + 2];
        objArr2[0] = interpreter;
        objArr2[1] = callStack;
        System.arraycopy(objArr, 0, objArr2, 2, objArr.length);
        try {
            return m5388(interpreter.getClassManager(), cls, "invoke", objArr2, interfaceC2618);
        } catch (ReflectError e) {
            throw new UtilEvalError("Error invoking compiled command: " + e, e);
        } catch (InvocationTargetException e2) {
            throw new UtilEvalError("Error in compiled command: " + e2.getCause(), e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [bsh.NameSpace] */
    /* JADX WARN: Type inference failed for: r10v1, types: [bsh.UtilEvalError] */
    /* JADX WARN: Type inference failed for: r10v23, types: [bsh.飘花落叶言子世哲苏楪兰] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v1, types: [bsh.BshMethod] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [bsh.CallStack] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [bsh.飘花落叶言子世兰苏楪哲] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static Object m5402(Object obj, String str, Object[] objArr, Interpreter interpreter, CallStack callStack, InterfaceC2618 interfaceC2618) throws EvalError {
        ?? r6;
        ?? r7;
        ?? r10;
        ?? r72;
        ?? r62;
        ?? r4;
        ?? r5;
        if ((obj instanceof This) && !This.isExposedThisMethod(str)) {
            return ((This) obj).invokeMethod(str, objArr, interpreter, callStack, interfaceC2618, false);
        }
        C2659 classManager = interpreter.getClassManager();
        boolean z = obj instanceof Primitive;
        try {
            Class<?> type = obj.getClass();
            if (z) {
                try {
                    if (str.equals("equals")) {
                        return Boolean.valueOf(((Primitive) obj).equals(objArr[0]));
                    }
                    if (obj != Primitive.NULL && obj != Primitive.VOID) {
                        type = ((Primitive) obj).getType();
                        obj = Primitive.unwrap(obj);
                    }
                    if (!str.equals("getType")) {
                        if (str.equals("getClass")) {
                        }
                    }
                    return obj == Primitive.VOID ? ((Primitive) obj).getType() : type;
                } catch (UtilEvalError e) {
                    r10 = e;
                    r62 = callStack;
                    r72 = interfaceC2618;
                    throw r10.toEvalError(r72, r62);
                }
            }
            Object obj2 = obj;
            r6 = str;
            r7 = objArr;
            Class<?> cls = type;
            try {
                ?? M5383 = m5383(classManager, cls, obj2, r6, r7, false);
                r4 = r6;
                r5 = r7;
                try {
                    NameSpace nameSpaceM5399 = m5399(obj2);
                    if (nameSpaceM5399 != null) {
                        nameSpaceM5399.setNode(interfaceC2618);
                    }
                    return M5383.mo5272(obj2, r5);
                } catch (ReflectError e2) {
                    e = e2;
                    ReflectError reflectError = e;
                    try {
                        if (obj2 == Primitive.VOID) {
                            throw new EvalError("Attempt to invoke method: " + r4 + "() on undefined", interfaceC2618, callStack, reflectError);
                        }
                        ?? extensionMethod = callStack.top().getExtensionMethod(type, r4, AbstractC2661.m5351(r5));
                        if (extensionMethod != 0) {
                            return extensionMethod.invoke(r5, interpreter, callStack, interfaceC2618, false, obj2);
                        }
                        CallStack callStack2 = callStack;
                        InterfaceC2618 interfaceC26182 = interfaceC2618;
                        Object obj3 = obj2;
                        if (z && !interpreter.getStrictJava()) {
                            try {
                                if (!AbstractC2661.m5338(obj3)) {
                                    return m5402(obj3, r4, r5, interpreter, callStack2, interfaceC26182);
                                }
                                try {
                                    return m5385(obj3, type, r4, r5, interpreter, callStack2, interfaceC26182);
                                } catch (TargetError e3) {
                                    e = e3;
                                    throw e;
                                } catch (EvalError unused) {
                                    callStack2 = callStack2;
                                    interfaceC26182 = interfaceC26182;
                                    throw new EvalError("Error in method invocation: " + reflectError.getMessage(), interfaceC26182, callStack2, reflectError);
                                } catch (UtilEvalError e4) {
                                    e = e4;
                                    r6 = callStack2;
                                    r7 = interfaceC26182;
                                    r10 = e;
                                    r62 = r6;
                                    r72 = r7;
                                    throw r10.toEvalError(r72, r62);
                                }
                            } catch (TargetError e5) {
                                e = e5;
                            } catch (EvalError unused2) {
                            }
                            throw e;
                        }
                        throw new EvalError("Error in method invocation: " + reflectError.getMessage(), interfaceC26182, callStack2, reflectError);
                    } catch (UtilEvalError e6) {
                        e = e6;
                    }
                    r10 = e;
                    r62 = r6;
                    r72 = r7;
                    throw r10.toEvalError(r72, r62);
                } catch (InvocationTargetException e7) {
                    e = e7;
                    throw m5389(e, r4, callStack, interfaceC2618);
                }
            } catch (ReflectError e8) {
                e = e8;
                type = cls;
                obj2 = obj2;
                r4 = r6;
                r5 = r7;
            } catch (InvocationTargetException e9) {
                e = e9;
                r4 = r6;
            }
        } catch (UtilEvalError e10) {
            e = e10;
            r6 = callStack;
            r7 = interfaceC2618;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static Variable[] m5403(NameSpace nameSpace) {
        int i = 0;
        String[] strArr = nameSpace == null ? new String[0] : (String[]) Stream.of((Object[]) nameSpace.getVariableNames()).filter(new C2641(6)).toArray(new C2649(11));
        return (nameSpace == null || strArr == null) ? new Variable[0] : (Variable[]) Stream.of((Object[]) strArr).map(new C2668(nameSpace, i)).filter(new C2641(4)).toArray(new C2649(10));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static boolean m5404(Class cls, String str) {
        Map map = AbstractC2661.f7970;
        if (Map.class.isAssignableFrom(cls) || Map.Entry.class.isAssignableFrom(cls) || AbstractC2661.m5339(cls)) {
            return true;
        }
        C8370 c8370 = C2659.f7958;
        return ((C2655) c8370.m13853(cls)).f7947.containsKey(str) && ((C2655) c8370.m13853(cls)).m5317(str) != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static BshMethod m5405(NameSpace nameSpace, String str, Class[] clsArr, boolean z) {
        if (nameSpace == null) {
            return null;
        }
        try {
            return nameSpace.getMethod(str, clsArr, z);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static LHS m5406(Class cls, String str) {
        Variable variableImpl;
        try {
            return new LHS(m5384(cls, str, true));
        } catch (ReflectError e) {
            NameSpace nameSpaceM5400 = m5400(cls);
            if (m5387(cls) && nameSpaceM5400 != null && nameSpaceM5400.isClass && (variableImpl = nameSpaceM5400.getVariableImpl(str, true)) != null && (!variableImpl.hasModifier("private") || C2654.m5315())) {
                return new LHS(nameSpaceM5400, str);
            }
            if (m5404(cls, str)) {
                return new LHS(cls, str);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static Object m5407(Object obj, Object obj2) {
        Map map = AbstractC2661.f7970;
        if (obj instanceof Map) {
            Map map2 = (Map) obj;
            return map2.containsKey(obj2) ? map2.get(obj2) : Primitive.VOID;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return obj2.equals(entry.getKey()) ? entry.getValue() : Primitive.VOID;
        }
        Class<?> cls = obj.getClass();
        if (AbstractC2661.m5339(cls)) {
            Map.Entry entryM5416 = m5416(obj2, (Map.Entry[]) obj);
            return entryM5416 != null ? entryM5416.getValue() : Primitive.VOID;
        }
        if (obj instanceof Class) {
            cls = (Class) obj;
        }
        AbstractC2624 abstractC2624M5319 = ((C2655) C2659.f7958.m13853(cls)).m5319(obj2.toString());
        if (abstractC2624M5319 == null) {
            Interpreter.debug("property getter not found");
            return Primitive.VOID;
        }
        try {
            return abstractC2624M5319.mo5272(obj, new Object[0]);
        } catch (InvocationTargetException unused) {
            Interpreter.debug("Property accessor threw exception");
            return Primitive.VOID;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static Object m5408(Object obj, String str) {
        Map map = AbstractC2661.f7970;
        if (obj instanceof Map.Entry) {
            str.getClass();
            switch (str) {
                case "key":
                    return ((Map.Entry) obj).getKey();
                case "val":
                case "value":
                    return ((Map.Entry) obj).getValue();
            }
        }
        return m5407(obj, str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static Object m5409(Class cls) {
        WeakHashMap weakHashMap = f7995;
        if (weakHashMap.containsKey(cls)) {
            return weakHashMap.get(cls);
        }
        try {
            weakHashMap.put(cls, cls.getConstructor(null).newInstance(null));
        } catch (IllegalArgumentException | ReflectiveOperationException | SecurityException unused) {
            weakHashMap.put(cls, null);
        }
        return weakHashMap.get(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static Object m5410(Object obj, String str) throws UtilTargetError {
        if (obj instanceof This) {
            return ((This) obj).namespace.getVariable(str);
        }
        if (obj == Primitive.NULL) {
            throw new UtilTargetError(new NullPointerException(AbstractC0053.m156("Attempt to access field '", str, "' on null value")));
        }
        try {
            return m5413(str, obj.getClass(), obj, false);
        } catch (ReflectError e) {
            Class<?> cls = obj.getClass();
            Map map = AbstractC2661.f7970;
            if (!Map.class.isAssignableFrom(cls) && !Map.Entry.class.isAssignableFrom(cls) && !AbstractC2661.m5339(cls)) {
                C8370 c8370 = C2659.f7958;
                if (!((C2655) c8370.m13853(cls)).f7947.containsKey(str) || ((C2655) c8370.m13853(cls)).m5319(str) == null) {
                    throw e;
                }
            }
            return m5408(obj, str);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static This m5411(Class cls, String str) {
        try {
            return (This) m5413(This.Keys.BSHSTATIC + str, cls, null, true);
        } catch (Exception e) {
            C2632.m5293("Unable to get class static space: ", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static Modifiers m5412(Class cls) {
        try {
            String string = This.Keys.BSHCLASSMODIFIERS.toString();
            NameSpace nameSpaceM5400 = m5400(cls);
            Variable variableImpl = null;
            if (nameSpaceM5400 != null) {
                try {
                    variableImpl = nameSpaceM5400.getVariableImpl(string, false);
                } catch (Exception unused) {
                }
            }
            return (Modifiers) variableImpl.getValue();
        } catch (Exception unused2) {
            return new Modifiers(cls.isInterface() ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static Object m5413(String str, Class cls, Object obj, boolean z) throws UtilTargetError {
        try {
            return m5384(cls, str, z).mo5272(obj, new Object[0]);
        } catch (ReflectError e) {
            NameSpace nameSpaceM5400 = m5400(cls);
            if (m5387(cls) && nameSpaceM5400 != null && nameSpaceM5400.isClass) {
                if (z) {
                    Variable variableImpl = nameSpaceM5400.getVariableImpl(str, true);
                    Primitive primitive = Primitive.VOID;
                    Object objUnwrapVariable = (variableImpl == null || (variableImpl.hasModifier("private") && !C2654.m5315())) ? primitive : nameSpaceM5400.unwrapVariable(variableImpl);
                    if (primitive != objUnwrapVariable) {
                        return objUnwrapVariable;
                    }
                } else {
                    NameSpace nameSpaceM5399 = m5399(obj);
                    if (nameSpaceM5399 != null) {
                        Variable variableImpl2 = nameSpaceM5399.getVariableImpl(str, true);
                        Primitive primitive2 = Primitive.VOID;
                        Object objUnwrapVariable2 = (variableImpl2 == null || (variableImpl2.hasModifier("private") && !C2654.m5315())) ? primitive2 : nameSpaceM5399.unwrapVariable(variableImpl2);
                        if (primitive2 != objUnwrapVariable2) {
                            return objUnwrapVariable2;
                        }
                    }
                }
            }
            throw e;
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof InterpreterError) {
                throw ((InterpreterError) e2.getCause());
            }
            if (e2.getCause() instanceof UtilEvalError) {
                throw new UtilTargetError(e2.getCause());
            }
            throw new ReflectError(AbstractC0053.m152("Can't access field: ", str), e2.getCause());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static LHS m5414(Object obj, String str) {
        Variable variableImpl;
        if (obj instanceof This) {
            return new LHS(((This) obj).namespace, str, false);
        }
        try {
            return new LHS(obj, m5384(obj.getClass(), str, false));
        } catch (ReflectError e) {
            NameSpace nameSpaceM5399 = m5399(obj);
            if (m5387(obj.getClass()) && nameSpaceM5399 != null && nameSpaceM5399.isClass && (variableImpl = nameSpaceM5399.getVariableImpl(str, true)) != null && (!variableImpl.hasModifier("private") || C2654.m5315())) {
                return new LHS(nameSpaceM5399, str);
            }
            if (m5404(obj.getClass(), str)) {
                return new LHS(obj, str);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static BshMethod[] m5415(Class cls) {
        if (!m5387(cls)) {
            return new BshMethod[0];
        }
        if (cls.isInterface()) {
            NameSpace nameSpaceM5400 = m5400(cls);
            return nameSpaceM5400 == null ? new BshMethod[0] : nameSpaceM5400.getMethods();
        }
        NameSpace nameSpaceM5399 = m5399(m5409(cls));
        return nameSpaceM5399 == null ? new BshMethod[0] : nameSpaceM5399.getMethods();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Map.Entry m5416(Object obj, Map.Entry[] entryArr) {
        for (Map.Entry entry : entryArr) {
            if (obj.equals(entry.getKey())) {
                return entry;
            }
        }
        return null;
    }
}
