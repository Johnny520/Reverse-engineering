package bsh;

import androidx.activity.AbstractC0900;
import com.kongzue.dialogx.util.C4595;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
    */
    private Object doIndex(Object obj, boolean z, CallStack callStack, Interpreter interpreter) throws EvalError {
        int iIntValue;
        int i;
        Integer numValueOf;
        int i2 = 0;
        if (!interpreter.getStrictJava()) {
            Map map = AbstractC3495.f8317;
            if (obj instanceof Map) {
                Object objEval = jjtGetChild(0).eval(callStack, interpreter);
                return z ? new LHS(obj, objEval) : AbstractC3500.m6012(obj, objEval);
            }
            if (obj instanceof Map.Entry) {
                Object objEval2 = jjtGetChild(0).eval(callStack, interpreter);
                if (!z) {
                    return AbstractC3500.m6012(obj, objEval2);
                }
                if (objEval2.equals(((Map.Entry) obj).getKey())) {
                    return new LHS(obj);
                }
                throw new EvalError(AbstractC0900.m713(objEval2, "No such property: "), this, callStack);
            }
        }
        Class<?> cls = obj.getClass();
        if ((interpreter.getStrictJava() || !(obj instanceof List)) && !cls.isArray()) {
            throw new EvalError("Not an array or List type", this, callStack);
        }
        int size = obj instanceof List ? ((List) obj).size() : Array.getLength(obj);
        int indexAux = size + 1;
        if (!interpreter.getStrictJava() && AbstractC3495.m5944(cls)) {
            Object objEval3 = jjtGetChild(0).eval(callStack, interpreter);
            if (((!(objEval3 instanceof Primitive) || !((Primitive) objEval3).isNumber()) && !Primitive.isWrapperType(objEval3.getClass())) || size <= (indexAux = ((Integer) Primitive.castWrapper(Integer.TYPE, objEval3)).intValue()) || (-size) >= indexAux) {
                return z ? new LHS(AbstractC3500.m6021(objEval3, (Map.Entry[]) obj)) : AbstractC3500.m6012(obj, objEval3);
            }
        } else if (indexAux > size) {
            indexAux = getIndexAux(obj, 0, callStack, interpreter, this);
        }
        if (!interpreter.getStrictJava()) {
            if (indexAux < 0) {
                indexAux += size;
            }
            if (this.slice) {
                if (z) {
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
                    int i3 = indexAux;
                    indexAux = getIndexAux(obj, 1, callStack, interpreter, this);
                    i = i3;
                } else if (this.hasRightIndex) {
                    i = 0;
                } else {
                    i = indexAux;
                    indexAux = size;
                }
                if (indexAux < 0) {
                    indexAux += size;
                }
                if (!obj.getClass().isArray()) {
                    List list = (List) obj;
                    int size2 = list.size();
                    if (indexAux > size2) {
                        indexAux = size2;
                    }
                    if (i < 0) {
                        i = 0;
                    }
                    int i4 = indexAux - i;
                    if (i4 <= 0) {
                        return list.subList(0, 0);
                    }
                    if (iIntValue == 0 || iIntValue == 1) {
                        return list.subList(i, indexAux);
                    }
                    ArrayList arrayList = new ArrayList();
                    while (i2 < i4) {
                        if (i2 % iIntValue == 0) {
                            arrayList.add(Integer.valueOf(iIntValue < 0 ? (i4 - 1) - i2 : i2 + i));
                        }
                        i2++;
                    }
                    return new C3471(list, arrayList);
                }
                Class clsM5936 = AbstractC3495.m5936(obj.getClass());
                int length = Array.getLength(obj);
                if (indexAux > length) {
                    indexAux = length;
                }
                if (i < 0) {
                    i = 0;
                }
                int i5 = indexAux - i;
                if (i5 <= 0) {
                    return Array.newInstance((Class<?>) clsM5936, 0);
                }
                if (iIntValue == 0 || iIntValue == 1) {
                    Object objNewInstance = Array.newInstance((Class<?>) clsM5936, i5);
                    System.arraycopy(obj, i, objNewInstance, 0, i5);
                    return objNewInstance;
                }
                int iCeil = (int) Math.ceil((((double) i5) + 0.0d) / ((double) Math.abs(iIntValue)));
                Object[] objArr = new Object[iCeil];
                int i6 = 0;
                while (i2 < i5) {
                    if (i2 % iIntValue == 0) {
                        int i7 = i6 + 1;
                        objArr[i6] = Array.get(obj, iIntValue < 0 ? (i5 - 1) - i2 : i2 + i);
                        i6 = i7;
                    }
                    i2++;
                }
                Object objNewInstance2 = Array.newInstance((Class<?>) clsM5936, iCeil);
                AbstractC3462.m5883(clsM5936, objNewInstance2, objArr);
                return objNewInstance2;
            }
        } else if (this.slice) {
            throw new EvalError("expected ']' but found ':'", this, callStack);
        }
        if (z) {
            return new LHS(obj, indexAux);
        }
        try {
            return AbstractC3462.m5880(indexAux, obj);
        } catch (UtilEvalError e) {
            throw e.toEvalError("Error array get index", this, callStack);
        }
    }

    private AbstractC3484 doMethodRef(Object obj) {
        String str = this.field;
        C4595 c4595 = AbstractC3484.f8279;
        return new C3492(this, obj, str);
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
            Interpreter.mainSecurityGuard.m14434();
            if (z) {
                throw new EvalError("Can't assign array length", this, callStack);
            }
            return new Primitive(Array.getLength(obj));
        }
        if (jjtGetNumChildren() == 0) {
            Interpreter.mainSecurityGuard.m14434();
            String str = this.field;
            if (z) {
                try {
                    this = AbstractC3500.m6019(obj, str);
                    return this;
                } catch (Throwable unused) {
                    return new LHS(obj, this.field);
                }
            }
            try {
                try {
                    return AbstractC3500.m6015(obj, str);
                } catch (Throwable unused2) {
                    this = AbstractC3500.m6013(obj, this.field);
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
        Interpreter.mainSecurityGuard.m14432(obj, this.field, arguments);
        r5 = this;
        callStack2 = callStack;
        try {
            return AbstractC3500.m6007(obj, this.field, arguments, interpreter, callStack2, r5);
        } catch (UtilEvalError e3) {
            e = e3;
        }
        r7 = e;
        r52 = r5;
        throw r7.toEvalError(r52, callStack2);
    }

    private Object doNewInner(Object obj, boolean z, CallStack callStack, Interpreter interpreter) {
        BSHAllocationExpression bSHAllocationExpression = (BSHAllocationExpression) jjtGetChild(0);
        if (!AbstractC3500.m5992(obj.getClass())) {
            return bSHAllocationExpression.constructFromEnclosingInstance(obj, callStack, interpreter);
        }
        callStack.pop();
        callStack.push(AbstractC3500.m6004(obj));
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
            Object objM6013 = AbstractC3500.m6013(obj, (String) objEval);
            return objM6013 == null ? Primitive.NULL : Primitive.unwrap(objM6013);
        } catch (ReflectError e) {
            throw new EvalError(AbstractC0900.m713(objEval, "No such property: "), this, callStack, e);
        }
    }

    public static int getIndexAux(Object obj, int i, CallStack callStack, Interpreter interpreter, InterfaceC3452 interfaceC3452) throws EvalError {
        try {
            Object objEval = interfaceC3452.jjtGetChild(i).eval(callStack, interpreter);
            boolean z = objEval instanceof Primitive;
            Class cls = Integer.TYPE;
            if (!z) {
                objEval = AbstractC3495.m5933(objEval, cls, 1);
            }
            return ((Integer) Primitive.castWrapper(cls, objEval)).intValue();
        } catch (Exception e) {
            Interpreter.debug("doIndex: " + e);
            throw new EvalError("Array index does not evaluate to an integer.", interfaceC3452, callStack, e);
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
        if (obj instanceof InterfaceC3452) {
            obj = obj instanceof BSHAmbiguousName ? ((BSHAmbiguousName) obj).toObject(callStack, interpreter) : ((InterfaceC3452) obj).eval(callStack, interpreter);
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
                return i == 3 ? AbstractC0900.m711(new StringBuilder(), super.toString(), ":PROPERTY {}") : i == 4 ? AbstractC0900.m711(new StringBuilder(), super.toString(), ":NEW new") : i == 6 ? AbstractC0900.m711(new StringBuilder(), super.toString(), ":CLASS class") : AbstractC0900.m711(new StringBuilder(), super.toString(), ":NO OPERATION");
            }
            return super.toString() + ":NAME " + this.field;
        }
        return super.toString() + ":INDEX [" + this.hasLeftIndex + ":" + this.slice + " " + this.hasRightIndex + ":" + this.step + "]";
    }
}
