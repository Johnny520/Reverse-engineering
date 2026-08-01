package com.typesafe.config.impl;

import androidx.profileinstaller.AbstractC3275;
import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigValueType;
import java.io.Serializable;
import p266.InterfaceC8990;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
abstract class ConfigNumber extends AbstractC4675 implements Serializable {
    private static final long serialVersionUID = 2;
    protected final String originalText;

    public ConfigNumber(InterfaceC8990 interfaceC8990, String str) {
        super(interfaceC8990);
        this.originalText = str;
    }

    private boolean isWhole() {
        return ((double) longValue()) == doubleValue();
    }

    public static ConfigNumber newNumber(InterfaceC8990 interfaceC8990, long j, String str) {
        return (j > 2147483647L || j < -2147483648L) ? new ConfigLong(interfaceC8990, j, str) : new ConfigInt(interfaceC8990, (int) j, str);
    }

    private Object writeReplace() {
        return new SerializedConfigValue(this);
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public boolean canEqual(Object obj) {
        return obj instanceof ConfigNumber;
    }

    public abstract double doubleValue();

    @Override // com.typesafe.config.impl.AbstractC4675
    public boolean equals(Object obj) {
        if ((obj instanceof ConfigNumber) && canEqual(obj)) {
            ConfigNumber configNumber = (ConfigNumber) obj;
            if (isWhole()) {
                return configNumber.isWhole() && longValue() == configNumber.longValue();
            }
            if (!configNumber.isWhole() && doubleValue() == configNumber.doubleValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public int hashCode() {
        long jLongValue = isWhole() ? longValue() : Double.doubleToLongBits(doubleValue());
        return (int) (jLongValue ^ (jLongValue >>> 32));
    }

    public int intValueRangeChecked(String str) {
        long jLongValue = longValue();
        if (jLongValue < -2147483648L || jLongValue > 2147483647L) {
            throw new ConfigException.WrongType(origin(), str, "32-bit integer", AbstractC3275.m5143(jLongValue, "out-of-range value "));
        }
        return (int) jLongValue;
    }

    public abstract long longValue();

    @Override // com.typesafe.config.impl.AbstractC4675
    public String transformToString() {
        return this.originalText;
    }

    @Override // p266.InterfaceC8996
    public abstract Number unwrapped();

    @Override // p266.InterfaceC8996
    public abstract /* synthetic */ ConfigValueType valueType();

    public static ConfigNumber newNumber(InterfaceC8990 interfaceC8990, double d, String str) {
        long j = (long) d;
        if (j == d) {
            return newNumber(interfaceC8990, j, str);
        }
        return new ConfigDouble(interfaceC8990, d, str);
    }
}
