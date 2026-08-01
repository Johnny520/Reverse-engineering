package com.android.dx.cf.attrib;

import bsh.C2632;
import com.android.dx.cf.code.LineNumberList;
import com.android.dx.util.MutabilityException;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class AttLineNumberTable extends BaseAttribute {
    public static final String ATTRIBUTE_NAME = "LineNumberTable";
    private final LineNumberList lineNumbers;

    public AttLineNumberTable(LineNumberList lineNumberList) {
        super(ATTRIBUTE_NAME);
        try {
            if (lineNumberList.isMutable()) {
                throw new MutabilityException("lineNumbers.isMutable()");
            }
            this.lineNumbers = lineNumberList;
        } catch (NullPointerException unused) {
            C2632.m5298("lineNumbers == null");
            throw null;
        }
    }

    @Override // com.android.dx.cf.iface.Attribute
    public int byteLength() {
        return (this.lineNumbers.size() * 4) + 8;
    }

    public LineNumberList getLineNumbers() {
        return this.lineNumbers;
    }
}
