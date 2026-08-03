package org.luckypray.dexkit.query.enums;

/* JADX INFO: loaded from: classes.dex */
public enum OpCodeMatchType {
    Contains((byte) 0),
    StartsWith((byte) 1),
    EndsWith((byte) 2),
    Equals((byte) 3);

    private final byte value;

    OpCodeMatchType(byte b2) {
        this.value = b2;
    }

    public final byte getValue() {
        return this.value;
    }
}
