package bsh;

import be.C0285i;
import be.C0301s;
import bsh.BshClassManager;
import bsh.This;
import bsh.util.ValueReferenceMap;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
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
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p025bc.AbstractC0255e;
import p025bc.C0260j;
import p068eh.AbstractC0921a;
import p222p.AbstractC3199a;
import p332wb.AbstractC4855en;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Reflect {
    static final String GET_PREFIX = "get";
    static final String IS_PREFIX = "is";
    private static final Pattern PACKAGE_ACCESS;
    static final String SET_PREFIX = "set";
    static final Map<Class<?>, Object> instanceCache;
    public static final Object[] ZERO_ARGS = new Object[0];
    public static final Class<?>[] ZERO_TYPES = new Class[0];
    private static final Map<String, String> ACCESSOR_NAMES = new WeakHashMap();
    private static final Pattern DEFAULT_PACKAGE = Pattern.compile("[^\\.]+|bsh\\..*");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String property = Security.getProperty("package.access");
        if (property == null) {
            property = "null";
        }
        PACKAGE_ACCESS = Pattern.compile((String) Stream.of((Object[]) property.split(",")).filter(new C0341a(7)).collect(Collectors.joining("|", "(?:", ").*")));
        instanceCache = new WeakHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String accessorName(String str, String str2) {
        Map<String, String> map = ACCESSOR_NAMES;
        if (!map.containsKey(str2)) {
            char[] charArray = str2.toCharArray();
            charArray[0] = Character.toUpperCase(charArray[0]);
            map.put(str2, new String(charArray));
        }
        return str + map.get(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static ReflectError cantFindConstructor(Class<?> cls, Class<?>[] clsArr) {
        if (clsArr.length == 0) {
            return new ReflectError(AbstractC3199a.m6838k(cls, "Can't find default constructor for: "));
        }
        return new ReflectError("Can't find constructor: " + StringUtil.methodString(cls.getName(), clsArr) + " in class: " + cls.getName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void checkFoundStaticMethod(Invocable invocable, boolean z9, Class<?> cls) throws UtilEvalError {
        if (invocable == null || !z9 || invocable.isStatic()) {
            return;
        }
        throw new UtilEvalError("Cannot reach instance method: " + StringUtil.methodString(invocable.getName(), invocable.getParameterTypes()) + " from static context: " + cls.getName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object constructObject(Class<?> cls, Object obj, Object[] objArr) throws InvocationTargetException {
        if (cls == null) {
            return Primitive.NULL;
        }
        if (cls.isInterface()) {
            throw new ReflectError(AbstractC3199a.m6838k(cls, "Can't create instance of an interface: "));
        }
        Class<?>[] types = Types.getTypes(objArr);
        if (cls.isMemberClass() && !isStatic(cls) && obj != null) {
            types = (Class[]) Stream.concat(Stream.of(obj.getClass()), Stream.of((Object[]) types)).toArray(new C0348e(9));
        }
        Interpreter.debug("Looking for most specific constructor: ", cls);
        Invocable invocableFindMethod = BshClassManager.memberCache.get(cls).findMethod(cls.getName(), types);
        if (invocableFindMethod == null || !(objArr.length == invocableFindMethod.getParameterCount() || invocableFindMethod.isVarArgs() || invocableFindMethod.isInnerClass())) {
            throw cantFindConstructor(cls, types);
        }
        try {
            return invocableFindMethod.invoke(obj, objArr);
        } catch (InvocationTargetException e6) {
            if (!(e6.getCause().getCause() instanceof IllegalAccessException)) {
                throw e6;
            }
            throw new ReflectError("We don't have permission to create an instance. " + e6.getCause().getCause().getMessage() + " Use setAccessibility(true) to enable access.", e6.getCause().getCause());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static BshMethod findMostSpecificBshMethod(Class<?>[] clsArr, List<BshMethod> list) {
        Interpreter.debug("find most specific BshMethod for: " + Arrays.toString(clsArr));
        int iFindMostSpecificBshMethodIndex = findMostSpecificBshMethodIndex(clsArr, list);
        if (iFindMostSpecificBshMethodIndex == -1) {
            return null;
        }
        return list.get(iFindMostSpecificBshMethodIndex);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int findMostSpecificBshMethodIndex(Class<?>[] clsArr, List<BshMethod> list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            StringBuilder sbM2257t = AbstractC0921a.m2257t(i9, "  ", ":");
            sbM2257t.append(list.get(i9).toString());
            sbM2257t.append(" ");
            sbM2257t.append(list.get(i9).getClass().getName());
            Interpreter.debug(sbM2257t.toString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<BshMethod> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Class<?>[] parameterTypes = it.next().getParameterTypes();
            if (clsArr.length == parameterTypes.length) {
                arrayList2.add(Integer.valueOf(i10));
                arrayList.add(parameterTypes);
            }
            i10++;
        }
        int iFindMostSpecificSignature = findMostSpecificSignature(clsArr, (Class[][]) arrayList.toArray(new Class[arrayList.size()][]));
        if (iFindMostSpecificSignature >= 0) {
            int iIntValue = ((Integer) arrayList2.get(iFindMostSpecificSignature)).intValue();
            Interpreter.debug(" remap: " + arrayList2);
            Interpreter.debug(" match:" + iIntValue);
            return iIntValue;
        }
        arrayList.clear();
        arrayList2.clear();
        int i11 = 0;
        for (BshMethod bshMethod : list) {
            Class<?>[] parameterTypes2 = bshMethod.getParameterTypes();
            if (bshMethod.isVarArgs() && clsArr.length >= parameterTypes2.length - 1) {
                Class[] clsArr2 = new Class[clsArr.length];
                System.arraycopy(parameterTypes2, 0, clsArr2, 0, parameterTypes2.length - 1);
                Arrays.fill(clsArr2, parameterTypes2.length - 1, clsArr.length, parameterTypes2[parameterTypes2.length - 1].getComponentType());
                arrayList2.add(Integer.valueOf(i11));
                arrayList.add(clsArr2);
            }
            i11++;
        }
        int iFindMostSpecificSignature2 = findMostSpecificSignature(clsArr, (Class[][]) arrayList.toArray(new Class[arrayList.size()][]));
        if (iFindMostSpecificSignature2 < 0) {
            return iFindMostSpecificSignature2;
        }
        int iIntValue2 = ((Integer) arrayList2.get(iFindMostSpecificSignature2)).intValue();
        Interpreter.debug(" remap (varargs): " + Arrays.toString(arrayList2.toArray(new Integer[0])));
        Interpreter.debug(" match (varargs):" + iIntValue2);
        return iIntValue2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static BshMethod findMostSpecificExtensionMethod(Class<?> cls, Class<?>[] clsArr, List<BshMethod> list) {
        Interpreter.debug("find most specific extension method for: receiver: " + cls + " args: " + Arrays.toString(clsArr));
        int iFindMostSpecificExtensionMethodIndex = findMostSpecificExtensionMethodIndex(cls, clsArr, list);
        if (iFindMostSpecificExtensionMethodIndex == -1) {
            return null;
        }
        return list.get(iFindMostSpecificExtensionMethodIndex);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int findMostSpecificExtensionMethodIndex(Class<?> cls, Class<?>[] clsArr, List<BshMethod> list) {
        Class<?> cls2;
        Class<?> cls3;
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < list.size(); i9++) {
            BshMethod bshMethod = list.get(i9);
            if (bshMethod.isExtension && (cls3 = bshMethod.receiverType) != null && Types.isJavaBoxTypesAssignable(cls3, cls)) {
                arrayList.add(Integer.valueOf(i9));
            }
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Integer num = (Integer) arrayList.get(i10);
            Class<?> cls4 = list.get(num.intValue()).receiverType;
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                }
                if (i10 != i11 && cls4 != (cls2 = list.get(((Integer) arrayList.get(i11)).intValue()).receiverType) && cls4.isAssignableFrom(cls2)) {
                    arrayList2.remove(num);
                    break;
                }
                i11++;
            }
        }
        if (arrayList2.size() == 1) {
            return ((Integer) arrayList2.get(0)).intValue();
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(list.get(((Integer) it.next()).intValue()));
        }
        int iFindMostSpecificBshMethodIndex = findMostSpecificBshMethodIndex(clsArr, arrayList3);
        return iFindMostSpecificBshMethodIndex >= 0 ? ((Integer) arrayList2.get(iFindMostSpecificBshMethodIndex)).intValue() : ((Integer) arrayList2.get(0)).intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Invocable findMostSpecificInvocable(Class<?>[] clsArr, List<Invocable> list) {
        Interpreter.debug("find most specific Invocable for: " + Arrays.toString(clsArr));
        int iFindMostSpecificInvocableIndex = findMostSpecificInvocableIndex(clsArr, list);
        if (iFindMostSpecificInvocableIndex == -1) {
            return null;
        }
        return list.get(iFindMostSpecificInvocableIndex);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int findMostSpecificInvocableIndex(Class<?>[] clsArr, List<Invocable> list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            StringBuilder sbM2257t = AbstractC0921a.m2257t(i9, "  ", "=");
            sbM2257t.append(list.get(i9).toString());
            Interpreter.debug(sbM2257t.toString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Invocable> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Class<?>[] parameterTypes = it.next().getParameterTypes();
            if (clsArr.length == parameterTypes.length) {
                arrayList2.add(Integer.valueOf(i10));
                arrayList.add(parameterTypes);
            }
            i10++;
        }
        int iFindMostSpecificSignature = findMostSpecificSignature(clsArr, (Class[][]) arrayList.toArray(new Class[arrayList.size()][]));
        if (iFindMostSpecificSignature >= 0) {
            int iIntValue = ((Integer) arrayList2.get(iFindMostSpecificSignature)).intValue();
            Interpreter.debug(" remap=" + Arrays.toString(arrayList2.toArray(new Integer[0])));
            Interpreter.debug(" match=" + iIntValue);
            return iIntValue;
        }
        arrayList.clear();
        arrayList2.clear();
        int i11 = 0;
        for (Invocable invocable : list) {
            Class<?>[] parameterTypes2 = invocable.getParameterTypes();
            if (invocable.isVarArgs() && clsArr.length >= parameterTypes2.length - 1) {
                Class[] clsArr2 = new Class[clsArr.length];
                System.arraycopy(parameterTypes2, 0, clsArr2, 0, parameterTypes2.length - 1);
                Arrays.fill(clsArr2, parameterTypes2.length - 1, clsArr.length, invocable.getVarArgsComponentType());
                arrayList2.add(Integer.valueOf(i11));
                arrayList.add(clsArr2);
            }
            i11++;
        }
        int iFindMostSpecificSignature2 = findMostSpecificSignature(clsArr, (Class[][]) arrayList.toArray(new Class[arrayList.size()][]));
        if (iFindMostSpecificSignature2 >= 0) {
            iFindMostSpecificSignature2 = ((Integer) arrayList2.get(iFindMostSpecificSignature2)).intValue();
        }
        Interpreter.debug(" remap (varargs) =" + Arrays.toString(arrayList2.toArray(new Integer[0])));
        Interpreter.debug(" match (varargs) =" + iFindMostSpecificSignature2);
        return iFindMostSpecificSignature2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int findMostSpecificSignature(Class<?>[] clsArr, Class<?>[][] clsArr2) {
        int i9 = 1;
        while (true) {
            int i10 = -1;
            if (i9 > 4) {
                return -1;
            }
            Class<?>[] clsArr3 = null;
            for (int i11 = 0; i11 < clsArr2.length; i11++) {
                Class<?>[] clsArr4 = clsArr2[i11];
                if ((clsArr3 == null || !Types.areSignaturesEqual(clsArr4, clsArr3)) && Types.isSignatureAssignable(clsArr, clsArr4, i9) && (clsArr3 == null || Types.areSignaturesEqual(clsArr, clsArr4) || (Types.isSignatureAssignable(clsArr4, clsArr3, 1) && !Types.areSignaturesEqual(clsArr, clsArr3)))) {
                    i10 = i11;
                    clsArr3 = clsArr4;
                }
            }
            if (clsArr3 != null) {
                return i10;
            }
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static This getClassInstanceThis(Object obj, String str) {
        try {
            return (This) Primitive.unwrap(getObjectFieldValue(obj, This.Keys.BSHTHIS + str));
        } catch (Exception e6) {
            C0353j.m1306d("Generated class: Error getting This ", e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Modifiers getClassModifiers(Class<?> cls) {
        try {
            return (Modifiers) getVariable(cls, This.Keys.BSHCLASSMODIFIERS.toString()).getValue();
        } catch (Exception unused) {
            return new Modifiers(cls.isInterface() ? 1 : 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static This getClassStaticThis(Class<?> cls, String str) {
        try {
            return (This) getStaticFieldValue(cls, This.Keys.BSHSTATIC + str);
        } catch (Exception e6) {
            C0353j.m1306d("Unable to get class static space: ", e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static BshMethod getDeclaredMethod(Class<?> cls, String str, Class<?>[] clsArr) {
        if (!isGeneratedClass(cls)) {
            return null;
        }
        BshMethod method = getMethod(cls, str, clsArr);
        return (method != null || cls.isInterface()) ? method : getMethod(getNewInstance(cls), str, clsArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static BshMethod[] getDeclaredMethods(Class<?> cls) {
        return !isGeneratedClass(cls) ? new BshMethod[0] : cls.isInterface() ? getMethods(cls) : getMethods(getNewInstance(cls));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Variable getDeclaredVariable(Class<?> cls, String str) {
        if (!isGeneratedClass(cls)) {
            return null;
        }
        Variable variable = getVariable(cls, str);
        return (variable != null || cls.isInterface()) ? variable : getVariable(getNewInstance(cls), str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Variable[] getDeclaredVariables(Class<?> cls) {
        return !isGeneratedClass(cls) ? new Variable[0] : cls.isInterface() ? getVariables(cls) : getVariables(getNewInstance(cls));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Map.Entry getEntryForKey(Object obj, Map.Entry[] entryArr) {
        for (Map.Entry entry : entryArr) {
            if (obj.equals(entry.getKey())) {
                return entry;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> T[] getEnumConstants(Class<T> cls) {
        return (T[]) Stream.of((Object[]) cls.getFields()).filter(new C0285i(cls, 4)).map(new C0342b(14)).filter(new C0341a(5)).toArray(new C0301s(1, cls));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Object getFieldValue(Class<?> cls, Object obj, String str, boolean z9) throws UtilTargetError {
        try {
            return resolveExpectedJavaField(cls, str, z9).invoke(obj, new Object[0]);
        } catch (ReflectError e6) {
            NameSpace thisNS = getThisNS(cls);
            if (isGeneratedClass(cls) && thisNS != null && thisNS.isClass) {
                if (z9) {
                    Variable variableImpl = thisNS.getVariableImpl(str, true);
                    Primitive primitive = Primitive.VOID;
                    Object objUnwrapVariable = (variableImpl == null || (variableImpl.hasModifier("private") && !Capabilities.haveAccessibility())) ? primitive : thisNS.unwrapVariable(variableImpl);
                    if (primitive != objUnwrapVariable) {
                        return objUnwrapVariable;
                    }
                } else {
                    NameSpace thisNS2 = getThisNS(obj);
                    if (thisNS2 != null) {
                        Variable variableImpl2 = thisNS2.getVariableImpl(str, true);
                        Primitive primitive2 = Primitive.VOID;
                        Object objUnwrapVariable2 = (variableImpl2 == null || (variableImpl2.hasModifier("private") && !Capabilities.haveAccessibility())) ? primitive2 : thisNS2.unwrapVariable(variableImpl2);
                        if (primitive2 != objUnwrapVariable2) {
                            return objUnwrapVariable2;
                        }
                    }
                }
            }
            throw e6;
        } catch (InvocationTargetException e7) {
            if (e7.getCause() instanceof InterpreterError) {
                throw ((InterpreterError) e7.getCause());
            }
            if (e7.getCause() instanceof UtilEvalError) {
                throw new UtilTargetError(e7.getCause());
            }
            throw new ReflectError(AbstractC4855en.m9263g("Can't access field: ", str), e7.getCause());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LHS getLHSObjectField(Object obj, String str) {
        Variable variableImpl;
        if (obj instanceof This) {
            return new LHS(((This) obj).namespace, str, false);
        }
        try {
            return new LHS(obj, resolveExpectedJavaField(obj.getClass(), str, false));
        } catch (ReflectError e6) {
            NameSpace thisNS = getThisNS(obj);
            if (isGeneratedClass(obj.getClass()) && thisNS != null && thisNS.isClass && (variableImpl = thisNS.getVariableImpl(str, true)) != null && (!variableImpl.hasModifier("private") || Capabilities.haveAccessibility())) {
                return new LHS(thisNS, str);
            }
            if (hasObjectPropertySetter(obj.getClass(), str)) {
                return new LHS(obj, str);
            }
            throw e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LHS getLHSStaticField(Class<?> cls, String str) {
        Variable variableImpl;
        try {
            return new LHS(resolveExpectedJavaField(cls, str, true));
        } catch (ReflectError e6) {
            NameSpace thisNS = getThisNS(cls);
            if (isGeneratedClass(cls) && thisNS != null && thisNS.isClass && (variableImpl = thisNS.getVariableImpl(str, true)) != null && (!variableImpl.hasModifier("private") || Capabilities.haveAccessibility())) {
                return new LHS(thisNS, str);
            }
            if (hasObjectPropertySetter(cls, str)) {
                return new LHS(cls, str);
            }
            throw e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static BshMethod getMethod(NameSpace nameSpace, String str, Class<?>[] clsArr, boolean z9) {
        if (nameSpace == null) {
            return null;
        }
        try {
            return nameSpace.getMethod(str, clsArr, z9);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String[] getMethodNames(NameSpace nameSpace) {
        return nameSpace == null ? new String[0] : nameSpace.getMethodNames();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static BshMethod[] getMethods(NameSpace nameSpace) {
        return nameSpace == null ? new BshMethod[0] : nameSpace.getMethods();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object getNewInstance(Class<?> cls) {
        Map<Class<?>, Object> map = instanceCache;
        if (map.containsKey(cls)) {
            return map.get(cls);
        }
        try {
            map.put(cls, cls.getConstructor(null).newInstance(null));
        } catch (IllegalArgumentException | ReflectiveOperationException | SecurityException unused) {
            instanceCache.put(cls, null);
        }
        return instanceCache.get(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object getObjectFieldValue(Object obj, String str) throws UtilTargetError {
        if (obj instanceof This) {
            return ((This) obj).namespace.getVariable(str);
        }
        if (obj == Primitive.NULL) {
            throw new UtilTargetError(new NullPointerException(AbstractC0921a.m2251n("Attempt to access field '", str, "' on null value")));
        }
        try {
            return getFieldValue(obj.getClass(), obj, str, false);
        } catch (ReflectError e6) {
            if (hasObjectPropertyGetter(obj.getClass(), str)) {
                return getObjectProperty(obj, str);
            }
            throw e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object getObjectProperty(Object obj, Object obj2) {
        if (Types.isPropertyTypeMap(obj)) {
            Map map = (Map) obj;
            return map.containsKey(obj2) ? map.get(obj2) : Primitive.VOID;
        }
        if (Types.isPropertyTypeEntry(obj)) {
            Map.Entry entry = (Map.Entry) obj;
            return obj2.equals(entry.getKey()) ? entry.getValue() : Primitive.VOID;
        }
        Class<?> cls = obj.getClass();
        if (Types.isPropertyTypeEntryList(cls)) {
            Map.Entry entryForKey = getEntryForKey(obj2, (Map.Entry[]) obj);
            return entryForKey != null ? entryForKey.getValue() : Primitive.VOID;
        }
        if (obj instanceof Class) {
            cls = (Class) obj;
        }
        Invocable invocableFindGetter = BshClassManager.memberCache.get(cls).findGetter(obj2.toString());
        if (invocableFindGetter == null) {
            Interpreter.debug("property getter not found");
            return Primitive.VOID;
        }
        try {
            return invocableFindGetter.invoke(obj, new Object[0]);
        } catch (InvocationTargetException unused) {
            Interpreter.debug("Property accessor threw exception");
            return Primitive.VOID;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object getStaticFieldValue(Class<?> cls, String str) {
        return getFieldValue(cls, null, str, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static NameSpace getThisNS(Class<?> cls) {
        if (!isGeneratedClass(cls)) {
            return null;
        }
        try {
            return getClassStaticThis(cls, cls.getSimpleName()).namespace;
        } catch (Exception e6) {
            if (e6.getCause() instanceof UtilTargetError) {
                throw new InterpreterError(e6.getCause().getCause().getMessage(), e6.getCause().getCause());
            }
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Class<?> getType(Object obj) {
        return Types.getType(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Variable getVariable(NameSpace nameSpace, String str) {
        if (nameSpace == null) {
            return null;
        }
        try {
            return nameSpace.getVariableImpl(str, false);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String[] getVariableNames(NameSpace nameSpace) {
        return nameSpace == null ? new String[0] : (String[]) Stream.of((Object[]) nameSpace.getVariableNames()).filter(new C0341a(6)).toArray(new C0348e(11));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Variable[] getVariables(NameSpace nameSpace, String[] strArr) {
        return (nameSpace == null || strArr == null) ? new Variable[0] : (Variable[]) Stream.of((Object[]) strArr).map(new C0260j(nameSpace, 1)).filter(new C0341a(4)).toArray(new C0348e(10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasModifier(String str, int i9) {
        return Modifier.toString(i9).contains(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasObjectPropertyGetter(Class<?> cls, String str) {
        if (Types.isPropertyType(cls)) {
            return true;
        }
        ValueReferenceMap<Class<?>, BshClassManager.MemberCache> valueReferenceMap = BshClassManager.memberCache;
        return valueReferenceMap.get(cls).hasMember(str) && valueReferenceMap.get(cls).findGetter(str) != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean hasObjectPropertySetter(Class<?> cls, String str) {
        if (Types.isPropertyType(cls)) {
            return true;
        }
        ValueReferenceMap<Class<?>, BshClassManager.MemberCache> valueReferenceMap = BshClassManager.memberCache;
        return valueReferenceMap.get(cls).hasMember(str) && valueReferenceMap.get(cls).findSetter(str) != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object invokeCompiledCommand(Class<?> cls, Object[] objArr, Interpreter interpreter, CallStack callStack, Node node) throws UtilEvalError {
        Object[] objArr2 = new Object[objArr.length + 2];
        objArr2[0] = interpreter;
        objArr2[1] = callStack;
        System.arraycopy(objArr, 0, objArr2, 2, objArr.length);
        try {
            return invokeStaticMethod(interpreter.getClassManager(), cls, "invoke", objArr2, node);
        } catch (ReflectError e6) {
            throw new UtilEvalError("Error invoking compiled command: " + e6, e6);
        } catch (InvocationTargetException e7) {
            throw new UtilEvalError("Error in compiled command: " + e7.getCause(), e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Object invokeMathMethod(Class<?> cls, Object obj, Class<?> cls2, String str, Object[] objArr, Interpreter interpreter, CallStack callStack, Node node) throws EvalError {
        Object objInvokeObjectMethod = invokeObjectMethod(Primitive.castWrapper(cls, obj), str, objArr, interpreter, callStack, node);
        return ((objInvokeObjectMethod instanceof Primitive) && ((Primitive) objInvokeObjectMethod).getType() == cls) ? Primitive.wrap(Primitive.castWrapper(cls2, objInvokeObjectMethod), cls2) : objInvokeObjectMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:39:0x0090 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:41:0x0093 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:58:0x00c5 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [bsh.NameSpace] */
    /* JADX WARN: Type inference failed for: r10v1, types: [bsh.UtilEvalError] */
    /* JADX WARN: Type inference failed for: r10v23, types: [bsh.Invocable] */
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
    /* JADX WARN: Type inference failed for: r7v1, types: [bsh.Node] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static Object invokeObjectMethod(Object obj, String str, Object[] objArr, Interpreter interpreter, CallStack callStack, Node node) throws EvalError {
        ?? r62;
        ?? r72;
        ?? r10;
        ?? r73;
        ?? r63;
        ?? r42;
        ?? r5;
        if ((obj instanceof This) && !This.isExposedThisMethod(str)) {
            return ((This) obj).invokeMethod(str, objArr, interpreter, callStack, node, false);
        }
        BshClassManager classManager = interpreter.getClassManager();
        boolean z9 = obj instanceof Primitive;
        try {
            Class<?> type = obj.getClass();
            if (z9) {
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
                } catch (UtilEvalError e6) {
                    r10 = e6;
                    r63 = callStack;
                    r73 = node;
                    throw r10.toEvalError(r73, r63);
                }
            }
            Object obj2 = obj;
            r62 = str;
            r72 = objArr;
            Class<?> cls = type;
            try {
                ?? ResolveExpectedJavaMethod = resolveExpectedJavaMethod(classManager, cls, obj2, r62, r72, false);
                r42 = r62;
                r5 = r72;
                try {
                    NameSpace thisNS = getThisNS(obj2);
                    if (thisNS != null) {
                        thisNS.setNode(node);
                    }
                    return ResolveExpectedJavaMethod.invoke(obj2, r5);
                } catch (ReflectError e7) {
                    e = e7;
                    ReflectError reflectError = e;
                    try {
                        if (obj2 == Primitive.VOID) {
                            throw new EvalError("Attempt to invoke method: " + r42 + "() on undefined", node, callStack, reflectError);
                        }
                        ?? extensionMethod = callStack.top().getExtensionMethod(type, r42, Types.getTypes(r5));
                        if (extensionMethod != 0) {
                            return extensionMethod.invoke(r5, interpreter, callStack, node, false, obj2);
                        }
                        CallStack callStack2 = callStack;
                        Node node2 = node;
                        Object obj3 = obj2;
                        if (z9 && !interpreter.getStrictJava()) {
                            try {
                                if (!Types.isNumeric(obj3)) {
                                    return invokeObjectMethod(obj3, r42, r5, interpreter, callStack2, node2);
                                }
                                try {
                                    return numericMathMethod(obj3, type, r42, r5, interpreter, callStack2, node2);
                                } catch (TargetError e10) {
                                    e = e10;
                                    throw e;
                                } catch (EvalError unused) {
                                    callStack2 = callStack2;
                                    node2 = node2;
                                    throw new EvalError("Error in method invocation: " + reflectError.getMessage(), node2, callStack2, reflectError);
                                } catch (UtilEvalError e11) {
                                    e = e11;
                                    r62 = callStack2;
                                    r72 = node2;
                                    r10 = e;
                                    r63 = r62;
                                    r73 = r72;
                                    throw r10.toEvalError(r73, r63);
                                }
                            } catch (TargetError e12) {
                                e = e12;
                            } catch (EvalError unused2) {
                            }
                            throw e;
                        }
                        throw new EvalError("Error in method invocation: " + reflectError.getMessage(), node2, callStack2, reflectError);
                    } catch (UtilEvalError e13) {
                        e = e13;
                    }
                    r10 = e;
                    r63 = r62;
                    r73 = r72;
                    throw r10.toEvalError(r73, r63);
                } catch (InvocationTargetException e14) {
                    e = e14;
                    throw targetErrorFromTargetException(e, r42, callStack, node);
                }
            } catch (ReflectError e15) {
                e = e15;
                type = cls;
                obj2 = obj2;
                r42 = r62;
                r5 = r72;
            } catch (InvocationTargetException e16) {
                e = e16;
                r42 = r62;
            }
        } catch (UtilEvalError e17) {
            e = e17;
            r62 = callStack;
            r72 = node;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object invokeStaticMethod(BshClassManager bshClassManager, Class<?> cls, String str, Object[] objArr, Node node) {
        Interpreter.debug("invoke static Method");
        NameSpace thisNS = getThisNS(cls);
        if (thisNS != null) {
            thisNS.setNode(node);
        }
        return resolveExpectedJavaMethod(bshClassManager, cls, null, str, objArr, true).invoke(null, objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isGeneratedClass(Class<?> cls) {
        return (cls == null || cls == GeneratedClass.class || !GeneratedClass.class.isAssignableFrom(cls)) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isPackageAccessible(Class<?> cls) {
        return Capabilities.haveAccessibility() || !PACKAGE_ACCESS.matcher(cls.getName()).matches();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isPackageScope(Class<?> cls) {
        return DEFAULT_PACKAGE.matcher(cls.getName()).matches();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isPrivate(Member member) {
        return Modifier.isPrivate(member.getModifiers());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isPublic(Member member) {
        return Modifier.isPublic(member.getModifiers());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isStatic(Member member) {
        return Modifier.isStatic(member.getModifiers());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Class[] lambda$constructObject$1(int i9) {
        return new Class[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getEnumConstants$6(Class cls, Field field) {
        return field.getType() == cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$getEnumConstants$7(Field field) {
        try {
            return field.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object[] lambda$getEnumConstants$8(Class cls, int i9) {
        return (Object[]) Array.newInstance((Class<?>) cls, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getVariableNames$2(String str) {
        return !str.matches("_?bsh.*");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] lambda$getVariableNames$3(int i9) {
        return new String[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Variable[] lambda$getVariables$5(int i9) {
        return new Variable[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$0(String str) {
        return !str.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void logInvokeMethod(String str, Invocable invocable, Object[] objArr) {
        if (Interpreter.DEBUG.get().booleanValue()) {
            Interpreter.debug(str, invocable, " with args:");
            for (int i9 = 0; i9 < objArr.length; i9++) {
                Object obj = objArr[i9];
                Interpreter.debug("args[", Integer.valueOf(i9), "] = ", obj, " type = ", obj == null ? "<unknown>" : obj.getClass());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Object numericMathMethod(Object obj, Class<?> cls, String str, Object[] objArr, Interpreter interpreter, CallStack callStack, Node node) throws EvalError {
        Class cls2 = Types.isFloatingpoint(obj) ? BigDecimal.class : BigInteger.class;
        try {
            return invokeMathMethod(cls2, obj, cls, str, objArr, interpreter, callStack, node);
        } catch (TargetError e6) {
            throw e6.reThrow("Method found on " + cls2.getSimpleName() + " but with error");
        } catch (EvalError unused) {
            return invokeMathMethod(Types.isFloatingpoint(obj) ? BigInteger.class : BigDecimal.class, obj, cls, str, objArr, interpreter, callStack, node);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Invocable resolveExpectedJavaField(Class<?> cls, String str, boolean z9) throws UtilEvalError {
        Invocable invocableFindField = BshClassManager.memberCache.get(cls).findField(str);
        if (invocableFindField == null) {
            StringBuilder sbM1026o = AbstractC0255e.m1026o("No such field: ", str, " for class: ");
            sbM1026o.append(cls.getName());
            throw new ReflectError(sbM1026o.toString());
        }
        if (!z9 || invocableFindField.isStatic()) {
            return invocableFindField;
        }
        StringBuilder sbM1026o2 = AbstractC0255e.m1026o("Can't reach instance field: ", str, " from static context: ");
        sbM1026o2.append(cls.getName());
        throw new UtilEvalError(sbM1026o2.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Invocable resolveExpectedJavaMethod(BshClassManager bshClassManager, Class<?> cls, Object obj, String str, Object[] objArr, boolean z9) throws UtilTargetError {
        if (obj == Primitive.NULL) {
            throw new UtilTargetError(new NullPointerException(AbstractC0921a.m2251n("Attempt to invoke method ", str, " on null value")));
        }
        Class<?>[] types = Types.getTypes(objArr);
        Invocable invocableResolveJavaMethod = resolveJavaMethod(cls, str, types, z9);
        if (bshClassManager != null && bshClassManager.getStrictJava() && invocableResolveJavaMethod != null && invocableResolveJavaMethod.getDeclaringClass().isInterface() && invocableResolveJavaMethod.getDeclaringClass() != cls && Modifier.isStatic(invocableResolveJavaMethod.getModifiers())) {
            invocableResolveJavaMethod = null;
        }
        if (invocableResolveJavaMethod != null) {
            return invocableResolveJavaMethod;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z9 ? "Static method " : "Method ");
        sb2.append(StringUtil.methodString(str, types));
        sb2.append(" not found in class'");
        sb2.append(cls.getName());
        sb2.append("'");
        throw new ReflectError(sb2.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Invocable resolveJavaField(Class<?> cls, String str, boolean z9) {
        try {
            return resolveExpectedJavaField(cls, str, z9);
        } catch (ReflectError unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Invocable resolveJavaMethod(Class<?> cls, String str, Class<?>[] clsArr, boolean z9) {
        if (cls == null) {
            C0353j.m1308f("null class");
            return null;
        }
        Invocable invocableFindMethod = BshClassManager.memberCache.get(cls).findMethod(str, clsArr);
        Interpreter.debug("resolved java method: ", invocableFindMethod, " on class: ", cls);
        checkFoundStaticMethod(invocableFindMethod, z9, cls);
        return invocableFindMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object setObjectProperty(Object obj, Object obj2, Object obj3) {
        if (Types.isPropertyTypeMap(obj)) {
            return ((Map) obj).put(obj2, Primitive.unwrap(obj3));
        }
        if (Types.isPropertyTypeEntry(obj)) {
            Map.Entry entry = (Map.Entry) obj;
            if (obj2.equals(entry.getKey())) {
                return entry.setValue(Primitive.unwrap(obj3));
            }
            StringBuilder sb2 = new StringBuilder("No such property setter: ");
            sb2.append(obj2);
            String strTypeString = StringUtil.typeString(obj);
            sb2.append(" for type: ");
            sb2.append(strTypeString);
            throw new ReflectError(sb2.toString());
        }
        Class<?> cls = obj.getClass();
        if (Types.isPropertyTypeEntryList(cls)) {
            return getEntryForKey(obj2, (Map.Entry[]) obj).setValue(Primitive.unwrap(obj3));
        }
        if (obj instanceof Class) {
            cls = (Class) obj;
        }
        Invocable invocableFindSetter = BshClassManager.memberCache.get(cls).findSetter(obj2.toString());
        if (invocableFindSetter != null) {
            try {
                return invocableFindSetter.invoke(obj, Primitive.unwrap(obj3));
            } catch (InvocationTargetException e6) {
                throw new ReflectError("Property accessor threw exception: " + e6.getCause(), e6.getCause());
            }
        }
        StringBuilder sb3 = new StringBuilder("No such property setter: ");
        sb3.append(obj2);
        String strTypeString2 = StringUtil.typeString(cls);
        sb3.append(" for type: ");
        sb3.append(strTypeString2);
        throw new ReflectError(sb3.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static BshMethod staticMethodImport(Class<?> cls, String str) {
        Invocable invocableFindStaticMethod = BshClassManager.memberCache.get(cls).findStaticMethod(str);
        if (invocableFindStaticMethod != null) {
            return new BshMethod(invocableFindStaticMethod, (Object) null);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static TargetError targetErrorFromTargetException(InvocationTargetException invocationTargetException, String str, CallStack callStack, Node node) {
        String strM9263g = AbstractC4855en.m9263g("Method Invocation ", str);
        Throwable cause = invocationTargetException.getCause();
        boolean z9 = true;
        if ((cause instanceof EvalError) && (!(cause instanceof TargetError) || !((TargetError) cause).inNativeCode())) {
            z9 = false;
        }
        return new TargetError(strM9263g, cause, node, callStack, z9);
    }

    public static boolean isPrivate(Class<?> cls) {
        return Modifier.isPrivate(cls.getModifiers());
    }

    public static boolean isPublic(Class<?> cls) {
        return Modifier.isPublic(cls.getModifiers());
    }

    public static boolean isStatic(Class<?> cls) {
        return Modifier.isStatic(cls.getModifiers());
    }

    public static BshMethod getMethod(Object obj, String str, Class<?>[] clsArr) {
        return getMethod(getThisNS(obj), str, clsArr);
    }

    public static BshMethod getMethod(NameSpace nameSpace, String str, Class<?>[] clsArr) {
        return getMethod(nameSpace, str, clsArr, true);
    }

    public static BshMethod[] getMethods(Object obj) {
        return getMethods(getThisNS(obj));
    }

    public static Variable getVariable(Object obj, String str) {
        return getVariable(getThisNS(obj), str);
    }

    public static BshMethod getMethod(Class<?> cls, String str, Class<?>[] clsArr) {
        return getMethod(getThisNS(cls), str, clsArr);
    }

    public static BshMethod[] getMethods(Class<?> cls) {
        return getMethods(getThisNS(cls));
    }

    public static Variable getVariable(Class<?> cls, String str) {
        return getVariable(getThisNS(cls), str);
    }

    public static Variable[] getVariables(Object obj) {
        return getVariables(getThisNS(obj));
    }

    public static Variable[] getVariables(NameSpace nameSpace) {
        return getVariables(nameSpace, getVariableNames(nameSpace));
    }

    public static Variable[] getVariables(Class<?> cls) {
        return getVariables(getThisNS(cls));
    }

    public static NameSpace getThisNS(Object obj) {
        if (obj == null) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (!isGeneratedClass(cls)) {
            return null;
        }
        try {
            if (obj instanceof Proxy) {
                return getThisNS(cls.getInterfaces()[0]);
            }
            return getClassInstanceThis(obj, cls.getSimpleName()).namespace;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void logInvokeMethod(String str, Invocable invocable, List<Object> list) {
        if (Interpreter.DEBUG.get().booleanValue()) {
            logInvokeMethod(str, invocable, list.toArray());
        }
    }

    public static Object getObjectProperty(Object obj, String str) {
        if (Types.isPropertyTypeEntry(obj)) {
            str.getClass();
            switch (str) {
                case "key":
                    return ((Map.Entry) obj).getKey();
                case "val":
                case "value":
                    return ((Map.Entry) obj).getValue();
            }
        }
        return getObjectProperty(obj, (Object) str);
    }

    public static Object constructObject(Class<?> cls, Object[] objArr) {
        return constructObject(cls, null, objArr);
    }

    public static Object setObjectProperty(Object obj, String str, Object obj2) {
        if (Types.isPropertyTypeEntry(obj)) {
            str.getClass();
            if (str.equals("val") || str.equals("value")) {
                return ((Map.Entry) obj).setValue(obj2);
            }
        }
        return setObjectProperty(obj, (Object) str, obj2);
    }
}
