package com.google.gson;

import com.google.gson.internal.AbstractC3220;
import com.google.gson.internal.LazilyParsedNumber;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3247 extends AbstractC3256 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Serializable f10914;

    public C3247(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f10914 = bool;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static boolean m7342(C3247 c3247) {
        Serializable serializable = c3247.f10914;
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
        if (obj == null || C3247.class != obj.getClass()) {
            return false;
        }
        C3247 c3247 = (C3247) obj;
        Serializable serializable = c3247.f10914;
        Serializable serializable2 = this.f10914;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (m7342(this) && m7342(c3247)) {
            return ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) ? m7345().equals(c3247.m7345()) : m7344().longValue() == c3247.m7344().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : AbstractC3220.m7331(m7343())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : AbstractC3220.m7331(c3247.m7343())) == 0;
        }
        double dDoubleValue = serializable2 instanceof Number ? m7344().doubleValue() : Double.parseDouble(m7343());
        double dDoubleValue2 = serializable instanceof Number ? c3247.m7344().doubleValue() : Double.parseDouble(c3247.m7343());
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f10914;
        if (serializable == null) {
            return 31;
        }
        if (m7342(this)) {
            jDoubleToLongBits = m7344().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(m7344().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String m7343() {
        Serializable serializable = this.f10914;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return m7344().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Number m7344() {
        Serializable serializable = this.f10914;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new LazilyParsedNumber((String) serializable);
        }
        C5919.m11247("Primitive is neither a number nor a string");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final BigInteger m7345() {
        Serializable serializable = this.f10914;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (m7342(this)) {
            return BigInteger.valueOf(m7344().longValue());
        }
        String strM7343 = m7343();
        AbstractC3220.m7323(strM7343);
        return new BigInteger(strM7343);
    }

    public C3247(Number number) {
        Objects.requireNonNull(number);
        this.f10914 = number;
    }

    public C3247(String str) {
        Objects.requireNonNull(str);
        this.f10914 = str;
    }
}
