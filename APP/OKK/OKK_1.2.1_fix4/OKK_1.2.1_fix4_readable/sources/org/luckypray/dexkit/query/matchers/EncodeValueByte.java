package org.luckypray.dexkit.query.matchers;

import com.google.flatbuffers.C0733b;
import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import org.luckypray.dexkit.query.base.INumberEncodeValue;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class EncodeValueByte extends EncodeValue implements IAnnotationEncodeValue, INumberEncodeValue {
    private final byte value;

    public EncodeValueByte(byte b2) {
        this.value = b2;
    }

    public final byte getValue() {
        return this.value;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b c0733b) {
        AbstractC0307g.m703e(c0733b, "fbb");
        int iCreateEncodeValueByte = org.luckypray.dexkit.schema.EncodeValueByte.Companion.createEncodeValueByte(c0733b, this.value);
        c0733b.m1931n(iCreateEncodeValueByte);
        return iCreateEncodeValueByte;
    }
}
