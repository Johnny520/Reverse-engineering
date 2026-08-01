package com.google.gson.internal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class LazilyParsedNumber extends Number {
    private final String value;

    public LazilyParsedNumber(String str) {
        this.value = str;
    }

    private BigDecimal asBigDecimal() {
        return AbstractC3220.m7331(this.value);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return asBigDecimal();
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LazilyParsedNumber) {
            return this.value.equals(((LazilyParsedNumber) obj).value);
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.value);
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.value);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.value);
            }
        } catch (NumberFormatException unused2) {
            return this.asBigDecimal().intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.value);
        } catch (NumberFormatException unused) {
            return asBigDecimal().longValue();
        }
    }

    public String toString() {
        return this.value;
    }
}
