package p000;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class j41 extends k31 {

    /* JADX INFO: renamed from: h */
    public final Serializable f4889h;

    public j41(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f4889h = bool;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m2432d(j41 j41Var) {
        Serializable serializable = j41Var.f4889h;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // p000.k31
    /* JADX INFO: renamed from: a */
    public final String mo25a() {
        Serializable serializable = this.f4889h;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return m2434c().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    /* JADX INFO: renamed from: b */
    public final BigInteger m2433b() {
        Serializable serializable = this.f4889h;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (m2432d(this)) {
            return BigInteger.valueOf(m2434c().longValue());
        }
        String strMo25a = mo25a();
        up0.m5547l(strMo25a);
        return new BigInteger(strMo25a);
    }

    /* JADX INFO: renamed from: c */
    public final Number m2434c() {
        Serializable serializable = this.f4889h;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new i71((String) serializable);
        }
        c80.m676t("Primitive is neither a number nor a string");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j41.class != obj.getClass()) {
            return false;
        }
        j41 j41Var = (j41) obj;
        Serializable serializable = j41Var.f4889h;
        Serializable serializable2 = this.f4889h;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (m2432d(this) && m2432d(j41Var)) {
            return ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) ? m2433b().equals(j41Var.m2433b()) : m2434c().longValue() == j41Var.m2434c().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : up0.m5525D(mo25a())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : up0.m5525D(j41Var.mo25a())) == 0;
        }
        double dDoubleValue = serializable2 instanceof Number ? m2434c().doubleValue() : Double.parseDouble(mo25a());
        double dDoubleValue2 = serializable instanceof Number ? j41Var.m2434c().doubleValue() : Double.parseDouble(j41Var.mo25a());
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f4889h;
        if (serializable == null) {
            return 31;
        }
        if (m2432d(this)) {
            jDoubleToLongBits = m2434c().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(m2434c().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public j41(Number number) {
        Objects.requireNonNull(number);
        this.f4889h = number;
    }

    public j41(String str) {
        Objects.requireNonNull(str);
        this.f4889h = str;
    }
}
