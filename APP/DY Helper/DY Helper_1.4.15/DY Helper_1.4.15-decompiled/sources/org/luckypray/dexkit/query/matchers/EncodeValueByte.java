package org.luckypray.dexkit.query.matchers;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class EncodeValueByte extends org.luckypray.dexkit.query.matchers.EncodeValue implements org.luckypray.dexkit.query.base.IAnnotationEncodeValue, org.luckypray.dexkit.query.base.INumberEncodeValue {
    private final byte value;

    public EncodeValueByte(byte r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    public final byte getValue() {
            r0 = this;
            byte r0 = r0.value
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(p000.b40 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.schema.-EncodeValueByte$Companion r0 = org.luckypray.dexkit.schema.EncodeValueByte.Companion
            byte r1 = r1.value
            int r1 = r0.createEncodeValueByte(r2, r1)
            r2.m733(r1)
            return r1
    }
}
