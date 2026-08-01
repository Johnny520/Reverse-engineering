package bsh;

import androidx.activity.AbstractC0053;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.stream.IntStream;
import p281.C8371;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class BshMethod implements Serializable, Cloneable, InterfaceC2656 {
    private static final long serialVersionUID = 1;
    private Class<?>[] cparamTypes;
    private Class<?> creturnType;
    NameSpace declaringNameSpace;
    protected boolean isExtension;
    protected boolean isScriptedObject;
    protected boolean isVarArgs;
    private AbstractC2624 javaMethod;
    private Object javaObject;
    protected BSHBlock methodBody;
    private transient InterfaceC2653 methodCallback;
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
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Object invokeImpl(java.lang.Object[] r17, bsh.Interpreter r18, bsh.CallStack r19, bsh.InterfaceC2618 r20, boolean r21, java.lang.Object r22) throws bsh.EvalError {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.BshMethod.invokeImpl(java.lang.Object[], bsh.Interpreter, bsh.CallStack, bsh.飘花落叶言子世兰苏楪哲, boolean, java.lang.Object):java.lang.Object");
    }

    private Object invokeMethodCallback(Object[] objArr, InterfaceC2618 interfaceC2618, CallStack callStack) throws EvalError {
        if (objArr == null) {
            objArr = AbstractC2666.f8000;
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
                    objArr[i] = Primitive.unwrap(AbstractC2661.m5328(objArr[i], cls, 1));
                } catch (UtilEvalError e) {
                    throw new EvalError("Invalid argument: `" + parameterNames[i] + "' for method: " + this.name + " : " + e.getMessage(), interfaceC2618, callStack);
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
            if (AbstractC2666.m5387(this.creturnType)) {
                this.creturnType = this.declaringNameSpace.getClass(this.creturnType.getName());
            }
            while (true) {
                Class<?>[] clsArr = this.cparamTypes;
                if (i >= clsArr.length) {
                    return;
                }
                if (AbstractC2666.m5387(clsArr[i])) {
                    Class<?>[] clsArr2 = this.cparamTypes;
                    clsArr2[i] = this.declaringNameSpace.getClass(clsArr2[i].getName());
                }
                i++;
            }
        } catch (UtilEvalError unused) {
        }
    }

    @Override // bsh.InterfaceC2656
    public void classLoaderChanged() {
        this.reload = AbstractC2666.m5387(this.creturnType) || Arrays.asList(this.cparamTypes).stream().anyMatch(new C2641(2));
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public BshMethod m5074clone() {
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
        AbstractC2624 abstractC2624 = this.javaMethod;
        return abstractC2624 == null ? this.name : abstractC2624.f7878;
    }

    public int getParameterCount() {
        AbstractC2624 abstractC2624 = this.javaMethod;
        return abstractC2624 == null ? this.paramCount : abstractC2624.mo5265();
    }

    public Modifiers[] getParameterModifiers() {
        if (this.paramModifiers == null) {
            this.paramModifiers = new Modifiers[getParameterCount()];
        }
        return this.paramModifiers;
    }

    public String[] getParameterNames() {
        if (this.paramNames == null) {
            this.paramNames = (String[]) IntStream.range(97, getParameterCount() + 97).boxed().map(new C2640(3)).toArray(new C2649(0));
        }
        return this.paramNames;
    }

    public Class<?>[] getParameterTypes() {
        AbstractC2624 abstractC2624 = this.javaMethod;
        if (abstractC2624 != null) {
            return abstractC2624.mo5264();
        }
        reloadTypes();
        return this.cparamTypes;
    }

    public Class<?> getReturnType() {
        AbstractC2624 abstractC2624 = this.javaMethod;
        if (abstractC2624 != null) {
            return abstractC2624.mo5251();
        }
        reloadTypes();
        return this.creturnType;
    }

    public boolean hasModifier(String str) {
        AbstractC2624 abstractC2624 = this.javaMethod;
        if (abstractC2624 == null) {
            Modifiers modifiers = this.modifiers;
            return modifiers != null && modifiers.hasModifier(str);
        }
        int i = abstractC2624.f7882;
        Object[] objArr = AbstractC2666.f8000;
        return Modifier.toString(i).contains(str);
    }

    public int hashCode() {
        int iM140 = AbstractC0053.m140((getClass().hashCode() + this.name.hashCode()) * 31, 31, this.isExtension);
        Class<?> cls = this.receiverType;
        int iHashCode = iM140 + (cls == null ? 0 : cls.hashCode());
        Class<?>[] parameterTypes = getParameterTypes();
        int length = parameterTypes.length;
        for (int i = 0; i < length; i++) {
            Class<?> cls2 = parameterTypes[i];
            iHashCode += (cls2 == null ? 0 : cls2.hashCode()) + 3;
        }
        return getParameterCount() + iHashCode;
    }

    public Object invoke(Object[] objArr, Interpreter interpreter, CallStack callStack, InterfaceC2618 interfaceC2618, boolean z, Object obj) throws EvalError {
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
        AbstractC2624 abstractC2624 = this.javaMethod;
        if (abstractC2624 == null) {
            Modifiers modifiers = this.modifiers;
            if (modifiers == null || !modifiers.hasModifier("synchronized")) {
                return invokeImpl(objArr, interpreter, callStack, interfaceC2618, z, obj);
            }
            NameSpace nameSpace = this.declaringNameSpace;
            if (nameSpace.isClass) {
                try {
                    classInstance = nameSpace.getClassInstance();
                } catch (UtilEvalError unused) {
                    C2632.m5297("Can't get class instance for synchronized method.");
                    return null;
                }
            } else {
                classInstance = nameSpace.getThis(interpreter);
            }
            synchronized (classInstance) {
                objInvokeImpl = invokeImpl(objArr, interpreter, callStack, interfaceC2618, z, obj);
            }
            return objInvokeImpl;
        }
        try {
            Object[] objArr2 = AbstractC2666.f8000;
            if (Modifier.isStatic(abstractC2624.getModifiers())) {
                C8371 c8371 = Interpreter.mainSecurityGuard;
                AbstractC2624 abstractC26242 = this.javaMethod;
                c8371.m13855(abstractC26242.f7883, abstractC26242.f7878, objArr);
            } else {
                Interpreter.mainSecurityGuard.m13856(this.javaObject, this.javaMethod.f7878, objArr);
            }
            return this.javaMethod.mo5272(this.javaObject, objArr);
        } catch (ReflectError e) {
            throw new EvalError("Error invoking Java method: " + e, interfaceC2618, callStack);
        } catch (UtilEvalError e2) {
            throw e2.toEvalError(interfaceC2618, callStack);
        } catch (InvocationTargetException e3) {
            throw new TargetError("Exception invoking imported object method.", e3, interfaceC2618, callStack, true);
        }
    }

    public boolean isVarArgs() {
        AbstractC2624 abstractC2624 = this.javaMethod;
        return abstractC2624 == null ? this.isVarArgs : abstractC2624.mo5269();
    }

    public String toString() {
        return "Method: ".concat(AbstractC2628.m5285(this));
    }

    public BshMethod(Method method, Object obj) {
        this(new C2619(method), obj);
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

    public BshMethod(AbstractC2624 abstractC2624, Object obj) {
        this(abstractC2624.f7878, abstractC2624.mo5251(), null, abstractC2624.mo5264(), null, null, null, null, abstractC2624.mo5269());
        this.javaMethod = abstractC2624;
        this.javaObject = obj;
    }

    public BshMethod(String str, Class<?>[] clsArr, InterfaceC2653 interfaceC2653) {
        this(str, null, null, clsArr, null, null, null, null, false);
    }

    public Object invoke(Object[] objArr, Interpreter interpreter, CallStack callStack, InterfaceC2618 interfaceC2618) {
        return invoke(objArr, interpreter, callStack, interfaceC2618, false);
    }

    public Object invoke(Object[] objArr, Interpreter interpreter) {
        return invoke(objArr, interpreter, null, null, false);
    }

    public Object invoke(Object[] objArr, Interpreter interpreter, CallStack callStack, InterfaceC2618 interfaceC2618, boolean z) {
        return invoke(objArr, interpreter, callStack, interfaceC2618, z, null);
    }

    private Object invokeImpl(Object[] objArr, Interpreter interpreter, CallStack callStack, InterfaceC2618 interfaceC2618, boolean z) {
        return invokeImpl(objArr, interpreter, callStack, interfaceC2618, z, null);
    }
}
