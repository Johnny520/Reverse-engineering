package com.typesafe.config.impl;

import com.typesafe.config.ConfigValueType;
import java.io.Serializable;
import p250.InterfaceC8160;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
final class ConfigBoolean extends AbstractC3842 implements Serializable {
    private static final long serialVersionUID = 2;
    private final boolean value;

    public ConfigBoolean(InterfaceC8160 interfaceC8160, boolean z) {
        super(interfaceC8160);
        this.value = z;
    }

    private Object writeReplace() {
        return new SerializedConfigValue(this);
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public ConfigBoolean newCopy(InterfaceC8160 interfaceC8160) {
        return new ConfigBoolean(interfaceC8160, this.value);
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public String transformToString() {
        return this.value ? "true" : "false";
    }

    @Override // p250.InterfaceC8166
    public Boolean unwrapped() {
        return Boolean.valueOf(this.value);
    }

    @Override // p250.InterfaceC8166
    public ConfigValueType valueType() {
        return ConfigValueType.BOOLEAN;
    }
}
