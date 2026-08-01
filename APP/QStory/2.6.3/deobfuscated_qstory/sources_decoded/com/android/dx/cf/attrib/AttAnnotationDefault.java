package com.android.dx.cf.attrib;

import bsh.C2633;
import com.android.dx.rop.cst.Constant;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class AttAnnotationDefault extends BaseAttribute {
    public static final String ATTRIBUTE_NAME = "AnnotationDefault";
    private final int byteLength;
    private final Constant value;

    public AttAnnotationDefault(Constant constant, int i) {
        super(ATTRIBUTE_NAME);
        if (constant == null) {
            C2633.m5343("value == null");
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
