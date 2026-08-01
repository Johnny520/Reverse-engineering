package bsh;

import androidx.activity.AbstractC0900;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* JADX INFO: renamed from: bsh.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3451 implements InterfaceC3448 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final List f8195 = Arrays.asList(104, 105, 106, 116);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final List f8194 = Arrays.asList(88, 89, 86, 87, 92, 93, 94, 95, 96, 97);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Number m5846(Object obj) {
        return obj instanceof Character ? Integer.valueOf(((Character) obj).charValue()) : ((obj instanceof Byte) || (obj instanceof Short)) ? Integer.valueOf(((Number) obj).intValue()) : (Number) obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static Object m5847(Object obj, int i, Object obj2) throws UtilEvalError {
        if (i == 145) {
            return Integer.valueOf(((Comparable) obj).compareTo(obj2));
        }
        if (obj instanceof Boolean) {
            Boolean bool = (Boolean) obj2;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            boolean zBooleanValue2 = bool.booleanValue();
            if (i == 92) {
                return Boolean.valueOf(zBooleanValue == zBooleanValue2);
            }
            switch (i) {
                case 97:
                    return Boolean.valueOf(zBooleanValue != zBooleanValue2);
                case 98:
                case 99:
                case 100:
                case 101:
                    return bool;
                default:
                    switch (i) {
                        case 108:
                        case 109:
                            return Boolean.valueOf(zBooleanValue & zBooleanValue2);
                        case 110:
                        case 111:
                            return Boolean.valueOf(zBooleanValue | zBooleanValue2);
                        case 112:
                        case 113:
                            return Boolean.valueOf(zBooleanValue ^ zBooleanValue2);
                        default:
                            C3466.m5902("unimplemented binary operator");
                            return null;
                    }
            }
        }
        if (f8194.contains(Integer.valueOf(i))) {
            Comparable comparable = (Comparable) obj;
            switch (i) {
                case 86:
                case 87:
                    return Boolean.valueOf(comparable.compareTo(obj2) > 0);
                case 88:
                case 89:
                    return Boolean.valueOf(comparable.compareTo(obj2) < 0);
                case 90:
                case 91:
                case 92:
                default:
                    return Boolean.valueOf(comparable.compareTo(obj2) == 0);
                case 93:
                case 94:
                    return Boolean.valueOf(comparable.compareTo(obj2) <= 0);
                case 95:
                case 96:
                    return Boolean.valueOf(comparable.compareTo(obj2) >= 0);
                case 97:
                    return Boolean.valueOf(comparable.compareTo(obj2) != 0);
            }
        }
        if (obj instanceof BigInteger) {
            return m5849((BigInteger) obj, (BigInteger) obj2, i);
        }
        if (obj instanceof BigDecimal) {
            return m5850((BigDecimal) obj, (BigDecimal) obj2, i);
        }
        boolean zM5950 = AbstractC3495.m5950(obj);
        List list = f8195;
        if (!zM5950) {
            if (!(obj instanceof Number)) {
                throw new UtilEvalError("Invalid types in binary operator");
            }
            long jLongValue = ((Long) obj).longValue();
            long jLongValue2 = ((Long) obj2).longValue();
            switch (i) {
                case 104:
                    if (jLongValue <= 0 || Long.MAX_VALUE - jLongValue >= jLongValue2) {
                        return Long.valueOf(jLongValue + jLongValue2);
                    }
                    break;
                case 105:
                    if (jLongValue >= 0 || Long.MIN_VALUE - jLongValue <= (-jLongValue2)) {
                        return Long.valueOf(jLongValue - jLongValue2);
                    }
                    break;
                case 106:
                    if (jLongValue == 0 || Long.MAX_VALUE / jLongValue >= jLongValue2) {
                        return Long.valueOf(jLongValue * jLongValue2);
                    }
                    break;
                case 107:
                    return Long.valueOf(jLongValue / jLongValue2);
                case 108:
                case 109:
                    return Long.valueOf(jLongValue & jLongValue2);
                case 110:
                case 111:
                    return Long.valueOf(jLongValue | jLongValue2);
                case 112:
                case 113:
                    return Long.valueOf(jLongValue ^ jLongValue2);
                case 114:
                case 115:
                    return Long.valueOf(jLongValue % jLongValue2);
                case 116:
                case 117:
                    double dPow = Math.pow(jLongValue, jLongValue2);
                    BigInteger bigInteger = BigDecimal.valueOf(dPow).toBigInteger();
                    if (bigInteger.compareTo(Primitive.LONG_MIN) >= 0 && bigInteger.compareTo(Primitive.LONG_MAX) <= 0) {
                        return Long.valueOf((long) dPow);
                    }
                    break;
                case 118:
                case 119:
                    return Long.valueOf(jLongValue << ((int) jLongValue2));
                case 120:
                case 121:
                    return Long.valueOf(jLongValue >> ((int) jLongValue2));
                case 122:
                case 123:
                    return Long.valueOf(jLongValue >>> ((int) jLongValue2));
            }
            if (list.contains(Integer.valueOf(i))) {
                return m5849(BigInteger.valueOf(jLongValue), BigInteger.valueOf(jLongValue2), i);
            }
            C3466.m5902("Unimplemented binary long operator");
            return null;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            float fFloatValue2 = ((Float) obj2).floatValue();
            switch (i) {
                case 104:
                    if (fFloatValue <= 0.0d || Float.MAX_VALUE - fFloatValue >= fFloatValue2) {
                        return Float.valueOf(fFloatValue + fFloatValue2);
                    }
                    break;
                case 105:
                    if (fFloatValue >= 0.0d || (-3.4028235E38f) - fFloatValue <= (-fFloatValue2)) {
                        return Float.valueOf(fFloatValue - fFloatValue2);
                    }
                    break;
                case 106:
                    if (fFloatValue == 0.0f || Float.MAX_VALUE / fFloatValue >= fFloatValue2) {
                        return Float.valueOf(fFloatValue * fFloatValue2);
                    }
                    break;
                case 107:
                    return Float.valueOf(fFloatValue / fFloatValue2);
                default:
                    switch (i) {
                        case 114:
                        case 115:
                            return Float.valueOf(fFloatValue % fFloatValue2);
                        case 116:
                        case 117:
                            double dPow2 = Math.pow(fFloatValue, fFloatValue2);
                            if (!Double.isInfinite(dPow2)) {
                                return Double.valueOf(dPow2);
                            }
                            break;
                        case 118:
                        case 119:
                        case 120:
                        case 121:
                        case 122:
                        case 123:
                            throw new UtilEvalError("Can't shift floatingpoint values");
                    }
                    break;
            }
            if (list.contains(Integer.valueOf(i))) {
                return m5850(BigDecimal.valueOf(fFloatValue), BigDecimal.valueOf(fFloatValue2), i);
            }
            C3466.m5902("Unimplemented binary double operator");
            return null;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        double dDoubleValue2 = ((Double) obj2).doubleValue();
        switch (i) {
            case 104:
                if (dDoubleValue <= 0.0d || Double.MAX_VALUE - dDoubleValue >= dDoubleValue2) {
                    return Double.valueOf(dDoubleValue + dDoubleValue2);
                }
                break;
            case 105:
                if (dDoubleValue >= 0.0d || (-1.7976931348623157E308d) - dDoubleValue <= (-dDoubleValue2)) {
                    return Double.valueOf(dDoubleValue - dDoubleValue2);
                }
                break;
            case 106:
                if (dDoubleValue == 0.0d || Double.MAX_VALUE / dDoubleValue >= dDoubleValue2) {
                    return Double.valueOf(dDoubleValue * dDoubleValue2);
                }
                break;
            case 107:
                return Double.valueOf(dDoubleValue / dDoubleValue2);
            default:
                switch (i) {
                    case 114:
                    case 115:
                        return Double.valueOf(dDoubleValue % dDoubleValue2);
                    case 116:
                    case 117:
                        double dPow3 = Math.pow(dDoubleValue, dDoubleValue2);
                        if (!Double.isInfinite(dPow3)) {
                            return Double.valueOf(dPow3);
                        }
                        break;
                    case 118:
                    case 119:
                    case 120:
                    case 121:
                    case 122:
                    case 123:
                        throw new UtilEvalError("Can't shift floatingpoint values");
                }
                break;
        }
        if (list.contains(Integer.valueOf(i))) {
            return m5850(BigDecimal.valueOf(dDoubleValue), BigDecimal.valueOf(dDoubleValue2), i);
        }
        C3466.m5902("Unimplemented binary double operator");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Object m5848(Object obj, int i, Object obj2) throws UtilEvalError {
        Object objUnwrap = Primitive.unwrap(obj);
        Object objUnwrap2 = Primitive.unwrap(obj2);
        if (AbstractC3495.m5943(objUnwrap) && AbstractC3495.m5943(objUnwrap2)) {
            Number numberM5846 = m5846(objUnwrap);
            Number numberM58462 = m5846(objUnwrap2);
            if (objUnwrap instanceof BigDecimal) {
                if (!(objUnwrap2 instanceof BigDecimal)) {
                    objUnwrap2 = Primitive.castNumber(BigDecimal.class, numberM58462);
                }
            } else if (objUnwrap2 instanceof BigDecimal) {
                objUnwrap = Primitive.castNumber(BigDecimal.class, numberM5846);
            } else if (AbstractC3495.m5950(objUnwrap) || AbstractC3495.m5950(objUnwrap2)) {
                if (!(objUnwrap instanceof Float) || !(objUnwrap2 instanceof Float)) {
                    if (!(objUnwrap instanceof Double)) {
                        objUnwrap = Double.valueOf(numberM5846.doubleValue());
                    }
                    if (!(objUnwrap2 instanceof Double)) {
                        objUnwrap2 = Double.valueOf(numberM58462.doubleValue());
                    }
                }
            } else if (objUnwrap instanceof BigInteger) {
                if (!(objUnwrap2 instanceof BigInteger)) {
                    objUnwrap2 = Primitive.castNumber(BigInteger.class, numberM58462);
                }
            } else if (objUnwrap2 instanceof BigInteger) {
                objUnwrap = Primitive.castNumber(BigInteger.class, numberM5846);
            } else {
                if (!(objUnwrap instanceof Long)) {
                    objUnwrap = Long.valueOf(numberM5846.longValue());
                }
                if (!(objUnwrap2 instanceof Long)) {
                    objUnwrap2 = Long.valueOf(numberM58462.longValue());
                }
            }
            Object[] objArr = {objUnwrap, objUnwrap2};
            Object obj3 = objArr[0];
            objUnwrap2 = objArr[1];
            objUnwrap = obj3;
        }
        if (objUnwrap.getClass() == objUnwrap2.getClass()) {
            try {
                Object objM5847 = m5847(objUnwrap, i, objUnwrap2);
                return objM5847 instanceof Boolean ? ((Boolean) objM5847).booleanValue() ? Primitive.TRUE : Primitive.FALSE : ((obj instanceof Primitive) && (obj2 instanceof Primitive)) ? (AbstractC3495.m5950(objM5847) && objUnwrap.getClass() == BigDecimal.class) ? Primitive.wrap(objM5847, objM5847.getClass()) : Primitive.shrinkWrap(objM5847) : Primitive.shrinkWrap(objM5847).getValue();
            } catch (ArithmeticException e) {
                throw new UtilTargetError("Arithemetic Exception in binary op", e);
            }
        }
        StringBuilder sb = new StringBuilder("Type mismatch in operator.  ");
        sb.append(objUnwrap.getClass());
        Class<?> cls = objUnwrap2.getClass();
        sb.append(" cannot be used with ");
        sb.append(cls);
        throw new UtilEvalError(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static BigInteger m5849(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        switch (i) {
            case 104:
                return bigInteger.add(bigInteger2);
            case 105:
                return bigInteger.subtract(bigInteger2);
            case 106:
                return bigInteger.multiply(bigInteger2);
            case 107:
                return bigInteger.divide(bigInteger2);
            case 108:
            case 109:
                return bigInteger.and(bigInteger2);
            case 110:
            case 111:
                return bigInteger.or(bigInteger2);
            case 112:
            case 113:
                return bigInteger.xor(bigInteger2);
            case 114:
            case 115:
                return bigInteger.mod(bigInteger2);
            case 116:
            case 117:
                return bigInteger.pow(bigInteger2.intValue());
            case 118:
            case 119:
                return bigInteger.shiftLeft(bigInteger2.intValue());
            case 120:
            case 121:
                return bigInteger.shiftRight(bigInteger2.intValue());
            case 122:
            case 123:
                if (bigInteger.signum() >= 0) {
                    return bigInteger.shiftRight(bigInteger2.intValue());
                }
                BigInteger bigInteger3 = BigInteger.ONE;
                BigInteger bigIntegerShiftLeft = bigInteger3.shiftLeft(bigInteger.toString(2).length() + 1);
                BigInteger bigIntegerSubtract = bigInteger.subtract(bigIntegerShiftLeft);
                return bigIntegerSubtract.shiftRight(bigInteger2.intValue()).and(bigIntegerShiftLeft.subtract(bigInteger3).shiftRight(bigInteger2.intValue() + 1));
            default:
                C3466.m5902("Unimplemented binary integer operator");
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static BigDecimal m5850(BigDecimal bigDecimal, BigDecimal bigDecimal2, int i) throws UtilEvalError {
        switch (i) {
            case 104:
                return bigDecimal.add(bigDecimal2);
            case 105:
                return bigDecimal.subtract(bigDecimal2);
            case 106:
                return bigDecimal.multiply(bigDecimal2);
            case 107:
                return bigDecimal.divide(bigDecimal2);
            default:
                switch (i) {
                    case 114:
                    case 115:
                        return bigDecimal.remainder(bigDecimal2);
                    case 116:
                    case 117:
                        return bigDecimal.pow(bigDecimal2.intValue());
                    case 118:
                    case 119:
                    case 120:
                    case 121:
                    case 122:
                    case 123:
                        throw new UtilEvalError("Can't shift floatingpoint values");
                    default:
                        C3466.m5902("Unimplemented binary float operator");
                        return null;
                }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Object m5851(Object obj, int i, Object obj2) throws UtilEvalError {
        String[] strArr = InterfaceC3448.f8193;
        if (i == 92) {
            return obj == obj2 ? Primitive.TRUE : Primitive.FALSE;
        }
        if (i == 97) {
            return obj != obj2 ? Primitive.TRUE : Primitive.FALSE;
        }
        Primitive primitive = Primitive.VOID;
        if (obj == primitive || obj2 == primitive) {
            throw new UtilEvalError("illegal use of undefined variable, class, or 'void' literal");
        }
        int i2 = 0;
        Class cls = Integer.TYPE;
        if (i == 145) {
            int iCompare = ((obj instanceof Comparable) || (obj2 instanceof Comparable)) ? Comparator.nullsFirst(Comparator.naturalOrder()).compare((Comparable) Primitive.unwrap(obj), (Comparable) Primitive.unwrap(obj2)) : Comparator.nullsFirst(Comparator.comparing(new C3474(13))).compare(Primitive.unwrap(obj), Primitive.unwrap(obj2));
            if (iCompare < 0) {
                i2 = -1;
            } else if (iCompare > 0) {
                i2 = 1;
            }
            return Primitive.wrap(Integer.valueOf(i2), (Class<?>) cls);
        }
        if (i == 104) {
            if ((obj instanceof String) || (obj2 instanceof String)) {
                return BSHLiteral.internStrings ? String.valueOf(obj).concat(String.valueOf(obj2)).intern() : String.valueOf(obj).concat(String.valueOf(obj2));
            }
            if (obj.getClass().isArray() && (obj2 instanceof List)) {
                obj2 = ((List) obj2).toArray();
            }
            if (obj.getClass().isArray() && obj2.getClass().isArray()) {
                Class<?> cls2 = obj.getClass();
                Class<?> cls3 = obj2.getClass();
                if (AbstractC3495.m5937(cls2) == AbstractC3495.m5937(cls3)) {
                    Class clsM5951 = AbstractC3495.m5951(AbstractC3495.m5936(cls2), AbstractC3495.m5936(cls3));
                    int[] iArrM5882 = AbstractC3462.m5882(obj);
                    iArrM5882[0] = Array.getLength(obj2) + Array.getLength(obj);
                    Object objNewInstance = Array.newInstance((Class<?>) clsM5951, iArrM5882);
                    AbstractC3462.m5883(clsM5951, objNewInstance, obj, obj2);
                    return objNewInstance;
                }
                throw new UtilEvalError("Cannot concat arrays with inconsistent dimensions. Attempting to concat array of type " + AbstractC3462.m5888(obj) + " with array of type " + AbstractC3462.m5888(obj2) + ".");
            }
            boolean z = obj instanceof List;
            if (z && obj2.getClass().isArray()) {
                obj2 = AbstractC3495.m5933(obj2, List.class, 0);
            }
            if (z && (obj2 instanceof List)) {
                List list = (List) obj;
                List list2 = (List) obj2;
                List linkedList = list instanceof Queue ? new LinkedList(list) : new ArrayList(list);
                linkedList.addAll(list2);
                return linkedList;
            }
        }
        if (i == 106) {
            if (obj.getClass().isArray()) {
                return AbstractC3462.m5892(((Integer) Primitive.castWrapper(cls, obj2)).intValue(), obj);
            }
            if (obj2.getClass().isArray()) {
                return AbstractC3462.m5892(((Integer) Primitive.castWrapper(cls, obj)).intValue(), obj2);
            }
            if (obj instanceof List) {
                return AbstractC3462.m5893(((Integer) Primitive.castWrapper(cls, obj2)).intValue(), (List) obj);
            }
            if (obj2 instanceof List) {
                return AbstractC3462.m5893(((Integer) Primitive.castWrapper(cls, obj)).intValue(), (List) obj2);
            }
            try {
                if (obj instanceof String) {
                    return BSHLiteral.internStrings ? new String(new char[((Integer) Primitive.castWrapper(cls, obj2)).intValue()]).replace("\u0000", String.valueOf(obj)).intern() : new String(new char[((Integer) Primitive.castWrapper(cls, obj2)).intValue()]).replace("\u0000", String.valueOf(obj));
                }
                if (obj2 instanceof String) {
                    return BSHLiteral.internStrings ? new String(new char[((Integer) Primitive.castWrapper(cls, obj)).intValue()]).replace("\u0000", String.valueOf(obj2)).intern() : new String(new char[((Integer) Primitive.castWrapper(cls, obj)).intValue()]).replace("\u0000", String.valueOf(obj2));
                }
            } catch (NegativeArraySizeException e) {
                throw new UtilEvalError("Negative repeat operand: " + e.getMessage(), e);
            }
        }
        if ((obj instanceof String) || (obj2 instanceof String)) {
            throw new UtilEvalError("Use of non + operator with String");
        }
        if (obj.getClass().isArray() || obj2.getClass().isArray() || (obj instanceof List) || (obj2 instanceof List)) {
            throw new UtilEvalError(AbstractC0900.m711(new StringBuilder("Use of invalid operator "), strArr[i], " with array or List type"));
        }
        Primitive primitive2 = Primitive.NULL;
        if (obj == primitive2 || obj2 == primitive2) {
            throw new UtilEvalError("illegal use of null value or 'null' literal");
        }
        throw new UtilEvalError(AbstractC0900.m711(new StringBuilder("Operator: "), strArr[i], " inappropriate for objects"));
    }
}
