package org.luckypray.dexkit.query.matchers;

import p000.C0038c5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class EncodeValueString extends EncodeValue {
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EncodeValueString(String str) {
        str.getClass();
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(C0038c5 c0038c5) {
        c0038c5.getClass();
        int iCreateEncodeValueString = org.luckypray.dexkit.schema.EncodeValueString.Companion.createEncodeValueString(c0038c5, c0038c5.m104j(this.value));
        c0038c5.m108n(iCreateEncodeValueString);
        return iCreateEncodeValueString;
    }
}
