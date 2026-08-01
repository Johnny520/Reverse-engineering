package bsh;

import androidx.activity.AbstractC0900;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BSHUnaryExpression extends SimpleNode implements InterfaceC3448 {
    public int kind;
    public boolean postfix;

    public BSHUnaryExpression(int i) {
        super(i);
        this.postfix = false;
    }

    private Object lhsUnaryOperation(LHS lhs, boolean z) throws UtilEvalError {
        Interpreter.debug("lhsUnaryOperation");
        Object value = lhs.getValue();
        Object objUnaryOperation = unaryOperation(value, this.kind);
        if (!this.postfix) {
            value = objUnaryOperation;
        }
        lhs.assign(objUnaryOperation, z);
        return value;
    }

    private Object unaryOperation(Object obj, int i) throws UtilEvalError {
        if (obj instanceof Boolean) {
            obj = ((Boolean) obj).booleanValue() ? Primitive.TRUE : Primitive.FALSE;
        }
        if (!(obj instanceof Primitive)) {
            throw new UtilEvalError(AbstractC0900.m711(new StringBuilder("Unary operation "), InterfaceC3448.f8193[i], " inappropriate for object"));
        }
        Primitive primitive = (Primitive) obj;
        List list = AbstractC3451.f8195;
        if (primitive == Primitive.NULL) {
            throw new UtilEvalError("illegal use of null object or 'null' literal");
        }
        if (primitive == Primitive.VOID) {
            throw new UtilEvalError("illegal use of undefined object or 'void' literal");
        }
        Class<?> type = primitive.getType();
        if (type == Boolean.TYPE) {
            boolean zBooleanValue = ((Boolean) primitive.getValue()).booleanValue();
            if (i == 90) {
                return !zBooleanValue ? Primitive.TRUE : Primitive.FALSE;
            }
            throw new UtilEvalError("Operator inappropriate for boolean");
        }
        Number numberM5846 = AbstractC3451.m5846(primitive.getValue());
        if (numberM5846 instanceof Integer) {
            int iIntValue = ((Integer) numberM5846).intValue();
            if (i != 91) {
                switch (i) {
                    case 102:
                        iIntValue++;
                        break;
                    case 103:
                        iIntValue--;
                        break;
                    case 104:
                        break;
                    case 105:
                        iIntValue = -iIntValue;
                        break;
                    default:
                        C3466.m5902("bad integer unaryOperation");
                        return null;
                }
            } else {
                iIntValue = ~iIntValue;
            }
            if (i == 102 || i == 103) {
                if (type == Byte.TYPE) {
                    return new Primitive((byte) iIntValue);
                }
                if (type == Short.TYPE) {
                    return new Primitive((short) iIntValue);
                }
                if (type == Character.TYPE) {
                    return new Primitive((char) iIntValue);
                }
            }
            return new Primitive(iIntValue);
        }
        if (numberM5846 instanceof Long) {
            long jLongValue = numberM5846.longValue();
            if (i != 91) {
                switch (i) {
                    case 102:
                        jLongValue++;
                        break;
                    case 103:
                        jLongValue--;
                        break;
                    case 104:
                        break;
                    case 105:
                        jLongValue = -jLongValue;
                        break;
                    default:
                        C3466.m5902("bad long unaryOperation");
                        return null;
                }
            } else {
                jLongValue = ~jLongValue;
            }
            return new Primitive(jLongValue);
        }
        if (numberM5846 instanceof Float) {
            float fFloatValue = numberM5846.floatValue();
            switch (i) {
                case 102:
                    fFloatValue += 1.0f;
                    break;
                case 103:
                    fFloatValue -= 1.0f;
                    break;
                case 104:
                    break;
                case 105:
                    fFloatValue = -fFloatValue;
                    break;
                default:
                    C3466.m5902("bad float unaryOperation");
                    return null;
            }
            return new Primitive(fFloatValue);
        }
        if (numberM5846 instanceof Double) {
            double dDoubleValue = numberM5846.doubleValue();
            switch (i) {
                case 102:
                    dDoubleValue += 1.0d;
                    break;
                case 103:
                    dDoubleValue -= 1.0d;
                    break;
                case 104:
                    break;
                case 105:
                    dDoubleValue = -dDoubleValue;
                    break;
                default:
                    C3466.m5902("bad double unaryOperation");
                    return null;
            }
            return new Primitive(dDoubleValue);
        }
        if (numberM5846 instanceof BigInteger) {
            BigInteger bigIntegerNot = (BigInteger) numberM5846;
            if (i != 91) {
                switch (i) {
                    case 102:
                        bigIntegerNot = bigIntegerNot.add(BigInteger.ONE);
                        break;
                    case 103:
                        bigIntegerNot = bigIntegerNot.subtract(BigInteger.ONE);
                        break;
                    case 104:
                        break;
                    case 105:
                        bigIntegerNot = bigIntegerNot.negate();
                        break;
                    default:
                        C3466.m5902("bad big integer unaryOperation");
                        return null;
                }
            } else {
                bigIntegerNot = bigIntegerNot.not();
            }
            return new Primitive(bigIntegerNot);
        }
        if (!(numberM5846 instanceof BigDecimal)) {
            C3466.m5902("An error occurred.  Please call technical support.");
            return null;
        }
        BigDecimal bigDecimalNegate = (BigDecimal) numberM5846;
        if (i != 91) {
            switch (i) {
                case 102:
                    bigDecimalNegate = bigDecimalNegate.add(BigDecimal.ONE);
                    break;
                case 103:
                    bigDecimalNegate = bigDecimalNegate.subtract(BigDecimal.ONE);
                    break;
                case 104:
                    break;
                case 105:
                    bigDecimalNegate = bigDecimalNegate.negate();
                    break;
                default:
                    C3466.m5902("bad big decimal unaryOperation");
                    return null;
            }
        } else if (bigDecimalNegate.signum() == 1) {
            bigDecimalNegate = bigDecimalNegate.negate();
        }
        return new Primitive(bigDecimalNegate);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalError {
        InterfaceC3452 interfaceC3452JjtGetChild = jjtGetChild(0);
        try {
            int i = this.kind;
            if (i != 102 && i != 103) {
                return unaryOperation(interfaceC3452JjtGetChild.eval(callStack, interpreter), this.kind);
            }
            return lhsUnaryOperation(((BSHPrimaryExpression) interfaceC3452JjtGetChild).toLHS(callStack, interpreter), interpreter.getStrictJava());
        } catch (UtilEvalError e) {
            throw e.toEvalError(this, callStack);
        }
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + InterfaceC3448.f8193[this.kind];
    }
}
