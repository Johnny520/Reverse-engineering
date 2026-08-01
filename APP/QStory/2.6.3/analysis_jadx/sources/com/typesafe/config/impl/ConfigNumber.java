package com.typesafe.config.impl;

import androidx.profileinstaller.AbstractC2442;
import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigValueType;
import java.io.Serializable;
import p250.InterfaceC8161;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
abstract class ConfigNumber extends AbstractC3843 implements Serializable {
    private static final long serialVersionUID = 2;
    protected final String originalText;

    public ConfigNumber(InterfaceC8161 interfaceC8161, String str) {
        super(interfaceC8161);
        this.originalText = str;
    }

    private boolean isWhole() {
        return ((double) longValue()) == doubleValue();
    }

    public static ConfigNumber newNumber(InterfaceC8161 interfaceC8161, long j, String str) {
        return (j > 2147483647L || j < -2147483648L) ? new ConfigLong(interfaceC8161, j, str) : new ConfigInt(interfaceC8161, (int) j, str);
    }

    private Object writeReplace() {
        return new SerializedConfigValue(this);
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public boolean canEqual(Object obj) {
        return obj instanceof ConfigNumber;
    }

    public abstract double doubleValue();

    @Override // com.typesafe.config.impl.AbstractC3843
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

    @Override // com.typesafe.config.impl.AbstractC3843
    public int hashCode() {
        long jLongValue = isWhole() ? longValue() : Double.doubleToLongBits(doubleValue());
        return (int) (jLongValue ^ (jLongValue >>> 32));
    }

    public int intValueRangeChecked(String str) {
        long jLongValue = longValue();
        if (jLongValue < -2147483648L || jLongValue > 2147483647L) {
            throw new ConfigException.WrongType(origin(), str, "32-bit integer", AbstractC2442.m4583(jLongValue, "out-of-range value "));
        }
        return (int) jLongValue;
    }

    public abstract long longValue();

    @Override // com.typesafe.config.impl.AbstractC3843
    public String transformToString() {
        return this.originalText;
    }

    @Override // p250.InterfaceC8167
    public abstract Number unwrapped();

    @Override // p250.InterfaceC8167
    public abstract /* synthetic */ ConfigValueType valueType();

    public static ConfigNumber newNumber(InterfaceC8161 interfaceC8161, double d, String str) {
        long j = (long) d;
        if (j == d) {
            return newNumber(interfaceC8161, j, str);
        }
        return new ConfigDouble(interfaceC8161, d, str);
    }
}
