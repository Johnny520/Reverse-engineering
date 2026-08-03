package com.android.p001dx.p002cf.attrib;

/* JADX INFO: loaded from: classes.dex */
public final class AttDeprecated extends BaseAttribute {
    public static final String ATTRIBUTE_NAME = "Deprecated";

    public AttDeprecated() {
        super(ATTRIBUTE_NAME);
    }

    @Override // com.android.p001dx.p002cf.iface.Attribute
    public int byteLength() {
        return 6;
    }
}
