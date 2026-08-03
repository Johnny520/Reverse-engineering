package bsh;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;
import p068eh.AbstractC0921a;
import p222p.AbstractC3199a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHPrimarySuffix extends SimpleNode {
    public static final int CLASS = 6;
    public static final int INDEX = 1;
    public static final int METHODREF = 5;
    public static final int NAME = 2;
    public static final int NEW = 4;
    public static final int PROPERTY = 3;
    private static final long serialVersionUID = 1;
    public String field;
    public boolean hasLeftIndex;
    public boolean hasRightIndex;
    Object index;
    public int operation;
    public boolean safeNavigate;
    public boolean slice;
    public boolean step;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHPrimarySuffix(int i9) {
        super(i9);
        this.slice = false;
        this.step = false;
        this.hasLeftIndex = false;
        this.hasRightIndex = false;
        this.safeNavigate = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0146 A[PHI: r3
  0x0146: PHI (r3v5 int) = (r3v4 int), (r3v13 int) binds: [B:64:0x00ec, B:85:0x0131] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Object doIndex(Object obj, boolean z9, CallStack callStack, Interpreter interpreter) throws EvalError {
        int iIntValue;
        Integer numValueOf;
        int i9 = 0;
        if (!interpreter.getStrictJava()) {
            if (Types.isPropertyTypeMap(obj)) {
                Object objEval = jjtGetChild(0).eval(callStack, interpreter);
                return z9 ? new LHS(obj, objEval) : Reflect.getObjectProperty(obj, objEval);
            }
            if (Types.isPropertyTypeEntry(obj)) {
                Object objEval2 = jjtGetChild(0).eval(callStack, interpreter);
                if (!z9) {
                    return Reflect.getObjectProperty(obj, objEval2);
                }
                if (objEval2.equals(((Map.Entry) obj).getKey())) {
                    return new LHS(obj);
                }
                throw new EvalError("No such property: " + objEval2, this, callStack);
            }
        }
        Class<?> cls = obj.getClass();
        if ((interpreter.getStrictJava() || !(obj instanceof List)) && !cls.isArray()) {
            throw new EvalError("Not an array or List type", this, callStack);
        }
        int size = obj instanceof List ? ((List) obj).size() : Array.getLength(obj);
        int indexAux = size + 1;
        if (!interpreter.getStrictJava() && Types.isPropertyTypeEntryList(cls)) {
            Object objEval3 = jjtGetChild(0).eval(callStack, interpreter);
            if (((!(objEval3 instanceof Primitive) || !((Primitive) objEval3).isNumber()) && !Primitive.isWrapperType(objEval3.getClass())) || size <= (indexAux = ((Integer) Primitive.castWrapper(Integer.TYPE, objEval3)).intValue()) || (-size) >= indexAux) {
                return z9 ? new LHS(Reflect.getEntryForKey(objEval3, (Map.Entry[]) obj)) : Reflect.getObjectProperty(obj, objEval3);
            }
        } else if (indexAux > size) {
            indexAux = getIndexAux(obj, 0, callStack, interpreter, this);
        }
        if (!interpreter.getStrictJava()) {
            if (indexAux < 0) {
                indexAux += size;
            }
            if (this.slice) {
                if (z9) {
                    throw new EvalError("cannot assign to array slice", this, callStack);
                }
                if (this.step) {
                    if (this.hasLeftIndex && this.hasRightIndex && jjtGetNumChildren() == 3) {
                        numValueOf = Integer.valueOf(getIndexAux(obj, 2, callStack, interpreter, this));
                    } else if (!(this.hasLeftIndex && this.hasRightIndex) && jjtGetNumChildren() == 2) {
                        numValueOf = Integer.valueOf(getIndexAux(obj, 1, callStack, interpreter, this));
                    } else if (this.hasLeftIndex || this.hasRightIndex) {
                        numValueOf = null;
                    } else {
                        numValueOf = Integer.valueOf(getIndexAux(obj, 0, callStack, interpreter, this));
                        indexAux = 0;
                    }
                    if (numValueOf != null) {
                        if (numValueOf.intValue() == 0) {
                            throw new EvalError("array slice step cannot be zero", this, callStack);
                        }
                        iIntValue = numValueOf.intValue();
                    }
                } else {
                    iIntValue = 0;
                }
                if (this.hasLeftIndex && this.hasRightIndex) {
                    i9 = indexAux;
                    indexAux = getIndexAux(obj, 1, callStack, interpreter, this);
                } else if (!this.hasRightIndex) {
                    i9 = indexAux;
                    indexAux = size;
                }
                if (indexAux < 0) {
                    indexAux += size;
                }
                return obj.getClass().isArray() ? BshArray.slice(obj, i9, indexAux, iIntValue) : BshArray.slice((List<Object>) obj, i9, indexAux, iIntValue);
            }
        } else if (this.slice) {
            throw new EvalError("expected ']' but found ':'", this, callStack);
        }
        if (z9) {
            return new LHS(obj, indexAux);
        }
        try {
            return BshArray.getIndex(obj, indexAux);
        } catch (UtilEvalError e6) {
            throw e6.toEvalError("Error array get index", this, callStack);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private BshLambda doMethodRef(Object obj) {
        return BshLambda.fromMethodReference(this, obj, this.field);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Object doName(Object obj, boolean z9, CallStack callStack, Interpreter interpreter) throws EvalError {
        CallStack callStack2;
        UtilEvalError utilEvalError;
        try {
            if (this.safeNavigate) {
                try {
                    if (Primitive.NULL == obj) {
                        throw SafeNavigate.doAbort();
                    }
                } catch (UtilEvalError e6) {
                    utilEvalError = e6;
                    callStack2 = callStack;
                }
            }
        } catch (UtilEvalError e7) {
            e = e7;
            callStack2 = callStack;
        }
        if (this.field.equals("length") && obj.getClass().isArray()) {
            Interpreter.mainSecurityGuard.canGetField(obj, this.field);
            if (z9) {
                throw new EvalError("Can't assign array length", this, callStack);
            }
            return new Primitive(Array.getLength(obj));
        }
        if (jjtGetNumChildren() == 0) {
            Interpreter.mainSecurityGuard.canGetField(obj, this.field);
            String str = this.field;
            if (z9) {
                try {
                    return Reflect.getLHSObjectField(obj, str);
                } catch (Throwable unused) {
                    return new LHS(obj, this.field);
                }
            }
            try {
                try {
                    return Reflect.getObjectFieldValue(obj, str);
                } catch (Throwable unused2) {
                    return Reflect.getObjectProperty(obj, this.field);
                }
            } catch (Throwable unused3) {
                return Primitive.VOID;
            }
            utilEvalError = e6;
            callStack2 = callStack;
            throw utilEvalError.toEvalError(this, callStack2);
        }
        Object[] arguments = ((BSHArguments) jjtGetChild(0)).getArguments(callStack, interpreter);
        Interpreter.mainSecurityGuard.canInvokeMethod(obj, this.field, arguments);
        callStack2 = callStack;
        try {
            return Reflect.invokeObjectMethod(obj, this.field, arguments, interpreter, callStack2, this);
        } catch (UtilEvalError e10) {
            e = e10;
        }
        utilEvalError = e;
        throw utilEvalError.toEvalError(this, callStack2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Object doNewInner(Object obj, boolean z9, CallStack callStack, Interpreter interpreter) {
        BSHAllocationExpression bSHAllocationExpression = (BSHAllocationExpression) jjtGetChild(0);
        if (!Reflect.isGeneratedClass(obj.getClass())) {
            return bSHAllocationExpression.constructFromEnclosingInstance(obj, callStack, interpreter);
        }
        callStack.pop();
        callStack.push(Reflect.getThisNS(obj));
        return bSHAllocationExpression.eval(callStack, interpreter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Object doProperty(boolean z9, Object obj, CallStack callStack, Interpreter interpreter) throws EvalError {
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
        if (z9) {
            return new LHS(obj, (String) objEval);
        }
        try {
            Object objectProperty = Reflect.getObjectProperty(obj, (String) objEval);
            return objectProperty == null ? Primitive.NULL : Primitive.unwrap(objectProperty);
        } catch (ReflectError e6) {
            throw new EvalError("No such property: " + objEval, this, callStack, e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int getIndexAux(Object obj, int i9, CallStack callStack, Interpreter interpreter, Node node) throws EvalError {
        try {
            Object objEval = node.jjtGetChild(i9).eval(callStack, interpreter);
            boolean z9 = objEval instanceof Primitive;
            Class cls = Integer.TYPE;
            if (!z9) {
                objEval = Types.castObject(objEval, cls, 1);
            }
            return ((Integer) Primitive.castWrapper(cls, objEval)).intValue();
        } catch (Exception e6) {
            Interpreter.debug("doIndex: " + e6);
            throw new EvalError("Array index does not evaluate to an integer.", node, callStack, e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object doSuffix(Object obj, boolean z9, CallStack callStack, Interpreter interpreter) {
        if (this.operation == 6) {
            if (!(obj instanceof BSHType)) {
                throw new EvalException("Attempt to use .class suffix on non class.", this, callStack);
            }
            if (z9) {
                throw new EvalException("Can't assign .class", this, callStack);
            }
            return ((BSHType) obj).getType(callStack, interpreter);
        }
        if (obj instanceof Node) {
            obj = obj instanceof BSHAmbiguousName ? ((BSHAmbiguousName) obj).toObject(callStack, interpreter) : ((Node) obj).eval(callStack, interpreter);
        } else if (obj instanceof LHS) {
            try {
                obj = ((LHS) obj).getValue();
            } catch (UtilEvalError e6) {
                throw e6.toEvalError(this, callStack);
            }
        }
        try {
            int i9 = this.operation;
            if (i9 == 1) {
                return doIndex(obj, z9, callStack, interpreter);
            }
            if (i9 == 2) {
                return doName(obj, z9, callStack, interpreter);
            }
            if (i9 == 3) {
                return doProperty(z9, obj, callStack, interpreter);
            }
            if (i9 == 4) {
                return doNewInner(obj, z9, callStack, interpreter);
            }
            if (i9 == 5) {
                return doMethodRef(obj);
            }
            throw new InterpreterError("Unknown suffix type");
        } catch (ReflectError e7) {
            throw new EvalError("reflection error: " + e7, this, callStack, e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode
    public String toString() {
        int i9 = this.operation;
        if (i9 != 1) {
            if (i9 != 2) {
                return i9 == 3 ? AbstractC0921a.m2255r(new StringBuilder(), super.toString(), ":PROPERTY {}") : i9 == 4 ? AbstractC0921a.m2255r(new StringBuilder(), super.toString(), ":NEW new") : i9 == 6 ? AbstractC0921a.m2255r(new StringBuilder(), super.toString(), ":CLASS class") : AbstractC0921a.m2255r(new StringBuilder(), super.toString(), ":NO OPERATION");
            }
            return super.toString() + ":NAME " + this.field;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(":INDEX [");
        sb2.append(this.hasLeftIndex);
        sb2.append(":");
        sb2.append(this.slice);
        sb2.append(" ");
        sb2.append(this.hasRightIndex);
        sb2.append(":");
        return AbstractC3199a.m6840m("]", sb2, this.step);
    }
}
