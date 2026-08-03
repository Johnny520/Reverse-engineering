package bsh;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;
import p222p.AbstractC3199a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Primitive implements Serializable {
    public static final Primitive FALSE;
    private static final BigInteger INTEGER_MAX;
    private static final BigInteger INTEGER_MIN;
    static final BigInteger LONG_MAX;
    static final BigInteger LONG_MIN;
    public static final Primitive NULL;
    public static final Primitive TRUE;
    public static final Primitive VOID;
    public static final Primitive ZERO_BIG_DECIMAL;
    public static final Primitive ZERO_BIG_INTEGER;
    public static final Primitive ZERO_BYTE;
    public static final Primitive ZERO_CHAR;
    public static final Primitive ZERO_DOUBLE;
    public static final Primitive ZERO_FLOAT;
    public static final Primitive ZERO_INT;
    public static final Primitive ZERO_LONG;
    public static final Primitive ZERO_SHORT;
    private static final long serialVersionUID = 1;
    static final Map<Class<?>, Class<?>> wrapperMap;
    private Object value;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public enum Special {
        NULL_VALUE,
        VOID_TYPE
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        HashMap map = new HashMap();
        wrapperMap = map;
        Class cls = Void.TYPE;
        map.put(cls, Void.class);
        Class cls2 = Boolean.TYPE;
        map.put(cls2, Boolean.class);
        Class cls3 = Byte.TYPE;
        map.put(cls3, Byte.class);
        Class cls4 = Short.TYPE;
        map.put(cls4, Short.class);
        Class cls5 = Character.TYPE;
        map.put(cls5, Character.class);
        Class cls6 = Integer.TYPE;
        map.put(cls6, Integer.class);
        Class cls7 = Long.TYPE;
        map.put(cls7, Long.class);
        Class cls8 = Float.TYPE;
        map.put(cls8, Float.class);
        Class cls9 = Double.TYPE;
        map.put(cls9, Double.class);
        map.put(Void.class, cls);
        map.put(Boolean.class, cls2);
        map.put(Byte.class, cls3);
        map.put(Short.class, cls4);
        map.put(Character.class, cls5);
        map.put(Integer.class, cls6);
        map.put(Long.class, cls7);
        map.put(Float.class, cls8);
        map.put(Double.class, cls9);
        map.put(BigInteger.class, BigInteger.class);
        map.put(BigDecimal.class, BigDecimal.class);
        TRUE = new Primitive(true);
        FALSE = new Primitive(false);
        ZERO_CHAR = new Primitive((char) 0);
        ZERO_BYTE = new Primitive((byte) 0);
        ZERO_SHORT = new Primitive((short) 0);
        ZERO_INT = new Primitive(0);
        ZERO_LONG = new Primitive(0L);
        ZERO_FLOAT = new Primitive(0.0f);
        ZERO_DOUBLE = new Primitive(0.0d);
        ZERO_BIG_INTEGER = new Primitive(BigInteger.ZERO);
        ZERO_BIG_DECIMAL = new Primitive(BigDecimal.ZERO);
        NULL = new Primitive(Special.NULL_VALUE);
        VOID = new Primitive(Special.VOID_TYPE);
        INTEGER_MAX = BigInteger.valueOf(2147483647L);
        INTEGER_MIN = BigInteger.valueOf(-2147483648L);
        LONG_MAX = BigInteger.valueOf(Long.MAX_VALUE);
        LONG_MIN = BigInteger.valueOf(Long.MIN_VALUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public Primitive(BigDecimal bigDecimal) {
        if (bigDecimal != null && bigDecimal.scale() == 0) {
            bigDecimal = bigDecimal.setScale(1);
        }
        this((Object) bigDecimal);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Class<?> boxType(Class<?> cls) {
        Class<?> cls2 = wrapperMap.get(cls);
        if (cls2 != null && !cls2.isPrimitive()) {
            return cls2;
        }
        C0353j.m1308f(AbstractC3199a.m6838k(cls, "Not a primitive type: "));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object castNumber(Class<?> cls, Number number) {
        if (cls.isInstance(number) || cls == unboxType(number.getClass())) {
            return number;
        }
        if ((cls == Byte.class || cls == Byte.TYPE) && number.shortValue() <= 255 && number.shortValue() >= -128) {
            return Byte.valueOf(number.byteValue());
        }
        if ((cls == Short.class || cls == Short.TYPE) && number.intValue() <= 32767 && number.intValue() >= -32768) {
            return Short.valueOf(number.shortValue());
        }
        if ((cls == Character.class || cls == Character.TYPE) && number.intValue() <= 65535 && number.intValue() >= 0) {
            return Character.valueOf((char) number.intValue());
        }
        if ((cls == Integer.class || cls == Integer.TYPE) && number.longValue() <= 2147483647L && number.longValue() >= -2147483648L) {
            return number instanceof Byte ? Integer.valueOf(Byte.toUnsignedInt(number.byteValue())) : Integer.valueOf(number.intValue());
        }
        if ((cls == Float.class || cls == Float.TYPE) && !Float.isInfinite(number.floatValue())) {
            return Float.valueOf(number.floatValue());
        }
        if ((cls == Double.class || cls == Double.TYPE) && !Double.isInfinite(number.doubleValue())) {
            return Double.valueOf(number.doubleValue());
        }
        double dDoubleValue = number.doubleValue();
        Class<?> cls2 = Long.TYPE;
        if (dDoubleValue == 0.0d) {
            if (cls == Long.class || cls == cls2) {
                return 0L;
            }
            if (cls == BigInteger.class) {
                return BigInteger.ZERO;
            }
            if (cls == BigDecimal.class) {
                return BigDecimal.ZERO.setScale(1);
            }
        } else if (number.doubleValue() == 1.0d) {
            if (cls == Long.class || cls == cls2) {
                return Long.valueOf(serialVersionUID);
            }
            if (cls == BigInteger.class) {
                return BigInteger.ONE;
            }
            if (cls == BigDecimal.class) {
                return BigDecimal.ONE.setScale(1);
            }
        } else {
            if (cls == BigDecimal.class) {
                return number instanceof BigInteger ? new BigDecimal((BigInteger) number).setScale(1) : Types.isFloatingpoint(number) ? BigDecimal.valueOf(number.doubleValue()) : new BigDecimal(number.longValue()).setScale(1);
            }
            BigInteger bigInteger = number instanceof BigInteger ? (BigInteger) number : number instanceof BigDecimal ? ((BigDecimal) number).toBigInteger() : Types.isFloatingpoint(number) ? BigDecimal.valueOf(number.doubleValue()).toBigInteger() : BigInteger.valueOf(number.longValue());
            if ((cls == Long.class || cls == cls2) && bigInteger.compareTo(LONG_MIN) >= 0 && bigInteger.compareTo(LONG_MAX) <= 0) {
                return Long.valueOf(number.longValue());
            }
            if (cls == BigInteger.class) {
                return bigInteger;
            }
        }
        StringBuilder sb2 = new StringBuilder("cannot assign number ");
        sb2.append(number);
        String simpleName = cls.getSimpleName();
        sb2.append(" to type ");
        sb2.append(simpleName);
        throw new InterpreterError(sb2.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object castNumberStrictJava(Class<?> cls, Number number) {
        return (cls == Byte.class || cls == Byte.TYPE) ? Byte.valueOf(number.byteValue()) : (cls == Short.class || cls == Short.TYPE) ? Short.valueOf(number.shortValue()) : (cls == Character.class || cls == Character.TYPE) ? Character.valueOf((char) number.intValue()) : (cls == Integer.class || cls == Integer.TYPE) ? Integer.valueOf(number.intValue()) : (cls == Long.class || cls == Long.TYPE) ? Long.valueOf(number.longValue()) : (cls == Float.class || cls == Float.TYPE) ? Float.valueOf(number.floatValue()) : (cls == Double.class || cls == Double.TYPE) ? Double.valueOf(number.doubleValue()) : castNumber(cls, number);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Primitive castPrimitive(Class<?> cls, Class<?> cls2, Primitive primitive, boolean z9, int i9) throws UtilEvalError {
        if (cls2 == Void.TYPE) {
            if (z9) {
                return Types.INVALID_CAST;
            }
            throw Types.castError(StringUtil.typeString(cls), "void value", i9);
        }
        if (!z9 && primitive.isNumber() && Types.isNumeric(cls)) {
            return new Primitive(castNumber(cls, primitive.numberValue()));
        }
        if (cls.isPrimitive()) {
            if (cls2 == null && !VOID.equals(primitive)) {
                return z9 ? Types.VALID_CAST : getDefaultValue(cls);
            }
            Class<?> cls3 = Boolean.TYPE;
            return cls == cls3 ? z9 ? Types.VALID_CAST : new Primitive(castWrapper(cls, primitive)) : (z9 && cls2 == cls3) ? cls != cls3 ? Types.INVALID_CAST : Types.VALID_CAST : (i9 == 1 && !Types.isJavaAssignable(cls, cls2) && z9) ? Types.INVALID_CAST : z9 ? Types.VALID_CAST : new Primitive(castWrapper(cls, primitive));
        }
        if (cls2 == null) {
            return z9 ? Types.VALID_CAST : NULL;
        }
        if (z9) {
            return Types.INVALID_CAST;
        }
        throw Types.castError("object type ".concat(cls.getName()), "primitive value", i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object castWrapper(Class<?> cls, Object obj) {
        if (VOID.equals(obj)) {
            return obj;
        }
        Object objUnwrap = unwrap(obj);
        if (!isWrapperType(cls) && !cls.isPrimitive()) {
            C0353j.m1308f(AbstractC3199a.m6838k(cls, "invalid type in castWrapper: "));
            return null;
        }
        if (objUnwrap instanceof Character) {
            objUnwrap = Integer.valueOf(((Character) objUnwrap).charValue());
        }
        if (cls == Boolean.TYPE) {
            if (objUnwrap instanceof Boolean) {
                return objUnwrap;
            }
            if (objUnwrap instanceof String) {
                return Boolean.valueOf(!HttpUrl.FRAGMENT_ENCODE_SET.equals(String.valueOf(objUnwrap)));
            }
            if (objUnwrap instanceof Number) {
                return Boolean.valueOf(((Number) objUnwrap).intValue() != 0);
            }
            return Boolean.valueOf(objUnwrap != null);
        }
        if (objUnwrap == null && cls.isPrimitive()) {
            objUnwrap = unwrap(getDefaultValue(cls));
        }
        if (objUnwrap instanceof String) {
            try {
                objUnwrap = Double.valueOf(Double.parseDouble(String.valueOf(objUnwrap)));
            } catch (NumberFormatException e6) {
                throw new InterpreterError("cannot cast string \"" + objUnwrap + "\" to number", e6);
            }
        }
        if (objUnwrap instanceof Boolean) {
            objUnwrap = Integer.valueOf(((Boolean) objUnwrap).booleanValue() ? 1 : 0);
        }
        if (objUnwrap instanceof Number) {
            return castNumber(cls, (Number) objUnwrap);
        }
        throw new InterpreterError("bad type in cast " + StringUtil.typeValueString(objUnwrap));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Primitive getDefaultValue(Class<?> cls) {
        return cls == null ? NULL : (Boolean.TYPE == cls || Boolean.class == cls) ? FALSE : (Character.TYPE == cls || Character.class == cls) ? ZERO_CHAR : (Byte.TYPE == cls || Byte.class == cls) ? ZERO_BYTE : (Short.TYPE == cls || Short.class == cls) ? ZERO_SHORT : (Integer.TYPE == cls || Integer.class == cls) ? ZERO_INT : (Long.TYPE == cls || Long.class == cls) ? ZERO_LONG : (Float.TYPE == cls || Float.class == cls) ? ZERO_FLOAT : (Double.TYPE == cls || Double.class == cls) ? ZERO_DOUBLE : BigInteger.class == cls ? ZERO_BIG_INTEGER : BigDecimal.class == cls ? ZERO_BIG_DECIMAL : NULL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isWrapperType(Class<?> cls) {
        return (cls == null || !wrapperMap.containsKey(cls) || cls.isPrimitive()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Object readResolve() {
        return this.value == Special.NULL_VALUE ? NULL : this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Primitive shrinkWrap(Object obj) {
        if (!(obj instanceof Number)) {
            C0353j.m1308f("Can only shrink wrap Number types");
            return null;
        }
        Number number = (Number) obj;
        if (Types.isFloatingpoint(obj)) {
            return obj instanceof Float ? new Primitive(number.floatValue()) : !Double.isInfinite(number.doubleValue()) ? new Primitive(number.doubleValue()) : new Primitive((BigDecimal) obj);
        }
        BigInteger bigIntegerValueOf = obj instanceof BigInteger ? (BigInteger) obj : BigInteger.valueOf(number.longValue());
        return (bigIntegerValueOf.compareTo(INTEGER_MIN) < 0 || bigIntegerValueOf.compareTo(INTEGER_MAX) > 0) ? (bigIntegerValueOf.compareTo(LONG_MIN) < 0 || bigIntegerValueOf.compareTo(LONG_MAX) > 0) ? new Primitive(bigIntegerValueOf) : new Primitive(bigIntegerValueOf.longValue()) : new Primitive(bigIntegerValueOf.intValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Class<?> unboxType(Class<?> cls) {
        Class<?> cls2 = wrapperMap.get(cls);
        if (cls2 != null && (cls2.isPrimitive() || cls2 == cls)) {
            return cls2;
        }
        C0353j.m1308f(AbstractC3199a.m6838k(cls, "Not a primitive wrapper type: "));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object[] unwrap(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i9 = 0; i9 < objArr.length; i9++) {
            objArr2[i9] = unwrap(objArr[i9]);
        }
        return objArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object wrap(Object obj, Class<?> cls) {
        if (cls == Void.TYPE) {
            return VOID;
        }
        if (obj == null) {
            return NULL;
        }
        if (Types.isPrimitive(cls)) {
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue() ? TRUE : FALSE;
            }
            if (isWrapperType(obj.getClass())) {
                return new Primitive(obj);
            }
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Primitive castToType(Class<?> cls, int i9) {
        return castPrimitive(cls, getType(), this, false, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (!(obj instanceof Primitive)) {
            if (!wrapperMap.containsKey(obj.getClass())) {
                return false;
            }
            obj = new Primitive(obj);
        }
        Primitive primitive = (Primitive) obj;
        return (primitive.isNumber() && isNumber()) ? getType() == BigDecimal.class ? this.value.equals(castNumber(BigDecimal.class, primitive.numberValue())) : primitive.getType() == BigDecimal.class ? primitive.value.equals(castNumber(BigDecimal.class, numberValue())) : (Types.isFloatingpoint(this.value) || Types.isFloatingpoint(primitive.value)) ? numberValue().doubleValue() == primitive.numberValue().doubleValue() : getType() == BigInteger.class ? this.value.equals(castNumber(BigInteger.class, primitive.numberValue())) : primitive.getType() == BigInteger.class ? primitive.value.equals(castNumber(BigInteger.class, numberValue())) : numberValue().longValue() == primitive.numberValue().longValue() : this.value.equals(primitive.value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class<?> getType() {
        if (this == VOID) {
            return Void.TYPE;
        }
        if (this == NULL) {
            return null;
        }
        return unboxType(this.value.getClass());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object getValue() {
        Object obj = this.value;
        if (obj == Special.NULL_VALUE) {
            return null;
        }
        if (obj != Special.VOID_TYPE) {
            return obj;
        }
        C0353j.m1308f("attempt to unwrap void type");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return this.value.hashCode() * 21;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isNumber() {
        Object obj = this.value;
        return ((obj instanceof Boolean) || this == NULL || this == VOID || !Types.isNumeric(obj)) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Number numberValue() {
        Object obj = this.value;
        boolean z9 = obj instanceof Character;
        Object objValueOf = obj;
        if (z9) {
            objValueOf = Integer.valueOf(((Character) obj).charValue());
        }
        if (objValueOf instanceof Number) {
            return (Number) objValueOf;
        }
        if (objValueOf instanceof Boolean) {
            return Integer.valueOf(((Boolean) objValueOf).booleanValue() ? 1 : 0);
        }
        C0353j.m1308f("Primitive not a number");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        Object obj = this.value;
        return obj == Special.NULL_VALUE ? "null" : obj == Special.VOID_TYPE ? "void" : obj.toString();
    }

    public Primitive(boolean z9) {
        this(z9 ? Boolean.TRUE : Boolean.FALSE);
    }

    public Primitive(byte b10) {
        this(Byte.valueOf(b10));
    }

    public Primitive(short s10) {
        this(Short.valueOf(s10));
    }

    public Primitive(char c10) {
        this(Character.valueOf(c10));
    }

    public Primitive(int i9) {
        this(Integer.valueOf(i9));
    }

    public Primitive(long j3) {
        this(Long.valueOf(j3));
    }

    public Primitive(float f3) {
        this(Float.valueOf(f3));
    }

    public static Object unwrap(Object obj) {
        if (obj == VOID) {
            return null;
        }
        return obj instanceof Primitive ? ((Primitive) obj).getValue() : obj;
    }

    public Primitive(double d10) {
        this(Double.valueOf(d10));
    }

    public Primitive(BigInteger bigInteger) {
        this((Object) bigInteger);
    }

    private Primitive(Object obj) {
        if (obj != null) {
            this.value = obj;
        } else {
            C0353j.m1308f("Use Primitve.NULL instead of Primitive(null)");
            throw null;
        }
    }

    public static Object[] wrap(Object[] objArr, Class<?>[] clsArr) {
        if (objArr == null) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i9 = 0; i9 < objArr.length; i9++) {
            objArr2[i9] = wrap(objArr[i9], clsArr[i9]);
        }
        return objArr2;
    }
}
