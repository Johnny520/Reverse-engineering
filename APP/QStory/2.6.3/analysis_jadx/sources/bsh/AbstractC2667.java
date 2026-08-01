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
import p009.AbstractC6183;
import p280.C8371;

/* JADX INFO: renamed from: bsh.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2667 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final WeakHashMap f7997;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Pattern f7998;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Object[] f8002 = new Object[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Class[] f8001 = new Class[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final WeakHashMap f8000 = new WeakHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Pattern f7999 = Pattern.compile("[^\\.]+|bsh\\..*");

    static {
        String property = Security.getProperty("package.access");
        if (property == null) {
            property = "null";
        }
        f7998 = Pattern.compile((String) Stream.of((Object[]) property.split(",")).filter(new C2642(7)).collect(Collectors.joining("|", "(?:", ").*")));
        f7997 = new WeakHashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static AbstractC2625 m5428(C2660 c2660, Class cls, Object obj, String str, Object[] objArr, boolean z) throws UtilTargetError {
        Interpreter interpreter;
        if (obj == Primitive.NULL) {
            throw new UtilTargetError(new NullPointerException(AbstractC0053.m158("Attempt to invoke method ", str, " on null value")));
        }
        Class[] clsArrM5396 = AbstractC2662.m5396(objArr);
        AbstractC2625 abstractC2625M5437 = m5437(cls, str, clsArrM5396, z);
        if (c2660 != null && (interpreter = c2660.f7966) != null && interpreter.getStrictJava() && abstractC2625M5437 != null) {
            Class cls2 = abstractC2625M5437.f7885;
            if (cls2.isInterface() && cls2 != cls && Modifier.isStatic(abstractC2625M5437.f7884)) {
                abstractC2625M5437 = null;
            }
        }
        if (abstractC2625M5437 != null) {
            return abstractC2625M5437;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "Static method " : "Method ");
        sb.append(AbstractC2629.m5334(str, clsArrM5396));
        sb.append(" not found in class'");
        sb.append(cls.getName());
        sb.append("'");
        throw new ReflectError(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static AbstractC2625 m5429(Class cls, String str, boolean z) {
        ConcurrentHashMap concurrentHashMap = ((C2656) C2660.f7960.m13870(cls)).f7948;
        AbstractC2625 abstractC2625 = !concurrentHashMap.containsKey(str) ? null : (AbstractC2625) concurrentHashMap.get(str);
        if (abstractC2625 == null) {
            throw new ReflectError(AbstractC6183.m11589(cls, AbstractC6183.m11585("No such field: ", str, " for class: ")));
        }
        if (!z || abstractC2625.mo5313()) {
            return abstractC2625;
        }
        throw new UtilEvalError(AbstractC6183.m11589(cls, AbstractC6183.m11585("Can't reach instance field: ", str, " from static context: ")));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static Object m5430(Object obj, Class cls, String str, Object[] objArr, Interpreter interpreter, CallStack callStack, InterfaceC2619 interfaceC2619) throws EvalError {
        Class cls2;
        cls2 = BigInteger.class;
        Class<BigInteger> cls3 = AbstractC2662.m5390(obj) ? BigDecimal.class : cls2;
        try {
            Object objM5447 = m5447(Primitive.castWrapper(cls3, obj), str, objArr, interpreter, callStack, interfaceC2619);
            return ((objM5447 instanceof Primitive) && ((Primitive) objM5447).getType() == cls3) ? Primitive.wrap(Primitive.castWrapper(cls, objM5447), (Class<?>) cls) : objM5447;
        } catch (TargetError e) {
            throw e.reThrow("Method found on " + cls3.getSimpleName() + " but with error");
        } catch (EvalError unused) {
            cls2 = AbstractC2662.m5390(obj) ? BigInteger.class : BigDecimal.class;
            Object objM54472 = m5447(Primitive.castWrapper(cls2, obj), str, objArr, interpreter, callStack, interfaceC2619);
            return ((objM54472 instanceof Primitive) && ((Primitive) objM54472).getType() == cls2) ? Primitive.wrap(Primitive.castWrapper(cls, objM54472), (Class<?>) cls) : objM54472;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static void m5431(String str, AbstractC2625 abstractC2625, Object[] objArr) {
        if (Interpreter.DEBUG.get().booleanValue()) {
            Interpreter.debug(str, abstractC2625, " with args:");
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                Interpreter.debug("args[", Integer.valueOf(i), "] = ", obj, " type = ", obj == null ? "<unknown>" : obj.getClass());
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static boolean m5432(Class cls) {
        return (cls == null || cls == GeneratedClass.class || !GeneratedClass.class.isAssignableFrom(cls)) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static Object m5433(C2660 c2660, Class cls, String str, Object[] objArr, InterfaceC2619 interfaceC2619) {
        Interpreter.debug("invoke static Method");
        NameSpace nameSpaceM5445 = m5445(cls);
        if (nameSpaceM5445 != null) {
            nameSpaceM5445.setNode(interfaceC2619);
        }
        return m5428(c2660, cls, null, str, objArr, true).mo5317(null, objArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static TargetError m5434(InvocationTargetException invocationTargetException, String str, CallStack callStack, InterfaceC2619 interfaceC2619) {
        String strM157 = AbstractC0053.m157("Method Invocation ", str);
        Throwable cause = invocationTargetException.getCause();
        boolean z = true;
        if ((cause instanceof EvalError) && (!(cause instanceof TargetError) || !((TargetError) cause).inNativeCode())) {
            z = false;
        }
        return new TargetError(strM157, cause, interfaceC2619, callStack, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static BshMethod m5435(Class cls, String str) {
        C2656 c2656 = (C2656) C2660.f7960.m13870(cls);
        AbstractC2625 abstractC2625 = !c2656.f7949.containsKey(str) ? null : (AbstractC2625) c2656.m5361(str).stream().filter(new C2642(1)).findFirst().get();
        if (abstractC2625 != null) {
            return new BshMethod(abstractC2625, (Object) null);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static Object m5436(Object obj, Object obj2, Object obj3) {
        Map map = AbstractC2662.f7972;
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
            String strM5328 = AbstractC2629.m5328(obj);
            sb.append(" for type: ");
            sb.append(strM5328);
            throw new ReflectError(sb.toString());
        }
        Class<?> cls = obj.getClass();
        if (AbstractC2662.m5384(cls)) {
            return m5461(obj2, (Map.Entry[]) obj).setValue(Primitive.unwrap(obj3));
        }
        if (obj instanceof Class) {
            cls = (Class) obj;
        }
        AbstractC2625 abstractC2625M5362 = ((C2656) C2660.f7960.m13870(cls)).m5362(obj2.toString());
        if (abstractC2625M5362 != null) {
            try {
                return abstractC2625M5362.mo5317(obj, Primitive.unwrap(obj3));
            } catch (InvocationTargetException e) {
                throw new ReflectError("Property accessor threw exception: " + e.getCause(), e.getCause());
            }
        }
        StringBuilder sb2 = new StringBuilder("No such property setter: ");
        sb2.append(obj2);
        String strM5325 = AbstractC2629.m5325(cls);
        sb2.append(" for type: ");
        sb2.append(strM5325);
        throw new ReflectError(sb2.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static AbstractC2625 m5437(Class cls, String str, Class[] clsArr, boolean z) {
        if (cls == null) {
            C2633.m5342("null class");
            return null;
        }
        AbstractC2625 abstractC2625M5363 = ((C2656) C2660.f7960.m13870(cls)).m5363(str, clsArr);
        Interpreter.debug("resolved java method: ", abstractC2625M5363, " on class: ", cls);
        if (abstractC2625M5363 == null || !z || abstractC2625M5363.mo5313()) {
            return abstractC2625M5363;
        }
        throw new UtilEvalError("Cannot reach instance method: " + AbstractC2629.m5334(abstractC2625M5363.f7880, abstractC2625M5363.mo5309()) + " from static context: " + cls.getName());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static This m5438(Object obj, String str) {
        try {
            return (This) Primitive.unwrap(m5455(obj, This.Keys.BSHTHIS + str));
        } catch (Exception e) {
            C2633.m5338("Generated class: Error getting This ", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m5439(Class[] clsArr, Class[][] clsArr2) {
        int i = 1;
        while (true) {
            int i2 = -1;
            if (i > 4) {
                return -1;
            }
            Class[] clsArr3 = null;
            for (int i3 = 0; i3 < clsArr2.length; i3++) {
                Class[] clsArr4 = clsArr2[i3];
                if ((clsArr3 == null || !AbstractC2662.m5378(clsArr4, clsArr3)) && AbstractC2662.m5381(clsArr, clsArr4, i) && (clsArr3 == null || AbstractC2662.m5378(clsArr, clsArr4) || (AbstractC2662.m5381(clsArr4, clsArr3, 1) && !AbstractC2662.m5378(clsArr, clsArr3)))) {
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
    public static int m5440(Class[] clsArr, List list) {
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sbM150 = AbstractC0053.m150(i, "  ", "=");
            sbM150.append(((AbstractC2625) list.get(i)).f7881);
            Interpreter.debug(sbM150.toString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Class[] clsArrMo5309 = ((AbstractC2625) it.next()).mo5309();
            if (clsArr.length == clsArrMo5309.length) {
                arrayList2.add(Integer.valueOf(i2));
                arrayList.add(clsArrMo5309);
            }
            i2++;
        }
        int iM5439 = m5439(clsArr, (Class[][]) arrayList.toArray(new Class[arrayList.size()][]));
        if (iM5439 >= 0) {
            int iIntValue = ((Integer) arrayList2.get(iM5439)).intValue();
            Interpreter.debug(" remap=" + Arrays.toString(arrayList2.toArray(new Integer[0])));
            Interpreter.debug(" match=" + iIntValue);
            return iIntValue;
        }
        arrayList.clear();
        arrayList2.clear();
        Iterator it2 = list.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            AbstractC2625 abstractC2625 = (AbstractC2625) it2.next();
            Class[] clsArrMo53092 = abstractC2625.mo5309();
            if (abstractC2625.mo5314() && clsArr.length >= clsArrMo53092.length - 1) {
                Class[] clsArr2 = new Class[clsArr.length];
                System.arraycopy(clsArrMo53092, 0, clsArr2, 0, clsArrMo53092.length - 1);
                Arrays.fill(clsArr2, clsArrMo53092.length - 1, clsArr.length, abstractC2625.mo5315());
                arrayList2.add(Integer.valueOf(i3));
                arrayList.add(clsArr2);
            }
            i3++;
        }
        int iM54392 = m5439(clsArr, (Class[][]) arrayList.toArray(new Class[arrayList.size()][]));
        if (iM54392 >= 0) {
            iM54392 = ((Integer) arrayList2.get(iM54392)).intValue();
        }
        Interpreter.debug(" remap (varargs) =" + Arrays.toString(arrayList2.toArray(new Integer[0])));
        Interpreter.debug(" match (varargs) =" + iM54392);
        return iM54392;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m5441(Class[] clsArr, List list) {
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sbM150 = AbstractC0053.m150(i, "  ", ":");
            sbM150.append(((BshMethod) list.get(i)).toString());
            sbM150.append(" ");
            sbM150.append(((BshMethod) list.get(i)).getClass().getName());
            Interpreter.debug(sbM150.toString());
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
        int iM5439 = m5439(clsArr, (Class[][]) arrayList.toArray(new Class[arrayList.size()][]));
        if (iM5439 >= 0) {
            int iIntValue = ((Integer) arrayList2.get(iM5439)).intValue();
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
        int iM54392 = m5439(clsArr, (Class[][]) arrayList.toArray(new Class[arrayList.size()][]));
        if (iM54392 < 0) {
            return iM54392;
        }
        int iIntValue2 = ((Integer) arrayList2.get(iM54392)).intValue();
        Interpreter.debug(" remap (varargs): " + Arrays.toString(arrayList2.toArray(new Integer[0])));
        Interpreter.debug(" match (varargs):" + iIntValue2);
        return iIntValue2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Object m5442(Class cls, Object obj, Object[] objArr) throws InvocationTargetException {
        if (cls == null) {
            return Primitive.NULL;
        }
        if (cls.isInterface()) {
            throw new ReflectError(AbstractC0053.m154(cls, "Can't create instance of an interface: "));
        }
        Class[] clsArrM5396 = AbstractC2662.m5396(objArr);
        if (cls.isMemberClass() && !Modifier.isStatic(cls.getModifiers()) && obj != null) {
            clsArrM5396 = (Class[]) Stream.concat(Stream.of(obj.getClass()), Stream.of((Object[]) clsArrM5396)).toArray(new C2650(9));
        }
        Interpreter.debug("Looking for most specific constructor: ", cls);
        AbstractC2625 abstractC2625M5363 = ((C2656) C2660.f7960.m13870(cls)).m5363(cls.getName(), clsArrM5396);
        if (abstractC2625M5363 == null || !(objArr.length == abstractC2625M5363.mo5310() || abstractC2625M5363.mo5314() || abstractC2625M5363.mo5316())) {
            if (clsArrM5396.length == 0) {
                throw new ReflectError(AbstractC0053.m154(cls, "Can't find default constructor for: "));
            }
            throw new ReflectError("Can't find constructor: " + AbstractC2629.m5334(cls.getName(), clsArrM5396) + " in class: " + cls.getName());
        }
        try {
            return abstractC2625M5363.mo5317(obj, objArr);
        } catch (InvocationTargetException e) {
            if (!(e.getCause().getCause() instanceof IllegalAccessException)) {
                throw e;
            }
            throw new ReflectError("We don't have permission to create an instance. " + e.getCause().getCause().getMessage() + " Use setAccessibility(true) to enable access.", e.getCause().getCause());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m5443(String str, String str2) {
        WeakHashMap weakHashMap = f8000;
        if (!weakHashMap.containsKey(str2)) {
            char[] charArray = str2.toCharArray();
            charArray[0] = Character.toUpperCase(charArray[0]);
            weakHashMap.put(str2, new String(charArray));
        }
        StringBuilder sbM140 = AbstractC0053.m140(str);
        sbM140.append((String) weakHashMap.get(str2));
        return sbM140.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static NameSpace m5444(Object obj) {
        if (obj == null) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (!m5432(cls)) {
            return null;
        }
        try {
            return obj instanceof Proxy ? m5445(cls.getInterfaces()[0]) : m5438(obj, cls.getSimpleName()).namespace;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static NameSpace m5445(Class cls) {
        if (!m5432(cls)) {
            return null;
        }
        try {
            return m5456(cls, cls.getSimpleName()).namespace;
        } catch (Exception e) {
            if (e.getCause() instanceof UtilTargetError) {
                throw new InterpreterError(e.getCause().getCause().getMessage(), e.getCause().getCause());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static Object m5446(Class cls, Object[] objArr, Interpreter interpreter, CallStack callStack, InterfaceC2619 interfaceC2619) throws UtilEvalError {
        Object[] objArr2 = new Object[objArr.length + 2];
        objArr2[0] = interpreter;
        objArr2[1] = callStack;
        System.arraycopy(objArr, 0, objArr2, 2, objArr.length);
        try {
            return m5433(interpreter.getClassManager(), cls, "invoke", objArr2, interfaceC2619);
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
    public static Object m5447(Object obj, String str, Object[] objArr, Interpreter interpreter, CallStack callStack, InterfaceC2619 interfaceC2619) throws EvalError {
        ?? r6;
        ?? r7;
        ?? r10;
        ?? r72;
        ?? r62;
        ?? r4;
        ?? r5;
        if ((obj instanceof This) && !This.isExposedThisMethod(str)) {
            return ((This) obj).invokeMethod(str, objArr, interpreter, callStack, interfaceC2619, false);
        }
        C2660 classManager = interpreter.getClassManager();
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
                    r72 = interfaceC2619;
                    throw r10.toEvalError(r72, r62);
                }
            }
            Object obj2 = obj;
            r6 = str;
            r7 = objArr;
            Class<?> cls = type;
            try {
                ?? M5428 = m5428(classManager, cls, obj2, r6, r7, false);
                r4 = r6;
                r5 = r7;
                try {
                    NameSpace nameSpaceM5444 = m5444(obj2);
                    if (nameSpaceM5444 != null) {
                        nameSpaceM5444.setNode(interfaceC2619);
                    }
                    return M5428.mo5317(obj2, r5);
                } catch (ReflectError e2) {
                    e = e2;
                    ReflectError reflectError = e;
                    try {
                        if (obj2 == Primitive.VOID) {
                            throw new EvalError("Attempt to invoke method: " + r4 + "() on undefined", interfaceC2619, callStack, reflectError);
                        }
                        ?? extensionMethod = callStack.top().getExtensionMethod(type, r4, AbstractC2662.m5396(r5));
                        if (extensionMethod != 0) {
                            return extensionMethod.invoke(r5, interpreter, callStack, interfaceC2619, false, obj2);
                        }
                        CallStack callStack2 = callStack;
                        InterfaceC2619 interfaceC26192 = interfaceC2619;
                        Object obj3 = obj2;
                        if (z && !interpreter.getStrictJava()) {
                            try {
                                if (!AbstractC2662.m5383(obj3)) {
                                    return m5447(obj3, r4, r5, interpreter, callStack2, interfaceC26192);
                                }
                                try {
                                    return m5430(obj3, type, r4, r5, interpreter, callStack2, interfaceC26192);
                                } catch (TargetError e3) {
                                    e = e3;
                                    throw e;
                                } catch (EvalError unused) {
                                    callStack2 = callStack2;
                                    interfaceC26192 = interfaceC26192;
                                    throw new EvalError("Error in method invocation: " + reflectError.getMessage(), interfaceC26192, callStack2, reflectError);
                                } catch (UtilEvalError e4) {
                                    e = e4;
                                    r6 = callStack2;
                                    r7 = interfaceC26192;
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
                        throw new EvalError("Error in method invocation: " + reflectError.getMessage(), interfaceC26192, callStack2, reflectError);
                    } catch (UtilEvalError e6) {
                        e = e6;
                    }
                    r10 = e;
                    r62 = r6;
                    r72 = r7;
                    throw r10.toEvalError(r72, r62);
                } catch (InvocationTargetException e7) {
                    e = e7;
                    throw m5434(e, r4, callStack, interfaceC2619);
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
            r7 = interfaceC2619;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static Variable[] m5448(NameSpace nameSpace) {
        int i = 0;
        String[] strArr = nameSpace == null ? new String[0] : (String[]) Stream.of((Object[]) nameSpace.getVariableNames()).filter(new C2642(6)).toArray(new C2650(11));
        return (nameSpace == null || strArr == null) ? new Variable[0] : (Variable[]) Stream.of((Object[]) strArr).map(new C2669(nameSpace, i)).filter(new C2642(4)).toArray(new C2650(10));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static boolean m5449(Class cls, String str) {
        Map map = AbstractC2662.f7972;
        if (Map.class.isAssignableFrom(cls) || Map.Entry.class.isAssignableFrom(cls) || AbstractC2662.m5384(cls)) {
            return true;
        }
        C8371 c8371 = C2660.f7960;
        return ((C2656) c8371.m13870(cls)).f7949.containsKey(str) && ((C2656) c8371.m13870(cls)).m5362(str) != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static BshMethod m5450(NameSpace nameSpace, String str, Class[] clsArr, boolean z) {
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
    public static LHS m5451(Class cls, String str) {
        Variable variableImpl;
        try {
            return new LHS(m5429(cls, str, true));
        } catch (ReflectError e) {
            NameSpace nameSpaceM5445 = m5445(cls);
            if (m5432(cls) && nameSpaceM5445 != null && nameSpaceM5445.isClass && (variableImpl = nameSpaceM5445.getVariableImpl(str, true)) != null && (!variableImpl.hasModifier("private") || C2655.m5360())) {
                return new LHS(nameSpaceM5445, str);
            }
            if (m5449(cls, str)) {
                return new LHS(cls, str);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static Object m5452(Object obj, Object obj2) {
        Map map = AbstractC2662.f7972;
        if (obj instanceof Map) {
            Map map2 = (Map) obj;
            return map2.containsKey(obj2) ? map2.get(obj2) : Primitive.VOID;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return obj2.equals(entry.getKey()) ? entry.getValue() : Primitive.VOID;
        }
        Class<?> cls = obj.getClass();
        if (AbstractC2662.m5384(cls)) {
            Map.Entry entryM5461 = m5461(obj2, (Map.Entry[]) obj);
            return entryM5461 != null ? entryM5461.getValue() : Primitive.VOID;
        }
        if (obj instanceof Class) {
            cls = (Class) obj;
        }
        AbstractC2625 abstractC2625M5364 = ((C2656) C2660.f7960.m13870(cls)).m5364(obj2.toString());
        if (abstractC2625M5364 == null) {
            Interpreter.debug("property getter not found");
            return Primitive.VOID;
        }
        try {
            return abstractC2625M5364.mo5317(obj, new Object[0]);
        } catch (InvocationTargetException unused) {
            Interpreter.debug("Property accessor threw exception");
            return Primitive.VOID;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static Object m5453(Object obj, String str) {
        Map map = AbstractC2662.f7972;
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
        return m5452(obj, str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static Object m5454(Class cls) {
        WeakHashMap weakHashMap = f7997;
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
    public static Object m5455(Object obj, String str) throws UtilTargetError {
        if (obj instanceof This) {
            return ((This) obj).namespace.getVariable(str);
        }
        if (obj == Primitive.NULL) {
            throw new UtilTargetError(new NullPointerException(AbstractC0053.m158("Attempt to access field '", str, "' on null value")));
        }
        try {
            return m5458(str, obj.getClass(), obj, false);
        } catch (ReflectError e) {
            Class<?> cls = obj.getClass();
            Map map = AbstractC2662.f7972;
            if (!Map.class.isAssignableFrom(cls) && !Map.Entry.class.isAssignableFrom(cls) && !AbstractC2662.m5384(cls)) {
                C8371 c8371 = C2660.f7960;
                if (!((C2656) c8371.m13870(cls)).f7949.containsKey(str) || ((C2656) c8371.m13870(cls)).m5364(str) == null) {
                    throw e;
                }
            }
            return m5453(obj, str);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static This m5456(Class cls, String str) {
        try {
            return (This) m5458(This.Keys.BSHSTATIC + str, cls, null, true);
        } catch (Exception e) {
            C2633.m5338("Unable to get class static space: ", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static Modifiers m5457(Class cls) {
        try {
            String string = This.Keys.BSHCLASSMODIFIERS.toString();
            NameSpace nameSpaceM5445 = m5445(cls);
            Variable variableImpl = null;
            if (nameSpaceM5445 != null) {
                try {
                    variableImpl = nameSpaceM5445.getVariableImpl(string, false);
                } catch (Exception unused) {
                }
            }
            return (Modifiers) variableImpl.getValue();
        } catch (Exception unused2) {
            return new Modifiers(cls.isInterface() ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static Object m5458(String str, Class cls, Object obj, boolean z) throws UtilTargetError {
        try {
            return m5429(cls, str, z).mo5317(obj, new Object[0]);
        } catch (ReflectError e) {
            NameSpace nameSpaceM5445 = m5445(cls);
            if (m5432(cls) && nameSpaceM5445 != null && nameSpaceM5445.isClass) {
                if (z) {
                    Variable variableImpl = nameSpaceM5445.getVariableImpl(str, true);
                    Primitive primitive = Primitive.VOID;
                    Object objUnwrapVariable = (variableImpl == null || (variableImpl.hasModifier("private") && !C2655.m5360())) ? primitive : nameSpaceM5445.unwrapVariable(variableImpl);
                    if (primitive != objUnwrapVariable) {
                        return objUnwrapVariable;
                    }
                } else {
                    NameSpace nameSpaceM5444 = m5444(obj);
                    if (nameSpaceM5444 != null) {
                        Variable variableImpl2 = nameSpaceM5444.getVariableImpl(str, true);
                        Primitive primitive2 = Primitive.VOID;
                        Object objUnwrapVariable2 = (variableImpl2 == null || (variableImpl2.hasModifier("private") && !C2655.m5360())) ? primitive2 : nameSpaceM5444.unwrapVariable(variableImpl2);
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
            throw new ReflectError(AbstractC0053.m157("Can't access field: ", str), e2.getCause());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static LHS m5459(Object obj, String str) {
        Variable variableImpl;
        if (obj instanceof This) {
            return new LHS(((This) obj).namespace, str, false);
        }
        try {
            return new LHS(obj, m5429(obj.getClass(), str, false));
        } catch (ReflectError e) {
            NameSpace nameSpaceM5444 = m5444(obj);
            if (m5432(obj.getClass()) && nameSpaceM5444 != null && nameSpaceM5444.isClass && (variableImpl = nameSpaceM5444.getVariableImpl(str, true)) != null && (!variableImpl.hasModifier("private") || C2655.m5360())) {
                return new LHS(nameSpaceM5444, str);
            }
            if (m5449(obj.getClass(), str)) {
                return new LHS(obj, str);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static BshMethod[] m5460(Class cls) {
        if (!m5432(cls)) {
            return new BshMethod[0];
        }
        if (cls.isInterface()) {
            NameSpace nameSpaceM5445 = m5445(cls);
            return nameSpaceM5445 == null ? new BshMethod[0] : nameSpaceM5445.getMethods();
        }
        NameSpace nameSpaceM5444 = m5444(m5454(cls));
        return nameSpaceM5444 == null ? new BshMethod[0] : nameSpaceM5444.getMethods();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Map.Entry m5461(Object obj, Map.Entry[] entryArr) {
        for (Map.Entry entry : entryArr) {
            if (obj.equals(entry.getKey())) {
                return entry;
            }
        }
        return null;
    }
}
