package com.alibaba.fastjson2.internal;

import com.alibaba.fastjson2.JSONException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class Cast {
    private static JSONException errorToBigDecimal(Object obj) {
        return new JSONException("Cannot convert " + obj + " to BigDecimal");
    }

    private static JSONException errorToBigInteger(Object obj) {
        return new JSONException("Cannot convert " + obj + " to BigInteger");
    }

    private static JSONException errorToBoolean(Object obj) {
        return new JSONException("Cannot convert " + obj + " to boolean");
    }

    private static JSONException errorToByte(Object obj) {
        return new JSONException("Cannot convert " + obj + " to byte");
    }

    private static JSONException errorToChar(Object obj) {
        return new JSONException("Cannot convert " + obj + " to char");
    }

    private static JSONException errorToDouble(Object obj) {
        return new JSONException("Cannot convert " + obj + " to double");
    }

    private static JSONException errorToFloat(Object obj) {
        return new JSONException("Cannot convert " + obj + " to float");
    }

    private static JSONException errorToInt(Object obj) {
        return new JSONException("Cannot convert " + obj + " to int");
    }

    private static JSONException errorToLong(Object obj) {
        return new JSONException("Cannot convert " + obj + " to long");
    }

    private static JSONException errorToNumber(Object obj) {
        return new JSONException("Cannot convert " + obj + " to Number");
    }

    private static JSONException errorToShort(Object obj) {
        return new JSONException("Cannot convert " + obj + " to short");
    }

    public static BigDecimal toBigDecimal(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof BigDecimal ? (BigDecimal) obj : toBigDecimalEx(obj);
    }

    private static BigDecimal toBigDecimalEx(Object obj) {
        if (obj instanceof BigInteger) {
            return new BigDecimal((BigInteger) obj);
        }
        if (obj instanceof Number) {
            return ((obj instanceof Float) || (obj instanceof Double)) ? BigDecimal.valueOf(((Number) obj).doubleValue()) : new BigDecimal(obj.toString());
        }
        if (obj instanceof Boolean) {
            return BigDecimal.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Character) {
            return BigDecimal.valueOf(((Character) obj).charValue());
        }
        if (obj instanceof String) {
            return new BigDecimal((String) obj);
        }
        if (obj == null) {
            return BigDecimal.ZERO;
        }
        throw errorToBigDecimal(obj);
    }

    public static BigInteger toBigInteger(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof BigInteger ? (BigInteger) obj : toBigIntegerEx(obj);
    }

    private static BigInteger toBigIntegerEx(Object obj) {
        if (obj instanceof BigDecimal) {
            return ((BigDecimal) obj).toBigInteger();
        }
        if (obj instanceof Number) {
            return BigInteger.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof Boolean) {
            return BigInteger.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Character) {
            return BigInteger.valueOf(((Character) obj).charValue());
        }
        if (obj instanceof String) {
            return new BigInteger((String) obj);
        }
        throw errorToBigInteger(obj);
    }

    public static Boolean toBoolean(Object obj) {
        return (obj == null || (obj instanceof Boolean)) ? (Boolean) obj : Boolean.valueOf(toBooleanEx(obj));
    }

    private static boolean toBooleanEx(Object obj) {
        if (obj instanceof BigInteger) {
            return toBooleanValue((BigInteger) obj);
        }
        if (obj instanceof BigDecimal) {
            return toBooleanValue((BigDecimal) obj);
        }
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue() != 0.0d;
        }
        if (obj instanceof Character) {
            return ((Character) obj).charValue() != 0;
        }
        if (obj instanceof String) {
            return toBooleanValue((String) obj);
        }
        if (obj == null) {
            return false;
        }
        throw errorToBoolean(obj);
    }

    public static boolean toBooleanValue(char c10) {
        return c10 == '1' || c10 == 't' || c10 == 'T';
    }

    public static Byte toByte(Object obj) {
        return (obj == null || (obj instanceof Byte)) ? (Byte) obj : Byte.valueOf(toByteEx(obj));
    }

    private static byte toByteEx(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0;
        }
        if (obj instanceof Character) {
            return (byte) ((Character) obj).charValue();
        }
        if (obj instanceof String) {
            return toByteValue((String) obj);
        }
        if (obj instanceof Number) {
            return toByteValue(((Number) obj).doubleValue());
        }
        if (obj == null) {
            return (byte) 0;
        }
        throw errorToByte(obj);
    }

    public static byte toByteValue(Object obj) {
        return obj instanceof Byte ? ((Byte) obj).byteValue() : toByteEx(obj);
    }

    private static char toCharEx(Object obj) {
        if (obj instanceof Short) {
            return toCharValue(((Short) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return toCharValue(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            return toCharValue(((Long) obj).longValue());
        }
        if (obj instanceof Float) {
            return toCharValue(((Float) obj).floatValue());
        }
        if (obj instanceof Double) {
            return toCharValue(((Double) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? (char) 1 : (char) 0;
        }
        if (obj instanceof String) {
            return toCharValue((String) obj);
        }
        if (obj instanceof BigInteger) {
            return toCharValue((BigInteger) obj);
        }
        if (obj instanceof BigDecimal) {
            return toCharValue((BigDecimal) obj);
        }
        if (obj == null) {
            return (char) 0;
        }
        throw errorToChar(obj);
    }

    public static char toCharValue(String str) {
        if (str == null) {
            return (char) 0;
        }
        if (str.length() == 1) {
            return str.charAt(0);
        }
        try {
            return (char) Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw errorToChar(str);
        }
    }

    public static Character toCharacter(Object obj) {
        return (obj == null || (obj instanceof Character)) ? (Character) obj : Character.valueOf(toCharEx(obj));
    }

    public static Double toDouble(Object obj) {
        return (obj == null || (obj instanceof Double)) ? (Double) obj : Double.valueOf(toDoubleEx(obj));
    }

    private static double toDoubleEx(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? 1.0d : 0.0d;
        }
        if (obj instanceof Character) {
            return toDoubleValue(((Character) obj).charValue());
        }
        if (obj instanceof String) {
            return toDoubleValue((String) obj);
        }
        if (obj instanceof BigInteger) {
            return toDoubleValue((BigInteger) obj);
        }
        if (obj instanceof BigDecimal) {
            return toDoubleValue((BigDecimal) obj);
        }
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        if (obj == null) {
            return 0.0d;
        }
        throw errorToDouble(obj);
    }

    public static double toDoubleValue(char c10) {
        if (c10 < '0' || c10 > '9') {
            throw errorToDouble(Character.valueOf(c10));
        }
        return c10 - '0';
    }

    public static Float toFloat(Object obj) {
        return (obj == null || (obj instanceof Float)) ? (Float) obj : Float.valueOf(toFloatEx(obj));
    }

    private static float toFloatEx(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? 1.0f : 0.0f;
        }
        if (obj instanceof Character) {
            return toFloatValue(((Character) obj).charValue());
        }
        if (obj instanceof String) {
            return toFloatValue((String) obj);
        }
        if (obj instanceof BigInteger) {
            return toFloatValue((BigInteger) obj);
        }
        if (obj instanceof BigDecimal) {
            return toFloatValue((BigDecimal) obj);
        }
        if (obj instanceof Number) {
            return ((Number) obj).floatValue();
        }
        if (obj == null) {
            return 0.0f;
        }
        throw errorToFloat(obj);
    }

    public static float toFloatValue(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : toFloatEx(obj);
    }

    private static int toIntEx(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? 1 : 0;
        }
        if (obj instanceof Character) {
            return toIntValue(((Character) obj).charValue());
        }
        if (obj instanceof String) {
            return toIntValue((String) obj);
        }
        if (obj instanceof BigInteger) {
            return toIntValue((BigInteger) obj);
        }
        if (obj instanceof BigDecimal) {
            return toIntValue((BigDecimal) obj);
        }
        if (obj instanceof Number) {
            return toIntValue(((Number) obj).intValue());
        }
        if (obj == null) {
            return 0;
        }
        throw errorToInt(obj);
    }

    public static int toIntValue(char c10) {
        if (c10 < '0' || c10 > '9') {
            throw errorToInt(Character.valueOf(c10));
        }
        return c10 - '0';
    }

    public static Integer toInteger(Object obj) {
        return (obj == null || (obj instanceof Integer)) ? (Integer) obj : Integer.valueOf(toIntEx(obj));
    }

    public static Long toLong(Object obj) {
        return (obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf(toLongEx(obj));
    }

    private static long toLongEx(Object obj) {
        if (obj instanceof Boolean) {
            return toLongValue(((Boolean) obj).booleanValue());
        }
        if (obj instanceof Character) {
            return toLongValue(((Character) obj).charValue());
        }
        if (obj instanceof String) {
            return toLongValue((String) obj);
        }
        if (obj instanceof BigInteger) {
            return toLongValue((BigInteger) obj);
        }
        if (obj instanceof BigDecimal) {
            return toLongValue((BigDecimal) obj);
        }
        if (obj instanceof Number) {
            return toLongValue(((Number) obj).longValue());
        }
        if (obj == null) {
            return 0L;
        }
        throw errorToLong(obj);
    }

    public static long toLongValue(Object obj) {
        return obj instanceof Long ? ((Long) obj).longValue() : toLongEx(obj);
    }

    public static Number toNumber(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (!str.contains(".") && !str.toLowerCase().contains("e")) {
                return Long.valueOf(Long.parseLong(str));
            }
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            throw errorToNumber(str);
        }
    }

    private static Number toNumberEx(Object obj) {
        if (obj instanceof Boolean) {
            return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Character) {
            return Double.valueOf(((Character) obj).charValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            try {
                if (!str.contains(".") && !str.toLowerCase().contains("e")) {
                    return Long.valueOf(Long.parseLong(str));
                }
                return Double.valueOf(Double.parseDouble(str));
            } catch (NumberFormatException unused) {
                throw errorToNumber(obj);
            }
        }
        if (obj instanceof BigDecimal) {
            return (BigDecimal) obj;
        }
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        if (obj == null) {
            return null;
        }
        throw errorToNumber(obj);
    }

    public static Short toShort(Object obj) {
        return (obj == null || (obj instanceof Short)) ? (Short) obj : Short.valueOf(toShortEx(obj));
    }

    private static short toShortEx(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? (short) 1 : (short) 0;
        }
        if (obj instanceof Character) {
            return (short) ((Character) obj).charValue();
        }
        if (obj instanceof String) {
            return toShortValue((String) obj);
        }
        if (obj instanceof BigInteger) {
            return toShortValue((BigInteger) obj);
        }
        if (obj instanceof BigDecimal) {
            return toShortValue((BigDecimal) obj);
        }
        if (obj instanceof Number) {
            return toShortValue((int) ((Number) obj).shortValue());
        }
        if (obj == null) {
            return (short) 0;
        }
        throw errorToShort(obj);
    }

    public static short toShortValue(Object obj) {
        return obj instanceof Short ? ((Short) obj).shortValue() : toShortEx(obj);
    }

    public static String toString(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public static String toString(byte b10) {
        return String.valueOf((int) b10);
    }

    public static String toString(short s10) {
        return String.valueOf((int) s10);
    }

    public static String toString(char c10) {
        return String.valueOf(c10);
    }

    public static String toString(int i10) {
        return String.valueOf(i10);
    }

    public static String toString(long j10) {
        return String.valueOf(j10);
    }

    public static String toString(float f10) {
        return String.valueOf(f10);
    }

    public static String toString(double d10) {
        return String.valueOf(d10);
    }

    public static BigDecimal toBigDecimal(byte b10) {
        return BigDecimal.valueOf(b10);
    }

    public static BigInteger toBigInteger(byte b10) {
        return BigInteger.valueOf(b10);
    }

    public static byte toByteValue(double d10) {
        return (byte) d10;
    }

    public static float toFloatValue(double d10) {
        return (float) d10;
    }

    public static long toLongValue(double d10) {
        return (long) d10;
    }

    public static short toShortValue(double d10) {
        return (short) d10;
    }

    public static String toString(boolean z10) {
        return String.valueOf(z10);
    }

    public static BigDecimal toBigDecimal(short s10) {
        return BigDecimal.valueOf(s10);
    }

    public static BigInteger toBigInteger(short s10) {
        return BigInteger.valueOf(s10);
    }

    public static boolean toBooleanValue(byte b10) {
        return b10 != 0;
    }

    public static byte toByteValue(float f10) {
        return (byte) f10;
    }

    public static float toFloatValue(int i10) {
        return i10;
    }

    public static long toLongValue(float f10) {
        return (long) f10;
    }

    public static short toShortValue(float f10) {
        return (short) f10;
    }

    public static String toString(BigInteger bigInteger) {
        if (bigInteger == null) {
            return null;
        }
        return bigInteger.toString();
    }

    public static BigDecimal toBigDecimal(char c10) {
        return BigDecimal.valueOf(c10);
    }

    public static BigInteger toBigInteger(char c10) {
        return BigInteger.valueOf(c10);
    }

    public static boolean toBooleanValue(double d10) {
        return d10 != 0.0d;
    }

    public static byte toByteValue(int i10) {
        return (byte) i10;
    }

    public static float toFloatValue(long j10) {
        return j10;
    }

    public static long toLongValue(int i10) {
        return i10;
    }

    public static short toShortValue(int i10) {
        return (short) i10;
    }

    public static String toString(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return null;
        }
        return bigDecimal.toString();
    }

    public static BigDecimal toBigDecimal(int i10) {
        return BigDecimal.valueOf(i10);
    }

    public static BigInteger toBigInteger(int i10) {
        return BigInteger.valueOf(i10);
    }

    public static boolean toBooleanValue(float f10) {
        return f10 != 0.0f;
    }

    public static byte toByteValue(long j10) {
        return (byte) j10;
    }

    public static float toFloatValue(short s10) {
        return s10;
    }

    public static int toIntValue(float f10) {
        return (int) f10;
    }

    public static long toLongValue(short s10) {
        return s10;
    }

    public static short toShortValue(long j10) {
        return (short) j10;
    }

    public static BigDecimal toBigDecimal(long j10) {
        return BigDecimal.valueOf(j10);
    }

    public static BigInteger toBigInteger(long j10) {
        return BigInteger.valueOf(j10);
    }

    public static boolean toBooleanValue(int i10) {
        return i10 != 0;
    }

    public static byte toByteValue(short s10) {
        return (byte) s10;
    }

    public static double toDoubleValue(long j10) {
        return j10;
    }

    public static float toFloatValue(boolean z10) {
        return z10 ? 1.0f : 0.0f;
    }

    public static int toIntValue(long j10) {
        return (int) j10;
    }

    public static long toLongValue(boolean z10) {
        return z10 ? 1L : 0L;
    }

    public static short toShortValue(boolean z10) {
        return z10 ? (short) 1 : (short) 0;
    }

    public static BigDecimal toBigDecimal(float f10) {
        return BigDecimal.valueOf(f10);
    }

    public static BigInteger toBigInteger(float f10) {
        return BigInteger.valueOf((long) f10);
    }

    public static boolean toBooleanValue(long j10) {
        return j10 != 0;
    }

    public static byte toByteValue(boolean z10) {
        return z10 ? (byte) 1 : (byte) 0;
    }

    public static double toDoubleValue(boolean z10) {
        return z10 ? 1.0d : 0.0d;
    }

    public static float toFloatValue(char c10) {
        return c10;
    }

    public static int toIntValue(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return toIntEx(obj);
    }

    public static long toLongValue(char c10) {
        return c10;
    }

    public static short toShortValue(char c10) {
        return (short) c10;
    }

    public static BigDecimal toBigDecimal(double d10) {
        return BigDecimal.valueOf(d10);
    }

    public static BigInteger toBigInteger(double d10) {
        return BigInteger.valueOf((long) d10);
    }

    public static boolean toBooleanValue(short s10) {
        return s10 != 0;
    }

    public static byte toByteValue(char c10) {
        return (byte) c10;
    }

    public static double toDoubleValue(Object obj) {
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        return toDoubleEx(obj);
    }

    public static float toFloatValue(String str) {
        if (str == null) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            throw errorToFloat(str);
        }
    }

    public static long toLongValue(String str) {
        if (str == null) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            throw errorToLong(str);
        }
    }

    public static short toShortValue(String str) {
        if (str == null) {
            return (short) 0;
        }
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException unused) {
            throw errorToShort(str);
        }
    }

    public static BigDecimal toBigDecimal(boolean z10) {
        return z10 ? BigDecimal.ONE : BigDecimal.ZERO;
    }

    public static BigInteger toBigInteger(boolean z10) {
        return z10 ? BigInteger.ONE : BigInteger.ZERO;
    }

    public static boolean toBooleanValue(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return toBooleanEx(obj);
    }

    public static byte toByteValue(String str) {
        if (str == null) {
            return (byte) 0;
        }
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException unused) {
            throw errorToByte(str);
        }
    }

    public static BigDecimal toBigDecimal(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new BigDecimal(str);
        } catch (NumberFormatException unused) {
            throw errorToBigDecimal(str);
        }
    }

    public static BigInteger toBigInteger(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new BigInteger(str);
        } catch (NumberFormatException unused) {
            throw errorToBigInteger(str);
        }
    }

    public static float toFloatValue(BigInteger bigInteger) {
        return bigInteger.floatValue();
    }

    public static int toIntValue(double d10) {
        return (int) d10;
    }

    public static long toLongValue(BigInteger bigInteger) {
        return bigInteger.longValue();
    }

    public static short toShortValue(BigInteger bigInteger) {
        return bigInteger.shortValue();
    }

    public static byte toByteValue(BigInteger bigInteger) {
        return bigInteger.byteValue();
    }

    public static double toDoubleValue(int i10) {
        return i10;
    }

    public static float toFloatValue(BigDecimal bigDecimal) {
        return bigDecimal.floatValue();
    }

    public static int toIntValue(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw errorToInt(str);
        }
    }

    public static long toLongValue(BigDecimal bigDecimal) {
        return bigDecimal.longValue();
    }

    public static short toShortValue(BigDecimal bigDecimal) {
        return bigDecimal.shortValue();
    }

    public static boolean toBooleanValue(String str) {
        if (str == null) {
            return false;
        }
        return Boolean.parseBoolean(str);
    }

    public static byte toByteValue(BigDecimal bigDecimal) {
        return bigDecimal.byteValue();
    }

    public static double toDoubleValue(String str) {
        if (str == null) {
            return 0.0d;
        }
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            throw errorToDouble(str);
        }
    }

    public static boolean toBooleanValue(BigInteger bigInteger) {
        return !bigInteger.equals(BigInteger.ZERO);
    }

    public static char toCharValue(float f10) {
        return (char) f10;
    }

    public static int toIntValue(BigInteger bigInteger) {
        return bigInteger.intValue();
    }

    public static boolean toBooleanValue(BigDecimal bigDecimal) {
        return bigDecimal.compareTo(BigDecimal.ZERO) != 0;
    }

    public static char toCharValue(int i10) {
        return (char) i10;
    }

    public static double toDoubleValue(BigInteger bigInteger) {
        return bigInteger.doubleValue();
    }

    public static int toIntValue(BigDecimal bigDecimal) {
        return bigDecimal.intValue();
    }

    public static char toCharValue(long j10) {
        return (char) j10;
    }

    public static double toDoubleValue(BigDecimal bigDecimal) {
        return bigDecimal.doubleValue();
    }

    public static char toCharValue(short s10) {
        return (char) s10;
    }

    public static char toCharValue(boolean z10) {
        return z10 ? '1' : '0';
    }

    public static char toCharValue(Object obj) {
        if (obj instanceof Character) {
            return ((Character) obj).charValue();
        }
        return toCharEx(obj);
    }

    public static char toCharValue(double d10) {
        return (char) d10;
    }

    public static char toCharValue(BigInteger bigInteger) {
        return (char) bigInteger.intValue();
    }

    public static char toCharValue(BigDecimal bigDecimal) {
        return (char) bigDecimal.intValue();
    }

    public static Number toNumber(BigInteger bigInteger) {
        return bigInteger;
    }

    public static Number toNumber(Object obj) {
        if (obj != null && !(obj instanceof Number)) {
            return toNumberEx(obj);
        }
        return (Number) obj;
    }

    public static Number toNumber(byte b10) {
        return Byte.valueOf(b10);
    }

    public static Number toNumber(short s10) {
        return Short.valueOf(s10);
    }

    public static Number toNumber(char c10) {
        return Integer.valueOf(c10);
    }

    public static Number toNumber(int i10) {
        return Integer.valueOf(i10);
    }

    public static Number toNumber(long j10) {
        return Long.valueOf(j10);
    }

    public static Number toNumber(float f10) {
        return Float.valueOf(f10);
    }

    public static Number toNumber(double d10) {
        return Double.valueOf(d10);
    }

    public static Number toNumber(boolean z10) {
        return Integer.valueOf(z10 ? 1 : 0);
    }

    public static Number toNumber(BigDecimal bigDecimal) {
        return bigDecimal;
    }
}
