package com.android.dx.cf.attrib;

import bsh.C2633;
import com.android.dx.rop.cst.ConstantPool;
import com.android.dx.util.ByteArray;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RawAttribute extends BaseAttribute {
    private final ByteArray data;
    private final ConstantPool pool;

    public RawAttribute(String str, ByteArray byteArray, ConstantPool constantPool) {
        super(str);
        if (byteArray == null) {
            C2633.m5343("data == null");
            throw null;
        }
        this.data = byteArray;
        this.pool = constantPool;
    }

    @Override // com.android.dx.cf.iface.Attribute
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
