package bsh;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class BSHEnhancedForStatement extends SimpleNode implements InterfaceC2614 {
    final int blockId;
    boolean isFinal;
    String label;
    String varName;

    public BSHEnhancedForStatement(int i) {
        super(i);
        this.isFinal = false;
        this.blockId = BlockNameSpace.blockCount.incrementAndGet();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalError {
        InterfaceC2618 interfaceC2618JjtGetChild;
        Class<?> cls;
        String str;
        Modifiers modifiers = new Modifiers(4);
        if (this.isFinal) {
            modifiers.addModifier("final");
        }
        NameSpace pVar = callStack.top();
        InterfaceC2618 interfaceC2618JjtGetChild2 = jjtGetChild(0);
        int iJjtGetNumChildren = jjtGetNumChildren();
        if (interfaceC2618JjtGetChild2 instanceof BSHType) {
            Class<?> type = ((BSHType) interfaceC2618JjtGetChild2).getType(callStack, interpreter);
            InterfaceC2618 interfaceC2618JjtGetChild3 = jjtGetChild(1);
            InterfaceC2618 interfaceC2618JjtGetChild4 = iJjtGetNumChildren > 2 ? jjtGetChild(2) : null;
            cls = type;
            interfaceC2618JjtGetChild2 = interfaceC2618JjtGetChild3;
            interfaceC2618JjtGetChild = interfaceC2618JjtGetChild4;
        } else {
            interfaceC2618JjtGetChild = iJjtGetNumChildren > 1 ? jjtGetChild(1) : null;
            cls = null;
        }
        Object objEval = interfaceC2618JjtGetChild2.eval(callStack, interpreter);
        synchronized (AbstractC2628.class) {
        }
        Iterator itM5276 = AbstractC2628.m5276(objEval);
        try {
            NameSpace blockNameSpace = BlockNameSpace.getInstance(pVar, this.blockId);
            callStack.swap(blockNameSpace);
            while (!Thread.interrupted() && itM5276.hasNext()) {
                try {
                    Object next = itM5276.next();
                    if (next == null) {
                        next = Primitive.NULL;
                    }
                    blockNameSpace.clear();
                    blockNameSpace.setTypedVariable(this.varName, cls, next, modifiers);
                    if (interfaceC2618JjtGetChild != null) {
                        Object objEval2 = interfaceC2618JjtGetChild instanceof BSHBlock ? ((BSHBlock) interfaceC2618JjtGetChild).eval(callStack, interpreter, null) : interfaceC2618JjtGetChild.eval(callStack, interpreter);
                        if (objEval2 instanceof C2667) {
                            C2667 c2667 = (C2667) objEval2;
                            String str2 = c2667.f8002;
                            if (str2 != null && ((str = this.label) == null || !str.equals(str2))) {
                                callStack.swap(pVar);
                                return objEval2;
                            }
                            int i = c2667.f8004;
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
