package org.luckypray.dexkit.query.matchers;

import com.google.flatbuffers.C0733b;
import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class EncodeValueNull extends EncodeValue implements IAnnotationEncodeValue {
    public EncodeValueNull() {
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b r3) {
        AbstractC0307g.m703e(r3, "fbb");
        int r02 = org.luckypray.dexkit.schema.EncodeValueNull.Companion.createEncodeValueNull(r3, (byte) 0);
        r3.m1931n(r02);
        return r02;
    }
}
