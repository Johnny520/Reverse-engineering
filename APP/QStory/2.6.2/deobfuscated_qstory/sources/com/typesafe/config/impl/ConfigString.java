package com.typesafe.config.impl;

import com.typesafe.config.ConfigValueType;
import java.io.Serializable;
import p250.C8167;
import p250.InterfaceC8160;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
abstract class ConfigString extends AbstractC3842 implements Serializable {
    private static final long serialVersionUID = 2;
    protected final String value;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class Quoted extends ConfigString {
        public Quoted(InterfaceC8160 interfaceC8160, String str) {
            super(interfaceC8160, str);
        }

        private Object writeReplace() {
            return new SerializedConfigValue(this);
        }

        @Override // com.typesafe.config.impl.AbstractC3842
        public Quoted newCopy(InterfaceC8160 interfaceC8160) {
            return new Quoted(interfaceC8160, this.value);
        }

        @Override // com.typesafe.config.impl.ConfigString, p250.InterfaceC8166
        public /* bridge */ /* synthetic */ Object unwrapped() {
            return super.unwrapped();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class Unquoted extends ConfigString {
        public Unquoted(InterfaceC8160 interfaceC8160, String str) {
            super(interfaceC8160, str);
        }

        private Object writeReplace() {
            return new SerializedConfigValue(this);
        }

        @Override // com.typesafe.config.impl.AbstractC3842
        public Unquoted newCopy(InterfaceC8160 interfaceC8160) {
            return new Unquoted(interfaceC8160, this.value);
        }

        @Override // com.typesafe.config.impl.ConfigString, p250.InterfaceC8166
        public /* bridge */ /* synthetic */ Object unwrapped() {
            return super.unwrapped();
        }
    }

    public ConfigString(InterfaceC8160 interfaceC8160, String str) {
        super(interfaceC8160);
        this.value = str;
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public void render(StringBuilder sb, int i, boolean z, C8167 c8167) {
        if (hideEnvVariableValue(c8167)) {
            appendHiddenEnvVariableValue(sb);
        } else {
            c8167.getClass();
            sb.append(AbstractC3863.m8259(this.value));
        }
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public String transformToString() {
        return this.value;
    }

    @Override // p250.InterfaceC8166
    public ConfigValueType valueType() {
        return ConfigValueType.STRING;
    }

    public boolean wasQuoted() {
        return this instanceof Quoted;
    }

    @Override // p250.InterfaceC8166
    public String unwrapped() {
        return this.value;
    }
}
