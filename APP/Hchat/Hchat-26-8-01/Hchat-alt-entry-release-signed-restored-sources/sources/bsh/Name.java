package bsh;

import bsh.This;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import p068eh.AbstractC0921a;
import p222p.AbstractC3199a;
import p332wb.AbstractC4855en;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class Name implements Serializable {
    private static String FINISHED;
    private static final Pattern noOverride = Pattern.compile("eval|assert");
    Class<?> asClass;
    private int callstackDepth;
    Class<?> classOfStaticMethod;
    private Object evalBaseObject;
    private String evalName;
    private String lastEvalName;
    public NameSpace namespace;
    String value;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class Parts {
        private static final Map<String, Parts> PARTSCACHE = new WeakHashMap();
        public final int count;
        private final List<String> list;
        private final String[] prefix;
        private final String[] suffix;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private Parts(String str) {
            List<String> listAsList = Arrays.asList(str.split("\\."));
            this.list = listAsList;
            int size = listAsList.size();
            this.count = size;
            this.prefix = new String[size + 1];
            this.suffix = new String[size + 1];
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static Parts get(String str) {
            Map<String, Parts> map = PARTSCACHE;
            if (map.containsKey(str)) {
                Parts parts = map.get(str);
                if (parts != null) {
                    return parts;
                }
                map.remove(str);
            }
            Parts parts2 = new Parts(str);
            map.put(str, parts2);
            String[] strArr = parts2.prefix;
            int i9 = parts2.count;
            strArr[i9] = str;
            parts2.suffix[i9] = str;
            if (i9 == 1) {
                return parts2;
            }
            strArr[1] = parts2.list.get(0);
            parts2.suffix[1] = parts2.list.get(parts2.count - 1);
            return parts2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String prefix(int i9) {
            if (1 > i9 || this.count < i9) {
                return null;
            }
            String[] strArr = this.prefix;
            if (strArr[i9] == null) {
                strArr[i9] = String.join(".", this.list.subList(0, i9));
            }
            return this.prefix[i9];
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String suffix(int i9) {
            int i10;
            if (1 > i9 || (i10 = this.count) < i9) {
                return null;
            }
            String[] strArr = this.suffix;
            if (strArr[i9] == null) {
                strArr[i9] = String.join(".", this.list.subList(i10 - i9, i10));
            }
            return this.suffix[i9];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Name(NameSpace nameSpace, String str) {
        this.namespace = nameSpace;
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void clearParts() {
        synchronized (Parts.PARTSCACHE) {
            Parts.PARTSCACHE.clear();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Object completeRound(String str, String str2, Object obj) {
        if (obj == null) {
            C0353j.m1308f(AbstractC4855en.m9263g("lastEvalName = ", str));
            return null;
        }
        this.lastEvalName = str;
        this.evalName = str2;
        this.evalBaseObject = obj;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Object consumeNextObjectField(CallStack callStack, Interpreter interpreter, boolean z9, boolean z10) throws UtilEvalError {
        Name name;
        CallStack callStack2;
        Interpreter interpreter2;
        Object objResolveThisFieldReference;
        if (this.evalBaseObject != null || isCompound(this.evalName) || z9) {
            name = this;
            callStack2 = callStack;
            interpreter2 = interpreter;
        } else {
            name = this;
            callStack2 = callStack;
            interpreter2 = interpreter;
            Object objResolveThisFieldReference2 = name.resolveThisFieldReference(callStack2, this.namespace, interpreter2, this.evalName, false);
            if (objResolveThisFieldReference2 != Primitive.VOID) {
                return completeRound(name.evalName, FINISHED, objResolveThisFieldReference2);
            }
        }
        String strPrefix = prefix(name.evalName, 1);
        Object obj = name.evalBaseObject;
        if ((obj == null || (obj instanceof This)) && !z9) {
            if (obj == null) {
                objResolveThisFieldReference = name.resolveThisFieldReference(callStack2, name.namespace, interpreter2, strPrefix, false);
                name = this;
            } else {
                name = this;
                objResolveThisFieldReference = name.resolveThisFieldReference(callStack2, ((This) obj).namespace, interpreter2, strPrefix, true);
            }
            if (objResolveThisFieldReference != Primitive.VOID) {
                return completeRound(strPrefix, suffix(name.evalName), objResolveThisFieldReference);
            }
        }
        Object objectProperty = null;
        if (name.evalBaseObject == null) {
            Interpreter.debug("trying class: ", name.evalName);
            int i9 = 1;
            Class<?> cls = null;
            String strPrefix2 = null;
            while (i9 <= countParts(name.evalName) && (cls = name.namespace.getClass((strPrefix2 = prefix(name.evalName, i9)))) == null) {
                i9++;
            }
            String str = name.evalName;
            if (cls != null) {
                return completeRound(strPrefix2, suffix(str, countParts(str) - i9), new ClassIdentifier(cls));
            }
            Interpreter.debug("not a class, trying var prefix ", str);
        }
        Object obj2 = name.evalBaseObject;
        if ((obj2 == null || (obj2 instanceof This)) && !z9 && z10) {
            NameSpace nameSpace = obj2 == null ? name.namespace : ((This) obj2).namespace;
            This r10 = new NameSpace(nameSpace, AbstractC4855en.m9263g("auto: ", strPrefix)).getThis(interpreter2);
            nameSpace.setVariable(strPrefix, r10, false, name.evalBaseObject == null);
            return completeRound(strPrefix, suffix(name.evalName), r10);
        }
        if (obj2 == null) {
            if (!isCompound(name.evalName)) {
                return completeRound(name.evalName, FINISHED, name.namespace.getPropertyValue(strPrefix, interpreter2));
            }
            throw new UtilEvalError("Class or variable not found: " + name.evalName);
        }
        if (obj2 == Primitive.NULL) {
            throw new UtilTargetError(new NullPointerException("Null Pointer while evaluating: " + name.value));
        }
        if (obj2 == Primitive.VOID) {
            throw new UtilEvalError("Undefined variable or class name while evaluating: " + name.value);
        }
        if (obj2 instanceof Primitive) {
            throw new UtilEvalError("Can't treat primitive like an object. Error while evaluating: " + name.value);
        }
        if (!(obj2 instanceof ClassIdentifier)) {
            if (z9) {
                throw new UtilEvalError(AbstractC0921a.m2255r(new StringBuilder(), name.value, " does not resolve to a class name."));
            }
            String strPrefix3 = prefix(name.evalName, 1);
            Interpreter.mainSecurityGuard.canGetField(name.evalBaseObject, strPrefix3);
            if (strPrefix3.equals("length") && name.evalBaseObject.getClass().isArray()) {
                return completeRound(strPrefix3, suffix(name.evalName), new Primitive(Array.getLength(name.evalBaseObject)));
            }
            try {
                return completeRound(strPrefix3, suffix(name.evalName), Reflect.getObjectFieldValue(name.evalBaseObject, strPrefix3));
            } catch (ReflectError unused) {
                return completeRound(strPrefix3, suffix(name.evalName), Reflect.getObjectProperty(name.evalBaseObject, strPrefix3));
            }
        }
        Class<?> targetClass = ((ClassIdentifier) obj2).getTargetClass();
        String strPrefix4 = prefix(name.evalName, 1);
        if (strPrefix4.equals("this")) {
            for (NameSpace parent = name.namespace; parent != null; parent = parent.getParent()) {
                Object obj3 = parent.classInstance;
                if (obj3 != null && obj3.getClass() == targetClass) {
                    return completeRound(strPrefix4, suffix(name.evalName), parent.classInstance);
                }
            }
            throw new UtilEvalError(AbstractC3199a.m6838k(targetClass, "Can't find enclosing 'this' instance of class: "));
        }
        Interpreter.mainSecurityGuard.canGetStaticField(targetClass, strPrefix4);
        try {
            Interpreter.debug("Name call to getStaticFieldValue, class: ", targetClass, ", field:", strPrefix4);
            objectProperty = Reflect.getStaticFieldValue(targetClass, strPrefix4);
        } catch (ReflectError e6) {
            Interpreter.debug("field reflect error: ", e6);
        }
        if (objectProperty == null) {
            Class<?> cls2 = name.namespace.getClass(targetClass.getName() + "$" + strPrefix4);
            if (name.namespace.classInstance == null && Reflect.isGeneratedClass(cls2) && !Reflect.getClassModifiers(cls2).hasModifier("static")) {
                throw new UtilEvalError("an enclosing instance that contains " + targetClass.getName() + "." + strPrefix4 + " is required");
            }
            if (cls2 != null) {
                objectProperty = new ClassIdentifier(cls2);
            }
        }
        if (objectProperty == null) {
            objectProperty = Reflect.getObjectProperty((Object) targetClass, strPrefix4);
        }
        return completeRound(strPrefix4, suffix(name.evalName), objectProperty);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int countParts(String str) {
        if (str == null) {
            return 0;
        }
        return Parts.get(str).count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static NameSpace getClassNameSpace(NameSpace nameSpace) {
        if (nameSpace == null) {
            return null;
        }
        if (nameSpace.isClass) {
            return nameSpace;
        }
        if (nameSpace.isMethod && nameSpace.getParent() != null && nameSpace.getParent().isClass) {
            return nameSpace.getParent();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Object invokeLocalMethod(Interpreter interpreter, Object[] objArr, CallStack callStack, Node node) throws EvalError {
        Interpreter interpreter2;
        CallStack callStack2;
        Name name;
        Object obj;
        Object objResolveThisFieldReference;
        Interpreter.debug("invokeLocalMethod: ", this.value);
        if (interpreter == null) {
            C0353j.m1308f("invokeLocalMethod: interpreter = null");
            return null;
        }
        String str = this.value;
        Class<?>[] types = Types.getTypes(objArr);
        try {
            Interpreter.mainSecurityGuard.canInvokeLocalMethod(str, objArr);
            BshMethod extensionMethod = null;
            try {
                try {
                    objResolveThisFieldReference = resolveThisFieldReference(callStack, this.namespace, interpreter, "this", false);
                    name = this;
                    callStack2 = callStack;
                    interpreter2 = interpreter;
                } catch (UtilEvalError unused) {
                    name = this;
                    callStack2 = callStack;
                    interpreter2 = interpreter;
                }
            } catch (UtilEvalError unused2) {
                interpreter2 = interpreter;
                callStack2 = callStack;
                name = this;
            }
            try {
                if (objResolveThisFieldReference instanceof This) {
                    objResolveThisFieldReference = Primitive.unwrap(objResolveThisFieldReference);
                }
                obj = objResolveThisFieldReference;
            } catch (UtilEvalError unused3) {
                obj = null;
            }
            if (obj != null) {
                try {
                    if (obj != Primitive.NULL && obj != Primitive.VOID) {
                        extensionMethod = name.namespace.getExtensionMethod(Types.getType(obj), str, types);
                    }
                } catch (UtilEvalError e6) {
                    throw e6.toEvalError("Local method invocation", node, callStack2);
                }
            }
            boolean z9 = false;
            if (extensionMethod == null) {
                extensionMethod = name.namespace.getMethod(str, types, false, false);
            }
            BshMethod bshMethod = extensionMethod;
            NameSpace nameSpace = name.namespace;
            if (bshMethod == null) {
                return nameSpace.invokeCommand(str, objArr, interpreter2, callStack2, node);
            }
            if (!nameSpace.isMethod && !bshMethod.isScriptedObject && nameSpace.isChildOf(bshMethod.declaringNameSpace) && !name.namespace.getParent().isClass && !noOverride.matcher(bshMethod.getName()).matches()) {
                z9 = true;
            }
            return bshMethod.invoke(objArr, interpreter2, callStack2, node, z9, obj);
        } catch (UtilEvalError e7) {
            throw e7.toEvalError(node, callStack);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isCompound(String str) {
        return countParts(str) > 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String prefix(String str, int i9) {
        if (str == null) {
            return null;
        }
        return Parts.get(str).prefix(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void reset() {
        this.evalName = this.value;
        this.evalBaseObject = null;
        this.callstackDepth = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String suffix(String str, int i9) {
        if (str == null) {
            return null;
        }
        return Parts.get(str).suffix(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object invokeMethod(Interpreter interpreter, Object[] objArr, CallStack callStack, Node node) throws UtilEvalError {
        NameSpace thisNS;
        BshMethod method;
        String strSuffix = suffix(this.value, 1);
        BshClassManager classManager = interpreter.getClassManager();
        NameSpace pVar = callStack.top();
        Class<?> cls = this.classOfStaticMethod;
        if (cls != null) {
            Interpreter.mainSecurityGuard.canInvokeStaticMethod(cls, strSuffix, objArr);
            return Reflect.invokeStaticMethod(classManager, this.classOfStaticMethod, strSuffix, objArr, node);
        }
        if (!isCompound(this.value)) {
            return invokeLocalMethod(interpreter, objArr, callStack, node);
        }
        String strPrefix = prefix(this.value);
        if (strPrefix.equals("super") && countParts(this.value) == 2) {
            NameSpace nameSpace = pVar.getThis(interpreter).getNameSpace();
            nameSpace.setNode(node);
            NameSpace classNameSpace = getClassNameSpace(nameSpace);
            if (classNameSpace != null) {
                Object classInstance = classNameSpace.getClassInstance();
                Class<?> cls2 = classNameSpace.classStatic;
                Interpreter.mainSecurityGuard.canInvokeMethod(classInstance, strSuffix, objArr);
                return ClassGenerator.getClassGenerator().invokeSuperclassMethod(classManager, classInstance, cls2, strSuffix, objArr);
            }
        }
        Name nameResolver = pVar.getNameResolver(strPrefix);
        Object object = nameResolver.toObject(callStack, interpreter);
        if (object == Primitive.VOID) {
            throw new UtilEvalError("Attempt to resolve method: " + strSuffix + "() on undefined variable or class name: " + nameResolver);
        }
        if (object instanceof ClassIdentifier) {
            Interpreter.debug("invokeMethod: trying static - ", nameResolver);
            Class<?> targetClass = ((ClassIdentifier) object).getTargetClass();
            this.classOfStaticMethod = targetClass;
            if (targetClass != null) {
                Interpreter.mainSecurityGuard.canInvokeStaticMethod(targetClass, strSuffix, objArr);
                return Reflect.invokeStaticMethod(classManager, targetClass, strSuffix, objArr, node);
            }
            throw new UtilEvalError("invokeMethod: unknown target: " + nameResolver);
        }
        if ((object instanceof Primitive) && object == Primitive.NULL) {
            throw new UtilTargetError(new NullPointerException("Null Pointer in Method Invocation of " + strSuffix + "() on variable: " + nameResolver));
        }
        if (object.getClass().isEnum() && (thisNS = Reflect.getThisNS(object)) != null && (method = thisNS.getMethod(strSuffix, Types.getTypes(objArr), true)) != null) {
            return method.invoke(objArr, interpreter, callStack, node);
        }
        Interpreter.mainSecurityGuard.canInvokeMethod(object, strSuffix, objArr);
        return Reflect.invokeObjectMethod(object, strSuffix, objArr, interpreter, callStack, node);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:86:0x0128 */
    public Object resolveThisFieldReference(CallStack callStack, NameSpace nameSpace, Interpreter interpreter, String str, boolean z9) throws UtilEvalError {
        Object variable;
        if (str.equals("this")) {
            for (NameSpace parent = nameSpace; parent != null; parent = parent.getParent()) {
                Object variable2 = parent.getVariable(This.Keys.BSHEXTENSIONMETHODRECEIVER.toString(), false);
                if (variable2 != Primitive.VOID && variable2 != Primitive.NULL) {
                    return variable2;
                }
                if (parent.isClass) {
                    break;
                }
            }
            if (z9) {
                throw new UtilEvalError("Redundant to call .this on This type");
            }
            This r82 = nameSpace.getThis(interpreter);
            NameSpace classNameSpace = getClassNameSpace(r82.getNameSpace());
            return classNameSpace != null ? isCompound(this.evalName) ? classNameSpace.getThis(interpreter) : classNameSpace.getClassInstance() : r82;
        }
        if (str.equals("super")) {
            This r83 = nameSpace.getSuper(interpreter);
            NameSpace nameSpace2 = r83.getNameSpace();
            return (nameSpace2.getParent() == null || !nameSpace2.getParent().isClass) ? r83 : nameSpace2.getSuper(interpreter);
        }
        Object global = str.equals("global") ? nameSpace.getGlobal(interpreter) : null;
        if (global == null && z9) {
            if (str.equals("namespace")) {
                global = nameSpace;
            } else if (str.equals("variables")) {
                global = nameSpace.getVariableNames();
            } else if (str.equals("methods")) {
                global = nameSpace.getMethodNames();
            } else if (str.equals("interpreter")) {
                if (!this.lastEvalName.equals("this")) {
                    throw new UtilEvalError("Can only call .interpreter on literal 'this'");
                }
                global = interpreter;
            }
        }
        if (global == null && z9 && str.equals("caller")) {
            if (!this.lastEvalName.equals("this") && !this.lastEvalName.equals("caller")) {
                throw new UtilEvalError("Can only call .caller on literal 'this' or literal '.caller'");
            }
            if (callStack == null) {
                C0353j.m1308f("no callstack");
                return null;
            }
            int i9 = this.callstackDepth + 1;
            this.callstackDepth = i9;
            return callStack.get(i9).getThis(interpreter);
        }
        if (global == null && z9 && str.equals("callstack")) {
            variable = callStack;
            if (!this.lastEvalName.equals("this")) {
                throw new UtilEvalError("Can only call .callstack on literal 'this'");
            }
            if (callStack == null) {
                C0353j.m1308f("no callstack");
                return null;
            }
        } else {
            variable = global;
        }
        if (variable == null) {
            variable = nameSpace.getVariable(str, this.evalBaseObject == null);
        }
        return variable == null ? Primitive.NULL : variable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized Class<?> toClass() {
        Class<?> cls = this.asClass;
        if (cls != null) {
            return cls;
        }
        reset();
        Object object = null;
        if (!this.evalName.equals("var") && !this.evalName.equals("val")) {
            Class<?> targetClass = this.namespace.getClass(this.evalName);
            if (targetClass == null) {
                try {
                    object = toObject(null, null, true);
                } catch (UtilEvalError unused) {
                }
                if (object instanceof ClassIdentifier) {
                    targetClass = ((ClassIdentifier) object).getTargetClass();
                }
            }
            if (targetClass != null) {
                this.asClass = targetClass;
                return targetClass;
            }
            throw new ClassNotFoundException("Class: " + this.value + " not found in namespace");
        }
        this.asClass = null;
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized LHS toLHS(CallStack callStack, Interpreter interpreter) {
        try {
            reset();
            if (!isCompound(this.evalName)) {
                if (this.evalName.equals("this")) {
                    throw new UtilEvalError("Can't assign to 'this'.");
                }
                NameSpace nameSpace = this.namespace;
                return nameSpace.isClass ? new LHS(nameSpace, this.evalName) : new LHS(nameSpace, this.evalName, false);
            }
            Object objConsumeNextObjectField = null;
            while (true) {
                try {
                    String str = this.evalName;
                    if (str == null || !isCompound(str)) {
                        break;
                    }
                    objConsumeNextObjectField = consumeNextObjectField(callStack, interpreter, false, true);
                } catch (UtilEvalError e6) {
                    throw new UtilEvalError("LHS evaluation: " + e6.getMessage(), e6);
                }
            }
            String str2 = this.evalName;
            if (str2 == null && (objConsumeNextObjectField instanceof ClassIdentifier)) {
                throw new UtilEvalError("Can't assign to class: " + this.value);
            }
            if (objConsumeNextObjectField == null) {
                throw new UtilEvalError("Error in LHS: " + this.value);
            }
            if (!(objConsumeNextObjectField instanceof This)) {
                if (str2 == null) {
                    throw new InterpreterError("Internal error in lhs...");
                }
                try {
                    if (objConsumeNextObjectField instanceof ClassIdentifier) {
                        return Reflect.getLHSStaticField(((ClassIdentifier) objConsumeNextObjectField).getTargetClass(), this.evalName);
                    }
                    return Reflect.getLHSObjectField(objConsumeNextObjectField, str2);
                } catch (ReflectError unused) {
                    return new LHS(objConsumeNextObjectField, this.evalName);
                }
            }
            if (!str2.equals("namespace") && !this.evalName.equals("variables") && !this.evalName.equals("methods") && !this.evalName.equals("caller")) {
                Interpreter.debug("found This reference evaluating LHS");
                return new LHS(((This) objConsumeNextObjectField).namespace, this.evalName, !this.lastEvalName.equals("super"));
            }
            throw new UtilEvalError("Can't assign to special variable: " + this.evalName);
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized Object toObject(CallStack callStack, Interpreter interpreter, boolean z9) {
        Object objConsumeNextObjectField;
        reset();
        objConsumeNextObjectField = null;
        while (this.evalName != null) {
            objConsumeNextObjectField = consumeNextObjectField(callStack, interpreter, z9, false);
        }
        if (objConsumeNextObjectField == null) {
            throw new InterpreterError("null value in toObject()");
        }
        return objConsumeNextObjectField;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return this.value;
    }

    public static String prefix(String str) {
        return prefix(str, countParts(str) - 1);
    }

    public static String suffix(String str) {
        return suffix(str, countParts(str) - 1);
    }

    public Object toObject(CallStack callStack, Interpreter interpreter) {
        return toObject(callStack, interpreter, false);
    }
}
