package bsh;

import androidx.activity.AbstractC0900;
import bsh.This;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.stream.IntStream;
import p297.C9201;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class BshMethod implements Serializable, Cloneable, InterfaceC3490 {
    private static final long serialVersionUID = 1;
    private Class<?>[] cparamTypes;
    private Class<?> creturnType;
    NameSpace declaringNameSpace;
    protected boolean isExtension;
    protected boolean isScriptedObject;
    protected boolean isVarArgs;
    private AbstractC3458 javaMethod;
    private Object javaObject;
    protected BSHBlock methodBody;
    private transient InterfaceC3487 methodCallback;
    Modifiers modifiers;
    private String name;
    private int paramCount;
    private Modifiers[] paramModifiers;
    private String[] paramNames;
    protected Class<?> receiverType;
    private boolean reload;

    public BshMethod(String str, Class<?> cls, String[] strArr, Class<?>[] clsArr, Modifiers[] modifiersArr, BSHBlock bSHBlock, NameSpace nameSpace, Modifiers modifiers, boolean z) {
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
        this.isVarArgs = z;
    }

    public static boolean equal(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Object invokeImpl(Object[] objArr, Interpreter interpreter, CallStack callStack, InterfaceC3452 interfaceC3452, boolean z, Object obj) throws EvalError {
        NameSpace nameSpace;
        Object objNewInstance;
        C3501 c3501;
        This thisM5998;
        Object obj2;
        CallStack callStack2 = callStack;
        InterfaceC3452 interfaceC34522 = interfaceC3452;
        if (hasModifier("abstract")) {
            throw new EvalError("Cannot invoke abstract method " + this.name, interfaceC34522, callStack2);
        }
        Class<?> returnType = getReturnType();
        Class<?>[] parameterTypes = getParameterTypes();
        if (callStack2 == null) {
            callStack2 = new CallStack(this.declaringNameSpace);
        }
        CallStack callStack3 = callStack2;
        Object[] objArr2 = objArr == null ? AbstractC3500.f8347 : objArr;
        if (!isVarArgs() && objArr2.length != getParameterCount()) {
            throw new EvalError("Wrong number of arguments for local method: " + this.name, interfaceC34522, callStack3);
        }
        int i = 1;
        if (z) {
            nameSpace = callStack3.top();
        } else {
            nameSpace = new NameSpace(this.declaringNameSpace, this.name);
            nameSpace.isMethod = true;
        }
        int i2 = 0;
        if (this.isExtension && obj != null) {
            nameSpace.importObject(Primitive.unwrap(obj));
            try {
                nameSpace.setLocalVariable("" + This.Keys.BSHEXTENSIONMETHODRECEIVER, obj, false);
            } catch (UtilEvalError unused) {
            }
        }
        nameSpace.setNode(interfaceC34522);
        int parameterCount = getParameterCount() - 1;
        if (isVarArgs()) {
            objNewInstance = (!(getParameterCount() == objArr2.length && ((obj2 = objArr2[parameterCount]) == null || (obj2.getClass().isArray() && parameterTypes[parameterCount].getComponentType().isAssignableFrom(objArr2[parameterCount].getClass().getComponentType())))) && objArr2.length >= getParameterCount() - 1) ? Array.newInstance(parameterTypes[parameterCount].getComponentType(), objArr2.length - parameterCount) : null;
        }
        while (i2 < objArr2.length) {
            int i3 = i2 >= parameterCount ? parameterCount : i2;
            Class<?> componentType = (objNewInstance == null || i3 != parameterCount) ? parameterTypes[i3] : parameterTypes[i3].getComponentType();
            if (componentType != null) {
                try {
                    Object objM5933 = AbstractC3495.m5933(objArr2[i2], componentType, i);
                    objArr2[i2] = objM5933;
                    if (objNewInstance == null || i2 < parameterCount) {
                        nameSpace.setTypedVariable(this.paramNames[i3], componentType, objM5933, this.paramModifiers[i3]);
                    } else {
                        try {
                            Array.set(objNewInstance, i2 - i3, Primitive.unwrap(objM5933));
                        } catch (UtilEvalError e) {
                            throw e.toEvalError("Typed method parameter assignment", interfaceC34522, callStack3);
                        }
                    }
                } catch (UtilEvalError e2) {
                    throw new EvalError("Invalid argument: `" + this.paramNames[i3] + "' for method: " + this.name + " : " + e2.getMessage(), interfaceC34522, callStack3);
                }
            } else {
                Object obj3 = objArr2[i2];
                if (obj3 == Primitive.VOID) {
                    throw new EvalError("Undefined variable or class name, parameter: " + this.paramNames[i3] + " to method: " + this.name, interfaceC34522, callStack3);
                }
                try {
                    nameSpace.setLocalVariable(this.paramNames[i3], obj3, interpreter.getStrictJava());
                } catch (UtilEvalError e3) {
                    throw e3.toEvalError("Typed method parameter assignment", interfaceC34522, callStack3);
                }
            }
            i2++;
            i = 1;
        }
        if (objNewInstance != null) {
            try {
                nameSpace.setTypedVariable(this.paramNames[parameterCount], parameterTypes[parameterCount], objNewInstance, this.paramModifiers[parameterCount]);
            } catch (UtilEvalError e4) {
                throw e4.toEvalError("Typed method parameter assignment", interfaceC34522, callStack3);
            }
        }
        if (!z) {
            callStack3.push(nameSpace);
        }
        try {
            Object objEval = this.methodBody.eval(callStack3, interpreter, Boolean.TRUE);
            CallStack callStackCopy = callStack3.copy();
            boolean z2 = objEval instanceof C3501;
            Class<?> cls = Void.TYPE;
            if (z2) {
                c3501 = (C3501) objEval;
                InterfaceC3452 interfaceC34523 = c3501.f8348;
                if (c3501.f8351 != 47) {
                    throw new EvalException("'continue' or 'break' in method body", interfaceC34523, callStackCopy);
                }
                Object obj4 = c3501.f8350;
                if (returnType == cls && obj4 != Primitive.VOID) {
                    throw new EvalException("Cannot return value from void method", interfaceC34523, callStackCopy);
                }
                objEval = obj4;
            } else {
                c3501 = null;
            }
            if (returnType != null) {
                if (returnType == cls) {
                    return Primitive.VOID;
                }
                try {
                    objEval = AbstractC3495.m5933(objEval, returnType, 1);
                } catch (UtilEvalError e5) {
                    if (c3501 != null) {
                        interfaceC34522 = c3501.f8348;
                    }
                    throw e5.toEvalError("Incorrect type returned from method: " + this.name + e5.getMessage(), interfaceC34522, callStack3);
                }
            }
            return (!"clone".equals(getName()) || (thisM5998 = AbstractC3500.m5998(objEval, objEval.getClass().getSimpleName())) == null) ? objEval : thisM5998.cloneMethodImpl(interfaceC34522, callStack3, objEval);
        } finally {
            if (!z) {
                callStack3.pop();
            }
        }
    }

    private Object invokeMethodCallback(Object[] objArr, InterfaceC3452 interfaceC3452, CallStack callStack) throws EvalError {
        if (objArr == null) {
            objArr = AbstractC3500.f8347;
        }
        Class<?>[] parameterTypes = getParameterTypes();
        if (parameterTypes == null || parameterTypes.length == 0) {
            throw null;
        }
        String[] parameterNames = getParameterNames();
        for (int i = 0; i < objArr.length; i++) {
            Class<?> cls = parameterTypes[i];
            if (cls != null) {
                try {
                    objArr[i] = Primitive.unwrap(AbstractC3495.m5933(objArr[i], cls, 1));
                } catch (UtilEvalError e) {
                    throw new EvalError("Invalid argument: `" + parameterNames[i] + "' for method: " + this.name + " : " + e.getMessage(), interfaceC3452, callStack);
                }
            }
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getParameterNames$0(Integer num) {
        return String.valueOf((char) num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] lambda$getParameterNames$1(int i) {
        return new String[i];
    }

    private void reloadTypes() {
        if (!this.reload) {
            return;
        }
        int i = 0;
        try {
            this.reload = false;
            if (AbstractC3500.m5992(this.creturnType)) {
                this.creturnType = this.declaringNameSpace.getClass(this.creturnType.getName());
            }
            while (true) {
                Class<?>[] clsArr = this.cparamTypes;
                if (i >= clsArr.length) {
                    return;
                }
                if (AbstractC3500.m5992(clsArr[i])) {
                    Class<?>[] clsArr2 = this.cparamTypes;
                    clsArr2[i] = this.declaringNameSpace.getClass(clsArr2[i].getName());
                }
                i++;
            }
        } catch (UtilEvalError unused) {
        }
    }

    @Override // bsh.InterfaceC3490
    public void classLoaderChanged() {
        this.reload = AbstractC3500.m5992(this.creturnType) || Arrays.asList(this.cparamTypes).stream().anyMatch(new C3475(2));
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public BshMethod m5679clone() {
        try {
            return (BshMethod) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        boolean z;
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
        if (!this.name.equals(bshMethod.name) || getParameterCount() != bshMethod.getParameterCount() || (z = this.isExtension) != bshMethod.isExtension) {
            return false;
        }
        if (z && !equal(this.receiverType, bshMethod.receiverType)) {
            return false;
        }
        for (int i = 0; i < getParameterCount(); i++) {
            if (!equal(getParameterTypes()[i], bshMethod.getParameterTypes()[i])) {
                return false;
            }
        }
        return true;
    }

    public Modifiers getModifiers() {
        if (this.modifiers == null) {
            this.modifiers = new Modifiers(2);
        }
        return this.modifiers;
    }

    public String getName() {
        AbstractC3458 abstractC3458 = this.javaMethod;
        return abstractC3458 == null ? this.name : abstractC3458.f8225;
    }

    public int getParameterCount() {
        AbstractC3458 abstractC3458 = this.javaMethod;
        return abstractC3458 == null ? this.paramCount : abstractC3458.mo5870();
    }

    public Modifiers[] getParameterModifiers() {
        if (this.paramModifiers == null) {
            this.paramModifiers = new Modifiers[getParameterCount()];
        }
        return this.paramModifiers;
    }

    public String[] getParameterNames() {
        if (this.paramNames == null) {
            this.paramNames = (String[]) IntStream.range(97, getParameterCount() + 97).boxed().map(new C3474(3)).toArray(new C3483(0));
        }
        return this.paramNames;
    }

    public Class<?>[] getParameterTypes() {
        AbstractC3458 abstractC3458 = this.javaMethod;
        if (abstractC3458 != null) {
            return abstractC3458.mo5869();
        }
        reloadTypes();
        return this.cparamTypes;
    }

    public Class<?> getReturnType() {
        AbstractC3458 abstractC3458 = this.javaMethod;
        if (abstractC3458 != null) {
            return abstractC3458.mo5856();
        }
        reloadTypes();
        return this.creturnType;
    }

    public boolean hasModifier(String str) {
        AbstractC3458 abstractC3458 = this.javaMethod;
        if (abstractC3458 == null) {
            Modifiers modifiers = this.modifiers;
            return modifiers != null && modifiers.hasModifier(str);
        }
        int i = abstractC3458.f8229;
        Object[] objArr = AbstractC3500.f8347;
        return Modifier.toString(i).contains(str);
    }

    public int hashCode() {
        int iM701 = AbstractC0900.m701((getClass().hashCode() + this.name.hashCode()) * 31, 31, this.isExtension);
        Class<?> cls = this.receiverType;
        int iHashCode = iM701 + (cls == null ? 0 : cls.hashCode());
        Class<?>[] parameterTypes = getParameterTypes();
        int length = parameterTypes.length;
        for (int i = 0; i < length; i++) {
            Class<?> cls2 = parameterTypes[i];
            iHashCode += (cls2 == null ? 0 : cls2.hashCode()) + 3;
        }
        return getParameterCount() + iHashCode;
    }

    public Object invoke(Object[] objArr, Interpreter interpreter, CallStack callStack, InterfaceC3452 interfaceC3452, boolean z, Object obj) throws EvalError {
        Object classInstance;
        Object objInvokeImpl;
        Interpreter.debug("Bsh method invoke: ", this.name, " overrideNameSpace: ", Boolean.valueOf(z));
        if (objArr != null) {
            for (Object obj2 : objArr) {
                if (obj2 == null) {
                    throw new Error("HERE!");
                }
            }
        }
        AbstractC3458 abstractC3458 = this.javaMethod;
        if (abstractC3458 == null) {
            Modifiers modifiers = this.modifiers;
            if (modifiers == null || !modifiers.hasModifier("synchronized")) {
                return invokeImpl(objArr, interpreter, callStack, interfaceC3452, z, obj);
            }
            NameSpace nameSpace = this.declaringNameSpace;
            if (nameSpace.isClass) {
                try {
                    classInstance = nameSpace.getClassInstance();
                } catch (UtilEvalError unused) {
                    C3466.m5902("Can't get class instance for synchronized method.");
                    return null;
                }
            } else {
                classInstance = nameSpace.getThis(interpreter);
            }
            synchronized (classInstance) {
                objInvokeImpl = invokeImpl(objArr, interpreter, callStack, interfaceC3452, z, obj);
            }
            return objInvokeImpl;
        }
        try {
            Object[] objArr2 = AbstractC3500.f8347;
            if (Modifier.isStatic(abstractC3458.getModifiers())) {
                C9201 c9201 = Interpreter.mainSecurityGuard;
                AbstractC3458 abstractC34582 = this.javaMethod;
                c9201.m14431(abstractC34582.f8230, abstractC34582.f8225, objArr);
            } else {
                Interpreter.mainSecurityGuard.m14432(this.javaObject, this.javaMethod.f8225, objArr);
            }
            return this.javaMethod.mo5877(this.javaObject, objArr);
        } catch (ReflectError e) {
            throw new EvalError("Error invoking Java method: " + e, interfaceC3452, callStack);
        } catch (UtilEvalError e2) {
            throw e2.toEvalError(interfaceC3452, callStack);
        } catch (InvocationTargetException e3) {
            throw new TargetError("Exception invoking imported object method.", e3, interfaceC3452, callStack, true);
        }
    }

    public boolean isVarArgs() {
        AbstractC3458 abstractC3458 = this.javaMethod;
        return abstractC3458 == null ? this.isVarArgs : abstractC3458.mo5874();
    }

    public String toString() {
        return "Method: ".concat(AbstractC3462.m5890(this));
    }

    public BshMethod(Method method, Object obj) {
        this(new C3453(method), obj);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BshMethod(BSHMethodDeclaration bSHMethodDeclaration, NameSpace nameSpace, Modifiers modifiers, boolean z) {
        String str = bSHMethodDeclaration.name;
        Class<?> cls = bSHMethodDeclaration.returnType;
        String[] paramNames = bSHMethodDeclaration.paramsNode.getParamNames();
        BSHFormalParameters bSHFormalParameters = bSHMethodDeclaration.paramsNode;
        this(str, cls, paramNames, bSHFormalParameters.paramTypes, bSHFormalParameters.getParamModifiers(), bSHMethodDeclaration.blockNode, nameSpace, modifiers, bSHMethodDeclaration.isVarArgs);
        this.isScriptedObject = z;
        this.isExtension = bSHMethodDeclaration.isExtension;
        this.receiverType = bSHMethodDeclaration.receiverType;
    }

    public BshMethod(AbstractC3458 abstractC3458, Object obj) {
        this(abstractC3458.f8225, abstractC3458.mo5856(), null, abstractC3458.mo5869(), null, null, null, null, abstractC3458.mo5874());
        this.javaMethod = abstractC3458;
        this.javaObject = obj;
    }

    public BshMethod(String str, Class<?>[] clsArr, InterfaceC3487 interfaceC3487) {
        this(str, null, null, clsArr, null, null, null, null, false);
    }

    public Object invoke(Object[] objArr, Interpreter interpreter, CallStack callStack, InterfaceC3452 interfaceC3452) {
        return invoke(objArr, interpreter, callStack, interfaceC3452, false);
    }

    public Object invoke(Object[] objArr, Interpreter interpreter) {
        return invoke(objArr, interpreter, null, null, false);
    }

    public Object invoke(Object[] objArr, Interpreter interpreter, CallStack callStack, InterfaceC3452 interfaceC3452, boolean z) {
        return invoke(objArr, interpreter, callStack, interfaceC3452, z, null);
    }

    private Object invokeImpl(Object[] objArr, Interpreter interpreter, CallStack callStack, InterfaceC3452 interfaceC3452, boolean z) {
        return invokeImpl(objArr, interpreter, callStack, interfaceC3452, z, null);
    }
}
