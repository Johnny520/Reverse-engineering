package org.luckypray.dexkit.query.enums;

/* JADX INFO: loaded from: classes.dex */
public enum UsingType {
    Any((byte) 0),
    Read((byte) 1),
    Write((byte) 2);

    private final byte value;

    UsingType(byte b2) {
        this.value = b2;
    }

    public final byte getValue() {
        return this.value;
    }
}
