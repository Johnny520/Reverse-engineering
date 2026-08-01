package com.typesafe.config.impl;

import com.typesafe.config.ConfigValueType;
import java.io.Serializable;
import p250.InterfaceC8161;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
final class ConfigDouble extends ConfigNumber implements Serializable {
    private static final long serialVersionUID = 2;
    private final double value;

    public ConfigDouble(InterfaceC8161 interfaceC8161, double d, String str) {
        super(interfaceC8161, str);
        this.value = d;
    }

    private Object writeReplace() {
        return new SerializedConfigValue(this);
    }

    @Override // com.typesafe.config.impl.ConfigNumber
    public double doubleValue() {
        return this.value;
    }

    @Override // com.typesafe.config.impl.ConfigNumber
    public long longValue() {
        return (long) this.value;
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public ConfigDouble newCopy(InterfaceC8161 interfaceC8161) {
        return new ConfigDouble(interfaceC8161, this.value, this.originalText);
    }

    @Override // com.typesafe.config.impl.ConfigNumber, com.typesafe.config.impl.AbstractC3843
    public String transformToString() {
        String strTransformToString = super.transformToString();
        return strTransformToString == null ? Double.toString(this.value) : strTransformToString;
    }

    @Override // com.typesafe.config.impl.ConfigNumber, p250.InterfaceC8167
    public Double unwrapped() {
        return Double.valueOf(this.value);
    }

    @Override // com.typesafe.config.impl.ConfigNumber, p250.InterfaceC8167
    public ConfigValueType valueType() {
        return ConfigValueType.NUMBER;
    }
}
