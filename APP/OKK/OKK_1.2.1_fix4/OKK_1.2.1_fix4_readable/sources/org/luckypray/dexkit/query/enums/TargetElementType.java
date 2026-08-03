package org.luckypray.dexkit.query.enums;

/* JADX INFO: loaded from: classes.dex */
public enum TargetElementType {
    Type((byte) 0),
    Field((byte) 1),
    Method((byte) 2),
    Parameter((byte) 3),
    Constructor((byte) 4),
    LocalVariable((byte) 5),
    AnnotationType((byte) 6),
    Package((byte) 7),
    TypeParameter((byte) 8),
    TypeUse((byte) 9);

    private final byte value;

    TargetElementType(byte b2) {
        this.value = b2;
    }

    public final byte getValue() {
        return this.value;
    }
}
