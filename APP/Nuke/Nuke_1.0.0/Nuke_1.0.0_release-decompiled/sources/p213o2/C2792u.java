package p213o2;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import p224q2.AbstractC2917h;
import p224q2.C2919j;

/* JADX INFO: renamed from: o2.u */
/* JADX INFO: loaded from: classes.dex */
public final class C2792u extends AbstractC2788q {

    /* JADX INFO: renamed from: d */
    public final Serializable f8819d;

    public C2792u(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f8819d = bool;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m4980d(C2792u c2792u) {
        Serializable serializable = c2792u.f8819d;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    /* JADX INFO: renamed from: a */
    public final BigInteger m4981a() {
        Serializable serializable = this.f8819d;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (m4980d(this)) {
            return BigInteger.valueOf(m4982b().longValue());
        }
        String strM4983c = m4983c();
        AbstractC2917h.m5112d(strM4983c);
        return new BigInteger(strM4983c);
    }

    /* JADX INFO: renamed from: b */
    public final Number m4982b() {
        Serializable serializable = this.f8819d;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new C2919j((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    /* JADX INFO: renamed from: c */
    public final String m4983c() {
        Serializable serializable = this.f8819d;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return m4982b().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2792u.class != obj.getClass()) {
            return false;
        }
        C2792u c2792u = (C2792u) obj;
        Serializable serializable = c2792u.f8819d;
        Serializable serializable2 = this.f8819d;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (m4980d(this) && m4980d(c2792u)) {
            return ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) ? m4981a().equals(c2792u.m4981a()) : m4982b().longValue() == c2792u.m4982b().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : AbstractC2917h.m5117i(m4983c())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : AbstractC2917h.m5117i(c2792u.m4983c())) == 0;
        }
        double dDoubleValue = serializable2 instanceof Number ? m4982b().doubleValue() : Double.parseDouble(m4983c());
        double dDoubleValue2 = serializable instanceof Number ? c2792u.m4982b().doubleValue() : Double.parseDouble(c2792u.m4983c());
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f8819d;
        if (serializable == null) {
            return 31;
        }
        if (m4980d(this)) {
            jDoubleToLongBits = m4982b().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(m4982b().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public C2792u(Number number) {
        Objects.requireNonNull(number);
        this.f8819d = number;
    }

    public C2792u(String str) {
        Objects.requireNonNull(str);
        this.f8819d = str;
    }
}
