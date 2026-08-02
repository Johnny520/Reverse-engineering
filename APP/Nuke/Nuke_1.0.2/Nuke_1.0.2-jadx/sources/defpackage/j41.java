package defpackage;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class j41 extends k31 {
    public final Serializable h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j41(Boolean bool) {
        Objects.requireNonNull(bool);
        this.h = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean d(j41 j41Var) {
        Serializable serializable = j41Var.h;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.k31
    public final String a() {
        Serializable serializable = this.h;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return c().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final BigInteger b() {
        Serializable serializable = this.h;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (d(this)) {
            return BigInteger.valueOf(c().longValue());
        }
        String strA = a();
        up0.l(strA);
        return new BigInteger(strA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Number c() {
        Serializable serializable = this.h;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new i71((String) serializable);
        }
        c80.t("Primitive is neither a number nor a string");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j41.class != obj.getClass()) {
            return false;
        }
        j41 j41Var = (j41) obj;
        Serializable serializable = j41Var.h;
        Serializable serializable2 = this.h;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (d(this) && d(j41Var)) {
            return ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) ? b().equals(j41Var.b()) : c().longValue() == j41Var.c().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : up0.D(a())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : up0.D(j41Var.a())) == 0;
        }
        double dDoubleValue = serializable2 instanceof Number ? c().doubleValue() : Double.parseDouble(a());
        double dDoubleValue2 = serializable instanceof Number ? j41Var.c().doubleValue() : Double.parseDouble(j41Var.a());
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.h;
        if (serializable == null) {
            return 31;
        }
        if (d(this)) {
            jDoubleToLongBits = c().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(c().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public j41(Number number) {
        Objects.requireNonNull(number);
        this.h = number;
    }

    public j41(String str) {
        Objects.requireNonNull(str);
        this.h = str;
    }
}
