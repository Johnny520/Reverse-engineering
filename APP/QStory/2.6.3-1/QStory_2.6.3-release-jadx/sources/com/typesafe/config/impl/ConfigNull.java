package com.typesafe.config.impl;

import com.typesafe.config.ConfigValueType;
import java.io.Serializable;
import p266.C8997;
import p266.InterfaceC8990;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
final class ConfigNull extends AbstractC4675 implements Serializable {
    private static final long serialVersionUID = 2;

    public ConfigNull(InterfaceC8990 interfaceC8990) {
        super(interfaceC8990);
    }

    private Object writeReplace() {
        return new SerializedConfigValue(this);
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public ConfigNull newCopy(InterfaceC8990 interfaceC8990) {
        return new ConfigNull(interfaceC8990);
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public void render(StringBuilder sb, int i, boolean z, C8997 c8997) {
        sb.append("null");
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public String transformToString() {
        return "null";
    }

    @Override // p266.InterfaceC8996
    public Object unwrapped() {
        return null;
    }

    @Override // p266.InterfaceC8996
    public ConfigValueType valueType() {
        return ConfigValueType.NULL;
    }
}
