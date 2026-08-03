package org.luckypray.dexkit.query.enums;

/* JADX INFO: loaded from: classes.dex */
public enum NumberEncodeValueType extends Enum<NumberEncodeValueType> {
    private static final /* synthetic */ NumberEncodeValueType[] $VALUES = null;
    public static final NumberEncodeValueType ByteValue = null;
    public static final NumberEncodeValueType DoubleValue = null;
    public static final NumberEncodeValueType FloatValue = null;
    public static final NumberEncodeValueType IntValue = null;
    public static final NumberEncodeValueType LongValue = null;
    public static final NumberEncodeValueType ShortValue = null;
    private final byte value;

    private static final /* synthetic */ NumberEncodeValueType[] $values() {
        return new NumberEncodeValueType[]{ByteValue, ShortValue, IntValue, LongValue, FloatValue, DoubleValue};
    }

    static {
        ByteValue = new NumberEncodeValueType("ByteValue", 0, (byte) 1);
        ShortValue = new NumberEncodeValueType("ShortValue", 1, (byte) 2);
        IntValue = new NumberEncodeValueType("IntValue", 2, (byte) 3);
        LongValue = new NumberEncodeValueType("LongValue", 3, (byte) 4);
        FloatValue = new NumberEncodeValueType("FloatValue", 4, (byte) 5);
        DoubleValue = new NumberEncodeValueType("DoubleValue", 5, (byte) 6);
        $VALUES = $values();
    }

    NumberEncodeValueType(String r1, int r2, byte r3) {
        this.value = r3;
    }

    public static NumberEncodeValueType valueOf(String r1) {
        return (NumberEncodeValueType) Enum.valueOf(NumberEncodeValueType.class, r1);
    }

    public static NumberEncodeValueType[] values() {
        return (NumberEncodeValueType[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: getValue-w2LRezQ */
    public final byte m2672getValuew2LRezQ() {
        return this.value;
    }
}
