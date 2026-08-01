package bsh;

import androidx.activity.AbstractC0053;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class BSHImportDeclaration extends SimpleNode {
    private static final long serialVersionUID = 1;
    public boolean importPackage;
    public boolean staticImport;
    public boolean superImport;

    public BSHImportDeclaration(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalError {
        Class<?> cls;
        NameSpace pVar = callStack.top();
        if (this.superImport) {
            try {
                pVar.doSuperImport();
            } catch (UtilEvalError e) {
                throw e.toEvalError(this, callStack);
            }
        } else {
            BSHAmbiguousName bSHAmbiguousName = (BSHAmbiguousName) jjtGetChild(0);
            if (!this.staticImport) {
                String str = bSHAmbiguousName.text;
                if (this.importPackage) {
                    pVar.importPackage(str);
                } else {
                    pVar.importClass(str);
                }
            } else {
                if (!this.importPackage) {
                    String strSuffix = Name.suffix(bSHAmbiguousName.text, 1);
                    Object object = null;
                    try {
                        cls = pVar.getClass(Name.prefix(bSHAmbiguousName.text));
                        try {
                            object = AbstractC2666.m5390(cls, strSuffix);
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        cls = null;
                    }
                    if (cls != null && object == null) {
                        try {
                            object = AbstractC2666.m5406(cls, strSuffix);
                        } catch (Exception unused3) {
                        }
                    }
                    if (object == null) {
                        try {
                            object = bSHAmbiguousName.toObject(callStack, interpreter);
                        } catch (Exception unused4) {
                        }
                    }
                    if (object instanceof BshMethod) {
                        pVar.setMethod((BshMethod) object);
                        return Primitive.VOID;
                    }
                    if (!(object instanceof LHS)) {
                        object = bSHAmbiguousName.toLHS(callStack, interpreter);
                    }
                    if (object instanceof LHS) {
                        LHS lhs = (LHS) object;
                        if (lhs.isStatic()) {
                            pVar.setVariableImpl(lhs.getVariable());
                            return Primitive.VOID;
                        }
                    }
                    throw new EvalException(AbstractC0053.m146(new StringBuilder(), bSHAmbiguousName.text, " is not a static member of a class"), this, callStack);
                }
                pVar.importStatic(bSHAmbiguousName.toClass(callStack, interpreter));
            }
        }
        return Primitive.VOID;
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": static=" + this.staticImport + ", *=" + this.importPackage + ", super import=" + this.superImport;
    }
}
