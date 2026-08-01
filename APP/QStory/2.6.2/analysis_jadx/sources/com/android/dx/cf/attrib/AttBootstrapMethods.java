package com.android.dx.cf.attrib;

import com.android.dx.cf.code.BootstrapMethodsList;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class AttBootstrapMethods extends BaseAttribute {
    private static final int ATTRIBUTE_HEADER_BYTES = 8;
    public static final String ATTRIBUTE_NAME = "BootstrapMethods";
    private static final int BOOTSTRAP_ARGUMENT_BYTES = 2;
    private static final int BOOTSTRAP_METHOD_BYTES = 4;
    private final BootstrapMethodsList bootstrapMethods;
    private final int byteLength;

    public AttBootstrapMethods(BootstrapMethodsList bootstrapMethodsList) {
        super(ATTRIBUTE_NAME);
        this.bootstrapMethods = bootstrapMethodsList;
        int size = (bootstrapMethodsList.size() * 4) + 8;
        for (int i = 0; i < bootstrapMethodsList.size(); i++) {
            size += bootstrapMethodsList.get(i).getBootstrapMethodArguments().size() * 2;
        }
        this.byteLength = size;
    }

    @Override // com.android.dx.cf.iface.Attribute
    public int byteLength() {
        return this.byteLength;
    }

    public BootstrapMethodsList getBootstrapMethods() {
        return this.bootstrapMethods;
    }
}
