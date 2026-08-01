package com.typesafe.config.impl;

import com.typesafe.config.ConfigValueType;
import java.io.Serializable;
import p266.C8997;
import p266.InterfaceC8990;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
abstract class ConfigString extends AbstractC4675 implements Serializable {
    private static final long serialVersionUID = 2;
    protected final String value;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class Quoted extends ConfigString {
        public Quoted(InterfaceC8990 interfaceC8990, String str) {
            super(interfaceC8990, str);
        }

        private Object writeReplace() {
            return new SerializedConfigValue(this);
        }

        @Override // com.typesafe.config.impl.AbstractC4675
        public Quoted newCopy(InterfaceC8990 interfaceC8990) {
            return new Quoted(interfaceC8990, this.value);
        }

        @Override // com.typesafe.config.impl.ConfigString, p266.InterfaceC8996
        public /* bridge */ /* synthetic */ Object unwrapped() {
            return super.unwrapped();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class Unquoted extends ConfigString {
        public Unquoted(InterfaceC8990 interfaceC8990, String str) {
            super(interfaceC8990, str);
        }

        private Object writeReplace() {
            return new SerializedConfigValue(this);
        }

        @Override // com.typesafe.config.impl.AbstractC4675
        public Unquoted newCopy(InterfaceC8990 interfaceC8990) {
            return new Unquoted(interfaceC8990, this.value);
        }

        @Override // com.typesafe.config.impl.ConfigString, p266.InterfaceC8996
        public /* bridge */ /* synthetic */ Object unwrapped() {
            return super.unwrapped();
        }
    }

    public ConfigString(InterfaceC8990 interfaceC8990, String str) {
        super(interfaceC8990);
        this.value = str;
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public void render(StringBuilder sb, int i, boolean z, C8997 c8997) {
        if (hideEnvVariableValue(c8997)) {
            appendHiddenEnvVariableValue(sb);
        } else {
            c8997.getClass();
            sb.append(AbstractC4696.m8805(this.value));
        }
    }

    @Override // com.typesafe.config.impl.AbstractC4675
    public String transformToString() {
        return this.value;
    }

    @Override // p266.InterfaceC8996
    public ConfigValueType valueType() {
        return ConfigValueType.STRING;
    }

    public boolean wasQuoted() {
        return this instanceof Quoted;
    }

    @Override // p266.InterfaceC8996
    public String unwrapped() {
        return this.value;
    }
}
