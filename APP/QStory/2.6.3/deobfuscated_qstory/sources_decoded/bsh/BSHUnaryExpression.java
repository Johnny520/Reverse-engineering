package bsh;

import androidx.activity.AbstractC0053;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BSHUnaryExpression extends SimpleNode implements InterfaceC2615 {
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
            throw new UtilEvalError(AbstractC0053.m151(new StringBuilder("Unary operation "), InterfaceC2615.f7848[i], " inappropriate for object"));
        }
        Primitive primitive = (Primitive) obj;
        List list = AbstractC2618.f7850;
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
        Number numberM5286 = AbstractC2618.m5286(primitive.getValue());
        if (numberM5286 instanceof Integer) {
            int iIntValue = ((Integer) numberM5286).intValue();
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
                        C2633.m5342("bad integer unaryOperation");
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
        if (numberM5286 instanceof Long) {
            long jLongValue = numberM5286.longValue();
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
                        C2633.m5342("bad long unaryOperation");
                        return null;
                }
            } else {
                jLongValue = ~jLongValue;
            }
            return new Primitive(jLongValue);
        }
        if (numberM5286 instanceof Float) {
            float fFloatValue = numberM5286.floatValue();
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
                    C2633.m5342("bad float unaryOperation");
                    return null;
            }
            return new Primitive(fFloatValue);
        }
        if (numberM5286 instanceof Double) {
            double dDoubleValue = numberM5286.doubleValue();
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
                    C2633.m5342("bad double unaryOperation");
                    return null;
            }
            return new Primitive(dDoubleValue);
        }
        if (numberM5286 instanceof BigInteger) {
            BigInteger bigIntegerNot = (BigInteger) numberM5286;
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
                        C2633.m5342("bad big integer unaryOperation");
                        return null;
                }
            } else {
                bigIntegerNot = bigIntegerNot.not();
            }
            return new Primitive(bigIntegerNot);
        }
        if (!(numberM5286 instanceof BigDecimal)) {
            C2633.m5342("An error occurred.  Please call technical support.");
            return null;
        }
        BigDecimal bigDecimalNegate = (BigDecimal) numberM5286;
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
                    C2633.m5342("bad big decimal unaryOperation");
                    return null;
            }
        } else if (bigDecimalNegate.signum() == 1) {
            bigDecimalNegate = bigDecimalNegate.negate();
        }
        return new Primitive(bigDecimalNegate);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalError {
        InterfaceC2619 interfaceC2619JjtGetChild = jjtGetChild(0);
        try {
            int i = this.kind;
            if (i != 102 && i != 103) {
                return unaryOperation(interfaceC2619JjtGetChild.eval(callStack, interpreter), this.kind);
            }
            return lhsUnaryOperation(((BSHPrimaryExpression) interfaceC2619JjtGetChild).toLHS(callStack, interpreter), interpreter.getStrictJava());
        } catch (UtilEvalError e) {
            throw e.toEvalError(this, callStack);
        }
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + InterfaceC2615.f7848[this.kind];
    }
}
