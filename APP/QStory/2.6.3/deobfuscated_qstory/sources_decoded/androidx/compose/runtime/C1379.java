package androidx.compose.runtime;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1379 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f3984;

    public C1379(String str) {
        this.f3984 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1379) && this.f3984.equals(((C1379) obj).f3984);
    }

    public final int hashCode() {
        return this.f3984.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m148(new StringBuilder("OpaqueKey(key="), this.f3984, ')');
    }
}
