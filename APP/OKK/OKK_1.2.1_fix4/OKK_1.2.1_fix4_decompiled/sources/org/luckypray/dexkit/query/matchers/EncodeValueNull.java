package org.luckypray.dexkit.query.matchers;

import com.google.flatbuffers.C0733b;
import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class EncodeValueNull extends EncodeValue implements IAnnotationEncodeValue {
    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b c0733b) {
        AbstractC0307g.m703e(c0733b, "fbb");
        int iCreateEncodeValueNull = org.luckypray.dexkit.schema.EncodeValueNull.Companion.createEncodeValueNull(c0733b, (byte) 0);
        c0733b.m1931n(iCreateEncodeValueNull);
        return iCreateEncodeValueNull;
    }
}
