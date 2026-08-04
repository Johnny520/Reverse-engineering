package yyds;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: yyds.ᛳᲈᲀᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0754 extends AbstractC0517 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Serializable f3466;

    public C0754(Boolean bool) {
        this.f3466 = bool;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static boolean m1699(C0754 c0754) {
        Serializable serializable = c0754.f3466;
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
        if (obj == null || C0754.class != obj.getClass()) {
            return false;
        }
        C0754 c0754 = (C0754) obj;
        Serializable serializable = c0754.f3466;
        boolean zM1699 = m1699(this);
        Serializable serializable2 = this.f3466;
        if (zM1699 && m1699(c0754)) {
            return ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) ? m1700().equals(c0754.m1700()) : m1701().longValue() == c0754.m1701().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : AbstractC0578.m1448(mo1363())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : AbstractC0578.m1448(c0754.mo1363())) == 0;
        }
        double dDoubleValue = serializable2 instanceof Number ? m1701().doubleValue() : Double.parseDouble(mo1363());
        double dDoubleValue2 = serializable instanceof Number ? c0754.m1701().doubleValue() : Double.parseDouble(c0754.mo1363());
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        if (m1699(this)) {
            jDoubleToLongBits = m1701().longValue();
        } else {
            Serializable serializable = this.f3466;
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(m1701().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    @Override // yyds.AbstractC0517
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final String mo1363() {
        Serializable serializable = this.f3466;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return m1701().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final BigInteger m1700() {
        Serializable serializable = this.f3466;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (m1699(this)) {
            return BigInteger.valueOf(m1701().longValue());
        }
        String strMo1363 = mo1363();
        AbstractC0578.m1451(strMo1363);
        return new BigInteger(strMo1363);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Number m1701() {
        Serializable serializable = this.f3466;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new C0234((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public C0754(Number number) {
        this.f3466 = number;
    }

    public C0754(String str) {
        this.f3466 = str;
    }
}
