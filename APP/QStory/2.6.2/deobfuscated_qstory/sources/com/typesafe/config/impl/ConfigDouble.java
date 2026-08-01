package com.typesafe.config.impl;

import com.typesafe.config.ConfigValueType;
import java.io.Serializable;
import p250.InterfaceC8160;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
final class ConfigDouble extends ConfigNumber implements Serializable {
    private static final long serialVersionUID = 2;
    private final double value;

    public ConfigDouble(InterfaceC8160 interfaceC8160, double d, String str) {
        super(interfaceC8160, str);
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

    @Override // com.typesafe.config.impl.AbstractC3842
    public ConfigDouble newCopy(InterfaceC8160 interfaceC8160) {
        return new ConfigDouble(interfaceC8160, this.value, this.originalText);
    }

    @Override // com.typesafe.config.impl.ConfigNumber, com.typesafe.config.impl.AbstractC3842
    public String transformToString() {
        String strTransformToString = super.transformToString();
        return strTransformToString == null ? Double.toString(this.value) : strTransformToString;
    }

    @Override // com.typesafe.config.impl.ConfigNumber, p250.InterfaceC8166
    public Double unwrapped() {
        return Double.valueOf(this.value);
    }

    @Override // com.typesafe.config.impl.ConfigNumber, p250.InterfaceC8166
    public ConfigValueType valueType() {
        return ConfigValueType.NUMBER;
    }
}
