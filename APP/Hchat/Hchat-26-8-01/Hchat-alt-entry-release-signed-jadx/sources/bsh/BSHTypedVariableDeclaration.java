package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHTypedVariableDeclaration extends SimpleNode {
    private static final long serialVersionUID = 1;
    private BSHVariableDeclarator[] bvda;
    public Modifiers modifiers;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHTypedVariableDeclaration(int i9) {
        super(i9);
        this.modifiers = new Modifiers(3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private BSHType getTypeNode() {
        return (BSHType) jjtGetChild(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isValType(BSHType bSHType) {
        Node typeNode = bSHType.getTypeNode();
        return (typeNode instanceof BSHAmbiguousName) && "val".equals(((BSHAmbiguousName) typeNode).text);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c7 A[Catch: EvalError -> 0x002a, UtilEvalError -> 0x005b, TRY_LEAVE, TryCatch #1 {UtilEvalError -> 0x005b, blocks: (B:14:0x003d, B:16:0x0041, B:19:0x0047, B:25:0x0075, B:27:0x0079, B:39:0x00c3, B:41:0x00c7, B:29:0x008d, B:31:0x0093, B:33:0x0097, B:35:0x00a0, B:36:0x00aa, B:38:0x00b5, B:22:0x005e), top: B:52:0x003d, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce  */
    @Override // bsh.SimpleNode, bsh.Node
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalError {
        LHS lhs;
        Object variable = Primitive.VOID;
        try {
            NameSpace pVar = callStack.top();
            BSHType typeNode = getTypeNode();
            Class<?> type = typeNode.getType(callStack, interpreter);
            if (isValType(typeNode) && !this.modifiers.hasModifier("final")) {
                this.modifiers.addModifier("final");
            }
            for (BSHVariableDeclarator bSHVariableDeclarator : getDeclarators()) {
                Object objEval = bSHVariableDeclarator.eval(typeNode, this.modifiers, callStack, interpreter);
                try {
                    if (pVar.isClass) {
                        Object obj = pVar.classInstance;
                        if (obj != null) {
                            lhs = new LHS(obj, Reflect.resolveJavaField(pVar.classStatic, bSHVariableDeclarator.name, this.modifiers.hasModifier("static")));
                        } else {
                            Class<?> cls = pVar.classStatic;
                            lhs = new LHS((Object) cls, Reflect.resolveJavaField(cls, bSHVariableDeclarator.name, this.modifiers.hasModifier("static")));
                        }
                    } else {
                        lhs = null;
                    }
                    if (lhs == null || lhs.field == null) {
                        if (interpreter.getStrictJava() && (objEval instanceof Primitive) && ((Primitive) objEval).isNumber()) {
                            objEval = Primitive.castNumberStrictJava(type, ((Primitive) objEval).numberValue());
                        }
                        pVar.setTypedVariable(bSHVariableDeclarator.name, type, objEval, this.modifiers);
                        if (!pVar.isMethod) {
                            interpreter.getClassManager().addListener(pVar.getVariableImpl(bSHVariableDeclarator.name, false));
                        }
                        variable = pVar.isClass ? pVar.getVariable(bSHVariableDeclarator.name) : objEval;
                    } else {
                        Variable variable2 = new Variable(bSHVariableDeclarator.name, type, lhs);
                        variable2.modifiers = this.modifiers;
                        variable2.setValue(objEval, 1);
                        pVar.setVariableImpl(variable2);
                    }
                    if (pVar.isClass) {
                    }
                } catch (UtilEvalError e6) {
                    throw e6.toEvalError(this, callStack);
                }
            }
            return variable;
        } catch (EvalError e7) {
            throw e7.reThrow("Typed variable declaration");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class<?> evalType(CallStack callStack, Interpreter interpreter) {
        return getTypeNode().getType(callStack, interpreter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHVariableDeclarator[] getDeclarators() {
        BSHVariableDeclarator[] bSHVariableDeclaratorArr = this.bvda;
        if (bSHVariableDeclaratorArr != null) {
            return bSHVariableDeclaratorArr;
        }
        int iJjtGetNumChildren = jjtGetNumChildren();
        this.bvda = new BSHVariableDeclarator[iJjtGetNumChildren - 1];
        int i9 = 1;
        while (true) {
            BSHVariableDeclarator[] bSHVariableDeclaratorArr2 = this.bvda;
            if (i9 >= iJjtGetNumChildren) {
                return bSHVariableDeclaratorArr2;
            }
            bSHVariableDeclaratorArr2[i9 - 1] = (BSHVariableDeclarator) jjtGetChild(i9);
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.modifiers;
    }
}
