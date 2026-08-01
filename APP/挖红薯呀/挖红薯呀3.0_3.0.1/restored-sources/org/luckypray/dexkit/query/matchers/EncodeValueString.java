package org.luckypray.dexkit.query.matchers;

import p000.C0938xt;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
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
    public int innerBuild(C0938xt c0938xt) {
        c0938xt.getClass();
        int iCreateEncodeValueString = org.luckypray.dexkit.schema.EncodeValueString.Companion.createEncodeValueString(c0938xt, c0938xt.m5161j(this.value));
        c0938xt.m5165n(iCreateEncodeValueString);
        return iCreateEncodeValueString;
    }
}
