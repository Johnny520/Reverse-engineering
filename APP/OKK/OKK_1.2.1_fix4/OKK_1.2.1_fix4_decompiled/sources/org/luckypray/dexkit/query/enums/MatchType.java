package org.luckypray.dexkit.query.enums;

/* JADX INFO: loaded from: classes.dex */
public enum MatchType {
    Contains((byte) 0),
    Equals((byte) 1);

    private final byte value;

    MatchType(byte b2) {
        this.value = b2;
    }

    public final byte getValue() {
        return this.value;
    }
}
