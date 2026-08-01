package com.typesafe.config.impl;

import com.typesafe.config.ConfigValueType;
import java.io.Serializable;
import p250.C8167;
import p250.InterfaceC8160;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
final class ConfigNull extends AbstractC3842 implements Serializable {
    private static final long serialVersionUID = 2;

    public ConfigNull(InterfaceC8160 interfaceC8160) {
        super(interfaceC8160);
    }

    private Object writeReplace() {
        return new SerializedConfigValue(this);
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public ConfigNull newCopy(InterfaceC8160 interfaceC8160) {
        return new ConfigNull(interfaceC8160);
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public void render(StringBuilder sb, int i, boolean z, C8167 c8167) {
        sb.append("null");
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public String transformToString() {
        return "null";
    }

    @Override // p250.InterfaceC8166
    public Object unwrapped() {
        return null;
    }

    @Override // p250.InterfaceC8166
    public ConfigValueType valueType() {
        return ConfigValueType.NULL;
    }
}
