package org.luckypray.dexkit.query.matchers;

import com.google.flatbuffers.C0733b;
import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class EncodeValueBoolean extends EncodeValue implements IAnnotationEncodeValue {
    private final boolean value;

    public EncodeValueBoolean(boolean z2) {
        this.value = z2;
    }

    public final boolean getValue() {
        return this.value;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b c0733b) {
        AbstractC0307g.m703e(c0733b, "fbb");
        int iCreateEncodeValueBoolean = org.luckypray.dexkit.schema.EncodeValueBoolean.Companion.createEncodeValueBoolean(c0733b, this.value);
        c0733b.m1931n(iCreateEncodeValueBoolean);
        return iCreateEncodeValueBoolean;
    }
}
