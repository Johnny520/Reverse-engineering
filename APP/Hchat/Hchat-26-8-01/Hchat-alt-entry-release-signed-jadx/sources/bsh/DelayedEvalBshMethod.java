package bsh;

import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class DelayedEvalBshMethod extends BshMethod {
    private static final long serialVersionUID = 1;
    private BSHArguments argsNode;
    transient CallStack callstack;
    private Invocable constructor;
    private Object[] constructorArgs;
    transient Interpreter interpreter;
    String[] paramTypeDescriptors;
    BSHFormalParameters paramTypesNode;
    String returnTypeDescriptor;
    BSHReturnType returnTypeNode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DelayedEvalBshMethod(String str, Invocable invocable, NameSpace nameSpace) {
        this(str, invocable.getReturnTypeDescriptor(), null, new String[invocable.getParameterCount()], invocable.getParamTypeDescriptors(), null, new BSHBlock(0), nameSpace, null, invocable.isVarArgs(), null, null);
        this.constructor = invocable;
        this.modifiers = new Modifiers(5);
        getModifiers().addModifier("public");
        getParameterModifiers();
        nameSpace.setMethod(this);
        this.constructorArgs = This.CONTEXT_ARGS.get().remove(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.BshMethod
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
        DelayedEvalBshMethod delayedEvalBshMethod = (DelayedEvalBshMethod) obj;
        if (!getName().equals(delayedEvalBshMethod.getName()) || getParameterCount() != delayedEvalBshMethod.getParameterCount() || (z9 = this.isExtension) != delayedEvalBshMethod.isExtension) {
            return false;
        }
        if ((z9 && !BshMethod.equal(this.receiverType, delayedEvalBshMethod.receiverType)) || this.isVarArgs != delayedEvalBshMethod.isVarArgs) {
            return false;
        }
        for (int i9 = 0; i9 < getParamTypeDescriptors().length; i9++) {
            if (!BshMethod.equal(getParamTypeDescriptors()[i9], delayedEvalBshMethod.getParamTypeDescriptors()[i9])) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getAltConstructor() {
        boolean z9;
        if (this.constructor != null) {
            return "super";
        }
        if (this.methodBody.jjtGetNumChildren() == 0) {
            return null;
        }
        Node nodeJjtGetChild = this.methodBody.jjtGetChild(0);
        while (true) {
            z9 = nodeJjtGetChild instanceof BSHMethodInvocation;
            if (z9 || nodeJjtGetChild.jjtGetNumChildren() <= 0) {
                break;
            }
            nodeJjtGetChild = nodeJjtGetChild.jjtGetChild(0);
        }
        if (z9) {
            BSHMethodInvocation bSHMethodInvocation = (BSHMethodInvocation) nodeJjtGetChild;
            String str = bSHMethodInvocation.getNameNode().text;
            if (str.equals("super") || str.equals("this")) {
                this.argsNode = bSHMethodInvocation.getArgsNode();
                return str;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHArguments getArgsNode() {
        return this.argsNode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object[] getConstructorArgs() {
        return this.constructorArgs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String[] getParamTypeDescriptors() {
        return this.paramTypeDescriptors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.BshMethod
    public Class<?>[] getParameterTypes() {
        Invocable invocable = this.constructor;
        if (invocable != null) {
            return invocable.getParameterTypes();
        }
        try {
            return this.paramTypesNode.eval(this.callstack, this.interpreter);
        } catch (EvalError e6) {
            C0353j.m1306d("can't eval param types: ", e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.BshMethod
    public Class<?> getReturnType() {
        BSHReturnType bSHReturnType = this.returnTypeNode;
        if (bSHReturnType == null) {
            return null;
        }
        try {
            return bSHReturnType.evalReturnType(this.callstack, this.interpreter);
        } catch (EvalError e6) {
            C0353j.m1306d("can't eval return type: ", e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getReturnTypeDescriptor() {
        return this.returnTypeDescriptor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.BshMethod
    public int hashCode() {
        int iM2245h = AbstractC0921a.m2245h((getClass().hashCode() + getName().hashCode()) * 31, 31, this.isExtension);
        Class<?> cls = this.receiverType;
        int iHashCode = Boolean.hashCode(this.isVarArgs) + ((iM2245h + (cls == null ? 0 : cls.hashCode())) * 31);
        String[] paramTypeDescriptors = getParamTypeDescriptors();
        int length = paramTypeDescriptors.length;
        for (int i9 = 0; i9 < length; i9++) {
            String str = paramTypeDescriptors[i9];
            iHashCode += (str == null ? 0 : str.hashCode()) + 3;
        }
        return getParameterCount() + iHashCode;
    }

    public DelayedEvalBshMethod(String str, String str2, BSHReturnType bSHReturnType, String[] strArr, String[] strArr2, BSHFormalParameters bSHFormalParameters, BSHBlock bSHBlock, NameSpace nameSpace, Modifiers modifiers, boolean z9, CallStack callStack, Interpreter interpreter) {
        super(str, null, strArr, null, null, bSHBlock, nameSpace, modifiers, z9);
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
