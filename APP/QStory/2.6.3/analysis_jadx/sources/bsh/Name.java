package bsh;

import androidx.activity.AbstractC0053;
import bsh.This;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import p281.C8372;
import p281.C8373;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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

    public Name(NameSpace nameSpace, String str) {
        this.namespace = nameSpace;
        this.value = str;
    }

    public static void clearParts() {
        WeakHashMap weakHashMap = C2621.f7857;
        synchronized (weakHashMap) {
            weakHashMap.clear();
        }
    }

    private Object completeRound(String str, String str2, Object obj) {
        if (obj == null) {
            C2633.m5342(AbstractC0053.m157("lastEvalName = ", str));
            return null;
        }
        this.lastEvalName = str;
        this.evalName = str2;
        this.evalBaseObject = obj;
        return obj;
    }

    private Object consumeNextObjectField(CallStack callStack, Interpreter interpreter, boolean z, boolean z2) throws UtilEvalError {
        Name name;
        CallStack callStack2;
        Interpreter interpreter2;
        if (this.evalBaseObject != null || isCompound(this.evalName) || z) {
            name = this;
            callStack2 = callStack;
            interpreter2 = interpreter;
        } else {
            name = this;
            callStack2 = callStack;
            interpreter2 = interpreter;
            Object objResolveThisFieldReference = name.resolveThisFieldReference(callStack2, this.namespace, interpreter2, this.evalName, false);
            if (objResolveThisFieldReference != Primitive.VOID) {
                return name.completeRound(name.evalName, FINISHED, objResolveThisFieldReference);
            }
        }
        String strPrefix = prefix(name.evalName, 1);
        Object obj = name.evalBaseObject;
        if ((obj == null || (obj instanceof This)) && !z) {
            Object objResolveThisFieldReference2 = obj == null ? name.resolveThisFieldReference(callStack2, name.namespace, interpreter2, strPrefix, false) : name.resolveThisFieldReference(callStack2, ((This) obj).namespace, interpreter2, strPrefix, true);
            if (objResolveThisFieldReference2 != Primitive.VOID) {
                return name.completeRound(strPrefix, suffix(name.evalName), objResolveThisFieldReference2);
            }
        }
        Object objM5453 = null;
        if (name.evalBaseObject == null) {
            Interpreter.debug("trying class: ", name.evalName);
            int i = 1;
            Class<?> cls = null;
            String strPrefix2 = null;
            while (i <= countParts(name.evalName) && (cls = name.namespace.getClass((strPrefix2 = prefix(name.evalName, i)))) == null) {
                i++;
            }
            String str = name.evalName;
            if (cls != null) {
                return name.completeRound(strPrefix2, suffix(str, countParts(str) - i), new C2646(cls));
            }
            Interpreter.debug("not a class, trying var prefix ", str);
        }
        Object obj2 = name.evalBaseObject;
        if ((obj2 == null || (obj2 instanceof This)) && !z && z2) {
            NameSpace nameSpace = obj2 == null ? name.namespace : ((This) obj2).namespace;
            This r9 = new NameSpace(nameSpace, AbstractC0053.m157("auto: ", strPrefix)).getThis(interpreter2);
            nameSpace.setVariable(strPrefix, r9, false, name.evalBaseObject == null);
            return name.completeRound(strPrefix, suffix(name.evalName), r9);
        }
        if (obj2 == null) {
            if (!isCompound(name.evalName)) {
                return name.completeRound(name.evalName, FINISHED, name.namespace.getPropertyValue(strPrefix, interpreter2));
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
        if (!(obj2 instanceof C2646)) {
            if (z) {
                throw new UtilEvalError(AbstractC0053.m151(new StringBuilder(), name.value, " does not resolve to a class name."));
            }
            String strPrefix3 = prefix(name.evalName, 1);
            Interpreter.mainSecurityGuard.m13875();
            if (strPrefix3.equals("length") && name.evalBaseObject.getClass().isArray()) {
                return name.completeRound(strPrefix3, suffix(name.evalName), new Primitive(Array.getLength(name.evalBaseObject)));
            }
            try {
                return name.completeRound(strPrefix3, suffix(name.evalName), AbstractC2667.m5455(name.evalBaseObject, strPrefix3));
            } catch (ReflectError unused) {
                return name.completeRound(strPrefix3, suffix(name.evalName), AbstractC2667.m5453(name.evalBaseObject, strPrefix3));
            }
        }
        Class<?> cls2 = ((C2646) obj2).f7919;
        String strPrefix4 = prefix(name.evalName, 1);
        if (strPrefix4.equals("this")) {
            for (NameSpace parent = name.namespace; parent != null; parent = parent.getParent()) {
                Object obj3 = parent.classInstance;
                if (obj3 != null && obj3.getClass() == cls2) {
                    return name.completeRound(strPrefix4, suffix(name.evalName), parent.classInstance);
                }
            }
            throw new UtilEvalError(AbstractC0053.m154(cls2, "Can't find enclosing 'this' instance of class: "));
        }
        Interpreter.mainSecurityGuard.m13874(cls2, strPrefix4);
        try {
            Interpreter.debug("Name call to getStaticFieldValue, class: ", cls2, ", field:", strPrefix4);
            objM5453 = AbstractC2667.m5458(strPrefix4, cls2, null, true);
        } catch (ReflectError e) {
            Interpreter.debug("field reflect error: ", e);
        }
        if (objM5453 == null) {
            Class<?> cls3 = name.namespace.getClass(cls2.getName() + "$" + strPrefix4);
            if (name.namespace.classInstance == null && AbstractC2667.m5432(cls3) && !AbstractC2667.m5457(cls3).hasModifier("static")) {
                throw new UtilEvalError("an enclosing instance that contains " + cls2.getName() + "." + strPrefix4 + " is required");
            }
            if (cls3 != null) {
                objM5453 = new C2646(cls3);
            }
        }
        if (objM5453 == null) {
            objM5453 = AbstractC2667.m5453(cls2, strPrefix4);
        }
        return name.completeRound(strPrefix4, suffix(name.evalName), objM5453);
    }

    public static int countParts(String str) {
        if (str == null) {
            return 0;
        }
        return C2621.m5298(str).f7858;
    }

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

    private Object invokeLocalMethod(Interpreter interpreter, Object[] objArr, CallStack callStack, InterfaceC2619 interfaceC2619) throws EvalError {
        CallStack callStack2;
        InterfaceC2619 interfaceC26192;
        UtilEvalError utilEvalError;
        Name name;
        Interpreter interpreter2;
        CallStack callStack3;
        Object obj;
        Interpreter.debug("invokeLocalMethod: ", this.value);
        BshMethod extensionMethod = null;
        if (interpreter == null) {
            C2633.m5342("invokeLocalMethod: interpreter = null");
            return null;
        }
        String str = this.value;
        Class<?>[] clsArrM5396 = AbstractC2662.m5396(objArr);
        try {
            C8372 c8372 = Interpreter.mainSecurityGuard;
            c8372.getClass();
            Primitive.unwrap(objArr);
            Iterator it = c8372.f23117.iterator();
            while (it.hasNext()) {
                try {
                    ((C8373) it.next()).getClass();
                } catch (UtilEvalError e) {
                    utilEvalError = e;
                    callStack2 = callStack;
                    interfaceC26192 = interfaceC2619;
                    throw utilEvalError.toEvalError(interfaceC26192, callStack2);
                }
            }
            try {
                name = this;
                try {
                    Object objResolveThisFieldReference = name.resolveThisFieldReference(callStack, this.namespace, interpreter, "this", false);
                    callStack3 = callStack;
                    interpreter2 = interpreter;
                    try {
                        if (objResolveThisFieldReference instanceof This) {
                            objResolveThisFieldReference = Primitive.unwrap(objResolveThisFieldReference);
                        }
                        obj = objResolveThisFieldReference;
                    } catch (UtilEvalError unused) {
                        obj = null;
                    }
                } catch (UtilEvalError unused2) {
                    callStack3 = callStack;
                    interpreter2 = interpreter;
                }
            } catch (UtilEvalError unused3) {
                name = this;
                interpreter2 = interpreter;
                callStack3 = callStack;
            }
            boolean z = false;
            if (obj != null) {
                try {
                    if (obj != Primitive.NULL && obj != Primitive.VOID) {
                        extensionMethod = name.namespace.getExtensionMethod(AbstractC2662.m5395(obj, false), str, clsArrM5396);
                    }
                } catch (UtilEvalError e2) {
                    throw e2.toEvalError("Local method invocation", interfaceC2619, callStack3);
                }
            }
            if (extensionMethod == null) {
                extensionMethod = name.namespace.getMethod(str, clsArrM5396, false, false);
            }
            NameSpace nameSpace = name.namespace;
            if (extensionMethod == null) {
                return nameSpace.invokeCommand(str, objArr, interpreter2, callStack3, interfaceC2619);
            }
            if (!nameSpace.isMethod && !extensionMethod.isScriptedObject && nameSpace.isChildOf(extensionMethod.declaringNameSpace) && !name.namespace.getParent().isClass && !noOverride.matcher(extensionMethod.getName()).matches()) {
                z = true;
            }
            return extensionMethod.invoke(objArr, interpreter2, callStack3, interfaceC2619, z, obj);
        } catch (UtilEvalError e3) {
            callStack2 = callStack;
            interfaceC26192 = interfaceC2619;
            utilEvalError = e3;
        }
    }

    public static boolean isCompound(String str) {
        return countParts(str) > 1;
    }

    public static String prefix(String str, int i) {
        if (str == null) {
            return null;
        }
        C2621 c2621M5298 = C2621.m5298(str);
        String[] strArr = c2621M5298.f7861;
        if (1 > i || c2621M5298.f7858 < i) {
            return null;
        }
        if (strArr[i] == null) {
            strArr[i] = String.join(".", c2621M5298.f7859.subList(0, i));
        }
        return strArr[i];
    }

    private void reset() {
        this.evalName = this.value;
        this.evalBaseObject = null;
        this.callstackDepth = 0;
    }

    public static String suffix(String str, int i) {
        int i2;
        if (str == null) {
            return null;
        }
        C2621 c2621M5298 = C2621.m5298(str);
        String[] strArr = c2621M5298.f7860;
        if (1 > i || (i2 = c2621M5298.f7858) < i) {
            return null;
        }
        if (strArr[i] == null) {
            strArr[i] = String.join(".", c2621M5298.f7859.subList(i2 - i, i2));
        }
        return strArr[i];
    }

    public Object invokeMethod(Interpreter interpreter, Object[] objArr, CallStack callStack, InterfaceC2619 interfaceC2619) throws UtilEvalError {
        NameSpace nameSpaceM5444;
        BshMethod method;
        String strSuffix = suffix(this.value, 1);
        C2660 classManager = interpreter.getClassManager();
        NameSpace pVar = callStack.top();
        Class<?> cls = this.classOfStaticMethod;
        if (cls != null) {
            Interpreter.mainSecurityGuard.m13872(cls, strSuffix, objArr);
            return AbstractC2667.m5433(classManager, this.classOfStaticMethod, strSuffix, objArr, interfaceC2619);
        }
        if (!isCompound(this.value)) {
            return invokeLocalMethod(interpreter, objArr, callStack, interfaceC2619);
        }
        String strPrefix = prefix(this.value);
        if (strPrefix.equals("super") && countParts(this.value) == 2) {
            NameSpace nameSpace = pVar.getThis(interpreter).getNameSpace();
            nameSpace.setNode(interfaceC2619);
            NameSpace classNameSpace = getClassNameSpace(nameSpace);
            if (classNameSpace != null) {
                Object classInstance = classNameSpace.getClassInstance();
                Class<?> cls2 = classNameSpace.classStatic;
                Interpreter.mainSecurityGuard.m13873(classInstance, strSuffix, objArr);
                if (C2653.f7944 == null) {
                    C2653.f7944 = new C2653();
                }
                C2653.f7944.getClass();
                Class<? super Object> superclass = cls2.getSuperclass();
                AbstractC2625 abstractC2625M5437 = AbstractC2667.m5437(classInstance.getClass(), This.Keys.BSHSUPER + superclass.getSimpleName() + strSuffix, AbstractC2662.m5396(objArr), false);
                return abstractC2625M5437 != null ? abstractC2625M5437.mo5317(classInstance, objArr) : AbstractC2667.m5428(classManager, superclass, classInstance, strSuffix, objArr, false).mo5317(classInstance, objArr);
            }
        }
        Name nameResolver = pVar.getNameResolver(strPrefix);
        Object object = nameResolver.toObject(callStack, interpreter);
        if (object == Primitive.VOID) {
            throw new UtilEvalError("Attempt to resolve method: " + strSuffix + "() on undefined variable or class name: " + nameResolver);
        }
        if (object instanceof C2646) {
            Interpreter.debug("invokeMethod: trying static - ", nameResolver);
            Class<?> cls3 = ((C2646) object).f7919;
            this.classOfStaticMethod = cls3;
            Interpreter.mainSecurityGuard.m13872(cls3, strSuffix, objArr);
            return AbstractC2667.m5433(classManager, cls3, strSuffix, objArr, interfaceC2619);
        }
        if ((object instanceof Primitive) && object == Primitive.NULL) {
            throw new UtilTargetError(new NullPointerException("Null Pointer in Method Invocation of " + strSuffix + "() on variable: " + nameResolver));
        }
        if (object.getClass().isEnum() && (nameSpaceM5444 = AbstractC2667.m5444(object)) != null && (method = nameSpaceM5444.getMethod(strSuffix, AbstractC2662.m5396(objArr), true)) != null) {
            return method.invoke(objArr, interpreter, callStack, interfaceC2619);
        }
        Interpreter.mainSecurityGuard.m13873(object, strSuffix, objArr);
        return AbstractC2667.m5447(object, strSuffix, objArr, interpreter, callStack, interfaceC2619);
    }

    public Object resolveThisFieldReference(CallStack callStack, NameSpace nameSpace, Interpreter interpreter, String str, boolean z) throws UtilEvalError {
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
            if (z) {
                throw new UtilEvalError("Redundant to call .this on This type");
            }
            This r9 = nameSpace.getThis(interpreter);
            NameSpace classNameSpace = getClassNameSpace(r9.getNameSpace());
            return classNameSpace != null ? isCompound(this.evalName) ? classNameSpace.getThis(interpreter) : classNameSpace.getClassInstance() : r9;
        }
        if (str.equals("super")) {
            This r8 = nameSpace.getSuper(interpreter);
            NameSpace nameSpace2 = r8.getNameSpace();
            return (nameSpace2.getParent() == null || !nameSpace2.getParent().isClass) ? r8 : nameSpace2.getSuper(interpreter);
        }
        Object global = str.equals("global") ? nameSpace.getGlobal(interpreter) : null;
        if (global == null && z) {
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
        if (global == null && z && str.equals("caller")) {
            if (!this.lastEvalName.equals("this") && !this.lastEvalName.equals("caller")) {
                throw new UtilEvalError("Can only call .caller on literal 'this' or literal '.caller'");
            }
            if (callStack == null) {
                C2633.m5342("no callstack");
                return null;
            }
            int i = this.callstackDepth + 1;
            this.callstackDepth = i;
            return callStack.get(i).getThis(interpreter);
        }
        if (global == null && z && str.equals("callstack")) {
            variable = callStack;
            if (!this.lastEvalName.equals("this")) {
                throw new UtilEvalError("Can only call .callstack on literal 'this'");
            }
            if (callStack == null) {
                C2633.m5342("no callstack");
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

    public synchronized Class<?> toClass() {
        Class<?> cls = this.asClass;
        if (cls != null) {
            return cls;
        }
        reset();
        Object object = null;
        if (!this.evalName.equals("var") && !this.evalName.equals("val")) {
            Class<?> cls2 = this.namespace.getClass(this.evalName);
            if (cls2 == null) {
                try {
                    object = toObject(null, null, true);
                } catch (UtilEvalError unused) {
                }
                if (object instanceof C2646) {
                    cls2 = ((C2646) object).f7919;
                }
            }
            if (cls2 != null) {
                this.asClass = cls2;
                return cls2;
            }
            throw new ClassNotFoundException("Class: " + this.value + " not found in namespace");
        }
        this.asClass = null;
        return null;
    }

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
                } catch (UtilEvalError e) {
                    throw new UtilEvalError("LHS evaluation: " + e.getMessage(), e);
                }
            }
            String str2 = this.evalName;
            if (str2 == null && (objConsumeNextObjectField instanceof C2646)) {
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
                    if (objConsumeNextObjectField instanceof C2646) {
                        return AbstractC2667.m5451(((C2646) objConsumeNextObjectField).f7919, str2);
                    }
                    return AbstractC2667.m5459(objConsumeNextObjectField, str2);
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

    public synchronized Object toObject(CallStack callStack, Interpreter interpreter, boolean z) {
        Object objConsumeNextObjectField;
        reset();
        objConsumeNextObjectField = null;
        while (this.evalName != null) {
            objConsumeNextObjectField = consumeNextObjectField(callStack, interpreter, z, false);
        }
        if (objConsumeNextObjectField == null) {
            throw new InterpreterError("null value in toObject()");
        }
        return objConsumeNextObjectField;
    }

    public String toString() {
        return this.value;
    }

    public Object toObject(CallStack callStack, Interpreter interpreter) {
        return toObject(callStack, interpreter, false);
    }

    public static String prefix(String str) {
        return prefix(str, countParts(str) - 1);
    }

    public static String suffix(String str) {
        return suffix(str, countParts(str) - 1);
    }
}
