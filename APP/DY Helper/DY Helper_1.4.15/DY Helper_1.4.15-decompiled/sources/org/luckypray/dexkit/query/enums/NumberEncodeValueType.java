package org.luckypray.dexkit.query.enums;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum NumberEncodeValueType extends java.lang.Enum<org.luckypray.dexkit.query.enums.NumberEncodeValueType> {
    private static final /* synthetic */ org.luckypray.dexkit.query.enums.NumberEncodeValueType[] $VALUES = null;
    public static final org.luckypray.dexkit.query.enums.NumberEncodeValueType ByteValue = null;
    public static final org.luckypray.dexkit.query.enums.NumberEncodeValueType DoubleValue = null;
    public static final org.luckypray.dexkit.query.enums.NumberEncodeValueType FloatValue = null;
    public static final org.luckypray.dexkit.query.enums.NumberEncodeValueType IntValue = null;
    public static final org.luckypray.dexkit.query.enums.NumberEncodeValueType LongValue = null;
    public static final org.luckypray.dexkit.query.enums.NumberEncodeValueType ShortValue = null;
    private final byte value;

    private static final /* synthetic */ org.luckypray.dexkit.query.enums.NumberEncodeValueType[] $values() {
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r0 = org.luckypray.dexkit.query.enums.NumberEncodeValueType.ByteValue
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r1 = org.luckypray.dexkit.query.enums.NumberEncodeValueType.ShortValue
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r2 = org.luckypray.dexkit.query.enums.NumberEncodeValueType.IntValue
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r3 = org.luckypray.dexkit.query.enums.NumberEncodeValueType.LongValue
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r4 = org.luckypray.dexkit.query.enums.NumberEncodeValueType.FloatValue
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r5 = org.luckypray.dexkit.query.enums.NumberEncodeValueType.DoubleValue
            org.luckypray.dexkit.query.enums.NumberEncodeValueType[] r0 = new org.luckypray.dexkit.query.enums.NumberEncodeValueType[]{r0, r1, r2, r3, r4, r5}
            return r0
    }

    static {
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r0 = new org.luckypray.dexkit.query.enums.NumberEncodeValueType
            java.lang.String r1 = "ByteValue"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            org.luckypray.dexkit.query.enums.NumberEncodeValueType.ByteValue = r0
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r0 = new org.luckypray.dexkit.query.enums.NumberEncodeValueType
            java.lang.String r1 = "ShortValue"
            r2 = 2
            r0.<init>(r1, r3, r2)
            org.luckypray.dexkit.query.enums.NumberEncodeValueType.ShortValue = r0
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r0 = new org.luckypray.dexkit.query.enums.NumberEncodeValueType
            java.lang.String r1 = "IntValue"
            r3 = 3
            r0.<init>(r1, r2, r3)
            org.luckypray.dexkit.query.enums.NumberEncodeValueType.IntValue = r0
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r0 = new org.luckypray.dexkit.query.enums.NumberEncodeValueType
            java.lang.String r1 = "LongValue"
            r2 = 4
            r0.<init>(r1, r3, r2)
            org.luckypray.dexkit.query.enums.NumberEncodeValueType.LongValue = r0
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r0 = new org.luckypray.dexkit.query.enums.NumberEncodeValueType
            java.lang.String r1 = "FloatValue"
            r3 = 5
            r0.<init>(r1, r2, r3)
            org.luckypray.dexkit.query.enums.NumberEncodeValueType.FloatValue = r0
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r0 = new org.luckypray.dexkit.query.enums.NumberEncodeValueType
            java.lang.String r1 = "DoubleValue"
            r2 = 6
            r0.<init>(r1, r3, r2)
            org.luckypray.dexkit.query.enums.NumberEncodeValueType.DoubleValue = r0
            org.luckypray.dexkit.query.enums.NumberEncodeValueType[] r0 = $values()
            org.luckypray.dexkit.query.enums.NumberEncodeValueType.$VALUES = r0
            return
    }

    NumberEncodeValueType(java.lang.String r1, int r2, byte r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static org.luckypray.dexkit.query.enums.NumberEncodeValueType valueOf(java.lang.String r1) {
            java.lang.Class<org.luckypray.dexkit.query.enums.NumberEncodeValueType> r0 = org.luckypray.dexkit.query.enums.NumberEncodeValueType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.luckypray.dexkit.query.enums.NumberEncodeValueType r1 = (org.luckypray.dexkit.query.enums.NumberEncodeValueType) r1
            return r1
    }

    public static org.luckypray.dexkit.query.enums.NumberEncodeValueType[] values() {
            org.luckypray.dexkit.query.enums.NumberEncodeValueType[] r0 = org.luckypray.dexkit.query.enums.NumberEncodeValueType.$VALUES
            java.lang.Object r0 = r0.clone()
            org.luckypray.dexkit.query.enums.NumberEncodeValueType[] r0 = (org.luckypray.dexkit.query.enums.NumberEncodeValueType[]) r0
            return r0
    }

    /* JADX INFO: renamed from: getValue-w2LRezQ, reason: not valid java name */
    public final byte m7398getValuew2LRezQ() {
            r0 = this;
            byte r0 = r0.value
            return r0
    }
}
