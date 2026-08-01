package bsh;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BSHTypedVariableDeclaration extends SimpleNode {
    private static final long serialVersionUID = 1;
    private BSHVariableDeclarator[] bvda;
    public Modifiers modifiers;

    public BSHTypedVariableDeclaration(int i) {
        super(i);
        this.modifiers = new Modifiers(3);
    }

    private BSHType getTypeNode() {
        return (BSHType) jjtGetChild(0);
    }

    private boolean isValType(BSHType bSHType) {
        InterfaceC3452 typeNode = bSHType.getTypeNode();
        return (typeNode instanceof BSHAmbiguousName) && "val".equals(((BSHAmbiguousName) typeNode).text);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c9 A[Catch: UtilEvalError -> 0x0054, EvalError -> 0x00db, TRY_LEAVE, TryCatch #2 {UtilEvalError -> 0x0054, blocks: (B:12:0x0039, B:14:0x003d, B:17:0x0043, B:18:0x004f, B:23:0x0058, B:31:0x0077, B:33:0x007b, B:45:0x00c5, B:47:0x00c9, B:35:0x008f, B:37:0x0095, B:39:0x0099, B:41:0x00a2, B:42:0x00ac, B:44:0x00b7, B:24:0x005d, B:25:0x0069, B:28:0x006f), top: B:61:0x0039, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d0  */
    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalError {
        LHS lhs;
        AbstractC3458 abstractC3458M5989;
        AbstractC3458 abstractC3458M59892;
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
                            try {
                                abstractC3458M59892 = AbstractC3500.m5989(pVar.classStatic, bSHVariableDeclarator.name, this.modifiers.hasModifier("static"));
                            } catch (ReflectError unused) {
                                abstractC3458M59892 = null;
                            }
                            lhs = new LHS(obj, abstractC3458M59892);
                        } else {
                            Class<?> cls = pVar.classStatic;
                            try {
                                abstractC3458M5989 = AbstractC3500.m5989(cls, bSHVariableDeclarator.name, this.modifiers.hasModifier("static"));
                            } catch (ReflectError unused2) {
                                abstractC3458M5989 = null;
                            }
                            lhs = new LHS((Object) cls, abstractC3458M5989);
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
                            interpreter.getClassManager().mo5695(pVar.getVariableImpl(bSHVariableDeclarator.name, false));
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
                } catch (UtilEvalError e) {
                    throw e.toEvalError(this, callStack);
                }
            }
            return variable;
        } catch (EvalError e2) {
            throw e2.reThrow("Typed variable declaration");
        }
    }

    public Class<?> evalType(CallStack callStack, Interpreter interpreter) {
        return getTypeNode().getType(callStack, interpreter);
    }

    public BSHVariableDeclarator[] getDeclarators() {
        BSHVariableDeclarator[] bSHVariableDeclaratorArr = this.bvda;
        if (bSHVariableDeclaratorArr != null) {
            return bSHVariableDeclaratorArr;
        }
        int iJjtGetNumChildren = jjtGetNumChildren();
        this.bvda = new BSHVariableDeclarator[iJjtGetNumChildren - 1];
        int i = 1;
        while (true) {
            BSHVariableDeclarator[] bSHVariableDeclaratorArr2 = this.bvda;
            if (i >= iJjtGetNumChildren) {
                return bSHVariableDeclaratorArr2;
            }
            bSHVariableDeclaratorArr2[i - 1] = (BSHVariableDeclarator) jjtGetChild(i);
            i++;
        }
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.modifiers;
    }
}
