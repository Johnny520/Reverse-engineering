package org.luckypray.dexkit.query.matchers;

import com.google.flatbuffers.C0733b;
import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import org.luckypray.dexkit.query.base.INumberEncodeValue;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class EncodeValueLong extends EncodeValue implements IAnnotationEncodeValue, INumberEncodeValue {
    private final long value;

    public EncodeValueLong(long r1) {
        this.value = r1;
    }

    public final long getValue() {
        return this.value;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b r4) {
        AbstractC0307g.m703e(r4, "fbb");
        int r02 = org.luckypray.dexkit.schema.EncodeValueLong.Companion.createEncodeValueLong(r4, this.value);
        r4.m1931n(r02);
        return r02;
    }
}
