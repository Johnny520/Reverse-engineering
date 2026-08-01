package com.typesafe.config.impl;

import com.typesafe.config.ConfigValueType;
import java.io.Serializable;
import p250.InterfaceC8161;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
final class ConfigBoolean extends AbstractC3843 implements Serializable {
    private static final long serialVersionUID = 2;
    private final boolean value;

    public ConfigBoolean(InterfaceC8161 interfaceC8161, boolean z) {
        super(interfaceC8161);
        this.value = z;
    }

    private Object writeReplace() {
        return new SerializedConfigValue(this);
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public ConfigBoolean newCopy(InterfaceC8161 interfaceC8161) {
        return new ConfigBoolean(interfaceC8161, this.value);
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public String transformToString() {
        return this.value ? "true" : "false";
    }

    @Override // p250.InterfaceC8167
    public Boolean unwrapped() {
        return Boolean.valueOf(this.value);
    }

    @Override // p250.InterfaceC8167
    public ConfigValueType valueType() {
        return ConfigValueType.BOOLEAN;
    }
}
