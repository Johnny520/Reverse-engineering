package bsh;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: renamed from: bsh.j3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1200j3 implements InterfaceC1230o3 {

    /* JADX INFO: renamed from: q */
    public static final List f3629q = Arrays.asList(Integer.valueOf(HttpStatusCodesKt.HTTP_EARLY_HINTS), Integer.valueOf(Opcodes.IMUL), Integer.valueOf(Opcodes.LMUL), 115);

    /* JADX INFO: renamed from: r */
    public static final List f3630r = Arrays.asList(87, 88, 85, 86, 91, 92, 93, 94, 95, 96);

    /* JADX INFO: renamed from: a */
    public static Object m4441a(Object obj, Object obj2, int i10) throws C1279w4 {
        if (i10 == 91) {
            return obj == obj2 ? Primitive.TRUE : Primitive.FALSE;
        }
        if (i10 == 96) {
            return obj != obj2 ? Primitive.TRUE : Primitive.FALSE;
        }
        Primitive primitive = Primitive.VOID;
        if (obj == primitive || obj2 == primitive) {
            throw new C1279w4("illegal use of undefined variable, class, or 'void' literal");
        }
        int i11 = 0;
        Class cls = Integer.TYPE;
        if (i10 == 144) {
            int iCompare = ((obj instanceof Comparable) || (obj2 instanceof Comparable)) ? Comparator.nullsFirst(Comparator.naturalOrder()).compare((Comparable) Primitive.unwrap(obj), (Comparable) Primitive.unwrap(obj2)) : Comparator.nullsFirst(Comparator.comparing(new Function() { // from class: bsh.i3
                @Override // java.util.function.Function
                public final Object apply(Object obj3) {
                    return obj3.toString();
                }
            })).compare(Primitive.unwrap(obj), Primitive.unwrap(obj2));
            if (iCompare < 0) {
                i11 = -1;
            } else if (iCompare > 0) {
                i11 = 1;
            }
            return Primitive.wrap(Integer.valueOf(i11), (Class<?>) cls);
        }
        if (i10 == 103) {
            if ((obj instanceof String) || (obj2 instanceof String)) {
                return C1274w.f3851z ? String.valueOf(obj).concat(String.valueOf(obj2)).intern() : String.valueOf(obj).concat(String.valueOf(obj2));
            }
            if (obj.getClass().isArray() && (obj2 instanceof List)) {
                obj2 = ((List) obj2).toArray();
            }
            if (obj.getClass().isArray() && obj2.getClass().isArray()) {
                return AbstractC1269v0.m5112d(obj, obj2);
            }
            boolean z10 = obj instanceof List;
            if (z10 && obj2.getClass().isArray()) {
                obj2 = AbstractC1273v4.m5138h(obj2, List.class, 0);
            }
            if (z10 && (obj2 instanceof List)) {
                return AbstractC1269v0.m5113e((List) obj, (List) obj2);
            }
        }
        if (i10 == 105) {
            if (obj.getClass().isArray()) {
                return AbstractC1269v0.m5118j(obj, ((Integer) Primitive.castWrapper(cls, obj2)).intValue());
            }
            if (obj2.getClass().isArray()) {
                return AbstractC1269v0.m5118j(obj2, ((Integer) Primitive.castWrapper(cls, obj)).intValue());
            }
            if (obj instanceof List) {
                return AbstractC1269v0.m5119k((List) obj, ((Integer) Primitive.castWrapper(cls, obj2)).intValue());
            }
            if (obj2 instanceof List) {
                return AbstractC1269v0.m5119k((List) obj2, ((Integer) Primitive.castWrapper(cls, obj)).intValue());
            }
            try {
                if (obj instanceof String) {
                    return C1274w.f3851z ? new String(new char[((Integer) Primitive.castWrapper(cls, obj2)).intValue()]).replace("\u0000", String.valueOf(obj)).intern() : new String(new char[((Integer) Primitive.castWrapper(cls, obj2)).intValue()]).replace("\u0000", String.valueOf(obj));
                }
                if (obj2 instanceof String) {
                    return C1274w.f3851z ? new String(new char[((Integer) Primitive.castWrapper(cls, obj)).intValue()]).replace("\u0000", String.valueOf(obj2)).intern() : new String(new char[((Integer) Primitive.castWrapper(cls, obj)).intValue()]).replace("\u0000", String.valueOf(obj2));
                }
            } catch (NegativeArraySizeException e10) {
                throw new C1279w4("Negative repeat operand: " + e10.getMessage(), e10);
            }
        }
        if ((obj instanceof String) || (obj2 instanceof String)) {
            throw new C1279w4("Use of non + operator with String");
        }
        if (obj.getClass().isArray() || obj2.getClass().isArray() || (obj instanceof List) || (obj2 instanceof List)) {
            throw new C1279w4("Use of invalid operator " + InterfaceC1230o3.f3729d[i10] + " with array or List type");
        }
        Primitive primitive2 = Primitive.NULL;
        if (obj == primitive2 || obj2 == primitive2) {
            throw new C1279w4("illegal use of null value or 'null' literal");
        }
        throw new C1279w4("Operator: " + InterfaceC1230o3.f3729d[i10] + " inappropriate for objects");
    }

    /* JADX INFO: renamed from: b */
    public static Object m4442b(BigDecimal bigDecimal, BigDecimal bigDecimal2, int i10) throws C1279w4 {
        switch (i10) {
            case HttpStatusCodesKt.HTTP_EARLY_HINTS /* 103 */:
                return bigDecimal.add(bigDecimal2);
            case Opcodes.IMUL /* 104 */:
                return bigDecimal.subtract(bigDecimal2);
            case Opcodes.LMUL /* 105 */:
                return bigDecimal.multiply(bigDecimal2);
            case 106:
                return bigDecimal.divide(bigDecimal2);
            default:
                switch (i10) {
                    case Opcodes.LREM /* 113 */:
                    case 114:
                        return bigDecimal.remainder(bigDecimal2);
                    case 115:
                    case Opcodes.INEG /* 116 */:
                        return bigDecimal.pow(bigDecimal2.intValue());
                    case Opcodes.LNEG /* 117 */:
                    case Opcodes.FNEG /* 118 */:
                    case Opcodes.DNEG /* 119 */:
                    case Opcodes.ISHL /* 120 */:
                    case Opcodes.LSHL /* 121 */:
                    case Opcodes.ISHR /* 122 */:
                        throw new C1279w4("Can't shift floatingpoint values");
                    default:
                        throw new C1211l2("Unimplemented binary float operator");
                }
        }
    }

    /* JADX INFO: renamed from: c */
    public static BigDecimal m4443c(BigDecimal bigDecimal, int i10) {
        if (i10 == 90) {
            return bigDecimal.signum() == 1 ? bigDecimal.negate() : bigDecimal;
        }
        switch (i10) {
            case 101:
                return bigDecimal.add(BigDecimal.ONE);
            case HttpStatusCodesKt.HTTP_PROCESSING /* 102 */:
                return bigDecimal.subtract(BigDecimal.ONE);
            case HttpStatusCodesKt.HTTP_EARLY_HINTS /* 103 */:
                return bigDecimal;
            case Opcodes.IMUL /* 104 */:
                return bigDecimal.negate();
            default:
                throw new C1211l2("bad big decimal unaryOperation");
        }
    }

    /* JADX INFO: renamed from: d */
    public static Object m4444d(BigInteger bigInteger, BigInteger bigInteger2, int i10) {
        switch (i10) {
            case HttpStatusCodesKt.HTTP_EARLY_HINTS /* 103 */:
                return bigInteger.add(bigInteger2);
            case Opcodes.IMUL /* 104 */:
                return bigInteger.subtract(bigInteger2);
            case Opcodes.LMUL /* 105 */:
                return bigInteger.multiply(bigInteger2);
            case 106:
                return bigInteger.divide(bigInteger2);
            case 107:
            case Opcodes.IDIV /* 108 */:
                return bigInteger.and(bigInteger2);
            case Opcodes.LDIV /* 109 */:
            case 110:
                return bigInteger.or(bigInteger2);
            case 111:
            case Opcodes.IREM /* 112 */:
                return bigInteger.xor(bigInteger2);
            case Opcodes.LREM /* 113 */:
            case 114:
                return bigInteger.mod(bigInteger2);
            case 115:
            case Opcodes.INEG /* 116 */:
                return bigInteger.pow(bigInteger2.intValue());
            case Opcodes.LNEG /* 117 */:
            case Opcodes.FNEG /* 118 */:
                return bigInteger.shiftLeft(bigInteger2.intValue());
            case Opcodes.DNEG /* 119 */:
            case Opcodes.ISHL /* 120 */:
                return bigInteger.shiftRight(bigInteger2.intValue());
            case Opcodes.LSHL /* 121 */:
            case Opcodes.ISHR /* 122 */:
                if (bigInteger.signum() >= 0) {
                    return bigInteger.shiftRight(bigInteger2.intValue());
                }
                BigInteger bigInteger3 = BigInteger.ONE;
                BigInteger bigIntegerShiftLeft = bigInteger3.shiftLeft(bigInteger.toString(2).length() + 1);
                BigInteger bigIntegerSubtract = bigInteger.subtract(bigIntegerShiftLeft);
                return bigIntegerSubtract.shiftRight(bigInteger2.intValue()).and(bigIntegerShiftLeft.subtract(bigInteger3).shiftRight(bigInteger2.intValue() + 1));
            default:
                throw new C1211l2("Unimplemented binary integer operator");
        }
    }

    /* JADX INFO: renamed from: e */
    public static BigInteger m4445e(BigInteger bigInteger, int i10) {
        if (i10 == 90) {
            return bigInteger.not();
        }
        switch (i10) {
            case 101:
                return bigInteger.add(BigInteger.ONE);
            case HttpStatusCodesKt.HTTP_PROCESSING /* 102 */:
                return bigInteger.subtract(BigInteger.ONE);
            case HttpStatusCodesKt.HTTP_EARLY_HINTS /* 103 */:
                return bigInteger;
            case Opcodes.IMUL /* 104 */:
                return bigInteger.negate();
            default:
                throw new C1211l2("bad big integer unaryOperation");
        }
    }

    /* JADX INFO: renamed from: f */
    public static Object m4446f(Object obj, Object obj2, int i10) throws C1279w4 {
        Object objUnwrap = Primitive.unwrap(obj);
        Object objUnwrap2 = Primitive.unwrap(obj2);
        if (AbstractC1273v4.m5153w(objUnwrap) && AbstractC1273v4.m5153w(objUnwrap2)) {
            Object[] objArrM4458r = m4458r(objUnwrap, objUnwrap2);
            Object obj3 = objArrM4458r[0];
            objUnwrap2 = objArrM4458r[1];
            objUnwrap = obj3;
        }
        if (objUnwrap.getClass() == objUnwrap2.getClass()) {
            try {
                Object objM4447g = m4447g(objUnwrap, objUnwrap2, i10);
                return objM4447g instanceof Boolean ? ((Boolean) objM4447g).booleanValue() ? Primitive.TRUE : Primitive.FALSE : ((obj instanceof Primitive) && (obj2 instanceof Primitive)) ? (AbstractC1273v4.m5147q(objM4447g) && objUnwrap.getClass() == BigDecimal.class) ? Primitive.wrap(objM4447g, objM4447g.getClass()) : Primitive.shrinkWrap(objM4447g) : Primitive.shrinkWrap(objM4447g).getValue();
            } catch (ArithmeticException e10) {
                throw new C1285x4("Arithemetic Exception in binary op", e10);
            }
        }
        StringBuilder sb2 = new StringBuilder("Type mismatch in operator.  ");
        sb2.append(objUnwrap.getClass());
        Class<?> cls = objUnwrap2.getClass();
        sb2.append(" cannot be used with ");
        sb2.append(cls);
        throw new C1279w4(sb2.toString());
    }

    /* JADX INFO: renamed from: g */
    public static Object m4447g(Object obj, Object obj2, int i10) throws C1279w4 {
        if (i10 == 144) {
            return Integer.valueOf(((Comparable) obj).compareTo(obj2));
        }
        if (obj instanceof Boolean) {
            return m4448h((Boolean) obj, (Boolean) obj2, i10);
        }
        if (f3630r.contains(Integer.valueOf(i10))) {
            return m4450j((Comparable) obj, obj2, i10);
        }
        if (obj instanceof BigInteger) {
            return m4444d((BigInteger) obj, (BigInteger) obj2, i10);
        }
        if (obj instanceof BigDecimal) {
            return m4442b((BigDecimal) obj, (BigDecimal) obj2, i10);
        }
        if (AbstractC1273v4.m5147q(obj)) {
            return obj instanceof Float ? m4453m(((Float) obj).floatValue(), ((Float) obj2).floatValue(), i10) : m4451k(((Double) obj).doubleValue(), ((Double) obj2).doubleValue(), i10);
        }
        if (obj instanceof Number) {
            return m4456p(((Long) obj).longValue(), ((Long) obj2).longValue(), i10);
        }
        throw new C1279w4("Invalid types in binary operator");
    }

    /* JADX INFO: renamed from: h */
    public static Boolean m4448h(Boolean bool, Boolean bool2, int i10) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        if (i10 == 91) {
            return Boolean.valueOf(zBooleanValue == zBooleanValue2);
        }
        switch (i10) {
            case Opcodes.IADD /* 96 */:
                return Boolean.valueOf(zBooleanValue != zBooleanValue2);
            case Opcodes.LADD /* 97 */:
            case 98:
            case 99:
            case 100:
                return bool2;
            default:
                switch (i10) {
                    case 107:
                    case Opcodes.IDIV /* 108 */:
                        return Boolean.valueOf(zBooleanValue & zBooleanValue2);
                    case Opcodes.LDIV /* 109 */:
                    case 110:
                        return Boolean.valueOf(zBooleanValue | zBooleanValue2);
                    case 111:
                    case Opcodes.IREM /* 112 */:
                        return Boolean.valueOf(zBooleanValue ^ zBooleanValue2);
                    default:
                        throw new C1211l2("unimplemented binary operator");
                }
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m4449i(Boolean bool, int i10) throws C1279w4 {
        boolean zBooleanValue = bool.booleanValue();
        if (i10 == 89) {
            return !zBooleanValue;
        }
        throw new C1279w4("Operator inappropriate for boolean");
    }

    /* JADX INFO: renamed from: j */
    public static Boolean m4450j(Comparable comparable, Object obj, int i10) {
        switch (i10) {
            case Opcodes.CASTORE /* 85 */:
            case 86:
                return Boolean.valueOf(comparable.compareTo(obj) > 0);
            case Opcodes.POP /* 87 */:
            case Opcodes.POP2 /* 88 */:
                return Boolean.valueOf(comparable.compareTo(obj) < 0);
            case Opcodes.DUP /* 89 */:
            case 90:
            case 91:
            default:
                return Boolean.valueOf(comparable.compareTo(obj) == 0);
            case Opcodes.DUP2 /* 92 */:
            case 93:
                return Boolean.valueOf(comparable.compareTo(obj) <= 0);
            case 94:
            case Opcodes.SWAP /* 95 */:
                return Boolean.valueOf(comparable.compareTo(obj) >= 0);
            case Opcodes.IADD /* 96 */:
                return Boolean.valueOf(comparable.compareTo(obj) != 0);
        }
    }

    /* JADX INFO: renamed from: k */
    public static Object m4451k(double d10, double d11, int i10) throws C1279w4 {
        switch (i10) {
            case HttpStatusCodesKt.HTTP_EARLY_HINTS /* 103 */:
                if (d10 <= 0.0d || Double.MAX_VALUE - d10 >= d11) {
                    return Double.valueOf(d10 + d11);
                }
                break;
            case Opcodes.IMUL /* 104 */:
                if (d10 >= 0.0d || (-1.7976931348623157E308d) - d10 <= (-d11)) {
                    return Double.valueOf(d10 - d11);
                }
                break;
            case Opcodes.LMUL /* 105 */:
                if (d10 == 0.0d || Double.MAX_VALUE / d10 >= d11) {
                    return Double.valueOf(d10 * d11);
                }
                break;
            case 106:
                return Double.valueOf(d10 / d11);
            default:
                switch (i10) {
                    case Opcodes.LREM /* 113 */:
                    case 114:
                        return Double.valueOf(d10 % d11);
                    case 115:
                    case Opcodes.INEG /* 116 */:
                        double dPow = Math.pow(d10, d11);
                        if (!Double.isInfinite(dPow)) {
                            return Double.valueOf(dPow);
                        }
                        break;
                    case Opcodes.LNEG /* 117 */:
                    case Opcodes.FNEG /* 118 */:
                    case Opcodes.DNEG /* 119 */:
                    case Opcodes.ISHL /* 120 */:
                    case Opcodes.LSHL /* 121 */:
                    case Opcodes.ISHR /* 122 */:
                        throw new C1279w4("Can't shift floatingpoint values");
                }
                break;
        }
        if (f3629q.contains(Integer.valueOf(i10))) {
            return m4442b(BigDecimal.valueOf(d10), BigDecimal.valueOf(d11), i10);
        }
        throw new C1211l2("Unimplemented binary double operator");
    }

    /* JADX INFO: renamed from: l */
    public static double m4452l(Double d10, int i10) {
        double dDoubleValue = d10.doubleValue();
        switch (i10) {
            case 101:
                return dDoubleValue + 1.0d;
            case HttpStatusCodesKt.HTTP_PROCESSING /* 102 */:
                return dDoubleValue - 1.0d;
            case HttpStatusCodesKt.HTTP_EARLY_HINTS /* 103 */:
                return dDoubleValue;
            case Opcodes.IMUL /* 104 */:
                return -dDoubleValue;
            default:
                throw new C1211l2("bad double unaryOperation");
        }
    }

    /* JADX INFO: renamed from: m */
    public static Object m4453m(float f10, float f11, int i10) throws C1279w4 {
        switch (i10) {
            case HttpStatusCodesKt.HTTP_EARLY_HINTS /* 103 */:
                if (f10 <= 0.0d || Float.MAX_VALUE - f10 >= f11) {
                    return Float.valueOf(f10 + f11);
                }
                break;
            case Opcodes.IMUL /* 104 */:
                if (f10 >= 0.0d || (-3.4028235E38f) - f10 <= (-f11)) {
                    return Float.valueOf(f10 - f11);
                }
                break;
            case Opcodes.LMUL /* 105 */:
                if (f10 == 0.0f || Float.MAX_VALUE / f10 >= f11) {
                    return Float.valueOf(f10 * f11);
                }
                break;
            case 106:
                return Float.valueOf(f10 / f11);
            default:
                switch (i10) {
                    case Opcodes.LREM /* 113 */:
                    case 114:
                        return Float.valueOf(f10 % f11);
                    case 115:
                    case Opcodes.INEG /* 116 */:
                        double dPow = Math.pow(f10, f11);
                        if (!Double.isInfinite(dPow)) {
                            return Double.valueOf(dPow);
                        }
                        break;
                    case Opcodes.LNEG /* 117 */:
                    case Opcodes.FNEG /* 118 */:
                    case Opcodes.DNEG /* 119 */:
                    case Opcodes.ISHL /* 120 */:
                    case Opcodes.LSHL /* 121 */:
                    case Opcodes.ISHR /* 122 */:
                        throw new C1279w4("Can't shift floatingpoint values");
                }
                break;
        }
        if (f3629q.contains(Integer.valueOf(i10))) {
            return m4442b(BigDecimal.valueOf(f10), BigDecimal.valueOf(f11), i10);
        }
        throw new C1211l2("Unimplemented binary double operator");
    }

    /* JADX INFO: renamed from: n */
    public static float m4454n(Float f10, int i10) {
        float fFloatValue = f10.floatValue();
        switch (i10) {
            case 101:
                return fFloatValue + 1.0f;
            case HttpStatusCodesKt.HTTP_PROCESSING /* 102 */:
                return fFloatValue - 1.0f;
            case HttpStatusCodesKt.HTTP_EARLY_HINTS /* 103 */:
                return fFloatValue;
            case Opcodes.IMUL /* 104 */:
                return -fFloatValue;
            default:
                throw new C1211l2("bad float unaryOperation");
        }
    }

    /* JADX INFO: renamed from: o */
    public static int m4455o(Integer num, int i10) {
        int iIntValue = num.intValue();
        if (i10 == 90) {
            return ~iIntValue;
        }
        switch (i10) {
            case 101:
                return iIntValue + 1;
            case HttpStatusCodesKt.HTTP_PROCESSING /* 102 */:
                return iIntValue - 1;
            case HttpStatusCodesKt.HTTP_EARLY_HINTS /* 103 */:
                return iIntValue;
            case Opcodes.IMUL /* 104 */:
                return -iIntValue;
            default:
                throw new C1211l2("bad integer unaryOperation");
        }
    }

    /* JADX INFO: renamed from: p */
    public static Object m4456p(long j10, long j11, int i10) {
        switch (i10) {
            case HttpStatusCodesKt.HTTP_EARLY_HINTS /* 103 */:
                if (j10 <= 0 || Long.MAX_VALUE - j10 >= j11) {
                    return Long.valueOf(j10 + j11);
                }
                break;
            case Opcodes.IMUL /* 104 */:
                if (j10 >= 0 || Long.MIN_VALUE - j10 <= (-j11)) {
                    return Long.valueOf(j10 - j11);
                }
                break;
            case Opcodes.LMUL /* 105 */:
                if (j10 == 0 || Long.MAX_VALUE / j10 >= j11) {
                    return Long.valueOf(j10 * j11);
                }
                break;
            case 106:
                return Long.valueOf(j10 / j11);
            case 107:
            case Opcodes.IDIV /* 108 */:
                return Long.valueOf(j10 & j11);
            case Opcodes.LDIV /* 109 */:
            case 110:
                return Long.valueOf(j10 | j11);
            case 111:
            case Opcodes.IREM /* 112 */:
                return Long.valueOf(j10 ^ j11);
            case Opcodes.LREM /* 113 */:
            case 114:
                return Long.valueOf(j10 % j11);
            case 115:
            case Opcodes.INEG /* 116 */:
                double dPow = Math.pow(j10, j11);
                BigInteger bigInteger = BigDecimal.valueOf(dPow).toBigInteger();
                if (bigInteger.compareTo(Primitive.LONG_MIN) >= 0 && bigInteger.compareTo(Primitive.LONG_MAX) <= 0) {
                    return Long.valueOf((long) dPow);
                }
                break;
            case Opcodes.LNEG /* 117 */:
            case Opcodes.FNEG /* 118 */:
                return Long.valueOf(j10 << ((int) j11));
            case Opcodes.DNEG /* 119 */:
            case Opcodes.ISHL /* 120 */:
                return Long.valueOf(j10 >> ((int) j11));
            case Opcodes.LSHL /* 121 */:
            case Opcodes.ISHR /* 122 */:
                return Long.valueOf(j10 >>> ((int) j11));
        }
        if (f3629q.contains(Integer.valueOf(i10))) {
            return m4444d(BigInteger.valueOf(j10), BigInteger.valueOf(j11), i10);
        }
        throw new C1211l2("Unimplemented binary long operator");
    }

    /* JADX INFO: renamed from: q */
    public static long m4457q(Long l10, int i10) {
        long jLongValue = l10.longValue();
        if (i10 == 90) {
            return ~jLongValue;
        }
        switch (i10) {
            case 101:
                return jLongValue + 1;
            case HttpStatusCodesKt.HTTP_PROCESSING /* 102 */:
                return jLongValue - 1;
            case HttpStatusCodesKt.HTTP_EARLY_HINTS /* 103 */:
                return jLongValue;
            case Opcodes.IMUL /* 104 */:
                return -jLongValue;
            default:
                throw new C1211l2("bad long unaryOperation");
        }
    }

    /* JADX INFO: renamed from: r */
    public static Object[] m4458r(Object obj, Object obj2) {
        Number numberM4459s = m4459s(obj);
        Number numberM4459s2 = m4459s(obj2);
        if (obj instanceof BigDecimal) {
            if (!(obj2 instanceof BigDecimal)) {
                obj2 = Primitive.castNumber(BigDecimal.class, numberM4459s2);
            }
        } else if (obj2 instanceof BigDecimal) {
            obj = Primitive.castNumber(BigDecimal.class, numberM4459s);
        } else if (AbstractC1273v4.m5147q(obj) || AbstractC1273v4.m5147q(obj2)) {
            if (!(obj instanceof Float) || !(obj2 instanceof Float)) {
                if (!(obj instanceof Double)) {
                    obj = Double.valueOf(numberM4459s.doubleValue());
                }
                if (!(obj2 instanceof Double)) {
                    obj2 = Double.valueOf(numberM4459s2.doubleValue());
                }
            }
        } else if (obj instanceof BigInteger) {
            if (!(obj2 instanceof BigInteger)) {
                obj2 = Primitive.castNumber(BigInteger.class, numberM4459s2);
            }
        } else if (obj2 instanceof BigInteger) {
            obj = Primitive.castNumber(BigInteger.class, numberM4459s);
        } else {
            if (!(obj instanceof Long)) {
                obj = Long.valueOf(numberM4459s.longValue());
            }
            if (!(obj2 instanceof Long)) {
                obj2 = Long.valueOf(numberM4459s2.longValue());
            }
        }
        return new Object[]{obj, obj2};
    }

    /* JADX INFO: renamed from: s */
    public static Number m4459s(Object obj) {
        return obj instanceof Character ? Integer.valueOf(((Character) obj).charValue()) : ((obj instanceof Byte) || (obj instanceof Short)) ? Integer.valueOf(((Number) obj).intValue()) : (Number) obj;
    }

    /* JADX INFO: renamed from: t */
    public static Primitive m4460t(Primitive primitive, int i10) throws C1279w4 {
        if (primitive == Primitive.NULL) {
            throw new C1279w4("illegal use of null object or 'null' literal");
        }
        if (primitive == Primitive.VOID) {
            throw new C1279w4("illegal use of undefined object or 'void' literal");
        }
        Class<?> type = primitive.getType();
        if (type == Boolean.TYPE) {
            return m4449i((Boolean) primitive.getValue(), i10) ? Primitive.TRUE : Primitive.FALSE;
        }
        Number numberM4459s = m4459s(primitive.getValue());
        if (numberM4459s instanceof Integer) {
            int iM4455o = m4455o((Integer) numberM4459s, i10);
            if (i10 == 101 || i10 == 102) {
                if (type == Byte.TYPE) {
                    return new Primitive((byte) iM4455o);
                }
                if (type == Short.TYPE) {
                    return new Primitive((short) iM4455o);
                }
                if (type == Character.TYPE) {
                    return new Primitive((char) iM4455o);
                }
            }
            return new Primitive(iM4455o);
        }
        if (numberM4459s instanceof Long) {
            return new Primitive(m4457q(Long.valueOf(numberM4459s.longValue()), i10));
        }
        if (numberM4459s instanceof Float) {
            return new Primitive(m4454n(Float.valueOf(numberM4459s.floatValue()), i10));
        }
        if (numberM4459s instanceof Double) {
            return new Primitive(m4452l(Double.valueOf(numberM4459s.doubleValue()), i10));
        }
        if (numberM4459s instanceof BigInteger) {
            return new Primitive(m4445e((BigInteger) numberM4459s, i10));
        }
        if (numberM4459s instanceof BigDecimal) {
            return new Primitive(m4443c((BigDecimal) numberM4459s, i10));
        }
        throw new C1211l2("An error occurred.  Please call technical support.");
    }
}
