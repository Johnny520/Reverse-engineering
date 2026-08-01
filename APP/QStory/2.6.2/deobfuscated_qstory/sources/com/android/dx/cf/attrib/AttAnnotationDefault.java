package com.android.dx.cf.attrib;

import bsh.C2632;
import com.android.dx.rop.cst.Constant;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class AttAnnotationDefault extends BaseAttribute {
    public static final String ATTRIBUTE_NAME = "AnnotationDefault";
    private final int byteLength;
    private final Constant value;

    public AttAnnotationDefault(Constant constant, int i) {
        super(ATTRIBUTE_NAME);
        if (constant == null) {
            C2632.m5298("value == null");
            throw null;
        }
        this.value = constant;
        this.byteLength = i;
    }

    @Override // com.android.dx.cf.iface.Attribute
    public int byteLength() {
        return this.byteLength + 6;
    }

    public Constant getValue() {
        return this.value;
    }
}
