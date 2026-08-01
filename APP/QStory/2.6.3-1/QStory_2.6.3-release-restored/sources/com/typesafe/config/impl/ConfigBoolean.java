package com.typesafe.config.impl;

import com.typesafe.config.ConfigValueType;
import java.io.Serializable;
import p266.InterfaceC8990;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
final class ConfigBoolean extends AbstractC4675 implements Serializable {
    private static final long serialVersionUID = 2;
    private final boolean value;

    public ConfigBoolean(InterfaceC8990 interfaceC8990, boolean z) {
        super(interfaceC8990);
        this.value = z;
    }

    private Object writeReplace() {
        return new SerializedConfigValue(this);
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public ConfigBoolean newCopy(InterfaceC8990 interfaceC8990) {
        return new ConfigBoolean(interfaceC8990, this.value);
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public String transformToString() {
        return this.value ? "true" : "false";
    }

    @Override // p266.InterfaceC8996
    public Boolean unwrapped() {
        return Boolean.valueOf(this.value);
    }

    @Override // p266.InterfaceC8996
    public ConfigValueType valueType() {
        return ConfigValueType.BOOLEAN;
    }
}
