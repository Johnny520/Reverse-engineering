package bsh;

import androidx.activity.AbstractC0053;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class DelayedEvalBshMethod extends BshMethod {
    private static final long serialVersionUID = 1;
    private BSHArguments argsNode;
    transient CallStack callstack;
    private AbstractC2625 constructor;
    private Object[] constructorArgs;
    transient Interpreter interpreter;
    String[] paramTypeDescriptors;
    BSHFormalParameters paramTypesNode;
    String returnTypeDescriptor;
    BSHReturnType returnTypeNode;

    public DelayedEvalBshMethod(String str, AbstractC2625 abstractC2625, NameSpace nameSpace) {
        this(str, BSHType.getTypeDescriptor(abstractC2625.mo5296()), null, new String[abstractC2625.mo5310()], abstractC2625.m5311(), null, new BSHBlock(0), nameSpace, null, abstractC2625.mo5314(), null, null);
        this.constructor = abstractC2625;
        this.modifiers = new Modifiers(5);
        getModifiers().addModifier("public");
        getParameterModifiers();
        nameSpace.setMethod(this);
        this.constructorArgs = This.CONTEXT_ARGS.get().remove(str);
    }

    @Override // bsh.BshMethod
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
        DelayedEvalBshMethod delayedEvalBshMethod = (DelayedEvalBshMethod) obj;
        if (!getName().equals(delayedEvalBshMethod.getName()) || getParameterCount() != delayedEvalBshMethod.getParameterCount() || (z = this.isExtension) != delayedEvalBshMethod.isExtension) {
            return false;
        }
        if ((z && !BshMethod.equal(this.receiverType, delayedEvalBshMethod.receiverType)) || this.isVarArgs != delayedEvalBshMethod.isVarArgs) {
            return false;
        }
        for (int i = 0; i < getParamTypeDescriptors().length; i++) {
            if (!BshMethod.equal(getParamTypeDescriptors()[i], delayedEvalBshMethod.getParamTypeDescriptors()[i])) {
                return false;
            }
        }
        return true;
    }

    public String getAltConstructor() {
        boolean z;
        if (this.constructor != null) {
            return "super";
        }
        if (this.methodBody.jjtGetNumChildren() == 0) {
            return null;
        }
        InterfaceC2619 interfaceC2619JjtGetChild = this.methodBody.jjtGetChild(0);
        while (true) {
            z = interfaceC2619JjtGetChild instanceof BSHMethodInvocation;
            if (z || interfaceC2619JjtGetChild.jjtGetNumChildren() <= 0) {
                break;
            }
            interfaceC2619JjtGetChild = interfaceC2619JjtGetChild.jjtGetChild(0);
        }
        if (z) {
            BSHMethodInvocation bSHMethodInvocation = (BSHMethodInvocation) interfaceC2619JjtGetChild;
            String str = bSHMethodInvocation.getNameNode().text;
            if (str.equals("super") || str.equals("this")) {
                this.argsNode = bSHMethodInvocation.getArgsNode();
                return str;
            }
        }
        return null;
    }

    public BSHArguments getArgsNode() {
        return this.argsNode;
    }

    public Object[] getConstructorArgs() {
        return this.constructorArgs;
    }

    public String[] getParamTypeDescriptors() {
        return this.paramTypeDescriptors;
    }

    @Override // bsh.BshMethod
    public Class<?>[] getParameterTypes() {
        AbstractC2625 abstractC2625 = this.constructor;
        if (abstractC2625 != null) {
            return abstractC2625.mo5309();
        }
        try {
            return this.paramTypesNode.eval(this.callstack, this.interpreter);
        } catch (EvalError e) {
            C2633.m5338("can't eval param types: ", e);
            return null;
        }
    }

    @Override // bsh.BshMethod
    public Class<?> getReturnType() {
        BSHReturnType bSHReturnType = this.returnTypeNode;
        if (bSHReturnType == null) {
            return null;
        }
        try {
            return bSHReturnType.evalReturnType(this.callstack, this.interpreter);
        } catch (EvalError e) {
            C2633.m5338("can't eval return type: ", e);
            return null;
        }
    }

    public String getReturnTypeDescriptor() {
        return this.returnTypeDescriptor;
    }

    @Override // bsh.BshMethod
    public int hashCode() {
        int iM141 = AbstractC0053.m141((getClass().hashCode() + getName().hashCode()) * 31, 31, this.isExtension);
        Class<?> cls = this.receiverType;
        int iHashCode = Boolean.hashCode(this.isVarArgs) + ((iM141 + (cls == null ? 0 : cls.hashCode())) * 31);
        String[] paramTypeDescriptors = getParamTypeDescriptors();
        int length = paramTypeDescriptors.length;
        for (int i = 0; i < length; i++) {
            String str = paramTypeDescriptors[i];
            iHashCode += (str == null ? 0 : str.hashCode()) + 3;
        }
        return getParameterCount() + iHashCode;
    }

    public DelayedEvalBshMethod(String str, String str2, BSHReturnType bSHReturnType, String[] strArr, String[] strArr2, BSHFormalParameters bSHFormalParameters, BSHBlock bSHBlock, NameSpace nameSpace, Modifiers modifiers, boolean z, CallStack callStack, Interpreter interpreter) {
        super(str, null, strArr, null, null, bSHBlock, nameSpace, modifiers, z);
        this.argsNode = null;
        this.constructor = null;
        this.constructorArgs = null;
        this.returnTypeDescriptor = str2;
        this.returnTypeNode = bSHReturnType;
        this.paramTypeDescriptors = strArr2;
        this.paramTypesNode = bSHFormalParameters;
        this.callstack = callStack;
        this.interpreter = interpreter;
    }
}
