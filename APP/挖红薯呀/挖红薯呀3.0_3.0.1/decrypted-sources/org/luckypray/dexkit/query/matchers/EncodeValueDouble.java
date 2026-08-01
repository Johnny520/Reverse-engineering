package org.luckypray.dexkit.query.matchers;

import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import org.luckypray.dexkit.query.base.INumberEncodeValue;
import p000.C0938xt;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class EncodeValueDouble extends EncodeValue implements IAnnotationEncodeValue, INumberEncodeValue {
    private final double value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EncodeValueDouble(double d) {
        this.value = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final double getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(C0938xt c0938xt) {
        c0938xt.getClass();
        int iCreateEncodeValueDouble = org.luckypray.dexkit.schema.EncodeValueDouble.Companion.createEncodeValueDouble(c0938xt, this.value);
        c0938xt.m5165n(iCreateEncodeValueDouble);
        return iCreateEncodeValueDouble;
    }
}
