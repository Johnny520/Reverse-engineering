package com.typesafe.config.impl;

import com.typesafe.config.ConfigValueType;
import java.io.Serializable;
import p250.C8168;
import p250.InterfaceC8161;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
abstract class ConfigString extends AbstractC3843 implements Serializable {
    private static final long serialVersionUID = 2;
    protected final String value;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class Quoted extends ConfigString {
        public Quoted(InterfaceC8161 interfaceC8161, String str) {
            super(interfaceC8161, str);
        }

        private Object writeReplace() {
            return new SerializedConfigValue(this);
        }

        @Override // com.typesafe.config.impl.AbstractC3843
        public Quoted newCopy(InterfaceC8161 interfaceC8161) {
            return new Quoted(interfaceC8161, this.value);
        }

        @Override // com.typesafe.config.impl.ConfigString, p250.InterfaceC8167
        public /* bridge */ /* synthetic */ Object unwrapped() {
            return super.unwrapped();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class Unquoted extends ConfigString {
        public Unquoted(InterfaceC8161 interfaceC8161, String str) {
            super(interfaceC8161, str);
        }

        private Object writeReplace() {
            return new SerializedConfigValue(this);
        }

        @Override // com.typesafe.config.impl.AbstractC3843
        public Unquoted newCopy(InterfaceC8161 interfaceC8161) {
            return new Unquoted(interfaceC8161, this.value);
        }

        @Override // com.typesafe.config.impl.ConfigString, p250.InterfaceC8167
        public /* bridge */ /* synthetic */ Object unwrapped() {
            return super.unwrapped();
        }
    }

    public ConfigString(InterfaceC8161 interfaceC8161, String str) {
        super(interfaceC8161);
        this.value = str;
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public void render(StringBuilder sb, int i, boolean z, C8168 c8168) {
        if (hideEnvVariableValue(c8168)) {
            appendHiddenEnvVariableValue(sb);
        } else {
            c8168.getClass();
            sb.append(AbstractC3864.m8246(this.value));
        }
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public String transformToString() {
        return this.value;
    }

    @Override // p250.InterfaceC8167
    public ConfigValueType valueType() {
        return ConfigValueType.STRING;
    }

    public boolean wasQuoted() {
        return this instanceof Quoted;
    }

    @Override // p250.InterfaceC8167
    public String unwrapped() {
        return this.value;
    }
}
