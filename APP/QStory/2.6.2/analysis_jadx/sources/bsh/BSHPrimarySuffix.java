package bsh;

import androidx.activity.AbstractC0053;
import com.kongzue.dialogx.util.C3762;
import java.lang.reflect.Array;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class BSHPrimarySuffix extends SimpleNode {
    public static final int CLASS = 6;
    public static final int INDEX = 1;
    public static final int METHODREF = 5;
    public static final int NAME = 2;
    public static final int NEW = 4;
    public static final int PROPERTY = 3;
    public String field;
    public boolean hasLeftIndex;
    public boolean hasRightIndex;
    Object index;
    public int operation;
    public boolean safeNavigate;
    public boolean slice;
    public boolean step;

    public BSHPrimarySuffix(int i) {
        super(i);
        this.slice = false;
        this.step = false;
        this.hasLeftIndex = false;
        this.hasRightIndex = false;
        this.safeNavigate = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x013c A[PHI: r3
  0x013c: PHI (r3v5 int) = (r3v4 int), (r3v18 int) binds: [B:64:0x00e2, B:85:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Object doIndex(java.lang.Object r10, boolean r11, bsh.CallStack r12, bsh.Interpreter r13) throws bsh.EvalError {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.BSHPrimarySuffix.doIndex(java.lang.Object, boolean, bsh.CallStack, bsh.Interpreter):java.lang.Object");
    }

    private AbstractC2650 doMethodRef(Object obj) {
        String str = this.field;
        C3762 c3762 = AbstractC2650.f7932;
        return new C2658(this, obj, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [bsh.飘花落叶言子世兰苏楪哲] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [bsh.飘花落叶言子世兰苏楪哲] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v0, types: [bsh.BSHPrimarySuffix, bsh.SimpleNode, bsh.飘花落叶言子世兰苏楪哲] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v5, types: [bsh.LHS, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [bsh.UtilEvalError] */
    /* JADX WARN: Type inference failed for: r7v4 */
    private Object doName(Object obj, boolean z, CallStack callStack, Interpreter interpreter) throws EvalError {
        ?? r5;
        CallStack callStack2;
        ?? r7;
        ?? r52;
        try {
            if (this.safeNavigate) {
                try {
                    if (Primitive.NULL == obj) {
                        throw SafeNavigate.doAbort();
                    }
                } catch (UtilEvalError e) {
                    r7 = e;
                    r52 = this;
                    callStack2 = callStack;
                }
            }
        } catch (UtilEvalError e2) {
            e = e2;
            r5 = this;
            callStack2 = callStack;
        }
        if (this.field.equals("length") && obj.getClass().isArray()) {
            Interpreter.mainSecurityGuard.m13858();
            if (z) {
                throw new EvalError("Can't assign array length", this, callStack);
            }
            return new Primitive(Array.getLength(obj));
        }
        if (jjtGetNumChildren() == 0) {
            Interpreter.mainSecurityGuard.m13858();
            String str = this.field;
            if (z) {
                try {
                    this = AbstractC2666.m5414(obj, str);
                    return this;
                } catch (Throwable unused) {
                    return new LHS(obj, this.field);
                }
            }
            try {
                try {
                    return AbstractC2666.m5410(obj, str);
                } catch (Throwable unused2) {
                    this = AbstractC2666.m5408(obj, this.field);
                    return this;
                }
            } catch (Throwable unused3) {
                return Primitive.VOID;
            }
            r7 = e;
            r52 = this;
            callStack2 = callStack;
            throw r7.toEvalError(r52, callStack2);
        }
        Object[] arguments = ((BSHArguments) jjtGetChild(0)).getArguments(callStack, interpreter);
        Interpreter.mainSecurityGuard.m13856(obj, this.field, arguments);
        r5 = this;
        callStack2 = callStack;
        try {
            return AbstractC2666.m5402(obj, this.field, arguments, interpreter, callStack2, r5);
        } catch (UtilEvalError e3) {
            e = e3;
        }
        r7 = e;
        r52 = r5;
        throw r7.toEvalError(r52, callStack2);
    }

    private Object doNewInner(Object obj, boolean z, CallStack callStack, Interpreter interpreter) {
        BSHAllocationExpression bSHAllocationExpression = (BSHAllocationExpression) jjtGetChild(0);
        if (!AbstractC2666.m5387(obj.getClass())) {
            return bSHAllocationExpression.constructFromEnclosingInstance(obj, callStack, interpreter);
        }
        callStack.pop();
        callStack.push(AbstractC2666.m5399(obj));
        return bSHAllocationExpression.eval(callStack, interpreter);
    }

    private Object doProperty(boolean z, Object obj, CallStack callStack, Interpreter interpreter) throws EvalError {
        if (obj == Primitive.VOID) {
            throw new EvalError("Attempt to access property on undefined variable or class name", this, callStack);
        }
        if (obj instanceof Primitive) {
            throw new EvalError("Attempt to access property on a primitive", this, callStack);
        }
        Object objEval = jjtGetChild(0).eval(callStack, interpreter);
        if (!(objEval instanceof String)) {
            throw new EvalError("Property expression must be a String or identifier.", this, callStack);
        }
        if (z) {
            return new LHS(obj, (String) objEval);
        }
        try {
            Object objM5408 = AbstractC2666.m5408(obj, (String) objEval);
            return objM5408 == null ? Primitive.NULL : Primitive.unwrap(objM5408);
        } catch (ReflectError e) {
            throw new EvalError(AbstractC0053.m153(objEval, "No such property: "), this, callStack, e);
        }
    }

    public static int getIndexAux(Object obj, int i, CallStack callStack, Interpreter interpreter, InterfaceC2618 interfaceC2618) throws EvalError {
        try {
            Object objEval = interfaceC2618.jjtGetChild(i).eval(callStack, interpreter);
            boolean z = objEval instanceof Primitive;
            Class cls = Integer.TYPE;
            if (!z) {
                objEval = AbstractC2661.m5328(objEval, cls, 1);
            }
            return ((Integer) Primitive.castWrapper(cls, objEval)).intValue();
        } catch (Exception e) {
            Interpreter.debug("doIndex: " + e);
            throw new EvalError("Array index does not evaluate to an integer.", interfaceC2618, callStack, e);
        }
    }

    public Object doSuffix(Object obj, boolean z, CallStack callStack, Interpreter interpreter) {
        if (this.operation == 6) {
            if (!(obj instanceof BSHType)) {
                throw new EvalException("Attempt to use .class suffix on non class.", this, callStack);
            }
            if (z) {
                throw new EvalException("Can't assign .class", this, callStack);
            }
            return ((BSHType) obj).getType(callStack, interpreter);
        }
        if (obj instanceof InterfaceC2618) {
            obj = obj instanceof BSHAmbiguousName ? ((BSHAmbiguousName) obj).toObject(callStack, interpreter) : ((InterfaceC2618) obj).eval(callStack, interpreter);
        } else if (obj instanceof LHS) {
            try {
                obj = ((LHS) obj).getValue();
            } catch (UtilEvalError e) {
                throw e.toEvalError(this, callStack);
            }
        }
        try {
            int i = this.operation;
            if (i == 1) {
                return doIndex(obj, z, callStack, interpreter);
            }
            if (i == 2) {
                return doName(obj, z, callStack, interpreter);
            }
            if (i == 3) {
                return doProperty(z, obj, callStack, interpreter);
            }
            if (i == 4) {
                return doNewInner(obj, z, callStack, interpreter);
            }
            if (i == 5) {
                return doMethodRef(obj);
            }
            throw new InterpreterError("Unknown suffix type");
        } catch (ReflectError e2) {
            throw new EvalError("reflection error: " + e2, this, callStack, e2);
        }
    }

    @Override // bsh.SimpleNode
    public String toString() {
        int i = this.operation;
        if (i != 1) {
            if (i != 2) {
                return i == 3 ? AbstractC0053.m146(new StringBuilder(), super.toString(), ":PROPERTY {}") : i == 4 ? AbstractC0053.m146(new StringBuilder(), super.toString(), ":NEW new") : i == 6 ? AbstractC0053.m146(new StringBuilder(), super.toString(), ":CLASS class") : AbstractC0053.m146(new StringBuilder(), super.toString(), ":NO OPERATION");
            }
            return super.toString() + ":NAME " + this.field;
        }
        return super.toString() + ":INDEX [" + this.hasLeftIndex + ":" + this.slice + " " + this.hasRightIndex + ":" + this.step + "]";
    }
}
