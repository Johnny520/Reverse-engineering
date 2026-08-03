package com.android.p001dx.p002cf.attrib;

import com.android.p001dx.rop.cst.ConstantPool;
import com.android.p001dx.util.ByteArray;

/* JADX INFO: loaded from: classes.dex */
public final class RawAttribute extends BaseAttribute {
    private final ByteArray data;
    private final ConstantPool pool;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RawAttribute(String str, ByteArray byteArray, ConstantPool constantPool) {
        super(str);
        if (byteArray == null) {
            throw new NullPointerException("data == null");
        }
        this.data = byteArray;
        this.pool = constantPool;
    }

    @Override // com.android.p001dx.p002cf.iface.Attribute
    public int byteLength() {
        return this.data.size() + 6;
    }

    public ByteArray getData() {
        return this.data;
    }

    public ConstantPool getPool() {
        return this.pool;
    }

    public RawAttribute(String str, ByteArray byteArray, int i, int i2, ConstantPool constantPool) {
        this(str, byteArray.slice(i, i2 + i), constantPool);
    }
}
