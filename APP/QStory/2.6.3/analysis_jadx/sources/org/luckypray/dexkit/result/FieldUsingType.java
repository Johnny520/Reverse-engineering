package org.luckypray.dexkit.result;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lorg/luckypray/dexkit/result/FieldUsingType;", "", "(Ljava/lang/String;I)V", "isRead", "", "isWrite", "Read", "Write", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
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
