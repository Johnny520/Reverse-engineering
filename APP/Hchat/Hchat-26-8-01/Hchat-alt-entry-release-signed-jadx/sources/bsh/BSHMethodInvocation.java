package bsh;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHMethodInvocation extends SimpleNode {
    private static final long serialVersionUID = 1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHMethodInvocation(int i9) {
        super(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
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
        } catch (ReflectError e6) {
            throw new EvalException("Error in method invocation: " + e6.getMessage(), this, callStack, e6);
        } catch (UtilEvalError e7) {
            throw e7.toEvalError(this, callStack);
        } catch (InvocationTargetException e10) {
            throw Reflect.targetErrorFromTargetException(e10, name.toString(), callStack, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHArguments getArgsNode() {
        return (BSHArguments) jjtGetChild(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHAmbiguousName getNameNode() {
        return (BSHAmbiguousName) jjtGetChild(0);
    }
}
