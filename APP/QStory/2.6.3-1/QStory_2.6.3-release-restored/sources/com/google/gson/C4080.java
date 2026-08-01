package com.google.gson;

import com.google.gson.internal.AbstractC4053;
import com.google.gson.internal.LazilyParsedNumber;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4080 extends AbstractC4089 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Serializable f11264;

    public C4080(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f11264 = bool;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static boolean m7888(C4080 c4080) {
        Serializable serializable = c4080.f11264;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4080.class != obj.getClass()) {
            return false;
        }
        C4080 c4080 = (C4080) obj;
        Serializable serializable = c4080.f11264;
        Serializable serializable2 = this.f11264;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (m7888(this) && m7888(c4080)) {
            return ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) ? m7891().equals(c4080.m7891()) : m7890().longValue() == c4080.m7890().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : AbstractC4053.m7877(m7889())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : AbstractC4053.m7877(c4080.m7889())) == 0;
        }
        double dDoubleValue = serializable2 instanceof Number ? m7890().doubleValue() : Double.parseDouble(m7889());
        double dDoubleValue2 = serializable instanceof Number ? c4080.m7890().doubleValue() : Double.parseDouble(c4080.m7889());
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f11264;
        if (serializable == null) {
            return 31;
        }
        if (m7888(this)) {
            jDoubleToLongBits = m7890().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(m7890().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String m7889() {
        Serializable serializable = this.f11264;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return m7890().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Number m7890() {
        Serializable serializable = this.f11264;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new LazilyParsedNumber((String) serializable);
        }
        C6755.m11867("Primitive is neither a number nor a string");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final BigInteger m7891() {
        Serializable serializable = this.f11264;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (m7888(this)) {
            return BigInteger.valueOf(m7890().longValue());
        }
        String strM7889 = m7889();
        AbstractC4053.m7869(strM7889);
        return new BigInteger(strM7889);
    }

    public C4080(Number number) {
        Objects.requireNonNull(number);
        this.f11264 = number;
    }

    public C4080(String str) {
        Objects.requireNonNull(str);
        this.f11264 = str;
    }
}
