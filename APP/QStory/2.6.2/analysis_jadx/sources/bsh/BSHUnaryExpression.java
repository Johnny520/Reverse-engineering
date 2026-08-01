package bsh;

import androidx.activity.AbstractC0053;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class BSHUnaryExpression extends SimpleNode implements InterfaceC2614 {
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
            throw new UtilEvalError(AbstractC0053.m146(new StringBuilder("Unary operation "), InterfaceC2614.f7846[i], " inappropriate for object"));
        }
        Primitive primitive = (Primitive) obj;
        List list = AbstractC2617.f7848;
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
        Number numberM5241 = AbstractC2617.m5241(primitive.getValue());
        if (numberM5241 instanceof Integer) {
            int iIntValue = ((Integer) numberM5241).intValue();
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
                        C2632.m5297("bad integer unaryOperation");
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
        if (numberM5241 instanceof Long) {
            long jLongValue = numberM5241.longValue();
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
                        C2632.m5297("bad long unaryOperation");
                        return null;
                }
            } else {
                jLongValue = ~jLongValue;
            }
            return new Primitive(jLongValue);
        }
        if (numberM5241 instanceof Float) {
            float fFloatValue = numberM5241.floatValue();
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
                    C2632.m5297("bad float unaryOperation");
                    return null;
            }
            return new Primitive(fFloatValue);
        }
        if (numberM5241 instanceof Double) {
            double dDoubleValue = numberM5241.doubleValue();
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
                    C2632.m5297("bad double unaryOperation");
                    return null;
            }
            return new Primitive(dDoubleValue);
        }
        if (numberM5241 instanceof BigInteger) {
            BigInteger bigIntegerNot = (BigInteger) numberM5241;
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
                        C2632.m5297("bad big integer unaryOperation");
                        return null;
                }
            } else {
                bigIntegerNot = bigIntegerNot.not();
            }
            return new Primitive(bigIntegerNot);
        }
        if (!(numberM5241 instanceof BigDecimal)) {
            C2632.m5297("An error occurred.  Please call technical support.");
            return null;
        }
        BigDecimal bigDecimalNegate = (BigDecimal) numberM5241;
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
                    C2632.m5297("bad big decimal unaryOperation");
                    return null;
            }
        } else if (bigDecimalNegate.signum() == 1) {
            bigDecimalNegate = bigDecimalNegate.negate();
        }
        return new Primitive(bigDecimalNegate);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalError {
        InterfaceC2618 interfaceC2618JjtGetChild = jjtGetChild(0);
        try {
            int i = this.kind;
            if (i != 102 && i != 103) {
                return unaryOperation(interfaceC2618JjtGetChild.eval(callStack, interpreter), this.kind);
            }
            return lhsUnaryOperation(((BSHPrimaryExpression) interfaceC2618JjtGetChild).toLHS(callStack, interpreter), interpreter.getStrictJava());
        } catch (UtilEvalError e) {
            throw e.toEvalError(this, callStack);
        }
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + InterfaceC2614.f7846[this.kind];
    }
}
