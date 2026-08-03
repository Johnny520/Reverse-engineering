package bsh;

import bsh.BshClassManager;
import bsh.This;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.IntStream;
import okhttp3.HttpUrl;
import p068eh.AbstractC0921a;
import p332wb.AbstractC4855en;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class BshMethod implements Serializable, Cloneable, BshClassManager.Listener {
    private static final long serialVersionUID = 1;
    private Class<?>[] cparamTypes;
    private Class<?> creturnType;
    NameSpace declaringNameSpace;
    protected boolean isExtension;
    protected boolean isScriptedObject;
    protected boolean isVarArgs;
    private Invocable javaMethod;
    private Object javaObject;
    protected BSHBlock methodBody;
    private transient MethodCallback methodCallback;
    Modifiers modifiers;
    private String name;
    private int paramCount;
    private Modifiers[] paramModifiers;
    private String[] paramNames;
    protected Class<?> receiverType;
    private boolean reload;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    @FunctionalInterface
    public interface MethodCallback {
        Object invoke(Object[] objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BshMethod(String str, Class<?> cls, String[] strArr, Class<?>[] clsArr, Modifiers[] modifiersArr, BSHBlock bSHBlock, NameSpace nameSpace, Modifiers modifiers, boolean z9) {
        this.isScriptedObject = false;
        this.isExtension = false;
        this.receiverType = null;
        this.reload = false;
        this.name = str;
        this.creturnType = cls;
        this.paramNames = strArr;
        this.paramModifiers = modifiersArr;
        if (strArr != null) {
            this.paramCount = strArr.length;
        } else if (clsArr != null) {
            this.paramCount = clsArr.length;
        }
        this.cparamTypes = clsArr;
        this.methodBody = bSHBlock;
        this.declaringNameSpace = nameSpace;
        this.modifiers = modifiers;
        this.isVarArgs = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean equal(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Object invokeImpl(Object[] objArr, Interpreter interpreter, CallStack callStack, Node node, boolean z9, Object obj) throws EvalError {
        NameSpace nameSpace;
        Object objNewInstance;
        ReturnControl returnControl;
        This classInstanceThis;
        Primitive primitive;
        Object obj2;
        CallStack callStack2 = callStack;
        Node node2 = node;
        if (hasModifier("abstract")) {
            throw new EvalError("Cannot invoke abstract method " + this.name, node2, callStack2);
        }
        if (this.methodBody == null) {
            boolean zHasModifier = hasModifier("native");
            String str = this.name;
            throw new EvalError(zHasModifier ? AbstractC0921a.m2251n("Cannot invoke top-level native method ", str, ". Declare the JNI method in a class and load the SO with that class loader.") : AbstractC4855en.m9263g("Cannot invoke method without a body: ", str), node2, callStack2);
        }
        Class<?> returnType = getReturnType();
        Class<?>[] parameterTypes = getParameterTypes();
        if (callStack2 == null) {
            callStack2 = new CallStack(this.declaringNameSpace);
        }
        CallStack callStack3 = callStack2;
        Object[] objArr2 = objArr == null ? Reflect.ZERO_ARGS : objArr;
        if (!isVarArgs() && objArr2.length != getParameterCount()) {
            throw new EvalError("Wrong number of arguments for local method: " + this.name, node2, callStack3);
        }
        int i9 = 1;
        if (z9) {
            nameSpace = callStack3.top();
        } else {
            nameSpace = new NameSpace(this.declaringNameSpace, this.name);
            nameSpace.isMethod = true;
        }
        int i10 = 0;
        if (this.isExtension && obj != null) {
            nameSpace.importObject(Primitive.unwrap(obj));
            try {
                nameSpace.setLocalVariable(HttpUrl.FRAGMENT_ENCODE_SET + This.Keys.BSHEXTENSIONMETHODRECEIVER, obj, false);
            } catch (UtilEvalError unused) {
            }
        }
        nameSpace.setNode(node2);
        int parameterCount = getParameterCount() - 1;
        if (isVarArgs()) {
            objNewInstance = (!(getParameterCount() == objArr2.length && ((obj2 = objArr2[parameterCount]) == null || (obj2.getClass().isArray() && parameterTypes[parameterCount].getComponentType().isAssignableFrom(objArr2[parameterCount].getClass().getComponentType())))) && objArr2.length >= getParameterCount() - 1) ? Array.newInstance(parameterTypes[parameterCount].getComponentType(), objArr2.length - parameterCount) : null;
        }
        while (i10 < objArr2.length) {
            int i11 = i10 >= parameterCount ? parameterCount : i10;
            Class<?> componentType = (objNewInstance == null || i11 != parameterCount) ? parameterTypes[i11] : parameterTypes[i11].getComponentType();
            if (componentType != null) {
                try {
                    Object objCastObject = Types.castObject(objArr2[i10], componentType, i9);
                    objArr2[i10] = objCastObject;
                    if (objNewInstance == null || i10 < parameterCount) {
                        nameSpace.setTypedVariable(this.paramNames[i11], componentType, objCastObject, this.paramModifiers[i11]);
                    } else {
                        try {
                            Array.set(objNewInstance, i10 - i11, Primitive.unwrap(objCastObject));
                        } catch (UtilEvalError e6) {
                            throw e6.toEvalError("Typed method parameter assignment", node2, callStack3);
                        }
                    }
                } catch (UtilEvalError e7) {
                    throw new EvalError("Invalid argument: `" + this.paramNames[i11] + "' for method: " + this.name + " : " + e7.getMessage(), node2, callStack3);
                }
            } else {
                Object obj3 = objArr2[i10];
                if (obj3 == Primitive.VOID) {
                    throw new EvalError("Undefined variable or class name, parameter: " + this.paramNames[i11] + " to method: " + this.name, node2, callStack3);
                }
                try {
                    nameSpace.setLocalVariable(this.paramNames[i11], obj3, interpreter.getStrictJava());
                } catch (UtilEvalError e10) {
                    throw e10.toEvalError("Typed method parameter assignment", node2, callStack3);
                }
            }
            i10++;
            i9 = 1;
        }
        if (objNewInstance != null) {
            try {
                nameSpace.setTypedVariable(this.paramNames[parameterCount], parameterTypes[parameterCount], objNewInstance, this.paramModifiers[parameterCount]);
            } catch (UtilEvalError e11) {
                throw e11.toEvalError("Typed method parameter assignment", node2, callStack3);
            }
        }
        if (!z9) {
            callStack3.push(nameSpace);
        }
        try {
            Object objEval = this.methodBody.eval(callStack3, interpreter, Boolean.TRUE);
            CallStack callStackCopy = callStack3.copy();
            boolean z10 = objEval instanceof ReturnControl;
            Class<?> cls = Void.TYPE;
            if (z10) {
                returnControl = (ReturnControl) objEval;
                if (returnControl.kind != 47) {
                    throw new EvalException("'continue' or 'break' in method body", returnControl.returnPoint, callStackCopy);
                }
                objEval = returnControl.value;
                if (returnType == cls && objEval != (primitive = Primitive.VOID)) {
                    objEval = primitive;
                }
            } else {
                returnControl = null;
            }
            if (returnType != null) {
                if (returnType == cls) {
                    return Primitive.VOID;
                }
                try {
                    objEval = Types.castObject(objEval, returnType, 1);
                } catch (UtilEvalError e12) {
                    if (returnControl != null) {
                        node2 = returnControl.returnPoint;
                    }
                    throw e12.toEvalError("Incorrect type returned from method: " + this.name + e12.getMessage(), node2, callStack3);
                }
            }
            return (!"clone".equals(getName()) || (classInstanceThis = Reflect.getClassInstanceThis(objEval, objEval.getClass().getSimpleName())) == null) ? objEval : classInstanceThis.cloneMethodImpl(node2, callStack3, objEval);
        } finally {
            if (!z9) {
                callStack3.pop();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Object invokeMethodCallback(Object[] objArr, Node node, CallStack callStack) throws EvalError {
        if (objArr == null) {
            objArr = Reflect.ZERO_ARGS;
        }
        Class<?>[] parameterTypes = getParameterTypes();
        if (parameterTypes == null || parameterTypes.length == 0) {
            return this.methodCallback.invoke(objArr);
        }
        String[] parameterNames = getParameterNames();
        for (int i9 = 0; i9 < objArr.length; i9++) {
            Class<?> cls = parameterTypes[i9];
            if (cls != null) {
                try {
                    objArr[i9] = Primitive.unwrap(Types.castObject(objArr[i9], cls, 1));
                } catch (UtilEvalError e6) {
                    throw new EvalError("Invalid argument: `" + parameterNames[i9] + "' for method: " + this.name + " : " + e6.getMessage(), node, callStack);
                }
            }
        }
        return this.methodCallback.invoke(objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getParameterNames$0(Integer num) {
        return String.valueOf((char) num.intValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] lambda$getParameterNames$1(int i9) {
        return new String[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void reloadTypes() {
        if (!this.reload) {
            return;
        }
        int i9 = 0;
        try {
            this.reload = false;
            if (Reflect.isGeneratedClass(this.creturnType)) {
                this.creturnType = this.declaringNameSpace.getClass(this.creturnType.getName());
            }
            while (true) {
                Class<?>[] clsArr = this.cparamTypes;
                if (i9 >= clsArr.length) {
                    return;
                }
                if (Reflect.isGeneratedClass(clsArr[i9])) {
                    Class<?>[] clsArr2 = this.cparamTypes;
                    clsArr2[i9] = this.declaringNameSpace.getClass(clsArr2[i9].getName());
                }
                i9++;
            }
        } catch (UtilEvalError unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.BshClassManager.Listener
    public void classLoaderChanged() {
        this.reload = Reflect.isGeneratedClass(this.creturnType) || Arrays.asList(this.cparamTypes).stream().anyMatch(new C0341a(2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public BshMethod m10910clone() {
        try {
            return (BshMethod) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        boolean z9;
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        BshMethod bshMethod = (BshMethod) obj;
        if (!this.name.equals(bshMethod.name) || getParameterCount() != bshMethod.getParameterCount() || (z9 = this.isExtension) != bshMethod.isExtension) {
            return false;
        }
        if (z9 && !equal(this.receiverType, bshMethod.receiverType)) {
            return false;
        }
        for (int i9 = 0; i9 < getParameterCount(); i9++) {
            if (!equal(getParameterTypes()[i9], bshMethod.getParameterTypes()[i9])) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Modifiers getModifiers() {
        if (this.modifiers == null) {
            this.modifiers = new Modifiers(2);
        }
        return this.modifiers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getName() {
        Invocable invocable = this.javaMethod;
        return invocable == null ? this.name : invocable.getName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getParameterCount() {
        Invocable invocable = this.javaMethod;
        return invocable == null ? this.paramCount : invocable.getParameterCount();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Modifiers[] getParameterModifiers() {
        if (this.paramModifiers == null) {
            this.paramModifiers = new Modifiers[getParameterCount()];
        }
        return this.paramModifiers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String[] getParameterNames() {
        if (this.paramNames == null) {
            this.paramNames = (String[]) IntStream.range(97, getParameterCount() + 97).boxed().map(new C0342b(3)).toArray(new C0348e(0));
        }
        return this.paramNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class<?>[] getParameterTypes() {
        Invocable invocable = this.javaMethod;
        if (invocable != null) {
            return invocable.getParameterTypes();
        }
        reloadTypes();
        return this.cparamTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class<?> getReturnType() {
        Invocable invocable = this.javaMethod;
        if (invocable != null) {
            return invocable.getReturnType();
        }
        reloadTypes();
        return this.creturnType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean hasModifier(String str) {
        Invocable invocable = this.javaMethod;
        if (invocable != null) {
            return Reflect.hasModifier(str, invocable.getModifiers());
        }
        Modifiers modifiers = this.modifiers;
        return modifiers != null && modifiers.hasModifier(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        int iM2245h = AbstractC0921a.m2245h((getClass().hashCode() + this.name.hashCode()) * 31, 31, this.isExtension);
        Class<?> cls = this.receiverType;
        int iHashCode = iM2245h + (cls == null ? 0 : cls.hashCode());
        Class<?>[] parameterTypes = getParameterTypes();
        int length = parameterTypes.length;
        for (int i9 = 0; i9 < length; i9++) {
            Class<?> cls2 = parameterTypes[i9];
            iHashCode += (cls2 == null ? 0 : cls2.hashCode()) + 3;
        }
        return getParameterCount() + iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object invoke(Object[] objArr, Interpreter interpreter, CallStack callStack, Node node, boolean z9, Object obj) throws EvalError {
        Object classInstance;
        Object objInvokeImpl;
        Interpreter.debug("Bsh method invoke: ", this.name, " overrideNameSpace: ", Boolean.valueOf(z9));
        if (objArr != null) {
            for (Object obj2 : objArr) {
                if (obj2 == null) {
                    throw new Error("HERE!");
                }
            }
        }
        if (this.methodCallback != null) {
            return invokeMethodCallback(objArr, node, callStack);
        }
        Invocable invocable = this.javaMethod;
        if (invocable != null) {
            try {
                if (Reflect.isStatic(invocable)) {
                    Interpreter.mainSecurityGuard.canInvokeStaticMethod(this.javaMethod.getDeclaringClass(), this.javaMethod.getName(), objArr);
                } else {
                    Interpreter.mainSecurityGuard.canInvokeMethod(this.javaObject, this.javaMethod.getName(), objArr);
                }
                return this.javaMethod.invoke(this.javaObject, objArr);
            } catch (ReflectError e6) {
                throw new EvalError("Error invoking Java method: " + e6, node, callStack);
            } catch (UtilEvalError e7) {
                throw e7.toEvalError(node, callStack);
            } catch (InvocationTargetException e10) {
                throw new TargetError("Exception invoking imported object method.", e10, node, callStack, true);
            }
        }
        Modifiers modifiers = this.modifiers;
        if (modifiers == null || !modifiers.hasModifier("synchronized")) {
            return invokeImpl(objArr, interpreter, callStack, node, z9, obj);
        }
        NameSpace nameSpace = this.declaringNameSpace;
        if (nameSpace.isClass) {
            try {
                classInstance = nameSpace.getClassInstance();
            } catch (UtilEvalError unused) {
                C0353j.m1308f("Can't get class instance for synchronized method.");
                return null;
            }
        } else {
            classInstance = nameSpace.getThis(interpreter);
        }
        synchronized (classInstance) {
            objInvokeImpl = invokeImpl(objArr, interpreter, callStack, node, z9, obj);
        }
        return objInvokeImpl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isVarArgs() {
        Invocable invocable = this.javaMethod;
        return invocable == null ? this.isVarArgs : invocable.isVarArgs();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "Method: " + StringUtil.methodString(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BshMethod(BSHMethodDeclaration bSHMethodDeclaration, NameSpace nameSpace, Modifiers modifiers, boolean z9) {
        String str = bSHMethodDeclaration.name;
        Class<?> cls = bSHMethodDeclaration.returnType;
        String[] paramNames = bSHMethodDeclaration.paramsNode.getParamNames();
        BSHFormalParameters bSHFormalParameters = bSHMethodDeclaration.paramsNode;
        this(str, cls, paramNames, bSHFormalParameters.paramTypes, bSHFormalParameters.getParamModifiers(), bSHMethodDeclaration.blockNode, nameSpace, modifiers, bSHMethodDeclaration.isVarArgs);
        this.isScriptedObject = z9;
        this.isExtension = bSHMethodDeclaration.isExtension;
        this.receiverType = bSHMethodDeclaration.receiverType;
    }

    public BshMethod(Invocable invocable, Object obj) {
        this(invocable.getName(), invocable.getReturnType(), null, invocable.getParameterTypes(), null, null, null, null, invocable.isVarArgs());
        this.javaMethod = invocable;
        this.javaObject = obj;
    }

    public BshMethod(Method method, Object obj) {
        this(Invocable.get(method), obj);
    }

    public BshMethod(String str, Class<?>[] clsArr, MethodCallback methodCallback) {
        this(str, null, null, clsArr, null, null, null, null, false);
        this.methodCallback = methodCallback;
    }

    public Object invoke(Object[] objArr, Interpreter interpreter, CallStack callStack, Node node) {
        return invoke(objArr, interpreter, callStack, node, false);
    }

    public Object invoke(Object[] objArr, Interpreter interpreter) {
        return invoke(objArr, interpreter, null, null, false);
    }

    public Object invoke(Object[] objArr, Interpreter interpreter, CallStack callStack, Node node, boolean z9) {
        return invoke(objArr, interpreter, callStack, node, z9, null);
    }

    private Object invokeImpl(Object[] objArr, Interpreter interpreter, CallStack callStack, Node node, boolean z9) {
        return invokeImpl(objArr, interpreter, callStack, node, z9, null);
    }
}
