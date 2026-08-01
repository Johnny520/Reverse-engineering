package bsh;

import androidx.activity.AbstractC0900;
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
import p025.AbstractC7012;
import p296.C9200;

/* JADX INFO: renamed from: bsh.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3500 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final WeakHashMap f8342;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Pattern f8343;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Object[] f8347 = new Object[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Class[] f8346 = new Class[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final WeakHashMap f8345 = new WeakHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Pattern f8344 = Pattern.compile("[^\\.]+|bsh\\..*");

    static {
        String property = Security.getProperty("package.access");
        if (property == null) {
            property = "null";
        }
        f8343 = Pattern.compile((String) Stream.of((Object[]) property.split(",")).filter(new C3475(7)).collect(Collectors.joining("|", "(?:", ").*")));
        f8342 = new WeakHashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static AbstractC3458 m5988(C3493 c3493, Class cls, Object obj, String str, Object[] objArr, boolean z) throws UtilTargetError {
        Interpreter interpreter;
        if (obj == Primitive.NULL) {
            throw new UtilTargetError(new NullPointerException(AbstractC0900.m718("Attempt to invoke method ", str, " on null value")));
        }
        Class[] clsArrM5956 = AbstractC3495.m5956(objArr);
        AbstractC3458 abstractC3458M5997 = m5997(cls, str, clsArrM5956, z);
        if (c3493 != null && (interpreter = c3493.f8311) != null && interpreter.getStrictJava() && abstractC3458M5997 != null) {
            Class cls2 = abstractC3458M5997.f8230;
            if (cls2.isInterface() && cls2 != cls && Modifier.isStatic(abstractC3458M5997.f8229)) {
                abstractC3458M5997 = null;
            }
        }
        if (abstractC3458M5997 != null) {
            return abstractC3458M5997;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "Static method " : "Method ");
        sb.append(AbstractC3462.m5894(str, clsArrM5956));
        sb.append(" not found in class'");
        sb.append(cls.getName());
        sb.append("'");
        throw new ReflectError(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static AbstractC3458 m5989(Class cls, String str, boolean z) {
        ConcurrentHashMap concurrentHashMap = ((C3489) C3493.f8305.m14429(cls)).f8293;
        AbstractC3458 abstractC3458 = !concurrentHashMap.containsKey(str) ? null : (AbstractC3458) concurrentHashMap.get(str);
        if (abstractC3458 == null) {
            throw new ReflectError(AbstractC7012.m12148(cls, AbstractC7012.m12144("No such field: ", str, " for class: ")));
        }
        if (!z || abstractC3458.mo5873()) {
            return abstractC3458;
        }
        throw new UtilEvalError(AbstractC7012.m12148(cls, AbstractC7012.m12144("Can't reach instance field: ", str, " from static context: ")));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static Object m5990(Object obj, Class cls, String str, Object[] objArr, Interpreter interpreter, CallStack callStack, InterfaceC3452 interfaceC3452) throws EvalError {
        Class cls2;
        cls2 = BigInteger.class;
        Class<BigInteger> cls3 = AbstractC3495.m5950(obj) ? BigDecimal.class : cls2;
        try {
            Object objM6007 = m6007(Primitive.castWrapper(cls3, obj), str, objArr, interpreter, callStack, interfaceC3452);
            return ((objM6007 instanceof Primitive) && ((Primitive) objM6007).getType() == cls3) ? Primitive.wrap(Primitive.castWrapper(cls, objM6007), (Class<?>) cls) : objM6007;
        } catch (TargetError e) {
            throw e.reThrow("Method found on " + cls3.getSimpleName() + " but with error");
        } catch (EvalError unused) {
            cls2 = AbstractC3495.m5950(obj) ? BigInteger.class : BigDecimal.class;
            Object objM60072 = m6007(Primitive.castWrapper(cls2, obj), str, objArr, interpreter, callStack, interfaceC3452);
            return ((objM60072 instanceof Primitive) && ((Primitive) objM60072).getType() == cls2) ? Primitive.wrap(Primitive.castWrapper(cls, objM60072), (Class<?>) cls) : objM60072;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static void m5991(String str, AbstractC3458 abstractC3458, Object[] objArr) {
        if (Interpreter.DEBUG.get().booleanValue()) {
            Interpreter.debug(str, abstractC3458, " with args:");
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                Interpreter.debug("args[", Integer.valueOf(i), "] = ", obj, " type = ", obj == null ? "<unknown>" : obj.getClass());
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static boolean m5992(Class cls) {
        return (cls == null || cls == GeneratedClass.class || !GeneratedClass.class.isAssignableFrom(cls)) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static Object m5993(C3493 c3493, Class cls, String str, Object[] objArr, InterfaceC3452 interfaceC3452) {
        Interpreter.debug("invoke static Method");
        NameSpace nameSpaceM6005 = m6005(cls);
        if (nameSpaceM6005 != null) {
            nameSpaceM6005.setNode(interfaceC3452);
        }
        return m5988(c3493, cls, null, str, objArr, true).mo5877(null, objArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static TargetError m5994(InvocationTargetException invocationTargetException, String str, CallStack callStack, InterfaceC3452 interfaceC3452) {
        String strM717 = AbstractC0900.m717("Method Invocation ", str);
        Throwable cause = invocationTargetException.getCause();
        boolean z = true;
        if ((cause instanceof EvalError) && (!(cause instanceof TargetError) || !((TargetError) cause).inNativeCode())) {
            z = false;
        }
        return new TargetError(strM717, cause, interfaceC3452, callStack, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static BshMethod m5995(Class cls, String str) {
        C3489 c3489 = (C3489) C3493.f8305.m14429(cls);
        AbstractC3458 abstractC3458 = !c3489.f8294.containsKey(str) ? null : (AbstractC3458) c3489.m5921(str).stream().filter(new C3475(1)).findFirst().get();
        if (abstractC3458 != null) {
            return new BshMethod(abstractC3458, (Object) null);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static Object m5996(Object obj, Object obj2, Object obj3) {
        Map map = AbstractC3495.f8317;
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
            String strM5888 = AbstractC3462.m5888(obj);
            sb.append(" for type: ");
            sb.append(strM5888);
            throw new ReflectError(sb.toString());
        }
        Class<?> cls = obj.getClass();
        if (AbstractC3495.m5944(cls)) {
            return m6021(obj2, (Map.Entry[]) obj).setValue(Primitive.unwrap(obj3));
        }
        if (obj instanceof Class) {
            cls = (Class) obj;
        }
        AbstractC3458 abstractC3458M5922 = ((C3489) C3493.f8305.m14429(cls)).m5922(obj2.toString());
        if (abstractC3458M5922 != null) {
            try {
                return abstractC3458M5922.mo5877(obj, Primitive.unwrap(obj3));
            } catch (InvocationTargetException e) {
                throw new ReflectError("Property accessor threw exception: " + e.getCause(), e.getCause());
            }
        }
        StringBuilder sb2 = new StringBuilder("No such property setter: ");
        sb2.append(obj2);
        String strM5885 = AbstractC3462.m5885(cls);
        sb2.append(" for type: ");
        sb2.append(strM5885);
        throw new ReflectError(sb2.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static AbstractC3458 m5997(Class cls, String str, Class[] clsArr, boolean z) {
        if (cls == null) {
            C3466.m5902("null class");
            return null;
        }
        AbstractC3458 abstractC3458M5923 = ((C3489) C3493.f8305.m14429(cls)).m5923(str, clsArr);
        Interpreter.debug("resolved java method: ", abstractC3458M5923, " on class: ", cls);
        if (abstractC3458M5923 == null || !z || abstractC3458M5923.mo5873()) {
            return abstractC3458M5923;
        }
        throw new UtilEvalError("Cannot reach instance method: " + AbstractC3462.m5894(abstractC3458M5923.f8225, abstractC3458M5923.mo5869()) + " from static context: " + cls.getName());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static This m5998(Object obj, String str) {
        try {
            return (This) Primitive.unwrap(m6015(obj, This.Keys.BSHTHIS + str));
        } catch (Exception e) {
            C3466.m5898("Generated class: Error getting This ", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m5999(Class[] clsArr, Class[][] clsArr2) {
        int i = 1;
        while (true) {
            int i2 = -1;
            if (i > 4) {
                return -1;
            }
            Class[] clsArr3 = null;
            for (int i3 = 0; i3 < clsArr2.length; i3++) {
                Class[] clsArr4 = clsArr2[i3];
                if ((clsArr3 == null || !AbstractC3495.m5938(clsArr4, clsArr3)) && AbstractC3495.m5941(clsArr, clsArr4, i) && (clsArr3 == null || AbstractC3495.m5938(clsArr, clsArr4) || (AbstractC3495.m5941(clsArr4, clsArr3, 1) && !AbstractC3495.m5938(clsArr, clsArr3)))) {
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
    public static int m6000(Class[] clsArr, List list) {
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sbM710 = AbstractC0900.m710(i, "  ", "=");
            sbM710.append(((AbstractC3458) list.get(i)).f8226);
            Interpreter.debug(sbM710.toString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Class[] clsArrMo5869 = ((AbstractC3458) it.next()).mo5869();
            if (clsArr.length == clsArrMo5869.length) {
                arrayList2.add(Integer.valueOf(i2));
                arrayList.add(clsArrMo5869);
            }
            i2++;
        }
        int iM5999 = m5999(clsArr, (Class[][]) arrayList.toArray(new Class[arrayList.size()][]));
        if (iM5999 >= 0) {
            int iIntValue = ((Integer) arrayList2.get(iM5999)).intValue();
            Interpreter.debug(" remap=" + Arrays.toString(arrayList2.toArray(new Integer[0])));
            Interpreter.debug(" match=" + iIntValue);
            return iIntValue;
        }
        arrayList.clear();
        arrayList2.clear();
        Iterator it2 = list.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            AbstractC3458 abstractC3458 = (AbstractC3458) it2.next();
            Class[] clsArrMo58692 = abstractC3458.mo5869();
            if (abstractC3458.mo5874() && clsArr.length >= clsArrMo58692.length - 1) {
                Class[] clsArr2 = new Class[clsArr.length];
                System.arraycopy(clsArrMo58692, 0, clsArr2, 0, clsArrMo58692.length - 1);
                Arrays.fill(clsArr2, clsArrMo58692.length - 1, clsArr.length, abstractC3458.mo5875());
                arrayList2.add(Integer.valueOf(i3));
                arrayList.add(clsArr2);
            }
            i3++;
        }
        int iM59992 = m5999(clsArr, (Class[][]) arrayList.toArray(new Class[arrayList.size()][]));
        if (iM59992 >= 0) {
            iM59992 = ((Integer) arrayList2.get(iM59992)).intValue();
        }
        Interpreter.debug(" remap (varargs) =" + Arrays.toString(arrayList2.toArray(new Integer[0])));
        Interpreter.debug(" match (varargs) =" + iM59992);
        return iM59992;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m6001(Class[] clsArr, List list) {
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sbM710 = AbstractC0900.m710(i, "  ", ":");
            sbM710.append(((BshMethod) list.get(i)).toString());
            sbM710.append(" ");
            sbM710.append(((BshMethod) list.get(i)).getClass().getName());
            Interpreter.debug(sbM710.toString());
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
        int iM5999 = m5999(clsArr, (Class[][]) arrayList.toArray(new Class[arrayList.size()][]));
        if (iM5999 >= 0) {
            int iIntValue = ((Integer) arrayList2.get(iM5999)).intValue();
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
        int iM59992 = m5999(clsArr, (Class[][]) arrayList.toArray(new Class[arrayList.size()][]));
        if (iM59992 < 0) {
            return iM59992;
        }
        int iIntValue2 = ((Integer) arrayList2.get(iM59992)).intValue();
        Interpreter.debug(" remap (varargs): " + Arrays.toString(arrayList2.toArray(new Integer[0])));
        Interpreter.debug(" match (varargs):" + iIntValue2);
        return iIntValue2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Object m6002(Class cls, Object obj, Object[] objArr) throws InvocationTargetException {
        if (cls == null) {
            return Primitive.NULL;
        }
        if (cls.isInterface()) {
            throw new ReflectError(AbstractC0900.m714(cls, "Can't create instance of an interface: "));
        }
        Class[] clsArrM5956 = AbstractC3495.m5956(objArr);
        if (cls.isMemberClass() && !Modifier.isStatic(cls.getModifiers()) && obj != null) {
            clsArrM5956 = (Class[]) Stream.concat(Stream.of(obj.getClass()), Stream.of((Object[]) clsArrM5956)).toArray(new C3483(9));
        }
        Interpreter.debug("Looking for most specific constructor: ", cls);
        AbstractC3458 abstractC3458M5923 = ((C3489) C3493.f8305.m14429(cls)).m5923(cls.getName(), clsArrM5956);
        if (abstractC3458M5923 == null || !(objArr.length == abstractC3458M5923.mo5870() || abstractC3458M5923.mo5874() || abstractC3458M5923.mo5876())) {
            if (clsArrM5956.length == 0) {
                throw new ReflectError(AbstractC0900.m714(cls, "Can't find default constructor for: "));
            }
            throw new ReflectError("Can't find constructor: " + AbstractC3462.m5894(cls.getName(), clsArrM5956) + " in class: " + cls.getName());
        }
        try {
            return abstractC3458M5923.mo5877(obj, objArr);
        } catch (InvocationTargetException e) {
            if (!(e.getCause().getCause() instanceof IllegalAccessException)) {
                throw e;
            }
            throw new ReflectError("We don't have permission to create an instance. " + e.getCause().getCause().getMessage() + " Use setAccessibility(true) to enable access.", e.getCause().getCause());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m6003(String str, String str2) {
        WeakHashMap weakHashMap = f8345;
        if (!weakHashMap.containsKey(str2)) {
            char[] charArray = str2.toCharArray();
            charArray[0] = Character.toUpperCase(charArray[0]);
            weakHashMap.put(str2, new String(charArray));
        }
        StringBuilder sbM700 = AbstractC0900.m700(str);
        sbM700.append((String) weakHashMap.get(str2));
        return sbM700.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static NameSpace m6004(Object obj) {
        if (obj == null) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (!m5992(cls)) {
            return null;
        }
        try {
            return obj instanceof Proxy ? m6005(cls.getInterfaces()[0]) : m5998(obj, cls.getSimpleName()).namespace;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static NameSpace m6005(Class cls) {
        if (!m5992(cls)) {
            return null;
        }
        try {
            return m6016(cls, cls.getSimpleName()).namespace;
        } catch (Exception e) {
            if (e.getCause() instanceof UtilTargetError) {
                throw new InterpreterError(e.getCause().getCause().getMessage(), e.getCause().getCause());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static Object m6006(Class cls, Object[] objArr, Interpreter interpreter, CallStack callStack, InterfaceC3452 interfaceC3452) throws UtilEvalError {
        Object[] objArr2 = new Object[objArr.length + 2];
        objArr2[0] = interpreter;
        objArr2[1] = callStack;
        System.arraycopy(objArr, 0, objArr2, 2, objArr.length);
        try {
            return m5993(interpreter.getClassManager(), cls, "invoke", objArr2, interfaceC3452);
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
    public static Object m6007(Object obj, String str, Object[] objArr, Interpreter interpreter, CallStack callStack, InterfaceC3452 interfaceC3452) throws EvalError {
        ?? r6;
        ?? r7;
        ?? r10;
        ?? r72;
        ?? r62;
        ?? r4;
        ?? r5;
        if ((obj instanceof This) && !This.isExposedThisMethod(str)) {
            return ((This) obj).invokeMethod(str, objArr, interpreter, callStack, interfaceC3452, false);
        }
        C3493 classManager = interpreter.getClassManager();
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
                    r72 = interfaceC3452;
                    throw r10.toEvalError(r72, r62);
                }
            }
            Object obj2 = obj;
            r6 = str;
            r7 = objArr;
            Class<?> cls = type;
            try {
                ?? M5988 = m5988(classManager, cls, obj2, r6, r7, false);
                r4 = r6;
                r5 = r7;
                try {
                    NameSpace nameSpaceM6004 = m6004(obj2);
                    if (nameSpaceM6004 != null) {
                        nameSpaceM6004.setNode(interfaceC3452);
                    }
                    return M5988.mo5877(obj2, r5);
                } catch (ReflectError e2) {
                    e = e2;
                    ReflectError reflectError = e;
                    try {
                        if (obj2 == Primitive.VOID) {
                            throw new EvalError("Attempt to invoke method: " + r4 + "() on undefined", interfaceC3452, callStack, reflectError);
                        }
                        ?? extensionMethod = callStack.top().getExtensionMethod(type, r4, AbstractC3495.m5956(r5));
                        if (extensionMethod != 0) {
                            return extensionMethod.invoke(r5, interpreter, callStack, interfaceC3452, false, obj2);
                        }
                        CallStack callStack2 = callStack;
                        InterfaceC3452 interfaceC34522 = interfaceC3452;
                        Object obj3 = obj2;
                        if (z && !interpreter.getStrictJava()) {
                            try {
                                if (!AbstractC3495.m5943(obj3)) {
                                    return m6007(obj3, r4, r5, interpreter, callStack2, interfaceC34522);
                                }
                                try {
                                    return m5990(obj3, type, r4, r5, interpreter, callStack2, interfaceC34522);
                                } catch (TargetError e3) {
                                    e = e3;
                                    throw e;
                                } catch (EvalError unused) {
                                    callStack2 = callStack2;
                                    interfaceC34522 = interfaceC34522;
                                    throw new EvalError("Error in method invocation: " + reflectError.getMessage(), interfaceC34522, callStack2, reflectError);
                                } catch (UtilEvalError e4) {
                                    e = e4;
                                    r6 = callStack2;
                                    r7 = interfaceC34522;
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
                        throw new EvalError("Error in method invocation: " + reflectError.getMessage(), interfaceC34522, callStack2, reflectError);
                    } catch (UtilEvalError e6) {
                        e = e6;
                    }
                    r10 = e;
                    r62 = r6;
                    r72 = r7;
                    throw r10.toEvalError(r72, r62);
                } catch (InvocationTargetException e7) {
                    e = e7;
                    throw m5994(e, r4, callStack, interfaceC3452);
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
            r7 = interfaceC3452;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static Variable[] m6008(NameSpace nameSpace) {
        int i = 0;
        String[] strArr = nameSpace == null ? new String[0] : (String[]) Stream.of((Object[]) nameSpace.getVariableNames()).filter(new C3475(6)).toArray(new C3483(11));
        return (nameSpace == null || strArr == null) ? new Variable[0] : (Variable[]) Stream.of((Object[]) strArr).map(new C3502(nameSpace, i)).filter(new C3475(4)).toArray(new C3483(10));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static boolean m6009(Class cls, String str) {
        Map map = AbstractC3495.f8317;
        if (Map.class.isAssignableFrom(cls) || Map.Entry.class.isAssignableFrom(cls) || AbstractC3495.m5944(cls)) {
            return true;
        }
        C9200 c9200 = C3493.f8305;
        return ((C3489) c9200.m14429(cls)).f8294.containsKey(str) && ((C3489) c9200.m14429(cls)).m5922(str) != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static BshMethod m6010(NameSpace nameSpace, String str, Class[] clsArr, boolean z) {
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
    public static LHS m6011(Class cls, String str) {
        Variable variableImpl;
        try {
            return new LHS(m5989(cls, str, true));
        } catch (ReflectError e) {
            NameSpace nameSpaceM6005 = m6005(cls);
            if (m5992(cls) && nameSpaceM6005 != null && nameSpaceM6005.isClass && (variableImpl = nameSpaceM6005.getVariableImpl(str, true)) != null && (!variableImpl.hasModifier("private") || C3488.m5920())) {
                return new LHS(nameSpaceM6005, str);
            }
            if (m6009(cls, str)) {
                return new LHS(cls, str);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static Object m6012(Object obj, Object obj2) {
        Map map = AbstractC3495.f8317;
        if (obj instanceof Map) {
            Map map2 = (Map) obj;
            return map2.containsKey(obj2) ? map2.get(obj2) : Primitive.VOID;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return obj2.equals(entry.getKey()) ? entry.getValue() : Primitive.VOID;
        }
        Class<?> cls = obj.getClass();
        if (AbstractC3495.m5944(cls)) {
            Map.Entry entryM6021 = m6021(obj2, (Map.Entry[]) obj);
            return entryM6021 != null ? entryM6021.getValue() : Primitive.VOID;
        }
        if (obj instanceof Class) {
            cls = (Class) obj;
        }
        AbstractC3458 abstractC3458M5924 = ((C3489) C3493.f8305.m14429(cls)).m5924(obj2.toString());
        if (abstractC3458M5924 == null) {
            Interpreter.debug("property getter not found");
            return Primitive.VOID;
        }
        try {
            return abstractC3458M5924.mo5877(obj, new Object[0]);
        } catch (InvocationTargetException unused) {
            Interpreter.debug("Property accessor threw exception");
            return Primitive.VOID;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static Object m6013(Object obj, String str) {
        Map map = AbstractC3495.f8317;
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
        return m6012(obj, str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static Object m6014(Class cls) {
        WeakHashMap weakHashMap = f8342;
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
    public static Object m6015(Object obj, String str) throws UtilTargetError {
        if (obj instanceof This) {
            return ((This) obj).namespace.getVariable(str);
        }
        if (obj == Primitive.NULL) {
            throw new UtilTargetError(new NullPointerException(AbstractC0900.m718("Attempt to access field '", str, "' on null value")));
        }
        try {
            return m6018(str, obj.getClass(), obj, false);
        } catch (ReflectError e) {
            Class<?> cls = obj.getClass();
            Map map = AbstractC3495.f8317;
            if (!Map.class.isAssignableFrom(cls) && !Map.Entry.class.isAssignableFrom(cls) && !AbstractC3495.m5944(cls)) {
                C9200 c9200 = C3493.f8305;
                if (!((C3489) c9200.m14429(cls)).f8294.containsKey(str) || ((C3489) c9200.m14429(cls)).m5924(str) == null) {
                    throw e;
                }
            }
            return m6013(obj, str);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static This m6016(Class cls, String str) {
        try {
            return (This) m6018(This.Keys.BSHSTATIC + str, cls, null, true);
        } catch (Exception e) {
            C3466.m5898("Unable to get class static space: ", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static Modifiers m6017(Class cls) {
        try {
            String string = This.Keys.BSHCLASSMODIFIERS.toString();
            NameSpace nameSpaceM6005 = m6005(cls);
            Variable variableImpl = null;
            if (nameSpaceM6005 != null) {
                try {
                    variableImpl = nameSpaceM6005.getVariableImpl(string, false);
                } catch (Exception unused) {
                }
            }
            return (Modifiers) variableImpl.getValue();
        } catch (Exception unused2) {
            return new Modifiers(cls.isInterface() ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static Object m6018(String str, Class cls, Object obj, boolean z) throws UtilTargetError {
        try {
            return m5989(cls, str, z).mo5877(obj, new Object[0]);
        } catch (ReflectError e) {
            NameSpace nameSpaceM6005 = m6005(cls);
            if (m5992(cls) && nameSpaceM6005 != null && nameSpaceM6005.isClass) {
                if (z) {
                    Variable variableImpl = nameSpaceM6005.getVariableImpl(str, true);
                    Primitive primitive = Primitive.VOID;
                    Object objUnwrapVariable = (variableImpl == null || (variableImpl.hasModifier("private") && !C3488.m5920())) ? primitive : nameSpaceM6005.unwrapVariable(variableImpl);
                    if (primitive != objUnwrapVariable) {
                        return objUnwrapVariable;
                    }
                } else {
                    NameSpace nameSpaceM6004 = m6004(obj);
                    if (nameSpaceM6004 != null) {
                        Variable variableImpl2 = nameSpaceM6004.getVariableImpl(str, true);
                        Primitive primitive2 = Primitive.VOID;
                        Object objUnwrapVariable2 = (variableImpl2 == null || (variableImpl2.hasModifier("private") && !C3488.m5920())) ? primitive2 : nameSpaceM6004.unwrapVariable(variableImpl2);
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
            throw new ReflectError(AbstractC0900.m717("Can't access field: ", str), e2.getCause());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static LHS m6019(Object obj, String str) {
        Variable variableImpl;
        if (obj instanceof This) {
            return new LHS(((This) obj).namespace, str, false);
        }
        try {
            return new LHS(obj, m5989(obj.getClass(), str, false));
        } catch (ReflectError e) {
            NameSpace nameSpaceM6004 = m6004(obj);
            if (m5992(obj.getClass()) && nameSpaceM6004 != null && nameSpaceM6004.isClass && (variableImpl = nameSpaceM6004.getVariableImpl(str, true)) != null && (!variableImpl.hasModifier("private") || C3488.m5920())) {
                return new LHS(nameSpaceM6004, str);
            }
            if (m6009(obj.getClass(), str)) {
                return new LHS(obj, str);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static BshMethod[] m6020(Class cls) {
        if (!m5992(cls)) {
            return new BshMethod[0];
        }
        if (cls.isInterface()) {
            NameSpace nameSpaceM6005 = m6005(cls);
            return nameSpaceM6005 == null ? new BshMethod[0] : nameSpaceM6005.getMethods();
        }
        NameSpace nameSpaceM6004 = m6004(m6014(cls));
        return nameSpaceM6004 == null ? new BshMethod[0] : nameSpaceM6004.getMethods();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Map.Entry m6021(Object obj, Map.Entry[] entryArr) {
        for (Map.Entry entry : entryArr) {
            if (obj.equals(entry.getKey())) {
                return entry;
            }
        }
        return null;
    }
}
