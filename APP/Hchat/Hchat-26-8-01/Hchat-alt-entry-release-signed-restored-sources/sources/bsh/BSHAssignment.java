package bsh;

import okhttp3.HttpUrl;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHAssignment extends SimpleNode implements ParserConstants {
    private static final long serialVersionUID = 1;
    public Integer operator;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHAssignment(int i9) {
        super(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Object operation(Object obj, Object obj2, int i9) throws UtilEvalError {
        if ((obj instanceof String) || obj.getClass().isArray()) {
            return Operators.arbitraryObjectsBinaryOperation(obj, obj2, i9);
        }
        if (obj2 == Primitive.NULL) {
            throw new UtilEvalError("Illegal use of null object or 'null' literal");
        }
        if (((obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Number) || (obj instanceof Primitive)) && ((obj2 instanceof Boolean) || (obj2 instanceof Character) || (obj2 instanceof Number) || (obj2 instanceof Primitive))) {
            return Operators.binaryOperation(obj, obj2, i9);
        }
        StringBuilder sb2 = new StringBuilder("Non primitive value in operator: ");
        sb2.append(obj.getClass());
        String str = ParserConstants.tokenImage[i9];
        Class<?> cls = obj2.getClass();
        sb2.append(" ");
        sb2.append(str);
        sb2.append(" ");
        sb2.append(cls);
        throw new UtilEvalError(sb2.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalError {
        Object value;
        if (this.operator == null) {
            try {
                return jjtGetChild(0).eval(callStack, interpreter);
            } catch (SafeNavigate unused) {
                return Primitive.NULL;
            }
        }
        BSHPrimaryExpression bSHPrimaryExpression = (BSHPrimaryExpression) jjtGetChild(0);
        boolean strictJava = interpreter.getStrictJava();
        LHS lhs = bSHPrimaryExpression.toLHS(callStack, interpreter);
        if (this.operator.intValue() != 85) {
            try {
                value = lhs.getValue();
            } catch (UtilEvalError e6) {
                throw e6.toEvalError(this, callStack);
            }
        } else {
            value = null;
        }
        if (this.operator.intValue() == 146 && Primitive.NULL != value) {
            return value;
        }
        Object objEval = jjtGetChild(1).eval(callStack, interpreter);
        if (objEval == Primitive.VOID) {
            throw new EvalException("illegal void assignment", this, callStack);
        }
        try {
            int iIntValue = this.operator.intValue();
            if (iIntValue == 85) {
                if (!lhs.isFinal()) {
                    return lhs.assign(objEval, strictJava);
                }
                lhs.getVariable().setValue(objEval, 1);
                return objEval;
            }
            if (iIntValue == 146) {
                return lhs.assign(objEval, strictJava);
            }
            switch (iIntValue) {
                case 124:
                    if (Primitive.NULL == value && lhs.getType() == String.class) {
                        value = "null";
                    }
                    return lhs.assign(operation(value, objEval, 104), strictJava);
                case 125:
                    return lhs.assign(operation(value, objEval, 105), strictJava);
                case 126:
                    return lhs.assign(operation(value, objEval, 106), strictJava);
                case 127:
                    return lhs.assign(operation(value, objEval, 107), strictJava);
                case 128:
                case 129:
                    return lhs.assign(operation(value, objEval, 108), strictJava);
                case 130:
                case 131:
                    return lhs.assign(operation(value, objEval, 110), strictJava);
                case 132:
                case 133:
                    return lhs.assign(operation(value, objEval, 112), strictJava);
                case 134:
                case 135:
                    return lhs.assign(operation(value, objEval, 114), strictJava);
                case 136:
                case 137:
                    return lhs.assign(operation(value, objEval, 116), strictJava);
                case 138:
                case 139:
                    return lhs.assign(operation(value, objEval, 118), strictJava);
                case 140:
                case 141:
                    return lhs.assign(operation(value, objEval, 120), strictJava);
                case 142:
                case 143:
                    return lhs.assign(operation(value, objEval, 122), strictJava);
                default:
                    throw new InterpreterError("unimplemented operator in assignment BSH");
            }
        } catch (UtilEvalError e7) {
            throw e7.toEvalError(this, callStack);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (this.operator == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str = ": " + ParserConstants.tokenImage[this.operator.intValue()];
        }
        sb2.append(str);
        return sb2.toString();
    }
}
