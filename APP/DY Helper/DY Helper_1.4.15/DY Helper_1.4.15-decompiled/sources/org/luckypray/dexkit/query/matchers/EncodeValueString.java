package org.luckypray.dexkit.query.matchers;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class EncodeValueString extends org.luckypray.dexkit.query.matchers.EncodeValue {
    private final java.lang.String value;

    public EncodeValueString(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.value = r1
            return
    }

    public final java.lang.String getValue() {
            r0 = this;
            java.lang.String r0 = r0.value
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(p000.b40 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.schema.-EncodeValueString$Companion r0 = org.luckypray.dexkit.schema.EncodeValueString.Companion
            java.lang.String r1 = r1.value
            int r1 = r2.m729(r1)
            int r1 = r0.createEncodeValueString(r2, r1)
            r2.m733(r1)
            return r1
    }
}
