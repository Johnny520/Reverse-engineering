package org.luckypray.dexkit.query.matchers;

import com.google.flatbuffers.C0733b;
import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import org.luckypray.dexkit.query.base.INumberEncodeValue;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class EncodeValueDouble extends EncodeValue implements IAnnotationEncodeValue, INumberEncodeValue {
    private final double value;

    public EncodeValueDouble(double r1) {
        this.value = r1;
    }

    public final double getValue() {
        return this.value;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b r4) {
        AbstractC0307g.m703e(r4, "fbb");
        int r02 = org.luckypray.dexkit.schema.EncodeValueDouble.Companion.createEncodeValueDouble(r4, this.value);
        r4.m1931n(r02);
        return r02;
    }
}
