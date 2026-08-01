package com.google.gson;

import com.google.gson.internal.AbstractC3221;
import com.google.gson.internal.LazilyParsedNumber;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3248 extends AbstractC3257 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Serializable f10919;

    public C3248(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f10919 = bool;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static boolean m7329(C3248 c3248) {
        Serializable serializable = c3248.f10919;
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
        if (obj == null || C3248.class != obj.getClass()) {
            return false;
        }
        C3248 c3248 = (C3248) obj;
        Serializable serializable = c3248.f10919;
        Serializable serializable2 = this.f10919;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (m7329(this) && m7329(c3248)) {
            return ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) ? m7332().equals(c3248.m7332()) : m7331().longValue() == c3248.m7331().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : AbstractC3221.m7318(m7330())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : AbstractC3221.m7318(c3248.m7330())) == 0;
        }
        double dDoubleValue = serializable2 instanceof Number ? m7331().doubleValue() : Double.parseDouble(m7330());
        double dDoubleValue2 = serializable instanceof Number ? c3248.m7331().doubleValue() : Double.parseDouble(c3248.m7330());
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f10919;
        if (serializable == null) {
            return 31;
        }
        if (m7329(this)) {
            jDoubleToLongBits = m7331().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(m7331().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String m7330() {
        Serializable serializable = this.f10919;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return m7331().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Number m7331() {
        Serializable serializable = this.f10919;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new LazilyParsedNumber((String) serializable);
        }
        C5925.m11308("Primitive is neither a number nor a string");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final BigInteger m7332() {
        Serializable serializable = this.f10919;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (m7329(this)) {
            return BigInteger.valueOf(m7331().longValue());
        }
        String strM7330 = m7330();
        AbstractC3221.m7310(strM7330);
        return new BigInteger(strM7330);
    }

    public C3248(Number number) {
        Objects.requireNonNull(number);
        this.f10919 = number;
    }

    public C3248(String str) {
        Objects.requireNonNull(str);
        this.f10919 = str;
    }
}
