package org.luckypray.dexkit.query.enums;

import Yue.InterfaceC6211;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m2699d2 = {"Lorg/luckypray/dexkit/query/enums/TargetElementType;", "", "value", "", "(Ljava/lang/String;IB)V", "getValue", "()B", "Type", "Field", "Method", "Parameter", "Constructor", "LocalVariable", "AnnotationType", "Package", "TypeParameter", "TypeUse", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
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

    TargetElementType(byte b) {
        this.value = b;
    }

    public final byte getValue() {
        return this.value;
    }
}
