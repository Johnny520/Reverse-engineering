package com.typesafe.config.impl;

import com.typesafe.config.ConfigValueType;
import java.io.Serializable;
import p266.InterfaceC8990;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
final class ConfigLong extends ConfigNumber implements Serializable {
    private static final long serialVersionUID = 2;
    private final long value;

    public ConfigLong(InterfaceC8990 interfaceC8990, long j, String str) {
        super(interfaceC8990, str);
        this.value = j;
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
        return this.value;
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public ConfigLong newCopy(InterfaceC8990 interfaceC8990) {
        return new ConfigLong(interfaceC8990, this.value, this.originalText);
    }

    @Override // com.typesafe.config.impl.ConfigNumber, com.typesafe.config.impl.AbstractC4675
    public String transformToString() {
        String strTransformToString = super.transformToString();
        return strTransformToString == null ? Long.toString(this.value) : strTransformToString;
    }

    @Override // com.typesafe.config.impl.ConfigNumber, p266.InterfaceC8996
    public Long unwrapped() {
        return Long.valueOf(this.value);
    }

    @Override // com.typesafe.config.impl.ConfigNumber, p266.InterfaceC8996
    public ConfigValueType valueType() {
        return ConfigValueType.NUMBER;
    }
}
