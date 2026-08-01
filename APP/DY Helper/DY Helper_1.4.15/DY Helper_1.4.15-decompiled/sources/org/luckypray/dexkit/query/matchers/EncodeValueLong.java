package org.luckypray.dexkit.query.matchers;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class EncodeValueLong extends org.luckypray.dexkit.query.matchers.EncodeValue implements org.luckypray.dexkit.query.base.IAnnotationEncodeValue, org.luckypray.dexkit.query.base.INumberEncodeValue {
    private final long value;

    public EncodeValueLong(long r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    public final long getValue() {
            r2 = this;
            long r0 = r2.value
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(p000.b40 r4) {
            r3 = this;
            r4.getClass()
            org.luckypray.dexkit.schema.-EncodeValueLong$Companion r0 = org.luckypray.dexkit.schema.EncodeValueLong.Companion
            long r1 = r3.value
            int r3 = r0.createEncodeValueLong(r4, r1)
            r4.m733(r3)
            return r3
    }
}
