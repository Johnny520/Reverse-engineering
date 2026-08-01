package com.typesafe.config.impl;

import com.typesafe.config.ConfigValueType;
import java.io.Serializable;
import p250.C8168;
import p250.InterfaceC8161;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
final class ConfigNull extends AbstractC3843 implements Serializable {
    private static final long serialVersionUID = 2;

    public ConfigNull(InterfaceC8161 interfaceC8161) {
        super(interfaceC8161);
    }

    private Object writeReplace() {
        return new SerializedConfigValue(this);
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public ConfigNull newCopy(InterfaceC8161 interfaceC8161) {
        return new ConfigNull(interfaceC8161);
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public void render(StringBuilder sb, int i, boolean z, C8168 c8168) {
        sb.append("null");
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public String transformToString() {
        return "null";
    }

    @Override // p250.InterfaceC8167
    public Object unwrapped() {
        return null;
    }

    @Override // p250.InterfaceC8167
    public ConfigValueType valueType() {
        return ConfigValueType.NULL;
    }
}
