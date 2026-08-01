package bsh;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BSHMethodInvocation extends SimpleNode {
    public BSHMethodInvocation(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalError {
        NameSpace pVar = callStack.top();
        BSHAmbiguousName nameNode = getNameNode();
        if ("fail".equals(nameNode.text)) {
            interpreter.getNameSpace().setNode(this);
        }
        if (pVar.getParent() != null && pVar.getParent().isClass && (nameNode.text.equals("super") || nameNode.text.equals("this"))) {
            return Primitive.VOID;
        }
        Name name = nameNode.getName(pVar);
        try {
            return name.invokeMethod(interpreter, getArgsNode().getArguments(callStack, interpreter), callStack, this);
        } catch (ReflectError e) {
            throw new EvalException("Error in method invocation: " + e.getMessage(), this, callStack, e);
        } catch (UtilEvalError e2) {
            throw e2.toEvalError(this, callStack);
        } catch (InvocationTargetException e3) {
            throw AbstractC2667.m5434(e3, name.toString(), callStack, this);
        }
    }

    public BSHArguments getArgsNode() {
        return (BSHArguments) jjtGetChild(1);
    }

    public BSHAmbiguousName getNameNode() {
        return (BSHAmbiguousName) jjtGetChild(0);
    }
}
