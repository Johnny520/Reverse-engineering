package org.luckypray.dexkit.query.matchers;

import com.google.flatbuffers.C0733b;
import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import org.luckypray.dexkit.query.base.INumberEncodeValue;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class EncodeValueChar extends EncodeValue implements IAnnotationEncodeValue, INumberEncodeValue {
    private final char value;

    public EncodeValueChar(char c) {
        this.value = c;
    }

    public final char getValue() {
        return this.value;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b c0733b) {
        AbstractC0307g.m703e(c0733b, "fbb");
        int iCreateEncodeValueChar = org.luckypray.dexkit.schema.EncodeValueChar.Companion.createEncodeValueChar(c0733b, (short) this.value);
        c0733b.m1931n(iCreateEncodeValueChar);
        return iCreateEncodeValueChar;
    }
}
