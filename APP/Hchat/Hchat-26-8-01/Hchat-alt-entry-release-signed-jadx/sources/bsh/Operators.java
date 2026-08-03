package bsh;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class Operators implements ParserConstants {
    private static final List<Integer> OVERFLOW_OPS = Arrays.asList(104, 105, 106, 116);
    private static final List<Integer> COMPARABLE_OPS = Arrays.asList(88, 89, 86, 87, 92, 93, 94, 95, 96, 97);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Operators() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object arbitraryObjectsBinaryOperation(Object obj, Object obj2, int i9) throws UtilEvalError {
        if (i9 == 92) {
            return obj == obj2 ? Primitive.TRUE : Primitive.FALSE;
        }
        if (i9 == 97) {
            return obj != obj2 ? Primitive.TRUE : Primitive.FALSE;
        }
        Primitive primitive = Primitive.VOID;
        if (obj == primitive || obj2 == primitive) {
            throw new UtilEvalError("illegal use of undefined variable, class, or 'void' literal");
        }
        int i10 = 0;
        Class cls = Integer.TYPE;
        if (i9 == 145) {
            int iCompare = ((obj instanceof Comparable) || (obj2 instanceof Comparable)) ? Comparator.nullsFirst(Comparator.naturalOrder()).compare((Comparable) Primitive.unwrap(obj), (Comparable) Primitive.unwrap(obj2)) : Comparator.nullsFirst(Comparator.comparing(new C0342b(13))).compare(Primitive.unwrap(obj), Primitive.unwrap(obj2));
            if (iCompare < 0) {
                i10 = -1;
            } else if (iCompare > 0) {
                i10 = 1;
            }
            return Primitive.wrap(Integer.valueOf(i10), (Class<?>) cls);
        }
        if (i9 == 104) {
            if ((obj instanceof String) || (obj2 instanceof String)) {
                return BSHLiteral.internStrings ? String.valueOf(obj).concat(String.valueOf(obj2)).intern() : String.valueOf(obj).concat(String.valueOf(obj2));
            }
            if (obj.getClass().isArray() && (obj2 instanceof List)) {
                obj2 = ((List) obj2).toArray();
            }
            if (obj.getClass().isArray() && obj2.getClass().isArray()) {
                return BshArray.concat(obj, obj2);
            }
            boolean z9 = obj instanceof List;
            if (z9 && obj2.getClass().isArray()) {
                obj2 = Types.castObject(obj2, List.class, 0);
            }
            if (z9 && (obj2 instanceof List)) {
                return BshArray.concat((List<?>) obj, (List<?>) obj2);
            }
        }
        if (i9 == 106) {
            if (obj.getClass().isArray()) {
                return BshArray.repeat(obj, ((Integer) Primitive.castWrapper(cls, obj2)).intValue());
            }
            if (obj2.getClass().isArray()) {
                return BshArray.repeat(obj2, ((Integer) Primitive.castWrapper(cls, obj)).intValue());
            }
            if (obj instanceof List) {
                return BshArray.repeat((List<Object>) obj, ((Integer) Primitive.castWrapper(cls, obj2)).intValue());
            }
            if (obj2 instanceof List) {
                return BshArray.repeat((List<Object>) obj2, ((Integer) Primitive.castWrapper(cls, obj)).intValue());
            }
            try {
                if (obj instanceof String) {
                    return BSHLiteral.internStrings ? new String(new char[((Integer) Primitive.castWrapper(cls, obj2)).intValue()]).replace("\u0000", String.valueOf(obj)).intern() : new String(new char[((Integer) Primitive.castWrapper(cls, obj2)).intValue()]).replace("\u0000", String.valueOf(obj));
                }
                if (obj2 instanceof String) {
                    return BSHLiteral.internStrings ? new String(new char[((Integer) Primitive.castWrapper(cls, obj)).intValue()]).replace("\u0000", String.valueOf(obj2)).intern() : new String(new char[((Integer) Primitive.castWrapper(cls, obj)).intValue()]).replace("\u0000", String.valueOf(obj2));
                }
            } catch (NegativeArraySizeException e6) {
                throw new UtilEvalError("Negative repeat operand: " + e6.getMessage(), e6);
            }
        }
        if ((obj instanceof String) || (obj2 instanceof String)) {
            throw new UtilEvalError("Use of non + operator with String");
        }
        if (obj.getClass().isArray() || obj2.getClass().isArray() || (obj instanceof List) || (obj2 instanceof List)) {
            throw new UtilEvalError(AbstractC0921a.m2255r(new StringBuilder("Use of invalid operator "), ParserConstants.tokenImage[i9], " with array or List type"));
        }
        Primitive primitive2 = Primitive.NULL;
        if (obj == primitive2 || obj2 == primitive2) {
            throw new UtilEvalError("illegal use of null value or 'null' literal");
        }
        throw new UtilEvalError(AbstractC0921a.m2255r(new StringBuilder("Operator: "), ParserConstants.tokenImage[i9], " inappropriate for objects"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object bigDecimalBinaryOperation(BigDecimal bigDecimal, BigDecimal bigDecimal2, int i9) throws UtilEvalError {
        switch (i9) {
            case 104:
                return bigDecimal.add(bigDecimal2);
            case 105:
                return bigDecimal.subtract(bigDecimal2);
            case 106:
                return bigDecimal.multiply(bigDecimal2);
            case 107:
                return bigDecimal.divide(bigDecimal2);
            default:
                switch (i9) {
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
                        C0353j.m1308f("Unimplemented binary float operator");
                        return null;
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static BigDecimal bigDecimalUnaryOperation(BigDecimal bigDecimal, int i9) {
        if (i9 == 91) {
            return bigDecimal.signum() == 1 ? bigDecimal.negate() : bigDecimal;
        }
        switch (i9) {
            case 102:
                return bigDecimal.add(BigDecimal.ONE);
            case 103:
                return bigDecimal.subtract(BigDecimal.ONE);
            case 104:
                return bigDecimal;
            case 105:
                return bigDecimal.negate();
            default:
                C0353j.m1308f("bad big decimal unaryOperation");
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object bigIntegerBinaryOperation(BigInteger bigInteger, BigInteger bigInteger2, int i9) {
        switch (i9) {
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
                C0353j.m1308f("Unimplemented binary integer operator");
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static BigInteger bigIntegerUnaryOperation(BigInteger bigInteger, int i9) {
        if (i9 == 91) {
            return bigInteger.not();
        }
        switch (i9) {
            case 102:
                return bigInteger.add(BigInteger.ONE);
            case 103:
                return bigInteger.subtract(BigInteger.ONE);
            case 104:
                return bigInteger;
            case 105:
                return bigInteger.negate();
            default:
                C0353j.m1308f("bad big integer unaryOperation");
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object binaryOperation(Object obj, Object obj2, int i9) throws UtilEvalError {
        Object objUnwrap = Primitive.unwrap(obj);
        Object objUnwrap2 = Primitive.unwrap(obj2);
        if (Types.isNumeric(objUnwrap) && Types.isNumeric(objUnwrap2)) {
            Object[] objArrPromotePrimitives = promotePrimitives(objUnwrap, objUnwrap2);
            Object obj3 = objArrPromotePrimitives[0];
            objUnwrap2 = objArrPromotePrimitives[1];
            objUnwrap = obj3;
        }
        if (objUnwrap.getClass() == objUnwrap2.getClass()) {
            try {
                Object objBinaryOperationImpl = binaryOperationImpl(objUnwrap, objUnwrap2, i9);
                return objBinaryOperationImpl instanceof Boolean ? ((Boolean) objBinaryOperationImpl).booleanValue() ? Primitive.TRUE : Primitive.FALSE : ((obj instanceof Primitive) && (obj2 instanceof Primitive)) ? (Types.isFloatingpoint(objBinaryOperationImpl) && objUnwrap.getClass() == BigDecimal.class) ? Primitive.wrap(objBinaryOperationImpl, objBinaryOperationImpl.getClass()) : Primitive.shrinkWrap(objBinaryOperationImpl) : Primitive.shrinkWrap(objBinaryOperationImpl).getValue();
            } catch (ArithmeticException e6) {
                throw new UtilTargetError("Arithemetic Exception in binary op", e6);
            }
        }
        StringBuilder sb2 = new StringBuilder("Type mismatch in operator.  ");
        sb2.append(objUnwrap.getClass());
        Class<?> cls = objUnwrap2.getClass();
        sb2.append(" cannot be used with ");
        sb2.append(cls);
        throw new UtilEvalError(sb2.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Object binaryOperationImpl(T t9, T t10, int i9) throws UtilEvalError {
        if (i9 == 145) {
            return Integer.valueOf(((Comparable) t9).compareTo(t10));
        }
        if (t9 instanceof Boolean) {
            return booleanBinaryOperation((Boolean) t9, (Boolean) t10, i9);
        }
        if (COMPARABLE_OPS.contains(Integer.valueOf(i9))) {
            return comparableBinaryBooleanOperations((Comparable) t9, t10, i9);
        }
        if (t9 instanceof BigInteger) {
            return bigIntegerBinaryOperation((BigInteger) t9, (BigInteger) t10, i9);
        }
        if (t9 instanceof BigDecimal) {
            return bigDecimalBinaryOperation((BigDecimal) t9, (BigDecimal) t10, i9);
        }
        if (Types.isFloatingpoint(t9)) {
            return t9 instanceof Float ? floatBinaryOperation(((Float) t9).floatValue(), ((Float) t10).floatValue(), i9) : doubleBinaryOperation(((Double) t9).doubleValue(), ((Double) t10).doubleValue(), i9);
        }
        if (t9 instanceof Number) {
            return longBinaryOperation(((Long) t9).longValue(), ((Long) t10).longValue(), i9);
        }
        throw new UtilEvalError("Invalid types in binary operator");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Boolean booleanBinaryOperation(Boolean bool, Boolean bool2, int i9) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        if (i9 == 92) {
            return Boolean.valueOf(zBooleanValue == zBooleanValue2);
        }
        switch (i9) {
            case 97:
                return Boolean.valueOf(zBooleanValue != zBooleanValue2);
            case 98:
            case 99:
            case 100:
            case 101:
                return bool2;
            default:
                switch (i9) {
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
                        C0353j.m1308f("unimplemented binary operator");
                        return null;
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean booleanUnaryOperation(Boolean bool, int i9) throws UtilEvalError {
        boolean zBooleanValue = bool.booleanValue();
        if (i9 == 90) {
            return !zBooleanValue;
        }
        throw new UtilEvalError("Operator inappropriate for boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> Boolean comparableBinaryBooleanOperations(Comparable<T> comparable, T t9, int i9) {
        switch (i9) {
            case 86:
            case 87:
                return Boolean.valueOf(comparable.compareTo(t9) > 0);
            case 88:
            case 89:
                return Boolean.valueOf(comparable.compareTo(t9) < 0);
            case 90:
            case 91:
            case 92:
            default:
                return Boolean.valueOf(comparable.compareTo(t9) == 0);
            case 93:
            case 94:
                return Boolean.valueOf(comparable.compareTo(t9) <= 0);
            case 95:
            case 96:
                return Boolean.valueOf(comparable.compareTo(t9) >= 0);
            case 97:
                return Boolean.valueOf(comparable.compareTo(t9) != 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object doubleBinaryOperation(double d10, double d11, int i9) throws UtilEvalError {
        switch (i9) {
            case 104:
                if (d10 <= 0.0d || Double.MAX_VALUE - d10 >= d11) {
                    return Double.valueOf(d10 + d11);
                }
                break;
            case 105:
                if (d10 >= 0.0d || (-1.7976931348623157E308d) - d10 <= (-d11)) {
                    return Double.valueOf(d10 - d11);
                }
                break;
            case 106:
                if (d10 == 0.0d || Double.MAX_VALUE / d10 >= d11) {
                    return Double.valueOf(d10 * d11);
                }
                break;
            case 107:
                return Double.valueOf(d10 / d11);
            default:
                switch (i9) {
                    case 114:
                    case 115:
                        return Double.valueOf(d10 % d11);
                    case 116:
                    case 117:
                        double dPow = Math.pow(d10, d11);
                        if (!Double.isInfinite(dPow)) {
                            return Double.valueOf(dPow);
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
        if (OVERFLOW_OPS.contains(Integer.valueOf(i9))) {
            return bigDecimalBinaryOperation(BigDecimal.valueOf(d10), BigDecimal.valueOf(d11), i9);
        }
        C0353j.m1308f("Unimplemented binary double operator");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static double doubleUnaryOperation(Double d10, int i9) {
        double dDoubleValue = d10.doubleValue();
        switch (i9) {
            case 102:
                return dDoubleValue + 1.0d;
            case 103:
                return dDoubleValue - 1.0d;
            case 104:
                return dDoubleValue;
            case 105:
                return -dDoubleValue;
            default:
                C0353j.m1308f("bad double unaryOperation");
                return 0.0d;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object floatBinaryOperation(float f3, float f10, int i9) throws UtilEvalError {
        switch (i9) {
            case 104:
                if (f3 <= 0.0d || Float.MAX_VALUE - f3 >= f10) {
                    return Float.valueOf(f3 + f10);
                }
                break;
            case 105:
                if (f3 >= 0.0d || (-3.4028235E38f) - f3 <= (-f10)) {
                    return Float.valueOf(f3 - f10);
                }
                break;
            case 106:
                if (f3 == 0.0f || Float.MAX_VALUE / f3 >= f10) {
                    return Float.valueOf(f3 * f10);
                }
                break;
            case 107:
                return Float.valueOf(f3 / f10);
            default:
                switch (i9) {
                    case 114:
                    case 115:
                        return Float.valueOf(f3 % f10);
                    case 116:
                    case 117:
                        double dPow = Math.pow(f3, f10);
                        if (!Double.isInfinite(dPow)) {
                            return Double.valueOf(dPow);
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
        if (OVERFLOW_OPS.contains(Integer.valueOf(i9))) {
            return bigDecimalBinaryOperation(BigDecimal.valueOf(f3), BigDecimal.valueOf(f10), i9);
        }
        C0353j.m1308f("Unimplemented binary double operator");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float floatUnaryOperation(Float f3, int i9) {
        float fFloatValue = f3.floatValue();
        switch (i9) {
            case 102:
                return fFloatValue + 1.0f;
            case 103:
                return fFloatValue - 1.0f;
            case 104:
                return fFloatValue;
            case 105:
                return -fFloatValue;
            default:
                C0353j.m1308f("bad float unaryOperation");
                return 0.0f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int intUnaryOperation(Integer num, int i9) {
        int iIntValue = num.intValue();
        if (i9 == 91) {
            return ~iIntValue;
        }
        switch (i9) {
            case 102:
                return iIntValue + 1;
            case 103:
                return iIntValue - 1;
            case 104:
                return iIntValue;
            case 105:
                return -iIntValue;
            default:
                C0353j.m1308f("bad integer unaryOperation");
                return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object longBinaryOperation(long j3, long j4, int i9) {
        switch (i9) {
            case 104:
                if (j3 <= 0 || Long.MAX_VALUE - j3 >= j4) {
                    return Long.valueOf(j3 + j4);
                }
                break;
            case 105:
                if (j3 >= 0 || Long.MIN_VALUE - j3 <= (-j4)) {
                    return Long.valueOf(j3 - j4);
                }
                break;
            case 106:
                if (j3 == 0 || Long.MAX_VALUE / j3 >= j4) {
                    return Long.valueOf(j3 * j4);
                }
                break;
            case 107:
                return Long.valueOf(j3 / j4);
            case 108:
            case 109:
                return Long.valueOf(j3 & j4);
            case 110:
            case 111:
                return Long.valueOf(j3 | j4);
            case 112:
            case 113:
                return Long.valueOf(j3 ^ j4);
            case 114:
            case 115:
                return Long.valueOf(j3 % j4);
            case 116:
            case 117:
                double dPow = Math.pow(j3, j4);
                BigInteger bigInteger = BigDecimal.valueOf(dPow).toBigInteger();
                if (bigInteger.compareTo(Primitive.LONG_MIN) >= 0 && bigInteger.compareTo(Primitive.LONG_MAX) <= 0) {
                    return Long.valueOf((long) dPow);
                }
                break;
            case 118:
            case 119:
                return Long.valueOf(j3 << ((int) j4));
            case 120:
            case 121:
                return Long.valueOf(j3 >> ((int) j4));
            case 122:
            case 123:
                return Long.valueOf(j3 >>> ((int) j4));
        }
        if (OVERFLOW_OPS.contains(Integer.valueOf(i9))) {
            return bigIntegerBinaryOperation(BigInteger.valueOf(j3), BigInteger.valueOf(j4), i9);
        }
        C0353j.m1308f("Unimplemented binary long operator");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long longUnaryOperation(Long l10, int i9) {
        long jLongValue = l10.longValue();
        if (i9 == 91) {
            return ~jLongValue;
        }
        switch (i9) {
            case 102:
                return jLongValue + 1;
            case 103:
                return jLongValue - 1;
            case 104:
                return jLongValue;
            case 105:
                return -jLongValue;
            default:
                C0353j.m1308f("bad long unaryOperation");
                return 0L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object[] promotePrimitives(Object obj, Object obj2) {
        Number numberPromoteToInteger = promoteToInteger(obj);
        Number numberPromoteToInteger2 = promoteToInteger(obj2);
        if (obj instanceof BigDecimal) {
            if (!(obj2 instanceof BigDecimal)) {
                obj2 = Primitive.castNumber(BigDecimal.class, numberPromoteToInteger2);
            }
        } else if (obj2 instanceof BigDecimal) {
            obj = Primitive.castNumber(BigDecimal.class, numberPromoteToInteger);
        } else if (Types.isFloatingpoint(obj) || Types.isFloatingpoint(obj2)) {
            boolean z9 = obj instanceof Double;
            if (z9 || (obj2 instanceof Double)) {
                if (!z9) {
                    obj = Double.valueOf(numberPromoteToInteger.doubleValue());
                }
                if (!(obj2 instanceof Double)) {
                    obj2 = Double.valueOf(numberPromoteToInteger2.doubleValue());
                }
            } else {
                if (!(obj instanceof Float)) {
                    obj = Float.valueOf(numberPromoteToInteger.floatValue());
                }
                if (!(obj2 instanceof Float)) {
                    obj2 = Float.valueOf(numberPromoteToInteger2.floatValue());
                }
            }
        } else if (obj instanceof BigInteger) {
            if (!(obj2 instanceof BigInteger)) {
                obj2 = Primitive.castNumber(BigInteger.class, numberPromoteToInteger2);
            }
        } else if (obj2 instanceof BigInteger) {
            obj = Primitive.castNumber(BigInteger.class, numberPromoteToInteger);
        } else {
            if (!(obj instanceof Long)) {
                obj = Long.valueOf(numberPromoteToInteger.longValue());
            }
            if (!(obj2 instanceof Long)) {
                obj2 = Long.valueOf(numberPromoteToInteger2.longValue());
            }
        }
        return new Object[]{obj, obj2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Number promoteToInteger(Object obj) {
        return obj instanceof Character ? Integer.valueOf(((Character) obj).charValue()) : ((obj instanceof Byte) || (obj instanceof Short)) ? Integer.valueOf(((Number) obj).intValue()) : (Number) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Primitive unaryOperation(Primitive primitive, int i9) throws UtilEvalError {
        if (primitive == Primitive.NULL) {
            throw new UtilEvalError("illegal use of null object or 'null' literal");
        }
        if (primitive == Primitive.VOID) {
            throw new UtilEvalError("illegal use of undefined object or 'void' literal");
        }
        Class<?> type = primitive.getType();
        if (type == Boolean.TYPE) {
            return booleanUnaryOperation((Boolean) primitive.getValue(), i9) ? Primitive.TRUE : Primitive.FALSE;
        }
        Number numberPromoteToInteger = promoteToInteger(primitive.getValue());
        if (numberPromoteToInteger instanceof Integer) {
            int iIntUnaryOperation = intUnaryOperation((Integer) numberPromoteToInteger, i9);
            if (i9 == 102 || i9 == 103) {
                if (type == Byte.TYPE) {
                    return new Primitive((byte) iIntUnaryOperation);
                }
                if (type == Short.TYPE) {
                    return new Primitive((short) iIntUnaryOperation);
                }
                if (type == Character.TYPE) {
                    return new Primitive((char) iIntUnaryOperation);
                }
            }
            return new Primitive(iIntUnaryOperation);
        }
        if (numberPromoteToInteger instanceof Long) {
            return new Primitive(longUnaryOperation(Long.valueOf(numberPromoteToInteger.longValue()), i9));
        }
        if (numberPromoteToInteger instanceof Float) {
            return new Primitive(floatUnaryOperation(Float.valueOf(numberPromoteToInteger.floatValue()), i9));
        }
        if (numberPromoteToInteger instanceof Double) {
            return new Primitive(doubleUnaryOperation(Double.valueOf(numberPromoteToInteger.doubleValue()), i9));
        }
        if (numberPromoteToInteger instanceof BigInteger) {
            return new Primitive(bigIntegerUnaryOperation((BigInteger) numberPromoteToInteger, i9));
        }
        if (numberPromoteToInteger instanceof BigDecimal) {
            return new Primitive(bigDecimalUnaryOperation((BigDecimal) numberPromoteToInteger, i9));
        }
        C0353j.m1308f("An error occurred.  Please call technical support.");
        return null;
    }
}
