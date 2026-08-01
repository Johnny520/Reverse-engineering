package bsh;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BSHEnhancedForStatement extends SimpleNode implements InterfaceC3448 {
    final int blockId;
    boolean isFinal;
    String label;
    String varName;

    public BSHEnhancedForStatement(int i) {
        super(i);
        this.isFinal = false;
        this.blockId = BlockNameSpace.blockCount.incrementAndGet();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalError {
        InterfaceC3452 interfaceC3452JjtGetChild;
        Class<?> cls;
        String str;
        Modifiers modifiers = new Modifiers(4);
        if (this.isFinal) {
            modifiers.addModifier("final");
        }
        NameSpace pVar = callStack.top();
        InterfaceC3452 interfaceC3452JjtGetChild2 = jjtGetChild(0);
        int iJjtGetNumChildren = jjtGetNumChildren();
        if (interfaceC3452JjtGetChild2 instanceof BSHType) {
            Class<?> type = ((BSHType) interfaceC3452JjtGetChild2).getType(callStack, interpreter);
            InterfaceC3452 interfaceC3452JjtGetChild3 = jjtGetChild(1);
            InterfaceC3452 interfaceC3452JjtGetChild4 = iJjtGetNumChildren > 2 ? jjtGetChild(2) : null;
            cls = type;
            interfaceC3452JjtGetChild2 = interfaceC3452JjtGetChild3;
            interfaceC3452JjtGetChild = interfaceC3452JjtGetChild4;
        } else {
            interfaceC3452JjtGetChild = iJjtGetNumChildren > 1 ? jjtGetChild(1) : null;
            cls = null;
        }
        Object objEval = interfaceC3452JjtGetChild2.eval(callStack, interpreter);
        synchronized (AbstractC3462.class) {
        }
        Iterator itM5881 = AbstractC3462.m5881(objEval);
        try {
            NameSpace blockNameSpace = BlockNameSpace.getInstance(pVar, this.blockId);
            callStack.swap(blockNameSpace);
            while (!Thread.interrupted() && itM5881.hasNext()) {
                try {
                    Object next = itM5881.next();
                    if (next == null) {
                        next = Primitive.NULL;
                    }
                    blockNameSpace.clear();
                    blockNameSpace.setTypedVariable(this.varName, cls, next, modifiers);
                    if (interfaceC3452JjtGetChild != null) {
                        Object objEval2 = interfaceC3452JjtGetChild instanceof BSHBlock ? ((BSHBlock) interfaceC3452JjtGetChild).eval(callStack, interpreter, null) : interfaceC3452JjtGetChild.eval(callStack, interpreter);
                        if (objEval2 instanceof C3501) {
                            C3501 c3501 = (C3501) objEval2;
                            String str2 = c3501.f8349;
                            if (str2 != null && ((str = this.label) == null || !str.equals(str2))) {
                                callStack.swap(pVar);
                                return objEval2;
                            }
                            int i = c3501.f8351;
                            if (i == 47) {
                                callStack.swap(pVar);
                                return objEval2;
                            }
                            if (i == 13) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                } catch (UtilEvalError e) {
                    throw e.toEvalError("for loop iterator variable:" + this.varName, this, callStack);
                }
            }
            Primitive primitive = Primitive.VOID;
            callStack.swap(pVar);
            return primitive;
        } catch (Throwable th) {
            callStack.swap(pVar);
            throw th;
        }
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.label + ": " + this.varName + ", final=" + this.isFinal;
    }
}
