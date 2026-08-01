package com.typesafe.config.impl;

import com.typesafe.config.ConfigValueType;
import java.io.Serializable;
import p250.InterfaceC8160;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
final class ConfigInt extends ConfigNumber implements Serializable {
    private static final long serialVersionUID = 2;
    private final int value;

    public ConfigInt(InterfaceC8160 interfaceC8160, int i, String str) {
        super(interfaceC8160, str);
        this.value = i;
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

    @Override // com.typesafe.config.impl.AbstractC3842
    public ConfigInt newCopy(InterfaceC8160 interfaceC8160) {
        return new ConfigInt(interfaceC8160, this.value, this.originalText);
    }

    @Override // com.typesafe.config.impl.ConfigNumber, com.typesafe.config.impl.AbstractC3842
    public String transformToString() {
        String strTransformToString = super.transformToString();
        return strTransformToString == null ? Integer.toString(this.value) : strTransformToString;
    }

    @Override // com.typesafe.config.impl.ConfigNumber, p250.InterfaceC8166
    public Integer unwrapped() {
        return Integer.valueOf(this.value);
    }

    @Override // com.typesafe.config.impl.ConfigNumber, p250.InterfaceC8166
    public ConfigValueType valueType() {
        return ConfigValueType.NUMBER;
    }
}
