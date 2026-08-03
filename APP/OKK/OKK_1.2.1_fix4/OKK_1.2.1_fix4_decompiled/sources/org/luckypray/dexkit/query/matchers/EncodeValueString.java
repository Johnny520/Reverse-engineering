package org.luckypray.dexkit.query.matchers;

import com.google.flatbuffers.C0733b;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class EncodeValueString extends EncodeValue {
    private final String value;

    public EncodeValueString(String str) {
        AbstractC0307g.m703e(str, "value");
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    public int innerBuild(C0733b c0733b) {
        AbstractC0307g.m703e(c0733b, "fbb");
        int iCreateEncodeValueString = org.luckypray.dexkit.schema.EncodeValueString.Companion.createEncodeValueString(c0733b, c0733b.m1927j(this.value));
        c0733b.m1931n(iCreateEncodeValueString);
        return iCreateEncodeValueString;
    }
}
