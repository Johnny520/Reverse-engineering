package org.luckypray.dexkit.query.enums;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0005\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lorg/luckypray/dexkit/query/enums/StringMatchType;", "", "value", "", "(Ljava/lang/String;IB)V", "getValue", "()B", "Contains", "StartsWith", "EndsWith", "SimilarRegex", "Equals", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public enum StringMatchType {
    Contains((byte) 0),
    StartsWith((byte) 1),
    EndsWith((byte) 2),
    SimilarRegex((byte) 3),
    Equals((byte) 4);

    private final byte value;

    StringMatchType(byte b) {
        this.value = b;
    }

    public final byte getValue() {
        return this.value;
    }
}
