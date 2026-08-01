package com.android.dx.cf.attrib;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class AttDeprecated extends BaseAttribute {
    public static final String ATTRIBUTE_NAME = "Deprecated";

    public AttDeprecated() {
        super(ATTRIBUTE_NAME);
    }

    @Override // com.android.dx.cf.iface.Attribute
    public int byteLength() {
        return 6;
    }
}
