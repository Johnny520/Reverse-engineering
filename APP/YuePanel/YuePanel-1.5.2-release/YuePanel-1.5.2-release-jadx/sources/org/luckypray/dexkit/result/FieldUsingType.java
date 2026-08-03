package org.luckypray.dexkit.result;

import Yue.InterfaceC6211;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m2699d2 = {"Lorg/luckypray/dexkit/result/FieldUsingType;", "", "(Ljava/lang/String;I)V", "isRead", "", "isWrite", "Read", "Write", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
public enum FieldUsingType {
    Read,
    Write;

    public final boolean isRead() {
        return this == Read;
    }

    public final boolean isWrite() {
        return this == Write;
    }
}
