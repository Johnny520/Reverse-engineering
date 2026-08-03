package org.luckypray.dexkit.query.enums;

/* JADX INFO: loaded from: classes.dex */
public enum StringMatchType {
    Contains((byte) 0),
    StartsWith((byte) 1),
    EndsWith((byte) 2),
    SimilarRegex((byte) 3),
    Equals((byte) 4);

    private final byte value;

    StringMatchType(byte b2) {
        this.value = b2;
    }

    public final byte getValue() {
        return this.value;
    }
}
