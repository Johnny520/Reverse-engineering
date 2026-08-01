package org.luckypray.dexkit.query.matchers;

import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import p000.C0938xt;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class EncodeValueNull extends EncodeValue implements IAnnotationEncodeValue {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(C0938xt c0938xt) {
        c0938xt.getClass();
        int iCreateEncodeValueNull = org.luckypray.dexkit.schema.EncodeValueNull.Companion.createEncodeValueNull(c0938xt, (byte) 0);
        c0938xt.m5165n(iCreateEncodeValueNull);
        return iCreateEncodeValueNull;
    }
}
