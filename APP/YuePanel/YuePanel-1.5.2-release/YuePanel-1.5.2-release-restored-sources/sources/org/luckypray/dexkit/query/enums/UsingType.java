package org.luckypray.dexkit.query.enums;

import Yue.InterfaceC6211;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m2699d2 = {"Lorg/luckypray/dexkit/query/enums/UsingType;", "", "value", "", "(Ljava/lang/String;IB)V", "getValue", "()B", "Any", "Read", "Write", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
public enum UsingType {
    Any((byte) 0),
    Read((byte) 1),
    Write((byte) 2);

    private final byte value;

    UsingType(byte b) {
        this.value = b;
    }

    public final byte getValue() {
        return this.value;
    }
}
