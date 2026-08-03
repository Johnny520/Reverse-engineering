package org.luckypray.dexkit.query.enums;

/* JADX INFO: loaded from: classes.dex */
public enum RetentionPolicyType {
    Source((byte) 1),
    Class((byte) 2),
    Runtime((byte) 3);

    private final byte value;

    RetentionPolicyType(byte b2) {
        this.value = b2;
    }

    public final byte getValue() {
        return this.value;
    }
}
