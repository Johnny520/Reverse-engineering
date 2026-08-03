package org.luckypray.dexkit.query.matchers;

import com.google.flatbuffers.C0733b;
import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import org.luckypray.dexkit.query.base.INumberEncodeValue;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class EncodeValueInt extends EncodeValue implements IAnnotationEncodeValue, INumberEncodeValue {
    private final int value;

    public EncodeValueInt(int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b c0733b) {
        AbstractC0307g.m703e(c0733b, "fbb");
        int iCreateEncodeValueInt = org.luckypray.dexkit.schema.EncodeValueInt.Companion.createEncodeValueInt(c0733b, this.value);
        c0733b.m1931n(iCreateEncodeValueInt);
        return iCreateEncodeValueInt;
    }
}
