package org.luckypray.dexkit.query.enums;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    TargetElementType(byte b) {
        this.value = b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final byte getValue() {
        return this.value;
    }
}
