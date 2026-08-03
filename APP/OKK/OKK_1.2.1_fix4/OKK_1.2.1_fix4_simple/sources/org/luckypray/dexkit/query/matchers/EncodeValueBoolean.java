package org.luckypray.dexkit.query.matchers;

import com.google.flatbuffers.C0733b;
import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class EncodeValueBoolean extends EncodeValue implements IAnnotationEncodeValue {
    private final boolean value;

    public EncodeValueBoolean(boolean r1) {
        this.value = r1;
    }

    public final boolean getValue() {
        return this.value;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b r3) {
        AbstractC0307g.m703e(r3, "fbb");
        int r02 = org.luckypray.dexkit.schema.EncodeValueBoolean.Companion.createEncodeValueBoolean(r3, this.value);
        r3.m1931n(r02);
        return r02;
    }
}
