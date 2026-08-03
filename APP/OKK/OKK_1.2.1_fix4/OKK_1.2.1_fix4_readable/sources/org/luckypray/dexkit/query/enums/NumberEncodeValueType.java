package org.luckypray.dexkit.query.enums;

/* JADX INFO: loaded from: classes.dex */
public enum NumberEncodeValueType {
    ByteValue((byte) 1),
    ShortValue((byte) 2),
    IntValue((byte) 3),
    LongValue((byte) 4),
    FloatValue((byte) 5),
    DoubleValue((byte) 6);

    private final byte value;

    NumberEncodeValueType(byte b2) {
        this.value = b2;
    }

    /* JADX INFO: renamed from: getValue-w2LRezQ */
    public final byte m2672getValuew2LRezQ() {
        return this.value;
    }
}
