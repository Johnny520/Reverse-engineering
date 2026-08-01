package org.luckypray.dexkit.query.enums;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public enum OpCodeMatchType {
    Contains((byte) 0),
    StartsWith((byte) 1),
    EndsWith((byte) 2),
    Equals((byte) 3);

    private final byte value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    OpCodeMatchType(byte b) {
        this.value = b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final byte getValue() {
        return this.value;
    }
}
