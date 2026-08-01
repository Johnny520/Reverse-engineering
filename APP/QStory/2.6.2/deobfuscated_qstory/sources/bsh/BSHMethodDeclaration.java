package bsh;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class BSHMethodDeclaration extends SimpleNode {
    BSHBlock blockNode;
    int firstThrowsClause;
    boolean isExtension;
    private boolean isScriptedObject;
    boolean isVarArgs;
    public Modifiers modifiers;
    public String name;
    int numThrows;
    BSHFormalParameters paramsNode;
    String receiverText;
    Class<?> receiverType;
    Class<?> returnType;
    BSHReturnType returnTypeNode;

    public BSHMethodDeclaration(int i) {
        super(i);
        this.modifiers = new Modifiers(2);
        this.numThrows = 0;
    }

    private void evalNodes(CallStack callStack, Interpreter interpreter) throws EvalException {
        insureNodesParsed();
        for (int i = this.firstThrowsClause; i < this.numThrows + this.firstThrowsClause; i++) {
            ((BSHAmbiguousName) jjtGetChild(i)).toClass(callStack, interpreter);
        }
        this.paramsNode.eval(callStack, interpreter);
        if (!interpreter.getStrictJava()) {
            return;
        }
        int i2 = 0;
        while (true) {
            Class<?>[] clsArr = this.paramsNode.paramTypes;
            if (i2 >= clsArr.length) {
                if (this.returnType != null) {
                    return;
                }
                throw new EvalException("(Strict Java Mode) Undeclared return type for method: " + this.name, this, null);
            }
            if (clsArr[i2] == null) {
                throw new EvalException("(Strict Java Mode) Undeclared argument type, parameter: " + this.paramsNode.getParamNames()[i2] + " in method: " + this.name, this, null);
            }
            i2++;
        }
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalException {
        this.returnType = evalReturnType(callStack, interpreter);
        this.receiverType = evalReceiverType(callStack, interpreter);
        evalNodes(callStack, interpreter);
        NameSpace pVar = callStack.top();
        BshMethod bshMethod = new BshMethod(this, pVar, this.modifiers, this.isScriptedObject);
        boolean z = pVar.isMethod;
        if (!z && !pVar.isClass) {
            interpreter.getClassManager().mo5090(bshMethod);
        } else if (z && !this.paramsNode.isListener()) {
            interpreter.getClassManager().mo5090(this.paramsNode);
            this.paramsNode.setListener(true);
        }
        pVar.setMethod(bshMethod);
        return Primitive.VOID;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0093 A[Catch: UtilEvalError -> 0x0022, TryCatch #0 {UtilEvalError -> 0x0022, blocks: (B:7:0x000d, B:9:0x0015, B:12:0x0025, B:13:0x0029, B:39:0x0085, B:44:0x0093, B:46:0x009e, B:47:0x00b4, B:15:0x002d, B:17:0x0035, B:18:0x0038, B:20:0x0040, B:21:0x0043, B:23:0x004b, B:24:0x004e, B:26:0x0056, B:27:0x0059, B:29:0x0061, B:30:0x0064, B:32:0x006c, B:33:0x006f, B:35:0x0077, B:36:0x007a, B:38:0x0082), top: B:52:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Class<?> evalReceiverType(bsh.CallStack r4, bsh.Interpreter r5) throws bsh.EvalError {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.BSHMethodDeclaration.evalReceiverType(bsh.CallStack, bsh.Interpreter):java.lang.Class");
    }

    public Class<?> evalReturnType(CallStack callStack, Interpreter interpreter) {
        insureNodesParsed();
        BSHReturnType bSHReturnType = this.returnTypeNode;
        if (bSHReturnType != null) {
            return bSHReturnType.evalReturnType(callStack, interpreter);
        }
        return null;
    }

    public String getReturnTypeDescriptor(CallStack callStack, Interpreter interpreter, String str) {
        insureNodesParsed();
        BSHReturnType bSHReturnType = this.returnTypeNode;
        if (bSHReturnType == null) {
            return null;
        }
        return bSHReturnType.getTypeDescriptor(callStack, interpreter, str);
    }

    public BSHReturnType getReturnTypeNode() {
        insureNodesParsed();
        return this.returnTypeNode;
    }

    public synchronized void insureNodesParsed() {
        int i;
        try {
            if (this.paramsNode != null) {
                return;
            }
            InterfaceC2618 interfaceC2618JjtGetChild = jjtGetChild(0);
            if (interfaceC2618JjtGetChild instanceof BSHReturnType) {
                this.returnTypeNode = (BSHReturnType) interfaceC2618JjtGetChild;
                interfaceC2618JjtGetChild = jjtGetChild(1);
                i = 1;
            } else {
                i = 0;
            }
            if (interfaceC2618JjtGetChild instanceof BSHAmbiguousName) {
                String str = ((BSHAmbiguousName) interfaceC2618JjtGetChild).text;
                int iLastIndexOf = str.lastIndexOf(46);
                if (iLastIndexOf >= 0) {
                    this.isExtension = true;
                    this.receiverText = str.substring(0, iLastIndexOf);
                    this.name = str.substring(iLastIndexOf + 1);
                } else {
                    this.isExtension = false;
                    this.receiverText = null;
                    this.name = str;
                }
                i++;
            }
            this.paramsNode = (BSHFormalParameters) jjtGetChild(i);
            int i2 = i + 1;
            this.firstThrowsClause = i2;
            int iJjtGetNumChildren = jjtGetNumChildren();
            int i3 = this.numThrows;
            if (iJjtGetNumChildren > i2 + i3) {
                this.blockNode = (BSHBlock) jjtGetChild(i2 + i3);
            }
            BSHBlock bSHBlock = this.blockNode;
            if (bSHBlock != null && bSHBlock.jjtGetNumChildren() > 0) {
                BSHBlock bSHBlock2 = this.blockNode;
                InterfaceC2618 interfaceC2618JjtGetChild2 = bSHBlock2.jjtGetChild(bSHBlock2.jjtGetNumChildren() - 1);
                if (interfaceC2618JjtGetChild2 instanceof BSHReturnStatement) {
                    while (interfaceC2618JjtGetChild2.hasNext()) {
                        interfaceC2618JjtGetChild2 = (InterfaceC2618) interfaceC2618JjtGetChild2.next();
                        if (interfaceC2618JjtGetChild2 instanceof BSHAmbiguousName) {
                            this.isScriptedObject = ((BSHAmbiguousName) interfaceC2618JjtGetChild2).text.startsWith("this");
                        }
                    }
                }
            }
            this.paramsNode.insureParsed();
            this.isVarArgs = this.paramsNode.isVarArgs;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.name;
    }
}
