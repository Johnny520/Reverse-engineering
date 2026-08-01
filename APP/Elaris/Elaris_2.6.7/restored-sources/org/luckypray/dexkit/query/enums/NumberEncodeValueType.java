package org.luckypray.dexkit.query.enums;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
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
    public final byte m1233getValuew2LRezQ() {
        return this.value;
    }
}
