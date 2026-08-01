package org.luckypray.dexkit.query.enums;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public enum NumberEncodeValueType {
    ByteValue((byte) 1),
    ShortValue((byte) 2),
    IntValue((byte) 3),
    LongValue((byte) 4),
    FloatValue((byte) 5),
    DoubleValue((byte) 6);

    private final byte value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    NumberEncodeValueType(byte b) {
        this.value = b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: getValue-w2LRezQ, reason: not valid java name */
    public final byte m5664getValuew2LRezQ() {
        return this.value;
    }
}
