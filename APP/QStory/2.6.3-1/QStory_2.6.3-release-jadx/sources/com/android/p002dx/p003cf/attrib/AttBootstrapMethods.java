package com.android.p002dx.p003cf.attrib;

import com.android.p002dx.p003cf.code.BootstrapMethodsList;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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

    @Override // com.android.p002dx.p003cf.iface.Attribute
    public int byteLength() {
        return this.byteLength;
    }

    public BootstrapMethodsList getBootstrapMethods() {
        return this.bootstrapMethods;
    }
}
