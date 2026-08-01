package com.android.dx.cf.attrib;

import bsh.C2633;
import com.android.dx.rop.cst.CstString;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class AttSourceDebugExtension extends BaseAttribute {
    public static final String ATTRIBUTE_NAME = "SourceDebugExtension";
    private final CstString smapString;

    public AttSourceDebugExtension(CstString cstString) {
        super(ATTRIBUTE_NAME);
        if (cstString != null) {
            this.smapString = cstString;
        } else {
            C2633.m5343("smapString == null");
            throw null;
        }
    }

    @Override // com.android.dx.cf.iface.Attribute
    public int byteLength() {
        return this.smapString.getUtf8Size() + 6;
    }

    public CstString getSmapString() {
        return this.smapString;
    }
}
