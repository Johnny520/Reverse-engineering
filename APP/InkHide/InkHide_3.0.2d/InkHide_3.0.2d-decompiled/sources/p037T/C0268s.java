package p037T;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;
import p041V.C0317j;

/* JADX INFO: renamed from: T.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0268s extends AbstractC0264o {

    /* JADX INFO: renamed from: a */
    public final Serializable f638a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0268s(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f638a = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static boolean m488e(C0268s c0268s) {
        Serializable serializable = c0268s.f638a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p037T.AbstractC0264o
    /* JADX INFO: renamed from: a */
    public final int mo487a() {
        return this.f638a instanceof Number ? m490c().intValue() : Integer.parseInt(m491d());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m489b() {
        Serializable serializable = this.f638a;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(m491d());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final Number m490c() {
        Serializable serializable = this.f638a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new C0317j((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final String m491d() {
        Serializable serializable = this.f638a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return m490c().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0268s.class != obj.getClass()) {
            return false;
        }
        C0268s c0268s = (C0268s) obj;
        Serializable serializable = this.f638a;
        Serializable serializable2 = c0268s.f638a;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (m488e(this) && m488e(c0268s)) {
            return m490c().longValue() == c0268s.m490c().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        double dDoubleValue = m490c().doubleValue();
        double dDoubleValue2 = c0268s.m490c().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f638a;
        if (serializable == null) {
            return 31;
        }
        if (m488e(this)) {
            jDoubleToLongBits = m490c().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(m490c().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public C0268s(Number number) {
        Objects.requireNonNull(number);
        this.f638a = number;
    }

    public C0268s(String str) {
        Objects.requireNonNull(str);
        this.f638a = str;
    }
}
