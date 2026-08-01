package org.luckypray.dexkit.query.matchers;

import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import p000.C0038c5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class EncodeValueBoolean extends EncodeValue implements IAnnotationEncodeValue {
    private final boolean value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EncodeValueBoolean(boolean z) {
        this.value = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(C0038c5 c0038c5) {
        c0038c5.getClass();
        int iCreateEncodeValueBoolean = org.luckypray.dexkit.schema.EncodeValueBoolean.Companion.createEncodeValueBoolean(c0038c5, this.value);
        c0038c5.m108n(iCreateEncodeValueBoolean);
        return iCreateEncodeValueBoolean;
    }
}
