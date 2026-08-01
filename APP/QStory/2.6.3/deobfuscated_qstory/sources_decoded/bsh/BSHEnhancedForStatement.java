package bsh;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BSHEnhancedForStatement extends SimpleNode implements InterfaceC2615 {
    final int blockId;
    boolean isFinal;
    String label;
    String varName;

    public BSHEnhancedForStatement(int i) {
        super(i);
        this.isFinal = false;
        this.blockId = BlockNameSpace.blockCount.incrementAndGet();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalError {
        InterfaceC2619 interfaceC2619JjtGetChild;
        Class<?> cls;
        String str;
        Modifiers modifiers = new Modifiers(4);
        if (this.isFinal) {
            modifiers.addModifier("final");
        }
        NameSpace pVar = callStack.top();
        InterfaceC2619 interfaceC2619JjtGetChild2 = jjtGetChild(0);
        int iJjtGetNumChildren = jjtGetNumChildren();
        if (interfaceC2619JjtGetChild2 instanceof BSHType) {
            Class<?> type = ((BSHType) interfaceC2619JjtGetChild2).getType(callStack, interpreter);
            InterfaceC2619 interfaceC2619JjtGetChild3 = jjtGetChild(1);
            InterfaceC2619 interfaceC2619JjtGetChild4 = iJjtGetNumChildren > 2 ? jjtGetChild(2) : null;
            cls = type;
            interfaceC2619JjtGetChild2 = interfaceC2619JjtGetChild3;
            interfaceC2619JjtGetChild = interfaceC2619JjtGetChild4;
        } else {
            interfaceC2619JjtGetChild = iJjtGetNumChildren > 1 ? jjtGetChild(1) : null;
            cls = null;
        }
        Object objEval = interfaceC2619JjtGetChild2.eval(callStack, interpreter);
        synchronized (AbstractC2629.class) {
        }
        Iterator itM5321 = AbstractC2629.m5321(objEval);
        try {
            NameSpace blockNameSpace = BlockNameSpace.getInstance(pVar, this.blockId);
            callStack.swap(blockNameSpace);
            while (!Thread.interrupted() && itM5321.hasNext()) {
                try {
                    Object next = itM5321.next();
                    if (next == null) {
                        next = Primitive.NULL;
                    }
                    blockNameSpace.clear();
                    blockNameSpace.setTypedVariable(this.varName, cls, next, modifiers);
                    if (interfaceC2619JjtGetChild != null) {
                        Object objEval2 = interfaceC2619JjtGetChild instanceof BSHBlock ? ((BSHBlock) interfaceC2619JjtGetChild).eval(callStack, interpreter, null) : interfaceC2619JjtGetChild.eval(callStack, interpreter);
                        if (objEval2 instanceof C2668) {
                            C2668 c2668 = (C2668) objEval2;
                            String str2 = c2668.f8004;
                            if (str2 != null && ((str = this.label) == null || !str.equals(str2))) {
                                callStack.swap(pVar);
                                return objEval2;
                            }
                            int i = c2668.f8006;
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
